package dev.spring.boot.cloud.function;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    public UserService() {
        users.add(new User());
    }

    List<User> users = new ArrayList<>();

    public List<User> findAll() {
        return users;
    }

    public void create(User user) {
        users.add(new User(UUID.randomUUID().toString(), user.getFirstName(), user.getLastName(), user.getEmail()));
    }
}
