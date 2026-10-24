
package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class VesselUtil {

    // List to store vessel objects
    private List<Vessel> vesselList;

    // Constructor to initialize the list
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

    // UC3: Search and return a vessel by its ID
    public Vessel getVesselById(String vesselId) {

        // Traverse all vessels in the list
        for (Vessel vessel : vesselList) {

            // Compare vessel IDs (case-sensitive)
            if (vessel.getVesselId().equals(vesselId)) {
                return vessel;
            }
        }

        // Return null if no matching vessel is found
        return null;
    }
}
