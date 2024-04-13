package models;

import models.enums.ParkingFloorStatus;

import java.util.List;

public class ParkingFloor {
    private int id;
    private List<ParkingSpot> parkingSpots;
    private int floorNumber;
    private Gate entryGate;
    private Gate exitGate;
    private ParkingFloorStatus parkingFloorStatus;

    public ParkingFloor() {
    }

    public ParkingFloor(int id, List<ParkingSpot> parkingSpots, int floorNumber, Gate entryGate, Gate exitGate, ParkingFloorStatus parkingFloorStatus) {
        this.id = id;
        this.parkingSpots = parkingSpots;
        this.floorNumber = floorNumber;
        this.exitGate = exitGate;
        this.entryGate = entryGate;
        this.parkingFloorStatus = parkingFloorStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public Gate getEntryGate() {
        return entryGate;
    }

    public void setEntryGate(Gate entryGate) {
        this.entryGate = entryGate;
    }

    public Gate getExitGate() {
        return exitGate;
    }

    public void setExitGate(Gate exitGate) {
        this.exitGate = exitGate;
    }

    public ParkingFloorStatus getParkingFloorStatus() {
        return parkingFloorStatus;
    }

    public void setParkingFloorStatus(ParkingFloorStatus parkingFloorStatus) {
        this.parkingFloorStatus = parkingFloorStatus;
    }
}
