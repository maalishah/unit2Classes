import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;

/**
 * Write a description of class Road here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Window
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;
    private int yTop;

    /**
     * Default constructor for objects of class Road
     */
    public Window(int x, int y)
    {
        // initialise instance variables
        this.xLeft = x;
        this.yTop = y;
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void draw(Graphics2D g2)
    {
        Rectangle window = new Rectangle(this.xLeft, this.yTop, 30, 40);
        
        g2.setColor(Color.WHITE);
        g2.draw(window);
        g2.fill(window);
        
    }

}
