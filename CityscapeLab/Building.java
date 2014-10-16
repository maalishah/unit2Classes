import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/**
 * Write a description of class Building here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Building
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;
    private int yTop;
    private int height;
    private int window;
    /**
     * Default constructor for objects of class Building
     */
    public Building(int x, int y, int h, int winNum)
    {
        // initialise instance variables
        this.xLeft = x;
        this.yTop = y;
        this.height = h;
        this.window = winNum;
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
        Rectangle building = new Rectangle(this.xLeft, this.yTop, 100, this.height);
        
        int winX;
        int winY = this.yTop + 10;
        int count = 0;
        
        int winW = 30;
        int winH = 40;
        
        g2.setColor(Color.BLACK);
        g2.fill(building);
        g2.draw(building);
        
        
        for (int i = 0; i < window; i += 1)
        {
            count += 1;
            if (count == 1)
            {
                winX = this.xLeft + 15;
            }
            else if (count == 2)
            {
                winX = this.xLeft + 100 - 15 - 30;
            }
            else
            {
                winX = this.xLeft + 15;
                count = 1;
                winY += 10+winH;
            }
            
            Window win = new Window(winX, winY);
            win.draw(g2);
        }
        
        
        Rectangle door = new Rectangle(this.xLeft + 35, this.yTop + this.height-40, 30, 40);
        Ellipse2D.Double doorKnob = new Ellipse2D.Double(xLeft + 57, yTop+this.height-20, 5, 5);
        
        g2.setColor(Color.WHITE);
        g2.fill(door);
        g2.draw(door);
        g2.setColor(Color.BLACK);
        g2.fill(doorKnob);
        g2.draw(doorKnob);
        
    }

}
