package com.kwai.performance.overhead.thread.monitor.ThreadMonitor$c;
import fg7.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import yf7.i;
import yf7.d;
import yf7.d$a;
import com.kwai.performance.overhead.thread.monitor.ThreadMonitor;
import com.kwai.performance.overhead.thread.monitor.ThreadMonitor$a;

public final class ThreadMonitor$c implements c	// class@001172
{

    public void ThreadMonitor$c(){
       super();
    }
    public void a(int p0,String p1,String p2){
       a.q(p1, "key");
       a.q(p2, "value");
       if (p0 != 1) {
          if (p0 != 2) {
             if (p0 == 3) {
                d$a.c(i.a, p1, p2, false, 4, null);
             }
          }else {
             d$a.c(i.a, p1, p2, false, 4, null);
          }
       }else {
          ThreadMonitor.Companion.b(p1, p2);
       }
       return;
    }
}
