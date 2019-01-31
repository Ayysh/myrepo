package com.home.org.inheritance.challenge;

public class Vehicle {
    private int speed;
    private int enginepower;
    private String enginetype;

    //  public Vehicle(){};

    public Vehicle(int speed, int enginepower, String enginetype) {

        this.speed = speed;
        this.enginepower = enginepower;
        this.enginetype = enginetype;
    }

    public int getSpeed() {
        return speed;
    }

    public int getEnginepower() {
        return enginepower;
    }

    public String getEnginetype() {
        return enginetype;
    }

    public void wheels() {
        System.out.println(this.getClass().getSimpleName() + " has 4 wheels");
    }

    public void steering() {
        System.out.println("Vehicles can have steerings and control sticks");

    }

    public void gears() {
        System.out.println("Vehicles have 4 gears and one reverse gear");
        System.out.println(" Maximum speed it can go is" + getEnginepower());
    }

    public void engine() {
        System.out.println(" Vehicles have petrol and diesel engine");
    }


}
