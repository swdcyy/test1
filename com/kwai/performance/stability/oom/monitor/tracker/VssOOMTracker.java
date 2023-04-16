package com.kwai.performance.stability.oom.monitor.tracker.VssOOMTracker;
import com.kwai.performance.stability.oom.monitor.tracker.OOMTracker;
import com.kwai.performance.stability.oom.monitor.tracker.VssOOMTracker$a;
import nsd.u;
import kotlin.text.Regex;
import java.lang.String;
import mh7.a;
import mh7.a$d;
import com.kwai.performance.stability.hprof.dump.NativeHandler;
import yf7.h;
import java.lang.Object;
import com.kwai.performance.monitor.base.Monitor;
import com.kwai.performance.stability.oom.monitor.OOMMonitorConfig;
import java.lang.StringBuilder;
import nh7.a$b;

public final class VssOOMTracker extends OOMTracker	// class@001278
{
    public int mLastVssSize;
    public int mOverThresholdCount;
    public static final VssOOMTracker$a Companion;
    public static final Regex VSS_REGEX;

    static {
       VssOOMTracker.Companion = new VssOOMTracker$a(null);
       VssOOMTracker.VSS_REGEX = new Regex("VmSize:\\s*\(\\d+\)\\s*kB");
    }
    public void VssOOMTracker(){
       super();
    }
    public final int getVssSize(){
       return a.i.c();
    }
    public String reason(){
       return "reason_vss_oom";
    }
    public void reset(){
       this.mLastVssSize = 0;
       this.mOverThresholdCount = 0;
    }
    public boolean track(){
       boolean b = false;
       if (!NativeHandler.load()) {
          h.b("JeMallocHackTracker", "load so error");
          return b;
       }else if(NativeHandler.isARM64()){
          return b;
       }else {
          int vssSize = this.getVssSize();
          if (vssSize > this.getMonitorConfig().d && vssSize >= (this.mLastVssSize - 0xc800)) {
             this.mOverThresholdCount = this.mOverThresholdCount + 1;
             h.d("VssOOMTracker", "[meet condition] "+"overThresholdCount: "+this.mOverThresholdCount+", vss: "+a$b.a.e(vssSize)+"mb");
          }
          this.mLastVssSize = vssSize;
          if (this.mOverThresholdCount >= this.getMonitorConfig().h) {
             b = true;
          }
          return b;
       }
    }
}
