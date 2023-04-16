package com.kuaishou.android.model.ads.PhotoAdvertisement$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.lang.Boolean;
import java.util.HashMap;
import xwd.b;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdLabelType;
import java.lang.Class;
import java.lang.Enum;
import com.kuaishou.android.model.ads.PhotoAdvertisement$UrlMapping;
import com.kuaishou.android.model.ads.PhotoAdvertisement$UrlMapping$$Parcelable;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PlayEndInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PlayEndInfo$$Parcelable;
import java.io.Serializable;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AutoConversionInfo;
import java.lang.Long;
import com.kuaishou.android.model.ads.PhotoAdvertisement$FanstopLiveInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$FanstopLiveInfo$$Parcelable;
import com.kuaishou.android.model.ads.PhotoAdvertisement$Track;
import com.kuaishou.android.model.ads.PhotoAdvertisement$Track$$Parcelable;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HintMapping;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HintMapping$$Parcelable;
import com.kwai.framework.model.ExtendableModelMap;
import com.kwai.framework.model.ExtendableModelMap$$Parcelable;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData$$Parcelable;
import com.kuaishou.android.model.ads.PhotoAdvertisement$FansTopDetailPageFlameType;
import com.kuaishou.android.model.ads.PhotoAdvertisement$FansTopFeedFlameType;
import com.kuaishou.android.model.merchant.MerchantEnhanceDisplay;
import com.kuaishou.android.model.merchant.MerchantEnhanceDisplay$$Parcelable;
import com.kuaishou.android.model.ads.PhotoAdvertisement$Styles;
import com.kuaishou.android.model.ads.PhotoAdvertisement$Styles$$Parcelable;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdGroup;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdCover;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdCover$$Parcelable;
import java.util.List;
import java.util.Iterator;
import java.util.Set;
import java.util.Map$Entry;

