package com.example;

public class MyClass {

    public static void main(String[] args) {

        if (1 == 1) {
            System.out.println("One equals one");
        }

        if (1 != 1) {
            System.out.println("One is not equal to one");
        }

        int accountBalance = 100;
        int itemPrice = 25;

        if (accountBalance >= itemPrice) {
            System.out.println("You nave purchased the item!");
        } else {
            System.out.println("You don't have enough money! Get a job!");
        }

        int degrees = -10;

        if (degrees >= 70) {
            System.out.println("Put on some sunblock!");
        } else if (degrees < 70 && degrees >= 59) {
            System.out.println("You might need a sweater!");
        } else {
            System.out.println("Put on a heavy coat!");
        }

        boolean firstTimeCustomer = false;
        boolean isExecutiveMember = true;

        if (firstTimeCustomer == true || isExecutiveMember == true) {
            System.out.println("You received a 10% discount");
        }

        if (firstTimeCustomer || isExecutiveMember) {
            System.out.println("You received a 10% discount");
        }

        if (true == true || false == true && false == true) {

        }

        if (false == true && true == true || false == false && true == true && false == true){

        }

    }
}
