import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Win video
 * 
 * @Tommy Muller
 * @9/14/21
 */



public class Video extends Actor
{
    public static World world;
    int frame2 = 0;
    int frame3 = 0;
    int frame = 45;
    int frameH = 9;
    int frame2H = 100;
    int time = 0;
    String name ="video(";
    String brak = ")";
    boolean stop = false;
    int tick = 0;
    
    /**
     * Act - do whatever the video wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    
    public static String repeat(int count, String with) {
    return new String(new char[count]).replace("\0", with);
    }
    
    public Video() {
        world =getWorld();
        
        
        
    }
    
    public void act() 
    {        
        
        if(Greenfoot.getRandomNumber(75) == 1) {
            Cow.hurtNoises[Greenfoot.getRandomNumber(3)].play();
        }
        
        try
            {
                if(tick%10==1) {
                    frame ++;
                }
                //System.out.println(repeat(4-((""+frame).length()), "0") + frame);
                setImage("win/" +repeat(4-((""+frame).length()), "0") + frame + ".png"); 
                getImage().scale(852,480);
            }
            catch (java.lang.IllegalArgumentException iae)
            {
                
            }
            tick++;

        getImage().scale(852,480);
    }
}
