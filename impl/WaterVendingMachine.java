package OOP.less1.practice.Task1.impl;

import java.util.List;

import OOP.less1.practice.Task1.Product;
import OOP.less1.practice.Task1.VendingMachine;

public class WaterVendingMachine extends VendingMachine {

    public WaterVendingMachine() {

    }

    public WaterVendingMachine(List<Product> products) {
        super(products);
    }
}
