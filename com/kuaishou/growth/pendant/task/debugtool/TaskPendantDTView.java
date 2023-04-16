package com.kuaishou.growth.pendant.task.debugtool.TaskPendantDTView;
import ml8.d;
import android.widget.FrameLayout;
import com.kuaishou.growth.pendant.task.debugtool.TaskPendantDTView$a;
import nsd.u;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import ekd.m1;
import android.widget.TextView;
import com.kuaishou.growth.pendant.task.debugtool.TaskPendantDTHelper;
import mrd.a;
import t45.d;
import brd.z;
import brd.t;
import com.kuaishou.growth.pendant.task.debugtool.TaskPendantDTView$b;
import erd.g;
import crd.b;
import lnc.b9;

public final class TaskPendantDTView extends FrameLayout implements d	// class@0006d8
{
    public b b;
    public TextView c;
    public static final TaskPendantDTView$a d;

    static {
       TaskPendantDTView.d = new TaskPendantDTView$a(null);
    }
    public void TaskPendantDTView(Context p0){
       super(p0, null, 2, null);
    }
    public void TaskPendantDTView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       if (PatchProxy.applyVoid(null, this, TaskPendantDTView.class, "1")) {
       }else {
          a.d(this.getContext(), R.layout.arg_RES_7f0d0872, this, true);
          this.doBindView(this);
       }
       return;
    }
    public void TaskPendantDTView(Context p0,AttributeSet p1,int p2,u p3){
       super(p0, null);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TaskPendantDTView.class, "2")) {
          return;
       }
       a.p(p0, "view");
       p0 = m1.f(p0, R.id.pendant_task_debug_info);
       a.o(p0, "ViewBindUtils.bindWidget¡­.pendant_task_debug_info\)");
       this.c = p0;
       return;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, TaskPendantDTView.class, "3")) {
          return;
       }
       super.onAttachedToWindow();
       this.b = TaskPendantDTHelper.c.b().observeOn(d.a).subscribe(new TaskPendantDTView$b(this));
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, TaskPendantDTView.class, "5")) {
          return;
       }
       super.onDetachedFromWindow();
       b9.a(this.b);
       return;
    }
}
