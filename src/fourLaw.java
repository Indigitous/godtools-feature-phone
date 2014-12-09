

//import image.MyParser;
import java.io.IOException;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class fourLaw extends Canvas{

     public  Midlet midlet;
     
    private static Image background2;
    private static Image up, down ,plan,fourth; 
    static Image heisonly,selfy,christian,trust;
    Font fontSmall, fontMedium, fontLarge;
    int wrapWidth;
    private int button;
    private boolean button1, button2,button3;
        
   
    
    private MyParser mypar = new MyParser("xml/fourLaw/01_Home.xml");
    private MyParser mypar2 = new MyParser("xml/fourLaw/02_FirstPoint.xml");
    private MyParser mypar3 = new MyParser("xml/fourLaw/03_SecondPoint.xml");
    private MyParser mypar4 = new MyParser("xml/fourLaw/04_ThiredPoint.xml");
    private MyParser mypar5 = new MyParser("xml/fourLaw/05_fourthPoint.xml");
    private MyParser mypar6 = new MyParser("xml/fourLaw/06_FifthPoint.xml");
    private MyParser mypar7 = new MyParser("xml/fourLaw/07_SixthPoint.xml");
    private MyParser mypar8 = new MyParser("xml/fourLaw/08_SeventhPoint.xml");
    private MyParser mypar9 = new MyParser("xml/fourLaw/09_EithPoint.xml");
    private MyParser mypar10 = new MyParser("xml/fourLaw/10_NinethPoint.xml");
    private MyParser mypar11 = new MyParser("xml/fourLaw/11_TenthPoint.xml");
    
    
    
    
     
   private int pages = 1;
   int titleWidth = 10;
   int titleHight = 12;
   int subtitleWidth = 15;
   int subtitleHight = 35;
   int bodyWidth = 30;
   int bodyHeight = 210;
   
   
   
    public fourLaw(Midlet mm) {
        midlet = mm;
        setFullScreenMode(true);
     
        
         button1 = false;
        button2 = false;
        button3 = false;
        
        try{
        up = Image.createImage("/image/up.jpg");
        down = Image.createImage("/image/down.jpg");
        fourth = Image.createImage("/image/forthpoint.jpg");
        plan = Image.createImage("/image/sinful.jpg");
        
       
        } catch(IOException e){ e.printStackTrace();}
        
        try{
        
        heisonly = Image.createImage("/image/only.jpg");
        selfy = Image.createImage("/image/selfy.jpg");
        christian = Image.createImage("/image/christian.jpg");
        trust = Image.createImage("/image/trust.jpg");
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

    LineEnumeration e = new LineEnumeration(fontLarge, " "+mypar.getHeading(), getWidth());         
                e.writeTo(g, 12, titleHight, fontLarge);
                //g.setFont(fontMedium);
   LineEnumeration e1 = new LineEnumeration(fontLarge, "            "+mypar.getSubHeading(), getWidth());
             
                e1.writeTo(g, 12, subtitleHight, fontLarge);
   
                g.setFont(fontMedium);          
                
    LineEnumeration e2 = new LineEnumeration(fontMedium, " "+mypar.getText(), getWidth());
        e2.writeTo(g, 0, bodyHeight, fontMedium);
                        g.setFont(fontMedium);          

            
      
  } 
  /// fourLawod one is done here
  /// welcome to fourLawod two
    if(pages == 2){

   LineEnumeration e = new LineEnumeration(fontLarge, " "+mypar2.getNumber(), getWidth());
        e.writeTo(g, 0, titleHight, fontLarge);
            
      
    e = new LineEnumeration(fontLarge, ". "+mypar2.getHeading(), getWidth());
             
                e.writeTo(g, 12, titleHight, fontLarge);
   
                g.setFont(fontMedium);
                
       if (button == 0){
      g.setColor(200,255,0);
      g.fillRect(0, 90 , getWidth()-15, 20 );
       
       
       }
       
       if (button ==1){
           g.setColor(200,255,0);
           
           g.fillRect(0, 198 ,getWidth()-15, 20);

       }
   //draw down images   
                     g.drawImage(down, getWidth()-30, 90, Graphics.LEFT|Graphics.TOP);
                     g.drawImage(down, getWidth()-30, 198, Graphics.LEFT|Graphics.TOP);
                     
//draw Break Lines
                     g.setColor(0,0,0);
                     
       g.drawLine(0, 85, getWidth(), 85);
           g.drawLine(0, 222, getWidth(), 222);
           
 //draw Buttons
           g.drawString(mypar2.getPanelButton1(), 25, 90, Graphics.LEFT|Graphics.TOP);
           g.drawString(mypar2.getPanelButton2(), 25, 198, Graphics.LEFT|Graphics.TOP);
       
    
                            

       if (button1==true){
       g.setColor(200,255,0); 
       g.fillRect(3, 115, getWidth()-6, 100);
       g.setColor(0,0,0);
       e = new LineEnumeration(fontMedium, mypar2.getPanelText1(), getWidth());
       e.writeTo(g, 5, 120, fontMedium);
       g.drawImage(up, getWidth()-30, 90, Graphics.LEFT|Graphics.TOP);
       
       }
       
       else if (button2 ==true){
       g.setColor(200,255,0);
       g.fillRect(3, 115, getWidth()-6, 80);
       g.setColor(0,0,0);
       e = new LineEnumeration(fontMedium, mypar2.getPanelText2(), getWidth());
       e.writeTo(g, 5, 120, fontMedium);
       g.drawImage(up, getWidth()-30, 198, Graphics.LEFT|Graphics.TOP);     
       
           
           
       }

        e = new LineEnumeration(fontLarge, " "+mypar2.getQuestions(), getWidth());
             
                e.writeTo(g, 18, 240, fontMedium);
   
                g.setFont(fontMedium);
 
     }
    if(pages == 3){

       LineEnumeration e = new LineEnumeration(fontLarge, " "+mypar3.getNumber(), getWidth());
        e.writeTo(g, 0, titleHight, fontLarge);
            
      
    e = new LineEnumeration(fontLarge, ". "+mypar3.getHeading(), getWidth());
             
                e.writeTo(g, 12, titleHight, fontLarge);
   
                g.setFont(fontMedium);
                
       if (button == 0){
      g.setColor(200,255,0);
      g.fillRect(0, 90 , getWidth()-15, 20 );
       
       
       }
       
       if (button ==1){
           g.setColor(200,255,0);
           
           g.fillRect(0, 198 ,getWidth()-15, 20);

       }
   //draw down images   
                     g.drawImage(down, getWidth()-30, 90, Graphics.LEFT|Graphics.TOP);
                     g.drawImage(down, getWidth()-30, 198, Graphics.LEFT|Graphics.TOP);
                     
//draw Break Lines
                     g.setColor(0,0,0);
                     
       g.drawLine(0, 85, getWidth(), 85);
           g.drawLine(0, 222, getWidth(), 222);
           
 //draw Buttons
           g.drawString(mypar3.getPanelButton1(), 25, 90, Graphics.LEFT|Graphics.TOP);
           g.drawString(mypar3.getPanelButton2(), 25, 198, Graphics.LEFT|Graphics.TOP);
       
    
                            

       if (button1==true){
       g.setColor(200,255,0); 
       g.fillRect(3, 115, getWidth()-6, 60);
       g.setColor(0,0,0);
       e = new LineEnumeration(fontMedium, mypar3.getPanelText1(), getWidth());
       e.writeTo(g, 5, 120, fontMedium);
       g.drawImage(up, getWidth()-30, 90, Graphics.LEFT|Graphics.TOP);
       
       }
       
       else if (button2 ==true){
       g.setColor(200,255,0);
       g.fillRect(3, 118, getWidth()-6, 60);
       g.setColor(0,0,0);
       e = new LineEnumeration(fontMedium, mypar3.getPanelText2(), getWidth());
       e.writeTo(g, 5, 120, fontMedium);
       g.drawImage(up, getWidth()-30, 198, Graphics.LEFT|Graphics.TOP);     
       
           
           
       }

        e = new LineEnumeration(fontLarge, " "+mypar3.getQuestions(), getWidth());
             
                e.writeTo(g, 18, 240, fontMedium);
   
                g.setFont(fontMedium);

     }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////page4//////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    if(pages == 4){

    LineEnumeration e = new LineEnumeration(fontLarge, " "+mypar4.getNumber(), getWidth());
       e.writeTo(g, 0, titleHight, fontLarge);
            
        
    
       e = new LineEnumeration(fontLarge, ". "+mypar4.getHeading(), getWidth());
             
                e.writeTo(g, 12, titleHight, fontLarge);
       g.setFont(fontMedium);
         e = new LineEnumeration(fontLarge, " "+mypar4.getQuestions(), getWidth());
           
         e.writeTo(g, 18, 240, fontMedium);
                   g.setFont(fontMedium);
                
       if (button == 0){
      g.setColor(200,255,0);
      g.fillRect(0, 140 , getWidth()-15, 20 );
      
       }
       if (button == 1){
      g.setColor(200,255,0);
      g.fillRect(0, 170 , getWidth()-15, 20 );

       } 
       if (button == 2){
      g.setColor(200,255,0);
      g.fillRect(0, 200 , getWidth()-15, 20 );
       }
       
       g.drawImage(down, getWidth()-30, 140, Graphics.LEFT|Graphics.TOP);
       g.drawImage(down, getWidth()-30, 170, Graphics.LEFT|Graphics.TOP);
       g.drawImage(down, getWidth()-30, 200, Graphics.LEFT|Graphics.TOP);
                     g.setColor(0,0,0);
       g.drawLine(0, 138, getWidth(), 138);
       g.drawLine(0, 168, getWidth(), 168);
       g.drawLine(0, 198, getWidth(), 198);
       
       g.drawString(mypar4.getPanelButton1(), 25, 140, Graphics.LEFT|Graphics.TOP);
       g.drawString(mypar4.getPanelButton2(), 25, 170, Graphics.LEFT|Graphics.TOP);
       g.drawString(mypar4.getPanelButton3(), 25, 200, Graphics.LEFT|Graphics.TOP);
           

       if (button1==true){
       g.setColor(200,255,0);
       g.fillRect(3, 160, getWidth()-6, 70);
       g.setColor(0,0,0); 
       e = new LineEnumeration(fontMedium, mypar4.getPanelText1(), getWidth());
       e.writeTo(g, 5, 160, fontMedium);
       
  
       g.drawImage(up, getWidth()-30, 140, Graphics.LEFT|Graphics.TOP);
       
       }
       if (button2==true){
        g.setColor(200,255,0);
       g.fillRect(3, 190, getWidth()-6, 70);   
       g.setColor(0,0,0);
          e = new LineEnumeration(fontMedium, mypar4.getPanelText2(), getWidth());
       e.writeTo(g, 5, 195, fontMedium);
       
  
       g.drawImage(up, getWidth()-30, 170, Graphics.LEFT|Graphics.TOP);
       
       
       }
       if (button3==true){

       g.drawImage(heisonly, 0,0, Graphics.LEFT|Graphics.TOP);
       }
                       

       
     }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////7/
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  if(pages == 5){
   LineEnumeration e = new LineEnumeration(fontLarge, " "+mypar5.getNumber(), getWidth());
       e.writeTo(g, 0, titleHight, fontLarge);
   e = new LineEnumeration(fontLarge, ". "+mypar5.getHeading(), getWidth());
             
                e.writeTo(g, 12, titleHight, fontLarge);
                g.setFont(fontMedium);
                
       if (button == 0){
      g.setColor(200,255,0);
      g.fillRect(0, 190 , getWidth()-15, 20 );
      
       }
       if (button == 1){
      g.setColor(200,255,0);
      g.fillRect(0, 220 , getWidth()-15, 20 );
      
       
       
       } 
       if (button == 2){
      g.setColor(200,255,0);
      g.fillRect(0, 250 , getWidth()-15, 20 );
       }
        g.drawImage(down, getWidth()-30, 190, Graphics.LEFT|Graphics.TOP);
        g.drawImage(down, getWidth()-30, 220, Graphics.LEFT|Graphics.TOP);
        g.drawImage(down, getWidth()-30, 250, Graphics.LEFT|Graphics.TOP);
  //draw Break Lines
                     g.setColor(0,0,0);
                     
        g.drawLine(0, 188, getWidth(), 188);
        g.drawLine(0, 218, getWidth(), 218);
        g.drawLine(0, 248, getWidth(), 248);
           
 //draw Buttons
           g.drawString(mypar5.getPanelButton1(), 25, 190, Graphics.LEFT|Graphics.TOP);
           g.drawString(mypar5.getPanelButton2(), 25, 220, Graphics.LEFT|Graphics.TOP);
           g.drawString(mypar5.getPanelButton3(), 25, 250, Graphics.LEFT|Graphics.TOP);
             
       if (button1==true){
           g.setColor(200,255,0);  
       g.fillRect(3, 210, getWidth()-6, 220);
       g.setColor(0,0,0);
       e = new LineEnumeration(fontMedium, mypar5.getPanelText1(), getWidth());
       e.writeTo(g, 5, 210, fontMedium);
       
  
       g.drawImage(up, getWidth()-30, 190, Graphics.LEFT|Graphics.TOP);
       
       }if (button2==true){
       g.setColor(200,255,0);
       g.fillRect(3, 250, getWidth()-6, 80);
          
          g.setColor(0,0,0);
          e = new LineEnumeration(fontMedium, mypar5.getPanelText2(), getWidth());
          e.writeTo(g, 5, 252, fontMedium);
       
  
       g.drawImage(up, getWidth()-30, 220, Graphics.LEFT|Graphics.TOP);
       
       }
       if (button3==true){
       g.setColor(200,255,0);
       g.fillRect(3, 280, getWidth()-6, 45);
          g.setColor(0,0,0);
          e = new LineEnumeration(fontMedium, mypar5.getPanelText3(), getWidth());
          e.writeTo(g, 5, 282, fontMedium);
      
       }  
            
  }
  if(pages == 6){

  LineEnumeration e;

       g.setFont(fontMedium);
         e = new LineEnumeration(fontLarge, " "+mypar5.getQuestions(), getWidth());
           
         e.writeTo(g, 18, 215, fontLarge);
                   g.setFont(fontMedium);
                
       if (button == 0){
      g.setColor(200,255,0);
      g.fillRect(0, 140 , getWidth()-15, 20 );
      
       }
       if (button == 1){
      g.setColor(200,255,0);
      g.fillRect(0, 170 , getWidth()-15, 20 );

       } 
       
       g.drawImage(down, getWidth()-30, 140, Graphics.LEFT|Graphics.TOP);
       g.drawImage(down, getWidth()-30, 170, Graphics.LEFT|Graphics.TOP);
                     g.setColor(0,0,0);
       g.drawLine(0, 138, getWidth(), 138);
       g.drawLine(0, 168, getWidth(), 168);
       
       g.drawString(mypar5.getPanelButton4(), 25, 140, Graphics.LEFT|Graphics.TOP);
       g.drawString(mypar5.getPanelButton5(), 25, 170, Graphics.LEFT|Graphics.TOP);
           

       if (button1==true){
       g.setColor(200,255,0);
       g.fillRect(3, 160, getWidth()-6, 110);
       g.setColor(0,0,0); 
       e = new LineEnumeration(fontMedium, mypar5.getPanelText4(), getWidth());
       e.writeTo(g, 5, 165, fontMedium);
       
  
       g.drawImage(up, getWidth()-30, 140, Graphics.LEFT|Graphics.TOP);
       
       }
       if (button2==true){
        g.setColor(200,255,0);
       g.fillRect(3, 40, getWidth()-6, 270);   
       g.setColor(0,0,0);
          e = new LineEnumeration(fontMedium, mypar5.getPanelText5(), getWidth());
       e.writeTo(g, 5, 52, fontMedium);
       
  
      
       
       }   
     }
  if(pages == 7){

   LineEnumeration e = new LineEnumeration(fontLarge, " "+mypar6.getHeading(), getWidth());
             
                e.writeTo(g, 12, titleHight, fontLarge);
   
                g.setFont(fontMedium);
   e = new LineEnumeration(fontLarge, " "+mypar6.getQuestions(), getWidth());
             
                e.writeTo(g, 18, 240, fontMedium);
   
                g.setFont(fontMedium);
                
       if (button == 0){
      g.setColor(200,255,0);
      g.fillArc(0, 90, getWidth()-15, 20, button, GAME_B);
     
      g.fillRect(0, 90 , getWidth()-15, 20 );
       
       
       }
       
       if (button ==1){
           g.setColor(200,255,0);
           
           g.fillRect(0, 198 ,getWidth()-15, 20);

       }
   //draw down images   
                     g.drawImage(down, getWidth()-30, 90, Graphics.LEFT|Graphics.TOP);
                     g.drawImage(down, getWidth()-30, 198, Graphics.LEFT|Graphics.TOP);
                     
//draw Break Lines
                     g.setColor(0,0,0);
                     
       g.drawLine(0, 85, getWidth(), 85);
           g.drawLine(0, 222, getWidth(), 222);
           
 //draw Buttons
           g.drawString(mypar6.getPanelButton1(), 25, 90, Graphics.LEFT|Graphics.TOP);
           g.drawString(mypar6.getPanelButton2(), 25, 198, Graphics.LEFT|Graphics.TOP);
       
    
                            

       if (button1==true){
       
       g.drawImage(selfy, 0, 90, Graphics.LEFT|Graphics.TOP);
       
       }
       
       else if (button2 ==true){
       
       g.drawImage(christian, 0, 18, Graphics.LEFT|Graphics.TOP);     
       
           
           
       }

        
  }
       if(pages == 8){
            LineEnumeration e = new LineEnumeration(fontLarge, " "+mypar7.getHeading(), getWidth());
             
                e.writeTo(g, 12, titleHight, fontLarge);
   
                g.setFont(fontMedium);
                
       if (button == 0){
      g.setColor(200,255,0);
      g.fillRect(0, 90 , getWidth()-15, 20 );
       
       
       }
       
       if (button ==1){
           g.setColor(200,255,0);
           
           g.fillRect(0, 198 ,getWidth()-15, 20);

       }
   //draw down images   
                     g.drawImage(down, getWidth()-30, 90, Graphics.LEFT|Graphics.TOP);
                     g.drawImage(down, getWidth()-30, 198, Graphics.LEFT|Graphics.TOP);
                     
//draw Break Lines
                     g.setColor(0,0,0);
                     
       g.drawLine(0, 85, getWidth(), 85);
           g.drawLine(0, 222, getWidth(), 222);
           
 //draw Buttons
           g.drawString(mypar7.getPanelButton1(), 25, 90, Graphics.LEFT|Graphics.TOP);
           g.drawString(mypar7.getPanelButton2(), 25, 198, Graphics.LEFT|Graphics.TOP);
       
    
                            

       if (button1==true){
       g.setColor(200,255,0); 
       g.fillRect(3, 115, getWidth()-6, 100);
       g.setColor(0,0,0);
       e = new LineEnumeration(fontMedium, mypar7.getPanelText1(), getWidth());
       e.writeTo(g, 5, 120, fontMedium);
       g.drawImage(up, getWidth()-30, 90, Graphics.LEFT|Graphics.TOP);
       
       }
       
       else if (button2 ==true){
       g.setColor(200,255,0);
       g.fillRect(3, 100, getWidth()-6, 170);
       g.setColor(0,0,0);
       e = new LineEnumeration(fontMedium, mypar7.getPanelText2(), getWidth());
       e.writeTo(g, 5, 110, fontMedium);
          
       
           
           
       }

        e = new LineEnumeration(fontLarge, " "+mypar7.getQuestions(), getWidth());
             
                e.writeTo(g, 18, 270, fontMedium);
   
                g.setFont(fontMedium);
    
     }   
       if(pages == 9){

   LineEnumeration e = new LineEnumeration(fontLarge, " "+mypar8.getHeading(), getWidth());
             
                e.writeTo(g, 12, titleHight, fontLarge);
                g.setFont(fontMedium);
                
       if (button == 0){
      g.setColor(200,255,0);
      g.fillRect(0, 190 , getWidth()-15, 20 );
      
       }
       if (button == 1){
      g.setColor(200,255,0);
      g.fillRect(0, 220 , getWidth()-15, 20 );
      
       
       
       } 
       if (button == 2){
      g.setColor(200,255,0);
      g.fillRect(0, 250 , getWidth()-15, 20 );
       }
        g.drawImage(down, getWidth()-30, 190, Graphics.LEFT|Graphics.TOP);
        g.drawImage(down, getWidth()-30, 220, Graphics.LEFT|Graphics.TOP);
        g.drawImage(down, getWidth()-30, 250, Graphics.LEFT|Graphics.TOP);
  //draw Break Lines
                     g.setColor(0,0,0);
                     
        g.drawLine(0, 188, getWidth(), 188);
        g.drawLine(0, 218, getWidth(), 218);
        g.drawLine(0, 248, getWidth(), 248);
           
 //draw Buttons
           g.drawString(mypar8.getPanelButton1(), 25, 190, Graphics.LEFT|Graphics.TOP);
           g.drawString(mypar8.getPanelButton2(), 25, 220, Graphics.LEFT|Graphics.TOP);
           g.drawString(mypar8.getPanelButton3(), 25, 250, Graphics.LEFT|Graphics.TOP);
             
       if (button1==true){
           g.setColor(200,255,0);  
       g.fillRect(3, 110, getWidth()-6, 170);
       g.setColor(0,0,0);
       e = new LineEnumeration(fontMedium, mypar8.getPanelText1(), getWidth());
       e.writeTo(g, 5, 117, fontMedium);
       
  
      
       
       }if (button2==true){
       g.setColor(200,255,0);
       g.fillRect(3, 5, getWidth()-6, 315);
          
          g.setColor(0,0,0);
          e = new LineEnumeration(fontMedium, mypar8.getPanelText2(), getWidth());
          e.writeTo(g, 5, 9, fontMedium);
       
  
       
       }
       if (button3==true){
       
          g.drawImage(trust, 0, 10, Graphics.LEFT|Graphics.TOP);
      
       }
     }
       
   if(pages == 10){
   LineEnumeration e = new LineEnumeration(fontLarge, " "+mypar9.getNumber(), getWidth());
       e.writeTo(g, 0, titleHight, fontLarge);
   e = new LineEnumeration(fontLarge, ""+mypar9.getHeading(), getWidth());
             
                e.writeTo(g, 12, titleHight, fontLarge);
                g.setFont(fontMedium);
                
       if (button == 0){
      g.setColor(200,255,0);
      g.fillRect(0, 190 , getWidth()-15, 20 );
      
       }
       if (button == 1){
      g.setColor(200,255,0);
      g.fillRect(0, 220 , getWidth()-15, 20 );
      
       
       
       } 
       if (button == 2){
      g.setColor(200,255,0);
      g.fillRect(0, 250 , getWidth()-15, 20 );
       }
        g.drawImage(down, getWidth()-30, 190, Graphics.LEFT|Graphics.TOP);
        g.drawImage(down, getWidth()-30, 220, Graphics.LEFT|Graphics.TOP);
        g.drawImage(down, getWidth()-30, 250, Graphics.LEFT|Graphics.TOP);
  //draw Break Lines
                     g.setColor(0,0,0);
                     
        g.drawLine(0, 188, getWidth(), 188);
        g.drawLine(0, 218, getWidth(), 218);
        g.drawLine(0, 248, getWidth(), 248);
           
 //draw Buttons
           g.drawString(mypar9.getPanelButton1(), 25, 190, Graphics.LEFT|Graphics.TOP);
           g.drawString(mypar9.getPanelButton2(), 25, 220, Graphics.LEFT|Graphics.TOP);
           g.drawString(mypar9.getPanelButton3(), 25, 250, Graphics.LEFT|Graphics.TOP);
             
       if (button1==true){
           g.setColor(200,255,0);  
       g.fillRect(3, 215, getWidth()-6, 40);
       g.setColor(0,0,0);
       e = new LineEnumeration(fontMedium, mypar9.getPanelText1(), getWidth());
       e.writeTo(g, 5, 218, fontMedium);
       
  
       g.drawImage(up, getWidth()-30, 190, Graphics.LEFT|Graphics.TOP);
       
       }if (button2==true){
       g.setColor(200,255,0);
       g.fillRect(3, 245, getWidth()-6, 30);
          
          g.setColor(0,0,0);
          e = new LineEnumeration(fontMedium, mypar9.getPanelText2(), getWidth());
          e.writeTo(g, 5, 248, fontMedium);
       
  
       g.drawImage(up, getWidth()-30, 220, Graphics.LEFT|Graphics.TOP);
       
       }
       if (button3==true){
       g.setColor(200,255,0);
       g.fillRect(3, 275, getWidth()-6, 30);
          g.setColor(0,0,0);
          e = new LineEnumeration(fontMedium, mypar9.getPanelText3(), getWidth());
          e.writeTo(g, 5, 278, fontMedium);
      
       }  
            
  }
  if(pages == 11){

  LineEnumeration e;

       g.setFont(fontMedium);
         e = new LineEnumeration(fontLarge, " "+mypar9.getQuestions(), getWidth());
           
         e.writeTo(g, 18, 215, fontLarge);
                   g.setFont(fontMedium);
                
       if (button == 0){
      g.setColor(200,255,0);
      g.fillRect(0, 140 , getWidth()-15, 20 );
      
       }
       if (button == 1){
      g.setColor(200,255,0);
      g.fillRect(0, 170 , getWidth()-15, 20 );

       } 
       
       g.drawImage(down, getWidth()-30, 140, Graphics.LEFT|Graphics.TOP);
       g.drawImage(down, getWidth()-30, 170, Graphics.LEFT|Graphics.TOP);
                     g.setColor(0,0,0);
       g.drawLine(0, 138, getWidth(), 138);
       g.drawLine(0, 168, getWidth(), 168);
       
       g.drawString(mypar9.getPanelButton4(), 25, 140, Graphics.LEFT|Graphics.TOP);
       g.drawString(mypar9.getPanelButton5(), 25, 170, Graphics.LEFT|Graphics.TOP);
           

       if (button1==true){
       g.setColor(200,255,0);
       g.fillRect(3, 165, getWidth()-6, 70);
       g.setColor(0,0,0); 
       e = new LineEnumeration(fontMedium, mypar9.getPanelText4(), getWidth());
       e.writeTo(g, 5, 168, fontMedium);
       
  
       g.drawImage(up, getWidth()-30, 140, Graphics.LEFT|Graphics.TOP);
       
       }
       if (button2==true){
        g.setColor(200,255,0);
       g.fillRect(3, 195, getWidth()-6, 130);   
       g.setColor(0,0,0);
          e = new LineEnumeration(fontMedium, mypar9.getPanelText5(), getWidth());
       e.writeTo(g, 5, 198, fontMedium);
       
  
      
       
       }   
     }
       
  if(pages == 12){
      LineEnumeration e = new LineEnumeration(fontLarge, " "+mypar10.getHeading(), getWidth());
             
                e.writeTo(g, 12, titleHight, fontLarge);
                g.setFont(fontMedium);
                
       if (button == 0){
      g.setColor(200,255,0);
      g.fillRect(0, 190 , getWidth()-15, 20 );
      
       }
       if (button == 1){
      g.setColor(200,255,0);
      g.fillRect(0, 220 , getWidth()-15, 20 );
      
       
       
       } 
       if (button == 2){
      g.setColor(200,255,0);
      g.fillRect(0, 250 , getWidth()-15, 20 );
       }
        g.drawImage(down, getWidth()-30, 190, Graphics.LEFT|Graphics.TOP);
        g.drawImage(down, getWidth()-30, 220, Graphics.LEFT|Graphics.TOP);
        g.drawImage(down, getWidth()-30, 250, Graphics.LEFT|Graphics.TOP);
  //draw Break Lines
                     g.setColor(0,0,0);
                     
        g.drawLine(0, 188, getWidth(), 188);
        g.drawLine(0, 218, getWidth(), 218);
        g.drawLine(0, 248, getWidth(), 248);
           
 //draw Buttons
           g.drawString(mypar10.getPanelButton1(), 25, 190, Graphics.LEFT|Graphics.TOP);
           g.drawString(mypar10.getPanelButton2(), 25, 220, Graphics.LEFT|Graphics.TOP);
           g.drawString(mypar10.getPanelButton3(), 25, 250, Graphics.LEFT|Graphics.TOP);
             
       if (button1==true){
           g.setColor(200,255,0);  
       g.fillRect(3, 212, getWidth()-6, 50);
       g.setColor(0,0,0);
       e = new LineEnumeration(fontMedium, mypar10.getPanelText1(), getWidth());
       e.writeTo(g, 5, 214, fontMedium);
       
  
       g.drawImage(up, getWidth()-30, 190, Graphics.LEFT|Graphics.TOP);
       
       }if (button2==true){
       g.setColor(200,255,0);
       g.fillRect(3, 242, getWidth()-6, 50);
          
          g.setColor(0,0,0);
          e = new LineEnumeration(fontMedium, mypar10.getPanelText2(), getWidth());
          e.writeTo(g, 5, 244, fontMedium);
       
  
       g.drawImage(up, getWidth()-30, 220, Graphics.LEFT|Graphics.TOP);
       
       }
       if (button3==true){
       g.setColor(200,255,0);
       g.fillRect(3, 272, getWidth()-6, 50);
          g.setColor(0,0,0);
          e = new LineEnumeration(fontMedium, mypar10.getPanelText3(), getWidth());
          e.writeTo(g, 5, 274, fontMedium);
      
       }  
            
     }
      if(pages == 13){
    LineEnumeration e;

       g.setFont(fontMedium);
         e = new LineEnumeration(fontLarge, " "+mypar10.getQuestions(), getWidth());
           
         e.writeTo(g, 18, 240, fontLarge);
                   g.setFont(fontMedium);
                
       if (button == 0){
      g.setColor(200,255,0);
      g.fillRect(0, 70 , getWidth()-15, 20 );
      
       }
       if (button == 1){
      g.setColor(200,255,0);
      g.fillRect(0, 120 , getWidth()-15, 20 );
      
       
       
       } 
       if (button == 2){
      g.setColor(200,255,0);
      g.fillRect(0, 170 , getWidth()-15, 20 );
       }
        
       
       g.drawImage(down, getWidth()-30, 70, Graphics.LEFT|Graphics.TOP);
       g.drawImage(down, getWidth()-30, 120, Graphics.LEFT|Graphics.TOP);
       g.drawImage(down, getWidth()-30, 170, Graphics.LEFT|Graphics.TOP);
       
                     g.setColor(0,0,0);
       g.drawLine(0, 68, getWidth(), 68);
       g.drawLine(0, 118, getWidth(), 118);
       g.drawLine(0, 168, getWidth(), 168);
       
       
       g.drawString(mypar10.getPanelButton4(), 25, 70, Graphics.LEFT|Graphics.TOP);
       g.drawString(mypar10.getPanelButton5(), 25, 120, Graphics.LEFT|Graphics.TOP);
       g.drawString(mypar10.getPanelButton6(), 25, 170, Graphics.LEFT|Graphics.TOP);
       
           

       if (button1==true){
       g.setColor(200,255,0);
       g.fillRect(3, 92, getWidth()-6, 60);
       g.setColor(0,0,0); 
       e = new LineEnumeration(fontMedium, mypar10.getPanelText4(), getWidth());
       e.writeTo(g, 5, 100, fontMedium);
       
  
       g.drawImage(up, getWidth()-30, 90, Graphics.LEFT|Graphics.TOP);
       
       } 
       if (button2==true){
       g.setColor(200,255,0);
       g.fillRect(3, 142, getWidth()-6, 55);
       g.setColor(0,0,0); 
       e = new LineEnumeration(fontMedium, mypar10.getPanelText5(), getWidth());
       e.writeTo(g, 5, 150, fontMedium);
       
  
       g.drawImage(up, getWidth()-30, 120, Graphics.LEFT|Graphics.TOP);
       
       }
       if (button3==true){
       g.setColor(200,255,0);
       g.fillRect(3, 192, getWidth()-6, 70);
       g.setColor(0,0,0); 
       e = new LineEnumeration(fontMedium, mypar10.getPanelText6(), getWidth());
       e.writeTo(g, 5, 198, fontMedium);
       
  
       g.drawImage(up, getWidth()-30, 170, Graphics.LEFT|Graphics.TOP);
       
       }
      }
      if(pages == 14){
          
     LineEnumeration e = new LineEnumeration(fontLarge, " "+mypar11.getHeading(), getWidth());
             
                e.writeTo(g, 12, titleHight, fontLarge);
                g.setFont(fontMedium);
                
                g.setFont(fontMedium);                        
    LineEnumeration e2 = new LineEnumeration(fontMedium, " "+mypar11.getText(), getWidth());
        e2.writeTo(g, 0, 100, fontMedium);
                g.setFont(fontMedium);
                
       if (button == 0){
      g.setColor(200,255,0);
      g.fillRect(0, 190 , getWidth()-15, 20 );
      
       }
       if (button == 1){
      g.setColor(200,255,0);
      g.fillRect(0, 220 , getWidth()-15, 20 );
      
       
       
       } 
       if (button == 2){
      g.setColor(200,255,0);
      g.fillRect(0, 250 , getWidth()-15, 20 );
       }
        g.drawImage(down, getWidth()-30, 190, Graphics.LEFT|Graphics.TOP);
        g.drawImage(down, getWidth()-30, 220, Graphics.LEFT|Graphics.TOP);
        g.drawImage(down, getWidth()-30, 250, Graphics.LEFT|Graphics.TOP);
  //draw Break Lines
                     g.setColor(0,0,0);
                     
        g.drawLine(0, 188, getWidth(), 188);
        g.drawLine(0, 218, getWidth(), 218);
        g.drawLine(0, 248, getWidth(), 248);
           
 //draw Buttons
           g.drawString(mypar11.getPanelButton1(), 25, 190, Graphics.LEFT|Graphics.TOP);
           g.drawString(mypar11.getPanelButton2(), 25, 220, Graphics.LEFT|Graphics.TOP);
           g.drawString(mypar11.getPanelButton3(), 25, 250, Graphics.LEFT|Graphics.TOP);
             
       if (button1==true){
           g.setColor(200,255,0);  
       g.fillRect(3, 190, getWidth()-6, 20);
       g.setColor(0,0,0);
       e = new LineEnumeration(fontMedium, mypar11.getPanelText1(), getWidth());
       e.writeTo(g, 5, 192, fontMedium);
       
  
       g.drawImage(up, getWidth()-30, 190, Graphics.LEFT|Graphics.TOP);
       
       }if (button2==true){
       g.setColor(200,255,0);
       g.fillRect(3, 220, getWidth()-6, 20);
          
          g.setColor(0,0,0);
          e = new LineEnumeration(fontMedium, mypar11.getPanelText2(), getWidth());
          e.writeTo(g, 5, 222, fontMedium);
       
  
       g.drawImage(up, getWidth()-30, 220, Graphics.LEFT|Graphics.TOP);
       
       }
       if (button3==true){
       g.setColor(200,255,0);
       g.fillRect(3, 250, getWidth()-6, 20);
          g.setColor(0,0,0);
          e = new LineEnumeration(fontMedium, mypar11.getPanelText3(), getWidth());
          e.writeTo(g, 5, 252, fontMedium);
      
       }  
          
      }
  
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////7/
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
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
             if (pages ==15){
                 pages =14;
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
             if (button3 ==true){
                 button3=false;
             }
         }
         else if (button ==1){
             button2 = !button2;
               if (button1 ==true){
                 button1=false;
             }
               if (button3 ==true){
                 button3=false;
             }
         }
         else if (button ==2){
             button3 = !button3;
               if (button1 ==true){
                 button1=false;
             }
               if (button2 ==true){
                 button2=false;
             }
         }
         }
          
          
          
           if(getGameAction(keyCode) == DOWN & button ==0){
            button = 2;           
            
        }
            if(getGameAction(keyCode) == UP & button ==1){
            button = 0;           
            
        }
            if(getGameAction(keyCode) == DOWN & button ==1){
            button = 2;           
            
        }
            if(getGameAction(keyCode) == UP & button ==2){
            button = 1;           
            
        }
             
       
        else if(keyCode == -6){
        //midlet.notifyDestroyed();
              Display.getDisplay(midlet).setCurrent(midlet.myMenu); // back to menu
        }
        
        repaint();
    }
  
    
    
}
