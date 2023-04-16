package com.kwai.performance.overhead.battery.monitor.BatteryMonitor;
import com.kwai.performance.monitor.base.loop.LoopMonitor;
import java.util.HashMap;
import com.kwai.performance.overhead.battery.monitor.BatteryInfo;
import com.kwai.performance.overhead.battery.monitor.BatteryMonitor$e;
import com.kwai.performance.overhead.battery.monitor.BatteryInfo$b;
import java.lang.String;
import com.kwai.performance.overhead.battery.monitor.BatteryMonitor$a;
import android.util.Pair;
import kotlin.jvm.internal.a;
import java.lang.Object;
import com.kwai.performance.monitor.base.Monitor;
import com.kwai.performance.overhead.battery.monitor.BatteryMonitorConfig;
import msd.l;
import java.util.Map;
import com.kwai.performance.monitor.base.d;
import android.os.Build$VERSION;
import java.lang.Integer;
import java.lang.CharSequence;
import yf7.h;
import java.util.ArrayList;
import com.kwai.performance.overhead.battery.monitor.BatteryInfo$c;
import com.kwai.performance.overhead.battery.monitor.a;
import java.util.Collection;
import java.lang.StringBuilder;
import org.json.JSONObject;
import kotlin.Result;
import org.json.JSONArray;
import java.util.Iterator;
import qrd.l1;
import java.lang.Throwable;
import qrd.j0;
import android.util.Log;
import com.kwai.performance.monitor.base.loop.LoopMonitor$b;
import com.kwai.performance.overhead.battery.monitor.BatteryInfo$Companion;
import com.kwai.performance.monitor.base.loop.LoopMonitor$b$b;
import yf7.i;
import ag7.b;
import yf7.d;
import yf7.d$a;
import com.kwai.performance.monitor.base.loop.LoopMonitor$b$a;
import com.kwai.performance.overhead.battery.monitor.BatteryInfo$d;
import java.lang.Number;
import java.lang.Boolean;
import nsd.r0;
import java.util.Locale;
import java.lang.Float;
import java.util.Arrays;
import java.util.Set;
import java.util.Map$Entry;
import com.kwai.performance.overhead.battery.monitor.b;
import java.lang.Iterable;
import msd.p;
import com.kwai.performance.overhead.battery.monitor.ThreadCpuUsageMonitor;
import com.kwai.performance.overhead.battery.monitor.ThreadInfoSampler;
import com.kwai.performance.overhead.battery.monitor.BatteryMonitor$b;
import java.lang.Runnable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.app.Application;
import yf7.k;
import com.kwai.performance.overhead.battery.monitor.BatteryMonitor$c;
import android.app.Application$ActivityLifecycleCallbacks;
import ag7.c;
import com.kwai.performance.overhead.battery.monitor.BatteryMonitor$initSdk$1;
import msd.a;
import com.kwai.performance.monitor.base.Monitor_ThreadKt;
import com.kwai.performance.overhead.battery.jni.NativeHandler;
import android.os.PowerManager;
import com.kwai.performance.overhead.battery.monitor.BatteryMonitor$d;
import android.os.PowerManager$OnThermalStatusChangedListener;
import kotlin.TypeCastException;
import android.content.Context;
import com.kwai.performance.overhead.battery.monitor.BatteryStatusMonitor;
import com.kwai.performance.overhead.battery.monitor.model.HistoryCpuInfo;
import com.kwai.performance.overhead.battery.monitor.ThreadCpuInfoConfig;
import java.util.Random;
import com.kwai.performance.overhead.battery.monitor.BatteryMonitor$f;
import java.util.List;
import java.lang.System;
import android.os.SystemClock;
import com.kwai.performance.overhead.battery.monitor.BatteryMonitor$g;
import com.kwai.performance.overhead.battery.monitor.BatteryMonitor$h;

