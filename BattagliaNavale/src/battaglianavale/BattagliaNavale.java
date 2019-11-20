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
        do{
            System.out.println("inserire barca da 2");
            c1 = scan.nextInt();
            c2 = scan.nextInt();
            d = scan.next();
        }while( Map1.inserimento2(c1, c2, d)==false);
        do{
            System.out.println("inserire barca da 2");
            c1 = scan.nextInt();
            c2 = scan.nextInt();
            d = scan.next();
        }while( Map1.inserimento2(c1, c2, d)==false);
        do{
            System.out.println("inserire barca da 3");
            c1 = scan.nextInt();
            c2 = scan.nextInt();
            d = scan.next();
        }while( Map1.inserimento3(c1, c2, d)==false);

    }

}
