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
//org.springframework.cloud.function.adapter.aws.FunctionInvoker::handleRequest
//
//aws_iam_role
//aws_iam_policy
//aws_iam_role_policy_attachment
//data"archive file"
//aws_lambda_function