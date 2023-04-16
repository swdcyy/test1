package com.kwai.video.westeros.models.FMTimeStamp$Builder;
import com.kwai.video.westeros.models.FMTimeStampOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.FMTimeStamp;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.FMTimeStamp$1;

public final class FMTimeStamp$Builder extends GeneratedMessageLite$Builder implements FMTimeStampOrBuilder	// class@000f59
{

    public void FMTimeStamp$Builder(){
       super(FMTimeStamp.DEFAULT_INSTANCE);
    }
    public void FMTimeStamp$Builder(FMTimeStamp$1 p0){
       super();
    }
    public FMTimeStamp$Builder clearDuration(){
       this.copyOnWrite();
       this.instance.clearDuration();
       return this;
    }
    public FMTimeStamp$Builder clearEffectTime(){
       this.copyOnWrite();
       this.instance.clearEffectTime();
       return this;
    }
    public FMTimeStamp$Builder clearFrameTime(){
       this.copyOnWrite();
       this.instance.clearFrameTime();
       return this;
    }
    public double getDuration(){
       return this.instance.getDuration();
    }
    public double getEffectTime(){
       return this.instance.getEffectTime();
    }
    public double getFrameTime(){
       return this.instance.getFrameTime();
    }
    public FMTimeStamp$Builder setDuration(double p0){
       this.copyOnWrite();
       this.instance.setDuration(p0);
       return this;
    }
    public FMTimeStamp$Builder setEffectTime(double p0){
       this.copyOnWrite();
       this.instance.setEffectTime(p0);
       return this;
    }
    public FMTimeStamp$Builder setFrameTime(double p0){
       this.copyOnWrite();
       this.instance.setFrameTime(p0);
       return this;
    }
}
