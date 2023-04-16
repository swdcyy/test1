package com.kuaishou.growth.taskcenter.TaskCenterInitModule$e;
import erd.g;
import com.kuaishou.growth.taskcenter.TaskCenterInitModule;
import java.lang.Object;
import zca.r;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class TaskCenterInitModule$e implements g	// class@00072b
{
    public final TaskCenterInitModule b;

    public void TaskCenterInitModule$e(TaskCenterInitModule p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TaskCenterInitModule$e.class, "1")) {
       }else {
          a.p(p0, "event");
          this.b.onSafeLockEvent(p0);
       }
       return;
    }
}
