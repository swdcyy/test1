package com.kwai.framework.model.user.UserExtraInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.framework.model.user.UserExtraInfo$$Parcelable$a;
import com.kwai.framework.model.user.UserExtraInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kwai.framework.model.user.RichTextMeta;
import com.kwai.framework.model.user.RichTextMeta$$Parcelable;
import java.io.Serializable;
import com.kwai.framework.model.user.UserExtraInfo$LiveUserInfo;
import com.kwai.framework.model.user.UserExtraInfo$TextColor;
import com.kwai.framework.model.user.UserExtraInfo$TextColor$$Parcelable;
import com.kwai.framework.model.user.UserExtraInfo$Truncate;
import com.kwai.framework.model.user.UserExtraInfo$Truncate$$Parcelable;
import java.util.ArrayList;
import com.kwai.framework.model.user.UserExtraInfo$RoleInfo;
import com.kwai.framework.model.user.UserExtraInfo$UserInfoExposed;
import com.kuaishou.live.core.show.fansgroup.http.LiveFansGroupIntimacyInfo;
import com.kwai.framework.model.user.QUserContactName;
import com.kwai.framework.model.user.QUserContactName$$Parcelable;
import java.util.HashMap;
import xwd.b;
import com.kwai.framework.model.live.LiveAdminPrivilege;
import com.kwai.framework.model.live.LiveAdminPrivilege$$Parcelable;
import java.util.List;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map$Entry;

