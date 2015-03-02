import javax.swing.JFrame;
public class TriangleViewer
{
    public static void main(String[] args)
    {
        TriangleFrame frame = new TriangleFrame();
        frame.setSize(800 /* x */, 600 /* y */);
        frame.setTitle("Triangle Window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        frame.setVisible(true);
    }

}
