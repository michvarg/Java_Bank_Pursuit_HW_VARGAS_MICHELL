package com.company;


public class Account {


    private double balance;
    //balance to 1600.00
    public Account(){
        balance = 1600.00;
        balance = 400.00;
    }


    //Deposit
    public void deposit(double amount){
        System.out.println("How Much Would You Like To Deposit");
        balance = balance + amount;
        System.out.println(balance);
    }

    // Withdraw
    public void withdraw(double amount){
        System.out.println("How Much Would You Like To Withdraw");
        userInput = s.nextLine();
        if(amount<=balance){
            balance = balance - amount;
        }
        else {
            System.err.println("Transaction is cancelled due to insufficient funds");
        }
//        balance = balance - amount;
    }

    //Get Balance
    public double getBalance(){
        System.out.println("Your New Balance Is");
        return balance;
    }

}
