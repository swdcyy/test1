package com.kuaishou.live.core.show.startup.StagFactoryksfeaturesftlivelivelibrarieslivemodel;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveEscrowNoticeConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveEscrowNoticeConfig$TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveAudienceDelayInfosRequestDelayConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveAudienceDelayInfosRequestDelayConfig$TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveRedPackConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveRedPackConfig$TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveGiftBatchConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveGiftBatchConfig$TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveDisplayCountStyle;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveDisplayCountStyle$TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveSquareSideBarNoticeConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveSquareSideBarNoticeConfig$TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveVoicePartyCrossRoomPkConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveVoicePartyCrossRoomPkConfig$TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LivePkConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LivePkConfig$TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveLiteRecoGuideConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveLiteRecoGuideConfig$TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveLuckyStarConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveLuckyStarConfig$TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveFriendFeedConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveFriendFeedConfig$TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveNebulaSendGiftTaskConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveNebulaSendGiftTaskConfig$TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveAudienceGiftConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveAudienceGiftConfig$TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveMerchantForbiddenConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveMerchantForbiddenConfig$TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveSquareFeedConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveSquareFeedConfig$TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveDistrictRankConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveDistrictRankConfig$TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveAgreementConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveAgreementConfig$TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveGRConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveGRConfig$TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveRobotConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveRobotConfig$TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveMaintenanceConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveMaintenanceConfig$TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveFansGroupConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveFansGroupConfig$TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveProfileConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveProfileConfig$TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveMmuConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveMmuConfig$TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveFollowUserPhotoFeedConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveFollowUserPhotoFeedConfig$TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiteBottomBarConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiteBottomBarConfig$TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveFloatingWindowConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveFloatingWindowConfig$TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$TypeAdapter;

public final class StagFactoryksfeaturesftlivelivelibrarieslivemodel implements j	// class@00108f
{

    public void StagFactoryksfeaturesftlivelivelibrarieslivemodel(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactoryksfeaturesftlivelivelibrarieslivemodel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Class rawType = p1.getRawType();
       if (rawType == LiveConfigStartupResponse$LiveEscrowNoticeConfig.class) {
          return new LiveConfigStartupResponse$LiveEscrowNoticeConfig$TypeAdapter(p0);
       }
       if (rawType == LiveConfigStartupResponse$LiveAudienceDelayInfosRequestDelayConfig.class) {
          return new LiveConfigStartupResponse$LiveAudienceDelayInfosRequestDelayConfig$TypeAdapter(p0);
       }
       if (rawType == LiveConfigStartupResponse$LiveRedPackConfig.class) {
          return new LiveConfigStartupResponse$LiveRedPackConfig$TypeAdapter(p0);
       }
       if (rawType == LiveConfigStartupResponse$LiveGiftBatchConfig.class) {
          return new LiveConfigStartupResponse$LiveGiftBatchConfig$TypeAdapter(p0);
       }
       if (rawType == LiveConfigStartupResponse$LiveDisplayCountStyle.class) {
          return new LiveConfigStartupResponse$LiveDisplayCountStyle$TypeAdapter(p0);
       }
       if (rawType == LiveConfigStartupResponse$LiveSquareSideBarNoticeConfig.class) {
          return new LiveConfigStartupResponse$LiveSquareSideBarNoticeConfig$TypeAdapter(p0);
       }
       if (rawType == LiveConfigStartupResponse$LiveVoicePartyCrossRoomPkConfig.class) {
          return new LiveConfigStartupResponse$LiveVoicePartyCrossRoomPkConfig$TypeAdapter(p0);
       }
       if (rawType == LiveConfigStartupResponse$LivePkConfig.class) {
          return new LiveConfigStartupResponse$LivePkConfig$TypeAdapter(p0);
       }
       if (rawType == LiveConfigStartupResponse$LiveLiteRecoGuideConfig.class) {
          return new LiveConfigStartupResponse$LiveLiteRecoGuideConfig$TypeAdapter(p0);
       }
       if (rawType == LiveConfigStartupResponse$LiveLuckyStarConfig.class) {
          return new LiveConfigStartupResponse$LiveLuckyStarConfig$TypeAdapter(p0);
       }
       if (rawType == LiveConfigStartupResponse$LiveFriendFeedConfig.class) {
          return new LiveConfigStartupResponse$LiveFriendFeedConfig$TypeAdapter(p0);
       }
       if (rawType == LiveConfigStartupResponse$LiveNebulaSendGiftTaskConfig.class) {
          return new LiveConfigStartupResponse$LiveNebulaSendGiftTaskConfig$TypeAdapter(p0);
       }
       if (rawType == LiveConfigStartupResponse$LiveAudienceGiftConfig.class) {
          return new LiveConfigStartupResponse$LiveAudienceGiftConfig$TypeAdapter(p0);
       }
       if (rawType == LiveConfigStartupResponse$LiveMerchantForbiddenConfig.class) {
          return new LiveConfigStartupResponse$LiveMerchantForbiddenConfig$TypeAdapter(p0);
       }
       if (rawType == LiveConfigStartupResponse$LiveSquareFeedConfig.class) {
          return new LiveConfigStartupResponse$LiveSquareFeedConfig$TypeAdapter(p0);
       }
       if (rawType == LiveConfigStartupResponse$LiveDistrictRankConfig.class) {
          return new LiveConfigStartupResponse$LiveDistrictRankConfig$TypeAdapter(p0);
       }
       if (rawType == LiveConfigStartupResponse$LiveAgreementConfig.class) {
          return new LiveConfigStartupResponse$LiveAgreementConfig$TypeAdapter(p0);
       }
       if (rawType == LiveConfigStartupResponse$LiveGRConfig.class) {
          return new LiveConfigStartupResponse$LiveGRConfig$TypeAdapter(p0);
       }
       if (rawType == LiveConfigStartupResponse$LiveRobotConfig.class) {
          return new LiveConfigStartupResponse$LiveRobotConfig$TypeAdapter(p0);
       }
       if (rawType == LiveConfigStartupResponse$LiveMaintenanceConfig.class) {
          return new LiveConfigStartupResponse$LiveMaintenanceConfig$TypeAdapter(p0);
       }
       if (rawType == LiveConfigStartupResponse$LiveFansGroupConfig.class) {
          return new LiveConfigStartupResponse$LiveFansGroupConfig$TypeAdapter(p0);
       }
       if (rawType == LiveConfigStartupResponse$LiveProfileConfig.class) {
          return new LiveConfigStartupResponse$LiveProfileConfig$TypeAdapter(p0);
       }
       if (rawType == LiveConfigStartupResponse$LiveMmuConfig.class) {
          return new LiveConfigStartupResponse$LiveMmuConfig$TypeAdapter(p0);
       }
       if (rawType == LiveConfigStartupResponse$LiveFollowUserPhotoFeedConfig.class) {
          return new LiveConfigStartupResponse$LiveFollowUserPhotoFeedConfig$TypeAdapter(p0);
       }
       if (rawType == LiveConfigStartupResponse$LiteBottomBarConfig.class) {
          return new LiveConfigStartupResponse$LiteBottomBarConfig$TypeAdapter(p0);
       }
       if (rawType == LiveConfigStartupResponse$LiveFloatingWindowConfig.class) {
          return new LiveConfigStartupResponse$LiveFloatingWindowConfig$TypeAdapter(p0);
       }
       if (rawType == LiveConfigStartupResponse.class) {
          return new LiveConfigStartupResponse$TypeAdapter(p0);
       }
       return null;
    }
}
