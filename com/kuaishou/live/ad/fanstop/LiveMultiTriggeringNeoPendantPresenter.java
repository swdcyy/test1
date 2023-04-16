package com.kuaishou.live.ad.fanstop.LiveMultiTriggeringNeoPendantPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.ad.fanstop.LiveMultiTriggeringNeoPendantPresenter$a;
import nsd.u;
import com.kuaishou.live.ad.fanstop.LiveMultiTriggeringNeoPendantPresenter$mAdNeoPendantView$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.ad.fanstop.LiveMultiTriggeringNeoPendantPresenter$b;
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
import com.kuaishou.live.ad.fanstop.widget.LiveAdNeoEnhancePendantView;
import com.kuaishou.android.model.ads.LiveAdNeoParam;
import com.kuaishou.android.model.ads.LiveAdNeoParam$TaskInfoParam;
import java.lang.Integer;
import com.kuaishou.live.ad.fanstop.widget.LiveAdNeoPendantBaseView;
import com.kwai.video.waynelive.listeners.LivePlayerStateChangeListener;
import com.kwai.video.waynelive.ILivePlayerStatusMonitor;
import com.kwai.video.waynelive.LivePlayerController;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import wkd.b;
import com.kwai.framework.network.sntp.a;
import java.lang.Long;
import java.lang.System;
import usd.q;
import java.lang.Boolean;
import android.app.Activity;
import lnc.y0;
import java.lang.StringBuilder;
import yx.j0;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$InspireAdInfo;
import pl0.y0;
import ks5.m;
import com.kwai.feature.api.live.merchant.top.LiveTopPendantTempPlayService;
import com.kuaishou.live.ad.fanstop.LiveMultiTriggeringNeoPendantPresenter$playPendentFirstAddAnim$anim$1;
import android.animation.AnimatorSet;
import ks5.i;
import lp3.c;
import lp3.i;
import android.animation.Animator;
import com.kwai.framework.model.feed.BaseFeed;
import mxb.j0;
import mxb.i0;
import com.kuaishou.live.ad.fanstop.LiveMultiTriggeringNeoPendantPresenter$c;
import erd.g;
import com.kuaishou.live.ad.fanstop.LiveMultiTriggeringNeoPendantPresenter$d;
import brd.t;
import u49.c;
import cjd.e;
import erd.o;
import pl0.x0;
import io.reactivex.i;
import brd.a0;
import brd.z;
import lrd.b;
import com.kuaishou.live.ad.fanstop.LiveMultiTriggeringNeoPendantPresenter$e;
import brd.w;
import erd.c;
import com.kuaishou.live.ad.fanstop.LiveMultiTriggeringNeoPendantPresenter$f;
import com.kuaishou.live.ad.fanstop.LiveMultiTriggeringNeoPendantPresenter$g;
import crd.b;
import com.kuaishou.live.ad.fanstop.LiveMultiTriggeringNeoPendantPresenter$startPendentCountDown$1;
import im8.f;

public final class LiveMultiTriggeringNeoPendantPresenter extends PresenterV2	// class@000995
{
    public boolean A;
    public boolean B;
    public NeoParamsBaseInfo C;
    public final p D;
    public final LivePlayerStateChangeListener E;
    public LiveBizParam p;
    public LiveAdNeoParam q;
    public f r;
    public LivePlayerController s;
    public LiveAudienceParam t;
    public LiveTopPendantTempPlayService u;
    public i v;
    public m w;
    public long x;
    public PhotoAdvertisement y;
    public boolean z;
    public static final LiveMultiTriggeringNeoPendantPresenter$a F;

