package com.zzk.fresh.service;

import com.zzk.fresh.entity.User;

public interface UserService {
    User selectUser(int id);
    //登录
    User login(String name, String password);

    //注册
    User create(User o);
}
