package com.colisc2c.colisapp.coliswebapp.dao.user.impl;


import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import com.colisc2c.colisapp.coliswebapp.dao.user.JDBCUserDAO;
import com.colisc2c.colisapp.coliswebapp.model.User;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;
public class JDBCUserDAOImpl implements JDBCUserDAO {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
 
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
 
	public void insert(User User){
 
		String sql = "INSERT INTO USERS_TBL (pk_id, fname, lname, email, phone, ext, mobile, status, profile) "+ 
				"VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
 
		jdbcTemplate = new JdbcTemplate(dataSource);
 
		jdbcTemplate.update(sql, new Object[] { User.getUserid(),
				User.getFname(), User.getLname(), User.getEmail(), User.getPhone(), User.getExt(),
				User.getMobile(), User.getStatus(), User.getProfil()
		});
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public User findById(long id){
		 
		String sql = "SELECT * FROM USERS_TBL WHERE ID = ?";

		jdbcTemplate = new JdbcTemplate(dataSource);
		User user = (User) jdbcTemplate.queryForObject(
				sql, new Object[] { id }, new BeanPropertyRowMapper(User.class));
	 
		return user;
	}

	@SuppressWarnings("rawtypes")
	public List<User> findAll(){
		
		jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "SELECT * FROM USERS_TBL";
	 
		List<User> users = new ArrayList<User>();
	 
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		for (Map row : rows) {
			User user = new User();
			user.setUserid(Long.parseLong(String.valueOf(row.get("PK_ID"))));
			user.setFname((String)row.get("FNAME"));
			user.setLname((String)row.get("LNAME"));
			user.setEmail((String)row.get("EMAIL"));
			user.setPhone((String)row.get("PHONE"));
			user.setExt((String)row.get("EXT"));
			user.setMobile((String)row.get("MOBILE"));
			user.setStatus((String)row.get("STATUS"));
			user.setProfil((String)row.get("PROFILE"));
			users.add(user);
		}
	 
		return users;
	}
	
	public String findNameById(long id){

		jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "SELECT LNAME FROM USERS_TBL WHERE PK_ID = ?";
	 
		String name = (String)jdbcTemplate.queryForObject(
				sql, new Object[] { id }, String.class);
	 
		return name;
	}

	public void insertBatchSQL(final String sql){
		 
		jdbcTemplate.batchUpdate(new String[]{sql});
	 
	}
	
	public void insertBatch1(final List<User> users){

		jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "INSERT INTO USERS_TBL (pk_id, fname, lname, email, phone, ext, mobile, status, profile) "+ 
				"VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
		 
		  jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
		 
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				User user = users.get(i);
				ps.setLong(1, user.getUserid());
				ps.setString(2, user.getFname());
				ps.setString(3, user.getLname());
				ps.setString(4, user.getEmail());
				ps.setString(5, user.getPhone());
				ps.setString(6, user.getExt());
				ps.setString(7, user.getMobile());
				ps.setString(8, user.getStatus());
				ps.setString(9, user.getProfil());
		}
		 
			public int getBatchSize() {
				return users.size();
			}
		  });
		}
	
	public void insertBatch2(final String sql){
		jdbcTemplate = new JdbcTemplate(dataSource); 
		jdbcTemplate.batchUpdate(new String[]{sql});
	 
	}
		

}
