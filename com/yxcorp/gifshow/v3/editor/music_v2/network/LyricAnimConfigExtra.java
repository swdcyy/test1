package com.yxcorp.gifshow.v3.editor.music_v2.network.LyricAnimConfigExtra;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class LyricAnimConfigExtra implements Serializable	// class@0010a2
{
    public double animateInRatio;
    public double animateOutRatio;
    public String fontId;
    public float positionX;
    public float positionY;
    public float rotate;
    public float scale;
    public String styleId;
    public double textRangeRatio;

    public void LyricAnimConfigExtra(){
       super();
       this.fontId = "";
       this.styleId = "";
       this.positionX = 0x3f000000;
       this.positionY = 0x3f000000;
       this.scale = 0x3f800000;
       this.textRangeRatio = 0x3ff0000000000000;
    }
    public final double getAnimateInRatio(){
       return this.animateInRatio;
    }
    public final double getAnimateOutRatio(){
       return this.animateOutRatio;
    }
    public final String getFontId(){
       return this.fontId;
    }
    public final float getPositionX(){
       return this.positionX;
    }
    public final float getPositionY(){
       return this.positionY;
    }
    public final float getRotate(){
       return this.rotate;
    }
    public final float getScale(){
       return this.scale;
    }
    public final String getStyleId(){
       return this.styleId;
    }
    public final double getTextRangeRatio(){
       return this.textRangeRatio;
    }
    public final void setAnimateInRatio(double p0){
       this.animateInRatio = p0;
    }
    public final void setAnimateOutRatio(double p0){
       this.animateOutRatio = p0;
    }
    public final void setFontId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LyricAnimConfigExtra.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.fontId = p0;
       return;
    }
    public final void setPositionX(float p0){
       this.positionX = p0;
    }
    public final void setPositionY(float p0){
       this.positionY = p0;
    }
    public final void setRotate(float p0){
       this.rotate = p0;
    }
    public final void setScale(float p0){
       this.scale = p0;
    }
    public final void setStyleId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LyricAnimConfigExtra.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.styleId = p0;
       return;
    }
    public final void setTextRangeRatio(double p0){
       this.textRangeRatio = p0;
    }
}
