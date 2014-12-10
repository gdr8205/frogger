/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frogger;

/**
 *
 * @author Garrett
 */
public class Hider extends Character {
    public Hider(int x, int y) {
        super(x,y);                                                             // setup character super class
        setCharacterType("H");                                                  // set character icon
        
        setSpeed(2);                                                            // set our speed based on number of turns
    }
    
    @Override
    public void act(int x, int y) {
        // if our time, then act accordingly
        if(timeToAct()) {
            changeVisibility();                                                 // switch visibility
        }          
    }
}
