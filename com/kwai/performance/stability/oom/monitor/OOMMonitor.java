package com.kwai.performance.stability.oom.monitor.OOMMonitor;
import androidx.lifecycle.LifecycleEventObserver;
import com.kwai.performance.monitor.base.loop.LoopMonitor;
import com.kwai.performance.stability.oom.monitor.tracker.OOMTracker;
import com.kwai.performance.stability.oom.monitor.tracker.VssOOMTracker;
import com.kwai.performance.stability.oom.monitor.tracker.HeapOOMTracker;
import com.kwai.performance.stability.oom.monitor.tracker.ThreadOOMTracker;
import com.kwai.performance.stability.oom.monitor.tracker.FdOOMTracker;
import com.kwai.performance.stability.oom.monitor.tracker.PhysicalMemoryOOMTracker;
import com.kwai.performance.stability.oom.monitor.tracker.FastHugeMemoryOOMTracker;
import com.kwai.performance.stability.oom.monitor.tracker.ManualTriggerTracker;
import java.lang.Object;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.ArrayList;
import java.lang.String;
import yf7.h;
import java.io.File;
import com.kwai.performance.stability.oom.monitor.OOMFileManager;
import kotlin.jvm.internal.a;
import com.kwai.performance.monitor.base.MonitorBuildConfig;
import zsd.u;
import java.lang.StringBuilder;
import com.kwai.performance.monitor.base.Monitor;
import com.kwai.performance.stability.oom.monitor.OOMMonitorConfig;
import com.kwai.performance.stability.oom.monitor.OOMHprofUploader$HprofType;
import com.kwai.performance.stability.oom.monitor.OOMHprofUploader;
import java.lang.Exception;
import com.kwai.performance.monitor.base.loop.LoopMonitor$b;
import android.os.Build$VERSION;
import com.kwai.performance.monitor.base.loop.LoopMonitor$b$b;
import kotlin.Result;
import android.os.StatFs;
import com.google.gson.JsonObject;
import kh7.d;
import com.google.gson.JsonElement;
import java.util.Date;
import com.kwai.performance.stability.hprof.dump.ForkJvmHeapDumper;
import java.lang.Thread;
import kh7.c;
import msd.l;
import kh7.a;
import java.lang.CharSequence;
import java.nio.charset.Charset;
import kotlin.io.FilesKt__FileReadWriteKt;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import qrd.l1;
import java.lang.Throwable;
import qrd.j0;
import com.kwai.performance.monitor.base.d;
import android.os.SystemClock;
import com.kwai.performance.stability.oom.monitor.OOMPreferenceManager;
import java.util.Objects;
import ch7.i;
import android.app.Application;
import java.lang.Class;
import hh7.b;
import ih7.a;
import fh7.f;
import fh7.b;
import fh7.a;
import gh7.a;
import eh7.a;
import java.util.Arrays;
import java.util.Collection;
import ch7.d;
import fh7.e;
import fh7.d;
import hh7.d;
import java.lang.System;
import java.util.Iterator;
import dh7.b;
import ch7.h;
import android.content.ComponentCallbacks;
import yf7.k;
import kh7.b;
import android.app.Application$ActivityLifecycleCallbacks;
import com.kwai.performance.stability.oom.monitor.tracker.JeMallocHackOOMTracker;
import yf7.p;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;
import kh7.e;
import java.lang.Enum;
import java.lang.Runnable;
import com.kwai.performance.stability.oom.monitor.OOMMonitor$a;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import java.util.Set;
import yf7.i;
import yf7.d;
import yf7.d$a;
import oe6.g;
import lh7.a;
import android.app.Activity;
import com.kwai.performance.stability.oom.monitor.analysis.HeapAnalysisService;
import com.kwai.performance.stability.oom.monitor.OOMMonitor$b;
import android.content.Context;
import com.kwai.performance.stability.oom.monitor.analysis.AnalysisReceiver$b;
import com.kwai.performance.stability.oom.monitor.analysis.HeapAnalysisService$a;
import yf7.r;
import android.os.Handler;
import com.kwai.performance.stability.oom.monitor.OOMMonitor$startLoop$2;
import java.lang.RuntimeException;
import mh7.a;
import mh7.a$b;
import nsd.u;
import mh7.a$d;
import mh7.a$c;
import java.lang.Runtime;
import com.kwai.performance.stability.oom.monitor.tracker.model.SystemInfo$refresh$1;
import com.kwai.performance.stability.oom.monitor.tracker.model.SystemInfo$refresh$2;
import com.kwai.performance.stability.oom.monitor.OOMMonitor$trackOOM$1;
import msd.a;
import com.kwai.performance.monitor.base.Monitor_ThreadKt;
import com.kwai.performance.monitor.base.loop.LoopMonitor$b$a;

