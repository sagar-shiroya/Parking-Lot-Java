package models;

import models.enums.ParkingSpotStatus;
import models.enums.VehicleType;

public class LuxuryParkingSpot extends ParkingSpot{
    private String guard;

    public LuxuryParkingSpot() {
    }

    public LuxuryParkingSpot(int id, int number, VehicleType vehicleType, ParkingSpotStatus parkingSpotStatus, Vehicle vehicle, String guard) {
        super(number, vehicleType, parkingSpotStatus, vehicle);
        this.guard = guard;
    }

    public String getGuard() {
        return guard;
    }

    public void setGuard(String guard) {
        this.guard = guard;
    }
}
