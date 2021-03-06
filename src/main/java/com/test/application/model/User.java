package com.test.application.model;

import javax.persistence.*;



@Entity
@Table(name = "user")
public class User {

    public User() {
    }

    @Id
    @Column(name = "name")
    private String username;

    @Column(name = "password")
    private String password;



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
