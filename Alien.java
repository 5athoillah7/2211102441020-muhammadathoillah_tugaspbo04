import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class alien0 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alien extends Actor
{
    /**
     * Act - do whatever the alien0 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        this.setLocation(this.getX(), this.getY()+Greenfoot.getRandomNumber(2));
        if(this.getY() >= 390){
            Bledos b = new Bledos();
            this.getWorld().addObject(b, this.getX(), this.getY());
            this.setLocation(Greenfoot.getRandomNumber(300), 0);
            Nyawa.setNyawa((Nyawa.lihatNyawa()-1));
            Nyawa.lihatNyawa();
        }
    }    
}
