package com.example.demobeans.repository;


import entity.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class UsersRepository {
    private List<User> users;

    public UsersRepository() {
        users = new ArrayList<>();
        Collections.addAll(users, new User(1, "Vanya"), new User(2, "Masha"));
    }

    public List<User> getAllUsers() {
        return users;
    }
}
