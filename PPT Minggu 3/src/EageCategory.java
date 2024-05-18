import java.util.Scanner;

public class EageCategory {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Berapa usia anda? (type a number)");
        int age = sc.nextInt();

        String category;
        if (age >= 0 && age <= 5) {
            category = "Balita";
        }else if (age >= 6 && age <= 12) {
                category = "Anak";
            } else if (age >= 13 && age <= 18) {
                category = "Remaja";
            } else if (age >= 19 && age <= 25) {
                category = "Pemuda";
            } else if (age >= 26 && age <= 55) {
                category = "Dewasa";
            } else {
                category = "Tua";
            }
        
        System.out.println("Kategori Usia: " + category);
    }

    }

