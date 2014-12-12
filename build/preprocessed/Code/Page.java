/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

import org.json.me.JSONException;
import org.json.me.JSONObject;

/**
 *
 * @author Overcomer
 */
public class Page {
    private String title;
    private String subTitle1;
    private String subTitle2;
    private String subTitle3;
    private String subTitle4;
    private String subTitle5;
    private String subTitle6;
    private String subTitle7;
    private String content1;
    private String content2;
    private String content3;
    private String content4;
    private String content5;
    private String content6;
    private String content7;
    private String end;

    public Page() {
        this.title = null;
        this.subTitle1 = null;
        this.subTitle2 = null;
        this.subTitle3 = null;
        this.subTitle4 = null;
        this.subTitle5 = null;
        this.subTitle6 = null;
        this.subTitle7 = null;
        this.content1 = null;
        this.content2 = null;
        this.content3 = null;
        this.content4 = null;
        this.content5 = null;
        this.content6 = null;
        this.content7 = null;
        this.end = null;
    }

    public String getTitle() {
        return title;
    }

    public String getSubTitle1() {
        return subTitle1;
    }

    public String getSubTitle2() {
        return subTitle2;
    }

    public String getSubTitle3() {
        return subTitle3;
    }

    public String getSubTitle4() {
        return subTitle4;
    }

    public String getSubTitle5() {
        return subTitle5;
    }

    public String getSubTitle6() {
        return subTitle6;
    }

    public String getSubTitle7() {
        return subTitle7;
    }

    public String getContent1() {
        return content1;
    }

    public String getContent2() {
        return content2;
    }

    public String getContent3() {
        return content3;
    }

    public String getContent4() {
        return content4;
    }

    public String getContent5() {
        return content5;
    }

    public String getContent6() {
        return content6;
    }

    public String getContent7() {
        return content7;
    }

    public String getEnd() {
        return end;
    }

    //Setters
    public void setTitle(String value) {
        title = value;
    }

    public void setSubTitle1(String value) {
        subTitle1 = value;
    }

    public void setSubTitle2(String value) {
        subTitle2 = value;
    }

    public void setSubTitle3(String value) {
        subTitle3 = value;
    }

    public void setSubTitle4(String value) {
        subTitle4 = value;
    }

    public void setSubTitle5(String value) {
        subTitle5 = value;
    }

    public void setSubTitle6(String value) {
        subTitle6 = value;
    }

    public void setSubTitle7(String value) {
        subTitle7 = value;
    }

    public void setContent1(String value) {
        content1 = value;
    }

    public void setContent2(String value) {
        content2 = value;
    }

    public void setContent3(String value) {
        content3 = value;
    }

    public void setContent4(String value) {
        content4 = value;
    }

    public void setContent5(String value) {
        content5 = value;
    }

    public void setContent6(String value) {
        content6 = value;
    }

    public void setContent7(String value) {
        content7 = value;
    }

    public void setEnd(String value) {
        end = value;
    }

    public void fromJSON(String jsonString) {
            JSONObject json;
            try {
                json = new JSONObject(jsonString);
                if(json.has("Title")){
                setTitle(json.getString("Title"));
                }
                if(json.has("SubTitle1")){
                setSubTitle1(json.getString("SubTitle1"));
                }
                if(json.has("SubTitle2")){
                setSubTitle2(json.getString("SubTitle2"));
                }
                if(json.has("SubTitle3")){
                setSubTitle3(json.getString("SubTitle3"));
                }
                if(json.has("SubTitle4")){
                setSubTitle4(json.getString("SubTitle4"));
                }
                if(json.has("SubTitle5")){
                setSubTitle5(json.getString("SubTitle5"));
                }
                if(json.has("SubTitle6")){
                setSubTitle6(json.getString("SubTitle6"));
                }
                if(json.has("SubTitle7")){
                setSubTitle7(json.getString("SubTitle7"));
                }
                //
                if(json.has("Content1")){
                setContent1(json.getString("Content1"));
                }
                if(json.has("Content2")){
                setContent2(json.getString("Content2"));
                }
                if(json.has("Content3")){
                setContent3(json.getString("Content3"));
                }
                if(json.has("Content4")){
                setContent4(json.getString("Content4"));
                }
                if(json.has("Content5")){
                setContent5(json.getString("Content5"));
                }
                if(json.has("Content6")){
                setContent6(json.getString("Content6"));
                }
                if(json.has("Content7")){
                setContent6(json.getString("Content7"));
                }
                if(json.has("End")){
                setEnd(json.getString("End"));
                }
                
            } catch (JSONException ex) {
                ex.printStackTrace();
            }
        } 
}