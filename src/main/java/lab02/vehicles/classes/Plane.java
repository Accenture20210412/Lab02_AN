package main.java.lab02.vehicles.classes;

import main.java.lab02.vehicles.interfaces.Flying;

public class Plane extends Vehicle implements Flying {

    public Plane(String name) {
        super(name);
    }

    @Override
    public double getFuelNeeds() {
        return 500;
    }

    @Override
    public double getDistance() {
        return 200;
    }

    @Override
    public void takeOff() {
        System.out.println("Plane is taking off.");
    }

    @Override
    public void land() {
        System.out.println("Plane is landing.");
    }

    @Override
    public void callAirControl() {
        System.out.println("Calling air control...");
    }

    @Override
    public void go() {
        System.out.println("Plane is going");
    }

    @Override
    public void stop() {
        System.out.println("Plane is stopping");
    }
}
