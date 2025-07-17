package com.pluralsight.conference.controller;

import com.pluralsight.conference.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/v1/data")
public class UserController {

    private List<User> users = Arrays.asList(
            new User(1234, "Daniel"),
            new User(2345, "John"),
            new User(3456, "Michelle")
    );

    @GetMapping("users")
    public List<User> getUsers() {
        return users;
    }

    @GetMapping("users/{id}")
    public User getUsers(@PathVariable long id) {
        return users.stream()
                .filter(user -> user.getId() ==id)
                .findFirst()
                .orElse(null);
    }
}
