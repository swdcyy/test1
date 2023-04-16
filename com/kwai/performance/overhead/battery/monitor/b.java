package com.kwai.performance.overhead.battery.monitor.b;
import java.lang.Runnable;
import java.lang.Object;
import java.util.HashSet;
import java.util.HashMap;
import com.kwai.performance.overhead.battery.monitor.BatteryMonitorConfig;
import android.os.Handler;
import java.lang.String;
import yf7.h;
import android.os.HandlerThread;
import com.kwai.performance.overhead.battery.monitor.b$a;
import android.os.Looper;
import java.lang.Thread;
import java.lang.Long;
import java.util.Set;
import zk.d;
import com.kwai.performance.overhead.battery.monitor.b$b;
import zk.a;
import com.kwai.performance.overhead.battery.monitor.model.StackTree;
import com.kwai.performance.overhead.battery.monitor.adapter.StackTreeAdapter;
import java.lang.reflect.Type;
import com.google.gson.Gson;
import com.kwai.performance.overhead.battery.monitor.b$c;
import com.kwai.performance.overhead.battery.monitor.ThreadInfoSampler;
import com.kwai.performance.overhead.battery.monitor.BatteryInfo$c;
import ag7.e;
import java.util.Map;
import java.util.Arrays;
import com.kwai.performance.overhead.battery.monitor.model.CpuException;
import java.lang.System;
import android.os.SystemClock;
import android.util.Pair;
import com.kwai.performance.overhead.battery.monitor.BatteryMonitor;
import java.lang.Integer;
import java.lang.Class;
import ag7.f;
import java.util.List;
import bg7.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.lang.StackTraceElement;

public class b implements Runnable	// class@001138
{
    public Gson b;
    public Handler c;
    public HandlerThread d;
    public BatteryMonitorConfig e;
    public b$c f;
    public int g;
    public int h;
    public boolean i;
    public long j;
    public long k;
    public long l;
    public long m;
    public long n;
    public int o;
    public int p;
    public float q;
    public final Set r;
    public final Set s;
    public final Map t;
    public ThreadInfoSampler u;
    public static final b v;

