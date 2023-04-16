package com.kwai.video.westeros.models.SalientInfo$Builder;
import com.kwai.video.westeros.models.SalientInfoOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.SalientInfo;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.SalientInfo$1;
import com.kwai.video.westeros.models.Rect;
import com.kwai.video.westeros.models.Rect$Builder;

public final class SalientInfo$Builder extends GeneratedMessageLite$Builder implements SalientInfoOrBuilder	// class@001036
{

    public void SalientInfo$Builder(){
       super(SalientInfo.DEFAULT_INSTANCE);
    }
    public void SalientInfo$Builder(SalientInfo$1 p0){
       super();
    }
    public SalientInfo$Builder clearConfidence(){
       this.copyOnWrite();
       this.instance.clearConfidence();
       return this;
    }
    public SalientInfo$Builder clearPosition(){
       this.copyOnWrite();
       this.instance.clearPosition();
       return this;
    }
    public SalientInfo$Builder clearType(){
       this.copyOnWrite();
       this.instance.clearType();
       return this;
    }
    public float getConfidence(){
       return this.instance.getConfidence();
    }
    public Rect getPosition(){
       return this.instance.getPosition();
    }
    public int getType(){
       return this.instance.getType();
    }
    public boolean hasPosition(){
       return this.instance.hasPosition();
    }
    public SalientInfo$Builder mergePosition(Rect p0){
       this.copyOnWrite();
       this.instance.mergePosition(p0);
       return this;
    }
    public SalientInfo$Builder setConfidence(float p0){
       this.copyOnWrite();
       this.instance.setConfidence(p0);
       return this;
    }
    public SalientInfo$Builder setPosition(Rect$Builder p0){
       this.copyOnWrite();
       this.instance.setPosition(p0);
       return this;
    }
    public SalientInfo$Builder setPosition(Rect p0){
       this.copyOnWrite();
       this.instance.setPosition(p0);
       return this;
    }
    public SalientInfo$Builder setType(int p0){
       this.copyOnWrite();
       this.instance.setType(p0);
       return this;
    }
}
