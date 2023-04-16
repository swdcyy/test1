package com.kwai.performance.fluency.jank.monitor.JankMonitor;
import com.kwai.performance.monitor.base.Monitor;
import java.util.HashMap;
import java.util.ArrayList;
import com.kwai.performance.fluency.jank.monitor.LogRecordQueue;
import java.lang.Thread;
import org.json.JSONArray;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.List;
import java.lang.StackTraceElement;
import java.util.Iterator;
import org.json.JSONObject;
import com.kwai.apm.message.FastUnwindBackTraceElement;
import java.lang.Boolean;
import com.kwai.performance.stability.crash.monitor.util.BacktraceUtil;
import bf7.a;
import yf7.w;
import yf7.j;
import yf7.g;
import java.util.Objects;
import java.util.concurrent.locks.Lock;
import com.kwai.performance.fluency.jank.monitor.LogRecordQueue$PackedRecord;
import zsd.u;
import qrd.l1;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kwai.performance.fluency.jank.monitor.collector.StackTraceCollector;
import android.view.Choreographer;
import android.view.Choreographer$FrameCallback;
import android.os.Handler;
import af7.a;
import af7.c;
import java.lang.Iterable;
import kotlin.collections.ArraysKt___ArraysKt;
import java.util.Map;
import java.util.Collections;
import com.kwai.performance.fluency.jank.monitor.JankMonitorConfig;
import java.lang.System;
import kotlin.collections.CollectionsKt___CollectionsKt;
import ekd.v0;
import com.kwai.performance.monitor.base.d;
import df7.c;
import msd.l;
import java.io.File;
import af7.b;
import android.os.HandlerThread;

public final class JankMonitor extends Monitor	// class@001083
{
    public static final JankMonitor INSTANCE;
    public static final HashMap mActivityFrameDetectorMap;
    public static final List mGlobalJankPrinter;
    public static Boolean mIsUnwindInit;
    public static final LogRecordQueue mLogQueue;

