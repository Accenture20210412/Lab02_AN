package main.java.lab02.classes;

import main.java.lab02.interfaces.Flying;
import main.java.lab02.interfaces.Sailing;

public class Plane extends Vehicle implements Flying {


    public Plane(String name) {
        super(name);
    }

    @Override
    public double getFuelNeeds() {
        return 0;
    }

    @Override
    public double getDistance() {
        return 0;
    }

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void callAirControl() {

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
