package com.kwai.framework.model.user.UserProfile$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.framework.model.user.UserProfile$$Parcelable$a;
import com.kwai.framework.model.user.UserProfile;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kwai.framework.model.user.RichTextMeta;
import com.kwai.framework.model.user.RichTextMeta$$Parcelable;
import java.io.Serializable;
import com.kwai.framework.model.user.UserSettingOption;
import com.kwai.framework.model.user.UserSameFollow;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.framework.model.user.UserInfo$$Parcelable;
import com.kwai.framework.model.user.UserOwnerCount;
import com.kwai.framework.model.user.UserOwnerCount$$Parcelable;
import com.kwai.framework.model.user.FriendFollow;
import com.kwai.framework.model.user.UserFollowerRelation;
import com.kwai.framework.model.user.UserFollowerRelation$$Parcelable;
import fa6.a;
import ga6.c;
import java.util.Map;
import ywd.j;
import java.lang.Class;
import org.parceler.a;
import org.parceler.a$c;

public class UserProfile$$Parcelable implements Parcelable, d	// class@001765
{
    public UserProfile userProfile$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       UserProfile$$Parcelable.CREATOR = new UserProfile$$Parcelable$a();
    }
    public void UserProfile$$Parcelable(UserProfile p0){
       super();
       this.userProfile$$0 = p0;
    }
    public static UserProfile read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          UserProfile userProfile = new UserProfile();
          p1.f(p1.g(), userProfile);
          boolean b = false;
          boolean b1 = (p0.readInt() == 1)? true: false;
          userProfile.mEnableMomentTab = b1;
          b1 = (p0.readInt() == 1)? true: false;
          userProfile.mHasReverseRemoved = b1;
          userProfile.mRecoTextInfo = RichTextMeta$$Parcelable.read(p0, p1);
          b1 = (p0.readInt() == 1)? true: false;
          userProfile.isBlocked = b1;
          userProfile.mAgePrivacy = p0.readString();
          userProfile.mUserSettingOption = p0.readSerializable();
          b1 = (p0.readInt() == 1)? true: false;
          userProfile.mIsBlockedByOwner = b1;
          userProfile.mFollowReason = p0.readString();
          userProfile.mSameFollow = p0.readSerializable();
          b1 = (p0.readInt() == 1)? true: false;
          userProfile.isFriend = b1;
          b1 = (p0.readInt() == 1)? true: false;
          userProfile.mHasRemoved = b1;
          userProfile.mProfile = UserInfo$$Parcelable.read(p0, p1);
          userProfile.mAge = p0.readString();
          b1 = (p0.readInt() == 1)? true: false;
          userProfile.isFollowing = b1;
          userProfile.mCityName = p0.readString();
          b1 = (p0.readInt() == 1)? true: false;
          userProfile.isFamiliar = b1;
          b1 = (p0.readInt() == 1)? true: false;
          userProfile.mIsolated = b1;
          b1 = (p0.readInt() == 1)? true: false;
          userProfile.isFollowRequesting = b1;
          b1 = (p0.readInt() == 1)? true: false;
          userProfile.canSendMessage = b1;
          userProfile.mBirthday = p0.readString();
          userProfile.mConstellation = p0.readString();
          userProfile.mOwnerCount = UserOwnerCount$$Parcelable.read(p0, p1);
          userProfile.mFrozenMessage = p0.readString();
          b1 = (p0.readInt() == 1)? true: false;
          userProfile.mIsFavorite = b1;
          userProfile.mModifyKwaiIdExpireInMs = p0.readLong();
          userProfile.mFriendFollow = p0.readSerializable();
          if (p0.readInt() == 1) {
             b = true;
          }
          userProfile.mIsDefaultHead = b;
          userProfile.mUserFollowerRelation = UserFollowerRelation$$Parcelable.read(p0, p1);
          userProfile.mCityCode = p0.readString();
          a.d(a.class, userProfile, "dataMap", new c().d(p0));
          p1.f(i, userProfile);
          return userProfile;
       }
    }
    public static void write(UserProfile p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mEnableMomentTab);
          p1.writeInt(p0.mHasReverseRemoved);
          RichTextMeta$$Parcelable.write(p0.mRecoTextInfo, p1, p2, p3);
          p1.writeInt(p0.isBlocked);
          p1.writeString(p0.mAgePrivacy);
          p1.writeSerializable(p0.mUserSettingOption);
          p1.writeInt(p0.mIsBlockedByOwner);
          p1.writeString(p0.mFollowReason);
          p1.writeSerializable(p0.mSameFollow);
          p1.writeInt(p0.isFriend);
          p1.writeInt(p0.mHasRemoved);
          UserInfo$$Parcelable.write(p0.mProfile, p1, p2, p3);
          p1.writeString(p0.mAge);
          p1.writeInt(p0.isFollowing);
          p1.writeString(p0.mCityName);
          p1.writeInt(p0.isFamiliar);
          p1.writeInt(p0.mIsolated);
          p1.writeInt(p0.isFollowRequesting);
          p1.writeInt(p0.canSendMessage);
          p1.writeString(p0.mBirthday);
          p1.writeString(p0.mConstellation);
          UserOwnerCount$$Parcelable.write(p0.mOwnerCount, p1, p2, p3);
          p1.writeString(p0.mFrozenMessage);
          p1.writeInt(p0.mIsFavorite);
          p1.writeLong(p0.mModifyKwaiIdExpireInMs);
          p1.writeSerializable(p0.mFriendFollow);
          p1.writeInt(p0.mIsDefaultHead);
          UserFollowerRelation$$Parcelable.write(p0.mUserFollowerRelation, p1, p2, p3);
          p1.writeString(p0.mCityCode);
          new c().i(a.c(new a$c(), a.class, p0, "dataMap"), p1);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public UserProfile getParcel(){
       return this.userProfile$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       UserProfile$$Parcelable.write(this.userProfile$$0, p0, p1, new a());
    }
}
