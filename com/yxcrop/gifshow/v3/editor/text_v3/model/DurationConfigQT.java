package com.yxcrop.gifshow.v3.editor.text_v3.model.DurationConfigQT;
import java.io.Serializable;
import java.lang.Object;

public final class DurationConfigQT implements Serializable	// class@000c0e
{
    public double absoluteDuration;
    public boolean isRelativeDuration;
    public double relativeDuration;

    public void DurationConfigQT(double p0,boolean p1,double p2){
       super();
       this.absoluteDuration = p0;
       this.isRelativeDuration = p1;
       this.relativeDuration = p2;
    }
    public final double getAbsoluteDuration(){
       return this.absoluteDuration;
    }
    public final double getRelativeDuration(){
       return this.relativeDuration;
    }
    public final boolean isRelativeDuration(){
       return this.isRelativeDuration;
    }
    public final void setAbsoluteDuration(double p0){
       this.absoluteDuration = p0;
    }
    public final void setRelativeDuration(double p0){
       this.relativeDuration = p0;
    }
    public final void setRelativeDuration(boolean p0){
       this.isRelativeDuration = p0;
    }
}
