package com.kuaishou.growth.pendant.task.widget.TkActivityTaskPendant$c;
import tx4.p;
import com.kuaishou.growth.pendant.task.widget.TkActivityTaskPendant;
import java.lang.Object;
import java.lang.Throwable;
import tx4.w;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kuaishou.growth.taskcenter.util.TaskCenterLogUtil;
import ge0.e;
import ge0.c;

public final class TkActivityTaskPendant$c implements p	// class@0006e5
{
    public final TkActivityTaskPendant b;

    public void TkActivityTaskPendant$c(TkActivityTaskPendant p0){
       this.b = p0;
       super();
    }
    public final void m(Throwable p0,w p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TkActivityTaskPendant$c.class, "1")) {
          return;
       }
       TkActivityTaskPendant$c tb = this.b;
       a.o(p0, "throwable");
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, tb, TkActivityTaskPendant.class, "6")) {
          TaskCenterLogUtil.a(TaskCenterLogUtil.b, "TkActivityTaskPendant", "onITKException ", p0, false, 8, null);
          if (!tb.q()) {
             tb.getMUgActivityTkStrategy().c(tb.h, c.a(p1));
             tb.s();
          }
       }
       return;
    }
}
