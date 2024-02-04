package com.example.sledz.controllers;

import com.example.sledz.domain.UserDomain;
import com.example.sledz.repositories.UserRepo;
import com.example.sledz.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
//    private UserService userService;
    @Autowired
    private UserRepo userRepo;

//    @Autowired
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }

    // ogólnie to pozbyłem się na razie UserService stąd bo wtedy nie działa
    // robie bezpośrednio z repo, co więcej w tym repo są domyślne wyszukiwania i nie trzeba Query pisac
    @GetMapping("/users/{id}")
    public UserDomain getUserById(@PathVariable int id) {
            return userRepo.findById(id).orElse(null);
    }

    @GetMapping("/ocs")
    public String p() {
        return "Cos";
    }

    @GetMapping("/users/all")
    public List<UserDomain> getAllUser() {
        return userRepo.findAll();
    }
}

  
