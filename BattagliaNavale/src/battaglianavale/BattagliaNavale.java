/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battaglianavale;

import java.util.Scanner;

/**
 *
 * @author informatica
 */
public class BattagliaNavale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mappa Map1 = new Mappa();
        Mappa Map2 = new Mappa();
        Map2.inizioWater();
        Map1.inizioWater();
        int c1, c2;
        String d;

        Scanner scan = new Scanner(System.in);

        /*Inserire per giocatore 1*/
        System.out.println("inserire barca da 2");
        c1 = scan.nextInt();
        c2 = scan.nextInt();
        d = scan.next();
        Map1.inserimento2(c1, c2, d);
        System.out.println("inserire barca da 2");
        c1 = scan.nextInt();
        c2 = scan.nextInt();
        d = scan.next();
        Map1.inserimento2(c1, c2, d);
        System.out.println("inserire barca da 3");
        c1 = scan.nextInt();
        c2 = scan.nextInt();
        d = scan.next();
        Map1.inserimento3(c1, c2, d);

    }

}
