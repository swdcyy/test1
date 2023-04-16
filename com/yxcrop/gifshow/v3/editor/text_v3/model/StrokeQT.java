package com.yxcrop.gifshow.v3.editor.text_v3.model.StrokeQT;
import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import com.yxcrop.gifshow.v3.editor.text_v3.model.ShiftQT;
import java.lang.Double;
import nsd.u;
import java.lang.Object;

public final class StrokeQT implements Serializable	// class@000c16
{
    public Long alpha;
    public Long blendMode;
    public String color;
    public Long fullImageIndex;
    public ShiftQT fullfillBias;
    public Double gradientDegree;
    public Long gradientIndex;
    public Double intensity;
    public Double offsetX;
    public Double offsetY;
    public Double width;

    public void StrokeQT(){
       super(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }
    public void StrokeQT(Long p0,Long p1,String p2,ShiftQT p3,Long p4,Double p5,Long p6,Double p7,Double p8,Double p9,Double p10){
       super();
       this.alpha = p0;
       this.blendMode = p1;
       this.color = p2;
       this.fullfillBias = p3;
       this.fullImageIndex = p4;
       this.gradientDegree = p5;
       this.gradientIndex = p6;
       this.intensity = p7;
       this.offsetX = p8;
       this.offsetY = p9;
       this.width = p10;
    }
    public void StrokeQT(Long p0,Long p1,String p2,ShiftQT p3,Long p4,Double p5,Long p6,Double p7,Double p8,Double p9,Double p10,int p11,u p12){
       int i = p11;
       int i1 = 0;
       int i2 = (i & 0x01)? i1: p0;
       int i3 = (i & 0x02)? i1: p1;
       int i4 = (i & 0x04)? i1: p2;
       int i5 = (i & 0x08)? i1: p3;
       int i6 = (i & 0x10)? i1: p4;
       int i7 = (i & 0x20)? i1: p5;
       int i8 = (i & 0x40)? i1: p6;
       int i9 = (i & 0x0080)? i1: p7;
       int i10 = (i & 0x0100)? i1: p8;
       int i11 = (i & 0x0200)? i1: p9;
       if (!(i & 0x0400)) {
          i1 = p10;
       }
       super(i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i1);
       return;
    }
    public final Long getAlpha(){
       return this.alpha;
    }
    public final Long getBlendMode(){
       return this.blendMode;
    }
    public final String getColor(){
       return this.color;
    }
    public final Long getFullImageIndex(){
       return this.fullImageIndex;
    }
    public final ShiftQT getFullfillBias(){
       return this.fullfillBias;
    }
    public final Double getGradientDegree(){
       return this.gradientDegree;
    }
    public final Long getGradientIndex(){
       return this.gradientIndex;
    }
    public final Double getIntensity(){
       return this.intensity;
    }
    public final Double getOffsetX(){
       return this.offsetX;
    }
    public final Double getOffsetY(){
       return this.offsetY;
    }
    public final Double getWidth(){
       return this.width;
    }
    public final void setAlpha(Long p0){
       this.alpha = p0;
    }
    public final void setBlendMode(Long p0){
       this.blendMode = p0;
    }
    public final void setColor(String p0){
       this.color = p0;
    }
    public final void setFullImageIndex(Long p0){
       this.fullImageIndex = p0;
    }
    public final void setFullfillBias(ShiftQT p0){
       this.fullfillBias = p0;
    }
    public final void setGradientDegree(Double p0){
       this.gradientDegree = p0;
    }
    public final void setGradientIndex(Long p0){
       this.gradientIndex = p0;
    }
    public final void setIntensity(Double p0){
       this.intensity = p0;
    }
    public final void setOffsetX(Double p0){
       this.offsetX = p0;
    }
    public final void setOffsetY(Double p0){
       this.offsetY = p0;
    }
    public final void setWidth(Double p0){
       this.width = p0;
    }
}
