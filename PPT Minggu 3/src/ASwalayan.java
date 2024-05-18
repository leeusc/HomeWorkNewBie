import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ASwalayan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan total belanja dalam rupiah: ");
        double total = sc.nextDouble();

        double discount = 0.0;
        if (total> 100_00){
            discount = total * 0.1;

            double pay = total - discount;
            System.out.println("Diskon Rp." + discount);
            System.out.println("Jumlah Bayar Rp."+ pay);

        }
    }
}