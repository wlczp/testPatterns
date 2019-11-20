package com.wlczp.designpatterns.factory;

public class MyPriceFactory extends PriceFactory {
    @Override
    protected Price buildPrice(String type) {
        if(type.equals(Constant.FORCURE)){
            return new ForcureInsurePrice();
        }else if(type.equals(Constant.ENTITY)){
            return  new EntityPrice();
        }else{
            return new OtherInsurePrice();
        }
    }
}
