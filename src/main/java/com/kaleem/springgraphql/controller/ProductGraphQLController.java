package com.kaleem.springgraphql.controller;

import com.kaleem.springgraphql.model.Product;
import com.kaleem.springgraphql.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class ProductGraphQLController {

    private final ProductService productService;

    @QueryMapping
    public List<Product> findAllProducts() {
        return productService.findAllProducts();
    }

    @QueryMapping
    public Product findProductByName(@Argument String name) {
        return productService.findProductByName(name);
    }
}
