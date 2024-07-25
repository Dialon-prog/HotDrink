package OOP.less1.practice.Task1.impl;

import java.time.LocalDate;

import OOP.less1.practice.Task1.Product;

public class HotDrink extends Product{

    private int temperature;
    private int volume;
    private String pack;


    public HotDrink (String name, double price, LocalDate releaseDate){
        super(name, price, releaseDate);
        this.temperature = 55;
        this.pack = EPackage.POLYSTYRENE.getMaterial();
        this.volume = 1;
    }

    public HotDrink (String name, double price, LocalDate releaseDate, String pack, int volume,int temperature){
        super(name, price, releaseDate);
        this.temperature = temperature;
        this.pack = pack;
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public int getVolume() {
        return volume;
    }

    public String getPack() {
        return pack;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrink [name=" + name + ", price=" + price + ", temperature=" + temperature + ", releaseDate="
                + releaseDate + ", volume=" + volume + ", pack=" + pack + "]";
    }

    
}
