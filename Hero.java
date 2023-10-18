import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    int counter = 0;
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        counter++;
        if(counter >= 30)
        {
            Peluru p = new Peluru();
            this.getWorld().addObject(p, this.getX(), this.getY());
            Greenfoot.playSound("ammo.wav");
            counter = 0;
        }
        
        if(Greenfoot.isKeyDown("up"))
        {
            this.setLocation(this.getX(), this.getY()-1);
        }
        else if(Greenfoot.isKeyDown("down"))
        {
            this.setLocation(this.getX(), this.getY()+1);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            this.setLocation(this.getX()-1, this.getY());
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            this.setLocation(this.getX()+1, this.getY());
        }
    } 
}
