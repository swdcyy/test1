package com.kuaishou.growth.taskcenter.debugtool.TaskCenterDTView;
import ml8.d;
import android.widget.FrameLayout;
import com.kuaishou.growth.taskcenter.debugtool.TaskCenterDTView$a;
import nsd.u;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.yxcorp.utility.n;
import com.kuaishou.growth.taskcenter.debugtool.TaskCenterDTView$mClipboardManager$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.growth.pendant.debugtool.console.ConsoleView;
import ekd.m1;
import com.kwai.library.widget.textview.KwaiFoldingTextView;
import android.widget.TextView;
import android.widget.Switch;
import android.widget.Button;
import com.kuaishou.growth.taskcenter.debugtool.TaskCenterDTView$b;
import android.widget.CompoundButton$OnCheckedChangeListener;
import com.kuaishou.growth.taskcenter.debugtool.TaskCenterDTView$c;
import com.kuaishou.growth.taskcenter.debugtool.TaskCenterDTView$d;
import android.view.View$OnLongClickListener;
import ke0.a;
import ke0.b;
import java.lang.Throwable;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kuaishou.growth.taskcenter.debugtool.TaskCenterDTView$e;
import android.view.View$OnClickListener;
import android.content.ClipboardManager;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewGroup;
import com.kuaishou.growth.taskcenter.debugtool.TaskCenterDTHelper;
import mrd.a;
import t45.d;
import brd.z;
import brd.t;
import com.kuaishou.growth.taskcenter.debugtool.TaskCenterDTView$f;
import erd.g;
import crd.b;
import com.kuaishou.growth.taskcenter.util.TaskCenterLogUtil;
import io.reactivex.subjects.ReplaySubject;
import com.kuaishou.growth.taskcenter.debugtool.TaskCenterDTView$g;
import lnc.b9;

public final class TaskCenterDTView extends FrameLayout implements d	// class@00073e
{
    public Switch b;
    public Switch c;
    public b d;
    public b e;
    public TextView f;
    public KwaiFoldingTextView g;
    public ConsoleView h;
    public Button i;
    public final p j;
    public String k;
    public static final TaskCenterDTView$a l;

    static {
       TaskCenterDTView.l = new TaskCenterDTView$a(null);
    }
    public void TaskCenterDTView(Context p0){
       super(p0, null, 2, null);
    }
    public void TaskCenterDTView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       if (PatchProxy.applyVoid(null, this, TaskCenterDTView.class, "2")) {
       }else {
          this.addView(n.G(this.getContext(), R.layout.arg_RES_7f0d08c7));
          this.doBindView(this);
       }
       this.j = s.c(new TaskCenterDTView$mClipboardManager$2(p0));
       return;
    }
    public void TaskCenterDTView(Context p0,AttributeSet p1,int p2,u p3){
       super(p0, null);
    }
    public static final ConsoleView a(TaskCenterDTView p0){
       p0 = p0.h;
       if (p0 == null) {
          a.S("mConsoleView");
       }
       return p0;
    }
    public void doBindView(View p0){
       View view;
       if (PatchProxy.applyVoidOneRefs(p0, this, TaskCenterDTView.class, "3")) {
          return;
       }
       a.p(p0, "view");
       view = m1.f(p0, R.id.task_center_debug_info_task_params);
       a.o(view, "bindWidget\(view, R.id.ta¡­r_debug_info_task_params\)");
       this.g = view;
       view = m1.f(p0, R.id.task_center_debug_info_task_info);
       a.o(view, "bindWidget\(view, R.id.ta¡­ter_debug_info_task_info\)");
       this.f = view;
       view = m1.f(p0, R.id.mock_task_success);
       a.o(view, "bindWidget\(view, R.id.mock_task_success\)");
       this.b = view;
       view = m1.f(p0, R.id.test_mode);
       a.o(view, "bindWidget\(view, R.id.test_mode\)");
       this.c = view;
       view = m1.f(p0, R.id.console_view);
       a.o(view, "bindWidget\(view, R.id.console_view\)");
       this.h = view;
       p0 = m1.f(p0, R.id.clear_log);
       a.o(p0, "bindWidget\(view, R.id.clear_log\)");
       this.i = p0;
       TaskCenterDTView tb = this.b;
       if (tb == null) {
          a.S("mMockTaskSuccessSwitch");
       }
       tb.setOnCheckedChangeListener(TaskCenterDTView$b.b);
       tb = this.c;
       if (tb == null) {
          a.S("mTestModeSwitch");
       }
       tb.setOnCheckedChangeListener(TaskCenterDTView$c.b);
       tb = this.g;
       if (tb == null) {
          a.S("mTaskParamsTv");
       }
       tb.setOnLongClickListener(new TaskCenterDTView$d(this));
       tb = this.h;
       if (tb == null) {
          a.S("mConsoleView");
       }
       a[] uoaArray = new a[]{v9};
       a uoa = new a("TaskCenterDTView", "start", null, null, 12, null);
       tb.z(CollectionsKt__CollectionsKt.P(uoaArray));
       tb = this.i;
       if (tb == null) {
          a.S("mClearLogBtn");
       }
       tb.setOnClickListener(new TaskCenterDTView$e(this));
       return;
    }
    public final ClipboardManager getMClipboardManager(){
       Object obj = PatchProxy.apply(null, this, TaskCenterDTView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.getValue();
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, TaskCenterDTView.class, "4")) {
          return;
       }
       super.onAttachedToWindow();
       z a = d.a;
       this.d = TaskCenterDTHelper.d.c().observeOn(a).subscribe(new TaskCenterDTView$f(this));
       t ot = TaskCenterLogUtil.b.b().observeOn(a);
       this.e = ot.subscribe(new TaskCenterDTView$g(this));
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, TaskCenterDTView.class, "6")) {
          return;
       }
       super.onDetachedFromWindow();
       b9.a(this.d);
       b9.a(this.e);
       return;
    }
}
