package dev.spring.boot.cloud.function;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootCloudFunctionApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCloudFunctionApplication.class, args);
    }
}
//SpringBootCloudFunction
//org.springframework.cloud.function.adapter.aws.FunctionInvoker::handleRequest
