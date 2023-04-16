package com.kwai.video.clipkit.watermark.WatermarkAnimation;
import com.kwai.video.clipkit.ClipConstant$WatermarkPosition;
import java.lang.Object;
import android.graphics.Point;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class WatermarkAnimation	// class@001b08
{
    public double duration;
    public Point margin;
    public Point opacity;
    public double scaleX;
    public double scaleY;
    public int timing;
    public ClipConstant$WatermarkPosition watermarkPosition;

    public void WatermarkAnimation(ClipConstant$WatermarkPosition p0,double p1){
       super();
       this.watermarkPosition = p0;
       this.duration = p1;
       this.margin = new Point(30, 30);
       this.opacity = new Point(1, 1);
       this.scaleX = 0x3ff0000000000000;
       this.scaleY = 0x3ff0000000000000;
       this.timing = 0;
    }
    public static WatermarkAnimation[] getGifAnimations(){
       WatermarkAnimation watermarkAni;
       WatermarkAnimation watermarkAni1;
       WatermarkAnimation watermarkAni2;
       ClipConstant$WatermarkPosition lEFT_TOP;
       WatermarkAnimation watermarkAni3;
       WatermarkAnimation watermarkAni4;
       WatermarkAnimation[] obj = PatchProxy.apply(null, null, WatermarkAnimation.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new WatermarkAnimation[]{watermarkAni,watermarkAni1,watermarkAni2,watermarkAni3,new WatermarkAnimation(lEFT_TOP, 7.20f),watermarkAni4};
       ClipConstant$WatermarkPosition rIGHT_BOTTOM = ClipConstant$WatermarkPosition.RIGHT_BOTTOM;
       watermarkAni = new WatermarkAnimation(rIGHT_BOTTOM, 0x3fd999999999999a);
       watermarkAni.setOpacity(100, 0);
       watermarkAni1 = new WatermarkAnimation(rIGHT_BOTTOM, 7.20f);
       watermarkAni2 = new WatermarkAnimation(rIGHT_BOTTOM, 0x3fd999999999999a);
       watermarkAni2.setOpacity(0, 100);
       lEFT_TOP = ClipConstant$WatermarkPosition.LEFT_TOP;
       watermarkAni3 = new WatermarkAnimation(lEFT_TOP, 0x3fd999999999999a);
       watermarkAni3.setOpacity(100, 0);
       watermarkAni4 = new WatermarkAnimation(lEFT_TOP, 0x3fd999999999999a);
       watermarkAni4.setOpacity(0, 100);
       return obj;
    }
    public double getDuration(){
       return this.duration;
    }
    public int getMarginX(){
       return this.margin.x;
    }
    public int getMarginY(){
       return this.margin.y;
    }
    public Point getOpacity(){
       return this.opacity;
    }
    public double getScaleX(){
       return this.scaleX;
    }
    public double getScaleY(){
       return this.scaleY;
    }
    public int getTiming(){
       return this.timing;
    }
    public ClipConstant$WatermarkPosition getWatermarkPosition(){
       return this.watermarkPosition;
    }
    public void setDuration(double p0){
       this.duration = p0;
    }
    public void setMargin(int p0,int p1){
       WatermarkAnimation tmargin = this.margin;
       tmargin.x = p0;
       tmargin.y = p1;
    }
    public void setMarginX(int p0){
       this.margin.x = p0;
    }
    public void setMarginY(int p0){
       this.margin.y = p0;
    }
    public void setOpacity(int p0,int p1){
       WatermarkAnimation topacity = this.opacity;
       topacity.x = p0;
       topacity.y = p1;
    }
    public void setScale(double p0,double p1){
       this.scaleX = p0;
       this.scaleY = p1;
    }
    public void setScaleX(double p0){
       this.scaleX = p0;
    }
    public void setScaleY(double p0){
       this.scaleY = p0;
    }
    public void setTiming(int p0){
       this.timing = p0;
    }
}
