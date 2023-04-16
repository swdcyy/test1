package com.kwai.component.tti.monitor.b;
import android.view.Choreographer$FrameCallback;
import com.kwai.component.tti.monitor.a;
import android.view.Choreographer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.util.concurrent.TimeUnit;
import com.kwai.component.tti.monitor.TTIData;
import sh5.g;
import android.os.Handler;
import java.lang.Double;
import java.lang.Float;
import java.util.concurrent.atomic.AtomicBoolean;
import com.yxcorp.utility.SystemUtil;
import ph5.i;
import android.content.SharedPreferences;
import java.lang.Boolean;
import java.util.Objects;
import sh5.e;
import com.kwai.robust.PatchProxyResult;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Handler$Callback;
import af7.a;
import sh5.d;
import com.kwai.performance.fluency.jank.monitor.JankMonitor;
import com.kwai.sdk.switchconfig.a;
import sh5.f;
import java.lang.Runnable;

public class b extends a implements Choreographer$FrameCallback	// class@000bd0
{
    public final Choreographer q;
    public long r;
    public int s;
    public boolean t;

    public void b(){
       super();
       this.r = 0;
       this.s = 0;
       this.t = false;
       this.q = Choreographer.getInstance();
    }
    public void doFrame(long p0){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, b.class, "3")) {
          return;
       }
       p0 = TimeUnit.NANOSECONDS.toMillis(p0);
       this.j.addFrameTs(p0);
       int i = 1;
       if (this.t != null && g.g) {
          g.f.removeMessages(i);
          g.f.sendEmptyMessageDelayed(i, (long)g.h);
       }
       b tr = this.r;
       if (tr > 0) {
          long l = p0 - tr;
          int i1 = this.s + i;
          this.s = i1;
          if (l - (long)this.i > 0) {
             double d = (double)(i1 * 1000) / (double)l;
             this.r = p0;
             this.s = 0;
             float f = 0;
             a uoa = a.class;
             if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(Double.valueOf(d), Float.valueOf(f), this, uoa, "1")) {
                this.j.addFrame(d, f);
             }
          }
       }else {
          this.r = p0;
       }
       if (a.p.get()) {
          this.q.postFrameCallback(this);
       }
       return;
    }
    public void start(){
       int b;
       a[] uoaArray;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "1")) {
          return;
       }
       if (!a.p.compareAndSet(false, true)) {
          return;
       }
       super.start();
       this.q.postFrameCallback(this);
       b = (!SystemUtil.P() && (!SystemUtil.J() || (i.a.getBoolean("TTIHuiDuReasonStacktrace", false) || (SystemUtil.R() && i.a.getBoolean("TTIReasonStacktrace", false)))))? true: false;
       this.t = b;
       Object[] objArray1 = new Object[true];
       objArray1[0] = Boolean.valueOf(b);
       String.format("TTI Reason Stacktrace Open: %b", objArray1);
       if (this.t != null && !this.a()) {
          g og = g.b();
          Objects.requireNonNull(og);
          if (!PatchProxy.applyVoid(objArray, og, g.class, "3")) {
             e uoe = e.class;
             HandlerThread handlerThrea = PatchProxy.apply(objArray, objArray, uoe, "1");
             if (handlerThrea != PatchProxyResult.class) {
             }else if(e.a == null){
                _monitor_enter(uoe);
                if (e.a == null) {
                   e.a = new HandlerThread("tti-tick-handler-thread");
                   e.a.start();
                   e.b = new Handler(e.a.getLooper());
                }
                _monitor_exit(uoe);
             }
             handlerThrea = e.a;
             g.f = new Handler(handlerThrea.getLooper(), og);
             if (SystemUtil.P()) {
                uoaArray = new a[true];
                uoaArray[0] = new d(g.f);
                JankMonitor.start("TTI.Vsync", false, uoaArray);
             }else {
                uoaArray = new a[false];
                JankMonitor.start("TTI.Vsync", false, uoaArray);
             }
             b = (SystemUtil.P())? a.t().a("ttiIntervalPerf", 84): i.a.getInt("TTIReasonStacktraceSampleInterval", 83);
             g.h = b;
             g.g = true;
          }
       }
       if (a.t().d("EnableTTIJankOptimize", false)) {
          JankMonitor.optimize("TTI.Vsync", true);
       }
       return;
    }
    public void stop(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       super.stop();
       this.r = 0;
       this.s = 0;
       this.q.removeFrameCallback(this);
       if (this.t != null && !this.a()) {
          g og = g.b();
          a tj = this.j;
          Objects.requireNonNull(og);
          if (!PatchProxy.applyVoidOneRefs(tj, og, g.class, "4") && g.g) {
             g.g = false;
             JankMonitor.stop("TTI.Vsync");
             g.f.postDelayed(new f(og, tj), 2000);
          }
       }
       JankMonitor.optimize("TTI.Vsync", 0);
       return;
    }
}
