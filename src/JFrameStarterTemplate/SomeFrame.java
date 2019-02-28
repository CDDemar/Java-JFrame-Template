package JFrameStarterTemplate;

import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;

/**
 *
 * @author user
 */
public class SomeFrame extends JFrame{
    
    public static final Dimension SCREEN_SIZE = 
        Toolkit.getDefaultToolkit().getScreenSize();
    
    public SomeFrame() throws HeadlessException {  }
    
    public SomeFrame(String title) throws HeadlessException {
        super(title);   
    }
    
    public final void init(){
        setLayout(new java.awt.GridBagLayout());
        setSize(SCREEN_SIZE);
        setUndecorated(true);
        setResizable(false);
        setTitle("Some Title");
        Image icon = new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB);
        setIconImage(icon);
        getContentPane().setBackground(java.awt.Color.black);
        setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);        
//        setGUI();        
        setVisible(true);
    }
    
    public static SomeFrame create(){
        SomeFrame sf = new SomeFrame();
        sf.init();
        return sf;
    }
}
