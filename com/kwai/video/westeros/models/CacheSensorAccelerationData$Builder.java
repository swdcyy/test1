package com.kwai.video.westeros.models.CacheSensorAccelerationData$Builder;
import com.kwai.video.westeros.models.CacheSensorAccelerationDataOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.CacheSensorAccelerationData;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.CacheSensorAccelerationData$1;
import java.lang.Iterable;
import java.util.List;
import java.util.Collections;

public final class CacheSensorAccelerationData$Builder extends GeneratedMessageLite$Builder implements CacheSensorAccelerationDataOrBuilder	// class@000ed1
{

    public void CacheSensorAccelerationData$Builder(){
       super(CacheSensorAccelerationData.DEFAULT_INSTANCE);
    }
    public void CacheSensorAccelerationData$Builder(CacheSensorAccelerationData$1 p0){
       super();
    }
    public CacheSensorAccelerationData$Builder addAcceleration(double p0){
       this.copyOnWrite();
       this.instance.addAcceleration(p0);
       return this;
    }
    public CacheSensorAccelerationData$Builder addAllAcceleration(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllAcceleration(p0);
       return this;
    }
    public CacheSensorAccelerationData$Builder clearAcceleration(){
       this.copyOnWrite();
       this.instance.clearAcceleration();
       return this;
    }
    public CacheSensorAccelerationData$Builder clearPtsMs(){
       this.copyOnWrite();
       this.instance.clearPtsMs();
       return this;
    }
    public double getAcceleration(int p0){
       return this.instance.getAcceleration(p0);
    }
    public int getAccelerationCount(){
       return this.instance.getAccelerationCount();
    }
    public List getAccelerationList(){
       return Collections.unmodifiableList(this.instance.getAccelerationList());
    }
    public long getPtsMs(){
       return this.instance.getPtsMs();
    }
    public CacheSensorAccelerationData$Builder setAcceleration(int p0,double p1){
       this.copyOnWrite();
       this.instance.setAcceleration(p0, p1);
       return this;
    }
    public CacheSensorAccelerationData$Builder setPtsMs(long p0){
       this.copyOnWrite();
       this.instance.setPtsMs(p0);
       return this;
    }
}
