package com.revature;

public class Driver {

    User currentUser;


    public static void main(String[] args) {
	// write your code here

        boolean moveOn = false;

        do{
            System.out.println("Welcome to Bank of Imagine!");
            System.out.println("1. Register");
            System.out.println("2. Login");
            break;
        }while (moveOn == false);
    }
}
