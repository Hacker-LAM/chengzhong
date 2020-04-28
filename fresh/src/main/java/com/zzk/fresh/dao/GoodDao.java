package com.zzk.fresh.dao;

import com.zzk.fresh.entity.Good;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface GoodDao {
    @Insert("insert into good(name, image, price, category, enabled) " +
            "value(#{name}, #{image}, #{price}, #{category}, #{enabled})")
    Integer save(String name, String image, double price, int category, boolean enabled);

    @Select("select * from good a where a.enabled=#{enabled}")
    List<Good> goods(boolean enalbed);

    @Select("select * from good a where a.category=#{category_id} and a.enabled=#{enabled}")
    List<Good> goodsByCategory(int category_id, boolean enabled);
}
