package com.kwai.performance.overhead.battery.monitor.model.HistoryCpuInfo;
import java.lang.Object;
import java.util.LinkedList;
import java.lang.String;
import com.kwai.performance.overhead.battery.monitor.model.HistoryCpuInfo$CpuUsageInfo;
import java.util.Locale;
import java.lang.Float;
import java.lang.StringBuilder;
import java.util.Arrays;
import java.lang.Integer;
import com.kwai.performance.overhead.battery.monitor.BatteryInfo;
import com.kwai.performance.overhead.battery.monitor.model.CpuException;
import com.kwai.performance.overhead.battery.monitor.model.HistoryCpuInfo$SimpleCpuException;

public class HistoryCpuInfo	// class@001141
{
    public LinkedList cpuExceptionList;
    public LinkedList cpuUsageList;
    public static final HistoryCpuInfo sInstance;

    static {
       HistoryCpuInfo.sInstance = new HistoryCpuInfo();
    }
    public void HistoryCpuInfo(){
       super();
       this.cpuUsageList = new LinkedList();
       this.cpuExceptionList = new LinkedList();
    }
    public static HistoryCpuInfo get(){
       return HistoryCpuInfo.sInstance;
    }
    public String toString(){
       String str2;
       HistoryCpuInfo historyCpuIn = this;
       int i = historyCpuIn.cpuUsageList.size();
       String[] stringArray = new String[i];
       String[] stringArray1 = new String[historyCpuIn.cpuUsageList.size()];
       Locale locale = null;
       int i1 = 0;
       int i2 = 0;
       float f = 0;
       int i3 = 0;
       float f1 = 0;
       int i4 = 1;
       while (i1 < i) {
          HistoryCpuInfo$CpuUsageInfo uCpuUsageInf = historyCpuIn.cpuUsageList.get(i1);
          HistoryCpuInfo$CpuUsageInfo appUsage = uCpuUsageInf.appUsage;
          if (appUsage - locale > 0) {
             Object[] objArray = new Object[i4];
             objArray[0] = Float.valueOf(appUsage);
             stringArray[i1] = String.format(Locale.ENGLISH, "%.2f%%", objArray);
             f = f + uCpuUsageInf.appUsage;
             i2 = i2 + 1;
          }else {
             stringArray[i1] = String.valueOf(-1);
          }
          HistoryCpuInfo$CpuUsageInfo sysUsage = uCpuUsageInf.sysUsage;
          if (sysUsage - null > 0) {
             Object[] objArray1 = new Object[i4];
             objArray1[0] = Float.valueOf(sysUsage);
             stringArray1[i1] = String.format(Locale.ENGLISH, "%.2f%%", objArray1);
             f1 = f1 + uCpuUsageInf.sysUsage;
             i3 = i3 + 1;
          }else {
             stringArray1[i1] = String.valueOf(-1);
          }
          i1 = i1 + 1;
          locale = null;
       }
       String str = "\(均值 = ";
       StringBuilder str1 = "历史 CPU 信息\(水位: "+historyCpuIn.cpuUsageList.size()+", 异常: "+historyCpuIn.cpuExceptionList.size()+"\)\n  App CPU 使用率列表: "+Arrays.toString(stringArray)+str;
       if (i2 > 0) {
          Object[] objArray2 = new Object[i4];
          objArray2[0] = Float.valueOf((f / (float)i2));
          str2 = String.format(Locale.ENGLISH, "%.2f%%", objArray2);
       }else {
          str2 = Integer.valueOf(-1);
       }
       str1 = str1+str2+"\)\n  系统 CPU 使用率列表: "+Arrays.toString(stringArray1)+str;
       if (i3 > 0) {
          Object[] objArray3 = new Object[i4];
          objArray3[0] = Float.valueOf((f1 / (float)i3));
          str = String.format(Locale.ENGLISH, "%.2f%%", objArray3);
       }else {
          Integer integer = Integer.valueOf(-1);
       }
       return str1+str+"\)\n  CPU 异常 UUID 列表: "+Arrays.toString(historyCpuIn.cpuExceptionList.toArray());
    }
    public void update(BatteryInfo p0){
       BatteryInfo a = p0.a;
       if (a != 3 && a != null) {
          while (this.cpuExceptionList.size() >= 50) {
             this.cpuExceptionList.poll();
          }
          this.cpuUsageList.offer(new HistoryCpuInfo$CpuUsageInfo(p0));
       }
       return;
    }
    public void update(CpuException p0){
       while (this.cpuExceptionList.size() >= 20) {
          this.cpuExceptionList.poll();
       }
       this.cpuExceptionList.offer(new HistoryCpuInfo$SimpleCpuException(p0));
       return;
    }
}
