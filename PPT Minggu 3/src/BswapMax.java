import java.util.Scanner;

public class BswapMax {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  3 Random Number: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if(a > b){
            double temp = a;
            a = b;
            b = temp;
        }
        if(b > c){
            double temp = b;
            b = c;
            c = temp;
        }
        if(a > b){
            double temp = a;
            a = b;
            b = temp;
        }

        System.out.println("Kecil-Besar " + a +" ,"+b+" ,"+c+" ," );


    }
}
