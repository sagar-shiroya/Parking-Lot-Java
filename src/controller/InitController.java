package controller;

import models.ParkingLot;
import service.InitializationService;

public class InitController {
    private InitializationService initializationService;

    public InitController(InitializationService initializationService) {
        this.initializationService = initializationService;
    }

    public ParkingLot init(){
        return initializationService.init();
    }
}
