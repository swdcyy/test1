package com.kuaishou.live.core.show.profilecard.http.LiveUserProfileExtraInfo;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.live.basic.api.LiveApiParams$AssistantType;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.util.Arrays;

public class LiveUserProfileExtraInfo implements Serializable	// class@000dd4
{
    public int mAssistType;
    public LiveUserProfileExtraInfo$AudienceConsumptionModule mAudienceConsumptionModule;
    public CDNUrl[] mBackgroundDarkModePicture;
    public CDNUrl[] mBackgroundPicture;
    public CDNUrl[] mBackgroundSpecialShapedAnimationPicture;
    public CDNUrl[] mBackgroundSpecialShapedPicture;
    public String mBase64Segments;
    public boolean mCanJoinFansGroup;
    public boolean mDisableFansGroup;
    public String mDisplayLikeCount;
    public int mFansGroupMemberCount;
    public String mFansGroupName;
    public LiveProfileGiftAchievementEntranceInfo mGiftAchievementEntranceInfo;
    public CDNUrl[] mHeadAnimationWidgetUrls;
    public CDNUrl[] mHeadWidget;
    public CDNUrl[] mHonorPicInfo;
    public LiveUserProfileExtraInfo$UserMicSeatLevelInfo mLevelInfo;
    public LiveBlindDateCardInfo mLiveBlindDateCardInfo;
    public LiveMerchantShopEntranceInfo mLiveMerchantShopEntranceInfo;
    public LiveProfileGuardInfo mLiveProfileGuardInfo;
    public LiveProfileHotSpotInfo mLiveProfileHotSpotInfo;
    public LiveProfileNobleEntranceInfo mLiveProfileNobleEntranceInfo;
    public LiveProfileRevenueDeliveryInfo mLiveProfileRevenueDeliveryInfo;
    public List mLiveStatisticsInfos;
    public LiveSubscribeProfileInfo mLiveSubscribeProfileInfo;
    public UserExtraInfo$LiveUserInfo mLiveUserInfo;
    public String mMysteryRemindText;
    public CDNUrl[] mPrettyNumberPicInfo;
    public int mProfileCardStatisticsInfoType;
    public List mSegments;
    public int mTotalLikeCount;
    public int mTotalReceivedGiftCount;
    public LiveUserProfileExtraInfo$VirtualImage mVirtualImage;
    public int mWealthGrade;
    public static final long serialVersionUID = 0x10a8555d65866b24;

    public void LiveUserProfileExtraInfo(){
       super();
       this.mProfileCardStatisticsInfoType = 1;
    }
    public LiveApiParams$AssistantType getAssistType(){
       LiveUserProfileExtraInfo tmAssistType = this.mAssistType;
       if (tmAssistType == 1) {
          return LiveApiParams$AssistantType.SUPER_ADMIN;
       }
       if (tmAssistType == 2) {
          return LiveApiParams$AssistantType.ADMIN;
       }
       if (tmAssistType != 3) {
          return LiveApiParams$AssistantType.AUDIENCE;
       }
       return LiveApiParams$AssistantType.PUSHER;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveUserProfileExtraInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveUserProfileExtraInfo{mHeadWidget="+Arrays.toString(this.mHeadWidget)+", mBackgroundPicture="+Arrays.toString(this.mBackgroundPicture)+", mWealthGrade="+this.mWealthGrade+", mCanJoinFansGroup="+this.mCanJoinFansGroup+", mDisableFansGroup="+this.mDisableFansGroup+", mFansGroupMemberCount="+this.mFansGroupMemberCount+", mTotalLikeCount="+this.mTotalLikeCount+", mTotalReceivedGiftCount="+this.mTotalReceivedGiftCount+'}';
    }
}
