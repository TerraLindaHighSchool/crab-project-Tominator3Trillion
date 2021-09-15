import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Food for player
 * 
 * @Tommy Muller
 * @9/14/21
 */

public class Grass extends Actor
{
    /**
     * Act - do whatever the Grass wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    
    public Grass() {
        GreenfootImage grass = new GreenfootImage("grass.png");
        grass.scale(50, 50);
        setImage(grass);
    }
    
    public void act()
    {
        // Add your action code here.
    }
}
