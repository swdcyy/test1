package com.kwai.performance.stability.oom.monitor.tracker.ClearMemoryTracker;
import com.kwai.performance.stability.oom.monitor.tracker.OOMTracker;
import com.kwai.performance.stability.oom.monitor.tracker.ClearMemoryTracker$a;
import nsd.u;
import java.lang.String;
import mh7.a;
import mh7.a$b;
import java.lang.Object;
import com.kwai.performance.monitor.base.Monitor;
import com.kwai.performance.stability.oom.monitor.OOMMonitorConfig;
import ch7.i;
import java.util.Objects;
import ch7.g;
import java.lang.System;
import java.lang.Long;
import jh7.c;

public final class ClearMemoryTracker extends OOMTracker	// class@001265
{
    public int mOverThresholdCount;
    public static final ClearMemoryTracker$a Companion;

    static {
       ClearMemoryTracker.Companion = new ClearMemoryTracker$a(null);
    }
    public void ClearMemoryTracker(){
       super();
    }
    public String reason(){
       return "reason_heap_oom";
    }
    public void reset(){
       this.mOverThresholdCount = 0;
    }
    public boolean track(){
       float f = a.n.c();
       if (f - (this.getMonitorConfig().c * 0x3f733333) > 0) {
          int i = this.mOverThresholdCount + 1;
          this.mOverThresholdCount = i;
          if (i > this.getMonitorConfig().h) {
             i oi = i.d();
             Objects.requireNonNull(oi);
             oi.b(new g(oi, Long.valueOf(System.currentTimeMillis()), f));
          }
       }else {
          this.reset();
       }
       return false;
    }
}
