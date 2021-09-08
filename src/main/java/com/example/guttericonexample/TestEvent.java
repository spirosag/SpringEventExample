package com.example.guttericonexample;

import lombok.Value;
import org.springframework.context.ApplicationEvent;

@Value
public class TestEvent extends ApplicationEvent {
    String name;

    public TestEvent(Object source, String name) {
        super(source);
        this.name = name;
    }
}
