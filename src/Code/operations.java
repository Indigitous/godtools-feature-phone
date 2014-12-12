package Code;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Vector;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class operations {

    public String readFile(String book, int chapter) // read the txt file from resource
    {
        InputStream is = getClass().getResourceAsStream("/" + book + "." + chapter);
        StringBuffer sb = new StringBuffer();

        try {
            InputStreamReader isr = new InputStreamReader(is, "UTF-8");
            int chars;


            while ((chars = isr.read()) != -1) {
                sb.append((char) chars);
            }

            System.gc();
            return sb.toString();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.gc();
        return "Loading Error . . .";
    }

    public int drawTxt(Graphics g, Vector TxtToBePaint, int txtPlace_Y, int type, int screenwidth) { // 0 is title, 1 , is subtitle , 2 is content , 3 is end
        int padding = Font.getDefaultFont().getHeight(); // space down

        int liney = 0;

        if (type == 0) { // will draw z rect
            int bot = 0;
            for (int i = 0; i < TxtToBePaint.size(); i++) {
                bot = 5 + ((i) * g.getFont().getHeight());// 5 gap
            }
            g.setColor(255,255,255);
            g.fillRoundRect(-bot,  txtPlace_Y + padding + 2 , (int)(screenwidth*0.95) + bot, bot+padding,(int)(bot*0.75),(int)(bot*0.75));
        }
      

        if (type == 0) {// title red color // overwriten
            g.setColor(23, 129, 163);
        } else if (type == 1) {  // sub title  color
            g.setColor(255, 255, 255);
        } else if (type == 2) { // text color
            g.setColor(220, 220, 220);
        } else if (type == 3) { // end text color
            g.setColor(225, 225, 225);
        }

        for (int i = 0; i < TxtToBePaint.size(); i++) {
            liney = 5 + ((i) * g.getFont().getHeight());// 5 gap
            if (type == 1) { // if tytle or subtytle center the text
                g.drawString((String) TxtToBePaint.elementAt(i), screenwidth / 2 + 1, liney + txtPlace_Y + padding, g.TOP | g.HCENTER);
                g.drawString((String) TxtToBePaint.elementAt(i), screenwidth / 2, liney + txtPlace_Y + padding, g.TOP | g.HCENTER); // 2f is left padding
            } else {
                g.drawString((String) TxtToBePaint.elementAt(i), 3, liney + txtPlace_Y + padding, 0);//x =3 , y = 30
            }
        }
    
        return liney + txtPlace_Y + Font.getDefaultFont().getHeight(); // return the end of the text
    }

    public int drawImage(Graphics g, Image img, int width, int image_y) {
        int padding = Font.getDefaultFont().getHeight();

        g.drawImage(img, width / 2, image_y + padding + 4, g.TOP | g.HCENTER); // magic...didnt get but 4 pix up
        return (int) (img.getHeight() + image_y + 3); // one extra pix
    }

    static Vector wrap(String text, Font font, int width) {
        Vector result = new Vector();
        if (text == null) {
            return result;
        }

        boolean hasMore = true;

        // The current index of the cursor
        int current = 0;

        // The next line break index
        int lineBreak = -1;

        // The space after line break
        int nextSpace = -1;

        while (hasMore) {
            //Find the line break
            while (true) {
                lineBreak = nextSpace;
                if (lineBreak == text.length() - 1) {
                    // We have reached the last line
                    hasMore = false;
                    break;
                } else {
                    nextSpace = text.indexOf(' ', lineBreak + 1);
                    if (nextSpace == -1) {
                        nextSpace = text.length() - 1;
                    }
                    int linewidth = font.substringWidth(text, current, nextSpace - current);
                    // If too long, break out of the find loop
                    if (linewidth > width) {
                        break;
                    }
                }
            }
            String line = text.substring(current, lineBreak + 1);
            result.addElement(line);
            current = lineBreak + 1;
        }
        return result;
    }

    public Image rescaleImage(Image image, int width, int height) // if you want to scale images
    {
        int sourceWidth = image.getWidth();
        int sourceHeight = image.getHeight();
        Image newImage = Image.createImage(width, height);
        Graphics g = newImage.getGraphics();
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                g.setClip(x, y, 1, 1);
                int dx = x * sourceWidth / width;
                int dy = y * sourceHeight / height;
                g.drawImage(image, x - dx, y - dy, Graphics.LEFT | Graphics.TOP);
            }
        }
        return Image.createImage(newImage);
    }
}
