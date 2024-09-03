package br.thullyo.springsecurity6jwt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Table(name = "TB_USERS")
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    private String username;

    private String password;


    public String getName() {
        return username;
    }

    public void setName(String name) {
        this.username = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
