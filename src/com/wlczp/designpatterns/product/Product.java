package com.wlczp.designpatterns.product;

import com.wlczp.designpatterns.factory.Price;
public class Product {
    private String productType ;
    private int productId;
    private String productName;
    private Price price;

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", price=" + price.getPrice("") +
                ",productType " + productType +  '\'' +
                '}';
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

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }
}
