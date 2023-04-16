package com.kuaishou.merchant.dynamicpendant.LiveDACPresenter;
import ds5.c;
import ks3.p0;
import aw3.a;
import com.kuaishou.merchant.dynamicpendant.LiveDACPresenter$mPendantCommendHandler$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.merchant.dynamicpendant.LiveDACPresenter$mLiveStateDispatch$2;
import com.kuaishou.merchant.dynamicpendant.LiveDACPresenter$mReturnDialogManager$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ds5.a;
import com.kwaishou.merchant.daccore.event.ELiveEvent;
import com.kwaishou.merchant.daccore.b;
import cw3.c;
import cw3.g;
import cw3.f;
import ks3.t;
import bw3.a;
import com.kwaishou.merchant.daccore.data.context.PendantLiveContext;
import c08.a;
import java.util.Objects;
import java.lang.CharSequence;
import zsd.u;
import bw3.b;
import ks3.r$a;
import ks3.r;
import bw3.c;
import ks3.r$b;
import zv3.a;
import com.kuaishou.merchant.dynamicpendant.entrance.DyTroubleShootingModule;
import ds5.b;
import ks3.o0;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.dynamicpendant.LiveDACPresenter$initPendantManager$1;
import com.kuaishou.merchant.dynamicpendant.LiveDACPresenter$initPendantManager$2;
import com.kwaishou.merchant.daccore.util.DynamicPendantSwitch;
import com.kwai.sdk.switchconfig.a;
import java.lang.Boolean;
import cs3.a;
import tkd.b;
import tkd.d;
import fs5.a;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.dynamicpendant.LiveDACPresenter$b;
import lp3.i;
import gs5.a;
import com.kuaishou.android.live.model.QLivePlayConfig;
import com.kwaishou.merchant.daccore.PendantEnvReadyLatch;
import com.kwaishou.merchant.daccore.data.PendantDataServer;
import com.kuaishou.merchant.dynamicpendant.LiveDACPresenter$a;
import java.lang.Runnable;
import ekd.k1;
import ds5.e;
import fq5.b;
import ks3.f0;
import ks3.k0;
import tq5.c;
import sr5.a;
import aw3.d;
import java.lang.Throwable;

public final class LiveDACPresenter extends a implements c, p0	// class@001693
{
    public f0 A;
    public a B;
    public i C;
    public r D;
    public boolean E;
    public boolean F;
    public final p G;
    public final p H;
    public c I;
    public boolean J;
    public int K;
    public boolean L;
    public DyTroubleShootingModule p;
    public d q;
    public a r;
    public b s;
    public a t;
    public a u;
    public k0 v;
    public final p w;
    public e x;
    public b y;
    public t z;

