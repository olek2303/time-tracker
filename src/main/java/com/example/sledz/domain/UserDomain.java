package com.example.sledz.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class UserDomain {
    @Id
    @GeneratedValue
    private int id;
    private String nick;
    private String mail;
    private String password;

    // The @Id annotation indicates that this field
    // is the primary key column
    public int getId() {
        return id;
    }

    public String getNick() {
        return nick;
    }

    public String getMail() {
        return mail;
    }

    public String getPassword() {
        return password;
    }
}

