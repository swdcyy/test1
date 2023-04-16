package cb2.q;
import k51.c;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveSquareFeedConfig;
import java.lang.reflect.Type;
import wg3.a;
import cb2.l;
import java.lang.Object;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import java.lang.Long;
import cb2.q$a;
import cb2.q$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fb2.i;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import fb2.c;
import com.yxcorp.gifshow.nearby.NearbyGuideParam;
import com.kwai.feature.api.live.base.model.LivePassThruParamExtraInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import fb2.a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import za2.y;
import fb2.g;
import cb2.k;
import java.lang.Integer;
import java.lang.Boolean;
import java.util.Set;
import fb2.f;
import fb2.b;
import java.util.Objects;
import f12.d;
import f12.c;
import cb2.w;
import android.view.View;
import xq5.c;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import androidx.viewpager.widget.ViewPager$i;
import cb2.m;
import com.kwai.feature.api.live.base.service.quitlive.AudienceQuitLiveCheckOrder;
import tq5.a;
import tq5.c;
import ekd.k1;
import com.kuaishou.live.core.basic.activity.x;
import android.content.Context;
import com.yxcorp.utility.n;
import com.kuaishou.live.core.basic.utils.e;
import p91.m;

public class q extends c	// class@000516
{
    public final ViewPager$i A;
    public i p;
    public w q;
    public boolean r;
    public final long s;
    public c t;
    public x u;
    public LiveBizParam v;
    public LiveSlidePlayService w;
    public m x;
    public d y;
    public final c z;
    public static String sLivePresenterClassName = "LiveSlideGuidePresenter";

    public void q(){
       super();
       this.s = k0.a(a.I(LiveConfigStartupResponse$LiveSquareFeedConfig.class), l.a).or(Long.valueOf(0)).longValue();
       this.z = new q$a(this);
       this.A = new q$b(this);
    }
    public void E8(){
       boolean b;
       q oq = q.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oq, "2")) {
          return;
       }
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = PatchProxy.apply(objArray, this, oq, "6");
       if (uoc != patchProxyRe) {
       }else {
          oq = this.v;
          if (oq.mNearbyGuideParam != null && oq.mSlideGuideMode == 4) {
             uoc = new c(this.v.mNearbyGuideParam);
          }else {
             LiveBizParam mExtraInfo = oq.mExtraInfo;
             if (mExtraInfo != null && (!TextUtils.x(mExtraInfo.mActivitySource) && (!TextUtils.x(this.v.mExtraInfo.mSlideGuideText) && this.v.mSlideGuideMode == 3))) {
                LiveBizParam mExtraInfo1 = this.v.mExtraInfo;
                uoc = new a(mExtraInfo1.mActivitySource, mExtraInfo1.mSlideGuideText);
             }else if(y.a(this.getActivity(), this.v)){
                uoc = new g();
             }else {
                oq = this.v;
                if (oq.mSlideGuideMode == 2) {
                   mExtraInfo = oq.mLiveSourceType;
                   if (PatchProxy.isSupport(k.class)) {
                      Object obj = PatchProxy.applyOneRefs(Integer.valueOf(mExtraInfo), objArray, k.class, "1");
                      if (obj != patchProxyRe) {
                         b = obj.booleanValue();
                      label_009f :
                         if (!b) {
                            uoc = new f(this.v.mLiveSourceType);
                         }
                      }
                   }
                   b = k.a.contains(Integer.valueOf(mExtraInfo));
                   goto label_009f ;
                }
                uoc = new b();
             }
          }
       }
       this.p = uoc;
       if (this.y == null) {
          Activity activity = this.getActivity();
          Objects.requireNonNull(activity);
          this.y = c.b(activity);
       }
       this.q = new w(this.m8());
       this.w.P4(this.z);
       this.y.i(this.A);
       this.t.Ci(new m(this), AudienceQuitLiveCheckOrder.LIVE_SLIDE_GUIDE);
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, q.class, "3")) {
          return;
       }
       k1.n(this);
       this.p = objArray;
       this.q = objArray;
       this.w.d5(this.z);
       this.y.g(this.A);
       this.r = false;
       return;
    }
    public boolean P8(){
       Object obj = PatchProxy.apply(null, this, q.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.u.a()) {
          return false;
       }
       if (n.n(this.getContext()) > 0) {
          return false;
       }
       if (this.v.mHasShownLiveSlideGuide != null) {
          return false;
       }
       if (!e.r(this.getActivity())) {
          return false;
       }
       if (this.r != null) {
          return false;
       }
       return true;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, q.class, "1")) {
          return;
       }
       this.t = this.r8("LIVE_QUIT_LIVE_SERVICE");
       this.u = this.r8("LIVE_FRAGMENT_SERVICE");
       this.v = this.q8(LiveBizParam.class);
       this.w = this.r8("LIVE_SLIDE_PLAY_SERVICE");
       this.x = this.r8("LIVE_BASIC_CONTEXT");
       return;
    }
}
