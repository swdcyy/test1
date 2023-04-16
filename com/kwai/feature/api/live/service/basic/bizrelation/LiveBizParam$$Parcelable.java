package com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam$$Parcelable$a;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kwai.feature.api.live.base.model.LiveStyleParams;
import com.kwai.feature.api.live.base.model.LiveStyleParams$$Parcelable;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.entity.QPhoto$$Parcelable;
import java.util.HashSet;
import java.lang.Class;
import org.parceler.a;
import java.io.Serializable;
import com.kwai.feature.api.live.base.model.LiveActivityTaskInfo;
import com.yxcorp.gifshow.detail.slideplay.SlidePlayConfig;
import com.yxcorp.gifshow.detail.slideplay.SlidePlayConfig$$Parcelable;
import com.kuaishou.android.model.ads.LiveAdNeoParam;
import com.kuaishou.android.model.ads.LiveAdNeoParam$$Parcelable;
import com.kwai.feature.api.live.service.basic.slideplay.LiveSlidePlayFeedFlowParam;
import com.kwai.feature.api.live.service.basic.slideplay.LiveSlidePlayFeedFlowParam$$Parcelable;
import java.util.HashMap;
import xwd.b;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import com.kwai.feature.api.live.base.model.LiveAudienceParam$$Parcelable;
import com.kwai.feature.api.live.base.model.LiveSquareReplaceModel;
import com.kwai.feature.api.live.base.model.LivePassThruParamExtraInfo;
import com.yxcorp.gifshow.nearby.NearbyGuideParam;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;
import java.util.Map$Entry;

