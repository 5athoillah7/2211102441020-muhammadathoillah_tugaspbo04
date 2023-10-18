import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bledos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bledos extends Actor
{
    /**
     * Act - do whatever the Bledos wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        Skor.setSkor((Skor.lihatSkor()+1));
        Skor.lihatSkor();
        this.getWorld().removeObject(this);
        Greenfoot.playSound("blast.wav");
    }    
}
