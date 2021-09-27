package introKlasserObjekter1.oppgave2;


//Utvid oppgave 1 til å lese inn de nødvendige dataene fra input-bokser og skrive resultatet ut i en meldingsboks.

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

class Bøker {
    String tittel, forfatter, ISBN;
    double pris;

    public void skrivUt() {
        String ut = "Tittel: " + tittel + "\n" +
                "Forfatter: " + forfatter + "\n" +
                "Pris: " + pris + "\n" +
                "ISBN: " + ISBN;
        showMessageDialog(null, ut);
    }
}

public class Oppgave2 {

    public static void main(String[] args) {
        Bøker bok1 = new Bøker();

        String innTittel = showInputDialog("Skriv inn tittel");
        String innForfatter = showInputDialog("Skriv inn forfatter");
        String innPris = showInputDialog("Skriv inn pris");
        String innISBN = showInputDialog("Skriv inn ISBN");
        double pris;
        try {
            pris = Double.parseDouble(innPris);
        } catch (Exception e) {
            pris = 0;
            showMessageDialog(null, "Du må skrive inn en gyldig pris");
        }

        bok1.tittel = innTittel;
        bok1.forfatter = innForfatter;
        bok1.pris = pris;
        bok1.ISBN = innISBN;

        bok1.skrivUt();
    }

}