package com.yoho.spring.rabbit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.Map;

public class ProduceMessage {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("classpath:WEB-INF/spring-rabbit.xml");
        RabbitProducer producer = (RabbitProducer) ctx.getBean("producer");
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("data", "hello rabbitmq");
        producer.sendQueue("test","test",map);

    }
}
