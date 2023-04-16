package com.kuaishou.live.core.basic.model.LiveAnchorStatusResponse;
import java.io.Serializable;
import java.lang.Object;

public class LiveAnchorStatusResponse implements Serializable	// class@00085c
{
    public String customRedPackSkinPanelRouterUrl;
    public boolean enableCustomRedPackSkinPanel;
    public LiveAnchorStatisticInfo mAnchorStatisticInfo;
    public int mCommentDisplayBatchSize;
    public LiveAnchorStatusResponse$LiveAnchorContentPromotionConfig mContentPromotionConfig;
    public LiveCustomPkSkinTheme mCustomPkSkinTheme;
    public boolean mDisablePkPunishEndAutoFollowFunction;
    public boolean mEnableFansIncrease;
    public boolean mEnableLiveScreenRecord;
    public boolean mEnableReportLiveStreamFeedStats;
    public boolean mEnableShowWeeklyTopUserList;
    public boolean mEnableSuperDiversionPosition;
    public boolean mEnableVoicePartyAuthorFollowGuestBubble;
    public boolean mEnableVoicePartyMicSeatsShareGuide;
    public int mFansGroupMedalType;
    public CDNUrl[] mHeadWidget;
    public CDNUrl[] mHeadWidgetAnimationUrls;
    public String mHonorMedalIconFileName;
    public LiveInteractMagicFaceConfig mInteractMagicFaceConfig;
    public LiveHourlyRankPendantPriorityInfo mLeftTopHourlyRankPendantPriorityInfo;
    public LiveAnchorPayBulletConfig mLiveAnchorPayBulletConfig;
    public LiveHourlyRankConfig mLiveAudienceContributionRankConfig;
    public LiveAnchorStatusResponse$LiveChatAuthorStatus mLiveChatAuthorStatus;
    public List mLiveCommentNoticeInfoList;
    public LiveCommentsFoldMessageConfig mLiveCommentsFoldMessageConfig;
    public LiveEffectConfig mLiveEffectConfig;
    public LiveFellowInfo mLiveFellowInfo;
    public LiveFlowDiversionPayV2ConfigInfo mLiveFlowDiversionPayV2ConfigInfo;
    public List mLiveGiftSlotGrades;
    public List mLiveGiftSlotSpecialComboList;
    public LiveLikeNewStyleConfig mLiveLikeNewStyleConfig;
    public LiveLinePayChatForMerchantConfig mLiveLinePayChatForMerchantConfig;
    public LiveAnchorStatusResponse$LiveNewAuthorRulesVideoInfo mLiveNewAuthorRulesVideoInfo;
    public LivePkCPSConfig mLivePkCPSConfig;
    public LiveHourlyRankConfig mLivePopularityRankConfig;
    public String mLivePortalDiversionDetailSchema;
    public LiveSellingChatConfig mLiveSellingChatChatConfig;
    public LiveAnchorStatusResponse$LiveMiniProgramConfig mMiniProgramConfig;
    public long mPkRecommendReportInterval;
    public LiveAnchorStatusResponse$LiveAnchorRedFlowerInfo mRedFlowerInfo;
    public List mSignalBlockConfig;
    public String mSpringCeremonyNamingData;
    public List mSubscribeInfo;
    public LiveAnchorStatusResponse$LiveAnchorTopUserFilterEnableCommentNotice mTopUserFilterEnableCommentNotice;
    public VoicePartyMicSeatsShareConfig mVoicePartyMicSeatsShareConfig;
    public static long DEFAULT_PK_RECOMMEND_REPORT_INTERVAL_MS = 0xbb8;
    public static final long serialVersionUID = 0x1e849f39888fd329;

    public void LiveAnchorStatusResponse(){
       super();
       this.mPkRecommendReportInterval = LiveAnchorStatusResponse.DEFAULT_PK_RECOMMEND_REPORT_INTERVAL_MS;
       this.mDisablePkPunishEndAutoFollowFunction = false;
    }
}
