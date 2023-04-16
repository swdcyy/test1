package com.kuaishou.growth.taskcenter.debugtool.TaskCenterDTView$d;
import android.view.View$OnLongClickListener;
import com.kuaishou.growth.taskcenter.debugtool.TaskCenterDTView;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.growth.taskcenter.debugtool.TaskCenterDTHelper;
import bg0.b;
import java.lang.CharSequence;
import android.content.ClipData;
import android.content.ClipboardManager;
import com.kuaishou.growth.taskcenter.util.TaskCenterLogUtil;

public final class TaskCenterDTView$d implements View$OnLongClickListener	// class@000739
{
    public final TaskCenterDTView b;

    public void TaskCenterDTView$d(TaskCenterDTView p0){
       this.b = p0;
       super();
    }
    public final boolean onLongClick(View p0){
       p0 = PatchProxy.applyOneRefs(p0, this, TaskCenterDTView$d.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       this.b.getMClipboardManager().setPrimaryClip(ClipData.newPlainText("Label", TaskCenterDTHelper.d.a().b()));
       TaskCenterLogUtil.d(TaskCenterLogUtil.b, "TaskCenterDTView", "任务配置已复制到剪切板", false, 4, null);
       return true;
    }
}
