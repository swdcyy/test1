package com.kwai.component.taskdispatcher.logger.data.DispatchInfo;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class DispatchInfo	// class@000b90
{
    public final long duration;
    public final long elapsedRealtime;
    public final int taskCount;
    public final List taskList;

    public void DispatchInfo(int p0,long p1,List p2,long p3){
       a.p(p2, "taskList");
       super();
       this.taskCount = p0;
       this.duration = p1;
       this.taskList = p2;
       this.elapsedRealtime = p3;
    }
    public void DispatchInfo(int p0,long p1,List p2,long p3,int p4,u p5){
       if (p4 & 0x08) {
          p3 = 0;
       }
       super(p0, p1, p2, p3);
       return;
    }
    public static DispatchInfo copy$default(DispatchInfo p0,int p1,long p2,List p3,long p4,int p5,Object p6){
       DispatchInfo taskCount;
       DispatchInfo duration;
       DispatchInfo taskList;
       DispatchInfo elapsedRealt;
       if (p5 & 0x01) {
          taskCount = p0.taskCount;
       }
       if (p5 & 0x02) {
          duration = p0.duration;
       }
       DispatchInfo uDispatchInf = duration;
       if (p5 & 0x04) {
          taskList = p0.taskList;
       }
       p6 = taskList;
       if (p5 & 0x08) {
          elapsedRealt = p0.elapsedRealtime;
       }
       return p0.copy(taskCount, uDispatchInf, p6, elapsedRealt);
    }
    public final int component1(){
       return this.taskCount;
    }
    public final long component2(){
       return this.duration;
    }
    public final List component3(){
       return this.taskList;
    }
    public final long component4(){
       return this.elapsedRealtime;
    }
    public final DispatchInfo copy(int p0,long p1,List p2,long p3){
       Object obj;
       if (PatchProxy.isSupport(DispatchInfo.class)) {
          obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), Long.valueOf(p1), p2, Long.valueOf(p3), this, DispatchInfo.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p2, "taskList");
       DispatchInfo uDispatchInf = new DispatchInfo(p0, p1, p2, p3);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DispatchInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof DispatchInfo && (this.taskCount == p0.taskCount && (!this.duration - p0.duration && (a.g(this.taskList, p0.taskList) && !this.elapsedRealtime - p0.elapsedRealtime))))) {
          return true;
       }
       return false;
    }
    public final long getDuration(){
       return this.duration;
    }
    public final long getElapsedRealtime(){
       return this.elapsedRealtime;
    }
    public final int getTaskCount(){
       return this.taskCount;
    }
    public final List getTaskList(){
       return this.taskList;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, DispatchInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       DispatchInfo tduration = this.duration;
       long l = 32;
       int i = ((this.taskCount * 31) + (int)(tduration ^ (tduration >> l))) * 31;
       tduration = this.taskList;
       int i1 = (tduration != null)? tduration.hashCode(): 0;
       tduration = this.elapsedRealtime;
       return (((i + i1) * 31) + (int)(tduration ^ (tduration >> l)));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, DispatchInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "DispatchInfo\(taskCount="+this.taskCount+", duration="+this.duration+", taskList="+this.taskList+", elapsedRealtime="+this.elapsedRealtime+"\)";
    }
}
