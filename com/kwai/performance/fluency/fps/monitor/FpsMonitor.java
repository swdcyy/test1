package com.kwai.performance.fluency.fps.monitor.FpsMonitor;
import com.kwai.performance.monitor.base.Monitor;
import java.util.concurrent.ConcurrentHashMap;
import com.kwai.performance.fluency.fps.monitor.FpsMonitor$b;
import java.lang.String;
import android.view.Window$OnFrameMetricsAvailableListener;
import java.lang.Object;
import kotlin.jvm.internal.a;
import android.os.Build$VERSION;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Map;
import pe7.e;
import android.app.Activity;
import msd.p;
import qe7.c;
import qe7.d;
import pe7.b;
import java.lang.Integer;
import android.view.Window;
import qe7.a;
import w1.k;
import com.kwai.performance.fluency.fps.monitor.detector.metrics.MetricsQueue;
import pe7.c;
import xe7.a;
import pe7.a;
import com.kwai.performance.fluency.fps.monitor.detector.gesture.FrameGestureDetector;
import com.kwai.performance.fluency.fps.monitor.detector.jank.JankDetector;
import qe7.b;
import java.lang.IllegalArgumentException;
import com.kwai.performance.fluency.fps.monitor.detector.framemetrics.FrameMetricDetector;
import ue7.b;
import java.util.Collection;
import com.kwai.performance.monitor.base.d;
import msd.a;
import java.lang.Throwable;
import yf7.h;
import com.kwai.performance.fluency.fps.monitor.FpsHandlerThread;
import android.os.HandlerThread;
import com.kwai.performance.fluency.fps.monitor.JankHandlerThread;
import pe7.f;
import se7.a;
import com.kwai.performance.fluency.fps.monitor.FpsMonitor$a;
import qrd.l1;
import ye7.a;
import java.util.Objects;
import com.kwai.performance.fluency.fps.monitor.event.FpsEventV2;
import ye7.b;
import java.lang.System;
import pe7.d;
import com.kwai.performance.fluency.fps.monitor.FpsMonitor$startSectionInternal$3;
import com.kwai.performance.monitor.base.Monitor_ThreadKt;
import java.util.LinkedHashMap;
import msd.l;
import java.lang.Boolean;
import com.kwai.performance.fluency.fps.monitor.FpsMonitor$stopSectionInternal$afterUpload$1;
import android.os.Looper;
import com.kwai.performance.fluency.fps.monitor.FpsMonitor$stopSectionInternal$2;
import java.lang.Thread;
import java.util.Iterator;
import com.kwai.performance.fluency.jank.monitor.uploader.Gsons;
import com.google.gson.Gson;
import com.kwai.performance.monitor.base.MonitorBuildConfig;
import java.util.UUID;
import yf7.i;
import yf7.d;
import yf7.d$a;
import java.lang.Exception;
import java.lang.StringBuilder;

public final class FpsMonitor extends Monitor	// class@000d85
{
    public static final FpsMonitor INSTANCE;
    public static final ConcurrentHashMap mCallbacksMap;
    public static final ConcurrentHashMap mFpsEventMap;
    public static final b mJankCallback;
    public static final ConcurrentHashMap mLastFpsEventMap;
    public static final ConcurrentHashMap mSectionFrameMetricListeners;
    public static final ConcurrentHashMap mWindowFrameDetectorMap;

