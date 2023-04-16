package com.kuaishou.growth.taskcenter.debugtool.TaskCenterDTHelper;
import com.kuaishou.growth.taskcenter.debugtool.TaskCenterDTHelper$refreshPublisher$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.utility.SystemUtil;
import o56.a;
import com.kuaishou.growth.taskcenter.debugtool.TaskCenterDTHelper$mTaskCenterDTData$2;
import java.lang.Object;
import bg0.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import mrd.a;

public final class TaskCenterDTHelper	// class@000735
{
    public static final p a;
    public static final boolean b;
    public static final p c;
    public static final TaskCenterDTHelper d;

    static {
       TaskCenterDTHelper.d = new TaskCenterDTHelper();
       TaskCenterDTHelper.a = s.c(TaskCenterDTHelper$refreshPublisher$2.INSTANCE);
       boolean b = (SystemUtil.K() && a.d())? true: false;
       TaskCenterDTHelper.b = b;
       TaskCenterDTHelper.c = s.c(TaskCenterDTHelper$mTaskCenterDTData$2.INSTANCE);
    }
    public void TaskCenterDTHelper(){
       super();
    }
    public final b a(){
       Object obj = PatchProxy.apply(null, this, TaskCenterDTHelper.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b();
    }
    public final b b(){
       Object obj = PatchProxy.apply(null, this, TaskCenterDTHelper.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TaskCenterDTHelper.c.getValue();
    }
    public final a c(){
       Object obj = PatchProxy.apply(null, this, TaskCenterDTHelper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TaskCenterDTHelper.a.getValue();
    }
    public final boolean d(){
       return (TaskCenterDTHelper.b ^ 0x01);
    }
    public final boolean e(){
       return TaskCenterDTHelper.b;
    }
}
