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
public class Patroller extends Character{
    
    private String dir;  // holds the direction we move
    
    public Patroller(int x, int y, int w, String direction) {
        super(x,y);                                                             // setup character super class
        setCharacterType("P");                                                  // set character icon
        
        setWidth(w);                                                            // set board width
        dir = direction;                                                        // set dir
        
        setSpeed(2);                                                            // set our speed based on number of turns
    }

    @Override
    public void act(int x, int y) {
        
        // if our time, then act accordingly
        if(timeToAct()) {
            switch (dir) {
                case "left":                                                    // if dir left
                    if(getX() <= 0) {
                        setX(getWidth()-1);
                    }
                    else {
                        left();
                    }   break;
                case "right":                                                   // if dir right
                    if(getX() >= getWidth()-1) {
                        setX(0);
                    }
                    else{
                        right();
                    }   break;
                    
            }
        }
    }
}
