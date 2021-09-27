package aritmetikk1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave3 {
    /*
    Lag et program som regner ut arealet av et rektangel. 
    Programmet skal lese inn lengden og bredden på rektangelet.  
    Regn så ut arealet og skriver ut svaret på følgende måte:
    ”Et rektangel med bredde 20 cm og lengde 40 cm har et areal på 800 cm”.
    */
    public static void main(String[] args) {
        String innLengde = showInputDialog("Skriv inn lengde: ");
        String innBredde = showInputDialog("Skriv inn bredde: ");
        int lengde;
        int bredde;
        try {
            lengde = Integer.parseInt(innLengde);
            bredde = Integer.parseInt(innBredde);
        } catch (Exception e) {
            lengde = 0;
            bredde = 0;
            showMessageDialog(null, "Du må skrive inn gyldige tall");
        }
        int areal = bredde * lengde;
        String ut = "Et rektangel med bredde " + bredde + " cm og lengde " + lengde + " har et areal" +
                " på " + areal + " cm.";
        showMessageDialog(null, ut);
    }
}
