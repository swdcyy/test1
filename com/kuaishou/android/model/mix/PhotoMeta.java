package com.kuaishou.android.model.mix.PhotoMeta;
import zp.i;
import da6.c;
import im8.g;
import com.kwai.framework.model.decompose.api.ObservableAndSyncableContainer;
import java.util.ArrayList;
import com.kwai.framework.model.ExtendableModelMap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xc5.a;
import zp.z;
import da6.b;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.mix.SummaryViewModel;
import java.lang.Boolean;
import com.kwai.components.feedmodel.feed.KaraokeModel$KaraokeInfo;
import com.kwai.components.feedmodel.feed.KaraokeModel;
import java.lang.Number;
import java.lang.Integer;
import com.kwai.framework.model.live.LiveTipInfo;
import zp.j;
import java.util.Map;
import java.util.HashMap;
import com.kuaishou.android.model.mix.TagItem;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Void;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import com.smile.gifmaker.mvps.utils.DefaultSyncable;
import com.kuaishou.android.model.mix.CollectPopup;
import yl8.b;
import com.kuaishou.android.model.mix.BottomComponentMaterial;

public class PhotoMeta extends ObservableAndSyncableContainer implements i, c, g	// class@000660
{
    public boolean activityLike;
    public boolean activityPressLike;
    public boolean isFromCache;
    public String mAcquaintanceDetailRelationText;
    public String mAcquaintanceFeedRelationText;
    public Map mAcquaintanceReplaceNames;
    public int mActionSurveyType;
    public ActivityUserIconModel mActivityUserIconMode;
    public boolean mAdjustBlackThreeVideo;
    public List mAdminTagsModels;
    public long mAiCutPhotoStyleId;
    public boolean mAllowSameFrame;
    public boolean mAlreadyConsumed;
    public boolean mAlreadyShowGodComment;
    public AnalysisEntranceModel mAnalysisEntranceModel;
    public int mAtMePhotoPrivacyStatus;
    public List mAtUserItems;
    public String mAtlasDetailTitle;
    public String mAtlasDetailTitleType;
    public BottomComponentMaterial mBottomComponentMaterial;
    public BottomEntryInfo mBottomEntryInfo;
    public int mCacheType;
    public boolean mCanShowQuickCommentGuide;
    public String mCaptionTitle;
    public CoCreateInfo mCoCreateInfo;
    public CoCreateInvitationInfo mCoCreateInvitationInfo;
    public long mCollectCount;
    public CollectFeedInfo mCollectFeedInfo;
    public CollectGuideInfo mCollectGuideInfo;
    public CollectPopup mCollectPopup;
    public CollectRevisitGuidance mCollectRevisitGuidance;
    public boolean mCollected;
    public String mCommentAtBubbleMessage;
    public int mCommentBubble;
    public int mCommentCount;
    public List mCommentDynamicTabsInfo;
    public boolean mCommentPhotoInfoSucceed;
    public boolean mCurrentLivingState;
    public int mDetailMorePhotosRecoType;
    public boolean mDisableLikeAnimations;
    public boolean mDisableShowExposedComment;
    public boolean mDisableTranscodeHiddenUserInfo;
    public boolean mDisallowShot;
    public String mDisclaimerMessage;
    public String mDisplayTime;
    public int mDownloadCount;
    public int mDownloadSetting;
    public EditInfo mEditInfo;
    public boolean mEnableClsGuide;
    public boolean mEnableCommentPhotoInfoRequest;
    public boolean mEnableCommentTabs;
    public boolean mEnableCoronaDetailPage;
    public boolean mEnableFullScreenPlay;
    public boolean mEnableLatestCommentTab;
    public boolean mEnableSpecialFocus;
    public boolean mEnableStrengthenEntrance;
    public boolean mEnableV4Head;
    public boolean mEnhanceCommentInputBox;
    public boolean mEnhanceDescAreaCollectButton;
    public List mExposeComments;
    public ExtEntryModel mExtEntryModel;
    public List mExtraComments;
    public PhotoMetaExtra mExtraIconInfo;
    public List mExtraLikers;
    public ExtendableModelMap mExtraMap;
    public long mExtraSaveProgressTime;
    public FansTopCommentTopBarInfo mFansTopCommentTopBarInfo;
    public String mFansTopGuideTips;
    public String mFansTopPurchaseText;
    public String mFansTopPurchaseUrl;
    public String mFansTopShareTips;
    public FashionShowInfo mFashionShowInfo;
    public int mFastCommentType;
    public int mFeatureSimilarPhotoStyle;
    public boolean mFeatureToFollowGuideShow;
    public SummaryViewModel mFeedBottomRightSummary;
    public FeedSwitchesInfo mFeedSwitches;
    public String mFeedbackDetailParams;
    public List mFeedbackEntryIds;
    public int mFilterAbnormalPhotoReason;
    public int mFilterStatus;
    public List mFollowLikers;
    public FollowShootModel mFollowShootModel;
    public int mFollowShootType;
    public int mForwardCount;
    public int mFrameStyle;
    public int mFriendsVisibility;
    public int mFromSourceType;
    public int mGeminiHotSurveyDisplayStrategy;
    public Map mGeminiLogParams;
    public List mGodCommentList;
    public boolean mHasAtlasText;
    public boolean mHasClicked;
    public boolean mHasGodCommentShow;
    public boolean mHasMagicFaceTag;
    public boolean mHasMusicTag;
    public boolean mHasShowedFollowFeedAvatarLivingBubble;
    public boolean mHasShowedRewardBubble;
    public boolean mHasSimilarPanelShowNoMoreTips;
    public boolean mHasSurvey;
    public int mHated;
    public ProgressHighLightInfo[] mHighLightPosInfo;
    public List mHotPageTagItems;
    public HotSpotInfo mHotSpotInfo;
    public HyperTag mHyperTag;
    public IMPhotoReplyConfigInfo mIMPhotoReplyConfigInfo;
    public boolean mInappropriate;
    public boolean mIntensifyShowing;
    public boolean mIntensifyTriggered;
    public InteractStickerInfo mInteractStickerInfo;
    public int mInteractStickerType;
    public InterestAdjustSnackBarInfo mInterestAdjustSnackBarInfo;
    public InterestManageSnackBarInfo mInterestManageSnackBarInfo;
    public boolean mIsCurrentPhotoDownloadingFromShare;
    public boolean mIsIntelligenceAlbum;
    public boolean mIsPauseStatus;
    public boolean mIsPending;
    public boolean mIsPhotoClick;
    public boolean mIsPhotoConsume;
    public boolean mIsPhotoCopyTop;
    public boolean mIsPhotoTop;
    public boolean mIsPlayFailed;
    public boolean mIsRecommendedPhotoPress;
    public boolean mIsRecommendedPopupShow;
    public boolean mIsRelationPhoto;
    public boolean mIsSearchCardRequestNetwork;
    public boolean mIsShareCountExp;
    public boolean mIsSubscribed;
    public boolean mIsUserStatus;
    public KaraokeChorusModel mKaraokeChorusModel;
    public KaraokeModel mKaraokeModel;
    public KaraokeScoreInfo mKaraokeScoreInfo;
    public List mKgTags;
    public KwaiCoinTaskInfo mKwaiCoinTaskInfo;
    public String mKwaiId;
    public KYInfo mKyInfo;
    public LabelFeatureEntry mLabelFeatureEntry;
    public Map mLikeContentMap;
    public int mLikeCount;
    public int mLiked;
    public LipsSyncModel mLipsSyncModel;
    public String mLiveRoomType;
    public LiveTipInfo mLiveTipInfo;
    public String mLocalVideoUrl;
    public MMUSimilarSearchInfo mMMUSimilarSearchInfo;
    public SimpleMagicFace mMagicFace;
    public List mMagicFaces;
    public boolean mManualHideSubscribeAuthor;
    public String mMessageGroupId;
    public String mMockFeedMagicFaceRecoId;
    public String mMockFeedMagicFaceRecoTaskId;
    public String mMockFeedPostAgainText;
    public String mMockFeedShareSubBiz;
    public int mMockFeedTarget;
    public String mMockFeedUploadSuccessText;
    public long mMoodTemplateId;
    public String mMovieTitle;
    public Music mMusic;
    public MusicStrategy mMusicStrategy;
    public MusicWheelInfo mMusicWheelInfo;
    public boolean mMyfollowShowTime;
    public boolean mNeedActionSurvey;
    public boolean mNeedEnhanceMagicFaceTag;
    public boolean mNeedShowGodComment;
    public boolean mNeedShowPlc;
    public boolean mNoNeedToRequestPlcEntryStyleInfo;
    public boolean mNotShowCollectAnim;
    public boolean mNotShowLikeAnim;
    public OperationBarInfo mOperationBarInfo;
    public OperationExpTagDisplayInfo mOperationExpTagDisplayInfo;
    public String mOriginalPhotoId;
    public int mOverallDetailSlideDifferent;
    public a mPhotoActionReportFetcher;
    public int mPhotoCommentLimitType;
    public PhotoCommentVoteInfo mPhotoCommentVoteInfo;
    public PhotoCommonTags mPhotoCommonTags;
    public PhotoDisplayLocationInfo mPhotoDisplayLocationInfo;
    public int mPhotoFollowingIntensify;
    public String mPhotoId;
    public PhotoJudgementStatusInfo mPhotoJudgementStatusInfo;
    public PhotoLiveRemindInfo mPhotoLiveRemindInfo;
    public PhotoRelationEntrance mPhotoRelationEntrance;
    public boolean mPhotoSkipCrop;
    public int mPhotoStatus;
    public PhotoTextLocationInfo mPhotoTextLocationInfo;
    public int mPlaybackLikeCount;
    public int mPlaybackViewCount;
    public HashSet mPlayerPanelUnsupportedType;
    public boolean mPlayingPhotoEnableSuspend;
    public int mPlayingPhotoMinSuspendHeight;
    public String mPlcEntryStyleData;
    public PlcEntryStyleInfo mPlcEntryStyleInfo;
    public boolean mPlcHighPriorityThanBottomEntry;
    public long mPlcResponseTime;
    public PostOperationEntranceInfo mPostOperationEntranceInfo;
    public PostShowInfo mPostShowInfo;
    public int mPostWorkInfoId;
    public PostStatus mPostWorkStatus;
    public boolean mPrefetch;
    public String mPrefetchReason;
    public QuestionnaireInfo mQuestionnaireInfo;
    public boolean mQuickCommentShownByDelay;
    public List mRecentViewers;
    public TagItem mRecoReasonTag;
    public int mRecoType;
    public String mRecommendHintText;
    public String mRecommendHintTextSourceId;
    public String mRecommendHintTextSourceType;
    public String mRecommendStripe;
    public int mRecreationSetting;
    public RecreationSettingInfo mRecreationSettingInfo;
    public RewardPhotoInfo mRewardPhotoInfo;
    public SameFrameInfo mSameFrameInfo;
    public SearchAiScriptInfo mSearchAiScriptInfo;
    public ActionSurveySubtypeActions mSelectionSurveyActions;
    public String mSelectionSurveyId;
    public int mShareCount;
    public ShareToFollowModel mShareToFollowModel;
    public boolean mShowCoCreateIcon;
    public long mShowCount;
    public boolean mShowFlowFeedback;
    public boolean mShowFriendInviteButton;
    public boolean mShowLikeCount;
    public boolean mShowLikeList;
    public String mShowPos;
    public int mSimilarPhotoStyle;
    public long mSnapShowDeadline;
    public HyperTag mSocialRelationHyperTag;
    public Music mSoundTrack;
    public String mSst;
    public boolean mStarci;
    public boolean mSubscribeNotification;
    public SummaryInfo mSummaryInfo;
    public List mSupportSurveyActionList;
    public int mSupportType;
    public int mSurveyBizType;
    public String mSurveyId;
    public String mSurveyInfoId;
    public SurveyMeta mSurveyMeta;
    public int mSurveyStyle;
    public int mTagHashType;
    public List mTagItems;
    public boolean mTagTop;
    public String mTime;
    public long mTimeStamp;
    public String mToolBoxButtonText;
    public boolean mTopPhoto;
    public String[] mTtlasOcrResult;
    public int mUsC;
    public int mUsD;
    public boolean mUseLive;
    public int mVideoColdStartType;
    public VideoQualityInfo mVideoQualityInfo;
    public int mViewCount;
    public int mViewerCount;
    public boolean mViewerEntrance;
    public VisibilityExpiration mVisibilityExpiration;
    public VisibleLevelInfo mVisibleLevel;
    public String ptp;
    public static final String INVOKER_ID = "PhotoMetaInvokerId";
    public static z sInterceptor;
    public static final long serialVersionUID;

