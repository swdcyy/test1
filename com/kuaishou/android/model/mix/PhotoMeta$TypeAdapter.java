package com.kuaishou.android.model.mix.PhotoMeta$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.PhotoMeta;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.mix.QComment;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.live.LiveTipInfo;
import com.kuaishou.android.model.music.Music;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import com.kwai.components.feedmodel.feed.KaraokeChorusModel;
import com.kwai.components.feedmodel.feed.KaraokeModel;
import com.kuaishou.android.model.mix.VideoQualityInfo;
import com.kwai.framework.preference.startup.ActionSurveySubtypeActions;
import com.kuaishou.android.model.mix.LabelFeatureEntry;
import com.kwai.framework.model.user.QUserContactName;
import com.yxcorp.gifshow.model.EditInfo;
import com.kuaishou.android.model.mix.BottomComponentMaterial;
import com.kuaishou.android.model.fanstop.FansTopCommentTopBarInfo;
import com.kuaishou.android.model.mix.PostShowInfo;
import com.kuaishou.android.model.music.MusicStrategy;
import java.util.HashSet;
import java.lang.reflect.Type;
import com.kuaishou.android.model.entity.PlayerPanelFeatureType;
import com.kuaishou.android.model.music.MusicWheelInfo;
import com.kuaishou.android.model.mix.CoCreateInfo;
import com.kuaishou.android.model.mix.CoCreateInvitationInfo;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.kuaishou.android.model.feed.VisibilityExpiration$TypeAdapter;
import com.kuaishou.android.model.mix.TagItem$TypeAdapter;
import com.kuaishou.android.model.mix.AtUserItem$TypeAdapter;
import com.kuaishou.android.model.mix.QuestionnaireInfo$TypeAdapter;
import com.kuaishou.android.model.mix.FashionShowInfo$TypeAdapter;
import com.kuaishou.android.model.mix.PhotoRelationEntrance$TypeAdapter;
import com.kuaishou.android.model.mix.VisibleLevelInfo$TypeAdapter;
import com.kuaishou.android.model.mix.SameFrameInfo$TypeAdapter;
import com.kuaishou.android.model.mix.FollowShootModel$TypeAdapter;
import com.kuaishou.android.model.mix.LipsSyncModel$TypeAdapter;
import com.kuaishou.android.model.mix.InteractStickerInfo$TypeAdapter;
import com.kuaishou.android.model.mix.ExtEntryModel$TypeAdapter;
import com.kuaishou.android.model.mix.ShareToFollowModel$TypeAdapter;
import com.kuaishou.android.model.mix.SummaryViewModel$TypeAdapter;
import com.kuaishou.android.model.mix.PhotoTextLocationInfo$TypeAdapter;
import com.kuaishou.android.model.mix.PhotoDisplayLocationInfo$TypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$MapTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$e;
import com.kuaishou.android.model.mix.PhotoMetaExtra$TypeAdapter;
import com.kwai.components.feedmodel.OperationBarInfo$TypeAdapter;
import com.kwai.components.feedmodel.HotSpotInfo$TypeAdapter;
import com.kwai.components.feedmodel.BottomEntryInfo$TypeAdapter;
import com.kwai.components.feedmodel.SummaryInfo$TypeAdapter;
import com.kwai.components.feedmodel.ProgressHighLightInfo$TypeAdapter;
import com.kwai.components.feedmodel.SearchAiScriptInfo$TypeAdapter;
import com.kwai.components.feedmodel.PhotoJudgementStatusInfo$TypeAdapter;
import com.kwai.components.feedmodel.KwaiCoinTaskInfo$TypeAdapter;
import com.kuaishou.android.model.mix.ActivityUserIconModel$TypeAdapter;
import com.kwai.components.feedmodel.RewardPhotoInfo$TypeAdapter;
import com.kwai.components.feedmodel.feed.KaraokeScoreInfo$TypeAdapter;
import com.kuaishou.android.model.mix.PostOperationEntranceInfo$TypeAdapter;
import com.kuaishou.android.model.mix.OperationExpTagDisplayInfo$TypeAdapter;
import com.kuaishou.android.model.mix.KYInfo$TypeAdapter;
import com.kuaishou.android.model.mix.RecreationSettingInfo$TypeAdapter;
import com.kuaishou.android.model.mix.HyperTag$TypeAdapter;
import com.kuaishou.android.model.mix.CollectPopup$TypeAdapter;
import com.kuaishou.android.model.mix.AnalysisEntranceModel$TypeAdapter;
import com.kuaishou.android.model.mix.FeedSwitchesInfo$TypeAdapter;
import com.kuaishou.android.model.mix.PhotoLiveRemindInfo$TypeAdapter;
import com.kuaishou.android.model.mix.PhotoCommentVoteInfo$TypeAdapter;
import com.kuaishou.android.model.mix.CollectGuideInfo$TypeAdapter;
import com.kuaishou.android.model.mix.CollectFeedInfo$TypeAdapter;
import com.kuaishou.android.model.mix.CollectRevisitGuidance$TypeAdapter;
import com.kuaishou.android.model.mix.PhotoKgTag$TypeAdapter;
import com.kuaishou.android.model.mix.PhotoCommonTags$TypeAdapter;
import com.kuaishou.android.model.mix.InterestManageSnackBarInfo$TypeAdapter;
import com.kuaishou.android.model.mix.MMUSimilarSearchInfo$TypeAdapter;
import com.kuaishou.android.model.mix.InterestAdjustSnackBarInfo$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.kuaishou.android.model.mix.ShareToFollowModel;
import com.kuaishou.android.model.mix.PostOperationEntranceInfo;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.kuaishou.android.model.mix.InteractStickerInfo;
import com.kuaishou.android.model.mix.SummaryViewModel;
import java.util.List;
import com.kuaishou.android.model.mix.CollectGuideInfo;
import com.kuaishou.android.model.mix.CollectPopup;
import com.kuaishou.android.model.mix.FollowShootModel;
import com.kwai.components.feedmodel.SummaryInfo;
import com.kuaishou.android.model.mix.PhotoDisplayLocationInfo;
import com.kuaishou.android.model.mix.PhotoTextLocationInfo;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.kwai.components.feedmodel.RewardPhotoInfo;
import com.kuaishou.android.model.mix.LipsSyncModel;
import com.kuaishou.android.model.mix.QuestionnaireInfo;
import com.kwai.components.feedmodel.feed.KaraokeScoreInfo;
import com.kwai.components.feedmodel.HotSpotInfo;
import com.vimeo.stag.KnownTypeAdapters$ArrayTypeAdapter;
import com.kuaishou.android.model.mix.PhotoMeta$TypeAdapter$c;
import com.vimeo.stag.KnownTypeAdapters$f;
import com.kwai.components.feedmodel.ProgressHighLightInfo;
import com.kuaishou.android.model.mix.SameFrameInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import com.kwai.components.feedmodel.SearchAiScriptInfo;
import java.util.Map;
import com.kuaishou.android.model.mix.FashionShowInfo;
import com.kuaishou.android.model.mix.PhotoMeta$TypeAdapter$d;
import com.kuaishou.android.model.mix.FeedSwitchesInfo;
import com.kuaishou.android.model.mix.MMUSimilarSearchInfo;
import com.kuaishou.android.model.mix.AnalysisEntranceModel;
import com.kuaishou.android.model.mix.TagItem;
import com.kuaishou.android.model.mix.PhotoCommentVoteInfo;
import com.kwai.components.feedmodel.PhotoJudgementStatusInfo;
import com.kuaishou.android.model.mix.InterestManageSnackBarInfo;
import com.kwai.components.feedmodel.KwaiCoinTaskInfo;
import com.kuaishou.android.model.mix.PhotoMetaExtra;
import com.kuaishou.android.model.mix.HyperTag;
import com.kuaishou.android.model.feed.VisibilityExpiration;
import com.kuaishou.android.model.mix.VisibleLevelInfo;
import com.kuaishou.android.model.mix.PhotoRelationEntrance;
import com.kwai.components.feedmodel.OperationBarInfo;
import com.kuaishou.android.model.mix.CollectRevisitGuidance;
import com.kuaishou.android.model.mix.PhotoLiveRemindInfo;
import com.kwai.components.feedmodel.BottomEntryInfo;
import com.kuaishou.android.model.mix.InterestAdjustSnackBarInfo;
import com.kuaishou.android.model.mix.RecreationSettingInfo;
import com.kuaishou.android.model.mix.CollectFeedInfo;
import com.kuaishou.android.model.mix.KYInfo;
import com.kuaishou.android.model.mix.ActivityUserIconModel;
import com.kuaishou.android.model.mix.OperationExpTagDisplayInfo;
import com.kuaishou.android.model.mix.ExtEntryModel;
import com.kuaishou.android.model.mix.PhotoCommonTags;
import com.google.gson.stream.b;
import com.kuaishou.android.model.mix.PhotoMeta$TypeAdapter$a;
import com.kuaishou.android.model.mix.PhotoMeta$TypeAdapter$b;

public final class PhotoMeta$TypeAdapter extends TypeAdapter	// class@000d5a
{
    public final TypeAdapter A;
    public final TypeAdapter B;
    public final TypeAdapter C;
    public final TypeAdapter D;
    public final TypeAdapter E;
    public final TypeAdapter F;
    public final TypeAdapter G;
    public final TypeAdapter H;
    public final TypeAdapter I;
    public final TypeAdapter J;
    public final TypeAdapter K;
    public final TypeAdapter L;
    public final TypeAdapter M;
    public final TypeAdapter N;
    public final TypeAdapter O;
    public final TypeAdapter P;
    public final TypeAdapter Q;
    public final TypeAdapter R;
    public final TypeAdapter S;
    public final TypeAdapter T;
    public final TypeAdapter U;
    public final TypeAdapter V;
    public final TypeAdapter W;
    public final TypeAdapter X;
    public final TypeAdapter Y;
    public final TypeAdapter Z;
    public final Gson a;
    public final TypeAdapter a0;
    public final TypeAdapter b;
    public final TypeAdapter b0;
    public final TypeAdapter c;
    public final TypeAdapter c0;
    public final TypeAdapter d;
    public final TypeAdapter d0;
    public final TypeAdapter e;
    public final TypeAdapter e0;
    public final TypeAdapter f;
    public final TypeAdapter f0;
    public final TypeAdapter g;
    public final TypeAdapter g0;
    public final TypeAdapter h;
    public final TypeAdapter h0;
    public final TypeAdapter i;
    public final TypeAdapter i0;
    public final TypeAdapter j;
    public final TypeAdapter j0;
    public final TypeAdapter k;
    public final TypeAdapter k0;
    public final TypeAdapter l;
    public final TypeAdapter l0;
    public final TypeAdapter m;
    public final TypeAdapter m0;
    public final TypeAdapter n;
    public final TypeAdapter n0;
    public final TypeAdapter o;
    public final TypeAdapter o0;
    public final TypeAdapter p;
    public final TypeAdapter p0;
    public final TypeAdapter q;
    public final TypeAdapter q0;
    public final TypeAdapter r;
    public final TypeAdapter r0;
    public final TypeAdapter s;
    public final TypeAdapter s0;
    public final TypeAdapter t;
    public final TypeAdapter t0;
    public final TypeAdapter u;
    public final TypeAdapter u0;
    public final TypeAdapter v;
    public final TypeAdapter v0;
    public final TypeAdapter w;
    public final TypeAdapter w0;
    public final TypeAdapter x;
    public final TypeAdapter x0;
    public final TypeAdapter y;
    public final TypeAdapter y0;
    public final TypeAdapter z;
    public static final a z0;

