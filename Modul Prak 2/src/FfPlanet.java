import javax.swing.*;
import java.util.HashMap;

public class FfPlanet {
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null,
        "Mercury - Venus   (108 million kilometers)\n" +
                "Venus - Earth   (162 million kilometers)\n" +
                "Earth-Mars    (225 million kilometers)",
                "FfPlanet",
                JOptionPane.INFORMATION_MESSAGE);

        HashMap<String, Double> planetDistances = new HashMap<>();
        planetDistances.put("mercury-venus", 108_000_000.0);
        planetDistances.put("venus-earth", 162_000_000.0);
        planetDistances.put("earth-mars", 225_000_000.0);

        String planet1 = JOptionPane.showInputDialog("Enter planet #1").toLowerCase();
        String planet2 = JOptionPane.showInputDialog("Enter planet #2").toLowerCase();

        String key = (planet1 + "-" + planet2).toLowerCase();
        double distance = planetDistances.getOrDefault(key, -1.0);

        if(distance == -1.0){
            JOptionPane.showMessageDialog(null, "Invalid FfPlanet Names");
        }
        else{
            JOptionPane.showMessageDialog(null, "Total Distance " + planet1 + " and " + planet2 + " = "+ distance + " km");
        }




    }
}
