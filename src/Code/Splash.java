package Code;

import java.io.IOException;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class Splash extends Canvas {

    Midlet main;

    public Splash(Midlet m) {
        main = m;
        setFullScreenMode(true);
    }

    protected void paint(Graphics g) {
        try {
            g.setColor(255, 255, 255);
            g.fillRect(0, 0, getWidth(), getHeight());
            int i = 0;
            g.drawImage(Image.createImage("/image/splash.png"), getWidth() / 2, getHeight() / 5, Graphics.TOP | Graphics.HCENTER);

        } catch (IOException ex) {
        }
    }
}
