package com.yxcorp.gifshow.profile.model.UserProfileBgMedia$BackgroundVideo;
import java.io.Serializable;
import mkd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.profile.model.UserProfileBgMedia$AuthorInfo;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kwai.framework.model.user.User$FollowStatus;
import com.yxcorp.gifshow.profile.model.UserProfileBgMedia$ExtraInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;

public class UserProfileBgMedia$BackgroundVideo implements Serializable, a	// class@0013c1
{
    public UserProfileBgMedia$AuthorInfo mAuthorInfo;
    public List mCoverThumbnailUrls;
    public Map mExtrasInfo;
    public BaseFeed mFeed;
    public boolean mIsAuditing;
    public String mPhotoId;
    public UserProfileBgMedia$PlayArea mPlayArea;
    public User mUser;
    public List mVideoUrls;
    public static final long serialVersionUID = 0x221febdf03301f70;

    public void UserProfileBgMedia$BackgroundVideo(){
       super();
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, UserProfileBgMedia$BackgroundVideo.class, "3")) {
          return;
       }
       if (this.mAuthorInfo != null) {
          UserProfileBgMedia$BackgroundVideo tmAuthorInfo = this.mAuthorInfo;
          User user = new User(tmAuthorInfo.mId, tmAuthorInfo.mName, tmAuthorInfo.mSex, tmAuthorInfo.mAvatar, tmAuthorInfo.mAvatars);
          this.mUser = v0;
          tmAuthorInfo = this.mAuthorInfo;
          User$FollowStatus fOLLOWING = (tmAuthorInfo.mFollowing != null)? User$FollowStatus.FOLLOWING: User$FollowStatus.UNFOLLOW;
          v0.mFollowStatus = fOLLOWING;
          v0.mProfilePageInfo = tmAuthorInfo.mProfilePageInfo;
          v0.mVisitorBeFollowed = tmAuthorInfo.mVisitorBeFollowed;
          UserProfileBgMedia$AuthorInfo mExtra = tmAuthorInfo.mExtra;
          if (mExtra != null) {
             UserProfileBgMedia$ExtraInfo mUserStatus = mExtra.mUserStatus;
             if (TextUtils.n(mUserStatus, "BANNED")) {
                this.mUser.mBanned = true;
             }else if(TextUtils.n(mUserStatus, "RESET") || TextUtils.n(mUserStatus, "FREEZED")){
                this.mUser.mAccountCanceled = true;
             }else if(TextUtils.n(mUserStatus, "PRIVACY")){
                this.mUser.mPrivate = true;
             }else if(TextUtils.n(mUserStatus, "BLOCK") || TextUtils.n(mUserStatus, "BLOCKED")){
                this.mUser.mBlacked = true;
             }
          }
       }
    label_0084 :
       return;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UserProfileBgMedia$BackgroundVideo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!p0 instanceof UserProfileBgMedia$BackgroundVideo) {
          return false;
       }
       if (this.getClass() != p0.getClass()) {
          return false;
       }
       return TextUtils.n(this.mPhotoId, p0.mPhotoId);
    }
    public int hashCode(){
       UserProfileBgMedia$BackgroundVideo obj = PatchProxy.apply(null, this, UserProfileBgMedia$BackgroundVideo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mPhotoId;
       if (obj != null) {
          return obj.hashCode();
       }
       return super.hashCode();
    }
}
