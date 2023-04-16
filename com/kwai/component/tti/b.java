package com.kwai.component.tti.b;
import a76.b;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import com.yxcorp.gifshow.util.rx.RxBus;
import qh5.a;
import java.lang.Class;
import brd.t;
import t45.d;
import brd.z;
import ph5.f;
import erd.g;
import crd.b;
import qh5.b;
import ph5.g;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Trace;
import com.kwai.component.tti.TTIStrategy;
import com.yxcorp.utility.Log;
import android.os.SystemClock;
import ph5.i;
import android.content.SharedPreferences;
import com.kwai.component.tti.monitor.a;
import ph5.l;
import java.lang.Runnable;
import com.kwai.framework.init.e;
import ph5.h;
import ekd.k1;

public abstract class b implements b	// class@000a9f
{
    public AtomicBoolean a;

    public void b(){
       super();
       this.a = new AtomicBoolean(false);
       RxBus f = RxBus.f;
       z a = d.a;
       f.f(a.class).observeOn(a).subscribe(new f(this));
       f.f(b.class).observeOn(a).subscribe(new g(this));
    }
    public void c(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "1")) {
          return;
       }
       b = false;
       boolean b1 = true;
       if (this.a.compareAndSet(b, b1)) {
          Trace.beginSection("TTIStrategy#init\(\)");
          if (!PatchProxy.applyVoid(objArray, objArray, TTIStrategy.class, "2")) {
             Log.g("TTI.Strategy", "runRunnableAfterLaunchFinish");
             TTIStrategy.a = SystemClock.elapsedRealtime();
             TTIStrategy.b = SystemClock.uptimeMillis();
             SharedPreferences a = i.a;
             TTIStrategy.e = a.getBoolean("TTIUploadLog", b);
             TTIStrategy.f = a.getBoolean("TTIUploadTouchLog", b1);
             TTIStrategy.g = a.getBoolean("TTIUploadHuiDuLog", b);
             a h = TTIStrategy.h;
             if (h != null) {
                h.start();
             }
             e.g(new l(), "TTIKswitchTask");
          }
          Trace.endSection();
          if (TTIStrategy.h != null) {
             Trace.beginSection("BaseTTIScheduler#start\(\)");
             this.g();
             Trace.endSection();
          }else {
             k1.r(new h(this), i.a.getLong("TTIDelayTime", 0x2710));
          }
       }
       return;
    }
    public abstract void g();
    public abstract void h();
    public void onStartAutoAfterLaunchTaskEvent(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       if (this.a.get()) {
          this.g();
       }
       return;
    }
    public void onStopAutoAfterLaunchTaskEvent(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "3")) {
          return;
       }
       if (this.a.get()) {
          this.h();
       }
       return;
    }
}
