package service.strategy.billCalculationStrategy;

import models.Bill;
import models.Ticket;

public interface BillCalculationStrategy {
    public Bill generateBill(Ticket ticket);
}
