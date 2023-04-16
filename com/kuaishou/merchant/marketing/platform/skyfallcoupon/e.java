package com.kuaishou.merchant.marketing.platform.skyfallcoupon.e;
import im8.g;
import com.kuaishou.merchant.marketing.base.lifecycle.MarketingBasePresenter;
import x74.c;
import java.lang.String;
import com.kuaishou.merchant.marketing.platform.skyfallcoupon.e$a;
import com.kuaishou.merchant.marketing.platform.skyfallcoupon.e$b;
import l84.k;
import l84.f;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import l84.u;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.merchant.marketing.platform.skyfallcoupon.model.LiveMerchantSkyFallModel;
import java.lang.Integer;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import tkd.b;
import tkd.d;
import fs5.a;
import gs5.c;
import ks3.r$a;
import ks3.r;
import crd.b;
import lnc.b9;
import su.o;
import ks3.f0;
import vu.c;
import ks3.t;
import com.kuaishou.merchant.router.b;
import x74.d;
import x74.h;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Objects;
import x74.d$a;
import kotlin.jvm.internal.a;
import java.lang.ref.WeakReference;
import x74.g;
import x74.a;
import android.content.Context;
import l84.e;
import com.airbnb.lottie.LottieTask;
import com.airbnb.lottie.a;
import l84.m;
import l84.n;
import l84.v;
import c84.a;
import cb4.e;
import com.kuaishou.merchant.marketing.platform.MerchantMarketingPlatformLogBiz;
import p74.a;
import o74.a;
import com.kuaishou.merchant.marketing.platform.skyfallcoupon.SkyFallDataExplorationTrigger;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.merchant.marketing.platform.skyfallcoupon.SkyFallDataExplorationError;
import com.kuaishou.merchant.marketing.platform.skyfallcoupon.SkyFallDataExplorationEnvError;
import com.kuaishou.merchant.api.core.model.MerchantAudienceParams;
import m84.a;
import com.kuaishou.bowl.data.center.data.model.MaterialMap;
import java.util.List;
import fg6.a;
import com.kuaishou.bowl.data.center.data.model.MaterialMapItem;
import com.google.gson.JsonElement;
import com.google.gson.Gson;
import java.lang.Throwable;
import l84.t;
import java.util.Map;
import java.util.HashMap;
import zp5.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.merchant.marketing.platform.skyfallcoupon.dialog.DynamicSkyFallCouponDialog;
import com.kuaishou.bowl.data.center.data.model.live.signal.SignalPendant;
import java.lang.Long;
import com.kuaishou.merchant.marketing.platform.skyfallcoupon.e$c;
import qrd.p;
import su.g;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.Pair;
import qrd.r0;
import trd.s0;
import v74.a;
import tu.h;
import p84.b;
import p84.a;
import brd.t;
import cjd.e;
import erd.o;
import w74.b;
import erd.g;
import l84.i;
import l84.h;
import lnc.a1;
import com.yxcorp.retrofit.model.KwaiException;
import u07.t$a;
import u07.u;
import u07.f;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;
import js6.a;
import d84.e;
import brd.v;
import a84.a;
import a84.a$a;
import o84.a;
import com.kuaishou.merchant.marketing.platform.skyfallcoupon.e$d;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kwai.framework.model.user.User;
import android.content.DialogInterface$OnShowListener;
import ht3.c;
import android.content.DialogInterface$OnDismissListener;
import com.kuaishou.merchant.marketing.platform.skyfallcoupon.c;
import lnc.c3$b;
import lnc.c3;
import com.kuaishou.merchant.basic.util.b;
import x74.e;
import io.reactivex.g;
import x74.f;
import erd.a;
import java.util.concurrent.TimeUnit;
import com.kuaishou.merchant.marketing.platform.skyfallcoupon.d;
import brd.w;
import erd.c;
import t45.d;
import brd.z;
import l84.o;
import l84.q;
import l84.p;
import l84.g;
import l84.l;
import ok.h;
import com.yxcorp.gifshow.util.rx.RxBus;
import z74.a;
import w4.e;
import com.airbnb.lottie.LottieAnimationView;
import l84.j;
import java.lang.Runnable;
import ekd.k1;

public class e extends MarketingBasePresenter implements g	// class@001b43
{
    public final String I;
    public r J;
    public f0 K;
    public a L;
    public boolean M;
    public boolean N;
    public c O;
    public boolean P;
    public DynamicSkyFallCouponDialog Q;
    public LiveMerchantSkyFallModel R;
    public c S;
    public SignalPendant T;
    public SkyFallDataExplorationTrigger U;
    public c U0;
    public b V;
    public final r$a W;
    public a X;
    public DialogInterface$OnShowListener Y;
    public DialogInterface$OnDismissListener Z;

