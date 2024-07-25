package OOP.less1.practice.Task1.impl;

import java.util.List;

import OOP.less1.practice.Task1.Product;
import OOP.less1.practice.Task1.VendingMachine;

public class HotDrinkVendingMachine extends VendingMachine{

    public HotDrinkVendingMachine() {
        
    }

    public HotDrinkVendingMachine(List<Product> products){
        super(products);
    }

}
