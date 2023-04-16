package com.kuaishou.growth.taskcenter.debugtool.TaskCenterDTView$f;
import erd.g;
import com.kuaishou.growth.taskcenter.debugtool.TaskCenterDTView;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.growth.taskcenter.debugtool.TaskCenterDTHelper;
import bg0.b;
import kotlin.jvm.internal.a;
import android.widget.Switch;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.widget.TextView;
import com.yxcorp.utility.TextUtils;
import com.kwai.library.widget.textview.KwaiFoldingTextView;

public final class TaskCenterDTView$f implements g	// class@00073b
{
    public final TaskCenterDTView b;

    public void TaskCenterDTView$f(TaskCenterDTView p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TaskCenterDTView$f.class, "1")) {
       }else {
          p0 = this.b;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(null, p0, TaskCenterDTView.class, "5")) {
             b uob = TaskCenterDTHelper.d.a();
             TaskCenterDTView b = p0.b;
             if (b == null) {
                a.S("mMockTaskSuccessSwitch");
             }
             b.setChecked(uob.a());
             b = p0.c;
             if (b == null) {
                a.S("mTestModeSwitch");
             }
             b.setChecked(uob.c());
             StringBuilder str = "任务进度: "+uob.c+"\n";
             TaskCenterDTView f = p0.f;
             if (f == null) {
                a.S("mTaskInfoTv");
             }
             f.setText(str);
             if (!TextUtils.n(p0.k, uob.b())) {
                p0.k = uob.b();
                str = "任务原始配置: "+"\n"+uob.b();
                p0 = p0.g;
                if (p0 == null) {
                   a.S("mTaskParamsTv");
                }
                p0.v(str, 1);
             }
          }
       }
       return;
    }
}
