package com.zzk.fresh.service;

import com.zzk.fresh.dao.GoodDao;
import com.zzk.fresh.dao.Good_ShoopingDao;
import com.zzk.fresh.dao.ShoppingCartDao;
import com.zzk.fresh.entity.Good;
import com.zzk.fresh.entity.Good_Shopping;
import com.zzk.fresh.entity.ShoppingCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShoppingCartService {
    @Autowired
    private ShoppingCartDao shoppingCartDao;
    @Autowired
    private Good_ShoopingDao good_shoopingDao;
    @Autowired
    private GoodDao goodDao;

    //获取有效购物车
    public List<ShoppingCart> shoppingCarts() {
        List<ShoppingCart> shoppingCarts = shoppingCartDao.findByEnabled(true);
        for (int i = 0; i<shoppingCarts.size(); i++) {
            List<Good> goods = new ArrayList<>();
            List<Good_Shopping> good_shoppings = good_shoopingDao.findByShoppingId(shoppingCarts.get(i).getId());
            for (int j=0; j<good_shoppings.size();j++) {
                goods.add(goodDao.findById(good_shoppings.get(j).getGood_id()));
            }
            shoppingCarts.get(i).setGoods(goods);
        }
        return shoppingCarts;
    }

    //增加购物车
    public Integer save(ShoppingCart shoppingCart) {
        return shoppingCartDao.save(shoppingCart.getName(), true);
    }
}
