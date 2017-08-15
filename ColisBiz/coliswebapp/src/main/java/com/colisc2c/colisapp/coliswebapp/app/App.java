package com.colisc2c.colisapp.coliswebapp.app;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.colisc2c.colisapp.coliswebapp.dao.user.JDBCUserDAO;
import com.colisc2c.colisapp.coliswebapp.dao.user.UserDAO;

import com.colisc2c.colisapp.coliswebapp.model.User;;
public class App {

	/*public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDAO userDAO = (UserDAO) context.getBean("userDAO");
		JDBCUserDAO jdbcUserDAO = (JDBCUserDAO) context.getBean("JDBCuserDAO");
		User user1 = new User(100, "Franky","Tambo", "fresneltano@gmail", "12345687", "237", "258794521", "A","ADMIN_ROLE");
		userDAO.insertUser(user1);
        User user2 = userDAO.findById(100);
        System.out.println(user2);	
        System.out.println("********************Batch Update implementation************************");
        
        User emplNew1 = new User(101, "Nasco","Bomba", "fresneltano@gmail", "12345687", "237", "258794521", "A","ADMIN_ROLE");
        User emplNew2 = new User(102, "Raissa","Tchoumi", "fresneltano@gmail", "12345687", "237", "258794521", "A","ADMIN_ROLE");
        List<User> usersList = new ArrayList<User>();
        usersList.add(emplNew1);
        usersList.add(emplNew2);
        jdbcUserDAO.insertBatch1(usersList);
        System.out.println(" inserted rows: " + usersList);

        System.out.println(" FindAll : " + jdbcUserDAO.findAll());
        jdbcUserDAO.insertBatch2("UPDATE USERS_TBL SET FNAME ='Mary'");
        
        List<User> usersList2 = jdbcUserDAO.findAll();
        System.out.println("Updated column name of table: " + usersList2);	
        
        System.out.println(" FindAll : " + jdbcUserDAO.findAll());
        System.out.println("********************Using JDBC Template to select total rows and to select a single column************************");
        List<User> users1 = jdbcUserDAO.findAll();
        System.out.println(users1);	
        System.out.println("********************Using JDBC Template to print user's firstname with Id = 103 ************************");
        String name = jdbcUserDAO.findNameById(102);
        System.out.println(name);
        
        System.out.println("********************Using JDBC Template ************************");
        
		context.close();

	}
*/
}
