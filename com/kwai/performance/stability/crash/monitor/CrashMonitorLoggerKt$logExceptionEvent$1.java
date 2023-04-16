package com.kwai.performance.stability.crash.monitor.CrashMonitorLoggerKt$logExceptionEvent$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.performance.stability.crash.monitor.message.ExceptionMessage;
import ug7.a;
import java.lang.Object;
import qrd.l1;
import kotlin.Result;
import yf7.i;
import vg7.d;
import java.lang.String;
import com.google.gson.Gson;
import kotlin.jvm.internal.a;
import java.lang.Throwable;
import qrd.j0;

public final class CrashMonitorLoggerKt$logExceptionEvent$1 extends Lambda implements a	// class@001190
{
    public final int $exceptionType;
    public final a $metrics;
    public final ExceptionMessage $msg;

    public void CrashMonitorLoggerKt$logExceptionEvent$1(ExceptionMessage p0,int p1,a p2){
       this.$msg = p0;
       this.$exceptionType = p1;
       this.$metrics = p2;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       CrashMonitorLoggerKt$logExceptionEvent$1 t$exceptionT = this.$exceptionType;
       CrashMonitorLoggerKt$logExceptionEvent$1 t$metrics = this.$metrics;
       i a = i.a;
       Gson j = d.j;
       String str = j.q(this.$msg);
       a.o(str, "RAW_GSON.toJson\(msg\)");
       String str1 = (t$metrics == null)? null: j.q(t$metrics);
       a.b(str, t$exceptionT, str1);
       Throwable obj = Result.constructor-impl(l1.a);
       obj = Result.exceptionOrNull-impl(obj);
       if (obj != null) {
          i.a.e("exception_logger_init_error", obj.getMessage(), false);
       }
       return;
    }
}
