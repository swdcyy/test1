package com.yxcorp.gifshow.profile.model.response.UserProfileResponseMeta$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.profile.model.response.UserProfileResponseMeta$$Parcelable$a;
import com.yxcorp.gifshow.profile.model.response.UserProfileResponseMeta;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.io.Serializable;
import com.yxcorp.gifshow.profile.model.ProfileTips;
import com.yxcorp.gifshow.profile.model.UserProfileLog;
import com.yxcorp.gifshow.profile.model.UserProfileLog$$Parcelable;
import com.kuaishou.android.model.mix.ActivityUserIconModel;
import com.yxcorp.gifshow.profile.model.ProfileTemplateCardInfo;
import com.yxcorp.gifshow.profile.model.ProfileEmptyPhotoGuideInfo;
import com.yxcorp.gifshow.profile.model.ProfileTotalPhotoLikeInfo;
import java.util.ArrayList;
import com.yxcorp.gifshow.profile.model.ProfilePostRecoTip;
import com.yxcorp.gifshow.profile.model.ProfileDialogInfo;
import com.yxcorp.gifshow.profile.model.ProfileEmptyUserGuideInfo;
import java.util.List;
import java.util.Iterator;

public class UserProfileResponseMeta$$Parcelable implements Parcelable, d	// class@0013f0
{
    public UserProfileResponseMeta userProfileResponseMeta$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       UserProfileResponseMeta$$Parcelable.CREATOR = new UserProfileResponseMeta$$Parcelable$a();
    }
    public void UserProfileResponseMeta$$Parcelable(UserProfileResponseMeta p0){
       super();
       this.userProfileResponseMeta$$0 = p0;
    }
    public static UserProfileResponseMeta read(Parcel p0,a p1){
       List list1;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          UserProfileResponseMeta userProfileR = new UserProfileResponseMeta();
          p1.f(p1.g(), userProfileR);
          userProfileR.mProfileTips = p0.readSerializable();
          int i1 = 0;
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          userProfileR.mShowTorchIcon = b;
          userProfileR.mUserProfileLog = UserProfileLog$$Parcelable.read(p0, p1);
          userProfileR.mActivityUserIconMode = p0.readSerializable();
          userProfileR.mProfileTemplateCardInfo = p0.readSerializable();
          userProfileR.mProfileNoPhotoGuideInfo = p0.readSerializable();
          userProfileR.mProfileTotalPhotoLikeInfo = p0.readSerializable();
          int i2 = p0.readInt();
          List list = null;
          if (i2 < 0) {
             list1 = list;
          }else {
             list1 = new ArrayList(i2);
             for (int i3 = 0; i3 < i2; i3 = i3 + 1) {
                list1.add(p0.readSerializable());
             }
          }
          userProfileR.mProfilePostRecoTipList = list1;
          userProfileR.mDialogInfo = p0.readSerializable();
          i2 = p0.readInt();
          if (i2 >= 0) {
             list = new ArrayList(i2);
             for (; i1 < i2; i1 = i1 + 1) {
                list.add(p0.readSerializable());
             }
          }
          userProfileR.mProfileEmptyUserGuideInfoList = list;
          p1.f(i, userProfileR);
          return userProfileR;
       }
    }
    public static void write(UserProfileResponseMeta p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeSerializable(p0.mProfileTips);
          p1.writeInt(p0.mShowTorchIcon);
          UserProfileLog$$Parcelable.write(p0.mUserProfileLog, p1, p2, p3);
          p1.writeSerializable(p0.mActivityUserIconMode);
          p1.writeSerializable(p0.mProfileTemplateCardInfo);
          p1.writeSerializable(p0.mProfileNoPhotoGuideInfo);
          p1.writeSerializable(p0.mProfileTotalPhotoLikeInfo);
          UserProfileResponseMeta mProfilePost = p0.mProfilePostRecoTipList;
          if (mProfilePost == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mProfilePost.size());
             Iterator iterator1 = p0.mProfilePostRecoTipList.iterator();
             while (iterator1.hasNext()) {
                p1.writeSerializable(iterator1.next());
             }
          }
          p1.writeSerializable(p0.mDialogInfo);
          mProfilePost = p0.mProfileEmptyUserGuideInfoList;
          if (mProfilePost == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mProfilePost.size());
             Iterator iterator = p0.mProfileEmptyUserGuideInfoList.iterator();
             while (iterator.hasNext()) {
                p1.writeSerializable(iterator.next());
             }
          }
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public UserProfileResponseMeta getParcel(){
       return this.userProfileResponseMeta$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       UserProfileResponseMeta$$Parcelable.write(this.userProfileResponseMeta$$0, p0, p1, new a());
    }
}
