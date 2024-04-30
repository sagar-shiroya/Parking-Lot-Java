package repository;

import exception.TicketNotFoundException;
import models.Ticket;

import java.util.HashMap;

public class TicketRepository {
    private HashMap<Integer, Ticket> tickets;
    private static int idCounter = 0;

    public TicketRepository() {
        this.tickets = new HashMap<>(); // Replicating DB table for in-memory storage
    }

    public void put(Ticket ticket) {
        ticket.setId(++idCounter);
        tickets.put(ticket.getId(), ticket);
        System.out.println("Ticket has been added successfully");
    }

    public Ticket get(int ticketId) {
        Ticket ticket = tickets.get(ticketId);
        if(ticket == null) {
            throw new TicketNotFoundException("Ticket not found for ID: " + ticketId);
        }
        return ticket;
    }
}
