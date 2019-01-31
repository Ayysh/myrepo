package com.home.org.inheritance.challenge;

public class Bmw extends Car {
    public Bmw(int speed, int enginepower, String enginetype) {
        super(speed * 2, enginepower, enginetype);
    }

    public void steering() {
        System.out.println(" BMW has both manual and auto steering");
    }

    public void gears() {
        System.out.println(" BMW have 5 forward gears and one reverse gears");
        System.out.println("The maximum engine power for BMW is" + getEnginepower());
    }

    public void engine() {
        System.out.println(" BMW have" + getEnginetype() + " engine");
    }

}
