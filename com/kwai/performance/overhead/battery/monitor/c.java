package com.kwai.performance.overhead.battery.monitor.c;
import java.util.Comparator;
import java.lang.Object;
import com.kwai.performance.overhead.battery.monitor.ThreadCpuUsageMonitor$ReportThreadCuInfo;

public final class c implements Comparator	// class@001139
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return (int)(p1.cpuTime - p0.cpuTime);
    }
}
