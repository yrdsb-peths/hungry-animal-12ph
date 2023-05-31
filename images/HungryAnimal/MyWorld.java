import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The world our hero lives in.
 * 
 * @author Lily 
 * @version May 2023
 */
public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        
        //Create the Octopus object
        Octopus octopus = new Octopus();
        addObject(octopus, 300, 300);
        
        //Create a label
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        
        createStarfish();
    }
    /**
     * End the game and draw 'GameOver'
     */
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
    /**
     * Increase score
     */
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
    
    /**
     * Create a new starfish at random location at top of screen 
     */
    public void createStarfish()
    {
       Starfish starfish = new Starfish();
       int x = Greenfoot.getRandomNumber(600);
       int y = 0;
       addObject(starfish, x, y); 
    }
}
