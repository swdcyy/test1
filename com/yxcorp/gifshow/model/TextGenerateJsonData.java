package com.yxcorp.gifshow.model.TextGenerateJsonData;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.util.v;
import android.graphics.Paint$Align;
import java.util.Objects;

public class TextGenerateJsonData implements Serializable	// class@001e9b
{
    public int bgHeight;
    public int bgWidth;
    public String color;
    public String content;
    public String fontFileName;
    public int fontSize;
    public int h;
    public String id;
    public String letterSpacing;
    public int lineHeight;
    public boolean rl;
    public String shadowColor;
    public float shadowOffsetX;
    public float shadowOffsetY;
    public int shadowRadius;
    public String strokeColor;
    public int strokeLine;
    public String textAlign;
    public int w;
    public int x;
    public int y;
    public static final long serialVersionUID = 0x345446cada7ce958;

    public void TextGenerateJsonData(){
       super();
       this.fontFileName = "";
    }
    public int getBgHeight(){
       return this.bgHeight;
    }
    public int getBgWidth(){
       return this.bgWidth;
    }
    public String getColor(){
       return this.color;
    }
    public String getContent(){
       return this.content;
    }
    public String getFontFileName(){
       return this.fontFileName;
    }
    public int getFontSize(){
       return this.fontSize;
    }
    public int getH(){
       return this.h;
    }
    public String getId(){
       return this.id;
    }
    public String getKey(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TextGenerateJsonData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return v.h(p0+this.content+","+this.letterSpacing+","+this.textAlign+","+this.shadowOffsetX+","+this.shadowOffsetY+","+this.shadowColor+","+this.shadowRadius+","+this.w+","+this.h+","+this.fontSize+","+this.fontFileName+","+this.color);
    }
    public String getLetterSpacing(){
       return this.letterSpacing;
    }
    public int getLineHeight(){
       return this.lineHeight;
    }
    public String getShadowColor(){
       return this.shadowColor;
    }
    public float getShadowOffsetX(){
       return this.shadowOffsetX;
    }
    public float getShadowOffsetY(){
       return this.shadowOffsetY;
    }
    public int getShadowRadius(){
       return this.shadowRadius;
    }
    public String getStrokeColor(){
       return this.strokeColor;
    }
    public int getStrokeLine(){
       return this.strokeLine;
    }
    public Paint$Align getTextAlign(){
       TextGenerateJsonData obj = PatchProxy.apply(null, this, TextGenerateJsonData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.textAlign;
       Objects.requireNonNull(obj);
       int i = -1;
       switch (obj.hashCode()){
           case 0xaeb2cc55:
             if (obj.equals("center")) {
                i = 0;
             }
             break;
           case 0x32a007:
             if (obj.equals("left")) {
                i = 1;
             }
             break;
           case 0x677c21c:
             if (obj.equals("right")) {
                i = 2;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             return Paint$Align.CENTER;
           case 1:
             return Paint$Align.LEFT;
           case 2:
             return Paint$Align.RIGHT;
           default:
             return null;
       }
    }
    public int getW(){
       return this.w;
    }
    public int getX(){
       return this.x;
    }
    public int getY(){
       return this.y;
    }
    public boolean isRl(){
       return this.rl;
    }
    public void setBgHeight(int p0){
       this.bgHeight = p0;
    }
    public void setBgWidth(int p0){
       this.bgWidth = p0;
    }
    public void setColor(String p0){
       this.color = p0;
    }
    public void setContent(String p0){
       this.content = p0;
    }
    public void setFontFileName(String p0){
       this.fontFileName = p0;
    }
    public void setFontSize(int p0){
       this.fontSize = p0;
    }
    public void setH(int p0){
       this.h = p0;
    }
    public void setId(String p0){
       this.id = p0;
    }
    public void setLetterSpacing(String p0){
       this.letterSpacing = p0;
    }
    public void setLineHeight(int p0){
       this.lineHeight = p0;
    }
    public void setRl(boolean p0){
       this.rl = p0;
    }
    public void setShadowColor(String p0){
       this.shadowColor = p0;
    }
    public void setShadowOffsetX(float p0){
       this.shadowOffsetX = p0;
    }
    public void setShadowOffsetY(float p0){
       this.shadowOffsetY = p0;
    }
    public void setShadowRadius(int p0){
       this.shadowRadius = p0;
    }
    public void setStrokeColor(String p0){
       this.strokeColor = p0;
    }
    public void setStrokeLine(int p0){
       this.strokeLine = p0;
    }
    public void setTextAlign(String p0){
       this.textAlign = p0;
    }
    public void setW(int p0){
       this.w = p0;
    }
    public void setX(int p0){
       this.x = p0;
    }
    public void setY(int p0){
       this.y = p0;
    }
}
