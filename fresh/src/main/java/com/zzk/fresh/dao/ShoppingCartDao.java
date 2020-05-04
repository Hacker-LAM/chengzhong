package com.zzk.fresh.dao;

import com.zzk.fresh.entity.ShoppingCart;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ShoppingCartDao {

    @Select("SELECT * FROM shopping_cart a WHERE a.enabled=#{enabled}")
    List<ShoppingCart> findByEnabled(boolean enabled);

    @Insert("INSERT INTO shopping_cart(name, enabled) VALUES (#{name}, #{enabled})")
    Integer save(String name, boolean enabled);
}
