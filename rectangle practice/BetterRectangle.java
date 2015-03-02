import java.awt.Rectangle

/**
 * Write a description of class BetterRectangle here.
 * 
 * Riley Wiest
 * 2/3/2015
 */
public class BetterRectangle extends Rectangle
{
    /** description of instance variable x (add comment for each instance variable) */


    /**
     * Default constructor for objects of class BetterRectangle
     */
    public BetterRectangle()
    {
        // initialise instance variables
        setLocation(5,5);
        setSize(5,5);
    }

    public int getPerimeter()
    {
        // put your code here
        int(height);
        int(width);
        int p = (height*2) + (width*2);
        return p;
    }
    
    public int getArea()
    {
        // put your code here
        int(height);
        int(width);
        int a = height*width;
        return a;
    }
}
