import java.util.Scanner;

public class GCOC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter bet trophy points: ");
        int trophy = sc.nextInt();

        System.out.println("Enter destruction percentage: (0-100)");
        int dcpercentage = sc.nextInt();


        boolean townHalldc;
        if (dcpercentage == 100) {
            townHalldc = true;
        } else {
            System.out.println("is TownHall destroyed? (y/n)");
            townHalldc = sc.next().equalsIgnoreCase("y");
        }


        int starts = calculateStars(dcpercentage, townHalldc);
        int trophyChange = calculateTrophyChange(trophy, starts);
        String status = (starts > 0) ? "Victory" : "Defeat";

        System.out.println("Hasil Serangan");
        System.out.println("Status: " + status);
        System.out.println("Jumlah Bintang: " + starts);
        System.out.println("Perubahan Trophy: " + trophyChange);
    }

    public static int calculateStars(int dcpercentage, boolean townHalldc) {
        if (dcpercentage == 100 && townHalldc) {
            return 3;
        } else if (dcpercentage < 40 && !townHalldc) {
            return 0;
        } else if (dcpercentage >= 40 && dcpercentage < 50 && !townHalldc) {
            return 1;
        } else if (dcpercentage >= 50 && !townHalldc) {
            return 2;
        } else if (townHalldc) {
            return 1;
        } else {
            return 0;
        }

}
    public static int calculateTrophyChange(int trophy, int stars) {
        if (stars > 0) {
            return trophy;
        } else {
            return -trophy / 3;
        }
    }
}


