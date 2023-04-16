package com.kuaishou.growth.pendant.task.debugtool.TaskPendantDTView$b;
import erd.g;
import com.kuaishou.growth.pendant.task.debugtool.TaskPendantDTView;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.growth.pendant.task.debugtool.TaskPendantDTHelper;
import com.kwai.robust.PatchProxyResult;
import df0.b;
import java.lang.StringBuilder;
import java.lang.ref.WeakReference;
import com.kuaishou.growth.pendant.task.widget.KemTaskPendant;
import com.kuaishou.growth.pendant.task.widget.TkActivityTaskPendant;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import android.widget.TextView;

public final class TaskPendantDTView$b implements g	// class@0006d7
{
    public final TaskPendantDTView b;

    public void TaskPendantDTView$b(TaskPendantDTView p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TaskPendantDTView$b.class, "1")) {
       }else {
          p0 = this.b;
          Objects.requireNonNull(p0);
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, p0, TaskPendantDTView.class, "4")) {
             TaskPendantDTHelper c = TaskPendantDTHelper.c;
             Objects.requireNonNull(c);
             b uob = PatchProxy.apply(objArray, c, TaskPendantDTHelper.class, "3");
             if (uob != PatchProxyResult.class) {
             }else {
                uob = c.a();
             }
             StringBuilder str = "当前页面: "+uob.c+"\n"+"是否降级: "+uob.a()+"\n";
             uob = uob.a;
             if (uob != null) {
                KemTaskPendant kemTaskPenda = uob.get();
                if (kemTaskPenda != null) {
                   str = str+"任务挂件: "+kemTaskPenda.getClass().getSimpleName()+"\n"+"TK: "+kemTaskPenda instanceof TkActivityTaskPendant+"\n";
                }
             }
             p0 = p0.c;
             if (p0 == null) {
                a.S("mDebugInfoText");
             }
             p0.setText(str);
          }
       }
       return;
    }
}
