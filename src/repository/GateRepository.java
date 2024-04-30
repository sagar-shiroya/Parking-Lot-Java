package repository;

import exception.GateNotFoundException;
import models.Gate;
import models.ParkingSpot;

import java.util.HashMap;

public class GateRepository {
    private HashMap<Integer, Gate> gateMap;
    private static int idCounter = 0;

    public GateRepository() {
        gateMap = new HashMap<>();
    }

    public void put(Gate gate){
        gate.setId(++idCounter);
        gateMap.put(gate.getId(), gate);
        System.out.println("Gate has been added successfully");
    }

    public Gate get(Integer gateId){
        Gate gate = gateMap.get(gateId);
        if(gate == null) {
            throw new GateNotFoundException("Gate not found for ID: " + gateId);
        }
        return gate;
    }
}
