package com.kuaishou.live.ad.fanstop.LiveAudienceAdAutoOpenShopCartPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdAutoOpenShopCartPresenter$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import com.kuaishou.android.model.ads.LiveAdNeoParam;
import com.kuaishou.android.model.ads.LiveAdNeoParam$ExperimentParam;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdAutoOpenShopCartPresenter$onBind$1;
import pl0.g0;
import msd.a;
import java.lang.Long;
import kotlin.jvm.internal.a;
import java.lang.Runnable;
import ekd.k1;
import ks3.r$b;
import ks3.r;
import java.lang.Boolean;
import com.kwai.video.waynelive.LivePlayerController;

public final class LiveAudienceAdAutoOpenShopCartPresenter extends PresenterV2	// class@000952
{
    public LiveBizParam p;
    public r q;
    public LivePlayerController r;
    public final r$b s;

    public void LiveAudienceAdAutoOpenShopCartPresenter(){
       super();
       this.s = new LiveAudienceAdAutoOpenShopCartPresenter$a(this);
    }
    public void E8(){
       LiveAdNeoParam$ExperimentParam mAutoOpenSho;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAudienceAdAutoOpenShopCartPresenter.class, "2")) {
          return;
       }
       LiveAudienceAdAutoOpenShopCartPresenter tp = this.p;
       g0 og0 = null;
       if (tp != null) {
          LiveBizParam mAdNeoPendan = tp.mAdNeoPendantParam;
          if (mAdNeoPendan != null) {
             LiveAdNeoParam mExperimentP = mAdNeoPendan.mExperimentParam;
             if (mExperimentP != null) {
                mAutoOpenSho = mExperimentP.mAutoOpenShopCartDelayMs;
             label_001e :
                LiveAudienceAdAutoOpenShopCartPresenter$onBind$1 oonBind$1 = (mAutoOpenSho - og0 > 0)? 1: null;
                if (oonBind$1) {
                   og0 = new g0(new LiveAudienceAdAutoOpenShopCartPresenter$onBind$1(this));
                   tp = this.p;
                   if (tp != null) {
                      mAdNeoPendan = tp.mAdNeoPendantParam;
                      if (mAdNeoPendan != null) {
                         mExperimentP = mAdNeoPendan.mExperimentParam;
                         if (mExperimentP != null) {
                            objArray = Long.valueOf(mExperimentP.mAutoOpenShopCartDelayMs);
                         }
                      }
                   }
                   a.m(objArray);
                   k1.s(og0, this, objArray.longValue());
                }else if(this.P8()){
                   tp = this.q;
                   if (tp == null) {
                      a.S("mMerchantBottomBarService");
                   }
                   tp.h(this.s);
                }
                return;
             }
          }
       }
       mAutoOpenSho = og0;
       goto label_001e ;
    }
    public void J8(){
       LiveAudienceAdAutoOpenShopCartPresenter liveAudience = LiveAudienceAdAutoOpenShopCartPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveAudience, "3")) {
          return;
       }
       k1.n(this);
       if (!PatchProxy.applyVoid(objArray, this, liveAudience, "4")) {
          liveAudience = this.q;
          if (liveAudience == null) {
             a.S("mMerchantBottomBarService");
          }
          liveAudience.m(this.s);
       }
       return;
    }
    public final boolean P8(){
       LiveAudienceAdAutoOpenShopCartPresenter tp = this.p;
       boolean b = (tp != null && 4 == tp.mOpenPanelType)? true: false;
       return b;
    }
    public final void R8(boolean p0){
       LiveAudienceAdAutoOpenShopCartPresenter tq;
       LiveAudienceAdAutoOpenShopCartPresenter liveAudience = LiveAudienceAdAutoOpenShopCartPresenter.class;
       if (PatchProxy.isSupport(liveAudience) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveAudience, "5")) {
          return;
       }
       liveAudience = this.r;
       if (liveAudience == null) {
          a.S("mLivePlayerController");
       }
       if (liveAudience.isPlaying()) {
          if (!p0) {
             tq = this.q;
             if (tq == null) {
                a.S("mMerchantBottomBarService");
             }
             if (!tq.c()) {
             label_0044 :
                tq = null;
             label_0045 :
                if (tq) {
                   tq = this.q;
                   if (tq == null) {
                      a.S("mMerchantBottomBarService");
                   }
                   tq.f();
                }
                return;
             }
          }
          tq = this.q;
          if (tq == null) {
             a.S("mMerchantBottomBarService");
          }
          if (!tq.n()) {
             tq = 1;
             goto label_0045 ;
          }else {
             goto label_0044 ;
          }
       }else {
          goto label_0044 ;
       }
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceAdAutoOpenShopCartPresenter.class, "1")) {
          return;
       }
       this.p = this.s8(LiveBizParam.class);
       Object obj = this.r8("LIVE_MERCHANT_AUDIENCE_BOTTOM_BAR_SERVICE");
       a.o(obj, "inject\(MerchantAccessIds¡­IENCE_BOTTOM_BAR_SERVICE\)");
       this.q = obj;
       obj = this.r8("LIVE_PLAYER_CONTROLLER");
       a.o(obj, "inject\(LiveAccessIds.LIVE_PLAYER_CONTROLLER\)");
       this.r = obj;
       return;
    }
}
