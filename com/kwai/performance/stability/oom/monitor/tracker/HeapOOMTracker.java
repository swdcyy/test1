package com.kwai.performance.stability.oom.monitor.tracker.HeapOOMTracker;
import com.kwai.performance.stability.oom.monitor.tracker.OOMTracker;
import com.kwai.performance.stability.oom.monitor.tracker.HeapOOMTracker$a;
import nsd.u;
import java.lang.String;
import mh7.a;
import mh7.a$b;
import java.lang.Object;
import com.kwai.performance.monitor.base.Monitor;
import com.kwai.performance.stability.oom.monitor.OOMMonitorConfig;
import java.lang.StringBuilder;
import nh7.a$a;
import yf7.h;

public final class HeapOOMTracker extends OOMTracker	// class@00126b
{
    public float mLastHeapRatio;
    public int mOverThresholdCount;
    public static final HeapOOMTracker$a Companion;

    static {
       HeapOOMTracker.Companion = new HeapOOMTracker$a(null);
    }
    public void HeapOOMTracker(){
       super();
    }
    public String reason(){
       return "reason_heap_oom";
    }
    public void reset(){
       this.mLastHeapRatio = 0;
       this.mOverThresholdCount = 0;
    }
    public boolean track(){
       a$a a;
       float f = a.n.c();
       int i = 1;
       if (f - this.getMonitorConfig().c > 0 && f - (this.mLastHeapRatio - 0.05f) >= 0) {
          this.mOverThresholdCount = this.mOverThresholdCount + i;
          a = a$a.a;
          h.d("HeapOOMTracker", "[meet condition] "+"overThresholdCount: "+this.mOverThresholdCount+", heapRatio: "+f+", usedMem: "+a.f(a.n.e())+"mb"+", max: "+a.f(a.n.b())+"mb");
       }else {
          this.reset();
       }
       this.mLastHeapRatio = f;
       if (this.mOverThresholdCount < this.getMonitorConfig().h) {
          i = false;
       }
       return i;
    }
}
