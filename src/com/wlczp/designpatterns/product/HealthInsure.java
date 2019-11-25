package com.wlczp.designpatterns.product;

import com.wlczp.designpatterns.factory.Constant;
import com.wlczp.designpatterns.factory.ForcureInsurePrice;
import com.wlczp.designpatterns.factory.Price;
import com.wlczp.designpatterns.factory.PriceFactory;

//健康险
public class HealthInsure extends InsureProduct {

    //一般情况下，产品数据库中会存储产品ID以和其它表关联，以及其它信息
    //生产环境中，产品ID不要使用数据库的IDENTITY，而且构造函数应该包含
    //这类产品的名称、描述等其它信息，使用一个对象传递
    public HealthInsure(int id,PriceFactory priceFactory) {

        price= priceFactory.createPrice(Constant.FORCURE);
                this.productId=id;
                this.productName="健康强制险险";
                this.insureType="强制险类型";

    }


}
