package com.zzk.fresh.dao;

import com.zzk.fresh.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDao {
    @Select("select * from user where id=#{id}")
    User getUserById(int id);

    @Select("select * from user where name=#{name}")
    User getUserByName(String name);

    //登录
    @Select("select * from user where name=#{name} and password=#{password}")
    User getUserByNameAndPassword(String name, String password);

    //注册
    @Insert("insert into user(name,password,phone) values (#{name},#{password},#{phone})")
    void insertUser(String name, String password, int phone);
}
