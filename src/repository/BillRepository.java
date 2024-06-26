package repository;

import exception.BillNotFoundException;
import models.Bill;

import java.util.HashMap;

public class BillRepository {
    private HashMap<Integer, Bill> billMap;
    private static int idCounter = 0;

    public BillRepository() {
        billMap = new HashMap<>();
    }

    public void put(Bill bill){
        bill.setId(++idCounter);
        billMap.put(bill.getId(), bill);
        System.out.println("Bill has been added successfully");
    }

    public Bill get(Integer billId){
        Bill bill = billMap.get(billId);
        if(bill == null) {
            throw new BillNotFoundException("Bill not found for ID: " + billId);
        }
        return bill;
    }
}
