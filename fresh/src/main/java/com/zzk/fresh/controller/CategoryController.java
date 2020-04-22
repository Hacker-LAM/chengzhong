package com.zzk.fresh.controller;

import com.zzk.fresh.entity.Category;
import com.zzk.fresh.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    //增加类别
    @RequestMapping(value = "category/save", method = RequestMethod.POST)
    public Integer add(Category category) {
        return categoryService.save(category);
    }

    //查询类别
    @RequestMapping(value = "category", method = {RequestMethod.POST, RequestMethod.GET})
    public List<Category> categories(Category category) {
        return categoryService.categories(category);
    }

    //删除类别
    @RequestMapping(value = "category/{id:[0-9]+}", method = RequestMethod.DELETE)
    public Boolean del(@PathVariable int id) {
        return categoryService.del(id);
    }
}
