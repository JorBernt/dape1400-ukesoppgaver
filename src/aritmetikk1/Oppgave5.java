package aritmetikk1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave5 {
    /*
    Lag et program som regner om fra fahrenheit til celsius. Les inn verdien for fahrenheit 
    og regn ut tilsvarende celsius med følgende formel: C = (F-32)/1.8. 
    Skriv så ut resultatet i Celsius.
    */
    public static void main(String[] args) {
        String innFahrenheit = showInputDialog("Skriv inn radius på sirkelen: ");
        double fahrenheit;
        try {
            fahrenheit = Double.parseDouble(innFahrenheit);
        } catch (Exception e) {
            fahrenheit = 0;
            showMessageDialog(null, "Du må skrive inn et gyldig tall");
        }
        double celsius = (fahrenheit - 32) / 1.8;
        String ut = fahrenheit + " fahrenheit er " + celsius + " grader celsius.";
        showMessageDialog(null, ut);
    }
}
