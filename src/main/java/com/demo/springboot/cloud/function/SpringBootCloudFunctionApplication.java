package com.demo.springboot.cloud.function;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootCloudFunctionApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCloudFunctionApplication.class, args);
    }

    @GetMapping
    public String serverUp() {
        return "server up 0.1";
    }
}
