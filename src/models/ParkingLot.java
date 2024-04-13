package models;

import models.enums.ParkingLotStatus;
import models.enums.VehicleType;
import service.strategy.billCalculationStrategy.BillCalculationStrategy;
import service.strategy.spotAllocationStrategy.SpotAllocationStrategy;

import java.util.List;

public class ParkingLot extends BaseModel{
    private String address;
    private String name;
    private int capacity;
    private List<ParkingFloor> parkingFloors;
    private List<VehicleType> vehicleTypesSupported;
    private ParkingLotStatus parkingLotStatus;
    private SpotAllocationStrategy spotAllocationStrategy;
    private BillCalculationStrategy billCalculationStrategy;

    public ParkingLot() {
    }

    public ParkingLot(String address, String name, int capacity, List<ParkingFloor> parkingFloors, List<VehicleType> vehicleTypesSupported, ParkingLotStatus parkingLotStatus, SpotAllocationStrategy spotAllocationStrategy, BillCalculationStrategy billCalculationStrategy) {
        this.address = address;
        this.name = name;
        this.capacity = capacity;
        this.parkingFloors = parkingFloors;
        this.vehicleTypesSupported = vehicleTypesSupported;
        this.parkingLotStatus = parkingLotStatus;
        this.spotAllocationStrategy = spotAllocationStrategy;
        this.billCalculationStrategy = billCalculationStrategy;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public List<VehicleType> getVehicleTypesSupported() {
        return vehicleTypesSupported;
    }

    public void setVehicleTypesSupported(List<VehicleType> vehicleTypesSupported) {
        this.vehicleTypesSupported = vehicleTypesSupported;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public SpotAllocationStrategy getSpotAllocationStrategy() {
        return spotAllocationStrategy;
    }

    public void setSpotAllocationStrategy(SpotAllocationStrategy spotAllocationStrategy) {
        this.spotAllocationStrategy = spotAllocationStrategy;
    }

    public BillCalculationStrategy getBillCalculationStrategy() {
        return billCalculationStrategy;
    }

    public void setBillCalculationStrategy(BillCalculationStrategy billCalculationStrategy) {
        this.billCalculationStrategy = billCalculationStrategy;
    }
}
