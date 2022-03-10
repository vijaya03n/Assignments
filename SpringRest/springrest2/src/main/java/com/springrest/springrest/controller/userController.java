package com.springrest.springrest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.User;

@RestController 
public class userController {

	User user = new User("vijaya", "vijaya@123");

    @PostMapping("/login")
    @ResponseBody
    public String login(@RequestBody User user) {

        System.out.println(user);
        if (this.user.getUsername().equals(user.getUsername()) && this.user.getPassword().equals(user.getPassword())) {
            return "Valid User";
        }
        return "Invalid Users";
    }
}
