package com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoBottomPendantPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoBottomPendantPresenter$a;
import nsd.u;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoBottomPendantPresenter$b;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoBottomPendantPresenter$c;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import java.lang.String;
import kotlin.jvm.internal.a;
import pq5.c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import i2b.a;
import java.util.Objects;
import com.kuaishou.live.ad.fanstop.widget.LiveAdNeoBottomPendantView;
import ks3.r$b;
import ks3.r;
import com.kuaishou.android.model.ads.LiveAdNeoParam;
import com.kuaishou.android.model.ads.LiveAdNeoParam$TaskInfoParam;
import com.kuaishou.android.model.ads.NeoLiveBottomPendantInfo;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoBottomPendantPresenter$onBind$1;
import msd.l;
import lnc.y0;
import rq5.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import yb6.d;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;

public final class LiveAudienceAdNeoBottomPendantPresenter extends PresenterV2	// class@000959
{
    public LiveAdNeoParam p;
    public c q;
    public r r;
    public LiveAudienceParam s;
    public LiveAdNeoBottomPendantView t;
    public final LiveAudienceAdNeoBottomPendantPresenter$b u;
    public final r$b v;
    public static final LiveAudienceAdNeoBottomPendantPresenter$a w;

    static {
       LiveAudienceAdNeoBottomPendantPresenter.w = new LiveAudienceAdNeoBottomPendantPresenter$a(null);
    }
    public void LiveAudienceAdNeoBottomPendantPresenter(){
       super();
       this.u = new LiveAudienceAdNeoBottomPendantPresenter$b(this);
       this.v = new LiveAudienceAdNeoBottomPendantPresenter$c(this);
    }
    public static final LiveAudienceParam P8(LiveAudienceAdNeoBottomPendantPresenter p0){
       p0 = p0.s;
       if (p0 == null) {
          a.S("mLiveAudienceParam");
       }
       return p0;
    }
    public static final c R8(LiveAudienceAdNeoBottomPendantPresenter p0){
       p0 = p0.q;
       if (p0 == null) {
          a.S("mLiveRightPendantContainerService");
       }
       return p0;
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAudienceAdNeoBottomPendantPresenter.class, "2")) {
          return;
       }
       if (!this.S8()) {
          return;
       }
       if (this.t == null) {
          View view = a.d(this.getContext(), R.layout.arg_RES_7f0d005a, this.m8(), false);
          Objects.requireNonNull(view, "null cannot be cast to non-null type com.kuaishou.live.ad.fanstop.widget.LiveAdNeoBottomPendantView");
          this.t = view;
       }
       LiveAudienceAdNeoBottomPendantPresenter tr = this.r;
       if (tr == null) {
          a.S("mMerchantBottomBarService");
       }
       tr.h(this.v);
       tr = this.t;
       if (tr != null) {
          LiveAudienceAdNeoBottomPendantPresenter tp = this.p;
          if (tp != null) {
             LiveAdNeoParam mTaskInfoPar = tp.mTaskInfoParam;
             if (mTaskInfoPar != null) {
                objArray = mTaskInfoPar.mNeoLiveBottomPendantInfo;
             }
          }
          tr.setData(objArray);
       }
       tr = this.t;
       if (tr != null) {
          y0.a(tr, new LiveAudienceAdNeoBottomPendantPresenter$onBind$1(this));
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceAdNeoBottomPendantPresenter.class, "3")) {
          return;
       }
       LiveAudienceAdNeoBottomPendantPresenter tr = this.r;
       if (tr == null) {
          a.S("mMerchantBottomBarService");
       }
       tr.m(this.v);
       tr = this.q;
       if (tr == null) {
          a.S("mLiveRightPendantContainerService");
       }
       tr.g9(this.u);
       return;
    }
    public final boolean S8(){
       LiveAdNeoParam$TaskInfoParam mCouponExpir;
       Object[] objArray = null;
       LiveAudienceAdNeoBottomPendantPresenter obj = PatchProxy.apply(objArray, this, LiveAudienceAdNeoBottomPendantPresenter.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.p;
       if (obj != null) {
          LiveAdNeoParam mTaskInfoPar = obj.mTaskInfoParam;
          if (mTaskInfoPar != null) {
             objArray = mTaskInfoPar.mNeoLiveBottomPendantInfo;
          }
       }
       boolean b = true;
       objArray = (objArray != null)? 1: 0;
       if (obj != null) {
          LiveAdNeoParam mTaskInfoPar1 = obj.mTaskInfoParam;
          if (mTaskInfoPar1 != null) {
             mCouponExpir = mTaskInfoPar1.mCouponExpireTimestampMs;
          label_0030 :
             mTaskInfoPar1 = (mCouponExpir - d.a() > 0)? 1: 0;
             if (!objArray || !mTaskInfoPar1) {
                b = false;
             }
             return b;
          }
       }
       mCouponExpir = 0;
       goto label_0030 ;
    }
    public void j8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAudienceAdNeoBottomPendantPresenter.class, "1")) {
          return;
       }
       LiveBizParam liveBizParam = this.s8(LiveBizParam.class);
       if (liveBizParam != null) {
          objArray = liveBizParam.mAdNeoPendantParam;
       }
       this.p = objArray;
       Object obj = this.q8(c.class);
       a.o(obj, "inject\(LiveRightPendantC¡­ainerService::class.java\)");
       this.q = obj;
       obj = this.r8("LIVE_MERCHANT_AUDIENCE_BOTTOM_BAR_SERVICE");
       a.o(obj, "inject\(MerchantAccessIds¡­IENCE_BOTTOM_BAR_SERVICE\)");
       this.r = obj;
       obj = this.r8("LIVE_AUDIENCE_PARAM");
       a.o(obj, "inject\(LiveAccessIds.LIVE_AUDIENCE_PARAM\)");
       this.s = obj;
       return;
    }
}
