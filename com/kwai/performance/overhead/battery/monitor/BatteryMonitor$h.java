package com.kwai.performance.overhead.battery.monitor.BatteryMonitor$h;
import java.lang.Runnable;
import java.lang.String;
import java.util.Map;
import java.lang.Object;
import java.util.HashMap;
import com.kwai.performance.overhead.battery.monitor.BatteryMonitor;
import com.kwai.performance.monitor.base.Monitor;
import com.kwai.performance.overhead.battery.monitor.BatteryMonitorConfig;
import msd.l;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.StringBuilder;
import yf7.h;
import com.kwai.performance.overhead.battery.monitor.BatteryInfo;
import kotlin.jvm.internal.a;
import java.lang.Long;
import com.kwai.performance.overhead.battery.monitor.BatteryInfo$c;
import ag7.b;
import com.kwai.performance.overhead.battery.monitor.BatteryInfo$b;
import com.kwai.performance.overhead.battery.monitor.BatteryInfo$d;
import com.kwai.performance.overhead.battery.monitor.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.performance.overhead.battery.monitor.model.HistoryCpuInfo;
import com.kwai.performance.overhead.battery.monitor.ThreadCpuUsageMonitor;
import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.kwai.performance.overhead.battery.monitor.ThreadInfoSampler;
import bg7.a;
import com.kwai.performance.overhead.battery.monitor.ThreadCpuUsageMonitor$ReportThreadCuInfo;
import com.kwai.performance.overhead.battery.monitor.c;
import java.util.Comparator;
import java.util.Collections;
import com.kwai.performance.overhead.battery.monitor.ThreadCpuInfoConfig;
import java.lang.System;
import android.os.SystemClock;
import java.lang.Float;
import java.lang.Integer;
import ag7.d;
import com.google.gson.Gson;
import java.lang.OutOfMemoryError;
import yf7.i;

public final class BatteryMonitor$h implements Runnable	// class@001124
{
    public final String b;
    public final Map c;
    public final boolean d;
    public final long e;
    public final long f;
    public final boolean g;

