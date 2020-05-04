package com.zzk.fresh.entity;

import java.io.Serializable;

public class Good_Shopping implements Serializable {
    private int good_id;
    private int shopping_id;

    public int getGood_id() {
        return good_id;
    }

    public void setGood_id(int good_id) {
        this.good_id = good_id;
    }

    public int getShopping_id() {
        return shopping_id;
    }

    public void setShopping_id(int shopping_id) {
        this.shopping_id = shopping_id;
    }
}
