package com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.live.core.show.commentnotice.model.LiveCommentNoticeConfig;
import com.kwai.feature.api.live.service.basic.model.NebulaLiveAudienceAdWidgetConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveInteractiveUserTagConfig;
import com.kuaishou.live.core.show.beauty.LiveBeautifyConfig;
import com.kuaishou.live.core.show.makeup.LiveMakeupTipConfig;
import com.kuaishou.live.core.show.uvc.LiveAnchorUvcConfig;
import com.kuaishou.live.core.show.bottombar.LiveAnchorBottomServerConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveControlFileDownloadConfig;
import com.kwai.component.misc.livestatusquery.LiveCheckStatusConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveCollectionConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveRevenueActivityConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveCommonActivityWidgetConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveCommentPlaceholderConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveLineChatConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveEntryCoverGuideConfig;
import java.lang.Object;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveMagicBoxConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveSquareConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveTopUserForbiddenInfo;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveFollowGuideConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$PrepareConfigStrategy;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveTopicConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LivePreFollowConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveRevenueDeliveryConfig;
import com.kuaishou.live.core.show.background.LiveBackgroundTtsConfig;
import com.kuaishou.live.core.show.startup.LiveLiteSideBarConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveLiteCommonGuideConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiteComboCommentConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveWishRoomConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveRecruitRepeatApplyConfig;
import com.kuaishou.live.core.show.multiline.LiveMultiLineConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveGiftPanelRechargeButtonConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveDisplayUserStateConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveInteractiveWidgetConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveVipGradeConfig;
import com.kuaishou.live.core.show.chat.model.LiveMultiChatConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveMultiPkConfig;
import com.kuaishou.live.core.show.startup.LiveExperienceOptimizationConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LivePreparePageConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveCny23GiftConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveQuizSf2023Config;
import com.kuaishou.live.core.basic.model.LiteCommentAreaShowEmojiConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveGiftPanelRefresh;
import com.kuaishou.live.core.show.background.LiveBackgroundMusicTipConfig$TypeAdapter;
import com.kuaishou.live.core.show.race.LiveRaceConfig$TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveFloatingWindowConfig$TypeAdapter;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyKtvCommonConfig$TypeAdapter;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyCommonConfig$TypeAdapter;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyTheaterCommonConfig$TypeAdapter;
import com.kuaishou.live.core.show.chat.model.LiveChatBetweenAnchorsConfig$TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveFollowUserPhotoFeedConfig$TypeAdapter;
import com.kuaishou.live.core.show.share.LiveCommonShareConfig$TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveMmuConfig$TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveProfileConfig$TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveFansGroupConfig$TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveRobotConfig$TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveMaintenanceConfig$TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveGRConfig$TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveDistrictRankConfig$TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveSquareFeedConfig$TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveMerchantForbiddenConfig$TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveAudienceGiftConfig$TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveNebulaSendGiftTaskConfig$TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LivePkConfig$TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveLuckyStarConfig$TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveLiteRecoGuideConfig$TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveVoicePartyCrossRoomPkConfig$TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveAgreementConfig$TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveSquareSideBarNoticeConfig$TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveDisplayCountStyle$TypeAdapter;
import com.kuaishou.live.core.show.push.LiveDivertPushV2Config$TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveFriendFeedConfig$TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveRedPackConfig$TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveAudienceDelayInfosRequestDelayConfig$TypeAdapter;
import com.kuaishou.live.core.show.share.LiveAudienceShareHighlightConfig$TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveEscrowNoticeConfig$TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$MapTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$e;
import bl.p;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiteBottomBarConfig$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveLiteRecoGuideConfig;
import com.kuaishou.live.core.show.share.LiveAudienceShareHighlightConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveAgreementConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveRobotConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LivePkConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveFloatingWindowConfig;
import com.kuaishou.live.core.show.chat.model.LiveChatBetweenAnchorsConfig;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveSquareFeedConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveEscrowNoticeConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveDisplayCountStyle;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyTheaterCommonConfig;
import com.kuaishou.live.core.show.share.LiveCommonShareConfig;
import com.kuaishou.live.core.show.background.LiveBackgroundMusicTipConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveFollowUserPhotoFeedConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveMmuConfig;
import com.kuaishou.live.core.show.race.LiveRaceConfig;
import java.util.Map;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveFansGroupConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveFriendFeedConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveRedPackConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveSquareSideBarNoticeConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveAudienceGiftConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveNebulaSendGiftTaskConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiteBottomBarConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveLuckyStarConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveGRConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveProfileConfig;
import com.kuaishou.live.core.show.push.LiveDivertPushV2Config;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyCommonConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveDistrictRankConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveMerchantForbiddenConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveAudienceDelayInfosRequestDelayConfig;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyKtvCommonConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveMaintenanceConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveVoicePartyCrossRoomPkConfig;
import com.google.gson.stream.b;

public final class LiveConfigStartupResponse$TypeAdapter extends TypeAdapter	// class@001089
{
    public final TypeAdapter A;
    public final TypeAdapter A0;
    public final TypeAdapter B;
    public final TypeAdapter B0;
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
    public final TypeAdapter z0;
    public static final a C0;

