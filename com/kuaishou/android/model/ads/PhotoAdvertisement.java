package com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.commercial.PhotoAdvertisementInterface;
import com.kuaishou.android.model.ads.PhotoAdvertisementPlaceHolder;
import java.io.Serializable;
import da6.c;
import java.lang.Object;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdGroup;
import com.kuaishou.android.model.ads.PhotoAdvertisement$FansTopFeedFlameType;
import com.kuaishou.android.model.ads.PhotoAdvertisement$FansTopDetailPageFlameType;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdLabelType;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$Styles;
import com.kwai.framework.model.ExtendableModelMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.ads.PhotoAdvertisement$FanstopLiveInfo;
import da6.b;
import java.lang.Enum;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.android.model.ads.SplashInfo;

public class PhotoAdvertisement implements PhotoAdvertisementInterface, PhotoAdvertisementPlaceHolder, Serializable, c	// class@000a69
{
    public int mAdActionType;
    public PhotoAdvertisement$AdCover mAdCover;
    public PhotoAdvertisement$AdData mAdData;
    public PhotoAdvertisement$AdGroup mAdGroup;
    public String mAdInstanceId;
    public String mAdLabelDescription;
    public PhotoAdvertisement$FanstopLiveInfo mAdLiveForFansTop;
    public int mAdPhotoCommentSource;
    public int mAdQueueType;
    public String mAdSubType;
    public int mAdTypeForGap;
    public String mApkFileName;
    public String mAppIconUrl;
    public String mAppName;
    public double mAppScore;
    public PhotoAdvertisement$AutoConversionInfo mAutoConversionInfo;
    public int mAutoIntoLiveSeconds;
    public int mAwardType;
    public String mBackgroundColor;
    public HashMap mBaseInfo;
    public HashMap mBizSwitchInfo;
    public String mCallbackParam;
    public ArrayList mCaptionHints;
    public ArrayList mCaptionUrls;
    public String mChargeInfo;
    public String mClickNumber;
    public long mCommonSwitchBit;
    public int mConversionType;
    public long mCoverId;
    public long mCreativeId;
    public boolean mDisableFansTopDetailIconClick;
    public int mDisplayType;
    public boolean mDownloadOnlySupportWifi;
    public int mDownloadType;
    public boolean mEnableRetainTopAd;
    public boolean mEnableShowFansTopFlame;
    public Long mExpireTimestamp;
    public int mExposureReason;
    public String mExtData;
    public ExtendableModelMap mExtraMap;
    public String mFansTopAttributeParams;
    public long mFansTopAwardBonusTime;
    public String mFansTopDetailPageFlameDesc;
    public PhotoAdvertisement$FansTopDetailPageFlameType mFansTopDetailPageFlameType;
    public PhotoAdvertisement$FansTopFeedFlameType mFansTopFeedFlameType;
    public boolean mFromGift;
    public boolean mHasAdGapReported;
    public boolean mHasCheckAdDataNullable;
    public boolean mHasDebugInfoReported;
    public boolean mHasFeedActionItemShown;
    public boolean mHasSubmitSurvey;
    public boolean mHideLabel;
    public Boolean mHidePlayletBarSwitch;
    public String mImageUrl;
    public boolean mIsAttachBySearchClick;
    public boolean mIsFansTopWholeArea;
    public boolean mIsFromSearchAd;
    public boolean mIsH5App;
    public int mIsImpressionAtOutflow;
    public boolean mIsInLiving;
    public boolean mIsNewStyle;
    public boolean mIsNonSlideAd;
    public boolean mIsSearchKBoxAd;
    public String mItemDesc;
    public String mItemTitle;
    public PhotoAdvertisement$AdLabelType mLabelStyle;
    public int mLiveAdSourceType;
    public int mLiveGiftSourceType;
    public String mLlsid;
    public List mManuUrls;
    public MerchantEnhanceDisplay mMerchantEnhanceDisplay;
    public String mMerchantURLParamsStr;
    public long mMissionId;
    public Set mModuleUseRateSet;
    public int mMoveForwardSteps;
    public long mOrderId;
    public String mPackageName;
    public long mPageId;
    public String mPhotoPage;
    public PhotoAdvertisement$PlayEndInfo mPlayEndInfo;
    public boolean mPreload;
    public String mRecommendReason;
    public String mReplacedAdMessage;
    public int mReportClientLogType;
    public String mRequestApiExtData;
    public long mReservationExpireTimestamp;
    public String mReservationId;
    public int mReservationType;
    public float mScale;
    public String mScheme;
    public int mSearchKBoxAdFeedSize;
    public int mSearchKBoxAdIndex;
    public long mServerTimestamp;
    public boolean mShouldAlertNetMobile;
    public boolean mShowAdItemReported;
    public boolean mShowReported;
    public String mSimpleLiveAdInfo;
    public String mSourceDescription;
    public int mSourceDescriptionType;
    public int mSourceType;
    public PhotoAdvertisement$Styles mStyles;
    public long mSubPageId;
    public String mSubscriptDescription;
    public int mSubscriptType;
    public int mSupConversionType;
    public HashMap mTKStatusDataMap;
    public long mTaskId;
    public int mTemplateType;
    public String mTextColor;
    public String mTitle;
    public a mTrackRedirectInfo;
    public List mTracks;
    public String mUrl;
    public boolean mUsePriorityCard;
    public long mVideoPlayStartTimeMS;
    public static final String ACTION_BAR_DISPLAY_TYPE_THANOS_SIMPLE_BAR = "11";
    public static final int AD_LOAD_CURRENT_PAGE = 1;
    public static final int AD_LOAD_NEW_PAGE = 0;
    public static final String COMMENT_ACTIONBAR_STYLE_13 = "13";
    public static final String COMMENT_ACTIONBAR_STYLE_2 = "2";
    public static int ROTATE_DEGREE_DEFAULT = 45;
    public static final int SOURCE_TYPE_OLD_FANS_TOP = 4;
    public static final int UNEXPECTED_MD5_STRATEGY_DEFAULT = 0;
    public static final int UNEXPECTED_MD5_STRATEGY_NOT_INSTALL = 1;
    public static final int UNEXPECTED_MD5_STRATEGY_TOAST = 2;
    public static final long serialVersionUID = 0x7deaa6968e504859;

