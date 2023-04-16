package com.kwai.performance.overhead.battery.monitor.ThreadCpuUsageMonitor;
import java.lang.Object;
import com.kwai.performance.overhead.battery.monitor.BatteryMonitorConfig;
import java.lang.String;
import yf7.h;
import com.kwai.performance.overhead.battery.monitor.ThreadInfoSampler;
import com.kwai.performance.overhead.battery.monitor.ThreadCpuInfoConfig;
import com.kwai.performance.overhead.battery.monitor.ThreadCpuUsageMonitor$ReportThreadCuInfo;
import ag7.k;
import java.util.List;
import java.util.Iterator;
import java.lang.CharSequence;
import java.lang.StringBuilder;

public class ThreadCpuUsageMonitor	// class@001131
{
    public BatteryMonitorConfig a;
    public ThreadCpuInfoConfig b;
    public ThreadInfoSampler c;
    public String d;
    public String e;
    public long f;
    public long g;
    public long h;
    public long i;
    public float j;
    public float k;
    public static final ThreadCpuUsageMonitor l;

    static {
       ThreadCpuUsageMonitor.l = new ThreadCpuUsageMonitor();
    }
    public void ThreadCpuUsageMonitor(){
       super();
    }
    public static ThreadCpuUsageMonitor a(){
       return ThreadCpuUsageMonitor.l;
    }
    public void b(BatteryMonitorConfig p0){
       h.d("BatteryMonitor.Thread", "ThreadCpuUsageMonitor.init\(\)");
       this.a = p0;
       this.b = p0.threadCpuInfoConfig;
       ThreadInfoSampler threadInfoSa = new ThreadInfoSampler(p0);
       this.c = threadInfoSa;
       threadInfoSa.init(this.b.withExitThread);
    }
    public final ThreadCpuUsageMonitor$ReportThreadCuInfo c(ThreadCpuUsageMonitor$ReportThreadCuInfo p0){
       String str;
       ThreadCpuInfoConfig nameMapRule = this.b.nameMapRule;
       ThreadCpuUsageMonitor$ReportThreadCuInfo javaName = p0.javaName;
       ThreadCpuUsageMonitor$ReportThreadCuInfo linuxName = p0.linuxName;
       if (("Unknown").equals(javaName)) {
          javaName = linuxName;
       }
       if (nameMapRule != null && !nameMapRule.isEmpty()) {
          Iterator iterator = nameMapRule.iterator();
          while (true) {
             if (iterator.hasNext()) {
                str = iterator.next();
                if (javaName.contains(str)) {
                label_0033 :
                   if (str == null) {
                      char[] uocharArray = javaName.toCharArray();
                      char[] uocharArray1 = new char[uocharArray.length];
                      int len = uocharArray.length;
                      int i = 0;
                      int i1 = 0;
                      int i2 = 0;
                      while (i < len) {
                         char c = uocharArray[i];
                         if (c == '-' && (i2 != c && (c < '0' || c > '9'))) {
                            i2 = i1 + 1;
                            uocharArray1[i1] = c;
                            i1 = i2;
                            i2 = c;
                         }
                         i = i + 1;
                      }
                      str = new String(uocharArray1, 0, i1);
                   }
                   if (str.endsWith("-")) {
                      str = str+"*";
                      break ;
                   }
                   break ;
                }
             }
          }
          p0.mapName = str;
          return p0;
       }
       str = null;
       goto label_0033 ;
    }
}
