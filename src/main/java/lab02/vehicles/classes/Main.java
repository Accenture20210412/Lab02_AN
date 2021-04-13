package main.java.lab02.vehicles.classes;

import main.java.lab02.vehicles.interfaces.Flying;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        Vehicle car = new Car("Autko");
        Vehicle plane = new Plane("Samolocik");
        Vehicle raceCar = new RaceCar("Szatan");
        Vehicle ship = new Ship("Statek");
        Vehicle truck = new Truck("Ciężaróweczka");

        vehicles.add(car);
        vehicles.add(plane);
        vehicles.add(raceCar);
        vehicles.add(ship);
        vehicles.add(truck);

        for(Vehicle vehicle : vehicles) {
            System.out.println("Dane dla pojazdu " + vehicle.getName() + ":");
            vehicle.go();
            vehicle.stop();
            System.out.println("Fuel efficiency: " + vehicle.calcFuelEfficiency());
            if (vehicle instanceof Flying) {
                ((Flying) vehicle).callAirControl();
            }

            System.out.println();

        }


    }
}
