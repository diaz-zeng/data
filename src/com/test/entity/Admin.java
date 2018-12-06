package com.test.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "G5_ADMIN")
public class Admin {
    @Id
    @GeneratedValue(generator = "ADMIN_USERNAME")
    @GenericGenerator(name = "ADMIN_USERNAME",strategy = "assigned")
    private String userName;
    @Column(nullable = false)
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
