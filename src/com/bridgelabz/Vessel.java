package com.bridgelabz;




/*
 * Use Case 1: Create Vessel Model
 *
 * This class represents a vessel and stores its performance details.
 * It demonstrates encapsulation using private attributes, constructors,
 * and getter and setter methods.
 */

public class Vessel {

    // Vessel attributes
    private String vesselId;
    private String vesselName;
    private double averageSpeed;
    private String vesselType;

    // No-argument constructor
    public Vessel() {
    }

    // Parameterized constructor
    public Vessel(String vesselId, String vesselName,
                  double averageSpeed, String vesselType) {
        this.vesselId = vesselId;
        this.vesselName = vesselName;
        this.averageSpeed = averageSpeed;
        this.vesselType = vesselType;
    }

    // Getter and setter for vessel ID
    public String getVesselId() {
        return vesselId;
    }

    public void setVesselId(String vesselId) {
        this.vesselId = vesselId;
    }

    // Getter and setter for vessel name
    public String getVesselName() {
        return vesselName;
    }

    public void setVesselName(String vesselName) {
        this.vesselName = vesselName;
    }

    // Getter and setter for average speed
    public double getAverageSpeed() {
        return averageSpeed;
    }

    public void setAverageSpeed(double averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    // Getter and setter for vessel type
    public String getVesselType() {
        return vesselType;
    }

    public void setVesselType(String vesselType) {
        this.vesselType = vesselType;
    }
}
