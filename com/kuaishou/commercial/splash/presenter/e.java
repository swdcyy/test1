package com.kuaishou.commercial.splash.presenter.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import gz.f;
import com.kuaishou.commercial.splash.presenter.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import tjc.c;
import tjc.b;
import tkd.b;
import tkd.d;
import nl9.h0;
import android.view.View;
import yx.j0;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;
import android.view.ViewTreeObserver$OnDrawListener;
import gz.g;
import java.lang.Runnable;
import ekd.k1;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import wl9.y;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.utility.RomUtils;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import ekd.l1;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.utility.n;
import com.kuaishou.commercial.splash.presenter.d;

public class e extends PresenterV2	// class@0015e6
{
    public View p;
    public ViewGroup q;
    public ViewTreeObserver r;
    public int s;
    public boolean t;
    public final ViewTreeObserver$OnDrawListener u;
    public final a v;

    public void e(){
       super();
       this.u = new f(this);
       this.v = c.b;
    }
    public void E8(){
       Object[] objArray1;
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoe, "5")) {
          int i = -1608526086;
          if (b.a(i).S()) {
             b uob = b.a(i).a();
             if (uob != null) {
                d.a(-536296199).b70(uob);
             }
          }
          if (!PatchProxy.applyVoid(objArray, this, uoe, "8")) {
             c uoc = b.a(i);
             if (uoc.getState() == 6 || uoc.getState() == 2) {
                uoc.U();
             }
          }
          e tp = this.p;
          e uoe1 = null;
          String str = "SplashActivityPresenter";
          if (tp != null) {
             tp.setTranslationY((float)this.s);
          }else {
             objArray1 = new Object[uoe1];
             j0.c(str, "mCenterLogoView is null", objArray1);
          }
          tp = this.q;
          if (tp != null) {
             ViewTreeObserver viewTreeObse = tp.getViewTreeObserver();
             this.r = viewTreeObse;
             viewTreeObse.addOnDrawListener(this.u);
          }else {
             objArray1 = new Object[uoe1];
             j0.c(str, "mSplashDefaultView is null", objArray1);
          }
          k1.s(new g(this), this.u, 400);
       }
       if (!PatchProxy.applyVoid(objArray, this, uoe, "9")) {
          Activity activity = this.getActivity();
          if (activity instanceof GifshowActivity) {
             activity.F2(this.v);
          }
       }
       RxBus.f.b(new y());
       return;
    }
    public void F8(){
       boolean b;
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe, "2")) {
          return;
       }
       Object obj = PatchProxy.apply(objArray, this, uoe, "6");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(RomUtils.s() && (l1.a(a.a().a()) && a.t().d("enable_rectify_oppo_splash_logo", false))){
          b = true;
       }else {
          b = false;
       }
       if (b) {
          this.s = n.A(this.getContext());
       }
       return;
    }
    public void J8(){
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe, "4")) {
          return;
       }
       e tr = this.r;
       if (tr != null) {
          if (tr.isAlive()) {
             this.r.removeOnDrawListener(this.u);
          }else {
             tr = this.q;
             if (tr != null && tr.isAttachedToWindow()) {
                this.q.getViewTreeObserver().removeOnDrawListener(this.u);
             }
          }
          this.r = objArray;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoe, "10")) {
          Activity activity = this.getActivity();
          if (activity instanceof GifshowActivity) {
             activity.l3(this.v);
          }
       }
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, e.class, "7")) {
          return;
       }
       k1.n(this.u);
       if (this.t != null) {
          return;
       }
       this.t = true;
       k1.r(d.b, 50);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       this.p = p0.findViewById(0x7f0a069a);
       this.q = p0.findViewById(0x7f0a0a7a);
       return;
    }
}