public final class OOMMonitor extends LoopMonitor implements LifecycleEventObserver	// class@00124e
{
    public static final OOMMonitor INSTANCE;
    public static List mForegroundPendingRunnables;
    public static boolean mHasAnalysedLatestHprof;
    public static boolean mHasDumped;
    public static boolean mIsLoopPendingStart;
    public static boolean mIsLoopStarted;
    public static long mMonitorInitTime;
    public static final List mOOMTrackers;
    public static final List mTrackReasons;

    static {
       OOMMonitor.INSTANCE = new OOMMonitor();
       OOMTracker[] oOMTrackerAr = new OOMTracker[]{new VssOOMTracker(),new HeapOOMTracker(),new ThreadOOMTracker(),new FdOOMTracker(),new PhysicalMemoryOOMTracker(),new FastHugeMemoryOOMTracker(),new ManualTriggerTracker()};
       OOMMonitor.mOOMTrackers = CollectionsKt__CollectionsKt.P(oOMTrackerAr);
       OOMMonitor.mTrackReasons = new ArrayList();
       OOMMonitor.mForegroundPendingRunnables = new ArrayList();
    }
    public void OOMMonitor(){
       super();
    }
    public static final List access$getMTrackReasons$p(OOMMonitor p0){
       return OOMMonitor.mTrackReasons;
    }
    public final void analysisLatestHprofFile(){
       OOMMonitorConfig u;
       boolean b = true;
       try{
          if (OOMMonitor.mHasAnalysedLatestHprof) {
             return;
          }else {
             h.d("OOMMonitor", "analysisLatestHprofFile");
             OOMMonitor.mHasAnalysedLatestHprof = b;
             File[] uFileArray = OOMFileManager.g().listFiles();
             if (uFileArray == null) {
                uFileArray = new File[false];
             }
             int len = uFileArray.length;
             int i = 0;
             String str = ".hprof";
             String str1 = "hprofFile";
             Object obj = null;
             String str2 = "hprofFile.canonicalPath";
             while (i < len) {
                object oobject = uFileArray[i];
                if (oobject.exists()) {
                   a.o(oobject, str1);
                   str1 = oobject.getName();
                   a.o(str1, "hprofFile.name");
                   if (!u.q2(str1, MonitorBuildConfig.h(), false, 2, obj)) {
                      h.d("OOMMonitor", "delete other version files");
                      oobject.delete();
                   }else {
                      str1 = oobject.getCanonicalPath();
                      a.o(str1, str2);
                      if (u.H1(str1, str, false, 2, obj)) {
                         String canonicalPat = oobject.getCanonicalPath();
                         a.o(canonicalPat, str2);
                         File uFile = new File(u.g2(canonicalPat, ".hprof", ".json", false, 4, null));
                         String canonicalPat1 = oobject.getCanonicalPath();
                         a.o(canonicalPat1, str2);
                         File uFile1 = new File(u.g2(canonicalPat1, ".hprof", ".txt", false, 4, null));
                         if (!uFile.exists()) {
                            h.d("OOMMonitor", "retry analysis, json not exist, then start service");
                            uFile.createNewFile();
                            this.startAnalysisService(oobject, uFile, uFile1, "reanalysis", null);
                         }else if(!uFile.length() - null){
                            h.e("OOMMonitor", "retry analysis, json file exists but length 0, this means  koom crashed in last analysis, so delete the files", b);
                            uFile.delete();
                            oobject.delete();
                         }else {
                            h.d("OOMMonitor", "retry analysis, json file length normal, this means it is success in last analysis, delete hprof and json files");
                            uFile.delete();
                            oobject.delete();
                         }
                      }
                   }
                }
                i = i + 1;
             }
             uFileArray = OOMFileManager.h().listFiles();
             if (uFileArray == null) {
                uFileArray = new File[false];
             }
             len = uFileArray.length;
             i = 0;
             while (i < len) {
                object oobject1 = uFileArray[i];
                a.o(oobject1, str1);
                String canonicalPat2 = oobject1.getCanonicalPath();
                a.o(canonicalPat2, str2);
                if (u.H1(canonicalPat2, str, false, 2, obj)) {
                   h.d("OOMMonitor", "OOM Dump upload:"+oobject1.getAbsolutePath());
                   u = this.getMonitorConfig().u;
                   if (u != null) {
                      u.a(oobject1, OOMHprofUploader$HprofType.STRIPPED);
                   }
                }
                i = i + 1;
             }
          }
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
          h.c("OOMMonitor", "retryAnalysisFailed: "+e0.getMessage(), b);
       }
       return;
    }
    public LoopMonitor$b call(){
       if (Build$VERSION.SDK_INT > 30) {
          return LoopMonitor$b$b.a;
       }
       if (OOMMonitor.mHasDumped) {
          return LoopMonitor$b$b.a;
       }
       return this.trackOOM();
    }
    public Object call(){
       return this.call();
    }
    public final void dumpAndAnalysis(){
       String str2;
       h.d("OOMMonitor", "dumpAndAnalysis");
       StatFs statFs = new StatFs(OOMFileManager.g().getCanonicalPath());
       long blockSizeLon = statFs.getBlockSizeLong();
       String str = null;
       String str1 = ((double)(blockSizeLon * (long)statFs.getAvailableBlocks()) - 0x4133333333333333 > 0)? 1: null;
       if (!str1) {
          h.c("OOMMonitor", "available space not enough", true);
       }else if(OOMMonitor.mHasDumped){
          return;
       }else {
          OOMMonitor.mHasDumped = true;
          OOMMonitorConfig w = this.getMonitorConfig().w;
          l ol = null;
          if (w != null) {
             JsonObject jsonObject = new JsonObject();
             w.a(jsonObject);
             str2 = jsonObject.toString();
          }else {
             str2 = ol;
          }
          Date uDate = new Date();
          File uFile = OOMFileManager.e(uDate);
          File uFile1 = OOMFileManager.c(uDate);
          File uFile2 = OOMFileManager.b(uDate);
          uFile2.createNewFile();
          uFile2.setWritable(true);
          uFile2.setReadable(true);
          h.d("OOMMonitor", "hprof analysis dir:"+OOMFileManager.g());
          new ForkJvmHeapDumper().dump(uFile2.getAbsolutePath());
          h.e("OOMMonitor", "end hprof dump", true);
          Thread.sleep(1000);
          h.d("OOMMonitor", "start hprof analysis");
          c.a.a(uFile2, true, "leak", ol);
          str1 = a.b.b();
          if (!str1.length()) {
             str = 1;
          }
          if (str == null) {
             FilesKt__FileReadWriteKt.G(uFile1, str1, ol, 2, ol);
          }
          this.startAnalysisService(uFile2, uFile, uFile1, CollectionsKt___CollectionsKt.V2(OOMMonitor.mTrackReasons, null, null, null, 0, null, null, 63, null), str2);
       }
       Throwable obj = Result.constructor-impl(l1.a);
       obj = Result.exceptionOrNull-impl(obj);
       if (obj != null) {
          h.e("OOMMonitor", "onJvmThreshold Exception "+obj.getMessage(), true);
       }
       return;
    }
    public long getLoopInterval(){
       return this.getMonitorConfig().i;
    }
    public void init(d p0,OOMMonitorConfig p1){
       int i;
       b uob;
       a.p(p0, "commonConfig");
       a.p(p1, "monitorConfig");
       super.init(p0, p1);
       OOMMonitor.mMonitorInitTime = SystemClock.elapsedRealtime();
       l ol = p0.f();
       Objects.requireNonNull(OOMPreferenceManager.d);
       a.p(ol, "sharedPreferencesInvoker");
       OOMPreferenceManager.b = ol;
       OOMPreferenceManager.c = MonitorBuildConfig.h()+'_';
       l ol1 = p0.e();
       a.p(ol1, "rootDirInvoker");
       OOMFileManager.a = ol1;
       OOMFileManager.b = MonitorBuildConfig.h()+'_';
       i oi = i.d();
       Application uApplication = p0.a();
       OOMMonitorConfig v = p1.v;
       Objects.requireNonNull(oi);
       if (v == null) {
          h.g("LeakFixer", "Config is null to disable");
       }else {
          oi.e = v;
          Class[] uClassArray = new Class[]{b.class,a.class,f.class,b.class,a.class,a.class,a.class};
          i = 0;
          int i1 = 1;
          int i2 = 2;
          ArrayList uArrayList = new ArrayList(Arrays.asList(uClassArray));
          if (oi.e.e != null) {
             uClassArray = new Class[]{e.class,d.class,d.class};
             uArrayList.addAll(Arrays.asList(uClassArray));
          }
          if (!oi.e.d.isEmpty()) {
             uArrayList.addAll(oi.e.d);
          }
          if (!uArrayList.isEmpty()) {
             oi.a = uApplication;
             long l = System.currentTimeMillis();
             Iterator iterator1 = uArrayList.iterator();
             while (iterator1.hasNext()) {
                Class uClass = iterator1.next();
                try{
                   uob = uClass.newInstance();
                   if (!uob.d() || !uob.c()) {
                      continue ;
                   }
                }catch(java.lang.Exception e7){
                   h.g("LeakFixer", "Class "+uClass+" newInstance error, "+e7);
                   goto label_00e3 ;
                }
                uob.a(uApplication);
                oi.b.add(uob);
             }
             h.d("LeakFixer", "init cost "+(System.currentTimeMillis() - l)+" ms, fixer count "+oi.b.size());
             if (oi.b.size()) {
                uApplication.registerComponentCallbacks(new h(oi));
             }
          }
       }
       if (p1.j != null) {
          uApplication = k.b();
          Objects.requireNonNull(a.b);
          a.p(uApplication, "context");
          uApplication.registerActivityLifecycleCallbacks(new b());
       }
       if (p1.l != null) {
          OOMMonitor.mOOMTrackers.add(new JeMallocHackOOMTracker());
       }
       Iterator iterator = OOMMonitor.mOOMTrackers.iterator();
       while (iterator.hasNext()) {
          iterator.next().init(p0, p1);
       }
       p.c(k.b(), this);
       return;
    }
    public void init(d p0,Object p1){
       this.init(p0, p1);
    }
    public final boolean isExceedAnalysisPeriod(){
       OOMPreferenceManager d = OOMPreferenceManager.d;
       h.d("OOMMonitor", "OOMPreferenceManager.getFirstAnalysisTime\(\):"+d.b());
       boolean b = false;
       if (MonitorBuildConfig.b()) {
          return b;
       }
       if ((System.currentTimeMillis() - d.b()) - (long)this.getMonitorConfig().b > 0) {
          b = true;
       }
       if (b) {
          h.b("OOMMonitor", "current version is out of max analysis period!");
       }
       return b;
    }
    public final boolean isExceedAnalysisTimes(){
       OOMPreferenceManager d = OOMPreferenceManager.d;
       h.d("OOMMonitor", "OOMPreferenceManager.getAnalysisTimes:"+d.a());
       boolean b = false;
       if (MonitorBuildConfig.b()) {
          return b;
       }
       if (d.a() > this.getMonitorConfig().a) {
          b = true;
       }
       if (b) {
          h.b("OOMMonitor", "current version is out of max analysis times!");
       }
       return b;
    }
    public void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       a.p(p0, "source");
       a.p(p1, "event");
       int i = e.a[p1.ordinal()];
       if (i != 1) {
          if (i == 2) {
             OOMMonitor.mIsLoopPendingStart = OOMMonitor.mIsLoopStarted;
             this.stopLoop();
          }
       }else if(!OOMMonitor.mHasDumped && OOMMonitor.mIsLoopPendingStart){
          LoopMonitor.startLoop$default(this, false, false, 0, 7, null);
       }
       Iterator iterator = OOMMonitor.mForegroundPendingRunnables.iterator();
       while (iterator.hasNext()) {
          iterator.next().run();
       }
       OOMMonitor.mForegroundPendingRunnables.clear();
       return;
    }
    public final void startAnalysisService(File p0,File p1,File p2,String p3,String p4){
       StringBuilder str1;
       String c;
       boolean b = true;
       if (!p0.length() - null) {
          p0.delete();
          h.e("OOMMonitor", "hprof file size 0", b);
          return;
       }else if(!p.b(k.b())){
          h.b("OOMMonitor", "not foreground");
          OOMMonitor$a uoa = new OOMMonitor$a(p0, p1, p2, p3, p4);
          OOMMonitor.mForegroundPendingRunnables.add(v7);
          return;
       }else {
          OOMPreferenceManager d = OOMPreferenceManager.d;
          SharedPreferences$Editor uEditor = d.c().edit();
          SharedPreferences sharedPrefer = d.c();
          a.o(uEditor, "it");
          _monitor_enter(d);
          String str = null;
          a.q(sharedPrefer, "$this$allKeys");
          Iterator iterator = k.c.c().d.invoke(sharedPrefer).iterator();
          while (iterator.hasNext()) {
             str1 = iterator.next();
             c = OOMPreferenceManager.c;
             if (c == null) {
                a.S("mPrefix");
             }
             if (!u.q2(str1, c, false, 2, str)) {
                uEditor.remove(str1);
             }
          }
          Throwable obj = Result.constructor-impl(l1.a);
          obj = Result.exceptionOrNull-impl(obj);
          if (obj != null) {
             d$a.c(i.a, "OOMPreferenceManager_clearUnusedPreference", obj.getMessage(), false, 4, null);
          }
          _monitor_exit(d);
          String str2 = "";
          str1 = OOMPreferenceManager.c;
          if (str1 == null) {
             a.S("mPrefix");
          }
          str2 = str2+str1+"times";
          SharedPreferences sharedPrefer1 = d.c();
          str1 = "";
          c = OOMPreferenceManager.c;
          if (c == null) {
             a.S("mPrefix");
          }
          g.a(uEditor.putInt(str2, (sharedPrefer1.getInt(str1+c+"times", false) + b)));
          a uoa1 = new a();
          uoa1.a = p3;
          Activity uActivity = p.a(k.b());
          if (uActivity != null) {
             str = uActivity.getLocalClassName();
          }
          if (str == null) {
             str = "";
          }
          uoa1.c = str;
          uoa1.b = String.valueOf(((SystemClock.elapsedRealtime() - OOMMonitor.mMonitorInitTime) / (long)1000));
          uoa1.d = p4;
          String canonicalPat = p0.getCanonicalPath();
          a.o(canonicalPat, "hprofFile.canonicalPath");
          String canonicalPat1 = p1.getCanonicalPath();
          a.o(canonicalPat1, "jsonFile.canonicalPath");
          String absolutePath = p2.getAbsolutePath();
          a.o(absolutePath, "extraFile.absolutePath");
          HeapAnalysisService.i.a(k.b(), canonicalPat, canonicalPat1, absolutePath, uoa1, new OOMMonitor$b(p0, p1));
          return;
       }
    }
    public void startLoop(boolean p0,boolean p1,long p2){
       if (this.isInitialized()) {
          if (!r.b()) {
             return;
          }
          h.d("OOMMonitor", "startLoop\(\)");
          if (OOMMonitor.mIsLoopStarted) {
             return;
          }
          OOMMonitor.mIsLoopStarted = true;
          super.startLoop(p0, p1, p2);
          this.getLoopHandler().postDelayed(OOMMonitor$startLoop$2.b, p2);
          return;
       }else if(!MonitorBuildConfig.b()){
          return;
       }else {
          throw new RuntimeException("Monitor is not initialized");
       }
    }
    public void stopLoop(){
       if (this.isInitialized()) {
          if (!r.b()) {
             return;
          }
          super.stopLoop();
          h.d("OOMMonitor", "stopLoop\(\)");
          OOMMonitor.mIsLoopStarted = false;
          return;
       }else if(!MonitorBuildConfig.b()){
          return;
       }else {
          throw new RuntimeException("Monitor is not initialized");
       }
    }
    public final LoopMonitor$b trackOOM(){
       a p = a.p;
       Objects.requireNonNull(p);
       h.d("SystemInfo", "refresh system memory info");
       a.o = a.n;
       a.m = a.l;
       a.j = a.i;
       a$b uob = new a$b(0, 0, 0, 0, 0, 31, null);
       a.n = v0;
       a$d uod = new a$d(0, 0, 0, 7, null);
       a.i = v1;
       a$c uoc = new a$c(0, 0, 0, 0, 0, 0, 63, null);
       a.l = v1;
       v0.g(Runtime.getRuntime().maxMemory());
       a.n.i(Runtime.getRuntime().totalMemory());
       a.n.f(Runtime.getRuntime().freeMemory());
       a$b n = a.n;
       n.j((n.d() - a.n.a()));
       n = a.n;
       n.h((((float)n.e() * 0x3f800000) / (float)a.n.b()));
       int i = 1;
       a.a(p, new File("/proc/self/status"), null, SystemInfo$refresh$1.INSTANCE, i, null);
       a.a(p, new File("/proc/meminfo"), null, SystemInfo$refresh$2.INSTANCE, i, null);
       a$c l = a.l;
       l.f = ((float)l.a() * 0x3f800000) / (float)a.l.c();
       float f = (float)100;
       h.d("SystemInfo", "----OOM Monitor Memory----\n"+"[java] max:"+a.n.b()+" used ratio:"+(int)(a.n.c() * f)+"%\n"+"[proc] VmSize:"+a.i.c()+"kB VmRss:"+a.i.a()+"kB Threads:"+a.i.b()+10+"[meminfo] MemTotal:"+a.l.c()+"kB MemFree:"+a.l.b+"kB MemAvailable:"+a.l.a()+"kB "+"avaliable ratio:"+(int)(a.l.b() * f)+"% CmaTotal:"+a.l.e+"kB ION_heap:"+a.l.d+"kB\n");
       OOMMonitor.mTrackReasons.clear();
       Iterator iterator = OOMMonitor.mOOMTrackers.iterator();
       while (iterator.hasNext()) {
          OOMTracker oOMTracker = iterator.next();
          if (oOMTracker.track()) {
             OOMMonitor.mTrackReasons.add(oOMTracker.reason());
          }
       }
       int i1 = 1;
       if (!(OOMMonitor.mTrackReasons.isEmpty() ^ i1) || this.getMonitorConfig().j == null) {
          return LoopMonitor$b$a.a;
       }
       if (this.isExceedAnalysisPeriod() || this.isExceedAnalysisTimes()) {
          h.b("OOMMonitor", "Triggered, but exceed analysis times or period!");
       }else {
          Monitor_ThreadKt.b(0, OOMMonitor$trackOOM$1.INSTANCE, i1, null);
       }
       return LoopMonitor$b$b.a;
    }
}
