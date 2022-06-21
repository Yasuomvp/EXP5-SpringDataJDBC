package com.rick.exp5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

@SpringBootApplication
@EnableJdbcRepositories(value = "com.rick.exp5.repository")
public class Exp5SpringDataJdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(Exp5SpringDataJdbcApplication.class, args);
    }

}
