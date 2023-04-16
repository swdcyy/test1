package com.kwai.performance.stability.crash.monitor.anr.config.AnrMonitorConfigAdv$JvmtiControl;
import java.io.Serializable;
import java.lang.Object;

public class AnrMonitorConfigAdv$JvmtiControl implements Serializable	// class@0011ba
{
    public String backupJvmtiConfig;
    public int classLenThreshold;
    public int classLoadQueueLimit;
    public boolean enableOtherBizSupport;
    public boolean filterMainThread;
    public int gcQueueLimit;
    public int gcThreshold;
    public int perfDebugFlag;

    public void AnrMonitorConfigAdv$JvmtiControl(){
       super();
       this.gcThreshold = 1;
       this.classLenThreshold = 0x500000;
       this.enableOtherBizSupport = true;
       this.gcQueueLimit = 100;
       this.classLoadQueueLimit = 100;
       this.filterMainThread = true;
       this.perfDebugFlag = 3;
    }
}
