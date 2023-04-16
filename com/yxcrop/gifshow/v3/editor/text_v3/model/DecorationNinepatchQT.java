package com.yxcrop.gifshow.v3.editor.text_v3.model.DecorationNinepatchQT;
import java.io.Serializable;
import java.util.List;
import java.lang.Long;
import java.lang.String;
import java.lang.Boolean;
import nsd.u;
import java.lang.Object;

public final class DecorationNinepatchQT implements Serializable	// class@000c0c
{
    public List capInsets;
    public Long direction;
    public String imagePath;
    public Boolean isImageSeq;
    public Long seqFrom;
    public Long seqTo;
    public List textRect;

    public void DecorationNinepatchQT(){
       super(null, null, null, null, null, null, null, 127, null);
    }
    public void DecorationNinepatchQT(List p0,Long p1,String p2,Boolean p3,Long p4,Long p5,List p6){
       super();
       this.capInsets = p0;
       this.direction = p1;
       this.imagePath = p2;
       this.isImageSeq = p3;
       this.seqFrom = p4;
       this.seqTo = p5;
       this.textRect = p6;
    }
    public void DecorationNinepatchQT(List p0,Long p1,String p2,Boolean p3,Long p4,Long p5,List p6,int p7,u p8){
       int i = (p7 & 0x01)? 0: p0;
       int i1 = (p7 & 0x02)? 0: p1;
       int i2 = (p7 & 0x04)? 0: p2;
       int i3 = (p7 & 0x08)? 0: p3;
       int i4 = (p7 & 0x10)? 0: p4;
       int i5 = (p7 & 0x20)? 0: p5;
       List list = (p7 & 0x40)? null: p6;
       super(i, i1, i2, i3, i4, i5, list);
       return;
    }
    public final List getCapInsets(){
       return this.capInsets;
    }
    public final Long getDirection(){
       return this.direction;
    }
    public final String getImagePath(){
       return this.imagePath;
    }
    public final Long getSeqFrom(){
       return this.seqFrom;
    }
    public final Long getSeqTo(){
       return this.seqTo;
    }
    public final List getTextRect(){
       return this.textRect;
    }
    public final Boolean isImageSeq(){
       return this.isImageSeq;
    }
    public final void setCapInsets(List p0){
       this.capInsets = p0;
    }
    public final void setDirection(Long p0){
       this.direction = p0;
    }
    public final void setImagePath(String p0){
       this.imagePath = p0;
    }
    public final void setImageSeq(Boolean p0){
       this.isImageSeq = p0;
    }
    public final void setSeqFrom(Long p0){
       this.seqFrom = p0;
    }
    public final void setSeqTo(Long p0){
       this.seqTo = p0;
    }
    public final void setTextRect(List p0){
       this.textRect = p0;
    }
}
