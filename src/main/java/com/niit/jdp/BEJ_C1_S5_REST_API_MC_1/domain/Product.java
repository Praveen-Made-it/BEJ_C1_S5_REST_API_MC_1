/*
 *Author Name:Praveen Kumar
 *Date: 21-Nov-22
 *Created With IntelliJ Idea Community Edition
 */


package com.niit.jdp.BEJ_C1_S5_REST_API_MC_1.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

    @Id
    private int productId;
    private String productName;
    private String manufacturer;

    public Product() {
    }

    public Product(int productId, String productName, String manufacturer) {
        this.productId = productId;
        this.productName = productName;
        this.manufacturer = manufacturer;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}