public final class BatteryMonitor extends LoopMonitor	// class@001126
{
    public static final BatteryMonitor INSTANCE;
    public static int THERMAL_STATUS_INIT_ERROR;
    public static int THERMAL_STATUS_NOT_INIT;
    public static int THERMAL_STATUS_NOT_UPDATE;
    public static BatteryMonitor$a mAppStatusNotifier;
    public static final BatteryInfo mBatteryInfo;
    public static boolean mCpuCheckStart;
    public static Handler mHandler;
    public static HandlerThread mHandlerThread;
    public static boolean mIsAppInFront;
    public static int mLastThermalStatus;
    public static HashMap mManualSectionMap;
    public static BatteryInfo$b mPreCpuData;
    public static String mPreScene;

    static {
       BatteryMonitor.INSTANCE = new BatteryMonitor();
       BatteryMonitor.THERMAL_STATUS_INIT_ERROR = -3;
       BatteryMonitor.THERMAL_STATUS_NOT_INIT = -2;
       BatteryMonitor.THERMAL_STATUS_NOT_UPDATE = -1;
       BatteryMonitor.mManualSectionMap = new HashMap();
       BatteryMonitor.mBatteryInfo = new BatteryInfo();
       BatteryMonitor.mLastThermalStatus = BatteryMonitor.THERMAL_STATUS_NOT_INIT;
       BatteryMonitor.mIsAppInFront = true;
       BatteryMonitor.mAppStatusNotifier = new BatteryMonitor$e();
    }
    public void BatteryMonitor(){
       super();
    }
    public static final BatteryInfo access$getMBatteryInfo$p(BatteryMonitor p0){
       return BatteryMonitor.mBatteryInfo;
    }
    public static final boolean access$getMIsAppInFront$p(BatteryMonitor p0){
       return BatteryMonitor.mIsAppInFront;
    }
    public static final int access$getMLastThermalStatus$p(BatteryMonitor p0){
       return BatteryMonitor.mLastThermalStatus;
    }
    public static final HashMap access$getMManualSectionMap$p(BatteryMonitor p0){
       return BatteryMonitor.mManualSectionMap;
    }
    public static final BatteryInfo$b access$getMPreCpuData$p(BatteryMonitor p0){
       return BatteryMonitor.mPreCpuData;
    }
    public static final String access$getMPreScene$p(BatteryMonitor p0){
       return BatteryMonitor.mPreScene;
    }
    public static final void access$setMIsAppInFront$p(BatteryMonitor p0,boolean p1){
       BatteryMonitor.mIsAppInFront = p1;
    }
    public static final void access$setMLastThermalStatus$p(BatteryMonitor p0,int p1){
       BatteryMonitor.mLastThermalStatus = p1;
    }
    public static final void access$setMManualSectionMap$p(BatteryMonitor p0,HashMap p1){
       BatteryMonitor.mManualSectionMap = p1;
    }
    public static final void access$setMPreCpuData$p(BatteryMonitor p0,BatteryInfo$b p1){
       BatteryMonitor.mPreCpuData = p1;
    }
    public static final void access$setMPreScene$p(BatteryMonitor p0,String p1){
       BatteryMonitor.mPreScene = p1;
    }
    public static final BatteryMonitor$a getAppStatusNotifier(){
       return BatteryMonitor.mAppStatusNotifier;
    }
    public static final Pair getBatteryInfo(){
       BatteryInfo mBatteryInfo = BatteryMonitor.mBatteryInfo;
       BatteryInfo b = mBatteryInfo.b;
       if (b == null) {
          b = "";
       }else if(b == null){
          a.L();
       }
       BatteryMonitorConfig customParams = BatteryMonitor.INSTANCE.getMonitorConfig().customParamsInvoker;
       Map map = (customParams != null)? customParams.invoke(b): null;
       return new Pair(mBatteryInfo, map);
    }
    public static final Pair getBatteryJsonInfo(){
       Pair batteryInfo = BatteryMonitor.getBatteryInfo();
       Pair first = batteryInfo.first;
       a.h(first, "pair.first");
       return BatteryMonitor.INSTANCE.batteryInfoToJson(first, batteryInfo.second);
    }
    public static final BatteryMonitorConfig getConfig(){
       return BatteryMonitor.INSTANCE.getMonitorConfig();
    }
    public static final d getConfigCommon(){
       return BatteryMonitor.INSTANCE.getCommonConfig();
    }
    public static final Pair getThermalStatus(){
       if (Build$VERSION.SDK_INT < 29) {
          return new Pair("DISABLE", Integer.valueOf(BatteryMonitor.mLastThermalStatus));
       }
       switch (BatteryMonitor.mLastThermalStatus){
           case 0:
             return new Pair("NONE", Integer.valueOf(BatteryMonitor.mLastThermalStatus));
           case 1:
             return new Pair("LIGHT", Integer.valueOf(BatteryMonitor.mLastThermalStatus));
           case 2:
             return new Pair("MODERATE", Integer.valueOf(BatteryMonitor.mLastThermalStatus));
           case 3:
             return new Pair("SEVERE", Integer.valueOf(BatteryMonitor.mLastThermalStatus));
           case 4:
             return new Pair("CRITICAL", Integer.valueOf(BatteryMonitor.mLastThermalStatus));
           case 5:
             return new Pair("EMERGENCY", Integer.valueOf(BatteryMonitor.mLastThermalStatus));
           case 6:
             return new Pair("SHUTDOWN", Integer.valueOf(BatteryMonitor.mLastThermalStatus));
           default:
             return new Pair("UNKNOWN", Integer.valueOf(BatteryMonitor.mLastThermalStatus));
       }
    }
    public static final void startSection(String p0){
       a.q(p0, "section");
       BatteryMonitor.startSection(p0, false);
    }
    public static final void startSection(String p0,boolean p1){
       a.q(p0, "section");
       BatteryMonitor uBatteryMoni = (!p0.length())? 1: null;
       if (uBatteryMoni) {
          h.g("BatteryMonitor", "startSection\(\) | section is empty");
          return;
       }else {
          BatteryMonitor.INSTANCE.startSectionInner(p0, p1, true);
          return;
       }
    }
    public static final void stopSection(String p0){
       a.q(p0, "section");
       BatteryMonitor.stopSection(p0, false);
    }
    public static final void stopSection(String p0,boolean p1){
       a.q(p0, "section");
       BatteryMonitor.stopSection(p0, p1, null);
    }
    public static final void stopSection(String p0,boolean p1,Map p2){
       a.q(p0, "section");
       BatteryMonitor uBatteryMoni = (!p0.length())? 1: null;
       if (uBatteryMoni) {
          h.g("BatteryMonitor", "startSection\(\) | section is empty");
          return;
       }else {
          BatteryMonitor.INSTANCE.stopSectionInner(p0, p1, true, p2);
          return;
       }
    }
    public static void stopSectionInner$default(BatteryMonitor p0,String p1,boolean p2,boolean p3,Map p4,int p5,Object p6){
       if (p5 & 0x08) {
          p4 = null;
       }
       p0.stopSectionInner(p1, p2, p3, p4);
       return;
    }
    public final Pair batteryInfoToJson(BatteryInfo p0,Map p1){
       Object obj;
       String str;
       BatteryInfo u1;
       Iterator iterator;
       String str1;
       a.q(p0, "$this$isValid");
       BatteryInfo y = p0.y;
       int i = 3;
       int i1 = 2;
       BatteryInfo uBatteryInfo = 1;
       if (y < i) {
          if (p0.f != null) {
             if (y < uBatteryInfo) {
                i = 12;
             }else if(p0.F.isEmpty()){
                i = 2;
             }else {
                y = p0.u;
                if (y != null) {
                   if (a.a(y)) {
                      i = 5;
                   }else {
                      i = p0.F.size() - 1;
                      int i2 = 0;
                      while (true) {
                         if (i >= 0) {
                            Object obj1 = p0.F.get(i);
                            a.h(obj1, "sampleDataList[i]");
                            if (i > 0) {
                               int i3 = i - 1;
                               u1 = p0.F.get(i3);
                               a.h(u1, "sampleDataList[i - 1]");
                            }else {
                               u1 = y;
                            }
                            i2 = (obj1.k != null)? i2 + uBatteryInfo: 0;
                            if (i2 > i1) {
                               i = 7;
                            }else {
                               long l2 = obj1.r - u1.r;
                               obj1.s = l2;
                               l2 = obj1.t - u1.t;
                               obj1.u = l2;
                               int i4 = a.a(obj1);
                               if (i4) {
                                  i = i4;
                               }else {
                                  i = i - 1;
                               }
                            }
                         }else {
                            y = p0.v;
                            if (y != null) {
                               i = (a.a(y))? 6: 0;
                            }else {
                               i = 4;
                            }
                         }
                      }
                      h.g("BatteryMonitor", "batteryInfoToJson\(\) | sample data not valid, code = "+i);
                      return new Pair(obj, Integer.valueOf(i));
                   }
                }
             }
          }else {
             i = 1;
          }
       }else {
          goto label_001a ;
       }
       obj = null;
       if (i) {
          goto label_0094 ;
       }else {
          a.q(p0, "$this$calculateAvg");
          BatteryInfo v = p0.v;
          if (v == null) {
             a.L();
          }
          BatteryInfo$c r = v.r;
          v = p0.u;
          if (v == null) {
             a.L();
          }
          p0.s = (long)((double)(r - v.r) / (double)p0.y);
          v = p0.v;
          if (v == null) {
             a.L();
          }
          r = v.t;
          v = p0.u;
          if (v == null) {
             a.L();
          }
          v = p0.y;
          p0.r = (long)((double)(r - v.t) / (double)v);
          BatteryInfo f = p0.f;
          i1 = (v > i1)? 1: 0;
          if (i1 & f) {
             i = v - 1;
          }
          float f1 = (float)i;
          p0.i = p0.j / f1;
          p0.g = p0.h / f1;
          BatteryInfo m = p0.m;
          f1 = (m > null)? p0.l / (float)m: 0;
          p0.k = f1;
          m = p0.v;
          if (m == null) {
             a.L();
          }
          r = m.a;
          m = p0.u;
          if (m == null) {
             a.L();
          }
          long l = r - m.a;
          p0.p = l;
          long l1 = (long)i;
          p0.o = l / l1;
          f = p0.v;
          if (f == null) {
             a.L();
          }
          r = f.e;
          BatteryInfo u = p0.u;
          if (u == null) {
             a.L();
          }
          p0.q = (r - u.e) / l1;
          a.q(p0, "$this$checkAvgValid");
          Result$a uoa = null;
          if (p0.o - uoa >= 0 && p0.q - uoa >= 0) {
             float f2 = (float)0;
             if (p0.i - f2 <= 0 || (p0.n - f2 <= 0 || (p0.s - uoa >= 0 && p0.r - uoa >= 0))) {
                str = 1;
             label_016f :
                if (!str) {
                   h.g("BatteryMonitor", "batteryInfoToJson\(\) | sample avg not valid");
                   h.g("BatteryMonitor", "batteryInfoToJson\(\) | processCpuMillsAvg = "+p0.o+", totalCpuMillsAvg = "+p0.q+", cpuUsageAvg = "+p0.i+", cpuUsageMax = "+p0.n+", rxBytesAvg = "+p0.s+", txBytesAvg = "+p0.r);
                   return new Pair(obj, Integer.valueOf(10));
                }else {
                   a.q(p0, "$this$fillUploadData");
                   JSONObject jSONObject = new JSONObject();
                   JSONObject jSONObject1 = new JSONObject();
                   a.b(p0, jSONObject1, p1);
                   if (BatteryMonitor.getConfig().reportWithSampleDetail()) {
                      JSONArray jSONArray = new JSONArray();
                      u1 = p0.u;
                      JSONObject jSONObject2 = (u1 != null)? a.d(u1): obj;
                      jSONArray.put(jSONObject2);
                      iterator = p0.F.iterator();
                      while (iterator.hasNext()) {
                         BatteryInfo$c uoc = iterator.next();
                         a.h(uoc, "sampleData");
                         jSONArray.put(a.d(uoc));
                      }
                      jSONObject1.put("detailed_sample", jSONArray);
                   }
                   iterator = Result.constructor-impl(l1.a);
                   Throwable throwable = Result.exceptionOrNull-impl(iterator);
                   if (throwable != null) {
                      h.g("BatteryMonitor", "fillUploadData\(\) | error by "+throwable+10+Log.getStackTraceString(throwable));
                      str1 = "";
                   }else {
                      str1 = jSONObject1.toString();
                      a.h(str1, "uploadJsonObj.toString\(\)");
                   }
                   if (str1.length()) {
                      uBatteryInfo = null;
                   }
                   if (uBatteryInfo != null) {
                      h.g("BatteryMonitor", "batteryInfoToJson\(\) | fill json data error");
                      return new Pair(obj, Integer.valueOf(11));
                   }else {
                      return new Pair(str1, Integer.valueOf(0));
                   }
                }
             }
          }
          str = null;
          goto label_016f ;
       }
    }
    public LoopMonitor$b call(){
       if (!BatteryInfo.T.g()) {
          return LoopMonitor$b$b.a;
       }
       return this.callInner();
    }
    public Object call(){
       return this.call();
    }
    public final LoopMonitor$b callInner(){
       BatteryInfo$d uod;
       BatteryInfo a;
       BatteryInfo$d b;
       long l3;
       BatteryInfo$d uod1;
       int i2;
       BatteryInfo$c uoc = b.e();
       BatteryInfo$b uob = b.d(false, BatteryMonitor.mPreCpuData);
       float f = b.a(uob, BatteryMonitor.mPreCpuData, uoc);
       float f1 = 0;
       if (this.sampleSysCpuInfoCheck()) {
          uod = b.f();
          a = BatteryMonitor.mBatteryInfo.A;
          a.q(uod, "currentSystemCpuData");
          a.q(uoc, "outSampleData");
          if (a == null) {
             uoc.g = f1;
          }else {
             BatteryInfo$d c = a.c;
             b = a.b;
             BatteryInfo$d c1 = uod.c;
             BatteryInfo$d b1 = uod.b;
             long l = uod.a - a.a;
             StringBuilder str = null;
             if (c.size() == c1.size()) {
                int i = c.size();
                long l1 = str;
                int i1 = 0;
                while (i1 < i) {
                   BatteryInfo$d obj = c.get(i1);
                   a.h(obj, "preIdleTimeArray[index]");
                   long l2 = obj.longValue();
                   obj = c;
                   l3 = c1.get(i1).longValue() - l2;
                   if (!(v19 = l3 - str)) {
                      if (!b.get(i1).booleanValue() && !b1.get(i1).booleanValue()) {
                      label_00bb :
                         uod1 = obj;
                         l3 = l;
                      }else {
                         Object obj1 = b.get(i1);
                         a.h(obj1, "preStateList[index]");
                         if (obj1.booleanValue()) {
                            obj1 = b1.get(i1);
                            a.h(obj1, "curStateList[index]");
                            if (obj1.booleanValue()) {
                               uod1 = obj;
                            label_00de :
                               i1 = i1 + 1;
                               c = uod1;
                               str = null;
                            }
                         }
                         l3 = l / (long)2;
                      label_00da :
                         uod1 = obj;
                      }
                   }else if(l3 - l > 0){
                      goto label_00bb ;
                   }else if(v19 < 0){
                      uod1 = obj;
                      h.g("BatteryMonitor", "cpu idle time diff error, cpuIdle: "+l3);
                      l3 = 0;
                   }else {
                      goto label_00da ;
                   }
                   l1 = l1 + l3;
                   goto label_00de ;
                }
                l3 = l1;
                i2 = 1;
             }else {
                i2 = 1;
                l3 = 0;
             }
             Locale eNGLISH = Locale.ENGLISH;
             a.h(eNGLISH, "Locale.ENGLISH");
             Object[] objArray = new Object[]{Float.valueOf((((float)i2 - ((float)l3 / (float)(l * (long)BatteryInfo.T.j()))) * (float)100))};
             String str1 = String.format(eNGLISH, "%.2f", Arrays.copyOf(objArray, 1));
             a.h(str1, "java.lang.String.format\(locale, format, *args\)");
             uoc.g = Float.parseFloat(str1);
          }
          f1 = uoc.g;
       }else {
          uod = null;
       }
       BatteryMonitor.mPreCpuData = uob;
       a.e(BatteryMonitor.mBatteryInfo, uob, uoc, uod);
       if (BatteryMonitor.mManualSectionMap.isEmpty() ^ 1) {
          Iterator iterator = BatteryMonitor.mManualSectionMap.entrySet().iterator();
          while (iterator.hasNext()) {
             a.e(iterator.next().getValue(), uob, uoc, uod);
          }
       }
       if (this.getMonitorConfig().enableStackSampling != null) {
          b.b().d(f, f1, uoc);
       }
       BatteryMonitorConfig cpuUsageCall = this.getMonitorConfig().cpuUsageCallbacks;
       if (cpuUsageCall != null) {
          Iterator iterator1 = cpuUsageCall.iterator();
          while (iterator1.hasNext()) {
             iterator1.next().invoke(Float.valueOf(f), Float.valueOf(f1));
          }
       }
       if (this.getMonitorConfig().enableThreadCpuInfo != null) {
          ThreadCpuUsageMonitor threadCpuUsa = ThreadCpuUsageMonitor.a();
          threadCpuUsa.c.update();
          threadCpuUsa.h = threadCpuUsa.h + 1;
          threadCpuUsa.i = threadCpuUsa.i + 1;
          float f2 = ((float)threadCpuUsa.c.getLastActiveThreadCount() * 0x3f800000) / (float)threadCpuUsa.c.getLastThreadCount();
          threadCpuUsa.j = threadCpuUsa.j + f2;
          threadCpuUsa.k = threadCpuUsa.k + f2;
       }
       return LoopMonitor$b$a.a;
    }
    public final void checkAndStart(boolean p0){
       long loopInterval;
       if (!BatteryMonitor.mCpuCheckStart) {
          h.d("BatteryMonitor", "global monitor first start");
          loopInterval = (p0)? this.getLoopInterval(): 0;
          BatteryMonitor.mCpuCheckStart = true;
          this.runInLooper(BatteryMonitor$b.b);
       }else {
          loopInterval = this.getLoopInterval();
       }
       LoopMonitor.startLoop$default(this, false, false, loopInterval, 3, null);
       return;
    }
    public Handler getLoopHandler(){
       Handler mHandler = BatteryMonitor.mHandler;
       if (mHandler == null) {
          a.L();
       }
       return mHandler;
    }
    public long getLoopInterval(){
       BatteryMonitorConfig loopInterval = (BatteryMonitor.mIsAppInFront)? this.getMonitorConfig().loopInterval: this.getMonitorConfig().loopIntervalBg;
       return loopInterval;
    }
    public void init(d p0,BatteryMonitorConfig p1){
       a.q(p0, "commonConfig");
       a.q(p1, "monitorConfig");
       super.init(p0, p1);
       HandlerThread handlerThrea = new HandlerThread("CpuBaseMonitor");
       BatteryMonitor.mHandlerThread = handlerThrea;
       handlerThrea.start();
       HandlerThread mHandlerThre = BatteryMonitor.mHandlerThread;
       if (mHandlerThre == null) {
          a.L();
       }
       BatteryMonitor.mHandler = new Handler(mHandlerThre.getLooper());
       this.checkAndStart(false);
       k.b().registerActivityLifecycleCallbacks(new BatteryMonitor$c(p1));
       return;
    }
    public void init(d p0,Object p1){
       this.init(p0, p1);
    }
    public final void initSdk(){
       BatteryMonitorConfig systemServic;
       ThreadCpuUsageMonitor threadCpuUsa;
       c b = c.b;
       b.a(this.getCommonConfig().f());
       int i = 1;
       if (this.getMonitorConfig().enableCollectGpuInfo != null && !b.c()) {
          Monitor_ThreadKt.b(0, BatteryMonitor$initSdk$1.INSTANCE, i, null);
       }
       BatteryInfo.T.l(this.getMonitorConfig());
       if (this.getMonitorConfig().isUseThreadDumpToBind()) {
          NativeHandler.a();
       }
       if (this.getMonitorConfig().enableStackSampling != null) {
          b.b().c(this.getMonitorConfig());
       }
       if (this.getMonitorConfig().reportWithThermalStatus() && Build$VERSION.SDK_INT >= 29) {
          BatteryMonitor.mLastThermalStatus = BatteryMonitor.THERMAL_STATUS_NOT_UPDATE;
          systemServic = this.getCommonConfig().a().getSystemService("power");
          if (systemServic != null) {
             systemServic.addThermalStatusListener(BatteryMonitor$d.a);
          }else {
             throw new TypeCastException("null cannot be cast to non-null type android.os.PowerManager");
          }
       }
       BatteryStatusMonitor.b(this.getCommonConfig().a());
       if (this.getMonitorConfig().isHoldHistoryRecords() && this.getMonitorConfig().statusMapProvider != null) {
          systemServic = this.getMonitorConfig().statusMapProvider;
          if (systemServic == null) {
             a.L();
          }
          HistoryCpuInfo historyCpuIn = HistoryCpuInfo.get();
          a.h(historyCpuIn, "HistoryCpuInfo.get\(\)");
          systemServic.invoke("CpuInfoHistory", historyCpuIn);
       }
       BatteryMonitorConfig uBatteryMoni = null;
       if (this.getMonitorConfig().enableThreadCpuInfo != null && this.getMonitorConfig().threadCpuInfoConfig != null) {
          systemServic = this.getMonitorConfig().threadCpuInfoConfig;
          if (systemServic == null) {
             a.L();
          }
          BatteryInfo$Companion t = BatteryInfo.T;
          int i1 = t.f();
          if (i1 != i) {
             int i2 = 2;
             if (i1 != i2) {
                threadCpuUsa = (i1 != 3)? null: systemServic.threadCpuEnableThreshold[i2];
             }else {
                threadCpuUsa = systemServic.threadCpuEnableThreshold[i];
             }
          }else {
             threadCpuUsa = systemServic.threadCpuEnableThreshold[uBatteryMoni];
          }
          i1 = new Random().nextInt(0x2710);
          BatteryMonitorConfig monitorConfi = this.getMonitorConfig();
          if (i1 >= threadCpuUsa) {
             i = false;
          }
          monitorConfi.enableThreadCpuInfo = i;
          if (this.getMonitorConfig().enableThreadCpuInfo != null) {
             ThreadCpuUsageMonitor.a().b(this.getMonitorConfig());
          }else {
             h.d("BatteryMonitor", "ThreadCpuMonitor: device = "+t.f()+", "+"threshold ="+threadCpuUsa+", random ="+i1+" to disable");
          }
       }else {
          this.getMonitorConfig().enableThreadCpuInfo = uBatteryMoni;
       }
       return;
    }
    public final void runInLooper(Runnable p0){
       this.getLoopHandler().post(new BatteryMonitor$f(p0));
    }
    public final boolean sampleSysCpuInfoCheck(){
       boolean b;
       if (this.getMonitorConfig().enableCollectSysCpu != null) {
          BatteryInfo y = BatteryMonitor.mBatteryInfo.y;
          if (y > null && !(y % this.getMonitorConfig().systemCpuLoop)) {
             b = true;
          label_001e :
             return b;
          }
       }
       b = false;
       goto label_001e ;
    }
    public final void startBgSample(){
       h.d("BatteryMonitor", "App onBackground to start bgSample delay on nextTime");
       this.startSectionInner("APP_IN_BG", false, false);
    }
    public final void startFgSample(){
       h.d("BatteryMonitor", "App onForeground to start fgSample delay on resume");
       BatteryMonitor.mPreCpuData = null;
    }
    public void startLoop(boolean p0,boolean p1,long p2){
       super.startLoop(p0, p1, p2);
    }
    public final void startSectionInner(String p0,boolean p1,boolean p2){
       if (this.isInitialized() && BatteryInfo.T.g()) {
          if (p2 && this.getMonitorConfig().blackSections != null) {
             BatteryMonitorConfig blackSection = this.getMonitorConfig().blackSections;
             if (blackSection == null) {
                a.L();
             }
             if (blackSection.contains(p0)) {
                h.d("BatteryMonitor", "startSectionInner\(\) | section is in black list");
                return;
             }
          }
       label_0036 :
          this.checkAndStart(true);
          BatteryMonitor$g og = new BatteryMonitor$g(p1, p2, p0, System.currentTimeMillis(), SystemClock.currentThreadTimeMillis());
          this.runInLooper(v8);
       }
       return;
    }
    public final void stopBgSample(){
       h.d("BatteryMonitor", "App onForeground to stop bgSample");
       this.stopSectionInner("APP_IN_BG", false, false, null);
       this.stopLoop();
    }
    public final void stopFgSample(){
       h.d("BatteryMonitor", "App onBackground to stop fgSample");
       this.stopLoop();
    }
    public void stopLoop(){
       super.stopLoop();
    }
    public final void stopSectionInner(String p0,boolean p1,boolean p2,Map p3){
       if (this.isInitialized() && BatteryInfo.T.g()) {
          BatteryMonitor$h oh = new BatteryMonitor$h(p0, p3, p2, System.currentTimeMillis(), SystemClock.currentThreadTimeMillis(), p1);
          this.runInLooper(v0);
       }
       return;
    }
    public final void uploadBatteryData(BatteryInfo p0,Map p1){
       int i;
       l1 a1;
       String str3;
       BatteryInfo u;
       String str = "BatteryMonitor";
       h.d(str, "uploadBatteryData\(\) | BatteryInfo@"+Integer.toHexString(p0.hashCode())+' '+"scene = \("+p0.b+"\), count = "+p0.y);
       Pair pair = this.batteryInfoToJson(p0, p1);
       Pair second = pair.second;
       if (second == null) {
       }else if(second.intValue()){
          i.a.c("battery_monitor", pair.first, false);
          p0.a = 2;
       label_0141 :
          return;
       }
       String str1 = 1;
       if (second == null || str1 != second.intValue()) {
          i a = i.a;
          a.h(second, "invalidCode");
          i = second.intValue();
          a.q(p0, "$this$fillErrorData");
          JSONObject jSONObject = new JSONObject();
          a.b(p0, jSONObject, p1);
          jSONObject.put("invalid_code", i);
          String str2 = null;
          if (i != 5) {
             if (i != 6) {
                if (i != 7 && (i != 9 && (i != 10 && (i != 13 && (i != 15 && i != 16))))) {
                   a1 = l1.a;
                }else {
                   JSONArray jSONArray = new JSONArray();
                   u = p0.u;
                   if (u != null) {
                      str2 = a.d(u);
                   }
                   jSONArray.put(str2);
                   Iterator iterator = p0.F.iterator();
                   while (iterator.hasNext()) {
                      BatteryInfo$c uoc = iterator.next();
                      a.h(uoc, "sampleData");
                      jSONArray.put(a.d(uoc));
                   }
                   a1 = jSONObject.put("detailed_sample", jSONArray);
                }
             }else {
                str3 = "current_data_item";
                u = p0.v;
                if (u != null) {
                   str2 = a.d(u);
                }
                a1 = jSONObject.put(str3, str2);
             }
          }else {
             str3 = "init_data_item";
             u = p0.u;
             if (u != null) {
                str2 = a.d(u);
             }
             a1 = jSONObject.put(str3, str2);
          }
          a1 = Result.constructor-impl(a1);
          Throwable throwable = Result.exceptionOrNull-impl(a1);
          if (throwable != null) {
             h.g(str, "fillErrorData\(\) | error by "+throwable+10+Log.getStackTraceString(throwable));
             str3 = "{\"invalid_code\": 14}";
          }else {
             str3 = jSONObject.toString();
             a.h(str3, "uploadJsonObj.toString\(\)");
          }
          d$a.b(a, "battery_monitor_invalid", str3, false, 4, null);
       }
       p0.a = 3;
       goto label_0141 ;
    }
}
