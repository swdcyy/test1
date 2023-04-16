package com.kwai.performance.overhead.traffic.monitor.TrafficMonitor$mDefaultSampleTimeMs$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.util.concurrent.TimeUnit;
import java.lang.Object;
import java.lang.Long;

public final class TrafficMonitor$mDefaultSampleTimeMs$2 extends Lambda implements a	// class@00117a
{
    public static final TrafficMonitor$mDefaultSampleTimeMs$2 INSTANCE;

    static {
       TrafficMonitor$mDefaultSampleTimeMs$2.INSTANCE = new TrafficMonitor$mDefaultSampleTimeMs$2();
    }
    public void TrafficMonitor$mDefaultSampleTimeMs$2(){
       super(0);
    }
    public final long invoke(){
       return TimeUnit.MINUTES.toMillis(5);
    }
    public Object invoke(){
       return Long.valueOf(this.invoke());
    }
}
