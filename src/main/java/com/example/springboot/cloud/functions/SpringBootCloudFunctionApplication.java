package com.example.springboot.cloud.functions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;
import java.util.function.Supplier;

@SpringBootApplication
public class SpringBootCloudFunctionApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCloudFunctionApplication.class, args);
    }

    //curl --location 'http://localhost:8080/addUser' --header 'Content-Type: application/json' --data '{"firstName": "first","lastName": "last","email": "email"}'
    @Bean
    public Function<User, User> addUser() {
        return (user) -> new User();
    }

    //curl --location 'http://localhost:8080/getAllUsers'
    @Bean
    public Supplier<User> getAllUsers() {
        return () -> new User();
    }

}
