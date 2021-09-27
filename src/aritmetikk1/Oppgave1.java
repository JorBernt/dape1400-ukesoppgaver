package aritmetikk1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave1 {
    /*
    Les inn to variabler; navn, alder. Skriv så følgende historie (et eksempel): 
    Per Olsen er i dag 32 år. Han er født i 1986. I 2053 er han 67 år og da vil han være pensjonist.
    */
    public static void main(String[] args) {
        String navn = showInputDialog("Skriv inn et navn: ");
        String innAlder = showInputDialog("Skriv inn en alder: ");
        int alder;
        try {
            alder = Integer.parseInt(innAlder);
        } catch (Exception e) {
            alder = 0;
            showMessageDialog(null, "Det ble ikke skrevet inn en gyldig alder");
        }
        int fødselsår = 2021 - alder;
        int pensonsår = 2021 + (67 - alder);
        String ut = navn + " er i dag " + alder + " år. Han er født i " + fødselsår + ". " +
                "I " + pensonsår + " er han 67 år og da vil han være pensjonist";
        showMessageDialog(null, ut);
    }
}
