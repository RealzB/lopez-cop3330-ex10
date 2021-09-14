package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 10 Solution
 *  Copyright 2021 Brandon Lopez
 */
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of item 1:");
        String uipriceOne = sc.nextLine();
        System.out.println("Enter the quantity of item 1:");
        String uiqtyOne = sc.nextLine();
        System.out.println("Enter the price of item 1:");
        String uipriceTwo = sc.nextLine();
        System.out.println("Enter the quantity of item 1:");
        String uiqtyTwo = sc.nextLine();
        System.out.println("Enter the price of item 1:");
        String uipriceThree = sc.nextLine();
        System.out.println("Enter the quantity of item 1:");
        String uiqtyThree = sc.nextLine();

        float priceOne = Integer.valueOf(uipriceOne);
        float qtyOne = Integer.valueOf(uiqtyOne);
        float priceTwo = Integer.valueOf(uipriceTwo);
        float qtyTwo = Integer.valueOf(uiqtyTwo);
        float priceThree = Integer.valueOf(uipriceThree);
        float qtyThree = Integer.valueOf(uiqtyThree);



        float subtotal = (priceOne*qtyOne)+(priceTwo*qtyTwo)+(priceThree*qtyThree);
        double tax = subtotal * .055;
        double total = subtotal + tax;

        String subtotalop = String.format("Subtotal: $%.2f", subtotal);
        String taxop = String.format("Tax: $%.2f", tax);
        String totalop = String.format("Total: $%.2f", total);


        System.out.println(subtotalop);
        System.out.println(taxop);
        System.out.println(totalop);




    }
}