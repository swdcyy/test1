package com.kuaishou.merchant.dynamicpendant.LiteDACPresenter;
import mq5.h;
import b93.d;
import com.kuaishou.merchant.dynamicpendant.LiteDACPresenter$mPendantCommendHandler$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import aw3.c;
import kotlin.jvm.internal.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import or5.d;
import v51.a;
import xp5.i;
import ks3.b;
import o63.a;
import com.kuaishou.live.lite.tempplay.LiveLiteTempPlayService;
import f93.c;
import c08.a;
import aw3.b;
import com.kuaishou.merchant.dynamicpendant.entrance.DyTroubleShootingModule;
import zv3.a;
import com.kuaishou.android.live.model.QLivePlayConfig;
import com.kwaishou.merchant.daccore.util.DynamicPendantSwitch;
import java.util.Objects;
import com.kwai.sdk.switchconfig.a;
import com.kwaishou.merchant.daccore.b;
import com.kwaishou.merchant.daccore.event.ELiveEvent;
import cw3.c;
import cw3.g;
import cw3.f;
import mq5.b;
import java.lang.Boolean;
import c93.b;
import d93.a;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.api.live.base.service.livestop.LiveAudienceEndReason;
import mq5.g;

public final class LiteDACPresenter extends d implements h	// class@00168b
{
    public a A;
    public i B;
    public b C;
    public a D;
    public LiveLiteTempPlayService E;
    public c F;
    public DyTroubleShootingModule G;
    public a H;
    public b I;
    public b v;
    public a w;
    public final p x;
    public d y;
    public b z;

