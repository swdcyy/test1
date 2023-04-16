package com.kuaishou.growth.pendant.task.tk.bridge.TaskPendantJs2NativeInvoker$mParams$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.growth.pendant.task.tk.bridge.TaskPendantJs2NativeInvoker;
import com.kuaishou.growth.taskcenter.model.TaskCommonParams;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.growth.pendant.task.widget.KemTaskPendant;

public final class TaskPendantJs2NativeInvoker$mParams$2 extends Lambda implements a	// class@0006da
{
    public final TaskPendantJs2NativeInvoker this$0;

    public void TaskPendantJs2NativeInvoker$mParams$2(TaskPendantJs2NativeInvoker p0){
       this.this$0 = p0;
       super(0);
    }
    public final TaskCommonParams invoke(){
       Object obj = PatchProxy.apply(null, this, TaskPendantJs2NativeInvoker$mParams$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.this$0.c.getParams();
    }
    public Object invoke(){
       return this.invoke();
    }
}
