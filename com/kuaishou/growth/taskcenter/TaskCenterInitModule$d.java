package com.kuaishou.growth.taskcenter.TaskCenterInitModule$d;
import erd.g;
import com.kuaishou.growth.taskcenter.TaskCenterInitModule;
import java.lang.Object;
import eda.l;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;

public final class TaskCenterInitModule$d implements g	// class@00072a
{
    public final TaskCenterInitModule b;

    public void TaskCenterInitModule$d(TaskCenterInitModule p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TaskCenterInitModule$d.class, "1")) {
       }else {
          a.p(p0, "event");
          TaskCenterInitModule$d tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, TaskCenterInitModule.class, "2")) {
             TaskCenterInitModule.p0(tb, false, false, 2, null);
          }
       }
       return;
    }
}
