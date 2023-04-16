package com.kwai.performance.fluency.fps.monitor.detector.jank.JankDetector;
import pe7.c;
import android.view.Choreographer$FrameCallback;
import android.os.Handler$Callback;
import com.kwai.performance.fluency.fps.monitor.detector.jank.JankDetector$a;
import nsd.u;
import pe7.a;
import com.kwai.performance.fluency.fps.monitor.detector.metrics.MetricsQueue;
import qe7.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentHashMap;
import com.kwai.performance.fluency.fps.monitor.JankHandlerThread;
import java.util.Objects;
import android.os.Handler;
import android.os.Looper;
import android.os.HandlerThread;
import pe7.c$a;
import android.view.Window$OnFrameMetricsAvailableListener;
import com.kwai.performance.fluency.fps.monitor.FpsMonitor;
import java.lang.System;
import android.os.SystemClock;
import pe7.f;
import android.os.Message;
import we7.b;
import we7.d;
import qrd.l1;
import android.view.Choreographer;
import w1.k;
import we7.c;
import java.util.List;
import ye7.a;
import com.kwai.performance.fluency.fps.monitor.event.FpsEventV2;
import com.kwai.performance.fluency.fps.monitor.detector.jank.JankDetector$applyResult$1$1;
import android.view.Window;
import pe7.e;
import com.kwai.performance.fluency.jank.monitor.JankMonitor;
import java.lang.Integer;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.performance.fluency.jank.monitor.LogRecordQueue$PackedRecord;
import com.kwai.performance.fluency.jank.monitor.LogRecordQueue$PackedRecordExtra;
import org.json.JSONArray;
import com.kwai.performance.fluency.fps.monitor.detector.metrics.Metrics;
import java.util.Set;
import java.util.Map;
import java.util.Map$Entry;
import java.lang.NullPointerException;
import af7.a;

public final class JankDetector implements c, Choreographer$FrameCallback, Handler$Callback	// class@00107c
{
    public final a b;
    public final MetricsQueue c;
    public final b d;
    public final CopyOnWriteArrayList e;
    public final ConcurrentHashMap f;
    public final Handler g;
    public long h;
    public long i;
    public static final JankDetector$a j;

