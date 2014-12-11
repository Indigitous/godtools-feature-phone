package Code;

import java.io.InputStream;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MyParser {

	private String headings = "";
	private String numbers = "";
	private String peekpanels = "";
	private String subheads = "";
	private String buttontexts = "";
	private String buttonimages = "";
	private String panelbuttons1 = "";
	private String panelimages1 = "";
	private String paneltexts1 = "";
	
	private String panelbuttons2 = "";
	private String panelimages2 = "";
	private String paneltexts2 = "";
	private String panelbuttons3 = "";
	private String panelimages3 = "";
	private String paneltexts3 = "";
	private String panelbuttons4 = "";
	private String panelimages4 = "";
	private String paneltexts4 = "";
	private String panelbuttons5 = "";
	private String panelimages5 = "";
	private String paneltexts5 = "";
        private String panelbuttons6 = "";
	private String panelimages6 = "";
	private String paneltexts6 = "";
	
	private String texts = "";
	private String images = "";
	private String questions = "";

	public MyParser(String path) {
		try {

			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser = factory.newSAXParser();

			DefaultHandler MyHandler = new DefaultHandler() {
				boolean heading = false;
				boolean number = false;
				boolean peekpanel = false;
				boolean subheading = false;
				boolean buttontext = false;
				boolean bimage = false;
				
				boolean pbutton1 = false;
				boolean pimage1 = false;
				boolean ptext1 = false;
				
				boolean pbutton2 = false;
				boolean pimage2 = false;
				boolean ptext2 = false;
				
				boolean pbutton3 = false;
				boolean pimage3 = false;
				boolean ptext3  = false;
				
				boolean pbutton4 = false;
				boolean pimage4 = false;
				boolean ptext4 = false;
				
				boolean pbutton5 = false;
				boolean pimage5 = false;
				boolean ptext5 = false;
                                
                                boolean pbutton6 = false;
				boolean pimage6 = false;
				boolean ptext6 = false;
				
				boolean text = false;
				boolean image = false;
				boolean question = false;

				public void startElement(String uri, String localName,
						String qName, Attributes attributes)
						throws SAXException {
					if (qName.equals("heading")) {
						heading = true;
					}

					if (qName.equals("number")) {
						number = true;
					}

					if (qName.equals("peekpanel")) {
						peekpanel = true;
					}

					if (qName.equals("subheading")) {
						subheading = true;
					}
					if (qName.equals("buttontext")) {
						buttontext = true;
					}

					if (qName.equals("number")) {
						number = true;
					}

					if (qName.equals("pbutton1")) {
						pbutton1 = true;
					}
					if (qName.equals("pimage1")) {
						pimage1 = true;
					}

					if (qName.equals("ptext1")) {
						ptext1 = true;
					}
					
					if (qName.equals("pbutton2")) {
						pbutton2 = true;
					}
					if (qName.equals("pimage2")) {
						pimage2 = true;
					}

					if (qName.equals("ptext2")) {
						ptext2 = true;
					}
					
					
					if (qName.equals("pbutton3")) {
						pbutton3 = true;
					}
					if (qName.equals("pimage3")) {
						pimage3 = true;
					}

					if (qName.equals("ptext3")) {
						ptext3 = true;
					}
					
					if (qName.equals("pbutton4")) {
						pbutton4 = true;
					}
					if (qName.equals("pimage4")) {
						pimage4 = true;
					}

					if (qName.equals("ptext4")) {
						ptext4 = true;
					}
					
					if (qName.equals("pbutton5")) {
						pbutton5 = true;
					}
					if (qName.equals("pimage5")) {
						pimage5 = true;
					}

					if (qName.equals("ptext5")) {
						ptext5 = true;
					}
                                        
                                        if (qName.equals("pbutton6")) {
						pbutton6 = true;
					}
					if (qName.equals("pimage6")) {
						pimage6 = true;
					}

					if (qName.equals("ptext6")) {
						ptext6 = true;
					}

					if (qName.equals("text")) {
						text = true;
					}

					if (qName.equals("image")) {
						image = true;
					}
					if (qName.equals("question")) {
						question = true;
					}

				}

				public void characters(char ch[], int start, int length)
						throws SAXException {

					if (heading) {
						headings=(new String(ch, start, length));
						heading = false;
					}

					if (number) {
						numbers=(new String(ch, start, length));
						number = false;
					}

					if (peekpanel) {
						peekpanels=(new String(ch, start, length));
						peekpanel = false;
					}

					if (subheading) {
						subheads=(new String(ch, start, length));
						subheading = false;
					}
					if (buttontext) {
						buttontexts=(new String(ch, start, length));
						buttontext = false;
					}
					if (bimage) {
						buttonimages=(new String(ch, start, length));
						bimage = false;
					}
					if (pbutton1) {
						panelbuttons1=(new String(ch, start, length));
						pbutton1 = false;
					}
					if (pimage1) {
						panelimages1=(new String(ch, start, length));
						pimage1 = false;
					}
					if (ptext1) {
						paneltexts1=(new String(ch, start, length));
						ptext1 = false;
					}
					
					
					if (pbutton2) {
						panelbuttons2=(new String(ch, start, length));
						pbutton2 = false;
					}
					if (pimage2) {
						panelimages2=(new String(ch, start, length));
						pimage2 = false;
					}
					if (ptext2) {
						paneltexts2=(new String(ch, start, length));
						ptext2 = false;
					}
					
					if (pbutton3) {
						panelbuttons3=(new String(ch, start, length));
						pbutton3 = false;
					}
					if (pimage3) {
						panelimages3=(new String(ch, start, length));
						pimage3 = false;
					}
					if (ptext3) {
						paneltexts3=(new String(ch, start, length));
						ptext3 = false;
					}
					
					if (pbutton4) {
						panelbuttons4=(new String(ch, start, length));
						pbutton4 = false;
					}
					if (pimage4) {
						panelimages4=(new String(ch, start, length));
						pimage4 = false;
					}
					if (ptext4) {
						paneltexts4=(new String(ch, start, length));
						ptext4 = false;
					}
					
					if (pbutton5) {
						panelbuttons5=(new String(ch, start, length));
						pbutton5 = false;
					}
					if (pimage5) {
						panelimages5=(new String(ch, start, length));
						pimage5 = false;
					}
					if (ptext5) {
						paneltexts5=(new String(ch, start, length));
						ptext5 = false;
					}
                                        if (pbutton6) {
						panelbuttons6=(new String(ch, start, length));
						pbutton6 = false;
					}
					if (pimage6) {
						panelimages6=(new String(ch, start, length));
						pimage6 = false;
					}
					if (ptext6) {
						paneltexts6=(new String(ch, start, length));
						ptext6 = false;
					}
					
					
					if (text) {
						texts=(new String(ch, start, length));
						text = false;
					}
					if (image) {
						images=(new String(ch, start, length));
						image = false;
					}
					if (question) {
						questions=(new String(ch, start, length));
						question = false;
					}
				}

			};

			try {
                        
                            InputStream file = getClass().getResourceAsStream(path);
                            saxParser.parse(file, MyHandler);
                        } catch (Exception e) {
                        }
                        
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getHeading() {
		return headings;
	}

	public String getNumber() {
		return numbers;
	}

	public String getPeekPanel() {
		return peekpanels;
	}

	public String getSubHeading() {
		return subheads;
	}

	public String getButtonImage() {
		return buttonimages;
	}

	public String getButtonText() {
		return buttontexts;
	}

	public String getPanelButton1() {
		return panelbuttons1;
	}

	public String getPanelImage1() {
		String str = "";
		char kar = '_';
		for(int i = 0;i<panelimages1.length();i++){
			if(kar == '/' | kar == '"'){
			}else {
				str = str+panelimages1.charAt(i);
			}
			
		}
		return str;
	}

	public String getPanelText1() {
		return paneltexts1;
	}

	
	public String getPanelButton2() {
		return panelbuttons2;
	}

	public String getPanelImage2() {
		String str = "";
		char kar = '_';
		for(int i = 0;i<panelimages2.length();i++){
			if(kar == '/' | kar == '"'){
			}else {
				str = str+panelimages2.charAt(i);
			}
			
		}
		return str;
	}

	public String getPanelText2() {
		return paneltexts2;
	}
	
	public String getPanelButton3() {
		return panelbuttons3;
	}

	public String getPanelImage3() {
		String str = "";
		char kar = '_';
		for(int i = 0;i<panelimages3.length();i++){
			if(kar == '/' | kar == '"'){
			}else {
				str = str+panelimages3.charAt(i);
			}
		}
		return str;
	}

	public String getPanelText3() {
		return paneltexts3;
	}
	
	public String getPanelButton4() {
		return panelbuttons4;
	}

	public String getPanelImage4() {
		String str = "";
		char kar = '_';
		for(int i = 0;i<panelimages4.length();i++){
			if(kar == '/' | kar == '"'){
			}else {
				str = str+panelimages4.charAt(i);
			}
			
		}
		return str;
	}

	public String getPanelText4() {
		return paneltexts4;
	}
	
	public String getPanelButton5() {
		return panelbuttons5;
	}

	public String getPanelImage5() {
		String str = "";
		char kar = '_';
		for(int i = 0;i<panelimages5.length();i++){
			if(kar == '/' | kar == '"'){
			}else {
				str = str+panelimages5.charAt(i);
			}
			
		}
		return str;
	}

	public String getPanelText5() {
		return paneltexts5;
	}
        public String getPanelButton6() {
		return panelbuttons6;
	}

	public String getPanelImage6() {
		String str = "";
		char kar = '_';
		for(int i = 0;i<panelimages6.length();i++){
			if(kar == '/' | kar == '"'){
			}else {
				str = str+panelimages6.charAt(i);
			}
		                                              
		}
		return str;
	}

	public String getPanelText6() {
		return paneltexts6;
	}
	
	public String getText() {
		return texts;
	}

	public String getImage() {
		String str = null;
		char kar = '_';
		for(int i = 0;i<images.length();i++){
			if(kar == '/' | kar == '"'){
			}else {
				str = str+images.charAt(i);
			}
			
		}
		return str;
	}

	public String getQuestions() {
		return questions;
	}
}
