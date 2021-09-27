package introKlasserObjekter1.oppgave1;

/*
    Lag en klasse kalt Bøker. Denne klassen skal ha følgende attributter:
    tittel
    pris
    forfatter
    iBSN-nummer
    Videre skal klassen ha en metode som skriver ut de enkelte attributtene via System.out.
    Skriv nødvendig kode i main for å opprette et objekt av denne klassen og sette attributtene til noen verdier.
    Tilslutt skal metoden for å skrive disse dataene ut igjen kalles.
*/

class Bøker {
    String tittel, forfatter, ISBN;
    double pris;

    public void skrivUt() {
        System.out.println("Tittel: " + tittel);
        System.out.println("Forfatter: " + forfatter);
        System.out.println("Pris: " + pris);
        System.out.println("ISBN: " + ISBN);
    }
}

public class Oppgave1 {

    public static void main(String[] args) {
        Bøker bok1 = new Bøker();

        bok1.tittel = "Harry Potter";
        bok1.forfatter = "J.K Rowling";
        bok1.pris = 299.90;
        bok1.ISBN = "8943783278234";

        bok1.skrivUt();
    }

}