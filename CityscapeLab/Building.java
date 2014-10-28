import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/**
 * Creates an instance of a building.
 * 
 * @author Mir Alishah (Shah) 
 * @version 10 October 2014
 */
public class Building
{
    /* Initializes x and y coordinates, height of building, and number of windows   */
    private int xLeft;
    private int yTop;
    private int height;
    private int window;
    /**
     * Initiates building object
     * 
     *@param    x   x coordinate of building
     *@param    y   y coordinate of building
     *@param    h   height of building
     *@param    winNum  number of windows per building
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
     * Creates a building with windows.
     *

     * @param    g2    object that draws building to the component 
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
