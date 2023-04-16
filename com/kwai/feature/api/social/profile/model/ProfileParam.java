package com.kwai.feature.api.social.profile.model.ProfileParam;
import java.io.Serializable;
import im8.g;
import java.lang.Object;
import java.lang.String;
import com.kwai.framework.model.user.User;
import qa6.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fx5.f;
import java.util.Map;
import java.util.HashMap;
import com.kwai.framework.model.user.UserProfile;
import com.yxcorp.gifshow.model.response.UserProfileResponse;

public class ProfileParam implements Serializable, g	// class@0011ae
{
    public HashMap mAdExtInfo;
    public String mAdExtra;
    public boolean mAutoSelectedMomentBtn;
    public boolean mBanDisallowAppeal;
    public String mBanReason;
    public String mBanText;
    public BaseFeed mBaseFeed;
    public String mBusinessSceneType;
    public String mCollectSubTabName;
    public boolean mFirstLoadUserProfile;
    public int mFollowRefer;
    public Bundle mFragmentArgs;
    public boolean mIsBackgroundDefault;
    public boolean mIsFirstEnterSelfProfile;
    public boolean mIsFullyShown;
    public boolean mIsPartOfDetailActivity;
    public MomentLocateParam mMomentParam;
    public String mPageUrl;
    public String mPhotoExpTag;
    public String mPhotoID;
    public String mPhotoSceneType;
    public int mPhotoTabId;
    public int mPrePageId;
    public String mPrePageUrl;
    public ProfileBannedInfo mProfileBannedInfo;
    public boolean mProfileFollow;
    public QPhoto mReferPhoto;
    public int mScene;
    public String mServerExpTag;
    public String mTunaExtraParams;
    public User mUser;
    public UserProfile mUserProfile;
    public UserProfileResponse mUserProfileResponse;
    public String mVerifiedUrl;
    public static int mProfileInfoPercent = 255;

    public void ProfileParam(){
       super();
       this.mPhotoTabId = 1;
       this.mBanText = "";
       this.mBanReason = "";
       this.mFirstLoadUserProfile = true;
    }
    public void ProfileParam(String p0,User p1){
       super();
       this.mPhotoTabId = 1;
       this.mBanText = "";
       this.mBanReason = "";
       this.mFirstLoadUserProfile = true;
       this.mPageUrl = p0;
       this.mUser = p1;
       if (a.b(p1)) {
          this.mIsFirstEnterSelfProfile = true;
       }
       return;
    }
    public String getBusinessSceneType(){
       return this.mBusinessSceneType;
    }
    public boolean getIsFirstEnterSelfProfile(){
       return this.mIsFirstEnterSelfProfile;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ProfileParam.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new f();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, ProfileParam.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(ProfileParam.class, new f());
       }else {
          obj.put(ProfileParam.class, null);
       }
       return obj;
    }
    public String getTunaExtraParams(){
       return this.mTunaExtraParams;
    }
    public void setBusinessSceneType(String p0){
       this.mBusinessSceneType = p0;
    }
    public void setIsFirstEnterSelfProfile(boolean p0){
       this.mIsFirstEnterSelfProfile = p0;
    }
    public void setPartOfDetailActivity(boolean p0){
       this.mIsPartOfDetailActivity = p0;
       this.mIsFullyShown = p0 ^ 0x01;
    }
    public ProfileParam setPrePageId(int p0){
       this.mPrePageId = p0;
       return this;
    }
    public ProfileParam setPrePageUrl(String p0){
       this.mPrePageUrl = p0;
       return this;
    }
    public void setTunaExtraParams(String p0){
       this.mTunaExtraParams = p0;
    }
    public ProfileParam setUserProfile(UserProfile p0){
       this.mUserProfile = p0;
       return this;
    }
    public ProfileParam setUserProfileResponse(UserProfileResponse p0){
       this.mUserProfileResponse = p0;
       return this;
    }
}
