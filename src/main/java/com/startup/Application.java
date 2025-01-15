package com.startup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc  // Ensures Spring MVC is enabled
@ComponentScan(basePackages = "com.startup.controllers") // Forces Spring Boot to scan controllers
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("🚀 Spring Boot Application Started!");
    }
}
