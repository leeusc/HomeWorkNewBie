import java.text.DecimalFormat;

public class DHardDisk {
    public static void main(String[] args){
        double diameter = 14.0;

        double radius = diameter/2.0;

        int rpm = 3600;

        double speedM = 2* Math.PI * radius * rpm / 60.00;
    double speedH = speedM / 63360.0; // 1 mile = 63360 inches


        DecimalFormat df = new DecimalFormat("#.###");
        String round = df.format(speedH);
        System.out.println("Sisi luar adalah: "+ round + " miles/hour");
    }
}
