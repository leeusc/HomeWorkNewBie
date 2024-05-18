import java.util.Scanner;

public class HFantasy {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Master of HFantasy!");
        System.out.println("Choose your Character (C)leric, (W)arrior, (R)anger: ");
        char role = sc.next().charAt(0);

        System.out.println("Choose Level Game (B)eginner, (I)ntermediate, (E)xpert");
        char level = sc.next().charAt(0);

        double Wpercentage, Apercentage, Npercentage;
        switch(role){
            case 'W' :
                Wpercentage = 0.5;
                Apercentage = 0.3;
                Npercentage = 0.2;
                break;
            case 'C' :
                Npercentage = 0.5;
                Wpercentage = 0.3;
                Apercentage = 0.2;
                break;
            case 'R' :
                Apercentage = 0.5;
                Wpercentage = 0.3;
                Npercentage = 0.2;
                break;
            default:
                System.out.println("Invalid choice");
            return;
        }

        int masteryNeeded;
        switch(level){
            case 'B':
                masteryNeeded = 1000;
                break;
            case 'I':
                masteryNeeded = 1400;
                break;
            case 'E':
                masteryNeeded = 1500;
                break;
            default:
                System.out.println("Invalid Choice");
                return;
        }

        int Wmastery = (int) (masteryNeeded * Wpercentage);
        int Amastery = (int) (masteryNeeded * Apercentage);
        int Nmastery = (int) (masteryNeeded * Npercentage);

        System.out.println("\nYou choose: "+ role );
        System.out.println("Level skill: "+ level);
        System.out.println("Mastery needed for achieve this level: ");
        System.out.println("- Fighting skill: "+ Wmastery);
        System.out.println("- Archery Skill: "+ Amastery);
        System.out.println("- Nursery Skill: "+ Nmastery);


    }
}
