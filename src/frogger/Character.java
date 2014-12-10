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
public class Character {
    private int x;                                                              // character x pos
    private int y;                                                              // character y pos
    private boolean visible;                                                    // character visibility
    
    private String characterType;                                               // character icon
    
    private int turns;                                                          // turn counter
    private int SPEED;                                                          // speed in turns
    private int width;                                                          // board width
    
    // setup character pos and visibility
    public Character(int xPos, int yPos) {
        x = xPos;
        y = yPos;
        
        visible = true;
        width = 0;
    }
    
    // set characters display icon
    protected void setCharacterType(String toon) {
        characterType = toon;
    }
    
    // return methods for positioning
    protected int getY() {
        return y;
    }
    
    protected int getX() {
        return x;
    }
    
    // can you see me?
    protected boolean isVisible() {
        return visible;
    }
    
    // tell me what your icon is!
    protected String getMarker() {
        return characterType;
    }
    
    // each character has its own unique actions
    protected void act(int x, int y) {
        incTurns();  // mostly useless atm
    }
    
    // turn counter, will be used to hlp determine if timeToAct
    private void incTurns() {
        turns++;
    }
    
    // return number of current turns
    protected int getTurns() {
        return turns;
    }
    
    // since(x,y) is kept by character class, 
    // let the sub classes modify as needed
    // also keeps from dupicating code
    protected void left() {
        x--;
    }
    
    protected void right() {
        x++;
    }
    
    protected void down() {
        y--;
    }
    
    protected void up() {
        y++;
    }
    
    // allow character to set specific xCord
    protected void setX(int xCord) {
        x = xCord;
    }
    
    // set each character speed
    // speed is # of turns
    protected void setSpeed(int mod) {
        SPEED = mod;
    }
    
    // is it characters time to act
    // based on speed, which is based on number of turns
    protected boolean timeToAct() {
        incTurns();
        return getTurns() % SPEED == 0;
    }
    
    // allow characters to go invisible
    protected void changeVisibility() {
        visible = !isVisible();
    }
    
    // set the boards width
    protected void setWidth(int w) {
        width = w;
    }
    
    // return boards width
    protected int getWidth() {
        return width;
    }
}
