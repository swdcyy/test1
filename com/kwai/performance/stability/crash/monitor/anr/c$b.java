package com.kwai.performance.stability.crash.monitor.anr.c$b;
import android.view.KeyEvent;
import java.lang.Object;
import com.kwai.performance.stability.crash.monitor.anr.config.AnrMonitorConfig;
import com.kwai.performance.stability.crash.monitor.anr.b;
import com.kwai.performance.stability.crash.monitor.anr.c;
import android.os.SystemClock;
import java.util.HashMap;
import java.lang.Integer;
import java.lang.Long;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.System;
import com.kwai.performance.stability.crash.monitor.anr.LogRecordQueue;
import com.kwai.performance.stability.crash.monitor.util.e;

public class c$b	// class@000e00
{
    public static MotionEvent a;
    public static long b;
    public static long c;
    public static KeyEvent d;
    public static long e;
    public static long f;
    public static AnrMonitorConfig g;
    public static HashMap h;

    public static void a(KeyEvent p0,Object p1){
       AnrMonitorConfig g = c$b.g;
       if (g == null) {
          return;
       }
       if (g.inputEventCostMinWall < null) {
          return;
       }
       c uoc = b.c().h();
       if (uoc == null) {
          return;
       }
       if (c$b.d == p0) {
          long l = SystemClock.elapsedRealtime() - c$b.e;
          long l1 = SystemClock.currentThreadTimeMillis() - c$b.f;
          if (c$b.g.withEventCost != null) {
             c$b.h.put("LastInputType", "Key");
             c$b.h.put("LastEventType", Integer.valueOf(p0.getAction()));
             c$b.h.put("LastEventData", Integer.valueOf(p0.getKeyCode()));
             c$b.h.put("LastEventCostWall", Long.valueOf(l));
             c$b.h.put("LastEventCostCpu", Long.valueOf(l1));
          }
          if (l - (long)c$b.g.inputEventCostMinWall > 0) {
             uoc.h.g("Time:"+System.currentTimeMillis()+", Wall:"+l+", Cpu:"+l1+", Now:"+System.currentTimeMillis()+", Event:"+p0+", Context:"+p1);
          }
       }
       return;
    }
    public static void b(AnrMonitorConfig p0){
       c$b.g = p0;
       c$b.h = e.p();
    }
}
