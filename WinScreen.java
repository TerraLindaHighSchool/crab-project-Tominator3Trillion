import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Win screen
 * 
 * @Tommy Muller
 * @9/14/21
 */

public class WinScreen extends World
{

    /**
     * Constructor for objects of class WinScreen.
     * 
     */
    public WinScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(852, 480, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Video video = new Video();
        addObject(video,426,240);
    }
}
