package com.kuaishou.growth.taskcenter.debugtool.TaskCenterDTView$e;
import android.view.View$OnClickListener;
import com.kuaishou.growth.taskcenter.debugtool.TaskCenterDTView;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.growth.pendant.debugtool.console.ConsoleView;

public final class TaskCenterDTView$e implements View$OnClickListener	// class@00073a
{
    public final TaskCenterDTView b;

    public void TaskCenterDTView$e(TaskCenterDTView p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TaskCenterDTView$e.class, "1")) {
          return;
       }
       TaskCenterDTView.a(this.b).y();
       return;
    }
}
