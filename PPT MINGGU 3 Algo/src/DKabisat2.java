import java.util.HashMap;
import java.util.Scanner;

public class DKabisat2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a year (4 digits): ");
        int year = sc.nextInt();
        System.out.println("Enter a month (1-12): ");
        int month = sc.nextInt();

        int days = calcday(year, month);
        System.out.println("Days in month " + month + " year " + year + " is " + days + " day");
    }

        public static int calcday( int year, int month){
            HashMap<Integer, Integer>daysinMonth = new HashMap<>();
            daysinMonth.put(1,31);
            daysinMonth.put(2, isLeapYear(year) ? 29:28);
            daysinMonth.put(3,31);
            daysinMonth.put(4,30);
            daysinMonth.put(5,31);
            daysinMonth.put(6,30);
            daysinMonth.put(7,31);
            daysinMonth.put(8,31);
            daysinMonth.put(9,30);
            daysinMonth.put(10,31);
            daysinMonth.put(11,30);
            daysinMonth.put(12,31);

                return  daysinMonth.getOrDefault(month,0);

        }

        public static boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0 || (year % 400 == 0));
        }
}
