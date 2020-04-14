package com.zzk.fresh.service;

import com.zzk.fresh.dao.CategoryDao;
import com.zzk.fresh.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryDao categoryDao;

    //增加类别
    public Category save(Category category) {
        return categoryDao.save(category.getName(), true);
    }

    //查询类别
    public List<Category> categories(Category category) {
        return categoryDao.categories(category.isEnabled());
    }

    //删除类别
    public Boolean del(int id) {
        return categoryDao.del(id);
    }
}
