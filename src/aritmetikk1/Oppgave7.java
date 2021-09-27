package aritmetikk1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave7 {
    /*
    Les inn verdier for antall pizza, antall personer og antallSlicesPerPizza. 
    Regn så ut hvor mange pizza-slices hver person får dersom man deler likt gitt at en pizza har f.eks 6 slices hver. 
    Hvor mange slices er det til overs dersom man deler likt? Bruk modulus operatoren. 
    Skriv ut resultatet på følgende form: 
    ”Dersom man er 4 personer og har 3 pizzaer med 6 slices pr pizza får hver person 4 slices og 2 blir til overs”.
    */
    public static void main(String[] args) {
        String innAntallPizza = showInputDialog("Skriv inn antall pizza");
        String innAntallSlices = showInputDialog("Skriv inn antall slices per pizza");
        String innAntallPersoner = showInputDialog("Skriv inn antall personer");
        int antallPizza, antallSlices, antallPersoner;
        try {
            antallPizza = Integer.parseInt(innAntallPizza);
            antallSlices = Integer.parseInt(innAntallSlices);
            antallPersoner = Integer.parseInt(innAntallPersoner);
        } catch (Exception e) {
            antallPizza = 0;
            antallSlices = 0;
            antallPersoner = 0;
            showMessageDialog(null, "Du må skrive inn et gyldig tall");
        }
        int totalAntallSlices = antallSlices * antallPizza;
        int antallSlicesPerPers = totalAntallSlices / antallPersoner;
        int slicesTilOvers = totalAntallSlices % antallPersoner;
        String ut = "Dersom man er " + antallPersoner + " personer og har " + antallPizza + " pizzaer med " + antallSlices +
                " slices pr pizza får hver person " + antallSlicesPerPers + " slices og " + slicesTilOvers + " blir til overs.";
        showMessageDialog(null, ut);
    }
}
