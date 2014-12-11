package Code;

import java.io.IOException;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class menu extends Canvas {

    Midlet main;
    Image back;
    Image choose;
    int mychoice = 0;

    public menu(Midlet m) {
        main = m;
        setFullScreenMode(true);
    }

    protected void paint(Graphics g) {
        int iViewH = this.getHeight();
        int iViewW = this.getWidth();
        int x = iViewW / 2;
        int y = iViewH / 2;

        // load the background image
        if (back == null && choose == null) {
            try {
                back = Image.createImage("/image/menuback.jpg");
                back = Actions.CreateScaledImage(back, iViewW, iViewH);
                choose = Image.createImage("/image/selector.png");
                choose = Actions.CreateScaledImage(choose, 168, iViewH / 9);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        // draw background
        if (back != null) {
            g.drawImage(back, x, y, Graphics.VCENTER | Graphics.HCENTER);
            //g.drawImage(choose, x+15, y+84, g.LEFT|g.TOP);
        }
        //.drawImage (back, x, y, Graphics.TOP|Graphics.LEFT);
        if (choose != null) {
            if (mychoice == 0) {//83
                g.drawImage(choose, iViewW / 4, iViewH / 4 + 6, Graphics.TOP | Graphics.LEFT);
            } else if (mychoice == 1) {
                g.drawImage(choose, iViewW / 4, iViewW / 2, Graphics.TOP | Graphics.LEFT);
            } else if (mychoice == 2) {
                g.drawImage(choose, iViewW / 4, iViewH / 2, Graphics.TOP | Graphics.LEFT);
            } else if (mychoice == 3) {
                g.drawImage(choose, iViewW / 4, iViewW / 2 + iViewH / 4, Graphics.TOP | Graphics.LEFT);
            }
            /* else if (mychoice == 4){
             g.drawImage(choose, iViewW/4,iViewW, Graphics.TOP|Graphics.LEFT);
             }*/
        }
        //g.drawImage(back, 0, 0, Graphics.LEFT|Graphics.TOP);
    }

    protected void keyPressed(int keyCode) {
        super.keyPressed(keyCode);

        if (getGameAction(keyCode) == DOWN && mychoice == 0) {
            mychoice = 1;
        } else if (getGameAction(keyCode) == UP && mychoice == 1) {
            mychoice = 0;
        } else if (getGameAction(keyCode) == DOWN && mychoice == 1) {
            mychoice = 2;
        } else if (getGameAction(keyCode) == UP && mychoice == 2) {
            mychoice = 1;
        } else if (getGameAction(keyCode) == DOWN && mychoice == 2) {
            mychoice = 3;
        } else if (getGameAction(keyCode) == UP && mychoice == 3) {
            mychoice = 2;
        }
        /*else if(getGameAction(keyCode) == DOWN && mychoice == 3){
         mychoice = 4;
         }else if(getGameAction(keyCode) == UP && mychoice == 4){
         mychoice = 3;
         */
        if (getGameAction(keyCode) == FIRE) {
            if (mychoice == 0) {
                // Display.getDisplay(main).setCurrent(main.knowingGodPersonaly);
            } else if (mychoice == 1) {
                Display.getDisplay(main).setCurrent(main.fourL);
            } else if (mychoice == 2) {
                // Display.getDisplay(main).setCurrent(main.satisfiedbyG);
            } else if (mychoice == 3) {
                // Display.getDisplay(main).setCurrent(main.eStudent);
            }
            /*else if (mychoice == 4){
             Display.getDisplay(main).setCurrent(main.coonectingG);
             }*/

        } else if (keyCode == -6) {
            main.notifyDestroyed();

        }
        repaint();
    }
}
