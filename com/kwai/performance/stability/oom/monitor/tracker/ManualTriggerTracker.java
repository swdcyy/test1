package com.kwai.performance.stability.oom.monitor.tracker.ManualTriggerTracker;
import com.kwai.performance.stability.oom.monitor.tracker.OOMTracker;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Object;
import com.kwai.performance.monitor.base.Monitor;
import com.kwai.performance.stability.oom.monitor.OOMMonitorConfig;
import yf7.h;
import kh7.f;

public final class ManualTriggerTracker extends OOMTracker	// class@001271
{

    public void ManualTriggerTracker(){
       super();
    }
    public String reason(){
       return "Manual";
    }
    public void reset(){
    }
    public boolean track(){
       h.d("ManualTriggerTracker", "trigger: "+this.getMonitorConfig().x);
       OOMMonitorConfig x = this.getMonitorConfig().x;
       boolean b = (x != null)? x.a(): false;
       return b;
    }
}
