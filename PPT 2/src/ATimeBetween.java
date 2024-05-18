import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ATimeBetween {
    public static void main(String[] args) throws ParseException {

        String startTime = "9:20:10";
        String endTime = "15:40:55";

        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        Date startDate = format.parse(startTime);
        Date endDate = format.parse(endTime);

        long difference = endDate.getTime() - startDate.getTime();

        long hours = difference / (60*60*1000);
        long minutes = (difference % (60 * 60 * 1000)) / (60 * 1000);
        long seconds = (difference % (60 * 1000)) / 1000;

        /*
        long hours = difference / (60*60*1000);
        long minutes = (difference % (60 * 60 * 1000)) / (60 * 1000);
        long seconds = (difference % (60 * 1000)) / 1000;
        */
        System.out.printf("Selisih waktu: %2d:%2d:%2d%n", hours, minutes, seconds);
    }


}