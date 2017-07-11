package com.colisc2c.colisapp.coliswebapp.dao.user;

import java.util.List;
import com.colisc2c.colisapp.coliswebapp.model.User;

public Interface JDBCUserDAO {
	public void insert(User user);
	public User findById(int id);
	public List<User> findAll();
	public String findNameById(int id);
	public void insertBatch1(final List<User> user);
	public void insertBatch2(final String sql);
}
