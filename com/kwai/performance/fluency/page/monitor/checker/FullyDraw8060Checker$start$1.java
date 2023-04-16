package com.kwai.performance.fluency.page.monitor.checker.FullyDraw8060Checker$start$1;
import java.lang.Runnable;
import com.kwai.performance.fluency.page.monitor.checker.FullyDraw8060Checker;
import java.lang.Object;
import java.lang.ref.WeakReference;
import android.view.ViewGroup;
import java.util.Map;
import java.lang.System;
import java.lang.String;
import kotlin.jvm.internal.a;
import gf7.a;
import com.kwai.performance.fluency.page.monitor.checker.FullyDraw8060Checker$start$1$1$2$1;
import msd.a;
import java.lang.StringBuilder;
import yf7.h;
import com.kwai.performance.fluency.page.monitor.checker.FullyDraw8060Checker$start$1$$special$$inlined$let$lambda$1;
import android.os.Handler;

public final class FullyDraw8060Checker$start$1 implements Runnable	// class@0010b3
{
    public final FullyDraw8060Checker b;

    public void FullyDraw8060Checker$start$1(FullyDraw8060Checker p0){
       this.b = p0;
       super();
    }
    public final void run(){
       ViewGroup viewGroup = this.b.c.get();
       if (viewGroup != null) {
          this.b.d.clear();
          a.o(viewGroup, "it");
          this.b.l(viewGroup);
          long l = System.currentTimeMillis() - System.currentTimeMillis();
          this.b.b = new a();
          FullyDraw8060Checker b = this.b.b;
          if (b != null) {
             b.a(new FullyDraw8060Checker$start$1$1$2$1(l));
          }
          h.a("PageMonitor FullyDraw8060Checker", "snapShootLocationOfAllViews, cost "+l);
          this.b.f.post(new FullyDraw8060Checker$start$1$$special$$inlined$let$lambda$1(viewGroup, this));
       }
       this.b.k();
       return;
    }
}
