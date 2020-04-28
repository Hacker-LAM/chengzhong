package com.zzk.fresh.controller;

import com.zzk.fresh.entity.Good;
import com.zzk.fresh.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GoodController {
    @Autowired
    private GoodService goodService;

    //增加商品
    @RequestMapping(value = "good/save", method = RequestMethod.POST)
    public Integer add(Good good) {
        return goodService.save(good);
    }

    //查询商品
    @RequestMapping(value = "good", method = {RequestMethod.POST, RequestMethod.GET})
    public List<Good> goods(Good good) {
        return goodService.goods(good);
    }

    //根据category查询商品
    @RequestMapping(value = "good/{id:[0-9]+}", method = RequestMethod.POST)
    public List<Good> goods(@PathVariable int id) {
        return goodService.goods(id);
    }

}
