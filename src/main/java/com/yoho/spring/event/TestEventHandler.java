package com.yoho.spring.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class TestEventHandler implements ApplicationListener<TestEvent> {

    @Override
    public void onApplicationEvent(TestEvent testEvent) {
        System.out.println("receive event , the data is "+testEvent.getSource());
        System.out.println("receiver thread id is "+ Thread.currentThread().getName());
    }
}
