package com.kwai.performance.stability.oom.monitor.OOMMonitor$startLoop$2$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import qrd.l1;
import com.kwai.performance.stability.oom.monitor.OOMMonitor;

public final class OOMMonitor$startLoop$2$1 extends Lambda implements a	// class@00124b
{
    public static final OOMMonitor$startLoop$2$1 INSTANCE;

    static {
       OOMMonitor$startLoop$2$1.INSTANCE = new OOMMonitor$startLoop$2$1();
    }
    public void OOMMonitor$startLoop$2$1(){
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       OOMMonitor.INSTANCE.analysisLatestHprofFile();
    }
}
