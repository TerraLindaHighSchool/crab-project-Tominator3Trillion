import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Game scene
 * 
 * @Tommy Muller
 * @9/14/21
 */

public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(852, 480, 1); 

        GreenfootImage bg = new GreenfootImage("0001.png");
        
        bg.scale(852,480);
        
        this.setBackground(bg);
        
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Cow cow = new Cow();
        addObject(cow,308,178);
        Grass grass = new Grass();
        addObject(grass,273,231);
        Asteroid asteroid = new Asteroid();
        addObject(asteroid,510,70);
        Asteroid asteroid2 = new Asteroid();
        addObject(asteroid2,87,327);
        Grass grass2 = new Grass();
        addObject(grass2,556,298);
        Grass grass3 = new Grass();
        addObject(grass3,517,178);
        Grass grass4 = new Grass();
        addObject(grass4,306,324);
        Grass grass5 = new Grass();
        addObject(grass5,265,106);
        Grass grass6 = new Grass();
        addObject(grass6,379,73);
        Grass grass7 = new Grass();
        addObject(grass7,89,124);
        Grass grass8 = new Grass();
        addObject(grass8,154,58);
        Grass grass9 = new Grass();
        addObject(grass9,138,227);
        Grass grass10 = new Grass();
        addObject(grass10,162,320);
        Grass grass11 = new Grass();
        addObject(grass11,27,246);
        Grass grass12 = new Grass();
        addObject(grass12,403,245);
        Asteroid asteroid3 = new Asteroid();
        addObject(asteroid3,459,332);
        Asteroid asteroid4 = new Asteroid();
        addObject(asteroid4,72,154);
        Asteroid asteroid5 = new Asteroid();
        addObject(asteroid5,738,65);
        Asteroid asteroid6 = new Asteroid();
        addObject(asteroid6,728,411);
        Asteroid asteroid7 = new Asteroid();
        addObject(asteroid7,149,414);
        Grass grass13 = new Grass();
        addObject(grass13,637,179);
        Grass grass14 = new Grass();
        addObject(grass14,731,202);
        Grass grass15 = new Grass();
        addObject(grass15,639,75);
        Grass grass16 = new Grass();
        addObject(grass16,716,315);
        Grass grass17 = new Grass();
        addObject(grass17,595,423);
        Grass grass18 = new Grass();
        addObject(grass18,393,419);
        Grass grass19 = new Grass();
        addObject(grass19,229,433);
    }
}
