import java.util.Scanner;

public class CBodyWeight {
    public static void main(String[] args) {
        // Heightcm / 100
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan tinggi badan anda(cm) : ");
        double Heightcm = sc.nextDouble();

        double Heightmeter = Heightcm / 100; //cm to meter to match the weight in kilograms

        double idealweight = Heightmeter * 100 - 100;
        idealweight -= 0.1 *idealweight ;

        System.out.printf("Berat Badan Ideal Anda adalah: %.2f kg%n", idealweight);

    }
}
