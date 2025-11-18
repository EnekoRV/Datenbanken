package datenbank;
import java.util.Scanner;
public class Datenbank extends Main {
    Scanner s = new Scanner(System.in);
    public int AnzahlKinder;
    public int AnzahlErwachsene;
    public int AnzahlBereiche;
    public int Gesamt;
    public int Kinder = 10;
    public int Erwachsene =15;
    public String
    
    public void Age(){
        
        System.out.println("Pro Bereich kostet eine Eintrittskarte für kinder/Ermäßigte 10€ und für Erwachsene 15€");
        System.out.println("Wie viele ermäßigte Tickets möchten Sie kaufen?");
            AnzahlKinder = s.nextInt();        
        System.out.println("Sie haben "+ AnzahlKinder +" ermäßigte Tickets gekauft");
        System.out.println("Wie viele Erwachsenen Tickets möchten sie kaufen?");
            AnzahlErwachsene = s.nextInt();        
        System.out.println("Sie haben "+ AnzahlErwachsene +" ermäßigte Tickets gekauft");
        System.out.println("Wie viele Erwachsenen Tickets möchten sie kaufen?");
            AnzahlBereiche = s.nextInt();        
        System.out.println("Sie haben eintritt auf"+ AnzahlBereiche );
        System.out.println("Wollen sie Zusätzliche Angebote kaufen?");
            String Zusatz = s.nextLine();
        System.out.print("JA/NEIN" + Zusatz);
     for (;;) { 
        System.out.println("Zusatz? (JA/NEIN)");
        String zusatz = s.nextLine();
        
        if (zusatz.equalsIgnoreCase("JA")) {
            System.out.println("1. Delfin-Show (20€ p.P.)");
            System.out.println("2. Raubtier-Show (10€ p.P.)");
            System.out.print("Wie viele Tickets wollen Sie für die Delfin-Show kaufen?" + AnzahlDS);
            int AnzahlDS = s.nextInt();
            System.out.print("Wie viele Tickets wollen Sie für die Raubtier-Show kaufen?" + AnzahlRS);
            int AnzahlRS = s.nextInt();

            System.out.println(ZA);
            int ZA = AnzahlDS * 20 + AnzahlRS * 10;    
            }
            
        
                    
        
        }
    
}
    public void Preise(){      
        Gesamt = (AnzahlKinder * Kinder + AnzahlErwachsene * Erwachsene) * AnzahlBereiche;
        System.out.println("Der Preis beträgt " + Gesamt);
            
        
    }
    public void Barcode (){
        System.out.print("ZOO-"+AnzahlKinder+AnzahlErwachsene+AnzahlBereiche+"-");
    }
    
}





