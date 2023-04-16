package com.kuaishou.commercial.splash.presenter.w0$a;
import sc6.b;
import com.kuaishou.commercial.splash.presenter.w0;
import java.lang.Object;
import sc6.a;
import android.view.Surface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yx.j0;
import gz.s;
import gz.e5;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.sdk.switchconfig.a;
import java.util.Objects;
import com.kwai.framework.player.core.b;
import com.kuaishou.commercial.perf.tracker.CommercialSplashTracker;
import android.os.SystemClock;
import wkd.b;
import com.yxcorp.gifshow.w;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import im8.f;
import yy.x0;
import brd.y;
import java.lang.Runnable;
import ekd.k1;

public class w0$a implements b	// class@00160f
{
    public final w0 b;

    public void w0$a(w0 p0){
       this.b = p0;
       super();
    }
    public void a(int p0,int p1){
       a.a(this, p0, p1);
    }
    public void b(Surface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w0$a.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("SplashAdVideoPlayPresen", "onSurfaceCreate", objArray);
       w0$a tb = this.b;
       w0 c = tb.C;
       s b = c.b;
       if (b > null) {
          s c1 = c.c;
          if (c1 > null) {
             w0 w = tb.w;
             new e5(w, c1, b, w.getParent()).a();
          }
       }
       if (!a.t().d("enableSplashSurfaceView", true)) {
          tb = this.b;
          Objects.requireNonNull(tb);
          if (PatchProxy.applyVoidOneRefs(p0, tb, w0.class, "21") || (p0 != null && tb.E != null)) {
             tb.W8();
             tb.F = p0;
             tb.E.setSurface(p0);
          }
       }
       return;
    }
    public void c(Surface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w0$a.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("SplashAdVideoPlayPresen", "onSurfaceDestroy", objArray);
       if (!a.t().d("enableSplashSurfaceView", true)) {
          this.b.W8();
       }
       return;
    }
    public void d(){
       boolean b2;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, w0$a.class, "3")) {
          return;
       }
       if (this.b.G != null) {
          return;
       }
       boolean b = false;
       if (a.t().d("needSplashVideoStatusRight", b) && (this.b.E.isPrepared() && (this.b.E.isVideoRenderingStart() && (this.b.E.isBuffering() || this.b.E.isPaused())))) {
          return;
       }
       CommercialSplashTracker.E().I(SystemClock.elapsedRealtime());
       b.a(-1343064608).q0();
       Object[] objArray1 = new Object[b];
       j0.f("SplashAdVideoPlayPresen", "onSurfaceTextureUpdated", objArray1);
       w0$a tb = this.b;
       boolean b1 = true;
       tb.G = b1;
       Objects.requireNonNull(tb);
       w0 ow0 = w0.class;
       if (!PatchProxy.applyVoid(objArray, tb, ow0, "11")) {
          x0 obj = PatchProxy.apply(objArray, tb, ow0, "10");
          if (obj != PatchProxyResult.class) {
             b2 = obj.booleanValue();
          }else {
             Activity activity = tb.getActivity();
             b2 = (activity != null && !activity.isFinishing())? true: false;
          }
          if (b2 && tb.C != null) {
             tb.y.setVisibility(b);
             obj = tb.p.get();
             if (obj != null) {
                obj.x(tb.w, b1);
             }
             tb.v.onNext(tb.y);
             k1.m(tb.L);
             k1.r(tb.L, (tb.C.g + tb.B));
          }
       }
    label_00d1 :
       return;
    }
}
