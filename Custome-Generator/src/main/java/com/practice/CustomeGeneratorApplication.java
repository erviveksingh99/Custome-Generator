package com.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CustomeGeneratorApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomeGeneratorApplication.class, args);
        System.err.println("Server Started...");
    }
}
