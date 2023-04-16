package com.kwai.live.gzone.accompanyplay.audience.k0;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.live.gzone.accompanyplay.audience.l;
import com.kwai.live.gzone.accompanyplay.audience.k0$f;
import com.kwai.live.gzone.accompanyplay.audience.k0$i;
import crd.a;
import com.kwai.live.gzone.accompanyplay.audience.k0$a;
import java.util.ArrayList;
import com.kwai.live.gzone.accompanyplay.audience.LiveGzoneAccompanyPanelStyle;
import com.kwai.live.gzone.accompanyplay.audience.s;
import com.kwai.live.gzone.accompanyplay.audience.m;
import com.kwai.live.gzone.accompanyplay.audience.v0;
import com.kwai.live.gzone.accompanyplay.audience.u;
import com.kwai.live.gzone.accompanyplay.audience.p0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k37.q1;
import mq5.h;
import mq5.b;
import com.kwai.live.gzone.accompanyplay.audience.LiveGzoneAccompanyLoading;
import com.kwai.live.gzone.accompanyplay.audience.q;
import crd.b;
import lnc.b9;
import java.util.List;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import j37.d;
import j37.c;
import cjd.e;
import erd.o;
import com.kwai.live.gzone.accompanyplay.audience.k0$d;
import com.kwai.live.gzone.accompanyplay.audience.j0;
import com.kwai.library.widget.popup.common.c;
import o37.a;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyGameInfo;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanySdkPlatformConfig;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyGameSdkConfig;
import com.kwai.live.gzone.accompanyplay.audience.p0$e;
import w12.a;
import com.kwai.live.gzone.accompanyplay.audience.u$b;
import com.kwai.live.gzone.accompanyplay.audience.b1$a;
import com.kwai.live.gzone.accompanyplay.audience.b1;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyUserOrderInfo;
import java.lang.Integer;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyEntryInfo;
import java.util.Iterator;
import com.kwai.live.gzone.accompanyplay.audience.k0$e;
import java.lang.Long;
import com.kwai.live.gzone.accompanyplay.audience.LiveGzoneAccompanyLoading$STYLE;
import fq5.b;
import k37.e0;
import erd.a;
import k37.d0;
import brd.x;
import k37.h0;
import k37.g0;
import erd.g;
import k37.c0;
import com.kwai.live.gzone.accompanyplay.audience.k0$b;
import k37.f0;
import com.kwai.live.gzone.accompanyplay.audience.w0;
import com.kwai.live.gzone.widget.e$a;
import android.app.Activity;
import com.kwai.live.gzone.accompanyplay.audience.k0$c;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.live.gzone.widget.e;
import k37.s0;
import java.util.Map;
import java.util.HashMap;
import lp3.i;
import jk1.e;
import k67.g;
import k37.p1;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import j77.b;
import oq5.a;
import s67.h1;
import uq5.a;
import lp3.c;
import j47.c;

public class k0 extends PresenterV2 implements g	// class@000b93
{
    public String A;
    public LiveGzoneAccompanyEntryInfo B;
    public k0$g C;
    public g D;
    public q E;
    public a F;
    public h G;
    public List H;
    public LiveGzoneAccompanyPanelStyle I;
    public p1 J;
    public b p;
    public u$b q;
    public b r;
    public p0$e s;
    public e t;
    public g u;
    public b v;
    public LiveGzoneAccompanyLoading w;
    public l x;
    public w0 y;
    public q1 z;

