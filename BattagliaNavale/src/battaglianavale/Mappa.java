package battaglianavale;

//import java.util.ArrayList;
//0 vuoto
//1 barca
//2 colpito
//3 bordi
public class Mappa {

    int[][] water;
    int conta;
    //ArrayList uso;

    public Mappa() {
        water = new int[10][10];
        conta = 0;
        //uso = new ArrayList();
    }

    public void inizioWater() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 0 || j == 9 || i == 0 || i == 9) {
                    water[i][j] = 3;
                } else {
                    water[i][j] = 0;
                }
            }
        }
    }

    public boolean colpo(int c1, int c2) {
        if (c1 < 8 && c2 < 8 && c1 > 0 && c2 > 0) {
            if (this.water[c1][c2] == 1) {
                this.water[c1][c2] = 2;

                if ((this.water[c1 + 1][c2] == 2 && this.water[c1 - 1][c2] == 2)
                        || (this.water[c1 + 1][c2] == 2 && this.water[c1 + 2][c2] == 2)
                        || (this.water[c1 - 1][c2] == 2 && this.water[c1 - 2][c2] == 2)) {

                    System.out.println("Nave affonata");

                } else if ((this.water[c1 + 1][c2] == 2 && this.water[c1 - 1][c2] == 0 
                            && this.water[c1 + 2][c2] == 0) || (this.water[c1 + 1][c2] == 0 
                            && this.water[c1 - 1][c2] == 2 && this.water[c1 - 2][c2] == 0)) {
                    
                    System.out.println("Nave affonata");
                    
                } else if ( (this.water[c1][c2 + 1] == 2 && this.water[c1][c2 - 1] == 2) || 
                            (this.water[c1][c2 + 1] == 2 && this.water[c1][c2 + 2] == 2) || 
                            (this.water[c1][c2 - 1] == 2 && this.water[c1][c2 - 2] == 2)) {
                    
                    System.out.println("Nave affonata");
                    
                } else if ((this.water[c1][c2 + 1] == 2 && this.water[c1][c2 - 1] == 0 &&
                            this.water[c1][c2 + 2] == 0) || (this.water[c1][c2 + 1] == 0 && 
                            this.water[c1][c2 - 1] == 2 && this.water[c1][c2 - 2] == 0)) {
                    
                    System.out.println("Nave affonata");
                
                }
                return true;
            }
        }

        System.out.println("colpire una cella disponibile \n");
        return false;
    }

    public boolean inserimento2(int c1, int c2, String d) {
        if (c1 <= 8 && c2 < 8 && c1 >= 1 && c2 >= 1) {
            if (d.equalsIgnoreCase("orizzontale") || d.equalsIgnoreCase("o")) {
                if (water[c1][c2] == 0 && water[c1 + 1][c2] == 0 && water[c1 - 1][c2 + 1] != 1
                        && water[c1 - 1][c2] != 1 && water[c1 - 1][c2 - 1] != 1
                        && water[c1][c2 + 1] != 1 && water[c1][c2 - 1] != 1
                        && water[c1 + 1][c2 + 1] != 1 && water[c1 + 1][c2 - 1] != 1
                        && water[c1 + 2][c2 + 1] != 1 && water[c1 + 2][c2] != 1
                        && water[c1 + 2][c2 - 1] != 1) {

                    water[c1][c2] = 1;
                    water[c1 + 1][c2] = 1;
                    return true;

                } else {
                    System.out.println("inserire la barca in una cella disponibile \n");
                    return false;
                }
            } else if (d.equalsIgnoreCase("verticale") || d.equalsIgnoreCase("v")) {
                if (water[c1][c2] == 0 && water[c1][c2 + 1] == 0
                        && water[c1 - 1][c2 - 1] == 0 && water[c1][c2 - 1] == 0
                        && water[c1 + 1][c2 - 1] == 0 && water[c1 - 1][c2] == 0
                        && water[c1 + 1][c2] == 0 && water[c1 - 1][c2 + 1] == 0
                        && water[c1 + 1][c2 + 1] == 0 && water[c1 - 1][c2 + 2] == 0
                        && water[c1][c2 + 2] == 0 && water[c1 + 1][c2 + 2] == 0) {

                    water[c1][c2] = 1;
                    water[c1][c2 + 1] = 1;
                    return true;

                } else {
                    System.out.println("inserire la barca in una cella disponibile \n");
                    return false;
                }
            } else {
                System.out.println("inserire la barca in una cella disponibile \n");
                return false;
            }
        } else {
            System.out.println("inserire la barca in una cella disponibile \n");
            return false;
        }
    }

    public boolean inserimento3(int c1, int c2, String d) {
        if (c1 <= 8 && c2 <= 8 && c1 >= 1 && c2 >= 1) {
            if (d.equalsIgnoreCase("orizzontale") || d.equalsIgnoreCase("o")) {
                if (water[c1][c2] == 0 && water[c1 + 1][c2] == 0 && water[c1 - 1][c2 + 1] != 1
                        && water[c1 - 1][c2] != 1 && water[c1 - 1][c2 - 1] != 1
                        && water[c1][c2 + 1] != 1 && water[c1][c2 - 1] != 1
                        && water[c1 + 1][c2 + 1] != 1 && water[c1 + 1][c2 - 1] != 1
                        && water[c1 + 2][c2 + 1] != 1 && water[c1 + 2][c2] != 1
                        && water[c1 + 2][c2 - 1] != 1 && water[c1 + 3][c2 + 1] != 1
                        && water[c1 + 3][c2] != 1 && water[c1 + 3][c2 - 1] != 1) {

                    water[c1][c2] = 1;
                    water[c1 + 1][c2] = 1;
                    water[c1 + 2][c2] = 1;
                    return true;

                } else {
                    System.out.println("inserire la barca in una cella disponibile \n");
                    return false;
                }
            } else if (d.equalsIgnoreCase("verticale") || d.equalsIgnoreCase("v")) {
                if (water[c1][c2] == 0 && water[c1][c2 + 1] == 0
                        && water[c1 - 1][c2 - 1] == 0 && water[c1][c2 - 1] == 0
                        && water[c1 + 1][c2 - 1] == 0 && water[c1 - 1][c2] == 0
                        && water[c1 + 1][c2] == 0 && water[c1 - 1][c2 + 1] == 0
                        && water[c1 + 1][c2 + 1] == 0 && water[c1 - 1][c2 + 2] == 0
                        && water[c1][c2 + 2] == 0 && water[c1 + 1][c2 + 2] == 0
                        && water[c1 - 1][c2 + 3] == 0 && water[c1][c2 + 3] == 0
                        && water[c1 + 1][c2 + 3] == 0) {

                    water[c1][c2] = 1;
                    water[c1 + 1][c2] = 1;
                    water[c1 + 2][c2] = 1;
                    return true;

                } else {
                    System.out.println("inserire la barca in una cella disponibile \n");
                    return false;
                }
            } else {
                System.out.println("inserire la barca in una cella disponibile \n");
                return false;
            }
        } else {
            return false;
        }

    }

    public boolean victory() {
        boolean Vi = true;
        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < 9; j++) {
                if (this.water[i][j] == 1) {
                    Vi = false;
                }
            }

        }
        return Vi;
    }
}
