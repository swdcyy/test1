package com.kwai.performance.overhead.battery.monitor.model.CpuException;
import com.kwai.performance.overhead.battery.monitor.model.BaseException;
import java.util.ArrayList;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.lang.Object;
import ag7.j;
import java.lang.Integer;
import bg7.a;
import com.kwai.performance.overhead.battery.monitor.model.CpuException$ThreadCostInfo;
import java.util.List;
import java.lang.Thread;
import java.lang.StackTraceElement;
import java.lang.String;
import java.lang.StringBuilder;
import yf7.h;
import com.kwai.performance.overhead.battery.monitor.model.StackTree;
import com.yxcorp.utility.AbiUtil;
import com.kwai.performance.overhead.battery.monitor.model.BaseException$a;
import android.util.Pair;
import com.kwai.performance.overhead.battery.monitor.BatteryInfo;
import com.kwai.performance.overhead.battery.monitor.BatteryInfo$Companion;
import com.kwai.performance.overhead.battery.monitor.model.a;
import java.util.Comparator;
import java.util.Collections;

public class CpuException extends BaseException	// class@00113e
{
    public int batteryInfoCode;
    public Object batteryInfoJson;
    public BatteryMonitorConfig config;
    public float cpuUsageAvg;
    public int detailCount;
    public List details;
    public long endSamplingTime;
    public int holderThreadCount;
    public boolean isWindowFull;
    public int pid;
    public long processCpuCost;
    public String processName;
    public int relatedThreadCount;
    public float samplingCostPercent;
    public int samplingCount;
    public long samplingCpuCost;
    public long samplingCpuCostPerTimes;
    public long samplingDuration;
    public long samplingPart1CpuCost;
    public long samplingPart2CpuCost;
    public long samplingPart3CpuCost;
    public long startSamplingTime;
    public float sysCpuUsageAvg;
    public long targetCost;
    public String targetName;
    public int targetTid;
    public float threadCostPercent;
    public long threadCpuCost;
    public float windowCpuUsageAvg;
    public float[] windows;

    public void CpuException(){
       super();
       this.details = new ArrayList();
    }
    public static void fill(CpuException p0,Set p1,Map p2,Map p3){
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          j oj = iterator.next();
          a uoa = p3.get(Integer.valueOf(oj.a));
          if (uoa == null) {
          }else {
             CpuException$ThreadCostInfo threadCostIn = new CpuException$ThreadCostInfo(oj);
             a b = uoa.b;
             if (b != null) {
                threadCostIn.initStack(b, p2.get(b));
             }
             b = uoa.c;
             if (b != null) {
                Iterator iterator1 = b.iterator();
                while (iterator1.hasNext()) {
                   Thread thread = iterator1.next();
                   threadCostIn.initRelateStack(thread, p2.get(thread));
                }
             }
             threadCostIn.checkRoot();
             p0.details.add(threadCostIn);
          }
       }
       p0.update(p3);
       iterator = p0.details.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          CpuException$ThreadCostInfo relateTree = iterator.next().relateTree;
          int i1 = (relateTree != null)? relateTree.size(): 0;
          i = i + i1;
       }
       p0.relatedThreadCount = i;
       p0.detailCount = p0.details.size();
       return;
    }
    public static String formatStackTrace(StackTraceElement[] p0){
       if (p0 == null || !p0.length) {
          return "";
       }
       StringBuilder str = "";
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          str = str+p0[i].toString()+"\n";
       }
       return str.substring(0, (str.length() - 1));
    }
    public void debugDump(){
       h.d("CpuException", "ThreadCount = "+this.details.size());
       Iterator iterator = this.details.iterator();
       while (iterator.hasNext()) {
          CpuException$ThreadCostInfo threadCostIn = iterator.next();
          h.a("CpuException", threadCostIn.name+"\("+threadCostIn.tid+"\) | sampleCount = "+threadCostIn.tree.count+", md5 = "+threadCostIn.tree.md5);
       }
       return;
    }
    public void fillBase(int p0,int p1){
       Iterator iterator = this.details.iterator();
       while (iterator.hasNext()) {
          CpuException$ThreadCostInfo threadCostIn = iterator.next();
          if (threadCostIn.tid == this.targetTid) {
             this.mCrashDetail = threadCostIn.tree.stackDetail;
          }
       }
       String str = (AbiUtil.b())? "ARM64": "ARM";
       this.mAbi = str;
       BaseException tmMemoryInfo = this.mMemoryInfo;
       tmMemoryInfo.a = p0;
       tmMemoryInfo.b = p1;
       return;
    }
    public void fillByBatteryInfo(Pair p0){
       Pair first = p0.first;
       p0 = p0.second;
       BatteryInfo b = first.b;
       String str = "Unknown";
       if (b == null) {
          b = str;
       }
       this.mCurrentActivity = b;
       if (p0 != null && p0.containsKey("app_log_page")) {
          str = String.valueOf(p0.get("app_log_page"));
       }
       this.mPage = str;
       this.sysCpuUsageAvg = first.k;
       return;
    }
    public void update(Map p0){
       long l = (long)BatteryInfo.T.i();
       Iterator iterator = this.details.iterator();
       while (iterator.hasNext()) {
          CpuException$ThreadCostInfo threadCostIn = iterator.next();
          if (!p0.containsKey(Integer.valueOf(threadCostIn.tid))) {
             continue ;
          }else {
             a uoa = p0.get(Integer.valueOf(threadCostIn.tid));
             if (uoa == null) {
                continue ;
             }else {
                threadCostIn.threadMatchCount = uoa.d;
                long l1 = uoa.g * l;
                threadCostIn.cpuTime = l1;
                l1 = uoa.h * l;
                threadCostIn.stm = l1;
                long l2 = uoa.i * l;
                threadCostIn.utm = l2;
                CpuException$ThreadCostInfo tree = threadCostIn.tree;
                if (tree != null && tree.samplingCount.intValue()) {
                   tree = threadCostIn.cpuTime;
                   if (tree - this.targetCost > 0) {
                      this.targetCost = tree;
                      this.targetTid = threadCostIn.tid;
                      this.targetName = threadCostIn.name;
                   }
                }
                l2 = this.threadCpuCost + threadCostIn.cpuTime;
                this.threadCpuCost = l2;
             }
          }
       }
       Collections.sort(this.details, a.b);
       CpuException tsamplingCpu = this.samplingCpuCost;
       this.samplingPart3CpuCost = (tsamplingCpu - this.samplingPart1CpuCost) - this.samplingPart2CpuCost;
       CpuException tprocessCpuC = this.processCpuCost;
       float f = 0;
       CpuException uCpuExceptio = 0x42c80000;
       long l3 = 0;
       float f1 = (!tprocessCpuC - l3)? 0: (((float)tsamplingCpu * 0x3f800000) / (float)tprocessCpuC) * uCpuExceptio;
       this.samplingCostPercent = f1;
       if (tprocessCpuC - l3) {
          f = (((float)this.threadCpuCost * 0x3f800000) / (float)tprocessCpuC) * uCpuExceptio;
       }
       this.threadCostPercent = f;
       this.samplingDuration = this.endSamplingTime - this.startSamplingTime;
       CpuException tsamplingCou = this.samplingCount;
       if (tsamplingCou != null) {
          l3 = tsamplingCpu / (long)tsamplingCou;
       }
       this.samplingCpuCostPerTimes = l3;
       return;
    }
}
