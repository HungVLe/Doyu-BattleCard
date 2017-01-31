/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Doyuinterface;

/**
 *
 * @author karthick
 */
public interface StrategyInterface {
    String deck[] = {"Damage", "Heal", "Drain", "Attack", "Defense"};
    public void defendStrategy();
    public void attackStrategy();
}
