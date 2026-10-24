
import com.bridgelabz.Vessel;
import com.bridgelabz.VesselUtil;
import java.util.List;

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
                new Vessel("V003", "Wave Rider", 25.5, "Cruise")
        );

        vesselUtil.addVesselPerformance(
                new Vessel("V004", "Blue Pearl", 22.3, "Cargo")
        );

        // Retrieve high-performance vessels
        List<Vessel> highPerformanceVessels =
                vesselUtil.getHighPerformanceVessels();

        // Display the high-performance vessels
        System.out.println("High performance vessels are");

        for (Vessel vessel : highPerformanceVessels) {
            System.out.println(
                    vessel.getVesselId() + " | " +
                            vessel.getVesselName() + " | " +
                            vessel.getVesselType() + " | " +
                            vessel.getAverageSpeed() + " knots"
            );
        }
    }
}
