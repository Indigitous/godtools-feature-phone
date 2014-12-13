package Code;

import javax.microedition.lcdui.Display;
import javax.microedition.midlet.*;

public class mainMidlet extends MIDlet {

    public static mainMidlet m;
    public Splash mysplash = new Splash();
    public static operations myOperations = new operations();
    public static menu myMenu = new menu();
    public static fourLawsCanvas myFourLawsCanvas = new fourLawsCanvas();

    public mainMidlet() {
        m = this;
        Display.getDisplay(this).setCurrent(mysplash);
        mysplash.backToGodTools();
    }

    public void startApp() {
    }

    public void pauseApp() {
    }

    public void destroyApp(boolean unconditional) {
    }
}
