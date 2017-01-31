/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package doyubattle;
import Doyuinterface.StrategyInterface;
import java.util.Scanner;
/**
 *
 * @author karthick
 */
public class DoyuPlayer {
    DoyuPlayer(){
        
    }
    Scanner sc=new Scanner(System.in);
    int choice,cntr=5;
    public void beginBattle(Doyuinterface.StrategyInterface player,String strategy){
        if(strategy=="Attack"){
            StrategyInterface cpu_defend=Factory.createObject("Defend");
            DoyuMoves dm=new DoyuMoves();
            DoyuCard dc=new DoyuCard();
            dm.generateCPUDeck(dc);
            dm.generatePlayerDeck(dc);
            /*for(int i=0;i<30;i++){      
                System.out.print(dc.cpudeck[i][0]+" "+dc.cpudeck[i][1]);
                System.out.println();
            }*/
            dm.genCurrentDeck();
            System.out.println("\n"+".........PLAYER's ATTACK TURN........");
            for(int i=0;i<30;i++){
               System.out.println("Select the card listed below to Attack..");
               for (int j = 0; j < 5; j++) {
                System.out.print(j + 1 + ")");
                System.out.print(dc.playerdeck[j][0] + " "+dc.playerdeck[j][1]);
                System.out.print("   ");
                } 
                choice = sc.nextInt();
                dc.setSelectedchoice(choice);
                if (cntr < 29) {
                dc.playerdeck[choice - 1][0] = dc.playerdeck[cntr++][0];
                dc.playerdeck[choice - 1][1] = dc.playerdeck[cntr][1];
                }
                String s[][]=dc.getCpudeck();
                System.out.println(".........OPPONENT's DEFEND TURN........");
                System.out.println("Opponent battles with  " + s[i][0] + " " + s[i][1]);
            }        
        }
        else if(strategy=="Defend"){
            StrategyInterface cpu_attack=Factory.createObject("Attack");
            DoyuMoves dm=new DoyuMoves();
            DoyuCard dc=new DoyuCard();
            dm.generateCPUDeck(dc);
            dm.generatePlayerDeck(dc);
            /*for(int i=0;i<30;i++){      
                System.out.print(dc.cpudeck[i][0]+" "+dc.cpudeck[i][1]);
                System.out.println();
            }*/
            dm.genCurrentDeck();
            String s[][]=dc.getCpudeck();
            
            
            for(int i=0;i<30;i++){
               System.out.println("\n"+".........OPPONENT's ATTACK TURN........");
               System.out.println("Opponent battles with  " + s[i][0] + " " + s[i][1]);
               System.out.println("\n"+".........PLAYER's DEFEND TURN........");
               System.out.println("Select the card listed below to Attack..");
               for (int j = 0; j < 5; j++) {
                System.out.print(j + 1 + ")");
                System.out.print(dc.playerdeck[j][0] + " "+dc.playerdeck[j][1]);
                System.out.print("   ");
                } 
                choice = sc.nextInt();
                dc.setSelectedchoice(choice);
                if (cntr < 29) {
                dc.playerdeck[choice - 1][0] = dc.playerdeck[cntr++][0];
                dc.playerdeck[choice - 1][1] = dc.playerdeck[cntr][1];
                }
                
        }   }
    }
}
