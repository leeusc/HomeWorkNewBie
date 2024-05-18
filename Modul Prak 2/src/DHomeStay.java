import java.util.Scanner;

public class DHomeStay {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose your suit room (Deluxe/Executive/Suite): ");
        String room = sc.nextLine();

        System.out.println("How long do you stay over? /day");
        int day = sc.nextInt();

        System.out.println("Set your range price /day");
        int price = sc.nextInt();


        double tax = 0.0;
        switch(room.toLowerCase()) {
            case "deluxe":
                tax = 0.05;
                //for(price<= 1000 && price>=2000)
                break;
            case "executive":
                tax = 0.10;
                break;
            case "suite":
                tax = 0.15;
                break;
            default:
                System.out.println("Room type is unavailable");
                System.exit(1);
        }
        double total = (day * price) + (day*price*tax);

                System.out.println("Final price: $" + total);

        }


    }



