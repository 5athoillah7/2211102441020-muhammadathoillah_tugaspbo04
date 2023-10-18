import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nyawa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nyawa extends Actor
{
    private static int value = 10;
    private String text;
    private int stringLength;
    
    public Nyawa()
    {
        this("");
    }
    
    public Nyawa(String prefix)
    {
        text = prefix;
        stringLength = (text.length() + 2) * 10;
            
        setImage(new GreenfootImage(stringLength, 16));
        GreenfootImage images = getImage();
        images.setColor(new Color(255, 180, 150));
        updateImage();
    }
        
    public void act() {
        updateImage();
        if(value <= 0){
            Gameover go = new Gameover();
            this.getWorld().addObject(go, 159, 214);
        }
    }
    
    public static int lihatNyawa()
    {
        return value;
    }
    
    public static void setNyawa(int val){
        value = val;
    }
    
    public void updateImage()
    {
        GreenfootImage image = getImage();
        image.clear();
        image.drawString(text + value, 1, 12);
    }
}
