import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ButtonRefuse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonRefuse extends Universe
{
    /**
     * Act - do whatever the ButtonRefuse wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
     back=false;
    
    if (Greenfoot.mouseClicked(this))
        {
    back = true;  
        }
        
    }    
}
