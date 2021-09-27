package aritmetikk1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave4 {
    /*
    Lag et program som regner ut omkretsen til en sirkel Les først inn radiusen. 
    Regn så ut  omkretsen av sirkelen (2*3.14*radius) og skriver ut svaret på følgende måte: 
    ”Omkretsen av en sirkel med 20.0 cm som radius blir 125.60 cm.”
    Tips: Bruk String omkretsenMedToDesimaler = String.format("%.2f", omkretsen); for å få 2 desimaler.
    */
    
    public static void main(String[] args) {
        String innRadius = showInputDialog("Skriv inn radius på sirkelen: ");
        double radius;
        try {
            radius = Double.parseDouble(innRadius);
        }
        catch (Exception e) {
            radius = 0;
            showMessageDialog(null, "Du må skrive inn et gyldig tall");
        }
        double omkretsen = 2 * 3.14 * radius;
        String ut = "Omkretsen av en sirkel med " + radius +
                " cm som radius blir " + String.format("%.2f", omkretsen) +" cm.";
    }
}
