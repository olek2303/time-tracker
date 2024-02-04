package com.example.sledz.controllers;

import com.example.sledz.domain.UserDomain;
import com.example.sledz.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/users/{id}")
    public UserDomain getUserById(@PathVariable int id) {
        return userService.getById(id);
    }

    @RequestMapping("/ocs")
    public String p() {
        return "Cos";
    }
}
