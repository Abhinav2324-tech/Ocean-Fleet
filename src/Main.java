
import com.bridgelabz.Vessel;
import com.bridgelabz.VesselUtil;

public class Main {

    public static void main(String[] args) {

        // Create VesselUtil object
        VesselUtil vesselUtil = new VesselUtil();

        // Create vessel objects
        Vessel vessel1 = new Vessel("V001", "Sea King", 25.5, "Cargo");
        Vessel vessel2 = new Vessel("V002", "Ocean Star", 18.0, "Tanker");
        Vessel vessel3 = new Vessel("V003", "Wave Rider", 22.3, "Cruise");

        // Add vessels to the list
        vesselUtil.addVesselPerformance(vessel1);
        vesselUtil.addVesselPerformance(vessel2);
        vesselUtil.addVesselPerformance(vessel3);

        // Display all stored vessels
        for (Vessel vessel : vesselUtil.getVesselList()) {
            System.out.println(
                    vessel.getVesselId() + " | " +
                            vessel.getVesselName() + " | " +
                            vessel.getVesselType() + " | " +
                            vessel.getAverageSpeed() + " knots"
            );
        }
    }
}
