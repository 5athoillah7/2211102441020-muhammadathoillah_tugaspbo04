import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

//import java.awt.Color;
//import java.awt.Graphics;
/**
 * Write a description of class Skor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Skor extends Actor
{
    //private static final Color textColor = new Color(255, 180, 150);
    private static int value = 0;
    private String text;
    private int stringLength;
    
    public Skor()
    {
        this("");
    }
    
    public Skor(String prefix)
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
    }
    
    public static int lihatSkor()
    {
        return value;
    }
    
    public static void setSkor(int val){
        value = val;
    }
    
    public void updateImage()
    {
        GreenfootImage image = getImage();
        image.clear();
        image.drawString(text + value, 1, 12);
    }
}
