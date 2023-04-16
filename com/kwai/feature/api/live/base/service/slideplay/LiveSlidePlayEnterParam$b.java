package com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayEnterParam$b;
import java.lang.Object;
import java.util.HashMap;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayEnterParam;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayEnterParam$a;
import com.kwai.feature.api.live.base.model.LiveStyleParams;
import com.kwai.feature.api.live.base.model.LivePassThruParamExtraInfo;
import java.util.List;
import java.lang.Iterable;
import qk.m;
import com.kwai.feature.api.live.base.service.slideplay.a;
import ok.o;
import f12.j;
import ok.h;
import com.google.common.collect.ImmutableList;
import java.util.Map;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;

public class LiveSlidePlayEnterParam$b	// class@000fad
{
    public final Map A;
    public int B;
    public int C;
    public LiveStyleParams D;
    public boolean E;
    public String F;
    public boolean G;
    public String H;
    public QPhoto I;
    public QPhoto a;
    public List b;
    public String c;
    public String d;
    public String e;
    public String f;
    public int g;
    public String h;
    public boolean i;
    public int j;
    public String k;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public String p;
    public int q;
    public int r;
    public LivePassThruParamExtraInfo s;
    public boolean t;
    public LiveAudienceParam u;
    public boolean v;
    public boolean w;
    public String x;
    public String y;
    public Map z;

    public void LiveSlidePlayEnterParam$b(){
       super();
       this.A = new HashMap();
       this.H = "";
    }
    public LiveSlidePlayEnterParam$b A(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveSlidePlayEnterParam$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a = new QPhoto(p0);
       return this;
    }
    public LiveSlidePlayEnterParam$b B(int p0){
       this.q = p0;
       return this;
    }
    public LiveSlidePlayEnterParam$b C(QPhoto p0){
       this.a = p0;
       return this;
    }
    public LiveSlidePlayEnterParam$b D(String p0){
       this.p = p0;
       return this;
    }
    public LiveSlidePlayEnterParam$b E(boolean p0){
       this.v = p0;
       return this;
    }
    public LiveSlidePlayEnterParam$b F(String p0){
       this.h = p0;
       return this;
    }
    public LiveSlidePlayEnterParam$b G(boolean p0){
       this.t = p0;
       return this;
    }
    public LiveSlidePlayEnterParam a(){
       Object[] objArray = null;
       LiveSlidePlayEnterParam obj = PatchProxy.apply(objArray, this, LiveSlidePlayEnterParam$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LiveSlidePlayEnterParam(objArray);
       obj.mSelectedPhoto = this.a;
       obj.mPhotoList = this.b;
       obj.mPcursor = this.c;
       obj.mPath = this.d;
       obj.mLiveStreamId = this.e;
       obj.mRecoLiveStreamId = this.f;
       obj.mLiveSlidePlaySource = this.g;
       obj.mSlidePlayId = this.h;
       obj.mDisablePullRefresh = this.i;
       obj.mLiveSourceType = this.j;
       obj.mLiveSourceUrl = this.k;
       obj.mOpenPanelType = this.l;
       obj.mDisableNegativeFeedback = this.m;
       obj.mDisableLoadMore = this.n;
       obj.mEnableSlidePositionChangeEvent = this.o;
       obj.mSelectedStreamId = this.p;
       obj.mSelectedIndex = this.q;
       obj.mExtraInfo = this.s;
       obj.mSlideGuideMode = this.r;
       obj.mIsSoloLiveStream = this.t;
       obj.mLiveAudienceParam = this.u;
       obj.mShouldShowNewFeedbackInProfilePage = this.v;
       obj.mDisableSyncFeedPosition = this.w;
       obj.mPlayerReuseToken = this.x;
       obj.mConstantLiveStreamId = this.y;
       obj.mPageUrlParamMap = this.z;
       obj.mUnserializableBundleId = this.B;
       obj.mSlideEnterAnimRes = this.C;
       obj.mIsAutoEnter = this.E;
       obj.mFollowStackPath = this.F;
       obj.mEnableUnFollowRemove = this.G;
       LiveSlidePlayEnterParam$b tD = this.D;
       if (tD != null) {
          obj.mLiveStyleParams = tD;
       }
       if (obj.mLiveStyleParams.mEnableShrinkAnimation != null) {
          obj.mSlideEnterAnimRes = 0x7f010049;
       }
       obj.mLiveInternalJumpUrlMap = this.A;
       obj.mNoMoreText = this.H;
       obj.mPreviewOrLiteOriginPhoto = this.I;
       return obj;
    }
    public LiveSlidePlayEnterParam$b b(){
       this.C = 0x7f010049;
       return this;
    }
    public LiveSlidePlayEnterParam$b c(boolean p0){
       this.n = p0;
       return this;
    }
    public LiveSlidePlayEnterParam$b d(boolean p0){
       this.i = p0;
       return this;
    }
    public LiveSlidePlayEnterParam$b e(boolean p0){
       this.w = p0;
       return this;
    }
    public LiveSlidePlayEnterParam$b f(boolean p0){
       this.o = p0;
       return this;
    }
    public LiveSlidePlayEnterParam$b g(boolean p0){
       this.G = p0;
       return this;
    }
    public LiveSlidePlayEnterParam$b h(LivePassThruParamExtraInfo p0){
       this.s = p0;
       return this;
    }
    public LiveSlidePlayEnterParam$b i(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveSlidePlayEnterParam$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.b = m.s(p0).p(a.b).F(j.b).B();
       return this;
    }
    public LiveSlidePlayEnterParam$b j(String p0){
       this.F = p0;
       return this;
    }
    public LiveSlidePlayEnterParam$b k(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveSlidePlayEnterParam$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.A.put(p0, p1);
       return this;
    }
    public LiveSlidePlayEnterParam$b l(boolean p0){
       this.E = p0;
       return this;
    }
    public LiveSlidePlayEnterParam$b m(LiveAudienceParam p0){
       this.u = p0;
       return this;
    }
    public LiveSlidePlayEnterParam$b n(int p0){
       this.g = p0;
       return this;
    }
    public LiveSlidePlayEnterParam$b o(int p0){
       this.j = p0;
       return this;
    }
    public LiveSlidePlayEnterParam$b p(String p0){
       this.k = p0;
       return this;
    }
    public LiveSlidePlayEnterParam$b q(String p0){
       this.e = p0;
       return this;
    }
    public LiveSlidePlayEnterParam$b r(LiveStyleParams p0){
       this.D = p0;
       return this;
    }
    public LiveSlidePlayEnterParam$b s(String p0){
       this.H = p0;
       return this;
    }
    public LiveSlidePlayEnterParam$b t(int p0){
       this.l = p0;
       return this;
    }
    public LiveSlidePlayEnterParam$b u(Map p0){
       this.z = p0;
       return this;
    }
    public LiveSlidePlayEnterParam$b v(String p0){
       this.d = p0;
       return this;
    }
    public LiveSlidePlayEnterParam$b w(List p0){
       this.b = p0;
       return this;
    }
    public LiveSlidePlayEnterParam$b x(String p0){
       this.x = p0;
       return this;
    }
    public LiveSlidePlayEnterParam$b y(QPhoto p0){
       this.I = p0;
       return this;
    }
    public LiveSlidePlayEnterParam$b z(String p0){
       this.f = p0;
       return this;
    }
}
