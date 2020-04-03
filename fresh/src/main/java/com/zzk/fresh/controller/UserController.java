package com.zzk.fresh.controller;

import com.zzk.fresh.entity.User;
import com.zzk.fresh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    //登录
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    private User getUser(User o) {
        System.out.println(o.getName());
        User user = userService.login(o.getName(), o.getPassword());
        System.out.println(user.getId());
        return user;
    }

    //注册
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    private User create(User o) {
        System.out.println(o.getName());
        User user = userService.create(o);
        return user;
    }
}
