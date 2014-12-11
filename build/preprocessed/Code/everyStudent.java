package Code;



//import image.MyParser;
import java.io.IOException;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class everyStudent extends Canvas{

     public  Midlet midlet;
     
    private static Image background2;
    private static Image up, down;
    private Image love, plan;
    Font fontSmall, fontMedium, fontLarge;
    int wrapWidth;
    private int button;
    private boolean button1, button2;
        
   
    
private MyParser mypar = new MyParser("xml/connectG/01_Home.xml");
    
   private int pages = 1;
   int titleWidth = 10;
   int titleHight = 12;
   int subtitleWidth = 15;
   int subtitleHight = 35;
   int bodyWidth = 30;
   int bodyHeight = 210;
   
   
   
    public everyStudent(Midlet mm) {
        midlet = mm;
        setFullScreenMode(true);
     
        
         button1 = false;
        button2 = false;
        
        try{
        up = Image.createImage("/image/up.jpg");
        down = Image.createImage("/image/down.jpg");
        love = Image.createImage("/image/love.jpg");
        plan = Image.createImage("/image/plan.jpg");
        } catch(IOException e){ e.printStackTrace();}
        
        fontSmall = Font.getFont(Font.FACE_SYSTEM, Font.STYLE_PLAIN, Font.SIZE_SMALL);
        fontMedium = Font.getFont(Font.FACE_PROPORTIONAL, Font.STYLE_PLAIN, Font.SIZE_MEDIUM);
        fontLarge = Font.getFont(Font.FACE_PROPORTIONAL, Font.STYLE_BOLD, Font.SIZE_LARGE);

       
    }
    
    
 
    

 protected void paint(Graphics g) {
       int iViewH = this.getHeight();
       int iViewW = this.getWidth();    
       int  x =  iViewW / 2;
       int y = iViewH / 2;
             
           
       if (background2== null)
         {
          try {
             background2 = Image.createImage("/image/background2.jpg");
             background2 = splashScreen.CreateScaledImage(background2, iViewW, iViewH);
        } catch (IOException ex) {
               ex.printStackTrace();
            }
            }

            // draw background
       if (background2!= null) {
           g.drawImage(background2, iViewW / 2, iViewH / 2,Graphics.VCENTER | Graphics.HCENTER );
        }
        
 
        g.setFont(fontLarge);
 
        g.drawImage(background2, 0, 0, Graphics.LEFT|Graphics.TOP);

       if(pages == 1){
              g.drawString("THIS",100, 50, Graphics.LEFT|Graphics.TOP);
              g.drawString("version of Godtools has ",10, 70, Graphics.LEFT|Graphics.TOP);
              g.setColor(25,0,255);
              g.drawString("KNOWING GOD",60, 110, Graphics.LEFT|Graphics.TOP);
              g.drawString("&",115, 130, Graphics.LEFT|Graphics.TOP);
              g.drawString("4 LAWS",90, 150, Graphics.LEFT|Graphics.TOP);
              g.setColor(0,0,0);
              g.drawString("stay tune for V1.1",40, 190, Graphics.LEFT|Graphics.TOP);  
              g.setColor(25,0,255);
              g.drawString("GOD BLESS YOU",50, 260, Graphics.LEFT|Graphics.TOP);
       } 
  
         }
       static Font getFont(int face, int style, int size){
        return null;
        }
    protected void keyPressed(int keyCode) {
         super.keyPressed(keyCode);
         
         if(getGameAction(keyCode) == LEFT){
         pages = pages-1;                  
             if(pages == 0){
                 pages = 1;
             }
             
        }
        else if (getGameAction(keyCode) == RIGHT){
            pages = pages +1;
             if (pages ==2){
                 pages =1;
              }
            
        }
        else if(keyCode == -6){
        //midlet.notifyDestroyed();
              Display.getDisplay(midlet).setCurrent(midlet.myMenu); // back to menu
        }
        
         if(getGameAction(keyCode) == FIRE){
         
         if (button ==0){
             button1 = !button1;
             if (button2 ==true){
                 button2=false;
             }
         }
         else if (button ==1){
             button2 = !button2;
               if (button1 ==true){
                 button1=false;
             }
         }
         }
         
        
               
  
          if(getGameAction(keyCode) == DOWN & button ==0){
            button = 1;           
            
        }
            if(getGameAction(keyCode) == UP & button ==1){
            button = 0;           
            
        }
       
        else if(keyCode == -6){
        //midlet.notifyDestroyed();
              Display.getDisplay(midlet).setCurrent(midlet.myMenu); // back to menu
        }
        
        repaint();
    }
}
