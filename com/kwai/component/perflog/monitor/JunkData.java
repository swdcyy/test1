package com.kwai.component.perflog.monitor.JunkData;
import java.util.List;
import com.kwai.component.perflog.monitor.DetailStage;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class JunkData	// class@000a07
{
    public DetailStage detailStage;
    public List dispatchTasks;
    public long duration;
    public List stage;
    public long timestamp;

    public void JunkData(long p0,long p1,List p2,DetailStage p3,List p4){
       a.p(p3, "detailStage");
       super();
       this.timestamp = p0;
       this.duration = p1;
       this.stage = p2;
       this.detailStage = p3;
       this.dispatchTasks = p4;
    }
    public static JunkData copy$default(JunkData p0,long p1,long p2,List p3,DetailStage p4,List p5,int p6,Object p7){
       JunkData junkData = p0;
       JunkData timestamp = (p6 & 0x01)? junkData.timestamp: p1;
       JunkData duration = (p6 & 0x02)? junkData.duration: p2;
       JunkData stage = (p6 & 0x04)? junkData.stage: p3;
       JunkData detailStage = (p6 & 0x08)? junkData.detailStage: p4;
       JunkData dispatchTask = (p6 & 0x10)? junkData.dispatchTasks: p5;
       return p0.copy(timestamp, duration, stage, detailStage, dispatchTask);
    }
    public final long component1(){
       return this.timestamp;
    }
    public final long component2(){
       return this.duration;
    }
    public final List component3(){
       return this.stage;
    }
    public final DetailStage component4(){
       return this.detailStage;
    }
    public final List component5(){
       return this.dispatchTasks;
    }
    public final JunkData copy(long p0,long p1,List p2,DetailStage p3,List p4){
       object oobject = p3;
       JunkData junkData = JunkData.class;
       if (PatchProxy.isSupport(junkData)) {
          Object[] objArray = new Object[]{Long.valueOf(p0),Long.valueOf(p1),p2,oobject,p4};
          Object obj = PatchProxy.apply(objArray, this, junkData, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       a.p(oobject, "detailStage");
       junkData = new JunkData(p0, p1, p2, p3, p4);
       return v9;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, JunkData.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof JunkData && (!this.timestamp - p0.timestamp && (!this.duration - p0.duration && (a.g(this.stage, p0.stage) && (a.g(this.detailStage, p0.detailStage) && a.g(this.dispatchTasks, p0.dispatchTasks))))))) {
          return true;
       }
       return false;
    }
    public final DetailStage getDetailStage(){
       return this.detailStage;
    }
    public final List getDispatchTasks(){
       return this.dispatchTasks;
    }
    public final long getDuration(){
       return this.duration;
    }
    public final List getStage(){
       return this.stage;
    }
    public final long getTimestamp(){
       return this.timestamp;
    }
    public int hashCode(){
       JunkData obj = PatchProxy.apply(null, this, JunkData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.timestamp;
       JunkData tduration = this.duration;
       int i = (((int)(obj ^ (obj >> 32)) * 31) + (int)(tduration ^ (tduration >> 32))) * 31;
       obj = this.stage;
       int i1 = 0;
       int i2 = (obj != null)? obj.hashCode(): 0;
       i = (i + i2) * 31;
       obj = this.detailStage;
       i2 = (obj != null)? obj.hashCode(): 0;
       i = (i + i2) * 31;
       obj = this.dispatchTasks;
       if (obj != null) {
          i1 = obj.hashCode();
       }
       return (i + i1);
    }
    public final void setDetailStage(DetailStage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, JunkData.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.detailStage = p0;
       return;
    }
    public final void setDispatchTasks(List p0){
       this.dispatchTasks = p0;
    }
    public final void setDuration(long p0){
       this.duration = p0;
    }
    public final void setStage(List p0){
       this.stage = p0;
    }
    public final void setTimestamp(long p0){
       this.timestamp = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, JunkData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "JunkData\(timestamp="+this.timestamp+", duration="+this.duration+", stage="+this.stage+", detailStage="+this.detailStage+", dispatchTasks="+this.dispatchTasks+"\)";
    }
}
