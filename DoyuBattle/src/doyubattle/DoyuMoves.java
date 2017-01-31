/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package doyubattle;

/**
 *
 * @author karthick
 */
public class DoyuMoves {
    String deck[] = {"Damage", "Heal", "Drain", "Attack", "Defense"};
    int i,j,random,tmp_random,x;
    public String playerdeck[][] = new String[30][2];
    public String currentplayerdeck[][] = new String[30][2];        
    public String cpudeck[][] = new String[30][2];
    public String currentdeck[][] = new String[5][2];
    public void generateCPUDeck(DoyuCard dc) {
        for (i = 0; i < 30; i++) {
            random = (int) ((Math.random() * 100) % 5);
            tmp_random = (x = (int) ((Math.random() * 100) % 4) * 5) > 0 ? x : 5;
            cpudeck[i][0] = deck[random];
            cpudeck[i][1] = Integer.toString(tmp_random);
            //System.out.println(cpudeck[i][0]+" "+cpudeck[i][1]);
        }
        dc.setCpudeck(cpudeck);
    }
    
    public void generatePlayerDeck(DoyuCard dc) {
        for (i = 0; i < 30; i++) {
            random = (int) ((Math.random() * 100) % 5);
            tmp_random = (x = (int) ((Math.random() * 100) % 4) * 5) > 0 ? x : 5;
            playerdeck[i][0] = deck[random];
            playerdeck[i][1] = Integer.toString(tmp_random);
           // System.out.println(playerdeck[i][0]+" "+playerdeck[i][1]);
        }
        dc.setPlayerdeck(playerdeck);
    }
    
    public void genCurrentDeck() {
        //System.out.println("CurrentCPUDeck:");
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 2; j++) {
                currentdeck[i][j] = cpudeck[i][j];
                //System.out.print(currentdeck[i][j]);
            }
           // System.out.println();
        }

    }
}
