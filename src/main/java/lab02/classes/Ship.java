package main.java.lab02.classes;

import main.java.lab02.interfaces.Sailing;

public class Ship extends Vehicle implements Sailing {

    public Ship(String name) {
        super(name);
    }

    @Override
    public double getFuelNeeds() {
        return 100;
    }

    @Override
    public double getDistance() {
        return 200;
    }

    @Override
    public void dock() {
        System.out.println("Ship is docking");
    }

    @Override
    public void stop() {
        System.out.println("Ship is stopping.");
    }

}
