package com.kwai.framework.model.user.UserExtraInfo;
import java.io.Serializable;
import java.lang.Object;

public class UserExtraInfo implements Serializable	// class@001753
{
    public String mAdminLastVisitDisplay;
    public String mAge;
    public String mAggrCardTitle;
    public RichTextMeta mAggrSubCardTitle;
    public int mAmount;
    public int mAssistantType;
    public String mBase64Segments;
    public String mBgUrl;
    public String mCityName;
    public QUserContactName mContactName;
    public boolean mDisableJumpUserProfile;
    public String mDisplayKsCoin;
    public String mDisplayScore;
    public String mDisplayWatchDuration;
    public Map mExposedInfo;
    public long mFan;
    public int mFanGroupLevel;
    public LiveFansGroupIntimacyInfo mFansGroupIntimacy;
    public String mFansGroupName;
    public long mFollow;
    public List mHighLightTexts;
    public List mIconSegments;
    public boolean mIsFansTopAudience;
    public boolean mIsFirstSendGift;
    public boolean mIsFollowing;
    public boolean mIsLivePurchaseFansPromotionUser;
    public boolean mIsLiving;
    public boolean mIsTopPayingUser;
    public boolean mIsWatching;
    public String mKwaiVoiceDiffVotes;
    public int mKwaiVoiceRank;
    public int mKwaiVoiceRankChange;
    public int mKwaiVoiceRankType;
    public String mKwaiVoiceVotes;
    public String mLastLiveDesc;
    public String mLiveStreamId;
    public UserExtraInfo$LiveUserInfo mLiveUserInfo;
    public String mMessage;
    public boolean mOffline;
    public String mOpenUserName;
    public int mPhoto;
    public RichTextMeta mPhotoOrLivingInfo;
    public boolean mPrivateMsg;
    public LiveAdminPrivilege mPrivilege;
    public long mReceivedZuan;
    public RichTextMeta mRecoTextInfo;
    public int mRecoTextScene;
    public String mRecommendReason;
    public int mRecommendReasonValue;
    public String mRemarksName;
    public List mRoleInfos;
    public String mSameArea;
    public String mSchoolName;
    public String mSendGiftAmount;
    public String mSex;
    public UserExtraInfo$TextColor mTextColor;
    public UserExtraInfo$Truncate mTruncate;
    public UserExtraInfo$UserInfoExposed mUserInfoExposed;
    public static final long serialVersionUID = 0x2f0707d9eac8ead3;

    public void UserExtraInfo(){
       super();
       this.mAssistantType = -1;
    }
    public boolean isTopPayingUser(){
       return this.mIsTopPayingUser;
    }
}
