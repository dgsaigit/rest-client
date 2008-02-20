package org.wiztools.restclient;

import javax.swing.ImageIcon;
import org.wiztools.restclient.ui.RESTFrame;
import javax.swing.SwingUtilities;
import org.wiztools.restclient.ui.SplashScreen;

/**
 *
 * @author Subhash
 */
public class Main {
    
    public static final String TITLE = "WizTools.org RESTClient ";
    public static final String VERSION = "2.1";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // SplashScreen display
        ImageIcon ii = new ImageIcon(Main.class.getClassLoader().getResource("org/wiztools/restclient/Splash.png"));
        final SplashScreen ss = new SplashScreen(ii);
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                ss.setVisible(true);
            }
        });
        
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new RESTFrame(TITLE + VERSION);
            }
        });
        
        // SplashScreen dispose
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                ss.setVisible(false);
                ss.dispose();
            }
        });
    }

}
