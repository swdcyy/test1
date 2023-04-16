package com.kwai.performance.overhead.gpu.monitor.GpuMonitor;
import com.kwai.performance.monitor.base.loop.LoopMonitor;
import com.kwai.performance.overhead.gpu.monitor.GpuInfo;
import java.lang.Object;
import com.kwai.performance.overhead.gpu.monitor.GpuMonitor$mGson$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.performance.overhead.gpu.monitor.GpuMonitor$mActivityManager$2;
import com.kwai.performance.overhead.gpu.monitor.GpuMonitor$mDf$2;
import java.util.LinkedList;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.performance.monitor.base.Monitor;
import android.os.Handler;
import com.kwai.performance.overhead.gpu.monitor.GpuMonitor$b;
import java.lang.Runnable;
import com.kwai.performance.overhead.gpu.monitor.GpuMonitor$c;
import com.kwai.performance.monitor.base.loop.LoopMonitor$b;
import com.kwai.performance.overhead.gpu.monitor.GpuInfo$SampleData;
import java.util.Objects;
import java.lang.StringBuilder;
import yf7.h;
import java.util.ArrayList;
import com.kwai.performance.monitor.base.loop.LoopMonitor$b$a;
import qrd.l1;
import cg7.b;
import cg7.a;
import java.lang.System;
import kotlin.Result;
import android.app.ActivityManager;
import android.os.Process;
import android.os.Debug$MemoryInfo;
import android.os.Build$VERSION;
import java.text.DecimalFormat;
import java.lang.Double;
import java.lang.Throwable;
import qrd.j0;
import cg7.c;
import nsd.u;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.google.gson.Gson;
import java.util.Collection;
import kotlin.TypeCastException;
import com.kwai.performance.monitor.base.d;
import android.app.Application;
import yf7.k;
import com.kwai.performance.overhead.gpu.monitor.GpuMonitor$a;
import android.app.Application$ActivityLifecycleCallbacks;
import java.util.Map;
import org.json.JSONObject;
import yf7.i;
import yf7.d;
import yf7.d$a;

public final class GpuMonitor extends LoopMonitor	// class@00114e
{
    public static final GpuMonitor INSTANCE;
    public static final p mActivityManager$delegate;
    public static final p mDf$delegate;
    public static final GpuInfo mGpuInfo;
    public static final p mGson$delegate;
    public static final LinkedList mLoopStackTraces;
    public static final Object mStackTraceLock;

