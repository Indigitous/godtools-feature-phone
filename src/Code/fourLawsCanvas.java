
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

    int screenWidth;
    int screenHeight;

    int fontheight;
    Image leftArrowImage;
    Image rightArrowImage;
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

    Image law2Img;
    Image law3Img;
    Image ChristDirectedImg;
    Image SelfDirectedImg;
//==================================== pages

    Page page0 = mainMidlet.myOperations.setPageContent(0);
    Page page1 = mainMidlet.myOperations.setPageContent(1);
    Page page2 = mainMidlet.myOperations.setPageContent(2);
    Page page3 = mainMidlet.myOperations.setPageContent(3);
    Page page4 = mainMidlet.myOperations.setPageContent(4);
    Page page5 = mainMidlet.myOperations.setPageContent(5);
    Page page6 = mainMidlet.myOperations.setPageContent(6);
    Page page7 = mainMidlet.myOperations.setPageContent(7);
    Page page8 = mainMidlet.myOperations.setPageContent(8);
    Page page9 = mainMidlet.myOperations.setPageContent(9);
    Page page10 = mainMidlet.myOperations.setPageContent(10);

    //=======================
    public fourLawsCanvas() {
        setFullScreenMode(true);
        screenHeight = getHeight();
        screenWidth = getWidth();
        fontheight = Font.getDefaultFont().getHeight();
        place_Y = - (int)(fontheight*0.5);
        try {
            leftArrowImage = Image.createImage("/images/leftarrow.png");
            rightArrowImage = Image.createImage("/images/rightarrow.png");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
            law2Img = LoadImage("/img/fourlaws/law2.png"); // load the images once
            law3Img = LoadImage("/img/fourlaws/law3.png");
            ChristDirectedImg = LoadImage("/img/fourlaws/ChristDirected.png");
            SelfDirectedImg = LoadImage( "/img/fourlaws/SelfDirected.png");

        LoadForLawsPageResources(fourLawsPage);
      }

    protected void paint(Graphics g) {
     drawPage(fourLawsPage, g);

     g.setColor(255,255,255);
     g.fillRoundRect(-6, screenHeight-23, 59, 32, 25, 25);
     g.fillRoundRect(screenWidth-53, screenHeight-23, 58, 32, 25, 25);
     g.setColor(108, 110, 118);
     g.fillRoundRect(-4, screenHeight-21, 55, 30, 25, 25);
     g.fillRoundRect(screenWidth-51, screenHeight-21, 55, 30, 25, 25);

     g.drawImage(leftArrowImage, 10, screenHeight-18, g.LEFT|g.TOP);
     g.drawImage(rightArrowImage , screenWidth - 30, screenHeight-18, g.LEFT|g.TOP);
    }

    public Image LoadImage(String path){// load and resize the image
        Image img = null;
     try {
        img = Image.createImage(path); // resize
        img = mainMidlet.myOperations.rescaleImage(img, getWidth()/2, (img.getHeight()*getWidth()/2)/img.getWidth());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return  img;
    }

    private void LoadForLawsPageResources(int page){
        if (page == 0){ // home //
          title = operations.wrap(page0.getTitle(), Font.getDefaultFont(), (int)(screenWidth*.9));
          end = operations.wrap(page0.getEnd(), Font.getDefaultFont(), getWidth()-4);
        }else if (page == 1){ // law 1 //* 2 subtitle
          title = operations.wrap(page1.getTitle(), Font.getDefaultFont(), (int)(screenWidth*.9));
          subTitle_1 = operations.wrap(page1.getSubTitle1(), Font.getDefaultFont(), getWidth()-4);
          content_1 = operations.wrap(page1.getContent1(), Font.getDefaultFont(), getWidth()-4);
          subTitle_2 = operations.wrap(page1.getSubTitle2(), Font.getDefaultFont(), getWidth()-4);
          content_2 = operations.wrap(page1.getContent2(), Font.getDefaultFont(), getWidth()-4);
          end = operations.wrap(page1.getEnd(), Font.getDefaultFont(), getWidth()-4);
        }else if (page == 2){ // law 2 //* 2 subtitle 1 image
           title = operations.wrap(page2.getTitle(), Font.getDefaultFont(), (int)(screenWidth*.9));
          subTitle_1 = operations.wrap(page2.getSubTitle1(), Font.getDefaultFont(), getWidth()-4);
          content_1 = operations.wrap(page2.getContent1(), Font.getDefaultFont(), getWidth()-4);
          subTitle_2 = operations.wrap(page2.getSubTitle2(), Font.getDefaultFont(), getWidth()-4);
          image1 = law2Img; // change image
          content_2 = operations.wrap(page2.getContent2(), Font.getDefaultFont(), getWidth()-4);
          end = operations.wrap(page2.getEnd(), Font.getDefaultFont(), getWidth()-4);

        }else if (page == 3){ // law 3 //* 3 subtitle 1 image
          title = operations.wrap(page3.getTitle(), Font.getDefaultFont(), (int)(screenWidth*.9));
          subTitle_1 = operations.wrap(page3.getSubTitle1(), Font.getDefaultFont(), getWidth()-4);
          content_1 = operations.wrap(page3.getContent1(), Font.getDefaultFont(), getWidth()-4);
          subTitle_2 = operations.wrap(page3.getSubTitle2(), Font.getDefaultFont(), getWidth()-4);
          content_2 = operations.wrap(page3.getContent2(), Font.getDefaultFont(), getWidth()-4);
          subTitle_3 = operations.wrap(page3.getSubTitle3(), Font.getDefaultFont(), getWidth()-4);
          content_3 = operations.wrap(page3.getContent3(), Font.getDefaultFont(), getWidth()-4);
          image1 = law3Img;// change image
          end = operations.wrap(page3.getEnd(), Font.getDefaultFont(), getWidth()-4);
        }else if (page == 4){ // law 4 * 5 subtitle no end
          title = operations.wrap(page4.getTitle(), Font.getDefaultFont(), (int)(screenWidth*.9));
          subTitle_1 = operations.wrap(page4.getSubTitle1(), Font.getDefaultFont(), getWidth()-4);
          content_1 = operations.wrap(page4.getContent1(), Font.getDefaultFont(), getWidth()-4);
          subTitle_2 = operations.wrap(page4.getSubTitle2(), Font.getDefaultFont(), getWidth()-4);
          content_2 = operations.wrap(page4.getContent2(), Font.getDefaultFont(), getWidth()-4);
          subTitle_3 = operations.wrap(page4.getSubTitle3(), Font.getDefaultFont(), getWidth()-4);
          content_3 = operations.wrap(page4.getContent3(), Font.getDefaultFont(), getWidth()-4);
          subTitle_4 = operations.wrap(page4.getSubTitle4(), Font.getDefaultFont(), getWidth()-4);
          content_4 = operations.wrap(page4.getContent4(), Font.getDefaultFont(), getWidth()-4);
          subTitle_5 = operations.wrap(page4.getSubTitle5(), Font.getDefaultFont(), getWidth()-4);
          content_5 = operations.wrap(page4.getContent5(), Font.getDefaultFont(), getWidth()-4);
        }else if (page == 5){ // kind of lives
          title = operations.wrap(page5.getTitle(), Font.getDefaultFont(), (int)(screenWidth*.9));
          subTitle_1 = operations.wrap(page5.getSubTitle1(), Font.getDefaultFont(), getWidth()-4);
          content_1 = operations.wrap(page5.getContent1(), Font.getDefaultFont(), getWidth()-4);
          image1 = SelfDirectedImg;// change image
          subTitle_2 = operations.wrap(page5.getSubTitle2(), Font.getDefaultFont(), getWidth()-4);
          content_2 = operations.wrap(page5.getContent2(), Font.getDefaultFont(), getWidth()-4);
          image2 = ChristDirectedImg; // change image
          end = operations.wrap(page5.getEnd(), Font.getDefaultFont(), getWidth()-4);

        }else if (page == 6){ // prayer

        }else if (page == 7){ // christ in u

        }else if (page == 8){ // u have christ

        }else if (page == 9){ // suggestion

        }else if (page == 10){ // links

        }
    }

       private void drawPage(int page,Graphics g){ // draws each page
        if (page == 0){ // home
            g.setColor(0,117,154); // the background
            g.fillRect(0, 0, screenWidth, screenHeight);

             pos_title  = mainMidlet.myOperations.drawTxt(g, title, place_Y,1,getWidth(),fourLawsPage);
             pos_end  = mainMidlet.myOperations.drawTxt(g, end, pos_title,2,getWidth(),fourLawsPage);

              place_below_y = pos_end;
        }else if (page == 1){ // law 1
              g.setColor(0,117,154); // the background
              g.fillRect(0, 0, screenWidth, screenHeight);

              pos_title  = mainMidlet.myOperations.drawTxt(g, title, place_Y,0,getWidth(),fourLawsPage);
              pos_subTitle_1  = mainMidlet.myOperations.drawTxt(g, subTitle_1, pos_title,1,getWidth(),fourLawsPage);
              pos_content_1  = mainMidlet.myOperations.drawTxt(g, content_1, pos_subTitle_1,2,getWidth(),fourLawsPage);
              pos_subTitle_2  = mainMidlet.myOperations.drawTxt(g, subTitle_2, pos_content_1,1,getWidth(),fourLawsPage);
              pos_content_2  = mainMidlet.myOperations.drawTxt(g, content_2, pos_subTitle_2,2,getWidth(),fourLawsPage);
              pos_end = mainMidlet.myOperations.drawTxt(g, end, pos_content_2,3,getWidth(),fourLawsPage);

              place_below_y = pos_end; // up scroll limit;
        }else if (page == 2){ // law 2
              g.setColor(240,171,0); // the background
              g.fillRect(0, 0, screenWidth, screenHeight);

              pos_title  = mainMidlet.myOperations.drawTxt(g, title, place_Y,0,getWidth(),fourLawsPage);
              pos_subTitle_1  = mainMidlet.myOperations.drawTxt(g, subTitle_1, pos_title,1,getWidth(),fourLawsPage);
              pos_content_1  = mainMidlet.myOperations.drawTxt(g, content_1, pos_subTitle_1,2,getWidth(),fourLawsPage);
              pos_subTitle_2  = mainMidlet.myOperations.drawTxt(g, subTitle_2, pos_content_1,1,getWidth(),fourLawsPage);
              pos_image1 = mainMidlet.myOperations.drawImage(g, image1, getWidth(), pos_subTitle_2);
              pos_content_2  = mainMidlet.myOperations.drawTxt(g, content_2, pos_image1,2,getWidth(),fourLawsPage);
              pos_end = mainMidlet.myOperations.drawTxt(g, end, pos_content_2,3,getWidth(),fourLawsPage);

              place_below_y = pos_end;
        }else if (page == 3){ // law 3
             g.setColor(162,173,0); // the background
             g.fillRect(0, 0, screenWidth, screenHeight);

              pos_title  = mainMidlet.myOperations.drawTxt(g, title, place_Y,0,getWidth(),fourLawsPage);
              pos_subTitle_1  = mainMidlet.myOperations.drawTxt(g, subTitle_1, pos_title,1,getWidth(),fourLawsPage);
              pos_content_1  = mainMidlet.myOperations.drawTxt(g, content_1, pos_subTitle_1,2,getWidth(),fourLawsPage);
              pos_subTitle_2  = mainMidlet.myOperations.drawTxt(g, subTitle_2, pos_content_1,1,getWidth(),fourLawsPage);
              pos_content_2  = mainMidlet.myOperations.drawTxt(g, content_2, pos_subTitle_2,2,getWidth(),fourLawsPage);
              pos_subTitle_3  = mainMidlet.myOperations.drawTxt(g, subTitle_3, pos_content_2,1,getWidth(),fourLawsPage);
              pos_content_3  = mainMidlet.myOperations.drawTxt(g, content_3, pos_subTitle_3,2,getWidth(),fourLawsPage);
              pos_image1 = mainMidlet.myOperations.drawImage(g, image1, getWidth(), pos_content_3);
              pos_end = mainMidlet.myOperations.drawTxt(g, end, pos_image1,3,getWidth(),fourLawsPage);

              place_below_y = pos_end;
        }else if (page == 4){ // law 4
              g.setColor(188,17,17); // the background
              g.fillRect(0, 0, screenWidth, screenHeight);

              pos_title  = mainMidlet.myOperations.drawTxt(g, title, place_Y,0,getWidth(),fourLawsPage);
              pos_subTitle_1  = mainMidlet.myOperations.drawTxt(g, subTitle_1, pos_title,1,getWidth(),fourLawsPage);
              pos_content_1  = mainMidlet.myOperations.drawTxt(g, content_1, pos_subTitle_1,2,getWidth(),fourLawsPage);
              pos_subTitle_2  = mainMidlet.myOperations.drawTxt(g, subTitle_2, pos_content_1,1,getWidth(),fourLawsPage);
              pos_content_2  = mainMidlet.myOperations.drawTxt(g, content_2, pos_subTitle_2,2,getWidth(),fourLawsPage);
              pos_subTitle_3  = mainMidlet.myOperations.drawTxt(g, subTitle_3, pos_content_2,1,getWidth(),fourLawsPage);
              pos_content_3  = mainMidlet.myOperations.drawTxt(g, content_3, pos_subTitle_3,2,getWidth(),fourLawsPage);
              pos_subTitle_4  = mainMidlet.myOperations.drawTxt(g, subTitle_4, pos_content_3,1,getWidth(),fourLawsPage);
              pos_content_4  = mainMidlet.myOperations.drawTxt(g, content_4, pos_subTitle_4,2,getWidth(),fourLawsPage);
              pos_subTitle_5  = mainMidlet.myOperations.drawTxt(g, subTitle_5, pos_content_4,1,getWidth(),fourLawsPage);
              pos_content_5  = mainMidlet.myOperations.drawTxt(g, content_5, pos_subTitle_5,2,getWidth(),fourLawsPage);

              place_below_y = pos_content_5;
        }else if (page == 5){ // kind of lives
              g.setColor(217,94,0); // the background
              g.fillRect(0, 0, screenWidth, screenHeight);

              pos_title  = mainMidlet.myOperations.drawTxt(g, title, place_Y,0,getWidth(),fourLawsPage);
              pos_subTitle_1  = mainMidlet.myOperations.drawTxt(g, subTitle_1, pos_title,1,getWidth(),fourLawsPage);
              pos_image1 = mainMidlet.myOperations.drawImage(g, image1, getWidth(), pos_subTitle_1);
              pos_content_1  = mainMidlet.myOperations.drawTxt(g, content_1, pos_image1,2,getWidth(),fourLawsPage);
              pos_subTitle_2  = mainMidlet.myOperations.drawTxt(g, subTitle_2, pos_content_1,1,getWidth(),fourLawsPage);
              pos_image2 = mainMidlet.myOperations.drawImage(g, image2, getWidth(), pos_subTitle_2);
              pos_content_2  = mainMidlet.myOperations.drawTxt(g, content_2, pos_image2,2,getWidth(),fourLawsPage);
              pos_end  = mainMidlet.myOperations.drawTxt(g, end, pos_content_2,3,getWidth(),fourLawsPage);

              place_below_y = pos_end;

        }else if (page == 6){ // prayer
              g.setColor(0,117,154); // the background
              g.fillRect(0, 0, screenWidth, screenHeight);

        }else if (page == 7){ // christ in u
              g.setColor(240,171,0); // the background
              g.fillRect(0, 0, screenWidth, screenHeight);


        }else if (page == 8){ // u have christ
              g.setColor(162,173,0); // the background
              g.fillRect(0, 0, screenWidth, screenHeight);


        }else if (page == 9){ // suggestion
              g.setColor(188,17,17); // the background
              g.fillRect(0, 0, screenWidth, screenHeight);

        }else if (page == 10){ // links
              g.setColor(217,94,0); // the background
              g.fillRect(0, 0, screenWidth, screenHeight);

        }
    }
    protected void keyPressed(int keyCode) {

        if(getGameAction(keyCode) == DOWN && place_below_y >=screenHeight - fontheight*2 - 20){ // scroll down // 40 is for the constant bottom bar
        place_Y-=screenHeight/12;
        }else if(getGameAction(keyCode) == UP && place_Y<- Font.getDefaultFont().getHeight()*.5){ // scroll up
        place_Y+=screenHeight/12;
        }else if(getGameAction(keyCode) == RIGHT || keyCode == -7){
            if(fourLawsPage<10){
            fourLawsPage++; // increment the page
            }
            place_Y = - (int)(Font.getDefaultFont().getHeight()*0.5);// reset top y pos
            LoadForLawsPageResources(fourLawsPage); // load from txt
        }else if(getGameAction(keyCode) == LEFT || keyCode == -6) {
            if(fourLawsPage>0){
            fourLawsPage--; // decrement the page
            }else {
            Display.getDisplay(mainMidlet.m).setCurrent(mainMidlet.myMenu);
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
