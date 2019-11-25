package com.wlczp.designpatterns.factory;


/**
 * 工厂方法的抽象类
 * 使用了带参数的工厂方法。这样可以只建立一个工厂；关键是，如果需要新增某个计价方式，可以在
 * 工厂方法的子类增加即可，或者改变现有的参数和对象的关联方式。客户的用例代码仅仅给出参数。
 * 工厂方法在Spring中，有时候可以使用自动注入的方式来代替。
 * 价格使用工厂方法模式的原因在于，价格的计算可能很复杂：不同的客户展现的价格可能有区别，价格和购买的数量的相关，价格还和购买的
 *      * 日期相关等等。使用工厂模式后，价格的实现不在new具体的类，需要改变时，可以在工厂中改变返回对象、
 */
public abstract class PriceFactory {
    public Price createPrice(String type){
        Price price=buildPrice(type);
        price.setPriceType(type);
        return price;

    }

    protected  abstract Price buildPrice(String type); //具体的实现依赖于子类。这样可以有更灵活的改变工厂的方式
}
