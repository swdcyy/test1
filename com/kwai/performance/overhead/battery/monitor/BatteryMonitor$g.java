package com.kwai.performance.overhead.battery.monitor.BatteryMonitor$g;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import com.kwai.performance.overhead.battery.monitor.BatteryInfo$c;
import ag7.b;
import com.kwai.performance.overhead.battery.monitor.BatteryMonitor;
import com.kwai.performance.overhead.battery.monitor.BatteryInfo$b;
import com.kwai.performance.monitor.base.Monitor;
import com.kwai.performance.overhead.battery.monitor.BatteryMonitorConfig;
import com.kwai.performance.overhead.battery.monitor.BatteryInfo$d;
import java.util.HashMap;
import java.util.Map;
import java.lang.StringBuilder;
import yf7.h;
import com.kwai.performance.overhead.battery.monitor.BatteryInfo;
import java.lang.Long;
import com.kwai.performance.overhead.battery.monitor.a;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import com.kwai.performance.overhead.battery.monitor.ThreadCpuUsageMonitor;
import java.lang.System;
import android.os.SystemClock;

public final class BatteryMonitor$g implements Runnable	// class@001123
{
    public final boolean b;
    public final boolean c;
    public final String d;
    public final long e;
    public final long f;

    public void BatteryMonitor$g(boolean p0,boolean p1,String p2,long p3,long p4){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       super();
    }
    public final void run(){
       BatteryInfo$b uob;
       BatteryInfo$c uoc = b.e();
       if (this.b == null) {
          BatteryMonitor iNSTANCE = BatteryMonitor.INSTANCE;
          if (BatteryMonitor.access$getMPreCpuData$p(iNSTANCE) != null) {
             uob = BatteryMonitor.access$getMPreCpuData$p(iNSTANCE);
          label_0021 :
             BatteryMonitor iNSTANCE1 = BatteryMonitor.INSTANCE;
             HashMap hashMap = null;
             BatteryInfo$d uod = (iNSTANCE1.getMonitorConfig().enableCollectSysCpu != null)? b.f(): hashMap;
             if (this.c != null) {
                if (BatteryMonitor.access$getMManualSectionMap$p(iNSTANCE1).containsKey(this.d)) {
                   h.g("BatteryMonitor", "section: "+this.d+" already in monitor");
                   return;
                }else {
                   BatteryInfo uBatteryInfo = new BatteryInfo();
                   uBatteryInfo.B = Long.valueOf(this.e);
                   uBatteryInfo.C = Long.valueOf(this.f);
                   BatteryMonitor.access$getMManualSectionMap$p(iNSTANCE1).put(this.d, uBatteryInfo);
                   a.c(uBatteryInfo, this.d, null, true, this.b, 2, null);
                   if (uob == null) {
                      a.L();
                   }
                   a.e(uBatteryInfo, uob, uoc, uod);
                }
             }else {
                BatteryInfo uBatteryInfo1 = BatteryMonitor.access$getMBatteryInfo$p(iNSTANCE1);
                a.q(uBatteryInfo1, "$this$reset");
                uBatteryInfo1.a = 0;
                uBatteryInfo1.b = hashMap;
                uBatteryInfo1.c = hashMap;
                uBatteryInfo1.d = false;
                uBatteryInfo1.e = false;
                uBatteryInfo1.f = false;
                uBatteryInfo1.i = 0;
                uBatteryInfo1.g = 0;
                uBatteryInfo1.k = 0;
                uBatteryInfo1.j = 0;
                uBatteryInfo1.h = 0;
                uBatteryInfo1.l = 0;
                uBatteryInfo1.n = 0;
                uBatteryInfo1.o = 0;
                uBatteryInfo1.p = 0;
                uBatteryInfo1.q = 0;
                uBatteryInfo1.r = 0;
                uBatteryInfo1.s = 0;
                uBatteryInfo1.t = hashMap;
                uBatteryInfo1.u = hashMap;
                uBatteryInfo1.x = hashMap;
                uBatteryInfo1.A = hashMap;
                uBatteryInfo1.v = hashMap;
                uBatteryInfo1.w = hashMap;
                uBatteryInfo1.y = 0;
                uBatteryInfo1.z = 0;
                uBatteryInfo1.m = 0;
                uBatteryInfo1.B = hashMap;
                uBatteryInfo1.C = hashMap;
                uBatteryInfo1.D = hashMap;
                uBatteryInfo1.E = hashMap;
                uBatteryInfo1.F.clear();
                BatteryMonitor.access$getMBatteryInfo$p(iNSTANCE1).B = Long.valueOf(this.e);
                BatteryMonitor.access$getMBatteryInfo$p(iNSTANCE1).C = Long.valueOf(this.f);
                a.c(BatteryMonitor.access$getMBatteryInfo$p(iNSTANCE1), this.d, BatteryMonitor.access$getMPreScene$p(iNSTANCE1), false, false, 12, null);
                BatteryInfo uBatteryInfo2 = BatteryMonitor.access$getMBatteryInfo$p(iNSTANCE1);
                if (uob == null) {
                   a.L();
                }
                a.e(uBatteryInfo2, uob, uoc, uod);
                if (iNSTANCE1.getMonitorConfig().enableThreadCpuInfo != null) {
                   ThreadCpuUsageMonitor threadCpuUsa = ThreadCpuUsageMonitor.a();
                   threadCpuUsa.d = this.d;
                   threadCpuUsa.e = BatteryMonitor.access$getMPreScene$p(iNSTANCE1);
                   threadCpuUsa.f = System.currentTimeMillis();
                   threadCpuUsa.g = SystemClock.currentThreadTimeMillis();
                }
                BatteryMonitor.access$setMPreScene$p(iNSTANCE1, this.d);
             }
             return;
          }
       }
       uob = b.d(true, BatteryMonitor.access$getMPreCpuData$p(BatteryMonitor.INSTANCE));
       goto label_0021 ;
    }
}
