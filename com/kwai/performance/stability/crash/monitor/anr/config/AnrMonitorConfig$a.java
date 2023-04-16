package com.kwai.performance.stability.crash.monitor.anr.config.AnrMonitorConfig$a;
import yf7.f$a;
import java.lang.Object;
import com.kwai.performance.stability.crash.monitor.anr.config.AnrMonitorConfig;
import yf7.f;

public class AnrMonitorConfig$a implements f$a	// class@0011b8
{
    public AnrMonitorConfig a;

    public void AnrMonitorConfig$a(){
       super();
       this.a = new AnrMonitorConfig();
    }
    public AnrMonitorConfig a(){
       AnrMonitorConfig$a ta = this.a;
       ta.disable = true;
       ta.enableAllThreshold = 0.00f;
       return ta;
    }
    public f build(){
       return this.a;
    }
}
