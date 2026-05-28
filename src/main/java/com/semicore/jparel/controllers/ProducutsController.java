package com.semicore.jparel.controllers;

import com.semicore.jparel.entities.Product;
import com.semicore.jparel.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProducutsController {

    @Autowired
    private ProductService productService;

    @GetMapping("/all")
    public List<Product> getAllProducts() {
        // Logic to retrieve all products from the database
        return productService.getAllProducts();
    }

}
