
package code;

import java.io.IOException;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;


public class splash extends Canvas{

    public splash() {
        setFullScreenMode(true);
    }

    protected void paint(Graphics g) {
        try {
            g.setColor(255, 255, 255);
            g.fillRect(0, 0, getWidth(), getHeight());
            
            int splash_scale; // just for beauty
            if(getHeight()<getWidth()){ // portrait
            splash_scale = (int)(getHeight()/1.5);
            }else{
            splash_scale = (int)(getWidth()/1.5);
            }
            g.drawImage(mainMIDlet.myOperations.rescaleImage(Image.createImage("/images/splash.png"),splash_scale,splash_scale), getWidth() / 2, getHeight() / 5, Graphics.TOP | Graphics.HCENTER);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
 
    public void backToGodTools()
    {
        try {
            Thread.sleep(3500);
        } catch (InterruptedException ex) {
        }
     Display.getDisplay(mainMIDlet.m).setCurrent(mainMIDlet.myMenu);
    }

}
