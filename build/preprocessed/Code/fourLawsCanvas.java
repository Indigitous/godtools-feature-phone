
package Code;

import java.io.IOException;
import java.util.Vector;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;


public class fourLawsCanvas extends Canvas{

   
    int place_Y = 0; // for scroll
    int place_below_y = 0;

    int fourLawsPage = 0; // page 0 , 1 ,2 , 3 ,4 ,5,6,7,8,9,10

    public Vector getContent_1() {
        return content_1;
    }
    int screenWidth;
    int screenHeight;
    
    //======================= max 7 sub titles in a chapter, 2 images max per chapter
    Vector title;
    Vector subTitle_1;
    Vector subTitle_2;
    Vector subTitle_3;
    Vector subTitle_4;
    Vector subTitle_5;
    Vector subTitle_6;
    Vector subTitle_7;
    Vector content_1;
    Vector content_2;
    Vector content_3;
    Vector content_4;
    Vector content_5;
    Vector content_6;
    Vector content_7;
    Vector end;
    Image image1;
    Image image2;

    int pos_title;
    int pos_subTitle_1;
    int pos_subTitle_2;
    int pos_subTitle_3;
    int pos_subTitle_4;
    int pos_subTitle_5;
    int pos_subTitle_6;
    int pos_subTitle_7;
    int pos_content_1;
    int pos_content_2;
    int pos_content_3;
    int pos_content_4;
    int pos_content_5;
    int pos_content_6;
    int pos_content_7;
    int pos_end;
    int pos_image1;
    int pos_image2;

   
    //=======================
    public fourLawsCanvas() {
        setFullScreenMode(true);
        screenHeight = getHeight();
        screenWidth = getWidth();
        place_Y = - (int)(Font.getDefaultFont().getHeight()*0.5);
        LoadForLawsPageResources(fourLawsPage);
      }

    protected void paint(Graphics g) {
     drawPage(fourLawsPage, g);
    }
       
