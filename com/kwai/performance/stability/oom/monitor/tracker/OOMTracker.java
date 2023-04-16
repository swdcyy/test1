package com.kwai.performance.stability.oom.monitor.tracker.OOMTracker;
import com.kwai.performance.monitor.base.Monitor;
import java.lang.String;

public abstract class OOMTracker extends Monitor	// class@001272
{

    public void OOMTracker(){
       super();
    }
    public abstract String reason();
    public abstract void reset();
    public abstract boolean track();
}
