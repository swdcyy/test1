package com.kwai.performance.stability.oom.monitor.tracker.FastHugeMemoryOOMTracker;
import com.kwai.performance.stability.oom.monitor.tracker.OOMTracker;
import com.kwai.performance.stability.oom.monitor.tracker.FastHugeMemoryOOMTracker$a;
import nsd.u;
import java.lang.String;
import java.lang.StringBuilder;
import mh7.a;
import mh7.a$b;
import java.lang.Object;
import com.kwai.performance.monitor.base.Monitor;
import com.kwai.performance.stability.oom.monitor.OOMMonitorConfig;
import yf7.h;
import nh7.a$b;
import java.util.Objects;

public final class FastHugeMemoryOOMTracker extends OOMTracker	// class@001267
{
    public String mDumpReason;
    public static final FastHugeMemoryOOMTracker$a Companion;

    static {
       FastHugeMemoryOOMTracker.Companion = new FastHugeMemoryOOMTracker$a(null);
    }
    public void FastHugeMemoryOOMTracker(){
       super();
       this.mDumpReason = "";
    }
    public String reason(){
       return "reason_fast_huge_"+this.mDumpReason;
    }
    public void reset(){
    }
    public boolean track(){
       a$b n = a.n;
       if (n.c() - this.getMonitorConfig().m > 0) {
          this.mDumpReason = "high_watermark";
          h.d("FastHugeMemoryTracker", "[meet condition] fast huge memory allocated detected, high memory watermark, force dump analysis!");
          return true;
       }else {
          a$b o = a.o;
          if (o.b()) {
             Objects.requireNonNull(a$b.a);
             if ((float)(n.e() - o.e()) - ((float)this.getMonitorConfig().n * 1024.00f) > 0) {
                this.mDumpReason = "delta";
                h.d("FastHugeMemoryTracker", "[meet condition] fast huge memory allocated detected, over the delta threshold!");
                return true;
             }
          }
          return false;
       }
    }
}