    public void e(){
       super();
       this.I = "kwaimerchant://skyFallDialog";
       this.M = false;
       this.N = false;
       this.P = false;
       this.S = new c("https://js-ec.static.yximgs.com/udata/pkg/ks-merchant/merchant_rising_coupon/skyfall_v2.zip", true, "skyfall");
       this.V = null;
       this.W = new e$a(this);
       this.X = new e$b(this);
       this.Y = new k(this);
       this.Z = new f(this);
    }
    public void Z8(){
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe, "12")) {
          return;
       }
       boolean b = true;
       if (this.R != null) {
          ClientContent$LiveStreamPackage liveStreamPa = this.h9().getLiveStreamPackage();
          e tR = this.R;
          if (!PatchProxy.applyVoidTwoRefs(liveStreamPa, tR, objArray, u.class, "5")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "MERCHANT_NEW_COUPONT_TASK_ACCU";
             if (tR != null) {
                i3 oi3 = i3.f();
                oi3.d("coupon_id", u.c(tR));
                oi3.d("award_id", u.b(tR));
                oi3.c("accu_task_duration", Integer.valueOf(0));
                uElementPack.params = oi3.e();
             }
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = liveStreamPa;
             u1.u(b, uElementPack, uContentPack);
          }
       }
       this.m9(b);
       if (!PatchProxy.applyVoid(objArray, this, uoe, "13") && this.O != null) {
          d.a(-1397441499).T9(this.O);
       }
       this.J.k(this.W);
       b9.a(this.V);
       o.c().m("LIVE_WATCH", this.K.J4(), this.U0);
       MarketingBasePresenter tp = this.p;
       if (tp != null && tp.a() != null) {
          b.t(this.p.a().getMerchantSessionId(), "kwaimerchant://skyFallDialog");
       }
       return;
    }
    public void a9(){
       d uod1;
       d c;
       d uod = d.class;
       c uoc = c.class;
       e uoe = e.class;
       if (PatchProxy.applyVoid(null, this, uoe, "3")) {
          return;
       }
       String str = "1";
       if (h.a()) {
          e tS = this.S;
          Activity activity = this.getActivity();
          Objects.requireNonNull(tS);
          str = "2";
          if (!PatchProxy.applyVoidOneRefs(activity, tS, uoc, str)) {
             uod1 = d.h.a();
             Objects.requireNonNull(uod1);
             if (!PatchProxy.applyVoidOneRefs(activity, uod1, uod, str)) {
                if (activity == null) {
                   uod1.c = null;
                }else {
                   c = uod1.c;
                   if (c != null) {
                      a.m(c);
                      if (c.get() == null) {
                      }
                   }else {
                   }
                }
             }
          }
          tS = this.S;
          Objects.requireNonNull(tS);
          if (!PatchProxy.applyVoid(null, tS, uoc, str)) {
             g og = new g(tS.b, tS.a);
             og.f(tS.c);
             uod1 = d.h.a();
             Objects.requireNonNull(uod1);
             if (!PatchProxy.applyVoidOneRefs(og, uod1, uod, "6")) {
                uod1.b(og, null);
             }
          }
       }else {
          Context context = this.getContext();
          if (!PatchProxy.applyVoidOneRefs(context, null, e.class, str)) {
             a.i(context, "https://js-ec.static.yximgs.com/udata/pkg/ks-merchant/merchant_rising_coupon/skyfall_v2.zip");
          }
       }
       if (!PatchProxy.applyVoid(null, this, uoe, "5")) {
          m om = new m(this);
          this.U0 = om;
          this.P8("sky_fall_coupon_pop", om, false);
       }
       if (!PatchProxy.applyVoid(null, this, uoe, "11")) {
          if (this.O == null) {
             this.O = new n(this);
          }
          d.a(-1397441499).HD(this.O);
       }
       this.J.b(this.W);
       MarketingBasePresenter tp = this.p;
       if (tp == null || tp.a() == null) {
          a.s(MerchantMarketingPlatformLogBiz.SKY_FALL_COUPON, "LiveMerchantSkyFallRouterHandler", "registerHandler failed");
          return;
       }else {
          b.g(this.p.a().getMerchantSessionId(), "kwaimerchant://skyFallDialog", new v(this.X));
          return;
       }
    }
    public void d9(SkyFallDataExplorationTrigger p0,LiveMerchantSkyFallModel p1){
       boolean b;
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoe, "15")) {
          return;
       }
       e obj = PatchProxy.applyTwoRefs(p0, p1, this, uoe, "16");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(this.getActivity() == null || this.getActivity().isFinishing()){
          u.h(p0, SkyFallDataExplorationEnvError.LIVE_EXIT);
       }else if(p1.mPopUpStyle != 3){
          u.g(p0, SkyFallDataExplorationError.POPUP_STYLE_ERROR);
       }else if(p1.isExpired()){
          u.g(p0, SkyFallDataExplorationError.SKYFALL_EXPIRED);
       }else {
          b = true;
       }
       b = false;
       if (!b) {
          return;
       }else {
          obj = this.R;
          if (obj != null) {
             if (obj.isTheSameCouponAs(p1)) {
                u.h(p0, SkyFallDataExplorationEnvError.SAME_COUPON);
                return;
             }else {
                this.m9(true);
             }
          }
          this.R = p1;
          Object obj1 = PatchProxy.apply(null, this, uoe, "26");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else {
             MerchantAudienceParams merchantAudi = this.h9().getMerchantAudienceParams();
             b1 = (merchantAudi != null && merchantAudi.mMerchantSource == 8)? true: false;
          }
          if (b1 && this.M == null) {
             this.o9(null);
             this.M = true;
             return;
          }else if(this.j9(p0, p1)){
             this.t9(p0, 0);
          }
          return;
       }
    }
    public LiveMerchantSkyFallModel e9(MaterialMap p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          try{
             MaterialMap datas = p0.datas;
             if (datas != null && datas.size() > 0) {
                return a.a.c(p0.datas.get(0).data, LiveMerchantSkyFallModel.class);
             }
          }catch(java.lang.Exception e4){
             this.l9("SKY_FALL_COUPON_DIALOG deserialize failed", e4);
          }
       }
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new t();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, e.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(e.class, new t());
       }else {
          obj.put(e.class, null);
       }
       return obj;
    }
    public final LiveMerchantBaseContext h9(){
       Object obj = PatchProxy.apply(null, this, e.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.p.a();
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       super.j8();
       this.J = this.r8("LIVE_MERCHANT_AUDIENCE_BOTTOM_BAR_SERVICE");
       this.K = this.r8("LIVE_MERCHANT_LIVE_INTERNAL_ROUTER_SERVICE");
       this.L = this.r8("LIVE_FRAGMENT_SIMPLE_SERVICE");
       return;
    }
    public final boolean j9(SkyFallDataExplorationTrigger p0,LiveMerchantSkyFallModel p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, e.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p1 == null) {
          u.g(p0, SkyFallDataExplorationError.NO_SKYFALL);
          return false;
       }else if(p1.hasReceivedCoupon()){
          u.g(p0, SkyFallDataExplorationError.SKYFALL_RECIVED);
          return false;
       }else if(p1.mShowType == 2){
          u.g(p0, SkyFallDataExplorationError.SHOW_TYPE_ERROR);
          return false;
       }else {
          return true;
       }
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, e.class, "31")) {
          return;
       }
       super.k();
       this.m9(true);
       return;
    }
    public void k9(){
       if (PatchProxy.applyVoid(null, this, e.class, "18")) {
          return;
       }
       e tR = this.R;
       if (tR != null && !TextUtils.x(tR.mJumpLink)) {
          b.o(this.h9().getMerchantSessionId(), this.getActivity(), this.R.mJumpLink);
       }
       return;
    }
    public void l9(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "10")) {
          return;
       }
       a.l(MerchantMarketingPlatformLogBiz.SKY_FALL_COUPON, "LiveAudienceRisingCouponPresenter", p0, p1);
       return;
    }
    public final void m9(boolean p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoe, "4")) {
          return;
       }
       if (p0) {
          e tQ = this.Q;
          if (tQ != null) {
             tQ.dismiss();
          }
       }
       this.R = null;
       this.M = false;
       return;
    }
    public void n9(SkyFallDataExplorationTrigger p0,SignalPendant p1,long p2){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Long.valueOf(p2), this, e.class, "7")) {
          return;
       }
       Throwable throwable = null;
       if (p1 == null) {
          this.l9("requestComponentData signalData null", throwable);
          return;
       }else {
          try{
             boolean b = true;
             p1.needServerProcess = b;
             p1.needRandomCall = b;
             p1.randomRangeMillis = p2;
             e$c uoc = new e$c(this, p0);
             MarketingBasePresenter marketingBas = MarketingBasePresenter.class;
             if (!PatchProxy.applyVoidTwoRefs(p1, uoc, this, marketingBas, "31")) {
                o oo = o.c();
                marketingBas = PatchProxy.apply(throwable, this, marketingBas, "9");
                if (marketingBas == PatchProxyResult.class) {
                   marketingBas = this.E.getValue();
                }
                Object obj = marketingBas;
                Long[] longArray = new Long[b];
                longArray[0] = Long.valueOf(p1.pendantResourceId);
                ArrayList uArrayList = CollectionsKt__CollectionsKt.r(longArray);
                Long longx = Long.valueOf(p1.pendantResourceId);
                String str = a.a.q(p1.throughInfo);
                oo.o(obj, uArrayList, s0.k(r0.a(longx, e0)), "signaling", p1, new a(uoc));
             }
          }catch(java.lang.Exception e0){
          }
          return;
       }
    }
    public void o9(a p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoe, "19")) {
          return;
       }
       Throwable throwable = null;
       if (this.R == null) {
          this.q9(p0, throwable);
          return;
       }else {
          b uob = a.a();
          LiveMerchantSkyFallModel mActivitySes = this.R.mActivitySessionId;
          String str = PatchProxy.apply(throwable, this, uoe, "29");
          if (str != patchProxyRe) {
          }else {
             str = this.h9().getLiveStreamId();
          }
          String str1 = PatchProxy.apply(throwable, this, uoe, "30");
          if (str1 != patchProxyRe) {
          }else {
             str1 = this.h9().getLiveAuthorId();
          }
          this.S8(uob.c(mActivitySes, str, str1).map(new e()).doOnError(new b(MerchantMarketingPlatformLogBiz.SKY_FALL_COUPON, "LiveAudienceRisingCouponPresenter", "receive error")).subscribe(new i(this, p0), new h(this, p0)));
          e tR = this.R;
          LiveMerchantSkyFallModel mActivityId = tR.mActivityId;
          LiveMerchantSkyFallModel mSpliceActiv = tR.mSpliceActivityId;
          if (mSpliceActiv != null) {
             mActivityId = mSpliceActiv;
          }
          this.s9("removeCoupon", mActivityId, tR.mCouponId);
          return;
       }
    }
    public final void q9(a p0,Throwable p1){
       e uoe = e.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoe, "21")) {
          return;
       }
       if (p0 != null) {
          p0.a(p1);
       }
       String str = a1.p(R.string.arg_RES_7f103229);
       if (p1 != null && p1 instanceof KwaiException) {
          str = p1.getMessage();
       }
       if (!PatchProxy.applyVoidOneRefs(str, this, uoe, "24")) {
          t$a uoa = new t$a(this.getActivity());
          uoa.W0(R.string.arg_RES_7f10345c);
          uoa.z0(str);
          uoa.S0(R.string.arg_RES_7f1012a9);
          uoa.u0(null);
          t$a uoa1 = f.e(uoa);
          uoa1.Y(PopupInterface.a);
       }
       this.m9(false);
       return;
    }
    public final void s9(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, e.class, "20")) {
          return;
       }
       if (TextUtils.x(p0)) {
          return;
       }
       a.u(MerchantMarketingPlatformLogBiz.SKY_FALL_COUPON, "LiveAudienceRisingCouponPresenter", "sendUpdateToCouponCenter", "activityId", p1, "action", p0);
       a.b.GO("MARKETING_COUPON_CENTER_UPDATE", a.a.q(e.a(this.K.J4(), p0, 14, p1, p2)));
       return;
    }
    public void t9(SkyFallDataExplorationTrigger p0,int p1){
       e tS;
       b uob;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       c uoc = c.class;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoe, "22")) {
          return;
       }
       Object[] objArray = null;
       if (h.a()) {
          tS = this.S;
          Objects.requireNonNull(tS);
          if (!PatchProxy.applyVoid(objArray, tS, uoc, "3")) {
             g og = new g(tS.b, tS.a);
             og.f(tS.c);
             og.e(true);
             d uod2 = d.h.a();
             Objects.requireNonNull(uod2);
             if (!PatchProxy.applyVoidOneRefs(og, uod2, uod, "9")) {
                uod2.e(og, objArray);
             }
          }
       }
       if (this.getActivity() == null || this.getActivity().isFinishing()) {
          u.h(p0, SkyFallDataExplorationEnvError.LIVE_EXIT);
          return;
       }else {
          String str = "LiveAudienceRisingCouponPresenter";
          if (a.c.a()) {
             a.s(MerchantMarketingPlatformLogBiz.SKY_FALL_COUPON, str, "showDialog failed: isTrustHalfPageShowing");
             u.h(p0, SkyFallDataExplorationEnvError.TRUST_HALF_SHOWING);
             return;
          }else {
             tS = this.L;
             if (tS != null && !tS.a()) {
                a.s(MerchantMarketingPlatformLogBiz.SKY_FALL_COUPON, str, "showDialog failed: mFragmentService is null");
                u.h(p0, SkyFallDataExplorationEnvError.LIVE_EXIT);
                return;
             }else if(this.R == null){
                a.s(MerchantMarketingPlatformLogBiz.SKY_FALL_COUPON, str, "showDialog failed: mLiveMerchantSkyFallModel is null");
                u.g(p0, SkyFallDataExplorationError.NO_SKYFALL);
                return;
             }else {
                a uoa = new a();
                uoa.a = this.getActivity();
                uoa.b = p1;
                uoa.c = this.h9();
                uoa.d = this.J;
                uoa.e = new e$d(this);
                CDNUrl[] uCDNUrlArray = PatchProxy.apply(objArray, this, uoe, "27");
                if (uCDNUrlArray != patchProxyRe) {
                }else {
                   MarketingBasePresenter tp = this.p;
                   uCDNUrlArray = (tp != null && (tp.a() == null || this.p.a().getLiveAuthorUser() == null))? objArray: this.p.a().getLiveAuthorUser().getAvatars();
                }
                uoa.f = uCDNUrlArray;
                e tQ = this.Q;
                if (tQ != null) {
                   tQ.dismiss();
                }
                DynamicSkyFallCouponDialog uDynamicSkyF = new DynamicSkyFallCouponDialog(uoa, this.R);
                this.Q = uDynamicSkyF;
                uDynamicSkyF.setOnShowListener(this.Y);
                this.Q.setOnDismissListener(this.Z);
                List list = c3.b(this.R.mLiveMerchantSkyFallStyleConfig, c.a, new ArrayList());
                if (h.a()) {
                   t ot = b.a(list, 5000);
                   uoe = this.S;
                   Objects.requireNonNull(uoe);
                   g obj = PatchProxy.apply(objArray, uoe, uoc, "4");
                   if (obj != patchProxyRe) {
                   }else {
                      obj = new g(uoe.b, uoe.a);
                      obj.f(uoe.c);
                      obj.e(true);
                      d uod1 = d.h.a();
                      Objects.requireNonNull(uod1);
                      Object obj1 = PatchProxy.applyOneRefs(obj, uod1, uod, "10");
                      obj = (obj1 != patchProxyRe)? obj1: t.create(new e(uod1, obj)).doOnDispose(new f(uod1, obj));
                   }
                   uob = t.zip(ot, obj.timeout(5000, TimeUnit.MILLISECONDS), d.a).observeOn(d.a).subscribe(new o(this, p0), new q(this, p0));
                }else {
                   uob = b.a(list, 5000).observeOn(d.a).subscribe(new p(this, p0), new g(this, p0));
                }
                this.V = b9.c(this.V, new l(uob));
                RxBus.f.b(new a());
                return;
             }
          }
       }
    }
    public final void u9(SkyFallDataExplorationTrigger p0,DynamicSkyFallCouponDialog p1,e p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, e.class, "23")) {
          return;
       }
       if (p1 == null || this.R == null) {
          u.g(p0, SkyFallDataExplorationError.NO_SKYFALL);
          return;
       }else if(this.getActivity() != null && (this.getActivity().isFinishing() || this.getActivity().isDestroyed())){
          u.h(p0, SkyFallDataExplorationEnvError.LIVE_EXIT);
          return;
       }else {
          e tL = this.L;
          if (tL != null && !tL.a()) {
             u.h(p0, SkyFallDataExplorationEnvError.LIVE_EXIT);
             return;
          }else {
             tL = this.Q;
             Objects.requireNonNull(tL);
             if (!PatchProxy.applyVoidOneRefs(p2, tL, DynamicSkyFallCouponDialog.class, "3") && p2 != null) {
                tL = tL.x;
                if (tL == null) {
                   a.S("mDialogBackgroundView");
                }
                tL.setComposition(p2);
             }
             k1.o(new j(this, p0));
             return;
          }
       }
    }
}
