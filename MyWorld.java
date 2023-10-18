import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public static GreenfootSound bg = new GreenfootSound("bg4.wav");
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(300, 400, 1); 
        init();
    }
    
    public void started()
    {
        bg.play();
    }
    
    public void stopped()
    {
        bg.stop();
    }
    
    public void init(){
        for(int i=0; i<=5; i++)
        {
            Alien a = new Alien();
            this.addObject(a, Greenfoot.getRandomNumber(300), Greenfoot.getRandomNumber(100));
        }
        Hero h = new Hero();
        this.addObject(h, 150, 370);
        Peluru p = new Peluru();
        this.addObject(p, h.getX(), h.getY());
        Skor skor =  new Skor("Score : ");
        this.addObject(skor, 50, 10);
        Nyawa nyawa = new Nyawa("Nyawa : ");
        this.addObject(nyawa, this.getWidth()-10, 10);
    }
}
