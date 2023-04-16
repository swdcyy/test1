package com.kwai.performance.stability.crash.monitor.internal.b;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kwai.performance.stability.crash.monitor.internal.ExceptionReporter;
import java.lang.String;
import kotlin.jvm.internal.a;
import yf7.h;

public final class b implements g	// class@0011e8
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final void accept(Object p0){
       a.p(p0, "throwable");
       h.b("ExceptionReporter", a.C("uploadExceptionFile error: ", p0));
    }
}
