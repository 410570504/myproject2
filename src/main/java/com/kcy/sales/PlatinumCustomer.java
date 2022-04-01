package com.kcy.sales;

public class PlatinumCustomer extends SilverCustomer {

    public PlatinumCustomer(String id, int amount) {
        super(id, amount);
        off=0.3f;
    }
}
