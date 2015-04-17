import javax.swing.JFrame;

/**
 * Write a description of class RegisterViewer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RegisterViewer
{
    public static void main(String[] args)
    {
        // create and configure the frame (window) for the program
        JFrame frame = new JFrame();
        
        frame.setSize(800 /* x */, 600 /* y */);
        frame.setTitle("Register");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // a frame contains a single component; create the Cityscape component and add it to the frame
        RegisterComponent component = new RegisterComponent();
                         
        // make the frame visible which will result in the paintComponent method being invoked on the
        //  component.
        frame.setVisible(true);

    }
}