package com.yxcorp.gifshow.model.response.feed.HomeFeedResponse$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.model.response.feed.HomeFeedResponse;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.ads.RealtimeSplashResponse;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.nearby.FeedCountResponse;
import hlb.a;
import com.yxcorp.gifshow.model.response.HotChannelColumn;
import hlb.c;
import hlb.d;
import com.yxcorp.gifshow.model.response.feed.EdgeRealTimeConfig;
import java.lang.Object;
import com.kwai.framework.model.common.ResponseTimeBean;
import com.yxcorp.gifshow.model.response.pad.PadDataBean;
import com.yxcorp.gifshow.model.response.feed.HeaderFooterInfo;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.vimeo.stag.KnownTypeAdapters$MapTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$e;
import com.vimeo.stag.KnownTypeAdapters;
import com.google.gson.stream.a;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.yxcorp.gifshow.model.response.RealtimeStartupResponse;
import com.vimeo.stag.KnownTypeAdapters$k;
import java.util.List;
import java.util.Map;
import com.vimeo.stag.KnownTypeAdapters$l;
import com.google.gson.stream.b;

public final class HomeFeedResponse$TypeAdapter extends TypeAdapter	// class@001f90
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public final TypeAdapter e;
    public final TypeAdapter f;
    public final TypeAdapter g;
    public final TypeAdapter h;
    public final TypeAdapter i;
    public final TypeAdapter j;
    public final TypeAdapter k;
    public final TypeAdapter l;
    public final TypeAdapter m;
    public final TypeAdapter n;
    public final TypeAdapter o;
    public final TypeAdapter p;
    public final TypeAdapter q;
    public final TypeAdapter r;
    public final TypeAdapter s;
    public final TypeAdapter t;
    public final TypeAdapter u;
    public final TypeAdapter v;
    public static final a w;

    static {
       HomeFeedResponse$TypeAdapter.w = a.get(HomeFeedResponse.class);
    }
    public void HomeFeedResponse$TypeAdapter(Gson p0){
       TypeAdapter a;
       super();
       this.a = p0;
       this.b = p0.j(a.get(RealtimeSplashResponse.class));
       TypeAdapter typeAdapter = p0.j(a.get(QPhoto.class));
       this.c = typeAdapter;
       this.d = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       this.e = p0.j(a.get(FeedCountResponse.class));
       typeAdapter = p0.j(a.get(a.class));
       this.f = typeAdapter;
       this.g = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       typeAdapter = p0.j(a.get(HotChannelColumn.class));
       this.h = typeAdapter;
       this.i = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       typeAdapter = p0.j(a.get(c.class));
       this.j = typeAdapter;
       this.k = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       typeAdapter = p0.j(a.get(d.class));
       this.l = typeAdapter;
       this.m = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       this.n = p0.j(a.get(EdgeRealTimeConfig.class));
       typeAdapter = p0.j(a.get(Object.class));
       this.o = typeAdapter;
       a = TypeAdapters.A;
       KnownTypeAdapters$MapTypeAdapter mapTypeAdapt = new KnownTypeAdapters$MapTypeAdapter(a, typeAdapter, new KnownTypeAdapters$e());
       this.p = mapTypeAdapt;
       this.q = new KnownTypeAdapters$MapTypeAdapter(a, mapTypeAdapt, new KnownTypeAdapters$e());
       this.r = new KnownTypeAdapters$MapTypeAdapter(a, TypeAdapters.e, new KnownTypeAdapters$e());
       this.s = p0.j(a.get(ResponseTimeBean.class));
       this.t = new KnownTypeAdapters$MapTypeAdapter(a, KnownTypeAdapters.d, new KnownTypeAdapters$e());
       this.u = p0.j(a.get(PadDataBean.class));
       this.v = p0.j(a.get(HeaderFooterInfo.class));
    }
    public HomeFeedResponse a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, HomeFeedResponse$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       HomeFeedResponse homeFeedResp = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return homeFeedResp;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return homeFeedResp;
       }else {
          p0.c();
          HomeFeedResponse homeFeedResp1 = new HomeFeedResponse();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x8096a81c:
                   if (str.equals("writeRealShowSucc")) {
                      i = 0;
                   }
                   break;
                 case 0x862c9f7e:
                   if (str.equals("extendFeedParams")) {
                      i = 1;
                   }
                   break;
                 case 0x86640baa:
                   if (str.equals("edgeRealtimeConfig")) {
                      i = 2;
                   }
                   break;
                 case 0x87d6203a:
                   if (str.equals("edgeResult")) {
                      i = 3;
                   }
                   break;
                 case 0x8cea0792:
                   if (str.equals("channelTab")) {
                      i = 4;
                   }
                   break;
                 case 0x8e364983:
                   if (str.equals("enableRefreshWhenFollow")) {
                      i = 5;
                   }
                   break;
                 case 0x8e9d7e91:
                   if (str.equals("responseTimeStats")) {
                      i = 6;
                   }
                   break;
                 case 0x90a04679:
                   if (str.equals("subTags")) {
                      i = 7;
                   }
                   break;
                 case 0x9e1d9fd5:
                   if (str.equals("masterNewPhotoPendingStatus")) {
                      i = 8;
                   }
                   break;
                 case 0xa360cfcc:
                   if (str.equals("rerankShowPageSize")) {
                      i = 9;
                   }
                   break;
                 case 0xa3be0630:
                   if (str.equals("subChannels")) {
                      i = 10;
                   }
                   break;
                 case 0xa8017780:
                   if (str.equals("realtimeSplashInfo")) {
                      i = 11;
                   }
                   break;
                 case 0xacc57f2c:
                   if (str.equals("banner")) {
                      i = 12;
                   }
                   break;
                 case 0xacf6f00d:
                   if (str.equals("needFillSchool")) {
                      i = 13;
                   }
                   break;
                 case 0xb8c992da:
                   if (str.equals("streamType")) {
                      i = 14;
                   }
                   break;
                 case 0xc0601977:
                   if (str.equals("itemFeatureSwitch")) {
                      i = 15;
                   }
                   break;
                 case 0xca9a2a67:
                   if (str.equals("splash")) {
                      i = 16;
                   }
                   break;
                 case 0xcb6d05fb:
                   if (str.equals("hasMoreLiveStream")) {
                      i = 17;
                   }
                   break;
                 case 0xcfe192dd:
                   if (str.equals("padData")) {
                      i = 18;
                   }
                   break;
                 case 0xd44fffc6:
                   if (str.equals("pcursor")) {
                      i = 19;
                   }
                   break;
                 case 0xdd88cf8f:
                   if (str.equals("priorityTabList")) {
                      i = 20;
                   }
                   break;
                 case 0xe6aada1b:
                   if (str.equals("costInfo")) {
                      i = 21;
                   }
                   break;
                 case 0xefe7849e:
                   if (str.equals("enableInjectTopBarLive")) {
                      i = 22;
                   }
                   break;
                 case 0xf1b79d71:
                   if (str.equals("enableNearbyLogDebug")) {
                      i = 23;
                   }
                   break;
                 case 0xf461de4e:
                   if (str.equals("fullColumns")) {
                      i = 24;
                   }
                   break;
                 case 0xf4b14ad8:
                   if (str.equals("needShowFollowRecommend")) {
                      i = 25;
                   }
                   break;
                 case 0xf971fb56:
                   if (str.equals("headerFooterInfo")) {
                      i = 26;
                   }
                   break;
                 case 0x5ccce95:
                   if (str.equals("feeds")) {
                      i = 27;
                   }
                   break;
                 case 0x624bf4e:
                   if (str.equals("llsid")) {
                      i = 28;
                   }
                   break;
                 case 0x6a6c170:
                   if (str.equals("ussid")) {
                      i = 29;
                   }
                   break;
                 case 0x903471f:
                   if (str.equals("liveStreamStrategy")) {
                      i = 30;
                   }
                   break;
                 case 0x169b4789:
                   if (str.equals("fullColumnLlsid")) {
                      i = 31;
                   }
                   break;
                 case 0x25550d27:
                   if (str.equals("splashLlsid")) {
                      i = 32;
                   }
                   break;
                 case 0x27a5dda5:
                   if (str.equals("personalizedTab")) {
                      i = 33;
                   }
                   break;
                 case 0x2a740660:
                   if (str.equals("responseFeedStats")) {
                      i = 34;
                   }
                   break;
                 case 0x2fb67450:
                   if (str.equals("degradeType")) {
                      i = 35;
                   }
                   break;
                 case 0x38b735af:
                   if (str.equals("context")) {
                      i = 36;
                   }
                   break;
                 case 0x39c56c06:
                   if (str.equals("followRecommendSource")) {
                      i = 37;
                   }
                   break;
                 case 0x3ffa9e76:
                   if (str.equals("feedInjectionFailed")) {
                      i = 38;
                   }
                   break;
                 case 0x4e38d847:
                   if (str.equals("needShowInterestedUser")) {
                      i = 39;
                   }
                   break;
                 case 0x55b4daf7:
                   if (str.equals("recommendId")) {
                      i = 40;
                   }
                   break;
                 case 0x6c222cc3:
                   if (str.equals("feedInjectionFailedText")) {
                      i = 41;
                   }
                   break;
                 case 0x7a7e0ae8:
                   if (str.equals("sessionExtraInfo")) {
                      i = 42;
                   }
                   break;
                 case 0x7ebac53d:
                   if (str.equals("isNewRefluxUser")) {
                      i = 43;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   homeFeedResp1.mWriteRealShowSucc = KnownTypeAdapters$g.a(p0, homeFeedResp1.mWriteRealShowSucc);
                   break;
                 case 1:
                   homeFeedResp1.mExtendFeedParams = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   homeFeedResp1.mEdgeRealTimeConfig = this.n.read(p0);
                   break;
                 case 3:
                   homeFeedResp1.mEdgeCandidateResult = this.q.read(p0);
                   break;
                 case 4:
                   homeFeedResp1.mChannelTab = TypeAdapters.A.read(p0);
                   break;
                 case 5:
                   homeFeedResp1.mEnableRefreshWhenFollow = KnownTypeAdapters$g.a(p0, homeFeedResp1.mEnableRefreshWhenFollow);
                   break;
                 case 6:
                   homeFeedResp1.mResponseTime = this.s.read(p0);
                   break;
                 case 7:
                   homeFeedResp1.mSubTags = this.m.read(p0);
                   break;
                 case 8:
                   homeFeedResp1.mMasterNewPhotoPendingStatus = this.r.read(p0);
                   break;
                 case 9:
                   homeFeedResp1.mPageRealSize = KnownTypeAdapters$k.a(p0, homeFeedResp1.mPageRealSize);
                   break;
                 case 10:
                   homeFeedResp1.mSubEntrances = this.k.read(p0);
                   break;
                 case 11:
                   homeFeedResp1.mRealtimeSplashInfoStr = TypeAdapters.A.read(p0);
                   break;
                 case 12:
                   homeFeedResp1.mBanners = this.g.read(p0);
                   break;
                 case 13:
                   homeFeedResp1.mNeedFillSchool = KnownTypeAdapters$g.a(p0, homeFeedResp1.mNeedFillSchool);
                   break;
                 case 14:
                   homeFeedResp1.mStreamType = TypeAdapters.A.read(p0);
                   break;
                 case 15:
                   homeFeedResp1.mEnableItemFeature = KnownTypeAdapters$g.a(p0, homeFeedResp1.mEnableItemFeature);
                   break;
                 case 16:
                   homeFeedResp1.mRealtimeStartupResponse = this.b.read(p0);
                   break;
                 case 17:
                   homeFeedResp1.mHasMoreLiveStream = KnownTypeAdapters$g.a(p0, homeFeedResp1.mHasMoreLiveStream);
                   break;
                 case 18:
                   homeFeedResp1.mPadData = this.u.read(p0);
                   break;
                 case 19:
                   homeFeedResp1.mCursor = TypeAdapters.A.read(p0);
                   break;
                 case 20:
                   homeFeedResp1.mPriorityTabList = KnownTypeAdapters$l.a(p0);
                   break;
                 case 21:
                   homeFeedResp1.mCostInfo = this.t.read(p0);
                   break;
                 case 22:
                   homeFeedResp1.mEnableInjectTopBarLive = KnownTypeAdapters$g.a(p0, homeFeedResp1.mEnableInjectTopBarLive);
                   break;
                 case 23:
                   homeFeedResp1.mEnableNearbyLogDebug = KnownTypeAdapters$g.a(p0, homeFeedResp1.mEnableNearbyLogDebug);
                   break;
                 case 24:
                   homeFeedResp1.mFullColumns = this.i.read(p0);
                   break;
                 case 25:
                   homeFeedResp1.mNeedShowFollowRecommend = KnownTypeAdapters$g.a(p0, homeFeedResp1.mNeedShowFollowRecommend);
                   break;
                 case 26:
                   homeFeedResp1.mHeaderFooterInfo = this.v.read(p0);
                   break;
                 case 27:
                   homeFeedResp1.mQPhotos = this.d.read(p0);
                   break;
                 case 28:
                   homeFeedResp1.mLlsid = TypeAdapters.A.read(p0);
                   break;
                 case 29:
                   homeFeedResp1.mUssid = TypeAdapters.A.read(p0);
                   break;
                 case 30:
                   homeFeedResp1.mLiveStreamStrategy = KnownTypeAdapters$k.a(p0, homeFeedResp1.mLiveStreamStrategy);
                   break;
                 case 31:
                   homeFeedResp1.mFullColumnLlsid = TypeAdapters.A.read(p0);
                   break;
                 case 32:
                   homeFeedResp1.mSplashLlsid = TypeAdapters.A.read(p0);
                   break;
                 case '!':
                   homeFeedResp1.mThanosShowTab = KnownTypeAdapters$k.a(p0, homeFeedResp1.mThanosShowTab);
                   break;
                 case '"':
                   homeFeedResp1.mNearbyFeedCountResponse = this.e.read(p0);
                   break;
                 case '#':
                   homeFeedResp1.mDegradeType = TypeAdapters.A.read(p0);
                   break;
                 case '$':
                   homeFeedResp1.mContext = TypeAdapters.A.read(p0);
                   break;
                 case '%':
                   homeFeedResp1.mFollowRecommendSource = TypeAdapters.A.read(p0);
                   break;
                 case '&':
                   homeFeedResp1.mFeedInjectFailed = KnownTypeAdapters$g.a(p0, homeFeedResp1.mFeedInjectFailed);
                   break;
                 case 39:
                   homeFeedResp1.mNeedShowInterestedUser = KnownTypeAdapters$g.a(p0, homeFeedResp1.mNeedShowInterestedUser);
                   break;
                 case '(':
                   homeFeedResp1.mRecommendId = TypeAdapters.A.read(p0);
                   break;
                 case ')':
                   homeFeedResp1.mFeedInjectionFailedText = TypeAdapters.A.read(p0);
                   break;
                 case '*':
                   homeFeedResp1.mSessionExtraInfo = TypeAdapters.A.read(p0);
                   break;
                 case '+':
                   homeFeedResp1.mIsNewRefluxUser = KnownTypeAdapters$g.a(p0, homeFeedResp1.mIsNewRefluxUser);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return homeFeedResp1;
       }
    }
    public void b(b p0,HomeFeedResponse p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, HomeFeedResponse$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mSplashLlsid != null) {
             p0.r("splashLlsid");
             TypeAdapters.A.write(p0, p1.mSplashLlsid);
          }
          if (p1.mRealtimeSplashInfoStr != null) {
             p0.r("realtimeSplashInfo");
             TypeAdapters.A.write(p0, p1.mRealtimeSplashInfoStr);
          }
          if (p1.mRealtimeStartupResponse != null) {
             p0.r("splash");
             this.b.write(p0, p1.mRealtimeStartupResponse);
          }
          if (p1.mPriorityTabList != null) {
             p0.r("priorityTabList");
             KnownTypeAdapters$l.b(p0, p1.mPriorityTabList);
          }
          if (p1.mChannelTab != null) {
             p0.r("channelTab");
             TypeAdapters.A.write(p0, p1.mChannelTab);
          }
          p0.r("personalizedTab");
          p0.K((long)p1.mThanosShowTab);
          if (p1.mCursor != null) {
             p0.r("pcursor");
             TypeAdapters.A.write(p0, p1.mCursor);
          }
          if (p1.mQPhotos != null) {
             p0.r("feeds");
             this.d.write(p0, p1.mQPhotos);
          }
          if (p1.mNearbyFeedCountResponse != null) {
             p0.r("responseFeedStats");
             this.e.write(p0, p1.mNearbyFeedCountResponse);
          }
          if (p1.mStreamType != null) {
             p0.r("streamType");
             TypeAdapters.A.write(p0, p1.mStreamType);
          }
          p0.r("needFillSchool");
          p0.P(p1.mNeedFillSchool);
          if (p1.mLlsid != null) {
             p0.r("llsid");
             TypeAdapters.A.write(p0, p1.mLlsid);
          }
          if (p1.mFullColumnLlsid != null) {
             p0.r("fullColumnLlsid");
             TypeAdapters.A.write(p0, p1.mFullColumnLlsid);
          }
          if (p1.mUssid != null) {
             p0.r("ussid");
             TypeAdapters.A.write(p0, p1.mUssid);
          }
          if (p1.mRecommendId != null) {
             p0.r("recommendId");
             TypeAdapters.A.write(p0, p1.mRecommendId);
          }
          p0.r("needShowFollowRecommend");
          p0.P(p1.mNeedShowFollowRecommend);
          p0.r("needShowInterestedUser");
          p0.P(p1.mNeedShowInterestedUser);
          if (p1.mFollowRecommendSource != null) {
             p0.r("followRecommendSource");
             TypeAdapters.A.write(p0, p1.mFollowRecommendSource);
          }
          p0.r("hasMoreLiveStream");
          p0.P(p1.mHasMoreLiveStream);
          p0.r("liveStreamStrategy");
          p0.K((long)p1.mLiveStreamStrategy);
          if (p1.mBanners != null) {
             p0.r("banner");
             this.g.write(p0, p1.mBanners);
          }
          if (p1.mFullColumns != null) {
             p0.r("fullColumns");
             this.i.write(p0, p1.mFullColumns);
          }
          if (p1.mSubEntrances != null) {
             p0.r("subChannels");
             this.k.write(p0, p1.mSubEntrances);
          }
          if (p1.mSubTags != null) {
             p0.r("subTags");
             this.m.write(p0, p1.mSubTags);
          }
          p0.r("writeRealShowSucc");
          p0.P(p1.mWriteRealShowSucc);
          if (p1.mEdgeRealTimeConfig != null) {
             p0.r("edgeRealtimeConfig");
             this.n.write(p0, p1.mEdgeRealTimeConfig);
          }
          if (p1.mEdgeCandidateResult != null) {
             p0.r("edgeResult");
             this.q.write(p0, p1.mEdgeCandidateResult);
          }
          p0.r("feedInjectionFailed");
          p0.P(p1.mFeedInjectFailed);
          if (p1.mFeedInjectionFailedText != null) {
             p0.r("feedInjectionFailedText");
             TypeAdapters.A.write(p0, p1.mFeedInjectionFailedText);
          }
          p0.r("rerankShowPageSize");
          p0.K((long)p1.mPageRealSize);
          if (p1.mMasterNewPhotoPendingStatus != null) {
             p0.r("masterNewPhotoPendingStatus");
             this.r.write(p0, p1.mMasterNewPhotoPendingStatus);
          }
          if (p1.mDegradeType != null) {
             p0.r("degradeType");
             TypeAdapters.A.write(p0, p1.mDegradeType);
          }
          if (p1.mExtendFeedParams != null) {
             p0.r("extendFeedParams");
             TypeAdapters.A.write(p0, p1.mExtendFeedParams);
          }
          p0.r("enableNearbyLogDebug");
          p0.P(p1.mEnableNearbyLogDebug);
          p0.r("itemFeatureSwitch");
          p0.P(p1.mEnableItemFeature);
          if (p1.mResponseTime != null) {
             p0.r("responseTimeStats");
             this.s.write(p0, p1.mResponseTime);
          }
          if (p1.mCostInfo != null) {
             p0.r("costInfo");
             this.t.write(p0, p1.mCostInfo);
          }
          if (p1.mSessionExtraInfo != null) {
             p0.r("sessionExtraInfo");
             TypeAdapters.A.write(p0, p1.mSessionExtraInfo);
          }
          p0.r("enableRefreshWhenFollow");
          p0.P(p1.mEnableRefreshWhenFollow);
          p0.r("enableInjectTopBarLive");
          p0.P(p1.mEnableInjectTopBarLive);
          if (p1.mPadData != null) {
             p0.r("padData");
             this.u.write(p0, p1.mPadData);
          }
          p0.r("isNewRefluxUser");
          p0.P(p1.mIsNewRefluxUser);
          if (p1.mHeaderFooterInfo != null) {
             p0.r("headerFooterInfo");
             this.v.write(p0, p1.mHeaderFooterInfo);
          }
          if (p1.mContext != null) {
             p0.r("context");
             TypeAdapters.A.write(p0, p1.mContext);
          }
          p0.j();
          return;
       }
    }
    public Object read(a p0){
       return this.a(p0);
    }
    public void write(b p0,Object p1){
       this.b(p0, p1);
    }
}