    static {
       b.v = new b();
    }
    public void b(){
       super();
       this.g = 0;
       this.h = 0;
       this.o = 0;
       this.p = 0;
       this.q = 0;
       this.r = new HashSet();
       this.s = new HashSet();
       this.t = new HashMap();
    }
    public static b b(){
       return b.v;
    }
    public final void a(){
       if (!(this.g % (this.e.stackSampleInterval + 1))) {
          this.c.post(this);
       }
       this.g = this.g + 1;
       return;
    }
    public void c(BatteryMonitorConfig p0){
       h.d("BatteryMonitor.Exception", "CpuExceptionStrategy.init\(\)");
       this.e = p0;
       HandlerThread handlerThrea = new HandlerThread("CpuExceptionWorker");
       this.d = handlerThrea;
       handlerThrea.start();
       this.c = new b$a(this, this.d.getLooper());
       this.r.add(Long.valueOf(Thread.currentThread().getId()));
       this.r.add(Long.valueOf(this.d.getId()));
       d uod = new d();
       uod.a(new b$b(this));
       uod.f(StackTree.class, new StackTreeAdapter());
       this.b = uod.b();
       this.f = new b$c(this.e);
       this.u = new ThreadInfoSampler(this.e);
    }
    public void d(float p0,float p1,BatteryInfo$c p2){
       b ti = this.i;
       b uob = null;
       if (ti == null) {
          this.h = (p0 - this.e.processCpuUsageThreshold >= 0)? this.h + 1: uob;
       }else {
          b te = this.e;
          this.h = (p0 - te.processCpuUsageThreshold < 0)? this.h - 1: te.overThresholdTimes;
       }
    label_0029 :
       if (ti == null) {
          if (this.h >= this.e.overThresholdTimes) {
             this.f.a(p0);
             this.i = true;
             this.c.post(new e(this, p2));
             this.a();
          }
       }else {
          this.f.a(p0);
          this.q = this.q + p0;
          this.p = this.p + 1;
          if (this.h <= null) {
             this.g(p2, uob);
          }else {
             b tf = this.f;
             if (tf.b >= tf.d.slideWindowSize && tf.b() - tf.d.processCpuUsageThreshold >= 0) {
                uob = 1;
             }
             if (uob != null) {
                this.g(p2, 1);
             }else {
                this.a();
             }
          }
       }
       return;
    }
    public final void e(){
       h.d("BatteryMonitor.Exception", "resetSharedValueInSampleThread\(\) start");
       this.m = 0;
       this.n = 0;
       this.o = 0;
       this.u.clear();
       this.s.clear();
       this.t.clear();
       h.d("BatteryMonitor.Exception", "resetSharedValueInSampleThread\(\) finish");
    }
    public final void f(){
       h.d("BatteryMonitor.Exception", "resetSharedValueInThresholdThread\(\) start");
       this.q = 0;
       this.p = 0;
       this.h = 0;
       this.g = 0;
       b tf = this.f;
       tf.a = 0;
       tf.b = 0;
       Arrays.fill(tf.c, 0);
       h.d("BatteryMonitor.Exception", "resetSharedValueInThresholdThread\(\) finish");
    }
    public final void g(BatteryInfo$c p0,boolean p1){
       boolean b = false;
       this.i = b;
       BatteryInfo$c uoc = (p1 || this.e.isEnableNotWindowReport())? 1: null;
       if (!uoc) {
          this.f();
          this.e();
          return;
       }else {
          long l = p0.a - this.k;
          CpuException uCpuExceptio = new CpuException();
          uCpuExceptio.isWindowFull = p1;
          b tf = this.f;
          b$c c = tf.c;
          float[] uofloatArray = new float[c.length];
          if (tf.b <= c.length) {
             System.arraycopy(c, b, uofloatArray, b, c.length);
          }else {
             b$c a = tf.a;
             System.arraycopy(c, a, uofloatArray, b, (c.length - a));
             c = tf.c;
             b$c a1 = tf.a;
             System.arraycopy(c, b, uofloatArray, (c.length - a1), a1);
          }
          uCpuExceptio.windows = uofloatArray;
          uCpuExceptio.windowCpuUsageAvg = this.f.b();
          tf = this.p;
          float f = (tf == null)? 0: this.q / (float)tf;
          uCpuExceptio.cpuUsageAvg = f;
          uCpuExceptio.startSamplingTime = this.j;
          uCpuExceptio.endSamplingTime = System.currentTimeMillis();
          uCpuExceptio.processCpuCost = l;
          uCpuExceptio.samplingCount = this.o;
          uCpuExceptio.samplingCpuCost = SystemClock.currentThreadTimeMillis() - this.l;
          uCpuExceptio.samplingPart1CpuCost = this.m;
          uCpuExceptio.samplingPart2CpuCost = this.n;
          Pair batteryJsonI = (this.e.isEnableReportWithBatteryInfo())? BatteryMonitor.getBatteryJsonInfo(): new Pair(null, Integer.valueOf(1024));
          uCpuExceptio.batteryInfoJson = this.b.h(batteryJsonI.first, Map.class);
          uCpuExceptio.batteryInfoCode = batteryJsonI.second.intValue();
          uCpuExceptio.fillByBatteryInfo(BatteryMonitor.getBatteryInfo());
          this.f();
          this.c.removeCallbacks(this);
          this.c.post(new f(this, uCpuExceptio));
          return;
       }
    }
    public void run(){
       List list;
       StackTraceElement[] stackTrace;
       this.o = this.o + 1;
       this.u.update();
       List costedOrdere = this.u.getCostedOrderedThreadInfoList();
       long l = SystemClock.currentThreadTimeMillis();
       this.m = this.m + (l - SystemClock.currentThreadTimeMillis());
       HashSet hashSet = new HashSet();
       int i = 0;
       while (i < costedOrdere.size() && i < this.e.threadCpuTopN) {
          a uoa = costedOrdere.get(i);
          if (!this.e.isEnableIgnoreNoDiffThread() || uoa.k == 2) {
             this.s.add(uoa.f);
             ArrayList uArrayList = new ArrayList();
             a b = uoa.b;
             if (b != null) {
                uArrayList.add(b);
             }
             if (this.e.isEnableMatchMultiThread()) {
                uoa = uoa.c;
                if (uoa != null) {
                   uArrayList.addAll(uoa);
                }
             }
             Iterator iterator = uArrayList.iterator();
             while (iterator.hasNext()) {
                Thread thread = iterator.next();
                if (this.r.contains(Long.valueOf(thread.getId())) || hashSet.contains(Long.valueOf(thread.getId()))) {
                   continue ;
                }else {
                   list = this.t.get(thread);
                   if (list == null) {
                      list = new ArrayList();
                      this.t.put(thread, list);
                   }
                   stackTrace = thread.getStackTrace();
                   hashSet.add(Long.valueOf(thread.getId()));
                   if (!stackTrace.length) {
                      continue ;
                   }
                }
                list.add(stackTrace);
             }
          }
          i = i + 1;
       }
       this.n = this.n + (SystemClock.currentThreadTimeMillis() - l);
       return;
    }
}
