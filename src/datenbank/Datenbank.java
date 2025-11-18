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
        System.out.println("Herzlich Willkommen im ZooTopia")
        System.out.println("Pro Bereich kostet eine Eintrittskarte für kinder/Ermaeßigte 10,- und für Erwachsene 15,-");
        System.out.println("Wie viele ermaeßigte Tickets möchten Sie kaufen?");
        AnzahlKinder = s.nextInt();
        System.out.println("Sie haben " + AnzahlKinder + " ermaeßigte Tickets gekauft");
        System.out.println("Wie viele Erwachsenen Tickets moechten sie kaufen?");
        AnzahlErwachsene = s.nextInt();
        System.out.println("Sie haben " + AnzahlErwachsene + " erwachsene Tickets gekauft");
        System.out.println("Wie viele Bereiche moechten Sie besuchen?");
        AnzahlBereiche = s.nextInt();
        System.out.println("Sie haben eintritt auf" + AnzahlBereiche);
        System.out.println("Wollen sie Zusaetzliche Angebote kaufen?");
        String Zusatz = s.nextLine();
        System.out.print("JA/NEIN" + Zusatz);
        for (;;) {
            System.out.println("Zusatz? (JA/NEIN)");
            String zusatz = s.nextLine();

            if (zusatz.equalsIgnoreCase("JA")) {
                System.out.println("1. Delfin-Show (20,- p.P.)");
                System.out.println("2. Raubtier-Show (10,- p.P.)");
                System.out.println("Wie viele Tickets wollen Sie für die Delfin-Show kaufen?");
                int AnzahlDS = s.nextInt();
                System.out.println("Wie viele Tickets wollen Sie für die Raubtier-Show kaufen?");
                int AnzahlRS = s.nextInt();

                ZA = AnzahlDS * 20 + AnzahlRS * 10;
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
        System.out.println("Der Preis betraegt " + Gesamt + " Euro");

    }

    public void Barcode() {
        System.out.println("Ihr Barcode ist: " + "ZOO-" + AnzahlKinder + AnzahlErwachsene + AnzahlBereiche + "-"); 
        System.out.printl("Bitte zeigen sie diesen beim Eingang vor.")

    }
}



