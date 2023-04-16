package com.kuaishou.growth.taskcenter.model.TaskParamsAdaptConfig;
import java.io.Serializable;
import com.kuaishou.growth.taskcenter.model.TaskParamsAdaptConfig$a;
import nsd.u;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class TaskParamsAdaptConfig implements Serializable	// class@000749
{
    public final List bizIdWhiteList;
    public final List taskTypeWhiteList;
    public static final TaskParamsAdaptConfig$a Companion;
    public static final long serialVersionUID;

    static {
       TaskParamsAdaptConfig.Companion = new TaskParamsAdaptConfig$a(null);
    }
    public void TaskParamsAdaptConfig(){
       super(null, null, 3, null);
    }
    public void TaskParamsAdaptConfig(List p0){
       super(p0, null, 2, null);
    }
    public void TaskParamsAdaptConfig(List p0,List p1){
       a.p(p0, "bizIdWhiteList");
       a.p(p1, "taskTypeWhiteList");
       super();
       this.bizIdWhiteList = p0;
       this.taskTypeWhiteList = p1;
    }
    public void TaskParamsAdaptConfig(List p0,List p1,int p2,u p3){
       ArrayList uArrayList;
       ArrayList uArrayList1;
       if (p2 & 0x01) {
          uArrayList = new ArrayList();
       }
       if (p2 & 0x02) {
          uArrayList1 = new ArrayList();
       }
       super(uArrayList, uArrayList1);
       return;
    }
    public static TaskParamsAdaptConfig copy$default(TaskParamsAdaptConfig p0,List p1,List p2,int p3,Object p4){
       TaskParamsAdaptConfig bizIdWhiteLi;
       TaskParamsAdaptConfig taskTypeWhit;
       if (p3 & 0x01) {
          bizIdWhiteLi = p0.bizIdWhiteList;
       }
       if (p3 & 0x02) {
          taskTypeWhit = p0.taskTypeWhiteList;
       }
       return p0.copy(bizIdWhiteLi, taskTypeWhit);
    }
    public final List component1(){
       return this.bizIdWhiteList;
    }
    public final List component2(){
       return this.taskTypeWhiteList;
    }
    public final TaskParamsAdaptConfig copy(List p0,List p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, TaskParamsAdaptConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "bizIdWhiteList");
       a.p(p1, "taskTypeWhiteList");
       return new TaskParamsAdaptConfig(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TaskParamsAdaptConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof TaskParamsAdaptConfig && (a.g(this.bizIdWhiteList, p0.bizIdWhiteList) && a.g(this.taskTypeWhiteList, p0.taskTypeWhiteList)))) {
          return true;
       }
       return false;
    }
    public final List getBizIdWhiteList(){
       return this.bizIdWhiteList;
    }
    public final List getTaskTypeWhiteList(){
       return this.taskTypeWhiteList;
    }
    public int hashCode(){
       TaskParamsAdaptConfig obj = PatchProxy.apply(null, this, TaskParamsAdaptConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.bizIdWhiteList;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       TaskParamsAdaptConfig ttaskTypeWhi = this.taskTypeWhiteList;
       if (ttaskTypeWhi != null) {
          i = ttaskTypeWhi.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, TaskParamsAdaptConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "TaskParamsAdaptConfig\(bizIdWhiteList="+this.bizIdWhiteList+", taskTypeWhiteList="+this.taskTypeWhiteList+"\)";
    }
}
