package com.wlczp.designpatterns.abstractfactory;

import com.wlczp.designpatterns.factory.ForcureInsurePrice;
import com.wlczp.designpatterns.factory.MyPriceFactory;
import com.wlczp.designpatterns.product.*;

public class AbroadProductFactory implements ProductFactory{

    @Override
    public InsureProduct createInsureProduct(int id) {
        if(id==1){
           return new HealthInsure(id,new MyPriceFactory()) ;
        }else {
            return new TrafficInsure(id,new MyPriceFactory()) ;
        }
    }

    @Override
    public EntityProduct createEntityProduct(int id) {
        if(id==1){
            return new SuitCase(id,new MyPriceFactory());
        }
        return null;
    }
}
