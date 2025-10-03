package com.example;
import java.util.Scanner;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      

        double tipAmount = cost * percent / 100;
        double totalBillWithTip = cost + tipAmount;
        double costPreTipPerPerson = cost / people;
        double tipPerPerson = tipAmount / people;
        double totalCostPerPerson = totalBillWithTip / people;
       

        // googled how to round two decimals
        String result = "-------------------------------\n" +
                       "Total bill before tip: $" + Math.round(cost * 100) / 100.0 + "\n" +
                       "Total percentage: " + percent + "%\n" +
                       "Total tip: $" + Math.round(tipAmount * 100) / 100.0 + "\n" +
                       "Total Bill with tip: $" + Math.round(totalBillWithTip * 100) / 100.0 + "\n" +
                       "Per person cost before tip: $" + Math.round(costPreTipPerPerson * 100) / 100.0 + "\n" +
                       "Tip per person: $" + Math.round(tipPerPerson * 100) / 100.0 + "\n" +
                       "Total cost per person: $" + Math.round(totalCostPerPerson * 100) / 100.0 + "\n" +
                       "-------------------------------\n";

        return result;
    }

    public static String extraCredit(int people, int percent, double cost) {
        double tipAmount = cost * percent / 100;
        double totalBillWithTip = cost + tipAmount;
        double costPreTipPerPerson = cost / people;
        double tipPerPerson = tipAmount / people;
        double totalCostPerPerson = totalBillWithTip / people;
        // googled how to round two decimals
        String result = "-------------------------------\n" +
                       "Total bill before tip: $" + Math.round(cost * 100) / 100.0 + "\n" +
                       "Total percentage: " + percent + "%\n" +
                       "Total tip: $" + Math.round(tipAmount * 100) / 100.0 + "\n" +
                       "Total Bill with tip: $" + Math.round(totalBillWithTip * 100) / 100.0 + "\n" +
                       "Per person cost before tip: $" + Math.round(costPreTipPerPerson * 100) / 100.0 + "\n" +
                       "Tip per person: $" + Math.round(tipPerPerson * 100) / 100.0 + "\n" +
                       "Total cost per person: $" + Math.round(totalCostPerPerson * 100) / 100.0 + "\n" + 
                       "-------------------------------\n" + 
                       "Items ordered:\n";
        Scanner item = new Scanner(System.in);
        String itemName = "";
        // googled Scanner usage
        
        // chatgpted how to store multiple inputs in a variable
        // googled .equals syntax
        while (!itemName.equals("-1")) {
            System.out.println("Enter an item name or type '-1' to finish:");
            itemName = item.nextLine();
            if (!itemName.equals("-1")) {
                result += itemName + "\n";
            }
        }
        result += "-------------------------------\n";
item.close();
        return result;
        
    }
    
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 10;
        int percent = 8;
        double cost = 10.5;           
        System.out.println(calculateTip(people,percent,cost));
        System.out.println(extraCredit(people, percent, cost));
    }
}
        // 10, 8, 10.5
