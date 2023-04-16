package com.yxcorp.gifshow.homepage.presenter.splash.ThanosSplashPresenter;
import eua.b;
import com.yxcorp.gifshow.homepage.presenter.splash.ThanosSplashPresenter$PersonalizedTabState;
import dua.j;
import dua.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import tjc.c;
import tra.b;
import q87.c;
import com.kwai.component.realtime.tab.RealtimeTabRequester;
import tkd.b;
import tkd.d;
import nl9.h0;
import com.yxcorp.gifshow.util.rx.RxBus;
import jsa.h;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import dua.i;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ujc.d;
import t45.d;
import brd.z;
import dua.g;
import ujc.e;
import dua.h;
import android.view.ViewGroup;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.drawing.e;
import android.view.View$OnTouchListener;
import nta.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.StringBuilder;
import com.yxcorp.utility.RomUtils;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import ekd.l1;
import com.kwai.sdk.switchconfig.a;
import android.view.View;
import com.yxcorp.utility.n;
import java.lang.Runnable;
import ekd.k1;
import wl9.v;
import java.lang.Integer;
import wf0.j0;
import oua.a;
import java.util.Objects;
import com.kuaishou.ax2c.PreLoader;
import java.lang.Exception;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import hn5.i0;
import android.view.LayoutInflater;
import ag6.a;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.homepage.presenter.splash.c;
import yx.j0;

public class ThanosSplashPresenter extends b	// class@0017da
{
    public boolean A;
    public final Runnable B;
    public final Runnable C;
    public ThanosSplashPresenter$PersonalizedTabState z;

