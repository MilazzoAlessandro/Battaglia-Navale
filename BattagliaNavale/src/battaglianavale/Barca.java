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
public class Barca {
   int posti;

    public Barca() {
    }

    public Barca(int posti, int CordX, int CordY) {
        this.posti = posti;
    }

    public int getPosti() {
        return posti;
    }

    public void setPosti(int posti) {
        this.posti = posti;
    }
}
