package Code;

import javax.microedition.lcdui.Display;
import javax.microedition.midlet.*;

public class Midlet extends MIDlet {

    Display d;
    fourLawsCanvas fourL;
    Splash mysplashscreen = new Splash(this);
    menu myMenu;
    public static operations myOperations = new operations();
    public static fourLawsCanvas myContentCanvas = new fourLawsCanvas();
   
    public Midlet() {
    }

    public void startApp() {

        fourL = new fourLawsCanvas();
        fourL.repaint();

        myMenu = new menu(this);
        d = Display.getDisplay(this);
        d.setCurrent(mysplashscreen);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        d.setCurrent(this.myMenu);
    }

    public void pauseApp() {
    }

    public void destroyApp(boolean unconditional) {
    }
}
