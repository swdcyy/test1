package com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoMerchantPendantPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoMerchantPendantPresenter$a;
import nsd.u;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoMerchantPendantPresenter$mAdNeoPendantView$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoMerchantPendantPresenter$mLifecycleObserver$1;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoMerchantPendantPresenter$b;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoMerchantPendantPresenter$mUpdateText$1;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoMerchantPendantPresenter$mPendantVisibility$1;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoMerchantPendantPresenter$mShowBubble$1;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoMerchantPendantPresenter$mStartSuccessAnimation$1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kuaishou.live.ad.fanstop.NeoPendentType;
import kotlin.jvm.internal.a;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import com.kwai.feature.api.live.base.model.LiveAdNeoMerchantParam;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.live.ad.fanstop.NeoPendentType$a;
import or5.d;
import lp3.c;
import lp3.i;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import or5.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import wkd.b;
import ql9.f;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleObserver;
import com.kwai.video.waynelive.listeners.LivePlayerStateChangeListener;
import com.kwai.video.waynelive.ILivePlayerStatusMonitor;
import msd.p;
import msd.l;
import ks5.m;
import pl0.i0;
import com.kwai.feature.api.live.merchant.top.LiveTopPendantTempPlayService;
import androidx.lifecycle.Lifecycle$State;
import com.kwai.video.waynelive.LivePlayerController;
import com.kuaishou.live.ad.fanstop.widget.LiveAdNeoMerchantPendantView;
import yx.j0;
import ekd.k1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class LiveAudienceAdNeoMerchantPendantPresenter extends PresenterV2	// class@000965
{
    public final l A;
    public final l B;
    public final p C;
    public boolean D;
    public LiveAdNeoMerchantParam p;
    public LivePlayerController q;
    public LiveAudienceParam r;
    public i s;
    public BaseFragment t;
    public LiveTopPendantTempPlayService u;
    public m v;
    public final p w;
    public final LifecycleObserver x;
    public final LivePlayerStateChangeListener y;
    public final p z;
    public static final LiveAudienceAdNeoMerchantPendantPresenter$a E;

    static {
       LiveAudienceAdNeoMerchantPendantPresenter.E = new LiveAudienceAdNeoMerchantPendantPresenter$a(null);
    }
    public void LiveAudienceAdNeoMerchantPendantPresenter(){
       super();
       this.w = s.c(new LiveAudienceAdNeoMerchantPendantPresenter$mAdNeoPendantView$2(this));
       this.x = new LiveAudienceAdNeoMerchantPendantPresenter$mLifecycleObserver$1(this);
       this.y = new LiveAudienceAdNeoMerchantPendantPresenter$b(this);
       this.z = new LiveAudienceAdNeoMerchantPendantPresenter$mUpdateText$1(this);
       this.A = new LiveAudienceAdNeoMerchantPendantPresenter$mPendantVisibility$1(this);
       this.B = LiveAudienceAdNeoMerchantPendantPresenter$mShowBubble$1.INSTANCE;
       this.C = new LiveAudienceAdNeoMerchantPendantPresenter$mStartSuccessAnimation$1(this);
    }
    public void E8(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveAudienceAdNeoMerchantPendantPresenter liveAudience = LiveAudienceAdNeoMerchantPendantPresenter.class;
       if (PatchProxy.applyVoid(null, this, liveAudience, "4")) {
          return;
       }
       LiveAudienceAdNeoMerchantPendantPresenter obj = PatchProxy.apply(null, this, liveAudience, "5");
       boolean b = false;
       boolean b1 = true;
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          NeoPendentType$a companion = NeoPendentType.Companion;
          NeoPendentType nEO_MERCHANT = NeoPendentType.NEO_MERCHANT_PENDANT;
          LiveAudienceAdNeoMerchantPendantPresenter tr = this.r;
          if (tr == null) {
             a.S("mLiveAudienceParam");
          }
          if (companion.a(nEO_MERCHANT, tr.mLiveAdNeoMerchantParam, null, null)) {
             obj = this.p;
             if (obj != null && obj.mNeedShowPendant == b1) {
                obj = this.s;
                if (obj == null) {
                   a.S("mLiveServiceManager");
                }
                c uoc = obj.a(d.class);
                a.o(uoc, "mLiveServiceManager.getS¡­eInfoManager::class.java\)");
                LiveStreamFeed liveStreamFe = uoc.j0();
                String id = (liveStreamFe != null)? liveStreamFe.getId(): null;
                LiveAudienceAdNeoMerchantPendantPresenter tp = this.p;
                LiveAdNeoMerchantParam mLiveStreamI = (tp != null)? tp.mLiveStreamId: null;
                int i = (id == null || !id.length())? 1: 0;
                if (!i) {
                   tr = (mLiveStreamI == null || !mLiveStreamI.length())? 1: null;
                   if (!tr && (TextUtils.n(id, mLiveStreamI) && b.a(-618875779).a())) {
                      b = true;
                   }
                }
             }
          }
       }
    label_009e :
       if (!b) {
          return;
       }else {
          this.D = b1;
          obj = this.t;
          if (obj == null) {
             a.S("mHostFragment");
          }
          obj.getLifecycle().addObserver(this.x);
          obj = this.q;
          if (obj == null) {
             a.S("mLivePlayerController");
          }
          obj.addStateChangeListener(this.y);
          b.a(-618875779).h();
          b.a(-618875779).k(this.z, this.A, this.B, this.C);
          obj = this.u;
          if (obj != null) {
             liveAudience = PatchProxy.apply(null, this, liveAudience, "9");
             if (liveAudience != patchProxyRe) {
             }else if(this.v == null){
                this.v = new i0(this);
             }
             liveAudience = this.v;
             a.m(liveAudience);
             obj.b(liveAudience);
          }
          LiveAudienceAdNeoMerchantPendantPresenter tt = this.t;
          if (tt == null) {
             a.S("mHostFragment");
          }
          Lifecycle lifecycle = tt.getLifecycle();
          a.o(lifecycle, "mHostFragment.lifecycle");
          if (lifecycle.getCurrentState() == Lifecycle$State.RESUMED) {
             tt = this.q;
             if (tt == null) {
                a.S("mLivePlayerController");
             }
             if (tt.isPlaying()) {
                b.a(-618875779).i();
             }
          }
          return;
       }
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceAdNeoMerchantPendantPresenter.class, "6")) {
          return;
       }
       this.R8();
       return;
    }
    public final LiveAdNeoMerchantPendantView P8(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceAdNeoMerchantPendantPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.w.getValue();
    }
    public synchronized final void R8(){
       LiveAudienceAdNeoMerchantPendantPresenter liveAudience = LiveAudienceAdNeoMerchantPendantPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveAudience, "7")) {
          return;
       }
       LiveAudienceAdNeoMerchantPendantPresenter tt = this.t;
       if (tt == null) {
          a.S("mHostFragment");
       }
       tt.getLifecycle().removeObserver(this.x);
       tt = this.q;
       if (tt == null) {
          a.S("mLivePlayerController");
       }
       tt.removeStateChangeListener(this.y);
       if (this.D != null) {
          Object[] objArray1 = new Object[0];
          j0.f("LiveAudienceAdNeoMerchantPendant", "pendant release", objArray1);
          if (!PatchProxy.applyVoid(objArray, this, liveAudience, "8")) {
             liveAudience = this.v;
             if (liveAudience != null) {
                tt = this.u;
                if (tt != null) {
                   tt.c(liveAudience);
                }
             }
             this.v = objArray;
          }
          b.a(-618875779).b(this.z, this.A, this.B, this.C);
          b.a(-618875779).f();
       }
       this.D = false;
       k1.n(this);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceAdNeoMerchantPendantPresenter.class, "3")) {
          return;
       }
       LiveAudienceAdNeoMerchantPendantPresenter obj = this.r8("LIVE_FRAGMENT");
       a.o(obj, "inject\(LiveAccessIds.LIVE_FRAGMENT\)");
       this.t = obj;
       obj = this.r8("LIVE_PLAYER_CONTROLLER");
       a.o(obj, "inject\(LiveAccessIds.LIVE_PLAYER_CONTROLLER\)");
       this.q = obj;
       obj = this.r8("LIVE_AUDIENCE_PARAM");
       a.o(obj, "inject\(LiveAccessIds.LIVE_AUDIENCE_PARAM\)");
       this.r = obj;
       this.u = this.s8(LiveTopPendantTempPlayService.class);
       obj = this.r8("LIVE_SERVICE_MANAGER");
       a.o(obj, "inject\(LiveAccessIds.LIVE_SERVICE_MANAGER\)");
       this.s = obj;
       obj = this.r;
       if (obj == null) {
          a.S("mLiveAudienceParam");
       }
       this.p = obj.mLiveAdNeoMerchantParam;
       return;
    }
}
