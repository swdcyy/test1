package com.yxcorp.gifshow.profile.model.UserProfileMeta$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.profile.model.UserProfileMeta$$Parcelable$a;
import com.yxcorp.gifshow.profile.model.UserProfileMeta;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.yxcorp.gifshow.profile.model.CommercialCooperationLabel;
import com.yxcorp.gifshow.profile.model.CommercialCooperationLabel$$Parcelable;
import java.io.Serializable;
import com.yxcorp.gifshow.profile.model.UserMiddleButton;
import com.kwai.framework.model.user.UserProfileMissUInfo;
import com.kwai.framework.model.user.UserProfileMissUInfo$$Parcelable;
import com.yxcorp.gifshow.profile.model.ProfileTemplateCardInfo;
import com.kwai.framework.model.user.ProfileBannedInfo;
import java.lang.Boolean;
import com.yxcorp.gifshow.profile.model.UserProfileBgMedia;
import com.kwai.framework.model.user.ProfileTabModel;
import com.yxcorp.gifshow.model.IntimateRelationGroup;
import com.yxcorp.gifshow.profile.model.IpLocation;
import com.yxcorp.gifshow.profile.model.McnOrganizationDetail;
import com.yxcorp.gifshow.profile.model.Commodity;
import com.yxcorp.gifshow.profile.model.ProfileEmptyTabInfo;
import com.yxcorp.gifshow.profile.model.ProfileEmptyTabInfo$$Parcelable;
import com.yxcorp.gifshow.profile.model.ProfileAccountInfo;
import com.kwai.framework.model.user.IntimateTag;
import com.kwai.framework.model.user.IntimateTag$$Parcelable;
import com.yxcorp.gifshow.profile.model.IntimateRelationUsers;
import com.yxcorp.gifshow.profile.model.Hometown;
import com.yxcorp.gifshow.profile.model.ProfileAvatarLiveInfo;
import com.yxcorp.gifshow.profile.model.UserOperationEntranceGroup;
import com.yxcorp.gifshow.profile.model.CommonRoleLabel;
import com.yxcorp.gifshow.profile.model.CommonRoleLabel$$Parcelable;
import com.yxcorp.gifshow.model.ProfileTemplateCard;
import com.yxcorp.gifshow.profile.model.KnockedInfo;
import java.util.List;
import java.util.Iterator;