    static {
       JankDetector.j = new JankDetector$a(null);
    }
    public void JankDetector(a p0,MetricsQueue p1,b p2){
       a.p(p0, "mConfig");
       a.p(p1, "mMetricsQueue");
       a.p(p2, "jankCallback");
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = new CopyOnWriteArrayList();
       this.f = new ConcurrentHashMap();
       JankHandlerThread b = JankHandlerThread.b;
       Objects.requireNonNull(b);
       a.p(this, "callback");
       this.g = new Handler(b.getLooper(), this);
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
       long l1;
       JankDetector th;
       b uob;
       String str = "K_doFrame";
       int i = 1;
       String str1 = "doFrame";
       Message message = 84;
       long l = 0;
       if (!FpsMonitor.INSTANCE.showDebugInfo()) {
          if (!this.e.isEmpty()) {
             str = System.currentTimeMillis();
             l1 = SystemClock.uptimeMillis();
             th = this.h;
             if (th - l && (str - th) - message > 0) {
                f.b(str1);
                message = Message.obtain();
                message.what = i;
                uob = new b();
                uob.q(this.h);
                uob.k(str);
                uob.j((uob.b() - uob.g()));
                uob.r(d.b(uob, uob.a()));
                uob.s(this.i);
                message.obj = uob;
                this.g.sendMessage(message);
             }
             this.h = str;
             this.i = l1;
             Choreographer.getInstance().postFrameCallback(this);
          }
       }else {
          k.a(str);
          if (!this.e.isEmpty()) {
             str = System.currentTimeMillis();
             l1 = SystemClock.uptimeMillis();
             th = this.h;
             if (th - l && (str - th) - message > 0) {
                f.b(str1);
                message = Message.obtain();
                message.what = i;
                uob = new b();
                uob.q(this.h);
                uob.k(str);
                uob.j((uob.b() - uob.g()));
                uob.r(d.b(uob, uob.a()));
                uob.s(this.i);
                message.obj = uob;
                this.g.sendMessage(message);
             }
             this.h = str;
             this.i = l1;
             Choreographer.getInstance().postFrameCallback(this);
          }
          k.b();
       }
       return;
    }
    public boolean e(String p0){
       a.p(p0, "scene");
       c uoc = this.f.get(p0);
       boolean b = false;
       if (uoc == null) {
       }else if((System.currentTimeMillis() - uoc.c) - 5000 > 0){
          b = true;
       }
       return b;
    }
    public List f(){
       return c$a.b(this);
    }
    public a g(String p0,a p1){
       a.p(p0, "scene");
       a.p(p1, "fpsEvent");
       a uoa = p1;
       c uoc = this.f.get(p0);
       if (uoc == null) {
       }else {
          uoa.a().add(new JankDetector$applyResult$1$1(uoc, uoa));
       }
       return p1;
    }
    public void h(String p0,Window p1){
       a.p(p0, "scene");
       a.p(p1, "window");
       JankDetector te = this.e;
       _monitor_enter(te);
       if (!this.e.contains(p0)) {
          _monitor_exit(te);
          return;
       }else {
          this.e.remove(p0);
          JankMonitor.stackTrace(p1.toString(), e.d(this.e));
          if (this.e.isEmpty()) {
             JankMonitor.stop(p1.toString());
             this.g.removeMessages(1);
             Choreographer.getInstance().removeFrameCallback(this);
          }
          _monitor_exit(te);
          return;
       }
    }
    public boolean handleMessage(Message p0){
       List list;
       Iterator iterator;
       JSONArray jSONArray1;
       LogRecordQueue$PackedRecordExtra extra;
       c uoc;
       Map$Entry uEntry;
       LogRecordQueue$PackedRecordExtra extra1;
       a.p(p0, "msg");
       String str = a.C("K_handleMessage_", Integer.valueOf(p0.what));
       String str1 = "null cannot be cast to non-null type com.kwai.performance.fluency.fps.monitor.detector.jank.Jank";
       JSONArray jSONArray = null;
       if (!FpsMonitor.INSTANCE.showDebugInfo()) {
          if (p0.what == true) {
             p0 = p0.obj;
             Objects.requireNonNull(p0, str1);
             if (e.d(this.e)) {
                list = JankMonitor.searchFrameMessages(p0.b(), false);
                p0.f().addAll(list);
                iterator = list.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      jSONArray1 = iterator.next();
                      extra = jSONArray1.getExtra();
                      int i = (extra == null)? jSONArray: extra.getStacks();
                      uoc = (i != null)? 1: null;
                      if (!uoc) {
                         continue ;
                      }
                   }else {
                      jSONArray1 = jSONArray;
                   }
                   if (jSONArray1 != null) {
                      extra1 = jSONArray1.getExtra();
                      if (extra1 != null) {
                         jSONArray = extra1.getStacks();
                      }
                      p0.n(jSONArray);
                   }
                   p0.p(this.c.b(p0.i()));
                }
             }
             iterator = this.f.entrySet().iterator();
             while (iterator.hasNext()) {
                uEntry = iterator.next();
                if (!uEntry.getValue().a()) {
                   uEntry.getValue().b().add(d.a(p0, e.c(uEntry.getKey())));
                }else {
                   continue ;
                }
             }
             this.d.a(this.e, p0);
          }
       }else {
          k.a(str);
          if (p0.what == true) {
             p0 = p0.obj;
             if (p0 != null) {
                if (e.d(this.e)) {
                   list = JankMonitor.searchFrameMessages(p0.b(), false);
                   p0.f().addAll(list);
                   iterator = list.iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         jSONArray1 = iterator.next();
                         extra = jSONArray1.getExtra();
                         JSONArray jSONArray2 = (extra == null)? jSONArray: extra.getStacks();
                         uoc = (jSONArray2 != null)? 1: null;
                         if (!uoc) {
                            continue ;
                         }
                      }else {
                         jSONArray1 = jSONArray;
                      }
                      if (jSONArray1 != null) {
                         extra1 = jSONArray1.getExtra();
                         if (extra1 != null) {
                            jSONArray = extra1.getStacks();
                         }
                         p0.n(jSONArray);
                      }
                      p0.p(this.c.b(p0.i()));
                   }
                }
                iterator = this.f.entrySet().iterator();
                while (iterator.hasNext()) {
                   uEntry = iterator.next();
                   if (!uEntry.getValue().a()) {
                      uEntry.getValue().b().add(d.a(p0, e.c(uEntry.getKey())));
                   }else {
                      continue ;
                   }
                }
                this.d.a(this.e, p0);
             }else {
                throw new NullPointerException(str1);
             }
          }
          k.b();
       }
       return true;
    }
    public void i(String p0,Window p1){
       a.p(p0, "scene");
       a.p(p1, "window");
       JankDetector te = this.e;
       _monitor_enter(te);
       if (this.e.isEmpty()) {
          Choreographer.getInstance().postFrameCallback(this);
          int i = 0;
          a[] uoaArray = new a[i];
          JankMonitor.start$default(p1.toString(), i, uoaArray, 2, null);
       }
       if (!this.e.contains(p0)) {
          this.e.add(p0);
          this.f.put(p0, new c(p0));
          JankMonitor.stackTrace(p1.toString(), e.d(this.e));
       }
       _monitor_exit(te);
       return;
    }
}