    static {
       GpuMonitor.INSTANCE = new GpuMonitor();
       GpuMonitor.mGpuInfo = new GpuInfo();
       GpuMonitor.mStackTraceLock = new Object();
       GpuMonitor.mGson$delegate = s.c(GpuMonitor$mGson$2.INSTANCE);
       GpuMonitor.mActivityManager$delegate = s.c(GpuMonitor$mActivityManager$2.INSTANCE);
       GpuMonitor.mDf$delegate = s.c(GpuMonitor$mDf$2.INSTANCE);
       GpuMonitor.mLoopStackTraces = new LinkedList();
    }
    public void GpuMonitor(){
       super();
    }
    public static final GpuInfo access$getMGpuInfo$p(GpuMonitor p0){
       return GpuMonitor.mGpuInfo;
    }
    public static final void startSection(String p0){
       a.q(p0, "section");
       GpuMonitor iNSTANCE = GpuMonitor.INSTANCE;
       if (!iNSTANCE.isInitialized()) {
          return;
       }
       iNSTANCE.stopLoop();
       iNSTANCE.getLoopHandler().post(new GpuMonitor$b(p0));
       LoopMonitor.startLoop$default(iNSTANCE, false, false, iNSTANCE.getLoopInterval(), 3, null);
       return;
    }
    public static final void stopSection(String p0){
       a.q(p0, "section");
       GpuMonitor iNSTANCE = GpuMonitor.INSTANCE;
       if (!iNSTANCE.isInitialized()) {
          return;
       }
       iNSTANCE.stopLoop();
       iNSTANCE.getLoopHandler().post(new GpuMonitor$c(p0));
       return;
    }
    public LoopMonitor$b call(){
       GpuInfo$SampleData currentSampl = this.getCurrentSampleData();
       if (currentSampl != null) {
          GpuInfo mGpuInfo = GpuMonitor.mGpuInfo;
          Objects.requireNonNull(mGpuInfo);
          a.q(currentSampl, "sampleData");
          int i = 1;
          if (mGpuInfo.c != i) {
             h.g("GpuUploadData", "data status error ## addSampleData ## current status : "+mGpuInfo.c);
             mGpuInfo.c = 4;
          }else {
             mGpuInfo.i = currentSampl;
             mGpuInfo.k = mGpuInfo.k + i;
             if (mGpuInfo.j.size() < 20) {
                mGpuInfo.j.add(currentSampl);
             }
          }
       }
       return LoopMonitor$b$a.a;
    }
    public Object call(){
       return this.call();
    }
    public final void clearStackTraceList(){
       Object mStackTraceL = GpuMonitor.mStackTraceLock;
       _monitor_enter(mStackTraceL);
       GpuMonitor.mLoopStackTraces.clear();
       _monitor_exit(mStackTraceL);
    }
    public final GpuInfo$SampleData getCurrentSampleData(){
       String str1;
       GpuInfo$SampleData sampleData = new GpuInfo$SampleData();
       sampleData.gpuBusy = b.h.a();
       Object mStackTraceL = GpuMonitor.mStackTraceLock;
       _monitor_enter(mStackTraceL);
       GpuMonitor iNSTANCE = GpuMonitor.INSTANCE;
       if (sampleData.gpuBusy - iNSTANCE.getMonitorConfig().d > 0) {
          long l = System.currentTimeMillis();
          int i = 1;
          ActivityManager mActivityMan = iNSTANCE.getMActivityManager();
          if (mActivityMan != null) {
             int[] ointArray = new int[i];
             int i1 = 0;
             ointArray[i1] = Process.myPid();
             Debug$MemoryInfo[] processMemor = mActivityMan.getProcessMemoryInfo(ointArray);
             if (processMemor != null) {
                object oobject = processMemor[i1];
                if (oobject != null) {
                   double d = 1024.00f;
                   if (Build$VERSION.SDK_INT >= 23) {
                      String memoryStat = oobject.getMemoryStat("summary.graphics");
                      a.h(memoryStat, "memInfo.getMemoryStat\(STAT\)");
                      String str = iNSTANCE.getMDf().format((Double.parseDouble(memoryStat) / d));
                      a.h(str, "mDf.format\( memInfo.getM¡­\(STAT\).toDouble\(\)/ KB2MB\)");
                      sampleData.graphicsMemory = Double.parseDouble(str);
                   }
                   str1 = iNSTANCE.getMDf().format(((double)oobject.nativePss / d));
                   a.h(str1, "mDf.format\(memInfo.nativePss.toDouble\(\)/ KB2MB\)");
                   sampleData.nativePss = Double.parseDouble(str1);
                }
             }
          }
          Result.constructor-impl(l1.a);
          sampleData.collectCostMs = System.currentTimeMillis() - l;
          c uoc = new c(0, null, 3, null);
          LinkedList mLoopStackTr = GpuMonitor.mLoopStackTraces;
          if (mLoopStackTr.size() > GpuMonitor.INSTANCE.getMonitorConfig().e) {
             mLoopStackTr.removeFirst();
          }
          c uoc1 = CollectionsKt___CollectionsKt.e3(mLoopStackTr);
          c stackTraceDe = str1.stackTraceDetail;
          c stackTraceDe1 = (uoc1 != null)? uoc1.stackTraceDetail: null;
          if (a.g(stackTraceDe, stackTraceDe1)) {
             uoc1.repeatCount = uoc1.repeatCount + i;
             uoc1.endTimestamp = str1.startTimestamp;
             _monitor_exit(mStackTraceL);
             return sampleData;
          }else {
             mLoopStackTr.add(str1);
          }
       }
       _monitor_exit(mStackTraceL);
       return sampleData;
    }
    public long getLoopInterval(){
       return this.getMonitorConfig().c;
    }
    public final ActivityManager getMActivityManager(){
       return GpuMonitor.mActivityManager$delegate.getValue();
    }
    public final DecimalFormat getMDf(){
       return GpuMonitor.mDf$delegate.getValue();
    }
    public final Gson getMGson(){
       return GpuMonitor.mGson$delegate.getValue();
    }
    public final c[] getStackTraceList(){
       Object mStackTraceL = GpuMonitor.mStackTraceLock;
       _monitor_enter(mStackTraceL);
       c[] uocArray = new c[0];
       Object[] objArray = GpuMonitor.mLoopStackTraces.toArray(uocArray);
       if (objArray == null) {
          throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
       }
       _monitor_exit(mStackTraceL);
       return objArray;
    }
    public void init(d p0,a p1){
       a.q(p0, "commonConfig");
       a.q(p1, "monitorConfig");
       super.init(p0, p1);
       GpuInfo mGpuInfo = GpuMonitor.mGpuInfo;
       if (!mGpuInfo.b() && (!mGpuInfo.c() && p1.f == null)) {
          return;
       }
       k.b().registerActivityLifecycleCallbacks(new GpuMonitor$a(p1));
       return;
    }
    public void init(d p0,Object p1){
       this.init(p0, p1);
    }
    public final void uploadGpuInfo(Map p0){
       GpuInfo a;
       GpuInfo mGpuInfo = GpuMonitor.mGpuInfo;
       int i = 4;
       if (mGpuInfo.c != 2) {
          h.g("GpuMonitor", "data status error ## uploadData ## current status : "+mGpuInfo.c);
          mGpuInfo.c = i;
          return;
       }else if(mGpuInfo.k <= null){
          h.g("GpuMonitor", "uploadData ## data sample count not enough");
          mGpuInfo.c = i;
          return;
       }else if(!mGpuInfo.d()){
          h.g("GpuMonitor", "uploadData ## data sample not valid");
          mGpuInfo.c = i;
          return;
       }else {
          String str = null;
          if (mGpuInfo.b()) {
             str = "kgsl";
          }else if(mGpuInfo.c()){
             str = "mali";
          }
          JSONObject jSONObject = mGpuInfo.a(p0);
          if (jSONObject != null) {
             if (str != null) {
                jSONObject.put("arch", str);
             }
             int i1 = 1;
             if (mGpuInfo.c()) {
                a = mGpuInfo.a;
                if (a.isEmpty() ^ i1) {
                   jSONObject.put("tempGpuInfo", GpuMonitor.INSTANCE.getMGson().q(a));
                }
             }
             GpuMonitor iNSTANCE = GpuMonitor.INSTANCE;
             c[] stackTraceLi = iNSTANCE.getStackTraceList();
             int i2 = (!stackTraceLi.length)? 1: 0;
             if (i1 ^ i2) {
                jSONObject.put("stackTraceSample", iNSTANCE.getMGson().q(stackTraceLi));
             }
             String str1 = jSONObject.toString();
             a.h(str1, "uploadJson.toString\(\)");
             d$a.b(i.a, "gpu_info", str1, false, 4, null);
             h.d("GpuMonitor", str1);
             mGpuInfo.c = 3;
             Result.constructor-impl(l1.a);
             return;
          }else {
             h.g("GpuMonitor", "uploadData ## get json data error");
             mGpuInfo.c = i;
             return;
          }
       }
    }
}
