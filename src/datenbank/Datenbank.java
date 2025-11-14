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
    
}
    public void Preise(){      
        Gesamt = (AnzahlKinder * Kinder + AnzahlErwachsene * Erwachsene) * AnzahlBereiche;
        System.out.println("Der Preis beträgt " + Gesamt);
            
        
    }
}
