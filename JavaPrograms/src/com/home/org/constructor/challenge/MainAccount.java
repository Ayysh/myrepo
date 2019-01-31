package com.home.org.constructor.challenge;

public class MainAccount {

    public static void main(String[] args) {

        BankAccount bnkacct = new BankAccount(109384,100,"Shankar","rgshank@gmail.com",4937338);
        BankAccount bnkacct1 = new BankAccount(583017,50032,"Ayys","ayyshankar@gmail.com",46492750);
        bnkacct.deposit(10352);
       // System.out.println("The balance is "+ bnkacct.getBalance());
        bnkacct.withdraw(580);
        bnkacct.withdraw(1500);
        bnkacct.withdraw(5000);
        bnkacct.deposit(15000);
        bnkacct.withdraw(25000);
        System.out.println("The bank details of customer " +bnkacct.getCustomername() +" are : \n" +" accountnumber: " + bnkacct.getAccountnumber() +
               "\n Account balance: " + bnkacct.getBalance() + "\n emailId: " + bnkacct.getEmailid() + "\n phone number: " + bnkacct.getPhno());

        bnkacct1.withdraw(15000);
        bnkacct1.deposit(7500);
        bnkacct1.withdraw(5930);

        System.out.println(bnkacct1);

        VipCustomer vipcust = new VipCustomer();
        VipCustomer vipcust1 = new VipCustomer("Moni" ,"ram.moni@gmail.com");
        VipCustomer vipcust2 = new VipCustomer("Adi",300000,"adi.m@gmail.com");

        System.out.println(vipcust);
        System.out.println(vipcust1);
        System.out.println(vipcust2);

    }
}


