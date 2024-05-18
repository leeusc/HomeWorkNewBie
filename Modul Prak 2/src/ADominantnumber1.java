import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ADominantnumber1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int even = 0;
        int odd = 0;
        int num;

        for (int i = 1; i <= 3; i++) {
            System.out.println("Masukkan angka " + i + ": ");
            num = sc.nextInt();
            //simplified the code

            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        if (even > odd) {
            System.out.println("Hasil Dominan Angka Genap");
        } else {
            System.out.println("Hasil Dominan Angka Ganjil");
        }


    }
}