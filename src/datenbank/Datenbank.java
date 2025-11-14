package datenbank;
import java.util.Scanner;
public class Datenbank extends Main {
    Scanner s = new Scanner(System.in);
    public void Age(){
        
        System.out.println("Pro Bereich kostet eine Eintrittskarte für kinder/Ermäßigte 10€ und für Erwachsene 15€");
        System.out.println("Wie viele ermäßigte Tickets möchten Sie kaufen?");
            int K = s.nextInt();
        public int AnzahlKinder = AK;
        System.out.println("Sie haben "+ AK +" ermäßigte Tickets gekauft");
        System.out.println("Wie viele Erwachsenen Tickets möchten sie kaufen?");
            int E = s.nextInt();
        public int AnzahlErwachsene = AE;
        System.out.println("Sie haben "+ AE +" ermäßigte Tickets gekauft");
        System.out.println("Wie viele Erwachsenen Tickets möchten sie kaufen?");
            int E = s.nextInt();
        public int AnzahlBereiche = AB;
        System.out.println("Sie haben eintritt auf"+ AB );
    
}
    public void Preise(){
        public int Gesamt;
        public int Kinder = 10;
        public int Erwachsene =15;
        Gesamt = (AnzahlKinder * Kinder + AnzahlErwachsene * Erwachsene) * AnzahlBereiche;
        System.out.println("Der Preis beträgt"+ Gesamt);
            
        
    }
    public void Bereiche(){
        System.out.println("");
    }

}













