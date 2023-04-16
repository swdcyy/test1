package com.kwai.performance.stability.oom.monitor.analysis.LeakModel;
import java.lang.Object;
import java.util.ArrayList;

public final class LeakModel	// class@001263
{
    public final List leakClasses;
    public final List leakObjects;
    public final List leakTraceChains;
    public LeakModel$MetaData metaData;

    public void LeakModel(){
       super();
       this.leakTraceChains = new ArrayList();
       this.leakClasses = new ArrayList();
       this.leakObjects = new ArrayList();
    }
}
