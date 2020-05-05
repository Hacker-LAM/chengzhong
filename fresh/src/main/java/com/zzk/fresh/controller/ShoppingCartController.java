package com.zzk.fresh.controller;

import com.zzk.fresh.entity.ShoppingCart;
import com.zzk.fresh.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShoppingCartController {
    @Autowired
    private ShoppingCartService shoppingCartService;

    //获取有效购物车
    @RequestMapping(value = "shoppingcart", method = RequestMethod.POST)
    public List<ShoppingCart> shoppingCarts() {
        return shoppingCartService.shoppingCarts();
    }

    //增加购物车
    @RequestMapping(value = "shoppingcart/save", method = RequestMethod.POST)
    public Integer save(ShoppingCart shoppingCart) {
        return shoppingCartService.save(shoppingCart);
    }

    //根据购物车名获取购物车
    @RequestMapping(value = "shoppingcart/name", method = RequestMethod.POST)
    public ShoppingCart getShoppingCart(ShoppingCart shoppingCart) {
        return shoppingCartService.getShoppingCart(shoppingCart);
    }
}
