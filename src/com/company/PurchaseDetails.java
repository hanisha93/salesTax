package com.company;

public class PurchaseDetails {

    public int noOfItems;
    public String item;
    public double price;
    public String imported;
    public String taxable;

    public PurchaseDetails(int noOfItems, String item, double price, String imported, String taxable) {
        this.noOfItems = noOfItems;
        this.item = item;
        this.price = price;
        this.imported = imported;
        this.taxable = taxable;
    }

    public String toString() {
        return noOfItems + " " + item + " " + "at" + price;
    }

}
