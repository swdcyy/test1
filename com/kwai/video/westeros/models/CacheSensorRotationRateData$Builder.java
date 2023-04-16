package com.kwai.video.westeros.models.CacheSensorRotationRateData$Builder;
import com.kwai.video.westeros.models.CacheSensorRotationRateDataOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.CacheSensorRotationRateData;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.CacheSensorRotationRateData$1;
import java.lang.Iterable;
import java.util.List;
import java.util.Collections;

public final class CacheSensorRotationRateData$Builder extends GeneratedMessageLite$Builder implements CacheSensorRotationRateDataOrBuilder	// class@000ee5
{

    public void CacheSensorRotationRateData$Builder(){
       super(CacheSensorRotationRateData.DEFAULT_INSTANCE);
    }
    public void CacheSensorRotationRateData$Builder(CacheSensorRotationRateData$1 p0){
       super();
    }
    public CacheSensorRotationRateData$Builder addAllRotationRate(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllRotationRate(p0);
       return this;
    }
    public CacheSensorRotationRateData$Builder addRotationRate(double p0){
       this.copyOnWrite();
       this.instance.addRotationRate(p0);
       return this;
    }
    public CacheSensorRotationRateData$Builder clearPtsMs(){
       this.copyOnWrite();
       this.instance.clearPtsMs();
       return this;
    }
    public CacheSensorRotationRateData$Builder clearRotationRate(){
       this.copyOnWrite();
       this.instance.clearRotationRate();
       return this;
    }
    public long getPtsMs(){
       return this.instance.getPtsMs();
    }
    public double getRotationRate(int p0){
       return this.instance.getRotationRate(p0);
    }
    public int getRotationRateCount(){
       return this.instance.getRotationRateCount();
    }
    public List getRotationRateList(){
       return Collections.unmodifiableList(this.instance.getRotationRateList());
    }
    public CacheSensorRotationRateData$Builder setPtsMs(long p0){
       this.copyOnWrite();
       this.instance.setPtsMs(p0);
       return this;
    }
    public CacheSensorRotationRateData$Builder setRotationRate(int p0,double p1){
       this.copyOnWrite();
       this.instance.setRotationRate(p0, p1);
       return this;
    }
}
