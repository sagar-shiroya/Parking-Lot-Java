package service;
/*
* Every time program runs, because of In-memory data gets removed. So this file will be creating
* some bare minimum initial data to work with.
* */

import models.*;
import models.enums.*;
import repository.GateRepository;
import repository.ParkingFloorRepository;
import repository.ParkingLotRepository;
import repository.ParkingSpotRepository;

import java.util.ArrayList;
import java.util.List;

public class InitializationService {

    private GateRepository gateRepository;
    private ParkingLotRepository parkingLotRepository;
    private ParkingFloorRepository parkingFloorRepository;
    private ParkingSpotRepository parkingSpotRepository;

    public InitializationService(GateRepository gateRepository, ParkingLotRepository parkingLotRepository, ParkingFloorRepository parkingFloorRepository, ParkingSpotRepository parkingSpotRepository) {
        this.gateRepository = gateRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.parkingFloorRepository = parkingFloorRepository;
        this.parkingSpotRepository = parkingSpotRepository;
    }

    public ParkingLot init(){
        System.out.println("==========START Initialization==========");

        // Creating Parking Lot Object
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setName("Phoenix Mall of the Millennium");
        parkingLot.setAddress("S No. 132, 23, Pune - Bangalore Highway, Shankar Kalat Nagar, Wakad, Pune, Pimpri-Chinchwad, Maharashtra 411057");
        parkingLot.setParkingLotStatus(ParkingLotStatus.OPEN);
        parkingLot.setCapacity(100);
        parkingLot.setVehicleTypesSupported(List.of(VehicleType.TWO_WHEELER, VehicleType.FOUR_WHEELER));
        List<ParkingFloor> floors = new ArrayList<>();

        // Creating 10 Parking Floor Object
        for(int i=1; i<=10; i++){
            ParkingFloor parkingFloor = new ParkingFloor();
            parkingFloor.setFloorNumber(i);
            parkingFloor.setParkingFloorStatus(ParkingFloorStatus.AVAILABLE);
            List<ParkingSpot> spots = new ArrayList<>();

            // Creating 10 Parking Spot per each Parking Floor object
            for(int j=1; j<=10; j++){
                ParkingSpot parkingSpot = new ParkingSpot();
                parkingSpot.setNumber(i*100 + j);
                parkingSpot.setParkingSpotStatus(ParkingSpotStatus.EMPTY);

                parkingSpot.setVehicleType(VehicleType.FOUR_WHEELER);
                spots.add(parkingSpot);
                parkingSpotRepository.put(parkingSpot);
            }
            parkingFloor.setParkingSpots(spots);

            // Creating Entry Gate for each floor
            Gate entryGate = new Gate();
            entryGate.setGateStatus(GateStatus.OPEN);
            entryGate.setGateType(GateType.ENTRY_GATE);
            entryGate.setGateNumber(i*100 + 1);
            entryGate.setAttendant("Attendant " + (i*100 + 1));

            // Creating Exit Gate for each floor
            Gate exitGate = new Gate();
            exitGate.setGateNumber(i*100 + 2);
            exitGate.setAttendant("Attendant " + (i*100+2));
            exitGate.setGateType(GateType.EXIT_GATE);
            exitGate.setGateStatus(GateStatus.OPEN);

            parkingFloor.setEntryGate(entryGate);
            parkingFloor.setExitGate(exitGate);

            // Saving entry & exit gate to its repository
            gateRepository.put(entryGate);
            gateRepository.put(exitGate);

            floors.add(parkingFloor); // adding the parking floor to floors arraylist
            parkingFloorRepository.put(parkingFloor); // saving parkingFloor to its repository
        }
        parkingLot.setParkingFloors(floors); // Set the arraylist of created floors to ParkingLot
        parkingLotRepository.put(parkingLot); // saving parkingLot to its repository

        System.out.println("==========END Initialization==========");
        return parkingLotRepository.get(1);
    }
}
