import java.util.Scanner;

public class ERuneMidgard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose your character (K)night or (W)indWalker: ");
        char character = sc.next().toUpperCase().charAt(0);

        //System.out.println("Excalibur: 75.000(K), 70.000(W)\nBow of light: 90.000(K), 100.000(W)");

        int EXprice, BOLprice;
        if (character == 'K') {
            EXprice = 75000;
            BOLprice = 90000;
        } else if (character == 'W') {
            EXprice = 70000;
            BOLprice = 100000;
        } else {
            System.out.println("Invalid character choice, Exiting...");

        return;
    }

        System.out.println("Excalibur price: "+ EXprice);
        System.out.println("Bow of Light price: "+ BOLprice);
        System.out.println();

        System.out.println("Enter the quantity of Excalibur: ");
        int EXquantity = sc.nextInt();
        System.out.println("Enter the quantity of Bow of Light: ");
        int BOlquantity = sc.nextInt();

        //int totalprice = (EXprice * EXquantity) + (BOLprice * BOlquantity);

        int Extotal = EXprice * EXquantity;
        int BOltotal = BOLprice* BOlquantity;

        int bonus = 0;
        int discount = 0;
        if(character =='K'){
            bonus = EXquantity / 3;
        } else {
            discount = (int)(0.05 *BOLprice *BOlquantity);
            discount = Math.min(discount, 250000);
        }

        int totalPrice = Extotal + BOltotal - discount;

        System.out.println("Excalibur total price: " + Extotal);
        System.out.println("Bow of Light total price: "+ BOltotal);
        System.out.println("Bonus: "+ bonus + " bonus/bonuses for Excalibur");
        System.out.println("Discount: "+ discount);
        System.out.println("Combined total price: "+ totalPrice);

        sc.close();
    }
}