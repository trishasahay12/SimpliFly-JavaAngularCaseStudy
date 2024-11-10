package services;

//package com.laxman.simpli_fly.services;

import entities.Users;
import java.util.List;

public interface UsersService {
    Users registerUser(Users users);
    Users loginUser(String username, String password);
    List<Users> getAllUsers();
    Users getUserById(int userId);
    Users updateUser(Users users);
    boolean deleteUser(int userId);
}

