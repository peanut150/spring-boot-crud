package com.tutorial.crud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user_details")
@Data
@NoArgsConstructor
public class User {

    @Id
    private int id;

    private String username;

    private String email;

    private String password;
}
