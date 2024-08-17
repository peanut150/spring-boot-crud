package com.tutorial.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutorial.crud.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
