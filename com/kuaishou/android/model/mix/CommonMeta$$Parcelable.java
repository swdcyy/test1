package com.kuaishou.android.model.mix.CommonMeta$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.CommonMeta$$Parcelable$a;
import com.kuaishou.android.model.mix.CommonMeta;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.io.Serializable;
import com.kuaishou.android.model.mix.PhotoCoinRewardModel;
import com.yxcorp.gifshow.healthy.HealthyDiseaseInfo;
import com.kuaishou.android.model.mix.DetailStrongButtonConfig;
import com.kuaishou.android.model.mix.DetailStrongButtonConfig$$Parcelable;
import com.kuaishou.android.model.mix.Location;
import com.kuaishou.android.model.mix.Location$$Parcelable;
import com.yxcorp.gifshow.tube.StandardSerialInfo;
import com.yxcorp.gifshow.tube.StandardSerialInfo$$Parcelable;
import com.kwai.framework.model.common.Distance;
import com.kwai.framework.model.common.Distance$$Parcelable;
import com.kuaishou.android.model.mix.FeedFriendInfo;
import com.kuaishou.android.model.mix.FeedFriendInfo$$Parcelable;
import com.kuaishou.android.model.mix.PosterSpecialEffect;
import com.kuaishou.android.model.mix.PosterSpecialEffect$$Parcelable;
import java.util.ArrayList;
import com.kuaishou.android.model.mix.QRecoTag;
import com.kuaishou.android.model.mix.QRecoTag$$Parcelable;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;
import com.kuaishou.android.model.mix.SortFeature;
import com.kuaishou.android.model.mix.SortFeature$$Parcelable;
import com.kuaishou.android.model.mix.SearchSortFeature;
import com.kuaishou.android.model.mix.SearchSortFeature$$Parcelable;
import com.kuaishou.android.model.mix.FansTopDisplayStyle;
import com.kuaishou.android.model.mix.CaptionSearchInfo;
import com.kuaishou.android.model.mix.CaptionSearchInfo$$Parcelable;
import com.kuaishou.android.model.mix.CoverAnimation;
import com.kuaishou.android.model.mix.PhotoAreaInfo;
import com.kuaishou.android.model.mix.FeedBackInterestManagementEntrance;
import com.kuaishou.android.model.mix.FeedBackInterestManagementEntrance$$Parcelable;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import java.util.HashMap;
import xwd.b;
import com.kuaishou.android.model.mix.CoverCommonTagsModel;
import fa6.a;
import ga6.c;
import java.util.Map;
import ywd.j;
import java.lang.Class;
import org.parceler.a;
import java.util.List;
import java.util.Iterator;
import java.util.Set;
import java.util.Map$Entry;
import org.parceler.a$c;

