import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Player
 * 
 * @Tommy Muller
 * @9/14/21
 */

public class Cow extends Actor
{
    /**
     * Act - do whatever the Cow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public static GreenfootSound[] hurtNoises = new GreenfootSound[3];
    GreenfootSound music = new GreenfootSound("music.mp3");
    int tick =0;
    
    public Cow() {
        hurtNoises[0] = new GreenfootSound("cowhurt1.wav");
        hurtNoises[1] = new GreenfootSound("cowhurt2.wav");
        hurtNoises[2] = new GreenfootSound("cowhurt3.wav");
        
        
    }
    
    //private GreenfootSound hurt2 = new GreenfootSound("cowhurt2.wav");
    //private GreenfootSound hurt3 = new GreenfootSound("cowhurt3.wav");
    
    int inertiaX,inertiaY = 0;
    
    public void act()
    {
        if(tick == 0) {
            music.playLoop();
        }
        //turnAtEdge();
        checkKeyPress();
        onCollision();
        tick++;
        
        setLocation(getX()+inertiaX, getY()+inertiaY);
        if(tick % 20 == 1) {
            if(inertiaX != 0) {
                if(inertiaX<0) {
                    inertiaX++;
                } else {
                    inertiaX--;
                } 
            }
            
            if(inertiaY != 0) {
                if(inertiaY<0) {
                    inertiaY++;
                } else {
                    inertiaY--;
                } 
            }
            
            
            
        }
        
    }
    
    
    private void checkKeyPress() {
        if(Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("W")) {
            inertiaY = -5;
            
        }
    
        if(Greenfoot.isKeyDown("down") || Greenfoot.isKeyDown("S")) {
            inertiaY = 5;
        }
        
        if(Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("D")) {
            inertiaX = 5;
            
        }
    
        if(Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("A")) {
            inertiaX = -5;
        }
    }
    private void onCollision(){
        if(isTouching(Grass.class)) {
            removeTouching(Grass.class);
            Greenfoot.playSound("burp.wav");
            
            if(getWorld().getObjects(Grass.class).size()==0) {
                Greenfoot.setWorld(new WinScreen());
                music.stop();
                
                
                Greenfoot.playSound("endMusic.mp3");
                
                GreenfootSound speech = new GreenfootSound("savedSpeech.mp3");
                speech.play();
                //Greenfoot.stop();
            }
        }
        
        if(isTouching(Asteroid.class)) {
            hurtNoises[Greenfoot.getRandomNumber(3)].play();
            music.stop();
            Greenfoot.playSound("explosion.mp3");
            
            Greenfoot.setWorld(new LooseScreen());
            //Greenfoot.stop();
        }
    }
}
