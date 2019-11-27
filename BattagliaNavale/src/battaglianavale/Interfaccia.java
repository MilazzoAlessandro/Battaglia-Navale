
package battaglianavale;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JButton;
import org.xml.sax.Attributes;


public class Interfaccia extends javax.swing.JFrame {

    int [][] water, myWater;
    int begin,fineGioco, scores, numeroNavi;
    ArrayList click;


    
    public Interfaccia() {
        begin = 0;
        fineGioco = 0;
        scores = 0;
        numeroNavi = 0;
        water = new int[10][10];
        myWater = new int[10][10];

          
    }
}