package com.kaleem.springgraphql.service;

import com.kaleem.springgraphql.model.Product;
import com.kaleem.springgraphql.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }

    public Product findProductByName(String name) {
        return productRepository.findProductByName(name);
    }
}
