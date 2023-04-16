package com.kwai.framework.model.user.UserSettingOption;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Integer;
import ab.d;

public class UserSettingOption implements Serializable	// class@001773
{
    public boolean enableAddWatermark;
    public boolean enableRecommendToKnows;
    public boolean enableWatermark;
    public boolean isCommentDenied;
    public boolean isDownloadDenied;
    public boolean isFrequentlyUserDenied;
    public boolean isKnockUDenied;
    public boolean isLocationHidden;
    public boolean isMessageDenied;
    public boolean isMissUDenied;
    public boolean isPrivacyUser;
    public boolean isShowIntimateRelation;
    public boolean isShowNearbyOnlineStatus;
    public boolean isShowOnlineStatus;
    public boolean mDisableLatestAlbumAsset;
    public boolean mDisablePushMyComments;
    public boolean mDisableSmartAlbumTabs;
    public boolean mEnablePhotoViewer;
    public boolean mEnableShake;
    public boolean mEnableShowAlbumInProfile;
    public boolean mEnableShowRemoved;
    public boolean mEnableShowReverseRemoved;
    public int mFansList;
    public boolean mIsAcquaintanceDenied;
    public boolean mIsAllowMomentCommentDeny;
    public boolean mIsAllowOthersRewardMe;
    public boolean mIsGiftUnfollow;
    public boolean mIsNotAllowFindMeByMobile;
    public boolean mIsPublicFollow;
    public boolean mIsScreenshotFeedbackDisabled;
    public boolean mIsShowCloseFollow;
    public boolean mIsWifiPreUploadDeny;
    public int mMentionedMeWorksTabSetting;
    public int mMessagePrivacy;
    public NewsPrivacy mNewsPrivacy;
    public boolean mNotPublicProfileCollectTab;
    public boolean mNotShareLiveStreamFragment;
    public boolean mShouldAutoSaveToLocal;
    public boolean mShouldEnableLocalIntelligenceAlbum;
    public int mUserOnlineStatueSetting;
    public boolean notRecommendToContacts;
    public boolean notRecommendToQQFriend;
    public static final long serialVersionUID = 0x2fe22fcc3287d79f;

