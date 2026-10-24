
package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

/*
 * Use Case 2: Store Vessel Records Using List
 *
 * This class stores multiple Vessel objects using Java Collections.
 * It maintains a list of vessels and provides a method to add
 * vessel performance records to the list.
 */

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

    // Method to add a vessel to the list
    public void addVesselPerformance(Vessel vessel) {
        vesselList.add(vessel);
    }
}
