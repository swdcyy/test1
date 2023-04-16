package com.kuaishou.growth.taskcenter.TaskCenterInitModule$c;
import erd.g;
import com.kuaishou.growth.taskcenter.TaskCenterInitModule;
import java.lang.Object;
import eda.n;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import wkd.b;
import fg0.l;

public final class TaskCenterInitModule$c implements g	// class@000729
{
    public final TaskCenterInitModule b;

    public void TaskCenterInitModule$c(TaskCenterInitModule p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TaskCenterInitModule$c.class, "1")) {
       }else {
          a.p(p0, "event");
          TaskCenterInitModule$c tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, TaskCenterInitModule.class, "3")) {
             b.a(-1524711258).f2();
          }
       }
       return;
    }
}
