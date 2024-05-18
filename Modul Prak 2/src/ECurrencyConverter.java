import java.util.Scanner;

public class ECurrencyConverter {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Nilai Rupiah: ");
        double rupiah = sc.nextDouble();

        System.out.println("Masukkan mata uang konversi (SGD/USD/RMB/Euro): ");
        String currency = sc.next();

        double exchangerate;
        switch (currency.toLowerCase()) {
            case "sgd":
                exchangerate = 9800.0;
                break;
            case "usd":
                exchangerate = 13000.0;
                break;
            case "rmb":
                exchangerate = 2000.0;
                break;
            case "euro":
                exchangerate = 15800.0;
                break;
            default:
                System.out.println("Mata uang tidak valid");
                return;
        }
        double convertedAmount = rupiah/exchangerate;
        System.out.printf("%.2f Rupiah = %.2f %s%n", rupiah, convertedAmount, currency.toUpperCase());



        }
    }

