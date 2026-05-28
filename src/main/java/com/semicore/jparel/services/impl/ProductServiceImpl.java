package com.semicore.jparel.services.impl;

import com.semicore.jparel.entities.Product;
import com.semicore.jparel.repositories.ProductRepository;
import com.semicore.jparel.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
