package com.home.org.inheritance.challenge;

public class MainVehicle {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle(300, 900, "diesel");
        Vehicle car = new Car(180, 500, "petrol");
        Vehicle bus = new Bus(200, 650, "diesel");
        Car bmw = new Bmw(250, 690, "diesel");
        Vehicle plane = new Airplane(900, 100000, "diesel");
        vehicle.steering();
        car.gears();
        bus.engine();
        plane.steering();
        bmw.wheels();
        System.out.println(" The speed of bmw is " + bmw.getSpeed());
        plane.wheels();


    }
}