    public void UserSettingOption(){
       super();
       this.mShouldEnableLocalIntelligenceAlbum = true;
       this.mDisableSmartAlbumTabs = true;
       this.mEnableShowAlbumInProfile = true;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UserSettingOption.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || this.getClass() != p0.getClass()) {
          return false;
       }
       if (this.isPrivacyUser != p0.isPrivacyUser || (this.isLocationHidden != p0.isLocationHidden || (this.isMessageDenied != p0.isMessageDenied || (this.isCommentDenied != p0.isCommentDenied || (this.isMissUDenied != p0.isMissUDenied || (this.isKnockUDenied != p0.isKnockUDenied || (this.isDownloadDenied != p0.isDownloadDenied || (this.notRecommendToContacts != p0.notRecommendToContacts || (this.notRecommendToQQFriend != p0.notRecommendToQQFriend || (this.enableWatermark != p0.enableWatermark || (this.enableAddWatermark != p0.enableAddWatermark || (this.mShouldAutoSaveToLocal != p0.mShouldAutoSaveToLocal || (this.mMessagePrivacy != p0.mMessagePrivacy || (this.mFansList != p0.mFansList || (this.mNewsPrivacy != p0.mNewsPrivacy || (this.mIsWifiPreUploadDeny != p0.mIsWifiPreUploadDeny || (this.mIsGiftUnfollow != p0.mIsGiftUnfollow || (this.mIsPublicFollow != p0.mIsPublicFollow || (this.mIsShowCloseFollow != p0.mIsShowCloseFollow || (this.mIsAcquaintanceDenied != p0.mIsAcquaintanceDenied || (this.mIsScreenshotFeedbackDisabled != p0.mIsScreenshotFeedbackDisabled || (this.isShowOnlineStatus != p0.isShowOnlineStatus || (this.mNotShareLiveStreamFragment != p0.mNotShareLiveStreamFragment || (this.mNotPublicProfileCollectTab != p0.mNotPublicProfileCollectTab || (this.mIsAllowOthersRewardMe != p0.mIsAllowOthersRewardMe || (this.mIsNotAllowFindMeByMobile != p0.mIsNotAllowFindMeByMobile || (this.mMentionedMeWorksTabSetting != p0.mMentionedMeWorksTabSetting || (this.mDisablePushMyComments != p0.mDisablePushMyComments || (this.isFrequentlyUserDenied != p0.isFrequentlyUserDenied || (this.mIsAllowMomentCommentDeny != p0.mIsAllowMomentCommentDeny || (this.mUserOnlineStatueSetting != p0.mUserOnlineStatueSetting || (this.mEnableShowAlbumInProfile != p0.mEnableShowAlbumInProfile || (this.mShouldEnableLocalIntelligenceAlbum@0041ee != p0.mShouldEnableLocalIntelligenceAlbum@0041ee || (this.mEnableShake@0041da != p0.mEnableShake@0041da || this.mEnablePhotoViewer@0041d9 != p0.mEnablePhotoViewer@
    0041d9)))))))))))))))))))))))))))))))))) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, UserSettingOption.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[35];
       obj[0] = Boolean.valueOf(this.isPrivacyUser);
       obj[1] = Boolean.valueOf(this.isLocationHidden);
       obj[2] = Boolean.valueOf(this.isMessageDenied);
       obj[3] = Boolean.valueOf(this.isCommentDenied);
       obj[4] = Boolean.valueOf(this.isMissUDenied);
       obj[5] = Boolean.valueOf(this.isKnockUDenied);
       obj[6] = Boolean.valueOf(this.isDownloadDenied);
       obj[7] = Boolean.valueOf(this.notRecommendToContacts);
       obj[8] = Boolean.valueOf(this.notRecommendToQQFriend);
       obj[9] = Boolean.valueOf(this.enableWatermark);
       obj[10] = Boolean.valueOf(this.enableAddWatermark);
       obj[11] = Boolean.valueOf(this.mShouldAutoSaveToLocal);
       obj[12] = Integer.valueOf(this.mMessagePrivacy);
       obj[13] = Integer.valueOf(this.mFansList);
       obj[14] = this.mNewsPrivacy;
       obj[15] = Boolean.valueOf(this.mIsWifiPreUploadDeny);
       obj[16] = Boolean.valueOf(this.mIsGiftUnfollow);
       obj[17] = Boolean.valueOf(this.mIsPublicFollow);
       obj[18] = Boolean.valueOf(this.mIsShowCloseFollow);
       obj[19] = Boolean.valueOf(this.mIsAcquaintanceDenied);
       obj[20] = Boolean.valueOf(this.mIsScreenshotFeedbackDisabled);
       obj[21] = Boolean.valueOf(this.isShowOnlineStatus);
       obj[22] = Boolean.valueOf(this.mNotShareLiveStreamFragment);
       obj[23] = Boolean.valueOf(this.mNotPublicProfileCollectTab);
       obj[24] = Boolean.valueOf(this.mIsAllowOthersRewardMe);
       obj[25] = Boolean.valueOf(this.mIsNotAllowFindMeByMobile);
       obj[26] = Boolean.valueOf(this.mDisablePushMyComments);
       obj[27] = Boolean.valueOf(this.isFrequentlyUserDenied);
       obj[28] = Boolean.valueOf(this.mIsAllowMomentCommentDeny);
       obj[29] = Integer.valueOf(this.mMentionedMeWorksTabSetting);
       obj[30] = Boolean.valueOf(this.mEnableShowAlbumInProfile);
       obj[31] = Integer.valueOf(this.mUserOnlineStatueSetting);
       obj[32] = Boolean.valueOf(this.mShouldEnableLocalIntelligenceAlbum);
       obj[33] = Boolean.valueOf(this.mEnablePhotoViewer);
       obj[34] = Boolean.valueOf(this.mEnableShake);
       return d.b(obj);
    }
}
