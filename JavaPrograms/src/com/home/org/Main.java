package com.home.org;

public class Main {

    public static void main(String[] args) {
        ObjectCounter count1 = new ObjectCounter();
        ObjectCounter count2 = new ObjectCounter();
        ObjectCounter count3 = new ObjectCounter();
        System.out.println("Total object count is " + ObjectCounter.Count);
    }
}