    public void LiveDACPresenter(int p0,boolean p1){
       super();
       this.K = p0;
       this.L = p1;
       this.w = s.c(new LiveDACPresenter$mPendantCommendHandler$2(this));
       this.G = s.c(LiveDACPresenter$mLiveStateDispatch$2.INSTANCE);
       this.H = s.c(new LiveDACPresenter$mReturnDialogManager$2(this));
    }
    public void E8(){
       String liveId;
       a a;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveDACPresenter.class, "9")) {
          return;
       }
       LiveDACPresenter tx = this.x;
       if (tx != null) {
          tx.gd(this);
       }
       tx = this.s;
       if (tx != null) {
          tx.c(ELiveEvent.LIVE_BIND);
       }
       f.b(this.R8());
       tx = this.z;
       if (tx != null) {
          tx.c(this);
       }
       a uoa = this.P8();
       LiveDACPresenter tt = this.t;
       if (tt != null) {
          PendantLiveContext pendantLiveC = tt.d();
          if (pendantLiveC != null) {
             liveId = pendantLiveC.getLiveId();
          label_003e :
             LiveDACPresenter tD = this.D;
             Objects.requireNonNull(uoa);
             if (!PatchProxy.applyVoidTwoRefs(liveId, tD, uoa, a.class, "1") && tD != null) {
                int i = (liveId == null || u.S1(liveId))? 1: 0;
                if (!i) {
                   uoa.d = liveId;
                   uoa.c = tD;
                   if (!PatchProxy.applyVoid(objArray, uoa, a.class, "4")) {
                      if (uoa.a == null) {
                         uoa.a = new b(uoa);
                      }
                      a = uoa.a;
                      if (a != null) {
                         a c1 = uoa.c;
                         if (c1 != null) {
                            c1.b(a);
                         }
                      }
                   }
                label_0082 :
                   if (!PatchProxy.applyVoid(objArray, uoa, a.class, "5")) {
                      if (uoa.b == null) {
                         uoa.b = new c(uoa);
                      }
                      a c = uoa.c;
                      if (c != null) {
                         c.h(uoa.b);
                      }
                   }
                }
             }
          label_009f :
             if (this.z == null) {
                this.V8();
                this.W8();
             }
             tx = this.r;
             if (tx != null) {
                tx.a();
             }
             return;
          }
       }
       liveId = objArray;
       goto label_003e ;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, LiveDACPresenter.class, "8")) {
          return;
       }
       LiveDACPresenter ts = this.s;
       if (ts != null) {
          ts.c(ELiveEvent.LIVE_CREATE);
       }
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, LiveDACPresenter.class, "18")) {
          return;
       }
       LiveDACPresenter ts = this.s;
       if (ts != null) {
          ts.c(ELiveEvent.LIVE_DESTROY);
       }
       ts = this.p;
       if (ts != null) {
          ts.d(this.J);
       }
       ts = this.t;
       if (ts != null) {
          ts.h();
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, LiveDACPresenter.class, "10")) {
          return;
       }
       this.Y8();
       this.X8();
       LiveDACPresenter tx = this.x;
       if (tx != null) {
          tx.fo(this);
       }
       tx = this.s;
       if (tx != null) {
          tx.c(ELiveEvent.LIVE_UNBIND);
       }
       f.c(this.R8());
       tx = this.z;
       if (tx != null) {
          tx.d(this);
       }
       a uoa = this.P8();
       Objects.requireNonNull(uoa);
       if (!PatchProxy.applyVoid(null, uoa, a.class, "2")) {
          a c = uoa.c;
          if (c != null) {
             c.m(uoa.b);
          }
          c = uoa.a;
          if (c != null) {
             a c1 = uoa.c;
             if (c1 != null) {
                c1.k(c);
             }
          }
          uoa.c = null;
       }
       tx = this.r;
       if (tx != null) {
          tx.b();
       }
       return;
    }
    public String N5(){
       return b.a(this);
    }
    public void P(){
       if (PatchProxy.applyVoid(null, this, LiveDACPresenter.class, "13")) {
          return;
       }
       o0.b(this);
       this.Y8();
       this.X8();
       LiveDACPresenter ts = this.s;
       if (ts != null) {
          ts.c(ELiveEvent.PAGE_HIDE);
       }
       return;
    }
    public final a P8(){
       Object obj = PatchProxy.apply(null, this, LiveDACPresenter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.G.getValue();
    }
    public final c R8(){
       Object obj = PatchProxy.apply(null, this, LiveDACPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.w.getValue();
    }
    public final void S8(){
       boolean b1;
       LiveDACPresenter liveDACPrese = LiveDACPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveDACPrese, "6")) {
          return;
       }
       LiveDACPresenter tp = this.p;
       if (tp != null) {
          tp.a();
       }
       LiveDACPresenter$initPendantManager$1 oinitPendant = new LiveDACPresenter$initPendantManager$1(this);
       LiveDACPresenter$initPendantManager$2 oinitPendant1 = new LiveDACPresenter$initPendantManager$2(this, oinitPendant);
       LiveDACPresenter tK = this.K;
       int i = 1;
       if (tK != i) {
          if (tK == 2 || tK == 3) {
             Objects.requireNonNull(DynamicPendantSwitch.a);
             long l = a.t().b("OpenAssemblyCenterAllLive", 0);
             boolean b = false;
             if (l - 1 && l - 3) {
                i = 0;
             }
             if (!i) {
                Object obj = PatchProxy.apply(objArray, this, liveDACPrese, "7");
                if (obj != PatchProxyResult.class) {
                   b1 = obj.booleanValue();
                }else {
                   liveDACPrese = this.B;
                   if (liveDACPrese != null) {
                      b = liveDACPrese.d();
                   }
                   this.J = b;
                   liveDACPrese = this.t;
                   if (liveDACPrese != null) {
                      liveDACPrese.q(b);
                   }
                   b1 = b;
                }
                if (!b1) {
                label_007f :
                   return;
                }
             }
             oinitPendant1.invoke();
             goto label_007f ;
          }
       }else if(this.F != null){
          oinitPendant1.invoke();
          goto label_007f ;
       }else {
          oinitPendant.invoke();
          goto label_007f ;
       }
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, LiveDACPresenter.class, "14")) {
          return;
       }
       LiveDACPresenter tp = this.p;
       if (tp != null) {
          tp.e();
       }
       return;
    }
    public final void W8(){
       if (PatchProxy.applyVoid(null, this, LiveDACPresenter.class, "16")) {
          return;
       }
       if (this.K == 3) {
          return;
       }
       d.a(-1397441499).RC(this.C, this.m8(), new LiveDACPresenter$b());
       return;
    }
    public final void X8(){
       if (PatchProxy.applyVoid(null, this, LiveDACPresenter.class, "15")) {
          return;
       }
       LiveDACPresenter tp = this.p;
       if (tp != null) {
          tp.f();
       }
       return;
    }
    public final void Y8(){
       if (PatchProxy.applyVoid(null, this, LiveDACPresenter.class, "17")) {
          return;
       }
       if (this.K == 3) {
          return;
       }
       d.a(-1397441499).gp(this.C);
       return;
    }
    public void e2(QLivePlayConfig p0,QLivePlayConfig p1){
       b.c(this, p0, p1);
    }
    public void ff(QLivePlayConfig p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveDACPresenter.class, "5")) {
          return;
       }
       b.b(this, p0);
       b = true;
       this.F = b;
       if (this.J == null) {
          this.J = p0.mIsShopLive;
       }
       LiveDACPresenter tt = this.t;
       if (tt != null) {
          tt.q(p0.mIsShopLive);
       }
       tt = this.p;
       if (tt != null) {
          tt.b("onAfterConfigUpdated finish");
       }
       if (this.K != b) {
          return;
       }else {
          Objects.requireNonNull(DynamicPendantSwitch.a);
          long l = a.t().b("OpenAssemblyCenterAllLive", 0);
          if (l - 1 && l - 2) {
             b = false;
          }
          if (b || p0.mIsShopLive != null) {
             k1.o(new LiveDACPresenter$a(this));
          }else {
             LiveDACPresenter ts = this.s;
             if (ts != null) {
                ts.h.a();
                b d = ts.d;
                if (d != null) {
                   d.q(ts.e);
                }
             }
          }
          return;
       }
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LiveDACPresenter.class, "4")) {
          return;
       }
       this.C = this.t8("LIVE_SERVICE_MANAGER");
       this.x = this.t8("LIVE_PLAY_CONFIG_SERVICE");
       this.B = this.s8(a.class);
       this.D = this.t8("LIVE_MERCHANT_AUDIENCE_BOTTOM_BAR_SERVICE");
       this.y = this.t8("LIVE_BASIC_CONTEXT");
       this.z = this.t8("LIVE_MERCHANT_AUDIENCE_COMMON_SERVICE");
       this.A = this.t8("LIVE_MERCHANT_LIVE_INTERNAL_ROUTER_SERVICE");
       this.v = this.t8("LIVE_MERCHANT_SIGNAL_SERVICE");
       this.I = this.t8("LIVE_QUIT_LIVE_SERVICE");
       this.u = this.t8("LIVE_PLAY_CALLER_CONTEXT");
       d uod = new d(this.K, this.L, this);
       this.q = uod;
       a uoa = uod.a();
       this.t = uoa;
       this.p = new DyTroubleShootingModule(uoa);
       this.r = new a(this.t);
       this.S8();
       return;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, LiveDACPresenter.class, "11")) {
          return;
       }
       o0.a(this);
       LiveDACPresenter ts = this.s;
       if (ts != null) {
          ts.c(ELiveEvent.LIVE_STOP);
       }
       return;
    }
    public void onError(Throwable p0){
       b.d(this, p0);
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, LiveDACPresenter.class, "12")) {
          return;
       }
       o0.c(this);
       LiveDACPresenter ts = this.s;
       if (ts != null) {
          ts.c(ELiveEvent.PAGE_SHOW);
       }
       this.V8();
       this.W8();
       return;
    }
    public boolean xi(){
       return b.e(this);
    }
}
