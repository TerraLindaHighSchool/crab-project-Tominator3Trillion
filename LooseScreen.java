import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Loose screen
 * 
 * @Tommy Muller
 * @9/14/21
 */

public class LooseScreen extends World
{

    /**
     * Constructor for objects of class LooseScreen.
     * 
     */
    public LooseScreen()
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
        GameOverVideo gameOverVideo = new GameOverVideo();
        addObject(gameOverVideo,426,240);
    }
}
