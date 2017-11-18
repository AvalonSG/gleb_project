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
    
     public void CheckChip(int x, int y)
       {
        if (getWorld().getObjectsAt(x,y, null).size()!=2) 
        {
            getWorld().addObject(new Letters() ,x, y);
        } 
        
        }
    public void act() 
    {
       
        play = false;
        if (Greenfoot.mouseClicked(this))
        {
       // Universe.letters.RefillLetters(7);
      
        
        
      
         System.out.println("PlayClicked");
         CheckChip(15,8);
         CheckChip(15,9);
         CheckChip(15,10);
         CheckChip(17,9);
         CheckChip(19,8); 
         CheckChip(19,9);
         CheckChip(19,10);
            
         System.out.println(getWorld().getObjectsAt(15,8, null).size() ) ;
        
        
        
       //   MyWorld.AddLetter(17,10); 
        play = true;
        
        }
    }    
}
