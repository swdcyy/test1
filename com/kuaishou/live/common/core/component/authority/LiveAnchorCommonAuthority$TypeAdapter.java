package com.kuaishou.live.common.core.component.authority.LiveAnchorCommonAuthority$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.live.common.core.component.authority.LiveAnchorCommonAuthority;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.live.core.show.fansgroup.LiveFansGroupInfo;
import com.kuaishou.live.ad.model.LiveAnchorBuyPushInfo;
import com.kuaishou.live.common.core.component.authority.LiveDataAnalysisResponse$DataAnalysisInfo;
import com.kuaishou.live.core.show.paidshow.model.LivePaidShowInfo;
import com.kwai.feature.api.live.merchant.authority.LiveAnchorBannedFunction;
import com.kuaishou.live.common.core.component.authority.LiveAnchorTaskResponse;
import com.kuaishou.live.core.show.admin.model.LiveAdminAssistantConfig;
import com.kuaishou.live.common.core.component.authority.LiveDefaultDecorationConfig;
import com.kuaishou.live.common.core.component.authority.AnchorInfoAreaConfig;
import com.kuaishou.live.common.core.component.authority.LiveAnchorMagicFaceExpression;
import com.kuaishou.live.common.core.component.authority.LiveAnchorStartPushEntryResponse;
import com.kuaishou.live.common.core.component.authority.LiveAnchorRecruitConfig;
import com.kuaishou.live.common.core.component.authority.LiveAnchorVoiceCommentConfig;
import com.kuaishou.live.common.core.component.authority.LiveAuthorBannerInfo;
import com.kuaishou.live.common.core.component.chat.authority.LiveAnchorChatConfig;
import com.kuaishou.live.common.core.component.authority.LiveMmuHighlightConfig;
import com.kuaishou.live.common.core.component.authority.LiveAnchorCommonAuthority$LiveWishListInfo;
import com.kuaishou.live.common.core.component.authority.LiveAnchorBlindDateConfig;
import com.kuaishou.live.common.core.component.authority.LiveAnchorCommonAuthority$LiveAnonymousConfig;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.internal.bind.TypeAdapters;
import java.util.List;
import com.google.gson.stream.b;

