package repository;

import exception.PaymentNotFoundException;
import models.Payment;

import java.util.HashMap;

public class PaymentRepository {
    private HashMap<Integer, Payment> paymentMap;
    private static int idCounter = 0;

    public PaymentRepository() {
        paymentMap = new HashMap<>();
    }

    public void put(Payment payment){
        payment.setId(++idCounter);
        paymentMap.put(payment.getId(), payment);
        System.out.println("Payment has been added successfully");
    }

    public Payment get(Integer paymentId){
        Payment payment = paymentMap.get(paymentId);
        if(payment == null){
            throw new PaymentNotFoundException("Payment not found for ID: " + paymentId);
        }
        return payment;
    }
}
