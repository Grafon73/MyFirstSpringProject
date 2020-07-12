package com.test.application.repos;

import com.test.application.model.User;


public interface UserRepository{
    User findUserByUsername(String username);
}