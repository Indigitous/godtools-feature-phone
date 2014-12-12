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
     
    public int drawTxt(Graphics g, Vector TxtToBePaint, int txtPlace_Y, int type, int screenwidth) { // 0 is title, 1 , is subtitle , 2 is content , 3 is end
        int padding = Font.getDefaultFont().getHeight(); // space down

        int liney = 0;

        if (type == 0) { // will draw z rect
            int bot = 0;
            for (int i = 0; i < TxtToBePaint.size(); i++) {
                bot = 5 + ((i) * g.getFont().getHeight());// 5 gap
            }
            g.setColor(255, 255, 255);
            g.fillRoundRect(-bot, txtPlace_Y + padding + 2, (int) (screenwidth * 0.95) + bot, bot + padding, (int) (bot * 0.75), (int) (bot * 0.75));
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

    public Page setPageContent(int id) {
        //English
        Page page = new Page();
        if (id == 0) {
            //Page Zero
            page.setTitle("Have you heard of the four spiritual laws?");
            page.setEnd("Just as there are physical laws that govern the physical universe, so are there spiritual laws that govern your relationship with God.");
        } else if (id == 1) {
            //page One
            page.setTitle("GOD LOVES YOU AND OFFERS A WONDERFUL PLAN FOR YOUR LIFE");
            page.setSubTitle1("God's Love");
            page.setContent1("For God so loved the world that He gave His one and only Son, that whoever believes in Him shall not perish but have eternal life. (John 3:16, NIV)");
            page.setSubTitle2("God's Plan");
            page.setContent2("[Christ speaking] \"I came that they might have life, and might have it abundantly\" [that it might be full and meaningful]. (John 10:10)");
            page.setEnd("Why is it that most people are not experiencing the abundant life?  Because...");
        } else if (id == 2) {
            //Page Two
            page.setTitle("MAN IS SINFUL AND SEPARATED FROM GOD.  THEREFORE, HE CANNOT KNOW AND EXPERIENCE GOD'S LOVE AND PLAN FOR HIS LIFE.");
            page.setSubTitle1("Man Is Sinful");
            page.setContent1("All have sinned and fall short of the glory of God.\"  (Romans 3:23)     Man was created to have fellowship with God; but, because of his own stubborn self-will, he chose to go his own independent way and fellowship with God was broken.  This self-will, characterized by an attitude of active rebellion or passive indifference, is an evidence of what the Bible calls sin.");
            page.setSubTitle2("Man Is Separated");
            page.setImage1("");
            page.setContent2("The wages of sin is death\" [spiritual separation from God].  (Romans 6:23) This diagram illustrates that God is holy and man is sinful.  A great gulf separates the two.  The arrows illustrate that man is continually trying to reach God and the abundant life through his own efforts, such as a good life, philosophy, or religion, but he inevitably fails.");
            page.setEnd("The third principle explains the only way to bridge this gulf...");
        } else if (id == 3) {
            //Page three
            page.setTitle("JESUS CHRIST IS GOD'S ONLY PROVISION FOR OUR SIN. THROUGH HIM ALONE WE CAN KNOW GOD PERSONALLY AND EXPERIENCE GOD'S LOVE AND PLAN.");
            page.setSubTitle1("He Died in Our Place");
            page.setContent1("God demonstrates His own love for us, in that while we were yet sinners, Christ died for us.\" (1 Corinthians 15:3-6)");
            page.setSubTitle2("He Rose From the Dead");
            page.setContent2("Christ died for our sins…He was buried…He was raised on the third day, according to the Scriptures…He appeared to Peter, then to the Twelve.  After that He appeared to more than five hundred…  (1 Corinthians 15:3-6)");
            page.setSubTitle3("He is the Only Way to God");
            page.setImage1("");
            page.setContent3("Jesus said to him, 'I am the way, and the truth, and the life; no one comes to the Father but through Me.'\"  (John 14:6)  This diagram illustrates that God has bridged the gulf that separates us from Him by sending His Son, Jesus Christ, to die on the cross in our place to pay the penalty for our sins.");
            page.setEnd("It is not enough just to know these three laws...");
        } else if (id == 4) {
            //Page Four
            page.setTitle("WE MUST INDIVIDUALLY RECEIVE JESUS CHRIST AS SAVIOR AND LORD; THEN WE CAN KNOW AND EXPERIENCE GOD'S LOVE AND PLAN FOR OUR LIVES.");
            page.setSubTitle1("We Must Receive Christ");
            page.setContent1("As many as received Him, to them He gave the right to become children of God, even to those who believe in His name (John 1:12)");
            page.setSubTitle2("We Receive Christ Through Faith");
            page.setContent2("By grace you have been saved through faith; and that not of yourselves, it is the gift of God; not as a result of works that no one should boast. (Ephesians 2:8,9)");
            page.setSubTitle3("When we receive Christ ...");
            page.setContent3("We experience a new birth. (Read John 3:1-8) ");
            page.setSubTitle4("We Receive Christ Through Personal Invitation");
            page.setContent4("[Christ speaking] \"Behold, I stand at the door and knock; if anyone hears My voice and opens the door, I will come in to him. (Revelation 3:20)");
            page.setSubTitle5("Receiving Christ involves ...");
            page.setContent5("... turning to God from self (repentance) and trusting Christ to come into our lives to forgive our sins and to make us what He wants us to be. Just to agree intellectually that Jesus Christ is the Son of God and that He died on the cross for our sins is not enough.  Nor is it enough to have an emotional experience.  We receive Jesus Christ by faith, as an act of the will.");
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
    
