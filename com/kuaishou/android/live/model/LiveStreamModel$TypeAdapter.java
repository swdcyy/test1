package com.kuaishou.android.live.model.LiveStreamModel$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.live.model.LiveStreamModel;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.live.model.LiveFeedbackSwitchModel;
import com.kuaishou.android.live.model.LiveFeedCoverIcons;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.android.live.model.LiveCoverWidgetModel;
import com.kuaishou.android.model.recruit.RecruitCardInfoModel;
import com.kuaishou.android.live.model.LiveSimpleCoverReasonTag;
import com.kuaishou.android.live.model.LiveCoverRightTopDecorateInfoModel;
import com.kuaishou.android.model.mix.BottomEntryInfoModel;
import com.kuaishou.android.live.model.LiveSquareLayoutModel;
import com.kuaishou.android.live.model.LiveAudienceSkinActivityConfig;
import com.kuaishou.android.live.model.LiveSimpleSkinConfig;
import com.kuaishou.android.live.model.LiveAudienceCustomSkinConfig;
import com.kuaishou.android.live.model.LiveStreamFeedPrivateInfo;
import com.kuaishou.android.live.model.LiveCoverTagModel;
import com.kuaishou.android.live.model.LivePreviewModel;
import com.kuaishou.android.live.model.preview.LivePreviewRichTextModel;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.android.live.model.LiveFeedFunctionShieldSwitchInfo$TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$b;
import bl.p;
import com.kuaishou.android.model.feed.LiveCoverAnnexWrapper$TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters;
import com.kuaishou.android.live.model.LiveStreamModel$SpecialLive$TypeAdapter;
import com.kuaishou.android.live.model.LiveStreamModel$UserCountConfig$TypeAdapter;
import com.kuaishou.android.live.model.LiveStreamFeedPlusNearByInfo$TypeAdapter;
import com.kuaishou.android.live.model.LiveStreamFeedRecruitCardInfoV2$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$j;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.kuaishou.android.live.model.LiveStreamModel$UserCountConfig;
import com.kuaishou.android.live.model.LiveStreamFeedRecruitCardInfoV2;
import com.vimeo.stag.KnownTypeAdapters$n;
import java.util.List;
import com.kuaishou.android.live.model.LiveFeedFunctionShieldSwitchInfo;
import com.kuaishou.android.live.model.LiveStreamFeedPlusNearByInfo;
import com.kuaishou.android.model.feed.LiveCoverAnnexWrapper;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import java.util.ArrayList;
import com.vimeo.stag.KnownTypeAdapters$ArrayTypeAdapter;
import com.kuaishou.android.live.model.LiveStreamModel$TypeAdapter$b;
import com.vimeo.stag.KnownTypeAdapters$f;
import com.kuaishou.android.live.model.LiveStreamModel$SpecialLive;
import com.google.gson.stream.b;
import com.kuaishou.android.live.model.LiveStreamModel$TypeAdapter$a;

public final class LiveStreamModel$TypeAdapter extends TypeAdapter	// class@00081a
{
    public final TypeAdapter A;
    public final TypeAdapter B;
    public final TypeAdapter C;
    public final TypeAdapter D;
    public final TypeAdapter E;
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
    public final TypeAdapter w;
    public final TypeAdapter x;
    public final TypeAdapter y;
    public final TypeAdapter z;
    public static final a F;

