import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FnewPlanet {
        private static final Map<String, Integer> distances = new HashMap<>();
        static { distances.put("Mercury", 0);
                 distances.put("Venus", 108);
                 distances.put("Earth", 270);
                 distances.put("Mars", 495);
        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.println("FfPlanet #1: ");
            String  planet1 = sc.nextLine();
            System.out.println("FfPlanet #2: ");
            String planet2 = sc.nextLine();

            int distance = calculateDistance(planet1,planet2);
            System.out.println("Total = " + distance + " million km");

        }
        private static int calculateDistance(String planet1, String planet2) {
        int distance1 = distances.getOrDefault(planet1,0);
        int distance2 = distances.getOrDefault(planet2,0);

        return Math.abs(distance2 - distance1);
        }
    }
