package com.wlczp.designpatterns.factory;

public class OtherInsurePrice extends Price {

    public OtherInsurePrice(){
        setTypeDesc("其他险类型计价");
        this.setCurrency("欧元");
    }

    public  double getPrice(String productid) {
        return  caluPrice(productid);
    }

    private double caluPrice(String productid){

        return 1111.99;
    }
}
