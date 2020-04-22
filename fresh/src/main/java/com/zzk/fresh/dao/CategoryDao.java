package com.zzk.fresh.dao;

import com.zzk.fresh.entity.Category;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CategoryDao {
    @Insert("insert into category(name,enabled) values (#{name},#{enabled})")
    Integer save(String name, boolean enabled);

    @Select("select * from category a where a.enabled=#{enabled}")
    List<Category> categories(boolean enabled);

    @Update("update category a set enabled=false where a.id=#{enabled}")
    Boolean del(int id);
}
