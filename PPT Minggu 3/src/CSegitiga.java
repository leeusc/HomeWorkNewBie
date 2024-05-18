import java.util.Scanner;

public class CSegitiga {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Cek CSegitiga");
        System.out.println("------------------------------------");

        System.out.println("Enter side length #1: ");
        double a = sc.nextDouble();
        System.out.println("Enter side length #2: ");
        double b = sc.nextDouble();
        System.out.println("Enter side length #3: ");
        double c = sc.nextDouble();

        if(isTriangle(a,b,c)){
            System.out.println("Dapat membentuk segitiga");
        } else {
            System.out.println("Tidak dapat membentuk segitiga");
        }
    }

    public static boolean isTriangle(double a, double  b, double c){
        return a + b > c && a + c > b && b + c > a;
    }
}
