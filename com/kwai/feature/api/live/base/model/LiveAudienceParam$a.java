package com.kwai.feature.api.live.base.model.LiveAudienceParam$a;
import java.lang.Object;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.TextUtils;
import java.lang.System;
import com.kwai.feature.api.live.base.model.LiveBusinessParams;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.yxcorp.gifshow.entity.QPreInfo;
import com.kuaishou.android.model.feed.SearchParams;
import com.kwai.feature.api.live.base.model.LiveFlowDiversionRepostParams;
import com.kwai.feature.api.live.base.model.LivePrivateAutoCheckParams;
import com.kuaishou.merchant.api.core.model.MerchantAudienceParams;
import java.lang.Integer;
import com.google.gson.JsonElement;
import com.google.gson.c;
import com.google.gson.JsonObject;
import java.lang.Number;

public class LiveAudienceParam$a	// class@000f7e
{
    public LivePassThruParamExtraInfo A;
    public LiveFlowDiversionRepostParams B;
    public LiveAdNeoMerchantParam C;
    public LiveBusinessParams D;
    public String E;
    public int F;
    public String a;
    public LiveStreamFeed b;
    public long c;
    public QPreInfo d;
    public int e;
    public int f;
    public String g;
    public String h;
    public String i;
    public int j;
    public int k;
    public String l;
    public boolean m;
    public String n;
    public String o;
    public SearchParams p;
    public String q;
    public LivePrivateAutoCheckParams r;
    public boolean s;
    public boolean t;
    public MerchantAudienceParams u;
    public boolean v;
    public String w;
    public boolean x;
    public LiveDiversionReportParam y;
    public int z;