    static {
       FpsMonitor.INSTANCE = new FpsMonitor();
       FpsMonitor.mWindowFrameDetectorMap = new ConcurrentHashMap();
       FpsMonitor.mCallbacksMap = new ConcurrentHashMap();
       FpsMonitor.mLastFpsEventMap = new ConcurrentHashMap();
       FpsMonitor.mFpsEventMap = new ConcurrentHashMap();
       FpsMonitor.mSectionFrameMetricListeners = new ConcurrentHashMap();
       FpsMonitor.mJankCallback = new FpsMonitor$b();
    }
    public void FpsMonitor(){
       super();
    }
    public static synchronized final void addOnFrameMetricsAvailableListener(String p0,Window$OnFrameMetricsAvailableListener p1){
       _monitor_enter(FpsMonitor.class);
       a.p(p0, "section");
       a.p(p1, "listener");
       if (Build$VERSION.SDK_INT < 24) {
          _monitor_exit(FpsMonitor.class);
          return;
       }else if(!FpsMonitor.INSTANCE.isInitialized()){
          _monitor_exit(FpsMonitor.class);
          return;
       }else {
          ConcurrentHashMap mSectionFram = FpsMonitor.mSectionFrameMetricListeners;
          List list = mSectionFram.get(p0);
          if (list == null) {
             list = new CopyOnWriteArrayList();
             mSectionFram.put(p0, list);
          }
          list.add(p1);
          _monitor_exit(FpsMonitor.class);
          return;
       }
    }
    public static final boolean containsScene(String p0){
       a.p(p0, "scene");
       return e.b(p0);
    }
    public static final void startSection(String p0,Activity p1){
       a.p(p0, "section");
       a.p(p1, "activity");
       FpsMonitor.startSection$default(p0, p1, null, null, null, 28, null);
    }
    public static final void startSection(String p0,Activity p1,p p2){
       a.p(p0, "section");
       a.p(p1, "activity");
       FpsMonitor.startSection$default(p0, p1, p2, null, null, 24, null);
    }
    public static final void startSection(String p0,Activity p1,p p2,c p3){
       a.p(p0, "section");
       a.p(p1, "activity");
       FpsMonitor.startSection$default(p0, p1, p2, p3, null, 16, null);
    }
    public static final void startSection(String p0,Activity p1,p p2,c p3,d p4){
       Window window;
       a.p(p0, "section");
       a.p(p1, "activity");
       if (Build$VERSION.SDK_INT < 24) {
          return;
       }
       FpsMonitor iNSTANCE = FpsMonitor.INSTANCE;
       if (!iNSTANCE.isInitialized()) {
          return;
       }
       if (!b.a(p1)) {
          return;
       }
       Integer sectionVersi = iNSTANCE.getSectionVersion(p0);
       if (sectionVersi == null) {
          return;
       }
       int i = sectionVersi.intValue();
       String str = a.C("FPS-Start-", p0);
       if (!iNSTANCE.showDebugInfo()) {
          window = p1.getWindow();
          a.o(window, "activity.window");
          iNSTANCE.startSectionInternal(p0, window, new a(p3, p4, p2), i);
       }else {
          k.a(str);
          window = p1.getWindow();
          a.o(window, "activity.window");
          iNSTANCE.startSectionInternal(p0, window, new a(p3, p4, p2), i);
          k.b();
       }
       return;
    }
    public static final void startSection(String p0,Window p1){
       a.p(p0, "section");
       FpsMonitor.startSection$default(p0, p1, null, null, null, 28, null);
    }
    public static final void startSection(String p0,Window p1,p p2){
       a.p(p0, "section");
       FpsMonitor.startSection$default(p0, p1, p2, null, null, 24, null);
    }
    public static final void startSection(String p0,Window p1,p p2,c p3){
       a.p(p0, "section");
       FpsMonitor.startSection$default(p0, p1, p2, p3, null, 16, null);
    }
    public static final void startSection(String p0,Window p1,p p2,c p3,d p4){
       a.p(p0, "section");
       if (Build$VERSION.SDK_INT < 24) {
          return;
       }
       FpsMonitor iNSTANCE = FpsMonitor.INSTANCE;
       if (!iNSTANCE.isInitialized()) {
          return;
       }
       if (p1 == null) {
          return;
       }
       if (!b.b(p1)) {
          return;
       }
       Integer sectionVersi = iNSTANCE.getSectionVersion(p0);
       if (sectionVersi == null) {
          return;
       }
       int i = sectionVersi.intValue();
       String str = a.C("FPS-Start-", p0);
       if (!iNSTANCE.showDebugInfo()) {
          iNSTANCE.startSectionInternal(p0, p1, new a(p3, p4, p2), i);
       }else {
          k.a(str);
          iNSTANCE.startSectionInternal(p0, p1, new a(p3, p4, p2), i);
          k.b();
       }
       return;
    }
    public static void startSection$default(String p0,Activity p1,p p2,c p3,d p4,int p5,Object p6){
       if (p5 & 0x04) {
          p2 = null;
       }
       if (p5 & 0x08) {
          p3 = null;
       }
       if (p5 & 0x10) {
          p4 = null;
       }
       FpsMonitor.startSection(p0, p1, p2, p3, p4);
       return;
    }
    public static void startSection$default(String p0,Window p1,p p2,c p3,d p4,int p5,Object p6){
       if (p5 & 0x04) {
          p2 = null;
       }
       if (p5 & 0x08) {
          p3 = null;
       }
       if (p5 & 0x10) {
          p4 = null;
       }
       FpsMonitor.startSection(p0, p1, p2, p3, p4);
       return;
    }
    public static final void stopSection(String p0,Activity p1){
       Window window;
       a.p(p0, "section");
       a.p(p1, "activity");
       if (Build$VERSION.SDK_INT < 24) {
          return;
       }
       FpsMonitor iNSTANCE = FpsMonitor.INSTANCE;
       if (!iNSTANCE.isInitialized()) {
          return;
       }
       if (!b.a(p1)) {
          return;
       }
       Integer sectionVersi = iNSTANCE.getSectionVersion(p0);
       if (sectionVersi == null) {
          return;
       }
       sectionVersi.intValue();
       String str = a.C("FPS-Stop-", p0);
       if (!iNSTANCE.showDebugInfo()) {
          window = p1.getWindow();
          a.o(window, "activity.window");
          iNSTANCE.stopSectionInternal(p0, window, true);
          FpsMonitor.mSectionFrameMetricListeners.remove(p0);
       }else {
          k.a(str);
          window = p1.getWindow();
          a.o(window, "activity.window");
          iNSTANCE.stopSectionInternal(p0, window, true);
          FpsMonitor.mSectionFrameMetricListeners.remove(p0);
          k.b();
       }
       return;
    }
    public static final void stopSection(String p0,Window p1){
       a.p(p0, "section");
       if (Build$VERSION.SDK_INT < 24) {
          return;
       }
       FpsMonitor iNSTANCE = FpsMonitor.INSTANCE;
       if (!iNSTANCE.isInitialized()) {
          return;
       }
       if (p1 == null) {
          return;
       }
       if (!b.b(p1)) {
          return;
       }
       Integer sectionVersi = iNSTANCE.getSectionVersion(p0);
       if (sectionVersi == null) {
          return;
       }
       sectionVersi.intValue();
       String str = a.C("FPS-Stop-", p0);
       if (!iNSTANCE.showDebugInfo()) {
          iNSTANCE.stopSectionInternal(p0, p1, true);
          FpsMonitor.mSectionFrameMetricListeners.remove(p0);
       }else {
          k.a(str);
          iNSTANCE.stopSectionInternal(p0, p1, true);
          FpsMonitor.mSectionFrameMetricListeners.remove(p0);
          k.b();
       }
       return;
    }
    public static void stopSectionInternal$default(FpsMonitor p0,String p1,Window p2,boolean p3,int p4,Object p5){
       if (p4 & 0x04) {
          p3 = false;
       }
       p0.stopSectionInternal(p1, p2, p3);
       return;
    }
    public final CopyOnWriteArrayList getDetectors(int p0){
       CopyOnWriteArrayList uCopyOnWrite;
       int i = 0;
       int i1 = 2;
       int i2 = 1;
       if (p0 != i2) {
          if (p0 == i1) {
             MetricsQueue metricsQueue = new MetricsQueue();
             c[] uocArray = new c[]{new a(this.getMonitorConfig(), metricsQueue),new FrameGestureDetector(this.getMonitorConfig()),new JankDetector(this.getMonitorConfig(), metricsQueue, FpsMonitor.mJankCallback)};
             uCopyOnWrite = new CopyOnWriteArrayList(uocArray);
          }else {
             throw new IllegalArgumentException(a.C("Wrong version: ", Integer.valueOf(p0)));
          }
       }else {
          c[] uocArray1 = new c[i1];
          uocArray1[i] = new FrameMetricDetector(this.getMonitorConfig());
          uocArray1[i2] = new b(this.getMonitorConfig());
          uCopyOnWrite = new CopyOnWriteArrayList(uocArray1);
       }
       return uCopyOnWrite;
    }
    public final Integer getSectionVersion(String p0){
       if (e.b(p0)) {
          return Integer.valueOf(2);
       }
       if (this.getMonitorConfig().a != null) {
          return Integer.valueOf(1);
       }
       a c = this.getMonitorConfig().c;
       int i = (c == null || c.isEmpty())? 1: 0;
       Integer integer = (!i && c.contains(p0))? Integer.valueOf(1): null;
       return integer;
    }
    public void init(d p0,Object p1){
       this.init(p0, p1);
    }
    public void init(d p0,a p1){
       a.p(p0, "commonConfig");
       a.p(p1, "monitorConfig");
       super.init(p0, p1);
       a f = p1.f;
       if (f == null) {
       }else {
          List list = f.invoke();
          if (list != null) {
             e.a(list);
          }
       }
       FpsHandlerThread.b.start();
       JankHandlerThread.b.start();
       return;
    }
    public final boolean showDebugInfo(){
       return this.getMonitorConfig().b;
    }
    public final void startSectionInternal(String p0,Window p1,a p2,int p3){
       ConcurrentHashMap mCallbacksMa = FpsMonitor.mCallbacksMap;
       if (mCallbacksMa.containsKey(p0)) {
          h.d(f.b("FpsMonitor"), a.C("startSectionInternal contains key: ", p0));
          return;
       }else {
          ConcurrentHashMap mWindowFrame = FpsMonitor.mWindowFrameDetectorMap;
          _monitor_enter(mWindowFrame);
          a uoa = mWindowFrame.get(f.a(p1, p3));
          FpsEventV2 obj = uoa;
          long l = 0;
          if (obj != null && obj.b(p0) == true) {
             l = 1;
          }
          if (l) {
             _monitor_exit(mWindowFrame);
             return;
          }else if(uoa == null){
             uoa = new a(FpsMonitor.INSTANCE.getDetectors(p3));
             uoa.d(new FpsMonitor$a(p1, p3));
             mWindowFrame.put(f.a(p1, p3), uoa);
          }
          _monitor_exit(mWindowFrame);
          uoa.i(p0, p1);
          mWindowFrame = FpsMonitor.mFpsEventMap;
          Objects.requireNonNull(a.e);
          a.p(p0, "section");
          if (p3 != 1) {
             if (p3 == 2) {
                obj = new FpsEventV2(p0, p3);
             }else {
                throw new IllegalArgumentException(a.C("Wrong version: ", Integer.valueOf(p3)));
             }
          }else {
             b uob = new b(p0, p3);
          }
          obj.startTime = System.currentTimeMillis();
          mWindowFrame.put(p0, obj);
          mCallbacksMa.put(p0, p2);
          if (p3 == 2) {
             a.p(p0, "scene");
             p2 = e.b.get(p0);
             a.m(p2);
             a.o(p2, "configMap[scene]!!");
             Monitor_ThreadKt.d(p2.monitorTime, new FpsMonitor$startSectionInternal$3(p0, p1));
          }
          return;
       }
    }
    public final void stopSectionInternal(String p0,Window p1,boolean p2){
       long l = FpsMonitor.mFpsEventMap.get(p0);
       if (l == null) {
          return;
       }
       a uoa = FpsMonitor.mWindowFrameDetectorMap.get(f.a(p1, l.b()));
       if (uoa == null) {
          return;
       }
       if (!uoa.b(p0)) {
          return;
       }
       uoa.h(p0, p1);
       l.endTime = System.currentTimeMillis();
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       a d = this.getMonitorConfig().d;
       Map map = (d == null)? null: d.invoke(p0);
       boolean i = (map == null || map.isEmpty())? 1: 0;
       if (!i) {
          linkedHashMa.putAll(map);
       }
       l.c = linkedHashMa;
       a e = this.getMonitorConfig().e;
       boolean b = (e != null && e.invoke(p0).booleanValue() == true)? true: false;
       i = (b || uoa.e(p0))? true: false;
       uoa.g(p0, l);
       ConcurrentHashMap mWindowFrame = FpsMonitor.mWindowFrameDetectorMap;
       _monitor_enter(mWindowFrame);
       if (!uoa.c()) {
          a uoa1 = mWindowFrame.remove(f.a(p1, l.b()));
          if (uoa1 != null) {
             uoa1.b.clear();
          }
       }
       _monitor_exit(mWindowFrame);
       FpsMonitor$stopSectionInternal$afterUpload$1 ostopSection = new FpsMonitor$stopSectionInternal$afterUpload$1(FpsMonitor.mCallbacksMap.remove(p0), l);
       if (a.g(Looper.myLooper(), Looper.getMainLooper())) {
          FpsMonitor$stopSectionInternal$2 ostopSection1 = new FpsMonitor$stopSectionInternal$2(p0, l, p2, i, ostopSection);
          Monitor_ThreadKt.b(0, a.g(Looper.myLooper(), Looper.getMainLooper()), 1, null);
       }else {
          this.uploadFpsEvent(p0, l, p2, i, ostopSection);
       }
       return;
    }
    public final void uploadFpsEvent(String p0,a p1,boolean p2,boolean p3,a p4){
       Gsons a;
       int i = 1;
       try{
          h.d("FpsMonitor", a.C("currentThread = ", Thread.currentThread()));
          Iterator iterator = p1.a().iterator();
          while (iterator.hasNext()) {
             iterator.next().invoke();
          }
          a = Gsons.a;
          p1.c(a.a().q(p1.c));
          p1.version = MonitorBuildConfig.h();
          p1.uuid = UUID.randomUUID().toString();
          if (p3) {
             p1.d();
          }
          if (p2) {
             FpsMonitor.mLastFpsEventMap.remove(p0);
          }else {
             FpsMonitor.mLastFpsEventMap.put(p0, p1);
          }
          if (!p2 || p3) {
             String str1 = a.a().q(p1);
             int i2 = p1.b();
             if (i2 != i) {
                if (i2 == 2) {
                   d$a.b(i.a, "fps_jank_monitor", str1, false, 4, null);
                }
             }else {
                d$a.c(i.a, "frame_metric_monitor", str1, false, 4, null);
             }
             if (this.getMonitorConfig().b != null) {
                a.o(str1, "json");
                a.p("FpsMonitor-FpsEvent", "tag");
                a.p(str1, "msg");
                if (str1.length() > 4000) {
                   i2 = str1.length() / 4000;
                   int i3 = 0;
                   if (i2 >= 0) {
                      while (true) {
                         int i4 = i3 + 1;
                         int i5 = i4 * 4000;
                         if (i5 >= str1.length()) {
                            i5 = i3 * 4000;
                            a.o(str1.substring(i5), "\(this as java.lang.String\).substring\(startIndex\)");
                         label_00d2 :
                            if (i3 == i2) {
                               break ;
                            }else {
                               i3 = i4;
                            }
                         }else {
                            int i6 = i3 * 4000;
                            String str2 = str1.substring(i6, i5);
                            a.o(str2, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
                            goto label_00d2 ;
                         }
                      }
                   }
                }
             }
          }
       }catch(java.lang.Exception e11){
          e11.printStackTrace();
          String str = "section: "+p0+" \nresult: "+e11.getMessage();
          int i1 = p1.b();
          if (i1 != i) {
             if (i1 != 2) {
             }else {
                d$a.b(i.a, "fps_jank_monitor_error", str, false, 4, null);
             }
          }else {
             d$a.c(i.a, "frame_metric_monitor_json_error", str, false, 4, null);
          }
       }
    label_0116 :
       p4.invoke();
       return;
    }
}
