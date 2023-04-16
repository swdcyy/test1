package com.kwai.performance.overhead.thread.monitor.ThreadMonitor$a;
import java.lang.Object;
import nsd.u;
import android.os.Build$VERSION;
import java.lang.String;
import yf7.h;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import yf7.i;

public final class ThreadMonitor$a	// class@000dd3
{

    public void ThreadMonitor$a(){
       super();
    }
    public void ThreadMonitor$a(u p0){
       super();
    }
    public final boolean a(){
       int sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT > 26 && sDK_INT <= 31) {
          return true;
       }
       h.b("ThreadMonitor", "koom-thread track not support P below or R above now!");
       return false;
    }
    public final void b(String p0,String p1){
       a.q(p0, "type");
       a.q(p1, "msg");
       h.d("ThreadMonitor", "onReport "+p0+", "+p1);
       i.a.f(p1, 12);
    }
}
