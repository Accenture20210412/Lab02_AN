package main.java.lab02;

public abstract class Vehicle {

    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }

    public abstract double getFuelNeeds();
    public abstract double getDistance();

    public double calcFuelEfficiency() {
        return getFuelNeeds()/getDistance();
    }

    public void go() {
        System.out.println("Maszyna rusza!");
    }

    public void stop() {
        System.out.println("Maszyna staje");
    }
}
