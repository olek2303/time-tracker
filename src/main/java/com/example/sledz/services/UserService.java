package com.example.sledz.services;

import com.example.sledz.domain.UserDomain;

import java.util.List;

public interface UserService {
    List<UserDomain> allUsers();
    UserDomain getById(int id);
}
