public class BSwapVariable {
    public static void main(String[] args){

        int x = 150;
        int y = 232;
        int temp;

        temp = x;
        x = y;
        y = temp;

        System.out.println("x: "+x); //x becomes 232
        System.out.println("y: "+y); //y becomes 150

    }
}
