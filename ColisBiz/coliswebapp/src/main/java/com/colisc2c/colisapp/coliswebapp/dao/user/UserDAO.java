package com.colisc2c.colisapp.coliswebapp.dao.user;
import com.colisc2c.colisapp.coliswebapp.model.User;
public interface UserDAO {
	
		public void insertUser(User user );
		public User findById(long userid);
}
