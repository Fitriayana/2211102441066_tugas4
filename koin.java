import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class koin extends komponen
{
    int speed = 2;
    public koin()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/2;
        int myNewWidth = (int)myImage.getWidth()/2;
        myImage.scale(myNewWidth, myNewHeight);
    }
    public void act()
    {
        koin a = new koin ();
        Actor i = getOneIntersectingObject(koin.class);
        move (speed);
        checkdouble(i);
        end();
    }
}