    static {
       PhotoMeta.initInterceptor();
    }
    public void PhotoMeta(){
       super();
       this.mDownloadSetting = -1;
       this.mExtraComments = new ArrayList();
       this.mExposeComments = new ArrayList();
       this.mGodCommentList = new ArrayList();
       this.mCollectCount = -1;
       this.mExtraLikers = new ArrayList();
       this.mFollowLikers = new ArrayList();
       this.mRecreationSetting = -1;
       this.mFollowShootType = 0;
       this.mAtMePhotoPrivacyStatus = -1;
       this.mFilterStatus = 0;
       this.mMockFeedTarget = 0;
       this.mFrameStyle = 0;
       this.mPostWorkInfoId = -1;
       this.mHasShowedFollowFeedAvatarLivingBubble = false;
       this.mNeedShowPlc = false;
       this.mAdjustBlackThreeVideo = false;
       this.mHasSimilarPanelShowNoMoreTips = false;
       this.mIsCurrentPhotoDownloadingFromShare = false;
       this.mIntensifyTriggered = false;
       this.mIntensifyShowing = false;
       this.mExtraMap = new ExtendableModelMap();
       this.mAlreadyShowGodComment = false;
       this.mNeedShowGodComment = false;
       this.mEnableCommentPhotoInfoRequest = false;
       this.mCommentPhotoInfoSucceed = false;
       this.mAlreadyConsumed = false;
       this.mManualHideSubscribeAuthor = false;
    }
    public static void initInterceptor(){
       if (PatchProxy.applyVoid(null, null, PhotoMeta.class, "3")) {
          return;
       }
       a.c();
       return;
    }
    public static void setInterceptor(z p0){
       PhotoMeta.sInterceptor = p0;
    }
    public void f(String p0,Object p1){
       b.c(this, p0, p1);
    }
    public String getBizId(){
       return this.mPhotoId;
    }
    public int getCacheType(){
       return this.mCacheType;
    }
    public Object getExtra(String p0){
       return b.a(this, p0);
    }
    public ExtendableModelMap getExtraMap(){
       Object obj = PatchProxy.apply(null, this, PhotoMeta.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mExtraMap == null) {
          this.mExtraMap = new ExtendableModelMap();
       }
       return this.mExtraMap;
    }
    public SummaryViewModel getFeedBottomRightSummary(){
       return this.mFeedBottomRightSummary;
    }
    public String getImGroupId(){
       return this.mMessageGroupId;
    }
    public boolean getIsLiked(){
       Object obj = PatchProxy.apply(null, this, PhotoMeta.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.isLiked();
    }
    public KaraokeModel$KaraokeInfo getKaraokeInfo(){
       Object[] objArray = null;
       PhotoMeta obj = PatchProxy.apply(objArray, this, PhotoMeta.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mKaraokeModel;
       if (obj != null) {
          objArray = obj.getKaraokeInfo();
       }
       return objArray;
    }
    public int getLikeCount(){
       z obj = PatchProxy.apply(null, this, PhotoMeta.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = PhotoMeta.sInterceptor;
       if (obj != null) {
          Integer integer = obj.a(this);
          if (integer != null) {
             return integer.intValue();
          }
       }
       return this.mLikeCount;
    }
    public LiveTipInfo getLiveTipInfo(){
       return this.mLiveTipInfo;
    }
    public String getMockFeedShareSubBiz(){
       return this.mMockFeedShareSubBiz;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PhotoMeta.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new j();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, PhotoMeta.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(PhotoMeta.class, new j());
       }else {
          obj.put(PhotoMeta.class, null);
       }
       return obj;
    }
    public long getSnapShowDeadline(){
       return this.mSnapShowDeadline;
    }
    public boolean getTagTop(){
       return this.mTagTop;
    }
    public int getVisibleRelation(){
       return this.mFriendsVisibility;
    }
    public boolean hasGodCommentShow(){
       return this.mHasGodCommentShow;
    }
    public boolean isCollected(){
       return this.mCollected;
    }
    public boolean isDisallowShot(){
       return this.mDisallowShot;
    }
    public boolean isFollowTag(){
       PhotoMeta obj = PatchProxy.apply(null, this, PhotoMeta.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mRecoReasonTag;
       boolean b = (obj != null && !TextUtils.x(obj.mName))? true: false;
       return b;
    }
    public boolean isLiked(){
       z obj = PatchProxy.apply(null, this, PhotoMeta.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = PhotoMeta.sInterceptor;
       if (obj != null) {
          Boolean uBoolean = obj.b(this);
          if (uBoolean != null) {
             return uBoolean.booleanValue();
          }
       }
       boolean b = (this.mLiked > null)? true: false;
       return b;
    }
    public boolean isPending(){
       return this.mIsPending;
    }
    public boolean isPrefetch(){
       return this.mPrefetch;
    }
    public boolean isPublic(){
       boolean b = (this.mPhotoStatus == null)? true: false;
       return b;
    }
    public void putExtra(String p0,Object p1){
       b.b(this, p0, p1);
    }
    public Void setAtMePhotoPrivacyStatus(int p0){
       if (PatchProxy.isSupport(PhotoMeta.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, PhotoMeta.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mAtMePhotoPrivacyStatus = p0;
       this.notifyChanged();
       this.fireSync();
       return null;
    }
    public void setCollectPopup(CollectPopup p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoMeta.class, "14")) {
          return;
       }
       this.mCollectPopup = p0;
       this.notifyChanged();
       this.fireSync();
       return;
    }
    public Void setCollected(boolean p0){
       PhotoMeta obj;
       if (PatchProxy.isSupport(PhotoMeta.class)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, PhotoMeta.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.mCollectCount;
       if (obj - -1 && this.mCollected != p0) {
          long l = (p0)? obj + 1: obj - 1;
          this.mCollectCount = l;
       }
       this.mCollected = p0;
       this.notifyChanged();
       this.fireSync();
       return null;
    }
    public Void setCommentCount(int p0){
       if (PatchProxy.isSupport(PhotoMeta.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, PhotoMeta.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mCommentCount = p0;
       this.notifyChanged();
       this.fireSync();
       return null;
    }
    public Void setIsPending(boolean p0){
       if (PatchProxy.isSupport(PhotoMeta.class)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, PhotoMeta.class, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 == this.mIsPending) {
          return null;
       }else {
          this.mIsPending = p0;
          this.notifyChanged(this);
          this.fireSync();
          return null;
       }
    }
    public Void setLikeCount(int p0){
       if (PatchProxy.isSupport(PhotoMeta.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, PhotoMeta.class, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mLikeCount = p0;
       this.notifyChanged();
       return null;
    }
    public void setMockFeedShareSubBiz(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoMeta.class, "1")) {
          return;
       }
       this.mMockFeedShareSubBiz = p0;
       this.notifyChanged();
       this.fireSync();
       return;
    }
    public Void setShareCount(int p0){
       if (PatchProxy.isSupport(PhotoMeta.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, PhotoMeta.class, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.mShareCount = p0;
       this.notifyChanged();
       this.fireSync();
       return null;
    }
    public boolean shouldShowBottomComponentView(){
       PhotoMeta obj = PatchProxy.apply(null, this, PhotoMeta.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mBottomComponentMaterial;
       boolean b = (obj != null && obj.getMaterialType())? true: false;
       return b;
    }
    public void sync(PhotoMeta p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoMeta.class, "15")) {
          return;
       }
       this.mPhotoStatus = p0.mPhotoStatus;
       this.mFriendsVisibility = p0.mFriendsVisibility;
       this.mVisibilityExpiration = p0.mVisibilityExpiration;
       this.mLiked = p0.mLiked;
       this.mExtraLikers = p0.mExtraLikers;
       this.mCommentCount = p0.mCommentCount;
       this.mLikeCount = p0.mLikeCount;
       this.mPlaybackLikeCount = p0.mPlaybackLikeCount;
       this.mDisplayTime = p0.mDisplayTime;
       this.mTagItems = p0.mTagItems;
       this.mAtUserItems = p0.mAtUserItems;
       this.mViewCount = p0.mViewCount;
       this.mShareCount = p0.mShareCount;
       this.mSoundTrack = p0.mSoundTrack;
       this.mIsPending = p0.mIsPending;
       this.mFollowShootModel = p0.mFollowShootModel;
       this.mKaraokeModel = p0.mKaraokeModel;
       this.mMockFeedShareSubBiz = p0.mMockFeedShareSubBiz;
       this.mKaraokeChorusModel = p0.mKaraokeChorusModel;
       this.mMessageGroupId = p0.mMessageGroupId;
       this.mMusic = p0.mMusic;
       this.mCollected = p0.mCollected;
       this.mCollectCount = p0.mCollectCount;
       this.mDownloadSetting = p0.mDownloadSetting;
       this.mPhotoCommentLimitType = p0.mPhotoCommentLimitType;
       this.mRewardPhotoInfo = p0.mRewardPhotoInfo;
       this.mHasShowedRewardBubble = p0.mHasShowedRewardBubble;
       this.mDisallowShot = p0.mDisallowShot;
       this.mCollectPopup = p0.mCollectPopup;
       this.mViewerCount = p0.mViewerCount;
       PhotoMeta mHyperTag = p0.mHyperTag;
       if (mHyperTag != null) {
          this.mHyperTag = mHyperTag;
       }
       if (this.mPhotoCommentVoteInfo != null) {
          mHyperTag = p0.mPhotoCommentVoteInfo;
          if (mHyperTag != null) {
             this.mPhotoCommentVoteInfo = mHyperTag;
          }
       }
       this.syncDownloadInfo(p0);
       this.notifyChanged();
       return;
    }
    public void sync(b p0){
       this.sync(p0);
    }
    public final void syncDownloadInfo(PhotoMeta p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoMeta.class, "16")) {
          return;
       }
       PhotoMeta mExtraMap = p0.mExtraMap;
       if (mExtraMap != null && mExtraMap.getExtra("downloadInfo") != null) {
          this.mExtraMap.putParcelableExtra("downloadInfo", p0.mExtraMap.getExtra("downloadInfo"));
       }
       return;
    }
    public void updateWithServer(PhotoMeta p0){
       this.mNoNeedToRequestPlcEntryStyleInfo = p0.mNoNeedToRequestPlcEntryStyleInfo;
       this.mPlcEntryStyleInfo = p0.mPlcEntryStyleInfo;
       this.mPlcEntryStyleData = p0.mPlcEntryStyleData;
       this.mMagicFaces = p0.mMagicFaces;
       this.mMagicFace = p0.mMagicFace;
       this.mHasMagicFaceTag = p0.mHasMagicFaceTag;
       this.mMusic = p0.mMusic;
       this.mHasMusicTag = p0.mHasMusicTag;
       this.mSoundTrack = p0.mSoundTrack;
       this.mEditInfo = p0.mEditInfo;
       this.mDisableTranscodeHiddenUserInfo = p0.mDisableTranscodeHiddenUserInfo;
       p0 = p0.mHyperTag;
       if (p0 != null) {
          this.mHyperTag = p0;
       }
       return;
    }
    public void updateWithServer(Object p0){
       this.updateWithServer(p0);
    }
}
