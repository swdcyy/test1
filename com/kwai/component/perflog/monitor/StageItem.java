package com.kwai.component.perflog.monitor.StageItem;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class StageItem	// class@000a0e
{
    public long duration;
    public final String name;
    public final long startTime;

    public void StageItem(String p0,long p1,long p2){
       a.p(p0, "name");
       super();
       this.name = p0;
       this.startTime = p1;
       this.duration = p2;
    }
    public void StageItem(String p0,long p1,long p2,int p3,u p4){
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public static StageItem copy$default(StageItem p0,String p1,long p2,long p3,int p4,Object p5){
       StageItem name;
       StageItem startTime;
       StageItem duration;
       if (p4 & 0x01) {
          name = p0.name;
       }
       if (p4 & 0x02) {
          startTime = p0.startTime;
       }
       StageItem stageItem = startTime;
       if (p4 & 0x04) {
          duration = p0.duration;
       }
       return p0.copy(name, stageItem, duration);
    }
    public final String component1(){
       return this.name;
    }
    public final long component2(){
       return this.startTime;
    }
    public final long component3(){
       return this.duration;
    }
    public final StageItem copy(String p0,long p1,long p2){
       Object obj;
       if (PatchProxy.isSupport(StageItem.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, StageItem.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "name");
       StageItem stageItem = new StageItem(p0, p1, p2);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, StageItem.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof StageItem && (a.g(this.name, p0.name) && (!this.startTime - p0.startTime && !this.duration - p0.duration)))) {
          return true;
       }
       return false;
    }
    public final long getDuration(){
       return this.duration;
    }
    public final String getName(){
       return this.name;
    }
    public final long getStartTime(){
       return this.startTime;
    }
    public int hashCode(){
       StageItem obj = PatchProxy.apply(null, this, StageItem.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.name;
       int i = (obj != null)? obj.hashCode(): 0;
       StageItem tstartTime = this.startTime;
       tstartTime = this.duration;
       return ((((i * 31) + (int)(tstartTime ^ (tstartTime >> 32))) * 31) + (int)(tstartTime ^ (tstartTime >> 32)));
    }
    public final void setDuration(long p0){
       this.duration = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, StageItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "StageItem\(name="+this.name+", startTime="+this.startTime+", duration="+this.duration+"\)";
    }
}
