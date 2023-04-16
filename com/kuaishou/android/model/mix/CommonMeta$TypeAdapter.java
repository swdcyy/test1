package com.kuaishou.android.model.mix.CommonMeta$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.CommonMeta;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.mix.CaptionSearchInfo;
import com.kuaishou.android.model.mix.PosterSpecialEffect;
import com.kwai.framework.model.common.Distance;
import com.kuaishou.android.model.mix.CoverAnimation;
import com.kuaishou.android.model.mix.Location;
import com.yxcorp.gifshow.tube.StandardSerialInfo;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.android.model.mix.PhotoAreaInfo;
import com.yxcorp.gifshow.healthy.HealthyDiseaseInfo;
import com.vimeo.stag.KnownTypeAdapters$MapTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$e;
import bl.p;
import com.kuaishou.android.model.mix.CoverCommonTagsModel$TypeAdapter;
import com.kuaishou.android.model.mix.QRecoTag$TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import com.kuaishou.android.model.mix.FansTopDisplayStyle$TypeAdapter;
import com.kuaishou.android.model.mix.PhotoCoinRewardModel$TypeAdapter;
import com.kuaishou.android.model.mix.SortFeature$TypeAdapter;
import com.kuaishou.android.model.mix.FeedFriendInfo$TypeAdapter;
import com.kuaishou.android.model.mix.FeedBackInterestManagementEntrance$TypeAdapter;
import com.kuaishou.android.model.mix.DetailStrongButtonConfig$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.vimeo.stag.KnownTypeAdapters$k;
import java.util.Map;
import com.kuaishou.android.model.mix.FeedFriendInfo;
import com.kuaishou.android.model.mix.PhotoCoinRewardModel;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.kuaishou.android.model.mix.DetailStrongButtonConfig;
import com.vimeo.stag.KnownTypeAdapters$ArrayTypeAdapter;
import com.kuaishou.android.model.mix.CommonMeta$TypeAdapter$b;
import com.vimeo.stag.KnownTypeAdapters$f;
import com.kuaishou.android.model.mix.FeedBackInterestManagementEntrance;
import java.util.List;
import com.kuaishou.android.model.mix.CoverCommonTagsModel;
import com.kuaishou.android.model.mix.FansTopDisplayStyle;
import com.google.gson.stream.b;
import com.kuaishou.android.model.mix.CommonMeta$TypeAdapter$a;

