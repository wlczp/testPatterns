package com.wlczp.designpatterns.abstractfactory;

import com.wlczp.designpatterns.product.EntityProduct;
import com.wlczp.designpatterns.product.InsureProduct;
import edu.princeton.cs.algs4.StdOut;

public class TestAbsttractFactory {
    public static void main(String[] args){
        ProductFactory productFactory= new AbroadProductFactory();
        InsureProduct healthProduct=productFactory.createInsureProduct(1);
        StdOut.println(healthProduct.toString());
        InsureProduct trafficProduct=productFactory.createInsureProduct(2);
        StdOut.println(trafficProduct.toString());
        EntityProduct suitCaseProduct=productFactory.createEntityProduct(1);
        StdOut.println(suitCaseProduct.toString());
    }
}
