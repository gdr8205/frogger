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
public class Chaser extends Character {
    public Chaser(int x, int y) {
        super(x,y);                                                             // setup character super class
        setCharacterType("C");                                                  // set character icon
        
        setSpeed(3);                                                            // set our speed based on number of turns
    }
    
    @Override
    public void act(int x, int y) {
        // if our time, then act accordingly
        if(timeToAct()) {
            if(getX() > x) {
                left();
            } else {
                right();
            }
            
            if(getY() > y) {
                down();
            } else {
                up();
            }
        }        
    }
}
