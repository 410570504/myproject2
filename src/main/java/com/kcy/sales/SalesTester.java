package com.kcy.sales;

import java.util.ArrayList;
import java.util.List;

//一般客戶
//銀級客戶-滿千送百 再送百元福利金
//金級客戶-滿千送兩百 再送二百元福利金
//added after:
//customer get 10% off discount
//customer get 30% off and 20% point
//0001 1200  1100
//0002 800   800
//0003 2000 1800(200)
//0004 5000 4000(1000)
//0006 900   810
public class SalesTester {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("001",1200));
        customers.add( new Customer("002",800));
        customers.add(new SilverCustomer("003",2000));
        customers.add( new GoldenCustomer("004",5000));
        customers.add( new DiscountCustomer("006",900));
        customers.get().print();
        c1.print();
        c2.print();
        c3.print();
        c4.print();
        c5.print();
    }
}
