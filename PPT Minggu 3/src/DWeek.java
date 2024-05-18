import java.util.Scanner;

public class DWeek {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Menghitung durasi hari");
        System.out.println("-----------------------------");
        System.out.println();

        System.out.println(" 1 = Minggu \n 2 = Senin\n 3 = Selasa\n 4 = Rabu\n 5 = Kamis\n 6 = Jumat\n 7 = Sabtu");;

        System.out.println("Enter day 1#(nomor): ");
        int day1 = sc.nextInt();
        System.out.println("Enter day 2#(nomor): ");
        int day2 = sc.nextInt();

        int duration = Math.abs(day2 - day1 + 7)% 7;
        if (duration == 0){
            duration = 7;

        }

        System.out.println("Durasi antara " + day1 + " dan " + day2 + " adalah " +duration);

    }
}
