package com.tgd.dubbotest.service;

import com.tgd.dubbotest.entity.user.User;

public interface UserService {
    User login(String userName, String password);
}
