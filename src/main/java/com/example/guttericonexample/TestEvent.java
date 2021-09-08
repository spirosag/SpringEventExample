package com.example.guttericonexample;

import org.springframework.context.ApplicationEvent;

public class TestEvent extends ApplicationEvent {
    String name;

    public TestEvent(Object source, String name) {
        super(source);
        this.name = name;
    }
}
