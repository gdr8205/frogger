/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frogger;

import java.util.Random;

/**
 *
 * @author Garrett
 */
public class Jumper extends Character{
    
    public Jumper(int x, int y, int w) {
        super(x,y);                                                             // setup character super class
        setCharacterType("J");                                                  // setup character icon
        
        setSpeed(4);                                                            // set our speed based on number of turns
        setWidth(w);                                                            // set board width
    }
    
    private int random() {
        // create random numer, used to jump to
        Random randomGen = new Random();
        int randomInt = randomGen.nextInt(getWidth()-1);
        
        return randomInt;
    }
    
    @Override
    public void act(int x, int y) {
        // if our time, then act accordingly
        if(timeToAct()) {
            setX(random());                                                     // lets jump to our random number on x axis
        }         
    }
}
