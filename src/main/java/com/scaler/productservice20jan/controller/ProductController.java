package com.scaler.productservice20jan.controller;

import com.scaler.productservice20jan.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // localhost:8081/products
@RequestMapping("/products")
public class ProductController {

    @GetMapping("/details")  // GET /products/details?user_id={}&product_id={}
    public Product getProductDetails(@RequestParam("user_id") Long userId, @RequestParam("product_id") Long productId) {
        return new Product();
    }
}