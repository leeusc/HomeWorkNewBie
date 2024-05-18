import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Akabisat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input year; ");
        int year = scanner.nextInt();

        if((year % 400 == 0) || ((year % 4 == 0) && (year % 100!= 0))){
            System.out.println(year + " is Leap Year");
        } else{
            System.out.println(year + " is not Leap Year");
        }
    }
}