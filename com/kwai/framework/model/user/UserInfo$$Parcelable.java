package com.kwai.framework.model.user.UserInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.framework.model.user.UserInfo$$Parcelable$a;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;
import com.kwai.framework.model.user.ProfilePageInfo;
import com.kwai.framework.model.user.ProfilePageInfo$$Parcelable;
import java.io.Serializable;
import com.kwai.framework.model.user.ProfileDynamicPendant;
import com.kwai.framework.model.user.OpenFriendName;
import com.kwai.framework.model.user.UserExtraInfo;
import com.kwai.framework.model.user.UserExtraInfo$$Parcelable;
import com.kwai.framework.model.user.UserCertificationTag;
import com.kwai.framework.model.user.UserCertificationTag$$Parcelable;
import com.kwai.framework.model.user.UserVerifiedDetail;
import com.kwai.framework.model.user.UserVerifiedDetail$$Parcelable;

public class UserInfo$$Parcelable implements Parcelable, d	// class@00175d
{
    public UserInfo userInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       UserInfo$$Parcelable.CREATOR = new UserInfo$$Parcelable$a();
    }
    public void UserInfo$$Parcelable(UserInfo p0){
       super();
       this.userInfo$$0 = p0;
    }
    public static UserInfo read(Parcel p0,a p1){
       CDNUrl[] uCDNUrlArray1;
       int i2;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          UserInfo userInfo = new UserInfo();
          p1.f(p1.g(), userInfo);
          boolean b = false;
          boolean b1 = (p0.readInt() == 1)? true: false;
          userInfo.isVerified = b1;
          userInfo.mSex = p0.readString();
          userInfo.mBanType = p0.readInt();
          b1 = p0.readInt();
          CDNUrl[] uCDNUrlArray = null;
          if (b1 < 0) {
             uCDNUrlArray1 = uCDNUrlArray;
          }else {
             uCDNUrlArray1 = new CDNUrl[b1];
             for (i2 = 0; i2 < b1; i2 = i2 + 1) {
                uCDNUrlArray1[i2] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          userInfo.mBigHeadUrls = uCDNUrlArray1;
          b1 = p0.readInt();
          if (b1 < 0) {
             uCDNUrlArray1 = uCDNUrlArray;
          }else {
             uCDNUrlArray1 = new CDNUrl[b1];
             for (i2 = 0; i2 < b1; i2 = i2 + 1) {
                uCDNUrlArray1[i2] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          userInfo.mHeadUrls = uCDNUrlArray1;
          userInfo.mBanReason = p0.readString();
          b1 = (p0.readInt() == 1)? true: false;
          userInfo.mIsConvertFromProto = b1;
          userInfo.mBanText = p0.readString();
          userInfo.mEncryptedUserId = p0.readString();
          b1 = (p0.readInt() == 1)? true: false;
          userInfo.mFrozen = b1;
          userInfo.mProfilePageInfo = ProfilePageInfo$$Parcelable.read(p0, p1);
          b1 = (p0.readInt() == 1)? true: false;
          userInfo.mVisitorBeFollowed = b1;
          userInfo.mText = p0.readString();
          b1 = (p0.readInt() == 1)? true: false;
          userInfo.mUserBanned = b1;
          userInfo.mDynamicPendant = p0.readSerializable();
          userInfo.mKwaiId = p0.readString();
          userInfo.mOpenFriendName = p0.readSerializable();
          b1 = (p0.readInt() == 1)? true: false;
          userInfo.mUserCanceled = b1;
          userInfo.mProfileBgUrl = p0.readString();
          b1 = p0.readInt();
          if (b1 < 0) {
             uCDNUrlArray1 = uCDNUrlArray;
          }else {
             uCDNUrlArray1 = new CDNUrl[b1];
             for (i2 = 0; i2 < b1; i2 = i2 + 1) {
                uCDNUrlArray1[i2] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          userInfo.mProfileBgUrls = uCDNUrlArray1;
          userInfo.mPendantType = p0.readInt();
          b1 = (p0.readInt() == 1)? true: false;
          userInfo.mDefaultHead = b1;
          userInfo.mExtraInfo = UserExtraInfo$$Parcelable.read(p0, p1);
          userInfo.mId = p0.readString();
          userInfo.mCertificationTag = UserCertificationTag$$Parcelable.read(p0, p1);
          b1 = p0.readInt();
          if (b1 >= 0) {
             uCDNUrlArray = new CDNUrl[b1];
             for (int i1 = 0; i1 < b1; i1 = i1 + 1) {
                uCDNUrlArray[i1] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          userInfo.mAvatarPendants = uCDNUrlArray;
          userInfo.mEncryptUid = p0.readString();
          if (p0.readInt() == 1) {
             b = true;
          }
          userInfo.mBanDisallowAppeal = b;
          userInfo.mVerifiedUrl = p0.readString();
          userInfo.mVerifiedDetail = UserVerifiedDetail$$Parcelable.read(p0, p1);
          userInfo.mName = p0.readString();
          userInfo.mHeadUrl = p0.readString();
          p1.f(i, userInfo);
          return userInfo;
       }
    }
    public static void write(UserInfo p0,Parcel p1,int p2,a p3){
       int len;
       int i3;
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.isVerified);
          p1.writeString(p0.mSex);
          p1.writeInt(p0.mBanType);
          UserInfo mBigHeadUrls = p0.mBigHeadUrls;
          int i2 = 0;
          if (mBigHeadUrls == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mBigHeadUrls.length);
             mBigHeadUrls = p0.mBigHeadUrls;
             len = mBigHeadUrls.length;
             for (i3 = 0; i3 < len; i3 = i3 + 1) {
                CDNUrl$$Parcelable.write(mBigHeadUrls[i3], p1, p2, p3);
             }
          }
          mBigHeadUrls = p0.mHeadUrls;
          if (mBigHeadUrls == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mBigHeadUrls.length);
             mBigHeadUrls = p0.mHeadUrls;
             len = mBigHeadUrls.length;
             for (i3 = 0; i3 < len; i3 = i3 + 1) {
                CDNUrl$$Parcelable.write(mBigHeadUrls[i3], p1, p2, p3);
             }
          }
          p1.writeString(p0.mBanReason);
          p1.writeInt(p0.mIsConvertFromProto);
          p1.writeString(p0.mBanText);
          p1.writeString(p0.mEncryptedUserId);
          p1.writeInt(p0.mFrozen);
          ProfilePageInfo$$Parcelable.write(p0.mProfilePageInfo, p1, p2, p3);
          p1.writeInt(p0.mVisitorBeFollowed);
          p1.writeString(p0.mText);
          p1.writeInt(p0.mUserBanned);
          p1.writeSerializable(p0.mDynamicPendant);
          p1.writeString(p0.mKwaiId);
          p1.writeSerializable(p0.mOpenFriendName);
          p1.writeInt(p0.mUserCanceled);
          p1.writeString(p0.mProfileBgUrl);
          mBigHeadUrls = p0.mProfileBgUrls;
          if (mBigHeadUrls == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mBigHeadUrls.length);
             mBigHeadUrls = p0.mProfileBgUrls;
             len = mBigHeadUrls.length;
             for (i3 = 0; i3 < len; i3 = i3 + 1) {
                CDNUrl$$Parcelable.write(mBigHeadUrls[i3], p1, p2, p3);
             }
          }
          p1.writeInt(p0.mPendantType);
          p1.writeInt(p0.mDefaultHead);
          UserExtraInfo$$Parcelable.write(p0.mExtraInfo, p1, p2, p3);
          p1.writeString(p0.mId);
          UserCertificationTag$$Parcelable.write(p0.mCertificationTag, p1, p2, p3);
          mBigHeadUrls = p0.mAvatarPendants;
          if (mBigHeadUrls == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mBigHeadUrls.length);
             mBigHeadUrls = p0.mAvatarPendants;
             i1 = mBigHeadUrls.length;
             for (; i2 < i1; i2 = i2 + 1) {
                CDNUrl$$Parcelable.write(mBigHeadUrls[i2], p1, p2, p3);
             }
          }
          p1.writeString(p0.mEncryptUid);
          p1.writeInt(p0.mBanDisallowAppeal);
          p1.writeString(p0.mVerifiedUrl);
          UserVerifiedDetail$$Parcelable.write(p0.mVerifiedDetail, p1, p2, p3);
          p1.writeString(p0.mName);
          p1.writeString(p0.mHeadUrl);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public UserInfo getParcel(){
       return this.userInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       UserInfo$$Parcelable.write(this.userInfo$$0, p0, p1, new a());
    }
}
