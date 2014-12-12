package Code;

import java.io.InputStream;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MyParser {

    private String heading = "";
    private String number = "";
    private String peekpanel = "";
    private String subhead = "";
    private String buttontext = "";
    private String buttonimage = "";
    private String panelbutton1 = "";
    private String panelimage1 = "";
    private String paneltext1 = "";
    private String panelbutton2 = "";
    private String panelimage2 = "";
    private String paneltext2 = "";
    private String panelbutton3 = "";
    private String panelimage3 = "";
    private String paneltext3 = "";
    private String panelbutton4 = "";
    private String panelimage4 = "";
    private String paneltext4 = "";
    private String panelbutton5 = "";
    private String panelimage5 = "";
    private String paneltext5 = "";
    private String panelbutton6 = "";
    private String panelimage6 = "";
    private String paneltext6 = "";
    private String text = "";
    private String image = "";
    private String question = "";

    public MyParser(String path) {
        try {

            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();

            DefaultHandler MyHandler = new DefaultHandler() {
                boolean b_heading = false;
                boolean b_number = false;
                boolean b_peekpanel = false;
                boolean b_subheading = false;
                boolean b_buttontext = false;
                boolean b_bimage = false;
                boolean b_pbutton1 = false;
                boolean b_pimage1 = false;
                boolean b_ptext1 = false;
                boolean b_pbutton2 = false;
                boolean b_pimage2 = false;
                boolean b_ptext2 = false;
                boolean b_pbutton3 = false;
                boolean b_pimage3 = false;
                boolean b_ptext3 = false;
                boolean b_pbutton4 = false;
                boolean b_pimage4 = false;
                boolean b_ptext4 = false;
                boolean b_pbutton5 = false;
                boolean b_pimage5 = false;
                boolean b_ptext5 = false;
                boolean b_pbutton6 = false;
                boolean b_pimage6 = false;
                boolean b_ptext6 = false;
                boolean b_text = false;
                boolean b_image = false;
                boolean b_question = false;

                public void startElement(String uri, String localName,
                        String qName, Attributes attributes)
                        throws SAXException {
                    if (qName.equals("heading")) {
                        b_heading = true;
                    }

                    if (qName.equals("number")) {
                        b_number = true;
                    }

                    if (qName.equals("peekpanel")) {
                        b_peekpanel = true;
                    }

                    if (qName.equals("subheading")) {
                        b_subheading = true;
                    }
                    if (qName.equals("buttontext")) {
                        b_buttontext = true;
                    }

                    if (qName.equals("number")) {
                        b_number = true;
                    }

                    if (qName.equals("pbutton1")) {
                        b_pbutton1 = true;
                    }
                    if (qName.equals("pimage1")) {
                        b_pimage1 = true;
                    }

                    if (qName.equals("ptext1")) {
                        b_ptext1 = true;
                    }

                    if (qName.equals("pbutton2")) {
                        b_pbutton2 = true;
                    }
                    if (qName.equals("pimage2")) {
                        b_pimage2 = true;
                    }

                    if (qName.equals("ptext2")) {
                        b_ptext2 = true;
                    }

                    if (qName.equals("pbutton3")) {
                        b_pbutton3 = true;
                    }
                    if (qName.equals("pimage3")) {
                        b_pimage3 = true;
                    }

                    if (qName.equals("ptext3")) {
                        b_ptext3 = true;
                    }

                    if (qName.equals("pbutton4")) {
                        b_pbutton4 = true;
                    }
                    if (qName.equals("pimage4")) {
                        b_pimage4 = true;
                    }

                    if (qName.equals("ptext4")) {
                        b_ptext4 = true;
                    }

                    if (qName.equals("pbutton5")) {
                        b_pbutton5 = true;
                    }
                    if (qName.equals("pimage5")) {
                        b_pimage5 = true;
                    }

                    if (qName.equals("ptext5")) {
                        b_ptext5 = true;
                    }

                    if (qName.equals("pbutton6")) {
                        b_pbutton6 = true;
                    }
                    if (qName.equals("pimage6")) {
                        b_pimage6 = true;
                    }

                    if (qName.equals("ptext6")) {
                        b_ptext6 = true;
                    }

                    if (qName.equals("text")) {
                        b_text = true;
                    }

                    if (qName.equals("image")) {
                        b_image = true;
                    }
                    if (qName.equals("question")) {
                        b_question = true;
                    }

                }

                public void characters(char ch[], int start, int length)
                        throws SAXException {

                    if (b_heading) {
                        heading = (new String(ch, start, length));
                        b_heading = false;
                    }

                    if (b_number) {
                        number = (new String(ch, start, length));
                        b_number = false;
                    }

                    if (b_peekpanel) {
                        peekpanel = (new String(ch, start, length));
                        b_peekpanel = false;
                    }

                    if (b_subheading) {
                        subhead = (new String(ch, start, length));
                        b_subheading = false;
                    }
                    if (b_buttontext) {
                        buttontext = (new String(ch, start, length));
                        b_buttontext = false;
                    }
                    if (b_bimage) {
                        buttonimage = (new String(ch, start, length));
                        b_bimage = false;
                    }
                    if (b_pbutton1) {
                        panelbutton1 = (new String(ch, start, length));
                        b_pbutton1 = false;
                    }
                    if (b_pimage1) {
                        panelimage1 = (new String(ch, start, length));
                        b_pimage1 = false;
                    }
                    if (b_ptext1) {
                        paneltext1 = (new String(ch, start, length));
                        b_ptext1 = false;
                    }
                    if (b_pbutton2) {
                        panelbutton2 = (new String(ch, start, length));
                        b_pbutton2 = false;
                    }
                    if (b_pimage2) {
                        panelimage2 = (new String(ch, start, length));
                        b_pimage2 = false;
                    }
                    if (b_ptext2) {
                        paneltext2 = (new String(ch, start, length));
                        b_ptext2 = false;
                    }
                    if (b_pbutton3) {
                        panelbutton3 = (new String(ch, start, length));
                        b_pbutton3 = false;
                    }
                    if (b_pimage3) {
                        panelimage3 = (new String(ch, start, length));
                        b_pimage3 = false;
                    }
                    if (b_ptext3) {
                        paneltext3 = (new String(ch, start, length));
                        b_ptext3 = false;
                    }
                    if (b_pbutton4) {
                        panelbutton4 = (new String(ch, start, length));
                        b_pbutton4 = false;
                    }
                    if (b_pimage4) {
                        panelimage4 = (new String(ch, start, length));
                        b_pimage4 = false;
                    }
                    if (b_ptext4) {
                        paneltext4 = (new String(ch, start, length));
                        b_ptext4 = false;
                    }
                    if (b_pbutton5) {
                        panelbutton5 = (new String(ch, start, length));
                        b_pbutton5 = false;
                    }
                    if (b_pimage5) {
                        panelimage5 = (new String(ch, start, length));
                        b_pimage5 = false;
                    }
                    if (b_ptext5) {
                        paneltext5 = (new String(ch, start, length));
                        b_ptext5 = false;
                    }
                    if (b_pbutton6) {
                        panelbutton6 = (new String(ch, start, length));
                        b_pbutton6 = false;
                    }
                    if (b_pimage6) {
                        panelimage6 = (new String(ch, start, length));
                        b_pimage6 = false;
                    }
                    if (b_ptext6) {
                        paneltext6 = (new String(ch, start, length));
                        b_ptext6 = false;
                    }
                    if (b_text) {
                        text = (new String(ch, start, length));
                        b_text = false;
                    }
                    if (b_image) {
                        image = (new String(ch, start, length));
                        b_image = false;
                    }
                    if (b_question) {
                        question = (new String(ch, start, length));
                        b_question = false;
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
        return heading;
    }

    public String getNumber() {
        return number;
    }

    public String getPeekPanel() {
        return peekpanel;
    }

    public String getSubHeading() {
        return subhead;
    }

    public String getButtonImage() {
        return buttonimage;
    }

    public String getButtonText() {
        return buttontext;
    }

    public String getPanelButton1() {
        return panelbutton1;
    }

    public String getPanelImage1() {
        String str = "";
        char kar = '_';
        for (int i = 0; i < panelimage1.length(); i++) {
            if (kar == '/' | kar == '"') {
            } else {
                str = str + panelimage1.charAt(i);
            }
        }
        return str;
    }

    public String getPanelText1() {
        return paneltext1;
    }

    public String getPanelButton2() {
        return panelbutton2;
    }

    public String getPanelImage2() {
        String str = "";
        char kar = '_';
        for (int i = 0; i < panelimage2.length(); i++) {
            if (kar == '/' | kar == '"') {
            } else {
                str = str + panelimage2.charAt(i);
            }
        }
        return str;
    }

    public String getPanelText2() {
        return paneltext2;
    }

    public String getPanelButton3() {
        return panelbutton3;
    }

    public String getPanelImage3() {
        String str = "";
        char kar = '_';
        for (int i = 0; i < panelimage3.length(); i++) {
            if (kar == '/' | kar == '"') {
            } else {
                str = str + panelimage3.charAt(i);
            }
        }
        return str;
    }

    public String getPanelText3() {
        return paneltext3;
    }

    public String getPanelButton4() {
        return panelbutton4;
    }

    public String getPanelImage4() {
        String str = "";
        char kar = '_';
        for (int i = 0; i < panelimage4.length(); i++) {
            if (kar == '/' | kar == '"') {
            } else {
                str = str + panelimage4.charAt(i);
            }
        }
        return str;
    }

    public String getPanelText4() {
        return paneltext4;
    }

    public String getPanelButton5() {
        return panelbutton5;
    }

    public String getPanelImage5() {
        String str = "";
        char kar = '_';
        for (int i = 0; i < panelimage5.length(); i++) {
            if (kar == '/' | kar == '"') {
            } else {
                str = str + panelimage5.charAt(i);
            }
        }
        return str;
    }

    public String getPanelText5() {
        return paneltext5;
    }

    public String getPanelButton6() {
        return panelbutton6;
    }

    public String getPanelImage6() {
        String str = "";
        char kar = '_';
        for (int i = 0; i < panelimage6.length(); i++) {
            if (kar == '/' | kar == '"') {
            } else {
                str = str + panelimage6.charAt(i);
            }
        }
        return str;
    }

    public String getPanelText6() {
        return paneltext6;
    }

    public String getText() {
        return text;
    }

    public String getImage() {
        String str = null;
        char kar = '_';
        for (int i = 0; i < image.length(); i++) {
            if (kar == '/' | kar == '"') {
            } else {
                str = str + image.charAt(i);
            }
        }
        return str;
    }

    public String getQuestions() {
        return question;
    }
}
