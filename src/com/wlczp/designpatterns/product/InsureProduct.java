package com.wlczp.designpatterns.product;

import com.wlczp.designpatterns.factory.Price;

//保险类商品
public abstract class InsureProduct {
     String insureType ;
     int productId;
     String productName;
     //不同类型的产品价格不一样，该价格对象由子类的工厂产生
     Price price;

    @Override
    public String toString() {
        return "InsureProduct{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", price=" + price.getPrice("") +
                ",productType " + insureType +  '\'' +
                '}';
    }

    public  double getCurrentPrice(){
        return price.getPrice("");
    };
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


}
