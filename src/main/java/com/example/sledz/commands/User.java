package com.example.sledz.commands;
public class User {
    private int id;
    private String nick;
    private String mail;
    private String password;

    // Constructor
    public User(int id, String nick, String mail, String password) {
        this.id = id;
        this.nick = nick;
        this.mail = mail;
        this.password = password;
    }

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

    @Override
    public String toString() {
        return "User [id=" + id + ", nick=" + nick + ", mail=" + mail + ", password=" + password + "]";
    }
}
