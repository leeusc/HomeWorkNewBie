import java.util.Scanner;

public class BquizAlgo {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double[] quizScores = new double[5];

        for(int i = 0; i < 5; i++){
            System.out.println("Enter quiz score " + (i + 1) + ": ");
            quizScores[i] = sc.nextDouble();
        }

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4 - 1; j++){
                if(quizScores[j] < quizScores[j+1]){
                    double temp = quizScores[j];
                    quizScores[j] = quizScores[j+1];
                    quizScores[j+1] = temp;
                }
            }
        }
        double totalBestScores = 0;
        for(int i = 0; i < 4; i++){
            totalBestScores += quizScores[i];
        }
        double NA = totalBestScores / 4;


        char INA;
    if(NA >= 80){
        INA = 'A';
    } else if (NA >= 70){
        INA = 'B';
    } else if (NA >= 60){
        INA = 'C';
    } else if (NA >= 50){
        INA = 'D';
    }else {
        INA = 'E';
    }

        System.out.println("Nilai Akhir (NA): "+NA);
        System.out.println("Indeks Nilai Akademik (INA): "+INA);
}







}
