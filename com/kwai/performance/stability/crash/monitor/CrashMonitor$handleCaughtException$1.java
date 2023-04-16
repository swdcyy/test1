package com.kwai.performance.stability.crash.monitor.CrashMonitor$handleCaughtException$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Throwable;
import java.lang.Object;
import qrd.l1;
import com.kwai.performance.stability.crash.monitor.message.CaughtExceptionMessage;
import com.kwai.performance.stability.crash.monitor.message.ExceptionMessage;
import com.kwai.performance.stability.crash.monitor.util.e;
import ug7.a;
import com.kwai.performance.stability.crash.monitor.CrashMonitorLoggerKt;

public final class CrashMonitor$handleCaughtException$1 extends Lambda implements a	// class@00118a
{
    public final Throwable $throwable;

    public void CrashMonitor$handleCaughtException$1(Throwable p0){
       this.$throwable = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       CaughtExceptionMessage uCaughtExcep = new CaughtExceptionMessage();
       e.u(this.$throwable, uCaughtExcep);
       CrashMonitorLoggerKt.b(uCaughtExcep, null, 2);
    }
}
