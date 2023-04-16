package com.kwai.feature.component.screenshot.ScreenshotMonitorInitModule;
import com.kwai.framework.init.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.component.screenshot.a;
import android.os.Handler;
import com.kwai.feature.component.screenshot.g;
import java.lang.Runnable;
import b76.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.n;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import e06.k;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import eda.l;
import e06.j;
import zca.p;
import e06.l;
import e06.m;
import com.kwai.framework.init.c;

public class ScreenshotMonitorInitModule extends a	// class@00127e
{
    public boolean q;
    public Handler r;
    public static final int s;

    public void ScreenshotMonitorInitModule(){
       super();
       this.q = false;
    }
    public int f0(){
       return 13;
    }
    public void h0(){
       if (PatchProxy.applyVoid(null, this, ScreenshotMonitorInitModule.class, "3")) {
          return;
       }
       a.b().h(false);
       if (this.q == null) {
          return;
       }
       this.r.removeCallbacksAndMessages(null);
       return;
    }
    public void i0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ScreenshotMonitorInitModule.class, "2")) {
          return;
       }
       if (this.q == null) {
          return;
       }
       a.b().h(false);
       this.r.removeCallbacksAndMessages(objArray);
       this.r.postDelayed(g.b, 3000);
       return;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ScreenshotMonitorInitModule.class, "1")) {
          return;
       }
       RxBus f = RxBus.f;
       RxBus$ThreadMode pOSTING = RxBus$ThreadMode.POSTING;
       f.g(n.class, pOSTING).subscribe(new k(this), Functions.d());
       f.g(l.class, pOSTING).subscribe(new j(this), Functions.d());
       t ot = f.g(p.class, pOSTING);
       ot.subscribe(new l(this), Functions.d());
       c.b(new m(this));
       return;
    }
    public void n(){
    }
    public void onLoginEvent(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ScreenshotMonitorInitModule.class, "4")) {
          return;
       }
       a uoa = a.b();
       uoa.a();
       uoa.k();
       return;
    }
}
