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
public class DoyuCard extends DoyuMoves{
    int selectedchoice;

    public int getSelectedchoice() {
        return selectedchoice;
    }

    public void setSelectedchoice(int selectedchoice) {
        this.selectedchoice = selectedchoice;
    }

    public String[][] getPlayerdeck() {
        return playerdeck;
    }

    public void setPlayerdeck(String[][] playerdeck) {
        this.playerdeck = playerdeck;
    }

    public String[][] getCpudeck() {
        return cpudeck;
    }

    public void setCpudeck(String[][] cpudeck) {
        this.cpudeck = cpudeck;
    }
    
}
