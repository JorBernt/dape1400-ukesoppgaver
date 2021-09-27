package aritmetikk1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave11 {
    /*
    Les inn et tall mellom 0 og 1000 og skriv ut summen av sifrene i tallet (tverrsummen). 
    F.eks inndata 751 skal gi utdata 7 + 5 + 1 = 13. Tips: 751 % 10 = 1 og 751 / 10 = 75.
    */
    public static void main(String[] args) {
        String innTall = showInputDialog("Skriv inn et tall mellom 0 og 1000");
        int tall = Integer.parseInt(innTall);
        if (tall < 0 || tall >= 1000) {
            showMessageDialog(null, "Du må skrive inn et tall mellom 0 og 1000");
        } else {
            int tall3 = tall % 10;
            tall /= 10;
            int tall2 = tall % 10;
            tall /= 10;
            int tall1 = tall % 10;
            int tverrsum = tall1 + tall2 + tall3;
            showMessageDialog(null, "Tverrsummen av " + tall + " er " + tverrsum);
        }
    }
}
