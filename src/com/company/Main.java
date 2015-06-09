package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<PurchaseDetails> inputItems = new ArrayList<PurchaseDetails>();
        InputListOfItems items = new InputListOfItems();
        inputItems = items.takeInput();
    }
}