    static {
       LiveStreamModel$TypeAdapter.F = a.get(LiveStreamModel.class);
    }
    public void LiveStreamModel$TypeAdapter(Gson p0){
       TypeAdapter a;
       int i = this;
       Gson gson = p0;
       super();
       i.a = gson;
       i.b = gson.j(a.get(LiveFeedbackSwitchModel.class));
       i.c = gson.j(LiveFeedFunctionShieldSwitchInfo$TypeAdapter.b);
       a = TypeAdapters.A;
       i.d = new KnownTypeAdapters$ListTypeAdapter(a, new KnownTypeAdapters$b());
       i.e = gson.j(a.get(LiveFeedCoverIcons.class));
       i.f = gson.j(LiveCoverAnnexWrapper$TypeAdapter.d);
       TypeAdapter typeAdapter = gson.j(a.get(UserInfo.class));
       i.g = typeAdapter;
       i.h = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       typeAdapter = gson.j(a.get(LiveCoverWidgetModel.class));
       i.i = typeAdapter;
       i.j = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       i.k = gson.j(a.get(RecruitCardInfoModel.class));
       i.l = gson.j(a.get(LiveSimpleCoverReasonTag.class));
       i.m = gson.j(a.get(LiveCoverRightTopDecorateInfoModel.class));
       i.n = gson.j(a.get(BottomEntryInfoModel.class));
       i.o = gson.j(PlcEntryStyleInfo$TypeAdapter.f);
       i.p = gson.j(a.get(LiveSquareLayoutModel.class));
       i.q = gson.j(a.get(LiveAudienceSkinActivityConfig.class));
       i.r = gson.j(a.get(LiveSimpleSkinConfig.class));
       i.s = gson.j(a.get(LiveAudienceCustomSkinConfig.class));
       i.t = gson.j(a.get(LiveStreamFeedPrivateInfo.class));
       i.u = gson.j(a.get(LiveCoverTagModel.class));
       i.v = new KnownTypeAdapters$ListTypeAdapter(a, new KnownTypeAdapters$d());
       i.w = new KnownTypeAdapters$ListTypeAdapter(KnownTypeAdapters.c, new KnownTypeAdapters$d());
       i.x = gson.j(LiveStreamModel$SpecialLive$TypeAdapter.e);
       i.y = gson.j(LiveStreamModel$UserCountConfig$TypeAdapter.b);
       i.z = gson.j(LiveStreamFeedPlusNearByInfo$TypeAdapter.c);
       i.A = gson.j(LiveStreamFeedRecruitCardInfoV2$TypeAdapter.b);
       i.B = gson.j(a.get(LivePreviewModel.class));
       typeAdapter = gson.j(a.get(LivePreviewRichTextModel.class));
       i.C = typeAdapter;
       i.D = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       i.E = gson.j(a.get(CDNUrl.class));
    }
    public LiveStreamModel a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveStreamModel$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       LiveStreamModel liveStreamMo = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return liveStreamMo;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return liveStreamMo;
       }else {
          p0.c();
          LiveStreamModel liveStreamMo1 = new LiveStreamModel();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x8653196b:
                   if (str.equals("audienceCount")) {
                      i = 0;
                   }
                   break;
                 case 0x886fc4f4:
                   if (str.equals("isMsAnimation")) {
                      i = 1;
                   }
                   break;
                 case 0x8b9b945c:
                   if (str.equals("showFollowGuideInfo")) {
                      i = 2;
                   }
                   break;
                 case 0x8c265c9e:
                   if (str.equals("redPackEndTime")) {
                      i = 3;
                   }
                   break;
                 case 0x918adb03:
                   if (str.equals("isBulletOff")) {
                      i = 4;
                   }
                   break;
                 case 0x9686ce57:
                   if (str.equals("disableComment")) {
                      i = 5;
                   }
                   break;
                 case 0x9718e6f8:
                   if (str.equals("coverWidgets")) {
                      i = 6;
                   }
                   break;
                 case 0x9b61574b:
                   if (str.equals("simpleLiveEndCountDownSeconds")) {
                      i = 7;
                   }
                   break;
                 case 0x9fa999b9:
                   if (str.equals("isInCommentLottery")) {
                      i = 8;
                   }
                   break;
                 case 0xa1c2fc81:
                   if (str.equals("customized")) {
                      i = 9;
                   }
                   break;
                 case 0xa264f431:
                   if (str.equals("recoRerankContext")) {
                      i = 10;
                   }
                   break;
                 case 0xa35f7cda:
                   if (str.equals("districtRank")) {
                      i = 11;
                   }
                   break;
                 case 0xa3a73b68:
                   if (str.equals("tagInfo")) {
                      i = 12;
                   }
                   break;
                 case 0xaaa82dbe:
                   if (str.equals("simpleLive")) {
                      i = 13;
                   }
                   break;
                 case 0xaae7be12:
                   if (str.equals("intervalMills")) {
                      i = 14;
                   }
                   break;
                 case 0xb3640461:
                   if (str.equals("liveBizType")) {
                      i = 15;
                   }
                   break;
                 case 0xb49cb4b2:
                   if (str.equals("special_live")) {
                      i = 16;
                   }
                   break;
                 case 0xb54723ba:
                   if (str.equals("isMsRedPack")) {
                      i = 17;
                   }
                   break;
                 case 0xb729a012:
                   if (str.equals("liveCoverIconInfo")) {
                      i = 18;
                   }
                   break;
                 case 0xb9a6228b:
                   if (str.equals("isMsPk")) {
                      i = 19;
                   }
                   break;
                 case 0xbbf067f4:
                   if (str.equals("fillCover")) {
                      i = 20;
                   }
                   break;
                 case 0xbd203aa3:
                   if (str.equals("verticalTypes")) {
                      i = 21;
                   }
                   break;
                 case 0xc749ccfb:
                   if (str.equals("tvcType")) {
                      i = 22;
                   }
                   break;
                 case 0xc936d6bc:
                   if (str.equals("displayDistrictRank")) {
                      i = 23;
                   }
                   break;
                 case 0xcc2e2bae:
                   if (str.equals("newSimpleLiveCard")) {
                      i = 24;
                   }
                   break;
                 case 0xd2501e55:
                   if (str.equals("bottomEntryInfo")) {
                      i = 25;
                   }
                   break;
                 case 0xd4c479db:
                   if (str.equals("lv_params")) {
                      i = 26;
                   }
                   break;
                 case 0xd832e1c7:
                   if (str.equals("liveStreamId")) {
                      i = 27;
                   }
                   break;
                 case 0xe6ea1ee4:
                   if (str.equals("paidShowId")) {
                      i = 28;
                   }
                   break;
                 case 0xee29b524:
                   if (str.equals("hotValue")) {
                      i = 29;
                   }
                   break;
                 case 0xf1655146:
                   if (str.equals("liveEndAutoJumpType")) {
                      i = 30;
                   }
                   break;
                 case 0xf2d0b510:
                   if (str.equals("liveEndAutoJumpWaitSec")) {
                      i = 31;
                   }
                   break;
                 case 0xf40fd8ea:
                   if (str.equals("msLiveDescription")) {
                      i = 32;
                   }
                   break;
                 case 0xf4b2d7b8:
                   if (str.equals("likeCount")) {
                      i = 33;
                   }
                   break;
                 case 0xf72e81b6:
                   if (str.equals("simpleLiveCoverSkin")) {
                      i = 34;
                   }
                   break;
                 case 0xfd191efa:
                   if (str.equals("lowSystemVersionLiveCoverUrls")) {
                      i = 35;
                   }
                   break;
                 case 0xfefcec1c:
                   if (str.equals("watchingCount")) {
                      i = 36;
                   }
                   break;
                 case 0xff7d4bde:
                   if (str.equals("cardInfo")) {
                      i = 37;
                   }
                   break;
                 case 0xffc04af3:
                   if (str.equals("enterSimpleLiveDelayMs")) {
                      i = 38;
                   }
                   break;
                 case 0x3a17b0:
                   if (str.equals("plcFeatureEntryAbFlag")) {
                      i = 39;
                   }
                   break;
                 case 0x1a4b002:
                   if (str.equals("simpleLiveCaptionRichTexts")) {
                      i = 40;
                   }
                   break;
                 case 0x823d4ac:
                   if (str.equals("enableAutoPlayVoice")) {
                      i = 41;
                   }
                   break;
                 case 0x8b2070a:
                   if (str.equals("adminAuthorDutyType")) {
                      i = 42;
                   }
                   break;
                 case 0x9d9d369:
                   if (str.equals("simpleAuthorMarks")) {
                      i = 43;
                   }
                   break;
                 case 0x11667e1d:
                   if (str.equals("simpleLiveCoverReasonTag")) {
                      i = 44;
                   }
                   break;
                 case 0x1851bf4e:
                   if (str.equals("liveConfig")) {
                      i = 45;
                   }
                   break;
                 case 0x1b66fbc9:
                   if (str.equals("displayAudienceCount")) {
                      i = 46;
                   }
                   break;
                 case 0x20ef99e6:
                   if (str.equals("caption")) {
                      i = 47;
                   }
                   break;
                 case 0x212a2a26:
                   if (str.equals("voicePartySubType")) {
                      i = 48;
                   }
                   break;
                 case 0x241514e3:
                   if (str.equals("realTimeCoverUrl")) {
                      i = 49;
                   }
                   break;
                 case 0x26a86aa3:
                   if (str.equals("plcFeatureEntry")) {
                      i = 50;
                   }
                   break;
                 case 0x26c4aded:
                   if (str.equals("fromGroupChat")) {
                      i = 51;
                   }
                   break;
                 case 0x27405ee9:
                   if (str.equals("liveCoverAnnex")) {
                      i = 52;
                   }
                   break;
                 case 0x30c353f5:
                   if (str.equals("liveLiteActivityFlag")) {
                      i = 53;
                   }
                   break;
                 case 0x33be9529:
                   if (str.equals("liveSquare")) {
                      i = 54;
                   }
                   break;
                 case 0x3b240d9d:
                   if (str.equals("liveModel")) {
                      i = 55;
                   }
                   break;
                 case 0x3e71a937:
                   if (str.equals("showAccompanyIcon")) {
                      i = 56;
                   }
                   break;
                 case 0x4086de4a:
                   if (str.equals("redPack")) {
                      i = 57;
                   }
                   break;
                 case 0x40b292db:
                   if (str.equals("refresh")) {
                      i = 58;
                   }
                   break;
                 case 0x456d5744:
                   if (str.equals("msLiveDescriptionType")) {
                      i = 59;
                   }
                   break;
                 case 0x483b9707:
                   if (str.equals("showHorseRaceTitle")) {
                      i = 60;
                   }
                   break;
                 case 0x4ae9c3c0:
                   if (str.equals("disablePreview")) {
                      i = 61;
                   }
                   break;
                 case 0x54629916:
                   if (str.equals("displayLikeCount")) {
                      i = 62;
                   }
                   break;
                 case 0x556b9b31:
                   if (str.equals("activityConfig")) {
                      i = 63;
                   }
                   break;
                 case 0x5b2bb933:
                   if (str.equals("livePlusNearByInfo")) {
                      i = 64;
                   }
                   break;
                 case 0x5d77ef59:
                   if (str.equals("isMusicFeed")) {
                      i = 65;
                   }
                   break;
                 case 0x5dd56a43:
                   if (str.equals("functionShieldSwitchInfo")) {
                      i = 66;
                   }
                   break;
                 case 0x5eecf045:
                   if (str.equals("livePrivateInfo")) {
                      i = 67;
                   }
                   break;
                 case 0x5f9e3e0f:
                   if (str.equals("displayStyle")) {
                      i = 68;
                   }
                   break;
                 case 0x5fb9ae66:
                   if (str.equals("displayUsers")) {
                      i = 69;
                   }
                   break;
                 case 0x5fe7f139:
                   if (str.equals("chatStyle")) {
                      i = 70;
                   }
                   break;
                 case 0x6026525d:
                   if (str.equals("feedBuildTime")) {
                      i = 71;
                   }
                   break;
                 case 0x604443e8:
                   if (str.equals("display_name")) {
                      i = 72;
                   }
                   break;
                 case 0x629082b2:
                   if (str.equals("coverDecorateInfo")) {
                      i = 73;
                   }
                   break;
                 case 0x662ea10f:
                   if (str.equals("displayText")) {
                      i = 74;
                   }
                   break;
                 case 0x69b6928c:
                   if (str.equals("enableLiveFeedRerank")) {
                      i = 75;
                   }
                   break;
                 case 0x6a3ec426:
                   if (str.equals("enableAutoPlay")) {
                      i = 76;
                   }
                   break;
                 case 0x6b6a8e8a:
                   if (str.equals("recruitCardV2")) {
                      i = 77;
                   }
                   break;
                 case 0x717cc4ed:
                   if (str.equals("plcFeatureEntryData")) {
                      i = 78;
                   }
                   break;
                 case 0x726f5b9b:
                   if (str.equals("user_count")) {
                      i = 79;
                   }
                   break;
                 case 0x72c21e6c:
                   if (str.equals("liveInnerSwitchInfo")) {
                      i = 80;
                   }
                   break;
                 case 0x7584af5d:
                   if (str.equals("privateType")) {
                      i = 81;
                   }
                   break;
                 case 0x78f7bd88:
                   if (str.equals("flowType")) {
                      i = 82;
                   }
                   break;
                 case 0x7ae35622:
                   if (str.equals("isInBet")) {
                      i = 83;
                   }
                   break;
                 case 0x7dc02ddb:
                   if (str.equals("autoPlayWeight")) {
                      i = 84;
                   }
                   break;
                 case 0x7fa2a43b:
                   if (str.equals("displayTotalStartPlayCount")) {
                      i = 85;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   liveStreamMo1.mAudienceCount = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   liveStreamMo1.mIsMusicStationAnimation = KnownTypeAdapters$g.a(p0, liveStreamMo1.mIsMusicStationAnimation);
                   break;
                 case 2:
                   liveStreamMo1.mShowFollowGuideInfo = KnownTypeAdapters$g.a(p0, liveStreamMo1.mShowFollowGuideInfo);
                   break;
                 case 3:
                   liveStreamMo1.mRedPackEndTime = KnownTypeAdapters$n.a(p0, liveStreamMo1.mRedPackEndTime);
                   break;
                 case 4:
                   liveStreamMo1.mIsBulletOff = KnownTypeAdapters$g.a(p0, liveStreamMo1.mIsBulletOff);
                   break;
                 case 5:
                   liveStreamMo1.mDisableComment = KnownTypeAdapters$g.a(p0, liveStreamMo1.mDisableComment);
                   break;
                 case 6:
                   liveStreamMo1.mCoverWidgets = this.j.read(p0);
                   break;
                 case 7:
                   liveStreamMo1.mPreviewLiveEndCountDownSeconds = KnownTypeAdapters$n.a(p0, liveStreamMo1.mPreviewLiveEndCountDownSeconds);
                   break;
                 case 8:
                   liveStreamMo1.isInCommentLottery = KnownTypeAdapters$g.a(p0, liveStreamMo1.isInCommentLottery);
                   break;
                 case 9:
                   liveStreamMo1.mIsGRPRCustomized = KnownTypeAdapters$g.a(p0, liveStreamMo1.mIsGRPRCustomized);
                   break;
                 case 10:
                   liveStreamMo1.mRecoRerankContext = TypeAdapters.A.read(p0);
                   break;
                 case 11:
                   liveStreamMo1.mDistrictRank = TypeAdapters.A.read(p0);
                   break;
                 case 12:
                   liveStreamMo1.mLiveCoverTagModel = this.u.read(p0);
                   break;
                 case 13:
                   liveStreamMo1.mLivePreviewModel = this.B.read(p0);
                   break;
                 case 14:
                   liveStreamMo1.mLiveCoverWidgetUpdateIntervalMills = KnownTypeAdapters$n.a(p0, liveStreamMo1.mLiveCoverWidgetUpdateIntervalMills);
                   break;
                 case 15:
                   liveStreamMo1.mLiveBizType = KnownTypeAdapters$k.a(p0, liveStreamMo1.mLiveBizType);
                   break;
                 case 16:
                   liveStreamMo1.mSpecialLive = this.x.read(p0);
                   break;
                 case 17:
                   liveStreamMo1.mIsMusicStationRedPack = KnownTypeAdapters$g.a(p0, liveStreamMo1.mIsMusicStationRedPack);
                   break;
                 case 18:
                   liveStreamMo1.mLiveCoverIconInfo = this.e.read(p0);
                   break;
                 case 19:
                   liveStreamMo1.mIsMusicStationPK = KnownTypeAdapters$g.a(p0, liveStreamMo1.mIsMusicStationPK);
                   break;
                 case 20:
                   liveStreamMo1.mEnableCoverAdaptive = KnownTypeAdapters$g.a(p0, liveStreamMo1.mEnableCoverAdaptive);
                   break;
                 case 21:
                   liveStreamMo1.mVerticalTypes = this.w.read(p0);
                   break;
                 case 22:
                   liveStreamMo1.mTvcType = KnownTypeAdapters$k.a(p0, liveStreamMo1.mTvcType);
                   break;
                 case 23:
                   liveStreamMo1.mDisplayDistrictRank = this.v.read(p0);
                   break;
                 case 24:
                   liveStreamMo1.mEnableNewPreviewBottomCard = KnownTypeAdapters$g.a(p0, liveStreamMo1.mEnableNewPreviewBottomCard);
                   break;
                 case 25:
                   liveStreamMo1.mBottomEntryInfo = this.n.read(p0);
                   break;
                 case 26:
                   liveStreamMo1.mLiveLogPassthroughParams = TypeAdapters.A.read(p0);
                   break;
                 case 27:
                   liveStreamMo1.mLiveStreamId = TypeAdapters.A.read(p0);
                   break;
                 case 28:
                   liveStreamMo1.mLivePaidShowId = TypeAdapters.A.read(p0);
                   break;
                 case 29:
                   liveStreamMo1.mHotValue = TypeAdapters.A.read(p0);
                   break;
                 case 30:
                   liveStreamMo1.mLiveEndAutoJumpType = KnownTypeAdapters$k.a(p0, liveStreamMo1.mLiveEndAutoJumpType);
                   break;
                 case 31:
                   liveStreamMo1.mLiveEndAutoJumpDelaySeconds = KnownTypeAdapters$k.a(p0, liveStreamMo1.mLiveEndAutoJumpDelaySeconds);
                   break;
                 case 32:
                   liveStreamMo1.mMusicStationLiveDescription = TypeAdapters.A.read(p0);
                   break;
                 case '!':
                   liveStreamMo1.mLikeCount = TypeAdapters.A.read(p0);
                   break;
                 case '"':
                   liveStreamMo1.mLiveSimpleSkinConfig = this.r.read(p0);
                   break;
                 case '#':
                   liveStreamMo1.mCnyLowDeviceLiveCoverUrls = new KnownTypeAdapters$ArrayTypeAdapter(this.E, new LiveStreamModel$TypeAdapter$b(this)).a(p0);
                   break;
                 case '$':
                   liveStreamMo1.mWatchingCount = TypeAdapters.A.read(p0);
                   break;
                 case '%':
                   liveStreamMo1.mRecruitCardInfoModel = this.k.read(p0);
                   break;
                 case '&':
                   liveStreamMo1.mSimpleLiveAutoStartPlayDelayMs = KnownTypeAdapters$k.a(p0, liveStreamMo1.mSimpleLiveAutoStartPlayDelayMs);
                   break;
                 case 39:
                   liveStreamMo1.mPlcEntryAdFlag = KnownTypeAdapters$k.a(p0, liveStreamMo1.mPlcEntryAdFlag);
                   break;
                 case '(':
                   liveStreamMo1.mPreviewCaptionRichTexts = this.D.read(p0);
                   break;
                 case ')':
                   liveStreamMo1.mEnableAutoPlayVoice = KnownTypeAdapters$g.a(p0, liveStreamMo1.mEnableAutoPlayVoice);
                   break;
                 case '*':
                   liveStreamMo1.mAdminAuthorDutyType = KnownTypeAdapters$k.a(p0, liveStreamMo1.mAdminAuthorDutyType);
                   break;
                 case '+':
                   liveStreamMo1.mSimpleAuthorMarks = this.d.read(p0);
                   break;
                 case ',':
                   liveStreamMo1.mCoverReasonTag = this.l.read(p0);
                   break;
                 case '-':
                   liveStreamMo1.mLiveAudienceCustomSkinConfig = this.s.read(p0);
                   break;
                 case '.':
                   liveStreamMo1.mDisplayAudienceCount = TypeAdapters.A.read(p0);
                   break;
                 case '/':
                   liveStreamMo1.mCaption = TypeAdapters.A.read(p0);
                   break;
                 case '0':
                   liveStreamMo1.mVoicePartySubType = KnownTypeAdapters$k.a(p0, liveStreamMo1.mVoicePartySubType);
                   break;
                 case '1':
                   liveStreamMo1.mRealTimeCoverUrl = TypeAdapters.A.read(p0);
                   break;
                 case '2':
                   liveStreamMo1.mPlcEntryStyleInfo = this.o.read(p0);
                   break;
                 case '3':
                   liveStreamMo1.mIsFromGroupChat = KnownTypeAdapters$g.a(p0, liveStreamMo1.mIsFromGroupChat);
                   break;
                 case '4':
                   liveStreamMo1.mLiveCoverAnnex = this.f.read(p0);
                   break;
                 case '5':
                   liveStreamMo1.mLiveLiteActivityFlag = KnownTypeAdapters$k.a(p0, liveStreamMo1.mLiveLiteActivityFlag);
                   break;
                 case '6':
                   liveStreamMo1.mLiveSquareLayoutModel = this.p.read(p0);
                   break;
                 case '7':
                   liveStreamMo1.mLiveModel = KnownTypeAdapters$k.a(p0, liveStreamMo1.mLiveModel);
                   break;
                 case '8':
                   liveStreamMo1.mShowAccompanyIcon = KnownTypeAdapters$g.a(p0, liveStreamMo1.mShowAccompanyIcon);
                   break;
                 case '9':
                   liveStreamMo1.mRedPack = KnownTypeAdapters$g.a(p0, liveStreamMo1.mRedPack);
                   break;
                 case ':':
                   liveStreamMo1.mNeedToRefreshCoverWidget = KnownTypeAdapters$g.a(p0, liveStreamMo1.mNeedToRefreshCoverWidget);
                   break;
                 case ';':
                   liveStreamMo1.mMusicStationDescriptionType = KnownTypeAdapters$k.a(p0, liveStreamMo1.mMusicStationDescriptionType);
                   break;
                 case '<':
                   liveStreamMo1.mLiveSquareShouldShowHorseRaceTitle = KnownTypeAdapters$g.a(p0, liveStreamMo1.mLiveSquareShouldShowHorseRaceTitle);
                   break;
                 case '=':
                   liveStreamMo1.mDisableLivePreview = KnownTypeAdapters$g.a(p0, liveStreamMo1.mDisableLivePreview);
                   break;
                 case '>':
                   liveStreamMo1.mDisplayLikeCount = TypeAdapters.A.read(p0);
                   break;
                 case '?':
                   liveStreamMo1.mLiveAudienceSkinActivityConfig = this.q.read(p0);
                   break;
                 case '@':
                   liveStreamMo1.mLivePlusNearByInfo = this.z.read(p0);
                   break;
                 case 'A':
                   liveStreamMo1.mIsMusicFeed = KnownTypeAdapters$g.a(p0, liveStreamMo1.mIsMusicFeed);
                   break;
                 case 'B':
                   liveStreamMo1.mFunctionShieldSwitchInfo = this.c.read(p0);
                   break;
                 case 'C':
                   liveStreamMo1.mLivePrivateInfo = this.t.read(p0);
                   break;
                 case 'D':
                   liveStreamMo1.mDisplayStyle = KnownTypeAdapters$k.a(p0, liveStreamMo1.mDisplayStyle);
                   break;
                 case 'E':
                   liveStreamMo1.mDisplayUsers = this.h.read(p0);
                   break;
                 case 'F':
                   liveStreamMo1.mChatStyle = KnownTypeAdapters$g.a(p0, liveStreamMo1.mChatStyle);
                   break;
                 case 'G':
                   liveStreamMo1.mFeedDispatchTimestampMs = KnownTypeAdapters$n.a(p0, liveStreamMo1.mFeedDispatchTimestampMs);
                   break;
                 case 'H':
                   liveStreamMo1.mChainDisplayName = TypeAdapters.A.read(p0);
                   break;
                 case 'I':
                   liveStreamMo1.mLiveCoverRightTopDecorateInfo = this.m.read(p0);
                   break;
                 case 'J':
                   liveStreamMo1.mDisplayText = TypeAdapters.A.read(p0);
                   break;
                 case 'K':
                   liveStreamMo1.mEnableLiveFeedRerank = KnownTypeAdapters$g.a(p0, liveStreamMo1.mEnableLiveFeedRerank);
                   break;
                 case 'L':
                   liveStreamMo1.mEnableAutoPlay = KnownTypeAdapters$g.a(p0, liveStreamMo1.mEnableAutoPlay);
                   break;
                 case 'M':
                   liveStreamMo1.mRecruitCardInfoV2 = this.A.read(p0);
                   break;
                 case 'N':
                   liveStreamMo1.mPlcEntryStyleData = TypeAdapters.A.read(p0);
                   break;
                 case 'O':
                   liveStreamMo1.mUserCountConfig = this.y.read(p0);
                   break;
                 case 'P':
                   liveStreamMo1.mFeedBackSwitchInfo = this.b.read(p0);
                   break;
                 case 'Q':
                   liveStreamMo1.mLivePrivateType = KnownTypeAdapters$k.a(p0, liveStreamMo1.mLivePrivateType);
                   break;
                 case 'R':
                   liveStreamMo1.mLiveTrafficType = KnownTypeAdapters$k.a(p0, liveStreamMo1.mLiveTrafficType);
                   break;
                 case 'S':
                   liveStreamMo1.mHasBet = KnownTypeAdapters$g.a(p0, liveStreamMo1.mHasBet);
                   break;
                 case 'T':
                   liveStreamMo1.mAutoPlayWeight = KnownTypeAdapters$j.a(p0, liveStreamMo1.mAutoPlayWeight);
                   break;
                 case 'U':
                   liveStreamMo1.mDisplayTotalStartPlayCount = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return liveStreamMo1;
       }
    }
    public void b(b p0,LiveStreamModel p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveStreamModel$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("tvcType");
          p0.K((long)p1.mTvcType);
          if (p1.mLiveStreamId != null) {
             p0.r("liveStreamId");
             TypeAdapters.A.write(p0, p1.mLiveStreamId);
          }
          if (p1.mCaption != null) {
             p0.r("caption");
             TypeAdapters.A.write(p0, p1.mCaption);
          }
          if (p1.mHotValue != null) {
             p0.r("hotValue");
             TypeAdapters.A.write(p0, p1.mHotValue);
          }
          p0.r("refresh");
          p0.P(p1.mNeedToRefreshCoverWidget);
          if (p1.mAudienceCount != null) {
             p0.r("audienceCount");
             TypeAdapters.A.write(p0, p1.mAudienceCount);
          }
          if (p1.mDisplayTotalStartPlayCount != null) {
             p0.r("displayTotalStartPlayCount");
             TypeAdapters.A.write(p0, p1.mDisplayTotalStartPlayCount);
          }
          p0.r("intervalMills");
          p0.K(p1.mLiveCoverWidgetUpdateIntervalMills);
          if (p1.mFeedBackSwitchInfo != null) {
             p0.r("liveInnerSwitchInfo");
             this.b.write(p0, p1.mFeedBackSwitchInfo);
          }
          if (p1.mFunctionShieldSwitchInfo != null) {
             p0.r("functionShieldSwitchInfo");
             this.c.write(p0, p1.mFunctionShieldSwitchInfo);
          }
          if (p1.mSimpleAuthorMarks != null) {
             p0.r("simpleAuthorMarks");
             this.d.write(p0, p1.mSimpleAuthorMarks);
          }
          if (p1.mLiveCoverIconInfo != null) {
             p0.r("liveCoverIconInfo");
             this.e.write(p0, p1.mLiveCoverIconInfo);
          }
          if (p1.mLiveCoverAnnex != null) {
             p0.r("liveCoverAnnex");
             this.f.write(p0, p1.mLiveCoverAnnex);
          }
          if (p1.mDisplayAudienceCount != null) {
             p0.r("displayAudienceCount");
             TypeAdapters.A.write(p0, p1.mDisplayAudienceCount);
          }
          if (p1.mDisplayLikeCount != null) {
             p0.r("displayLikeCount");
             TypeAdapters.A.write(p0, p1.mDisplayLikeCount);
          }
          p0.r("isMusicFeed");
          p0.P(p1.mIsMusicFeed);
          if (p1.mDistrictRank != null) {
             p0.r("districtRank");
             TypeAdapters.A.write(p0, p1.mDistrictRank);
          }
          p0.r("chatStyle");
          p0.P(p1.mChatStyle);
          if (p1.mDisplayUsers != null) {
             p0.r("displayUsers");
             this.h.write(p0, p1.mDisplayUsers);
          }
          if (p1.mDisplayText != null) {
             p0.r("displayText");
             TypeAdapters.A.write(p0, p1.mDisplayText);
          }
          p0.r("displayStyle");
          p0.K((long)p1.mDisplayStyle);
          p0.r("redPack");
          p0.P(p1.mRedPack);
          p0.r("isInBet");
          p0.P(p1.mHasBet);
          p0.r("showAccompanyIcon");
          p0.P(p1.mShowAccompanyIcon);
          p0.r("isInCommentLottery");
          p0.P(p1.isInCommentLottery);
          p0.r("liveBizType");
          p0.K((long)p1.mLiveBizType);
          if (p1.mCoverWidgets != null) {
             p0.r("coverWidgets");
             this.j.write(p0, p1.mCoverWidgets);
          }
          if (p1.mRecruitCardInfoModel != null) {
             p0.r("cardInfo");
             this.k.write(p0, p1.mRecruitCardInfoModel);
          }
          if (p1.mCoverReasonTag != null) {
             p0.r("simpleLiveCoverReasonTag");
             this.l.write(p0, p1.mCoverReasonTag);
          }
          if (p1.mLiveCoverRightTopDecorateInfo != null) {
             p0.r("coverDecorateInfo");
             this.m.write(p0, p1.mLiveCoverRightTopDecorateInfo);
          }
          if (p1.mRealTimeCoverUrl != null) {
             p0.r("realTimeCoverUrl");
             TypeAdapters.A.write(p0, p1.mRealTimeCoverUrl);
          }
          if (p1.mWatchingCount != null) {
             p0.r("watchingCount");
             TypeAdapters.A.write(p0, p1.mWatchingCount);
          }
          if (p1.mLikeCount != null) {
             p0.r("likeCount");
             TypeAdapters.A.write(p0, p1.mLikeCount);
          }
          if (p1.mChainDisplayName != null) {
             p0.r("display_name");
             TypeAdapters.A.write(p0, p1.mChainDisplayName);
          }
          p0.r("enableAutoPlay");
          p0.P(p1.mEnableAutoPlay);
          p0.r("autoPlayWeight");
          p0.J((double)p1.mAutoPlayWeight);
          p0.r("enableAutoPlayVoice");
          p0.P(p1.mEnableAutoPlayVoice);
          p0.r("disablePreview");
          p0.P(p1.mDisableLivePreview);
          p0.r("customized");
          p0.P(p1.mIsGRPRCustomized);
          if (p1.mBottomEntryInfo != null) {
             p0.r("bottomEntryInfo");
             this.n.write(p0, p1.mBottomEntryInfo);
          }
          if (p1.mLiveLogPassthroughParams != null) {
             p0.r("lv_params");
             TypeAdapters.A.write(p0, p1.mLiveLogPassthroughParams);
          }
          p0.r("isBulletOff");
          p0.P(p1.mIsBulletOff);
          if (p1.mPlcEntryStyleData != null) {
             p0.r("plcFeatureEntryData");
             TypeAdapters.A.write(p0, p1.mPlcEntryStyleData);
          }
          p0.r("plcFeatureEntryAbFlag");
          p0.K((long)p1.mPlcEntryAdFlag);
          if (p1.mPlcEntryStyleInfo != null) {
             p0.r("plcFeatureEntry");
             this.o.write(p0, p1.mPlcEntryStyleInfo);
          }
          p0.r("redPackEndTime");
          p0.K(p1.mRedPackEndTime);
          if (p1.mLiveSquareLayoutModel != null) {
             p0.r("liveSquare");
             this.p.write(p0, p1.mLiveSquareLayoutModel);
          }
          if (p1.mLiveAudienceSkinActivityConfig != null) {
             p0.r("activityConfig");
             this.q.write(p0, p1.mLiveAudienceSkinActivityConfig);
          }
          if (p1.mLiveSimpleSkinConfig != null) {
             p0.r("simpleLiveCoverSkin");
             this.r.write(p0, p1.mLiveSimpleSkinConfig);
          }
          if (p1.mLiveAudienceCustomSkinConfig != null) {
             p0.r("liveConfig");
             this.s.write(p0, p1.mLiveAudienceCustomSkinConfig);
          }
          p0.r("adminAuthorDutyType");
          p0.K((long)p1.mAdminAuthorDutyType);
          p0.r("isMsPk");
          p0.P(p1.mIsMusicStationPK);
          p0.r("isMsRedPack");
          p0.P(p1.mIsMusicStationRedPack);
          p0.r("isMsAnimation");
          p0.P(p1.mIsMusicStationAnimation);
          if (p1.mMusicStationLiveDescription != null) {
             p0.r("msLiveDescription");
             TypeAdapters.A.write(p0, p1.mMusicStationLiveDescription);
          }
          p0.r("msLiveDescriptionType");
          p0.K((long)p1.mMusicStationDescriptionType);
          p0.r("showHorseRaceTitle");
          p0.P(p1.mLiveSquareShouldShowHorseRaceTitle);
          p0.r("enterSimpleLiveDelayMs");
          p0.K((long)p1.mSimpleLiveAutoStartPlayDelayMs);
          p0.r("liveModel");
          p0.K((long)p1.mLiveModel);
          p0.r("privateType");
          p0.K((long)p1.mLivePrivateType);
          p0.r("fromGroupChat");
          p0.P(p1.mIsFromGroupChat);
          if (p1.mLivePrivateInfo != null) {
             p0.r("livePrivateInfo");
             this.t.write(p0, p1.mLivePrivateInfo);
          }
          if (p1.mLivePaidShowId != null) {
             p0.r("paidShowId");
             TypeAdapters.A.write(p0, p1.mLivePaidShowId);
          }
          if (p1.mLiveCoverTagModel != null) {
             p0.r("tagInfo");
             this.u.write(p0, p1.mLiveCoverTagModel);
          }
          if (p1.mDisplayDistrictRank != null) {
             p0.r("displayDistrictRank");
             this.v.write(p0, p1.mDisplayDistrictRank);
          }
          if (p1.mVerticalTypes != null) {
             p0.r("verticalTypes");
             this.w.write(p0, p1.mVerticalTypes);
          }
          p0.r("voicePartySubType");
          p0.K((long)p1.mVoicePartySubType);
          p0.r("showFollowGuideInfo");
          p0.P(p1.mShowFollowGuideInfo);
          if (p1.mSpecialLive != null) {
             p0.r("special_live");
             this.x.write(p0, p1.mSpecialLive);
          }
          if (p1.mUserCountConfig != null) {
             p0.r("user_count");
             this.y.write(p0, p1.mUserCountConfig);
          }
          if (p1.mLivePlusNearByInfo != null) {
             p0.r("livePlusNearByInfo");
             this.z.write(p0, p1.mLivePlusNearByInfo);
          }
          if (p1.mRecruitCardInfoV2 != null) {
             p0.r("recruitCardV2");
             this.A.write(p0, p1.mRecruitCardInfoV2);
          }
          p0.r("disableComment");
          p0.P(p1.mDisableComment);
          p0.r("newSimpleLiveCard");
          p0.P(p1.mEnableNewPreviewBottomCard);
          p0.r("enableLiveFeedRerank");
          p0.P(p1.mEnableLiveFeedRerank);
          if (p1.mRecoRerankContext != null) {
             p0.r("recoRerankContext");
             TypeAdapters.A.write(p0, p1.mRecoRerankContext);
          }
          p0.r("feedBuildTime");
          p0.K(p1.mFeedDispatchTimestampMs);
          p0.r("liveEndAutoJumpType");
          p0.K((long)p1.mLiveEndAutoJumpType);
          p0.r("liveEndAutoJumpWaitSec");
          p0.K((long)p1.mLiveEndAutoJumpDelaySeconds);
          p0.r("flowType");
          p0.K((long)p1.mLiveTrafficType);
          if (p1.mLivePreviewModel != null) {
             p0.r("simpleLive");
             this.B.write(p0, p1.mLivePreviewModel);
          }
          p0.r("simpleLiveEndCountDownSeconds");
          p0.K(p1.mPreviewLiveEndCountDownSeconds);
          if (p1.mPreviewCaptionRichTexts != null) {
             p0.r("simpleLiveCaptionRichTexts");
             this.D.write(p0, p1.mPreviewCaptionRichTexts);
          }
          if (p1.mCnyLowDeviceLiveCoverUrls != null) {
             p0.r("lowSystemVersionLiveCoverUrls");
             new KnownTypeAdapters$ArrayTypeAdapter(this.E, new LiveStreamModel$TypeAdapter$a(this)).b(p0, p1.mCnyLowDeviceLiveCoverUrls);
          }
          p0.r("fillCover");
          p0.P(p1.mEnableCoverAdaptive);
          p0.r("liveLiteActivityFlag");
          p0.K((long)p1.mLiveLiteActivityFlag);
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
