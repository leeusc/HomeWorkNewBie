import java.util.Scanner;

public class BCalculator {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.println("Simple BCalculator +-*/");
        System.out.println("Enter the first number: ");
         double number1 = sc.nextDouble();

        System.out.println("Choose an operation (+, -, *, /): ");
         char operation = sc.next().charAt(0);

        System.out.println("Enter the second number: ");
        double number2 = sc.nextDouble();


        double result = 0.0;

        switch (operation){
            case '+':
            result = number1 + number2;
            break;
            case '-':
            result = number1 - number2;
            break;
            case '*':
            result = number1 * number2;
            break;
            case '/':
            if(number2 != 0){
               result = number1/number2;
            }
            else{
                System.out.println("Error!");
                System.exit(1);
            }
            break;
            default:
                System.out.println("Error!");
                System.exit(1);
        }
        //System.out.printf("Result: %.2f %c %.2f\n", number1, operation, number2,result);
        System.out.println("Hasil: "+result);
    }
}
