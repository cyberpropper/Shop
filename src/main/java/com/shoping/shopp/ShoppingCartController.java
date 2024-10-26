package com.shoping.shopp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class ShoppingCartController {

    @Autowired
    private ShoppingCartService shoppingCartService;

    @GetMapping("/add")
    public void addItem(@RequestParam int itemId) {
        shoppingCartService.addItem(itemId);
    }

    @PostMapping("/add-list")
    public void addItems(@RequestBody List<Integer> itemIds) {
        shoppingCartService.addItems(itemIds);
    }

    @GetMapping("/get")
    public List<Integer> getItems() {
        return shoppingCartService.getItems();
    }
}
