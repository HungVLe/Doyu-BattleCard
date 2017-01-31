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
public class DoyuDefend implements StrategyInterface{
    DoyuDefend(){
        System.out.println("Defend");
    }

    @Override
    public void defendStrategy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void attackStrategy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