    public void LiteDACPresenter(){
       super();
       this.x = s.c(new LiteDACPresenter$mPendantCommendHandler$2(this));
    }
    public void E8(){
       LiteDACPresenter liteDACPrese = LiteDACPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liteDACPrese, "5")) {
          return;
       }
       super.E8();
       LiteDACPresenter ty = this.y;
       if (ty == null) {
          a.S("mLiveAudienceInfoManager");
       }
       LiteDACPresenter tA = this.A;
       if (tA == null) {
          a.S("mLongConnectManager");
       }
       LiteDACPresenter tB = this.B;
       if (tB == null) {
          a.S("mLogPackageProvider");
       }
       LiteDACPresenter tC = this.C;
       if (tC == null) {
          a.S("mLiteMerchantService");
       }
       LiteDACPresenter tD = this.D;
       if (tD == null) {
          a.S("mJsBridgeService");
       }
       LiteDACPresenter tE = this.E;
       if (tE == null) {
          a.S("mLiveLiteTempPlayService");
       }
       LiteDACPresenter tF = this.F;
       if (tF == null) {
          a.S("mLiveLiteBenefitCardService");
       }
       c uoc = new c(this, ty, tA, tB, tC, tD, tE, tF);
       this.I = v2;
       a uoa = v2.a();
       this.w = uoa;
       this.G = new DyTroubleShootingModule(uoa);
       this.H = new a(this.w);
       if (!PatchProxy.applyVoid(objArray, this, liteDACPrese, "6")) {
          liteDACPrese = this.y;
          if (liteDACPrese == null) {
             a.S("mLiveAudienceInfoManager");
          }
          if (liteDACPrese != null) {
             QLivePlayConfig qLivePlayCon = liteDACPrese.C0();
             if (qLivePlayCon != null) {
                LiteDACPresenter tw = this.w;
                if (tw != null) {
                   tw.q(qLivePlayCon.mIsShopLive);
                }
                tw = this.G;
                if (tw != null) {
                   tw.b("liteLive initPendantManager");
                }
                Objects.requireNonNull(DynamicPendantSwitch.a);
                if (a.t().d("enableAllLiteLiveDAC", false) || qLivePlayCon.mIsShopLive != null) {
                   liteDACPrese = this.G;
                   if (liteDACPrese != null) {
                      liteDACPrese.a();
                   }
                   if (this.v == null) {
                      b uob = new b(this.w);
                      this.v = uob;
                      uob.f();
                   }
                }
             }
          }
       }
    label_00c4 :
       liteDACPrese = this.v;
       if (liteDACPrese != null) {
          liteDACPrese.c(ELiveEvent.LIVE_BIND);
       }
       f.b(this.c9());
       liteDACPrese = this.z;
       if (liteDACPrese == null) {
          a.S("mLiveAudienceEndService");
       }
       if (liteDACPrese != null) {
          liteDACPrese.Km(this);
       }
       this.d9();
       liteDACPrese = this.H;
       if (liteDACPrese != null) {
          liteDACPrese.a();
       }
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, LiteDACPresenter.class, "4")) {
          return;
       }
       super.F8();
       LiteDACPresenter tv = this.v;
       if (tv != null) {
          tv.c(ELiveEvent.LIVE_CREATE);
       }
       return;
    }
    public void H8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiteDACPresenter.class, "12")) {
          return;
       }
       LiteDACPresenter tv = this.v;
       if (tv != null) {
          tv.c(ELiveEvent.LIVE_DESTROY);
       }
       tv = this.y;
       if (tv == null) {
          a.S("mLiveAudienceInfoManager");
       }
       QLivePlayConfig qLivePlayCon = (tv != null)? tv.C0(): objArray;
       LiteDACPresenter tG = this.G;
       if (tG != null) {
          if (qLivePlayCon != null) {
             objArray = Boolean.valueOf(qLivePlayCon.mIsShopLive);
          }
          tG.d(objArray.booleanValue());
       }
       tv = this.w;
       if (tv != null) {
          tv.h();
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, LiteDACPresenter.class, "7")) {
          return;
       }
       super.J8();
       LiteDACPresenter tG = this.G;
       if (tG != null) {
          tG.f();
       }
       tG = this.v;
       if (tG != null) {
          tG.c(ELiveEvent.LIVE_UNBIND);
       }
       f.c(this.c9());
       tG = this.z;
       if (tG == null) {
          a.S("mLiveAudienceEndService");
       }
       if (tG != null) {
          tG.le(this);
       }
       tG = this.H;
       if (tG != null) {
          tG.b();
       }
       return;
    }
    public void X8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiteDACPresenter.class, "2")) {
          return;
       }
       this.y = p0.a(d.class);
       this.z = p0.a(b.class);
       this.A = p0.a(a.class);
       this.B = p0.a(i.class);
       this.D = p0.a(a.class);
       return;
    }
    public void Y8(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiteDACPresenter.class, "3")) {
          return;
       }
       this.C = p0.a(b.class);
       this.E = p0.a(LiveLiteTempPlayService.class);
       this.F = p0.a(c.class);
       return;
    }
    public void a9(){
       if (PatchProxy.applyVoid(null, this, LiteDACPresenter.class, "10")) {
          return;
       }
       LiteDACPresenter tv = this.v;
       if (tv != null) {
          tv.c(ELiveEvent.PAGE_SHOW);
       }
       this.d9();
       return;
    }
    public void b9(){
       if (PatchProxy.applyVoid(null, this, LiteDACPresenter.class, "9")) {
          return;
       }
       LiteDACPresenter tG = this.G;
       if (tG != null) {
          tG.f();
       }
       tG = this.v;
       if (tG != null) {
          tG.c(ELiveEvent.PAGE_HIDE);
       }
       return;
    }
    public final c c9(){
       Object obj = PatchProxy.apply(null, this, LiteDACPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.x.getValue();
    }
    public final void d9(){
       if (PatchProxy.applyVoid(null, this, LiteDACPresenter.class, "11")) {
          return;
       }
       LiteDACPresenter tG = this.G;
       if (tG != null) {
          tG.e();
       }
       return;
    }
    public void fa(LiveAudienceEndReason p0){
       g.a(this, p0);
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, LiteDACPresenter.class, "8")) {
          return;
       }
       LiteDACPresenter tv = this.v;
       if (tv != null) {
          tv.c(ELiveEvent.LIVE_STOP);
       }
       return;
    }
}
