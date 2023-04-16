package com.kwai.feature.api.social.profile.model.ProfileParam$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.api.social.profile.model.ProfileParam$$Parcelable$a;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Class;
import org.parceler.a;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.feed.BaseFeed$$Parcelable;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.entity.QPhoto$$Parcelable;
import com.yxcorp.gifshow.model.response.UserProfileResponse;
import com.yxcorp.gifshow.model.response.UserProfileResponse$$Parcelable;
import java.io.Serializable;
import com.kwai.framework.model.user.ProfileBannedInfo;
import java.lang.ClassLoader;
import android.os.Bundle;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.framework.model.user.UserProfile$$Parcelable;
import java.util.HashMap;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.User$$Parcelable;
import com.kwai.feature.api.social.moment.model.MomentLocateParam;

public class ProfileParam$$Parcelable implements Parcelable, d	// class@0011ad
{
    public ProfileParam profileParam$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       ProfileParam$$Parcelable.CREATOR = new ProfileParam$$Parcelable$a();
    }
    public void ProfileParam$$Parcelable(ProfileParam p0){
       super();
       this.profileParam$$0 = p0;
    }
    public static ProfileParam read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          ProfileParam profileParam = new ProfileParam();
          p1.f(p1.g(), profileParam);
          profileParam.mPageUrl = p0.readString();
          profileParam.mPhotoTabId = p0.readInt();
          ProfileParam profileParam1 = ProfileParam.class;
          boolean b = false;
          boolean b1 = (p0.readInt() == 1)? true: false;
          a.d(profileParam1, profileParam, "mIsFirstEnterSelfProfile", Boolean.valueOf(b1));
          profileParam.mBaseFeed = BaseFeed$$Parcelable.read(p0, p1);
          profileParam.mReferPhoto = QPhoto$$Parcelable.read(p0, p1);
          a.d(ProfileParam.class, profileParam, "mTunaExtraParams", p0.readString());
          boolean b2 = (p0.readInt() == 1)? true: false;
          profileParam.mAutoSelectedMomentBtn = b2;
          profileParam.mUserProfileResponse = UserProfileResponse$$Parcelable.read(p0, p1);
          profileParam.mProfileBannedInfo = p0.readSerializable();
          profileParam.mBanReason = p0.readString();
          profileParam.mBanText = p0.readString();
          b2 = (p0.readInt() == 1)? true: false;
          profileParam.mIsFullyShown = b2;
          profileParam.mPhotoSceneType = p0.readString();
          profileParam.mFollowRefer = p0.readInt();
          b2 = (p0.readInt() == 1)? true: false;
          profileParam.mProfileFollow = b2;
          profileParam.mScene = p0.readInt();
          profileParam.mCollectSubTabName = p0.readString();
          profileParam.mPhotoExpTag = p0.readString();
          b2 = (p0.readInt() == 1)? true: false;
          profileParam.mFirstLoadUserProfile = b2;
          b2 = (p0.readInt() == 1)? true: false;
          profileParam.mIsBackgroundDefault = b2;
          a.d(ProfileParam.class, profileParam, "mBusinessSceneType", p0.readString());
          profileParam.mFragmentArgs = p0.readBundle(ProfileParam$$Parcelable.class.getClassLoader());
          profileParam.mServerExpTag = p0.readString();
          profileParam.mUserProfile = UserProfile$$Parcelable.read(p0, p1);
          profileParam.mAdExtInfo = p0.readSerializable();
          profileParam.mPrePageId = p0.readInt();
          profileParam.mUser = User$$Parcelable.read(p0, p1);
          b2 = (p0.readInt() == 1)? true: false;
          profileParam.mBanDisallowAppeal = b2;
          profileParam.mMomentParam = p0.readSerializable();
          profileParam.mVerifiedUrl = p0.readString();
          profileParam.mPrePageUrl = p0.readString();
          profileParam.mPhotoID = p0.readString();
          profileParam.mAdExtra = p0.readString();
          if (p0.readInt() == 1) {
             b = true;
          }
          profileParam.mIsPartOfDetailActivity = b;
          p1.f(i, profileParam);
          return profileParam;
       }
    }
    public static void write(ProfileParam p0,Parcel p1,int p2,a p3){
       String str = String.class;
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mPageUrl);
          p1.writeInt(p0.mPhotoTabId);
          p1.writeInt(a.b(Boolean.TYPE, ProfileParam.class, p0, "mIsFirstEnterSelfProfile").booleanValue());
          BaseFeed$$Parcelable.write(p0.mBaseFeed, p1, p2, p3);
          QPhoto$$Parcelable.write(p0.mReferPhoto, p1, p2, p3);
          p1.writeString(a.b(str, ProfileParam.class, p0, "mTunaExtraParams"));
          p1.writeInt(p0.mAutoSelectedMomentBtn);
          UserProfileResponse$$Parcelable.write(p0.mUserProfileResponse, p1, p2, p3);
          p1.writeSerializable(p0.mProfileBannedInfo);
          p1.writeString(p0.mBanReason);
          p1.writeString(p0.mBanText);
          p1.writeInt(p0.mIsFullyShown);
          p1.writeString(p0.mPhotoSceneType);
          p1.writeInt(p0.mFollowRefer);
          p1.writeInt(p0.mProfileFollow);
          p1.writeInt(p0.mScene);
          p1.writeString(p0.mCollectSubTabName);
          p1.writeString(p0.mPhotoExpTag);
          p1.writeInt(p0.mFirstLoadUserProfile);
          p1.writeInt(p0.mIsBackgroundDefault);
          p1.writeString(a.b(str, ProfileParam.class, p0, "mBusinessSceneType"));
          p1.writeBundle(p0.mFragmentArgs);
          p1.writeString(p0.mServerExpTag);
          UserProfile$$Parcelable.write(p0.mUserProfile, p1, p2, p3);
          p1.writeSerializable(p0.mAdExtInfo);
          p1.writeInt(p0.mPrePageId);
          User$$Parcelable.write(p0.mUser, p1, p2, p3);
          p1.writeInt(p0.mBanDisallowAppeal);
          p1.writeSerializable(p0.mMomentParam);
          p1.writeString(p0.mVerifiedUrl);
          p1.writeString(p0.mPrePageUrl);
          p1.writeString(p0.mPhotoID);
          p1.writeString(p0.mAdExtra);
          p1.writeInt(p0.mIsPartOfDetailActivity);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public ProfileParam getParcel(){
       return this.profileParam$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       ProfileParam$$Parcelable.write(this.profileParam$$0, p0, p1, new a());
    }
}