    public Image LoadImage(String path){// load and resize the image
        Image img = null;
     try {
        img = Image.createImage(path); // resize
        img = Midlet.myOperations.rescaleImage(img, (int)(getWidth()/1.5), img.getHeight()/img.getWidth()*(int)(getWidth()/1.5));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return  img;
    }

    private void LoadForLawsPageResources(int page){
        if (page == 0){ // home // 
          title = operations.wrap(Midlet.myOperations.readFile("abt", 0), Font.getDefaultFont(), (int)(screenWidth*.9));
          end = operations.wrap(Midlet.myOperations.readFile("abt", 1), Font.getDefaultFont(), getWidth()-4);
        }else if (page == 1){ // law 1 //* 2 subtitle
          title = operations.wrap(Midlet.myOperations.readFile("law1", 0), Font.getDefaultFont(), (int)(screenWidth*.9));
          subTitle_1 = operations.wrap(Midlet.myOperations.readFile("law1", 1), Font.getDefaultFont(), getWidth()-4);
          content_1 = operations.wrap(Midlet.myOperations.readFile("law1", 2), Font.getDefaultFont(), getWidth()-4);
          subTitle_2 = operations.wrap(Midlet.myOperations.readFile("law1", 3), Font.getDefaultFont(), getWidth()-4);
          content_2 = operations.wrap(Midlet.myOperations.readFile("law1", 4), Font.getDefaultFont(), getWidth()-4);
          end = operations.wrap(Midlet.myOperations.readFile("law1", 5), Font.getDefaultFont(), getWidth()-4);
        }else if (page == 2){ // law 2 //* 2 subtitle 1 image
           title = operations.wrap(Midlet.myOperations.readFile("abt", 0), Font.getDefaultFont(), (int)(screenWidth*.9));
          subTitle_1 = operations.wrap(Midlet.myOperations.readFile("abt", 0), Font.getDefaultFont(), getWidth()-4);
          content_1 = operations.wrap(Midlet.myOperations.readFile("abt", 0), Font.getDefaultFont(), getWidth()-4);
          subTitle_2 = operations.wrap(Midlet.myOperations.readFile("abt", 0), Font.getDefaultFont(), getWidth()-4);
          image1 = LoadImage("/img/fourlaws/sin.png");
          content_2 = operations.wrap(Midlet.myOperations.readFile("abt", 0), Font.getDefaultFont(), getWidth()-4);
          end = operations.wrap(Midlet.myOperations.readFile("abt", 1), Font.getDefaultFont(), getWidth()-4);

        }else if (page == 3){ // law 3 //* 3 subtitle 1 image
          title = operations.wrap(Midlet.myOperations.readFile("abt", 0), Font.getDefaultFont(), (int)(screenWidth*.9));
          subTitle_1 = operations.wrap(Midlet.myOperations.readFile("abt", 0), Font.getDefaultFont(), getWidth()-4);
          content_1 = operations.wrap(Midlet.myOperations.readFile("abt", 0), Font.getDefaultFont(), getWidth()-4);
          subTitle_2 = operations.wrap(Midlet.myOperations.readFile("abt", 0), Font.getDefaultFont(), getWidth()-4);
          content_2 = operations.wrap(Midlet.myOperations.readFile("abt", 0), Font.getDefaultFont(), getWidth()-4);
          subTitle_3 = operations.wrap(Midlet.myOperations.readFile("abt", 0), Font.getDefaultFont(), getWidth()-4);
          content_3 = operations.wrap(Midlet.myOperations.readFile("abt", 0), Font.getDefaultFont(), getWidth()-4);
          image1 = LoadImage("/img/fourlaws/sin.png");
          end = operations.wrap(Midlet.myOperations.readFile("abt", 1), Font.getDefaultFont(), getWidth()-4);
        }else if (page == 4){ // law 4 * 5 subtitle no end
          title = operations.wrap(Midlet.myOperations.readFile("abt", 0), Font.getDefaultFont(), (int)(screenWidth*.9));
          subTitle_1 = operations.wrap(Midlet.myOperations.readFile("abt", 0), Font.getDefaultFont(), getWidth()-4);
          content_1 = operations.wrap(Midlet.myOperations.readFile("abt", 0), Font.getDefaultFont(), getWidth()-4);
          subTitle_2 = operations.wrap(Midlet.myOperations.readFile("abt", 0), Font.getDefaultFont(), getWidth()-4);
          content_2 = operations.wrap(Midlet.myOperations.readFile("abt", 0), Font.getDefaultFont(), getWidth()-4);
          subTitle_3 = operations.wrap(Midlet.myOperations.readFile("abt", 0), Font.getDefaultFont(), getWidth()-4);
          content_3 = operations.wrap(Midlet.myOperations.readFile("abt", 0), Font.getDefaultFont(), getWidth()-4);
          subTitle_4 = operations.wrap(Midlet.myOperations.readFile("abt", 0), Font.getDefaultFont(), getWidth()-4);
          content_4 = operations.wrap(Midlet.myOperations.readFile("abt", 0), Font.getDefaultFont(), getWidth()-4);
          subTitle_5 = operations.wrap(Midlet.myOperations.readFile("abt", 0), Font.getDefaultFont(), getWidth()-4);
          content_6 = operations.wrap(Midlet.myOperations.readFile("abt", 0), Font.getDefaultFont(), getWidth()-4);
        }else if (page == 5){ // kind of lives
          title = operations.wrap(Midlet.myOperations.readFile("abt", 0), Font.getDefaultFont(), (int)(screenWidth*.9));
          subTitle_1 = operations.wrap(Midlet.myOperations.readFile("abt", 0), Font.getDefaultFont(), getWidth()-4);
          content_1 = operations.wrap(Midlet.myOperations.readFile("abt", 0), Font.getDefaultFont(), getWidth()-4);
          image1 = LoadImage("/img/fourlaws/sin.png");
          subTitle_2 = operations.wrap(Midlet.myOperations.readFile("abt", 0), Font.getDefaultFont(), getWidth()-4);
          content_2 = operations.wrap(Midlet.myOperations.readFile("abt", 0), Font.getDefaultFont(), getWidth()-4);
          image2 = LoadImage("/img/fourlaws/sin.png");
          end = operations.wrap(Midlet.myOperations.readFile("abt", 1), Font.getDefaultFont(), getWidth()-4);

        }else if (page == 6){ // prayer

        }else if (page == 7){ // christ in u

        }else if (page == 8){ // u have christ

        }else if (page == 9){ // suggestion

        }else if (page == 10){ // links

        }
    }

       private void drawPage(int page,Graphics g){ // draws each page
        if (page == 0){ // home
            g.setColor(23, 129, 163); // the background
            g.fillRect(0, 0, screenWidth, screenHeight);

             pos_title  = Midlet.myOperations.drawTxt(g, title, place_Y,1,getWidth());
             pos_end  = Midlet.myOperations.drawTxt(g, end, pos_title,3,getWidth());

              place_below_y = pos_end;
        }else if (page == 1){ // law 1
              g.setColor(23, 129, 163); // the background
              g.fillRect(0, 0, screenWidth, screenHeight);

              pos_title  = Midlet.myOperations.drawTxt(g, title, place_Y,0,getWidth());
              pos_subTitle_1  = Midlet.myOperations.drawTxt(g, subTitle_1, pos_title,1,getWidth());
              pos_content_1  = Midlet.myOperations.drawTxt(g, content_1, pos_subTitle_1,2,getWidth());
              pos_subTitle_2  = Midlet.myOperations.drawTxt(g, subTitle_2, pos_content_1,1,getWidth());
              pos_content_2  = Midlet.myOperations.drawTxt(g, content_2, pos_subTitle_2,2,getWidth());
              pos_end = Midlet.myOperations.drawTxt(g, end, pos_content_2,3,getWidth());

              place_below_y = pos_end; // up scroll limit;
        }else if (page == 2){ // law 2
              g.setColor(142, 181, 33); // the background
              g.fillRect(0, 0, screenWidth, screenHeight);

              pos_title  = Midlet.myOperations.drawTxt(g, title, place_Y,0,getWidth());
              pos_subTitle_1  = Midlet.myOperations.drawTxt(g, subTitle_1, pos_title,1,getWidth());
              pos_content_1  = Midlet.myOperations.drawTxt(g, content_1, pos_subTitle_1,2,getWidth());
              pos_subTitle_2  = Midlet.myOperations.drawTxt(g, subTitle_2, pos_content_1,1,getWidth());
              pos_image1 = Midlet.myOperations.drawImage(g, image1, getWidth(), pos_subTitle_2);
              pos_content_2  = Midlet.myOperations.drawTxt(g, content_2, pos_image1,2,getWidth());
              pos_end = Midlet.myOperations.drawTxt(g, end, pos_content_2,3,getWidth());

              place_below_y = pos_end;
        }else if (page == 3){ // law 3
             g.setColor(190, 178, 78); // the background
             g.fillRect(0, 0, screenWidth, screenHeight);

              pos_title  = Midlet.myOperations.drawTxt(g, title, place_Y,0,getWidth());
              pos_subTitle_1  = Midlet.myOperations.drawTxt(g, subTitle_1, pos_title,1,getWidth());
              pos_content_1  = Midlet.myOperations.drawTxt(g, content_1, pos_subTitle_1,2,getWidth());
              pos_subTitle_2  = Midlet.myOperations.drawTxt(g, subTitle_2, pos_content_1,1,getWidth());
              pos_content_2  = Midlet.myOperations.drawTxt(g, content_2, pos_subTitle_2,2,getWidth());
              pos_subTitle_3  = Midlet.myOperations.drawTxt(g, subTitle_2, pos_content_2,1,getWidth());
              pos_content_3  = Midlet.myOperations.drawTxt(g, content_2, pos_subTitle_3,2,getWidth());
              pos_image1 = Midlet.myOperations.drawImage(g, image1, getWidth(), pos_content_3);
              pos_end = Midlet.myOperations.drawTxt(g, end, pos_image1,3,getWidth());

              place_below_y = pos_end;
        }else if (page == 4){ // law 4
              g.setColor(209, 93, 93); // the background
              g.fillRect(0, 0, screenWidth, screenHeight);

              pos_title  = Midlet.myOperations.drawTxt(g, title, place_Y,0,getWidth());
              pos_subTitle_1  = Midlet.myOperations.drawTxt(g, subTitle_1, pos_title,1,getWidth());
              pos_content_1  = Midlet.myOperations.drawTxt(g, content_1, pos_subTitle_1,2,getWidth());
              pos_subTitle_2  = Midlet.myOperations.drawTxt(g, subTitle_2, pos_content_1,1,getWidth());
              pos_content_2  = Midlet.myOperations.drawTxt(g, content_2, pos_subTitle_2,2,getWidth());
              pos_subTitle_3  = Midlet.myOperations.drawTxt(g, subTitle_2, pos_content_2,1,getWidth());
              pos_content_3  = Midlet.myOperations.drawTxt(g, content_2, pos_subTitle_3,2,getWidth());
              pos_subTitle_4  = Midlet.myOperations.drawTxt(g, subTitle_2, pos_content_3,1,getWidth());
              pos_content_4  = Midlet.myOperations.drawTxt(g, content_2, pos_subTitle_4,2,getWidth());
              pos_subTitle_5  = Midlet.myOperations.drawTxt(g, subTitle_2, pos_content_4,1,getWidth());
              pos_content_5  = Midlet.myOperations.drawTxt(g, content_2, pos_subTitle_5,2,getWidth());

              place_below_y = pos_content_5;
        }else if (page == 5){ // kind of lives
              g.setColor(229, 145, 81); // the background
              g.fillRect(0, 0, screenWidth, screenHeight);


        }else if (page == 6){ // prayer

        }else if (page == 7){ // christ in u

        }else if (page == 8){ // u have christ

        }else if (page == 9){ // suggestion

        }else if (page == 10){ // links

        }
    }
    protected void keyPressed(int keyCode) {
   
        if(getGameAction(keyCode) == DOWN && place_below_y >=screenHeight-30){ // scroll down // 30 is for the constant bottom bar
        place_Y-=screenHeight/12;
        }else if(getGameAction(keyCode) == UP && place_Y<- Font.getDefaultFont().getHeight()*.5){ // scroll up
        place_Y+=screenHeight/12;
        }else if(getGameAction(keyCode) == RIGHT){
            if(fourLawsPage<10){
            fourLawsPage++; // increment the page
            }
            place_Y = - (int)(Font.getDefaultFont().getHeight()*0.5);// reset top y pos
            LoadForLawsPageResources(fourLawsPage); // load from txt
        }else if(getGameAction(keyCode) == LEFT){
            if(fourLawsPage>0){
            fourLawsPage--; // decrement the page
            }
            place_Y = - (int)(Font.getDefaultFont().getHeight()*0.5);// reset top y pos
            LoadForLawsPageResources(fourLawsPage); // load from txt
        }
        repaint();
        System.gc();
    }


      public Image getScreenShot() { // not used
  Image screenshot = Image.createImage(getWidth(), getHeight());
  Graphics g = screenshot.getGraphics();
  paint(g);
  return Image.createImage(screenshot);

} 


}
