package com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoPendantPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoPendantPresenter$a;
import nsd.u;
import java.util.concurrent.atomic.AtomicBoolean;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoPendantPresenter$mAdNeoPendantView$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoPendantPresenter$b;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.live.ad.fanstop.NeoPendentType;
import com.kwai.feature.api.live.base.model.LiveAdNeoMerchantParam;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import com.kuaishou.live.ad.fanstop.NeoPendentType$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$FanstopLiveInfo;
import java.util.concurrent.TimeUnit;
import com.kuaishou.android.model.ads.LiveAdNeoParam;
import com.kuaishou.android.model.ads.LiveAdNeoParam$StartParam;
import com.kuaishou.android.model.ads.NeoParamsBaseInfo;
import java.lang.Boolean;
import lnc.y0;
import com.kuaishou.live.ad.fanstop.widget.LiveAdNeoPendantBaseView;
import com.kuaishou.android.model.ads.LiveAdNeoParam$TaskInfoParam;
import java.lang.Integer;
import com.kwai.video.waynelive.listeners.LivePlayerStateChangeListener;
import com.kwai.video.waynelive.ILivePlayerStatusMonitor;
import com.kwai.video.waynelive.LivePlayerController;
import ekd.k1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import wkd.b;
import com.kwai.framework.network.sntp.a;
import java.lang.Long;
import java.lang.System;
import usd.q;
import brd.t;
import u49.c;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$InspireAdInfo;
import cjd.e;
import erd.o;
import t45.d;
import brd.z;
import im8.f;
import android.view.View$OnClickListener;
import android.widget.FrameLayout;
import android.app.Activity;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoPendantPresenter$initNeoRequestClick$1;
import java.lang.Runnable;
import mxb.j0;
import mxb.i0;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoPendantPresenter$c;
import erd.g;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoPendantPresenter$onCountDownEnd$2;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoPendantPresenter$onCountDownEnd$3;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoPendantPresenter$onCountDownEnd$4;
import msd.l;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoPendantPresenter$onCountDownEnd$5;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoPendantPresenter$onCountDownEnd$6;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoPendantPresenter$onCountDownEnd$7;
import java.lang.Throwable;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoPendantPresenter$onNeoReportFail$1;
import tl0.d;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.yxcorp.gifshow.commercial.response.magnetic.ProvideNeoInfo$Data;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoPendantPresenter$onNeoReportSuccess$1;
import java.lang.CharSequence;
import e17.i;
import ks5.m;
import pl0.k0;
import com.kwai.feature.api.live.merchant.top.LiveTopPendantTempPlayService;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoPendantPresenter$playPendentFirstAddAnim$anim$1;
import android.animation.AnimatorSet;
import yx.j0;
import ks5.i;
import lp3.c;
import lp3.i;
import android.animation.Animator;
import pl0.l0;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoPendantPresenter$d;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoPendantPresenter$e;
import crd.b;
import im9.a;
import com.yxcorp.gifshow.commercial.api.RewardTaskInfo;
import kp.r1;
import g59.o;
import java.util.List;
import trd.t;
import dy8.g;
import dy8.b;
import fg6.a;
import com.google.gson.Gson;
import o49.h;
import o49.f;
import p49.c;
import com.kwai.adclient.kscommerciallogger.model.BusinessType;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoPendantPresenter$requestNeoReport$1;
import brd.x;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoPendantPresenter$f;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoPendantPresenter$g;
import erd.a;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoPendantPresenter$h;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoPendantPresenter$i;

public final class LiveAudienceAdNeoPendantPresenter extends PresenterV2	// class@000983
{
    public AtomicBoolean A;
    public boolean B;
    public c C;
    public final p D;
    public final LivePlayerStateChangeListener E;
    public LiveBizParam p;
    public LiveAdNeoParam q;
    public f r;
    public f s;
    public LivePlayerController t;
    public LiveAudienceParam u;
    public LiveTopPendantTempPlayService v;
    public i w;
    public m x;
    public long y;
    public PhotoAdvertisement z;
    public static final LiveAudienceAdNeoPendantPresenter$a F;

