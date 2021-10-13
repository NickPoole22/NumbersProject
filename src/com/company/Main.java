package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("These bananas cost $12.50. How many would you like to buy?");
    double numItems = scan.nextInt();
    double totalCost = (12.50 * numItems);
    double taxCost = (totalCost * .078);
    System.out.println("Your total is $" + totalCost);
    System.out.println("Your total cost with tax is $" + (totalCost + taxCost));





    }
}
