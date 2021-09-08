package com.example.guttericonexample;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ListenerService {

    @EventListener
    public void onEvent(TestEvent event){
      log.info("Received event:{}", event);
    }
}
