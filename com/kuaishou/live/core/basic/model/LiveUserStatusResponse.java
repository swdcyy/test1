package com.kuaishou.live.core.basic.model.LiveUserStatusResponse;
import java.io.Serializable;
import java.lang.Object;

public class LiveUserStatusResponse implements Serializable	// class@0008ac
{
    public LiveUserStatusResponse$ActivityEnterRoomHint mActivityEnterRoomHint;
    public int mAssistantType;
    public String mBulletCommentBackgroundKey;
    public String mBulletCommentColor;
    public int mCommentDisplayBatchSize;
    public UserInfos$PicUrl[] mCurrentUserHeadWidget;
    public UserInfos$PicUrl[] mCurrentUserHeadWidgetAnimation;
    public LiveUserStatusResponse$CustomizationConfig mCustomizationConfig;
    public boolean mDisableLike;
    public boolean mDisableScreenRecord;
    public boolean mDisableWatchingDurationFollowGuide;
    public LiveUserStatusResponse$LiveDisplayAnonymousInfo mDisplayAnonymousInfoConfig;
    public boolean mEnableAudienceOpenKtvVideo;
    public boolean mEnableBlindDateGiftGuide;
    public boolean mEnableFansGroupRedPackOptimize;
    public boolean mEnableLandscapeActivityWidget;
    public boolean mEnableLivePortraitScreencast;
    public boolean mEnableLiveScreencast;
    public boolean mEnableSendMagicBoxToGuest;
    public boolean mEnableShowLiveAskThanksButton;
    public boolean mEnableShowWeeklyTopUserList;
    public boolean mEnableVipGrade;
    public boolean mEnableVipGradeWatchingList;
    public LiveUserStatusResponse$ForbidCommentStatus mForbidCommentStatus;
    public boolean mGemsCollectorNeedAnonymous;
    public long mGetEndSummaryMaxDelayMs;
    public CDNUrl[] mHeadWidget;
    public CDNUrl[] mHeadWidgetAnimationUrls;
    public boolean mIsAnonymousLive;
    public boolean mIsKoi;
    public int mLiveAskQuestionWordsLimit;
    public LiveUserStatusResponse$LiveChatUserStatus mLiveChatUserStatus;
    public LiveCommentHotWords mLiveCommentHotWords;
    public List mLiveCommentNoticeInfoList;
    public LiveUserStatusResponse$LiveCommentStyle mLiveCommentStyle;
    public LiveCommentsFoldMessageConfig mLiveCommentsFoldMessageConfig;
    public LiveFansGroupInfo mLiveFansGroupInfo;
    public LiveUserStatusResponse$LiveOverRoomHighValueFrequencyConfig mLiveOverRoomHighValueFrequencyConfig;
    public LiveRebroadcastInfo mLiveRebroadcastInfo;
    public LiveRedPackRainConfig mLiveRedPackRainConfig;
    public LiveUserStatusResponse$LiveShareSubBiz mLiveShareSubBiz;
    public LiveUserStatusResponse$LiveShopConfig mLiveShopConfig;
    public List mLiveVipGradeConfList;
    public LiveUserStatusResponse$LiveVoicePartyConfig mLiveVoicePartyConfig;
    public LiveUserStatusResponse$LiveWishListInfo mLiveWishListInfo;
    public boolean mShouldAllowGiftToAudience;
    public String mSpecifiedSubBiz;
    public static final long serialVersionUID = 0xa221a807f4b23d5e;

    public void LiveUserStatusResponse(){
       super();
       this.mIsKoi = false;
       this.mShouldAllowGiftToAudience = false;
       this.mEnableSendMagicBoxToGuest = false;
       this.mEnableAudienceOpenKtvVideo = false;
    }
}
