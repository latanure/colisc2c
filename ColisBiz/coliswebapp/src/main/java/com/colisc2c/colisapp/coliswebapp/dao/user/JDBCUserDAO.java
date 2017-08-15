package com.colisc2c.colisapp.coliswebapp.dao.user;

import java.util.List;
import com.colisc2c.colisapp.coliswebapp.model.User;

public interface JDBCUserDAO {
	public void insert(User user);
	public User findById(long id);
	public List<User> findAll();
	public String findNameById(long id);
	public void insertBatch1(final List<User> user);
	public void insertBatch2(final String sql);
}
