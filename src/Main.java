
import com.bridgelabz.Vessel;
import com.bridgelabz.VesselUtil;

public class Main {

    public static void main(String[] args) {

        // Create VesselUtil object
        VesselUtil vesselUtil = new VesselUtil();

        // Add vessel records
        vesselUtil.addVesselPerformance(
                new Vessel("V001", "Sea King", 25.5, "Cargo")
        );

        vesselUtil.addVesselPerformance(
                new Vessel("V002", "Ocean Star", 18.0, "Tanker")
        );

        vesselUtil.addVesselPerformance(
                new Vessel("V003", "Wave Rider", 22.3, "Cruise")
        );

        // Search for a vessel using its ID
        Vessel vessel = vesselUtil.getVesselById("V002");

        // Display vessel details if found
        if (vessel != null) {
            System.out.println(
                    vessel.getVesselId() + " | " +
                            vessel.getVesselName() + " | " +
                            vessel.getVesselType() + " | " +
                            vessel.getAverageSpeed() + " knots"
            );
        } else {
            System.out.println("Vessel Id V002 not found.");
        }
    }
}
