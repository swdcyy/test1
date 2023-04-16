package com.yxcrop.gifshow.v3.editor.text_v3.model.FillContentQT;
import java.io.Serializable;
import com.yxcrop.gifshow.v3.editor.text_v3.model.FillGradientsQT;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Long;
import nsd.u;
import java.lang.Object;

public final class FillContentQT implements Serializable	// class@000c10
{
    public FillGradientsQT fillGradients;
    public String fillImage;
    public Boolean isImageSeq;
    public Long seqFrom;
    public Long seqTo;

    public void FillContentQT(){
       super(null, null, null, null, null, 31, null);
    }
    public void FillContentQT(FillGradientsQT p0,String p1,Boolean p2,Long p3,Long p4){
       super();
       this.fillGradients = p0;
       this.fillImage = p1;
       this.isImageSeq = p2;
       this.seqFrom = p3;
       this.seqTo = p4;
    }
    public void FillContentQT(FillGradientsQT p0,String p1,Boolean p2,Long p3,Long p4,int p5,u p6){
       int i = (p5 & 0x01)? 0: p0;
       int i1 = (p5 & 0x02)? 0: p1;
       int i2 = (p5 & 0x04)? 0: p2;
       int i3 = (p5 & 0x08)? 0: p3;
       Long longx = (p5 & 0x10)? null: p4;
       super(i, i1, i2, i3, longx);
       return;
    }
    public final FillGradientsQT getFillGradients(){
       return this.fillGradients;
    }
    public final String getFillImage(){
       return this.fillImage;
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
    public final void setFillGradients(FillGradientsQT p0){
       this.fillGradients = p0;
    }
    public final void setFillImage(String p0){
       this.fillImage = p0;
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
