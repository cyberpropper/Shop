package com.shoping.shopp;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ShoppingCartService {
    private final ShoppingCart cart = new ShoppingCart();

    public void addItem(int itemId) {
        cart.addItem(itemId);
    }

    public void addItems(List<Integer> itemIds) {
        for (int itemId : itemIds) {
            cart.addItem(itemId);
        }
    }

    public List<Integer> getItems() {
        return cart.getItems();
    }
}
