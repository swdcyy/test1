package com.kwai.performance.overhead.battery.monitor.ThreadCpuInfoConfig;
import java.io.Serializable;
import java.util.List;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.performance.overhead.battery.monitor.BatteryMonitorConfig;
import java.util.Objects;

public final class ThreadCpuInfoConfig implements Serializable	// class@00112f
{
    public List nameMapRule;
    public int reportLimit;
    public int[] threadCpuEnableThreshold;
    public boolean withExitThread;

    public void ThreadCpuInfoConfig(){
       super(null, false, 0, null, 15, null);
    }
    public void ThreadCpuInfoConfig(int[] p0,boolean p1,int p2,List p3){
       a.q(p0, "threadCpuEnableThreshold");
       super();
       this.threadCpuEnableThreshold = p0;
       this.withExitThread = p1;
       this.reportLimit = p2;
       this.nameMapRule = p3;
    }
    public void ThreadCpuInfoConfig(int[] p0,boolean p1,int p2,List p3,int p4,u p5){
       if (p4 & 0x01) {
          Objects.requireNonNull(BatteryMonitorConfig.Companion);
          p0 = BatteryMonitorConfig.THREAD_CPU_ENABLE_THRESHOLD_DEFAULT;
       }
       if (p4 & 0x02) {
          p1 = true;
       }
       if (p4 & 0x04) {
          p2 = 700;
       }
       if (p4 & 0x08) {
          p3 = null;
       }
       super(p0, p1, p2, p3);
       return;
    }
}
