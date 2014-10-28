import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author Mir Alishah (Shah)
 * @version 10 October 2014
 */
public class CityscapeComponent extends JComponent
{
    /**
     * Creates instances of classes and draws them in the frame.
     *
     * @param    g    allows you to draw objects
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        int width = getWidth();
        int height = getHeight();
        // create instances of classes and invoke the draw method on each
        // ...
        RoadGrassBack background  = new RoadGrassBack(400, width, height);
        Building building1 = new Building(30, 259, 150, 4);
        Building building2 = new Building(160, 209, 200, 6);
        Building building3 = new Building(290, 159, 250, 8);
        Building building4 = new Building(420, 109, 300, 10);
        Building building5 = new Building(550, 59, 350, 12);
        Building building6 = new Building(680, 9, 400, 14);
        background.draw(g2);
        building1.draw(g2);
        building2.draw(g2);
        building3.draw(g2);
        building4.draw(g2);
        building5.draw(g2);
        building6.draw(g2);
        
    }

}
