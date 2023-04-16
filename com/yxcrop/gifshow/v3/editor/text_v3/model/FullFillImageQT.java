package com.yxcrop.gifshow.v3.editor.text_v3.model.FullFillImageQT;
import java.io.Serializable;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Long;
import nsd.u;
import java.lang.Object;

public final class FullFillImageQT implements Serializable	// class@000c12
{
    public String imagePath;
    public Boolean isImageSeq;
    public Long seqFrom;
    public Long seqTo;

    public void FullFillImageQT(){
       super(null, null, null, null, 15, null);
    }
    public void FullFillImageQT(String p0,Boolean p1,Long p2,Long p3){
       super();
       this.imagePath = p0;
       this.isImageSeq = p1;
       this.seqFrom = p2;
       this.seqTo = p3;
    }
    public void FullFillImageQT(String p0,Boolean p1,Long p2,Long p3,int p4,u p5){
       if (p4 & 0x01) {
          p0 = null;
       }
       if (p4 & 0x02) {
          p1 = null;
       }
       if (p4 & 0x04) {
          p2 = null;
       }
       if (p4 & 0x08) {
          p3 = null;
       }
       super(p0, p1, p2, p3);
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
}
