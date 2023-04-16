package com.kwai.performance.stability.crash.monitor.CrashMonitor$onApplicationPostCreate$1$1$1$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import qrd.l1;
import com.kwai.performance.stability.crash.monitor.CrashMonitor;

public final class CrashMonitor$onApplicationPostCreate$1$1$1$1 extends Lambda implements a	// class@00118b
{
    public static final CrashMonitor$onApplicationPostCreate$1$1$1$1 INSTANCE;

    static {
       CrashMonitor$onApplicationPostCreate$1$1$1$1.INSTANCE = new CrashMonitor$onApplicationPostCreate$1$1$1$1();
    }
    public void CrashMonitor$onApplicationPostCreate$1$1$1$1(){
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       CrashMonitor.reportException$default(null, 1, null);
    }
}
