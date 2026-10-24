
package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class VesselUtil {

    // Store vessel records
    private List<Vessel> vesselList;

    // Initialize the vessel list
    public VesselUtil() {
        vesselList = new ArrayList<>();
    }

    // Getter for vessel list
    public List<Vessel> getVesselList() {
        return vesselList;
    }

    // Setter for vessel list
    public void setVesselList(List<Vessel> vesselList) {
        this.vesselList = vesselList;
    }

    // Add vessel performance details
    public void addVesselPerformance(Vessel vessel) {
        vesselList.add(vessel);
    }

    // Retrieve vessel by its ID
    public Vessel getVesselById(String vesselId) {

        for (Vessel vessel : vesselList) {
            if (vessel.getVesselId().equals(vesselId)) {
                return vessel;
            }
        }

        return null;
    }

    // Retrieve all vessels having the highest average speed
    public List<Vessel> getHighPerformanceVessels() {

        List<Vessel> highPerformanceVessels = new ArrayList<>();

        // Return empty list when no records exist
        if (vesselList.isEmpty()) {
            return highPerformanceVessels;
        }

        double maxSpeed = Double.NEGATIVE_INFINITY;

        // Find maximum speed and collect matching vessels
        for (Vessel vessel : vesselList) {

            double currentSpeed = vessel.getAverageSpeed();

            if (currentSpeed > maxSpeed) {

                maxSpeed = currentSpeed;
                highPerformanceVessels.clear();
                highPerformanceVessels.add(vessel);

            } else if (currentSpeed == maxSpeed) {

                highPerformanceVessels.add(vessel);
            }
        }

        return highPerformanceVessels;
    }
}
