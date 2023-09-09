package dev.spring.boot.cloud.function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

@Configuration
public class UserHandler {
    private final UserService userService;

    public UserHandler(UserService userService) {
        this.userService = userService;
    }

    //    curl http://localhost:8080/findAll
    @Bean
    public Supplier<List<User>> findAll() {
//        return () -> userService.findAll();
        return userService::findAll;
    }

    //    curl 'http://localhost:8080/create' --header 'Content-Type: application/json' --data '{"firstName": "first","lastName": "last","email": "email@email.com"}'
    @Bean
    public Consumer<User> create() {
//        return (user) -> userService.create(user);
        return userService::create;

    }
}
