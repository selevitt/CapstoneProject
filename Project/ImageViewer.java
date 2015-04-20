
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
}