package com.sm.entity;

import java.io.Serializable;

public class NameAndTime implements Serializable {
    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    private String commodityName;
    private String purchaseAt;


    public String getPurchaseAt() {
        return purchaseAt;
    }

    public void setPurchaseAt(String purchaseAt) {
        this.purchaseAt = purchaseAt;
    }
}
