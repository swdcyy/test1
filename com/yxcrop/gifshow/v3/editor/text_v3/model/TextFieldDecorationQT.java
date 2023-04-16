package com.yxcrop.gifshow.v3.editor.text_v3.model.TextFieldDecorationQT;
import java.io.Serializable;
import java.util.List;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Long;
import nsd.u;
import java.lang.Object;

public final class TextFieldDecorationQT implements Serializable	// class@000c1a
{
    public List baseAnchor;
    public String imagePath;
    public Boolean isImageSeq;
    public Boolean isUnderText;
    public String layerTag;
    public List offset;
    public Double scale;
    public Long seqFrom;
    public Long seqTo;
    public Long sizeBase;
    public List xyRatio;

    public void TextFieldDecorationQT(){
       super(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }
    public void TextFieldDecorationQT(List p0,String p1,Boolean p2,Boolean p3,String p4,List p5,Double p6,Long p7,Long p8,Long p9,List p10){
       super();
       this.baseAnchor = p0;
       this.imagePath = p1;
       this.isImageSeq = p2;
       this.isUnderText = p3;
       this.layerTag = p4;
       this.offset = p5;
       this.scale = p6;
       this.seqFrom = p7;
       this.seqTo = p8;
       this.sizeBase = p9;
       this.xyRatio = p10;
    }
    public void TextFieldDecorationQT(List p0,String p1,Boolean p2,Boolean p3,String p4,List p5,Double p6,Long p7,Long p8,Long p9,List p10,int p11,u p12){
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
    public final List getBaseAnchor(){
       return this.baseAnchor;
    }
    public final String getImagePath(){
       return this.imagePath;
    }
    public final String getLayerTag(){
       return this.layerTag;
    }
    public final List getOffset(){
       return this.offset;
    }
    public final Double getScale(){
       return this.scale;
    }
    public final Long getSeqFrom(){
       return this.seqFrom;
    }
    public final Long getSeqTo(){
       return this.seqTo;
    }
    public final Long getSizeBase(){
       return this.sizeBase;
    }
    public final List getXyRatio(){
       return this.xyRatio;
    }
    public final Boolean isImageSeq(){
       return this.isImageSeq;
    }
    public final Boolean isUnderText(){
       return this.isUnderText;
    }
    public final void setBaseAnchor(List p0){
       this.baseAnchor = p0;
    }
    public final void setImagePath(String p0){
       this.imagePath = p0;
    }
    public final void setImageSeq(Boolean p0){
       this.isImageSeq = p0;
    }
    public final void setLayerTag(String p0){
       this.layerTag = p0;
    }
    public final void setOffset(List p0){
       this.offset = p0;
    }
    public final void setScale(Double p0){
       this.scale = p0;
    }
    public final void setSeqFrom(Long p0){
       this.seqFrom = p0;
    }
    public final void setSeqTo(Long p0){
       this.seqTo = p0;
    }
    public final void setSizeBase(Long p0){
       this.sizeBase = p0;
    }
    public final void setUnderText(Boolean p0){
       this.isUnderText = p0;
    }
    public final void setXyRatio(List p0){
       this.xyRatio = p0;
    }
}
