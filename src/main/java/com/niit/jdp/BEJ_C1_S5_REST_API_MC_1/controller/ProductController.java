/*
 *Author Name:Praveen Kumar
 *Date: 21-Nov-22
 *Created With IntelliJ Idea Community Edition
 */


package com.niit.jdp.BEJ_C1_S5_REST_API_MC_1.controller;

import com.niit.jdp.BEJ_C1_S5_REST_API_MC_1.service.ProductService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ProductController {

    ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
}
