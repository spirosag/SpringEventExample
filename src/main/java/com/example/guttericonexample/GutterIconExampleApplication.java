package com.example.guttericonexample;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.event.ApplicationEventMulticaster;
import org.springframework.context.event.SimpleApplicationEventMulticaster;

@SpringBootApplication
@RequiredArgsConstructor
public class GutterIconExampleApplication implements CommandLineRunner {
    private final ApplicationEventPublisher applicationEventPublisher;
    private final ApplicationEventMulticaster applicationEventMulticaster;
    public static void main(String[] args) {
        SpringApplication.run(GutterIconExampleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        applicationEventPublisher.publishEvent(new TestEvent(this, "Event from ApplicationEventPublisher"));
        applicationEventMulticaster.multicastEvent(new TestEvent(this, "Event from ApplicationEventMulticaster"));
    }
}
