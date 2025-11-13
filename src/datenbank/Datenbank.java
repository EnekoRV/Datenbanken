package datenbank;
import java.util.Scanner;
public class Datenbank extends Main {
    Scanner s = new Scanner(System.in);
    public void Age(){
        
        System.out.println("Pro Bereich kostet eine Eintrittskarte für kinder/Ermäßigte 10€ und für Erwachsene 15€");
        System.out.println("Wie viele ermäßigte Tickets möchten Sie kaufen?");
            int K = s.nextInt();
        int Kinder = K;
        System.out.println("Sie haben "+ K +" ermäßigte Tickets gekauft")
        System.out.println("Wie viele Erwachsenen Tickets möchten sie kaufen?");
            int E = s.nextInt();
        int Erwachsene = E;
        System.out.println("Sie haben "+ E +" ermäßigte Tickets gekauft")
        //int Bereiche = B;
        
    
}
    public void Preise(){
        
    }
    public void Bereiche(){
        System.out.println("");
    }

}










