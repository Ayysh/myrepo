package com.home.org.constructor.challenge;


import com.home.org.ObjectCounter;

public class BankAccount {

    private int accountnumber;
    private int balance;
    private String customername;
    private String emailid;
    private int phno;

    public BankAccount(int accountnumber, int balance, String customername, String emailid, int phno) {
        this.accountnumber = accountnumber;
        this.balance = balance;
        this.customername = customername;
        this.emailid = emailid;
        this.phno = phno;
    }

    public int getAccountnumber() {
        return accountnumber;
    }

    public int getBalance() {
        return balance;
    }

    public String getCustomername() {
        return customername;
    }

    public String getEmailid() {
        return emailid;
    }

    public int getPhno() {
        return phno;
    }

    public void deposit(int amount) {
        this.balance = this.balance + amount;
        System.out.println("The new balance amount after deposit of customer "+ getCustomername() +" is " + getBalance());
    }

    public void withdraw(int amount) {
        if (amount > this.balance) {
            System.out.println("Cannot withdraw : Insufficient funds");
        }
        else
        {
            this.balance = this.balance-amount;
            System.out.println("Current balance after withdrawal of customer "+ getCustomername() +" is " + getBalance());
        }
    }

    @Override
    public String toString() {
        return "BankAccount details: " +
                "accountnumber=" + accountnumber +
                ", balance=" + balance +
                ", customername='" + customername + '\'' +
                ", emailid='" + emailid + '\'' +
                ", phno=" + phno;
    }
}
















