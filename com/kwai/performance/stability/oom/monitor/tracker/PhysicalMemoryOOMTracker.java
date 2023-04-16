package com.kwai.performance.stability.oom.monitor.tracker.PhysicalMemoryOOMTracker;
import com.kwai.performance.stability.oom.monitor.tracker.OOMTracker;
import com.kwai.performance.stability.oom.monitor.tracker.PhysicalMemoryOOMTracker$a;
import nsd.u;
import java.lang.String;
import yf7.h;
import mh7.a;
import mh7.a$c;
import java.lang.Object;
import com.kwai.performance.monitor.base.Monitor;
import com.kwai.performance.stability.oom.monitor.OOMMonitorConfig;
import java.lang.StringBuilder;

public final class PhysicalMemoryOOMTracker extends OOMTracker	// class@001274
{
    public static final PhysicalMemoryOOMTracker$a Companion;

    static {
       PhysicalMemoryOOMTracker.Companion = new PhysicalMemoryOOMTracker$a(null);
    }
    public void PhysicalMemoryOOMTracker(){
       super();
    }
    public String reason(){
       return "reason_lmk_oom";
    }
    public void reset(){
    }
    public boolean track(){
       String str = "PhysicalMemoryTracker";
       h.d(str, "track");
       a$c l = a.l;
       if (l.b() - this.getMonitorConfig().g < 0) {
          h.b(str, "oom meminfo.rate < "+(this.getMonitorConfig().g * (float)100)+'%');
       }else if(l.b() - 0x3dcccccd < 0){
          h.d(str, "oom meminfo.rate < 10.0%");
       }else if(l.b() - 0x3e19999a < 0){
          h.d(str, "oom meminfo.rate < 15.0%");
       }else if(l.b() - 0x3e4ccccd < 0){
          h.d(str, "oom meminfo.rate < 20.0%");
       }else if(l.b() - 0x3e99999a < 0){
          h.d(str, "oom meminfo.rate < 30.0%");
       }
       return false;
    }
}
