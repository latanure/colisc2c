package com.colisc2c.colisapp.coliswebapp.app;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.colisc2c.colisapp.coliswebapp.dao.user.UserDAO;
import com.colisc2c.colisapp.coliswebapp.model.User;;
public class APP {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDAO userDAO = (UserDAO) context.getBean("userDAO");
		User user1 = new User(100, "Fresnel","Tano", "fresneltano@gmail", "12345687", "237", "258794521", "A","ADMIN_ROLE");
		userDAO.insertUser(user1);
        User user2 = userDAO.findById(100);
        System.out.println(user2);	
		context.close();

	}

}
