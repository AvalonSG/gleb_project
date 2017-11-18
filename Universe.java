import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Universe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Universe extends Actor
{
    public static char places[][] = new char[15][15];
    public static boolean mark = false ; 
    public static boolean play = false;
    public static boolean back = false;
    public static int score = 0 ; 
    public static Letters letters = new Letters();
    public Universe() 
    {
    
     /*  for (int i =0;i<=14;i++)
            {
           for (int j =0;j<=14;j++) 
             {
                 places[i][j]=0; 
           
                }
            }*/
    }
    /**
     * Act - do whatever the Universe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
