package Code;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class splashScreen extends Canvas{
Image splash;
Midlet main;
//private Image splash = null;
    public splashScreen(Midlet m) {
        main = m;
        //loadimage();
        setFullScreenMode(true);
    }


   /* public void loadimage(){
        try {
            splash= Image.createImage("/image/splash.jpg");
        } catch (IOException ex) {
           ex.printStackTrace();
        }
    }*/
     
      protected void paint(Graphics g) {
      int iViewH = this.getHeight();
      int iViewW = this.getWidth();

            // load the background image
        if (splash== null)
            {
            try {
              splash = CreateScaledImage(Image.createImage("/image/splash.png"), iViewW, iViewH);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            }
            // draw background
            if (splash!= null) {
            g.drawImage(splash, iViewW / 2, iViewH / 2,Graphics.VCENTER | Graphics.HCENTER );
        }
        
        /* int yDim, xDim, xDimImg, yDimImg, x, y;

        xDim = getWidth();
        yDim = getHeight();

        
            xDimImg = splash.getWidth();
            yDimImg = splash.getHeight();
            
            x = xDim/2;
            y = yDim/2;
           /* for (x = 0; x < xDim; x += xDimImg) {
                for (y = 0; y < yDim; y += yDimImg) {
                    g.drawImage (splash, 0, 0, Graphics.TOP|Graphics.LEFT);
                   

                //}
            //}*/
        }  
    
    

public static Image CreateScaledImage( Image imgOldImage, int iNewWidth, int iNewHeight )
    {

        Image imgNewImage = null;
        final int iOldWidth = imgOldImage.getWidth();
        final int iOldHeight = imgOldImage.getHeight();

        int iOldRGBArray[] = new int[iOldWidth * iOldHeight];

        imgOldImage.getRGB( iOldRGBArray, 0, iOldWidth, 0, 0, iOldWidth, iOldHeight);

        int iNewRGBArray[] = new int[iNewWidth * iNewHeight];

    for (int yy = 0; yy < iNewHeight; yy++)
    {
        int dy = yy * iOldHeight / iNewHeight;

        for (int xx = 0; xx < iNewWidth; xx++)
        {
            int dx = xx * iOldWidth / iNewWidth;

        iNewRGBArray[(iNewWidth * yy) + xx] = iOldRGBArray[(iOldWidth * dy) + dx];
        }
        }

        imgNewImage = Image.createRGBImage(iNewRGBArray, iNewWidth, iNewHeight, true);

        return imgNewImage;

}

        
       
       // g.drawImage(splash, 0, 0, Graphics.TOP|Graphics.LEFT);
          
}
