package aritmetikk1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave6 {
    /*
    Lag et program som leser inn et beløp i amerikanske dollar (USD) og 
    regner om og skriver ut tilsvarende beløp i norske kroner.
    Benytt dagens valutakurs fra nettet.
    */

    public static void main(String[] args) {
        String innUSD = showInputDialog("Skriv inn radius på sirkelen: ");
        double USD;
        try {
            USD = Double.parseDouble(innUSD);
        } catch (Exception e) {
            USD = 0;
            showMessageDialog(null, "Du må skrive inn et gyldig tall");
        }
        double kurs = 17.21;
        double NOK = USD * kurs;
        String ut = USD + " USD er " + NOK + " NOK";
    }
}