    static {
       PhotoMeta$TypeAdapter.z0 = a.get(PhotoMeta.class);
    }
    public void PhotoMeta$TypeAdapter(Gson p0){
       int i = this;
       Gson gson = p0;
       super();
       i.a = gson;
       Type[] typeArray = new Type[]{PlayerPanelFeatureType.class};
       TypeAdapter typeAdapter = gson.j(a.get(QComment.class));
       i.b = typeAdapter;
       i.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       typeAdapter = gson.j(a.get(User.class));
       i.d = typeAdapter;
       i.e = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       i.f = gson.j(a.get(LiveTipInfo.class));
       i.g = gson.j(VisibilityExpiration$TypeAdapter.b);
       i.h = gson.j(a.get(Music.class));
       typeAdapter = gson.j(a.get(SimpleMagicFace.class));
       i.i = typeAdapter;
       TypeAdapter typeAdapter1 = gson.j(TagItem$TypeAdapter.j);
       i.j = typeAdapter1;
       i.k = new KnownTypeAdapters$ListTypeAdapter(typeAdapter1, new KnownTypeAdapters$d());
       typeAdapter1 = gson.j(AtUserItem$TypeAdapter.b);
       i.l = typeAdapter1;
       i.m = new KnownTypeAdapters$ListTypeAdapter(typeAdapter1, new KnownTypeAdapters$d());
       i.n = gson.j(QuestionnaireInfo$TypeAdapter.b);
       i.o = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       i.p = gson.j(FashionShowInfo$TypeAdapter.b);
       i.q = gson.j(PhotoRelationEntrance$TypeAdapter.d);
       i.r = gson.j(VisibleLevelInfo$TypeAdapter.b);
       i.s = gson.j(SameFrameInfo$TypeAdapter.e);
       i.t = gson.j(FollowShootModel$TypeAdapter.d);
       i.u = gson.j(LipsSyncModel$TypeAdapter.b);
       i.v = gson.j(a.get(KaraokeChorusModel.class));
       i.w = gson.j(InteractStickerInfo$TypeAdapter.b);
       i.x = gson.j(ExtEntryModel$TypeAdapter.b);
       i.y = gson.j(a.get(KaraokeModel.class));
       i.z = gson.j(ShareToFollowModel$TypeAdapter.d);
       i.A = gson.j(SummaryViewModel$TypeAdapter.e);
       i.B = gson.j(PhotoTextLocationInfo$TypeAdapter.b);
       i.C = gson.j(PhotoDisplayLocationInfo$TypeAdapter.b);
       i.D = gson.j(a.get(VideoQualityInfo.class));
       typeAdapter1 = TypeAdapters.A;
       i.E = new KnownTypeAdapters$ListTypeAdapter(typeAdapter1, new KnownTypeAdapters$d());
       i.F = gson.j(a.get(ActionSurveySubtypeActions.class));
       i.G = gson.j(PlcEntryStyleInfo$TypeAdapter.f);
       i.H = gson.j(a.get(LabelFeatureEntry.class));
       typeAdapter = gson.j(a.get(QUserContactName.class));
       i.I = typeAdapter;
       i.J = new KnownTypeAdapters$MapTypeAdapter(typeAdapter1, typeAdapter, new KnownTypeAdapters$e());
       i.K = gson.j(PhotoMetaExtra$TypeAdapter.b);
       i.L = gson.j(a.get(EditInfo.class));
       i.M = gson.j(OperationBarInfo$TypeAdapter.h);
       i.N = gson.j(HotSpotInfo$TypeAdapter.b);
       i.O = gson.j(BottomEntryInfo$TypeAdapter.c);
       i.P = gson.j(SummaryInfo$TypeAdapter.c);
       i.Q = gson.j(ProgressHighLightInfo$TypeAdapter.b);
       i.R = gson.j(SearchAiScriptInfo$TypeAdapter.d);
       i.S = gson.j(PhotoJudgementStatusInfo$TypeAdapter.b);
       i.T = gson.j(KwaiCoinTaskInfo$TypeAdapter.b);
       i.U = gson.j(ActivityUserIconModel$TypeAdapter.b);
       i.V = gson.j(RewardPhotoInfo$TypeAdapter.e);
       i.W = gson.j(KaraokeScoreInfo$TypeAdapter.c);
       i.X = gson.j(PostOperationEntranceInfo$TypeAdapter.b);
       i.Y = gson.j(OperationExpTagDisplayInfo$TypeAdapter.b);
       i.Z = gson.j(KYInfo$TypeAdapter.b);
       i.a0 = gson.j(RecreationSettingInfo$TypeAdapter.d);
       i.b0 = gson.j(HyperTag$TypeAdapter.g);
       i.c0 = gson.j(a.get(BottomComponentMaterial.class));
       i.d0 = gson.j(CollectPopup$TypeAdapter.c);
       i.e0 = new KnownTypeAdapters$MapTypeAdapter(typeAdapter1, typeAdapter1, new KnownTypeAdapters$e());
       i.f0 = gson.j(AnalysisEntranceModel$TypeAdapter.b);
       i.g0 = gson.j(FeedSwitchesInfo$TypeAdapter.b);
       i.h0 = gson.j(a.get(FansTopCommentTopBarInfo.class));
       i.i0 = gson.j(a.get(PostShowInfo.class));
       i.j0 = gson.j(a.get(MusicStrategy.class));
       i.k0 = gson.j(PhotoLiveRemindInfo$TypeAdapter.b);
       i.l0 = gson.j(PhotoCommentVoteInfo$TypeAdapter.e);
       i.m0 = gson.j(CollectGuideInfo$TypeAdapter.b);
       i.n0 = gson.j(CollectFeedInfo$TypeAdapter.b);
       i.o0 = gson.j(CollectRevisitGuidance$TypeAdapter.b);
       i.p0 = gson.j(a.getParameterized(HashSet.class, typeArray));
       i.q0 = gson.j(a.get(MusicWheelInfo.class));
       typeAdapter = gson.j(PhotoKgTag$TypeAdapter.b);
       i.r0 = typeAdapter;
       i.s0 = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       i.t0 = gson.j(PhotoCommonTags$TypeAdapter.c);
       i.u0 = gson.j(InterestManageSnackBarInfo$TypeAdapter.c);
       i.v0 = gson.j(a.get(CoCreateInfo.class));
       i.w0 = gson.j(a.get(CoCreateInvitationInfo.class));
       i.x0 = gson.j(MMUSimilarSearchInfo$TypeAdapter.c);
       i.y0 = gson.j(InterestAdjustSnackBarInfo$TypeAdapter.d);
    }
    public PhotoMeta a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoMeta$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoMeta photoMeta = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return photoMeta;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return photoMeta;
       }else {
          p0.c();
          PhotoMeta photoMeta1 = new PhotoMeta();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x813d0b1b:
                   if (str.equals("mFollowShootType")) {
                      i = 0;
                   }
                   break;
                 case 0x866b9ff9:
                   if (str.equals("plcHighPriorityThanBottomEntry")) {
                      i = 1;
                   }
                   break;
                 case 0x86939633:
                   if (str.equals("surveyBizType")) {
                      i = 2;
                   }
                   break;
                 case 0x874e8d01:
                   if (str.equals("photoSkipCrop")) {
                      i = 3;
                   }
                   break;
                 case 0x8b07b429:
                   if (str.equals("captionMatchKeyWords")) {
                      i = 4;
                   }
                   break;
                 case 0x8caa0bcb:
                   if (str.equals("commentBubble")) {
                      i = 5;
                   }
                   break;
                 case 0x8debb4a8:
                   if (str.equals("downloadSetting")) {
                      i = 6;
                   }
                   break;
                 case 0x91a803a9:
                   if (str.equals("supportType")) {
                      i = 7;
                   }
                   break;
                 case 0x91b4bad1:
                   if (str.equals("extEntry")) {
                      i = 8;
                   }
                   break;
                 case 0x9254f108:
                   if (str.equals("movieTitle")) {
                      i = 9;
                   }
                   break;
                 case 0x92fbb4e2:
                   if (str.equals("likeContent")) {
                      i = 10;
                   }
                   break;
                 case 0x93d28a59:
                   if (str.equals("currentAtUserStates")) {
                      i = 11;
                   }
                   break;
                 case 0x949ba96c:
                   if (str.equals("operationExpTagDisplayInfo")) {
                      i = 12;
                   }
                   break;
                 case 0x952eaf16:
                   if (str.equals("fansTopCommentTopBarInfo")) {
                      i = 13;
                   }
                   break;
                 case 0x96fb470b:
                   if (str.equals("playback_like_count")) {
                      i = 14;
                   }
                   break;
                 case 0x9b31dff9:
                   if (str.equals("fansTopPurchaseUrl")) {
                      i = 15;
                   }
                   break;
                 case 0x9cf584e1:
                   if (str.equals("enableV4Head")) {
                      i = 16;
                   }
                   break;
                 case 0x9f688166:
                   if (str.equals("tag_hash_type")) {
                      i = 17;
                   }
                   break;
                 case 0xa48b9ef5:
                   if (str.equals("view_count")) {
                      i = 18;
                   }
                   break;
                 case 0xaa1dfed6:
                   if (str.equals("activityNickNameIcon")) {
                      i = 19;
                   }
                   break;
                 case 0xad83825f:
                   if (str.equals("enableCoronaDetailPage")) {
                      i = 20;
                   }
                   break;
                 case 0xb0d4e64f:
                   if (str.equals("acquaintanceRecommendOuterText")) {
                      i = 21;
                   }
                   break;
                 case 0xb295f3de:
                   if (str.equals("recreationSetting")) {
                      i = 22;
                   }
                   break;
                 case 0xb3801ebe:
                   if (str.equals("selectionSimilarPhotoStyle")) {
                      i = 23;
                   }
                   break;
                 case 0xb40c2e48:
                   if (str.equals("photo_id")) {
                      i = 24;
                   }
                   break;
                 case 0xb60be913:
                   if (str.equals("atMePhotoPrivacyStatus")) {
                      i = 25;
                   }
                   break;
                 case 0xb996adec:
                   if (str.equals("disclaimerMessage")) {
                      i = 26;
                   }
                   break;
                 case 0xb9e37449:
                   if (str.equals("relationshipChainPhoto")) {
                      i = 27;
                   }
                   break;
                 case 0xba29f530:
                   if (str.equals("recommendHintText")) {
                      i = 28;
                   }
                   break;
                 case 0xbc2976e8:
                   if (str.equals("needEnhanceMagicFaceTag")) {
                      i = 29;
                   }
                   break;
                 case 0xbd2f1f2f:
                   if (str.equals("comment_count")) {
                      i = 30;
                   }
                   break;
                 case 0xbd5122cf:
                   if (str.equals("kwaiId")) {
                      i = 31;
                   }
                   break;
                 case 0xbd540dba:
                   if (str.equals("collect_count")) {
                      i = 32;
                   }
                   break;
                 case 0xbd627f3c:
                   if (str.equals("kyInfo")) {
                      i = 33;
                   }
                   break;
                 case 0xbe453418:
                   if (str.equals("likers")) {
                      i = 34;
                   }
                   break;
                 case 0xbe4a42a9:
                   if (str.equals("living")) {
                      i = 35;
                   }
                   break;
                 case 0xbf33d812:
                   if (str.equals("captionTitle")) {
                      i = 36;
                   }
                   break;
                 case 0xbf429c63:
                   if (str.equals("enableStrengthenEntrance")) {
                      i = 37;
                   }
                   break;
                 case 0xc12413dc:
                   if (str.equals("originalPhotoId")) {
                      i = 38;
                   }
                   break;
                 case 0xc3b124aa:
                   if (str.equals("buttonGuidance")) {
                      i = 39;
                   }
                   break;
                 case 0xc3bbeae7:
                   if (str.equals("myfollowShowTime")) {
                      i = 40;
                   }
                   break;
                 case 0xc88ad15b:
                   if (str.equals("isPlayFailed")) {
                      i = 41;
                   }
                   break;
                 case 0xcacdc638:
                   if (str.equals("starci")) {
                      i = 42;
                   }
                   break;
                 case 0xcb11bb40:
                   if (str.equals("enableLatestCommentTab")) {
                      i = 43;
                   }
                   break;
                 case 0xcb792b5b:
                   if (str.equals("tagTop")) {
                      i = 44;
                   }
                   break;
                 case 0xcbdebe43:
                   if (str.equals("viewer_entrance")) {
                      i = 45;
                   }
                   break;
                 case 0xcbe450fa:
                   if (str.equals("enableCommentTabs")) {
                      i = 46;
                   }
                   break;
                 case 0xcbf21b55:
                   if (str.equals("subscribeNotification")) {
                      i = 47;
                   }
                   break;
                 case 0xcc29bc8e:
                   if (str.equals("visibleRelation")) {
                      i = 48;
                   }
                   break;
                 case 0xccbfadac:
                   if (str.equals("recreationSettingInfo")) {
                      i = 49;
                   }
                   break;
                 case 0xce79293b:
                   if (str.equals("showLikeCount")) {
                      i = 50;
                   }
                   break;
                 case 0xced786b5:
                   if (str.equals("hotPageTags")) {
                      i = 51;
                   }
                   break;
                 case 0xcfccdb7d:
                   if (str.equals("interestSnackBarInfo")) {
                      i = 52;
                   }
                   break;
                 case 0xd04f55b9:
                   if (str.equals("recoType")) {
                      i = 53;
                   }
                   break;
                 case 0xd0c41667:
                   if (str.equals("like_count")) {
                      i = 54;
                   }
                   break;
                 case 0xd355c217:
                   if (str.equals("selectionSurveyActions")) {
                      i = 55;
                   }
                   break;
                 case 0xd432b15f:
                   if (str.equals("snapShowDeadline")) {
                      i = 56;
                   }
                   break;
                 case 0xd4b96efd:
                   if (str.equals("canShowQuickCommentGuide")) {
                      i = 57;
                   }
                   break;
                 case 0xd6dc86ea:
                   if (str.equals("similarPhotoStyle")) {
                      i = 58;
                   }
                   break;
                 case 0xd7508997:
                   if (str.equals("pending")) {
                      i = 59;
                   }
                   break;
                 case 0xd78c0860:
                   if (str.equals("fromSourceId")) {
                      i = 60;
                   }
                   break;
                 case 0xd8fc0240:
                   if (str.equals("detailMorePhotosRecoType")) {
                      i = 61;
                   }
                   break;
                 case 0xd95b7856:
                   if (str.equals("atlasDetailTitleType")) {
                      i = 62;
                   }
                   break;
                 case 0xd96ffb45:
                   if (str.equals("recommendHintTextSourceType")) {
                      i = 63;
                   }
                   break;
                 case 0xda26ad8c:
                   if (str.equals("moodTemplateId")) {
                      i = 64;
                   }
                   break;
                 case 0xda432107:
                   if (str.equals("bottomEntry")) {
                      i = 65;
                   }
                   break;
                 case 0xda503104:
                   if (str.equals("karaokeDuet")) {
                      i = 66;
                   }
                   break;
                 case 0xdc17ddf4:
                   if (str.equals("comments")) {
                      i = 67;
                   }
                   break;
                 case 0xdda127ef:
                   if (str.equals("hasMusicTag")) {
                      i = 68;
                   }
                   break;
                 case 0xdfe3e537:
                   if (str.equals("socialRelationHyperTag")) {
                      i = 69;
                   }
                   break;
                 case 0xe0496067:
                   if (str.equals("isUserStatus")) {
                      i = 70;
                   }
                   break;
                 case 0xe38d5b0c:
                   if (str.equals("hotLiveRemindInfo")) {
                      i = 71;
                   }
                   break;
                 case 0xe3f99be6:
                   if (str.equals("collectRevisitGuidance")) {
                      i = 72;
                   }
                   break;
                 case 0xe49be83d:
                   if (str.equals("fastCommentType")) {
                      i = 73;
                   }
                   break;
                 case 0xe4b63634:
                   if (str.equals("aiCutPhotoStyleId")) {
                      i = 74;
                   }
                   break;
                 case 0xe65be115:
                   if (str.equals("disallowShot")) {
                      i = 75;
                   }
                   break;
                 case 0xe763d870:
                   if (str.equals("noNeedToRequestPLCApi")) {
                      i = 76;
                   }
                   break;
                 case 0xe89f1373:
                   if (str.equals("trendingInfo")) {
                      i = 77;
                   }
                   break;
                 case 0xe95e0b24:
                   if (str.equals("photoRelationEntrance")) {
                      i = 78;
                   }
                   break;
                 case 0xe9f15ae6:
                   if (str.equals("isIntelligenceAlbum")) {
                      i = 79;
                   }
                   break;
                 case 0xeafa897c:
                   if (str.equals("soundTrack")) {
                      i = 80;
                   }
                   break;
                 case 0xebb700b8:
                   if (str.equals("musicStrategy")) {
                      i = 81;
                   }
                   break;
                 case 0xed5b9212:
                   if (str.equals("enableFullScreenPlay")) {
                      i = 82;
                   }
                   break;
                 case 0xedd21c09:
                   if (str.equals("commentAtBubbleMessage")) {
                      i = 83;
                   }
                   break;
                 case 0xeeec4b7f:
                   if (str.equals("localVideoUrl")) {
                      i = 84;
                   }
                   break;
                 case 0xef376044:
                   if (str.equals("frameStyle")) {
                      i = 85;
                   }
                   break;
                 case 0xefd44a94:
                   if (str.equals("hasSurvey")) {
                      i = 86;
                   }
                   break;
                 case 0xf017e38b:
                   if (str.equals("feedbackEntryIds")) {
                      i = 87;
                   }
                   break;
                 case 0xf0cb3232:
                   if (str.equals("visibleLevel")) {
                      i = 88;
                   }
                   break;
                 case 0xf2220c30:
                   if (str.equals("labelFeatureEntry")) {
                      i = 89;
                   }
                   break;
                 case 0xf30878dd:
                   if (str.equals("supportSurveyActionList")) {
                      i = 90;
                   }
                   break;
                 case 0xf6525b61:
                   if (str.equals("visibilityExpiration")) {
                      i = 91;
                   }
                   break;
                 case 0xf6617a59:
                   if (str.equals("bottomComponentMaterial")) {
                      i = 92;
                   }
                   break;
                 case 0xf92f618e:
                   if (str.equals("hyperTag")) {
                      i = 93;
                   }
                   break;
                 case 0xfb1418f7:
                   if (str.equals("extraIconInfo")) {
                      i = 94;
                   }
                   break;
                 case 0xfb3329e5:
                   if (str.equals("publishCoinTask")) {
                      i = 95;
                   }
                   break;
                 case 0xfc1d5f15:
                   if (str.equals("forward_count")) {
                      i = 96;
                   }
                   break;
                 case 0xfc5c9ade:
                   if (str.equals("hasAtlasText")) {
                      i = 97;
                   }
                   break;
                 case 0xfd0cdf34:
                   if (str.equals("interestManageSnackBar")) {
                      i = 98;
                   }
                   break;
                 case 0xfecd60be:
                   if (str.equals("showCoCreateIcon")) {
                      i = 99;
                   }
                   break;
                 case 0x1b2ec:
                   if (str.equals("ptp")) {
                      i = 100;
                   }
                   break;
                 case 0x363419:
                   if (str.equals("tags")) {
                      i = 101;
                   }
                   break;
                 case 0x3652cd:
                   if (str.equals("time")) {
                      i = 102;
                   }
                   break;
                 case 0x36eb02:
                   if (str.equals("us_c")) {
                      i = 103;
                   }
                   break;
                 case 0x36eb03:
                   if (str.equals("us_d")) {
                      i = 104;
                   }
                   break;
                 case 0x36eb0b:
                   if (str.equals("us_l")) {
                      i = 105;
                   }
                   break;
                 case 0x59ad67:
                   if (str.equals("downloadCount")) {
                      i = 106;
                   }
                   break;
                 case 0x14d6c08:
                   if (str.equals("adminTags")) {
                      i = 107;
                   }
                   break;
                 case 0x216c4a8:
                   if (str.equals("photoCoCreateInfo")) {
                      i = 108;
                   }
                   break;
                 case 0x3492916:
                   if (str.equals("timestamp")) {
                      i = 109;
                   }
                   break;
                 case 0x34dfc8a:
                   if (str.equals("actionSurveyType")) {
                      i = 110;
                   }
                   break;
                 case 0x398ab1e:
                   if (str.equals("photoJudgementStatusBar")) {
                      i = 111;
                   }
                   break;
                 case 0x5e7647a:
                   if (str.equals("hated")) {
                      i = 112;
                   }
                   break;
                 case 0x62343ad:
                   if (str.equals("liked")) {
                      i = 113;
                   }
                   break;
                 case 0x636ee25:
                   if (str.equals("music")) {
                      i = 114;
                   }
                   break;
                 case 0x6b30ac9:
                   if (str.equals("votes")) {
                      i = 115;
                   }
                   break;
                 case 0xb783f35:
                   if (str.equals("geminiLogParams")) {
                      i = 116;
                   }
                   break;
                 case 0xbaabce6:
                   if (str.equals("needActionSurvey")) {
                      i = 117;
                   }
                   break;
                 case 0xeef22f2:
                   if (str.equals("showLikeList")) {
                      i = 118;
                   }
                   break;
                 case 0xf43cf97:
                   if (str.equals("recoReasonTag")) {
                      i = 119;
                   }
                   break;
                 case 0xfac3ed0:
                   if (str.equals("disableTranscodeHiddenUserInfo")) {
                      i = 120;
                   }
                   break;
                 case 0xfadbe5f:
                   if (str.equals("fansTopGuideTips")) {
                      i = 121;
                   }
                   break;
                 case 0xfc5772b:
                   if (str.equals("authorAnalysisEntry")) {
                      i = 122;
                   }
                   break;
                 case 0x11448734:
                   if (str.equals("exposedComments")) {
                      i = 123;
                   }
                   break;
                 case 0x114bdd5c:
                   if (str.equals("feedbackDetailParams")) {
                      i = 124;
                   }
                   break;
                 case 0x155ef77f:
                   if (str.equals("buttonText")) {
                      i = 125;
                   }
                   break;
                 case 0x1739d562:
                   if (str.equals("musicDisk")) {
                      i = 126;
                   }
                   break;
                 case 0x175f60af:
                   if (str.equals("share_count")) {
                      i = 127;
                   }
                   break;
                 case 0x180364cc:
                   if (str.equals("mmuPicSimilarSearchInfo")) {
                      i = 128;
                   }
                   break;
                 case 0x1897efb7:
                   if (str.equals("enableFavoriteFollowingInDetailPage")) {
                      i = 129;
                   }
                   break;
                 case 0x197c92a0:
                   if (str.equals("feedSwitches")) {
                      i = 130;
                   }
                   break;
                 case 0x1a622a4a:
                   if (str.equals("photoCommentFriendsVisible")) {
                      i = 131;
                   }
                   break;
                 case 0x1c6b5a90:
                   if (str.equals("atlasOcrResult")) {
                      i = 132;
                   }
                   break;
                 case 0x1c9990a2:
                   if (str.equals("viewer_count")) {
                      i = 133;
                   }
                   break;
                 case 0x1d8274a3:
                   if (str.equals("geminiHotSurveyDisplayStrategy")) {
                      i = 134;
                   }
                   break;
                 case 0x1dfd2cab:
                   if (str.equals("fashionEntranceShow")) {
                      i = 135;
                   }
                   break;
                 case 0x1ee36a97:
                   if (str.equals("acquaintanceReplaceNames")) {
                      i = 136;
                   }
                   break;
                 case 0x1fe82ba6:
                   if (str.equals("profileUserCopyTopPhoto")) {
                      i = 137;
                   }
                   break;
                 case 0x210b2263:
                   if (str.equals("surveyInfoId")) {
                      i = 138;
                   }
                   break;
                 case 0x22a90e77:
                   if (str.equals("surveyStyle")) {
                      i = 139;
                   }
                   break;
                 case 0x22acaeaa:
                   if (str.equals("acquaintanceRecommendInnerText")) {
                      i = 140;
                   }
                   break;
                 case 0x250ea029:
                   if (str.equals("searchAiScriptInfo")) {
                      i = 141;
                   }
                   break;
                 case 0x26a86aa3:
                   if (str.equals("plcFeatureEntry")) {
                      i = 142;
                   }
                   break;
                 case 0x28a5337d:
                   if (str.equals("videoColdStartType")) {
                      i = 143;
                   }
                   break;
                 case 0x2d25a9c2:
                   if (str.equals("fansTopShareTips")) {
                      i = 144;
                   }
                   break;
                 case 0x2d37fd81:
                   if (str.equals("godCommentList")) {
                      i = 145;
                   }
                   break;
                 case 0x2d3b27e0:
                   if (str.equals("godCommentShow")) {
                      i = 146;
                   }
                   break;
                 case 0x2d8048a7:
                   if (str.equals("sameFrame")) {
                      i = 147;
                   }
                   break;
                 case 0x2d9db484:
                   if (str.equals("progressNodes")) {
                      i = 148;
                   }
                   break;
                 case 0x2e6ddc3d:
                   if (str.equals("hotSpotInfo")) {
                      i = 149;
                   }
                   break;
                 case 0x2ed96b1b:
                   if (str.equals("prefetchReason")) {
                      i = 150;
                   }
                   break;
                 case 0x30c893b2:
                   if (str.equals("profile_top_photo")) {
                      i = 151;
                   }
                   break;
                 case 0x316de8dc:
                   if (str.equals("karaokeScoreInfo")) {
                      i = 152;
                   }
                   break;
                 case 0x3432ba18:
                   if (str.equals("dynamicEffectDisable")) {
                      i = 153;
                   }
                   break;
                 case 0x3581675e:
                   if (str.equals("allowSameFrame")) {
                      i = 154;
                   }
                   break;
                 case 0x358489e7:
                   if (str.equals("knowledgeCardTags")) {
                      i = 155;
                   }
                   break;
                 case 0x35cf3635:
                   if (str.equals("plcResponseTime")) {
                      i = 156;
                   }
                   break;
                 case 0x361f364a:
                   if (str.equals("operationFeedContext")) {
                      i = 157;
                   }
                   break;
                 case 0x364d52fc:
                   if (str.equals("atlasDetailTitle")) {
                      i = 158;
                   }
                   break;
                 case 0x3666c82f:
                   if (str.equals("currentLivingState")) {
                      i = 159;
                   }
                   break;
                 case 0x382affe6:
                   if (str.equals("recommendHintTextSourceId")) {
                      i = 160;
                   }
                   break;
                 case 0x3c4353f7:
                   if (str.equals("lipsSyncPhoto")) {
                      i = 161;
                   }
                   break;
                 case 0x3d211711:
                   if (str.equals("profileUserTopPhoto")) {
                      i = 162;
                   }
                   break;
                 case 0x3f208c01:
                   if (str.equals("photoReward")) {
                      i = 163;
                   }
                   break;
                 case 0x42369d4d:
                   if (str.equals("show_count")) {
                      i = 164;
                   }
                   break;
                 case 0x427ca1e4:
                   if (str.equals("inappropriate")) {
                      i = 165;
                   }
                   break;
                 case 0x465cb222:
                   if (str.equals("photoTextLocationInfo")) {
                      i = 166;
                   }
                   break;
                 case 0x4a589853:
                   if (str.equals("photoDisplayLocationInfo")) {
                      i = 167;
                   }
                   break;
                 case 0x4e54b426:
                   if (str.equals("overallDetailSlideDifferent")) {
                      i = 168;
                   }
                   break;
                 case 0x4f2a28c2:
                   if (str.equals("photoFollowingIntensify")) {
                      i = 169;
                   }
                   break;
                 case 0x5095cbc1:
                   if (str.equals("selectionSurveyId")) {
                      i = 170;
                   }
                   break;
                 case 0x5351a860:
                   if (str.equals("videoQualityPanel")) {
                      i = 171;
                   }
                   break;
                 case 0x54e3e6ac:
                   if (str.equals("searchSummaryInfo")) {
                      i = 172;
                   }
                   break;
                 case 0x5930f564:
                   if (str.equals("ext_params")) {
                      i = 173;
                   }
                   break;
                 case 0x5a114a95:
                   if (str.equals("enableClsGuide")) {
                      i = 174;
                   }
                   break;
                 case 0x5a677cec:
                   if (str.equals("playerPanelUnsupportedType")) {
                      i = 175;
                   }
                   break;
                 case 0x5c326009:
                   if (str.equals("magicFaces")) {
                      i = 176;
                   }
                   break;
                 case 0x5d1694d0:
                   if (str.equals("enhanceDescAreaCollectButton")) {
                      i = 177;
                   }
                   break;
                 case 0x5dede94a:
                   if (str.equals("hasMagicFaceTag")) {
                      i = 178;
                   }
                   break;
                 case 0x5e7bfeee:
                   if (str.equals("followShoot")) {
                      i = 179;
                   }
                   break;
                 case 0x5f7831d8:
                   if (str.equals("editInfo")) {
                      i = 180;
                   }
                   break;
                 case 0x602449a2:
                   if (str.equals("collectPopup")) {
                      i = 181;
                   }
                   break;
                 case 0x6111f746:
                   if (str.equals("activityLike")) {
                      i = 182;
                   }
                   break;
                 case 0x621fcdb5:
                   if (str.equals("fansTopPurchaseButtonText")) {
                      i = 183;
                   }
                   break;
                 case 0x625ab28f:
                   if (str.equals("coCreateInvitationInfo")) {
                      i = 184;
                   }
                   break;
                 case 0x631f07c1:
                   if (str.equals("liveRoomType")) {
                      i = 185;
                   }
                   break;
                 case 0x64dba3c0:
                   if (str.equals("collectGuideInfo")) {
                      i = 186;
                   }
                   break;
                 case 0x651e1329:
                   if (str.equals("followLikers")) {
                      i = 187;
                   }
                   break;
                 case 0x662eaeaf:
                   if (str.equals("displayTime")) {
                      i = 188;
                   }
                   break;
                 case 0x664fae83:
                   if (str.equals("isShareCountExp")) {
                      i = 189;
                   }
                   break;
                 case 0x6ac2cf99:
                   if (str.equals("playback_view_count")) {
                      i = 190;
                   }
                   break;
                 case 0x6c5b929f:
                   if (str.equals("photo_status")) {
                      i = 191;
                   }
                   break;
                 case 0x6ef71c2b:
                   if (str.equals("activityPressLike")) {
                      i = 192;
                   }
                   break;
                 case 0x6ffc2b36:
                   if (str.equals("showFriendInviteButton")) {
                      i = 193;
                   }
                   break;
                 case 0x7043cb49:
                   if (str.equals("collected")) {
                      i = 194;
                   }
                   break;
                 case 0x715ae1f3:
                   if (str.equals("feedBottomRightSummary")) {
                      i = 195;
                   }
                   break;
                 case 0x717cc4ed:
                   if (str.equals("plcFeatureEntryData")) {
                      i = 196;
                   }
                   break;
                 case 0x71902f75:
                   if (str.equals("interactStickerInfo")) {
                      i = 197;
                   }
                   break;
                 case 0x71955a01:
                   if (str.equals("interactStickerType")) {
                      i = 198;
                   }
                   break;
                 case 0x776f2892:
                   if (str.equals("enhanceCommentInputBox")) {
                      i = 199;
                   }
                   break;
                 case 0x77d958b3:
                   if (str.equals("photoProductionTypeInfo")) {
                      i = 200;
                   }
                   break;
                 case 0x7adb930b:
                   if (str.equals("shareToFollow")) {
                      i = 201;
                   }
                   break;
                 case 0x7b382217:
                   if (str.equals("showPos")) {
                      i = 202;
                   }
                   break;
                 case 0x7b77e029:
                   if (str.equals("recommendStripe")) {
                      i = 203;
                   }
                   break;
                 case 0x7ed855aa:
                   if (str.equals("magicFace")) {
                      i = 204;
                   }
                   break;
                 case 0x7f5cb1b8:
                   if (str.equals("posterShowInfo")) {
                      i = 205;
                   }
                   break;
                 case 0x7fa79636:
                   if (str.equals("imGroupId")) {
                      i = 206;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   photoMeta1.mFollowShootType = KnownTypeAdapters$k.a(p0, photoMeta1.mFollowShootType);
                   break;
                 case 1:
                   photoMeta1.mPlcHighPriorityThanBottomEntry = KnownTypeAdapters$g.a(p0, photoMeta1.mPlcHighPriorityThanBottomEntry);
                   break;
                 case 2:
                   photoMeta1.mSurveyBizType = KnownTypeAdapters$k.a(p0, photoMeta1.mSurveyBizType);
                   break;
                 case 3:
                   photoMeta1.mPhotoSkipCrop = KnownTypeAdapters$g.a(p0, photoMeta1.mPhotoSkipCrop);
                   break;
                 case 4:
                   photoMeta1.mPhotoCommonTags = this.t0.read(p0);
                   break;
                 case 5:
                   photoMeta1.mCommentBubble = KnownTypeAdapters$k.a(p0, photoMeta1.mCommentBubble);
                   break;
                 case 6:
                   photoMeta1.mDownloadSetting = KnownTypeAdapters$k.a(p0, photoMeta1.mDownloadSetting);
                   break;
                 case 7:
                   photoMeta1.mSupportType = KnownTypeAdapters$k.a(p0, photoMeta1.mSupportType);
                   break;
                 case 8:
                   photoMeta1.mExtEntryModel = this.x.read(p0);
                   break;
                 case 9:
                   photoMeta1.mMovieTitle = TypeAdapters.A.read(p0);
                   break;
                 case 10:
                   photoMeta1.mLikeContentMap = this.e0.read(p0);
                   break;
                 case 11:
                   photoMeta1.mAtUserItems = this.m.read(p0);
                   break;
                 case 12:
                   photoMeta1.mOperationExpTagDisplayInfo = this.Y.read(p0);
                   break;
                 case 13:
                   photoMeta1.mFansTopCommentTopBarInfo = this.h0.read(p0);
                   break;
                 case 14:
                   photoMeta1.mPlaybackLikeCount = KnownTypeAdapters$k.a(p0, photoMeta1.mPlaybackLikeCount);
                   break;
                 case 15:
                   photoMeta1.mFansTopPurchaseUrl = TypeAdapters.A.read(p0);
                   break;
                 case 16:
                   photoMeta1.mEnableV4Head = KnownTypeAdapters$g.a(p0, photoMeta1.mEnableV4Head);
                   break;
                 case 17:
                   photoMeta1.mTagHashType = KnownTypeAdapters$k.a(p0, photoMeta1.mTagHashType);
                   break;
                 case 18:
                   photoMeta1.mViewCount = KnownTypeAdapters$k.a(p0, photoMeta1.mViewCount);
                   break;
                 case 19:
                   photoMeta1.mActivityUserIconMode = this.U.read(p0);
                   break;
                 case 20:
                   photoMeta1.mEnableCoronaDetailPage = KnownTypeAdapters$g.a(p0, photoMeta1.mEnableCoronaDetailPage);
                   break;
                 case 21:
                   photoMeta1.mAcquaintanceFeedRelationText = TypeAdapters.A.read(p0);
                   break;
                 case 22:
                   photoMeta1.mRecreationSetting = KnownTypeAdapters$k.a(p0, photoMeta1.mRecreationSetting);
                   break;
                 case 23:
                   photoMeta1.mFeatureSimilarPhotoStyle = KnownTypeAdapters$k.a(p0, photoMeta1.mFeatureSimilarPhotoStyle);
                   break;
                 case 24:
                   photoMeta1.mPhotoId = TypeAdapters.A.read(p0);
                   break;
                 case 25:
                   photoMeta1.mAtMePhotoPrivacyStatus = KnownTypeAdapters$k.a(p0, photoMeta1.mAtMePhotoPrivacyStatus);
                   break;
                 case 26:
                   photoMeta1.mDisclaimerMessage = TypeAdapters.A.read(p0);
                   break;
                 case 27:
                   photoMeta1.mIsRelationPhoto = KnownTypeAdapters$g.a(p0, photoMeta1.mIsRelationPhoto);
                   break;
                 case 28:
                   photoMeta1.mRecommendHintText = TypeAdapters.A.read(p0);
                   break;
                 case 29:
                   photoMeta1.mNeedEnhanceMagicFaceTag = KnownTypeAdapters$g.a(p0, photoMeta1.mNeedEnhanceMagicFaceTag);
                   break;
                 case 30:
                   photoMeta1.mCommentCount = KnownTypeAdapters$k.a(p0, photoMeta1.mCommentCount);
                   break;
                 case 31:
                   photoMeta1.mKwaiId = TypeAdapters.A.read(p0);
                   break;
                 case 32:
                   photoMeta1.mCollectCount = KnownTypeAdapters$n.a(p0, photoMeta1.mCollectCount);
                   break;
                 case '!':
                   photoMeta1.mKyInfo = this.Z.read(p0);
                   break;
                 case '"':
                   photoMeta1.mExtraLikers = this.e.read(p0);
                   break;
                 case '#':
                   photoMeta1.mLiveTipInfo = this.f.read(p0);
                   break;
                 case '$':
                   photoMeta1.mCaptionTitle = TypeAdapters.A.read(p0);
                   break;
                 case '%':
                   photoMeta1.mEnableStrengthenEntrance = KnownTypeAdapters$g.a(p0, photoMeta1.mEnableStrengthenEntrance);
                   break;
                 case '&':
                   photoMeta1.mOriginalPhotoId = TypeAdapters.A.read(p0);
                   break;
                 case 39:
                   photoMeta1.mCollectFeedInfo = this.n0.read(p0);
                   break;
                 case '(':
                   photoMeta1.mMyfollowShowTime = KnownTypeAdapters$g.a(p0, photoMeta1.mMyfollowShowTime);
                   break;
                 case ')':
                   photoMeta1.mIsPlayFailed = KnownTypeAdapters$g.a(p0, photoMeta1.mIsPlayFailed);
                   break;
                 case '*':
                   photoMeta1.mStarci = KnownTypeAdapters$g.a(p0, photoMeta1.mStarci);
                   break;
                 case '+':
                   photoMeta1.mEnableLatestCommentTab = KnownTypeAdapters$g.a(p0, photoMeta1.mEnableLatestCommentTab);
                   break;
                 case ',':
                   photoMeta1.mTagTop = KnownTypeAdapters$g.a(p0, photoMeta1.mTagTop);
                   break;
                 case '-':
                   photoMeta1.mViewerEntrance = KnownTypeAdapters$g.a(p0, photoMeta1.mViewerEntrance);
                   break;
                 case '.':
                   photoMeta1.mEnableCommentTabs = KnownTypeAdapters$g.a(p0, photoMeta1.mEnableCommentTabs);
                   break;
                 case '/':
                   photoMeta1.mSubscribeNotification = KnownTypeAdapters$g.a(p0, photoMeta1.mSubscribeNotification);
                   break;
                 case '0':
                   photoMeta1.mFriendsVisibility = KnownTypeAdapters$k.a(p0, photoMeta1.mFriendsVisibility);
                   break;
                 case '1':
                   photoMeta1.mRecreationSettingInfo = this.a0.read(p0);
                   break;
                 case '2':
                   photoMeta1.mShowLikeCount = KnownTypeAdapters$g.a(p0, photoMeta1.mShowLikeCount);
                   break;
                 case '3':
                   photoMeta1.mHotPageTagItems = this.k.read(p0);
                   break;
                 case '4':
                   photoMeta1.mInterestAdjustSnackBarInfo = this.y0.read(p0);
                   break;
                 case '5':
                   photoMeta1.mRecoType = KnownTypeAdapters$k.a(p0, photoMeta1.mRecoType);
                   break;
                 case '6':
                   photoMeta1.mLikeCount = KnownTypeAdapters$k.a(p0, photoMeta1.mLikeCount);
                   break;
                 case '7':
                   photoMeta1.mSelectionSurveyActions = this.F.read(p0);
                   break;
                 case '8':
                   photoMeta1.mSnapShowDeadline = KnownTypeAdapters$n.a(p0, photoMeta1.mSnapShowDeadline);
                   break;
                 case '9':
                   photoMeta1.mCanShowQuickCommentGuide = KnownTypeAdapters$g.a(p0, photoMeta1.mCanShowQuickCommentGuide);
                   break;
                 case ':':
                   photoMeta1.mSimilarPhotoStyle = KnownTypeAdapters$k.a(p0, photoMeta1.mSimilarPhotoStyle);
                   break;
                 case ';':
                   photoMeta1.mIsPending = KnownTypeAdapters$g.a(p0, photoMeta1.mIsPending);
                   break;
                 case '<':
                   photoMeta1.mFromSourceType = KnownTypeAdapters$k.a(p0, photoMeta1.mFromSourceType);
                   break;
                 case '=':
                   photoMeta1.mDetailMorePhotosRecoType = KnownTypeAdapters$k.a(p0, photoMeta1.mDetailMorePhotosRecoType);
                   break;
                 case '>':
                   photoMeta1.mAtlasDetailTitleType = TypeAdapters.A.read(p0);
                   break;
                 case '?':
                   photoMeta1.mRecommendHintTextSourceType = TypeAdapters.A.read(p0);
                   break;
                 case '@':
                   photoMeta1.mMoodTemplateId = KnownTypeAdapters$n.a(p0, photoMeta1.mMoodTemplateId);
                   break;
                 case 'A':
                   photoMeta1.mBottomEntryInfo = this.O.read(p0);
                   break;
                 case 'B':
                   photoMeta1.mKaraokeChorusModel = this.v.read(p0);
                   break;
                 case 'C':
                   photoMeta1.mExtraComments = this.c.read(p0);
                   break;
                 case 'D':
                   photoMeta1.mHasMusicTag = KnownTypeAdapters$g.a(p0, photoMeta1.mHasMusicTag);
                   break;
                 case 'E':
                   photoMeta1.mSocialRelationHyperTag = this.b0.read(p0);
                   break;
                 case 'F':
                   photoMeta1.mIsUserStatus = KnownTypeAdapters$g.a(p0, photoMeta1.mIsUserStatus);
                   break;
                 case 'G':
                   photoMeta1.mPhotoLiveRemindInfo = this.k0.read(p0);
                   break;
                 case 'H':
                   photoMeta1.mCollectRevisitGuidance = this.o0.read(p0);
                   break;
                 case 'I':
                   photoMeta1.mFastCommentType = KnownTypeAdapters$k.a(p0, photoMeta1.mFastCommentType);
                   break;
                 case 'J':
                   photoMeta1.mAiCutPhotoStyleId = KnownTypeAdapters$n.a(p0, photoMeta1.mAiCutPhotoStyleId);
                   break;
                 case 'K':
                   photoMeta1.mDisallowShot = KnownTypeAdapters$g.a(p0, photoMeta1.mDisallowShot);
                   break;
                 case 'L':
                   photoMeta1.mNoNeedToRequestPlcEntryStyleInfo = KnownTypeAdapters$g.a(p0, photoMeta1.mNoNeedToRequestPlcEntryStyleInfo);
                   break;
                 case 'M':
                   photoMeta1.mOperationBarInfo = this.M.read(p0);
                   break;
                 case 'N':
                   photoMeta1.mPhotoRelationEntrance = this.q.read(p0);
                   break;
                 case 'O':
                   photoMeta1.mIsIntelligenceAlbum = KnownTypeAdapters$g.a(p0, photoMeta1.mIsIntelligenceAlbum);
                   break;
                 case 'P':
                   photoMeta1.mSoundTrack = this.h.read(p0);
                   break;
                 case 'Q':
                   photoMeta1.mMusicStrategy = this.j0.read(p0);
                   break;
                 case 'R':
                   photoMeta1.mEnableFullScreenPlay = KnownTypeAdapters$g.a(p0, photoMeta1.mEnableFullScreenPlay);
                   break;
                 case 'S':
                   photoMeta1.mCommentAtBubbleMessage = TypeAdapters.A.read(p0);
                   break;
                 case 'T':
                   photoMeta1.mLocalVideoUrl = TypeAdapters.A.read(p0);
                   break;
                 case 'U':
                   photoMeta1.mFrameStyle = KnownTypeAdapters$k.a(p0, photoMeta1.mFrameStyle);
                   break;
                 case 'V':
                   photoMeta1.mHasSurvey = KnownTypeAdapters$g.a(p0, photoMeta1.mHasSurvey);
                   break;
                 case 'W':
                   photoMeta1.mFeedbackEntryIds = this.E.read(p0);
                   break;
                 case 'X':
                   photoMeta1.mVisibleLevel = this.r.read(p0);
                   break;
                 case 'Y':
                   photoMeta1.mLabelFeatureEntry = this.H.read(p0);
                   break;
                 case 'Z':
                   photoMeta1.mSupportSurveyActionList = this.E.read(p0);
                   break;
                 case '[':
                   photoMeta1.mVisibilityExpiration = this.g.read(p0);
                   break;
                 case 92:
                   photoMeta1.mBottomComponentMaterial = this.c0.read(p0);
                   break;
                 case ']':
                   photoMeta1.mHyperTag = this.b0.read(p0);
                   break;
                 case '^':
                   photoMeta1.mExtraIconInfo = this.K.read(p0);
                   break;
                 case '_':
                   photoMeta1.mKwaiCoinTaskInfo = this.T.read(p0);
                   break;
                 case '`':
                   photoMeta1.mForwardCount = KnownTypeAdapters$k.a(p0, photoMeta1.mForwardCount);
                   break;
                 case 'a':
                   photoMeta1.mHasAtlasText = KnownTypeAdapters$g.a(p0, photoMeta1.mHasAtlasText);
                   break;
                 case 'b':
                   photoMeta1.mInterestManageSnackBarInfo = this.u0.read(p0);
                   break;
                 case 'c':
                   photoMeta1.mShowCoCreateIcon = KnownTypeAdapters$g.a(p0, photoMeta1.mShowCoCreateIcon);
                   break;
                 case 'd':
                   photoMeta1.ptp = TypeAdapters.A.read(p0);
                   break;
                 case 'e':
                   photoMeta1.mTagItems = this.k.read(p0);
                   break;
                 case 'f':
                   photoMeta1.mTime = TypeAdapters.A.read(p0);
                   break;
                 case 'g':
                   photoMeta1.mUsC = KnownTypeAdapters$k.a(p0, photoMeta1.mUsC);
                   break;
                 case 'h':
                   photoMeta1.mUsD = KnownTypeAdapters$k.a(p0, photoMeta1.mUsD);
                   break;
                 case 'i':
                   photoMeta1.mUseLive = KnownTypeAdapters$g.a(p0, photoMeta1.mUseLive);
                   break;
                 case 'j':
                   photoMeta1.mDownloadCount = KnownTypeAdapters$k.a(p0, photoMeta1.mDownloadCount);
                   break;
                 case 'k':
                   photoMeta1.mAdminTagsModels = this.k.read(p0);
                   break;
                 case 'l':
                   photoMeta1.mCoCreateInfo = this.v0.read(p0);
                   break;
                 case 'm':
                   photoMeta1.mTimeStamp = KnownTypeAdapters$n.a(p0, photoMeta1.mTimeStamp);
                   break;
                 case 'n':
                   photoMeta1.mActionSurveyType = KnownTypeAdapters$k.a(p0, photoMeta1.mActionSurveyType);
                   break;
                 case 'o':
                   photoMeta1.mPhotoJudgementStatusInfo = this.S.read(p0);
                   break;
                 case 'p':
                   photoMeta1.mHated = KnownTypeAdapters$k.a(p0, photoMeta1.mHated);
                   break;
                 case 'q':
                   photoMeta1.mLiked = KnownTypeAdapters$k.a(p0, photoMeta1.mLiked);
                   break;
                 case 'r':
                   photoMeta1.mMusic = this.h.read(p0);
                   break;
                 case 's':
                   photoMeta1.mPhotoCommentVoteInfo = this.l0.read(p0);
                   break;
                 case 't':
                   photoMeta1.mGeminiLogParams = this.e0.read(p0);
                   break;
                 case 'u':
                   photoMeta1.mNeedActionSurvey = KnownTypeAdapters$g.a(p0, photoMeta1.mNeedActionSurvey);
                   break;
                 case 'v':
                   photoMeta1.mShowLikeList = KnownTypeAdapters$g.a(p0, photoMeta1.mShowLikeList);
                   break;
                 case 'w':
                   photoMeta1.mRecoReasonTag = this.j.read(p0);
                   break;
                 case 'x':
                   photoMeta1.mDisableTranscodeHiddenUserInfo = KnownTypeAdapters$g.a(p0, photoMeta1.mDisableTranscodeHiddenUserInfo);
                   break;
                 case 'y':
                   photoMeta1.mFansTopGuideTips = TypeAdapters.A.read(p0);
                   break;
                 case 'z':
                   photoMeta1.mAnalysisEntranceModel = this.f0.read(p0);
                   break;
                 case '{':
                   photoMeta1.mExposeComments = this.c.read(p0);
                   break;
                 case '|':
                   photoMeta1.mFeedbackDetailParams = TypeAdapters.A.read(p0);
                   break;
                 case '}':
                   photoMeta1.mToolBoxButtonText = TypeAdapters.A.read(p0);
                   break;
                 case '~':
                   photoMeta1.mMusicWheelInfo = this.q0.read(p0);
                   break;
                 case 127:
                   photoMeta1.mShareCount = KnownTypeAdapters$k.a(p0, photoMeta1.mShareCount);
                   break;
                 case 128:
                   photoMeta1.mMMUSimilarSearchInfo = this.x0.read(p0);
                   break;
                 case 129:
                   photoMeta1.mEnableSpecialFocus = KnownTypeAdapters$g.a(p0, photoMeta1.mEnableSpecialFocus);
                   break;
                 case 130:
                   photoMeta1.mFeedSwitches = this.g0.read(p0);
                   break;
                 case 131:
                   photoMeta1.mPhotoCommentLimitType = KnownTypeAdapters$k.a(p0, photoMeta1.mPhotoCommentLimitType);
                   break;
                 case 132:
                   photoMeta1.mTtlasOcrResult = new KnownTypeAdapters$ArrayTypeAdapter(TypeAdapters.A, new PhotoMeta$TypeAdapter$d(this)).a(p0);
                   break;
                 case 133:
                   photoMeta1.mViewerCount = KnownTypeAdapters$k.a(p0, photoMeta1.mViewerCount);
                   break;
                 case 134:
                   photoMeta1.mGeminiHotSurveyDisplayStrategy = KnownTypeAdapters$k.a(p0, photoMeta1.mGeminiHotSurveyDisplayStrategy);
                   break;
                 case 135:
                   photoMeta1.mFashionShowInfo = this.p.read(p0);
                   break;
                 case 136:
                   photoMeta1.mAcquaintanceReplaceNames = this.J.read(p0);
                   break;
                 case 137:
                   photoMeta1.mIsPhotoCopyTop = KnownTypeAdapters$g.a(p0, photoMeta1.mIsPhotoCopyTop);
                   break;
                 case 138:
                   photoMeta1.mSurveyInfoId = TypeAdapters.A.read(p0);
                   break;
                 case 139:
                   photoMeta1.mSurveyStyle = KnownTypeAdapters$k.a(p0, photoMeta1.mSurveyStyle);
                   break;
                 case 140:
                   photoMeta1.mAcquaintanceDetailRelationText = TypeAdapters.A.read(p0);
                   break;
                 case 141:
                   photoMeta1.mSearchAiScriptInfo = this.R.read(p0);
                   break;
                 case 142:
                   photoMeta1.mPlcEntryStyleInfo = this.G.read(p0);
                   break;
                 case 143:
                   photoMeta1.mVideoColdStartType = KnownTypeAdapters$k.a(p0, photoMeta1.mVideoColdStartType);
                   break;
                 case 144:
                   photoMeta1.mFansTopShareTips = TypeAdapters.A.read(p0);
                   break;
                 case 145:
                   photoMeta1.mGodCommentList = this.c.read(p0);
                   break;
                 case 146:
                   photoMeta1.mHasGodCommentShow = KnownTypeAdapters$g.a(p0, photoMeta1.mHasGodCommentShow);
                   break;
                 case 147:
                   photoMeta1.mSameFrameInfo = this.s.read(p0);
                   break;
                 case 148:
                   photoMeta1.mHighLightPosInfo = new KnownTypeAdapters$ArrayTypeAdapter(this.Q, new PhotoMeta$TypeAdapter$c(this)).a(p0);
                   break;
                 case 149:
                   photoMeta1.mHotSpotInfo = this.N.read(p0);
                   break;
                 case 150:
                   photoMeta1.mPrefetchReason = TypeAdapters.A.read(p0);
                   break;
                 case 151:
                   photoMeta1.mTopPhoto = KnownTypeAdapters$g.a(p0, photoMeta1.mTopPhoto);
                   break;
                 case 152:
                   photoMeta1.mKaraokeScoreInfo = this.W.read(p0);
                   break;
                 case 153:
                   photoMeta1.mDisableLikeAnimations = KnownTypeAdapters$g.a(p0, photoMeta1.mDisableLikeAnimations);
                   break;
                 case 154:
                   photoMeta1.mAllowSameFrame = KnownTypeAdapters$g.a(p0, photoMeta1.mAllowSameFrame);
                   break;
                 case 155:
                   photoMeta1.mKgTags = this.s0.read(p0);
                   break;
                 case 156:
                   photoMeta1.mPlcResponseTime = KnownTypeAdapters$n.a(p0, photoMeta1.mPlcResponseTime);
                   break;
                 case 157:
                   photoMeta1.mQuestionnaireInfo = this.n.read(p0);
                   break;
                 case 158:
                   photoMeta1.mAtlasDetailTitle = TypeAdapters.A.read(p0);
                   break;
                 case 159:
                   photoMeta1.mCurrentLivingState = KnownTypeAdapters$g.a(p0, photoMeta1.mCurrentLivingState);
                   break;
                 case 160:
                   photoMeta1.mRecommendHintTextSourceId = TypeAdapters.A.read(p0);
                   break;
                 case 161:
                   photoMeta1.mLipsSyncModel = this.u.read(p0);
                   break;
                 case 162:
                   photoMeta1.mIsPhotoTop = KnownTypeAdapters$g.a(p0, photoMeta1.mIsPhotoTop);
                   break;
                 case 163:
                   photoMeta1.mRewardPhotoInfo = this.V.read(p0);
                   break;
                 case 164:
                   photoMeta1.mShowCount = KnownTypeAdapters$n.a(p0, photoMeta1.mShowCount);
                   break;
                 case 165:
                   photoMeta1.mInappropriate = KnownTypeAdapters$g.a(p0, photoMeta1.mInappropriate);
                   break;
                 case 166:
                   photoMeta1.mPhotoTextLocationInfo = this.B.read(p0);
                   break;
                 case 167:
                   photoMeta1.mPhotoDisplayLocationInfo = this.C.read(p0);
                   break;
                 case 168:
                   photoMeta1.mOverallDetailSlideDifferent = KnownTypeAdapters$k.a(p0, photoMeta1.mOverallDetailSlideDifferent);
                   break;
                 case 169:
                   photoMeta1.mPhotoFollowingIntensify = KnownTypeAdapters$k.a(p0, photoMeta1.mPhotoFollowingIntensify);
                   break;
                 case 170:
                   photoMeta1.mSelectionSurveyId = TypeAdapters.A.read(p0);
                   break;
                 case 171:
                   photoMeta1.mVideoQualityInfo = this.D.read(p0);
                   break;
                 case 172:
                   photoMeta1.mSummaryInfo = this.P.read(p0);
                   break;
                 case 173:
                   photoMeta1.mKaraokeModel = this.y.read(p0);
                   break;
                 case 174:
                   photoMeta1.mEnableClsGuide = KnownTypeAdapters$g.a(p0, photoMeta1.mEnableClsGuide);
                   break;
                 case 175:
                   photoMeta1.mPlayerPanelUnsupportedType = this.p0.read(p0);
                   break;
                 case 176:
                   photoMeta1.mMagicFaces = this.o.read(p0);
                   break;
                 case 177:
                   photoMeta1.mEnhanceDescAreaCollectButton = KnownTypeAdapters$g.a(p0, photoMeta1.mEnhanceDescAreaCollectButton);
                   break;
                 case 178:
                   photoMeta1.mHasMagicFaceTag = KnownTypeAdapters$g.a(p0, photoMeta1.mHasMagicFaceTag);
                   break;
                 case 179:
                   photoMeta1.mFollowShootModel = this.t.read(p0);
                   break;
                 case 180:
                   photoMeta1.mEditInfo = this.L.read(p0);
                   break;
                 case 181:
                   photoMeta1.mCollectPopup = this.d0.read(p0);
                   break;
                 case 182:
                   photoMeta1.activityLike = KnownTypeAdapters$g.a(p0, photoMeta1.activityLike);
                   break;
                 case 183:
                   photoMeta1.mFansTopPurchaseText = TypeAdapters.A.read(p0);
                   break;
                 case 184:
                   photoMeta1.mCoCreateInvitationInfo = this.w0.read(p0);
                   break;
                 case 185:
                   photoMeta1.mLiveRoomType = TypeAdapters.A.read(p0);
                   break;
                 case 186:
                   photoMeta1.mCollectGuideInfo = this.m0.read(p0);
                   break;
                 case 187:
                   photoMeta1.mFollowLikers = this.e.read(p0);
                   break;
                 case 188:
                   photoMeta1.mDisplayTime = TypeAdapters.A.read(p0);
                   break;
                 case 189:
                   photoMeta1.mIsShareCountExp = KnownTypeAdapters$g.a(p0, photoMeta1.mIsShareCountExp);
                   break;
                 case 190:
                   photoMeta1.mPlaybackViewCount = KnownTypeAdapters$k.a(p0, photoMeta1.mPlaybackViewCount);
                   break;
                 case 191:
                   photoMeta1.mPhotoStatus = KnownTypeAdapters$k.a(p0, photoMeta1.mPhotoStatus);
                   break;
                 case 192:
                   photoMeta1.activityPressLike = KnownTypeAdapters$g.a(p0, photoMeta1.activityPressLike);
                   break;
                 case 193:
                   photoMeta1.mShowFriendInviteButton = KnownTypeAdapters$g.a(p0, photoMeta1.mShowFriendInviteButton);
                   break;
                 case 194:
                   photoMeta1.mCollected = KnownTypeAdapters$g.a(p0, photoMeta1.mCollected);
                   break;
                 case 195:
                   photoMeta1.mFeedBottomRightSummary = this.A.read(p0);
                   break;
                 case 196:
                   photoMeta1.mPlcEntryStyleData = TypeAdapters.A.read(p0);
                   break;
                 case 197:
                   photoMeta1.mInteractStickerInfo = this.w.read(p0);
                   break;
                 case 198:
                   photoMeta1.mInteractStickerType = KnownTypeAdapters$k.a(p0, photoMeta1.mInteractStickerType);
                   break;
                 case 199:
                   photoMeta1.mEnhanceCommentInputBox = KnownTypeAdapters$g.a(p0, photoMeta1.mEnhanceCommentInputBox);
                   break;
                 case 200:
                   photoMeta1.mPostOperationEntranceInfo = this.X.read(p0);
                   break;
                 case 201:
                   photoMeta1.mShareToFollowModel = this.z.read(p0);
                   break;
                 case 202:
                   photoMeta1.mShowPos = TypeAdapters.A.read(p0);
                   break;
                 case 203:
                   photoMeta1.mRecommendStripe = TypeAdapters.A.read(p0);
                   break;
                 case 204:
                   photoMeta1.mMagicFace = this.i.read(p0);
                   break;
                 case 205:
                   photoMeta1.mPostShowInfo = this.i0.read(p0);
                   break;
                 case 206:
                   photoMeta1.mMessageGroupId = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return photoMeta1;
       }
    }
    public void b(b p0,PhotoMeta p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoMeta$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("us_d");
          p0.K((long)p1.mUsD);
          p0.r("us_c");
          p0.K((long)p1.mUsC);
          p0.r("downloadSetting");
          p0.K((long)p1.mDownloadSetting);
          p0.r("comment_count");
          p0.K((long)p1.mCommentCount);
          if (p1.mExtraComments != null) {
             p0.r("comments");
             this.c.write(p0, p1.mExtraComments);
          }
          if (p1.mExposeComments != null) {
             p0.r("exposedComments");
             this.c.write(p0, p1.mExposeComments);
          }
          if (p1.mGodCommentList != null) {
             p0.r("godCommentList");
             this.c.write(p0, p1.mGodCommentList);
          }
          p0.r("collected");
          p0.P(p1.mCollected);
          p0.r("collect_count");
          p0.K(p1.mCollectCount);
          if (p1.mRecommendHintText != null) {
             p0.r("recommendHintText");
             TypeAdapters.A.write(p0, p1.mRecommendHintText);
          }
          if (p1.mRecommendHintTextSourceId != null) {
             p0.r("recommendHintTextSourceId");
             TypeAdapters.A.write(p0, p1.mRecommendHintTextSourceId);
          }
          if (p1.mRecommendHintTextSourceType != null) {
             p0.r("recommendHintTextSourceType");
             TypeAdapters.A.write(p0, p1.mRecommendHintTextSourceType);
          }
          p0.r("liked");
          p0.K((long)p1.mLiked);
          if (p1.mExtraLikers != null) {
             p0.r("likers");
             this.e.write(p0, p1.mExtraLikers);
          }
          if (p1.mFollowLikers != null) {
             p0.r("followLikers");
             this.e.write(p0, p1.mFollowLikers);
          }
          if (p1.mPhotoId != null) {
             p0.r("photo_id");
             TypeAdapters.A.write(p0, p1.mPhotoId);
          }
          if (p1.mLiveTipInfo != null) {
             p0.r("living");
             this.f.write(p0, p1.mLiveTipInfo);
          }
          if (p1.mOriginalPhotoId != null) {
             p0.r("originalPhotoId");
             TypeAdapters.A.write(p0, p1.mOriginalPhotoId);
          }
          if (p1.mKwaiId != null) {
             p0.r("kwaiId");
             TypeAdapters.A.write(p0, p1.mKwaiId);
          }
          p0.r("photo_status");
          p0.K((long)p1.mPhotoStatus);
          if (p1.mVisibilityExpiration != null) {
             p0.r("visibilityExpiration");
             this.g.write(p0, p1.mVisibilityExpiration);
          }
          p0.r("like_count");
          p0.K((long)p1.mLikeCount);
          p0.r("showLikeCount");
          p0.P(p1.mShowLikeCount);
          p0.r("myfollowShowTime");
          p0.P(p1.mMyfollowShowTime);
          p0.r("view_count");
          p0.K((long)p1.mViewCount);
          p0.r("viewer_count");
          p0.K((long)p1.mViewerCount);
          p0.r("viewer_entrance");
          p0.P(p1.mViewerEntrance);
          p0.r("showLikeList");
          p0.P(p1.mShowLikeList);
          p0.r("playback_like_count");
          p0.K((long)p1.mPlaybackLikeCount);
          p0.r("playback_view_count");
          p0.K((long)p1.mPlaybackViewCount);
          p0.r("share_count");
          p0.K((long)p1.mShareCount);
          p0.r("downloadCount");
          p0.K((long)p1.mDownloadCount);
          p0.r("tag_hash_type");
          p0.K((long)p1.mTagHashType);
          p0.r("hasMusicTag");
          p0.P(p1.mHasMusicTag);
          if (p1.mMusic != null) {
             p0.r("music");
             this.h.write(p0, p1.mMusic);
          }
          p0.r("needEnhanceMagicFaceTag");
          p0.P(p1.mNeedEnhanceMagicFaceTag);
          p0.r("hasMagicFaceTag");
          p0.P(p1.mHasMagicFaceTag);
          if (p1.mMagicFace != null) {
             p0.r("magicFace");
             this.i.write(p0, p1.mMagicFace);
          }
          if (p1.mTagItems != null) {
             p0.r("tags");
             this.k.write(p0, p1.mTagItems);
          }
          if (p1.mHotPageTagItems != null) {
             p0.r("hotPageTags");
             this.k.write(p0, p1.mHotPageTagItems);
          }
          p0.r("enableV4Head");
          p0.P(p1.mEnableV4Head);
          if (p1.mAtUserItems != null) {
             p0.r("currentAtUserStates");
             this.m.write(p0, p1.mAtUserItems);
          }
          p0.r("tagTop");
          p0.P(p1.mTagTop);
          p0.r("show_count");
          p0.K(p1.mShowCount);
          p0.r("snapShowDeadline");
          p0.K(p1.mSnapShowDeadline);
          p0.r("inappropriate");
          p0.P(p1.mInappropriate);
          p0.r("profile_top_photo");
          p0.P(p1.mTopPhoto);
          p0.r("profileUserTopPhoto");
          p0.P(p1.mIsPhotoTop);
          p0.r("profileUserCopyTopPhoto");
          p0.P(p1.mIsPhotoCopyTop);
          if (p1.mDisplayTime != null) {
             p0.r("displayTime");
             TypeAdapters.A.write(p0, p1.mDisplayTime);
          }
          if (p1.mTime != null) {
             p0.r("time");
             TypeAdapters.A.write(p0, p1.mTime);
          }
          p0.r("timestamp");
          p0.K(p1.mTimeStamp);
          p0.r("starci");
          p0.P(p1.mStarci);
          p0.r("hated");
          p0.K((long)p1.mHated);
          if (p1.mDisclaimerMessage != null) {
             p0.r("disclaimerMessage");
             TypeAdapters.A.write(p0, p1.mDisclaimerMessage);
          }
          if (p1.mQuestionnaireInfo != null) {
             p0.r("operationFeedContext");
             this.n.write(p0, p1.mQuestionnaireInfo);
          }
          if (p1.mMagicFaces != null) {
             p0.r("magicFaces");
             this.o.write(p0, p1.mMagicFaces);
          }
          p0.r("disableTranscodeHiddenUserInfo");
          p0.P(p1.mDisableTranscodeHiddenUserInfo);
          if (p1.mFashionShowInfo != null) {
             p0.r("fashionEntranceShow");
             this.p.write(p0, p1.mFashionShowInfo);
          }
          if (p1.mPhotoRelationEntrance != null) {
             p0.r("photoRelationEntrance");
             this.q.write(p0, p1.mPhotoRelationEntrance);
          }
          if (p1.mVisibleLevel != null) {
             p0.r("visibleLevel");
             this.r.write(p0, p1.mVisibleLevel);
          }
          p0.r("forward_count");
          p0.K((long)p1.mForwardCount);
          p0.r("us_l");
          p0.P(p1.mUseLive);
          if (p1.mSameFrameInfo != null) {
             p0.r("sameFrame");
             this.s.write(p0, p1.mSameFrameInfo);
          }
          p0.r("recreationSetting");
          p0.K((long)p1.mRecreationSetting);
          p0.r("mFollowShootType");
          p0.K((long)p1.mFollowShootType);
          if (p1.mFollowShootModel != null) {
             p0.r("followShoot");
             this.t.write(p0, p1.mFollowShootModel);
          }
          if (p1.mLipsSyncModel != null) {
             p0.r("lipsSyncPhoto");
             this.u.write(p0, p1.mLipsSyncModel);
          }
          p0.r("atMePhotoPrivacyStatus");
          p0.K((long)p1.mAtMePhotoPrivacyStatus);
          if (p1.mCommentAtBubbleMessage != null) {
             p0.r("commentAtBubbleMessage");
             TypeAdapters.A.write(p0, p1.mCommentAtBubbleMessage);
          }
          p0.r("canShowQuickCommentGuide");
          p0.P(p1.mCanShowQuickCommentGuide);
          p0.r("enableStrengthenEntrance");
          p0.P(p1.mEnableStrengthenEntrance);
          if (p1.mToolBoxButtonText != null) {
             p0.r("buttonText");
             TypeAdapters.A.write(p0, p1.mToolBoxButtonText);
          }
          if (p1.mLocalVideoUrl != null) {
             p0.r("localVideoUrl");
             TypeAdapters.A.write(p0, p1.mLocalVideoUrl);
          }
          if (p1.mKaraokeChorusModel != null) {
             p0.r("karaokeDuet");
             this.v.write(p0, p1.mKaraokeChorusModel);
          }
          p0.r("visibleRelation");
          p0.K((long)p1.mFriendsVisibility);
          if (p1.mMessageGroupId != null) {
             p0.r("imGroupId");
             TypeAdapters.A.write(p0, p1.mMessageGroupId);
          }
          p0.r("interactStickerType");
          p0.K((long)p1.mInteractStickerType);
          if (p1.mInteractStickerInfo != null) {
             p0.r("interactStickerInfo");
             this.w.write(p0, p1.mInteractStickerInfo);
          }
          if (p1.mExtEntryModel != null) {
             p0.r("extEntry");
             this.x.write(p0, p1.mExtEntryModel);
          }
          if (p1.mSoundTrack != null) {
             p0.r("soundTrack");
             this.h.write(p0, p1.mSoundTrack);
          }
          if (p1.mKaraokeModel != null) {
             p0.r("ext_params");
             this.y.write(p0, p1.mKaraokeModel);
          }
          p0.r("pending");
          p0.P(p1.mIsPending);
          if (p1.mAdminTagsModels != null) {
             p0.r("adminTags");
             this.k.write(p0, p1.mAdminTagsModels);
          }
          if (p1.mShareToFollowModel != null) {
             p0.r("shareToFollow");
             this.z.write(p0, p1.mShareToFollowModel);
          }
          p0.r("relationshipChainPhoto");
          p0.P(p1.mIsRelationPhoto);
          if (p1.mFeedBottomRightSummary != null) {
             p0.r("feedBottomRightSummary");
             this.A.write(p0, p1.mFeedBottomRightSummary);
          }
          if (p1.mPhotoTextLocationInfo != null) {
             p0.r("photoTextLocationInfo");
             this.B.write(p0, p1.mPhotoTextLocationInfo);
          }
          p0.r("photoSkipCrop");
          p0.P(p1.mPhotoSkipCrop);
          if (p1.mPhotoDisplayLocationInfo != null) {
             p0.r("photoDisplayLocationInfo");
             this.C.write(p0, p1.mPhotoDisplayLocationInfo);
          }
          if (p1.mVideoQualityInfo != null) {
             p0.r("videoQualityPanel");
             this.D.write(p0, p1.mVideoQualityInfo);
          }
          if (p1.mMovieTitle != null) {
             p0.r("movieTitle");
             TypeAdapters.A.write(p0, p1.mMovieTitle);
          }
          p0.r("needActionSurvey");
          p0.P(p1.mNeedActionSurvey);
          if (p1.mSupportSurveyActionList != null) {
             p0.r("supportSurveyActionList");
             this.E.write(p0, p1.mSupportSurveyActionList);
          }
          p0.r("actionSurveyType");
          p0.K((long)p1.mActionSurveyType);
          p0.r("surveyBizType");
          p0.K((long)p1.mSurveyBizType);
          if (p1.mSelectionSurveyActions != null) {
             p0.r("selectionSurveyActions");
             this.F.write(p0, p1.mSelectionSurveyActions);
          }
          if (p1.mSelectionSurveyId != null) {
             p0.r("selectionSurveyId");
             TypeAdapters.A.write(p0, p1.mSelectionSurveyId);
          }
          if (p1.mSurveyInfoId != null) {
             p0.r("surveyInfoId");
             TypeAdapters.A.write(p0, p1.mSurveyInfoId);
          }
          p0.r("hasSurvey");
          p0.P(p1.mHasSurvey);
          p0.r("geminiHotSurveyDisplayStrategy");
          p0.K((long)p1.mGeminiHotSurveyDisplayStrategy);
          p0.r("enableClsGuide");
          p0.P(p1.mEnableClsGuide);
          if (p1.mRecommendStripe != null) {
             p0.r("recommendStripe");
             TypeAdapters.A.write(p0, p1.mRecommendStripe);
          }
          if (p1.mPlcEntryStyleInfo != null) {
             p0.r("plcFeatureEntry");
             this.G.write(p0, p1.mPlcEntryStyleInfo);
          }
          if (p1.mLabelFeatureEntry != null) {
             p0.r("labelFeatureEntry");
             this.H.write(p0, p1.mLabelFeatureEntry);
          }
          p0.r("noNeedToRequestPLCApi");
          p0.P(p1.mNoNeedToRequestPlcEntryStyleInfo);
          p0.r("plcResponseTime");
          p0.K(p1.mPlcResponseTime);
          p0.r("plcHighPriorityThanBottomEntry");
          p0.P(p1.mPlcHighPriorityThanBottomEntry);
          if (p1.mAcquaintanceFeedRelationText != null) {
             p0.r("acquaintanceRecommendOuterText");
             TypeAdapters.A.write(p0, p1.mAcquaintanceFeedRelationText);
          }
          if (p1.mAcquaintanceDetailRelationText != null) {
             p0.r("acquaintanceRecommendInnerText");
             TypeAdapters.A.write(p0, p1.mAcquaintanceDetailRelationText);
          }
          if (p1.mAcquaintanceReplaceNames != null) {
             p0.r("acquaintanceReplaceNames");
             this.J.write(p0, p1.mAcquaintanceReplaceNames);
          }
          p0.r("recoType");
          p0.K((long)p1.mRecoType);
          if (p1.mPlcEntryStyleData != null) {
             p0.r("plcFeatureEntryData");
             TypeAdapters.A.write(p0, p1.mPlcEntryStyleData);
          }
          p0.r("similarPhotoStyle");
          p0.K((long)p1.mSimilarPhotoStyle);
          p0.r("selectionSimilarPhotoStyle");
          p0.K((long)p1.mFeatureSimilarPhotoStyle);
          p0.r("detailMorePhotosRecoType");
          p0.K((long)p1.mDetailMorePhotosRecoType);
          if (p1.mExtraIconInfo != null) {
             p0.r("extraIconInfo");
             this.K.write(p0, p1.mExtraIconInfo);
          }
          if (p1.mEditInfo != null) {
             p0.r("editInfo");
             this.L.write(p0, p1.mEditInfo);
          }
          if (p1.mOperationBarInfo != null) {
             p0.r("trendingInfo");
             this.M.write(p0, p1.mOperationBarInfo);
          }
          if (p1.mHotSpotInfo != null) {
             p0.r("hotSpotInfo");
             this.N.write(p0, p1.mHotSpotInfo);
          }
          if (p1.mBottomEntryInfo != null) {
             p0.r("bottomEntry");
             this.O.write(p0, p1.mBottomEntryInfo);
          }
          if (p1.mSummaryInfo != null) {
             p0.r("searchSummaryInfo");
             this.P.write(p0, p1.mSummaryInfo);
          }
          if (p1.mHighLightPosInfo != null) {
             p0.r("progressNodes");
             new KnownTypeAdapters$ArrayTypeAdapter(this.Q, new PhotoMeta$TypeAdapter$a(this)).b(p0, p1.mHighLightPosInfo);
          }
          if (p1.mSearchAiScriptInfo != null) {
             p0.r("searchAiScriptInfo");
             this.R.write(p0, p1.mSearchAiScriptInfo);
          }
          if (p1.mPhotoJudgementStatusInfo != null) {
             p0.r("photoJudgementStatusBar");
             this.S.write(p0, p1.mPhotoJudgementStatusInfo);
          }
          if (p1.mKwaiCoinTaskInfo != null) {
             p0.r("publishCoinTask");
             this.T.write(p0, p1.mKwaiCoinTaskInfo);
          }
          if (p1.mActivityUserIconMode != null) {
             p0.r("activityNickNameIcon");
             this.U.write(p0, p1.mActivityUserIconMode);
          }
          p0.r("frameStyle");
          p0.K((long)p1.mFrameStyle);
          p0.r("enableFavoriteFollowingInDetailPage");
          p0.P(p1.mEnableSpecialFocus);
          if (p1.mRewardPhotoInfo != null) {
             p0.r("photoReward");
             this.V.write(p0, p1.mRewardPhotoInfo);
          }
          p0.r("enhanceCommentInputBox");
          p0.P(p1.mEnhanceCommentInputBox);
          if (p1.mKaraokeScoreInfo != null) {
             p0.r("karaokeScoreInfo");
             this.W.write(p0, p1.mKaraokeScoreInfo);
          }
          p0.r("allowSameFrame");
          p0.P(p1.mAllowSameFrame);
          if (p1.mPostOperationEntranceInfo != null) {
             p0.r("photoProductionTypeInfo");
             this.X.write(p0, p1.mPostOperationEntranceInfo);
          }
          if (p1.mOperationExpTagDisplayInfo != null) {
             p0.r("operationExpTagDisplayInfo");
             this.Y.write(p0, p1.mOperationExpTagDisplayInfo);
          }
          if (p1.mRecoReasonTag != null) {
             p0.r("recoReasonTag");
             this.j.write(p0, p1.mRecoReasonTag);
          }
          p0.r("isIntelligenceAlbum");
          p0.P(p1.mIsIntelligenceAlbum);
          if (p1.mKyInfo != null) {
             p0.r("kyInfo");
             this.Z.write(p0, p1.mKyInfo);
          }
          p0.r("photoCommentFriendsVisible");
          p0.K((long)p1.mPhotoCommentLimitType);
          p0.r("aiCutPhotoStyleId");
          p0.K(p1.mAiCutPhotoStyleId);
          p0.r("moodTemplateId");
          p0.K(p1.mMoodTemplateId);
          p0.r("isUserStatus");
          p0.P(p1.mIsUserStatus);
          if (p1.mRecreationSettingInfo != null) {
             p0.r("recreationSettingInfo");
             this.a0.write(p0, p1.mRecreationSettingInfo);
          }
          if (p1.mHyperTag != null) {
             p0.r("hyperTag");
             this.b0.write(p0, p1.mHyperTag);
          }
          if (p1.mSocialRelationHyperTag != null) {
             p0.r("socialRelationHyperTag");
             this.b0.write(p0, p1.mSocialRelationHyperTag);
          }
          if (p1.mBottomComponentMaterial != null) {
             p0.r("bottomComponentMaterial");
             this.c0.write(p0, p1.mBottomComponentMaterial);
          }
          p0.r("commentBubble");
          p0.K((long)p1.mCommentBubble);
          p0.r("disallowShot");
          p0.P(p1.mDisallowShot);
          if (p1.mPrefetchReason != null) {
             p0.r("prefetchReason");
             TypeAdapters.A.write(p0, p1.mPrefetchReason);
          }
          p0.r("isPlayFailed");
          p0.P(p1.mIsPlayFailed);
          if (p1.mCollectPopup != null) {
             p0.r("collectPopup");
             this.d0.write(p0, p1.mCollectPopup);
          }
          if (p1.mLikeContentMap != null) {
             p0.r("likeContent");
             this.e0.write(p0, p1.mLikeContentMap);
          }
          p0.r("dynamicEffectDisable");
          p0.P(p1.mDisableLikeAnimations);
          p0.r("enableFullScreenPlay");
          p0.P(p1.mEnableFullScreenPlay);
          if (p1.mAnalysisEntranceModel != null) {
             p0.r("authorAnalysisEntry");
             this.f0.write(p0, p1.mAnalysisEntranceModel);
          }
          p0.r("fromSourceId");
          p0.K((long)p1.mFromSourceType);
          p0.r("supportType");
          p0.K((long)p1.mSupportType);
          p0.r("videoColdStartType");
          p0.K((long)p1.mVideoColdStartType);
          if (p1.mFeedSwitches != null) {
             p0.r("feedSwitches");
             this.g0.write(p0, p1.mFeedSwitches);
          }
          p0.r("activityLike");
          p0.P(p1.activityLike);
          p0.r("activityPressLike");
          p0.P(p1.activityPressLike);
          if (p1.mFansTopPurchaseUrl != null) {
             p0.r("fansTopPurchaseUrl");
             TypeAdapters.A.write(p0, p1.mFansTopPurchaseUrl);
          }
          if (p1.mFansTopPurchaseText != null) {
             p0.r("fansTopPurchaseButtonText");
             TypeAdapters.A.write(p0, p1.mFansTopPurchaseText);
          }
          if (p1.mFansTopCommentTopBarInfo != null) {
             p0.r("fansTopCommentTopBarInfo");
             this.h0.write(p0, p1.mFansTopCommentTopBarInfo);
          }
          p0.r("isShareCountExp");
          p0.P(p1.mIsShareCountExp);
          p0.r("godCommentShow");
          p0.P(p1.mHasGodCommentShow);
          p0.r("photoFollowingIntensify");
          p0.K((long)p1.mPhotoFollowingIntensify);
          if (p1.mPostShowInfo != null) {
             p0.r("posterShowInfo");
             this.i0.write(p0, p1.mPostShowInfo);
          }
          p0.r("enableCoronaDetailPage");
          p0.P(p1.mEnableCoronaDetailPage);
          p0.r("overallDetailSlideDifferent");
          p0.K((long)p1.mOverallDetailSlideDifferent);
          if (p1.mShowPos != null) {
             p0.r("showPos");
             TypeAdapters.A.write(p0, p1.mShowPos);
          }
          if (p1.mFansTopGuideTips != null) {
             p0.r("fansTopGuideTips");
             TypeAdapters.A.write(p0, p1.mFansTopGuideTips);
          }
          if (p1.mFansTopShareTips != null) {
             p0.r("fansTopShareTips");
             TypeAdapters.A.write(p0, p1.mFansTopShareTips);
          }
          if (p1.mMusicStrategy != null) {
             p0.r("musicStrategy");
             this.j0.write(p0, p1.mMusicStrategy);
          }
          if (p1.mPhotoLiveRemindInfo != null) {
             p0.r("hotLiveRemindInfo");
             this.k0.write(p0, p1.mPhotoLiveRemindInfo);
          }
          if (p1.mPhotoCommentVoteInfo != null) {
             p0.r("votes");
             this.l0.write(p0, p1.mPhotoCommentVoteInfo);
          }
          if (p1.mCollectGuideInfo != null) {
             p0.r("collectGuideInfo");
             this.m0.write(p0, p1.mCollectGuideInfo);
          }
          if (p1.mCollectFeedInfo != null) {
             p0.r("buttonGuidance");
             this.n0.write(p0, p1.mCollectFeedInfo);
          }
          p0.r("enhanceDescAreaCollectButton");
          p0.P(p1.mEnhanceDescAreaCollectButton);
          if (p1.mCollectRevisitGuidance != null) {
             p0.r("collectRevisitGuidance");
             this.o0.write(p0, p1.mCollectRevisitGuidance);
          }
          if (p1.mTtlasOcrResult != null) {
             p0.r("atlasOcrResult");
             new KnownTypeAdapters$ArrayTypeAdapter(TypeAdapters.A, new PhotoMeta$TypeAdapter$b(this)).b(p0, p1.mTtlasOcrResult);
          }
          if (p1.mPlayerPanelUnsupportedType != null) {
             p0.r("playerPanelUnsupportedType");
             this.p0.write(p0, p1.mPlayerPanelUnsupportedType);
          }
          p0.r("enableCommentTabs");
          p0.P(p1.mEnableCommentTabs);
          if (p1.mFeedbackEntryIds != null) {
             p0.r("feedbackEntryIds");
             this.E.write(p0, p1.mFeedbackEntryIds);
          }
          if (p1.mFeedbackDetailParams != null) {
             p0.r("feedbackDetailParams");
             TypeAdapters.A.write(p0, p1.mFeedbackDetailParams);
          }
          p0.r("fastCommentType");
          p0.K((long)p1.mFastCommentType);
          p0.r("enableLatestCommentTab");
          p0.P(p1.mEnableLatestCommentTab);
          if (p1.mMusicWheelInfo != null) {
             p0.r("musicDisk");
             this.q0.write(p0, p1.mMusicWheelInfo);
          }
          if (p1.mAtlasDetailTitle != null) {
             p0.r("atlasDetailTitle");
             TypeAdapters.A.write(p0, p1.mAtlasDetailTitle);
          }
          if (p1.mAtlasDetailTitleType != null) {
             p0.r("atlasDetailTitleType");
             TypeAdapters.A.write(p0, p1.mAtlasDetailTitleType);
          }
          if (p1.ptp != null) {
             p0.r("ptp");
             TypeAdapters.A.write(p0, p1.ptp);
          }
          if (p1.mKgTags != null) {
             p0.r("knowledgeCardTags");
             this.s0.write(p0, p1.mKgTags);
          }
          if (p1.mPhotoCommonTags != null) {
             p0.r("captionMatchKeyWords");
             this.t0.write(p0, p1.mPhotoCommonTags);
          }
          p0.r("currentLivingState");
          p0.P(p1.mCurrentLivingState);
          if (p1.mLiveRoomType != null) {
             p0.r("liveRoomType");
             TypeAdapters.A.write(p0, p1.mLiveRoomType);
          }
          if (p1.mCaptionTitle != null) {
             p0.r("captionTitle");
             TypeAdapters.A.write(p0, p1.mCaptionTitle);
          }
          p0.r("showFriendInviteButton");
          p0.P(p1.mShowFriendInviteButton);
          p0.r("hasAtlasText");
          p0.P(p1.mHasAtlasText);
          if (p1.mInterestManageSnackBarInfo != null) {
             p0.r("interestManageSnackBar");
             this.u0.write(p0, p1.mInterestManageSnackBarInfo);
          }
          if (p1.mCoCreateInfo != null) {
             p0.r("photoCoCreateInfo");
             this.v0.write(p0, p1.mCoCreateInfo);
          }
          p0.r("showCoCreateIcon");
          p0.P(p1.mShowCoCreateIcon);
          p0.r("subscribeNotification");
          p0.P(p1.mSubscribeNotification);
          if (p1.mCoCreateInvitationInfo != null) {
             p0.r("coCreateInvitationInfo");
             this.w0.write(p0, p1.mCoCreateInvitationInfo);
          }
          if (p1.mMMUSimilarSearchInfo != null) {
             p0.r("mmuPicSimilarSearchInfo");
             this.x0.write(p0, p1.mMMUSimilarSearchInfo);
          }
          if (p1.mInterestAdjustSnackBarInfo != null) {
             p0.r("interestSnackBarInfo");
             this.y0.write(p0, p1.mInterestAdjustSnackBarInfo);
          }
          p0.r("surveyStyle");
          p0.K((long)p1.mSurveyStyle);
          if (p1.mGeminiLogParams != null) {
             p0.r("geminiLogParams");
             this.e0.write(p0, p1.mGeminiLogParams);
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
