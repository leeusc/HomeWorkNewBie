import java.util.Scanner;

public class CParkingFee {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Jam datang (hh:mm): ");
        String arrival = sc.next();
        System.out.println("Jam keluar (hh:mm): ");
        String departure = sc.next();

        int ahour = Integer.parseInt(arrival.split(":")[0]);
        int aminute = Integer.parseInt(arrival.split(":")[1]);
        int dhour = Integer.parseInt(departure.split(":")[0]);
        int dminute = Integer.parseInt(departure.split(":")[1]);

        int totalMinutes = (dhour - ahour) * 60 + (dminute - aminute);

        int firsthourRate = 2000;
        int additionalHourRate = 1500;
        int maxDailyPayment = 15000;

        int totalPayment = firsthourRate + (Math.max(totalMinutes - 60, 0)/ 60) * additionalHourRate;
            totalPayment = Math.min(totalPayment,maxDailyPayment);

        System.out.println("Lama Parkir: " + totalMinutes + " menit");
        System.out.println("Biaya parkit: " + totalPayment + " rupiah");
    }
}
