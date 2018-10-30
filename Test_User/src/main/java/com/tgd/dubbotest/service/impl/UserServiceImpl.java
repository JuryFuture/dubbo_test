package com.tgd.dubbotest.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.tgd.dubbotest.entity.user.User;
import com.tgd.dubbotest.service.UserService;
import org.springframework.stereotype.Component;

@Service(version = "1.0.0")
@Component
public class UserServiceImpl implements UserService {
    @Override
    public User login(String userName, String password) {
        User user = new User();
        user.setUserName(userName);
        user.setPassword(password);

        return user;
    }
}
