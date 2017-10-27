package com.yoho.spring.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("classpath:WEB-INF/spring-event.xml");
        TestPublisher publisher = (TestPublisher) ctx.getBean("publisher");
        publisher.publish();

        TestPublisher1 publisher1 = (TestPublisher1) ctx.getBean("publisher1");
        publisher1.publish();
    }
}
