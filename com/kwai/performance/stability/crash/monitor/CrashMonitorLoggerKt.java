package com.kwai.performance.stability.crash.monitor.CrashMonitorLoggerKt;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kwai.performance.stability.crash.monitor.CrashMonitorLoggerKt$logCustomStatEvent$1;
import msd.a;
import com.kwai.performance.monitor.base.Monitor_ThreadKt;
import com.kwai.performance.stability.crash.monitor.message.ExceptionMessage;
import ug7.a;
import com.kwai.performance.stability.crash.monitor.CrashMonitorLoggerKt$logExceptionEvent$1;

public final class CrashMonitorLoggerKt	// class@001191
{

    public static void a(String p0,String p1,boolean p2,int p3,Object p4){
       if (p3 & 0x04) {
          p2 = false;
       }
       a.p(p0, "key");
       a.p(p1, "value");
       Monitor_ThreadKt.b(0, new CrashMonitorLoggerKt$logCustomStatEvent$1(p0, p1, p2), 1, null);
       return;
    }
    public static final void b(ExceptionMessage p0,a p1,int p2){
       a.p(p0, "msg");
       Monitor_ThreadKt.b(0, new CrashMonitorLoggerKt$logExceptionEvent$1(p0, p2, p1), 1, null);
    }
}
