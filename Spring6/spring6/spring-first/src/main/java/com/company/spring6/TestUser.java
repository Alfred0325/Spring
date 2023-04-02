package com.company.spring6;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {

    private Logger logger = LoggerFactory.getLogger(TestUser.class);

    @Test
    public void testUserObject(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        User user = (User) context.getBean("user");
        System.out.println(user);
        user.add();

        //log manually
        logger.info("successfully execute....");
    }
}
