package com.kwai.performance.stability.crash.monitor.internal.f;
import java.lang.Runnable;
import com.kwai.performance.stability.crash.monitor.internal.ExceptionReporter;
import java.io.File;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Objects;
import yf7.h;
import com.kwai.performance.stability.crash.monitor.internal.a;
import tg7.h;
import tg7.e;
import erd.g;
import com.kwai.performance.stability.crash.monitor.util.b;

public final class f implements Runnable	// class@0011ec
{
    public final ExceptionReporter b;
    public final File c;
    public final List d;

    public void f(ExceptionReporter p0,File p1,List p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       f tb = this.b;
       f tc = this.c;
       f td = this.d;
       a.p(tb, "this$0");
       a.p(tc, "$zipDir");
       a.p(td, "$uploadFileTasks");
       Objects.requireNonNull(tb);
       h.d("ExceptionReporter", a.C("uploadExceptionFiles ", tc));
       b.a(td, a.b, new h(tc), new e(tc));
    }
}
