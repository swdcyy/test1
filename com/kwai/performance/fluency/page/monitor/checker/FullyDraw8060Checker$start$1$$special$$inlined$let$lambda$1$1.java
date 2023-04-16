package com.kwai.performance.fluency.page.monitor.checker.FullyDraw8060Checker$start$1$$special$$inlined$let$lambda$1$1;
import msd.t;
import kotlin.jvm.internal.Lambda;
import com.kwai.performance.fluency.page.monitor.checker.FullyDraw8060Checker$start$1$$special$$inlined$let$lambda$1;
import java.lang.Object;
import java.lang.Number;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.performance.fluency.page.monitor.checker.FullyDraw8060Checker$start$1;
import com.kwai.performance.fluency.page.monitor.checker.FullyDraw8060Checker;
import gf7.h;
import gf7.a;
import android.os.SystemClock;
import java.lang.System;
import android.view.ViewGroup;
import java.lang.Long;
import com.kwai.performance.fluency.page.monitor.checker.FullyDraw8060Checker$start$1$$special$$inlined$let$lambda$1$1$1;
import msd.a;
import java.lang.StringBuilder;
import yf7.h;

public final class FullyDraw8060Checker$start$1$$special$$inlined$let$lambda$1$1 extends Lambda implements t	// class@0010b0
{
    public final FullyDraw8060Checker$start$1$$special$$inlined$let$lambda$1 this$0;

    public void FullyDraw8060Checker$start$1$$special$$inlined$let$lambda$1$1(FullyDraw8060Checker$start$1$$special$$inlined$let$lambda$1 p0){
       this.this$0 = p0;
       super(6);
    }
    public Object invoke(Object p0,Object p1,Object p2,Object p3,Object p4,Object p5){
       return this.invoke(p0, p1, p2.intValue(), p3.intValue(), p4.intValue(), p5.intValue());
    }
    public final Object invoke(int[] p0,int[] p1,int p2,int p3,int p4,int p5){
       FullyDraw8060Checker$start$1$$special$$inlined$let$lambda$1$1 ostart$1$$sp = this;
       a.p(p0, "xPixels");
       a.p(p1, "yPixels");
       FullyDraw8060Checker b = ostart$1$$sp.this$0.c.b.b;
       if (b != null) {
          h oh = new h(0, 0, p0, p1, p2, p3, p4, p5);
          b.m(v11);
       }
       b = ostart$1$$sp.this$0.c.b.b;
       if (b != null) {
          b.l(SystemClock.elapsedRealtime());
       }
       FullyDraw8060Checker$start$1$$special$$inlined$let$lambda$1$1 this$0 = ostart$1$$sp.this$0;
       FullyDraw8060Checker$start$1$$special$$inlined$let$lambda$1 b1 = this$0.b;
       a.o(b1, "it");
       this$0.c.b.c(b1);
       Long longx = Long.valueOf((System.currentTimeMillis() - System.currentTimeMillis()));
       long l = longx.longValue();
       FullyDraw8060Checker b2 = ostart$1$$sp.this$0.c.b.b;
       if (b2 != null) {
          b2.a(new FullyDraw8060Checker$start$1$$special$$inlined$let$lambda$1$1$1(l));
       }
       h.a("PageMonitor FullyDraw8060Checker", "calculateFillRate entry, cost "+l);
       return longx;
    }
}
