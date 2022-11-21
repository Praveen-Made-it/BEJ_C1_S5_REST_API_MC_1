/*
 *Author Name:Praveen Kumar
 *Date: 21-Nov-22
 *Created With IntelliJ Idea Community Edition
 */


package com.niit.jdp.BEJ_C1_S5_REST_API_MC_1.service;

import com.niit.jdp.BEJ_C1_S5_REST_API_MC_1.domain.Product;
import com.niit.jdp.BEJ_C1_S5_REST_API_MC_1.repository.ProductRepository;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product addProduct(Product product) {
        return null;
    }

    @Override
    public List<Product> getAllProduct() {
        return null;
    }
}
