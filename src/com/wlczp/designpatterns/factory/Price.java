package com.wlczp.designpatterns.factory;

/**
 * 价格类抽象类。不同的商品类型定义了一套不一样的价格计算方式。ForceInsure、OtherInsure及其他等
 *
 */
public abstract class Price {
    private String procuctId; //产品编号
    private String currency;
    private String priceType; //产品计价类型
    private String typeDesc;
    public abstract double getPrice(String productid) ;

    public String getProcuctId() {
        return procuctId;
    }

    @Override
    public String toString() {
        return "Price{" +
                "procuctId='" + procuctId + '\'' +
                ", currency='" + currency + '\'' +
                ", priceType='" + priceType + '\'' +
                ", typeDesc='" + typeDesc + '\'' +
                ", price='" + getPrice(" ") + '\'' + //在子类会实现，不同子类对象得到不同结果
                '}';
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }

    public void setProcuctId(String procuctId) {
        this.procuctId = procuctId;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getPriceType() {
        return priceType;
    }

    public void setPriceType(String priceType) {
        this.priceType = priceType;
    }
}