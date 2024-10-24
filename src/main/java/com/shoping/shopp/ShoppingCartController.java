package com.shoping.shopp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class ShoppingCartController {

    @Autowired
    private ShoppingCartService shoppingCartService;

    @PostMapping("/add")
    public void addItem(@RequestParam int itemId) {
        shoppingCartService.addItem(itemId);
    }

    @GetMapping("/get")
    public List<Integer> getItems() {
        return shoppingCartService.getItems();
    }
}
