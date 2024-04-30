package repository;

import exception.VehicleNotFoundException;
import models.Vehicle;

import java.util.HashMap;

public class VehicleRepository {
    private HashMap<Integer, Vehicle> vehicleMap;

    public VehicleRepository() {
        vehicleMap = new HashMap<>();
    }

    public void put(Vehicle vehicle){
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
