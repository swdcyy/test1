package com.yxcrop.gifshow.v3.editor.text_v3.model.PerWordImageQT;
import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Double;
import nsd.u;
import java.lang.Object;

public final class PerWordImageQT implements Serializable	// class@000c13
{
    public Long col;
    public String imagePath;
    public Boolean isFrontOfText;
    public Boolean isImageSeq;
    public Double offsetX;
    public Double offsetY;
    public Long row;
    public Double scaleX;
    public Double scaleY;
    public Long seqFrom;
    public Long seqTo;

    public void PerWordImageQT(){
       super(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }
    public void PerWordImageQT(Long p0,String p1,Boolean p2,Boolean p3,Double p4,Double p5,Long p6,Double p7,Double p8,Long p9,Long p10){
       super();
       this.col = p0;
       this.imagePath = p1;
       this.isFrontOfText = p2;
       this.isImageSeq = p3;
       this.offsetX = p4;
       this.offsetY = p5;
       this.row = p6;
       this.scaleX = p7;
       this.scaleY = p8;
       this.seqFrom = p9;
       this.seqTo = p10;
    }
    public void PerWordImageQT(Long p0,String p1,Boolean p2,Boolean p3,Double p4,Double p5,Long p6,Double p7,Double p8,Long p9,Long p10,int p11,u p12){
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
    public final Long getCol(){
       return this.col;
    }
    public final String getImagePath(){
       return this.imagePath;
    }
    public final Double getOffsetX(){
       return this.offsetX;
    }
    public final Double getOffsetY(){
       return this.offsetY;
    }
    public final Long getRow(){
       return this.row;
    }
    public final Double getScaleX(){
       return this.scaleX;
    }
    public final Double getScaleY(){
       return this.scaleY;
    }
    public final Long getSeqFrom(){
       return this.seqFrom;
    }
    public final Long getSeqTo(){
       return this.seqTo;
    }
    public final Boolean isFrontOfText(){
       return this.isFrontOfText;
    }
    public final Boolean isImageSeq(){
       return this.isImageSeq;
    }
    public final void setCol(Long p0){
       this.col = p0;
    }
    public final void setFrontOfText(Boolean p0){
       this.isFrontOfText = p0;
    }
    public final void setImagePath(String p0){
       this.imagePath = p0;
    }
    public final void setImageSeq(Boolean p0){
       this.isImageSeq = p0;
    }
    public final void setOffsetX(Double p0){
       this.offsetX = p0;
    }
    public final void setOffsetY(Double p0){
       this.offsetY = p0;
    }
    public final void setRow(Long p0){
       this.row = p0;
    }
    public final void setScaleX(Double p0){
       this.scaleX = p0;
    }
    public final void setScaleY(Double p0){
       this.scaleY = p0;
    }
    public final void setSeqFrom(Long p0){
       this.seqFrom = p0;
    }
    public final void setSeqTo(Long p0){
       this.seqTo = p0;
    }
}
