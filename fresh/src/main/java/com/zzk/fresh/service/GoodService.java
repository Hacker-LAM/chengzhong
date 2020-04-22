package com.zzk.fresh.service;

import com.zzk.fresh.dao.CategoryDao;
import com.zzk.fresh.dao.GoodDao;
import com.zzk.fresh.entity.Category;
import com.zzk.fresh.entity.Good;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodService {
    @Autowired
    private GoodDao goodDao;
    @Autowired
    private CategoryDao categoryDao;

    //增加商品
    public Integer save(Good good) {
        return goodDao.save(good.getName(), good.getImage(),good.getPrice(), 1, true);
    }

    //查询商品
    public List<Good> goods(Good good) {
        return goodDao.goods(good.isEnabled());
    }
}
