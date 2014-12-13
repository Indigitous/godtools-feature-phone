
package Code;

import java.io.IOException;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;


public class menu extends Canvas{

    int screenWidth;
    int screenHeight;

    int selectionPlace = 0;// 0,1,2,3
    int smallestSize = 0;


    Image godToolsLogo; // top logo

    Image knowingGodImg;
    Image satisfaiedImg;
    Image fourLawsImg;
    Image everyStudentImg;

    public menu() {
        setFullScreenMode(true);

        screenWidth = getWidth();
        screenHeight = getHeight();

        if((int)(screenHeight*0.8) > screenWidth){
            smallestSize = (int)(screenWidth*0.5);
        }else{
            smallestSize = (int)(screenHeight*0.4);
        }

        try {
            godToolsLogo = Image.createImage("images/icon.png");
            godToolsLogo = mainMidlet.myOperations.rescaleImage(godToolsLogo, (int)(screenHeight*.20), (int)(screenHeight*.20));

            knowingGodImg = Image.createImage("images/knowingGod_icon.png");
            satisfaiedImg = Image.createImage("images/satisfied_icon.png");
            fourLawsImg = Image.createImage("images/fourLaws_icon.png");
            everyStudentImg = Image.createImage("images/everyStudent_icon.png");

           knowingGodImg = mainMidlet.myOperations.rescaleImage(knowingGodImg, smallestSize, smallestSize);
           satisfaiedImg = mainMidlet.myOperations.rescaleImage(satisfaiedImg, smallestSize, smallestSize);
           fourLawsImg = mainMidlet.myOperations.rescaleImage(fourLawsImg, smallestSize, smallestSize);
           everyStudentImg = mainMidlet.myOperations.rescaleImage(everyStudentImg, smallestSize, smallestSize);

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    protected void paint(Graphics g) {
        g.setColor(52,32,32);
        g.fillRect(0, 0, screenWidth, screenHeight);

        g.drawImage(godToolsLogo, screenWidth/2, (screenHeight-smallestSize*2-godToolsLogo.getHeight())/2, g.TOP|g.HCENTER);

         g.drawImage(knowingGodImg,screenWidth/2-smallestSize,screenHeight-smallestSize*2,g.LEFT|g.TOP);
         g.drawImage(satisfaiedImg,(int)(screenWidth*0.5),screenHeight-smallestSize*2,g.LEFT|g.TOP);
         g.drawImage(fourLawsImg,screenWidth/2-smallestSize,screenHeight-smallestSize,g.LEFT|g.TOP);
         g.drawImage(everyStudentImg,(int)(screenWidth*0.5),screenHeight-smallestSize,g.LEFT|g.TOP);
    }

    protected void keyPressed(int keyCode) {
        super.keyPressed(keyCode);
    }




}
