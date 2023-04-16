package com.kuaishou.growth.taskcenter.debugtool.TaskCenterDTView$b;
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

public final class TaskCenterDTView$b implements CompoundButton$OnCheckedChangeListener	// class@000737
{
    public static final TaskCenterDTView$b b;

    static {
       TaskCenterDTView$b.b = new TaskCenterDTView$b();
    }
    public void TaskCenterDTView$b(){
       super();
    }
    public final void onCheckedChanged(CompoundButton p0,boolean p1){
       if (PatchProxy.isSupport(TaskCenterDTView$b.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, TaskCenterDTView$b.class, "1")) {
          return;
       }
       TaskCenterLogUtil.d(TaskCenterLogUtil.b, "TaskCenterDTView", "mockTaskSuccess "+p1, false, 4, null);
       p0.d = p1;
       return;
    }
}
