package service.strategy.spotAllocationStrategy;

import models.ParkingSpot;
import models.Vehicle;

public interface SpotAllocationStrategy {
    public ParkingSpot allocateSpot(Vehicle vehicle);
}
