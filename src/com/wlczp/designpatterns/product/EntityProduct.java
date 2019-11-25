package com.wlczp.designpatterns.product;


import com.wlczp.designpatterns.factory.Price;

public abstract class EntityProduct {
     String entityType;
     int productId;
     String productName;
     String Color;
     String Currency;
     double Weight;
     Price price;

     public  double getCurrentPrice(){
          return price.getPrice("");
     }

     @Override
     public String toString() {
          return "EntityProduct{" +
                  "entityType='" + entityType + '\'' +
                  ", productId=" + productId +
                  ", productName='" + productName + '\'' +
                  ", Color='" + Color + '\'' +
                  ", Currency='" + Currency + '\'' +
                  ", Weight=" + Weight +
                  ", price=" + price.getPrice("") +
                  '}';
     }
}
