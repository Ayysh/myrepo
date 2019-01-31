package com.home.org.inheritance.challenge;
//import com.home.org.inheritance.challenge.Vehicle;

public class Airplane extends Vehicle {
    public Airplane(int speed, int enginepower, String enginetype) {
        super(speed, enginepower, enginetype);
    }

    public void wheels() {
        System.out.println(this.getClass().getSimpleName() + " has 2 wheels ");
    }

    public void steering() {
        System.out.println(" Plane has no steering but control sticks");
    }


    public void gears() {
        System.out.println(" Plane has no gear system");
        System.out.println("The maximum engine power for plane is" + getEnginepower());
    }

    public void engine() {
        System.out.println(" Plane has" + getEnginetype() + " engine");
    }
}