public class LiveBizParam$$Parcelable implements Parcelable, d	// class@001002
{
    public LiveBizParam liveBizParam$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       LiveBizParam$$Parcelable.CREATOR = new LiveBizParam$$Parcelable$a();
    }
    public void LiveBizParam$$Parcelable(LiveBizParam p0){
       super();
       this.liveBizParam$$0 = p0;
    }
    public static LiveBizParam read(Parcel p0,a p1){
       HashSet hashSet;
       Map map1;
       int i2;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          LiveBizParam liveBizParam = new LiveBizParam();
          p1.f(p1.g(), liveBizParam);
          boolean b = false;
          boolean b1 = (p0.readInt() == 1)? true: false;
          liveBizParam.mHasShownSlideRecommendMask = b1;
          b1 = (p0.readInt() == 1)? true: false;
          liveBizParam.mIsActivityClosedBySwipeOut = b1;
          b1 = (p0.readInt() == 1)? true: false;
          liveBizParam.mEnableUnFollowRemove = b1;
          liveBizParam.mBackEntranceDisplaySumDurationMs = p0.readLong();
          liveBizParam.mLiveStyleParams = LiveStyleParams$$Parcelable.read(p0, p1);
          b1 = (p0.readInt() == 1)? true: false;
          liveBizParam.mHasExecutedRouter = b1;
          liveBizParam.mPreviewOrLiteOriginPhoto = QPhoto$$Parcelable.read(p0, p1);
          liveBizParam.mLiveSourceUrl = p0.readString();
          liveBizParam.mSlidePlayId = p0.readString();
          liveBizParam.mSelectedStreamId = p0.readString();
          b1 = (p0.readInt() == 1)? true: false;
          liveBizParam.mDisableSyncFeedPosition = b1;
          b1 = p0.readInt();
          Map map = null;
          if (b1 < 0) {
             hashSet = map;
          }else {
             hashSet = new HashSet(b1);
             for (i2 = 0; i2 < b1; i2 = i2 + 1) {
                hashSet.add(p0.readString());
             }
          }
          a.d(LiveBizParam.class, liveBizParam, "mInterceptAutoJumpFeedSet", hashSet);
          liveBizParam.mEnterPlayerReuseType = p0.readInt();
          liveBizParam.mSlideGuideMode = p0.readInt();
          b1 = (p0.readInt() == 1)? true: false;
          liveBizParam.mIsSoloLiveStream = b1;
          liveBizParam.mSelectedIndex = p0.readInt();
          b1 = (p0.readInt() == 1)? true: false;
          liveBizParam.mDisablePullRefresh = b1;
          b1 = (p0.readInt() == 1)? true: false;
          liveBizParam.mIsLiveSlide = b1;
          b1 = (p0.readInt() == 1)? true: false;
          liveBizParam.mIsDifferentStream = b1;
          liveBizParam.mOpenPanelType = p0.readInt();
          b1 = (p0.readInt() == 1)? true: false;
          liveBizParam.mHasShownMobileNetworkAlert = b1;
          liveBizParam.mLiveActivityTaskInfo = p0.readSerializable();
          liveBizParam.mSlidePlayConfig = SlidePlayConfig$$Parcelable.read(p0, p1);
          b1 = (p0.readInt() == 1)? true: false;
          liveBizParam.mDisableNegativeFeedback = b1;
          liveBizParam.mPhotoDetailSource = p0.readInt();
          liveBizParam.mAdNeoPendantParam = LiveAdNeoParam$$Parcelable.read(p0, p1);
          liveBizParam.mReferLiveSourceType = p0.readInt();
          b1 = (p0.readInt() == 1)? true: false;
          liveBizParam.mIsFromPush = b1;
          liveBizParam.mSeamlessEnterLiveStreamId = p0.readString();
          liveBizParam.mSlidePlayFeedFlowParam = LiveSlidePlayFeedFlowParam$$Parcelable.read(p0, p1);
          b1 = (p0.readInt() == 1)? true: false;
          liveBizParam.mDisableLoadMore = b1;
          liveBizParam.mUnserializableBundleId = p0.readInt();
          b1 = p0.readInt();
          if (b1 < 0) {
             map1 = map;
          }else {
             map1 = new HashMap(b.a(b1));
             for (i2 = 0; i2 < b1; i2 = i2 + 1) {
                map1.put(p0.readString(), p0.readString());
             }
          }
          liveBizParam.mPageUrlParamMap = map1;
          liveBizParam.mLiveAudienceParam = LiveAudienceParam$$Parcelable.read(p0, p1);
          liveBizParam.mLiveSquareReplaceModel = p0.readSerializable();
          b1 = (p0.readInt() == 1)? true: false;
          liveBizParam.mIsStatusBarSolid = b1;
          b1 = (p0.readInt() == 1)? true: false;
          liveBizParam.mHasShownLiveSourceBackEntranceAnimation = b1;
          liveBizParam.mPlayerReuseToken = p0.readString();
          liveBizParam.mPhotoDetailBizType = p0.readInt();
          b1 = (p0.readInt() == 1)? true: false;
          liveBizParam.mHasShownLiveSlideGuide = b1;
          b1 = (p0.readInt() == 1)? true: false;
          liveBizParam.mHasClickReplacePageList = b1;
          b1 = p0.readInt();
          if (b1 >= 0) {
             map = new HashMap(b.a(b1));
             for (int i1 = 0; i1 < b1; i1 = i1 + 1) {
                map.put(p0.readString(), p0.readString());
             }
          }
          liveBizParam.mInternalJumpUrlMap = map;
          liveBizParam.mExtraInfo = p0.readSerializable();
          b1 = (p0.readInt() == 1)? true: false;
          liveBizParam.mIsSharePlayer = b1;
          liveBizParam.mNoMoreText = p0.readString();
          liveBizParam.mSelectedPhoto = QPhoto$$Parcelable.read(p0, p1);
          b1 = (p0.readInt() == 1)? true: false;
          liveBizParam.mIsAutoEnter = b1;
          liveBizParam.mNearbyGuideParam = p0.readSerializable();
          b1 = (p0.readInt() == 1)? true: false;
          liveBizParam.mIsLiveSlideSquareFromScheme = b1;
          b1 = (p0.readInt() == 1)? true: false;
          liveBizParam.mShouldShowNewFeedbackInProfilePage = b1;
          if (p0.readInt() == 1) {
             b = true;
          }
          liveBizParam.mIsFromShare = b;
          liveBizParam.mLiveAggregationSessionId = p0.readString();
          liveBizParam.mLiveSourceType = p0.readInt();
          p1.f(i, liveBizParam);
          return liveBizParam;
       }
    }
    public static void write(LiveBizParam p0,Parcel p1,int p2,a p3){
       Iterator iterator;
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mHasShownSlideRecommendMask);
          p1.writeInt(p0.mIsActivityClosedBySwipeOut);
          p1.writeInt(p0.mEnableUnFollowRemove);
          p1.writeLong(p0.mBackEntranceDisplaySumDurationMs);
          LiveStyleParams$$Parcelable.write(p0.mLiveStyleParams, p1, p2, p3);
          p1.writeInt(p0.mHasExecutedRouter);
          QPhoto$$Parcelable.write(p0.mPreviewOrLiteOriginPhoto, p1, p2, p3);
          p1.writeString(p0.mLiveSourceUrl);
          p1.writeString(p0.mSlidePlayId);
          p1.writeString(p0.mSelectedStreamId);
          p1.writeInt(p0.mDisableSyncFeedPosition);
          LiveBizParam mInterceptAu = p0.mInterceptAutoJumpFeedSet;
          if (mInterceptAu == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mInterceptAu.size());
             iterator = p0.mInterceptAutoJumpFeedSet.iterator();
             while (iterator.hasNext()) {
                p1.writeString(iterator.next());
             }
          }
          p1.writeInt(p0.mEnterPlayerReuseType);
          p1.writeInt(p0.mSlideGuideMode);
          p1.writeInt(p0.mIsSoloLiveStream);
          p1.writeInt(p0.mSelectedIndex);
          p1.writeInt(p0.mDisablePullRefresh);
          p1.writeInt(p0.mIsLiveSlide);
          p1.writeInt(p0.mIsDifferentStream);
          p1.writeInt(p0.mOpenPanelType);
          p1.writeInt(p0.mHasShownMobileNetworkAlert);
          p1.writeSerializable(p0.mLiveActivityTaskInfo);
          SlidePlayConfig$$Parcelable.write(p0.mSlidePlayConfig, p1, p2, p3);
          p1.writeInt(p0.mDisableNegativeFeedback);
          p1.writeInt(p0.mPhotoDetailSource);
          LiveAdNeoParam$$Parcelable.write(p0.mAdNeoPendantParam, p1, p2, p3);
          p1.writeInt(p0.mReferLiveSourceType);
          p1.writeInt(p0.mIsFromPush);
          p1.writeString(p0.mSeamlessEnterLiveStreamId);
          LiveSlidePlayFeedFlowParam$$Parcelable.write(p0.mSlidePlayFeedFlowParam, p1, p2, p3);
          p1.writeInt(p0.mDisableLoadMore);
          p1.writeInt(p0.mUnserializableBundleId);
          mInterceptAu = p0.mPageUrlParamMap;
          if (mInterceptAu == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mInterceptAu.size());
             iterator = p0.mPageUrlParamMap.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry1 = iterator.next();
                p1.writeString(uEntry1.getKey());
                p1.writeString(uEntry1.getValue());
             }
          }
          LiveAudienceParam$$Parcelable.write(p0.mLiveAudienceParam, p1, p2, p3);
          p1.writeSerializable(p0.mLiveSquareReplaceModel);
          p1.writeInt(p0.mIsStatusBarSolid);
          p1.writeInt(p0.mHasShownLiveSourceBackEntranceAnimation);
          p1.writeString(p0.mPlayerReuseToken);
          p1.writeInt(p0.mPhotoDetailBizType);
          p1.writeInt(p0.mHasShownLiveSlideGuide);
          p1.writeInt(p0.mHasClickReplacePageList);
          mInterceptAu = p0.mInternalJumpUrlMap;
          if (mInterceptAu == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mInterceptAu.size());
             iterator = p0.mInternalJumpUrlMap.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                p1.writeString(uEntry.getKey());
                p1.writeString(uEntry.getValue());
             }
          }
          p1.writeSerializable(p0.mExtraInfo);
          p1.writeInt(p0.mIsSharePlayer);
          p1.writeString(p0.mNoMoreText);
          QPhoto$$Parcelable.write(p0.mSelectedPhoto, p1, p2, p3);
          p1.writeInt(p0.mIsAutoEnter);
          p1.writeSerializable(p0.mNearbyGuideParam);
          p1.writeInt(p0.mIsLiveSlideSquareFromScheme);
          p1.writeInt(p0.mShouldShowNewFeedbackInProfilePage);
          p1.writeInt(p0.mIsFromShare);
          p1.writeString(p0.mLiveAggregationSessionId);
          p1.writeInt(p0.mLiveSourceType);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public LiveBizParam getParcel(){
       return this.liveBizParam$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       LiveBizParam$$Parcelable.write(this.liveBizParam$$0, p0, p1, new a());
    }
}
