package com.kwai.video.westeros.models.CacheSensorRotationData$Builder;
import com.kwai.video.westeros.models.CacheSensorRotationDataOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.CacheSensorRotationData;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.CacheSensorRotationData$1;

public final class CacheSensorRotationData$Builder extends GeneratedMessageLite$Builder implements CacheSensorRotationDataOrBuilder	// class@000ee1
{

    public void CacheSensorRotationData$Builder(){
       super(CacheSensorRotationData.DEFAULT_INSTANCE);
    }
    public void CacheSensorRotationData$Builder(CacheSensorRotationData$1 p0){
       super();
    }
    public CacheSensorRotationData$Builder clearPtsMs(){
       this.copyOnWrite();
       this.instance.clearPtsMs();
       return this;
    }
    public CacheSensorRotationData$Builder clearRotation(){
       this.copyOnWrite();
       this.instance.clearRotation();
       return this;
    }
    public long getPtsMs(){
       return this.instance.getPtsMs();
    }
    public float getRotation(){
       return this.instance.getRotation();
    }
    public CacheSensorRotationData$Builder setPtsMs(long p0){
       this.copyOnWrite();
       this.instance.setPtsMs(p0);
       return this;
    }
    public CacheSensorRotationData$Builder setRotation(float p0){
       this.copyOnWrite();
       this.instance.setRotation(p0);
       return this;
    }
}
