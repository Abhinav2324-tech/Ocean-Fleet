
package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class VesselUtil {

    // List to store vessel objects
    private List<Vessel> vesselList;

    // Constructor to initialize the vessel list
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

    // UC2: Add vessel performance details
    public void addVesselPerformance(Vessel vessel) {
        vesselList.add(vessel);
    }

    // UC3: Retrieve a vessel by its ID
    public Vessel getVesselById(String vesselId) {

        for (Vessel vessel : vesselList) {
            if (vessel.getVesselId().equals(vesselId)) {
                return vessel;
            }
        }

        return null;
    }

    // UC4: Retrieve vessels having the highest average speed
    public List<Vessel> getHighPerformanceVessels() {

        // Create a list to store high-performance vessels
        List<Vessel> highPerformanceVessels = new ArrayList<>();

        // Return an empty list if no vessels are available
        if (vesselList.isEmpty()) {
            return highPerformanceVessels;
        }

        // Find the highest average speed
        double maxSpeed = vesselList.get(0).getAverageSpeed();

        for (Vessel vessel : vesselList) {
            if (vessel.getAverageSpeed() > maxSpeed) {
                maxSpeed = vessel.getAverageSpeed();
            }
        }

        // Add all vessels having the highest speed
        for (Vessel vessel : vesselList) {
            if (vessel.getAverageSpeed() == maxSpeed) {
                highPerformanceVessels.add(vessel);
            }
        }

        // Return the list of high-performance vessels
        return highPerformanceVessels;
    }
}
