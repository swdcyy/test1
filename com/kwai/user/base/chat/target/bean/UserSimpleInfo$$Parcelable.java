package com.kwai.user.base.chat.target.bean.UserSimpleInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.user.base.chat.target.bean.UserSimpleInfo$$Parcelable$a;
import com.kwai.user.base.chat.target.bean.UserSimpleInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.io.Serializable;
import com.kwai.user.base.chat.target.bean.BottomNavItem;
import com.kwai.user.base.chat.target.bean.TagStyle;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;
import com.kwai.framework.model.user.UserSettingOption;
import java.util.HashMap;
import xwd.b;
import com.kwai.framework.model.user.ProfilePageInfo;
import com.kwai.framework.model.user.ProfilePageInfo$$Parcelable;
import com.kwai.user.base.chat.target.bean.WhatsUpButton;
import com.kwai.user.base.chat.target.bean.MorePanelData;
import com.kwai.framework.model.user.UserVerifiedDetail;
import com.kwai.framework.model.user.UserVerifiedDetail$$Parcelable;
import com.kwai.user.base.chat.target.bean.UserMoodInfo;
import com.kwai.user.base.chat.target.bean.UserPendant;
import java.util.List;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map$Entry;

public class UserSimpleInfo$$Parcelable implements Parcelable, d	// class@00197e
{
    public UserSimpleInfo userSimpleInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       UserSimpleInfo$$Parcelable.CREATOR = new UserSimpleInfo$$Parcelable$a();
    }
    public void UserSimpleInfo$$Parcelable(UserSimpleInfo p0){
       super();
       this.userSimpleInfo$$0 = p0;
    }
    public static UserSimpleInfo read(Parcel p0,a p1){
       List list1;
       Map map;
       List list2;
       int i2;
       ArrayList uArrayList;
       int i3;
       ArrayList uArrayList1;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          UserSimpleInfo userSimpleIn = new UserSimpleInfo();
          p1.f(p1.g(), userSimpleIn);
          userSimpleIn.mNameAbbr = p0.readString();
          boolean i1 = p0.readInt();
          List list = null;
          boolean b = false;
          if (i1 < 0) {
             list1 = list;
          }else {
             uArrayList1 = new ArrayList(i1);
             for (i2 = 0; i2 < i1; i2 = i2 + 1) {
                uArrayList1.add(p0.readSerializable());
             }
          }
          userSimpleIn.mBottomNavItems = list1;
          userSimpleIn.mMsgCountLeft = p0.readInt();
          userSimpleIn.mSubBiz = p0.readString();
          userSimpleIn.mRelationType = p0.readInt();
          userSimpleIn.mTargetUserType = p0.readInt();
          userSimpleIn.mTagStyle = p0.readSerializable();
          userSimpleIn.mNamePY = p0.readString();
          i1 = p0.readInt();
          if (i1 < 0) {
             list1 = list;
          }else {
             uArrayList1 = new ArrayList(i1);
             for (i2 = 0; i2 < i1; i2 = i2 + 1) {
                uArrayList1.add(CDNUrl$$Parcelable.read(p0, p1));
             }
          }
          userSimpleIn.mHeadUrls = list1;
          userSimpleIn.mUserSettingOption = p0.readSerializable();
          i1 = (p0.readInt() == 1)? true: false;
          userSimpleIn.mAccountCancelled = i1;
          i1 = (p0.readInt() == 1)? true: false;
          userSimpleIn.mIsBlocked = i1;
          i1 = p0.readInt();
          if (i1 < 0) {
             map = list;
          }else {
             map = new HashMap(b.a(i1));
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                map.put(p0.readString(), p0.readString());
             }
          }
          userSimpleIn.mLogParams = map;
          userSimpleIn.mProfilePageInfo = ProfilePageInfo$$Parcelable.read(p0, p1);
          userSimpleIn.mWhatsUpButton = p0.readSerializable();
          userSimpleIn.mTag = p0.readString();
          i1 = p0.readInt();
          if (i1 < 0) {
             list2 = list;
          }else {
             uArrayList = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList.add(p0.readSerializable());
             }
          }
          userSimpleIn.mAccountPanel = list2;
          userSimpleIn.mUserVerifiedDetail = UserVerifiedDetail$$Parcelable.read(p0, p1);
          userSimpleIn.mAlias = p0.readString();
          i1 = (p0.readInt() == 1)? true: false;
          userSimpleIn.mDisableSendImage = i1;
          userSimpleIn.mId = p0.readString();
          i1 = p0.readInt();
          if (i1 < 0) {
             list2 = list;
          }else {
             uArrayList = new ArrayList(i1);
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uArrayList.add(p0.readString());
             }
          }
          userSimpleIn.mPresetPanel = list2;
          userSimpleIn.mUserMoodInfo = p0.readSerializable();
          userSimpleIn.mType = p0.readInt();
          userSimpleIn.mSubbizExtra = p0.readString();
          i1 = p0.readInt();
          if (i1 >= 0) {
             list = new ArrayList(i1);
             for (i2 = 0; i2 < i1; i2 = i2 + 1) {
                list.add(CDNUrl$$Parcelable.read(p0, p1));
             }
          }
          userSimpleIn.mAvatarPendantUrls = list;
          i1 = (p0.readInt() == 1)? true: false;
          userSimpleIn.mIsFollowRequesting = i1;
          i1 = (p0.readInt() == 1)? true: false;
          userSimpleIn.mReplacePresetPanel = i1;
          userSimpleIn.mDenyMessageFlag = p0.readInt();
          if (p0.readInt() == 1) {
             b = true;
          }
          userSimpleIn.mBlockedByOwner = b;
          userSimpleIn.mUserPendant = p0.readSerializable();
          userSimpleIn.mExpireTimestamp = p0.readLong();
          userSimpleIn.mGender = p0.readString();
          userSimpleIn.mName = p0.readString();
          userSimpleIn.mHeadUrl = p0.readString();
          userSimpleIn.mOfficialAccountType = p0.readInt();
          p1.f(i, userSimpleIn);
          return userSimpleIn;
       }
    }
    public static void write(UserSimpleInfo p0,Parcel p1,int p2,a p3){
       Iterator iterator;
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mNameAbbr);
          UserSimpleInfo mBottomNavIt = p0.mBottomNavItems;
          if (mBottomNavIt == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mBottomNavIt.size());
             iterator = p0.mBottomNavItems.iterator();
             while (iterator.hasNext()) {
                p1.writeSerializable(iterator.next());
             }
          }
          p1.writeInt(p0.mMsgCountLeft);
          p1.writeString(p0.mSubBiz);
          p1.writeInt(p0.mRelationType);
          p1.writeInt(p0.mTargetUserType);
          p1.writeSerializable(p0.mTagStyle);
          p1.writeString(p0.mNamePY);
          mBottomNavIt = p0.mHeadUrls;
          if (mBottomNavIt == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mBottomNavIt.size());
             iterator = p0.mHeadUrls.iterator();
             while (iterator.hasNext()) {
                CDNUrl$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeSerializable(p0.mUserSettingOption);
          p1.writeInt(p0.mAccountCancelled);
          p1.writeInt(p0.mIsBlocked);
          mBottomNavIt = p0.mLogParams;
          if (mBottomNavIt == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mBottomNavIt.size());
             iterator = p0.mLogParams.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                p1.writeString(uEntry.getKey());
                p1.writeString(uEntry.getValue());
             }
          }
          ProfilePageInfo$$Parcelable.write(p0.mProfilePageInfo, p1, p2, p3);
          p1.writeSerializable(p0.mWhatsUpButton);
          p1.writeString(p0.mTag);
          mBottomNavIt = p0.mAccountPanel;
          if (mBottomNavIt == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mBottomNavIt.size());
             iterator = p0.mAccountPanel.iterator();
             while (iterator.hasNext()) {
                p1.writeSerializable(iterator.next());
             }
          }
          UserVerifiedDetail$$Parcelable.write(p0.mUserVerifiedDetail, p1, p2, p3);
          p1.writeString(p0.mAlias);
          p1.writeInt(p0.mDisableSendImage);
          p1.writeString(p0.mId);
          mBottomNavIt = p0.mPresetPanel;
          if (mBottomNavIt == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mBottomNavIt.size());
             iterator = p0.mPresetPanel.iterator();
             while (iterator.hasNext()) {
                p1.writeString(iterator.next());
             }
          }
          p1.writeSerializable(p0.mUserMoodInfo);
          p1.writeInt(p0.mType);
          p1.writeString(p0.mSubbizExtra);
          mBottomNavIt = p0.mAvatarPendantUrls;
          if (mBottomNavIt == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mBottomNavIt.size());
             iterator = p0.mAvatarPendantUrls.iterator();
             while (iterator.hasNext()) {
                CDNUrl$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeInt(p0.mIsFollowRequesting);
          p1.writeInt(p0.mReplacePresetPanel);
          p1.writeInt(p0.mDenyMessageFlag);
          p1.writeInt(p0.mBlockedByOwner);
          p1.writeSerializable(p0.mUserPendant);
          p1.writeLong(p0.mExpireTimestamp);
          p1.writeString(p0.mGender);
          p1.writeString(p0.mName);
          p1.writeString(p0.mHeadUrl);
          p1.writeInt(p0.mOfficialAccountType);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public UserSimpleInfo getParcel(){
       return this.userSimpleInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       UserSimpleInfo$$Parcelable.write(this.userSimpleInfo$$0, p0, p1, new a());
    }
}
