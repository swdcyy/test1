package com.kuaishou.growth.taskcenter.TaskCenterInitModule$b;
import erd.g;
import java.lang.Object;
import sx4.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.growth.taskcenter.util.TaskCenterLogUtil;

public final class TaskCenterInitModule$b implements g	// class@000728
{
    public static final TaskCenterInitModule$b b;

    static {
       TaskCenterInitModule$b.b = new TaskCenterInitModule$b();
    }
    public void TaskCenterInitModule$b(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TaskCenterInitModule$b.class, "1")) {
       }else {
          TaskCenterLogUtil.d(TaskCenterLogUtil.b, "TaskCenterInitModule", "load tk so finish ", false, 4, null);
       }
       return;
    }
}
