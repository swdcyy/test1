package com.kwai.video.clipkit.TextFilter$TextLine;
import java.lang.String;
import java.lang.Object;

public class TextFilter$TextLine	// class@001a4f
{
    public String color;
    public double duration;
    public String font;
    public String text;
    public double timestamp;

    public void TextFilter$TextLine(String p0,double p1,double p2){
       super();
       if (p0 != null) {
       }else {
          p0 = "";
       }
       this.text = p0;
       this.timestamp = p1;
       this.duration = p2;
       return;
    }
    public void TextFilter$TextLine(String p0,double p1,double p2,String p3,String p4){
       super();
       if (p0 != null) {
       }else {
          p0 = "";
       }
       this.text = p0;
       this.timestamp = p1;
       this.duration = p2;
       this.color = p3;
       this.font = p4;
       return;
    }
}