public final class LiveAnchorCommonAuthority$TypeAdapter extends TypeAdapter	// class@000f67
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
    public static final a v;

    static {
       LiveAnchorCommonAuthority$TypeAdapter.v = a.get(LiveAnchorCommonAuthority.class);
    }
    public void LiveAnchorCommonAuthority$TypeAdapter(Gson p0){
       int i = this;
       Gson gson = p0;
       super();
       i.a = gson;
       i.b = gson.j(a.get(LiveFansGroupInfo.class));
       i.c = gson.j(a.get(LiveAnchorBuyPushInfo.class));
       i.d = gson.j(a.get(LiveDataAnalysisResponse$DataAnalysisInfo.class));
       i.e = gson.j(a.get(LivePaidShowInfo.class));
       TypeAdapter typeAdapter = gson.j(a.get(LiveAnchorBannedFunction.class));
       i.f = typeAdapter;
       i.g = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       i.h = gson.j(a.get(LiveAnchorTaskResponse.class));
       i.i = gson.j(a.get(LiveAdminAssistantConfig.class));
       i.j = gson.j(a.get(LiveDefaultDecorationConfig.class));
       i.k = gson.j(a.get(AnchorInfoAreaConfig.class));
       i.l = gson.j(a.get(LiveAnchorMagicFaceExpression.class));
       i.m = gson.j(a.get(LiveAnchorStartPushEntryResponse.class));
       i.n = gson.j(a.get(LiveAnchorRecruitConfig.class));
       i.o = gson.j(a.get(LiveAnchorVoiceCommentConfig.class));
       i.p = gson.j(a.get(LiveAuthorBannerInfo.class));
       i.q = gson.j(a.get(LiveAnchorChatConfig.class));
       i.r = gson.j(a.get(LiveMmuHighlightConfig.class));
       i.s = gson.j(a.get(LiveAnchorCommonAuthority$LiveWishListInfo.class));
       i.t = gson.j(a.get(LiveAnchorBlindDateConfig.class));
       i.u = gson.j(a.get(LiveAnchorCommonAuthority$LiveAnonymousConfig.class));
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveAnchorCommonAuthority$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = p0.J();
          int i = 0;
          if (JsonToken.NULL == obj) {
             p0.A();
          }else if(JsonToken.BEGIN_OBJECT != obj){
             p0.Q();
          }else {
             p0.c();
             obj = new LiveAnchorCommonAuthority();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x81175b18:
                      if (str.equals("showLivePlaybackSwitch")) {
                         i = 0;
                      }
                      break;
                    case 0x8372bf56:
                      if (str.equals("disablePkRecoReport")) {
                         i = 1;
                      }
                      break;
                    case 0x88117ddf:
                      if (str.equals("anonymousLiveSwitchStatus")) {
                         i = 2;
                      }
                      break;
                    case 0x8f4fbe67:
                      if (str.equals("enableBackgroundMusicTip")) {
                         i = 3;
                      }
                      break;
                    case 0x94836874:
                      if (str.equals("enableAuthorRoomVip")) {
                         i = 4;
                      }
                      break;
                    case 0x96dd72b7:
                      if (str.equals("enableVoiceParty")) {
                         i = 5;
                      }
                      break;
                    case 0x970d512e:
                      if (str.equals("enableLiveSticker")) {
                         i = 6;
                      }
                      break;
                    case 0x9710a2b5:
                      if (str.equals("authorBuyPush")) {
                         i = 7;
                      }
                      break;
                    case 0x987fa566:
                      if (str.equals("enableAuthorChat")) {
                         i = 8;
                      }
                      break;
                    case 0x98d88350:
                      if (str.equals("enableRePush")) {
                         i = 9;
                      }
                      break;
                    case 0x9aa45b53:
                      if (str.equals("bannedBizList")) {
                         i = 10;
                      }
                      break;
                    case 0x9ad08baf:
                      if (str.equals("enableLightBeauty")) {
                         i = 11;
                      }
                      break;
                    case 0x9ea8f53f:
                      if (str.equals("mmuHighLight")) {
                         i = 12;
                      }
                      break;
                    case 0x9f29efd6:
                      if (str.equals("enableLiveBulletin")) {
                         i = 13;
                      }
                      break;
                    case 0x9fabeaf3:
                      if (str.equals("enableSetAutoAboard")) {
                         i = 14;
                      }
                      break;
                    case 0xa20a649e:
                      if (str.equals("enableLiveVoicePartyPk")) {
                         i = 15;
                      }
                      break;
                    case 0xa527c3c0:
                      if (str.equals("assistantConfig")) {
                         i = 16;
                      }
                      break;
                    case 0xa6476860:
                      if (str.equals("rotationConfig")) {
                         i = 17;
                      }
                      break;
                    case 0xa8631edf:
                      if (str.equals("enable4GQos")) {
                         i = 18;
                      }
                      break;
                    case 0xabde37e2:
                      if (str.equals("magicFaceExpression")) {
                         i = 19;
                      }
                      break;
                    case 0xb1820745:
                      if (str.equals("enableAuthorCityRank")) {
                         i = 20;
                      }
                      break;
                    case 0xb1b1d484:
                      if (str.equals("enableGuideStartPk")) {
                         i = 21;
                      }
                      break;
                    case 0xb3c32a6f:
                      if (str.equals("voiceCommentConfig")) {
                         i = 22;
                      }
                      break;
                    case 0xb4a3df17:
                      if (str.equals("enableLuckyStar")) {
                         i = 23;
                      }
                      break;
                    case 0xbd3495f0:
                      if (str.equals("enableVoiceComment")) {
                         i = 24;
                      }
                      break;
                    case 0xc3e113d0:
                      if (str.equals("enableRoomVipWatchingList")) {
                         i = 25;
                      }
                      break;
                    case 0xc403d38c:
                      if (str.equals("enablePrivateLive")) {
                         i = 26;
                      }
                      break;
                    case 0xc497c8d1:
                      if (str.equals("enableMusicStationAuthorApply")) {
                         i = 27;
                      }
                      break;
                    case 0xc68b3e05:
                      if (str.equals("voiceCommentNotice")) {
                         i = 28;
                      }
                      break;
                    case 0xccfe5e90:
                      if (str.equals("enableShowDisplayGiftFeed")) {
                         i = 29;
                      }
                      break;
                    case 0xcdc64252:
                      if (str.equals("enableMerchantSticker")) {
                         i = 30;
                      }
                      break;
                    case 0xcf61cd6e:
                      if (str.equals("enableAuthorShowPkGiftAnimation")) {
                         i = 31;
                      }
                      break;
                    case 0xd0817d3c:
                      if (str.equals("disableAuthorChatShopCartControl")) {
                         i = 32;
                      }
                      break;
                    case 0xd6460e16:
                      if (str.equals("enableCommentAreaOptimization")) {
                         i = 33;
                      }
                      break;
                    case 0xdce454b1:
                      if (str.equals("disableVoicePartyKtv")) {
                         i = 34;
                      }
                      break;
                    case 0xe2514dd1:
                      if (str.equals("defaultDecoration")) {
                         i = 35;
                      }
                      break;
                    case 0xe3dc7c4c:
                      if (str.equals("enableEntrust")) {
                         i = 36;
                      }
                      break;
                    case 0xe3ec8e78:
                      if (str.equals("enableUploadBackgroundPic")) {
                         i = 37;
                      }
                      break;
                    case 0xe4bb88e8:
                      if (str.equals("disableCommonRedPackNewStyle")) {
                         i = 38;
                      }
                      break;
                    case 0xeac108d4:
                      if (str.equals("enableShowWeekRankSwitch")) {
                         i = 39;
                      }
                      break;
                    case 0xee78bfc7:
                      if (str.equals("enableTop1UserPrivilege")) {
                         i = 40;
                      }
                      break;
                    case 0xefeb6342:
                      if (str.equals("liveStartPushEntry")) {
                         i = 41;
                      }
                      break;
                    case 0xf2368833:
                      if (str.equals("wishListInfo")) {
                         i = 42;
                      }
                      break;
                    case 0xf2df069f:
                      if (str.equals("fansGroup")) {
                         i = 43;
                      }
                      break;
                    case 0xf3a34af1:
                      if (str.equals("liveAuthorBannerInfo")) {
                         i = 44;
                      }
                      break;
                    case 0xf5d9a06e:
                      if (str.equals("enableAuthorRedPackInteractNew")) {
                         i = 45;
                      }
                      break;
                    case 0xf9bc275a:
                      if (str.equals("enableVoicePartyOpenVideo")) {
                         i = 46;
                      }
                      break;
                    case 0xfbaaf236:
                      if (str.equals("enableAnonymousLive")) {
                         i = 47;
                      }
                      break;
                    case 0xfc99e9c8:
                      if (str.equals("redPackNewPanelLink")) {
                         i = 48;
                      }
                      break;
                    case 0xfe21dc1e:
                      if (str.equals("disableConditionShareRedPack")) {
                         i = 49;
                      }
                      break;
                    case 0x270be62:
                      if (str.equals("enableLiveAuthorRedPackCloseMention")) {
                         i = 50;
                      }
                      break;
                    case 0x6623ca4:
                      if (str.equals("enableLiveChatDefaultOpen")) {
                         i = 51;
                      }
                      break;
                    case 0x7b0ed1c:
                      if (str.equals("enableLiveChatUserApply")) {
                         i = 52;
                      }
                      break;
                    case 0xa1b4362:
                      if (str.equals("disableOpenMultiPk")) {
                         i = 53;
                      }
                      break;
                    case 0x1971cd77:
                      if (str.equals("enableOpenAskAuthor")) {
                         i = 54;
                      }
                      break;
                    case 0x1f1f743a:
                      if (str.equals("disableGiftSentRedPack")) {
                         i = 55;
                      }
                      break;
                    case 0x208787e7:
                      if (str.equals("enableVoicePartyDefaultOpenVideo")) {
                         i = 56;
                      }
                      break;
                    case 0x20b2de3e:
                      if (str.equals("enableHourRankAuthor")) {
                         i = 57;
                      }
                      break;
                    case 0x21001160:
                      if (str.equals("enableQuarterRankAuthor")) {
                         i = 58;
                      }
                      break;
                    case 0x23ef89eb:
                      if (str.equals("enableProShopAuthor")) {
                         i = 59;
                      }
                      break;
                    case 0x2ad86817:
                      if (str.equals("enableHourRankResultV2Author")) {
                         i = 60;
                      }
                      break;
                    case 0x32b825b3:
                      if (str.equals("disableFansGroupRedPack")) {
                         i = 61;
                      }
                      break;
                    case 0x337315ee:
                      if (str.equals("enableMultiChat")) {
                         i = 62;
                      }
                      break;
                    case 0x36956be9:
                      if (str.equals("paidShow")) {
                         i = 63;
                      }
                      break;
                    case 0x3b34ca95:
                      if (str.equals("disableVoicePartyTheater")) {
                         i = 64;
                      }
                      break;
                    case 0x3daac274:
                      if (str.equals("enableShowWatchingListConsumptionData")) {
                         i = 65;
                      }
                      break;
                    case 0x3fb3533e:
                      if (str.equals("enableShowLiveAgreement")) {
                         i = 66;
                      }
                      break;
                    case 0x4550b51c:
                      if (str.equals("enableCommonRedPack")) {
                         i = 67;
                      }
                      break;
                    case 0x45ef289b:
                      if (str.equals("disableAuthorTaskExitRetain")) {
                         i = 68;
                      }
                      break;
                    case 0x4d164afe:
                      if (str.equals("enableStartPushFeedback")) {
                         i = 69;
                      }
                      break;
                    case 0x4f032156:
                      if (str.equals("enableVoicePartyNearbyEntranceOpen")) {
                         i = 70;
                      }
                      break;
                    case 0x4f972b9b:
                      if (str.equals("anonymousLiveConfig")) {
                         i = 71;
                      }
                      break;
                    case 0x524d012a:
                      if (str.equals("livePlusRecruiting")) {
                         i = 72;
                      }
                      break;
                    case 0x564c3fb2:
                      if (str.equals("liveDataAnalysis")) {
                         i = 73;
                      }
                      break;
                    case 0x579f098b:
                      if (str.equals("enableVoicePartyBombGame")) {
                         i = 74;
                      }
                      break;
                    case 0x58162dc6:
                      if (str.equals("liveAuthorActivity")) {
                         i = 75;
                      }
                      break;
                    case 0x587ec8f2:
                      if (str.equals("enableOneKsCoinDrawingGift")) {
                         i = 76;
                      }
                      break;
                    case 0x5c26b5e1:
                      if (str.equals("enableGuideStartVoiceRobot")) {
                         i = 77;
                      }
                      break;
                    case 0x5da6990c:
                      if (str.equals("enableGuideStartAuthorChat")) {
                         i = 78;
                      }
                      break;
                    case 0x5fba76c6:
                      if (str.equals("liveChatConfig")) {
                         i = 79;
                      }
                      break;
                    case 0x6137a360:
                      if (str.equals("enablePkTabSelectRemember")) {
                         i = 80;
                      }
                      break;
                    case 0x649597f9:
                      if (str.equals("enableVoicePartySendGiftToGuestCommission")) {
                         i = 81;
                      }
                      break;
                    case 0x65930de0:
                      if (str.equals("disableLiveShopEntrance")) {
                         i = 82;
                      }
                      break;
                    case 0x665c8ccc:
                      if (str.equals("disableStartFormatPk")) {
                         i = 83;
                      }
                      break;
                    case 0x69007899:
                      if (str.equals("enableLiveVote")) {
                         i = 84;
                      }
                      break;
                    case 0x6a8742d6:
                      if (str.equals("enableBattleHourRankAuthor")) {
                         i = 85;
                      }
                      break;
                    case 0x70a1b7ce:
                      if (str.equals("enableShowLiveTag")) {
                         i = 86;
                      }
                      break;
                    case 0x72de7d9d:
                      if (str.equals("enableShowShareGuide")) {
                         i = 87;
                      }
                      break;
                    case 0x75ea89c5:
                      if (str.equals("blindDateConfig")) {
                         i = 88;
                      }
                      break;
                    case 0x765213c4:
                      if (str.equals("disablePkShopCartControl")) {
                         i = 89;
                      }
                      break;
                    case 0x78c23e4a:
                      if (str.equals("enableDefaultBeautyLevel")) {
                         i = 90;
                      }
                      break;
                    case 0x7d9bf634:
                      if (str.equals("disableVoicePartyTeamPk")) {
                         i = 91;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mEnableShowAnchorLivePlaybackSwitch = KnownTypeAdapters$g.a(p0, obj.mEnableShowAnchorLivePlaybackSwitch);
                      break;
                    case 1:
                      obj.mDisablePkRecommendReport = KnownTypeAdapters$g.a(p0, obj.mDisablePkRecommendReport);
                      break;
                    case 2:
                      obj.mAnonymousLiveSwitchStatus = KnownTypeAdapters$g.a(p0, obj.mAnonymousLiveSwitchStatus);
                      break;
                    case 3:
                      obj.mEnableBackgroundMusicTip = KnownTypeAdapters$g.a(p0, obj.mEnableBackgroundMusicTip);
                      break;
                    case 4:
                      obj.mEnableLiveVipGrade = KnownTypeAdapters$g.a(p0, obj.mEnableLiveVipGrade);
                      break;
                    case 5:
                      obj.mEnableVoiceParty = KnownTypeAdapters$g.a(p0, obj.mEnableVoiceParty);
                      break;
                    case 6:
                      obj.mEnableLiveSticker = KnownTypeAdapters$g.a(p0, obj.mEnableLiveSticker);
                      break;
                    case 7:
                      obj.mLiveAnchorBuyPushInfo = this.c.read(p0);
                      break;
                    case 8:
                      obj.mEnableChatBetweenAnchors = KnownTypeAdapters$g.a(p0, obj.mEnableChatBetweenAnchors);
                      break;
                    case 9:
                      obj.mEnableRePush = KnownTypeAdapters$g.a(p0, obj.mEnableRePush);
                      break;
                    case 10:
                      obj.mBannedFunctionList = this.g.read(p0);
                      break;
                    case 11:
                      obj.mEnableLightBeauty = KnownTypeAdapters$g.a(p0, obj.mEnableLightBeauty);
                      break;
                    case 12:
                      obj.mLiveMmuHighLightConfig = this.r.read(p0);
                      break;
                    case 13:
                      obj.mEnableLiveAnnounce = KnownTypeAdapters$g.a(p0, obj.mEnableLiveAnnounce);
                      break;
                    case 14:
                      obj.mEnableSetVoicePartyAutoInvitation = KnownTypeAdapters$g.a(p0, obj.mEnableSetVoicePartyAutoInvitation);
                      break;
                    case 15:
                      obj.mEnableVoicePartyCrossRoomPk = KnownTypeAdapters$g.a(p0, obj.mEnableVoicePartyCrossRoomPk);
                      break;
                    case 16:
                      obj.mLiveAdminAssistantConfig = this.i.read(p0);
                      break;
                    case 17:
                      obj.mAnchorInfoAreaConfig = this.k.read(p0);
                      break;
                    case 18:
                      obj.mEnable4GQos = KnownTypeAdapters$g.a(p0, obj.mEnable4GQos);
                      break;
                    case 19:
                      obj.mMagicFaceExpression = this.l.read(p0);
                      break;
                    case 20:
                      obj.mIsCityRankEnable = KnownTypeAdapters$g.a(p0, obj.mIsCityRankEnable);
                      break;
                    case 21:
                      obj.mEnableStartPkGuide = KnownTypeAdapters$g.a(p0, obj.mEnableStartPkGuide);
                      break;
                    case 22:
                      obj.mVoiceCommentConfig = this.o.read(p0);
                      break;
                    case 23:
                      obj.mEnableLiveLuckyStar = KnownTypeAdapters$g.a(p0, obj.mEnableLiveLuckyStar);
                      break;
                    case 24:
                      obj.mEnableVoiceComment = KnownTypeAdapters$g.a(p0, obj.mEnableVoiceComment);
                      break;
                    case 25:
                      obj.mEnableLiveVipGradeWatchingList = KnownTypeAdapters$g.a(p0, obj.mEnableLiveVipGradeWatchingList);
                      break;
                    case 26:
                      obj.mEnablePrivateLive = KnownTypeAdapters$g.a(p0, obj.mEnablePrivateLive);
                      break;
                    case 27:
                      obj.mEnableApplyMusicStation = KnownTypeAdapters$g.a(p0, obj.mEnableApplyMusicStation);
                      break;
                    case 28:
                      obj.mVoiceCommentNotice = TypeAdapters.A.read(p0);
                      break;
                    case 29:
                      obj.mEnableCommentMergeGiftFeed = KnownTypeAdapters$g.a(p0, obj.mEnableCommentMergeGiftFeed);
                      break;
                    case 30:
                      obj.mEnableMerchantSticker = KnownTypeAdapters$g.a(p0, obj.mEnableMerchantSticker);
                      break;
                    case 31:
                      obj.mEnableShowPkGiftEffectDuringPK = KnownTypeAdapters$g.a(p0, obj.mEnableShowPkGiftEffectDuringPK);
                      break;
                    case 32:
                      obj.mDisableMerchantForbiddenWhenChat = KnownTypeAdapters$g.a(p0, obj.mDisableMerchantForbiddenWhenChat);
                      break;
                    case '!':
                      obj.mEnableCommentAreaOptimization = KnownTypeAdapters$g.a(p0, obj.mEnableCommentAreaOptimization);
                      break;
                    case '"':
                      obj.mDisableVoicePartyKtv = KnownTypeAdapters$g.a(p0, obj.mDisableVoicePartyKtv);
                      break;
                    case '#':
                      obj.mDefaultDecorationConfig = this.j.read(p0);
                      break;
                    case '$':
                      obj.mEnableLiveEscrow = KnownTypeAdapters$g.a(p0, obj.mEnableLiveEscrow);
                      break;
                    case '%':
                      obj.mEnableVoicePartyUploadBackground = KnownTypeAdapters$g.a(p0, obj.mEnableVoicePartyUploadBackground);
                      break;
                    case '&':
                      obj.mDisableCommonRedPacketNewStyle = KnownTypeAdapters$g.a(p0, obj.mDisableCommonRedPacketNewStyle);
                      break;
                    case 39:
                      obj.mEnableShowWeekRankSwitch = KnownTypeAdapters$g.a(p0, obj.mEnableShowWeekRankSwitch);
                      break;
                    case '(':
                      obj.mEnableGiftSenderTop = KnownTypeAdapters$g.a(p0, obj.mEnableGiftSenderTop);
                      break;
                    case ')':
                      obj.mLiveAnchorStartPushEntryResponse = this.m.read(p0);
                      break;
                    case '*':
                      obj.mLiveWishListInfo = this.s.read(p0);
                      break;
                    case '+':
                      obj.mLiveFansGroupInfo = this.b.read(p0);
                      break;
                    case ',':
                      obj.mLiveAuthorBannerInfo = this.p.read(p0);
                      break;
                    case '-':
                      obj.mEnableKrnSendRedPacketPanel = KnownTypeAdapters$g.a(p0, obj.mEnableKrnSendRedPacketPanel);
                      break;
                    case '.':
                      obj.mEnableVoicePartyOpenVideo = KnownTypeAdapters$g.a(p0, obj.mEnableVoicePartyOpenVideo);
                      break;
                    case '/':
                      obj.mEnableAnonymousLive = KnownTypeAdapters$g.a(p0, obj.mEnableAnonymousLive);
                      break;
                    case '0':
                      obj.mKrnSendRedPacketPanelRouter = TypeAdapters.A.read(p0);
                      break;
                    case '1':
                      obj.mDisableShareConditionRedPacket = KnownTypeAdapters$g.a(p0, obj.mDisableShareConditionRedPacket);
                      break;
                    case '2':
                      obj.mEnableRedPacketLiveCloseTip = KnownTypeAdapters$g.a(p0, obj.mEnableRedPacketLiveCloseTip);
                      break;
                    case '3':
                      obj.mIsChatWithGuestDefaultOpen = KnownTypeAdapters$g.a(p0, obj.mIsChatWithGuestDefaultOpen);
                      break;
                    case '4':
                      obj.mEnableLiveChatAudienceApply = KnownTypeAdapters$g.a(p0, obj.mEnableLiveChatAudienceApply);
                      break;
                    case '5':
                      obj.mDisableOpenMultiPk = KnownTypeAdapters$g.a(p0, obj.mDisableOpenMultiPk);
                      break;
                    case '6':
                      obj.mEnableOpenAskAuthor = KnownTypeAdapters$g.a(p0, obj.mEnableOpenAskAuthor);
                      break;
                    case '7':
                      obj.mDisableGiftConditionRedPacket = KnownTypeAdapters$g.a(p0, obj.mDisableGiftConditionRedPacket);
                      break;
                    case '8':
                      obj.mEnableVoicePartyDefaultOpenVideo = KnownTypeAdapters$g.a(p0, obj.mEnableVoicePartyDefaultOpenVideo);
                      break;
                    case '9':
                      obj.mIsHourlyRankEntryEnable = KnownTypeAdapters$g.a(p0, obj.mIsHourlyRankEntryEnable);
                      break;
                    case ':':
                      obj.mIsHourlyQuarterRankEnable = KnownTypeAdapters$g.a(p0, obj.mIsHourlyQuarterRankEnable);
                      break;
                    case ';':
                      obj.mEnableLiveProfessionalMerchant = KnownTypeAdapters$g.a(p0, obj.mEnableLiveProfessionalMerchant);
                      break;
                    case '<':
                      obj.mIsNewHourlyRankResultEnable = KnownTypeAdapters$g.a(p0, obj.mIsNewHourlyRankResultEnable);
                      break;
                    case '=':
                      obj.mDisableFansGroupConditionRedPacket = KnownTypeAdapters$g.a(p0, obj.mDisableFansGroupConditionRedPacket);
                      break;
                    case '>':
                      obj.mEnableMultiChat = KnownTypeAdapters$g.a(p0, obj.mEnableMultiChat);
                      break;
                    case '?':
                      obj.mLivePaidShowInfo = this.e.read(p0);
                      break;
                    case '@':
                      obj.mDisableVoicePartyTheater = KnownTypeAdapters$g.a(p0, obj.mDisableVoicePartyTheater);
                      break;
                    case 'A':
                      obj.mIsShowingConsumptionDataEnabled = KnownTypeAdapters$g.a(p0, obj.mIsShowingConsumptionDataEnabled);
                      break;
                    case 'B':
                      obj.mEnableShowLiveAgreement = KnownTypeAdapters$g.a(p0, obj.mEnableShowLiveAgreement);
                      break;
                    case 'C':
                      obj.mEnableCommonRedPack = KnownTypeAdapters$g.a(p0, obj.mEnableCommonRedPack);
                      break;
                    case 'D':
                      obj.mDisableAuthorTaskExitRetain = KnownTypeAdapters$g.a(p0, obj.mDisableAuthorTaskExitRetain);
                      break;
                    case 'E':
                      obj.mEnableStartPushFeedback = KnownTypeAdapters$g.a(p0, obj.mEnableStartPushFeedback);
                      break;
                    case 'F':
                      obj.mEnableVoicePartyNearbyEntranceOpen = KnownTypeAdapters$g.a(p0, obj.mEnableVoicePartyNearbyEntranceOpen);
                      break;
                    case 'G':
                      obj.mAnonymousLiveConfig = this.u.read(p0);
                      break;
                    case 'H':
                      obj.mLiveAnchorRecruitConfig = this.n.read(p0);
                      break;
                    case 'I':
                      obj.mDataAnalysisInfo = this.d.read(p0);
                      break;
                    case 'J':
                      obj.mEnableVoicePartyBombGame = KnownTypeAdapters$g.a(p0, obj.mEnableVoicePartyBombGame);
                      break;
                    case 'K':
                      obj.mLiveAnchorTaskResponse = this.h.read(p0);
                      break;
                    case 'L':
                      obj.mEnableOneKsCoinDrawingGift = KnownTypeAdapters$g.a(p0, obj.mEnableOneKsCoinDrawingGift);
                      break;
                    case 'M':
                      obj.mEnableStartRobot = KnownTypeAdapters$g.a(p0, obj.mEnableStartRobot);
                      break;
                    case 'N':
                      obj.mEnableStartChatBetweenAnchorsGuide = KnownTypeAdapters$g.a(p0, obj.mEnableStartChatBetweenAnchorsGuide);
                      break;
                    case 'O':
                      obj.mLiveChatConfig = this.q.read(p0);
                      break;
                    case 'P':
                      obj.mEnablePkPanelTabSelectRemember = KnownTypeAdapters$g.a(p0, obj.mEnablePkPanelTabSelectRemember);
                      break;
                    case 'Q':
                      obj.mEnableVoicePartySendGiftToGuestCommission = KnownTypeAdapters$g.a(p0, obj.mEnableVoicePartySendGiftToGuestCommission);
                      break;
                    case 'R':
                      obj.mDisableLiveShopEntrance = KnownTypeAdapters$g.a(p0, obj.mDisableLiveShopEntrance);
                      break;
                    case 'S':
                      obj.mDisableStartFormatPk = KnownTypeAdapters$g.a(p0, obj.mDisableStartFormatPk);
                      break;
                    case 'T':
                      obj.mEnableLiveVote = KnownTypeAdapters$g.a(p0, obj.mEnableLiveVote);
                      break;
                    case 'U':
                      obj.mIsHourlyRankStrengthNoticeEnable = KnownTypeAdapters$g.a(p0, obj.mIsHourlyRankStrengthNoticeEnable);
                      break;
                    case 'V':
                      obj.mEnableShowLiveTopic = KnownTypeAdapters$g.a(p0, obj.mEnableShowLiveTopic);
                      break;
                    case 'W':
                      obj.mEnableShowShareGuide = KnownTypeAdapters$g.a(p0, obj.mEnableShowShareGuide);
                      break;
                    case 'X':
                      obj.mLiveAnchorBlindDateConfig = this.t.read(p0);
                      break;
                    case 'Y':
                      obj.mDisableMerchantForbiddenWhenPk = KnownTypeAdapters$g.a(p0, obj.mDisableMerchantForbiddenWhenPk);
                      break;
                    case 'Z':
                      obj.mEnableDefaultBeautyLevel = KnownTypeAdapters$g.a(p0, obj.mEnableDefaultBeautyLevel);
                      break;
                    case '[':
                      obj.mDisableVoicePartyTeamPk = KnownTypeAdapters$g.a(p0, obj.mDisableVoicePartyTeamPk);
                      break;
                    default:
                      p0.Q();
                }
             }
             p0.j();
          }
          obj = i;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAnchorCommonAuthority$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("enableOpenAskAuthor");
          p0.P(p1.mEnableOpenAskAuthor);
          p0.r("enablePrivateLive");
          p0.P(p1.mEnablePrivateLive);
          p0.r("enableEntrust");
          p0.P(p1.mEnableLiveEscrow);
          p0.r("enableVoiceParty");
          p0.P(p1.mEnableVoiceParty);
          p0.r("enableBackgroundMusicTip");
          p0.P(p1.mEnableBackgroundMusicTip);
          p0.r("enableMusicStationAuthorApply");
          p0.P(p1.mEnableApplyMusicStation);
          p0.r("enableLiveAuthorRedPackCloseMention");
          p0.P(p1.mEnableRedPacketLiveCloseTip);
          p0.r("enableGuideStartPk");
          p0.P(p1.mEnableStartPkGuide);
          p0.r("disableVoicePartyKtv");
          p0.P(p1.mDisableVoicePartyKtv);
          p0.r("enableAuthorChat");
          p0.P(p1.mEnableChatBetweenAnchors);
          p0.r("enableGuideStartAuthorChat");
          p0.P(p1.mEnableStartChatBetweenAnchorsGuide);
          p0.r("enableLiveChatUserApply");
          p0.P(p1.mEnableLiveChatAudienceApply);
          p0.r("enableVoicePartyOpenVideo");
          p0.P(p1.mEnableVoicePartyOpenVideo);
          p0.r("enableShowLiveAgreement");
          p0.P(p1.mEnableShowLiveAgreement);
          p0.r("enableVoicePartyDefaultOpenVideo");
          p0.P(p1.mEnableVoicePartyDefaultOpenVideo);
          p0.r("enableAuthorShowPkGiftAnimation");
          p0.P(p1.mEnableShowPkGiftEffectDuringPK);
          p0.r("enableVoicePartyNearbyEntranceOpen");
          p0.P(p1.mEnableVoicePartyNearbyEntranceOpen);
          p0.r("enableOneKsCoinDrawingGift");
          p0.P(p1.mEnableOneKsCoinDrawingGift);
          p0.r("enableUploadBackgroundPic");
          p0.P(p1.mEnableVoicePartyUploadBackground);
          p0.r("enableVoicePartySendGiftToGuestCommission");
          p0.P(p1.mEnableVoicePartySendGiftToGuestCommission);
          p0.r("enableShowShareGuide");
          p0.P(p1.mEnableShowShareGuide);
          p0.r("enableCommonRedPack");
          p0.P(p1.mEnableCommonRedPack);
          p0.r("enableVoiceComment");
          p0.P(p1.mEnableVoiceComment);
          if (p1.mVoiceCommentNotice != null) {
             p0.r("voiceCommentNotice");
             TypeAdapters.A.write(p0, p1.mVoiceCommentNotice);
          }
          p0.r("enableGuideStartVoiceRobot");
          p0.P(p1.mEnableStartRobot);
          p0.r("enableSetAutoAboard");
          p0.P(p1.mEnableSetVoicePartyAutoInvitation);
          p0.r("enableLiveVote");
          p0.P(p1.mEnableLiveVote);
          p0.r("disableLiveShopEntrance");
          p0.P(p1.mDisableLiveShopEntrance);
          if (p1.mLiveFansGroupInfo != null) {
             p0.r("fansGroup");
             this.b.write(p0, p1.mLiveFansGroupInfo);
          }
          if (p1.mLiveAnchorBuyPushInfo != null) {
             p0.r("authorBuyPush");
             this.c.write(p0, p1.mLiveAnchorBuyPushInfo);
          }
          if (p1.mDataAnalysisInfo != null) {
             p0.r("liveDataAnalysis");
             this.d.write(p0, p1.mDataAnalysisInfo);
          }
          p0.r("enableProShopAuthor");
          p0.P(p1.mEnableLiveProfessionalMerchant);
          p0.r("disablePkShopCartControl");
          p0.P(p1.mDisableMerchantForbiddenWhenPk);
          p0.r("disableAuthorChatShopCartControl");
          p0.P(p1.mDisableMerchantForbiddenWhenChat);
          p0.r("disableVoicePartyTheater");
          p0.P(p1.mDisableVoicePartyTheater);
          p0.r("disableVoicePartyTeamPk");
          p0.P(p1.mDisableVoicePartyTeamPk);
          p0.r("disableStartFormatPk");
          p0.P(p1.mDisableStartFormatPk);
          p0.r("enableLuckyStar");
          p0.P(p1.mEnableLiveLuckyStar);
          p0.r("enableShowDisplayGiftFeed");
          p0.P(p1.mEnableCommentMergeGiftFeed);
          p0.r("enableLiveSticker");
          p0.P(p1.mEnableLiveSticker);
          p0.r("enableMerchantSticker");
          p0.P(p1.mEnableMerchantSticker);
          p0.r("enable4GQos");
          p0.P(p1.mEnable4GQos);
          p0.r("enableTop1UserPrivilege");
          p0.P(p1.mEnableGiftSenderTop);
          if (p1.mLivePaidShowInfo != null) {
             p0.r("paidShow");
             this.e.write(p0, p1.mLivePaidShowInfo);
          }
          if (p1.mBannedFunctionList != null) {
             p0.r("bannedBizList");
             this.g.write(p0, p1.mBannedFunctionList);
          }
          if (p1.mLiveAnchorTaskResponse != null) {
             p0.r("liveAuthorActivity");
             this.h.write(p0, p1.mLiveAnchorTaskResponse);
          }
          if (p1.mLiveAdminAssistantConfig != null) {
             p0.r("assistantConfig");
             this.i.write(p0, p1.mLiveAdminAssistantConfig);
          }
          if (p1.mDefaultDecorationConfig != null) {
             p0.r("defaultDecoration");
             this.j.write(p0, p1.mDefaultDecorationConfig);
          }
          if (p1.mAnchorInfoAreaConfig != null) {
             p0.r("rotationConfig");
             this.k.write(p0, p1.mAnchorInfoAreaConfig);
          }
          p0.r("enableStartPushFeedback");
          p0.P(p1.mEnableStartPushFeedback);
          p0.r("enableShowWeekRankSwitch");
          p0.P(p1.mEnableShowWeekRankSwitch);
          p0.r("enableLiveChatDefaultOpen");
          p0.P(p1.mIsChatWithGuestDefaultOpen);
          p0.r("disableCommonRedPackNewStyle");
          p0.P(p1.mDisableCommonRedPacketNewStyle);
          p0.r("disableFansGroupRedPack");
          p0.P(p1.mDisableFansGroupConditionRedPacket);
          p0.r("disableGiftSentRedPack");
          p0.P(p1.mDisableGiftConditionRedPacket);
          p0.r("disableConditionShareRedPack");
          p0.P(p1.mDisableShareConditionRedPacket);
          p0.r("enableAuthorRedPackInteractNew");
          p0.P(p1.mEnableKrnSendRedPacketPanel);
          if (p1.mKrnSendRedPacketPanelRouter != null) {
             p0.r("redPackNewPanelLink");
             TypeAdapters.A.write(p0, p1.mKrnSendRedPacketPanelRouter);
          }
          p0.r("disablePkRecoReport");
          p0.P(p1.mDisablePkRecommendReport);
          p0.r("enablePkTabSelectRemember");
          p0.P(p1.mEnablePkPanelTabSelectRemember);
          p0.r("enableLightBeauty");
          p0.P(p1.mEnableLightBeauty);
          p0.r("enableDefaultBeautyLevel");
          p0.P(p1.mEnableDefaultBeautyLevel);
          p0.r("showLivePlaybackSwitch");
          p0.P(p1.mEnableShowAnchorLivePlaybackSwitch);
          p0.r("enableAnonymousLive");
          p0.P(p1.mEnableAnonymousLive);
          p0.r("anonymousLiveSwitchStatus");
          p0.P(p1.mAnonymousLiveSwitchStatus);
          p0.r("enableLiveBulletin");
          p0.P(p1.mEnableLiveAnnounce);
          p0.r("enableMultiChat");
          p0.P(p1.mEnableMultiChat);
          if (p1.mMagicFaceExpression != null) {
             p0.r("magicFaceExpression");
             this.l.write(p0, p1.mMagicFaceExpression);
          }
          if (p1.mLiveAnchorStartPushEntryResponse != null) {
             p0.r("liveStartPushEntry");
             this.m.write(p0, p1.mLiveAnchorStartPushEntryResponse);
          }
          if (p1.mLiveAnchorRecruitConfig != null) {
             p0.r("livePlusRecruiting");
             this.n.write(p0, p1.mLiveAnchorRecruitConfig);
          }
          if (p1.mVoiceCommentConfig != null) {
             p0.r("voiceCommentConfig");
             this.o.write(p0, p1.mVoiceCommentConfig);
          }
          if (p1.mLiveAuthorBannerInfo != null) {
             p0.r("liveAuthorBannerInfo");
             this.p.write(p0, p1.mLiveAuthorBannerInfo);
          }
          p0.r("disableAuthorTaskExitRetain");
          p0.P(p1.mDisableAuthorTaskExitRetain);
          p0.r("enableShowLiveTag");
          p0.P(p1.mEnableShowLiveTopic);
          if (p1.mLiveChatConfig != null) {
             p0.r("liveChatConfig");
             this.q.write(p0, p1.mLiveChatConfig);
          }
          if (p1.mLiveMmuHighLightConfig != null) {
             p0.r("mmuHighLight");
             this.r.write(p0, p1.mLiveMmuHighLightConfig);
          }
          p0.r("enableRePush");
          p0.P(p1.mEnableRePush);
          p0.r("enableLiveVoicePartyPk");
          p0.P(p1.mEnableVoicePartyCrossRoomPk);
          p0.r("enableVoicePartyBombGame");
          p0.P(p1.mEnableVoicePartyBombGame);
          if (p1.mLiveWishListInfo != null) {
             p0.r("wishListInfo");
             this.s.write(p0, p1.mLiveWishListInfo);
          }
          p0.r("enableAuthorRoomVip");
          p0.P(p1.mEnableLiveVipGrade);
          p0.r("enableRoomVipWatchingList");
          p0.P(p1.mEnableLiveVipGradeWatchingList);
          p0.r("enableCommentAreaOptimization");
          p0.P(p1.mEnableCommentAreaOptimization);
          p0.r("disableOpenMultiPk");
          p0.P(p1.mDisableOpenMultiPk);
          p0.r("enableAuthorCityRank");
          p0.P(p1.mIsCityRankEnable);
          p0.r("enableBattleHourRankAuthor");
          p0.P(p1.mIsHourlyRankStrengthNoticeEnable);
          p0.r("enableHourRankAuthor");
          p0.P(p1.mIsHourlyRankEntryEnable);
          p0.r("enableHourRankResultV2Author");
          p0.P(p1.mIsNewHourlyRankResultEnable);
          p0.r("enableQuarterRankAuthor");
          p0.P(p1.mIsHourlyQuarterRankEnable);
          if (p1.mLiveAnchorBlindDateConfig != null) {
             p0.r("blindDateConfig");
             this.t.write(p0, p1.mLiveAnchorBlindDateConfig);
          }
          if (p1.mAnonymousLiveConfig != null) {
             p0.r("anonymousLiveConfig");
             this.u.write(p0, p1.mAnonymousLiveConfig);
          }
          p0.r("enableShowWatchingListConsumptionData");
          p0.P(p1.mIsShowingConsumptionDataEnabled);
          p0.j();
       }
       return;
    }
}
