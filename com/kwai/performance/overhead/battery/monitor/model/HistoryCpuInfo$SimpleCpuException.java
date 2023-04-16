package com.kwai.performance.overhead.battery.monitor.model.HistoryCpuInfo$SimpleCpuException;
import com.kwai.performance.overhead.battery.monitor.model.CpuException;
import java.lang.Object;
import com.kwai.performance.overhead.battery.monitor.model.HistoryCpuInfo$CpuUsageInfo;
import com.kwai.performance.overhead.battery.monitor.model.BaseException;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.Locale;
import java.lang.Float;

public class HistoryCpuInfo$SimpleCpuException	// class@001140
{
    public HistoryCpuInfo$CpuUsageInfo cpuUsage;
    public String uuid;

    public void HistoryCpuInfo$SimpleCpuException(CpuException p0){
       super();
       this.cpuUsage = new HistoryCpuInfo$CpuUsageInfo(p0);
       this.uuid = p0.mLogUUID;
    }
    public String toString(){
       Object[] objArray = new Object[]{Float.valueOf(this.cpuUsage.appUsage)};
       return this.uuid+"\("+String.format(Locale.ENGLISH, "%.2f%%", objArray)+"\)";
    }
}
