package main.java.lab02.classes;

public class Truck extends Car {

    public Truck(String name) {
        super(name);
    }

    @Override
    public double getFuelNeeds() {
        return 30;
    }
}
