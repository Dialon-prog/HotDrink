package OOP.less1.practice.Task1;

import java.util.ArrayList;
import java.util.List;

import OOP.less1.practice.Task1.impl.HotDrink;

// import javax.management.RuntimeErrorException;

public  class VendingMachine {

    protected List<Product> products;

    public VendingMachine() {

        this.products = new ArrayList<>();
    }

    public VendingMachine(List<Product> products) {
        
        this.products = products;
    }

    public  void addProducts (List<Product> products){
        this.products.addAll(products);
    } 
        
    

    public Product getProduct(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                products.remove(product);
                return product;
            }
        }
        // throw new RuntimeException("No such product: " + name);
        System.out.println("No such product: " + name);
        return null;
    }

    public  Product getProduct(String name, int volume, int temperature) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                if (product instanceof HotDrink) {

                    HotDrink hotDrink = (HotDrink) product;
                    
                    if (hotDrink.getVolume() == volume && hotDrink.getTemperature() == temperature){
                        products.remove(product);
                        return product;
                    } else {
                        System.out.println("Product found, but volume or temperature doesn't match: " + name);
                        return null;
                    }
                    
                }
            }
        }
        System.out.println("No such product: " + name);
        return null;
    }
    
    public List<Product> getProducts(){
        return products;
    }
}       

 
