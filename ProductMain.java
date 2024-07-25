package OOP.less1.practice.Task1;

import java.time.LocalDate;
import java.util.List;

import OOP.less1.practice.Task1.impl.BottleOfWater;
import OOP.less1.practice.Task1.impl.EPackage;
import OOP.less1.practice.Task1.impl.HotDrink;
import OOP.less1.practice.Task1.impl.HotDrinkVendingMachine;
import OOP.less1.practice.Task1.impl.WaterVendingMachine;

public class ProductMain {

    public static void main(String[] args) {
        Product bottle1 = new BottleOfWater("Родники", 55, LocalDate.of(2024, 5, 1));

        Product bottle2 = new BottleOfWater("Родники Газированная", 55, LocalDate.of(2024, 5, 1), true, EPackage.GLASS.getMaterial(), 0.5F);

        Product cofe1 = new HotDrink("Латте", 100, LocalDate.of(2024, 7, 24));

        Product cofe2 = new HotDrink("Капучино", 110, LocalDate.of(2024, 7, 24), EPackage.POLYSTYRENE.getMaterial(), 1, 55);

        VendingMachine vm = new WaterVendingMachine();

        VendingMachine hvm = new HotDrinkVendingMachine();

        System.out.println(vm.getProducts());

        vm.addProducts(List.of(bottle1, bottle1, bottle1, bottle2, bottle2, bottle2));

        System.out.println(vm.getProducts());

        vm.getProduct("Родники");

        System.out.println(vm.getProducts());
    

        System.out.println(hvm.getProducts());
    
        hvm.addProducts(List.of(cofe1, cofe1, cofe2, cofe2));

        System.out.println(hvm.getProducts());

        hvm.getProduct("Латте");

        System.out.println(hvm.getProducts());
    }

}
