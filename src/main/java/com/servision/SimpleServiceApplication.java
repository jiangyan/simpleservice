package com.servision;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.servision.model")
@EnableJpaRepositories("com.servision.repository")
public class SimpleServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(SimpleServiceApplication.class, args);
    }
}

