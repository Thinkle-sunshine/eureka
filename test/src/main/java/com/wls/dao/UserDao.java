package com.wls.dao;

import com.wls.entity.User;

public interface UserDao {
    User findById(String id);
}
