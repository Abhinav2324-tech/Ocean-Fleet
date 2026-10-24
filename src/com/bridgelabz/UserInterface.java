
package com.bridgelabz;

import java.util.List;
import java.util.Scanner;

/*
 * Use Case 6: Refactor Using OOPS Principles
 *
 * This program manages vessel performance records using
 * a modular structure. Vessel stores data, VesselUtil handles
 * vessel operations, and UserInterface manages console input
 * and output.
 */

public class UserInterface {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        VesselUtil vesselUtil = new VesselUtil();

        // Accept number of vessels
        System.out.println("Enter the number of vessels to be added");
        int numberOfVessels = scanner.nextInt();
        scanner.nextLine();

        // Accept and store vessel details
        System.out.println("Enter vessel details");

        for (int i = 0; i < numberOfVessels; i++) {

            String[] details = scanner.nextLine().split(":");

            String vesselId = details[0];
            String vesselName = details[1];
            double averageSpeed = Double.parseDouble(details[2]);
            String vesselType = details[3];

            // Create vessel object
            Vessel vessel = new Vessel(
                    vesselId,
                    vesselName,
                    averageSpeed,
                    vesselType
            );

            // Delegate storage to VesselUtil
            vesselUtil.addVesselPerformance(vessel);
        }

        // Search for vessel
        System.out.println("Enter the Vessel Id to check speed");
        String searchId = scanner.nextLine();

        Vessel searchedVessel = vesselUtil.getVesselById(searchId);

        if (searchedVessel != null) {
            displayVessel(searchedVessel);
        } else {
            System.out.println("Vessel Id " + searchId + " not found.");
        }

        // Retrieve high-performance vessels
        List<Vessel> highPerformanceVessels =
                vesselUtil.getHighPerformanceVessels();

        System.out.println("High performance vessels are");

        for (Vessel vessel : highPerformanceVessels) {
            displayVessel(vessel);
        }

        scanner.close();
    }

    // Display vessel details in the required format
    private static void displayVessel(Vessel vessel) {

        System.out.println(
                vessel.getVesselId() + " | " +
                        vessel.getVesselName() + " | " +
                        vessel.getVesselType() + " | " +
                        vessel.getAverageSpeed() + " knots"
        );
    }
}
