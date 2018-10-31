package com.tgd.dubbotest.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.tgd.dubbotest.entity.user.User;
import com.tgd.dubbotest.service.UserService;

@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {
    @Override
    public User login(String userName, String password) {
        User user = new User();
        user.setUserName(userName);
        user.setPassword(password);

        return user;
    }
}
