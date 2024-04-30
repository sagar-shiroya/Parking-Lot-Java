package repository;

import exception.VehicleNotFoundException;
import models.Vehicle;

import java.util.HashMap;

public class VehicleRepository {
    private HashMap<Integer, Vehicle> vehicleMap;
    private static int idCounter = 0;

    public VehicleRepository() {
        vehicleMap = new HashMap<>();
    }

    public void put(Vehicle vehicle){
        vehicle.setId(++idCounter);
        vehicleMap.put(vehicle.getId(), vehicle);
        System.out.println("Vehicle has been added successfully");
    }

    public Vehicle get(Integer vehicleId){
        Vehicle vehicle = vehicleMap.get(vehicleId);
        if(vehicle == null) {
            throw new VehicleNotFoundException("Vehicle not found for ID:" + vehicleId);
        }
        return vehicle;
    }
}
