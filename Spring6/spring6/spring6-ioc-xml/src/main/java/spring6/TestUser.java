package spring6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {

    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        //get Bean by id
        User user1 = (User)context.getBean("user");

        //get Bean by type
        User user2 = context.getBean(User.class);

        //get Bean by id and class
        User user3 = context.getBean("user", User.class);
    }
}
