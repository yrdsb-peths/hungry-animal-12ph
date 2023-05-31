import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Octopus, our hero.
 * 
 * @author Lily
 * @version May 2023
 */
public class Octopus extends Actor
{
    /**
     * Act - do whatever the Octopus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Octopus()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/10;
        int myNewWidth = (int)myImage.getWidth()/10;
        myImage.scale(myNewWidth,myNewHeight);
    }
    
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("left"))
        {
            move(-1);
        }
        else if (Greenfoot.isKeyDown("right"))
        {
            move(1);
        }
        
        // Remove starfish if Octopus eats it 
        eat();
    }
    
    /**
     * Eat the Starfish and spawn new apple if an apple is eaten
     */
    public void eat()
    {
        if(isTouching(Starfish.class))
        {
            removeTouching(Starfish.class);
            MyWorld world = (MyWorld) getWorld();
            world.createStarfish();
            world.increaseScore();
        }
    }
}
