package repository;

import exception.ParkingLotNotFoundException;
import models.ParkingLot;

import java.util.HashMap;

public class ParkingLotRepository {
    private HashMap<Integer, ParkingLot> parkingLots;
    private static int idCounter = 0;

    public ParkingLotRepository() {
        this.parkingLots = new HashMap<>();
    }

    public ParkingLot get(Integer parkingLotId){
        ParkingLot parkingLot = parkingLots.get(parkingLotId);
        if(parkingLot == null) {
            throw new ParkingLotNotFoundException("Parking Lot not found for ID: " + parkingLotId);
        }
        return parkingLot;
    }

    public void put(ParkingLot parkingLot){
        parkingLot.setId(++idCounter);
        parkingLots.put(parkingLot.getId(), parkingLot);
        System.out.println("ParkingLot has been added successfully");
    }
}
