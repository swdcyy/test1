package com.yxcorp.gifshow.nasa.NasaSlideParam$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.nasa.NasaSlideParam$$Parcelable$a;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.lang.Class;
import org.parceler.a;
import java.lang.Boolean;
import java.io.Serializable;
import com.yxcorp.gifshow.nearby.NearbyParam;
import com.yxcorp.gifshow.nasa.NasaCollectionSlideParam;
import com.yxcorp.gifshow.nasa.NasaCollectionSlideParam$$Parcelable;
import java.lang.Integer;
import com.yxcorp.gifshow.nasa.NasaTagInfo;
import com.kwai.framework.model.commonfeedslide.CommonFeedSlideParams;
import com.yxcorp.gifshow.nasa.scheme.action.NasaSlideSchemeAction;
import com.yxcorp.gifshow.im.MessageSlideParam;
import java.lang.Long;
import com.yxcorp.gifshow.nearby.NearbyGuideParam;
import com.yxcorp.gifshow.nasa.NasaSlideSerialParam;
import com.yxcorp.gifshow.nasa.NasaSlideSerialParam$$Parcelable;

public class NasaSlideParam$$Parcelable implements Parcelable, d	// class@0020c2
{
    public NasaSlideParam nasaSlideParam$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       NasaSlideParam$$Parcelable.CREATOR = new NasaSlideParam$$Parcelable$a();
    }
    public void NasaSlideParam$$Parcelable(NasaSlideParam p0){
       super();
       this.nasaSlideParam$$0 = p0;
    }
    public static NasaSlideParam read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          int i1 = 0;
          Class[] uClassArray = new Class[i1];
          Object[] objArray = new Object[i1];
          NasaSlideParam nasaSlidePar = a.a(NasaSlideParam.class, uClassArray, objArray);
          p1.f(p1.g(), nasaSlidePar);
          boolean b = (p0.readInt() == 1)? true: false;
          nasaSlidePar.mPostFeedReadEvent = b;
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mIsFollowSlideNasaDetail", Boolean.valueOf(b));
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mEnableSearchButton", Boolean.valueOf(b));
          a.d(NasaSlideParam.class, nasaSlidePar, "mNearbyParam", p0.readSerializable());
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mFromTube", Boolean.valueOf(b));
          a.d(NasaSlideParam.class, nasaSlidePar, "mTubePhotoId", p0.readString());
          a.d(NasaSlideParam.class, nasaSlidePar, "mNasaCollectionSlideParam", NasaCollectionSlideParam$$Parcelable.read(p0, p1));
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mFromPoiOptimizaEntrance", Boolean.valueOf(b));
          Long longx = null;
          Integer integer = (p0.readInt() < 0)? longx: Integer.valueOf(p0.readInt());
          a.d(NasaSlideParam.class, nasaSlidePar, "mPhotoCount", integer);
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mIsDifferentStream", Boolean.valueOf(b));
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mIsSchoolSquare", Boolean.valueOf(b));
          a.d(NasaSlideParam.class, nasaSlidePar, "mNasaTagInfo", p0.readSerializable());
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mFromViewerKwaiLink", Boolean.valueOf(b));
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mIsFollowNasaDetail", Boolean.valueOf(b));
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mDisableShowTopTips", Boolean.valueOf(b));
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mEnableShowProgressBar", Boolean.valueOf(b));
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mIsFromPhotoSlideSchema", Boolean.valueOf(b));
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mEnableSwipeDownBack", Boolean.valueOf(b));
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mIsShowFollowLabel", Boolean.valueOf(b));
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mEnableNearbySlidePopupGuide", Boolean.valueOf(b));
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mEnableDecSearchCollectionSecPage", Boolean.valueOf(b));
          b = (p0.readInt() == 1)? true: false;
          nasaSlidePar.mEnableAutoNext = b;
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mIsFollowPushSlideDetail", Boolean.valueOf(b));
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mIsFriendsUpdatedNasaDetail", Boolean.valueOf(b));
          a.d(NasaSlideParam.class, nasaSlidePar, "mTubeJumpPhotoId", p0.readString());
          a.d(NasaSlideParam.class, nasaSlidePar, "mTubeInnerPageType", p0.readString());
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mDisableSidebarExp", Boolean.valueOf(b));
          a.d(NasaSlideParam.class, nasaSlidePar, "mTubePageFrom", p0.readString());
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mIsHotSpotNasaDetail", Boolean.valueOf(b));
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mEnableSlideRecord", Boolean.valueOf(b));
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mEnableFollowSeamlessEnter", Boolean.valueOf(b));
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mDisableAllSmoothSwipeBack", Boolean.valueOf(b));
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mShowViewerTab", Boolean.valueOf(b));
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mIsFollowStaggerDetail", Boolean.valueOf(b));
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mEnableExitShrink", Boolean.valueOf(b));
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mEnableMusicRadioBackPlay", Boolean.valueOf(b));
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mIsEnabledSlideBarGuide", Boolean.valueOf(b));
          a.d(NasaSlideParam.class, nasaSlidePar, "mEntrySource", p0.readString());
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mEnableFollowSlideRecoFeedRecord", Boolean.valueOf(b));
          a.d(NasaSlideParam.class, nasaSlidePar, "mSourcePage", p0.readString());
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mEnableIntensifyFollow", Boolean.valueOf(b));
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mForceDisablePullToRefresh", Boolean.valueOf(b));
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mEnableNegativeFeedbackUnFollow", Boolean.valueOf(b));
          nasaSlidePar.mNoMoreText = p0.readString();
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mIsFriendsNasaDetail", Boolean.valueOf(b));
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mEnableSimpleLiveSlide", Boolean.valueOf(b));
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mEnableLiveSlidePlay", Boolean.valueOf(b));
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mIsMusicRadio", Boolean.valueOf(b));
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mEnableShowBottomComponent", Boolean.valueOf(b));
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mEnablePlayFriendClapAnim", Boolean.valueOf(b));
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mIsUserStatusNasaDetail", Boolean.valueOf(b));
          a.d(NasaSlideParam.class, nasaSlidePar, "BOTTOM_BAR_HEIGHT", Integer.valueOf(p0.readInt()));
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mEnableDecSearchKboxSlideSecPage", Boolean.valueOf(b));
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mIsPayCourseDetail", Boolean.valueOf(b));
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mIsHomeCommonSlideDetail", Boolean.valueOf(b));
          a.d(NasaSlideParam.class, nasaSlidePar, "mProfileTabId", Integer.valueOf(p0.readInt()));
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mEnableFollowSlidePymiV2", Boolean.valueOf(b));
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mEnableMilanoPullToRefresh", Boolean.valueOf(b));
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mDisableShowBottomTips", Boolean.valueOf(b));
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mEnableCaptionOpt", Boolean.valueOf(b));
          a.d(NasaSlideParam.class, nasaSlidePar, "mHomeCommonFeedSlideParams", p0.readSerializable());
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mIsMessageNotify", Boolean.valueOf(b));
          b = (p0.readInt() == 1)? true: false;
          nasaSlidePar.mIsRecoGuideHasShowed = b;
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mEnableCameraButton", Boolean.valueOf(b));
          a.d(NasaSlideParam.class, nasaSlidePar, "mPage", p0.readString());
          a.d(NasaSlideParam.class, nasaSlidePar, "mSchemeAction", p0.readSerializable());
          nasaSlidePar.mViewedPhotoId = p0.readString();
          a.d(NasaSlideParam.class, nasaSlidePar, "mProfileUserId", p0.readString());
          a.d(NasaSlideParam.class, nasaSlidePar, "mAssociatedTagName", p0.readString());
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mEnableFollowSlidePopupGuide", Boolean.valueOf(b));
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mEnableFollowShowQuickComment", Boolean.valueOf(b));
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mCancelSlidePositionRefer", Boolean.valueOf(b));
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mEnableCoveredRegion", Boolean.valueOf(b));
          a.d(NasaSlideParam.class, nasaSlidePar, "mFromPageName", p0.readString());
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mEnableReceiveLikeComment", Boolean.valueOf(b));
          a.d(NasaSlideParam.class, nasaSlidePar, "mTubePageType", p0.readString());
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mEnableNebulaFollowSlideAutoNextPopupGuide", Boolean.valueOf(b));
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mEnableShareEntranceOpt", Boolean.valueOf(b));
          a.d(NasaSlideParam.class, nasaSlidePar, "mEnterDetailPhotoId", p0.readString());
          a.d(NasaSlideParam.class, nasaSlidePar, "mMessageSlideParam", p0.readSerializable());
          if (p0.readInt() >= 0) {
             longx = Long.valueOf(p0.readLong());
          }
          a.d(NasaSlideParam.class, nasaSlidePar, "mTubeLastSeenPos", longx);
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mEnableDynamicLoop", Boolean.valueOf(b));
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mEnableFollowNewLive", Boolean.valueOf(b));
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mEnableReplaceFeedCover", Boolean.valueOf(b));
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mSidebarFeedLiveTopResident", Boolean.valueOf(b));
          a.d(NasaSlideParam.class, nasaSlidePar, "mNearbyGuideParam", p0.readSerializable());
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mModifyOriginDataAlso", Boolean.valueOf(b));
          a.d(NasaSlideParam.class, nasaSlidePar, "mBizStartTs", Long.valueOf(p0.readLong()));
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mIsNewsSlideNasaDetail", Boolean.valueOf(b));
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mEnableShowMarque", Boolean.valueOf(b));
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mEnableShowSmallWindow", Boolean.valueOf(b));
          a.d(NasaSlideParam.class, nasaSlidePar, "mNasaSlideSerialParam", NasaSlideSerialParam$$Parcelable.read(p0, p1));
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mIsHotSpotAnchorRedirect", Boolean.valueOf(b));
          a.d(NasaSlideParam.class, nasaSlidePar, "mAutoOpenPlcPhotoId", p0.readString());
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mAllowShowFloatWidget", Boolean.valueOf(b));
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideParam.class, nasaSlidePar, "mEnableDomino", Boolean.valueOf(b));
          if (p0.readInt() == 1) {
             i1 = true;
          }
          a.d(NasaSlideParam.class, nasaSlidePar, "mIsFollowAcquaintanceSlideDetail", Boolean.valueOf(i1));
          p1.f(i, nasaSlidePar);
          return nasaSlidePar;
       }
    }
    public static void write(NasaSlideParam p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mPostFeedReadEvent);
          p1.writeInt(p0.mIsFollowSlideNasaDetail);
          p1.writeInt(p0.mEnableSearchButton);
          p1.writeSerializable(p0.mNearbyParam);
          p1.writeInt(p0.mFromTube);
          p1.writeString(p0.mTubePhotoId);
          NasaCollectionSlideParam$$Parcelable.write(p0.mNasaCollectionSlideParam, p1, p2, p3);
          p1.writeInt(p0.mFromPoiOptimizaEntrance);
          if (p0.mPhotoCount == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(1);
             p1.writeInt(p0.mPhotoCount.intValue());
          }
          p1.writeInt(p0.mIsDifferentStream);
          p1.writeInt(p0.mIsSchoolSquare);
          p1.writeSerializable(p0.mNasaTagInfo);
          Class tYPE = Boolean.TYPE;
          p1.writeInt(a.b(tYPE, NasaSlideParam.class, p0, "mFromViewerKwaiLink").booleanValue());
          p1.writeInt(p0.mIsFollowNasaDetail);
          p1.writeInt(p0.mDisableShowTopTips);
          p1.writeInt(p0.mEnableShowProgressBar);
          p1.writeInt(a.b(tYPE, NasaSlideParam.class, p0, "mIsFromPhotoSlideSchema").booleanValue());
          p1.writeInt(p0.mEnableSwipeDownBack);
          p1.writeInt(p0.mIsShowFollowLabel);
          p1.writeInt(p0.mEnableNearbySlidePopupGuide);
          p1.writeInt(p0.mEnableDecSearchCollectionSecPage);
          p1.writeInt(p0.mEnableAutoNext);
          p1.writeInt(p0.mIsFollowPushSlideDetail);
          p1.writeInt(p0.mIsFriendsUpdatedNasaDetail);
          p1.writeString(p0.mTubeJumpPhotoId);
          p1.writeString(p0.mTubeInnerPageType);
          p1.writeInt(p0.mDisableSidebarExp);
          p1.writeString(p0.mTubePageFrom);
          p1.writeInt(p0.mIsHotSpotNasaDetail);
          p1.writeInt(p0.mEnableSlideRecord);
          p1.writeInt(p0.mEnableFollowSeamlessEnter);
          p1.writeInt(p0.mDisableAllSmoothSwipeBack);
          p1.writeInt(a.b(tYPE, NasaSlideParam.class, p0, "mShowViewerTab").booleanValue());
          p1.writeInt(p0.mIsFollowStaggerDetail);
          p1.writeInt(p0.mEnableExitShrink);
          p1.writeInt(p0.mEnableMusicRadioBackPlay);
          p1.writeInt(p0.mIsEnabledSlideBarGuide);
          p1.writeString(p0.mEntrySource);
          p1.writeInt(p0.mEnableFollowSlideRecoFeedRecord);
          p1.writeString(p0.mSourcePage);
          p1.writeInt(p0.mEnableIntensifyFollow);
          p1.writeInt(p0.mForceDisablePullToRefresh);
          p1.writeInt(p0.mEnableNegativeFeedbackUnFollow);
          p1.writeString(p0.mNoMoreText);
          p1.writeInt(p0.mIsFriendsNasaDetail);
          p1.writeInt(p0.mEnableSimpleLiveSlide);
          p1.writeInt(p0.mEnableLiveSlidePlay);
          p1.writeInt(p0.mIsMusicRadio);
          p1.writeInt(p0.mEnableShowBottomComponent);
          p1.writeInt(a.b(tYPE, NasaSlideParam.class, p0, "mEnablePlayFriendClapAnim").booleanValue());
          p1.writeInt(p0.mIsUserStatusNasaDetail);
          p1.writeInt(p0.BOTTOM_BAR_HEIGHT);
          p1.writeInt(p0.mEnableDecSearchKboxSlideSecPage);
          p1.writeInt(p0.mIsPayCourseDetail);
          p1.writeInt(p0.mIsHomeCommonSlideDetail);
          p1.writeInt(p0.mProfileTabId);
          p1.writeInt(p0.mEnableFollowSlidePymiV2);
          p1.writeInt(p0.mEnableMilanoPullToRefresh);
          p1.writeInt(p0.mDisableShowBottomTips);
          p1.writeInt(p0.mEnableCaptionOpt);
          p1.writeSerializable(p0.mHomeCommonFeedSlideParams);
          p1.writeInt(p0.mIsMessageNotify);
          p1.writeInt(p0.mIsRecoGuideHasShowed);
          p1.writeInt(p0.mEnableCameraButton);
          p1.writeString(p0.mPage);
          p1.writeSerializable(p0.mSchemeAction);
          p1.writeString(p0.mViewedPhotoId);
          p1.writeString(p0.mProfileUserId);
          p1.writeString(p0.mAssociatedTagName);
          p1.writeInt(p0.mEnableFollowSlidePopupGuide);
          p1.writeInt(p0.mEnableFollowShowQuickComment);
          p1.writeInt(p0.mCancelSlidePositionRefer);
          p1.writeInt(p0.mEnableCoveredRegion);
          p1.writeString(p0.mFromPageName);
          p1.writeInt(a.b(tYPE, NasaSlideParam.class, p0, "mEnableReceiveLikeComment").booleanValue());
          p1.writeString(p0.mTubePageType);
          p1.writeInt(p0.mEnableNebulaFollowSlideAutoNextPopupGuide);
          p1.writeInt(p0.mEnableShareEntranceOpt);
          p1.writeString(p0.mEnterDetailPhotoId);
          p1.writeSerializable(p0.mMessageSlideParam);
          if (p0.mTubeLastSeenPos == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(1);
             p1.writeLong(p0.mTubeLastSeenPos.longValue());
          }
          p1.writeInt(p0.mEnableDynamicLoop);
          p1.writeInt(p0.mEnableFollowNewLive);
          p1.writeInt(p0.mEnableReplaceFeedCover);
          p1.writeInt(p0.mSidebarFeedLiveTopResident);
          p1.writeSerializable(p0.mNearbyGuideParam);
          p1.writeInt(p0.mModifyOriginDataAlso);
          p1.writeLong(p0.mBizStartTs);
          p1.writeInt(p0.mIsNewsSlideNasaDetail);
          p1.writeInt(a.b(tYPE, NasaSlideParam.class, p0, "mEnableShowMarque").booleanValue());
          p1.writeInt(p0.mEnableShowSmallWindow);
          NasaSlideSerialParam$$Parcelable.write(p0.mNasaSlideSerialParam, p1, p2, p3);
          p1.writeInt(p0.mIsHotSpotAnchorRedirect);
          p1.writeString(p0.mAutoOpenPlcPhotoId);
          p1.writeInt(p0.mAllowShowFloatWidget);
          p1.writeInt(a.b(tYPE, NasaSlideParam.class, p0, "mEnableDomino").booleanValue());
          p1.writeInt(p0.mIsFollowAcquaintanceSlideDetail);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public NasaSlideParam getParcel(){
       return this.nasaSlideParam$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       NasaSlideParam$$Parcelable.write(this.nasaSlideParam$$0, p0, p1, new a());
    }
}
