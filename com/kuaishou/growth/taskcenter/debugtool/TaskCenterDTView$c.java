package com.kuaishou.growth.taskcenter.debugtool.TaskCenterDTView$c;
import android.widget.CompoundButton$OnCheckedChangeListener;
import java.lang.Object;
import android.widget.CompoundButton;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kuaishou.growth.taskcenter.util.TaskCenterLogUtil;
import java.lang.StringBuilder;
import com.kuaishou.growth.taskcenter.debugtool.TaskCenterDTHelper;
import bg0.b;

public final class TaskCenterDTView$c implements CompoundButton$OnCheckedChangeListener	// class@000738
{
    public static final TaskCenterDTView$c b;

    static {
       TaskCenterDTView$c.b = new TaskCenterDTView$c();
    }
    public void TaskCenterDTView$c(){
       super();
    }
    public final void onCheckedChanged(CompoundButton p0,boolean p1){
       if (PatchProxy.isSupport(TaskCenterDTView$c.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, TaskCenterDTView$c.class, "1")) {
          return;
       }
       TaskCenterLogUtil.d(TaskCenterLogUtil.b, "TaskCenterDTView", "testMode "+p1, false, 4, null);
       p0.e = p1;
       return;
    }
}
