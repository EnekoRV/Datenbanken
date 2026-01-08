/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ZooTopia;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Herzlich Willkommen zu Ihrem Abenteuer im ZooTopia");
        ZooTopia d = new ZooTopia();
        int i = 0;
        while (true) {
            d.Age();
            d.Preise();
            d.Barcode();
            i = i + 1;
            System.out.println(i);
            System.out.println("Bitte zeigen sie diesen beim Eingang vor.");

            System.out.println("Wollen sie noch eine Einrtittskarte kaufen?");
            String Eintritt = s.nextLine();
            switch (Eintritt) {
                case "Nein":
                    return;
                case "Ja":
            }
        }
    }
}