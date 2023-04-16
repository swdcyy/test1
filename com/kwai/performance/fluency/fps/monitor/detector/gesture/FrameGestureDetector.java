package com.kwai.performance.fluency.fps.monitor.detector.gesture.FrameGestureDetector;
import pe7.c;
import ve7.c;
import android.view.Choreographer$FrameCallback;
import com.kwai.performance.fluency.fps.monitor.detector.gesture.FrameGestureDetector$a;
import nsd.u;
import pe7.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentHashMap;
import com.kwai.performance.fluency.fps.monitor.detector.gesture.CustomGestureListener;
import java.util.concurrent.ConcurrentLinkedQueue;
import ve7.a;
import com.kwai.performance.fluency.fps.monitor.FpsMonitor;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import ve7.d;
import java.util.List;
import ve7.e;
import w1.k;
import pe7.c$a;
import android.view.Window$OnFrameMetricsAvailableListener;
import java.lang.System;
import java.lang.Long;
import android.view.Choreographer;
import ye7.a;
import com.kwai.performance.fluency.fps.monitor.event.FpsEventV2;
import com.kwai.performance.fluency.fps.monitor.detector.gesture.FrameGestureDetector$applyResult$1$1;
import android.view.Window;
import android.view.Window$Callback;
import ve7.f;
import qrd.l1;
import android.view.GestureDetector;
import android.content.Context;
import android.view.GestureDetector$OnGestureListener;
import java.util.concurrent.TimeUnit;
import com.kwai.performance.fluency.fps.monitor.detector.gesture.FrameGestureDetector$getFrameCount$1;
import java.lang.Iterable;
import msd.l;
import trd.y;
import ve7.b;

public final class FrameGestureDetector implements c, c, Choreographer$FrameCallback	// class@001079
{
    public final a b;
    public final CopyOnWriteArrayList c;
    public final ConcurrentHashMap d;
    public CustomGestureListener e;
    public final ConcurrentLinkedQueue f;
    public static final FrameGestureDetector$a g;

    static {
       FrameGestureDetector.g = new FrameGestureDetector$a(null);
    }
    public void FrameGestureDetector(a p0){
       a.p(p0, "mConfig");
       super();
       this.b = p0;
       this.c = new CopyOnWriteArrayList();
       this.d = new ConcurrentHashMap();
       this.e = new CustomGestureListener(this);
       this.f = new ConcurrentLinkedQueue();
    }
    public static int l(FrameGestureDetector p0,a p1,boolean p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = true;
       }
       return p0.k(p1, p2);
    }
    public void a(a p0){
       Iterator iterator;
       Map$Entry uEntry;
       a.p(p0, "g");
       String str = "K_onGesture";
       Object obj = null;
       if (!FpsMonitor.INSTANCE.showDebugInfo()) {
          p0.e(FrameGestureDetector.l(this, p0, false, 2, obj));
          iterator = this.d.entrySet().iterator();
          while (iterator.hasNext()) {
             uEntry = iterator.next();
             if (!uEntry.getValue().a()) {
                uEntry.getValue().c().add(e.a(p0));
             }
          }
       }else {
          k.a(str);
          p0.e(FrameGestureDetector.l(this, p0, false, 2, obj));
          iterator = this.d.entrySet().iterator();
          while (iterator.hasNext()) {
             uEntry = iterator.next();
             if (!uEntry.getValue().a()) {
                uEntry.getValue().c().add(e.a(p0));
             }
          }
          k.b();
       }
       return;
    }
    public boolean b(String p0){
       c$a.a(this, p0);
       return true;
    }
    public boolean c(){
       c$a.c(this);
       return false;
    }
    public void d(Window$OnFrameMetricsAvailableListener p0){
       c$a.e(this, p0);
    }
    public void doFrame(long p0){
       if (!this.c.isEmpty()) {
          this.f.add(Long.valueOf(System.currentTimeMillis()));
          Iterator iterator = this.d.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             if (!uEntry.getValue().a()) {
                d value = uEntry.getValue();
                int i = value.b() + 1;
                value.d = i;
             }
          }
          Choreographer.getInstance().postFrameCallback(this);
       }
       return;
    }
    public boolean e(String p0){
       c$a.d(this, p0);
       return true;
    }
    public List f(){
       return c$a.b(this);
    }
    public a g(String p0,a p1){
       a.p(p0, "scene");
       a.p(p1, "fpsEvent");
       a uoa = p1;
       d uod = this.d.get(p0);
       if (uod == null) {
       }else {
          uoa.a().add(new FrameGestureDetector$applyResult$1$1(p1, uod, this));
       }
       return p1;
    }
    public void h(String p0,Window p1){
       a.p(p0, "scene");
       a.p(p1, "window");
       FrameGestureDetector tc = this.c;
       _monitor_enter(tc);
       if (!this.c.contains(p0)) {
          _monitor_exit(tc);
          return;
       }else {
          this.c.remove(p0);
          FrameGestureDetector te = this.e;
          a uoa = te.b(te.a());
          if (uoa != null) {
             uoa.e(this.k(uoa, false));
             d uod1 = this.d.get(p0);
             if (uod1 != null) {
                List list = uod1.c();
                if (list != null) {
                   list.add(uoa);
                }
             }
          }
          d uod = this.d.get(p0);
          if (uod != null) {
             uod.b = true;
             uod.e = System.currentTimeMillis();
          }
          if (this.c.isEmpty()) {
             Choreographer.getInstance().removeFrameCallback(this);
             Window$Callback callback = p1.getCallback();
             if (callback instanceof f) {
                p1.setCallback(callback.b);
             }
          }
          _monitor_exit(tc);
          return;
       }
    }
    public void i(String p0,Window p1){
       a.p(p0, "scene");
       a.p(p1, "window");
       FrameGestureDetector tc = this.c;
       _monitor_enter(tc);
       if (this.c.isEmpty()) {
          Choreographer.getInstance().postFrameCallback(this);
          Window$Callback callback = p1.getCallback();
          a.o(callback, "it.callback");
          p1.setCallback(new f(callback, new GestureDetector(p1.getContext(), this.e)));
       }
       if (!this.c.contains(p0)) {
          this.c.add(p0);
          this.d.put(p0, new d(p0));
       }
       _monitor_exit(tc);
       return;
    }
    public final double j(int p0,long p1){
       double d = (!p1)? 0: (double)p0 / ((double)p1 / (double)TimeUnit.SECONDS.toMillis(1));
       return d;
    }
    public final int k(a p0,boolean p1){
       Iterator iterator = this.f.iterator();
       int i = 0;
       int i1 = -1;
       while (true) {
          if (iterator.hasNext()) {
             Long longx = iterator.next();
             if (i1 == -1) {
                a.o(longx, "i");
                if (longx.longValue() - p0.c() >= 0) {
                   i1 = i;
                }
             }
             a.o(longx, "i");
             if (longx.longValue() - p0.a() > 0) {
             label_003d :
                if (i == -1) {
                   i = this.f.size();
                }
                if (p1) {
                   y.F0(this.f, new FrameGestureDetector$getFrameCount$1(p0));
                   break ;
                }
                break ;
             }else {
                i = i + 1;
             }
          }else {
             i = -1;
             goto label_003d ;
          }
       }
       return (i - i1);
    }
    public final boolean m(b p0){
       boolean b = (p0.a() - 160 > 0 && (p0.b() >= 0 && p0.b() - 0x405e000000000000 < 0))? true: false;
       return b;
    }
}
