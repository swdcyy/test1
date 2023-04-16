package com.kuaishou.live.bridge.commands.TaskEventParams;
import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class TaskEventParams implements Serializable	// class@000e06
{
    public final String action2;
    public final Integer status;

    public void TaskEventParams(Integer p0,String p1){
       super();
       this.status = p0;
       this.action2 = p1;
    }
    public static TaskEventParams copy$default(TaskEventParams p0,Integer p1,String p2,int p3,Object p4){
       TaskEventParams status;
       TaskEventParams action2;
       if (p3 & 0x01) {
          status = p0.status;
       }
       if (p3 & 0x02) {
          action2 = p0.action2;
       }
       return p0.copy(status, action2);
    }
    public final Integer component1(){
       return this.status;
    }
    public final String component2(){
       return this.action2;
    }
    public final TaskEventParams copy(Integer p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, TaskEventParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new TaskEventParams(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TaskEventParams.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof TaskEventParams && (a.g(this.status, p0.status) && a.g(this.action2, p0.action2)))) {
          return true;
       }
       return false;
    }
    public final String getAction2(){
       return this.action2;
    }
    public final Integer getStatus(){
       return this.status;
    }
    public int hashCode(){
       TaskEventParams obj = PatchProxy.apply(null, this, TaskEventParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.status;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       TaskEventParams taction2 = this.action2;
       if (taction2 != null) {
          i = taction2.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, TaskEventParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "TaskEventParams\(status="+this.status+", action2="+this.action2+"\)";
    }
}