    public void BatteryMonitor$h(String p0,Map p1,boolean p2,long p3,long p4,boolean p5){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       super();
    }
    public final void run(){
       Iterator iterator;
       Map$Entry uEntry;
       String key;
       BatteryMonitor iNSTANCE;
       BatteryInfo b1;
       BatteryMonitor$h e;
       BatteryInfo uBatteryInfo1;
       BatteryMonitor$h e1;
       Object obj;
       ThreadCpuUsageMonitor$ReportThreadCuInfo reportThread;
       List list;
       ThreadCpuUsageMonitor h;
       String str3;
       BatteryMonitor$h oh = this;
       HashMap hashMap = new HashMap();
       BatteryMonitorConfig customParams = BatteryMonitor.INSTANCE.getMonitorConfig().customParamsInvoker;
       BatteryInfo$d uod = null;
       Map map = (customParams != null)? customParams.invoke(oh.b): uod;
       if (map != null) {
          iterator = map.entrySet().iterator();
          while (iterator.hasNext()) {
             uEntry = iterator.next();
             key = uEntry.getKey();
             hashMap.put(key, uEntry.getValue());
          }
       }
       BatteryMonitor$h c = oh.c;
       if (c != null) {
          iterator = c.entrySet().iterator();
          while (iterator.hasNext()) {
             uEntry = iterator.next();
             key = uEntry.getKey();
             hashMap.put(key, uEntry.getValue());
          }
       }
       boolean b = true;
       if (oh.d != null) {
          iNSTANCE = BatteryMonitor.INSTANCE;
          String str = "section: ";
          String str1 = "BatteryMonitor";
          if (!BatteryMonitor.access$getMManualSectionMap$p(iNSTANCE).containsKey(oh.b)) {
             h.g(str1, str+oh.b+" not call startSection");
             return;
          }else {
             BatteryInfo uBatteryInfo = BatteryMonitor.access$getMManualSectionMap$p(iNSTANCE).remove(oh.b);
             if (uBatteryInfo == null) {
                h.g(str1, str+oh.b+" lost sampling data");
                return;
             }else {
                b1 = uBatteryInfo.B;
                if (b1 != null) {
                   e = oh.e;
                   if (b1 == null) {
                      a.L();
                   }
                   uBatteryInfo.D = Long.valueOf((e - b1.longValue()));
                }
                b1 = uBatteryInfo.C;
                if (b1 != null) {
                   e = oh.f;
                   if (b1 == null) {
                      a.L();
                   }
                   uBatteryInfo.E = Long.valueOf((e - b1.longValue()));
                }
                if (oh.g != null) {
                   BatteryInfo$c uoc = b.e();
                   BatteryInfo$b uob = b.d(b, BatteryMonitor.access$getMPreCpuData$p(iNSTANCE));
                   if (iNSTANCE.getMonitorConfig().enableCollectSysCpu != null) {
                      uod = b.f();
                   }
                   b.a(uob, uBatteryInfo.x, uoc);
                   a.e(uBatteryInfo, uob, uoc, uod);
                }
                iNSTANCE.uploadBatteryData(uBatteryInfo, hashMap);
             }
          }
       }else {
          iNSTANCE = BatteryMonitor.INSTANCE;
          if (TextUtils.isEmpty(BatteryMonitor.access$getMBatteryInfo$p(iNSTANCE).b)) {
             BatteryMonitor.access$getMBatteryInfo$p(iNSTANCE).b = oh.b;
             BatteryMonitor.access$getMBatteryInfo$p(iNSTANCE).d = b;
          }
          if (BatteryMonitor.access$getMBatteryInfo$p(iNSTANCE).B != null) {
             uBatteryInfo1 = BatteryMonitor.access$getMBatteryInfo$p(iNSTANCE);
             e1 = oh.e;
             b1 = BatteryMonitor.access$getMBatteryInfo$p(iNSTANCE).B;
             if (b1 == null) {
                a.L();
             }
             uBatteryInfo1.D = Long.valueOf((e1 - b1.longValue()));
          }
          if (BatteryMonitor.access$getMBatteryInfo$p(iNSTANCE).C != null) {
             uBatteryInfo1 = BatteryMonitor.access$getMBatteryInfo$p(iNSTANCE);
             e1 = oh.f;
             b1 = BatteryMonitor.access$getMBatteryInfo$p(iNSTANCE).C;
             if (b1 == null) {
                a.L();
             }
             uBatteryInfo1.E = Long.valueOf((e1 - b1.longValue()));
          }
          iNSTANCE.uploadBatteryData(BatteryMonitor.access$getMBatteryInfo$p(iNSTANCE), hashMap);
          if (iNSTANCE.getMonitorConfig().isHoldHistoryRecords()) {
             HistoryCpuInfo.get().update(BatteryMonitor.access$getMBatteryInfo$p(iNSTANCE));
          }
          if (iNSTANCE.getMonitorConfig().enableThreadCpuInfo != null) {
             ThreadCpuUsageMonitor threadCpuUsa = ThreadCpuUsageMonitor.a();
             BatteryInfo i = BatteryMonitor.access$getMBatteryInfo$p(iNSTANCE).i;
             BatteryInfo p = BatteryMonitor.access$getMBatteryInfo$p(iNSTANCE).p;
             Objects.requireNonNull(threadCpuUsa);
             ArrayList uArrayList = new ArrayList();
             List costedThread = threadCpuUsa.c.getCostedThreadInfoList();
             Iterator iterator1 = costedThread.iterator();
             BatteryInfo uBatteryInfo2 = null;
             while (iterator1.hasNext()) {
                obj = iterator1.next();
                Iterator iterator2 = iterator1;
                if (obj.g - uBatteryInfo2) {
                   reportThread = new ThreadCpuUsageMonitor$ReportThreadCuInfo(obj, i, p, true);
                   threadCpuUsa.c(iterator1);
                   uArrayList.add(iterator1);
                }
                iterator1 = iterator2;
             }
             List costedExitTh = threadCpuUsa.c.getCostedExitThreadInfoList();
             Iterator iterator3 = costedExitTh.iterator();
             while (iterator3.hasNext()) {
                obj = iterator3.next();
                list = costedExitTh;
                Iterator iterator4 = iterator3;
                if (obj.g - uBatteryInfo2) {
                   reportThread = new ThreadCpuUsageMonitor$ReportThreadCuInfo(obj, i, p, false);
                   threadCpuUsa.c(costedExitTh);
                   uArrayList.add(costedExitTh);
                   costedExitTh = list;
                   iterator3 = iterator4;
                   uBatteryInfo2 = 0;
                }else {
                   costedExitTh = list;
                   iterator3 = iterator4;
                }
             }
             list = costedExitTh;
             Collections.sort(uArrayList, c.b);
             if (threadCpuUsa.b.reportLimit >= null) {
                ThreadCpuInfoConfig reportLimit = threadCpuUsa.b.reportLimit;
                if (uArrayList.size() > reportLimit) {
                   uArrayList = uArrayList.subList(0, reportLimit);
                }
             }
             if (uArrayList.size()) {
                HashMap hashMap1 = new HashMap();
                hashMap1.put("extra", hashMap);
                hashMap1.put("scene", threadCpuUsa.d);
                hashMap1.put("preScene", threadCpuUsa.e);
                hashMap1.put("costWall", Long.valueOf((System.currentTimeMillis() - threadCpuUsa.f)));
                hashMap1.put("costCpu", Long.valueOf((SystemClock.currentThreadTimeMillis() - threadCpuUsa.g)));
                hashMap1.put("processCpuTime", Long.valueOf(p));
                hashMap1.put("processCpuUsage", Float.valueOf(i));
                hashMap1.put("threadCount", Integer.valueOf(uArrayList.size()));
                hashMap1.put("aliveCount", Integer.valueOf(costedThread.size()));
                hashMap1.put("exitCount", Integer.valueOf(list.size()));
                h = threadCpuUsa.h;
                ThreadCpuUsageMonitor threadCpuUsa1 = 0xbf800000;
                float f = (h)? threadCpuUsa.j / (float)h: 0xbf800000;
                hashMap1.put("activePercentScene", Float.valueOf(f));
                h = threadCpuUsa.i;
                if (h) {
                   threadCpuUsa1 = threadCpuUsa.k / (float)h;
                }
                hashMap1.put("activePercentGlobal", Float.valueOf(threadCpuUsa1));
                hashMap1.put("topThread", uArrayList.get(0));
                String str2 = "threads";
                try{
                   hashMap1.put(str2, uArrayList);
                   str3 = d.a.q(hashMap1);
                }catch(java.lang.OutOfMemoryError e0){
                   hashMap1.put("extraMsg", e0.getMessage());
                   hashMap1.put(str2, uArrayList.subList(0, (uArrayList.size() / 2)));
                   str3 = d.a.q(hashMap1);
                }
                i.a.c("battery_monitor_thread", str3, 0);
             }else {
                long l = 0;
             }
             threadCpuUsa.c.reset();
             threadCpuUsa.h = 0;
             threadCpuUsa.j = 0;
          }
       }
       return;
    }
}
