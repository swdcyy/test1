package com.kwai.feature.post.api.feature.memory.MemoryCustomEvent;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import com.kwai.feature.post.api.feature.memory.MemoryStageEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class MemoryCustomEvent implements Serializable	// class@0013ac
{
    public String activityId;
    public String fatalError;
    public String result;
    public final ArrayList stages;
    public long totalCost;

    public void MemoryCustomEvent(String p0){
       a.p(p0, "activityId");
       super();
       this.activityId = p0;
       this.result = "";
       this.fatalError = "";
       this.stages = new ArrayList();
    }
    public static MemoryCustomEvent copy$default(MemoryCustomEvent p0,String p1,int p2,Object p3){
       MemoryCustomEvent activityId;
       if (p2 & 0x01) {
          activityId = p0.activityId;
       }
       return p0.copy(activityId);
    }
    public final void add(MemoryStageEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MemoryCustomEvent.class, "3")) {
          return;
       }
       a.p(p0, "stageEvent");
       this.stages.add(p0);
       return;
    }
    public final void clear(){
       if (PatchProxy.applyVoid(null, this, MemoryCustomEvent.class, "4")) {
          return;
       }
       this.totalCost = 0;
       this.result = "";
       this.fatalError = "";
       this.stages.clear();
       return;
    }
    public final String component1(){
       return this.activityId;
    }
    public final MemoryCustomEvent copy(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MemoryCustomEvent.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "activityId");
       return new MemoryCustomEvent(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MemoryCustomEvent.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof MemoryCustomEvent && a.g(this.activityId, p0.activityId))) {
          return true;
       }
       return false;
    }
    public final String getActivityId(){
       return this.activityId;
    }
    public final String getFatalError(){
       return this.fatalError;
    }
    public final String getResult(){
       return this.result;
    }
    public final ArrayList getStages(){
       return this.stages;
    }
    public final long getTotalCost(){
       return this.totalCost;
    }
    public int hashCode(){
       MemoryCustomEvent obj = PatchProxy.apply(null, this, MemoryCustomEvent.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.activityId;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public final void setActivityId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MemoryCustomEvent.class, "5")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.activityId = p0;
       return;
    }
    public final void setFatalError(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MemoryCustomEvent.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.fatalError = p0;
       return;
    }
    public final void setResult(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MemoryCustomEvent.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.result = p0;
       return;
    }
    public final void setTotalCost(long p0){
       this.totalCost = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, MemoryCustomEvent.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MemoryCustomEvent\(activityId="+this.activityId+"\)";
    }
}
