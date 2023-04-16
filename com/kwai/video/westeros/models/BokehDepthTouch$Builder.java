package com.kwai.video.westeros.models.BokehDepthTouch$Builder;
import com.kwai.video.westeros.models.BokehDepthTouchOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.BokehDepthTouch;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.BokehDepthTouch$1;

public final class BokehDepthTouch$Builder extends GeneratedMessageLite$Builder implements BokehDepthTouchOrBuilder	// class@000ec6
{

    public void BokehDepthTouch$Builder(){
       super(BokehDepthTouch.DEFAULT_INSTANCE);
    }
    public void BokehDepthTouch$Builder(BokehDepthTouch$1 p0){
       super();
    }
    public BokehDepthTouch$Builder clearPosx(){
       this.copyOnWrite();
       this.instance.clearPosx();
       return this;
    }
    public BokehDepthTouch$Builder clearPosy(){
       this.copyOnWrite();
       this.instance.clearPosy();
       return this;
    }
    public float getPosx(){
       return this.instance.getPosx();
    }
    public float getPosy(){
       return this.instance.getPosy();
    }
    public BokehDepthTouch$Builder setPosx(float p0){
       this.copyOnWrite();
       this.instance.setPosx(p0);
       return this;
    }
    public BokehDepthTouch$Builder setPosy(float p0){
       this.copyOnWrite();
       this.instance.setPosy(p0);
       return this;
    }
}
