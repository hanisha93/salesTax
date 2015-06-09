package com.company;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BillItemsTest {

    @Test
    public void specForCheckingOnlyNontaxableItems() {
        PurchaseDetails item = new PurchaseDetails(1,"books",23.0,"no","no");
        ArrayList<PurchaseDetails> listOfItems = new ArrayList<PurchaseDetails>();
        listOfItems.add(item);
        InputListOfItems inputList = mock(InputListOfItems.class);
        when(inputList.takeInput()).thenReturn(listOfItems);

        BillItems bill = new BillItems(listOfItems);
        ArrayList<PurchaseDetails> taxApplied = bill.caluculateTax();

        assertEquals(listOfItems,taxApplied);
    }
}