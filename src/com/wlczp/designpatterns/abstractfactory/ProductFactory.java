package com.wlczp.designpatterns.abstractfactory;

import com.wlczp.designpatterns.product.EntityProduct;
import com.wlczp.designpatterns.product.InsureProduct;

public interface ProductFactory {
    /**按照参数返回确定的保险产品。生产环境下，如果产品数量有限可以使用枚举。
    //数量多时，产品一般保存在数据库中，这种情况下需要在工厂中引用数据访问组件中的
     数据对象，来创建具体的一组产品（那就需要有另外一个InterFace来定义，以免违反单一原则）。
     或者id为产品的唯一标识，在create***Product
     中，根据这个标识，访问数据访问组件得到产品信息后，制造对象。
     工厂模式使得对象不再依赖具体的类类创建，而是依赖于工厂返回的对象。这样强制对象的使用者Client使用
     接口或者抽象类来定义对象，并实现依赖倒置，由于依赖于工厂的返回，使得需要改变类名称时不会影响到Client。
     */
    public InsureProduct createInsureProduct(int id);
    public EntityProduct createEntityProduct(int id);
}
