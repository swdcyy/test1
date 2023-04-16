package com.kwai.performance.overhead.battery.monitor.model.HistoryCpuInfo$CpuUsageInfo;
import com.kwai.performance.overhead.battery.monitor.BatteryInfo;
import java.lang.Object;
import java.lang.Long;
import com.kwai.performance.overhead.battery.monitor.model.CpuException;

public class HistoryCpuInfo$CpuUsageInfo	// class@00113f
{
    public float appUsage;
    public long duration;
    public float sysUsage;
    public long time;

    public void HistoryCpuInfo$CpuUsageInfo(BatteryInfo p0){
       super();
       BatteryInfo b = p0.B;
       long l = -1;
       long l1 = (b != null)? b.longValue(): l;
       this.time = l1;
       b = p0.D;
       if (b != null) {
          l = b.longValue();
       }
       this.duration = l;
       this.appUsage = p0.i;
       this.sysUsage = p0.k;
       return;
    }
    public void HistoryCpuInfo$CpuUsageInfo(CpuException p0){
       super();
       this.time = p0.startSamplingTime;
       this.duration = p0.samplingDuration;
       this.appUsage = p0.cpuUsageAvg;
       this.sysUsage = p0.sysCpuUsageAvg;
    }
}
