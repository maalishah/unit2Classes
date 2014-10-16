import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/**
 * Write a description of class Road here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RoadGrassBack
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;
    private int yTop;
    private int width;
    private int height;

    /**
     * Default constructor for objects of class Road
     */
    public RoadGrassBack(int x, int y, int w, int h)
    {
        // initialise instance variables
        xLeft = x;
        yTop = y;
        width = w;
        height = h;
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
        Rectangle road = new Rectangle(xLeft, yTop + 10, 800, 100);
        Rectangle line1 = new Rectangle(xLeft + 25, yTop + 50, 60, 10); 
        Rectangle line2 = new Rectangle(xLeft + 150, yTop + 50, 60, 10);
        Rectangle line3 = new Rectangle(xLeft + 275, yTop + 50, 60, 10);
        Rectangle line4 = new Rectangle(xLeft + 400, yTop + 50, 60, 10);
        Rectangle line5 = new Rectangle(xLeft + 525, yTop + 50, 60, 10);
        Rectangle line6 = new Rectangle(xLeft + 650, yTop + 50, 60, 10);
        Rectangle line7 = new Rectangle(xLeft + 775, yTop + 50, 60, 10);
        
        Rectangle back = new Rectangle(0, 0, width, height-100);
        g2.setColor(Color.cyan);
        g2.fill(back);
        g2.draw(back);
        
        Rectangle grass = new Rectangle(0, height-100, width, height);
        g2.setColor(Color.green);
        g2.fill(grass);
        g2.draw(grass);
        
        g2.setColor(Color.black);
        g2.draw(road);
        g2.fill(road);
        g2.draw(line1);
        g2.draw(line2);
        g2.draw(line3);
        g2.draw(line4);
        g2.draw(line5);
        g2.draw(line6);
        g2.draw(line7);
        g2.setColor(Color.yellow);
        g2.fill(line1);
        g2.fill(line2);
        g2.fill(line3);
        g2.fill(line4);
        g2.fill(line5);
        g2.fill(line6);
        g2.fill(line7);
        
    }

}
