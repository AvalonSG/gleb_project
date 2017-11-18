import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.*;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class MyWorld extends World
{
    public static MyWorld self;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(20, 15, 32);
        self = this;

        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {


   
        menu menu = new menu();
        addObject(menu,18,7);
        menu.setLocation(17,7);
        ButtonRefuse buttonrefuse = new ButtonRefuse();
        addObject(buttonrefuse,17,1);
        ButtonPlay buttonplay = new ButtonPlay();
        addObject(buttonplay,17,5);
        buttonplay.setLocation(18,5);
        buttonrefuse.setLocation(17,1);
        buttonplay.setLocation(17,5);
        Letters letters0 = new Letters();
        addObject(letters0,15,8);
        Letters letters2 = new Letters();
        addObject(letters2,15,9);
        Letters letters3 = new Letters();
        addObject(letters3,15,10);
        Letters letters4 = new Letters();
        addObject(letters4,17,9);
        Letters letters5 = new Letters();
        addObject(letters5,19,8);
        Letters letters6 = new Letters();
        addObject(letters6,19,9);
        Letters letters7 = new Letters();
        addObject(letters7,19,10);
        
        
    }
    public static void AddLetter (int x , int y)
    {
        Letters letters7 = new Letters();
        MyWorld.self.addObject(letters7,19,10);
    }
}
