package models;

import models.enums.ParkingSpotStatus;
import models.enums.VehicleType;

public class EVParkingSpot extends ParkingSpot{
    private String charger;

    public EVParkingSpot() {
    }

    public EVParkingSpot(int id, int number, VehicleType vehicleType, ParkingSpotStatus parkingSpotStatus, Vehicle vehicle, String charger) {
        super(number, vehicleType, parkingSpotStatus, vehicle);
        this.charger = charger;
    }

    public String getCharger() {
        return charger;
    }

    public void setCharger(String charger) {
        this.charger = charger;
    }
}
