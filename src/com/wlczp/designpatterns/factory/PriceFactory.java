package com.wlczp.designpatterns.factory;


/**
 * 工厂方法的抽象类
 * 使用了带参数的工厂方法。这样可以只建立一个工厂；关键是，如果需要新增某个计价方式，可以在
 * 工厂方法的子类增加即可，或者改变现有的参数和对象的关联方式。客户的用例代码仅仅给出参数。
 * 工厂方法在Spring中，有时候可以使用自动注入的方式来代替。
 */
public abstract class PriceFactory {
    public Price createPrice(String type){
        Price price=buildPrice(type);
        price.setPriceType(type);
        return price;

    }

    protected  abstract Price buildPrice(String type); //具体的实现依赖于子类。这样可以有更灵活的改变工厂的方式
}
