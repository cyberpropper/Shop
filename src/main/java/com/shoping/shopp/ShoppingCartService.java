package com.shoping.shopp;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingCartService {
    private final ThreadLocal<ShoppingCart> cartThreadLocal = ThreadLocal.withInitial(ShoppingCart::new);

    public void addItem(int itemId) {
        cartThreadLocal.get().addItem(itemId);
    }

    public void addItems(List<Integer> itemIds) {
        for (int itemId : itemIds) {
            cartThreadLocal.get().addItem(itemId);
        }
    }

    public List<Integer> getItems() {
        return cartThreadLocal.get().getItems();
    }
}
