package com.yxcrop.gifshow.v3.editor.text_v3.model.CompTextBeanQT;
import java.io.Serializable;
import java.lang.String;
import java.lang.Double;
import java.util.List;
import java.lang.Long;
import nsd.u;
import java.lang.Object;

public final class CompTextBeanQT implements Serializable	// class@000c0b
{
    public String effectSourcePath;
    public Double freezeFrame;
    public List layers;
    public Double loopEnd;
    public Long loopNum;
    public Double loopStart;

    public void CompTextBeanQT(){
       super(null, null, null, null, null, null, 63, null);
    }
    public void CompTextBeanQT(String p0,Double p1,List p2,Double p3,Long p4,Double p5){
       super();
       this.effectSourcePath = p0;
       this.freezeFrame = p1;
       this.layers = p2;
       this.loopEnd = p3;
       this.loopNum = p4;
       this.loopStart = p5;
    }
    public void CompTextBeanQT(String p0,Double p1,List p2,Double p3,Long p4,Double p5,int p6,u p7){
       int i = (p6 & 0x01)? 0: p0;
       int i1 = (p6 & 0x02)? 0: p1;
       int i2 = (p6 & 0x04)? 0: p2;
       int i3 = (p6 & 0x08)? 0: p3;
       int i4 = (p6 & 0x10)? 0: p4;
       Double uDouble = (p6 & 0x20)? null: p5;
       super(i, i1, i2, i3, i4, uDouble);
       return;
    }
    public final String getEffectSourcePath(){
       return this.effectSourcePath;
    }
    public final Double getFreezeFrame(){
       return this.freezeFrame;
    }
    public final List getLayers(){
       return this.layers;
    }
    public final Double getLoopEnd(){
       return this.loopEnd;
    }
    public final Long getLoopNum(){
       return this.loopNum;
    }
    public final Double getLoopStart(){
       return this.loopStart;
    }
    public final void setEffectSourcePath(String p0){
       this.effectSourcePath = p0;
    }
    public final void setFreezeFrame(Double p0){
       this.freezeFrame = p0;
    }
    public final void setLayers(List p0){
       this.layers = p0;
    }
    public final void setLoopEnd(Double p0){
       this.loopEnd = p0;
    }
    public final void setLoopNum(Long p0){
       this.loopNum = p0;
    }
    public final void setLoopStart(Double p0){
       this.loopStart = p0;
    }
}
