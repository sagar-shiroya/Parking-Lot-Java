package models;

import models.enums.PaymentMode;
import models.enums.PaymentStatus;

import java.time.LocalDateTime;

public class Payment {
    private PaymentStatus paymentStatus;
    private LocalDateTime paymentTime;
    private double amount;
    private PaymentMode paymentMode;
    private Bill bill;
    private String transactionRefNo;

    public Payment() {
    }

    public Payment(PaymentStatus paymentStatus, LocalDateTime paymentTime, double amount, PaymentMode paymentMode, Bill bill, String transactionRefNo) {
        this.paymentStatus = paymentStatus;
        this.paymentTime = paymentTime;
        this.amount = amount;
        this.paymentMode = paymentMode;
        this.bill = bill;
        this.transactionRefNo = transactionRefNo;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public LocalDateTime getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(LocalDateTime paymentTime) {
        this.paymentTime = paymentTime;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public String getTransactionRefNo() {
        return transactionRefNo;
    }

    public void setTransactionRefNo(String transactionRefNo) {
        this.transactionRefNo = transactionRefNo;
    }
}
