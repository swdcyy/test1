package com.kuaishou.android.model.mix.CommonMeta;
import java.io.Serializable;
import zp.i;
import im8.g;
import fa6.a;
import java.util.HashMap;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import zp.c;
import java.util.Map;
import zp.a0;

public class CommonMeta extends a implements Serializable, i, g	// class@000632
{
    public CDNUrl[] mActivity61AnimationImageUrls;
    public String mCaption;
    public String mCaptionByMmu;
    public String mCaptionByOpertion;
    public CaptionSearchInfo mCaptionSearchInfo;
    public String mCaptionTitle;
    public String mCaptionToComment;
    public PhotoCoinRewardModel mCoinRewardModel;
    public int mColor;
    public String mCommodityJumpUrl;
    public String mCommonLogParams;
    public CoverAnimation mCoverAnimation;
    public CoverCommonTagsModel mCoverCommonTags;
    public String mCoverExtraTitle;
    public long mCreated;
    public boolean mCreatedSearchCard;
    public String mCurrentFreeTrafficType;
    public String mCurrentNetwork;
    public int mCurrentPosition;
    public boolean mDeduplication;
    public boolean mDegrade;
    public String mDescription;
    public DetailStrongButtonConfig mDetailStrongButtonConfig;
    public int mDirection;
    public String mDisplayRecoReason;
    public Distance mDistance;
    public boolean mEnablePaidQuestion;
    public boolean mEnableTimestamp;
    public String mExpTag;
    public boolean mExpectFreeTraffic;
    public FansTopDisplayStyle mFansTopDisplayStyle;
    public FeedFriendInfo mFeedFriendInfo;
    public String mFeedId;
    public FeedLogCtx mFeedLogCtx;
    public String mFeedLogCtxStr;
    public int mFeedStreamType;
    public Map mForwardStatsParams;
    public boolean mHasRecordedForAdRank;
    public boolean mHasReport;
    public HealthyDiseaseInfo mHealthyDiseaseInfo;
    public int mHeight;
    public String mHotSpotDoubleCoverPhotoId;
    public String mId;
    public boolean mIgnoreCheckFilter;
    public boolean mIgnoreDelayShowBottomBar;
    public boolean mIgnoreFreeTraffic;
    public Set mInitPauseFlags;
    public boolean mInsertBackgroundPlayItem;
    public boolean mInteractionTagShowed;
    public FeedBackInterestManagementEntrance mInterestManagementEntrance;
    public int mIntimateType;
    public boolean mIsBackgroundPlayPhoto;
    public boolean mIsClickCommodityCard;
    public boolean mIsCloseLive;
    public boolean mIsCoverFillBlur;
    public boolean mIsFromPrePage;
    public boolean mIsSmallWindowDismissPhoto;
    public String mKsOrderId;
    public f mKsOrderIdCollection;
    public int mKwaiVoiceType;
    public String mListLoadSequenceID;
    public int mLiveStartPlaySource;
    public Location mLocation;
    public String mLocationDistanceStr;
    public boolean mLogEndCoveredRegion;
    public String mLogReportContext;
    public boolean mLogStartCoveredRegion;
    public String mMovieName;
    public boolean mNeedRetryFreeTraffic;
    public int mOriginPosition;
    public int mPageIndex;
    public PhotoAreaInfo mPhotoAreaInfo;
    public List mPhotoMmuTagInfo;
    public int mPosition;
    public int mPositionInPage;
    public PosterSpecialEffect mPosterSpecialEffect;
    public long mPredictWatchTime;
    public boolean mProductsNeedBoostFansTop;
    public String mProvince;
    public int mPullDownRefreshTime;
    public String mPureTitle;
    public boolean mRandomUrl;
    public boolean mRankEnable;
    public a0 mRankFeatures;
    public String mRealActionSubBizTag;
    public int mRealRelationType;
    public boolean mRecoDegrade;
    public String mRecoReason;
    public boolean mRecoShowed;
    public List mRecoTags;
    public int mRelationType;
    public String mRelationTypeText;
    public String mReportContext;
    public String mSearchSessionId;
    public List mSearchSortFeatures;
    public String mServerExpTag;
    public String mShareInfo;
    public String mSharePassingParam;
    public String mShareScene;
    public Map mSharedMsgPageParams;
    public long mSharedMsgSeq;
    public boolean mShowGrDetailPage;
    public String mShowTime;
    public boolean mShowed;
    public boolean mShowedCoinReward;
    public boolean mSlideMonitorFlag;
    public boolean mSocialRelationFamilar;
    public List mSortFeatures;
    public String mSource;
    public String mSourcePhotoPage;
    public StandardSerialInfo mStandardSerialInfo;
    public String mSurveyId;
    public String mTime;
    public boolean mTopFeedCoverAni;
    public int mTopFeedIndex;
    public String mTransientCommodityType;
    public boolean mTransientShowed;
    public boolean mTransientShowedCommodity;
    public int mType;
    public String mUssId;
    public boolean mVerticalShowed;
    public long mViewTime;
    public int mWidth;
    public String recoLabel;
    public static final int REAL_RELATION_TYPE_FRIEND = 1;
    public static final int RELATION_TYPE_FRIEND = 1;
    public static final long serialVersionUID = 0x2b6abdd1827c2e34;

