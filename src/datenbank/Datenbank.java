package datenbank;

import java.util.Scanner;

public class Datenbank extends Main {

    Scanner s = new Scanner(System.in);
    public int AnzahlKinder;
    public int AnzahlErwachsene;
    public int AnzahlBereiche;
    public int Gesamt;
    public int Kinder = 10;
    public int Erwachsene = 15;
    public int ZA;

    public void Age() {

        System.out.println("Pro Bereich kostet eine Eintrittskarte für kinder/Ermäßigte 10€ und für Erwachsene 15€");
        System.out.println("Wie viele ermäßigte Tickets möchten Sie kaufen?");
        AnzahlKinder = s.nextInt();
        System.out.println("Sie haben " + AnzahlKinder + " ermäßigte Tickets gekauft");
        System.out.println("Wie viele Erwachsenen Tickets möchten sie kaufen?");
        AnzahlErwachsene = s.nextInt();
        System.out.println("Sie haben " + AnzahlErwachsene + " erwachsene Tickets gekauft");
        System.out.println("Wie viele Bereiche möchten Sie besuchen?");
        AnzahlBereiche = s.nextInt();
        System.out.println("Sie haben eintritt auf" + AnzahlBereiche);
        System.out.println("Wollen sie Zusätzliche Angebote kaufen?");
        String Zusatz = s.nextLine();
        System.out.print("JA/NEIN" + Zusatz);
        for (;;) {
            System.out.println("Zusatz? (JA/NEIN)");
            String zusatz = s.nextLine();

            if (zusatz.equalsIgnoreCase("JA")) {
                System.out.println("1. Delfin-Show (20€ p.P.)");
                System.out.println("2. Raubtier-Show (10€ p.P.)");
                System.out.print("Wie viele Tickets wollen Sie für die Delfin-Show kaufen?");
                int AnzahlDS = s.nextInt();
                System.out.print("Wie viele Tickets wollen Sie für die Raubtier-Show kaufen?");
                int AnzahlRS = s.nextInt();

                ZA = AnzahlDS * 20 + AnzahlRS * 10;
                System.out.println(ZA);
                System.out.println("Wollen sie noch mehr Zusatzangebote kaufen?");
                String mehr = s.nextLine();
                if (mehr.equalsIgnoreCase("JA")) {
                } else {
                    break;
                }
            }
        }
    }

    public void Preise() {
        Gesamt = (AnzahlKinder * Kinder + AnzahlErwachsene * Erwachsene) * AnzahlBereiche + ZA;
        System.out.println("Der Preis beträgt " + Gesamt);

    }

    public void Barcode() {
        System.out.print("ZOO-" + AnzahlKinder + AnzahlErwachsene + AnzahlBereiche + "-");
    }
}
