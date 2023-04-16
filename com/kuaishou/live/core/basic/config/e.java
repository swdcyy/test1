package com.kuaishou.live.core.basic.config.e;
import erd.g;
import java.lang.Object;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse;
import o56.a;
import java.lang.Integer;
import o56.c;
import s02.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import d86.c;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import com.google.gson.Gson;
import d86.b;
import java.lang.reflect.Type;
import el.a;
import ekd.q;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Double;
import com.google.gson.internal.LinkedTreeMap;
import java.util.Objects;
import wg3.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import java.lang.StringBuilder;
import oe6.g;
import o56.d;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import s02.b;
import io7.x;
import zk.d;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.kwai.sdk.switchconfig.ConfigPriority;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveFloatingWindowConfig;
import t99.e;
import java.lang.Long;
import p99.b;
import s02.d;
import s02.c;
import qs5.e;
import com.kwai.feature.api.live.plugin.dva.LivePluginManager;
import com.kuaishou.android.live.log.LiveLogTag;
import fg6.a;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class e implements g	// class@00082e
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final void accept(Object p0){
       int i = 0;
       Integer integer = Integer.valueOf(i);
       if (a.G || a.a().c()) {
          g og = g.class;
          if (!PatchProxy.applyVoidOneRefs(p0, null, og, "1")) {
             Map map = PatchProxy.apply(null, null, c.class, "8");
             if (map != PatchProxyResult.class) {
             }else {
                map = new Gson().i(c.f("kuaishouAppLive.json"), new b().getType());
             }
             if (map != null && !q.h(map)) {
                LiveConfigStartupResponse liveSwitches = p0.liveSwitchesConfig;
                if (!PatchProxy.applyVoidTwoRefs(liveSwitches, map, null, og, "2")) {
                   Iterator iterator = map.entrySet().iterator();
                   while (iterator.hasNext()) {
                      Map$Entry uEntry = iterator.next();
                      String key = uEntry.getKey();
                      Object value = uEntry.getValue();
                      String str = "value";
                      if (liveSwitches.containsKey(key)) {
                         Map map1 = liveSwitches.get(key);
                         map1.put(str, value);
                         if (map1.containsKey("policy")) {
                            Object obj = map1.get("policy");
                            if (obj instanceof Double) {
                               if (obj.intValue() == 1) {
                                  map1.put("policy", integer);
                               }
                            }else if(obj instanceof Integer && obj.intValue() == 1){
                               map1.put("policy", integer);
                            }
                         }
                      }else {
                         LinkedTreeMap linkedTreeMa = new LinkedTreeMap();
                         linkedTreeMa.put(str, value);
                         linkedTreeMa.put("policy", integer);
                         liveSwitches.put(key, linkedTreeMa);
                      }
                      Objects.toString(value);
                      Objects.toString(liveSwitches.get(key));
                   }
                }
             }
          }
       }
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putString("liveQuizSf2023Config", b.e(p0.liveQuizSf2023Config));
       uEditor.putLong("anchorBackgroundQueryLiveStatusIntervalMs", p0.mAnchorBackgroundQueryLiveStatusIntervalMs);
       uEditor.putLong("userAssociateRequestMaxDelayMillis", p0.mAudienceAssociateRequestMaxDelayMillis);
       uEditor.putString("liteComboCommentConfig", b.e(p0.mComboCommentConfig));
       uEditor.putString("liveLiteCommonGuideConfig", b.e(p0.mCommonGuideConfig));
       uEditor.putBoolean(b.d("user")+"disableAuthorWeeklyReportSubscribe", p0.mDisableAuthorWeeklyReportSubscribe);
       uEditor.putBoolean("disableLiveAnchorFrameMetrics", p0.mDisableLiveAnchorFrameMetrics);
       uEditor.putBoolean("disableLivePushFpsMonitor", p0.mDisableLivePushFpsMonitor);
       uEditor.putBoolean("disableRequestProfileFeedIgnorePublicPhotoCount", p0.mDisableRequestProfileFeedIgnorePublicPhotoCount);
       uEditor.putBoolean("disableSettingReservationItem", p0.mDisableSettingReservationItem);
       uEditor.putBoolean(b.d("user")+"disableShowWealthGrade", p0.mDisableShowWealthGrade);
       uEditor.putBoolean("disableToAudienceGiftSlotDisplay", p0.mDisableToAudienceGiftSlotDisplay);
       uEditor.putBoolean("disableUseOldToken", p0.mDisableUseOldToken);
       uEditor.putString("liveEffectMap", b.e(p0.mEffectMap));
       uEditor.putString("liveGiftPanelRechargeButtonConfig", b.e(p0.mGiftPanelRechargeButtonConfig));
       uEditor.putString("liveLineConfig", b.e(p0.mLineLiveConfig));
       uEditor.putString("liteCommentAreaShowEmojiConfig", b.e(p0.mLiteCommentAreaShowEmojiConfig));
       uEditor.putString("liteBottomBarConfig", b.e(p0.mLiteLiveBottomPanelConfig));
       uEditor.putLong("liveAnchorFrameMetricsIntervalMs", p0.mLiveAnchorFrameMetricsIntervalMs);
       uEditor.putString("anchorUVCConfig", b.e(p0.mLiveAnchorUVCConfig));
       uEditor.putString("liveAudienceDelayInfosRequestDelayConfig", b.e(p0.mLiveAudienceDelayInfosRequestDelayConfig));
       uEditor.putString("liveGiftConfig", b.e(p0.mLiveAudienceGiftConfig));
       uEditor.putString("liveAudienceShareHighlightConfig", b.e(p0.mLiveAudienceShareHighlightConfig));
       uEditor.putString("backgroundMusicTipConfig", b.e(p0.mLiveBackgroundMusicTipConfig));
       uEditor.putString("liveBackgroundTtsConfig", b.e(p0.mLiveBackgroundTtsConfig));
       uEditor.putString(b.d("user")+"liveBeautyConfig", b.e(p0.mLiveBeautifyConfig));
       uEditor.putString("liveCheckStatusConfig", b.e(p0.mLiveCheckStatusConfig));
       uEditor.putString("liveCny2023GiftConfig", b.e(p0.mLiveCny23GiftConfig));
       uEditor.putString("liveCollectionConfig", b.e(p0.mLiveCollectionConfig));
       uEditor.putString("liveCommentPlaceholderConfig", b.e(p0.mLiveCommentPlaceholderConfig));
       uEditor.putString("liveCommonActivityWidgetConfig", b.e(p0.mLiveCommonActivityWidgetConfig));
       uEditor.putString("liveCommonShareConfig", b.e(p0.mLiveCommonShareConfig));
       uEditor.putString("liveControlFileDownloadConfig", b.e(p0.mLiveControlFileDownloadConfig));
       uEditor.putString("liveDefaultBackgroundColor", p0.mLiveDefaultBackgroundColor);
       uEditor.putString("liveDisplayCountStyle", b.e(p0.mLiveDisplayCountStyle));
       uEditor.putString("LiveDisplayUserStateConfig", b.e(p0.mLiveDisplayUserStateConfig));
       uEditor.putString("liveDistrictRankConfig", b.e(p0.mLiveDistrictRankConfig));
       uEditor.putString("liveActivityPushConfig", b.e(p0.mLiveDivertPushV2Config));
       uEditor.putString("liveEntryCoverGuideConfig", b.e(p0.mLiveEntryCoverGuideConfig));
       uEditor.putString("liveEscrowNoticeConfig", b.e(p0.mLiveEscrowNoticeConfig));
       uEditor.putString("pureModeConfig", b.e(p0.mLiveExperienceOptimizationConfig));
       uEditor.putString("liveFansGroupConfig", b.e(p0.mLiveFansGroupConfig));
       uEditor.putString("liveFloatingWindowConfig", b.e(p0.mLiveFloatingWindowConfig));
       uEditor.putString("liveFollowGuideConfig", b.e(p0.mLiveFollowGuideConfig));
       uEditor.putString("liveFollowConfig", b.e(p0.mLiveFollowUserPhotoFeedConfig));
       uEditor.putString("liveFriendFeedConfig", b.e(p0.mLiveFriendFeedConfig));
       uEditor.putString("liveGRConfig", b.e(p0.mLiveGRConfig));
       uEditor.putString("liveGiftPanelRefresh", b.e(p0.mLiveGiftPanelRefresh));
       uEditor.putString("liveInteractiveUserTagConfig", b.e(p0.mLiveInteractiveUserTagConfig));
       uEditor.putString("liveInteractiveWidgetConfig", b.e(p0.mLiveInteractiveWidgetConfig));
       uEditor.putString("liveLiteRecoGuideConfig", b.e(p0.mLiveLiteRecoGuideConfig));
       uEditor.putString("liteSidebarConfig", b.e(p0.mLiveLiteSideBarConfig));
       uEditor.putString("luckyStarConfig", b.e(p0.mLiveLuckyStarConfig));
       uEditor.putString("liveMagicBoxConfig", b.e(p0.mLiveMagicBoxConfig));
       uEditor.putString("liveMerchantForbiddenConfig", b.e(p0.mLiveMerchantForbiddenConfig));
       uEditor.putString("liveMmuConfig", b.e(p0.mLiveMmuConfig));
       uEditor.putString("liveMultiChat", b.e(p0.mLiveMultiChat));
       uEditor.putString("liveMultiLineChat", b.e(p0.mLiveMultiLineConfig));
       uEditor.putString("multiPkConfig", b.e(p0.mLiveMultiPkConfig));
       uEditor.putString("livePkConfig", b.e(p0.mLivePkConfig));
       uEditor.putString("livePreFollowConfig", b.e(p0.mLivePreFollowConfig));
       uEditor.putString("livePreparePageConfig", b.e(p0.mLivePreparePageConfig));
       uEditor.putString("liveProfile", b.e(p0.mLiveProfileConfig));
       uEditor.putString("raceConfig", b.e(p0.mLiveRaceConfig));
       uEditor.putString("liveRecruitRepeatApplyConfig", b.e(p0.mLiveRecruitRepeatApplyConfig));
       uEditor.putString("liveRedPackConfig", b.e(p0.mLiveRedPackConfig));
       uEditor.putString("liveRevenueActivityConfig", b.e(p0.mLiveRevenueActivityConfig));
       uEditor.putString("liveRevenueDeliveryConfig", b.e(p0.mLiveRevenueDeliveryConfig));
       uEditor.putString("liveRobotConfig", b.e(p0.mLiveRobotConfig));
       uEditor.putString("liveSquareConfig", b.e(p0.mLiveSquareConfig));
       uEditor.putString("liveSquareFeedConfig", b.e(p0.mLiveSquareFeedConfig));
       uEditor.putString("liveSquareSideBarNoticeConfig", b.e(p0.mLiveSquareSideBarNoticeConfig));
       uEditor.putString("liveTopUserForbiddenInfo", b.e(p0.mLiveTopUserForbiddenInfo));
       uEditor.putString("liveTopicConfig", b.e(p0.mLiveTopicConfig));
       uEditor.putString("liveVipGradeConfig", b.e(p0.mLiveVipGradeConfig));
       uEditor.putString("liveWishRoomConfig", b.e(p0.mLiveWishRoomConfig));
       uEditor.putString("maintenanceConfig", b.e(p0.mMaintenanceConfig));
       uEditor.putString("nebulaLiveAudienceAdWidgetConfig", b.e(p0.mNebulaLiveAdConfig));
       uEditor.putString(b.d("user")+"prepareConfigStrategy", b.e(p0.mPrepareConfigStrategy));
       uEditor.putString("liveNebulaSendGiftTaskConfig", b.e(p0.mSendGiftTaskConfig));
       uEditor.putString("liveVoicePartyCommonConfig", b.e(p0.mVoicePartyConfig));
       uEditor.putString("liveVoicePartyCrossRoomPkConfig", b.e(p0.mVoicePartyCrossRoomPkConfig));
       uEditor.putString("liveVoicePartyKtvCommonConfig", b.e(p0.mVoicePartyKtvConfig));
       uEditor.putString("liveVoicePartyTheaterCommonConfig", b.e(p0.mVoicePartyTheaterConfig));
       g.a(uEditor);
       if (d.i) {
          c uoc = a.t().u("SOURCE_LIVE");
          uoc.m(new b(uoc));
          d uod = new d();
          uod.c();
          uoc.h(uod.b().x(p0.liveSwitchesConfig), ConfigPriority.LOW);
       }
       LiveConfigStartupResponse mLiveFloatin = p0.mLiveFloatingWindowConfig;
       if (mLiveFloatin != null) {
          LiveConfigStartupResponse$LiveFloatingWindowConfig mPollStatusI = mLiveFloatin.mPollStatusIntervalMs;
          e uoe = e.class;
          if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidOneRefs(Long.valueOf(mPollStatusI), null, uoe, "1")) {
             if (mPollStatusI - 3000 < 0) {
                b.a(mPollStatusI);
             }else {
                b.a(3000);
             }
          }
       }
       if (!PatchProxy.applyVoidOneRefs(p0, null, d.class, "2")) {
          LivePluginManager.h(i, new c("onLiveConfigStartupFetch", p0));
       }
       b.Z(LiveLogTag.LIVE_PLAY_CONFIG, "result: "+a.a.q(p0));
       return;
    }
}
