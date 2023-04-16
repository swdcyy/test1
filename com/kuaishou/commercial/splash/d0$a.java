package com.kuaishou.commercial.splash.d0$a;
import sc6.b;
import com.kuaishou.commercial.splash.d0;
import java.lang.Object;
import sc6.a;
import android.view.Surface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import tw.l;
import yx.j0;
import gz.s;
import gz.e5;
import android.view.ViewParent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import wkd.b;
import tjc.c;
import com.yxcorp.gifshow.util.rx.RxBus;
import wl9.h;
import rkd.b;
import android.app.Activity;
import o56.f;
import com.kuaishou.commercial.perf.tracker.CommercialSplashTracker;
import android.os.SystemClock;
import com.yxcorp.gifshow.w;
import java.util.Objects;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.smile.gifmaker.mvps.presenter.a;
import im8.f;
import yy.x0;
import java.lang.Runnable;
import ekd.k1;
import brd.y;

public class d0$a implements b	// class@0015a6
{
    public final d0 b;

    public void d0$a(d0 p0){
       this.b = p0;
       super();
    }
    public void a(int p0,int p1){
       a.a(this, p0, p1);
    }
    public void b(Surface p0){
       d0 l;
       if (PatchProxy.applyVoidOneRefs(p0, this, d0$a.class, "1")) {
          return;
       }
       if (!l.j(this.b.r.mEntity)) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("SplashTopPlayControlPresenter", "onSurfaceTextureAvailable", objArray);
       d0$a tb = this.b;
       d0 r = tb.R;
       s b = r.b;
       if (b > null) {
          s c = r.c;
          if (c > null) {
             l = tb.L;
             e5 uoe5 = new e5(l, c, b, l.getParent());
             ViewGroup$MarginLayoutParams layoutParams = this.b.L.getLayoutParams();
             d0$a tb1 = this.b;
             tb1.G = layoutParams.leftMargin;
             tb1.H = layoutParams.topMargin;
             uoe5.a();
          }
       }
       if (b.a(-1608526086).M()) {
          RxBus.f.b(new h(1));
          if (b.g()) {
             Activity uActivity = f.a();
             if (uActivity != null) {
                uActivity.setRequestedOrientation(1);
             }
          }
       }
       return;
    }
    public void c(Surface p0){
       a.c(this, p0);
    }
    public void d(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d0$a.class, "2")) {
          return;
       }
       if (this.b.S != null) {
          return;
       }
       int i = -1608526086;
       if (b.a(i).D2()) {
          CommercialSplashTracker.E().I(SystemClock.elapsedRealtime());
          b.a(-1343064608).q0();
       }
       b = true;
       this.b.T = b;
       if (!b.a(i).M()) {
          RxBus.f.b(new h(b));
       }
       d0$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, d0.class, "19")) {
          View view = tb.m8().findViewById(R.id.splash_video_cover);
          int i1 = 0;
          if (view == null) {
             objArray = new Object[i1];
             j0.f("SplashTopPlayControlPresenter", "videoThingsShow something wrong", objArray);
             tb.a9();
          }else {
             tb.P8(i1);
             x0 ox0 = tb.t.get();
             if (ox0 != null) {
                ox0.x(tb.L, b);
             }
             tb.V8();
             k1.m(tb.U);
             k1.r(tb.U, tb.R.g);
             tb.C.onNext(view);
          }
       }
       return;
    }
}
