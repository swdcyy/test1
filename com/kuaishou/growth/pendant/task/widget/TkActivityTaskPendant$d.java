package com.kuaishou.growth.pendant.task.widget.TkActivityTaskPendant$d;
import tx4.o;
import com.kuaishou.growth.pendant.task.widget.TkActivityTaskPendant;
import java.lang.Object;
import sx4.e;
import tx4.w;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import com.kuaishou.growth.taskcenter.util.TaskCenterLogUtil;
import java.lang.StringBuilder;
import java.lang.Integer;
import java.lang.Throwable;
import ge0.e;
import ge0.c;

public final class TkActivityTaskPendant$d implements o	// class@0006e6
{
    public final TkActivityTaskPendant a;

    public void TkActivityTaskPendant$d(TkActivityTaskPendant p0){
       this.a = p0;
       super();
    }
    public void a(e p0,w p1){
       Integer integer1;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TkActivityTaskPendant$d.class, "1")) {
          return;
       }
       this.a.k = System.currentTimeMillis() - this.a.j;
       TaskCenterLogUtil b = TaskCenterLogUtil.b;
       TaskCenterLogUtil.d(b, "TkActivityTaskPendant", "asyncCreateView onSuccess cost "+this.a.k, false, 4, null);
       boolean b1 = true;
       Integer integer = null;
       if (p0 != null) {
          this.a.setTKViewContainer(p0);
          this.a.r(b1, integer);
          TaskCenterLogUtil.d(b, "TkActivityTaskPendant", "asyncCreateView onSuccess setTKViewContainer success", false, 4, null);
          integer1 = integer;
       }else {
          integer1 = integer;
          b1 = false;
       }
       if (!b1) {
          TaskCenterLogUtil.a(TaskCenterLogUtil.b, "TkActivityTaskPendant", "asyncCreateView onSuccess, fail ", integer1, false, 8, null);
          if (this.a.q()) {
             return;
          }else {
             this.a.r(false, Integer.valueOf(-1));
             this.a.getMUgActivityTkStrategy().c(this.a.h, c.a(p1));
             this.a.s();
          }
       }
       return;
    }
    public void b(int p0,Throwable p1,w p2){
       if (PatchProxy.isSupport(TkActivityTaskPendant$d.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, TkActivityTaskPendant$d.class, "2")) {
          return;
       }
       TaskCenterLogUtil.a(TaskCenterLogUtil.b, "TkActivityTaskPendant", "asyncCreateView onFailed errorCode-"+p0+' ', p1, false, 8, null);
       if (this.a.q()) {
          return;
       }
       this.a.s();
       this.a.getMUgActivityTkStrategy().c(this.a.h, c.a(p2));
       this.a.r(false, Integer.valueOf(p0));
       return;
    }
}
