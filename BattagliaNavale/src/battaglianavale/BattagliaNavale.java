/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battaglianavale;

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
        int c1,c2;
        }
        /*Inserire per giocatore 1*/
        System.out.println("inserire barca da 2");
        Map1.inserimento2(c1,c2);
        System.out.println("inserire barca da 2");
        Map1.inserimento2(c1,c2);
        System.out.println("inserire barca da 3");
        Map1.inserimento3(c1,c2);
        
    }
    
}
