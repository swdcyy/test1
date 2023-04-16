package com.frog.engine.font.FontData;
import java.lang.Object;
import java.lang.String;

public class FontData	// class@001500
{
    public String fontFileName;
    public String style;
    public int weight;

    public void FontData(){
       super();
    }
    public String getFontFileName(){
       return this.fontFileName;
    }
    public String getStyle(){
       return this.style;
    }
    public int getWeight(){
       return this.weight;
    }
    public void setFontFileName(String p0){
       this.fontFileName = p0;
    }
    public void setStyle(String p0){
       this.style = p0;
    }
    public void setWeight(int p0){
       this.weight = p0;
    }
}
