package com.example.springboot.cloud.functions;

import java.util.function.Function;

//curl --location 'http://localhost:8080/userService' --header 'Content-Type: application/json' --data '{"firstName": "first","lastName": "last","email": "email"}'
//curl --location 'http://localhost:8080/userService/apply' --header 'Content-Type: application/json' --data '{"firstName": "first","lastName": "last","email": "email"}'
public class UserService implements Function<User, User> {
    @Override
    public User apply(User user) {
        user.setId("00000000");
        return user;
    }
}