    public void LiveAudienceParam$a(){
       super();
       this.z = 0;
    }
    public void LiveAudienceParam$a(LiveAudienceParam p0){
       super();
       this.z = 0;
       if (p0 == null) {
          return;
       }
       this.a = p0.mPushArrowRedPacketId;
       this.b = p0.mPhoto;
       this.c = p0.mStartActivityTime;
       this.d = p0.mPreInfo;
       this.e = p0.mIndexInAdapter;
       this.f = p0.mLiveStreamStartPlaySourceForEnterPrompt;
       this.g = p0.mFormerH5Page;
       this.h = p0.mFormerH5PageSource;
       this.i = p0.mLiveSourceUrl;
       this.j = p0.mLiveSourceType;
       this.k = p0.mLiveStreamContentType;
       this.l = p0.mLiveStreamId;
       this.m = p0.mShouldForceCreateLivePlayer;
       this.n = p0.mServerExpTag;
       this.o = p0.mRecommendReason;
       this.p = p0.mSearchParams;
       this.q = p0.mLivePrivateAuthToken;
       this.r = p0.mLivePrivateAutoCheckParams;
       this.t = p0.mIsAutoPlay;
       this.u = p0.mMerchantAudienceParams;
       this.v = p0.mNeedApiDowngrade;
       this.z = p0.mLiveStartPlayEvent;
       this.w = p0.mUserStatusRequestExtraInfo;
       this.y = p0.mLiveDiversionReportParam;
       this.A = p0.mPassThruParamExtraInfo;
       this.s = p0.mShouldAttachFragmentForLivePrivate;
       this.B = p0.mLiveFlowDiversionRepostParams;
       this.C = p0.mLiveAdNeoMerchantParam;
       this.D = p0.mLiveBusinessParams;
       this.F = p0.mLiveSlideSourceModeType;
       return;
    }
    public LiveAudienceParam a(){
       LiveAudienceParam obj = PatchProxy.apply(null, this, LiveAudienceParam$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LiveAudienceParam();
       obj.mPushArrowRedPacketId = TextUtils.k(this.a);
       obj.mPhoto = this.b;
       LiveAudienceParam$a tc = this.c;
       if (!tc) {
          tc = System.currentTimeMillis();
       }
       obj.mStartActivityTime = tc;
       obj.mPreInfo = this.d;
       obj.mIndexInAdapter = this.e;
       obj.mLiveStreamStartPlaySourceForEnterPrompt = this.f;
       obj.mFormerH5Page = TextUtils.k(this.g);
       obj.mFormerH5PageSource = TextUtils.k(this.h);
       obj.mLiveSourceUrl = TextUtils.k(this.i);
       obj.mInternalJumpSchema = this.E;
       obj.mLiveSourceType = this.j;
       obj.mLiveStreamContentType = this.k;
       obj.mLiveStreamId = TextUtils.k(this.l);
       obj.mShouldForceCreateLivePlayer = this.m;
       obj.mServerExpTag = TextUtils.k(this.n);
       obj.mRecommendReason = TextUtils.k(this.o);
       obj.mIsAutoPlay = this.t;
       obj.mNeedApiDowngrade = this.v;
       obj.mLiveStartPlayEvent = this.z;
       obj.mUserStatusRequestExtraInfo = this.w;
       obj.mIsFromShare = this.x;
       obj.mPassThruParamExtraInfo = this.A;
       tc = this.p;
       if (tc != null) {
          obj.mSearchParams = tc;
       }
       obj.mLivePrivateAuthToken = this.q;
       obj.mLivePrivateAutoCheckParams = this.r;
       obj.mShouldAttachFragmentForLivePrivate = this.s;
       tc = this.u;
       if (tc != null) {
          obj.mMerchantAudienceParams = tc;
       }
       obj.mLiveDiversionReportParam = this.y;
       obj.mLiveFlowDiversionRepostParams = this.B;
       obj.mLiveAdNeoMerchantParam = this.C;
       obj.mLiveBusinessParams = this.D;
       obj.mLiveSlideSourceModeType = this.F;
       return obj;
    }
    public LiveAudienceParam$a b(String p0){
       this.g = p0;
       return this;
    }
    public LiveAudienceParam$a c(String p0){
       this.h = p0;
       return this;
    }
    public LiveAudienceParam$a d(int p0){
       this.e = p0;
       return this;
    }
    public LiveAudienceParam$a e(LiveBusinessParams p0){
       this.D = p0;
       return this;
    }
    public LiveAudienceParam$a f(String p0){
       this.q = p0;
       return this;
    }
    public LiveAudienceParam$a g(int p0){
       this.j = p0;
       return this;
    }
    public LiveAudienceParam$a h(String p0){
       this.i = p0;
       return this;
    }
    public LiveAudienceParam$a i(String p0){
       this.l = p0;
       return this;
    }
    public LiveAudienceParam$a j(LiveStreamFeed p0){
       this.b = p0;
       return this;
    }
    public LiveAudienceParam$a k(QPreInfo p0){
       this.d = p0;
       return this;
    }
    public LiveAudienceParam$a l(String p0){
       this.o = p0;
       return this;
    }
    public LiveAudienceParam$a m(SearchParams p0){
       this.p = p0;
       return this;
    }
    public LiveAudienceParam$a n(String p0){
       this.n = p0;
       return this;
    }
    public LiveAudienceParam$a o(String p0){
       this.E = p0;
       return this;
    }
    public LiveAudienceParam$a p(LiveFlowDiversionRepostParams p0){
       this.B = p0;
       return this;
    }
    public LiveAudienceParam$a q(LivePrivateAutoCheckParams p0){
       this.r = p0;
       return this;
    }
    public LiveAudienceParam$a r(int p0){
       this.z = p0;
       return this;
    }
    public LiveAudienceParam$a s(MerchantAudienceParams p0){
       this.u = p0;
       return this;
    }
    public LiveAudienceParam$a t(String p0,int p1){
       JsonObject obj;
       LiveAudienceParam$a uoa = LiveAudienceParam$a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          obj = c.d(this.w).r();
       }catch(java.lang.RuntimeException e0){
          obj = new JsonObject();
       }
       obj.a0(p0, Integer.valueOf(p1));
       this.w = obj.toString();
       return this;
    }
    public LiveAudienceParam$a u(String p0,String p1){
       JsonObject obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveAudienceParam$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = c.d(this.w).r();
       }catch(java.lang.RuntimeException e0){
          obj = new JsonObject();
       }
       obj.c0(p0, p1);
       this.w = obj.toString();
       return this;
    }
    public LiveAudienceParam$a v(long p0){
       this.c = p0;
       return this;
    }
}