    static {
       LiveMultiTriggeringNeoPendantPresenter.F = new LiveMultiTriggeringNeoPendantPresenter$a(null);
    }
    public void LiveMultiTriggeringNeoPendantPresenter(){
       super();
       this.D = s.c(new LiveMultiTriggeringNeoPendantPresenter$mAdNeoPendantView$2(this));
       this.E = new LiveMultiTriggeringNeoPendantPresenter$b(this);
    }
    public static final LiveAudienceParam P8(LiveMultiTriggeringNeoPendantPresenter p0){
       p0 = p0.t;
       if (p0 == null) {
          a.S("mLiveAudienceParam");
       }
       return p0;
    }
    public void E8(){
       long l;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveMultiTriggeringNeoPendantPresenter.class, "3")) {
          return;
       }
       LiveMultiTriggeringNeoPendantPresenter tt = this.t;
       if (tt == null) {
          a.S("mLiveAudienceParam");
       }
       LiveAudienceParam mPhoto = tt.mPhoto;
       LiveStreamFeed mAd = (mPhoto != null)? mPhoto.mAd: objArray;
       this.y = mAd;
       boolean b = NeoPendentType.Companion.a(NeoPendentType.FEEDS_TO_LIVE_NEO, objArray, this.p, mAd);
       if (this.u != null && b) {
          tt = this.y;
          if (tt != null) {
             PhotoAdvertisement mAdLiveForFa = tt.mAdLiveForFansTop;
             if (mAdLiveForFa != null) {
                l = TimeUnit.MILLISECONDS.toSeconds(mAdLiveForFa.mFansTopAwardBonusTime);
             label_0045 :
                this.x = l;
                if (!this.S8()) {
                   return;
                }else {
                   LiveAdNeoEnhancePendantView liveAdNeoEnh = this.W8();
                   LiveMultiTriggeringNeoPendantPresenter tq = this.q;
                   if (tq != null) {
                      LiveAdNeoParam mTaskInfoPar = tq.mTaskInfoParam;
                      if (mTaskInfoPar != null) {
                         objArray = Integer.valueOf(mTaskInfoPar.mTopPendantType);
                      }
                   }
                   liveAdNeoEnh.setPendantType(objArray);
                   tt = this.s;
                   if (tt == null) {
                      a.S("mLivePlayerController");
                   }
                   tt.addStateChangeListener(this.E);
                   tt = this.s;
                   if (tt == null) {
                      a.S("mLivePlayerController");
                   }
                   if (tt.isPlaying()) {
                      this.e9();
                   }
                }
             }
          }
          l = 0;
          goto label_0045 ;
       }
    label_0081 :
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, LiveMultiTriggeringNeoPendantPresenter.class, "26")) {
          return;
       }
       LiveMultiTriggeringNeoPendantPresenter ts = this.s;
       if (ts == null) {
          a.S("mLivePlayerController");
       }
       ts.removeStateChangeListener(this.E);
       this.Y8();
       return;
    }
    public final long R8(){
       LiveAdNeoParam$TaskInfoParam mNeoNextUnse;
       LiveMultiTriggeringNeoPendantPresenter obj = PatchProxy.apply(null, this, LiveMultiTriggeringNeoPendantPresenter.class, "12");
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
    public final boolean S8(){
       Object obj = PatchProxy.apply(null, this, LiveMultiTriggeringNeoPendantPresenter.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 1;
       Object[] objArray = new Object[0];
       j0.f("LiveMultiTriggeringNeoPendantPresenter", "enableCountDown: "+this.x, objArray);
       if (!(y0.o(this.getActivity()) ^ i) || this.x <= 0) {
          i = false;
       }
       return i;
    }
    public final String V8(){
       PhotoAdvertisement$InspireAdInfo mNeoParams;
       LiveMultiTriggeringNeoPendantPresenter ty = this.y;
       if (ty != null) {
          PhotoAdvertisement mAdLiveForFa = ty.mAdLiveForFansTop;
          if (mAdLiveForFa != null) {
             PhotoAdvertisement$FanstopLiveInfo mAdData = mAdLiveForFa.mAdData;
             if (mAdData != null) {
                PhotoAdvertisement$AdData mInspireAdIn = mAdData.mInspireAdInfo;
                if (mInspireAdIn != null) {
                   mNeoParams = mInspireAdIn.mNeoParams;
                   if (mNeoParams != null) {
                   label_0017 :
                      return mNeoParams;
                   }
                }
             }
          }
       }
       mNeoParams = "";
       goto label_0017 ;
    }
    public final LiveAdNeoEnhancePendantView W8(){
       Object obj = PatchProxy.apply(null, this, LiveMultiTriggeringNeoPendantPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.D.getValue();
    }
    public final void X8(){
       LiveMultiTriggeringNeoPendantPresenter liveMultiTri = LiveMultiTriggeringNeoPendantPresenter.class;
       if (PatchProxy.applyVoid(null, this, liveMultiTri, "8")) {
          return;
       }
       if (this.w != null) {
          return;
       }
       String str = "LiveMultiTriggeringNeoPendantPresenter";
       int i = 0;
       if (!PatchProxy.applyVoid(null, this, liveMultiTri, "9")) {
          if (this.w != null) {
             Object[] objArray1 = new Object[i];
             j0.c(str, "Duplicate pendent initiated", objArray1);
             this.Y8();
          }
          this.w = new y0(this);
       }
       liveMultiTri = this.u;
       if (liveMultiTri != null) {
          LiveMultiTriggeringNeoPendantPresenter tw = this.w;
          a.m(tw);
          liveMultiTri.b(tw);
       }
       AnimatorSet uAnimatorSet = this.W8().e(this.R8(), new LiveMultiTriggeringNeoPendantPresenter$playPendentFirstAddAnim$anim$1(this));
       Object[] objArray = new Object[i];
       j0.f(str, "Entry anim about to show", objArray);
       LiveMultiTriggeringNeoPendantPresenter tv = this.v;
       if (tv != null) {
          i oi = tv.a(i.class);
          if (oi != null) {
             LiveMultiTriggeringNeoPendantPresenter tw1 = this.w;
             a.m(tw1);
             oi.rb(tw1, uAnimatorSet);
          }
       }
       LiveAdNeoEnhancePendantView liveAdNeoEnh = this.W8();
       tv = this.t;
       if (tv == null) {
          a.S("mLiveAudienceParam");
       }
       liveAdNeoEnh.i(tv.mPhoto, null);
       return;
    }
    public final void Y8(){
       if (PatchProxy.applyVoid(null, this, LiveMultiTriggeringNeoPendantPresenter.class, "27")) {
          return;
       }
       LiveMultiTriggeringNeoPendantPresenter tw = this.w;
       if (tw != null) {
          LiveMultiTriggeringNeoPendantPresenter tu = this.u;
          if (tu != null) {
             tu.c(tw);
          }
       }
       this.w = null;
       return;
    }
    public final void Z8(){
       if (PatchProxy.applyVoid(null, this, LiveMultiTriggeringNeoPendantPresenter.class, "23")) {
          return;
       }
       j0 oj0 = i0.a();
       int i = 759;
       LiveMultiTriggeringNeoPendantPresenter tt = this.t;
       if (tt == null) {
          a.S("mLiveAudienceParam");
       }
       oj0.e(i, tt.mPhoto).d(new LiveMultiTriggeringNeoPendantPresenter$c(this)).a();
       return;
    }
    public final void a9(){
       if (PatchProxy.applyVoid(null, this, LiveMultiTriggeringNeoPendantPresenter.class, "25")) {
          return;
       }
       j0 oj0 = i0.a();
       LiveMultiTriggeringNeoPendantPresenter tt = this.t;
       if (tt == null) {
          a.S("mLiveAudienceParam");
       }
       oj0.e(805, tt.mPhoto).a();
       return;
    }
    public final void b9(long p0){
       LiveMultiTriggeringNeoPendantPresenter liveMultiTri = LiveMultiTriggeringNeoPendantPresenter.class;
       if (PatchProxy.isSupport(liveMultiTri) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, liveMultiTri, "24")) {
          return;
       }
       j0 oj0 = i0.a();
       LiveMultiTriggeringNeoPendantPresenter tt = this.t;
       if (tt == null) {
          a.S("mLiveAudienceParam");
       }
       oj0.e(804, tt.mPhoto).q("get_points_cnt", Long.valueOf(p0)).a();
       return;
    }
    public final void c9(){
       if (PatchProxy.applyVoid(null, this, LiveMultiTriggeringNeoPendantPresenter.class, "22")) {
          return;
       }
       j0 oj0 = i0.a();
       int i = 140;
       LiveMultiTriggeringNeoPendantPresenter tt = this.t;
       if (tt == null) {
          a.S("mLiveAudienceParam");
       }
       oj0.e(i, tt.mPhoto).d(LiveMultiTriggeringNeoPendantPresenter$d.b).a();
       return;
    }
    public final t d9(long p0){
       PhotoAdvertisement obj;
       LiveMultiTriggeringNeoPendantPresenter liveMultiTri = LiveMultiTriggeringNeoPendantPresenter.class;
       if (PatchProxy.isSupport(liveMultiTri)) {
          obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, liveMultiTri, "16");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       liveMultiTri = this.y;
       int i = 1;
       if (liveMultiTri != null) {
          obj = liveMultiTri.mAdLiveForFansTop;
          if (obj != null && obj.mHadEarnFansTopCoin == i) {
             i = 2;
          }
       }
       c uoc = b.a(0x3a268c29);
       String str = this.V8();
       LiveMultiTriggeringNeoPendantPresenter tt = this.t;
       if (tt == null) {
          a.S("mLiveAudienceParam");
       }
       LiveAudienceParam mPhoto = tt.mPhoto;
       String id = (mPhoto != null)? mPhoto.getId(): null;
       t ot = uoc.v(i, str, null, id).map(new e()).timeout(p0, TimeUnit.MILLISECONDS);
       a.o(ot, "Singleton.get\(Commercial¡­s, TimeUnit.MILLISECONDS\)");
       return ot;
    }
    public final void e9(){
       LiveMultiTriggeringNeoPendantPresenter liveMultiTri = LiveMultiTriggeringNeoPendantPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveMultiTri, "6")) {
          return;
       }
       if (this.x <= 0) {
          return;
       }
       if (this.B != null) {
          this.X8();
          return;
       }else {
          t ot = this.d9(0x2710);
          t ot1 = PatchProxy.apply(objArray, this, liveMultiTri, "7");
          if (ot1 != PatchProxyResult.class) {
          }else {
             ot1 = a0.k(new x0(this)).d0().subscribeOn(b.c());
             a.o(ot1, "Single.create<Unit> { em¡­scribeOn\(Schedulers.io\(\)\)");
          }
          t.zip(ot, ot1, LiveMultiTriggeringNeoPendantPresenter$e.a).subscribe(new LiveMultiTriggeringNeoPendantPresenter$f(this), new LiveMultiTriggeringNeoPendantPresenter$g(this));
          return;
       }
    }
    public final void h9(){
       if (PatchProxy.applyVoid(null, this, LiveMultiTriggeringNeoPendantPresenter.class, "11")) {
          return;
       }
       if (this.S8()) {
          this.X7(this.W8().b(this.R8(), new LiveMultiTriggeringNeoPendantPresenter$startPendentCountDown$1(this)));
       }else {
          this.Y8();
       }
       return;
    }
    public void j8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveMultiTriggeringNeoPendantPresenter.class, "2")) {
          return;
       }
       LiveBizParam liveBizParam = this.s8(LiveBizParam.class);
       this.p = liveBizParam;
       if (liveBizParam != null) {
          objArray = liveBizParam.mAdNeoPendantParam;
       }
       this.q = objArray;
       this.r = this.w8("FANS_TOP_AWARD_LIVE_WATCHING_MS");
       Object obj = this.r8("LIVE_PLAYER_CONTROLLER");
       a.o(obj, "inject\(LiveAccessIds.LIVE_PLAYER_CONTROLLER\)");
       this.s = obj;
       obj = this.r8("LIVE_AUDIENCE_PARAM");
       a.o(obj, "inject\(LiveAccessIds.LIVE_AUDIENCE_PARAM\)");
       this.t = obj;
       this.u = this.s8(LiveTopPendantTempPlayService.class);
       this.v = this.r8("LIVE_SERVICE_MANAGER");
       return;
    }
}
