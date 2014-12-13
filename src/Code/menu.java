
package code;

import java.io.IOException;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;


public class menu extends Canvas{

    int screenWidth;
    int screenHeight;
    
    int selectionPlace = 0;// 0,1,2,3
    int smallestSize = 0; // for image calculation

    
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
            godToolsLogo = mainMIDlet.myOperations.rescaleImage(godToolsLogo, (int)(screenHeight*.20), (int)(screenHeight*.20));

            knowingGodImg = Image.createImage("images/knowingGod_icon.png");
            satisfaiedImg = Image.createImage("images/satisfied_icon.png");
            fourLawsImg = Image.createImage("images/fourLaws_icon.png");
            everyStudentImg = Image.createImage("images/everyStudent_icon.png");

           knowingGodImg = mainMIDlet.myOperations.rescaleImage(knowingGodImg, smallestSize, smallestSize);
           satisfaiedImg = mainMIDlet.myOperations.rescaleImage(satisfaiedImg, smallestSize, smallestSize);
           fourLawsImg = mainMIDlet.myOperations.rescaleImage(fourLawsImg, smallestSize, smallestSize);
           everyStudentImg = mainMIDlet.myOperations.rescaleImage(everyStudentImg, smallestSize, smallestSize);

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    protected void paint(Graphics g) {
        g.setColor(126, 126, 127);
        g.fillRect(0, 0, screenWidth, screenHeight);

        g.drawImage(godToolsLogo, screenWidth/2, (screenHeight-smallestSize*2-godToolsLogo.getHeight())/2, g.TOP|g.HCENTER);
        
         g.drawImage(knowingGodImg,screenWidth/2-smallestSize,screenHeight-smallestSize*2,g.LEFT|g.TOP);
         g.drawImage(fourLawsImg,screenWidth/2-smallestSize,screenHeight-smallestSize,g.LEFT|g.TOP);
         g.drawImage(satisfaiedImg,(int)(screenWidth*0.5),screenHeight-smallestSize*2,g.LEFT|g.TOP);
         g.drawImage(everyStudentImg,(int)(screenWidth*0.5),screenHeight-smallestSize,g.LEFT|g.TOP);

         if(selectionPlace == 0){
         g.fillRect(screenWidth/2-2, screenHeight-2*smallestSize, 4, smallestSize);
         g.fillRect(screenWidth/2-smallestSize, screenHeight-smallestSize-2, smallestSize+2, 4);
         }else if (selectionPlace == 1){
         g.fillRect(screenWidth/2-2, screenHeight-2*smallestSize, 4, smallestSize);
         g.fillRect(screenWidth/2-2, screenHeight-smallestSize-2, smallestSize+2, 4);
         }else if (selectionPlace == 2){
         g.fillRect(screenWidth/2-2, screenHeight-smallestSize-2, 4, smallestSize+2);
         g.fillRect(screenWidth/2-2, screenHeight-smallestSize-2, smallestSize+2, 4);
         }else if (selectionPlace == 3){
         g.fillRect(screenWidth/2-2, screenHeight-smallestSize-2, 4, smallestSize+2);
         g.fillRect(screenWidth/2-smallestSize, screenHeight-smallestSize-2, smallestSize+2, 4);
        }
    }

    protected void keyPressed(int keyCode) {
        if(getGameAction(keyCode) == RIGHT){
            if(selectionPlace == 0){
            selectionPlace = 1;
            }else if(selectionPlace == 3){
            selectionPlace = 2;
            }
        }else if (getGameAction(keyCode) == LEFT){
             if(selectionPlace == 1){
            selectionPlace = 0;
            }else if(selectionPlace == 2){
            selectionPlace = 3;
            }
        }else if (getGameAction(keyCode) == DOWN){
             if(selectionPlace == 0){
            selectionPlace = 3;
            }else if(selectionPlace == 1){
            selectionPlace = 2;
            }
        }else if (getGameAction(keyCode) == UP){
             if(selectionPlace == 2){
            selectionPlace = 1;
            }else if(selectionPlace == 3){
            selectionPlace = 0;
            }
        }else if(getGameAction(keyCode) == FIRE){// go to screens
            if(selectionPlace == 0){

            }else if(selectionPlace == 1){

            }else if(selectionPlace == 2){

            }else if(selectionPlace == 3){ // four laws
             Display.getDisplay(mainMIDlet.m).setCurrent(mainMIDlet.myFourLawsCanvas);
            }

        }

        repaint();
    }

    


}
