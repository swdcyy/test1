package com.kuaishou.growth.taskcenter.debugtool.TaskCenterDTView$g;
import erd.g;
import com.kuaishou.growth.taskcenter.debugtool.TaskCenterDTView;
import java.lang.Object;
import ke0.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.growth.pendant.debugtool.console.ConsoleView;
import kotlin.jvm.internal.a;

public final class TaskCenterDTView$g implements g	// class@00073c
{
    public final TaskCenterDTView b;

    public void TaskCenterDTView$g(TaskCenterDTView p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TaskCenterDTView$g.class, "1")) {
       }else {
          a.o(p0, "it");
          TaskCenterDTView.a(this.b).x(p0);
       }
       return;
    }
}
