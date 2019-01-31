package com.home.org.inheritance.challenge;

public class Car extends Vehicle {

    public Car(int speed, int enginepower, String enginetype) {
        super(speed, enginepower, enginetype);
    }

    public void steering() {
        System.out.println("Most Car has manual steering and few cars has auto steering");
    }

    public void gears() {
        System.out.println(" Car can have 4 or 5 forward gears and one reverse gears");
        System.out.println("The maximum engine power for cars is " + getEnginepower());
    }

    public void engine() {
        System.out.println(" Most Cars have " + getEnginetype() + " engines");
    }
}
