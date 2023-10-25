import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class roket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class roket extends Actor
{
    int score = 0 ;
    public static int level = 1;
    public roket()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/3;
        int myNewWidth = (int)myImage.getWidth()/3;
        myImage.scale(myNewWidth, myNewHeight);
    }
    
    public void act()
    {
        getWorld().showText("Score : " + score, 70, 30);
        checkKey();
        end();
        addScore();
        levelUp();
    }
    
    
    public void checkKey(){
        
    if(Greenfoot.isKeyDown("left"))
        {
           setLocation(getX() -4, getY()); 
        }
        
        if(Greenfoot.isKeyDown("right")) {
        
           setLocation(getX() +4, getY());
        }
    
    if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY() -4);
        }
        
    if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY() +4);
        }
    }
    
    public void end(){
        if (isTouching(merkurius.class)||isTouching(bumi.class)){
            getWorld().showText("Game Over \n Score : " + score, 300, 300);
            Greenfoot.stop();
        }
    }
    public void addScore(){
        if(isTouching(koin.class)){
            score = score + 20;
            removeTouching(koin.class);
        }
    }  
    public void levelUp(){
    if (isTouching(star.class)){
            level = 2;
            Greenfoot.setWorld(new MyWorld2());
            removeTouching(star.class);
        }
        Actor star = getOneIntersectingObject(star.class);    
        if(star != null)
        {
            if(level == 1)
            {
                level = 2;
                Greenfoot.setWorld(new MyWorld2());
            }
    }
    
}
}



        
