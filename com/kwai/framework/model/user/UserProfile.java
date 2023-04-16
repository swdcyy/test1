package com.kwai.framework.model.user.UserProfile;
import java.io.Serializable;
import mkd.a;
import fa6.a;
import com.kwai.framework.model.user.UserSettingOption;
import com.kwai.framework.model.user.UserOwnerCount;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.framework.model.user.UserExtraInfo;

public class UserProfile extends a implements Serializable, a	// class@000be0
{
    public boolean canSendMessage;
    public boolean isBlocked;
    public boolean isFamiliar;
    public boolean isFollowRequesting;
    public boolean isFollowing;
    public boolean isFriend;
    public String mAge;
    public String mAgePrivacy;
    public String mBirthday;
    public long mCacheTime;
    public String mCityCode;
    public String mCityName;
    public String mConstellation;
    public boolean mEnableMomentTab;
    public String mFollowReason;
    public FriendFollow mFriendFollow;
    public String mFrozenMessage;
    public boolean mHasRemoved;
    public boolean mHasReverseRemoved;
    public boolean mIsBlockedByOwner;
    public boolean mIsDefaultHead;
    public boolean mIsFavorite;
    public boolean mIsolated;
    public long mModifyKwaiIdExpireInMs;
    public UserOwnerCount mOwnerCount;
    public UserInfo mProfile;
    public RichTextMeta mRecoTextInfo;
    public UserSameFollow mSameFollow;
    public UserFollowerRelation mUserFollowerRelation;
    public UserSettingOption mUserSettingOption;
    public static final long serialVersionUID = 0x5500b3712485d3c0;

    public void UserProfile(){
       super();
       this.mUserSettingOption = new UserSettingOption();
       this.mOwnerCount = new UserOwnerCount();
    }
    public void UserProfile(UserInfo p0){
       super();
       this.mUserSettingOption = new UserSettingOption();
       this.mOwnerCount = new UserOwnerCount();
       this.mProfile = p0;
    }
    public void UserProfile(UserInfo p0,int p1){
       super();
       this.mUserSettingOption = new UserSettingOption();
       this.mOwnerCount = new UserOwnerCount();
       this.mProfile = p0;
       if (p0.mExtraInfo == null) {
          p0.mExtraInfo = new UserExtraInfo();
       }
       p0.mAssistantType = p1;
       return;
    }
    public void afterDeserialize(){
       if (this.isBlocked != null) {
          boolean b = false;
          this.isFollowing = b;
          this.isFollowRequesting = b;
       }
       if (this.isFollowing != null) {
          UserProfile tmProfile = this.mProfile;
          if (tmProfile != null && tmProfile.mVisitorBeFollowed != null) {
             this.isFriend = true;
          }
       }
       return;
    }
    public boolean isFollowingOrFollowRequesting(){
       boolean b = (this.isFollowing != null || this.isFollowRequesting != null)? true: false;
       return b;
    }
}
