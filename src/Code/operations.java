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

    public String readJson(String file) // read the txt file from resource
    {
        InputStream is = getClass().getResourceAsStream(file);
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
        return "Loading Error ...";
    }

    public int drawTxt(Graphics g, Vector TxtToBePaint, int txtPlace_Y, int type, int screenwidth, int page) { // 0 is title, 1 , is subtitle , 2 is content , 3 is end
        int padding = Font.getDefaultFont().getHeight(); // space down
        int liney = 0;

        if (type == 0) { // will draw  round rect for tytle
            int bot = 0;
            for (int i = 0; i < TxtToBePaint.size(); i++) {
                bot = 5 + ((i) * g.getFont().getHeight());// 5 gap
            }
            g.setColor(255, 255, 255);
            g.fillRoundRect(-bot, txtPlace_Y + padding + 2, (int) (screenwidth * 0.95) + bot, bot + padding, (int) (bot * 0.75), (int) (bot * 0.75));
        }

        if (type == 0) {// change title color // based on the page
            if (page == 0) { // home
                g.setColor(0, 117, 154); // the background
            } else if (page == 1) { // law 1
                g.setColor(0, 117, 154); // the background
            } else if (page == 2) { // law 2
                g.setColor(240, 171, 0); // the background
            } else if (page == 3) { // law 3
                g.setColor(162, 173, 0); // the background
            } else if (page == 4) { // law 4
                g.setColor(188, 17, 17); // the background
            } else if (page == 5) { // kind of lives
                g.setColor(217, 94, 0); // the background
            } else if (page == 6) { // prayer
                g.setColor(0, 117, 154); // the background
            } else if (page == 7) { // christ in u
                g.setColor(240, 171, 0);
            } else if (page == 8) { // u have christ
                g.setColor(162, 173, 0);
            } else if (page == 9) { // suggestion
                g.setColor(188, 17, 17); // the background
            } else if (page == 10) { // links
                g.setColor(217, 94, 0);
            }
        } else if (type == 1) {  // sub title  color
            g.setColor(255, 255, 255);
        } else if (type == 2) { // text color
            g.setColor(220, 220, 220);
        } else if (type == 3) { // end text color
            g.setColor(255, 255, 255);
            txtPlace_Y += padding; // add a space on top for the end
        }

        for (int i = 0; i < TxtToBePaint.size(); i++) {
            liney = 5 + ((i) * g.getFont().getHeight());// 5 gap
            if (type == 1) { // if tytle or subtytle center the text
                g.drawString((String) TxtToBePaint.elementAt(i), screenwidth / 2 + 1, liney + txtPlace_Y + padding, g.TOP | g.HCENTER);
                g.drawString((String) TxtToBePaint.elementAt(i), screenwidth / 2, liney + txtPlace_Y + padding, g.TOP | g.HCENTER); // 2f is left padding
            } else {
                g.drawString((String) TxtToBePaint.elementAt(i), 2, liney + txtPlace_Y + padding, 0);//x =3 , y = 30
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

    public Page setPageContent(int id) {
        //English
        Page page = new Page();
        if (id == 0) {
            page.fromJSON(readJson("/Assets/fourLaws/en/page1.json"));
        } else if (id == 1) {
            page.fromJSON(readJson("/Assets/fourLaws/en/page2.json"));
        } else if (id == 2) {
            page.fromJSON(readJson("/Assets/fourLaws/en/page3.json"));
        } else if (id == 3) {
            page.fromJSON(readJson("/Assets/fourLaws/en/page4.json"));
        } else if (id == 4) {
            page.fromJSON(readJson("/Assets/fourLaws/en/page5.json"));
        } else if (id == 5) {
            page.fromJSON(readJson("/Assets/fourLaws/en/page6.json"));
        } else if (id == 6) {
            page.fromJSON(readJson("/Assets/fourLaws/en/page7.json"));
        }else if (id == 7) {
            page.fromJSON(readJson("/Assets/fourLaws/en/page8.json"));
        }else if (id == 8) {
            page.fromJSON(readJson("/Assets/fourLaws/en/page9.json"));
        }else if (id == 9) {
            page.fromJSON(readJson("/Assets/fourLaws/en/page10.json"));
        }

        return page;
    }

    public static Image CreateScaledImage(Image imgOldImage, int iNewWidth, int iNewHeight) {
        Image imgNewImage = null;
        final int iOldWidth = imgOldImage.getWidth();
        final int iOldHeight = imgOldImage.getHeight();

        int iOldRGBArray[] = new int[iOldWidth * iOldHeight];

        imgOldImage.getRGB(iOldRGBArray, 0, iOldWidth, 0, 0, iOldWidth, iOldHeight);

        int iNewRGBArray[] = new int[iNewWidth * iNewHeight];

        for (int yy = 0; yy < iNewHeight; yy++) {
            int dy = yy * iOldHeight / iNewHeight;

            for (int xx = 0; xx < iNewWidth; xx++) {
                int dx = xx * iOldWidth / iNewWidth;

                iNewRGBArray[(iNewWidth * yy) + xx] = iOldRGBArray[(iOldWidth * dy) + dx];
            }
        }
        imgNewImage = Image.createRGBImage(iNewRGBArray, iNewWidth, iNewHeight, true);
        return imgNewImage;
    }
}
    
