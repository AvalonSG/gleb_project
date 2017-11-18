import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ButtonPlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonPlay extends Universe
{
    /**
     * Act - do whatever the ButtonPlay wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
  
        play = false;
        if (Greenfoot.mouseClicked(this))
        {
        Universe.letters.RefillLetters(7);
         System.out.println("PlayClicked");
         Letters letters0 = new Letters();
          getWorld().addObject(letters0,19,11);
          
        
        
       //   MyWorld.AddLetter(17,10);
        play = true;
        
        }
    }    
}