    public void k0(){
       super();
       this.x = new l();
       this.C = new k0$f(this);
       this.D = new k0$i(this);
       this.F = new a();
       this.G = new k0$a(this);
       this.H = new ArrayList();
       this.I = LiveGzoneAccompanyPanelStyle.CLOSE;
       this.U7(new s());
       this.U7(new m());
       this.U7(new v0());
       this.U7(new u());
       this.U7(new p0());
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, k0.class, "2")) {
          return;
       }
       this.z = new q1();
       this.r.Km(this.G);
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, k0.class, "3")) {
          return;
       }
       k0 tw = this.w;
       if (tw != null) {
          k0 tE = this.E;
          if (tE != null) {
             tE.h(tw);
             this.w = objArray;
          }
       }
       b9.a(this.v);
       tw = this.z;
       if (tw != null) {
          tw.l();
       }
       if (!this.F.isDisposed()) {
          this.F.dispose();
          this.F = new a();
       }
       this.R8();
       this.I = LiveGzoneAccompanyPanelStyle.CLOSE;
       this.H.clear();
       this.A = objArray;
       this.w = objArray;
       this.B = objArray;
       this.r.le(this.G);
       return;
    }
    public t P8(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k0.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return c.b().c(p0).map(new e()).map(new k0$d(this)).flatMap(j0.b);
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, k0.class, "11")) {
          return;
       }
       k0 ty = this.y;
       if (ty != null) {
          ty.o();
          this.y = null;
       }
       return;
    }
    public void S8(a p0){
       k0 ok0 = k0.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ok0, "8")) {
          return;
       }
       if (!QCurrentUser.ME.isLogined()) {
          return;
       }
       a mGameInfo = p0.mGameInfo;
       if (mGameInfo.mEnableOneClick != null) {
          LiveGzoneAccompanyGameInfo mAccompanySd = mGameInfo.mAccompanySdkPlatformConfig;
          if (mAccompanySd != null) {
             LiveGzoneAccompanySdkPlatformConfig mSdkConfig = mAccompanySd.mSdkConfig;
             if (mSdkConfig != null) {
                LiveGzoneAccompanyGameSdkConfig mKwaiSDKMini = mSdkConfig.mKwaiSDKMinimumVersion;
                if (mKwaiSDKMini != null && this.s.a(mKwaiSDKMini)) {
                   if (!PatchProxy.applyVoidOneRefs(p0, this, ok0, "9")) {
                      this.s.c(p0);
                   }
                }
             }
          }
          this.z.n(201);
          this.q.i();
          return;
       }
       this.x.i(p0);
       p0 = p0.mUserOrderInfo;
       int i = 1;
       if (p0 == null || p0.mOrderId == null) {
          this.z.n(i);
       }else {
          LiveGzoneAccompanyUserOrderInfo mOrderStatus = p0.mOrderStatus;
          int i1 = 2;
          if (mOrderStatus != i && mOrderStatus != i1) {
             i = 3;
             if (mOrderStatus != i) {
                i = 4;
                if (mOrderStatus != i) {
                   i1 = 5;
                   if (mOrderStatus != i1) {
                      if (mOrderStatus != 7) {
                         if (mOrderStatus != 10) {
                            this.z.o(1000, Integer.valueOf(mOrderStatus));
                         }else {
                            this.z.n(6);
                            return;
                         }
                      }else {
                         this.z.n(i1);
                         return;
                      }
                   }
                }
                this.z.n(i);
                return;
             }else {
                this.z.n(i);
                return;
             }
          }else {
             this.z.n(i1);
             return;
          }
       }
       return;
    }
    public void V8(LiveGzoneAccompanyEntryInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k0.class, "5")) {
          return;
       }
       k0 tB = this.B;
       if (tB != null && p0.equals(tB)) {
          return;
       }
       this.B = p0;
       Iterator iterator = this.H.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0);
       }
       return;
    }
    public void W8(long p0,LiveGzoneAccompanyLoading p1){
       k0 ok0 = k0.class;
       if (PatchProxy.isSupport(ok0) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, ok0, "7")) {
          return;
       }
       ok0 = this.E;
       if (ok0 == null) {
          return;
       }
       k0 tw = this.w;
       if (tw != null && (tw.mStyle == LiveGzoneAccompanyLoading$STYLE.NON || p1 == LiveGzoneAccompanyLoading.GET_ON_REFRESH_LOADING)) {
          if (tw != null) {
             ok0.h(tw);
          }
          this.w = p1;
       }
       b9.a(this.v);
       this.E.g(this.w);
       this.v = c.b().d(this.p.getLiveStreamId()).map(new e()).doOnComplete(new e0(this)).compose(new d0(p0)).subscribe(new h0(this), new g0(this));
       return;
    }
    public void X7(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k0.class, "14")) {
          return;
       }
       super.X7(p0);
       this.F.c(p0);
       return;
    }
    public void X8(long p0){
       k0 ok0 = k0.class;
       if (PatchProxy.isSupport(ok0) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, ok0, "4")) {
          return;
       }
       this.X7(c.b().f(this.p.getLiveStreamId()).map(new e()).compose(new c0(p0)).subscribe(new k0$b(this), new f0(this)));
       return;
    }
    public void Y8(){
       if (PatchProxy.applyVoid(null, this, k0.class, "10")) {
          return;
       }
       w0 ow0 = new w0(new e$a(this.getActivity()));
       this.y = ow0;
       ow0.x = this.C;
       ow0.y = this.s;
       ow0.i0(new k0$c(this));
       this.y.Z();
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k0.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new s0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, k0.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(k0.class, new s0());
       }else {
          obj.put(k0.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, k0.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_BASIC_CONTEXT");
       this.q = this.q8(u$b.class);
       i oi = this.r8("LIVE_SERVICE_MANAGER");
       this.s = this.r8("LIVE_GZONE_ACCOMPANY_SDK_SERVICE");
       this.t = this.r8("LIVE_AUDIENCE_GIFT_BOX_SERVICE");
       this.u = this.q8(g.class);
       this.r = this.r8("LIVE_AUDIENCE_LIVE_END_SERVICE");
       p1 op1 = new p1();
       this.J = op1;
       op1.a = this.p;
       op1.b = this.r8("LIVE_PHOTO");
       this.J.c = this.s8(b.class);
       this.J.d = this.r8("LIVE_CONFIGURATION_SERVICE");
       k0 tJ = this.J;
       tJ.e = this.r;
       tJ.f = this.q8(h1.class);
       this.J.g = oi.a(a.class);
       this.J.h = this.q8(c.class);
       return;
    }
}
