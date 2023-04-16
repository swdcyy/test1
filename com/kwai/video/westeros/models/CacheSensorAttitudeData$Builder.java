package com.kwai.video.westeros.models.CacheSensorAttitudeData$Builder;
import com.kwai.video.westeros.models.CacheSensorAttitudeDataOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.CacheSensorAttitudeData;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.CacheSensorAttitudeData$1;
import java.lang.Iterable;
import java.util.List;
import java.util.Collections;

public final class CacheSensorAttitudeData$Builder extends GeneratedMessageLite$Builder implements CacheSensorAttitudeDataOrBuilder	// class@000ed5
{

    public void CacheSensorAttitudeData$Builder(){
       super(CacheSensorAttitudeData.DEFAULT_INSTANCE);
    }
    public void CacheSensorAttitudeData$Builder(CacheSensorAttitudeData$1 p0){
       super();
    }
    public CacheSensorAttitudeData$Builder addAllAttitude(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllAttitude(p0);
       return this;
    }
    public CacheSensorAttitudeData$Builder addAttitude(double p0){
       this.copyOnWrite();
       this.instance.addAttitude(p0);
       return this;
    }
    public CacheSensorAttitudeData$Builder clearAttitude(){
       this.copyOnWrite();
       this.instance.clearAttitude();
       return this;
    }
    public CacheSensorAttitudeData$Builder clearPtsMs(){
       this.copyOnWrite();
       this.instance.clearPtsMs();
       return this;
    }
    public double getAttitude(int p0){
       return this.instance.getAttitude(p0);
    }
    public int getAttitudeCount(){
       return this.instance.getAttitudeCount();
    }
    public List getAttitudeList(){
       return Collections.unmodifiableList(this.instance.getAttitudeList());
    }
    public long getPtsMs(){
       return this.instance.getPtsMs();
    }
    public CacheSensorAttitudeData$Builder setAttitude(int p0,double p1){
       this.copyOnWrite();
       this.instance.setAttitude(p0, p1);
       return this;
    }
    public CacheSensorAttitudeData$Builder setPtsMs(long p0){
       this.copyOnWrite();
       this.instance.setPtsMs(p0);
       return this;
    }
}
