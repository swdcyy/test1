package com.kwai.performance.fluency.trace.monitor.TraceMonitor$a;
import java.lang.Runnable;
import java.lang.Object;
import com.kwai.performance.fluency.trace.monitor.TraceMonitor;
import java.lang.String;
import yf7.h;

public final class TraceMonitor$a implements Runnable	// class@0010f5
{
    public static final TraceMonitor$a b;

    static {
       TraceMonitor$a.b = new TraceMonitor$a();
    }
    public void TraceMonitor$a(){
       super();
    }
    public final void run(){
       TraceMonitor iNSTANCE = TraceMonitor.INSTANCE;
       String str = TraceMonitor.access$getMCurrentSectionName$p(iNSTANCE);
       if (str != null) {
          h.d("TraceMonitor", "watch too long, need terminate this watch");
          iNSTANCE.stopSectionInternal(str, true, "terminate_from_java");
       }
       return;
    }
}
