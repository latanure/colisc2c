package com.colisc2c.colisapp.coliswebapp.dao.user.impl;

import com.colisc2c.colisapp.coliswebapp.dao.user.UserDAO;
import com.colisc2c.colisapp.coliswebapp.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.*;
public class UserDAOImpl implements UserDAO {

	private DataSource dataSource;

	
	public void insertUser(User user) {
		String sql = "INSERT INTO USERS_TBL (pk_id, fname, lname, email, phone, ext, mobile, status, profile) "+ 
						"VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		Connection conn= null;
		try{
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setLong(1, user.getUserid());
			ps.setString(2, user.getFname());
			ps.setString(3, user.getLname());
			ps.setString(4, user.getEmail());
			ps.setString(5, user.getPhone());
			ps.setString(6, user.getExt());
			ps.setString(7, user.getMobile());
			ps.setString(8, user.getStatus());
			ps.setString(9, user.getProfil());
			ps.executeUpdate();
			ps.close();
		}catch(SQLException e){
			throw new RuntimeException(e);
		}finally{
			if(conn!=null){
				try{
					conn.close();
				}catch(SQLException e){
					throw new RuntimeException(e);
				}
			}
		}
}

	@Override
	public User findById(long userid) {
		
        String sql = "SELECT * FROM USERS_TBL WHERE PK_ID = ?";
        
        Connection conn = null;
  
        try {
            conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setLong(1, userid);
            User user = null;
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                user = new User(
                    rs.getLong("PK_ID"),
                    rs.getString("FNAME"),
                    rs.getString("LNAME"),
                    rs.getString("EMAIL"),
                    rs.getString("PHONE"),
                    rs.getString("EXT"),
                    rs.getString("MOBILE"),
                    rs.getString("STATUS"),
                    rs.getString("PROFILE")
                    
                );
            }
            rs.close();
            ps.close();
            return user;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (conn != null) {
                try {
                conn.close();
                } catch (SQLException e) {}
            }
        }
    }

/*	public DataSource getDataSource() {
		return dataSource;
	}*/

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

}