public final class CommonMeta$TypeAdapter extends TypeAdapter	// class@000c06
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
       CommonMeta$TypeAdapter.w = a.get(CommonMeta.class);
    }
    public void CommonMeta$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(a.get(CaptionSearchInfo.class));
       this.c = p0.j(a.get(PosterSpecialEffect.class));
       this.d = new KnownTypeAdapters$MapTypeAdapter(TypeAdapters.A, TypeAdapters.A, new KnownTypeAdapters$e());
       this.e = p0.j(a.get(Distance.class));
       this.f = p0.j(a.get(CoverAnimation.class));
       this.g = p0.j(a.get(Location.class));
       this.h = p0.j(CoverCommonTagsModel$TypeAdapter.c);
       TypeAdapter typeAdapter = p0.j(QRecoTag$TypeAdapter.b);
       this.i = typeAdapter;
       this.j = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       this.k = p0.j(FansTopDisplayStyle$TypeAdapter.e);
       this.l = p0.j(PhotoCoinRewardModel$TypeAdapter.b);
       typeAdapter = p0.j(SortFeature$TypeAdapter.b);
       this.m = typeAdapter;
       this.n = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       this.o = p0.j(a.get(StandardSerialInfo.class));
       this.p = p0.j(FeedFriendInfo$TypeAdapter.c);
       this.q = p0.j(a.get(FeedLogCtx.class));
       this.r = p0.j(a.get(CDNUrl.class));
       this.s = p0.j(a.get(PhotoAreaInfo.class));
       this.t = p0.j(a.get(HealthyDiseaseInfo.class));
       this.u = p0.j(FeedBackInterestManagementEntrance$TypeAdapter.b);
       this.v = p0.j(DetailStrongButtonConfig$TypeAdapter.b);
    }
    public CommonMeta a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, CommonMeta$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       CommonMeta uCommonMeta = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uCommonMeta;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uCommonMeta;
       }else {
          p0.c();
          CommonMeta uCommonMeta1 = new CommonMeta();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x86237a6a:
                   if (str.equals("photoDescription")) {
                      i = 0;
                   }
                   break;
                 case 0x88cf4711:
                   if (str.equals("standardSerial")) {
                      i = 1;
                   }
                   break;
                 case 0x9083258d:
                   if (str.equals("coverAnimation")) {
                      i = 2;
                   }
                   break;
                 case 0x926caf5d:
                   if (str.equals("posterSpecialEffect")) {
                      i = 3;
                   }
                   break;
                 case 0x9568e10e:
                   if (str.equals("share_info")) {
                      i = 4;
                   }
                   break;
                 case 0x978b1e40:
                   if (str.equals("pureTitle")) {
                      i = 5;
                   }
                   break;
                 case 0x98936424:
                   if (str.equals("fansTopDisplayStyle")) {
                      i = 6;
                   }
                   break;
                 case 0x991cdf3f:
                   if (str.equals("coverExtraTitle")) {
                      i = 7;
                   }
                   break;
                 case 0x9ad2bda3:
                   if (str.equals("relationTypeText")) {
                      i = 8;
                   }
                   break;
                 case 0xa0974215:
                   if (str.equals("surveyId")) {
                      i = 9;
                   }
                   break;
                 case 0xa420eb2d:
                   if (str.equals("photoAreaInfo")) {
                      i = 10;
                   }
                   break;
                 case 0xa49446a5:
                   if (str.equals("photoMmuTagInfo")) {
                      i = 11;
                   }
                   break;
                 case 0xb1f22278:
                   if (str.equals("exp_tag")) {
                      i = 12;
                   }
                   break;
                 case 0xb3c31bbb:
                   if (str.equals("coverCommonTags")) {
                      i = 13;
                   }
                   break;
                 case 0xb3ccff59:
                   if (str.equals("feedId")) {
                      i = 14;
                   }
                   break;
                 case 0xb4c5d589:
                   if (str.equals("searchSessionId")) {
                      i = 15;
                   }
                   break;
                 case 0xb5406c39:
                   if (str.equals("intimateType")) {
                      i = 16;
                   }
                   break;
                 case 0xbe071a81:
                   if (str.equals("ksOrderId")) {
                      i = 17;
                   }
                   break;
                 case 0xbe3ce4b8:
                   if (str.equals("captionByMmu")) {
                      i = 18;
                   }
                   break;
                 case 0xbf33d812:
                   if (str.equals("captionTitle")) {
                      i = 19;
                   }
                   break;
                 case 0xbfec04bf:
                   if (str.equals("ignoreFreeTraffic")) {
                      i = 20;
                   }
                   break;
                 case 0xc2f0f8fc:
                   if (str.equals("captionSearchInfo")) {
                      i = 21;
                   }
                   break;
                 case 0xc5242b30:
                   if (str.equals("province")) {
                      i = 22;
                   }
                   break;
                 case 0xc735ac4a:
                   if (str.equals("diseaseInfo")) {
                      i = 23;
                   }
                   break;
                 case 0xca90681b:
                   if (str.equals("source")) {
                      i = 24;
                   }
                   break;
                 case 0xceac8dac:
                   if (str.equals("randomUrl")) {
                      i = 25;
                   }
                   break;
                 case 0xceb1be5b:
                   if (str.equals("sharePassingParam")) {
                      i = 26;
                   }
                   break;
                 case 0xd04efa98:
                   if (str.equals("recoTags")) {
                      i = 27;
                   }
                   break;
                 case 0xd2bc8bd8:
                   if (str.equals("expectFreeTraffic")) {
                      i = 28;
                   }
                   break;
                 case 0xebcddb6a:
                   if (str.equals("showTime")) {
                      i = 29;
                   }
                   break;
                 case 0xee34bffb:
                   if (str.equals("sortFeatures")) {
                      i = 30;
                   }
                   break;
                 case 0xefcef43f:
                   if (str.equals("commonLogParams")) {
                      i = 31;
                   }
                   break;
                 case 0xf0569f56:
                   if (str.equals("relationType")) {
                      i = 32;
                   }
                   break;
                 case 0xf6085206:
                   if (str.equals("sourcePhotoPage")) {
                      i = 33;
                   }
                   break;
                 case 'd':
                   if (str.equals("d")) {
                      i = 34;
                   }
                   break;
                 case 'h':
                   if (str.equals("h")) {
                      i = 35;
                   }
                   break;
                 case 'w':
                   if (str.equals("w")) {
                      i = 36;
                   }
                   break;
                 case 0x1a268:
                   if (str.equals("mId")) {
                      i = 37;
                   }
                   break;
                 case 0x1b24a:
                   if (str.equals("poi")) {
                      i = 38;
                   }
                   break;
                 case 0x3652cd:
                   if (str.equals("time")) {
                      i = 39;
                   }
                   break;
                 case 0x368f3a:
                   if (str.equals("type")) {
                      i = 40;
                   }
                   break;
                 case 0x8dad8e:
                   if (str.equals("interestManageLongPressEntrance")) {
                      i = 41;
                   }
                   break;
                 case 0x2051381:
                   if (str.equals("feedLogCtx")) {
                      i = 42;
                   }
                   break;
                 case 0x3492916:
                   if (str.equals("timestamp")) {
                      i = 43;
                   }
                   break;
                 case 0x3c6f5db:
                   if (str.equals("reportContext")) {
                      i = 44;
                   }
                   break;
                 case 0x624bf4e:
                   if (str.equals("llsid")) {
                      i = 45;
                   }
                   break;
                 case 0x6a6c170:
                   if (str.equals("ussid")) {
                      i = 46;
                   }
                   break;
                 case 0xb48c738:
                   if (str.equals("socialRelationIsFamiliar")) {
                      i = 47;
                   }
                   break;
                 case 0xd5add0a:
                   if (str.equals("captionByOperation")) {
                      i = 48;
                   }
                   break;
                 case 0x14f7d014:
                   if (str.equals("realRelationType")) {
                      i = 49;
                   }
                   break;
                 case 0x15061c0d:
                   if (str.equals("deduplication")) {
                      i = 50;
                   }
                   break;
                 case 0x1caae96e:
                   if (str.equals("ignoreCheckFilter")) {
                      i = 51;
                   }
                   break;
                 case 0x20ef99e6:
                   if (str.equals("caption")) {
                      i = 52;
                   }
                   break;
                 case 0x248047e5:
                   if (str.equals("liveStartPlaySource")) {
                      i = 53;
                   }
                   break;
                 case 0x24eb1965:
                   if (str.equals("activity61AnimationImageUrls")) {
                      i = 54;
                   }
                   break;
                 case 0x2574c3f5:
                   if (str.equals("enablePaidQuestion")) {
                      i = 55;
                   }
                   break;
                 case 0x277d901e:
                   if (str.equals("captionToComment")) {
                      i = 56;
                   }
                   break;
                 case 0x2c929929:
                   if (str.equals("position")) {
                      i = 57;
                   }
                   break;
                 case 0x2eee652c:
                   if (str.equals("strongStyleButton")) {
                      i = 58;
                   }
                   break;
                 case 0x31988ccf:
                   if (str.equals("rankEnable")) {
                      i = 59;
                   }
                   break;
                 case 0x46c615db:
                   if (str.equals("movieName")) {
                      i = 60;
                   }
                   break;
                 case 0x47472712:
                   if (str.equals("viewTime")) {
                      i = 61;
                   }
                   break;
                 case 0x4c6cc3b3:
                   if (str.equals("nebulaPhotoCoinReward")) {
                      i = 62;
                   }
                   break;
                 case 0x4ce3f968:
                   if (str.equals("showGrDetailPage")) {
                      i = 63;
                   }
                   break;
                 case 0x589438aa:
                   if (str.equals("feedFriendInfo")) {
                      i = 64;
                   }
                   break;
                 case 0x5a320960:
                   if (str.equals("serverExpTag")) {
                      i = 65;
                   }
                   break;
                 case 0x5c295bf6:
                   if (str.equals("degrade")) {
                      i = 66;
                   }
                   break;
                 case 0x709890a7:
                   if (str.equals("display_reco_reason")) {
                      i = 67;
                   }
                   break;
                 case 0x714f9fb5:
                   if (str.equals("location")) {
                      i = 68;
                   }
                   break;
                 case 0x740bd060:
                   if (str.equals("forward_stats_params")) {
                      i = 69;
                   }
                   break;
                 case 0x743e36a1:
                   if (str.equals("ksVoiceShowType")) {
                      i = 70;
                   }
                   break;
                 case 0x79a02ca4:
                   if (str.equals("reco_reason")) {
                      i = 71;
                   }
                   break;
                 case 0x7eb4a6d3:
                   if (str.equals("enableTimestamp")) {
                      i = 72;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uCommonMeta1.mDescription = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   uCommonMeta1.mStandardSerialInfo = this.o.read(p0);
                   break;
                 case 2:
                   uCommonMeta1.mCoverAnimation = this.f.read(p0);
                   break;
                 case 3:
                   uCommonMeta1.mPosterSpecialEffect = this.c.read(p0);
                   break;
                 case 4:
                   uCommonMeta1.mShareInfo = TypeAdapters.A.read(p0);
                   break;
                 case 5:
                   uCommonMeta1.mPureTitle = TypeAdapters.A.read(p0);
                   break;
                 case 6:
                   uCommonMeta1.mFansTopDisplayStyle = this.k.read(p0);
                   break;
                 case 7:
                   uCommonMeta1.mCoverExtraTitle = TypeAdapters.A.read(p0);
                   break;
                 case 8:
                   uCommonMeta1.mRelationTypeText = TypeAdapters.A.read(p0);
                   break;
                 case 9:
                   uCommonMeta1.mSurveyId = TypeAdapters.A.read(p0);
                   break;
                 case 10:
                   uCommonMeta1.mPhotoAreaInfo = this.s.read(p0);
                   break;
                 case 11:
                   uCommonMeta1.mPhotoMmuTagInfo = this.j.read(p0);
                   break;
                 case 12:
                   uCommonMeta1.mExpTag = TypeAdapters.A.read(p0);
                   break;
                 case 13:
                   uCommonMeta1.mCoverCommonTags = this.h.read(p0);
                   break;
                 case 14:
                   uCommonMeta1.mFeedId = TypeAdapters.A.read(p0);
                   break;
                 case 15:
                   uCommonMeta1.mSearchSessionId = TypeAdapters.A.read(p0);
                   break;
                 case 16:
                   uCommonMeta1.mIntimateType = KnownTypeAdapters$k.a(p0, uCommonMeta1.mIntimateType);
                   break;
                 case 17:
                   uCommonMeta1.mKsOrderId = TypeAdapters.A.read(p0);
                   break;
                 case 18:
                   uCommonMeta1.mCaptionByMmu = TypeAdapters.A.read(p0);
                   break;
                 case 19:
                   uCommonMeta1.mCaptionTitle = TypeAdapters.A.read(p0);
                   break;
                 case 20:
                   uCommonMeta1.mIgnoreFreeTraffic = KnownTypeAdapters$g.a(p0, uCommonMeta1.mIgnoreFreeTraffic);
                   break;
                 case 21:
                   uCommonMeta1.mCaptionSearchInfo = this.b.read(p0);
                   break;
                 case 22:
                   uCommonMeta1.mProvince = TypeAdapters.A.read(p0);
                   break;
                 case 23:
                   uCommonMeta1.mHealthyDiseaseInfo = this.t.read(p0);
                   break;
                 case 24:
                   uCommonMeta1.mSource = TypeAdapters.A.read(p0);
                   break;
                 case 25:
                   uCommonMeta1.mRandomUrl = KnownTypeAdapters$g.a(p0, uCommonMeta1.mRandomUrl);
                   break;
                 case 26:
                   uCommonMeta1.mSharePassingParam = TypeAdapters.A.read(p0);
                   break;
                 case 27:
                   uCommonMeta1.mRecoTags = this.j.read(p0);
                   break;
                 case 28:
                   uCommonMeta1.mExpectFreeTraffic = KnownTypeAdapters$g.a(p0, uCommonMeta1.mExpectFreeTraffic);
                   break;
                 case 29:
                   uCommonMeta1.mShowTime = TypeAdapters.A.read(p0);
                   break;
                 case 30:
                   uCommonMeta1.mSortFeatures = this.n.read(p0);
                   break;
                 case 31:
                   uCommonMeta1.mCommonLogParams = TypeAdapters.A.read(p0);
                   break;
                 case 32:
                   uCommonMeta1.mRelationType = KnownTypeAdapters$k.a(p0, uCommonMeta1.mRelationType);
                   break;
                 case '!':
                   uCommonMeta1.mSourcePhotoPage = TypeAdapters.A.read(p0);
                   break;
                 case '"':
                   uCommonMeta1.mRecoDegrade = KnownTypeAdapters$g.a(p0, uCommonMeta1.mRecoDegrade);
                   break;
                 case '#':
                   uCommonMeta1.mHeight = KnownTypeAdapters$k.a(p0, uCommonMeta1.mHeight);
                   break;
                 case '$':
                   uCommonMeta1.mWidth = KnownTypeAdapters$k.a(p0, uCommonMeta1.mWidth);
                   break;
                 case '%':
                   uCommonMeta1.mId = TypeAdapters.A.read(p0);
                   break;
                 case '&':
                   uCommonMeta1.mLocation = this.g.read(p0);
                   break;
                 case 39:
                   uCommonMeta1.mTime = TypeAdapters.A.read(p0);
                   break;
                 case '(':
                   uCommonMeta1.mType = KnownTypeAdapters$k.a(p0, uCommonMeta1.mType);
                   break;
                 case ')':
                   uCommonMeta1.mInterestManagementEntrance = this.u.read(p0);
                   break;
                 case '*':
                   uCommonMeta1.mFeedLogCtx = this.q.read(p0);
                   break;
                 case '+':
                   uCommonMeta1.mCreated = KnownTypeAdapters$n.a(p0, uCommonMeta1.mCreated);
                   break;
                 case ',':
                   uCommonMeta1.mReportContext = TypeAdapters.A.read(p0);
                   break;
                 case '-':
                   uCommonMeta1.mListLoadSequenceID = TypeAdapters.A.read(p0);
                   break;
                 case '.':
                   uCommonMeta1.mUssId = TypeAdapters.A.read(p0);
                   break;
                 case '/':
                   uCommonMeta1.mSocialRelationFamilar = KnownTypeAdapters$g.a(p0, uCommonMeta1.mSocialRelationFamilar);
                   break;
                 case '0':
                   uCommonMeta1.mCaptionByOpertion = TypeAdapters.A.read(p0);
                   break;
                 case '1':
                   uCommonMeta1.mRealRelationType = KnownTypeAdapters$k.a(p0, uCommonMeta1.mRealRelationType);
                   break;
                 case '2':
                   uCommonMeta1.mDeduplication = KnownTypeAdapters$g.a(p0, uCommonMeta1.mDeduplication);
                   break;
                 case '3':
                   uCommonMeta1.mIgnoreCheckFilter = KnownTypeAdapters$g.a(p0, uCommonMeta1.mIgnoreCheckFilter);
                   break;
                 case '4':
                   uCommonMeta1.mCaption = TypeAdapters.A.read(p0);
                   break;
                 case '5':
                   uCommonMeta1.mLiveStartPlaySource = KnownTypeAdapters$k.a(p0, uCommonMeta1.mLiveStartPlaySource);
                   break;
                 case '6':
                   uCommonMeta1.mActivity61AnimationImageUrls = new KnownTypeAdapters$ArrayTypeAdapter(this.r, new CommonMeta$TypeAdapter$b(this)).a(p0);
                   break;
                 case '7':
                   uCommonMeta1.mEnablePaidQuestion = KnownTypeAdapters$g.a(p0, uCommonMeta1.mEnablePaidQuestion);
                   break;
                 case '8':
                   uCommonMeta1.mCaptionToComment = TypeAdapters.A.read(p0);
                   break;
                 case '9':
                   uCommonMeta1.mPosition = KnownTypeAdapters$k.a(p0, uCommonMeta1.mPosition);
                   break;
                 case ':':
                   uCommonMeta1.mDetailStrongButtonConfig = this.v.read(p0);
                   break;
                 case ';':
                   uCommonMeta1.mRankEnable = KnownTypeAdapters$g.a(p0, uCommonMeta1.mRankEnable);
                   break;
                 case '<':
                   uCommonMeta1.mMovieName = TypeAdapters.A.read(p0);
                   break;
                 case '=':
                   uCommonMeta1.mViewTime = KnownTypeAdapters$n.a(p0, uCommonMeta1.mViewTime);
                   break;
                 case '>':
                   uCommonMeta1.mCoinRewardModel = this.l.read(p0);
                   break;
                 case '?':
                   uCommonMeta1.mShowGrDetailPage = KnownTypeAdapters$g.a(p0, uCommonMeta1.mShowGrDetailPage);
                   break;
                 case '@':
                   uCommonMeta1.mFeedFriendInfo = this.p.read(p0);
                   break;
                 case 'A':
                   uCommonMeta1.mServerExpTag = TypeAdapters.A.read(p0);
                   break;
                 case 'B':
                   uCommonMeta1.mDegrade = KnownTypeAdapters$g.a(p0, uCommonMeta1.mDegrade);
                   break;
                 case 'C':
                   uCommonMeta1.mDisplayRecoReason = TypeAdapters.A.read(p0);
                   break;
                 case 'D':
                   uCommonMeta1.mDistance = this.e.read(p0);
                   break;
                 case 'E':
                   uCommonMeta1.mForwardStatsParams = this.d.read(p0);
                   break;
                 case 'F':
                   uCommonMeta1.mKwaiVoiceType = KnownTypeAdapters$k.a(p0, uCommonMeta1.mKwaiVoiceType);
                   break;
                 case 'G':
                   uCommonMeta1.mRecoReason = TypeAdapters.A.read(p0);
                   break;
                 case 'H':
                   uCommonMeta1.mEnableTimestamp = KnownTypeAdapters$g.a(p0, uCommonMeta1.mEnableTimestamp);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uCommonMeta1;
       }
    }
    public void b(b p0,CommonMeta p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CommonMeta$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mId != null) {
             p0.r("mId");
             TypeAdapters.A.write(p0, p1.mId);
          }
          p0.r("type");
          p0.K((long)p1.mType);
          if (p1.mSource != null) {
             p0.r("source");
             TypeAdapters.A.write(p0, p1.mSource);
          }
          if (p1.mExpTag != null) {
             p0.r("exp_tag");
             TypeAdapters.A.write(p0, p1.mExpTag);
          }
          if (p1.mServerExpTag != null) {
             p0.r("serverExpTag");
             TypeAdapters.A.write(p0, p1.mServerExpTag);
          }
          if (p1.mKsOrderId != null) {
             p0.r("ksOrderId");
             TypeAdapters.A.write(p0, p1.mKsOrderId);
          }
          p0.r("w");
          p0.K((long)p1.mWidth);
          p0.r("h");
          p0.K((long)p1.mHeight);
          p0.r("enablePaidQuestion");
          p0.P(p1.mEnablePaidQuestion);
          p0.r("expectFreeTraffic");
          p0.P(p1.mExpectFreeTraffic);
          p0.r("ignoreFreeTraffic");
          p0.P(p1.mIgnoreFreeTraffic);
          p0.r("ignoreCheckFilter");
          p0.P(p1.mIgnoreCheckFilter);
          p0.r("enableTimestamp");
          p0.P(p1.mEnableTimestamp);
          p0.r("timestamp");
          p0.K(p1.mCreated);
          if (p1.mShowTime != null) {
             p0.r("showTime");
             TypeAdapters.A.write(p0, p1.mShowTime);
          }
          p0.r("viewTime");
          p0.K(p1.mViewTime);
          if (p1.mCaptionSearchInfo != null) {
             p0.r("captionSearchInfo");
             this.b.write(p0, p1.mCaptionSearchInfo);
          }
          if (p1.mPosterSpecialEffect != null) {
             p0.r("posterSpecialEffect");
             this.c.write(p0, p1.mPosterSpecialEffect);
          }
          if (p1.mCaption != null) {
             p0.r("caption");
             TypeAdapters.A.write(p0, p1.mCaption);
          }
          if (p1.mCaptionToComment != null) {
             p0.r("captionToComment");
             TypeAdapters.A.write(p0, p1.mCaptionToComment);
          }
          if (p1.mCaptionTitle != null) {
             p0.r("captionTitle");
             TypeAdapters.A.write(p0, p1.mCaptionTitle);
          }
          if (p1.mCaptionByMmu != null) {
             p0.r("captionByMmu");
             TypeAdapters.A.write(p0, p1.mCaptionByMmu);
          }
          if (p1.mCaptionByOpertion != null) {
             p0.r("captionByOperation");
             TypeAdapters.A.write(p0, p1.mCaptionByOpertion);
          }
          if (p1.mPureTitle != null) {
             p0.r("pureTitle");
             TypeAdapters.A.write(p0, p1.mPureTitle);
          }
          if (p1.mForwardStatsParams != null) {
             p0.r("forward_stats_params");
             this.d.write(p0, p1.mForwardStatsParams);
          }
          if (p1.mRecoReason != null) {
             p0.r("reco_reason");
             TypeAdapters.A.write(p0, p1.mRecoReason);
          }
          if (p1.mDisplayRecoReason != null) {
             p0.r("display_reco_reason");
             TypeAdapters.A.write(p0, p1.mDisplayRecoReason);
          }
          if (p1.mDistance != null) {
             p0.r("location");
             this.e.write(p0, p1.mDistance);
          }
          if (p1.mCoverAnimation != null) {
             p0.r("coverAnimation");
             this.f.write(p0, p1.mCoverAnimation);
          }
          if (p1.mLocation != null) {
             p0.r("poi");
             this.g.write(p0, p1.mLocation);
          }
          if (p1.mTime != null) {
             p0.r("time");
             TypeAdapters.A.write(p0, p1.mTime);
          }
          if (p1.mShareInfo != null) {
             p0.r("share_info");
             TypeAdapters.A.write(p0, p1.mShareInfo);
          }
          p0.r("relationType");
          p0.K((long)p1.mRelationType);
          if (p1.mRelationTypeText != null) {
             p0.r("relationTypeText");
             TypeAdapters.A.write(p0, p1.mRelationTypeText);
          }
          p0.r("realRelationType");
          p0.K((long)p1.mRealRelationType);
          p0.r("socialRelationIsFamiliar");
          p0.P(p1.mSocialRelationFamilar);
          p0.r("intimateType");
          p0.K((long)p1.mIntimateType);
          if (p1.mCoverCommonTags != null) {
             p0.r("coverCommonTags");
             this.h.write(p0, p1.mCoverCommonTags);
          }
          if (p1.mDescription != null) {
             p0.r("photoDescription");
             TypeAdapters.A.write(p0, p1.mDescription);
          }
          if (p1.mRecoTags != null) {
             p0.r("recoTags");
             this.j.write(p0, p1.mRecoTags);
          }
          if (p1.mPhotoMmuTagInfo != null) {
             p0.r("photoMmuTagInfo");
             this.j.write(p0, p1.mPhotoMmuTagInfo);
          }
          if (p1.mFansTopDisplayStyle != null) {
             p0.r("fansTopDisplayStyle");
             this.k.write(p0, p1.mFansTopDisplayStyle);
          }
          if (p1.mCoinRewardModel != null) {
             p0.r("nebulaPhotoCoinReward");
             this.l.write(p0, p1.mCoinRewardModel);
          }
          if (p1.mSharePassingParam != null) {
             p0.r("sharePassingParam");
             TypeAdapters.A.write(p0, p1.mSharePassingParam);
          }
          if (p1.mListLoadSequenceID != null) {
             p0.r("llsid");
             TypeAdapters.A.write(p0, p1.mListLoadSequenceID);
          }
          if (p1.mUssId != null) {
             p0.r("ussid");
             TypeAdapters.A.write(p0, p1.mUssId);
          }
          if (p1.mSearchSessionId != null) {
             p0.r("searchSessionId");
             TypeAdapters.A.write(p0, p1.mSearchSessionId);
          }
          p0.r("position");
          p0.K((long)p1.mPosition);
          if (p1.mFeedId != null) {
             p0.r("feedId");
             TypeAdapters.A.write(p0, p1.mFeedId);
          }
          if (p1.mCommonLogParams != null) {
             p0.r("commonLogParams");
             TypeAdapters.A.write(p0, p1.mCommonLogParams);
          }
          if (p1.mSurveyId != null) {
             p0.r("surveyId");
             TypeAdapters.A.write(p0, p1.mSurveyId);
          }
          p0.r("d");
          p0.P(p1.mRecoDegrade);
          p0.r("ksVoiceShowType");
          p0.K((long)p1.mKwaiVoiceType);
          if (p1.mSortFeatures != null) {
             p0.r("sortFeatures");
             this.n.write(p0, p1.mSortFeatures);
          }
          p0.r("rankEnable");
          p0.P(p1.mRankEnable);
          if (p1.mProvince != null) {
             p0.r("province");
             TypeAdapters.A.write(p0, p1.mProvince);
          }
          p0.r("degrade");
          p0.P(p1.mDegrade);
          if (p1.mCoverExtraTitle != null) {
             p0.r("coverExtraTitle");
             TypeAdapters.A.write(p0, p1.mCoverExtraTitle);
          }
          if (p1.mReportContext != null) {
             p0.r("reportContext");
             TypeAdapters.A.write(p0, p1.mReportContext);
          }
          if (p1.mStandardSerialInfo != null) {
             p0.r("standardSerial");
             this.o.write(p0, p1.mStandardSerialInfo);
          }
          p0.r("randomUrl");
          p0.P(p1.mRandomUrl);
          if (p1.mFeedFriendInfo != null) {
             p0.r("feedFriendInfo");
             this.p.write(p0, p1.mFeedFriendInfo);
          }
          if (p1.mSourcePhotoPage != null) {
             p0.r("sourcePhotoPage");
             TypeAdapters.A.write(p0, p1.mSourcePhotoPage);
          }
          if (p1.mMovieName != null) {
             p0.r("movieName");
             TypeAdapters.A.write(p0, p1.mMovieName);
          }
          if (p1.mFeedLogCtx != null) {
             p0.r("feedLogCtx");
             this.q.write(p0, p1.mFeedLogCtx);
          }
          p0.r("liveStartPlaySource");
          p0.K((long)p1.mLiveStartPlaySource);
          p0.r("showGrDetailPage");
          p0.P(p1.mShowGrDetailPage);
          p0.r("deduplication");
          p0.P(p1.mDeduplication);
          if (p1.mActivity61AnimationImageUrls != null) {
             p0.r("activity61AnimationImageUrls");
             new KnownTypeAdapters$ArrayTypeAdapter(this.r, new CommonMeta$TypeAdapter$a(this)).b(p0, p1.mActivity61AnimationImageUrls);
          }
          if (p1.mPhotoAreaInfo != null) {
             p0.r("photoAreaInfo");
             this.s.write(p0, p1.mPhotoAreaInfo);
          }
          if (p1.mHealthyDiseaseInfo != null) {
             p0.r("diseaseInfo");
             this.t.write(p0, p1.mHealthyDiseaseInfo);
          }
          if (p1.mInterestManagementEntrance != null) {
             p0.r("interestManageLongPressEntrance");
             this.u.write(p0, p1.mInterestManagementEntrance);
          }
          if (p1.mDetailStrongButtonConfig != null) {
             p0.r("strongStyleButton");
             this.v.write(p0, p1.mDetailStrongButtonConfig);
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
