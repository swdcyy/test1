package com.kwai.performance.fluency.page.monitor.checker.FullyDrawTagChecker$start$1$$special$$inlined$let$lambda$1;
import java.lang.Runnable;
import android.view.ViewGroup;
import com.kwai.performance.fluency.page.monitor.checker.FullyDrawTagChecker$start$1;
import java.lang.Object;
import gf7.a;
import gf7.h;
import android.os.SystemClock;
import qrd.l1;
import com.kwai.performance.fluency.page.monitor.checker.FullyDrawTagChecker;
import java.lang.System;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.performance.fluency.page.monitor.checker.FullyDrawTagChecker$start$1$$special$$inlined$let$lambda$1$1;
import msd.a;
import java.lang.StringBuilder;
import yf7.h;

public final class FullyDrawTagChecker$start$1$$special$$inlined$let$lambda$1 implements Runnable	// class@0010bd
{
    public final ViewGroup b;
    public final FullyDrawTagChecker$start$1 c;

    public void FullyDrawTagChecker$start$1$$special$$inlined$let$lambda$1(ViewGroup p0,FullyDrawTagChecker$start$1 p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       a uoa = new a();
       int[] ointArray = new int[0];
       int[] ointArray1 = new int[0];
       h oh = new h(0, 0, ointArray, ointArray1, 0, 0, 0, 0);
       uoa.m(v11);
       uoa.l(SystemClock.elapsedRealtime());
       this.c.b.b = uoa;
       FullyDrawTagChecker$start$1$$special$$inlined$let$lambda$1 tb = this.b;
       a.o(tb, "it");
       this.c.b.b(tb);
       long l = System.currentTimeMillis() - System.currentTimeMillis();
       FullyDrawTagChecker b = this.c.b.b;
       if (b != null) {
          b.a(new FullyDrawTagChecker$start$1$$special$$inlined$let$lambda$1$1(l));
       }
       h.a("PageMonitor FullyDrawTagChecker", "check FullyDrawTag entry, cost "+l);
       return;
    }
}
