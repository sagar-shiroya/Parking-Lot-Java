package models;

import models.enums.GateStatus;
import models.enums.GateType;

public class Gate extends BaseModel{
    private GateType gateType;
    private int gateNumber;
    private String attendant;
    private GateStatus gateStatus;

    public Gate() {
    }

    public Gate(GateType gateType, int gateNumber, String attendant, GateStatus gateStatus) {
        this.gateType = gateType;
        this.gateNumber = gateNumber;
        this.attendant = attendant;
        this.gateStatus = gateStatus;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public int getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(int gateNumber) {
        this.gateNumber = gateNumber;
    }

    public String getAttendant() {
        return attendant;
    }

    public void setAttendant(String attendant) {
        this.attendant = attendant;
    }

    public GateStatus getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(GateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }
}
