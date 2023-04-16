package com.yxcrop.gifshow.v3.editor.text_v3.model.DrawableBackgroundQT;
import java.io.Serializable;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Long;
import java.util.List;
import nsd.u;
import java.lang.Object;

public final class DrawableBackgroundQT implements Serializable	// class@000c0d
{
    public String imagePath;
    public Boolean isImageSeq;
    public Long seqFrom;
    public Long seqTo;
    public List textRect;

    public void DrawableBackgroundQT(){
       super(null, null, null, null, null, 31, null);
    }
    public void DrawableBackgroundQT(String p0,Boolean p1,Long p2,Long p3,List p4){
       super();
       this.imagePath = p0;
       this.isImageSeq = p1;
       this.seqFrom = p2;
       this.seqTo = p3;
       this.textRect = p4;
    }
    public void DrawableBackgroundQT(String p0,Boolean p1,Long p2,Long p3,List p4,int p5,u p6){
       int i = (p5 & 0x01)? 0: p0;
       int i1 = (p5 & 0x02)? 0: p1;
       int i2 = (p5 & 0x04)? 0: p2;
       int i3 = (p5 & 0x08)? 0: p3;
       List list = (p5 & 0x10)? null: p4;
       super(i, i1, i2, i3, list);
       return;
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
