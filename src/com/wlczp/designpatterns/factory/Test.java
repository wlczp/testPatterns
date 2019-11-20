package com.wlczp.designpatterns.factory;

//import edu.princeton.cs.algs4.*;

/**
 * 测试 设计模式之工厂模式方法
 */
public class Test {
    public static void main(String[] args) {
       PriceFactory pf = new MyPriceFactory();
       //价格对象通过工厂得到。
        Price price=pf.createPrice(Constant.OTHER);
      //  StdOut.println( price.toString());
        System.out.println(price.toString());
        price=pf.createPrice(Constant.FORCURE);
       // StdOut.println( price.toString());
        System.out.println(price.toString());
        price=pf.createPrice(Constant.ENTITY);
       // StdOut.println( price.toString() );
    }
}
