package repository;

import exception.ParkingLotNotFoundException;
import models.ParkingFloor;

import java.util.HashMap;

public class ParkingFloorRepository {
    private HashMap<Integer, ParkingFloor> parkingFloorMap;

    public ParkingFloorRepository(){
        this.parkingFloorMap = new HashMap<>();
    }

    public ParkingFloor get(Integer parkingFloorId){
        ParkingFloor parkingFloor = parkingFloorMap.get(parkingFloorId);
        if(parkingFloor == null) {
            throw new ParkingLotNotFoundException("ParkingFloor not found for ID: " + parkingFloorId);
        }
        return parkingFloor;
    }

    public void put(ParkingFloor parkingFloor){
        parkingFloorMap.put(parkingFloor.getId(), parkingFloor);
        System.out.println("ParkingFloor has been added successfully");
    }
}
