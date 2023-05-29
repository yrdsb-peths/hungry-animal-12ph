import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Elephant, our hero.
 * 
 * @author Lily 
 * @version May 2023
 */
public class Elephant extends Actor
{
    GreenfootSound elephantSound = new GreenfootSound("/sounds/elephantcub.mp3");
    
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("left"))
        {
            move(-1);
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(1);
        }
        
        // Remove apple if elephant eats it
    }
    
    /**
     * Eat the apple and spawn new apple if an apple is eaten
     */
    public void eat()
    {
       if(isTouching(Apple.class))
       {
       removeTouching(Apple.class); 
       MyWorld world = (MyWorld) getWorld();
       world.creatApple();
       world.increaseScore();
       elephantSound.play();
       }
    }
}
