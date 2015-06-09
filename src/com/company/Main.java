package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter total items");
        int noOfItems = input.nextInt();
        System.out.println(noOfItems);
        System.out.println("Enter purchase details");
        System.out.println("NoOfItems | ItemName | Price | Imported(yes/no)");

        while (i<noOfItems) {

            int quantity = input.nextInt();
            String itemName = input.next();
            double price = input.nextDouble();
            String imported = input.next();

            PurchaseDetails itemDetails = new PurchaseDetails(quantity,itemName,price,imported);
            ArrayList<PurchaseDetails> inputItems = new ArrayList<PurchaseDetails>();
            inputItems.add(itemDetails);
        }

    }
}
