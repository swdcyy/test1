package com.kwai.video.clipkit.watermark.WatermarkText;
import java.lang.Object;
import com.kwai.video.clipkit.watermark.WatermarkTextMargin;
import java.lang.String;

public class WatermarkText	// class@001b0a
{
    public float fontSize;
    public String text;
    public int textColor;
    public WatermarkTextMargin textMargin;

    public void WatermarkText(){
       super();
       this.fontSize = 0x41f00000;
       this.textColor = -1;
       this.textMargin = new WatermarkTextMargin();
    }
    public void WatermarkText(String p0,float p1){
       super();
       this.text = p0;
       this.fontSize = p1;
    }
    public float getFontSize(){
       return this.fontSize;
    }
    public String getText(){
       return this.text;
    }
    public int getTextColor(){
       return this.textColor;
    }
    public WatermarkTextMargin getTextMargin(){
       return this.textMargin;
    }
    public void setFontSize(float p0){
       this.fontSize = p0;
    }
    public void setText(String p0){
       this.text = p0;
    }
    public void setTextColor(int p0){
       this.textColor = p0;
    }
    public void setTextMargin(WatermarkTextMargin p0){
       this.textMargin = p0;
    }
}
