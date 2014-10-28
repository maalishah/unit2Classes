import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;

/**
 * Creates a window in the building class.
 * 
 * @author Mir Alishah (Shah) 
 * @version 10 October 2014
 */
public class Window
{
    /* Initializes x and y coordinates of windows */
    private int xLeft;
    private int yTop;

    /**
     * Initiates a window object for the building.
     * 
     *@param    x   x coordinate of building
     *@param    y   y coordinate of building
     */
    public Window(int x, int y)
    {
        // initialise instance variables
        this.xLeft = x;
        this.yTop = y;
    }

    /**
     * Creates windows in the building class
     * 
     * @param    g2    object that draws windows into the building
     */
    public void draw(Graphics2D g2)
    {
        Rectangle window = new Rectangle(this.xLeft, this.yTop, 30, 40);
        
        g2.setColor(Color.WHITE);
        g2.draw(window);
        g2.fill(window);
        
    }

}
