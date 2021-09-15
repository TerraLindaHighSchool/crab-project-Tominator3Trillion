import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Game Over video
 * 
 * @Tommy Muller
 * @9/14/21
 */

public class GameOverVideo extends Actor {
    

    int frame2 = 0;
    int frame3 = 0;
    int frame = 0;
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
    
    int offset = 1;
    
    public void act() 
    {        
        
        setImage("black.png"); 
        if(tick ==200) {
            GreenfootSound speech = new GreenfootSound("eruption.mp3");
            speech.playLoop();
        }
        if(tick > 400) {
            try
                {
                    if(tick%10==1) {
                        frame += offset;
                    }
                    //System.out.println(repeat(4-((""+frame).length()), "0") + frame);
                    setImage("loss/" + repeat(4-((""+frame).length()), "0") + frame + ".png"); 
                    getImage().scale(852,480);
                    
                    
                    if(frame == 7) {
                        offset = -1;
                    } if(frame == 4) {
                        offset = 1;
                    }
                }
                catch (java.lang.IllegalArgumentException iae)
                {
                    
                }
        }
            tick++;

        getImage().scale(852,480);
    }
}
