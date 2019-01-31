package com.home.org.inheritance.challenge;

public class Bus extends Vehicle {
    public Bus(int speed, int enginepower, String enginetype) {
        super(speed, enginepower, enginetype);
    }

    public void steering() {
        System.out.println(" Bus has manual steering");
    }


    public void gears() {
        System.out.println(" Bus have 4 forward gears and one reverse gears");
        System.out.println("The maximum engine power for Bus is" + getEnginepower());
    }

    public void engine() {
        System.out.println(" Bus has " + getEnginetype() + " engine");
    }
}