public class UserProfileMeta$$Parcelable implements Parcelable, d	// class@0013c9
{
    public UserProfileMeta userProfileMeta$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       UserProfileMeta$$Parcelable.CREATOR = new UserProfileMeta$$Parcelable$a();
    }
    public void UserProfileMeta$$Parcelable(UserProfileMeta p0){
       super();
       this.userProfileMeta$$0 = p0;
    }
    public static UserProfileMeta read(Parcel p0,a p1){
       List list;
       Boolean uBoolean;
       ArrayList uArrayList;
       int i2;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          UserProfileMeta userProfileM = new UserProfileMeta();
          p1.f(p1.g(), userProfileM);
          userProfileM.mMcnOrganization = p0.readString();
          userProfileM.mIntimateRelationLabel = p0.readInt();
          int i1 = 0;
          boolean b = true;
          boolean b1 = (p0.readInt() == b)? true: false;
          userProfileM.mDisplayProfileIntegrityDynamicEffect = b1;
          b1 = p0.readInt();
          UserOperationEntranceGroup[] userOperatio = null;
          if (b1 < 0) {
             list = userOperatio;
          }else {
             uArrayList = new ArrayList(b1);
             for (i2 = 0; i2 < b1; i2 = i2 + 1) {
                uArrayList.add(CommercialCooperationLabel$$Parcelable.read(p0, p1));
             }
          }
          userProfileM.mCommercialCooperationLabel = list;
          b1 = p0.readInt();
          if (b1 < 0) {
             list = userOperatio;
          }else {
             uArrayList = new ArrayList(b1);
             for (i2 = 0; i2 < b1; i2 = i2 + 1) {
                uArrayList.add(p0.readSerializable());
             }
          }
          userProfileM.mUserMiddleButtons = list;
          userProfileM.mMissUInfo = UserProfileMissUInfo$$Parcelable.read(p0, p1);
          userProfileM.mProfileTemplateCardInfo = p0.readSerializable();
          userProfileM.mBannedInfo = p0.readSerializable();
          if (p0.readInt() < 0) {
             uBoolean = userOperatio;
          }else if(p0.readInt() == b){
             b1 = true;
          }else {
             b1 = false;
          }
          uBoolean = Boolean.valueOf(b1);
          userProfileM.mEnableIntimateRelation = uBoolean;
          userProfileM.mBgMedia = p0.readSerializable();
          b1 = p0.readInt();
          if (b1 < 0) {
             list = userOperatio;
          }else {
             uArrayList = new ArrayList(b1);
             for (i2 = 0; i2 < b1; i2 = i2 + 1) {
                uArrayList.add(p0.readSerializable());
             }
          }
          userProfileM.mTabList = list;
          userProfileM.mRefreshSource = p0.readString();
          userProfileM.mIntimateRelationGroup = p0.readSerializable();
          b1 = (p0.readInt() == b)? true: false;
          userProfileM.mIsDefaultBackground = b1;
          userProfileM.mIpLocation = p0.readSerializable();
          userProfileM.mMcnOrganizationDetail = p0.readSerializable();
          userProfileM.mCommodity = p0.readSerializable();
          userProfileM.mProfileEmptyTabInfo = ProfileEmptyTabInfo$$Parcelable.read(p0, p1);
          userProfileM.mAccountInfo = p0.readSerializable();
          b1 = (p0.readInt() == b)? true: false;
          userProfileM.mEnableUploadUserBgVideo = b1;
          userProfileM.mIntimateTag = IntimateTag$$Parcelable.read(p0, p1);
          b1 = (p0.readInt() == b)? true: false;
          userProfileM.mEnableIntimateEntranceIntensify = b1;
          userProfileM.mIntimateRelationUsers = p0.readSerializable();
          userProfileM.mHometown = p0.readSerializable();
          userProfileM.mSelectedTabId = p0.readInt();
          userProfileM.mAvatarLiveInfo = p0.readSerializable();
          b1 = (p0.readInt() == b)? true: false;
          userProfileM.mShowDataAssistantEntrance = b1;
          if (p0.readInt() != b) {
             b = false;
          }
          userProfileM.mShowCreatorCenterRedDot = b;
          b1 = p0.readInt();
          if (b1 >= 0) {
             userOperatio = new UserOperationEntranceGroup[b1];
             for (; i1 < b1; i1 = i1 + 1) {
                userOperatio[i1] = p0.readSerializable();
             }
          }
          userProfileM.mOperationEntranceGroups = userOperatio;
          userProfileM.mCommonRoleLabel = CommonRoleLabel$$Parcelable.read(p0, p1);
          userProfileM.mLiveInfo = p0.readSerializable();
          userProfileM.mKnockedInfo = p0.readSerializable();
          p1.f(i, userProfileM);
          return userProfileM;
       }
    }
    public static void write(UserProfileMeta p0,Parcel p1,int p2,a p3){
       Iterator iterator;
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mMcnOrganization);
          p1.writeInt(p0.mIntimateRelationLabel);
          p1.writeInt(p0.mDisplayProfileIntegrityDynamicEffect);
          UserProfileMeta mCommercialC = p0.mCommercialCooperationLabel;
          if (mCommercialC == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mCommercialC.size());
             iterator = p0.mCommercialCooperationLabel.iterator();
             while (iterator.hasNext()) {
                CommercialCooperationLabel$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          mCommercialC = p0.mUserMiddleButtons;
          if (mCommercialC == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mCommercialC.size());
             iterator = p0.mUserMiddleButtons.iterator();
             while (iterator.hasNext()) {
                p1.writeSerializable(iterator.next());
             }
          }
          UserProfileMissUInfo$$Parcelable.write(p0.mMissUInfo, p1, p2, p3);
          p1.writeSerializable(p0.mProfileTemplateCardInfo);
          p1.writeSerializable(p0.mBannedInfo);
          if (p0.mEnableIntimateRelation == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(1);
             p1.writeInt(p0.mEnableIntimateRelation.booleanValue());
          }
          p1.writeSerializable(p0.mBgMedia);
          mCommercialC = p0.mTabList;
          if (mCommercialC == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mCommercialC.size());
             iterator = p0.mTabList.iterator();
             while (iterator.hasNext()) {
                p1.writeSerializable(iterator.next());
             }
          }
          p1.writeString(p0.mRefreshSource);
          p1.writeSerializable(p0.mIntimateRelationGroup);
          p1.writeInt(p0.mIsDefaultBackground);
          p1.writeSerializable(p0.mIpLocation);
          p1.writeSerializable(p0.mMcnOrganizationDetail);
          p1.writeSerializable(p0.mCommodity);
          ProfileEmptyTabInfo$$Parcelable.write(p0.mProfileEmptyTabInfo, p1, p2, p3);
          p1.writeSerializable(p0.mAccountInfo);
          p1.writeInt(p0.mEnableUploadUserBgVideo);
          IntimateTag$$Parcelable.write(p0.mIntimateTag, p1, p2, p3);
          p1.writeInt(p0.mEnableIntimateEntranceIntensify);
          p1.writeSerializable(p0.mIntimateRelationUsers);
          p1.writeSerializable(p0.mHometown);
          p1.writeInt(p0.mSelectedTabId);
          p1.writeSerializable(p0.mAvatarLiveInfo);
          p1.writeInt(p0.mShowDataAssistantEntrance);
          p1.writeInt(p0.mShowCreatorCenterRedDot);
          mCommercialC = p0.mOperationEntranceGroups;
          if (mCommercialC == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mCommercialC.length);
             mCommercialC = p0.mOperationEntranceGroups;
             i1 = mCommercialC.length;
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                p1.writeSerializable(mCommercialC[i2]);
             }
          }
          CommonRoleLabel$$Parcelable.write(p0.mCommonRoleLabel, p1, p2, p3);
          p1.writeSerializable(p0.mLiveInfo);
          p1.writeSerializable(p0.mKnockedInfo);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public UserProfileMeta getParcel(){
       return this.userProfileMeta$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       UserProfileMeta$$Parcelable.write(this.userProfileMeta$$0, p0, p1, new a());
    }
}