public class UserExtraInfo$$Parcelable implements Parcelable, d	// class@001743
{
    public UserExtraInfo userExtraInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       UserExtraInfo$$Parcelable.CREATOR = new UserExtraInfo$$Parcelable$a();
    }
    public void UserExtraInfo$$Parcelable(UserExtraInfo p0){
       super();
       this.userExtraInfo$$0 = p0;
    }
    public static UserExtraInfo read(Parcel p0,a p1){
       List list;
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
          UserExtraInfo userExtraInf = new UserExtraInfo();
          p1.f(p1.g(), userExtraInf);
          userExtraInf.mFansGroupName = p0.readString();
          userExtraInf.mAmount = p0.readInt();
          userExtraInf.mRecommendReasonValue = p0.readInt();
          userExtraInf.mRecoTextInfo = RichTextMeta$$Parcelable.read(p0, p1);
          userExtraInf.mSex = p0.readString();
          boolean b = false;
          boolean b1 = (p0.readInt() == 1)? true: false;
          userExtraInf.mIsTopPayingUser = b1;
          userExtraInf.mAdminLastVisitDisplay = p0.readString();
          userExtraInf.mKwaiVoiceRankType = p0.readInt();
          userExtraInf.mLiveStreamId = p0.readString();
          userExtraInf.mLiveUserInfo = p0.readSerializable();
          b1 = (p0.readInt() == 1)? true: false;
          userExtraInf.mPrivateMsg = b1;
          userExtraInf.mRemarksName = p0.readString();
          userExtraInf.mSchoolName = p0.readString();
          userExtraInf.mTextColor = UserExtraInfo$TextColor$$Parcelable.read(p0, p1);
          userExtraInf.mTruncate = UserExtraInfo$Truncate$$Parcelable.read(p0, p1);
          b1 = (p0.readInt() == 1)? true: false;
          userExtraInf.mIsWatching = b1;
          b1 = (p0.readInt() == 1)? true: false;
          userExtraInf.mIsFansTopAudience = b1;
          userExtraInf.mBase64Segments = p0.readString();
          userExtraInf.mAggrSubCardTitle = RichTextMeta$$Parcelable.read(p0, p1);
          b1 = (p0.readInt() == 1)? true: false;
          userExtraInf.mIsFollowing = b1;
          userExtraInf.mBgUrl = p0.readString();
          userExtraInf.mSameArea = p0.readString();
          userExtraInf.mPhotoOrLivingInfo = RichTextMeta$$Parcelable.read(p0, p1);
          userExtraInf.mAggrCardTitle = p0.readString();
          userExtraInf.mFollow = p0.readLong();
          userExtraInf.mKwaiVoiceRank = p0.readInt();
          b1 = p0.readInt();
          Map map = null;
          if (b1 < 0) {
             list = map;
          }else {
             uArrayList = new ArrayList(b1);
             for (i2 = 0; i2 < b1; i2 = i2 + 1) {
                uArrayList.add(p0.readSerializable());
             }
          }
          userExtraInf.mRoleInfos = list;
          userExtraInf.mKwaiVoiceVotes = p0.readString();
          userExtraInf.mDisplayWatchDuration = p0.readString();
          userExtraInf.mFanGroupLevel = p0.readInt();
          b1 = p0.readInt();
          if (b1 < 0) {
             list = map;
          }else {
             uArrayList = new ArrayList(b1);
             for (i2 = 0; i2 < b1; i2 = i2 + 1) {
                uArrayList.add(p0.readString());
             }
          }
          userExtraInf.mHighLightTexts = list;
          userExtraInf.mFan = p0.readLong();
          userExtraInf.mAssistantType = p0.readInt();
          userExtraInf.mDisplayScore = p0.readString();
          userExtraInf.mSendGiftAmount = p0.readString();
          userExtraInf.mUserInfoExposed = p0.readSerializable();
          userExtraInf.mMessage = p0.readString();
          userExtraInf.mFansGroupIntimacy = p0.readSerializable();
          userExtraInf.mPhoto = p0.readInt();
          userExtraInf.mAge = p0.readString();
          userExtraInf.mLastLiveDesc = p0.readString();
          b1 = (p0.readInt() == 1)? true: false;
          userExtraInf.mDisableJumpUserProfile = b1;
          userExtraInf.mCityName = p0.readString();
          userExtraInf.mDisplayKsCoin = p0.readString();
          userExtraInf.mContactName = QUserContactName$$Parcelable.read(p0, p1);
          userExtraInf.mRecommendReason = p0.readString();
          userExtraInf.mKwaiVoiceRankChange = p0.readInt();
          userExtraInf.mReceivedZuan = p0.readLong();
          userExtraInf.mOpenUserName = p0.readString();
          userExtraInf.mKwaiVoiceDiffVotes = p0.readString();
          b1 = p0.readInt();
          if (b1 >= 0) {
             map = new HashMap(b.a(b1));
             for (int i1 = 0; i1 < b1; i1 = i1 + 1) {
                map.put(p0.readString(), p0.readString());
             }
          }
          userExtraInf.mExposedInfo = map;
          b1 = (p0.readInt() == 1)? true: false;
          userExtraInf.mIsFirstSendGift = b1;
          b1 = (p0.readInt() == 1)? true: false;
          userExtraInf.mIsLiving = b1;
          userExtraInf.mPrivilege = LiveAdminPrivilege$$Parcelable.read(p0, p1);
          userExtraInf.mRecoTextScene = p0.readInt();
          b1 = (p0.readInt() == 1)? true: false;
          userExtraInf.mOffline = b1;
          if (p0.readInt() == 1) {
             b = true;
          }
          userExtraInf.mIsLivePurchaseFansPromotionUser = b;
          p1.f(i, userExtraInf);
          return userExtraInf;
       }
    }
    public static void write(UserExtraInfo p0,Parcel p1,int p2,a p3){
       Iterator iterator;
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mFansGroupName);
          p1.writeInt(p0.mAmount);
          p1.writeInt(p0.mRecommendReasonValue);
          RichTextMeta$$Parcelable.write(p0.mRecoTextInfo, p1, p2, p3);
          p1.writeString(p0.mSex);
          p1.writeInt(p0.mIsTopPayingUser);
          p1.writeString(p0.mAdminLastVisitDisplay);
          p1.writeInt(p0.mKwaiVoiceRankType);
          p1.writeString(p0.mLiveStreamId);
          p1.writeSerializable(p0.mLiveUserInfo);
          p1.writeInt(p0.mPrivateMsg);
          p1.writeString(p0.mRemarksName);
          p1.writeString(p0.mSchoolName);
          UserExtraInfo$TextColor$$Parcelable.write(p0.mTextColor, p1, p2, p3);
          UserExtraInfo$Truncate$$Parcelable.write(p0.mTruncate, p1, p2, p3);
          p1.writeInt(p0.mIsWatching);
          p1.writeInt(p0.mIsFansTopAudience);
          p1.writeString(p0.mBase64Segments);
          RichTextMeta$$Parcelable.write(p0.mAggrSubCardTitle, p1, p2, p3);
          p1.writeInt(p0.mIsFollowing);
          p1.writeString(p0.mBgUrl);
          p1.writeString(p0.mSameArea);
          RichTextMeta$$Parcelable.write(p0.mPhotoOrLivingInfo, p1, p2, p3);
          p1.writeString(p0.mAggrCardTitle);
          p1.writeLong(p0.mFollow);
          p1.writeInt(p0.mKwaiVoiceRank);
          UserExtraInfo mRoleInfos = p0.mRoleInfos;
          if (mRoleInfos == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mRoleInfos.size());
             iterator = p0.mRoleInfos.iterator();
             while (iterator.hasNext()) {
                p1.writeSerializable(iterator.next());
             }
          }
          p1.writeString(p0.mKwaiVoiceVotes);
          p1.writeString(p0.mDisplayWatchDuration);
          p1.writeInt(p0.mFanGroupLevel);
          mRoleInfos = p0.mHighLightTexts;
          if (mRoleInfos == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mRoleInfos.size());
             iterator = p0.mHighLightTexts.iterator();
             while (iterator.hasNext()) {
                p1.writeString(iterator.next());
             }
          }
          p1.writeLong(p0.mFan);
          p1.writeInt(p0.mAssistantType);
          p1.writeString(p0.mDisplayScore);
          p1.writeString(p0.mSendGiftAmount);
          p1.writeSerializable(p0.mUserInfoExposed);
          p1.writeString(p0.mMessage);
          p1.writeSerializable(p0.mFansGroupIntimacy);
          p1.writeInt(p0.mPhoto);
          p1.writeString(p0.mAge);
          p1.writeString(p0.mLastLiveDesc);
          p1.writeInt(p0.mDisableJumpUserProfile);
          p1.writeString(p0.mCityName);
          p1.writeString(p0.mDisplayKsCoin);
          QUserContactName$$Parcelable.write(p0.mContactName, p1, p2, p3);
          p1.writeString(p0.mRecommendReason);
          p1.writeInt(p0.mKwaiVoiceRankChange);
          p1.writeLong(p0.mReceivedZuan);
          p1.writeString(p0.mOpenUserName);
          p1.writeString(p0.mKwaiVoiceDiffVotes);
          mRoleInfos = p0.mExposedInfo;
          if (mRoleInfos == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mRoleInfos.size());
             iterator = p0.mExposedInfo.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                p1.writeString(uEntry.getKey());
                p1.writeString(uEntry.getValue());
             }
          }
          p1.writeInt(p0.mIsFirstSendGift);
          p1.writeInt(p0.mIsLiving);
          LiveAdminPrivilege$$Parcelable.write(p0.mPrivilege, p1, p2, p3);
          p1.writeInt(p0.mRecoTextScene);
          p1.writeInt(p0.mOffline);
          p1.writeInt(p0.mIsLivePurchaseFansPromotionUser);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public UserExtraInfo getParcel(){
       return this.userExtraInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       UserExtraInfo$$Parcelable.write(this.userExtraInfo$$0, p0, p1, new a());
    }
}
