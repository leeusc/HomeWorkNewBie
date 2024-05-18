import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FCar {
    public static void main(String[] args){
        Map<String, Map<String, Integer>> priceperBrand = new HashMap<>();

        Map<String, Integer> lamborghinPrice = new HashMap<>();
        lamborghinPrice.put("bumper", 100000);
        lamborghinPrice.put("spion", 30000);
        lamborghinPrice.put("body", 200000);
        lamborghinPrice.put("machine", 300000);
        priceperBrand.put("lamborghini", lamborghinPrice);

        Map<String, Integer> toyotainPrice = new HashMap<>();
        toyotainPrice.put("bumper", 10000);
        toyotainPrice.put("spion", 5000);
        toyotainPrice.put("body", 50000);
        toyotainPrice.put("machine", 30000);
        priceperBrand.put("toyota", toyotainPrice);

        Map<String, Integer> astoninPrice = new HashMap<>();
        astoninPrice.put("bumper", 20000);
        astoninPrice.put("spion", 40000);
        astoninPrice.put("body", 100000);
        astoninPrice.put("machine", 200000);
        priceperBrand.put("aston martin", astoninPrice);

        Map<String, Integer> hummerinPrice = new HashMap<>();
        hummerinPrice.put("bumper", 30000);
        hummerinPrice.put("spion", 3000);
        hummerinPrice.put("body", 90000);
        hummerinPrice.put("machine", 150000);
        priceperBrand.put("hummer", hummerinPrice);

        Map<String, Integer> hondainPrice = new HashMap<>();
        hondainPrice.put("bumper", 40000);
        hondainPrice.put("spion", 1000);
        hondainPrice.put("body", 40000);
        hondainPrice.put("machine", 10000);
        priceperBrand.put("honda", hondainPrice);


        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Merek Mobil (Lamborghini/Toyota/Aston Martin/Hummer/Honda) : ");
        String brand = sc.nextLine().toLowerCase();

        if (priceperBrand.containsKey(brand)){
            System.out.println("Biaya pokok resparasi: Rp 10.000");
            System.out.println("Biaya per bagian: ");
            for(String part : priceperBrand.get(brand).keySet()){

                System.out.println(part + ": Rp "+ priceperBrand.get(brand).get(part));
            }
            System.out.println("Pilih bagian yang inggin diresparasi(pisahkan dengan koma, misal: Bumper,Spion: ");
            String input = sc.nextLine();
            String[] bagianRspr = input.split(",");

            int totalprice = 0;
            for(String part : bagianRspr){
                if (priceperBrand.get(brand).containsKey(part)){
                    totalprice += priceperBrand.get(brand).get(part);
                } else  {
                    System.out.println("Bagian "+ part + " tidak valid untuk merek "+ brand);
                    sc.nextLine();
                }
            }
            System.out.println("Total biaya resparasi: Rp "+ totalprice);
        }
        else{
            System.out.println("Merek "+ brand + " tidak valid.");
        }
    }

    }

