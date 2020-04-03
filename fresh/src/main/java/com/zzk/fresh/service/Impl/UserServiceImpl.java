package com.zzk.fresh.service.Impl;

import com.zzk.fresh.entity.User;
import com.zzk.fresh.dao.UserDao;
import com.zzk.fresh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User selectUser(int id) {
        return userDao.getUserById(id);
    }


    //登录
    @Override
    public User login(String name, String password) {
        User user = userDao.getUserByNameAndPassword(name, password);
        if (user != null) {
            return user;
        } else {
            return null;
        }
    }

    //注册
    public User create(User o) {
        User user = userDao.getUserByName(o.getName());
        if (user!=null) {
            return user;
        } else {
            userDao.insertUser(o.getName(), o.getPassword(), o.getPhone());
            user = userDao.getUserByNameAndPassword(o.getName(), o.getPassword());
            if (user != null) {
                return user;
            } else {
                return null;
            }
        }
    }
}
