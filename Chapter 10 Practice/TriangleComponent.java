
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;
public class TriangleComponent extends JComponent
{
    private ArrayList<Point2D.Double> arrayList;
    public TriangleComponent()
    {
        this.arrayList = new ArrayList<Point2D.Double>();
    }
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent( g);
        Graphics2D g2 = (Graphics2D) g;

        if (arrayList.size() == 2)
        {
            Line2D.Double line1 = new Line2D.Double(arrayList.get(0), arrayList.get(1));
            g2.draw(line1);
        }
        if(arrayList.size() == 3)
        {
            Line2D.Double line2 = new Line2D.Double(arrayList.get(0), arrayList.get(2));
            Line2D.Double line3 = new Line2D.Double(arrayList.get(1), arrayList.get(2));
            Line2D.Double line1 = new Line2D.Double(arrayList.get(0), arrayList.get(1));
            g2.draw(line1);
            g2.draw(line2);
            g2.draw(line3);
        }
        if(arrayList.size() >3)
        {
            Line2D.Double line1 = new Line2D.Double(arrayList.get(arrayList.size()-3), arrayList.get(arrayList.size()-2));
            Line2D.Double line2 = new Line2D.Double(arrayList.get(arrayList.size()-3), arrayList.get(arrayList.size()-1));
            Line2D.Double line3 = new Line2D.Double(arrayList.get(arrayList.size()-2), arrayList.get(arrayList.size()-1));
            g2.draw(line1);
            g2.draw(line2);
            g2.draw(line3);
        }
    }
    
    public void moveTriangleTo(int x, int y)
    {
        Point2D.Double point = new Point2D.Double(x,y);
        arrayList.add(point);
        repaint();
    }
}