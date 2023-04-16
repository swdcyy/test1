package com.yxcorp.gifshow.profile.common.model.UserProfileCommonMeta$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.profile.common.model.UserProfileCommonMeta$$Parcelable$a;
import com.yxcorp.gifshow.profile.common.model.UserProfileCommonMeta;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.io.Serializable;
import com.yxcorp.gifshow.profile.common.model.ProfileStatusInfo;
import com.kwai.framework.model.user.AdBusinessInfo;
import com.yxcorp.gifshow.profile.common.model.ProfilePendant;
import java.util.ArrayList;
import com.yxcorp.gifshow.profile.common.model.UserCollectCount;
import java.util.List;
import java.util.Iterator;

public class UserProfileCommonMeta$$Parcelable implements Parcelable, d	// class@0012e0
{
    public UserProfileCommonMeta userProfileCommonMeta$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       UserProfileCommonMeta$$Parcelable.CREATOR = new UserProfileCommonMeta$$Parcelable$a();
    }
    public void UserProfileCommonMeta$$Parcelable(UserProfileCommonMeta p0){
       super();
       this.userProfileCommonMeta$$0 = p0;
    }
    public static UserProfileCommonMeta read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          UserProfileCommonMeta userProfileC = new UserProfileCommonMeta();
          p1.f(p1.g(), userProfileC);
          int i1 = 0;
          boolean b = true;
          int b1 = (p0.readInt() == b)? true: false;
          userProfileC.mIsDefaultName = b1;
          userProfileC.mProfileStatusInfo = p0.readSerializable();
          if (p0.readInt() != b) {
             b = false;
          }
          userProfileC.mCanGuestShowMomentNews = b;
          userProfileC.mAdBusinessInfo = p0.readSerializable();
          userProfileC.mProfilePendant = p0.readSerializable();
          b1 = p0.readInt();
          if (b1 < 0) {
             list = null;
          }else {
             ArrayList uArrayList = new ArrayList(b1);
             for (; i1 < b1; i1 = i1 + 1) {
                uArrayList.add(p0.readString());
             }
             list = uArrayList;
          }
          userProfileC.mCollectTabs = list;
          userProfileC.mUserCollectCount = p0.readSerializable();
          p1.f(i, userProfileC);
          return userProfileC;
       }
    }
    public static void write(UserProfileCommonMeta p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mIsDefaultName);
          p1.writeSerializable(p0.mProfileStatusInfo);
          p1.writeInt(p0.mCanGuestShowMomentNews);
          p1.writeSerializable(p0.mAdBusinessInfo);
          p1.writeSerializable(p0.mProfilePendant);
          UserProfileCommonMeta mCollectTabs = p0.mCollectTabs;
          if (mCollectTabs == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mCollectTabs.size());
             Iterator iterator = p0.mCollectTabs.iterator();
             while (iterator.hasNext()) {
                p1.writeString(iterator.next());
             }
          }
          p1.writeSerializable(p0.mUserCollectCount);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public UserProfileCommonMeta getParcel(){
       return this.userProfileCommonMeta$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       UserProfileCommonMeta$$Parcelable.write(this.userProfileCommonMeta$$0, p0, p1, new a());
    }
}
