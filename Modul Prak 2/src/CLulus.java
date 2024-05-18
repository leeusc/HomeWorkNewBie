import javax.swing.*;

public class CLulus
{
    public static void main(String[] args){

        JOptionPane.showMessageDialog(null,"Check your Final Grade", "Graduation Check",JOptionPane.INFORMATION_MESSAGE);
        String answer = JOptionPane.showInputDialog("Enter your final grade (0-100)");
        double grade = Double.parseDouble(answer);

        ImageIcon Icon1 = new ImageIcon("");
        ImageIcon Icon2 = new ImageIcon("");
        ImageIcon Icon3 = new ImageIcon("");
        ImageIcon Icon4 = new ImageIcon("");
        ImageIcon Icon5 = new ImageIcon("");
        ImageIcon Icon6 = new ImageIcon("");


        if (grade >= 80 && grade <= 100) {
            JOptionPane.showMessageDialog(null,"Anda CLulus dengan Nilai Istimewa" ,"Final Grade", JOptionPane.INFORMATION_MESSAGE, Icon1);
        } else if (grade >= 60 && grade < 80) {
            JOptionPane.showMessageDialog(null,"Anda CLulus dengan Nilai Cukup" ,"Final Grade", JOptionPane.INFORMATION_MESSAGE, Icon2);
        } else if (grade >= 50 && grade < 60) {
            JOptionPane.showMessageDialog(null,"Anda CLulus dengan Nilai PAs-pasan" ,"Final Grade", JOptionPane.INFORMATION_MESSAGE, Icon3);
        } else if (grade >= 40 && grade < 50) {
            JOptionPane.showMessageDialog(null,"Sedikit Lagi Anda Lolos, Jangan Menyerah" ,"Final Grade", JOptionPane.INFORMATION_MESSAGE, Icon4);
        } else if (grade < 40) {
            JOptionPane.showMessageDialog(null,"Anda belum Beruntung, Coba Lagi Tahun Depan" ,"Final Grade", JOptionPane.INFORMATION_MESSAGE, Icon5);
        } else {
            JOptionPane.showMessageDialog(null,"Masukkan Angka yang valid" ,"Final Grade", JOptionPane.INFORMATION_MESSAGE, Icon6);
        }


    }
}
