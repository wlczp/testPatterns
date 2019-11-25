package com.wlczp.designpatterns.product;

import com.wlczp.designpatterns.factory.Constant;
import com.wlczp.designpatterns.factory.PriceFactory;

public class SuitCase extends EntityProduct {
    /**
     * 这儿，Product使用PriceFactory来实现价格。这儿Product是priceFactory的使用者/Client。
     * 生产环境，往往需要通过ID，使用数据访问对象获取到产品的具体信息：颜色、重量等等。但是价格使用工厂方法
     * 模式的原因在于，价格的计算可能很复杂：不同的客户展现的价格可能有区别，价格和购买的数量的相关，价格还和购买的
     * 日期相关等等。使用工厂模式后，价格的实现不在new具体的类，需要改变时，可以在工厂中改变返回对象、
     * @param id
     * @param priceFactory
     */
    public SuitCase(int id, PriceFactory priceFactory){
        price=priceFactory.createPrice(Constant.ENTITY);
        this.productId=id;
        this.Color="red";
        this.entityType="箱包类";
        this.productName="旅行箱";
        this.Weight=1.5;
    }
}
