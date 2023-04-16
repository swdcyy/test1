package com.kwai.performance.overhead.traffic.monitor.TrafficMonitor$mMinLogThreshold$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.util.concurrent.TimeUnit;
import java.lang.Object;
import java.lang.Long;

public final class TrafficMonitor$mMinLogThreshold$2 extends Lambda implements a	// class@00117b
{
    public static final TrafficMonitor$mMinLogThreshold$2 INSTANCE;

    static {
       TrafficMonitor$mMinLogThreshold$2.INSTANCE = new TrafficMonitor$mMinLogThreshold$2();
    }
    public void TrafficMonitor$mMinLogThreshold$2(){
       super(0);
    }
    public final long invoke(){
       return TimeUnit.SECONDS.toMillis(30);
    }
    public Object invoke(){
       return Long.valueOf(this.invoke());
    }
}
