package com.kwai.performance.overhead.battery.monitor.ThreadCpuUsageMonitor$ReportThreadCuInfo;
import bg7.a;
import java.lang.Object;
import com.kwai.performance.overhead.battery.monitor.BatteryInfo;
import com.kwai.performance.overhead.battery.monitor.BatteryInfo$Companion;
import ag7.j;
import java.lang.String;
import java.lang.Thread;

public class ThreadCpuUsageMonitor$ReportThreadCuInfo	// class@001130
{
    public boolean alive;
    public float costPercent;
    public int cpuExchange;
    public long cpuTime;
    public float cpuUsage;
    public String javaName;
    public String linuxName;
    public String mapName;
    public long stm;
    public int tid;
    public long utm;

    public void ThreadCpuUsageMonitor$ReportThreadCuInfo(a p0,float p1,long p2,boolean p3){
       super();
       long l = (long)BatteryInfo.T.i();
       this.tid = p0.a;
       this.alive = p3;
       a f = p0.f;
       String str = "Unknown";
       j b = (f != null)? f.b: str;
       this.linuxName = b;
       f = p0.b;
       if (f != null) {
          str = f.getName();
       }
       this.javaName = str;
       this.stm = p0.h * l;
       this.utm = p0.i * l;
       long l1 = p0.g * l;
       this.cpuTime = l1;
       this.cpuExchange = p0.m;
       float f1 = (p2)? ((float)l1 * 0x3f800000) / (float)p2: 0xbf800000;
       this.costPercent = f1;
       this.cpuUsage = p1 * f1;
       return;
    }
}
