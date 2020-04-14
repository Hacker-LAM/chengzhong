package com.zzk.fresh.service;

import com.zzk.fresh.entity.User;
import com.zzk.fresh.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    //登录
    public User login(String name, String password) {
        User user = userDao.getUserByNameAndPassword(name, password);
        if (user != null) {
            return user;
        } else {
            return null;
        }
    }

    //注册
    public Boolean create(User o) {
        User user = userDao.getUserByName(o.getName());
        if (user!=null) {
            return false;
        } else {
            userDao.insertUser(o.getName(), o.getPassword(), o.getPhone());
            user = userDao.getUserByNameAndPassword(o.getName(), o.getPassword());
            if (user != null) {
                return true;
            } else {
                return false;
            }
        }
    }
}
