package com.kwai.framework.debuglog.realtime.RealTimeLogConfig;
import java.io.Serializable;
import java.lang.Object;

public class RealTimeLogConfig implements Serializable	// class@001518
{
    public boolean enableObiwanRealLog;
    public boolean launchEnable;
    public boolean screenshotEnable;
    public long screenshotInterval;
    public boolean timeIntervalEnable;
    public long timeIntervalValue;

    public void RealTimeLogConfig(){
       super();
       this.enableObiwanRealLog = false;
       this.screenshotEnable = false;
       this.timeIntervalEnable = false;
       this.launchEnable = false;
       this.timeIntervalValue = -1;
       this.screenshotInterval = -1;
    }
}
