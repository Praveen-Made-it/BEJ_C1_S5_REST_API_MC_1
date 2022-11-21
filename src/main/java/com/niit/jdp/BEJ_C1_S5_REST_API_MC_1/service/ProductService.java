package com.niit.jdp.BEJ_C1_S5_REST_API_MC_1.service;

import com.niit.jdp.BEJ_C1_S5_REST_API_MC_1.domain.Product;

import java.util.List;

public interface ProductService {
    Product addProduct(Product product);

    List<Product> getAllProduct();

}
