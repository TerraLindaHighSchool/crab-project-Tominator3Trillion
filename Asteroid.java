import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Enemy of player
 * 
 * @Tommy Muller
 * @9/14/21
 */
public class Asteroid extends Actor
{
    /**
     * Act - do whatever the Asteroid wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Asteroid() {
        turn(Greenfoot.getRandomNumber(360));
    }
    public void act()
    {
        move(3);
        turnAtEdge();

    }
    
    public void turnAtEdge() {
        if(isAtEdge()) {
            turn(50);
        }
    }
}
