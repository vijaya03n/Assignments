package com.example.springsecurity.services;

import java.util.ArrayList;
import java.util.List;

import com.example.springsecurity.models.User;

import org.springframework.stereotype.Service;

@Service
public class serviceImpl implements service {

    List<User> list = new ArrayList<>();

    public serviceImpl() {
        list.add(new User("vijaya", "vijaya@123", "vijaya@gmail.com"));
    }

    // Get All Users
    public List<User> getAllUsers() {
        return this.list;
    }

    // Get Users By Username
    public User getUser(String username) {
        return this.list.stream().filter((user) -> user.getUsername().equals(username)).findAny().orElse(null);
    }

    // To set users
    public User addUser(User user) {
        this.list.add(user);
        return user;
    }
}
