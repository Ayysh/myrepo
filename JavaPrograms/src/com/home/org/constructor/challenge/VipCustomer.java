package com.home.org.constructor.challenge;

public class VipCustomer {
    private String name;
    private int creditlimit;
    private String emailaddr;

    public VipCustomer(String name, int creditlimit, String emailaddr) {
        this.name = name;
        this.creditlimit = creditlimit;
        this.emailaddr = emailaddr;
    }

    public VipCustomer(String name, String emailaddr) {
        this.name = name;
        this.emailaddr = emailaddr;
        this.creditlimit = 500000;
    }

    public VipCustomer() {
        this.name = "Lakshmi";
        this.creditlimit = 200000;
        this.emailaddr = "dr.vijayamoni";
    }

    public String getName() {
        return name;
    }

    public int getCreditlimit() {
        return creditlimit;
    }

    public String getEmailaddr() {
        return emailaddr;
    }

    @Override
    public String toString() {
        return "VipCustomer : " +
                "name='" + name + '\'' +
                ", creditlimit=" + creditlimit +
                ", emailaddr='" + emailaddr;
    }
}

