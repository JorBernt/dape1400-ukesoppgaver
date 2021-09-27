package introKlasserObjekter1.oppgave4;

/*
Utvid oppgave 3 med å lese inn dataene fra input-bokser og vise resultatet i en meldingsboks på følgende format:

Navn: Per Hansen
Adresse : Osloveien 82
Telefonnr : 22124512
Alder : 21 år.

Tips: bruk \n for å få ny linje
*/

import static javax.swing.JOptionPane.*;

class Person {
    String navn, adresse, telefonnr;
    int fødselsår;

    public int regnUtAlder() {
        int alder = 2021 - fødselsår;
        return alder;
    }

    public void skrivUt() {
        String ut = "Navn: " + navn + "\n" +
                "Adresse: " + adresse + "\n" +
                "Telefonnr: " + telefonnr + "\n" +
                "Alder " + regnUtAlder() + " år";
        showMessageDialog(null, ut);
    }
}

public class Oppgave4 {
    public static void main(String[] args) {
        Person person = new Person();

        person.navn = showInputDialog("Skriv inn navnet: ");
        person.telefonnr = showInputDialog("Skriv inn telefonnr: ");
        person.adresse = showInputDialog("Skriv inn adresse: ");
        String innFødselsår = showInputDialog("Skriv inn Fødselsår: ");
        person.fødselsår = Integer.parseInt(innFødselsår);

        person.skrivUt();
    }
}