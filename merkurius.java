import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class merkurius extends komponen
{
    int speed = 2;
    public merkurius()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/4;
        int myNewWidth = (int)myImage.getWidth()/4;
        myImage.scale(myNewWidth, myNewHeight);
    }
    public void act()
    {
        merkurius a = new merkurius ();
        Actor i = getOneIntersectingObject(merkurius.class);
        move (speed);
        checkdouble(i);
        end();
    }
}
