package introKlasserObjekter1;

/*
Lag en klasse kalt Kalkulator.
Denne klassen skal ha 4 statiske metoder som tar inn 2 parametere hver.
Disse statiske metodene skal henholdsvis addere, subtrahere, multiplisere og dividere to desimaltall og returnere resultatet.

Skriv også kode i main-metoden for å kalle disse metodene for å sjekke at de fungerer.
*/

class Kalkulator {

    public static double addere(double a, double b) {
        double svar = a + b;
        return svar;
    }

    public static double subtrahere(double a, double b) {
        double svar = a - b;
        return svar;
    }

    public static double dividere(double a, double b) {
        double svar = a / b;
        return svar;
    }

    public static double multiplisere(double a, double b) {
        double svar = a * b;
        return svar;
    }
}

public class Oppgave5 {
    public static void main(String[] args) {
        System.out.println(Kalkulator.addere(10, 10));
        System.out.println(Kalkulator.subtrahere(10, 10));
        System.out.println(Kalkulator.dividere(10, 10));
        System.out.println(Kalkulator.multiplisere(10, 10));
    }
}