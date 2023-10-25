import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class bumi extends komponen
{
    int speed = 2;
    public bumi()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/4;
        int myNewWidth = (int)myImage.getWidth()/4;
        myImage.scale(myNewWidth, myNewHeight);
    }
    public void act()
    {
        bumi a = new bumi ();
        Actor i = getOneIntersectingObject(bumi.class);
        move (speed);
        checkdouble(i);
        end();
    }
}