    public void CommonMeta(){
       super();
       this.mSource = "";
       this.mExpTag = "";
       this.mForwardStatsParams = new HashMap();
       this.mCurrentPosition = -1;
       this.mOriginPosition = -1;
       this.mPositionInPage = -1;
       this.mShowedCoinReward = false;
       this.mIsSmallWindowDismissPhoto = false;
       this.mShareScene = "";
       this.mIsCoverFillBlur = false;
    }
    public long getCreated(){
       return this.mCreated;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CommonMeta.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new c();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, CommonMeta.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(CommonMeta.class, new c());
       }else {
          obj.put(CommonMeta.class, null);
       }
       return obj;
    }
    public a0 getRankFeatures(){
       Object obj = PatchProxy.apply(null, this, CommonMeta.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mRankFeatures == null) {
          this.mRankFeatures = new a0();
       }
       return this.mRankFeatures;
    }
    public int getRelationType(){
       return this.mRelationType;
    }
    public String getRelationTypeText(){
       return this.mRelationTypeText;
    }
    public boolean isEmptyDistance(){
       boolean b = (this.mDistance == null)? true: false;
       return b;
    }
    public void updateCommonMetaWhenRefreshFeed(CommonMeta p0){
       this.mIgnoreFreeTraffic = p0.mIgnoreFreeTraffic;
       this.mExpectFreeTraffic = p0.mExpectFreeTraffic;
       this.mCurrentNetwork = p0.mCurrentNetwork;
       this.mCurrentFreeTrafficType = p0.mCurrentFreeTrafficType;
    }
    public void updateWithServer(CommonMeta p0){
       this.mTime = p0.mTime;
       this.mDistance = p0.mDistance;
       this.mExpTag = p0.mExpTag;
       this.mServerExpTag = p0.mServerExpTag;
       this.mLocation = p0.mLocation;
       this.mListLoadSequenceID = p0.mListLoadSequenceID;
       this.mDisplayRecoReason = p0.mDisplayRecoReason;
       this.mCreated = p0.mCreated;
       this.mFansTopDisplayStyle = p0.mFansTopDisplayStyle;
       this.mCaption = p0.mCaption;
       this.mCaptionTitle = p0.mCaptionTitle;
       this.mCaptionByOpertion = p0.mCaptionByOpertion;
       this.mPureTitle = p0.mPureTitle;
       this.mFeedId = p0.mFeedId;
       this.mSurveyId = p0.mSurveyId;
       this.mFeedLogCtx = p0.mFeedLogCtx;
    }
    public void updateWithServer(Object p0){
       this.updateWithServer(p0);
    }
}
