package com.wlczp.designpatterns.product;

import com.wlczp.designpatterns.factory.Constant;
import com.wlczp.designpatterns.factory.PriceFactory;

public class TrafficInsure extends InsureProduct {

    public  TrafficInsure(int id,PriceFactory priceFactory){
        this.price=priceFactory.createPrice(Constant.OTHER);
        this.productId=id;
        this.productName="交通险";
        this.insureType="其它险类";
    }


}