    static {
       LiveAudienceAdNeoPendantPresenter.F = new LiveAudienceAdNeoPendantPresenter$a(null);
    }
    public void LiveAudienceAdNeoPendantPresenter(){
       super();
       this.A = new AtomicBoolean(false);
       this.D = s.c(new LiveAudienceAdNeoPendantPresenter$mAdNeoPendantView$2(this));
       this.E = new LiveAudienceAdNeoPendantPresenter$b(this);
    }
    public static final LiveAudienceParam P8(LiveAudienceAdNeoPendantPresenter p0){
       p0 = p0.u;
       if (p0 == null) {
          a.S("mLiveAudienceParam");
       }
       return p0;
    }
    public void E8(){
       PhotoAdvertisement$FanstopLiveInfo mFeedFlowAdN;
       long l;
       Boolean uBoolean;
       LiveAudienceAdNeoPendantPresenter tq;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAudienceAdNeoPendantPresenter.class, "4")) {
          return;
       }
       LiveAudienceAdNeoPendantPresenter tu = this.u;
       if (tu == null) {
          a.S("mLiveAudienceParam");
       }
       LiveAudienceParam mPhoto = tu.mPhoto;
       LiveStreamFeed mAd = (mPhoto != null)? mPhoto.mAd: objArray;
       this.z = mAd;
       boolean b = NeoPendentType.Companion.a(NeoPendentType.H5_TO_LIVE_NEO_COMMON, objArray, this.p, mAd);
       if (this.v != null && b) {
          tu = this.z;
          if (tu != null) {
             PhotoAdvertisement mAdLiveForFa = tu.mAdLiveForFansTop;
             if (mAdLiveForFa != null) {
                mFeedFlowAdN = mAdLiveForFa.mFeedFlowAdNeoParam;
                if (mFeedFlowAdN != null) {
                label_0048 :
                   this.q = mFeedFlowAdN;
                   if (tu != null) {
                      PhotoAdvertisement mAdLiveForFa1 = tu.mAdLiveForFansTop;
                      if (mAdLiveForFa1 != null) {
                         l = TimeUnit.MILLISECONDS.toSeconds(mAdLiveForFa1.mFansTopAwardBonusTime);
                      label_005b :
                         this.y = l;
                         if (!this.W8()) {
                            return;
                         }else {
                            tu = this.q;
                            if (tu != null) {
                               LiveAdNeoParam mStartParam = tu.mStartParam;
                               if (mStartParam != null) {
                                  LiveAdNeoParam$StartParam mNeoParamsLi = mStartParam.mNeoParamsLiveInfo;
                                  if (mNeoParamsLi != null) {
                                     uBoolean = Boolean.valueOf(mNeoParamsLi.mEnableCountdownReport);
                                  label_0078 :
                                     this.B = y0.p(uBoolean);
                                     LiveAdNeoPendantBaseView liveAdNeoPen = this.X8();
                                     tq = this.q;
                                     if (tq != null) {
                                        LiveAdNeoParam mTaskInfoPar = tq.mTaskInfoParam;
                                        if (mTaskInfoPar != null) {
                                           objArray = Integer.valueOf(mTaskInfoPar.mTopPendantType);
                                        }
                                     }
                                     liveAdNeoPen.setPendantType(objArray);
                                     tu = this.t;
                                     if (tu == null) {
                                        a.S("mLivePlayerController");
                                     }
                                     tu.addStateChangeListener(this.E);
                                     tu = this.t;
                                     if (tu == null) {
                                        a.S("mLivePlayerController");
                                     }
                                     if (tu.isPlaying()) {
                                        this.d9();
                                     }
                                  }
                               }
                            }
                            uBoolean = objArray;
                            goto label_0078 ;
                         }
                      }
                   }
                   l = 0;
                   goto label_005b ;
                }
             }
          }
          tq = this.p;
          if (tq != null) {
             mFeedFlowAdN = tq.mAdNeoPendantParam;
             goto label_0048 ;
          }else {
             mFeedFlowAdN = objArray;
             goto label_0048 ;
          }
       }
    label_00b1 :
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceAdNeoPendantPresenter.class, "9")) {
          return;
       }
       LiveAudienceAdNeoPendantPresenter tt = this.t;
       if (tt == null) {
          a.S("mLivePlayerController");
       }
       tt.removeStateChangeListener(this.E);
       k1.n(this);
       return;
    }
    public final long R8(){
       LiveAdNeoParam$TaskInfoParam mNeoNextUnse;
       LiveAudienceAdNeoPendantPresenter obj = PatchProxy.apply(null, this, LiveAudienceAdNeoPendantPresenter.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.q;
       if (obj != null) {
          LiveAdNeoParam mTaskInfoPar = obj.mTaskInfoParam;
          if (mTaskInfoPar != null) {
             mNeoNextUnse = mTaskInfoPar.mNeoNextUnsealTimestampMs;
          label_0022 :
             Long obj1 = b.a(0x3b1f7b44);
             a.o(obj1, "Singleton.get\(HttpSntpClient::class.java\)");
             obj1 = obj1.a();
             if (obj1 == null) {
                obj1 = Long.valueOf(System.currentTimeMillis());
             }
             a.o(obj1, "Singleton.get\(HttpSntpCl¡­ystem.currentTimeMillis\(\)");
             return TimeUnit.MILLISECONDS.toSeconds(q.o((mNeoNextUnse - obj1.longValue()), 0));
          }
       }
       mNeoNextUnse = 0;
       goto label_0022 ;
    }
    public final t S8(){
       Boolean uBoolean;
       PhotoAdvertisement$InspireAdInfo mNeoParams;
       LiveAdNeoParam$StartParam mH5NeoParams;
       Object[] objArray = null;
       LiveAudienceAdNeoPendantPresenter obj = PatchProxy.apply(objArray, this, LiveAudienceAdNeoPendantPresenter.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.z;
       if (obj != null) {
          PhotoAdvertisement mAdLiveForFa = obj.mAdLiveForFansTop;
          if (mAdLiveForFa != null) {
             uBoolean = Boolean.valueOf(mAdLiveForFa.mHadEarnFansTopCoin);
          label_0020 :
             int i = (y0.p(uBoolean))? 2: 1;
             c uoc = b.a(0x3a268c29);
             LiveAudienceAdNeoPendantPresenter tz = this.z;
             if (tz != null) {
                PhotoAdvertisement mAdLiveForFa1 = tz.mAdLiveForFansTop;
                if (mAdLiveForFa1 != null) {
                   PhotoAdvertisement$FanstopLiveInfo mAdData = mAdLiveForFa1.mAdData;
                   if (mAdData != null) {
                      PhotoAdvertisement$AdData mInspireAdIn = mAdData.mInspireAdInfo;
                      if (mInspireAdIn != null) {
                         mNeoParams = mInspireAdIn.mNeoParams;
                      label_0046 :
                         LiveAudienceAdNeoPendantPresenter tq = this.q;
                         if (tq != null) {
                            LiveAdNeoParam mStartParam = tq.mStartParam;
                            if (mStartParam != null) {
                               mH5NeoParams = mStartParam.mH5NeoParams;
                            label_0052 :
                               LiveAudienceAdNeoPendantPresenter tu = this.u;
                               if (tu == null) {
                                  a.S("mLiveAudienceParam");
                               }
                               LiveAudienceParam mPhoto = tu.mPhoto;
                               if (mPhoto != null) {
                                  objArray = mPhoto.getId();
                               }
                               t ot = uoc.v(i, mNeoParams, mH5NeoParams, objArray).map(new e()).subscribeOn(d.a);
                               a.o(ot, "Singleton.get\(Commercial¡­beOn\(KwaiSchedulers.MAIN\)");
                               return ot;
                            }
                         }
                         mH5NeoParams = objArray;
                         goto label_0052 ;
                      }
                   }
                }
             }
             mNeoParams = objArray;
             goto label_0046 ;
          }
       }
       uBoolean = objArray;
       goto label_0020 ;
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceAdNeoPendantPresenter.class, "27")) {
          return;
       }
       LiveAudienceAdNeoPendantPresenter ts = this.s;
       if (ts != null) {
          ts.set(Long.valueOf(0));
       }
       if (!this.j9(this.q)) {
          this.X8().setOnClickListener(null);
       }
       return;
    }
    public final boolean W8(){
       boolean b;
       PhotoAdvertisement$FanstopLiveInfo mHadEarnFans;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, LiveAudienceAdNeoPendantPresenter.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 1;
       int i1 = y0.o(this.getActivity()) ^ i;
       LiveAudienceAdNeoPendantPresenter tz = this.z;
       if (tz != null) {
          objArray = tz.mAdLiveForFansTop;
       }
       objArray = (objArray != null && this.y > 0)? 1: 0;
       LiveAudienceAdNeoPendantPresenter tr = this.r;
       if (tr != null) {
          Boolean uBoolean = tr.get();
          if (uBoolean != null) {
             b = uBoolean.booleanValue();
          label_0044 :
             LiveAudienceAdNeoPendantPresenter tz1 = this.z;
             if (tz1 != null) {
                PhotoAdvertisement mAdLiveForFa = tz1.mAdLiveForFansTop;
                if (mAdLiveForFa != null) {
                   mHadEarnFans = mAdLiveForFa.mHadEarnFansTopCoin;
                label_0050 :
                   if (!i1 || (!objArray || (b || mHadEarnFans != null))) {
                      i = false;
                   }
                   return i;
                }
             }
             mHadEarnFans = null;
             goto label_0050 ;
          }
       }
       b = false;
       goto label_0044 ;
    }
    public final LiveAdNeoPendantBaseView X8(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceAdNeoPendantPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.D.getValue();
    }
    public final void Y8(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceAdNeoPendantPresenter.class, "20")) {
          return;
       }
       k1.n(this);
       k1.s(new LiveAudienceAdNeoPendantPresenter$initNeoRequestClick$1(this), this, 1000);
       return;
    }
    public final void Z8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAudienceAdNeoPendantPresenter.class, "19")) {
          return;
       }
       j0 oj0 = i0.a();
       int i = 759;
       LiveAudienceAdNeoPendantPresenter tu = this.u;
       if (tu == null) {
          a.S("mLiveAudienceParam");
       }
       oj0.e(i, tu.mPhoto).d(new LiveAudienceAdNeoPendantPresenter$c(this)).a();
       if (this.j9(this.q)) {
          this.h9(0, new LiveAudienceAdNeoPendantPresenter$onCountDownEnd$2(this), new LiveAudienceAdNeoPendantPresenter$onCountDownEnd$3(this), new LiveAudienceAdNeoPendantPresenter$onCountDownEnd$4(this));
       }else if(this.B != null){
          LiveAudienceAdNeoPendantPresenter tz = this.z;
          if (tz != null) {
             PhotoAdvertisement mAdLiveForFa = tz.mAdLiveForFansTop;
             if (mAdLiveForFa != null) {
                objArray = Boolean.valueOf(mAdLiveForFa.mHasCountdownReported);
             }
          }
          if (y0.p(objArray)) {
             this.Y8();
          }else {
             this.h9(1, new LiveAudienceAdNeoPendantPresenter$onCountDownEnd$5(this), LiveAudienceAdNeoPendantPresenter$onCountDownEnd$6.INSTANCE, new LiveAudienceAdNeoPendantPresenter$onCountDownEnd$7(this));
          }
       }else {
          this.Y8();
       }
       return;
    }
    public final void a9(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceAdNeoPendantPresenter.class, "26")) {
          return;
       }
       this.X8().d(false, new LiveAudienceAdNeoPendantPresenter$onNeoReportFail$1(this));
       b.B(LiveLogTag.FANS_TOP, "ad neo live request  error "+p0);
       j0 oj0 = i0.a();
       LiveAudienceAdNeoPendantPresenter tu = this.u;
       if (tu == null) {
          a.S("mLiveAudienceParam");
       }
       oj0.e(805, tu.mPhoto).a();
       return;
    }
    public final void b9(ProvideNeoInfo$Data p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceAdNeoPendantPresenter.class, "25")) {
          return;
       }
       this.X8().g(this.j9(this.q), p0.mNeoAmount, new LiveAudienceAdNeoPendantPresenter$onNeoReportSuccess$1(this));
       LiveAudienceAdNeoPendantPresenter tz = this.z;
       int b = true;
       if (tz != null) {
          PhotoAdvertisement mAdLiveForFa = tz.mAdLiveForFansTop;
          if (mAdLiveForFa != null) {
             mAdLiveForFa.mHadEarnFansTopCoin = b;
          }
       }
       tz = this.r;
       if (tz != null) {
          tz.set(Boolean.valueOf((p0.mHasRemain ^ b)));
       }
       ProvideNeoInfo$Data mToast = p0.mToast;
       if (mToast != null && mToast.length()) {
          b = false;
       }
       if (b) {
          mToast = null;
       }
       if (mToast != null) {
          i.d(R.style.arg_RES_7f11066a, mToast);
       }
       j0 oj0 = i0.a();
       b = 804;
       LiveAudienceAdNeoPendantPresenter tu = this.u;
       if (tu == null) {
          a.S("mLiveAudienceParam");
       }
       oj0.e(b, tu.mPhoto).q("get_points_cnt", Long.valueOf(p0.mNeoAmount)).a();
       return;
    }
    public final void c9(){
       LiveAudienceAdNeoPendantPresenter liveAudience = LiveAudienceAdNeoPendantPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveAudience, "6")) {
          return;
       }
       if (!this.W8()) {
          this.e9();
          return;
       }else {
          LiveAudienceAdNeoPendantPresenter liveAudience1 = PatchProxy.apply(objArray, this, liveAudience, "17");
          if (liveAudience1 != PatchProxyResult.class) {
          }else if(this.x == null){
             this.x = new k0(this);
          }
          liveAudience1 = this.x;
          a.m(liveAudience1);
          LiveAudienceAdNeoPendantPresenter tv = this.v;
          if (tv != null) {
             tv.b(liveAudience1);
          }
          AnimatorSet uAnimatorSet = this.X8().e(this.R8(), new LiveAudienceAdNeoPendantPresenter$playPendentFirstAddAnim$anim$1(this));
          Object[] objArray1 = new Object[0];
          j0.f("LiveAudienceAdNeoPendantPresenter", "Entry anim about to show", objArray1);
          LiveAudienceAdNeoPendantPresenter tw = this.w;
          if (tw != null) {
             i oi = tw.a(i.class);
             if (oi != null) {
                oi.rb(liveAudience1, uAnimatorSet);
             }
          }
          if (this.j9(this.q) && !PatchProxy.applyVoid(objArray, this, liveAudience, "7")) {
             this.X8().setOnClickListener(new l0(this));
          }
          if (!PatchProxy.applyVoid(objArray, this, liveAudience, "10")) {
             LiveAdNeoPendantBaseView liveAdNeoPen = this.X8();
             liveAudience1 = this.u;
             if (liveAudience1 == null) {
                a.S("mLiveAudienceParam");
             }
             LiveAudienceParam mPhoto = liveAudience1.mPhoto;
             tv = this.q;
             if (tv != null) {
                LiveAdNeoParam mTaskInfoPar = tv.mTaskInfoParam;
                if (mTaskInfoPar != null) {
                   objArray = mTaskInfoPar.mExtData;
                }
             }
             liveAdNeoPen.i(mPhoto, objArray);
          }
          return;
       }
    }
    public final void d9(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAudienceAdNeoPendantPresenter.class, "5")) {
          return;
       }
       if (this.x != null) {
          return;
       }
       LiveAudienceAdNeoPendantPresenter tz = this.z;
       if (tz != null) {
          PhotoAdvertisement mAdLiveForFa = tz.mAdLiveForFansTop;
          if (mAdLiveForFa != null) {
             objArray = mAdLiveForFa.mFeedFlowAdNeoParam;
          }
       }
       if (objArray != null) {
          this.S8().subscribe(new LiveAudienceAdNeoPendantPresenter$d(this), new LiveAudienceAdNeoPendantPresenter$e(this));
       }else {
          this.c9();
       }
       return;
    }
    public final void e9(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceAdNeoPendantPresenter.class, "16")) {
          return;
       }
       this.X8().setOnClickListener(null);
       LiveAudienceAdNeoPendantPresenter tx = this.x;
       if (tx != null) {
          LiveAudienceAdNeoPendantPresenter tv = this.v;
          if (tv != null) {
             tv.c(tx);
          }
       }
       this.x = null;
       return;
    }
    public final void h9(int p0,l p1,l p2,a p3){
       Object[] objArray;
       a uoa;
       LiveAudienceAdNeoPendantPresenter z;
       PhotoAdvertisement mAdLiveForFa;
       PhotoAdvertisement$FanstopLiveInfo mLlsid;
       NeoParamsBaseInfo mExtParams;
       long l2;
       PhotoAdvertisement$FanstopLiveInfo mAdData;
       PhotoAdvertisement$InspireAdInfo inspireAdInf;
       Object obj = this;
       LiveAudienceAdNeoPendantPresenter liveAudience = LiveAudienceAdNeoPendantPresenter.class;
       if (PatchProxy.isSupport(liveAudience) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, p3, this, LiveAudienceAdNeoPendantPresenter.class, "23")) {
          return;
       }
       String str = "LiveAudienceAdNeoPendantPresenter";
       int i = 0;
       if (y0.o(this.getActivity())) {
          objArray = new Object[i];
          j0.c(str, "request neo report when activity finished", objArray);
          return;
       }else {
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          if (PatchProxy.isSupport(liveAudience)) {
             uoa = PatchProxy.applyOneRefs(Integer.valueOf(p0), obj, liveAudience, "22");
             if (uoa != patchProxyRe) {
             }else {
             label_0051 :
                z = obj.q;
                PhotoAdvertisement$AdData uAdData = null;
                if (z != null) {
                   LiveAdNeoParam mStartParam = z.mStartParam;
                   if (mStartParam != null) {
                      LiveAdNeoParam$StartParam mNeoParamsLi = mStartParam.mNeoParamsLiveInfo;
                      if (mNeoParamsLi != null) {
                         Long longx = Long.valueOf(mNeoParamsLi.mBusinessId);
                         long l = (longx.longValue() - uAdData > 0)? 1: 0;
                         if (!l) {
                            longx = null;
                         }
                         if (longx != null) {
                            l = longx.longValue();
                         label_007d :
                            long l1 = l;
                            z = obj.z;
                            if (z != null) {
                               mAdLiveForFa = z.mAdLiveForFansTop;
                               if (mAdLiveForFa != null) {
                                  Object[] objArray2 = new Object[i];
                                  j0.f(str, "NeoStatusInfo CreativeId: "+mAdLiveForFa.mCreativeId, objArray2);
                                  PhotoAdvertisement$FanstopLiveInfo mPageId = mAdLiveForFa.mPageId;
                                  PhotoAdvertisement$FanstopLiveInfo mSubPageId = mAdLiveForFa.mSubPageId;
                                  mLlsid = mAdLiveForFa.mAdData;
                                  if (mLlsid != null) {
                                     uAdData = mLlsid.mPosId;
                                  }
                                  PhotoAdvertisement$AdData uAdData1 = uAdData;
                                  LiveAudienceAdNeoPendantPresenter q = obj.q;
                                  if (q != null) {
                                     LiveAdNeoParam mStartParam1 = q.mStartParam;
                                     if (mStartParam1 != null) {
                                        LiveAdNeoParam$StartParam mNeoParamsLi1 = mStartParam1.mNeoParamsLiveInfo;
                                        if (mNeoParamsLi1 != null) {
                                           mExtParams = mNeoParamsLi1.mExtParams;
                                           if (mExtParams != null) {
                                           label_00c0 :
                                              NeoParamsBaseInfo neoParamsBas = mExtParams;
                                              Object obj1 = PatchProxy.applyOneRefs(mAdLiveForFa, obj, liveAudience, "24");
                                              if (obj1 != patchProxyRe) {
                                                 l2 = obj1.longValue();
                                              }else {
                                                 mAdData = mAdLiveForFa.mLlsid;
                                                 liveAudience = obj.u;
                                                 if (liveAudience == null) {
                                                    a.S("mLiveAudienceParam");
                                                 }
                                                 l2 = o.b(mAdData, r1.i1(liveAudience.mPhoto));
                                              }
                                              Long longx1 = Long.valueOf(l2);
                                              LiveAudienceAdNeoPendantPresenter u1 = obj.u;
                                              if (u1 == null) {
                                                 a.S("mLiveAudienceParam");
                                              }
                                              LiveAudienceParam mPhoto = u1.mPhoto;
                                              a.o(mPhoto, "mLiveAudienceParam.mPhoto");
                                              String id = mPhoto.getId();
                                              Long longx2 = Long.valueOf(mAdLiveForFa.mCreativeId);
                                              Integer integer = Integer.valueOf(true);
                                              u1 = obj.z;
                                              if (u1 != null) {
                                                 PhotoAdvertisement mAdLiveForFa1 = u1.mAdLiveForFansTop;
                                                 if (mAdLiveForFa1 != null) {
                                                    mAdData = mAdLiveForFa1.mAdData;
                                                    if (mAdData != null) {
                                                       PhotoAdvertisement$AdData mInspireAdIn = mAdData.mInspireAdInfo;
                                                       if (mInspireAdIn != null) {
                                                          inspireAdInf = mInspireAdIn.mNeoParams;
                                                       label_0121 :
                                                          RewardTaskInfo rewardTaskIn = new RewardTaskInfo(longx1, id, longx2, integer, inspireAdInf);
                                                          a uoa1 = new a(mPageId, mSubPageId, uAdData1, l1, "live", neoParamsBas, 0, 0, t.k(mExtParams), p0, 192, null);
                                                          uoa = l;
                                                       }
                                                    }
                                                 }
                                              }
                                              inspireAdInf = null;
                                              goto label_0121 ;
                                           }
                                        }
                                     }
                                  }
                                  mExtParams = "";
                                  goto label_00c0 ;
                               }
                            }
                            uoa = null;
                         }
                      }
                   }
                }
                StringBuilder str2 = 101;
                goto label_007d ;
             }
          }else {
             goto label_0051 ;
          }
          if (uoa == null) {
             StringBuilder str1 = "create NeoStatusInfo failed, ";
             z = obj.z;
             if (z != null) {
                mAdLiveForFa = z.mAdLiveForFansTop;
                if (mAdLiveForFa != null) {
                   mLlsid = mAdLiveForFa.mLlsid;
                label_0154 :
                   Object[] objArray1 = new Object[i];
                   j0.c(str, str1+mLlsid, objArray1);
                   return;
                }
             }
             mLlsid = null;
             goto label_0154 ;
          }else if(obj.A.get()){
             objArray = new Object[i];
             j0.f(str, "Duplicate neo report request", objArray);
             return;
          }else {
             obj.A.set(true);
             t ot = b.a().a(a.a.q(uoa));
             LiveAudienceAdNeoPendantPresenter u = obj.u;
             if (u == null) {
                a.S("mLiveAudienceParam");
             }
             h oh = new h(u.mPhoto, 0, 0, new f(c.g, BusinessType.NEO_LIVE, LiveAudienceAdNeoPendantPresenter$requestNeoReport$1.INSTANCE, null, 8, null), null, 22, null);
             obj.X7(ot.compose(str).map(new e()).map(LiveAudienceAdNeoPendantPresenter$f.b).doFinally(new LiveAudienceAdNeoPendantPresenter$g(obj, p3)).subscribe(new LiveAudienceAdNeoPendantPresenter$h(p1), new LiveAudienceAdNeoPendantPresenter$i(p2)));
             return;
          }
       }
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceAdNeoPendantPresenter.class, "3")) {
          return;
       }
       this.p = this.s8(LiveBizParam.class);
       this.r = this.w8("FANS_TOP_AWARD_LIVE_GAME_REDEEM_OVER");
       this.s = this.w8("FANS_TOP_AWARD_LIVE_WATCHING_MS");
       Object obj = this.r8("LIVE_PLAYER_CONTROLLER");
       a.o(obj, "inject\(LiveAccessIds.LIVE_PLAYER_CONTROLLER\)");
       this.t = obj;
       obj = this.r8("LIVE_AUDIENCE_PARAM");
       a.o(obj, "inject\(LiveAccessIds.LIVE_AUDIENCE_PARAM\)");
       this.u = obj;
       this.v = this.s8(LiveTopPendantTempPlayService.class);
       this.w = this.r8("LIVE_SERVICE_MANAGER");
       return;
    }
    public final boolean j9(LiveAdNeoParam p0){
       NeoParamsBaseInfo mAutoReport;
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceAdNeoPendantPresenter.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null) {
          p0 = p0.mStartParam;
          if (p0 != null) {
             LiveAdNeoParam$StartParam mNeoParamsLi = p0.mNeoParamsLiveInfo;
             if (mNeoParamsLi != null) {
                mAutoReport = mNeoParamsLi.mAutoReport;
             label_0021 :
                return mAutoReport;
             }
          }
       }
       mAutoReport = false;
       goto label_0021 ;
    }
}
