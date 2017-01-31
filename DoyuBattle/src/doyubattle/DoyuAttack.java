/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package doyubattle;

import Doyuinterface.StrategyInterface;

/**
 *
 * @author karthick
 */
public class DoyuAttack implements StrategyInterface{
    DoyuAttack(){
        System.out.println("Attack");
    } 
    
    @Override
    public void defendStrategy() {
        System.out.println("Defend");
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void attackStrategy() {
        System.out.println("attack");
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
//Testing github branch - Hung Le
//Testing github bracnh 2 - hung le
