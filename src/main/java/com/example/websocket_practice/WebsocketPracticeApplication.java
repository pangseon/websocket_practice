package com.example.websocket_practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class WebsocketPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebsocketPracticeApplication.class, args);
    }

}
