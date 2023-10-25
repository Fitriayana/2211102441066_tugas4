import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class star extends komponen
{
    int speed = 2;
    public star()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/2;
        int myNewWidth = (int)myImage.getWidth()/2;
        myImage.scale(myNewWidth, myNewHeight);
    }
    
    public void act()
    {
        star a = new star ();
        Actor i = getOneIntersectingObject(star.class);
        move (speed);
        checkdouble(i);
        end();
    }
    
    
}
