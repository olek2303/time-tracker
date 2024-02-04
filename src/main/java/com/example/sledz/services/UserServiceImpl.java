package com.example.sledz.services;

import com.example.sledz.domain.UserDomain;
import com.example.sledz.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    private UserRepo userRepo;
    @Autowired
    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }
    @Override
    public List<UserDomain> allUsers() {
        return userRepo.findAll();
    }

    @Override
    public UserDomain getById(int id) {
        return userRepo.findById(id).orElse(null);
    }
}
