
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ImageViewer
{
    private JFrame frame;

   /**
       * Create an ImageViewer show it on screen.
         */
        public ImageViewer()
        {
            makeFrame();
        }
        
        private void makeFrame()
        {
            frame = new JFrame("ImageViewer");
            Container contentPane = frame.getContentPane();
    
            JLabel label = new JLabel("I am a label.");
            contentPane.add(label);
            frame.pack();
            frame.setVisible(true);
   }
   private void makeMenuBar(JFrame frame)
    {
        JMenuBar menubar = new JMenuBar();
        frame.setJMenuBar(menubar);

        // create the File menu
        JMenu fileMenu = new JMenu("File");
        menubar.add(fileMenu);

        JMenuItem openItem = new JMenuItem("Open");
        fileMenu.add(openItem);
        JMenuItem quitItem = new JMenuItem("Quit");
        fileMenu.add(quitItem);
    }
}