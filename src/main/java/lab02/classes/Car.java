package main.java.lab02.classes;

public class Car extends Vehicle {

    public Car(String name) {
        super(name);
    }

    @Override
    public double getFuelNeeds() {
        return 8;
    }

    @Override
    public double getDistance() {
        return 100;
    }
}
