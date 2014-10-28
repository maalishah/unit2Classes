import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/**
 * Creates an instance of a road, grass, and a background.
 * 
 * @author Mir Alishah (Shah) 
 * @version 10 October 2014
 */
public class RoadGrassBack
{
    /* Initializes y coordinate, width, and heigh of a road, grass, and background */
    private int yTop;
    private int width;
    private int height;

    /**
     *@param    y   y coordinate of road, or grass, or background
     *@param    w   width of road, grass, or background
     *@param    h   heigh of road, grass, or background
     */
    public RoadGrassBack(int y, int w, int h)
    {
        /*  */
        yTop = y;
        width = w;
        height = h;
    }

    /**
     * Creates a road, grass, and background
     *
     * @param    g2    draws a road, grass, and background in to the component
     */
    public void draw(Graphics2D g2)
    {
        Rectangle road = new Rectangle( 0, yTop + 10, 800, 100);
        Rectangle line1 = new Rectangle(  25, yTop + 50, 60, 10); 
        Rectangle line2 = new Rectangle(   150, yTop + 50, 60, 10);
        Rectangle line3 = new Rectangle(   275, yTop + 50, 60, 10);
        Rectangle line4 = new Rectangle(   400, yTop + 50, 60, 10);
        Rectangle line5 = new Rectangle(   525, yTop + 50, 60, 10);
        Rectangle line6 = new Rectangle(   650, yTop + 50, 60, 10);
        Rectangle line7 = new Rectangle(   775, yTop + 50, 60, 10);
        
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
