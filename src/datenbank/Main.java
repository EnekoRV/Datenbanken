/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datenbank;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Herzlich Willkommen zu Ihrem Abenteuer im ZooTopia");
        Datenbank d = new Datenbank();
        int i = 0;
        while (true) {
            d.Kostenermittlung();
            d.Preise();
            d.Barcode();
            i = i + 1;
            System.out.println(i);
            System.out.println("Bitte zeigen sie diesen beim Eingang vor.");

            System.out.println("Wollen sie noch eine Einrtittskarte kaufen?");
            String Eintritt = s.nextLine();
            
            if(Eintritt.equals("Nein")){
                break;
            }
            /*
            
            switch (Eintritt) {
                case "ne":
                    if (Eintritt.equalsIgnoreCase("Nein")){
                        break;
                    }    
                case "Ja":
            }*/
        }
    }
}
