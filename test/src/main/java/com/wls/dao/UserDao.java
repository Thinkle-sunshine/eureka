package com.wls.dao;

import com.wls.entity.User;

import java.util.List;

public interface UserDao {
    User findById(String id);
    List<User> findAll();
}
