package com.kwai.performance.fluency.fps.monitor.detector.framemetrics.FrameMetricDetector;
import pe7.c;
import android.view.Window$OnFrameMetricsAvailableListener;
import com.kwai.performance.fluency.fps.monitor.detector.framemetrics.FrameMetricDetector$a;
import nsd.u;
import pe7.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import te7.a;
import java.util.List;
import ye7.a;
import com.kwai.performance.fluency.fps.monitor.detector.framemetrics.FrameMetricDetector$applyResult$1$1;
import android.view.Window;
import kotlin.Result;
import qrd.l1;
import java.lang.Throwable;
import qrd.j0;
import yf7.h;
import java.lang.ref.WeakReference;
import android.view.WindowManager;
import android.view.Display;
import com.kwai.performance.fluency.fps.monitor.FpsHandlerThread;
import android.os.Handler;
import java.util.Map;
import android.view.FrameMetrics;
import java.lang.Long;
import com.kwai.performance.fluency.fps.monitor.FpsMonitor;
import java.util.Iterator;
import java.lang.Iterable;
import te7.b;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Map$Entry;
import re7.a;
import w1.k;

public final class FrameMetricDetector implements c, Window$OnFrameMetricsAvailableListener	// class@001070
{
    public final a b;
    public float c;
    public final CopyOnWriteArrayList d;
    public final ConcurrentHashMap e;
    public Window$OnFrameMetricsAvailableListener f;
    public static final FrameMetricDetector$a g;

    static {
       FrameMetricDetector.g = new FrameMetricDetector$a(null);
    }
    public void FrameMetricDetector(a p0){
       a.p(p0, "mConfig");
       super();
       this.b = p0;
       this.c = 16.60f;
       this.d = new CopyOnWriteArrayList();
       this.e = new ConcurrentHashMap();
    }
    public boolean b(String p0){
       a.p(p0, "scene");
       return this.d.contains(p0);
    }
    public boolean c(){
       return (this.d.isEmpty() ^ 0x01);
    }
    public void d(Window$OnFrameMetricsAvailableListener p0){
       a.p(p0, "listener");
       this.f = p0;
    }
    public boolean e(String p0){
       a.p(p0, "scene");
       a uoa = this.e.get(p0);
       boolean b = false;
       uoa = (uoa == null)? 0: uoa.d;
       if (uoa > 300) {
          b = true;
       }
       return b;
    }
    public List f(){
       return this.d;
    }
    public a g(String p0,a p1){
       a.p(p0, "scene");
       a.p(p1, "fpsEvent");
       List list = p1.a();
       _monitor_enter(list);
       p1.a().add(new FrameMetricDetector$applyResult$1$1(this.e.get(p0), p1));
       _monitor_exit(list);
       return p1;
    }
    public void h(String p0,Window p1){
       a.p(p0, "scene");
       a.p(p1, "window");
       if (this.d.contains(p0)) {
          this.d.remove(p0);
       }
       if (this.d.isEmpty()) {
          p1.removeOnFrameMetricsAvailableListener(this);
       }
       p0 = Result.constructor-impl(l1.a);
       Throwable throwable = Result.exceptionOrNull-impl(p0);
       if (throwable != null) {
          h.b("FrameMetricDetector", a.C("removeOnFrameMetricsAvailableListener FAIL ", throwable));
       }
       return;
    }
    public void i(String p0,Window p1){
       a.p(p0, "scene");
       a.p(p1, "window");
       WeakReference weakReferenc = new WeakReference(p1);
       WindowManager windowManage = p1.getWindowManager();
       float f = 16.60f;
       if (windowManage == null) {
       }else {
          Display defaultDispl = windowManage.getDefaultDisplay();
          if (defaultDispl != null) {
             f = (float)1000 / defaultDispl.getRefreshRate();
          }
       }
       this.c = f;
       if (this.d.isEmpty()) {
          p1.addOnFrameMetricsAvailableListener(this, FpsHandlerThread.b.a());
       }
       if (!this.d.contains(p0)) {
          this.d.add(p0);
          this.e.put(p0, new a());
       }
       return;
    }
    public void onFrameMetricsAvailable(Window p0,FrameMetrics p1,int p2){
       Collection uCollection;
       Iterator iterator;
       a uoa;
       Set set;
       FrameMetricDetector obj;
       float f;
       a a;
       Object key;
       a.p(p0, "window");
       a.p(p1, "frameMetrics");
       String str = a.C("K_onFrameMetricsAvailable_", Long.valueOf(p1.getMetric(4)));
       String str1 = "entry.key";
       int i = 8;
       String str2 = "mSceneResultMap.entries.first\(\)";
       String str3 = "mSceneResultMap.values";
       if (!FpsMonitor.INSTANCE.showDebugInfo()) {
          uCollection = this.e.values();
          a.o(uCollection, str3);
          iterator = uCollection.iterator();
          while (iterator.hasNext()) {
             uoa = iterator.next();
             a.o(uoa, "it");
             b.a(uoa, this.c, p1);
          }
          if (this.b.b != null) {
             set = this.e.entrySet();
             a.o(set, "mSceneResultMap.entries");
             obj = CollectionsKt___CollectionsKt.k2(set);
             a.o(obj, str2);
             f = b.j(p1.getMetric(i));
             a = a.a;
             a.a(f);
             key = obj.getKey();
             a.o(key, str1);
             a.e(key);
             a.d(String.valueOf(f));
             a.g(String.valueOf(obj.getValue().D));
             a.f(String.valueOf(obj.getValue().A));
             a.c(String.valueOf(obj.getValue().E));
             a.b(String.valueOf(obj.getValue().B));
             a.i(String.valueOf(obj.getValue().F));
             a.h(String.valueOf(obj.getValue().C));
             a.k(String.valueOf(((obj.getValue().D + obj.getValue().F) + obj.getValue().E)));
             a.j(String.valueOf(((obj.getValue().A + obj.getValue().C) + obj.getValue().B)));
          }
          obj = this.f;
          if (obj != null) {
             obj.onFrameMetricsAvailable(p0, p1, p2);
          }
       }else {
          k.a(str);
          uCollection = this.e.values();
          a.o(uCollection, str3);
          iterator = uCollection.iterator();
          while (iterator.hasNext()) {
             uoa = iterator.next();
             a.o(uoa, "it");
             b.a(uoa, this.c, p1);
          }
          if (this.b.b != null) {
             set = this.e.entrySet();
             a.o(set, "mSceneResultMap.entries");
             Object obj1 = CollectionsKt___CollectionsKt.k2(set);
             a.o(obj1, str2);
             f = b.j(p1.getMetric(i));
             a = a.a;
             a.a(f);
             key = obj1.getKey();
             a.o(key, str1);
             a.e(key);
             a.d(String.valueOf(f));
             a.g(String.valueOf(obj1.getValue().D));
             a.f(String.valueOf(obj1.getValue().A));
             a.c(String.valueOf(obj1.getValue().E));
             a.b(String.valueOf(obj1.getValue().B));
             a.i(String.valueOf(obj1.getValue().F));
             a.h(String.valueOf(obj1.getValue().C));
             a.k(String.valueOf(((obj1.getValue().D + obj1.getValue().F) + obj1.getValue().E)));
             a.j(String.valueOf(((obj1.getValue().A + obj1.getValue().C) + obj1.getValue().B)));
          }
          obj = this.f;
          if (obj != null) {
             obj.onFrameMetricsAvailable(p0, p1, p2);
          }
          k.b();
       }
       return;
    }
}