    static {
       LiveConfigStartupResponse$TypeAdapter.C0 = a.get(LiveConfigStartupResponse.class);
    }
    public void LiveConfigStartupResponse$TypeAdapter(Gson p0){
       int i = this;
       Gson gson = p0;
       super();
       i.a = gson;
       i.b = gson.j(LiveBackgroundMusicTipConfig$TypeAdapter.b);
       i.c = gson.j(LiveRaceConfig$TypeAdapter.b);
       i.d = gson.j(LiveConfigStartupResponse$LiveFloatingWindowConfig$TypeAdapter.b);
       i.e = gson.j(LiveVoicePartyKtvCommonConfig$TypeAdapter.b);
       i.f = gson.j(LiveVoicePartyCommonConfig$TypeAdapter.i);
       i.g = gson.j(LiveVoicePartyTheaterCommonConfig$TypeAdapter.e);
       i.h = gson.j(LiveChatBetweenAnchorsConfig$TypeAdapter.b);
       i.i = gson.j(LiveConfigStartupResponse$LiveFollowUserPhotoFeedConfig$TypeAdapter.c);
       i.j = gson.j(LiveCommonShareConfig$TypeAdapter.c);
       i.k = gson.j(LiveConfigStartupResponse$LiveMmuConfig$TypeAdapter.b);
       i.l = gson.j(LiveConfigStartupResponse$LiveProfileConfig$TypeAdapter.b);
       i.m = gson.j(LiveConfigStartupResponse$LiveFansGroupConfig$TypeAdapter.d);
       i.n = gson.j(LiveConfigStartupResponse$LiveRobotConfig$TypeAdapter.b);
       i.o = gson.j(LiveConfigStartupResponse$LiveMaintenanceConfig$TypeAdapter.b);
       i.p = gson.j(LiveConfigStartupResponse$LiveGRConfig$TypeAdapter.b);
       i.q = gson.j(LiveConfigStartupResponse$LiveDistrictRankConfig$TypeAdapter.b);
       i.r = gson.j(a.get(LiveCommentNoticeConfig.class));
       i.s = gson.j(LiveConfigStartupResponse$LiveSquareFeedConfig$TypeAdapter.b);
       i.t = gson.j(LiveConfigStartupResponse$LiveMerchantForbiddenConfig$TypeAdapter.b);
       i.u = gson.j(LiveConfigStartupResponse$LiveAudienceGiftConfig$TypeAdapter.d);
       i.v = gson.j(a.get(NebulaLiveAudienceAdWidgetConfig.class));
       i.w = gson.j(LiveConfigStartupResponse$LiveNebulaSendGiftTaskConfig$TypeAdapter.b);
       i.x = gson.j(LiveConfigStartupResponse$LivePkConfig$TypeAdapter.d);
       i.y = gson.j(LiveConfigStartupResponse$LiveLuckyStarConfig$TypeAdapter.b);
       i.z = gson.j(LiveConfigStartupResponse$LiveLiteRecoGuideConfig$TypeAdapter.b);
       i.A = gson.j(LiveConfigStartupResponse$LiveVoicePartyCrossRoomPkConfig$TypeAdapter.b);
       i.B = gson.j(LiveConfigStartupResponse$LiveAgreementConfig$TypeAdapter.d);
       i.C = gson.j(LiveConfigStartupResponse$LiveSquareSideBarNoticeConfig$TypeAdapter.b);
       i.D = gson.j(LiveConfigStartupResponse$LiveDisplayCountStyle$TypeAdapter.b);
       i.E = gson.j(a.get(LiveConfigStartupResponse$LiveInteractiveUserTagConfig.class));
       i.F = gson.j(LiveDivertPushV2Config$TypeAdapter.b);
       i.G = gson.j(LiveConfigStartupResponse$LiveFriendFeedConfig$TypeAdapter.b);
       i.H = gson.j(LiveConfigStartupResponse$LiveRedPackConfig$TypeAdapter.b);
       i.I = gson.j(a.get(LiveBeautifyConfig.class));
       i.J = gson.j(a.get(LiveMakeupTipConfig.class));
       i.K = gson.j(a.get(LiveAnchorUvcConfig.class));
       i.L = gson.j(a.get(LiveAnchorBottomServerConfig.class));
       i.M = gson.j(LiveConfigStartupResponse$LiveAudienceDelayInfosRequestDelayConfig$TypeAdapter.b);
       i.N = gson.j(LiveAudienceShareHighlightConfig$TypeAdapter.b);
       i.O = gson.j(a.get(LiveConfigStartupResponse$LiveControlFileDownloadConfig.class));
       i.P = gson.j(LiveConfigStartupResponse$LiveEscrowNoticeConfig$TypeAdapter.b);
       i.Q = gson.j(a.get(LiveCheckStatusConfig.class));
       i.R = gson.j(a.get(LiveConfigStartupResponse$LiveCollectionConfig.class));
       i.S = gson.j(a.get(LiveConfigStartupResponse$LiveRevenueActivityConfig.class));
       i.T = gson.j(a.get(LiveConfigStartupResponse$LiveCommonActivityWidgetConfig.class));
       i.U = gson.j(a.get(LiveConfigStartupResponse$LiveCommentPlaceholderConfig.class));
       i.V = new KnownTypeAdapters$MapTypeAdapter(TypeAdapters.A, KnownTypeAdapters.d, new KnownTypeAdapters$e());
       i.W = gson.j(a.get(LiveConfigStartupResponse$LiveLineChatConfig.class));
       i.X = gson.j(a.get(LiveConfigStartupResponse$LiveEntryCoverGuideConfig.class));
       TypeAdapter typeAdapter = gson.j(a.get(Object.class));
       i.Y = typeAdapter;
       i.Z = new KnownTypeAdapters$MapTypeAdapter(typeAdapter, typeAdapter, new KnownTypeAdapters$e());
       i.a0 = gson.j(a.get(LiveConfigStartupResponse$LiveMagicBoxConfig.class));
       i.b0 = gson.j(a.get(LiveConfigStartupResponse$LiveSquareConfig.class));
       i.c0 = gson.j(a.get(LiveConfigStartupResponse$LiveTopUserForbiddenInfo.class));
       i.d0 = gson.j(a.get(LiveConfigStartupResponse$LiveFollowGuideConfig.class));
       i.e0 = gson.j(a.get(LiveConfigStartupResponse$PrepareConfigStrategy.class));
       i.f0 = gson.j(a.get(LiveConfigStartupResponse$LiveTopicConfig.class));
       i.g0 = gson.j(a.get(LiveConfigStartupResponse$LivePreFollowConfig.class));
       i.h0 = gson.j(a.get(LiveConfigStartupResponse$LiveRevenueDeliveryConfig.class));
       i.i0 = gson.j(a.get(LiveBackgroundTtsConfig.class));
       i.j0 = gson.j(a.get(LiveLiteSideBarConfig.class));
       i.k0 = gson.j(a.get(LiveConfigStartupResponse$LiveLiteCommonGuideConfig.class));
       i.l0 = gson.j(a.get(LiveConfigStartupResponse$LiteComboCommentConfig.class));
       i.m0 = gson.j(a.get(LiveConfigStartupResponse$LiveWishRoomConfig.class));
       i.n0 = gson.j(a.get(LiveConfigStartupResponse$LiveRecruitRepeatApplyConfig.class));
       i.o0 = gson.j(a.get(LiveMultiLineConfig.class));
       i.p0 = gson.j(a.get(LiveConfigStartupResponse$LiveGiftPanelRechargeButtonConfig.class));
       i.q0 = gson.j(a.get(LiveConfigStartupResponse$LiveDisplayUserStateConfig.class));
       i.r0 = gson.j(a.get(LiveConfigStartupResponse$LiveInteractiveWidgetConfig.class));
       i.s0 = gson.j(a.get(LiveConfigStartupResponse$LiveVipGradeConfig.class));
       i.t0 = gson.j(a.get(LiveMultiChatConfig.class));
       i.u0 = gson.j(a.get(LiveConfigStartupResponse$LiveMultiPkConfig.class));
       i.v0 = gson.j(a.get(LiveExperienceOptimizationConfig.class));
       i.w0 = gson.j(a.get(LiveConfigStartupResponse$LivePreparePageConfig.class));
       i.x0 = gson.j(a.get(LiveConfigStartupResponse$LiveCny23GiftConfig.class));
       i.y0 = gson.j(a.get(LiveConfigStartupResponse$LiveQuizSf2023Config.class));
       i.z0 = gson.j(a.get(LiteCommentAreaShowEmojiConfig.class));
       i.A0 = gson.j(LiveConfigStartupResponse$LiteBottomBarConfig$TypeAdapter.d);
       i.B0 = gson.j(a.get(LiveConfigStartupResponse$LiveGiftPanelRefresh.class));
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveConfigStartupResponse$TypeAdapter.class, "2");
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
             obj = new LiveConfigStartupResponse();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x8473c4e5:
                      if (str.equals("disableShowWealthGrade")) {
                         i = 0;
                      }
                      break;
                    case 0x880a5e11:
                      if (str.equals("voicePartyPkConfig")) {
                         i = 1;
                      }
                      break;
                    case 0x8a7f4e96:
                      if (str.equals("liveBottomSquareConfig")) {
                         i = 2;
                      }
                      break;
                    case 0x8d944bf0:
                      if (str.equals("liveTagConfig")) {
                         i = 3;
                      }
                      break;
                    case 0x8e7e2ce1:
                      if (str.equals("liteComboCommentConfig")) {
                         i = 4;
                      }
                      break;
                    case 0x9168b5e8:
                      if (str.equals("bottomBar")) {
                         i = 5;
                      }
                      break;
                    case 0x931b0053:
                      if (str.equals("liveCny2023GiftConfig")) {
                         i = 6;
                      }
                      break;
                    case 0x97036841:
                      if (str.equals("userAssociateRequestMaxDelayMillis")) {
                         i = 7;
                      }
                      break;
                    case 0x98678835:
                      if (str.equals("maintenanceConfig")) {
                         i = 8;
                      }
                      break;
                    case 0x9a5d4eb9:
                      if (str.equals("voicePartyKtv")) {
                         i = 9;
                      }
                      break;
                    case 0x9c9e01c2:
                      if (str.equals("delayInfos")) {
                         i = 10;
                      }
                      break;
                    case 0x9d93c268:
                      if (str.equals("userStateConfig")) {
                         i = 11;
                      }
                      break;
                    case 0xa0cbb9d8:
                      if (str.equals("shopConfig")) {
                         i = 12;
                      }
                      break;
                    case 0xa26315d9:
                      if (str.equals("liveLiteCommonGuideConfig")) {
                         i = 13;
                      }
                      break;
                    case 0xa35f7cda:
                      if (str.equals("districtRank")) {
                         i = 14;
                      }
                      break;
                    case 0xa4c4920d:
                      if (str.equals("liteCommentAreaShowEmojiConfig")) {
                         i = 15;
                      }
                      break;
                    case 0xa4d938d4:
                      if (str.equals("voiceParty")) {
                         i = 16;
                      }
                      break;
                    case 0xa553f9d5:
                      if (str.equals("liveActivityPush")) {
                         i = 17;
                      }
                      break;
                    case 0xa6c3cf1d:
                      if (str.equals("liveProfile")) {
                         i = 18;
                      }
                      break;
                    case 0xa8013039:
                      if (str.equals("commentNoticeConfig")) {
                         i = 19;
                      }
                      break;
                    case 0xad72d7dd:
                      if (str.equals("pureModeConfig")) {
                         i = 20;
                      }
                      break;
                    case 0xb4450678:
                      if (str.equals("liveLineChat")) {
                         i = 21;
                      }
                      break;
                    case 0xb52e14ff:
                      if (str.equals("disableLiveAnchorFrameMetrics")) {
                         i = 22;
                      }
                      break;
                    case 0xb54d29bc:
                      if (str.equals("prepareConfigStrategy")) {
                         i = 23;
                      }
                      break;
                    case 0xb895edd7:
                      if (str.equals("weLoveChina")) {
                         i = 24;
                      }
                      break;
                    case 0xbcdaaa24:
                      if (str.equals("topForbidden")) {
                         i = 25;
                      }
                      break;
                    case 0xbd3fa693:
                      if (str.equals("liveGiftPanelRefresh")) {
                         i = 26;
                      }
                      break;
                    case 0xbd40e53c:
                      if (str.equals("luckyStarConfig")) {
                         i = 27;
                      }
                      break;
                    case 0xbf20a18f:
                      if (str.equals("liveEffectiveMapInfo")) {
                         i = 28;
                      }
                      break;
                    case 0xc1ce48a2:
                      if (str.equals("liveAnchorFrameMetricsIntervalMs")) {
                         i = 29;
                      }
                      break;
                    case 0xc884ac2f:
                      if (str.equals("multiLiveLabel")) {
                         i = 30;
                      }
                      break;
                    case 0xcb377392:
                      if (str.equals("revenueDeliveryConfig")) {
                         i = 31;
                      }
                      break;
                    case 0xcb92fb8c:
                      if (str.equals("livePreparePageConfig")) {
                         i = 32;
                      }
                      break;
                    case 0xd08c9ee2:
                      if (str.equals("disableAuthorWeeklyReportSubscribe")) {
                         i = 33;
                      }
                      break;
                    case 0xd1e866a1:
                      if (str.equals("liveLiteBottomPanelConfig")) {
                         i = 34;
                      }
                      break;
                    case 0xda59b293:
                      if (str.equals("liveQuizSf2023")) {
                         i = 35;
                      }
                      break;
                    case 0xde24ba2f:
                      if (str.equals("giftPanelRechargeButtonConfig")) {
                         i = 36;
                      }
                      break;
                    case 0xdfa2d370:
                      if (str.equals("nebulaGoldCoin")) {
                         i = 37;
                      }
                      break;
                    case 0xdfdf27ec:
                      if (str.equals("liveCommonActivityWidgetConfig")) {
                         i = 38;
                      }
                      break;
                    case 0xe35f03b1:
                      if (str.equals("liveBeautyMakeup")) {
                         i = 39;
                      }
                      break;
                    case 0xebb8e352:
                      if (str.equals("disableLivePlayWithTextureView")) {
                         i = 40;
                      }
                      break;
                    case 0xee4d3492:
                      if (str.equals("giftConfig")) {
                         i = 41;
                      }
                      break;
                    case 0xf206d561:
                      if (str.equals("liveSquareNotice")) {
                         i = 42;
                      }
                      break;
                    case 0xf23aec39:
                      if (str.equals("liveMultiLineChat")) {
                         i = 43;
                      }
                      break;
                    case 0xf25a4ca0:
                      if (str.equals("liveRedPackConfig")) {
                         i = 44;
                      }
                      break;
                    case 0xf2ad2680:
                      if (str.equals("feedConfig")) {
                         i = 45;
                      }
                      break;
                    case 0xf2df069f:
                      if (str.equals("fansGroup")) {
                         i = 46;
                      }
                      break;
                    case 0xf90150a5:
                      if (str.equals("liveMultiChat")) {
                         i = 47;
                      }
                      break;
                    case 0xfaeac6e2:
                      if (str.equals("switches")) {
                         i = 48;
                      }
                      break;
                    case 0xfbd560de:
                      if (str.equals("magicBox")) {
                         i = 49;
                      }
                      break;
                    case 0x354ad1:
                      if (str.equals("race")) {
                         i = 50;
                      }
                      break;
                    case 0x1e0e277:
                      if (str.equals("mmuConfig")) {
                         i = 51;
                      }
                      break;
                    case 0x398dd97:
                      if (str.equals("disableSettingReservationItem")) {
                         i = 52;
                      }
                      break;
                    case 0x6f6cca6:
                      if (str.equals("nebulaAdWidget")) {
                         i = 53;
                      }
                      break;
                    case 0xedb53ed:
                      if (str.equals("disableToAudienceGiftSlotDisplay")) {
                         i = 54;
                      }
                      break;
                    case 0x1308c41c:
                      if (str.equals("liveInteractiveWidgetConfig")) {
                         i = 55;
                      }
                      break;
                    case 0x13865bf0:
                      if (str.equals("liveWishroomConfig")) {
                         i = 56;
                      }
                      break;
                    case 0x160a4c88:
                      if (str.equals("liveBeauty")) {
                         i = 57;
                      }
                      break;
                    case 0x1999b2b1:
                      if (str.equals("disableUseOldToken")) {
                         i = 58;
                      }
                      break;
                    case 0x1d6f77bd:
                      if (str.equals("liveFollow")) {
                         i = 59;
                      }
                      break;
                    case 0x1db9df37:
                      if (str.equals("liveControlFileDownloadConfig")) {
                         i = 60;
                      }
                      break;
                    case 0x26855324:
                      if (str.equals("roomVipConfig")) {
                         i = 61;
                      }
                      break;
                    case 0x29b467a0:
                      if (str.equals("liveCommentPlaceholder")) {
                         i = 62;
                      }
                      break;
                    case 0x2be61784:
                      if (str.equals("backgroundMusicTip")) {
                         i = 63;
                      }
                      break;
                    case 0x2d876edd:
                      if (str.equals("livePlusRecruitRepeatApplyConfig")) {
                         i = 64;
                      }
                      break;
                    case 0x2ecf50bf:
                      if (str.equals("liveRevenueActivity")) {
                         i = 65;
                      }
                      break;
                    case 0x33be9529:
                      if (str.equals("liveSquare")) {
                         i = 66;
                      }
                      break;
                    case 0x3b756253:
                      if (str.equals("liveShare")) {
                         i = 67;
                      }
                      break;
                    case 0x3f68588f:
                      if (str.equals("anchorUVCConfig")) {
                         i = 68;
                      }
                      break;
                    case 0x4011809d:
                      if (str.equals("voicePartyTheater")) {
                         i = 69;
                      }
                      break;
                    case 0x4370e84e:
                      if (str.equals("anchorBackgroundQueryLiveStatusIntervalMs")) {
                         i = 70;
                      }
                      break;
                    case 0x4746213f:
                      if (str.equals("liveFollowGuide")) {
                         i = 71;
                      }
                      break;
                    case 0x49cca538:
                      if (str.equals("disableRequestProfileFeedIgnorePublicPhotoCount")) {
                         i = 72;
                      }
                      break;
                    case 0x51b305be:
                      if (str.equals("liteSidebarArrangementConfig")) {
                         i = 73;
                      }
                      break;
                    case 0x55140d82:
                      if (str.equals("backgroundPlay")) {
                         i = 74;
                      }
                      break;
                    case 0x57ec9844:
                      if (str.equals("displayCountStyle")) {
                         i = 75;
                      }
                      break;
                    case 0x5a57f8c3:
                      if (str.equals("liveEntrust")) {
                         i = 76;
                      }
                      break;
                    case 0x5acf3267:
                      if (str.equals("liveSquareFeed")) {
                         i = 77;
                      }
                      break;
                    case 0x5d2983d9:
                      if (str.equals("liveCoverNoticeGuide")) {
                         i = 78;
                      }
                      break;
                    case 0x5e578c96:
                      if (str.equals("preFollowConfig")) {
                         i = 79;
                      }
                      break;
                    case 0x634777ff:
                      if (str.equals("disableLivePushFpsMonitor")) {
                         i = 80;
                      }
                      break;
                    case 0x6373eca5:
                      if (str.equals("authorChatConfig")) {
                         i = 81;
                      }
                      break;
                    case 0x65803396:
                      if (str.equals("floatingWindow")) {
                         i = 82;
                      }
                      break;
                    case 0x6f0bc576:
                      if (str.equals("multiPkConfig")) {
                         i = 83;
                      }
                      break;
                    case 0x74d63e29:
                      if (str.equals("livePkConfig")) {
                         i = 84;
                      }
                      break;
                    case 0x777be24c:
                      if (str.equals("robotConfig")) {
                         i = 85;
                      }
                      break;
                    case 0x7a8a3c73:
                      if (str.equals("checkLivingConfig")) {
                         i = 86;
                      }
                      break;
                    case 0x7b230a7e:
                      if (str.equals("liveAgreement")) {
                         i = 87;
                      }
                      break;
                    case 0x7c8bb699:
                      if (str.equals("audienceShareHighLight")) {
                         i = 88;
                      }
                      break;
                    case 0x7e0e5533:
                      if (str.equals("optimizeRecommendPanelInfo")) {
                         i = 89;
                      }
                      break;
                    case 0x7f6a1260:
                      if (str.equals("liveDefaultBackgroundColor")) {
                         i = 90;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mDisableShowWealthGrade = KnownTypeAdapters$g.a(p0, obj.mDisableShowWealthGrade);
                      break;
                    case 1:
                      obj.mVoicePartyCrossRoomPkConfig = this.A.read(p0);
                      break;
                    case 2:
                      obj.mLiveCollectionConfig = this.R.read(p0);
                      break;
                    case 3:
                      obj.mLiveTopicConfig = this.f0.read(p0);
                      break;
                    case 4:
                      obj.mComboCommentConfig = this.l0.read(p0);
                      break;
                    case 5:
                      obj.mLiveAnchorBottomServerConfig = this.L.read(p0);
                      break;
                    case 6:
                      obj.mLiveCny23GiftConfig = this.x0.read(p0);
                      break;
                    case 7:
                      obj.mAudienceAssociateRequestMaxDelayMillis = KnownTypeAdapters$n.a(p0, obj.mAudienceAssociateRequestMaxDelayMillis);
                      break;
                    case 8:
                      obj.mMaintenanceConfig = this.o.read(p0);
                      break;
                    case 9:
                      obj.mVoicePartyKtvConfig = this.e.read(p0);
                      break;
                    case 10:
                      obj.mLiveAudienceDelayInfosRequestDelayConfig = this.M.read(p0);
                      break;
                    case 11:
                      obj.mLiveDisplayUserStateConfig = this.q0.read(p0);
                      break;
                    case 12:
                      obj.mLiveMerchantForbiddenConfig = this.t.read(p0);
                      break;
                    case 13:
                      obj.mCommonGuideConfig = this.k0.read(p0);
                      break;
                    case 14:
                      obj.mLiveDistrictRankConfig = this.q.read(p0);
                      break;
                    case 15:
                      obj.mLiteCommentAreaShowEmojiConfig = this.z0.read(p0);
                      break;
                    case 16:
                      obj.mVoicePartyConfig = this.f.read(p0);
                      break;
                    case 17:
                      obj.mLiveDivertPushV2Config = this.F.read(p0);
                      break;
                    case 18:
                      obj.mLiveProfileConfig = this.l.read(p0);
                      break;
                    case 19:
                      obj.mLiveCommentNoticeConfig = this.r.read(p0);
                      break;
                    case 20:
                      obj.mLiveExperienceOptimizationConfig = this.v0.read(p0);
                      break;
                    case 21:
                      obj.mLineLiveConfig = this.W.read(p0);
                      break;
                    case 22:
                      obj.mDisableLiveAnchorFrameMetrics = KnownTypeAdapters$g.a(p0, obj.mDisableLiveAnchorFrameMetrics);
                      break;
                    case 23:
                      obj.mPrepareConfigStrategy = this.e0.read(p0);
                      break;
                    case 24:
                      obj.mLiveGRConfig = this.p.read(p0);
                      break;
                    case 25:
                      obj.mLiveTopUserForbiddenInfo = this.c0.read(p0);
                      break;
                    case 26:
                      obj.mLiveGiftPanelRefresh = this.B0.read(p0);
                      break;
                    case 27:
                      obj.mLiveLuckyStarConfig = this.y.read(p0);
                      break;
                    case 28:
                      obj.mEffectMap = this.V.read(p0);
                      break;
                    case 29:
                      obj.mLiveAnchorFrameMetricsIntervalMs = KnownTypeAdapters$n.a(p0, obj.mLiveAnchorFrameMetricsIntervalMs);
                      break;
                    case 30:
                      obj.mLiveInteractiveUserTagConfig = this.E.read(p0);
                      break;
                    case 31:
                      obj.mLiveRevenueDeliveryConfig = this.h0.read(p0);
                      break;
                    case 32:
                      obj.mLivePreparePageConfig = this.w0.read(p0);
                      break;
                    case '!':
                      obj.mDisableAuthorWeeklyReportSubscribe = KnownTypeAdapters$g.a(p0, obj.mDisableAuthorWeeklyReportSubscribe);
                      break;
                    case '"':
                      obj.mLiteLiveBottomPanelConfig = this.A0.read(p0);
                      break;
                    case '#':
                      obj.liveQuizSf2023Config = this.y0.read(p0);
                      break;
                    case '$':
                      obj.mGiftPanelRechargeButtonConfig = this.p0.read(p0);
                      break;
                    case '%':
                      obj.mSendGiftTaskConfig = this.w.read(p0);
                      break;
                    case '&':
                      obj.mLiveCommonActivityWidgetConfig = this.T.read(p0);
                      break;
                    case 39:
                      obj.mLiveMakeupTipConfig = this.J.read(p0);
                      break;
                    case '(':
                      obj.mDisableLivePlayWithTextureView = KnownTypeAdapters$g.a(p0, obj.mDisableLivePlayWithTextureView);
                      break;
                    case ')':
                      obj.mLiveAudienceGiftConfig = this.u.read(p0);
                      break;
                    case '*':
                      obj.mLiveSquareSideBarNoticeConfig = this.C.read(p0);
                      break;
                    case '+':
                      obj.mLiveMultiLineConfig = this.o0.read(p0);
                      break;
                    case ',':
                      obj.mLiveRedPackConfig = this.H.read(p0);
                      break;
                    case '-':
                      obj.mLiveFriendFeedConfig = this.G.read(p0);
                      break;
                    case '.':
                      obj.mLiveFansGroupConfig = this.m.read(p0);
                      break;
                    case '/':
                      obj.mLiveMultiChat = this.t0.read(p0);
                      break;
                    case '0':
                      obj.liveSwitchesConfig = this.Z.read(p0);
                      break;
                    case '1':
                      obj.mLiveMagicBoxConfig = this.a0.read(p0);
                      break;
                    case '2':
                      obj.mLiveRaceConfig = this.c.read(p0);
                      break;
                    case '3':
                      obj.mLiveMmuConfig = this.k.read(p0);
                      break;
                    case '4':
                      obj.mDisableSettingReservationItem = KnownTypeAdapters$g.a(p0, obj.mDisableSettingReservationItem);
                      break;
                    case '5':
                      obj.mNebulaLiveAdConfig = this.v.read(p0);
                      break;
                    case '6':
                      obj.mDisableToAudienceGiftSlotDisplay = KnownTypeAdapters$g.a(p0, obj.mDisableToAudienceGiftSlotDisplay);
                      break;
                    case '7':
                      obj.mLiveInteractiveWidgetConfig = this.r0.read(p0);
                      break;
                    case '8':
                      obj.mLiveWishRoomConfig = this.m0.read(p0);
                      break;
                    case '9':
                      obj.mLiveBeautifyConfig = this.I.read(p0);
                      break;
                    case ':':
                      obj.mDisableUseOldToken = KnownTypeAdapters$g.a(p0, obj.mDisableUseOldToken);
                      break;
                    case ';':
                      obj.mLiveFollowUserPhotoFeedConfig = this.i.read(p0);
                      break;
                    case '<':
                      obj.mLiveControlFileDownloadConfig = this.O.read(p0);
                      break;
                    case '=':
                      obj.mLiveVipGradeConfig = this.s0.read(p0);
                      break;
                    case '>':
                      obj.mLiveCommentPlaceholderConfig = this.U.read(p0);
                      break;
                    case '?':
                      obj.mLiveBackgroundMusicTipConfig = this.b.read(p0);
                      break;
                    case '@':
                      obj.mLiveRecruitRepeatApplyConfig = this.n0.read(p0);
                      break;
                    case 'A':
                      obj.mLiveRevenueActivityConfig = this.S.read(p0);
                      break;
                    case 'B':
                      obj.mLiveSquareConfig = this.b0.read(p0);
                      break;
                    case 'C':
                      obj.mLiveCommonShareConfig = this.j.read(p0);
                      break;
                    case 'D':
                      obj.mLiveAnchorUVCConfig = this.K.read(p0);
                      break;
                    case 'E':
                      obj.mVoicePartyTheaterConfig = this.g.read(p0);
                      break;
                    case 'F':
                      obj.mAnchorBackgroundQueryLiveStatusIntervalMs = KnownTypeAdapters$n.a(p0, obj.mAnchorBackgroundQueryLiveStatusIntervalMs);
                      break;
                    case 'G':
                      obj.mLiveFollowGuideConfig = this.d0.read(p0);
                      break;
                    case 'H':
                      obj.mDisableRequestProfileFeedIgnorePublicPhotoCount = KnownTypeAdapters$g.a(p0, obj.mDisableRequestProfileFeedIgnorePublicPhotoCount);
                      break;
                    case 'I':
                      obj.mLiveLiteSideBarConfig = this.j0.read(p0);
                      break;
                    case 'J':
                      obj.mLiveBackgroundTtsConfig = this.i0.read(p0);
                      break;
                    case 'K':
                      obj.mLiveDisplayCountStyle = this.D.read(p0);
                      break;
                    case 'L':
                      obj.mLiveEscrowNoticeConfig = this.P.read(p0);
                      break;
                    case 'M':
                      obj.mLiveSquareFeedConfig = this.s.read(p0);
                      break;
                    case 'N':
                      obj.mLiveEntryCoverGuideConfig = this.X.read(p0);
                      break;
                    case 'O':
                      obj.mLivePreFollowConfig = this.g0.read(p0);
                      break;
                    case 'P':
                      obj.mDisableLivePushFpsMonitor = KnownTypeAdapters$g.a(p0, obj.mDisableLivePushFpsMonitor);
                      break;
                    case 'Q':
                      obj.mLiveChatBetweenAnchorsConfig = this.h.read(p0);
                      break;
                    case 'R':
                      obj.mLiveFloatingWindowConfig = this.d.read(p0);
                      break;
                    case 'S':
                      obj.mLiveMultiPkConfig = this.u0.read(p0);
                      break;
                    case 'T':
                      obj.mLivePkConfig = this.x.read(p0);
                      break;
                    case 'U':
                      obj.mLiveRobotConfig = this.n.read(p0);
                      break;
                    case 'V':
                      obj.mLiveCheckStatusConfig = this.Q.read(p0);
                      break;
                    case 'W':
                      obj.mLiveAgreementConfig = this.B.read(p0);
                      break;
                    case 'X':
                      obj.mLiveAudienceShareHighlightConfig = this.N.read(p0);
                      break;
                    case 'Y':
                      obj.mLiveLiteRecoGuideConfig = this.z.read(p0);
                      break;
                    case 'Z':
                      obj.mLiveDefaultBackgroundColor = TypeAdapters.A.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveConfigStartupResponse$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mLiveBackgroundMusicTipConfig != null) {
             p0.r("backgroundMusicTip");
             this.b.write(p0, p1.mLiveBackgroundMusicTipConfig);
          }
          if (p1.mLiveRaceConfig != null) {
             p0.r("race");
             this.c.write(p0, p1.mLiveRaceConfig);
          }
          p0.r("disableAuthorWeeklyReportSubscribe");
          p0.P(p1.mDisableAuthorWeeklyReportSubscribe);
          p0.r("disableShowWealthGrade");
          p0.P(p1.mDisableShowWealthGrade);
          if (p1.mLiveFloatingWindowConfig != null) {
             p0.r("floatingWindow");
             this.d.write(p0, p1.mLiveFloatingWindowConfig);
          }
          if (p1.mVoicePartyKtvConfig != null) {
             p0.r("voicePartyKtv");
             this.e.write(p0, p1.mVoicePartyKtvConfig);
          }
          if (p1.mVoicePartyConfig != null) {
             p0.r("voiceParty");
             this.f.write(p0, p1.mVoicePartyConfig);
          }
          if (p1.mVoicePartyTheaterConfig != null) {
             p0.r("voicePartyTheater");
             this.g.write(p0, p1.mVoicePartyTheaterConfig);
          }
          if (p1.mLiveChatBetweenAnchorsConfig != null) {
             p0.r("authorChatConfig");
             this.h.write(p0, p1.mLiveChatBetweenAnchorsConfig);
          }
          p0.r("disableToAudienceGiftSlotDisplay");
          p0.P(p1.mDisableToAudienceGiftSlotDisplay);
          if (p1.mLiveFollowUserPhotoFeedConfig != null) {
             p0.r("liveFollow");
             this.i.write(p0, p1.mLiveFollowUserPhotoFeedConfig);
          }
          if (p1.mLiveCommonShareConfig != null) {
             p0.r("liveShare");
             this.j.write(p0, p1.mLiveCommonShareConfig);
          }
          if (p1.mLiveMmuConfig != null) {
             p0.r("mmuConfig");
             this.k.write(p0, p1.mLiveMmuConfig);
          }
          if (p1.mLiveProfileConfig != null) {
             p0.r("liveProfile");
             this.l.write(p0, p1.mLiveProfileConfig);
          }
          p0.r("disableUseOldToken");
          p0.P(p1.mDisableUseOldToken);
          if (p1.mLiveFansGroupConfig != null) {
             p0.r("fansGroup");
             this.m.write(p0, p1.mLiveFansGroupConfig);
          }
          if (p1.mLiveRobotConfig != null) {
             p0.r("robotConfig");
             this.n.write(p0, p1.mLiveRobotConfig);
          }
          p0.r("anchorBackgroundQueryLiveStatusIntervalMs");
          p0.K(p1.mAnchorBackgroundQueryLiveStatusIntervalMs);
          p0.r("disableLivePlayWithTextureView");
          p0.P(p1.mDisableLivePlayWithTextureView);
          p0.r("disableLivePushFpsMonitor");
          p0.P(p1.mDisableLivePushFpsMonitor);
          p0.r("disableLiveAnchorFrameMetrics");
          p0.P(p1.mDisableLiveAnchorFrameMetrics);
          p0.r("userAssociateRequestMaxDelayMillis");
          p0.K(p1.mAudienceAssociateRequestMaxDelayMillis);
          p0.r("liveAnchorFrameMetricsIntervalMs");
          p0.K(p1.mLiveAnchorFrameMetricsIntervalMs);
          if (p1.mMaintenanceConfig != null) {
             p0.r("maintenanceConfig");
             this.o.write(p0, p1.mMaintenanceConfig);
          }
          if (p1.mLiveGRConfig != null) {
             p0.r("weLoveChina");
             this.p.write(p0, p1.mLiveGRConfig);
          }
          if (p1.mLiveDistrictRankConfig != null) {
             p0.r("districtRank");
             this.q.write(p0, p1.mLiveDistrictRankConfig);
          }
          if (p1.mLiveCommentNoticeConfig != null) {
             p0.r("commentNoticeConfig");
             this.r.write(p0, p1.mLiveCommentNoticeConfig);
          }
          p0.r("disableRequestProfileFeedIgnorePublicPhotoCount");
          p0.P(p1.mDisableRequestProfileFeedIgnorePublicPhotoCount);
          if (p1.mLiveSquareFeedConfig != null) {
             p0.r("liveSquareFeed");
             this.s.write(p0, p1.mLiveSquareFeedConfig);
          }
          if (p1.mLiveMerchantForbiddenConfig != null) {
             p0.r("shopConfig");
             this.t.write(p0, p1.mLiveMerchantForbiddenConfig);
          }
          if (p1.mLiveAudienceGiftConfig != null) {
             p0.r("giftConfig");
             this.u.write(p0, p1.mLiveAudienceGiftConfig);
          }
          if (p1.mNebulaLiveAdConfig != null) {
             p0.r("nebulaAdWidget");
             this.v.write(p0, p1.mNebulaLiveAdConfig);
          }
          if (p1.mSendGiftTaskConfig != null) {
             p0.r("nebulaGoldCoin");
             this.w.write(p0, p1.mSendGiftTaskConfig);
          }
          if (p1.mLivePkConfig != null) {
             p0.r("livePkConfig");
             this.x.write(p0, p1.mLivePkConfig);
          }
          if (p1.mLiveLuckyStarConfig != null) {
             p0.r("luckyStarConfig");
             this.y.write(p0, p1.mLiveLuckyStarConfig);
          }
          if (p1.mLiveLiteRecoGuideConfig != null) {
             p0.r("optimizeRecommendPanelInfo");
             this.z.write(p0, p1.mLiveLiteRecoGuideConfig);
          }
          if (p1.mVoicePartyCrossRoomPkConfig != null) {
             p0.r("voicePartyPkConfig");
             this.A.write(p0, p1.mVoicePartyCrossRoomPkConfig);
          }
          if (p1.mLiveAgreementConfig != null) {
             p0.r("liveAgreement");
             this.B.write(p0, p1.mLiveAgreementConfig);
          }
          if (p1.mLiveSquareSideBarNoticeConfig != null) {
             p0.r("liveSquareNotice");
             this.C.write(p0, p1.mLiveSquareSideBarNoticeConfig);
          }
          if (p1.mLiveDisplayCountStyle != null) {
             p0.r("displayCountStyle");
             this.D.write(p0, p1.mLiveDisplayCountStyle);
          }
          if (p1.mLiveInteractiveUserTagConfig != null) {
             p0.r("multiLiveLabel");
             this.E.write(p0, p1.mLiveInteractiveUserTagConfig);
          }
          if (p1.mLiveDivertPushV2Config != null) {
             p0.r("liveActivityPush");
             this.F.write(p0, p1.mLiveDivertPushV2Config);
          }
          if (p1.mLiveFriendFeedConfig != null) {
             p0.r("feedConfig");
             this.G.write(p0, p1.mLiveFriendFeedConfig);
          }
          if (p1.mLiveRedPackConfig != null) {
             p0.r("liveRedPackConfig");
             this.H.write(p0, p1.mLiveRedPackConfig);
          }
          if (p1.mLiveBeautifyConfig != null) {
             p0.r("liveBeauty");
             this.I.write(p0, p1.mLiveBeautifyConfig);
          }
          if (p1.mLiveMakeupTipConfig != null) {
             p0.r("liveBeautyMakeup");
             this.J.write(p0, p1.mLiveMakeupTipConfig);
          }
          if (p1.mLiveAnchorUVCConfig != null) {
             p0.r("anchorUVCConfig");
             this.K.write(p0, p1.mLiveAnchorUVCConfig);
          }
          if (p1.mLiveAnchorBottomServerConfig != null) {
             p0.r("bottomBar");
             this.L.write(p0, p1.mLiveAnchorBottomServerConfig);
          }
          if (p1.mLiveAudienceDelayInfosRequestDelayConfig != null) {
             p0.r("delayInfos");
             this.M.write(p0, p1.mLiveAudienceDelayInfosRequestDelayConfig);
          }
          if (p1.mLiveAudienceShareHighlightConfig != null) {
             p0.r("audienceShareHighLight");
             this.N.write(p0, p1.mLiveAudienceShareHighlightConfig);
          }
          if (p1.mLiveControlFileDownloadConfig != null) {
             p0.r("liveControlFileDownloadConfig");
             this.O.write(p0, p1.mLiveControlFileDownloadConfig);
          }
          if (p1.mLiveEscrowNoticeConfig != null) {
             p0.r("liveEntrust");
             this.P.write(p0, p1.mLiveEscrowNoticeConfig);
          }
          if (p1.mLiveCheckStatusConfig != null) {
             p0.r("checkLivingConfig");
             this.Q.write(p0, p1.mLiveCheckStatusConfig);
          }
          p0.r("disableSettingReservationItem");
          p0.P(p1.mDisableSettingReservationItem);
          if (p1.mLiveCollectionConfig != null) {
             p0.r("liveBottomSquareConfig");
             this.R.write(p0, p1.mLiveCollectionConfig);
          }
          if (p1.mLiveRevenueActivityConfig != null) {
             p0.r("liveRevenueActivity");
             this.S.write(p0, p1.mLiveRevenueActivityConfig);
          }
          if (p1.mLiveCommonActivityWidgetConfig != null) {
             p0.r("liveCommonActivityWidgetConfig");
             this.T.write(p0, p1.mLiveCommonActivityWidgetConfig);
          }
          if (p1.mLiveCommentPlaceholderConfig != null) {
             p0.r("liveCommentPlaceholder");
             this.U.write(p0, p1.mLiveCommentPlaceholderConfig);
          }
          if (p1.mEffectMap != null) {
             p0.r("liveEffectiveMapInfo");
             this.V.write(p0, p1.mEffectMap);
          }
          if (p1.mLineLiveConfig != null) {
             p0.r("liveLineChat");
             this.W.write(p0, p1.mLineLiveConfig);
          }
          if (p1.mLiveEntryCoverGuideConfig != null) {
             p0.r("liveCoverNoticeGuide");
             this.X.write(p0, p1.mLiveEntryCoverGuideConfig);
          }
          if (p1.liveSwitchesConfig != null) {
             p0.r("switches");
             this.Z.write(p0, p1.liveSwitchesConfig);
          }
          if (p1.mLiveMagicBoxConfig != null) {
             p0.r("magicBox");
             this.a0.write(p0, p1.mLiveMagicBoxConfig);
          }
          if (p1.mLiveSquareConfig != null) {
             p0.r("liveSquare");
             this.b0.write(p0, p1.mLiveSquareConfig);
          }
          if (p1.mLiveTopUserForbiddenInfo != null) {
             p0.r("topForbidden");
             this.c0.write(p0, p1.mLiveTopUserForbiddenInfo);
          }
          if (p1.mLiveFollowGuideConfig != null) {
             p0.r("liveFollowGuide");
             this.d0.write(p0, p1.mLiveFollowGuideConfig);
          }
          if (p1.mPrepareConfigStrategy != null) {
             p0.r("prepareConfigStrategy");
             this.e0.write(p0, p1.mPrepareConfigStrategy);
          }
          if (p1.mLiveTopicConfig != null) {
             p0.r("liveTagConfig");
             this.f0.write(p0, p1.mLiveTopicConfig);
          }
          if (p1.mLivePreFollowConfig != null) {
             p0.r("preFollowConfig");
             this.g0.write(p0, p1.mLivePreFollowConfig);
          }
          if (p1.mLiveRevenueDeliveryConfig != null) {
             p0.r("revenueDeliveryConfig");
             this.h0.write(p0, p1.mLiveRevenueDeliveryConfig);
          }
          if (p1.mLiveBackgroundTtsConfig != null) {
             p0.r("backgroundPlay");
             this.i0.write(p0, p1.mLiveBackgroundTtsConfig);
          }
          if (p1.mLiveLiteSideBarConfig != null) {
             p0.r("liteSidebarArrangementConfig");
             this.j0.write(p0, p1.mLiveLiteSideBarConfig);
          }
          if (p1.mCommonGuideConfig != null) {
             p0.r("liveLiteCommonGuideConfig");
             this.k0.write(p0, p1.mCommonGuideConfig);
          }
          if (p1.mComboCommentConfig != null) {
             p0.r("liteComboCommentConfig");
             this.l0.write(p0, p1.mComboCommentConfig);
          }
          if (p1.mLiveWishRoomConfig != null) {
             p0.r("liveWishroomConfig");
             this.m0.write(p0, p1.mLiveWishRoomConfig);
          }
          if (p1.mLiveRecruitRepeatApplyConfig != null) {
             p0.r("livePlusRecruitRepeatApplyConfig");
             this.n0.write(p0, p1.mLiveRecruitRepeatApplyConfig);
          }
          if (p1.mLiveMultiLineConfig != null) {
             p0.r("liveMultiLineChat");
             this.o0.write(p0, p1.mLiveMultiLineConfig);
          }
          if (p1.mGiftPanelRechargeButtonConfig != null) {
             p0.r("giftPanelRechargeButtonConfig");
             this.p0.write(p0, p1.mGiftPanelRechargeButtonConfig);
          }
          if (p1.mLiveDisplayUserStateConfig != null) {
             p0.r("userStateConfig");
             this.q0.write(p0, p1.mLiveDisplayUserStateConfig);
          }
          if (p1.mLiveInteractiveWidgetConfig != null) {
             p0.r("liveInteractiveWidgetConfig");
             this.r0.write(p0, p1.mLiveInteractiveWidgetConfig);
          }
          if (p1.mLiveVipGradeConfig != null) {
             p0.r("roomVipConfig");
             this.s0.write(p0, p1.mLiveVipGradeConfig);
          }
          if (p1.mLiveMultiChat != null) {
             p0.r("liveMultiChat");
             this.t0.write(p0, p1.mLiveMultiChat);
          }
          if (p1.mLiveMultiPkConfig != null) {
             p0.r("multiPkConfig");
             this.u0.write(p0, p1.mLiveMultiPkConfig);
          }
          if (p1.mLiveDefaultBackgroundColor != null) {
             p0.r("liveDefaultBackgroundColor");
             TypeAdapters.A.write(p0, p1.mLiveDefaultBackgroundColor);
          }
          if (p1.mLiveExperienceOptimizationConfig != null) {
             p0.r("pureModeConfig");
             this.v0.write(p0, p1.mLiveExperienceOptimizationConfig);
          }
          if (p1.mLivePreparePageConfig != null) {
             p0.r("livePreparePageConfig");
             this.w0.write(p0, p1.mLivePreparePageConfig);
          }
          if (p1.mLiveCny23GiftConfig != null) {
             p0.r("liveCny2023GiftConfig");
             this.x0.write(p0, p1.mLiveCny23GiftConfig);
          }
          if (p1.liveQuizSf2023Config != null) {
             p0.r("liveQuizSf2023");
             this.y0.write(p0, p1.liveQuizSf2023Config);
          }
          if (p1.mLiteCommentAreaShowEmojiConfig != null) {
             p0.r("liteCommentAreaShowEmojiConfig");
             this.z0.write(p0, p1.mLiteCommentAreaShowEmojiConfig);
          }
          if (p1.mLiteLiveBottomPanelConfig != null) {
             p0.r("liveLiteBottomPanelConfig");
             this.A0.write(p0, p1.mLiteLiveBottomPanelConfig);
          }
          if (p1.mLiveGiftPanelRefresh != null) {
             p0.r("liveGiftPanelRefresh");
             this.B0.write(p0, p1.mLiveGiftPanelRefresh);
          }
          p0.j();
       }
       return;
    }
}
