import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Food for our Octopus
 * 
 * @author Lily 
 * @version May 2023
 */
public class Starfish extends Actor
{
    /**
     * Act - do whatever the Starfish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        int x = getX();
        int y = getY() + 2;
        setLocation(x, y);
        
        // Remove starfish and draw game over when apple gets to bottom
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
}