public class CommonMeta$$Parcelable implements Parcelable, d	// class@000c03
{
    public CommonMeta commonMeta$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       CommonMeta$$Parcelable.CREATOR = new CommonMeta$$Parcelable$a();
    }
    public void CommonMeta$$Parcelable(CommonMeta p0){
       super();
       this.commonMeta$$0 = p0;
    }
    public static CommonMeta read(Parcel p0,a p1){
       List list;
       CDNUrl[] uCDNUrlArray;
       ArrayList uArrayList;
       int i1;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          CommonMeta uCommonMeta = new CommonMeta();
          p1.f(p1.g(), uCommonMeta);
          uCommonMeta.mCoinRewardModel = p0.readSerializable();
          uCommonMeta.mHealthyDiseaseInfo = p0.readSerializable();
          uCommonMeta.mDetailStrongButtonConfig = DetailStrongButtonConfig$$Parcelable.read(p0, p1);
          c uoc = null;
          boolean b = true;
          boolean b1 = (p0.readInt() == b)? true: false;
          uCommonMeta.mEnablePaidQuestion = b1;
          uCommonMeta.mCurrentPosition = p0.readInt();
          uCommonMeta.mDisplayRecoReason = p0.readString();
          uCommonMeta.mRelationType = p0.readInt();
          b1 = (p0.readInt() == b)? true: false;
          uCommonMeta.mShowedCoinReward = b1;
          uCommonMeta.mKwaiVoiceType = p0.readInt();
          b1 = (p0.readInt() == b)? true: false;
          uCommonMeta.mDegrade = b1;
          b1 = (p0.readInt() == b)? true: false;
          uCommonMeta.mIgnoreCheckFilter = b1;
          uCommonMeta.mDescription = p0.readString();
          b1 = (p0.readInt() == b)? true: false;
          uCommonMeta.mShowGrDetailPage = b1;
          uCommonMeta.mLocation = Location$$Parcelable.read(p0, p1);
          uCommonMeta.mPureTitle = p0.readString();
          uCommonMeta.mColor = p0.readInt();
          uCommonMeta.mTopFeedIndex = p0.readInt();
          uCommonMeta.mCurrentNetwork = p0.readString();
          uCommonMeta.mIntimateType = p0.readInt();
          uCommonMeta.mMovieName = p0.readString();
          uCommonMeta.mSource = p0.readString();
          uCommonMeta.mCaptionByMmu = p0.readString();
          uCommonMeta.mStandardSerialInfo = StandardSerialInfo$$Parcelable.read(p0, p1);
          uCommonMeta.mProvince = p0.readString();
          uCommonMeta.mExpTag = p0.readString();
          b1 = (p0.readInt() == b)? true: false;
          uCommonMeta.mIgnoreFreeTraffic = b1;
          uCommonMeta.mFeedId = p0.readString();
          uCommonMeta.mWidth = p0.readInt();
          uCommonMeta.mLiveStartPlaySource = p0.readInt();
          uCommonMeta.mShareInfo = p0.readString();
          uCommonMeta.mPosition = p0.readInt();
          uCommonMeta.mRecoReason = p0.readString();
          uCommonMeta.mSearchSessionId = p0.readString();
          uCommonMeta.mServerExpTag = p0.readString();
          uCommonMeta.mKsOrderId = p0.readString();
          uCommonMeta.mDistance = Distance$$Parcelable.read(p0, p1);
          uCommonMeta.mRealRelationType = p0.readInt();
          b1 = (p0.readInt() == b)? true: false;
          uCommonMeta.mCreatedSearchCard = b1;
          uCommonMeta.mLocationDistanceStr = p0.readString();
          uCommonMeta.mFeedFriendInfo = FeedFriendInfo$$Parcelable.read(p0, p1);
          uCommonMeta.mCaption = p0.readString();
          b1 = (p0.readInt() == b)? true: false;
          uCommonMeta.mRecoDegrade = b1;
          b1 = (p0.readInt() == b)? true: false;
          uCommonMeta.mDeduplication = b1;
          uCommonMeta.mSurveyId = p0.readString();
          uCommonMeta.mPosterSpecialEffect = PosterSpecialEffect$$Parcelable.read(p0, p1);
          b1 = p0.readInt();
          Map map = null;
          if (b1 < 0) {
             list = map;
          }else {
             uArrayList = new ArrayList(b1);
             for (i1 = 0; i1 < b1; i1 = i1 + 1) {
                uArrayList.add(QRecoTag$$Parcelable.read(p0, p1));
             }
          }
          uCommonMeta.mPhotoMmuTagInfo = list;
          uCommonMeta.mReportContext = p0.readString();
          uCommonMeta.mShowTime = p0.readString();
          b1 = p0.readInt();
          if (b1 < 0) {
             uCDNUrlArray = map;
          }else {
             uCDNUrlArray = new CDNUrl[b1];
             for (i1 = 0; i1 < b1; i1 = i1 + 1) {
                uCDNUrlArray[i1] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          uCommonMeta.mActivity61AnimationImageUrls = uCDNUrlArray;
          uCommonMeta.mCaptionToComment = p0.readString();
          b1 = (p0.readInt() == b)? true: false;
          uCommonMeta.mShowed = b1;
          uCommonMeta.mCaptionByOpertion = p0.readString();
          b1 = p0.readInt();
          if (b1 < 0) {
             list = map;
          }else {
             uArrayList = new ArrayList(b1);
             for (i1 = 0; i1 < b1; i1 = i1 + 1) {
                uArrayList.add(SortFeature$$Parcelable.read(p0, p1));
             }
          }
          uCommonMeta.mSortFeatures = list;
          b1 = (p0.readInt() == b)? true: false;
          uCommonMeta.mEnableTimestamp = b1;
          uCommonMeta.mDirection = p0.readInt();
          b1 = p0.readInt();
          if (b1 < 0) {
             list = map;
          }else {
             uArrayList = new ArrayList(b1);
             for (i1 = 0; i1 < b1; i1 = i1 + 1) {
                uArrayList.add(SearchSortFeature$$Parcelable.read(p0, p1));
             }
          }
          uCommonMeta.mSearchSortFeatures = list;
          uCommonMeta.mUssId = p0.readString();
          b1 = (p0.readInt() == b)? true: false;
          uCommonMeta.mIsCloseLive = b1;
          b1 = (p0.readInt() == b)? true: false;
          uCommonMeta.mVerticalShowed = b1;
          uCommonMeta.mHotSpotDoubleCoverPhotoId = p0.readString();
          uCommonMeta.mHeight = p0.readInt();
          uCommonMeta.mCurrentFreeTrafficType = p0.readString();
          b1 = (p0.readInt() == b)? true: false;
          uCommonMeta.mRankEnable = b1;
          uCommonMeta.mCaptionTitle = p0.readString();
          uCommonMeta.mFansTopDisplayStyle = p0.readSerializable();
          uCommonMeta.mCoverExtraTitle = p0.readString();
          uCommonMeta.mRelationTypeText = p0.readString();
          uCommonMeta.mViewTime = p0.readLong();
          uCommonMeta.mCreated = p0.readLong();
          b1 = (p0.readInt() == b)? true: false;
          uCommonMeta.mRandomUrl = b1;
          uCommonMeta.mCaptionSearchInfo = CaptionSearchInfo$$Parcelable.read(p0, p1);
          uCommonMeta.mLogReportContext = p0.readString();
          uCommonMeta.mListLoadSequenceID = p0.readString();
          uCommonMeta.mId = p0.readString();
          b1 = p0.readInt();
          if (b1 < 0) {
             list = map;
          }else {
             uArrayList = new ArrayList(b1);
             for (i1 = 0; i1 < b1; i1 = i1 + 1) {
                uArrayList.add(QRecoTag$$Parcelable.read(p0, p1));
             }
          }
          uCommonMeta.mRecoTags = list;
          uCommonMeta.mCoverAnimation = p0.readSerializable();
          uCommonMeta.mPhotoAreaInfo = p0.readSerializable();
          uCommonMeta.mType = p0.readInt();
          uCommonMeta.mCommonLogParams = p0.readString();
          uCommonMeta.mSourcePhotoPage = p0.readString();
          uCommonMeta.mInterestManagementEntrance = FeedBackInterestManagementEntrance$$Parcelable.read(p0, p1);
          b1 = (p0.readInt() == b)? true: false;
          uCommonMeta.mExpectFreeTraffic = b1;
          b1 = (p0.readInt() == b)? true: false;
          uCommonMeta.mHasReport = b1;
          uCommonMeta.mFeedLogCtx = p0.readSerializable();
          uCommonMeta.mPullDownRefreshTime = p0.readInt();
          if (p0.readInt() != b) {
             b = false;
          }
          uCommonMeta.mSocialRelationFamilar = b;
          b1 = p0.readInt();
          if (b1 >= 0) {
             map = new HashMap(b.a(b1));
             for (; uoc < b1; uoc = uoc + 1) {
                map.put(p0.readString(), p0.readString());
             }
          }
          uCommonMeta.mForwardStatsParams = map;
          uCommonMeta.mTime = p0.readString();
          uCommonMeta.mSharePassingParam = p0.readString();
          uCommonMeta.mPositionInPage = p0.readInt();
          uCommonMeta.mCoverCommonTags = p0.readSerializable();
          a.d(a.class, uCommonMeta, "dataMap", new c().d(p0));
          p1.f(i, uCommonMeta);
          return uCommonMeta;
       }
    }
    public static void write(CommonMeta p0,Parcel p1,int p2,a p3){
       Iterator iterator1;
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeSerializable(p0.mCoinRewardModel);
          p1.writeSerializable(p0.mHealthyDiseaseInfo);
          DetailStrongButtonConfig$$Parcelable.write(p0.mDetailStrongButtonConfig, p1, p2, p3);
          p1.writeInt(p0.mEnablePaidQuestion);
          p1.writeInt(p0.mCurrentPosition);
          p1.writeString(p0.mDisplayRecoReason);
          p1.writeInt(p0.mRelationType);
          p1.writeInt(p0.mShowedCoinReward);
          p1.writeInt(p0.mKwaiVoiceType);
          p1.writeInt(p0.mDegrade);
          p1.writeInt(p0.mIgnoreCheckFilter);
          p1.writeString(p0.mDescription);
          p1.writeInt(p0.mShowGrDetailPage);
          Location$$Parcelable.write(p0.mLocation, p1, p2, p3);
          p1.writeString(p0.mPureTitle);
          p1.writeInt(p0.mColor);
          p1.writeInt(p0.mTopFeedIndex);
          p1.writeString(p0.mCurrentNetwork);
          p1.writeInt(p0.mIntimateType);
          p1.writeString(p0.mMovieName);
          p1.writeString(p0.mSource);
          p1.writeString(p0.mCaptionByMmu);
          StandardSerialInfo$$Parcelable.write(p0.mStandardSerialInfo, p1, p2, p3);
          p1.writeString(p0.mProvince);
          p1.writeString(p0.mExpTag);
          p1.writeInt(p0.mIgnoreFreeTraffic);
          p1.writeString(p0.mFeedId);
          p1.writeInt(p0.mWidth);
          p1.writeInt(p0.mLiveStartPlaySource);
          p1.writeString(p0.mShareInfo);
          p1.writeInt(p0.mPosition);
          p1.writeString(p0.mRecoReason);
          p1.writeString(p0.mSearchSessionId);
          p1.writeString(p0.mServerExpTag);
          p1.writeString(p0.mKsOrderId);
          Distance$$Parcelable.write(p0.mDistance, p1, p2, p3);
          p1.writeInt(p0.mRealRelationType);
          p1.writeInt(p0.mCreatedSearchCard);
          p1.writeString(p0.mLocationDistanceStr);
          FeedFriendInfo$$Parcelable.write(p0.mFeedFriendInfo, p1, p2, p3);
          p1.writeString(p0.mCaption);
          p1.writeInt(p0.mRecoDegrade);
          p1.writeInt(p0.mDeduplication);
          p1.writeString(p0.mSurveyId);
          PosterSpecialEffect$$Parcelable.write(p0.mPosterSpecialEffect, p1, p2, p3);
          CommonMeta mPhotoMmuTag = p0.mPhotoMmuTagInfo;
          if (mPhotoMmuTag == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mPhotoMmuTag.size());
             iterator1 = p0.mPhotoMmuTagInfo.iterator();
             while (iterator1.hasNext()) {
                QRecoTag$$Parcelable.write(iterator1.next(), p1, p2, p3);
             }
          }
          p1.writeString(p0.mReportContext);
          p1.writeString(p0.mShowTime);
          mPhotoMmuTag = p0.mActivity61AnimationImageUrls;
          if (mPhotoMmuTag == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mPhotoMmuTag.length);
             mPhotoMmuTag = p0.mActivity61AnimationImageUrls;
             int len = mPhotoMmuTag.length;
             for (int i2 = 0; i2 < len; i2 = i2 + 1) {
                CDNUrl$$Parcelable.write(mPhotoMmuTag[i2], p1, p2, p3);
             }
          }
          p1.writeString(p0.mCaptionToComment);
          p1.writeInt(p0.mShowed);
          p1.writeString(p0.mCaptionByOpertion);
          mPhotoMmuTag = p0.mSortFeatures;
          if (mPhotoMmuTag == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mPhotoMmuTag.size());
             iterator1 = p0.mSortFeatures.iterator();
             while (iterator1.hasNext()) {
                SortFeature$$Parcelable.write(iterator1.next(), p1, p2, p3);
             }
          }
          p1.writeInt(p0.mEnableTimestamp);
          p1.writeInt(p0.mDirection);
          mPhotoMmuTag = p0.mSearchSortFeatures;
          if (mPhotoMmuTag == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mPhotoMmuTag.size());
             iterator1 = p0.mSearchSortFeatures.iterator();
             while (iterator1.hasNext()) {
                SearchSortFeature$$Parcelable.write(iterator1.next(), p1, p2, p3);
             }
          }
          p1.writeString(p0.mUssId);
          p1.writeInt(p0.mIsCloseLive);
          p1.writeInt(p0.mVerticalShowed);
          p1.writeString(p0.mHotSpotDoubleCoverPhotoId);
          p1.writeInt(p0.mHeight);
          p1.writeString(p0.mCurrentFreeTrafficType);
          p1.writeInt(p0.mRankEnable);
          p1.writeString(p0.mCaptionTitle);
          p1.writeSerializable(p0.mFansTopDisplayStyle);
          p1.writeString(p0.mCoverExtraTitle);
          p1.writeString(p0.mRelationTypeText);
          p1.writeLong(p0.mViewTime);
          p1.writeLong(p0.mCreated);
          p1.writeInt(p0.mRandomUrl);
          CaptionSearchInfo$$Parcelable.write(p0.mCaptionSearchInfo, p1, p2, p3);
          p1.writeString(p0.mLogReportContext);
          p1.writeString(p0.mListLoadSequenceID);
          p1.writeString(p0.mId);
          mPhotoMmuTag = p0.mRecoTags;
          if (mPhotoMmuTag == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mPhotoMmuTag.size());
             iterator1 = p0.mRecoTags.iterator();
             while (iterator1.hasNext()) {
                QRecoTag$$Parcelable.write(iterator1.next(), p1, p2, p3);
             }
          }
          p1.writeSerializable(p0.mCoverAnimation);
          p1.writeSerializable(p0.mPhotoAreaInfo);
          p1.writeInt(p0.mType);
          p1.writeString(p0.mCommonLogParams);
          p1.writeString(p0.mSourcePhotoPage);
          FeedBackInterestManagementEntrance$$Parcelable.write(p0.mInterestManagementEntrance, p1, p2, p3);
          p1.writeInt(p0.mExpectFreeTraffic);
          p1.writeInt(p0.mHasReport);
          p1.writeSerializable(p0.mFeedLogCtx);
          p1.writeInt(p0.mPullDownRefreshTime);
          p1.writeInt(p0.mSocialRelationFamilar);
          CommonMeta mForwardStat = p0.mForwardStatsParams;
          if (mForwardStat == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mForwardStat.size());
             Iterator iterator = p0.mForwardStatsParams.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                p1.writeString(uEntry.getKey());
                p1.writeString(uEntry.getValue());
             }
          }
          p1.writeString(p0.mTime);
          p1.writeString(p0.mSharePassingParam);
          p1.writeInt(p0.mPositionInPage);
          p1.writeSerializable(p0.mCoverCommonTags);
          new c().i(a.c(new a$c(), a.class, p0, "dataMap"), p1);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public CommonMeta getParcel(){
       return this.commonMeta$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       CommonMeta$$Parcelable.write(this.commonMeta$$0, p0, p1, new a());
    }
}
