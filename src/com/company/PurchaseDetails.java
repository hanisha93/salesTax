package com.company;

public class PurchaseDetails {

    private int noOfItems;
    private String item;
    private double Price;
    private String imported;

    public PurchaseDetails(int noOfItems, String item, double Price, String imported) {
        this.noOfItems = noOfItems;
        this.item = item;
        this.Price = Price;
        this.imported = imported;
    }

    public String toString() {
        return noOfItems+" "+item+" "+"at"+Price;
    }

}
