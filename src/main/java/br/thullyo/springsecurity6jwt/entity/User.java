package br.thullyo.springsecurity6jwt.entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "TB_USERS")
public class User {

    @Id
    private String name;

    private String password;

    public User(String name, String password) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
