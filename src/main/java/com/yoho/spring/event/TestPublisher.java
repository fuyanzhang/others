package com.yoho.spring.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class TestPublisher implements  ApplicationEventPublisherAware {

    private ApplicationEventPublisher publisher ;
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }

    public void publish(){
        TestEvent event = new TestEvent("hello world");
        publisher.publishEvent(event);
        System.out.println("publisher thread id is "+Thread.currentThread().getName());
    }
}
