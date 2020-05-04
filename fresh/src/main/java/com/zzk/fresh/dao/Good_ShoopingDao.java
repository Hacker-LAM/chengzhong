package com.zzk.fresh.dao;

import com.zzk.fresh.entity.Good_Shopping;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface Good_ShoopingDao {
    @Select("SELECT * FROM good_shopping a WHERE a.shopping_id = #{shopping_id}")
    List<Good_Shopping> findByShoppingId(int shopping_id);
}
