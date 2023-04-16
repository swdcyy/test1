package com.kuaishou.android.live.model.QLivePlayConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.live.model.QLivePlayConfig;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.live.model.Race;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.android.live.model.LiveAdaptiveManifest;
import com.kuaishou.android.live.model.ResolutionPlayUrls;
import com.kuaishou.android.live.model.LiveRestartPlayerConfig;
import com.kuaishou.android.live.model.QLivePlayConfig$NoticeContent;
import com.kuaishou.android.live.model.QLivePlayConfig$Stat;
import com.kuaishou.android.live.model.QLivePlayExtraInfo;
import com.kuaishou.android.live.model.QLivePlayConfig$Announcement;
import com.kuaishou.android.live.model.QLivePlayConfig$WatermarkInfo;
import com.kuaishou.android.live.model.LiveAudiencePaidShowConfig;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.vimeo.stag.KnownTypeAdapters;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$n;
import java.util.List;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.stream.b;

public final class QLivePlayConfig$TypeAdapter extends TypeAdapter	// class@000829
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
    public static final a s;

    static {
       QLivePlayConfig$TypeAdapter.s = a.get(QLivePlayConfig.class);
    }
    public void QLivePlayConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(a.get(Race.class));
       this.c = new KnownTypeAdapters$ListTypeAdapter(TypeAdapters.A, new KnownTypeAdapters$d());
       TypeAdapter typeAdapter = p0.j(a.get(CDNUrl.class));
       this.d = typeAdapter;
       this.e = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       typeAdapter = p0.j(a.get(LiveAdaptiveManifest.class));
       this.f = typeAdapter;
       this.g = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       typeAdapter = p0.j(a.get(ResolutionPlayUrls.class));
       this.h = typeAdapter;
       this.i = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       this.j = p0.j(a.get(LiveRestartPlayerConfig.class));
       typeAdapter = p0.j(a.get(QLivePlayConfig$NoticeContent.class));
       this.k = typeAdapter;
       this.l = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       this.m = p0.j(a.get(QLivePlayConfig$Stat.class));
       this.n = p0.j(a.get(QLivePlayExtraInfo.class));
       this.o = p0.j(a.get(QLivePlayConfig$Announcement.class));
       this.p = p0.j(a.get(QLivePlayConfig$WatermarkInfo.class));
       this.q = p0.j(a.get(LiveAudiencePaidShowConfig.class));
       this.r = new KnownTypeAdapters$ListTypeAdapter(KnownTypeAdapters.c, new KnownTypeAdapters$d());
    }
    public QLivePlayConfig a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, QLivePlayConfig$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       QLivePlayConfig qLivePlayCon = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return qLivePlayCon;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return qLivePlayCon;
       }else {
          p0.c();
          QLivePlayConfig qLivePlayCon1 = new QLivePlayConfig();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x82502fd1:
                   if (str.equals("liveAdaptiveManifest")) {
                      i = 0;
                   }
                   break;
                 case 0x90a0a19a:
                   if (str.equals("subType")) {
                      i = 1;
                   }
                   break;
                 case 0x9249caec:
                   if (str.equals("extParam")) {
                      i = 2;
                   }
                   break;
                 case 0x92fc4e75:
                   if (str.equals("disableLiveStreamNewPayStyle")) {
                      i = 3;
                   }
                   break;
                 case 0x932efd8e:
                   if (str.equals("giftComboBuffSeconds")) {
                      i = 4;
                   }
                   break;
                 case 0x9410ce7a:
                   if (str.equals("displayWatchingCount")) {
                      i = 5;
                   }
                   break;
                 case 0x9690fa25:
                   if (str.equals("isFromLiveMate")) {
                      i = 6;
                   }
                   break;
                 case 0x9c80a6ea:
                   if (str.equals("patternType")) {
                      i = 7;
                   }
                   break;
                 case 0xaa421f52:
                   if (str.equals("webRTCAdaptiveManifest")) {
                      i = 8;
                   }
                   break;
                 case 0xac1eee45:
                   if (str.equals("attach")) {
                      i = 9;
                   }
                   break;
                 case 0xb4548f96:
                   if (str.equals("noticeList")) {
                      i = 10;
                   }
                   break;
                 case 0xb639b41d:
                   if (str.equals("multiResolutionPlayUrls")) {
                      i = 11;
                   }
                   break;
                 case 0xb6f76f32:
                   if (str.equals("watermarkInfo")) {
                      i = 12;
                   }
                   break;
                 case 0xb8c992da:
                   if (str.equals("streamType")) {
                      i = 13;
                   }
                   break;
                 case 0xbc1f3c4c:
                   if (str.equals("isShopLive")) {
                      i = 14;
                   }
                   break;
                 case 0xbe960e5a:
                   if (str.equals("locale")) {
                      i = 15;
                   }
                   break;
                 case 0xc0670987:
                   if (str.equals("useMerchantAudienceApi")) {
                      i = 16;
                   }
                   break;
                 case 0xc1ecf1b5:
                   if (str.equals("rollNotice")) {
                      i = 17;
                   }
                   break;
                 case 0xc26599d9:
                   if (str.equals("customizedCoverUrl")) {
                      i = 18;
                   }
                   break;
                 case 0xc33b0532:
                   if (str.equals("enableNextRetry")) {
                      i = 19;
                   }
                   break;
                 case 0xc95a04d6:
                   if (str.equals("trialRemainDuration")) {
                      i = 20;
                   }
                   break;
                 case 0xca7270dd:
                   if (str.equals("subStartPlayBiz")) {
                      i = 21;
                   }
                   break;
                 case 0xca9d1dd0:
                   if (str.equals("restartPlayer")) {
                      i = 22;
                   }
                   break;
                 case 0xcaba3c32:
                   if (str.equals("replaceFeedMockUserName")) {
                      i = 23;
                   }
                   break;
                 case 0xd2bc8bd8:
                   if (str.equals("expectFreeTraffic")) {
                      i = 24;
                   }
                   break;
                 case 0xd832e1c7:
                   if (str.equals("liveStreamId")) {
                      i = 25;
                   }
                   break;
                 case 0xd9f7df07:
                   if (str.equals("cdnOverload")) {
                      i = 26;
                   }
                   break;
                 case 0xe0c77e7e:
                   if (str.equals("noticeDisplayDuration")) {
                      i = 27;
                   }
                   break;
                 case 0xea0b4e96:
                   if (str.equals("courseId")) {
                      i = 28;
                   }
                   break;
                 case 0xf4b2d7b8:
                   if (str.equals("likeCount")) {
                      i = 29;
                   }
                   break;
                 case 0xfefcec1c:
                   if (str.equals("watchingCount")) {
                      i = 30;
                   }
                   break;
                 case 0x354ad1:
                   if (str.equals("race")) {
                      i = 31;
                   }
                   break;
                 case 0x360654:
                   if (str.equals("stat")) {
                      i = 32;
                   }
                   break;
                 case 0x918974c:
                   if (str.equals("androidHWDecode")) {
                      i = 33;
                   }
                   break;
                 case 0x202f4e82:
                   if (str.equals("isGzoneCompetitionLive")) {
                      i = 34;
                   }
                   break;
                 case 0x20ef99e6:
                   if (str.equals("caption")) {
                      i = 35;
                   }
                   break;
                 case 0x2e7fe13e:
                   if (str.equals("livePolicy")) {
                      i = 36;
                   }
                   break;
                 case 0x30ee0088:
                   if (str.equals("pgcRelayRoomJumpLink")) {
                      i = 37;
                   }
                   break;
                 case 0x331d32a8:
                   if (str.equals("multiTabLive")) {
                      i = 38;
                   }
                   break;
                 case 0x36956be9:
                   if (str.equals("paidShow")) {
                      i = 39;
                   }
                   break;
                 case 0x3836506e:
                   if (str.equals("nextRetryIntervalSecond")) {
                      i = 40;
                   }
                   break;
                 case 0x3ac85389:
                   if (str.equals("liteDisplayTotalStartPlayCount")) {
                      i = 41;
                   }
                   break;
                 case 0x4bc79048:
                   if (str.equals("liteDisplayWatchingCount")) {
                      i = 42;
                   }
                   break;
                 case 0x4d1808b8:
                   if (str.equals("isGrAccount")) {
                      i = 43;
                   }
                   break;
                 case 0x54629916:
                   if (str.equals("displayLikeCount")) {
                      i = 44;
                   }
                   break;
                 case 0x5545f2bb:
                   if (str.equals("landscape")) {
                      i = 45;
                   }
                   break;
                 case 0x5a320960:
                   if (str.equals("serverExpTag")) {
                      i = 46;
                   }
                   break;
                 case 0x6ffc2e38:
                   if (str.equals("playUrls")) {
                      i = 47;
                   }
                   break;
                 case 0x74557e0c:
                   if (str.equals("authReason")) {
                      i = 48;
                   }
                   break;
                 case 0x7c048d17:
                   if (str.equals("socketHostPorts")) {
                      i = 49;
                   }
                   break;
                 case 0x7c9a4873:
                   if (str.equals("lessonId")) {
                      i = 50;
                   }
                   break;
                 case 0x7fa2a43b:
                   if (str.equals("displayTotalStartPlayCount")) {
                      i = 51;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   qLivePlayCon1.mLiveAdaptiveManifests = this.g.read(p0);
                   break;
                 case 1:
                   qLivePlayCon1.mSubType = KnownTypeAdapters$k.a(p0, qLivePlayCon1.mSubType);
                   break;
                 case 2:
                   qLivePlayCon1.mExtraInfo = this.n.read(p0);
                   break;
                 case 3:
                   qLivePlayCon1.mDisableLiveStreamNewPayStyle = KnownTypeAdapters$g.a(p0, qLivePlayCon1.mDisableLiveStreamNewPayStyle);
                   break;
                 case 4:
                   qLivePlayCon1.mGiftComboBuffSeconds = KnownTypeAdapters$n.a(p0, qLivePlayCon1.mGiftComboBuffSeconds);
                   break;
                 case 5:
                   qLivePlayCon1.mDisplayWatchingCount = TypeAdapters.A.read(p0);
                   break;
                 case 6:
                   qLivePlayCon1.mIsFromLiveMate = KnownTypeAdapters$g.a(p0, qLivePlayCon1.mIsFromLiveMate);
                   break;
                 case 7:
                   qLivePlayCon1.mPatternType = KnownTypeAdapters$k.a(p0, qLivePlayCon1.mPatternType);
                   break;
                 case 8:
                   qLivePlayCon1.mWebRTCAdaptiveManifests = this.g.read(p0);
                   break;
                 case 9:
                   qLivePlayCon1.mAttach = TypeAdapters.A.read(p0);
                   break;
                 case 10:
                   qLivePlayCon1.mNoticeList = this.l.read(p0);
                   break;
                 case 11:
                   qLivePlayCon1.mMultiResolutionPlayUrls = this.i.read(p0);
                   break;
                 case 12:
                   qLivePlayCon1.mWatermarkInfo = this.p.read(p0);
                   break;
                 case 13:
                   qLivePlayCon1.mStreamType = KnownTypeAdapters$k.a(p0, qLivePlayCon1.mStreamType);
                   break;
                 case 14:
                   qLivePlayCon1.mIsShopLive = KnownTypeAdapters$g.a(p0, qLivePlayCon1.mIsShopLive);
                   break;
                 case 15:
                   qLivePlayCon1.mLocale = TypeAdapters.A.read(p0);
                   break;
                 case 16:
                   qLivePlayCon1.mUseMerchantAudienceApi = KnownTypeAdapters$g.a(p0, qLivePlayCon1.mUseMerchantAudienceApi);
                   break;
                 case 17:
                   qLivePlayCon1.mLiveAnnouncement = this.o.read(p0);
                   break;
                 case 18:
                   qLivePlayCon1.mCustomizedCoverUrl = TypeAdapters.A.read(p0);
                   break;
                 case 19:
                   qLivePlayCon1.mEnableNextRetry = KnownTypeAdapters$g.a(p0, qLivePlayCon1.mEnableNextRetry);
                   break;
                 case 20:
                   qLivePlayCon1.mCourseTrialRemainDuration = KnownTypeAdapters$k.a(p0, qLivePlayCon1.mCourseTrialRemainDuration);
                   break;
                 case 21:
                   qLivePlayCon1.mSubStartPlayBizList = this.r.read(p0);
                   break;
                 case 22:
                   qLivePlayCon1.mLiveRestartPlayerConfig = this.j.read(p0);
                   break;
                 case 23:
                   qLivePlayCon1.mReplaceFeedMockUserName = TypeAdapters.A.read(p0);
                   break;
                 case 24:
                   qLivePlayCon1.mExpectFreeTraffic = KnownTypeAdapters$g.a(p0, qLivePlayCon1.mExpectFreeTraffic);
                   break;
                 case 25:
                   qLivePlayCon1.mLiveStreamId = TypeAdapters.A.read(p0);
                   break;
                 case 26:
                   qLivePlayCon1.mIsCdnOverload = KnownTypeAdapters$g.a(p0, qLivePlayCon1.mIsCdnOverload);
                   break;
                 case 27:
                   qLivePlayCon1.mNoticeDisplayDuration = KnownTypeAdapters$n.a(p0, qLivePlayCon1.mNoticeDisplayDuration);
                   break;
                 case 28:
                   qLivePlayCon1.mCourseId = KnownTypeAdapters$n.a(p0, qLivePlayCon1.mCourseId);
                   break;
                 case 29:
                   qLivePlayCon1.mLikeCount = KnownTypeAdapters$n.a(p0, qLivePlayCon1.mLikeCount);
                   break;
                 case 30:
                   qLivePlayCon1.mWatchingCount = KnownTypeAdapters$n.a(p0, qLivePlayCon1.mWatchingCount);
                   break;
                 case 31:
                   qLivePlayCon1.mRace = this.b.read(p0);
                   break;
                 case 32:
                   qLivePlayCon1.mStat = this.m.read(p0);
                   break;
                 case '!':
                   qLivePlayCon1.mShouldUseHardwareDecoding = KnownTypeAdapters$g.a(p0, qLivePlayCon1.mShouldUseHardwareDecoding);
                   break;
                 case '"':
                   qLivePlayCon1.mIsGzoneCompetitionLive = KnownTypeAdapters$g.a(p0, qLivePlayCon1.mIsGzoneCompetitionLive);
                   break;
                 case '#':
                   qLivePlayCon1.mGRPRTitle = TypeAdapters.A.read(p0);
                   break;
                 case '$':
                   qLivePlayCon1.mLivePolicy = this.c.read(p0);
                   break;
                 case '%':
                   qLivePlayCon1.mPgcRelayRoomJumpLink = TypeAdapters.A.read(p0);
                   break;
                 case '&':
                   qLivePlayCon1.mIsLiveShowMultiTab = KnownTypeAdapters$g.a(p0, qLivePlayCon1.mIsLiveShowMultiTab);
                   break;
                 case 39:
                   qLivePlayCon1.mLiveAudiencePaidShowConfig = this.q.read(p0);
                   break;
                 case '(':
                   qLivePlayCon1.mNextRetryIntervalSecond = KnownTypeAdapters$k.a(p0, qLivePlayCon1.mNextRetryIntervalSecond);
                   break;
                 case ')':
                   qLivePlayCon1.mLiteAccumulatedWatchCount = TypeAdapters.A.read(p0);
                   break;
                 case '*':
                   qLivePlayCon1.mLiteDisplayWatchingCount = TypeAdapters.A.read(p0);
                   break;
                 case '+':
                   qLivePlayCon1.mIsSpecialAccount = KnownTypeAdapters$g.a(p0, qLivePlayCon1.mIsSpecialAccount);
                   break;
                 case ',':
                   qLivePlayCon1.mDisplayLikeCount = TypeAdapters.A.read(p0);
                   break;
                 case '-':
                   qLivePlayCon1.mLandscape = KnownTypeAdapters$g.a(p0, qLivePlayCon1.mLandscape);
                   break;
                 case '.':
                   qLivePlayCon1.mServerExpTag = TypeAdapters.A.read(p0);
                   break;
                 case '/':
                   qLivePlayCon1.mPlayUrls = this.e.read(p0);
                   break;
                 case '0':
                   qLivePlayCon1.mAuthReason = KnownTypeAdapters$k.a(p0, qLivePlayCon1.mAuthReason);
                   break;
                 case '1':
                   qLivePlayCon1.mSocketHostPorts = this.c.read(p0);
                   break;
                 case '2':
                   qLivePlayCon1.mLessonId = KnownTypeAdapters$n.a(p0, qLivePlayCon1.mLessonId);
                   break;
                 case '3':
                   qLivePlayCon1.mLiveAccumulatedWatchCount = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return qLivePlayCon1;
       }
    }
    public void b(b p0,QLivePlayConfig p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, QLivePlayConfig$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mRace != null) {
             p0.r("race");
             this.b.write(p0, p1.mRace);
          }
          if (p1.mSocketHostPorts != null) {
             p0.r("socketHostPorts");
             this.c.write(p0, p1.mSocketHostPorts);
          }
          if (p1.mLiveStreamId != null) {
             p0.r("liveStreamId");
             TypeAdapters.A.write(p0, p1.mLiveStreamId);
          }
          if (p1.mServerExpTag != null) {
             p0.r("serverExpTag");
             TypeAdapters.A.write(p0, p1.mServerExpTag);
          }
          if (p1.mLocale != null) {
             p0.r("locale");
             TypeAdapters.A.write(p0, p1.mLocale);
          }
          p0.r("androidHWDecode");
          p0.P(p1.mShouldUseHardwareDecoding);
          if (p1.mPlayUrls != null) {
             p0.r("playUrls");
             this.e.write(p0, p1.mPlayUrls);
          }
          if (p1.mLiveAdaptiveManifests != null) {
             p0.r("liveAdaptiveManifest");
             this.g.write(p0, p1.mLiveAdaptiveManifests);
          }
          if (p1.mWebRTCAdaptiveManifests != null) {
             p0.r("webRTCAdaptiveManifest");
             this.g.write(p0, p1.mWebRTCAdaptiveManifests);
          }
          if (p1.mMultiResolutionPlayUrls != null) {
             p0.r("multiResolutionPlayUrls");
             this.i.write(p0, p1.mMultiResolutionPlayUrls);
          }
          if (p1.mLiveRestartPlayerConfig != null) {
             p0.r("restartPlayer");
             this.j.write(p0, p1.mLiveRestartPlayerConfig);
          }
          p0.r("landscape");
          p0.P(p1.mLandscape);
          p0.r("giftComboBuffSeconds");
          p0.K(p1.mGiftComboBuffSeconds);
          if (p1.mAttach != null) {
             p0.r("attach");
             TypeAdapters.A.write(p0, p1.mAttach);
          }
          p0.r("watchingCount");
          p0.K(p1.mWatchingCount);
          p0.r("likeCount");
          p0.K(p1.mLikeCount);
          if (p1.mDisplayWatchingCount != null) {
             p0.r("displayWatchingCount");
             TypeAdapters.A.write(p0, p1.mDisplayWatchingCount);
          }
          if (p1.mLiteDisplayWatchingCount != null) {
             p0.r("liteDisplayWatchingCount");
             TypeAdapters.A.write(p0, p1.mLiteDisplayWatchingCount);
          }
          if (p1.mDisplayLikeCount != null) {
             p0.r("displayLikeCount");
             TypeAdapters.A.write(p0, p1.mDisplayLikeCount);
          }
          if (p1.mLiveAccumulatedWatchCount != null) {
             p0.r("displayTotalStartPlayCount");
             TypeAdapters.A.write(p0, p1.mLiveAccumulatedWatchCount);
          }
          if (p1.mLiteAccumulatedWatchCount != null) {
             p0.r("liteDisplayTotalStartPlayCount");
             TypeAdapters.A.write(p0, p1.mLiteAccumulatedWatchCount);
          }
          if (p1.mNoticeList != null) {
             p0.r("noticeList");
             this.l.write(p0, p1.mNoticeList);
          }
          p0.r("streamType");
          p0.K((long)p1.mStreamType);
          p0.r("noticeDisplayDuration");
          p0.K(p1.mNoticeDisplayDuration);
          p0.r("disableLiveStreamNewPayStyle");
          p0.P(p1.mDisableLiveStreamNewPayStyle);
          if (p1.mStat != null) {
             p0.r("stat");
             this.m.write(p0, p1.mStat);
          }
          p0.r("expectFreeTraffic");
          p0.P(p1.mExpectFreeTraffic);
          p0.r("trialRemainDuration");
          p0.K((long)p1.mCourseTrialRemainDuration);
          p0.r("courseId");
          p0.K(p1.mCourseId);
          p0.r("lessonId");
          p0.K(p1.mLessonId);
          p0.r("authReason");
          p0.K((long)p1.mAuthReason);
          if (p1.mExtraInfo != null) {
             p0.r("extParam");
             this.n.write(p0, p1.mExtraInfo);
          }
          if (p1.mLivePolicy != null) {
             p0.r("livePolicy");
             this.c.write(p0, p1.mLivePolicy);
          }
          if (p1.mLiveAnnouncement != null) {
             p0.r("rollNotice");
             this.o.write(p0, p1.mLiveAnnouncement);
          }
          p0.r("isFromLiveMate");
          p0.P(p1.mIsFromLiveMate);
          p0.r("patternType");
          p0.K((long)p1.mPatternType);
          p0.r("multiTabLive");
          p0.P(p1.mIsLiveShowMultiTab);
          p0.r("isShopLive");
          p0.P(p1.mIsShopLive);
          p0.r("cdnOverload");
          p0.P(p1.mIsCdnOverload);
          p0.r("useMerchantAudienceApi");
          p0.P(p1.mUseMerchantAudienceApi);
          if (p1.mReplaceFeedMockUserName != null) {
             p0.r("replaceFeedMockUserName");
             TypeAdapters.A.write(p0, p1.mReplaceFeedMockUserName);
          }
          if (p1.mWatermarkInfo != null) {
             p0.r("watermarkInfo");
             this.p.write(p0, p1.mWatermarkInfo);
          }
          p0.r("isGrAccount");
          p0.P(p1.mIsSpecialAccount);
          if (p1.mGRPRTitle != null) {
             p0.r("caption");
             TypeAdapters.A.write(p0, p1.mGRPRTitle);
          }
          if (p1.mLiveAudiencePaidShowConfig != null) {
             p0.r("paidShow");
             this.q.write(p0, p1.mLiveAudiencePaidShowConfig);
          }
          p0.r("isGzoneCompetitionLive");
          p0.P(p1.mIsGzoneCompetitionLive);
          p0.r("subType");
          p0.K((long)p1.mSubType);
          if (p1.mPgcRelayRoomJumpLink != null) {
             p0.r("pgcRelayRoomJumpLink");
             TypeAdapters.A.write(p0, p1.mPgcRelayRoomJumpLink);
          }
          if (p1.mSubStartPlayBizList != null) {
             p0.r("subStartPlayBiz");
             this.r.write(p0, p1.mSubStartPlayBizList);
          }
          p0.r("nextRetryIntervalSecond");
          p0.K((long)p1.mNextRetryIntervalSecond);
          p0.r("enableNextRetry");
          p0.P(p1.mEnableNextRetry);
          if (p1.mCustomizedCoverUrl != null) {
             p0.r("customizedCoverUrl");
             TypeAdapters.A.write(p0, p1.mCustomizedCoverUrl);
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
