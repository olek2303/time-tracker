package com.example.sledz.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class UserDomain {

    private int id;
    private String nick;
    private String mail;
    private String password;

    public UserDomain(){}

    public UserDomain(String nick, String mail, String password){
        this.nick = nick;
        this.mail = mail;
        this.password = password;
    }

    // The @Id annotation indicates that this field
    // is the primary key column
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }
    public void setId(int id){this.id = id;}

    @Column(name = "nick")
    public String getNick() {
        return nick;
    }
    public void setNick(String nick){this.nick = nick;}
    @Column(name = "mail")
    public String getMail() {
        return mail;
    }
    public void setMail(String nick){this.mail = mail;}

    @Column(name = "password")
    public String getPassword() {
        return password;
    }
    public void setPassword(String password){this.password = password;}
}

