
package battaglianavale;

import java.util.ArrayList;
//0=vuoto
//1=barca
//2=colpito
public class Mappa
{
    int [][] water;
    int conta;
    ArrayList uso;
    public Mappa()
    {
        water=new int [8][8];
        conta= 0 ;
        uso=new ArrayList();
    }
    public void inizioWater()
    {
        for(int i=0;i<8;i++)
        {
            for(int j=0;j<8;j++)
                water[i][j]=0;
        }
    }
    public boolean colpo(int c1,int c2)
    {
        for(int x=0;x<8;x++)
        {
            for(int y=0;y<8;y++)    
            {
                if(c1==x&&c2==y)
                {
                    if(this.water[x][y]==1)
                    {
                        this.water[x][y]=2;
                        return true;
                    }
                }
                
            }
        }
        return false;
    }
    public void inserimento_b(int c1,int c2)
    {
        if(c1<8&&c2<8)
        {
            water[c1][c2]=1;
        }
    }
    
   
}