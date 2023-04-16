package com.kwai.performance.fluency.page.monitor.checker.FullyDrawTagChecker$b$a$a;
import java.lang.Runnable;
import android.view.ViewGroup;
import com.kwai.performance.fluency.page.monitor.checker.FullyDrawTagChecker$b$a;
import java.lang.Object;
import com.kwai.performance.fluency.page.monitor.checker.FullyDrawTagChecker$b;
import com.kwai.performance.fluency.page.monitor.checker.FullyDrawTagChecker;
import msd.l;
import qrd.l1;
import gf7.a;
import android.os.SystemClock;
import java.lang.System;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import java.lang.Integer;
import yf7.h;

public final class FullyDrawTagChecker$b$a$a implements Runnable	// class@0010b6
{
    public final ViewGroup b;
    public final FullyDrawTagChecker$b$a c;

    public void FullyDrawTagChecker$b$a$a(ViewGroup p0,FullyDrawTagChecker$b$a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       FullyDrawTagChecker$b a = this.c.b.a;
       FullyDrawTagChecker b = a.b;
       if (b != null) {
          FullyDrawTagChecker a1 = a.a;
          if (a1 != null) {
             l1 ol1 = a1.invoke(b);
          }
          b.k((b.d() + 1));
          b.l(SystemClock.elapsedRealtime());
       }
       FullyDrawTagChecker$b$a$a tb = this.b;
       a.o(tb, "rootView");
       this.c.b.a.b(tb);
       long l = System.currentTimeMillis() - System.currentTimeMillis();
       StringBuilder str = "check FullyDrawTag count ";
       b = this.c.b.a.b;
       Integer integer = (b != null)? Integer.valueOf(b.d()): null;
       h.a("PageMonitor FullyDrawTagChecker", str+integer+", cost "+l);
       return;
    }
}
