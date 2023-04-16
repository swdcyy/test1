package com.kuaishou.growth.taskcenter.TaskCenterInitModule$f;
import erd.g;
import com.kuaishou.growth.taskcenter.TaskCenterInitModule;
import java.lang.Object;
import zh5.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class TaskCenterInitModule$f implements g	// class@00072c
{
    public final TaskCenterInitModule b;

    public void TaskCenterInitModule$f(TaskCenterInitModule p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TaskCenterInitModule$f.class, "1")) {
       }else {
          a.p(p0, "event");
          this.b.onVisitorModeEvent(p0);
       }
       return;
    }
}
