package com.kwai.performance.stability.crash.monitor.CrashMonitorLoggerKt$logCustomStatEvent$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import java.lang.Object;
import qrd.l1;
import kotlin.Result;
import yf7.i;
import java.lang.Throwable;
import qrd.j0;
import yf7.d;
import yf7.d$a;

public final class CrashMonitorLoggerKt$logCustomStatEvent$1 extends Lambda implements a	// class@00118f
{
    public final String $key;
    public final boolean $realtimeReport;
    public final String $value;

    public void CrashMonitorLoggerKt$logCustomStatEvent$1(String p0,String p1,boolean p2){
       this.$key = p0;
       this.$value = p1;
       this.$realtimeReport = p2;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       i.a.e(this.$key, this.$value, this.$realtimeReport);
       Throwable obj = Result.constructor-impl(l1.a);
       obj = Result.exceptionOrNull-impl(obj);
       if (obj != null) {
          d$a.c(i.a, "exception_logger_init_error", obj.getMessage(), false, 4, null);
       }
       return;
    }
}