    static {
       JankMonitor.INSTANCE = new JankMonitor();
       JankMonitor.mActivityFrameDetectorMap = new HashMap();
       JankMonitor.mGlobalJankPrinter = new ArrayList();
       JankMonitor.mLogQueue = new LogRecordQueue();
    }
    public void JankMonitor(){
       super();
    }
    public static final JSONArray getStackTrace(Thread p0,boolean p1,boolean p2){
       JSONObject jSONObject;
       a.p(p0, "thread");
       Object[] threadStackT = JankMonitor.getThreadStackTrace(p0, p1, p2);
       ArrayList uArrayList = new ArrayList();
       int len = threadStackT.length;
       int i = 0;
       int i1 = 0;
       while (i1 < len) {
          object oobject = threadStackT[i1];
          i1 = i1 + 1;
          uArrayList.add(oobject);
          if (oobject instanceof StackTraceElement && (a.g(oobject.getClassName(), "android.os.Looper") && a.g(oobject.getMethodName(), "loop"))) {
             break ;
          }
       }
       JSONArray jSONArray = new JSONArray();
       Iterator iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          String str = "mIndex";
          String str1 = "at ";
          String str2 = "mMethodName";
          String str3 = "mLineNumber";
          String str4 = "mFileName";
          String str5 = "mDeclaringClass";
          if (obj instanceof StackTraceElement) {
             jSONObject = new JSONObject();
             jSONObject.put(str5, obj.getClassName());
             jSONObject.put(str4, obj.getFileName());
             jSONObject.put(str3, obj.getLineNumber());
             jSONObject.put(str2, obj.getMethodName());
             jSONObject.put("mIsNative", obj.isNativeMethod());
             jSONObject.put("mLine", a.C(str1, obj));
             i = i + 1;
             jSONObject.put(str, i);
             jSONArray.put(jSONObject);
          }else if(obj instanceof FastUnwindBackTraceElement){
             jSONObject = new JSONObject();
             jSONObject.put(str5, obj.declaringClass);
             jSONObject.put(str4, obj.fileName);
             jSONObject.put(str3, obj.lineNumber);
             jSONObject.put(str2, obj.methodName);
             jSONObject.put("mIsNative", obj.isNative);
             jSONObject.put("mLine", a.C(str1, obj));
             i = i + 1;
             jSONObject.put(str, i);
             jSONObject.put("mPc", obj.pc);
             jSONObject.put("mBuildId", obj.buildId);
             jSONArray.put(jSONObject);
          }
       }
       return jSONArray;
    }
    public static final Object[] getThreadStackTrace(Thread p0,boolean p1,boolean p2){
       Object[] objArray;
       a.p(p0, "thread");
       JankMonitor.INSTANCE.ensureInit();
       if (a.g(JankMonitor.mIsUnwindInit, Boolean.TRUE)) {
          objArray = BacktraceUtil.a(BacktraceUtil.b(p0, null, Boolean.valueOf(p1), Boolean.valueOf(p2)));
          a.o(objArray, "{\n      val traceInfo =\n        BacktraceUtil.getThreadFrameInfo\(\n          thread,\n          null,\n          enableGetThreadLockInfo,\n          enableGetNativeFrames\n        \)\n      BacktraceUtil.frameInfoToTraceElements\(traceInfo\)\n    }");
       }else {
          objArray = p0.getStackTrace();
          a.o(objArray, "{\n      thread.stackTrace\n    }");
       }
       return objArray;
    }
    public static final void optimize(String p0,boolean p1){
       List c;
       a.p(p0, "scene");
       if (p1) {
          _monitor_enter(a.class);
          a.p(p0, "scene");
          c = a.c;
          if (c.isEmpty()) {
             b b = a.b;
             j.a("JankOptimizer", b);
             g.c("JankOptimizer", b);
          }
          c.add(p0);
          _monitor_exit(a.class);
       }else {
          _monitor_enter(a.class);
          a.p(p0, "scene");
          c = a.c;
          c.remove(p0);
          if (c.isEmpty()) {
             j.b("JankOptimizer");
             g.d("JankOptimizer");
          }
          _monitor_exit(a.class);
       }
       return;
    }
    public static final List searchFrameMessages(long p0){
       return JankMonitor.searchFrameMessages$default(p0, false, 2, null);
    }
    public static final List searchFrameMessages(long p0,boolean p1){
       LogRecordQueue logRecordQue;
       LogRecordQueue mLogQueue = JankMonitor.mLogQueue;
       Objects.requireNonNull(mLogQueue);
       ArrayList uArrayList = new ArrayList();
       LogRecordQueue b = mLogQueue.b;
       b.lock();
       if (p1) {
          mLogQueue.b(p0);
       }
       int i = mLogQueue.a.size() - 1;
       if (i >= 0) {
          while (true) {
             int i1 = i - 1;
             LogRecordQueue$PackedRecord packedRecord = mLogQueue.a.get(i);
             uArrayList.add(packedRecord);
             String msg = packedRecord.getMsg();
             boolean b1 = false;
             if (msg != null && u.q2(msg, "<<<<< Finished to Handler \(android.view.Choreographer$FrameHandler\)", b1, 2, null) == true) {
                logRecordQue = 1;
             label_0040 :
                if (logRecordQue) {
                   long l = packedRecord.getNow() - packedRecord.getWall();
                   long now = packedRecord.getNow();
                   v5 = l - p0;
                   if (logRecordQue <= 0 && p0 - now <= 0) {
                      b1 = true;
                   }
                   if (b1) {
                      uArrayList.clear();
                      uArrayList.add(packedRecord);
                   }else if(logRecordQue <= 0){
                      b.unlock();
                      break ;
                   }else {
                      uArrayList.clear();
                   }
                }
                if (i1 >= 0) {
                   i = i1;
                }
             }else {
                logRecordQue = null;
                goto label_0040 ;
             }
          }
          return uArrayList;
       }
       b.unlock();
       goto label_0074 ;
    }
    public static List searchFrameMessages$default(long p0,boolean p1,int p2,Object p3){
       if (p2 & 0x02) {
          p1 = true;
       }
       return JankMonitor.searchFrameMessages(p0, p1);
    }
    public static final LogRecordQueue$PackedRecord searchMessage(long p0){
       return JankMonitor.searchMessage$default(p0, false, 2, null);
    }
    public static final LogRecordQueue$PackedRecord searchMessage(long p0,boolean p1){
       LogRecordQueue mLogQueue = JankMonitor.mLogQueue;
       LogRecordQueue b = mLogQueue.b;
       b.lock();
       if (p1) {
          mLogQueue.b(p0);
       }
       int i = CollectionsKt__CollectionsKt.G(mLogQueue.a);
       LogRecordQueue$PackedRecord packedRecord = null;
       if (i >= 0) {
          while (true) {
             int i1 = i - 1;
             LogRecordQueue$PackedRecord packedRecord1 = mLogQueue.a.get(i);
             if (p0 - packedRecord1.getNow() > 0) {
                b.unlock();
                break ;
             }else {
                long l = packedRecord1.getNow() - packedRecord1.getWall();
                if (p0 - l >= 0) {
                   b.unlock();
                   packedRecord = packedRecord1;
                   break ;
                }else if(i1 < 0){
                label_0042 :
                   b.unlock();
                   break ;
                }else {
                   i = i1;
                }
             }
          }
       }else {
          goto label_0042 ;
       }
       return packedRecord;
    }
    public static LogRecordQueue$PackedRecord searchMessage$default(long p0,boolean p1,int p2,Object p3){
       if (p2 & 0x02) {
          p1 = true;
       }
       return JankMonitor.searchMessage(p0, p1);
    }
    public static final void stackTrace(String p0,boolean p1){
       StackTraceCollector b;
       List d;
       a.p(p0, "scene");
       if (p1) {
          if (StackTraceCollector.c()) {
             LogRecordQueue mLogQueue = JankMonitor.mLogQueue;
             b = StackTraceCollector.b;
             Objects.requireNonNull(mLogQueue);
             a.p(b, "callback");
             LogRecordQueue b1 = mLogQueue.b;
             b1.lock();
             mLogQueue.d.add(b);
             b1.unlock();
          }
          _monitor_enter(StackTraceCollector.class);
          a.p(p0, "scene");
          d = StackTraceCollector.d;
          if (d.isEmpty()) {
             Choreographer.getInstance().postFrameCallback(StackTraceCollector.b);
          }
          d.add(p0);
          _monitor_exit(StackTraceCollector.class);
       }else {
          StackTraceCollector stackTraceCo = StackTraceCollector.class;
          _monitor_enter(stackTraceCo);
          a.p(p0, "scene");
          d = StackTraceCollector.d;
          d.remove(p0);
          if (d.isEmpty()) {
             b = StackTraceCollector.b;
             Choreographer.getInstance().removeFrameCallback(b);
             b.b().removeMessages(1);
             Handler handler = b.b();
             handler.removeMessages(2);
          }
          _monitor_exit(stackTraceCo);
          if (StackTraceCollector.c()) {
             LogRecordQueue mLogQueue1 = JankMonitor.mLogQueue;
             stackTraceCo = StackTraceCollector.b;
             Objects.requireNonNull(mLogQueue1);
             a.p(stackTraceCo, "callback");
             LogRecordQueue b2 = mLogQueue1.b;
             b2.lock();
             mLogQueue1.d.remove(stackTraceCo);
             b2.unlock();
          }
       }
       return;
    }
    public static final void start(String p0,boolean p1,a[] p2){
       List mGlobalJankP;
       a.p(p0, "scene");
       a.p(p2, "jankPrinters");
       HashMap mActivityFra = JankMonitor.mActivityFrameDetectorMap;
       _monitor_enter(mActivityFra);
       int i = 1;
       if (mActivityFra.isEmpty()) {
          mGlobalJankP = JankMonitor.mGlobalJankPrinter;
          if (mGlobalJankP.isEmpty()) {
             LogRecordQueue mLogQueue = JankMonitor.mLogQueue;
             mGlobalJankP.add(new c(mLogQueue, i));
             mGlobalJankP.add(new c(mLogQueue, 2));
          }
          Iterator iterator = mGlobalJankP.iterator();
          while (iterator.hasNext()) {
             JankMonitor.INSTANCE.registerPrinter(iterator.next());
          }
          JankMonitor.mLogQueue.a(i);
       }
       int i1 = (!p2.length)? 1: 0;
       if (i1 ^ i) {
          List list = ArraysKt___ArraysKt.uy(p2);
          JankMonitor.mActivityFrameDetectorMap.put(p0, list);
          Iterator iterator1 = list.iterator();
          while (iterator1.hasNext()) {
             JankMonitor.INSTANCE.registerPrinter(iterator1.next());
          }
       }else {
          mGlobalJankP = Collections.emptyList();
          a.o(mGlobalJankP, "emptyList\(\)");
          JankMonitor.mActivityFrameDetectorMap.put(p0, mGlobalJankP);
       }
       JankMonitor.stackTrace(p0, p1);
       _monitor_exit(mActivityFra);
       return;
    }
    public static void start$default(String p0,boolean p1,a[] p2,int p3,Object p4){
       if (p3 & 0x02) {
          p1 = false;
       }
       JankMonitor.start(p0, p1, p2);
       return;
    }
    public static final void stop(String p0){
       a.p(p0, "scene");
       HashMap mActivityFra = JankMonitor.mActivityFrameDetectorMap;
       _monitor_enter(mActivityFra);
       List list = mActivityFra.remove(p0);
       if (list != null) {
       }else {
          list = CollectionsKt__CollectionsKt.E();
       }
       Iterator iterator = list.iterator();
       while (iterator.hasNext()) {
          a uoa = iterator.next();
          j.b(uoa.b());
          g.d(uoa.b());
       }
       if (JankMonitor.mActivityFrameDetectorMap.isEmpty()) {
          JankMonitor.mLogQueue.a(false);
          iterator = JankMonitor.mGlobalJankPrinter.iterator();
          while (iterator.hasNext()) {
             a uoa1 = iterator.next();
             j.b(uoa1.b());
             g.d(uoa1.b());
          }
       }
       JankMonitor.stackTrace(p0, false);
       _monitor_exit(mActivityFra);
       if (JankMonitor.INSTANCE.getMonitorConfig().a()) {
          LogRecordQueue mLogQueue = JankMonitor.mLogQueue;
          LogRecordQueue b = mLogQueue.b;
          b.lock();
          Iterator iterator1 = mLogQueue.a.iterator();
          while (iterator1.hasNext()) {
             iterator1.next().toString();
          }
          b.unlock();
       }
       return;
    }
    public static final LogRecordQueue$PackedRecord topMessage(){
       return JankMonitor.topMessage$default(false, 1, null);
    }
    public static final LogRecordQueue$PackedRecord topMessage(boolean p0){
       LogRecordQueue mLogQueue = JankMonitor.mLogQueue;
       LogRecordQueue b = mLogQueue.b;
       b.lock();
       if (p0) {
          mLogQueue.b(System.currentTimeMillis());
       }
       b.unlock();
       return CollectionsKt___CollectionsKt.e3(mLogQueue.a);
    }
    public static LogRecordQueue$PackedRecord topMessage$default(boolean p0,int p1,Object p2){
       if (p1 & 1) {
          p0 = true;
       }
       return JankMonitor.topMessage(p0);
    }
    public final boolean enableDebug(){
       return this.getMonitorConfig().a();
    }
    public final void ensureInit(){
       Boolean mIsUnwindIni = JankMonitor.mIsUnwindInit;
       if (mIsUnwindIni == null) {
          if (this.getMonitorConfig().c == null) {
             JankMonitor.mIsUnwindInit = Boolean.FALSE;
             return;
          }else {
             "plt-base".b("plt-base");
             "plt-unwind".b("plt-unwind");
             "exception-handler".b("exception-handler");
             if (BacktraceUtil.d()) {
                JankMonitor.mIsUnwindInit = Boolean.FALSE;
             }
             JankMonitor.mIsUnwindInit = Boolean.TRUE;
             return;
          }
       }else {
          mIsUnwindIni.booleanValue();
          return;
       }
    }
    public final JankMonitorConfig getConfig$com_kwai_performance_fluency_jank_monitor(){
       return this.getMonitorConfig();
    }
    public void init(d p0,JankMonitorConfig p1){
       a.p(p0, "commonConfig");
       a.p(p1, "monitorConfig");
       super.init(p0, p1);
       l ol = p0.e();
       Objects.requireNonNull(c.a);
       a.p(ol, "rootDirInvoker");
       c.c = ol.invoke("jank_monitor_upload");
       c.b = p1.f;
       b.b.start();
    }
    public void init(d p0,Object p1){
       this.init(p0, p1);
    }
    public final void registerPrinter(a p0){
       if (p0.c() & 0x01) {
          j.a(p0.b(), p0);
       }
       if (p0.c() & 0x02) {
          g.c(p0.b(), p0);
       }
       return;
    }
}
