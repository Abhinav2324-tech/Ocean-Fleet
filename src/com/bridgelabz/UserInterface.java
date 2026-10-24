
package com.bridgelabz;

import java.util.List;
import java.util.Scanner;

/*
 * Use Case 5: Integrate User Interaction
 *
 * This program accepts vessel performance details from the user,
 * stores the vessels using VesselUtil, retrieves a vessel by ID,
 * and displays all high-performance vessels.
 */

public class UserInterface {

    public static void main(String[] args) {

        // Create Scanner and VesselUtil objects
        Scanner scanner = new Scanner(System.in);
        VesselUtil vesselUtil = new VesselUtil();

        // Accept the number of vessels
        System.out.println("Enter the number of vessels to be added");
        int numberOfVessels = scanner.nextInt();
        scanner.nextLine();

        // Accept vessel details
        System.out.println("Enter vessel details");

        for (int i = 0; i < numberOfVessels; i++) {

            // Read colon-separated vessel details
            String vesselDetails = scanner.nextLine();
            String[] details = vesselDetails.split(":");

            // Extract vessel attributes
            String vesselId = details[0];
            String vesselName = details[1];
            double averageSpeed = Double.parseDouble(details[2]);
            String vesselType = details[3];

            // Create Vessel object
            Vessel vessel = new Vessel(
                    vesselId,
                    vesselName,
                    averageSpeed,
                    vesselType
            );

            // Add vessel to the list
            vesselUtil.addVesselPerformance(vessel);
        }

        // Accept vessel ID for searching
        System.out.println("Enter the Vessel Id to check speed");
        String searchId = scanner.nextLine();

        // Retrieve vessel by ID
        Vessel searchedVessel = vesselUtil.getVesselById(searchId);

        // Display vessel details if found
        if (searchedVessel != null) {
            System.out.println(
                    searchedVessel.getVesselId() + " | " +
                            searchedVessel.getVesselName() + " | " +
                            searchedVessel.getVesselType() + " | " +
                            searchedVessel.getAverageSpeed() + " knots"
            );
        } else {
            System.out.println("Vessel Id " + searchId + " not found.");
        }

        // Retrieve high-performance vessels
        List<Vessel> highPerformanceVessels =
                vesselUtil.getHighPerformanceVessels();

        // Display high-performance vessels
        System.out.println("High performance vessels are");

        for (Vessel vessel : highPerformanceVessels) {
            System.out.println(
                    vessel.getVesselId() + " | " +
                            vessel.getVesselName() + " | " +
                            vessel.getVesselType() + " | " +
                            vessel.getAverageSpeed() + " knots"
            );
        }

        scanner.close();
    }
}
