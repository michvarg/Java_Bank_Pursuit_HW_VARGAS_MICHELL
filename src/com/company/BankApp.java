package com.company;


import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Scanner;

public class BankApp extends Account {
    String userInput;
    String username = "MICHVAR1995";
    String username2 = "JOHNDOE1830";
    int balance = 0;
    String password = "2024";
    String password2 = "1234";
    //    Array arraylist = {0,1};
        Scanner m = new Scanner(System.in);
        public void bankName() {
            System.out.println("WELCOME TO BANK TEL AVIV");
            System.out.println("What is your Bank Account Username");
        }
        Scanner s = new Scanner(System.in);
   public void signIn() {

       userInput = s.nextLine();
       if (userInput.equals(username)){
           password();
       }
       else {
           if (userInput.equals(username2)){
               password();
           }
       }

       }
       public void password(){
       System.out.println("what your password");
       userInput = s.nextLine();
       if (userInput.equals(password)){
           enter();
       }
       else{
           if(userInput.equals(password2)){
               enter();
           }
       }
   }

   public void enter() {
       System.out.println("1 -> OPEN NEW ACCOUNT");
       System.out.println("2 -> DEPOSIT");
       System.out.println("3 -> WITHDRAW");
       System.out.println("4 -> ACCOUNT INFORMATION");
       System.out.println("5 -> CURRENT BALANCE");
       System.out.println("6 -> QUIT");

       userInput = s.nextLine();

       switch (userInput){
           case "1":

               break;
           case "2":
               deposit(1600.00);
               break;

           case "3":
               withdraw(400.00);
               break;


       }
   }

}
















