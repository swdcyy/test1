package com.kwai.performance.stability.crash.monitor.anr.e;
import android.os.Message;
import com.kwai.performance.stability.crash.monitor.anr.config.AnrMonitorConfig;
import android.os.SystemClock;
import vg7.a;
import java.util.Map;
import com.kwai.performance.stability.crash.monitor.anr.e$a;
import java.lang.Integer;
import java.util.HashMap;
import java.lang.Object;
import yf7.i;
import vg7.d;
import java.lang.String;
import com.google.gson.Gson;
import java.lang.Thread;

public class e	// class@0011c9
{
    public static e$b a;
    public static e$a b;
    public static Message c;
    public static long d;

    public static void a(Message p0,AnrMonitorConfig p1){
       e$a uoa;
       if (p0 == null) {
          return;
       }
       if (e.c == p0 && (SystemClock.elapsedRealtime() - e.d) - 5000 < 0) {
          return;
       }
       if (!a.f(p0, p1)) {
          return;
       }
       if (p1.reportRemoveSyncBarrier & 0x04) {
          int i = -1;
          Map map = a.a(p0, i);
          String str = "barrier.checkCount";
          e$a b = e.b;
          if (b != null) {
             uoa = b.e;
          }
          map.put(str, Integer.valueOf(i));
          i.a.c("anr_sync_barrier_check", d.j.q(map), false);
       }
       if (e.b == null) {
          uoa = new e$a(p1);
          e.b = uoa;
          uoa.start();
       }
       e$a b1 = e.b;
       b1.f = p0;
       b1.g = e.a;
       b1.d = p0.arg1;
       _monitor_enter(b1);
       try{
          b1.notifyAll();
          _monitor_exit(b1);
          e.c = p0;
          e.d = SystemClock.elapsedRealtime();
          return;
       }catch(java.lang.IllegalMonitorStateException e0){
       }
    }
}
