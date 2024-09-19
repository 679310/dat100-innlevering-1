package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O1 {

    public static void main(String[] args) {

        int stud = 0;

        while (stud < 10) {
            String karakTxt = showInputDialog("Poeng sum: ");
            int karak = parseInt(karakTxt);
            System.out.println(stud);

            if ((karak >= 90) && (karak <= 100)) {
                showMessageDialog(null, "Du har fått A!");
                stud++;

            } else if ((karak <= 89) && (karak >= 80)) {
                showMessageDialog(null, "Du har fått B!");
                stud++;

            } else if ((karak <= 79) && (karak >= 60)) {
                showMessageDialog(null, "Du har fått C!");
                stud++;

            } else if ((karak <= 59) && (karak >= 50)) {
                showMessageDialog(null, "Du har fått D!");
                stud++;

            } else if ((karak <= 49) && (karak >= 40)) {
                showMessageDialog(null, "Du har fått E!");
                stud++;

            } else if ((karak <= 39) && (karak >= 0)) {
                showMessageDialog(null, "Du har fått F!");
                stud++;

            } else {
                showMessageDialog(null, "Ugyldig tal! Prøv på nytt!");
            }
        }
    }

}