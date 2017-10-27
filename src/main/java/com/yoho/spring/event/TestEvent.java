package com.yoho.spring.event;

import org.springframework.context.ApplicationEvent;

public class TestEvent extends ApplicationEvent{
    public TestEvent(Object source) {
        super(source);
        System.out.println("trigger TestEvent !!!");
    }


}