package models;

import models.enums.VehicleType;

public class Vehicle extends BaseModel{
    private String vehicleNumber;
    private VehicleType type;
    private String color;

    public Vehicle() {
    }

    public Vehicle(String vehicleNumber, VehicleType type, String color) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.color = color;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
