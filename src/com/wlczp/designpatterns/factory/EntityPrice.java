package com.wlczp.designpatterns.factory;

public class EntityPrice extends  Price{

    public EntityPrice(){
        setTypeDesc("实物类型计价");
        this.setCurrency("美元");
    }
    public  double getPrice(String productid) {
        return  caluPrice(productid);
    }

    private double caluPrice(String productid){

        return 1111.99*3;
    }

}
