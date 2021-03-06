import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
public class TriangleFrame extends JFrame
{
    private TriangleComponent scene;
    class MousePressListener implements MouseListener
    {
        public void mousePressed(MouseEvent event)
        {
            int x = event.getX();
            int y = event.getY();
            scene.moveTriangleTo(x,y);
        }

        public void mouseReleased(MouseEvent event) {}
        public void mouseClicked(MouseEvent event) {}
        public void mouseEntered(MouseEvent event) {}
        public void mouseExited(MouseEvent event) {}
    }
    public TriangleFrame()
    {
        scene = new TriangleComponent();
        add(scene);

        MouseListener listener = new MousePressListener();
        scene.addMouseListener(listener);
    }

}
