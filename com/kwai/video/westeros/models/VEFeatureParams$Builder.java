package com.kwai.video.westeros.models.VEFeatureParams$Builder;
import com.kwai.video.westeros.models.VEFeatureParamsOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.VEFeatureParams;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.VEFeatureParams$1;

public final class VEFeatureParams$Builder extends GeneratedMessageLite$Builder implements VEFeatureParamsOrBuilder	// class@001081
{

    public void VEFeatureParams$Builder(){
       super(VEFeatureParams.DEFAULT_INSTANCE);
    }
    public void VEFeatureParams$Builder(VEFeatureParams$1 p0){
       super();
    }
    public VEFeatureParams$Builder clearFramePts(){
       this.copyOnWrite();
       this.instance.clearFramePts();
       return this;
    }
    public VEFeatureParams$Builder clearIndensity(){
       this.copyOnWrite();
       this.instance.clearIndensity();
       return this;
    }
    public VEFeatureParams$Builder clearIntervalMs(){
       this.copyOnWrite();
       this.instance.clearIntervalMs();
       return this;
    }
    public int getFramePts(){
       return this.instance.getFramePts();
    }
    public float getIndensity(){
       return this.instance.getIndensity();
    }
    public int getIntervalMs(){
       return this.instance.getIntervalMs();
    }
    public VEFeatureParams$Builder setFramePts(int p0){
       this.copyOnWrite();
       this.instance.setFramePts(p0);
       return this;
    }
    public VEFeatureParams$Builder setIndensity(float p0){
       this.copyOnWrite();
       this.instance.setIndensity(p0);
       return this;
    }
    public VEFeatureParams$Builder setIntervalMs(int p0){
       this.copyOnWrite();
       this.instance.setIntervalMs(p0);
       return this;
    }
}
