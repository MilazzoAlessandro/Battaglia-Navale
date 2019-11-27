
package battaglianavale;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JButton;
import org.xml.sax.Attributes;


public class Interfaccia extends javax.swing.JFrame {

    int [][] water, myWater;
    int begin, mosse, linguaggio, fineGioco, scores, numeroNavi, lMosse,  conta;
    ArrayList click;


    
    public Interfaccia() {
        begin = 0;
        mosse = 0;
        linguaggio = 0;
        fineGioco = 0;
        scores = 0;
        numeroNavi = 0;
        lMosse = 0;
        click = new ArrayList();
        water = new int[10][10];
        myWater = new int[10][10];
        conta= 0;

          
    }
}