package com.kwai.video.westeros.models.MakeupPenTouch$Builder;
import com.kwai.video.westeros.models.MakeupPenTouchOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.MakeupPenTouch;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.MakeupPenTouch$1;
import com.kwai.video.westeros.models.FMPoint;
import com.kwai.video.westeros.models.EffectMakeupPenTouchType;
import com.kwai.video.westeros.models.FMPoint$Builder;

public final class MakeupPenTouch$Builder extends GeneratedMessageLite$Builder implements MakeupPenTouchOrBuilder	// class@000fa2
{

    public void MakeupPenTouch$Builder(){
       super(MakeupPenTouch.DEFAULT_INSTANCE);
    }
    public void MakeupPenTouch$Builder(MakeupPenTouch$1 p0){
       super();
    }
    public MakeupPenTouch$Builder clearCount(){
       this.copyOnWrite();
       this.instance.clearCount();
       return this;
    }
    public MakeupPenTouch$Builder clearPoint(){
       this.copyOnWrite();
       this.instance.clearPoint();
       return this;
    }
    public MakeupPenTouch$Builder clearType(){
       this.copyOnWrite();
       this.instance.clearType();
       return this;
    }
    public int getCount(){
       return this.instance.getCount();
    }
    public FMPoint getPoint(){
       return this.instance.getPoint();
    }
    public EffectMakeupPenTouchType getType(){
       return this.instance.getType();
    }
    public int getTypeValue(){
       return this.instance.getTypeValue();
    }
    public boolean hasPoint(){
       return this.instance.hasPoint();
    }
    public MakeupPenTouch$Builder mergePoint(FMPoint p0){
       this.copyOnWrite();
       this.instance.mergePoint(p0);
       return this;
    }
    public MakeupPenTouch$Builder setCount(int p0){
       this.copyOnWrite();
       this.instance.setCount(p0);
       return this;
    }
    public MakeupPenTouch$Builder setPoint(FMPoint$Builder p0){
       this.copyOnWrite();
       this.instance.setPoint(p0);
       return this;
    }
    public MakeupPenTouch$Builder setPoint(FMPoint p0){
       this.copyOnWrite();
       this.instance.setPoint(p0);
       return this;
    }
    public MakeupPenTouch$Builder setType(EffectMakeupPenTouchType p0){
       this.copyOnWrite();
       this.instance.setType(p0);
       return this;
    }
    public MakeupPenTouch$Builder setTypeValue(int p0){
       this.copyOnWrite();
       this.instance.setTypeValue(p0);
       return this;
    }
}
