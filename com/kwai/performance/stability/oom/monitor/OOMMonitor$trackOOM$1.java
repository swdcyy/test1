package com.kwai.performance.stability.oom.monitor.OOMMonitor$trackOOM$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import qrd.l1;
import java.lang.StringBuilder;
import java.lang.String;
import com.kwai.performance.stability.oom.monitor.OOMMonitor;
import java.util.List;
import yf7.h;

public final class OOMMonitor$trackOOM$1 extends Lambda implements a	// class@00124d
{
    public static final OOMMonitor$trackOOM$1 INSTANCE;

    static {
       OOMMonitor$trackOOM$1.INSTANCE = new OOMMonitor$trackOOM$1();
    }
    public void OOMMonitor$trackOOM$1(){
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       OOMMonitor iNSTANCE = OOMMonitor.INSTANCE;
       h.d("OOMMonitor", "mTrackReasons:"+OOMMonitor.access$getMTrackReasons$p(iNSTANCE));
       iNSTANCE.dumpAndAnalysis();
    }
}
