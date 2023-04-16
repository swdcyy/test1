package com.kwai.video.clipkit.watermark.WatermarkTextMargin;
import java.lang.Object;

public class WatermarkTextMargin	// class@001b0b
{
    public float bottomMargin;
    public float leftMargin;
    public float rightMargin;
    public float topMargin;

    public void WatermarkTextMargin(){
       super();
       this.leftMargin = 0;
       this.rightMargin = 0;
       this.topMargin = 0;
       this.bottomMargin = 0;
    }
    public void WatermarkTextMargin(float p0,float p1,float p2,float p3){
       super();
       this.leftMargin = p0;
       this.rightMargin = p1;
       this.topMargin = p2;
       this.bottomMargin = p3;
    }
    public float getBottomMargin(){
       return this.bottomMargin;
    }
    public float getLeftMargin(){
       return this.leftMargin;
    }
    public float getRightMargin(){
       return this.rightMargin;
    }
    public float getTopMargin(){
       return this.topMargin;
    }
    public void setBottomMargin(float p0){
       this.bottomMargin = p0;
    }
    public void setLeftMargin(float p0){
       this.leftMargin = p0;
    }
    public void setRightMargin(float p0){
       this.rightMargin = p0;
    }
    public void setTopMargin(float p0){
       this.topMargin = p0;
    }
}
