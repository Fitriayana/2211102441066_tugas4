import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    private int currentLevel = 1;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
    }
    
    private void prepare()
    {
        roket roket = new roket();
        addObject(roket,282,551);
    }
    
    public void act() {
        if(Greenfoot.getRandomNumber(100) <1){
            addObject(new merkurius(), Greenfoot.getRandomNumber(100) + 200, 0);
        }
        
        if(Greenfoot.getRandomNumber(100) <1){
            addObject(new bumi(), Greenfoot.getRandomNumber(100) + 200, 0);
        }
        
        if(Greenfoot.getRandomNumber(300) <1){
            addObject(new koin(), Greenfoot.getRandomNumber(100) + 200, 0);
        }
        
        if(Greenfoot.getRandomNumber(100) <1){
            addObject(new star(), Greenfoot.getRandomNumber(100) + 200, 0);
        }
    }
}
