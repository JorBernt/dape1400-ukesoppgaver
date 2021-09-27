package introKlasserObjekter1.oppgave3;

/*
Lag en klasse kalt Person. Denne skal inneholde følgende attributter:
navn
adresse
telefonnr
fødselsår
Lag en metode for å regne ut alderen til en person.
Metoden skal ikke ta inn noen parametere, den skal regne ut alderen ut i fra fødselsår. Metoden skal returnere alderen.
Lag så en metode som skriver ut alle vitale data for personen på følgende måte:
Per Hansen med adresse Osloveien 82 med telefonnummer 22124512 er 21 år.
Opprett et eller flere person objekter i main-metoden for å teste ut denne
*/

class Person {
    String navn, adresse, telefonnr;
    int fødselsår;

    public int regnUtAlder() {
        int alder = 2021 - fødselsår;
        return alder;
    }

    public void skrivUt() {
        System.out.println(navn + " med adresse " + adresse + " med telefonnummer " +
                telefonnr + " er " + regnUtAlder() + " år.");
    }
}

public class Oppgave3 {
    public static void main(String[] args) {
        Person person = new Person();

        person.navn = "Per Hansen";
        person.telefonnr = "22124512";
        person.adresse = "Osloveien 82";
        person.fødselsår = 1995;

        person.skrivUt();
    }
}