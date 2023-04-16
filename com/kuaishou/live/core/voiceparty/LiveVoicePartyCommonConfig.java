package com.kuaishou.live.core.voiceparty.LiveVoicePartyCommonConfig;
import java.io.Serializable;
import java.lang.Object;

public class LiveVoicePartyCommonConfig implements Serializable	// class@00130a
{
    public long mAboardMicGuideDuration;
    public Map mAboardMicTypeSwitchToastMap;
    public long mApplyCountQueryIntervalMs;
    public boolean mCanOpenVoicePartyOnlyPhoneVerified;
    public LiveVoicePartyCommonConfig$CountDownAboardConfig mCountDownAboardConfig;
    public boolean mDisableShowChannelFeeds;
    public boolean mDisableShowEmojiButton;
    public boolean mEnableAboardControl;
    public boolean mEnableAboardOptimize;
    public boolean mEnableGuestVideo;
    public boolean mEnableMicSeatUserLevel;
    public boolean mEnableMicSeatsFreeLayout;
    public boolean mEnableMicSeatsInteraction;
    public boolean mEnablePortraitVideo;
    public boolean mEnableToAudienceGiftShowUserName;
    public LiveVoicePartyCommonConfig$FollowGuestGuide mFollowGuestGuide;
    public boolean mIsFixedPrivateScopeVoiceParty;
    public String mMicSeatsLevelContributionRule;
    public int mRoomType;
    public List mSquareEntranceList;
    public boolean mUseVoicePartyFeedV2;
    public long mVoicePartyDelaySwitchMillis;
    public VoicePartyHatConfig mVoicePartyHatConfig;
    public LiveVoicePartyCommonConfig$WishListCommonNotice mWishListCommonNotice;
    public static final long serialVersionUID = 0x5e210b7bb3715db3;

    public void LiveVoicePartyCommonConfig(){
       super();
       this.mApplyCountQueryIntervalMs = 0x2710;
    }
}
