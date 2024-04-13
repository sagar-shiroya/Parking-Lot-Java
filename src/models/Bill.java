package models;

import models.enums.BillStatus;

import java.time.LocalDateTime;

public class Bill {
    private int id;
    private LocalDateTime exitTime;
    private double amount;
    private Ticket ticket;
    private Gate exitGate;
    private BillStatus billStatus;

    public Bill() {
    }

    public Bill(int id, LocalDateTime exitTime, double amount, Ticket ticket, Gate exitGate, BillStatus billStatus) {
        this.id = id;
        this.exitTime = exitTime;
        this.amount = amount;
        this.ticket = ticket;
        this.exitGate = exitGate;
        this.billStatus = billStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Gate getExitGate() {
        return exitGate;
    }

    public void setExitGate(Gate exitGate) {
        this.exitGate = exitGate;
    }

    public BillStatus getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(BillStatus billStatus) {
        this.billStatus = billStatus;
    }
}