package com.wlczp.designpatterns.factory;

public class ForcureInsurePrice extends Price{

    public ForcureInsurePrice(){
        setTypeDesc("强制险类型计价");
        this.setCurrency("人民币");
    }
    public  double getPrice(String productid) {
        return  caluPrice(productid);
    }

    private double caluPrice(String productid){

        return 1111.99*2;
    }
}