public class PhotoAdvertisement$$Parcelable implements Parcelable, d	// class@000882
{
    public PhotoAdvertisement photoAdvertisement$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$$Parcelable.CREATOR = new PhotoAdvertisement$$Parcelable$a();
    }
    public void PhotoAdvertisement$$Parcelable(PhotoAdvertisement p0){
       super();
       this.photoAdvertisement$$0 = p0;
    }
    public static PhotoAdvertisement read(Parcel p0,a p1){
       List list;
       Boolean uBoolean;
       HashMap hashMap;
       ArrayList uArrayList;
       List list1;
       int i2;
       PhotoAdvertisement$AdGroup uAdGroup1;
       boolean b1;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PhotoAdvertisement photoAdverti = new PhotoAdvertisement();
          p1.f(p1.g(), photoAdverti);
          photoAdverti.mSubscriptType = p0.readInt();
          photoAdverti.mMissionId = p0.readLong();
          boolean i1 = p0.readInt();
          PhotoAdvertisement$AdGroup uAdGroup = null;
          boolean b = false;
          if (i1 < 0) {
             list = uAdGroup;
          }else {
             list = new ArrayList(i1);
             for (int i3 = 0; i3 < i1; i3 = i3 + 1) {
                list.add(p0.readString());
             }
          }
          photoAdverti.mManuUrls = list;
          photoAdverti.mFansTopAttributeParams = p0.readString();
          photoAdverti.mExtData = p0.readString();
          i1 = (p0.readInt() == 1)? true: false;
          photoAdverti.mIsH5App = i1;
          photoAdverti.mReportClientLogType = p0.readInt();
          photoAdverti.mLiveGiftSourceType = p0.readInt();
          i1 = (p0.readInt() == 1)? true: false;
          photoAdverti.mUsePriorityCard = i1;
          i1 = (p0.readInt() == 1)? true: false;
          photoAdverti.mShowAdItemReported = i1;
          i1 = (p0.readInt() == 1)? true: false;
          photoAdverti.mHasSubmitSurvey = i1;
          if (p0.readInt() < 0) {
             uBoolean = uAdGroup;
          }else if(p0.readInt() == 1){
             i1 = true;
          }else {
             i1 = false;
          }
          uBoolean = Boolean.valueOf(i1);
          photoAdverti.mHidePlayletBarSwitch = uBoolean;
          photoAdverti.mTextColor = p0.readString();
          photoAdverti.mScale = p0.readFloat();
          photoAdverti.mFansTopAwardBonusTime = p0.readLong();
          i1 = p0.readInt();
          if (i1 < 0) {
             hashMap = uAdGroup;
          }else {
             hashMap = new HashMap(b.a(i1));
             for (i2 = 0; i2 < i1; i2 = i2 + 1) {
                String str1 = p0.readString();
                if (p0.readInt() < 0) {
                   uAdGroup1 = uAdGroup;
                }else if(p0.readInt() == 1){
                   b1 = true;
                }else {
                   b1 = false;
                }
                uAdGroup1 = Boolean.valueOf(b1);
                hashMap.put(str1, uAdGroup1);
             }
          }
          photoAdverti.mBizSwitchInfo = hashMap;
          i1 = (p0.readInt() == 1)? true: false;
          photoAdverti.mEnableShowFansTopFlame = i1;
          photoAdverti.mSourceDescription = p0.readString();
          i1 = (p0.readInt() == 1)? true: false;
          photoAdverti.mShouldAlertNetMobile = i1;
          photoAdverti.mTitle = p0.readString();
          photoAdverti.mReservationId = p0.readString();
          photoAdverti.mCoverId = p0.readLong();
          photoAdverti.mScheme = p0.readString();
          i1 = (p0.readInt() == 1)? true: false;
          photoAdverti.mFromGift = i1;
          photoAdverti.mRequestApiExtData = p0.readString();
          photoAdverti.mAppIconUrl = p0.readString();
          photoAdverti.mIsImpressionAtOutflow = p0.readInt();
          photoAdverti.mSearchKBoxAdFeedSize = p0.readInt();
          photoAdverti.mAutoIntoLiveSeconds = p0.readInt();
          photoAdverti.mAdActionType = p0.readInt();
          photoAdverti.mSourceDescriptionType = p0.readInt();
          photoAdverti.mDisplayType = p0.readInt();
          String str = p0.readString();
          PhotoAdvertisement$AdLabelType uAdLabelType = (str == null)? uAdGroup: Enum.valueOf(PhotoAdvertisement$AdLabelType.class, str);
          photoAdverti.mLabelStyle = uAdLabelType;
          photoAdverti.mDownloadType = p0.readInt();
          photoAdverti.mImageUrl = p0.readString();
          photoAdverti.mCreativeId = p0.readLong();
          i1 = (p0.readInt() == 1)? true: false;
          photoAdverti.mHideLabel = i1;
          i1 = (p0.readInt() == 1)? true: false;
          photoAdverti.mEnableRetainTopAd = i1;
          i1 = p0.readInt();
          if (i1 < 0) {
             uArrayList = uAdGroup;
          }else {
             uArrayList = new ArrayList(i1);
             for (i2 = 0; i2 < i1; i2 = i2 + 1) {
                uArrayList.add(PhotoAdvertisement$UrlMapping$$Parcelable.read(p0, p1));
             }
          }
          photoAdverti.mCaptionUrls = uArrayList;
          photoAdverti.mRecommendReason = p0.readString();
          photoAdverti.mSupConversionType = p0.readInt();
          photoAdverti.mItemTitle = p0.readString();
          photoAdverti.mAdQueueType = p0.readInt();
          i1 = (p0.readInt() == 1)? true: false;
          photoAdverti.mIsFromSearchAd = i1;
          photoAdverti.mPlayEndInfo = PhotoAdvertisement$PlayEndInfo$$Parcelable.read(p0, p1);
          photoAdverti.mAutoConversionInfo = p0.readSerializable();
          photoAdverti.mPackageName = p0.readString();
          photoAdverti.mAdLabelDescription = p0.readString();
          photoAdverti.mReservationType = p0.readInt();
          photoAdverti.mReplacedAdMessage = p0.readString();
          Long longx = (p0.readInt() < 0)? uAdGroup: Long.valueOf(p0.readLong());
          photoAdverti.mExpireTimestamp = longx;
          photoAdverti.mChargeInfo = p0.readString();
          photoAdverti.mAdSubType = p0.readString();
          photoAdverti.mAdTypeForGap = p0.readInt();
          photoAdverti.mAdLiveForFansTop = PhotoAdvertisement$FanstopLiveInfo$$Parcelable.read(p0, p1);
          photoAdverti.mLiveAdSourceType = p0.readInt();
          photoAdverti.mLlsid = p0.readString();
          i1 = p0.readInt();
          if (i1 < 0) {
             list1 = uAdGroup;
          }else {
             list1 = new ArrayList(i1);
             for (i2 = 0; i2 < i1; i2 = i2 + 1) {
                list1.add(PhotoAdvertisement$Track$$Parcelable.read(p0, p1));
             }
          }
          photoAdverti.mTracks = list1;
          photoAdverti.mTemplateType = p0.readInt();
          i1 = p0.readInt();
          if (i1 < 0) {
             uArrayList = uAdGroup;
          }else {
             uArrayList = new ArrayList(i1);
             for (i2 = 0; i2 < i1; i2 = i2 + 1) {
                uArrayList.add(PhotoAdvertisement$HintMapping$$Parcelable.read(p0, p1));
             }
          }
          photoAdverti.mCaptionHints = uArrayList;
          i1 = (p0.readInt() == 1)? true: false;
          photoAdverti.mDisableFansTopDetailIconClick = i1;
          photoAdverti.mReservationExpireTimestamp = p0.readLong();
          photoAdverti.mConversionType = p0.readInt();
          photoAdverti.mAppScore = p0.readDouble();
          i1 = (p0.readInt() == 1)? true: false;
          photoAdverti.mIsSearchKBoxAd = i1;
          i1 = (p0.readInt() == 1)? true: false;
          photoAdverti.mHasDebugInfoReported = i1;
          photoAdverti.mExtraMap = ExtendableModelMap$$Parcelable.read(p0, p1);
          i1 = (p0.readInt() == 1)? true: false;
          photoAdverti.mShowReported = i1;
          photoAdverti.mTaskId = p0.readLong();
          photoAdverti.mAdData = PhotoAdvertisement$AdData$$Parcelable.read(p0, p1);
          photoAdverti.mSourceType = p0.readInt();
          str = p0.readString();
          PhotoAdvertisement$FansTopDetailPageFlameType uFansTopDeta = (str == null)? uAdGroup: Enum.valueOf(PhotoAdvertisement$FansTopDetailPageFlameType.class, str);
          photoAdverti.mFansTopDetailPageFlameType = uFansTopDeta;
          i1 = (p0.readInt() == 1)? true: false;
          photoAdverti.mPreload = i1;
          photoAdverti.mPageId = p0.readLong();
          photoAdverti.mSimpleLiveAdInfo = p0.readString();
          photoAdverti.mApkFileName = p0.readString();
          photoAdverti.mBackgroundColor = p0.readString();
          photoAdverti.mSearchKBoxAdIndex = p0.readInt();
          photoAdverti.mMerchantURLParamsStr = p0.readString();
          i1 = (p0.readInt() == 1)? true: false;
          photoAdverti.mIsNewStyle = i1;
          str = p0.readString();
          PhotoAdvertisement$FansTopFeedFlameType uFansTopFeed = (str == null)? uAdGroup: Enum.valueOf(PhotoAdvertisement$FansTopFeedFlameType.class, str);
          photoAdverti.mFansTopFeedFlameType = uFansTopFeed;
          photoAdverti.mVideoPlayStartTimeMS = p0.readLong();
          photoAdverti.mCommonSwitchBit = p0.readLong();
          i1 = (p0.readInt() == 1)? true: false;
          photoAdverti.mHasAdGapReported = i1;
          photoAdverti.mSubscriptDescription = p0.readString();
          photoAdverti.mAppName = p0.readString();
          photoAdverti.mClickNumber = p0.readString();
          photoAdverti.mPhotoPage = p0.readString();
          photoAdverti.mCallbackParam = p0.readString();
          photoAdverti.mMerchantEnhanceDisplay = MerchantEnhanceDisplay$$Parcelable.read(p0, p1);
          if (p0.readInt() == 1) {
             b = true;
          }
          photoAdverti.mIsAttachBySearchClick = b;
          photoAdverti.mStyles = PhotoAdvertisement$Styles$$Parcelable.read(p0, p1);
          photoAdverti.mAdPhotoCommentSource = p0.readInt();
          photoAdverti.mFansTopDetailPageFlameDesc = p0.readString();
          photoAdverti.mUrl = p0.readString();
          photoAdverti.mAdInstanceId = p0.readString();
          photoAdverti.mBaseInfo = p0.readSerializable();
          photoAdverti.mSubPageId = p0.readLong();
          photoAdverti.mItemDesc = p0.readString();
          photoAdverti.mAwardType = p0.readInt();
          str = p0.readString();
          if (str != null) {
             uAdGroup = Enum.valueOf(PhotoAdvertisement$AdGroup.class, str);
          }
          photoAdverti.mAdGroup = uAdGroup;
          photoAdverti.mOrderId = p0.readLong();
          photoAdverti.mAdCover = PhotoAdvertisement$AdCover$$Parcelable.read(p0, p1);
          p1.f(i, photoAdverti);
          return photoAdverti;
       }
    }
    public static void write(PhotoAdvertisement p0,Parcel p1,int p2,a p3){
       Iterator iterator;
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mSubscriptType);
          p1.writeLong(p0.mMissionId);
          PhotoAdvertisement mManuUrls = p0.mManuUrls;
          if (mManuUrls == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mManuUrls.size());
             iterator = p0.mManuUrls.iterator();
             while (iterator.hasNext()) {
                p1.writeString(iterator.next());
             }
          }
          p1.writeString(p0.mFansTopAttributeParams);
          p1.writeString(p0.mExtData);
          p1.writeInt(p0.mIsH5App);
          p1.writeInt(p0.mReportClientLogType);
          p1.writeInt(p0.mLiveGiftSourceType);
          p1.writeInt(p0.mUsePriorityCard);
          p1.writeInt(p0.mShowAdItemReported);
          p1.writeInt(p0.mHasSubmitSurvey);
          boolean b = true;
          if (p0.mHidePlayletBarSwitch == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(b);
             p1.writeInt(p0.mHidePlayletBarSwitch.booleanValue());
          }
          p1.writeString(p0.mTextColor);
          p1.writeFloat(p0.mScale);
          p1.writeLong(p0.mFansTopAwardBonusTime);
          mManuUrls = p0.mBizSwitchInfo;
          if (mManuUrls == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mManuUrls.size());
             iterator = p0.mBizSwitchInfo.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                p1.writeString(uEntry.getKey());
                if (uEntry.getValue() == null) {
                   p1.writeInt(i1);
                }else {
                   p1.writeInt(b);
                   p1.writeInt(uEntry.getValue().booleanValue());
                }
             }
          }
          p1.writeInt(p0.mEnableShowFansTopFlame);
          p1.writeString(p0.mSourceDescription);
          p1.writeInt(p0.mShouldAlertNetMobile);
          p1.writeString(p0.mTitle);
          p1.writeString(p0.mReservationId);
          p1.writeLong(p0.mCoverId);
          p1.writeString(p0.mScheme);
          p1.writeInt(p0.mFromGift);
          p1.writeString(p0.mRequestApiExtData);
          p1.writeString(p0.mAppIconUrl);
          p1.writeInt(p0.mIsImpressionAtOutflow);
          p1.writeInt(p0.mSearchKBoxAdFeedSize);
          p1.writeInt(p0.mAutoIntoLiveSeconds);
          p1.writeInt(p0.mAdActionType);
          p1.writeInt(p0.mSourceDescriptionType);
          p1.writeInt(p0.mDisplayType);
          mManuUrls = p0.mLabelStyle;
          String str = null;
          String str1 = (mManuUrls == null)? str: mManuUrls.name();
          p1.writeString(str1);
          p1.writeInt(p0.mDownloadType);
          p1.writeString(p0.mImageUrl);
          p1.writeLong(p0.mCreativeId);
          p1.writeInt(p0.mHideLabel);
          p1.writeInt(p0.mEnableRetainTopAd);
          mManuUrls = p0.mCaptionUrls;
          if (mManuUrls == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mManuUrls.size());
             iterator = p0.mCaptionUrls.iterator();
             while (iterator.hasNext()) {
                PhotoAdvertisement$UrlMapping$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeString(p0.mRecommendReason);
          p1.writeInt(p0.mSupConversionType);
          p1.writeString(p0.mItemTitle);
          p1.writeInt(p0.mAdQueueType);
          p1.writeInt(p0.mIsFromSearchAd);
          PhotoAdvertisement$PlayEndInfo$$Parcelable.write(p0.mPlayEndInfo, p1, p2, p3);
          p1.writeSerializable(p0.mAutoConversionInfo);
          p1.writeString(p0.mPackageName);
          p1.writeString(p0.mAdLabelDescription);
          p1.writeInt(p0.mReservationType);
          p1.writeString(p0.mReplacedAdMessage);
          if (p0.mExpireTimestamp == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(b);
             p1.writeLong(p0.mExpireTimestamp.longValue());
          }
          p1.writeString(p0.mChargeInfo);
          p1.writeString(p0.mAdSubType);
          p1.writeInt(p0.mAdTypeForGap);
          PhotoAdvertisement$FanstopLiveInfo$$Parcelable.write(p0.mAdLiveForFansTop, p1, p2, p3);
          p1.writeInt(p0.mLiveAdSourceType);
          p1.writeString(p0.mLlsid);
          mManuUrls = p0.mTracks;
          if (mManuUrls == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mManuUrls.size());
             iterator = p0.mTracks.iterator();
             while (iterator.hasNext()) {
                PhotoAdvertisement$Track$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeInt(p0.mTemplateType);
          mManuUrls = p0.mCaptionHints;
          if (mManuUrls == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mManuUrls.size());
             iterator = p0.mCaptionHints.iterator();
             while (iterator.hasNext()) {
                PhotoAdvertisement$HintMapping$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeInt(p0.mDisableFansTopDetailIconClick);
          p1.writeLong(p0.mReservationExpireTimestamp);
          p1.writeInt(p0.mConversionType);
          p1.writeDouble(p0.mAppScore);
          p1.writeInt(p0.mIsSearchKBoxAd);
          p1.writeInt(p0.mHasDebugInfoReported);
          ExtendableModelMap$$Parcelable.write(p0.mExtraMap, p1, p2, p3);
          p1.writeInt(p0.mShowReported);
          p1.writeLong(p0.mTaskId);
          PhotoAdvertisement$AdData$$Parcelable.write(p0.mAdData, p1, p2, p3);
          p1.writeInt(p0.mSourceType);
          mManuUrls = p0.mFansTopDetailPageFlameType;
          str1 = (mManuUrls == null)? str: mManuUrls.name();
          p1.writeString(str1);
          p1.writeInt(p0.mPreload);
          p1.writeLong(p0.mPageId);
          p1.writeString(p0.mSimpleLiveAdInfo);
          p1.writeString(p0.mApkFileName);
          p1.writeString(p0.mBackgroundColor);
          p1.writeInt(p0.mSearchKBoxAdIndex);
          p1.writeString(p0.mMerchantURLParamsStr);
          p1.writeInt(p0.mIsNewStyle);
          mManuUrls = p0.mFansTopFeedFlameType;
          str1 = (mManuUrls == null)? str: mManuUrls.name();
          p1.writeString(str1);
          p1.writeLong(p0.mVideoPlayStartTimeMS);
          p1.writeLong(p0.mCommonSwitchBit);
          p1.writeInt(p0.mHasAdGapReported);
          p1.writeString(p0.mSubscriptDescription);
          p1.writeString(p0.mAppName);
          p1.writeString(p0.mClickNumber);
          p1.writeString(p0.mPhotoPage);
          p1.writeString(p0.mCallbackParam);
          MerchantEnhanceDisplay$$Parcelable.write(p0.mMerchantEnhanceDisplay, p1, p2, p3);
          p1.writeInt(p0.mIsAttachBySearchClick);
          PhotoAdvertisement$Styles$$Parcelable.write(p0.mStyles, p1, p2, p3);
          p1.writeInt(p0.mAdPhotoCommentSource);
          p1.writeString(p0.mFansTopDetailPageFlameDesc);
          p1.writeString(p0.mUrl);
          p1.writeString(p0.mAdInstanceId);
          p1.writeSerializable(p0.mBaseInfo);
          p1.writeLong(p0.mSubPageId);
          p1.writeString(p0.mItemDesc);
          p1.writeInt(p0.mAwardType);
          mManuUrls = p0.mAdGroup;
          if (mManuUrls != null) {
             str = mManuUrls.name();
          }
          p1.writeString(str);
          p1.writeLong(p0.mOrderId);
          PhotoAdvertisement$AdCover$$Parcelable.write(p0.mAdCover, p1, p2, p3);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement getParcel(){
       return this.photoAdvertisement$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$$Parcelable.write(this.photoAdvertisement$$0, p0, p1, new a());
    }
}
