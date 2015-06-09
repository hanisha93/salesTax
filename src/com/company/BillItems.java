package com.company;


import java.util.ArrayList;

public class BillItems {

    ArrayList<PurchaseDetails> inputItems = new ArrayList<PurchaseDetails>();

    public BillItems(ArrayList<PurchaseDetails> inputItems) {
        this.inputItems = inputItems;
    }

    public ArrayList<PurchaseDetails> caluculateTax() {
/*        for (PurchaseDetails eachItem : inputItems) {

            if (eachItem.imported == "yes" && eachItem.taxable == "yes") {
                eachItem.price = (eachItem.price * 15) / 100;
            }*/
        
        return inputItems;
    }
}
