package com.kuaishou.merchant.marketing.platform.skyfallcoupon.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import l84.b;
import su.o;
import vu.c;
import sr5.b;
import p84.b;
import p84.a;
import ks3.a0;
import brd.t;
import cjd.e;
import erd.o;
import com.kuaishou.merchant.marketing.platform.skyfallcoupon.a;
import erd.r;
import l84.c;
import w74.b;
import com.kuaishou.merchant.marketing.platform.MerchantMarketingPlatformLogBiz;
import p74.a;
import erd.g;
import crd.b;
import com.kuaishou.merchant.marketing.platform.skyfallcoupon.model.LiveAnchorSkyFallPendentModel;
import com.kuaishou.merchant.marketing.platform.skyfallcoupon.widget.LiveMerchantAncSkyFallPendentView;
import java.lang.Long;
import com.yxcorp.utility.f;
import l84.d;
import android.content.Context;
import l84.a;
import android.view.View$OnClickListener;
import android.widget.FrameLayout;
import com.kwai.robust.PatchProxyResult;
import bs3.b;
import lnc.a1;
import ks3.l0;
import l84.u;
import java.lang.Integer;
import java.lang.Boolean;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import zt3.j;
import lnc.b9;
import ks3.k0;
import fq5.b;
import ks3.f0;

public class b extends PresenterV2	// class@001b36
{
    public String A;
    public b p;
    public a0 q;
    public l0 r;
    public k0 s;
    public b t;
    public LiveMerchantAncSkyFallPendentView u;
    public b v;
    public LiveAnchorSkyFallPendentModel w;
    public b x;
    public c y;
    public f0 z;

    public void b(){
       super();
    }
    public void E8(){
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uob, "3")) {
          this.y = new b(this);
          o.c().a("LIVE_WATCH", this.A, "sky_fall_coupon_seller_pendant", this.y);
       }
       if (!PatchProxy.applyVoid(objArray, this, uob, "6") && this.p.K()) {
          uob = a.a();
          String str = this.q.c();
          int i = 1;
          int i1 = (this.p.z())? 1: 2;
          this.X7(uob.a(str, i, i1).map(new e()).filter(a.b).subscribe(new c(this), new b(MerchantMarketingPlatformLogBiz.SKY_FALL_COUPON, "LiveAnchorSkyFallPresenter", "loadPendantStatus error")));
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "5")) {
          return;
       }
       this.R8(true);
       o.c().m("LIVE_WATCH", this.A, this.y);
       return;
    }
    public final void P8(LiveAnchorSkyFallPendentModel p0){
       b tu;
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "8")) {
          return;
       }
       b uob1 = 2;
       if (p0.mPendantActivityStatus == uob1) {
          tu = this.u;
          if (tu != null) {
             tu.n(this.w);
          }
          long l = (long)p0.mDisappearTime;
          if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l), this, uob, "10")) {
             this.S8();
             this.x = f.d().e(l).subscribe(new d(this));
          }
       }else {
          this.S8();
          if (this.u == null) {
             this.u = new LiveMerchantAncSkyFallPendentView(this.getContext());
          }
          this.u.setOnClickListener(new a(this));
          this.w = p0;
          this.u.n(p0);
          if (this.v == null) {
             b tu1 = this.u;
             tu = PatchProxy.applyOneRefs(tu1, this, uob, "9");
             if (tu != PatchProxyResult.class) {
             }else {
                tu = new b();
                tu.d = tu1;
                tu.f = 6000;
                tu.b = a1.e(80.00f);
                tu.c = a1.e(80.00f);
                tu.a = uob1;
             }
             if (!PatchProxy.applyVoidOneRefs(tu, this, uob, "14") && tu) {
                this.r.i(tu);
                this.v = tu;
                if (this.w != null) {
                   String liveStreamId = this.q.getLiveStreamId();
                   String str = this.q.c();
                   uob = this.w;
                   LiveAnchorSkyFallPendentModel mActivityIds = uob.mActivityIds;
                   LiveAnchorSkyFallPendentModel mActivityTyp = uob.mActivityType;
                   if (!PatchProxy.isSupport(u.class) || !PatchProxy.applyVoidFourRefs(liveStreamId, str, mActivityIds, Integer.valueOf(mActivityTyp), null, u.class, "1")) {
                      u.e(liveStreamId, str, mActivityIds, mActivityTyp);
                   }
                }
             }
          }
       }
    label_00e0 :
       return;
    }
    public final void R8(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "12")) {
          return;
       }
       this.r.j(this.v);
       this.v = null;
       this.u = null;
       this.w = null;
       if (p0 && !PatchProxy.applyVoid(null, this, uob, "13")) {
          Activity activity = this.getActivity();
          if (activity != null && activity instanceof GifshowActivity) {
             j.a(activity.getSupportFragmentManager());
          }
       }
       this.S8();
       return;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, b.class, "11")) {
          return;
       }
       b9.a(this.x);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_PUSH_CALLER_CONTEXT");
       this.r = this.r8("LIVE_MERCHANT_AUDIENCE_SLIDE_SHOW_SERVICE");
       this.s = this.r8("LIVE_MERCHANT_SIGNAL_SERVICE");
       this.q = this.r8("LIVE_MERCHANT_CALLER_CONTEXT_SERVICE");
       this.t = this.r8("LIVE_BASIC_CONTEXT");
       f0 uof0 = this.r8("LIVE_MERCHANT_LIVE_INTERNAL_ROUTER_SERVICE");
       this.z = uof0;
       this.A = uof0.J4();
       return;
    }
}
