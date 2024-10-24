package com.shoping.shopp;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Integer> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(int itemId) {
        items.add(itemId);
    }

    public List<Integer> getItems() {
        return items;
    }
}