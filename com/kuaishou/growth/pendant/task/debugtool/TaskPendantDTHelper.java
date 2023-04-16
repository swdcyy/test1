package com.kuaishou.growth.pendant.task.debugtool.TaskPendantDTHelper;
import com.kuaishou.growth.pendant.task.debugtool.TaskPendantDTHelper$refreshPublisher$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.growth.pendant.task.debugtool.TaskPendantDTHelper$mTaskPendantDTData$2;
import java.lang.Object;
import df0.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import mrd.a;
import java.lang.Boolean;
import com.kuaishou.growth.taskcenter.debugtool.TaskCenterDTHelper;

public final class TaskPendantDTHelper	// class@0006d5
{
    public static final p a;
    public static final p b;
    public static final TaskPendantDTHelper c;

    static {
       TaskPendantDTHelper.c = new TaskPendantDTHelper();
       TaskPendantDTHelper.a = s.c(TaskPendantDTHelper$refreshPublisher$2.INSTANCE);
       TaskPendantDTHelper.b = s.c(TaskPendantDTHelper$mTaskPendantDTData$2.INSTANCE);
    }
    public void TaskPendantDTHelper(){
       super();
    }
    public final b a(){
       Object obj = PatchProxy.apply(null, this, TaskPendantDTHelper.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TaskPendantDTHelper.b.getValue();
    }
    public final a b(){
       Object obj = PatchProxy.apply(null, this, TaskPendantDTHelper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TaskPendantDTHelper.a.getValue();
    }
    public final boolean c(){
       Object obj = PatchProxy.apply(null, this, TaskPendantDTHelper.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (TaskCenterDTHelper.d.e() ^ 0x01);
    }
}
