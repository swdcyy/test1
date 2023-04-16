package com.kwai.performance.stability.oom.monitor.analysis.LeakModel$LeakTraceChain;
import java.lang.Object;
import java.util.ArrayList;

public final class LeakModel$LeakTraceChain	// class@001261
{
    public String detailDescription;
    public String gcRoot;
    public String labels;
    public String leakObjectHash;
    public String leakObjectId;
    public String leakReason;
    public long leakTime;
    public String leakType;
    public int sameLeakSize;
    public String shortDescription;
    public String signature;
    public List tracePath;

    public void LeakModel$LeakTraceChain(){
       super();
       this.tracePath = new ArrayList();
    }
}
