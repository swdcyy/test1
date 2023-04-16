package com.yxcrop.gifshow.v3.editor.text_v3.model.UnderlineConfigQT;
import java.io.Serializable;
import java.lang.Long;
import java.lang.Boolean;
import java.lang.String;
import java.lang.Double;
import nsd.u;
import java.lang.Object;

public final class UnderlineConfigQT implements Serializable	// class@000c1c
{
    public Long alpha;
    public Boolean applyShadow;
    public Boolean applyShift;
    public Boolean applyStroke;
    public Boolean applyUnderlineColor;
    public Boolean applyUnderlineThickness;
    public String underlineColor;
    public Double underlineSpace;
    public Double underlineThickness;

    public void UnderlineConfigQT(){
       super(null, null, null, null, null, null, null, null, null, 511, null);
    }
    public void UnderlineConfigQT(Long p0,Boolean p1,Boolean p2,Boolean p3,Boolean p4,Boolean p5,String p6,Double p7,Double p8){
       super();
       this.alpha = p0;
       this.applyShadow = p1;
       this.applyShift = p2;
       this.applyStroke = p3;
       this.applyUnderlineColor = p4;
       this.applyUnderlineThickness = p5;
       this.underlineColor = p6;
       this.underlineSpace = p7;
       this.underlineThickness = p8;
    }
    public void UnderlineConfigQT(Long p0,Boolean p1,Boolean p2,Boolean p3,Boolean p4,Boolean p5,String p6,Double p7,Double p8,int p9,u p10){
       int i = p9;
       int i1 = 0;
       int i2 = (i & 0x01)? i1: p0;
       int i3 = (i & 0x02)? i1: p1;
       int i4 = (i & 0x04)? i1: p2;
       int i5 = (i & 0x08)? i1: p3;
       int i6 = (i & 0x10)? i1: p4;
       int i7 = (i & 0x20)? i1: p5;
       int i8 = (i & 0x40)? i1: p6;
       int i9 = (i & 0x0080)? i1: p7;
       if (!(i & 0x0100)) {
          i1 = p8;
       }
       super(i2, i3, i4, i5, i6, i7, i8, i9, i1);
       return;
    }
    public final Long getAlpha(){
       return this.alpha;
    }
    public final Boolean getApplyShadow(){
       return this.applyShadow;
    }
    public final Boolean getApplyShift(){
       return this.applyShift;
    }
    public final Boolean getApplyStroke(){
       return this.applyStroke;
    }
    public final Boolean getApplyUnderlineColor(){
       return this.applyUnderlineColor;
    }
    public final Boolean getApplyUnderlineThickness(){
       return this.applyUnderlineThickness;
    }
    public final String getUnderlineColor(){
       return this.underlineColor;
    }
    public final Double getUnderlineSpace(){
       return this.underlineSpace;
    }
    public final Double getUnderlineThickness(){
       return this.underlineThickness;
    }
    public final void setAlpha(Long p0){
       this.alpha = p0;
    }
    public final void setApplyShadow(Boolean p0){
       this.applyShadow = p0;
    }
    public final void setApplyShift(Boolean p0){
       this.applyShift = p0;
    }
    public final void setApplyStroke(Boolean p0){
       this.applyStroke = p0;
    }
    public final void setApplyUnderlineColor(Boolean p0){
       this.applyUnderlineColor = p0;
    }
    public final void setApplyUnderlineThickness(Boolean p0){
       this.applyUnderlineThickness = p0;
    }
    public final void setUnderlineColor(String p0){
       this.underlineColor = p0;
    }
    public final void setUnderlineSpace(Double p0){
       this.underlineSpace = p0;
    }
    public final void setUnderlineThickness(Double p0){
       this.underlineThickness = p0;
    }
}
