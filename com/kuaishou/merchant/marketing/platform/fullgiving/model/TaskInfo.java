package com.kuaishou.merchant.marketing.platform.fullgiving.model.TaskInfo;
import java.io.Serializable;
import com.kuaishou.merchant.marketing.platform.fullgiving.model.TaskInfo$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class TaskInfo implements Serializable	// class@001b2e
{
    public String errorDefaultMsg;
    public String taskId;
    public String taskStrategyId;
    public static final TaskInfo$a Companion;
    public static final long serialVersionUID;

    static {
       TaskInfo.Companion = new TaskInfo$a(null);
    }
    public void TaskInfo(String p0,String p1,String p2){
       super();
       this.errorDefaultMsg = p0;
       this.taskId = p1;
       this.taskStrategyId = p2;
    }
    public static TaskInfo copy$default(TaskInfo p0,String p1,String p2,String p3,int p4,Object p5){
       TaskInfo errorDefault;
       TaskInfo taskId;
       TaskInfo taskStrategy;
       if (p4 & 0x01) {
          errorDefault = p0.errorDefaultMsg;
       }
       if (p4 & 0x02) {
          taskId = p0.taskId;
       }
       if (p4 & 0x04) {
          taskStrategy = p0.taskStrategyId;
       }
       return p0.copy(errorDefault, taskId, taskStrategy);
    }
    public final String component1(){
       return this.errorDefaultMsg;
    }
    public final String component2(){
       return this.taskId;
    }
    public final String component3(){
       return this.taskStrategyId;
    }
    public final TaskInfo copy(String p0,String p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, TaskInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new TaskInfo(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TaskInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof TaskInfo && (a.g(this.errorDefaultMsg, p0.errorDefaultMsg) && (a.g(this.taskId, p0.taskId) && a.g(this.taskStrategyId, p0.taskStrategyId))))) {
          return true;
       }
       return false;
    }
    public final String getErrorDefaultMsg(){
       return this.errorDefaultMsg;
    }
    public final String getTaskId(){
       return this.taskId;
    }
    public final String getTaskStrategyId(){
       return this.taskStrategyId;
    }
    public int hashCode(){
       TaskInfo obj = PatchProxy.apply(null, this, TaskInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.errorDefaultMsg;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       TaskInfo ttaskId = this.taskId;
       int i2 = (ttaskId != null)? ttaskId.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttaskId = this.taskStrategyId;
       if (ttaskId != null) {
          i = ttaskId.hashCode();
       }
       return (i1 + i);
    }
    public final void setErrorDefaultMsg(String p0){
       this.errorDefaultMsg = p0;
    }
    public final void setTaskId(String p0){
       this.taskId = p0;
    }
    public final void setTaskStrategyId(String p0){
       this.taskStrategyId = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, TaskInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "TaskInfo\(errorDefaultMsg="+this.errorDefaultMsg+", taskId="+this.taskId+", taskStrategyId="+this.taskStrategyId+"\)";
    }
}
