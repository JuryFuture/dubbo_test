package com.tgd.dubbotest.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.tgd.dubbotest.entity.user.User;
import com.tgd.dubbotest.param.LoginParam;
import com.tgd.dubbotest.response.Result;
import com.tgd.dubbotest.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Reference(version = "1.0.0")
    private UserService userService;

    @PostMapping("/login/")
    public Result login(LoginParam param) {
        User user = userService.login(param.getUserName(), param.getPassword());

        Result result = new Result();
        result.setDeta(user);

        return result;
    }
}