    public void PhotoAdvertisement(){
       super();
       this.mHideLabel = false;
       this.mTitle = "";
       this.mUrl = "";
       this.mMerchantURLParamsStr = "";
       this.mPackageName = "";
       this.mAdQueueType = 0;
       this.mDisplayType = 0;
       this.mBackgroundColor = "#09ba08";
       this.mTextColor = "#ffffff";
       this.mSourceDescriptionType = 0;
       this.mSubscriptType = 0;
       this.mAdGroup = PhotoAdvertisement$AdGroup.UNKNOWN;
       this.mAdSubType = "";
       this.mScale = 0x3f800000;
       this.mPhotoPage = "";
       this.mExtData = "";
       this.mRequestApiExtData = "";
       this.mEnableShowFansTopFlame = false;
       this.mFansTopFeedFlameType = PhotoAdvertisement$FansTopFeedFlameType.NONE;
       this.mFansTopDetailPageFlameType = PhotoAdvertisement$FansTopDetailPageFlameType.NONE;
       this.mLabelStyle = PhotoAdvertisement$AdLabelType.TRANSPARENT_BACKGROUND;
       this.mAwardType = 0;
       this.mIsFromSearchAd = false;
       this.mIsSearchKBoxAd = false;
       this.mSearchKBoxAdFeedSize = 0;
       this.mSearchKBoxAdIndex = 0;
       this.mIsAttachBySearchClick = false;
       this.mIsImpressionAtOutflow = -1;
       this.mAdData = new PhotoAdvertisement$AdData(true);
       this.mStyles = new PhotoAdvertisement$Styles();
       this.mIsNonSlideAd = false;
       this.mExposureReason = 0;
       this.mMoveForwardSteps = 0;
       this.mAdPhotoCommentSource = 0;
       this.mReportClientLogType = 0;
       this.mExtraMap = new ExtendableModelMap();
       this.mCommonSwitchBit = 0;
    }
    public boolean canAdvertisementAbandoned(){
       boolean b;
       if (this.mEnableRetainTopAd == null) {
          PhotoAdvertisement tmAdGroup = this.mAdGroup;
          if (tmAdGroup == PhotoAdvertisement$AdGroup.DSP || tmAdGroup == PhotoAdvertisement$AdGroup.THIRD_PLATFORM) {
             b = true;
          label_0011 :
             return b;
          }
       }
       b = false;
       goto label_0011 ;
    }
    public PhotoAdvertisement cloneForLiveStreamFeed(){
       PhotoAdvertisement obj = PatchProxy.apply(null, this, PhotoAdvertisement.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PhotoAdvertisement();
       obj.mAdLiveForFansTop = this.mAdLiveForFansTop;
       PhotoAdvertisement tmAdData = this.mAdData;
       if (tmAdData != null) {
          PhotoAdvertisement mAdData = obj.mAdData;
          if (mAdData != null) {
             mAdData.mAdExposedInfo = tmAdData.mAdExposedInfo;
          }
       }
       tmAdData = this.mAdLiveForFansTop;
       if (tmAdData != null) {
          obj.mFansTopAttributeParams = tmAdData.mFansTopAttributeParams;
          obj.mCallbackParam = tmAdData.mCallbackParam;
       }
       return obj;
    }
    public void f(String p0,Object p1){
       b.c(this, p0, p1);
    }
    public PhotoAdvertisement$AdData getAdData(){
       return this.mAdData;
    }
    public String getAdGroup(){
       Object obj = PatchProxy.apply(null, this, PhotoAdvertisement.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mAdGroup.name();
    }
    public Object getExtra(String p0){
       return b.a(this, p0);
    }
    public ExtendableModelMap getExtraMap(){
       Object obj = PatchProxy.apply(null, this, PhotoAdvertisement.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mExtraMap == null) {
          this.mExtraMap = new ExtendableModelMap();
       }
       return this.mExtraMap;
    }
    public String getVseAdSubType(){
       PhotoAdvertisement tmAdSubType;
       String obj = PatchProxy.apply(null, this, PhotoAdvertisement.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (TextUtils.isEmpty(this.mAdSubType))? "default": this.mAdSubType;
       return obj;
    }
    public boolean isAdGroup(PhotoAdvertisement$AdGroup[] p0){
       int len = p0.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return false;
          }
          if (this.mAdGroup == p0[i]) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public boolean isSplashAd(){
       PhotoAdvertisement tmAdData = this.mAdData;
       boolean b = false;
       if (tmAdData != null) {
          PhotoAdvertisement$AdData mSplashInfo = tmAdData.mSplashInfo;
          if (mSplashInfo != null && mSplashInfo.mSplashBaseInfo != null) {
             b = true;
          }
       }
       return b;
    }
    public void mockFansTop(){
       if (PatchProxy.applyVoid(null, this, PhotoAdvertisement.class, "4")) {
          return;
       }
       this.mockFansTop(null);
       return;
    }
    public void mockFansTop(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoAdvertisement.class, "5")) {
          return;
       }
       if (this.mAdLiveForFansTop == null) {
          PhotoAdvertisement$FanstopLiveInfo uFanstopLive = new PhotoAdvertisement$FanstopLiveInfo();
          uFanstopLive.mSourceType = this.mSourceType;
          uFanstopLive.mAdGroup = this.mAdGroup;
          uFanstopLive.mExtData = this.mExtData;
          uFanstopLive.mRequestApiExtData = this.mRequestApiExtData;
          uFanstopLive.mPhotoPage = this.mPhotoPage;
          uFanstopLive.mChargeInfo = this.mChargeInfo;
          uFanstopLive.mAdData = this.mAdData;
          uFanstopLive.mPageId = this.mPageId;
          uFanstopLive.mSubPageId = this.mSubPageId;
          uFanstopLive.mCreativeId = this.mCreativeId;
          uFanstopLive.mCoverId = this.mCoverId;
          uFanstopLive.mMerchantURLParamsStr = this.mMerchantURLParamsStr;
          uFanstopLive.mExpireTimestamp = this.mExpireTimestamp;
          uFanstopLive.mTemplateType = this.mTemplateType;
          uFanstopLive.mTracks = this.mTracks;
          uFanstopLive.mFansTopAwardBonusTime = this.mFansTopAwardBonusTime;
          uFanstopLive.mAutoConversionInfo = this.mAutoConversionInfo;
          uFanstopLive.mLlsid = (!TextUtils.isEmpty(p0))? p0: this.mLlsid;
          this.mAdLiveForFansTop = uFanstopLive;
       }
       return;
    }
    public void mockFansTopChargeInfo(){
       if (PatchProxy.applyVoid(null, this, PhotoAdvertisement.class, "7")) {
          return;
       }
       PhotoAdvertisement tmAdLiveForF = this.mAdLiveForFansTop;
       if (tmAdLiveForF != null && (TextUtils.isEmpty(tmAdLiveForF.mChargeInfo) && !TextUtils.isEmpty(this.mChargeInfo))) {
          this.mAdLiveForFansTop.mChargeInfo = this.mChargeInfo;
       }
    label_0026 :
       return;
    }
    public void putExtra(String p0,Object p1){
       b.b(this, p0, p1);
    }
}
