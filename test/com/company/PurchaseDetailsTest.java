package com.company;

import org.junit.Test;

import static org.junit.Assert.*;


public class PurchaseDetailsTest {

    @Test
    public void specForCheckingToString(){
        PurchaseDetails purchaseDetail = new PurchaseDetails(2, "books", 8.0, "yes","no");
        String actualItem = purchaseDetail.toString();
        String expectedItem = "2 books at8.0";
        assertEquals(actualItem, expectedItem);
    }

}