    public void ThanosSplashPresenter(){
       super();
       this.z = ThanosSplashPresenter$PersonalizedTabState.NO_NEED;
       this.B = new j(this);
       this.C = new k(this);
    }
    public void E8(){
       ThanosSplashPresenter thanosSplash = ThanosSplashPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, thanosSplash, "4")) {
          return;
       }
       super.E8();
       if (!PatchProxy.applyVoid(objArray, this, thanosSplash, "7")) {
          int i = -1608526086;
          if (b.a(i).Y()) {
             if (!PatchProxy.applyVoid(objArray, this, thanosSplash, "6")) {
                super.d9();
                this.b9(true);
             }
             int i1 = 0;
             Object[] objArray1 = new Object[i1];
             b.C().w("ThanosSplashPresenter", "needSplash", objArray1);
             if (RealtimeTabRequester.y()) {
                this.z = ThanosSplashPresenter$PersonalizedTabState.WAITING_DATA_END;
             }
             if (!b.a(i).isColdStart() && (!d.a(-536296199).LG() && this.z != ThanosSplashPresenter$PersonalizedTabState.WAITING_DATA_END)) {
                Object[] objArray2 = new Object[i1];
                b.C().s("ThanosSplashPresenter", "!isRequestingPersonalizedTab,end", objArray2);
                this.Y8(i1);
             }else {
                objArray = new Object[i1];
                b.C().s("ThanosSplashPresenter", "isRequestingPersonalizedTab,waiting eventbus", objArray);
             }
          }
       }
       RxBus f = RxBus.f;
       RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
       this.X7(f.g(h.class, mAIN).subscribe(new i(this)));
       if (this.x != null) {
          this.X7(f.f(d.class).observeOn(d.a).subscribe(new g(this)));
       }
       this.X7(f.g(e.class, mAIN).subscribe(new h(this)));
       return;
    }
    public void F8(){
       boolean b;
       ThanosSplashPresenter thanosSplash = ThanosSplashPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, thanosSplash, "3")) {
          return;
       }
       super.F8();
       this.S8().setOnTouchListener(e.b);
       String str = "ThanosSplashPresenter";
       a.b(str, "onCreate");
       Object obj = PatchProxy.apply(objArray, this, thanosSplash, "9");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.b(str, "needSetCenterLogoOffset isOppoRom: "+RomUtils.s());
          boolean b1 = false;
          b = (RomUtils.s() && (l1.a(a.a().a()) && a.t().d("enable_rectify_oppo_splash_logo", b1)))? true: false;
       }
       if (b) {
          this.S8().findViewById(R.id.center_logo).setTranslationY((float)n.A(this.getContext()));
       }
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, ThanosSplashPresenter.class, "10")) {
          return;
       }
       this.z = ThanosSplashPresenter$PersonalizedTabState.NO_NEED;
       k1.m(this.C);
       k1.m(this.B);
       return;
    }
    public void V8(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ThanosSplashPresenter.class, "1")) {
          return;
       }
       if (p0.a == 5) {
          this.P8();
          k1.o(this.C);
       }else {
          super.V8(p0);
       }
       return;
    }
    public void Y8(int p0){
       boolean b;
       ThanosSplashPresenter thanosSplash = ThanosSplashPresenter.class;
       if (PatchProxy.isSupport(thanosSplash) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, thanosSplash, "14")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.C().w("ThanosSplashPresenter", "onAboutToEnd, mSplashEnd:"+this.A+", hasSplashAd:"+p0, objArray);
       k1.m(this.C);
       if (this.A != null) {
          return;
       }
       b = true;
       this.A = b;
       if (!b.a(-1608526086).X() || p0 == b) {
          Object[] objArray1 = new Object[0];
          b.C().w("ThanosSplashPresenter", "onAboutToEnd hide splash", objArray1);
          if (this.z == ThanosSplashPresenter$PersonalizedTabState.WAITING_TAB_SWITCH) {
             k1.m(this.B);
             k1.r(this.B, 300);
          }else {
             this.B.run();
          }
          b.a(0x440481e4).a();
       }
       return;
    }
    public void Z8(ViewGroup p0){
       int i1;
       View orWait;
       a a;
       if (PatchProxy.applyVoidOneRefs(p0, this, ThanosSplashPresenter.class, "8")) {
          return;
       }
       String str = "ThanosSplashPresenter";
       a.a(str, "onCreateSplash");
       Objects.requireNonNull(a.a);
       int i = 0x7f0d08c0;
       try{
          i1 = 1;
          orWait = PreLoader.getInstance().getOrWait(this.getContext(), i, this.S8(), i1);
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
          Object[] objArray = new Object[0];
          b.C().u(str, e3, objArray);
          String str1 = Log.f(e3);
          try{
             i0.b("ThanosSplashInflateErr", str1);
             orWait = a.c(LayoutInflater.from(this.getContext()), i, this.S8(), i1);
          }catch(java.lang.Exception e1){
             e1.printStackTrace();
             Object[] objArray1 = new Object[0];
             b.C().u(str, e1, objArray1);
             i0.b("ThanosSplashInflateErr", Log.f(e1));
          }
       }
       if (orWait != null) {
          a = a.a;
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoidOneRefs(orWait, a, a.class, "1")) {
             a.p(orWait, "view");
          }
          c.e9(orWait);
          c.h9(orWait);
       }
       return;
    }
    public void a9(){
       if (PatchProxy.applyVoid(null, this, ThanosSplashPresenter.class, "2")) {
          return;
       }
       this.z = ThanosSplashPresenter$PersonalizedTabState.NO_NEED;
       super.a9();
       return;
    }
    public void b9(boolean p0){
       ThanosSplashPresenter thanosSplash = ThanosSplashPresenter.class;
       if (PatchProxy.isSupport(thanosSplash) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, thanosSplash, "13")) {
          return;
       }
       a.a("ThanosSplashPresenter", "setFrameVisible:"+p0);
       super.b9(p0);
       return;
    }
    public void e9(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ThanosSplashPresenter.class, "11")) {
          return;
       }
       super.b9(false);
       if (this.z == ThanosSplashPresenter$PersonalizedTabState.NO_NEED) {
          Object[] objArray = new Object[false];
          b.C().s("ThanosSplashPresenter", "FirstDataFetchFinishEvent", objArray);
          Object[] objArray1 = new Object[false];
          j0.c("ThanosSplashPresenter", "handleFirstDataFetchFinishEvent", objArray1);
          this.R8("handleFirstDataFetchFinishEvent");
          if (!b.a(-1608526086).D2()) {
             this.Y8(false);
          }
       }
       return;
    }
}
