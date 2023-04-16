package com.yxcorp.gifshow.upload.UploadInfo;
import java.lang.Cloneable;
import java.io.Serializable;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo;
import java.lang.Object;
import on5.b;
import java.lang.String;
import com.yxcorp.gifshow.upload.UploadRequest;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.edit.draft.model.DraftEditException;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.kwai.feature.post.api.feature.story.model.PhotoVisibility;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo$Status;
import com.kuaishou.android.model.music.Music;
import java.util.List;
import haa.f;
import java.lang.StringBuilder;
import java.io.File;
import q87.c;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import com.yxcorp.gifshow.upload.StoryUploadParam;
import n1b.b;
import lnc.p3;
import tkd.b;
import tkd.d;
import f0c.t;
import com.kuaishou.edit.draft.Workspace;
import com.kwai.feature.post.api.feature.encode.model.AtlasInfo;
import com.yxcorp.gifshow.plugin.impl.record.KtvInfo;
import java.lang.System;
import java.lang.Math;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo$UploadSource;
import com.yxcorp.gifshow.upload.SameFrameShareConfig;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadRequest$UploadPostType;
import com.kwai.kcube.TabIdentifier;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.upload.RickonWholeUploadInfo;
import java.lang.Number;
import java.util.HashSet;
import f36.a;
import java.util.Iterator;
import com.yxcorp.retrofit.model.KwaiException;
import java.lang.Boolean;
import java.util.ArrayList;
import com.kuaishou.edit.draft.Publish;
import com.kuaishou.edit.draft.CaptionTopic;
import com.kuaishou.edit.draft.CaptionTopic$TopicType;
import com.kuaishou.android.model.mix.PhotoKgTag;
import um6.a;
import qr4.i;
import qr4.m$k0;
import dnc.v0;
import java.util.Map;
import com.kuaishou.android.model.mix.SameFrameInfo;
import com.kuaishou.edit.draft.Workspace$Source;
import com.kwai.feature.post.api.feature.tuna.UpdateShareBusinessLinkModel;
import com.yxcorp.gifshow.plugin.impl.SharePlugin.KwaiOp;
import com.kwai.feature.post.api.feature.upload.model.UploadResult;
import z30.n0;
import z30.o0;
import h69.j;
import com.kuaishou.edit.draft.Workspace$Type;
import java.util.Collection;

public class UploadInfo implements Cloneable, Serializable, IUploadInfo	// class@001e58
{
    public String b;
    public boolean c;
    public AtlasInfo mAtlasInfo;
    public a mAtlasUploadSource;
    public String mAuthorName;
    public String mCaption;
    public boolean mCaptionPasted;
    public String mCaptionTitle;
    public String mConfigFilePath;
    public String mConfigUrl;
    public File mCoverFile;
    public int mCoverHeight;
    public String mCoverKey;
    public long mCoverKeyExpireTime;
    public String mCoverUrl;
    public int mCoverWidth;
    public Size mCroppedCoverSize;
    public String mCustomizedMagicFilePath;
    public boolean mDisableFd;
    public boolean mDisableNearbyShow;
    public boolean mDisallowRecreation;
    public PublishSubject mEditCoverUploadedSubject;
    public long mEncodeConfigId;
    public String mEncodedFileCrc;
    public String mFaceFilePath;
    public String mFaceUrl;
    public int mFallbackCount;
    public String mFilePath;
    public String[] mForwardTokens;
    public String mGoldCoinTaskId;
    public boolean mHasTriedToShowPublishedGuide;
    public boolean mHaveMerchantBusinessPlc;
    public final String mId;
    public List mInteractStickerInfo;
    public boolean mIsBenefitTask;
    public boolean mIsEnablePipelineUpload;
    public boolean mIsGoldTask;
    public boolean mIsHidden;
    public boolean mIsLiveCover;
    public boolean mIsLongVideo;
    public boolean mIsPipelineFailedThenFallback;
    public final boolean mIsPipelineSegmentUpload;
    public boolean mIsTmpDisablePublishedToast;
    public boolean mIsTopic;
    public boolean mIsTranscodeDegrade;
    public KtvInfo mKtvInfo;
    public b mLiveAvatarInfo;
    public String mLocalSharePlatform;
    public long mLocationId;
    public List mMagicEmoji;
    public boolean mMagicEmojiTag;
    public String mMagicFaceRecoId;
    public String mMagicFaceSwitch;
    public String mMerchantInfo;
    public String mMessageGroupId;
    public int mMockFeedOption;
    public boolean mMockSuccess;
    public Music mMusic;
    public String mMusicSwitch;
    public boolean mNoSysNotification;
    public File mOriginCoverFile;
    public String mOriginCoverKey;
    public long mOriginCoverKeyExpireTime;
    public String mPartKey;
    public boolean mPhotoDownloadDeny;
    public String mPhotoMeta;
    public String mPipelineKey;
    public v0 mPipelineStatsParams;
    public String mPostAgainText;
    public float mProgress;
    public String mPrompt;
    public String mPublicPostedToast;
    public long mPublishClickTime;
    public long mPublishToastDelay;
    public String mPublishToastIconUrl;
    public String mPublishToastMainText;
    public Map mPublishedGuideCfgMap;
    public v1 mRandomCoinParams;
    public int mRecoGender;
    public String mResumeKey;
    public int mRetryTimes;
    public SameFrameShareConfig mSameFrameShareConfig;
    public boolean mSegmentUploadEnabled;
    public boolean mSegmentUploadFirst;
    public int mSegmentUploadTryCount;
    public boolean mSegmentedUpload;
    public final String mSessionId;
    public String mShareAppPackage;
    public UpdateShareBusinessLinkModel mShareBusinessLinkModel;
    public KwaiOp mShareOption;
    public boolean mShareSoundTrack;
    public boolean mShowFlowFeedback;
    public IUploadInfo$UploadSource mSource;
    public IUploadInfo$Status mStatus;
    public StoryUploadParam mStoryUploadParam;
    public int mStreamPauseTime;
    public String mTagSourceCollection;
    public String mTaskScene;
    public int mTaskType;
    public Throwable mThrowable;
    public boolean mTriggerByEncode;
    public String mUploadFileCrc;
    public int mUploadMode;
    public Map mUploadParams;
    public IUploadRequest$UploadPostType mUploadPostType;
    public int mUploadRestrict;
    public UploadResult mUploadResult;
    public long mUploadStartTime;
    public String mUploadSuccessTipText;
    public int mUploadTimeRemained;
    public boolean mUseFakeUploader;
    public JsonArray mUsedPostFeatures;
    public String mUserId;
    public VideoContext mVideoContext;
    public long mVideoDuration;
    public int mVideoHeight;
    public String mVideoUrl;
    public int mVideoWidth;
    public PhotoVisibility mVisibility;
    public int mWholeUploadTryCount;
    public Workspace mWorkspace;
    public String mWorkspaceId;
    public String mWorkspacePath;
    public String mZipUuid;
    public TabIdentifier mockFeedUploadTarget;
    public static final long serialVersionUID = 0xf096cdfa33a477ad;

    public void UploadInfo(UploadInfo p0){
       super();
       this.mProgress = 0;
       this.mUploadMode = 1;
       this.mStreamPauseTime = 0;
       this.mockFeedUploadTarget = b.c;
       this.mIsEnablePipelineUpload = false;
       this.mIsPipelineFailedThenFallback = false;
       this.mUploadRestrict = 0;
       this.mIsBenefitTask = false;
       this.mIsTmpDisablePublishedToast = false;
       this.mHasTriedToShowPublishedGuide = false;
       this.mTaskScene = "UNKNOWN";
       this.mTaskType = Integer.MIN_VALUE;
       this.mPublishToastMainText = null;
       this.mPublishToastIconUrl = null;
       this.mUseFakeUploader = false;
       this.mHaveMerchantBusinessPlc = false;
       this.mId = p0.mId;
       this.mSessionId = p0.mSessionId;
       this.mPipelineStatsParams = p0.mPipelineStatsParams;
       this.mCoverKey = p0.mCoverKey;
       this.mCoverKeyExpireTime = p0.mCoverKeyExpireTime;
       this.mOriginCoverKey = p0.mOriginCoverKey;
       this.mOriginCoverKeyExpireTime = p0.mOriginCoverKeyExpireTime;
       this.mIsPipelineSegmentUpload = p0.isPipelineSegmentUpload();
       this.mStatus = p0.mStatus;
       this.mUploadStartTime = p0.mUploadStartTime;
       this.mDisableFd = p0.mDisableFd;
       this.mPipelineKey = p0.getPipelineKey();
       this.mProgress = p0.mProgress;
       this.updateUploadInfo(p0);
    }
    public void UploadInfo(UploadRequest p0){
       Object[] objArray1;
       super();
       this.mProgress = 0;
       this.mUploadMode = 1;
       int i = 0;
       this.mStreamPauseTime = i;
       this.mockFeedUploadTarget = b.c;
       this.mIsEnablePipelineUpload = i;
       this.mIsPipelineFailedThenFallback = i;
       this.mUploadRestrict = i;
       this.mIsBenefitTask = i;
       this.mIsTmpDisablePublishedToast = i;
       this.mHasTriedToShowPublishedGuide = i;
       this.mTaskScene = "UNKNOWN";
       this.mTaskType = Integer.MIN_VALUE;
       String str = null;
       this.mPublishToastMainText = str;
       this.mPublishToastIconUrl = str;
       this.mUseFakeUploader = i;
       this.mHaveMerchantBusinessPlc = i;
       this.mCaption = p0.getCaption();
       this.mCaptionPasted = p0.isCaptionPasted();
       this.mPrompt = p0.getPrompt();
       this.mForwardTokens = p0.getForwardTokens();
       String filePath = p0.getFilePath();
       this.mFilePath = filePath;
       if (TextUtils.x(filePath)) {
          ExceptionHandler.handleCaughtException(new DraftEditException("IUploadInfo empty file path"));
       }
       this.mLocalSharePlatform = p0.getLocalSharePlatform();
       this.mVisibility = p0.getVisibility();
       this.mUserId = p0.getUserId();
       this.mLocationId = p0.getLocationId();
       this.mMagicFaceSwitch = p0.getMagicFaceSwitch();
       this.mEncodedFileCrc = p0.getEncodedFileCrc();
       this.mMusicSwitch = p0.getMusicSwitch();
       this.mIsTopic = p0.isTopic();
       this.mStatus = IUploadInfo$Status.PENDING;
       this.mMusic = p0.getMusic();
       this.mMagicEmoji = p0.getMagicEmoji();
       this.mAuthorName = p0.getAuthorName();
       this.mMagicEmojiTag = p0.isMagicEmojiTag();
       this.mEncodeConfigId = p0.getEncodeConfigId();
       this.mIsLiveCover = p0.isLiveCover();
       this.mShareAppPackage = p0.getShareAppPackage();
       this.b = p0.getSharePubInfo();
       this.mPublishClickTime = p0.getPublishClickTime();
       this.mSessionId = p0.mSessionId;
       Object[] objArray = new Object[i];
       String str1 = "UploadInfo";
       f.D().w(str1, "build uploadInfo: setCoverFile: "+p0.getCoverFile(), objArray);
       this.mCoverFile = p0.getCoverFile();
       this.mOriginCoverFile = p0.getOriginCoverFile();
       this.mCroppedCoverSize = p0.getCroppedCoverSize();
       this.mStoryUploadParam = p0.getStoryUploadParam();
       this.mLiveAvatarInfo = p0.getLiveAvatarInfo();
       if (p0.mAtlasInfo != null) {
          objArray1 = new Object[i];
          p3.D().w(str1, "generate mAtlasInfo by upload request", objArray1);
          this.mAtlasInfo = p0.mAtlasInfo;
       }else if(p0.mWorkspace != null && p0.mWorkspaceDirectory != null){
          objArray1 = new Object[i];
          p3.D().w(str1, "generate mAtlasInfo by PostWorkInternalPlugin", objArray1);
          this.mAtlasInfo = d.a(-273232199).xr(p0.mWorkspace, p0.mWorkspaceDirectory);
       }
       UploadInfo tmAtlasInfo = this.mAtlasInfo;
       if (tmAtlasInfo != null) {
          UploadInfo tmCoverFile = this.mCoverFile;
          if (tmCoverFile != null) {
             tmAtlasInfo.setCoverFilePath(tmCoverFile.getAbsolutePath());
          }
       }
       UploadRequest mWorkspaceDi = p0.mWorkspaceDirectory;
       String absolutePath = (mWorkspaceDi != null)? mWorkspaceDi.getAbsolutePath(): str;
       this.mWorkspacePath = absolutePath;
       mWorkspaceDi = p0.mWorkspace;
       if (mWorkspaceDi != null) {
          str = mWorkspaceDi.getIdentifier();
       }
       this.mWorkspaceId = str;
       mWorkspaceDi = p0.mKtvInfo;
       if (mWorkspaceDi != null) {
          this.mKtvInfo = mWorkspaceDi.clone();
       }
       this.mDisableNearbyShow = p0.disableShowNearby();
       this.mPhotoDownloadDeny = p0.photoDownloadDeny();
       this.mDisallowRecreation = p0.isDisallowRecreation();
       this.mRecoGender = p0.getRecoGender();
       this.mMockSuccess = p0.mMockSuccess;
       this.mMerchantInfo = p0.mMerchantInfo;
       this.mId = (System.currentTimeMillis() + (long)(int)(Math.random() * 100.00f))+"-"+this.mUserId;
       this.mRetryTimes = p0.getRetryTimes();
       this.mCoverWidth = p0.getCoverWidth();
       this.mCoverHeight = p0.getCoverHeight();
       this.mVideoHeight = p0.getVideoHeight();
       this.mVideoWidth = p0.getVideoWidth();
       this.mFaceFilePath = p0.getFaceFilePath();
       this.mConfigFilePath = p0.getConfigFilePath();
       this.mIsHidden = p0.isHidden();
       this.mTriggerByEncode = p0.triggerByEncode();
       this.mShareSoundTrack = p0.getShareSoundTrack();
       this.mIsLongVideo = p0.isLongVideo();
       this.mMessageGroupId = p0.getMessageGroupId();
       this.mVideoContext = p0.getVideoContext();
       this.mSource = p0.getSource();
       this.mSameFrameShareConfig = p0.getSameFrameShareConfig();
       this.mUploadPostType = p0.getUploadPostType();
       this.mIsEnablePipelineUpload = p0.isEnablePipelineUpload();
       this.mVideoDuration = p0.getVideoDuration();
       this.mInteractStickerInfo = p0.getInteractStickerInfo();
       this.mUploadMode = p0.getUploadMode();
       this.mIsPipelineSegmentUpload = p0.isEnablePipelineSegmentUpload();
       this.mMockFeedOption = p0.mMockFeedOption;
       this.mNoSysNotification = p0.mNoSysNotification;
       this.mUploadRestrict = p0.mUploadRestrict;
       this.mZipUuid = p0.mZipUuid;
       this.mGoldCoinTaskId = p0.mGoldCoinTaskId;
       this.mPublicPostedToast = p0.mPublicPostedToast;
       this.mUploadSuccessTipText = p0.mUploadSuccessTipText;
       this.mPostAgainText = p0.mPostAgainText;
       this.mMagicFaceRecoId = p0.mMagicFaceRecoId;
       this.mIsBenefitTask = p0.mIsBenefitTask;
       this.mIsGoldTask = p0.mIsGoldTask;
       this.mPublishToastMainText = p0.mPublishToastMainText;
       this.mPublishToastIconUrl = p0.mPublishToastIconUrl;
       this.mPublishToastDelay = p0.mPublishToastDelay;
       this.mRandomCoinParams = p0.mRandomCoinParams;
       this.mUsedPostFeatures = p0.mUsedPostFeatures;
       this.mShareOption = p0.mShareOption;
       this.mWorkspace = p0.mWorkspace;
       this.mShowFlowFeedback = p0.isShowFlowFeedback();
       this.mockFeedUploadTarget = p0.getMockFeedUploadTarget();
       this.mCaptionTitle = p0.getCaptionTitle();
       this.mUseFakeUploader = p0.isUseFakeUploader();
       this.mHaveMerchantBusinessPlc = p0.mHaveMerchantBusinessPlc;
       this.mCustomizedMagicFilePath = p0.mCustomizedMagicFilePath;
       this.mTagSourceCollection = p0.mTagSourceCollection;
       return;
    }
    public static UploadInfo generateUploadInfo(UploadRequest p0){
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, UploadInfo.class, "1");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 == null) {
          return obj;
       }
       if (p0.mUploadRestrict == 1) {
          return new RickonWholeUploadInfo(p0);
       }
       return new UploadInfo(p0);
    }
    public long computeUploadFileSize(){
       HashSet obj = PatchProxy.apply(null, this, UploadInfo.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = new HashSet();
       UploadInfo tmAtlasUploa = this.mAtlasUploadSource;
       if (tmAtlasUploa != null) {
          return tmAtlasUploa.f();
       }
       if (!TextUtils.x(this.getFilePath())) {
          obj.add(this.getFilePath());
       }
       if (!this.isStory() && this.getCoverFile() != null) {
          obj.add(this.getCoverFile().getAbsolutePath());
       }
       long l = 0;
       Iterator iterator = obj.iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          if (!TextUtils.x(str)) {
             File uFile = new File(str);
             if (uFile.exists() && uFile.isFile()) {
                l = l + uFile.length();
             }
          }
       }
       return l;
    }
    public boolean disableShowNearby(){
       return this.mDisableNearbyShow;
    }
    public AtlasInfo getAtlasInfo(){
       return this.mAtlasInfo;
    }
    public a getAtlasUploadSource(){
       return this.mAtlasUploadSource;
    }
    public String getAuthorName(){
       return this.mAuthorName;
    }
    public String getCaption(){
       return this.mCaption;
    }
    public String getCaptionTitle(){
       return this.mCaptionTitle;
    }
    public String getConfigFilePath(){
       return this.mConfigFilePath;
    }
    public String getConfigUrl(){
       return this.mConfigUrl;
    }
    public File getCoverFile(){
       return this.mCoverFile;
    }
    public int getCoverHeight(){
       return this.mCoverHeight;
    }
    public String getCoverKey(){
       return this.mCoverKey;
    }
    public long getCoverKeyExpireTime(){
       return this.mCoverKeyExpireTime;
    }
    public String getCoverUrl(){
       return this.mCoverUrl;
    }
    public int getCoverWidth(){
       return this.mCoverWidth;
    }
    public Size getCroppedCoverSize(){
       return this.mCroppedCoverSize;
    }
    public String getCustomizedMagicFilePath(){
       return this.mCustomizedMagicFilePath;
    }
    public long getEncodeConfigId(){
       return this.mEncodeConfigId;
    }
    public String getEncodedFileCrc(){
       return this.mEncodedFileCrc;
    }
    public int getErrorCode(){
       Object obj = PatchProxy.apply(null, this, UploadInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int errorCode = (this.getThrowable() instanceof KwaiException)? this.getThrowable().getErrorCode(): -1000;
       return errorCode;
    }
    public String getErrorMessage(){
       String str;
       KwaiException obj = PatchProxy.apply(null, this, UploadInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.getThrowable() instanceof KwaiException)? this.getThrowable().mErrorMessage: "";
       return obj;
    }
    public String getFaceFilePath(){
       return this.mFaceFilePath;
    }
    public String getFaceUrl(){
       return this.mFaceUrl;
    }
    public String getFilePath(){
       return this.mFilePath;
    }
    public String[] getForwardTokens(){
       return this.mForwardTokens;
    }
    public String getId(){
       return this.mId;
    }
    public List getInteractStickerInfos(){
       return this.mInteractStickerInfo;
    }
    public Boolean getIsBenefitTask(){
       Object obj = PatchProxy.apply(null, this, UploadInfo.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Boolean.valueOf(this.mIsBenefitTask);
    }
    public List getKgTags(){
       Object[] objArray = null;
       ArrayList obj = PatchProxy.apply(objArray, this, UploadInfo.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mWorkspace == null) {
          return objArray;
       }
       obj = new ArrayList();
       Iterator iterator = this.mWorkspace.getPublish().getCaptionTopicList().iterator();
       while (iterator.hasNext()) {
          CaptionTopic uCaptionTopi = iterator.next();
          if (uCaptionTopi.getTopicType() != CaptionTopic$TopicType.FILM_CARD) {
             continue ;
          }else {
             PhotoKgTag photoKgTag = new PhotoKgTag();
             photoKgTag.mName = uCaptionTopi.getTopicName();
             photoKgTag.mId = uCaptionTopi.getTopicId();
             photoKgTag.mKgId = uCaptionTopi.getExtraInfo();
             obj.add(photoKgTag);
          }
       }
       return obj;
    }
    public KtvInfo getKtvInfo(){
       return this.mKtvInfo;
    }
    public a getKtvInfo(){
       return this.getKtvInfo();
    }
    public b getLiveAvatarInfo(){
       return this.mLiveAvatarInfo;
    }
    public String getLocalSharePlatform(){
       return this.mLocalSharePlatform;
    }
    public long getLocationId(){
       return this.mLocationId;
    }
    public List getMagicEmoji(){
       return this.mMagicEmoji;
    }
    public String getMagicFaceSwitch(){
       return this.mMagicFaceSwitch;
    }
    public String getMessageGroupId(){
       return this.mMessageGroupId;
    }
    public String getMockFeedMagicFaceRecoId(){
       return this.mMagicFaceRecoId;
    }
    public int getMockFeedOption(){
       return this.mMockFeedOption;
    }
    public TabIdentifier getMockFeedUploadTarget(){
       return this.mockFeedUploadTarget;
    }
    public Music getMusic(){
       return this.mMusic;
    }
    public String getMusicSwitch(){
       return this.mMusicSwitch;
    }
    public File getOriginCoverFile(){
       return this.mOriginCoverFile;
    }
    public String getOriginCoverKey(){
       return this.mOriginCoverKey;
    }
    public long getOriginCoverKeyExpireTime(){
       return this.mOriginCoverKeyExpireTime;
    }
    public String getPartKey(){
       return this.mPartKey;
    }
    public i getPhotoMeta(){
       UploadInfo obj = PatchProxy.apply(null, this, UploadInfo.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mVideoContext;
       if (obj == null) {
          return null;
       }
       return obj.F();
    }
    public String getPhotoMetaActivityIdJson(){
       UploadInfo obj = PatchProxy.apply(null, this, UploadInfo.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mVideoContext;
       if (obj != null && (obj.F() != null && (this.mVideoContext.F().b == null || this.mVideoContext.F().b.x == null))) {
          return "";
       }
       return this.mVideoContext.F().b.x;
    }
    public String getPipelineKey(){
       return this.mPipelineKey;
    }
    public v0 getPipelineStatsParams(){
       return this.mPipelineStatsParams;
    }
    public String getPostAgainTipText(){
       return this.mPostAgainText;
    }
    public float getProgress(){
       return this.mProgress;
    }
    public Object getPrompt(){
       return this.getPrompt();
    }
    public String getPrompt(){
       return this.mPrompt;
    }
    public long getPublishClickTime(){
       return this.mPublishClickTime;
    }
    public Map getPublishedGuideTaskInfoMap(){
       return this.mPublishedGuideCfgMap;
    }
    public int getRecoGender(){
       return this.mRecoGender;
    }
    public int getRetryTimes(){
       return this.mRetryTimes;
    }
    public SameFrameInfo getSameFrameInfo(){
       Object[] objArray = null;
       UploadInfo obj = PatchProxy.apply(objArray, this, UploadInfo.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mWorkspace;
       if (obj == null || obj.getSource() != Workspace$Source.SAME_FRAME) {
          return objArray;
       }
       if (this.mSameFrameShareConfig == null) {
          return objArray;
       }
       SameFrameInfo sameFrameInf = new SameFrameInfo();
       sameFrameInf.mShowSameFrameCurrentTag = true;
       UploadInfo tmSameFrameS = this.mSameFrameShareConfig;
       sameFrameInf.mUserName = tmSameFrameS.mOriginSameFrameUserName;
       sameFrameInf.mOriginPhotoId = tmSameFrameS.mOriginSameFramePhotoId;
       return sameFrameInf;
    }
    public SameFrameShareConfig getSameFrameShareConfig(){
       return this.mSameFrameShareConfig;
    }
    public String getSessionId(){
       return this.mSessionId;
    }
    public String getShareAppPackage(){
       return this.mShareAppPackage;
    }
    public UpdateShareBusinessLinkModel getShareBusinessLinkModel(){
       return this.mShareBusinessLinkModel;
    }
    public KwaiOp getShareOption(){
       return this.mShareOption;
    }
    public String getSharePubInfo(){
       return this.b;
    }
    public boolean getShareSoundTrack(){
       return this.mShareSoundTrack;
    }
    public IUploadInfo$UploadSource getSource(){
       return this.mSource;
    }
    public IUploadInfo$Status getStatus(){
       return this.mStatus;
    }
    public String getTaskIdFromPhotoMeta(){
       UploadInfo obj = PatchProxy.apply(null, this, UploadInfo.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mVideoContext;
       if (obj != null && (obj.F() != null && (this.mVideoContext.F().b == null || this.mVideoContext.F().b.n == null))) {
          return "";
       }
       return this.mVideoContext.F().b.n;
    }
    public String getTaskScene(){
       return this.mTaskScene;
    }
    public int getTaskType(){
       return this.mTaskType;
    }
    public Throwable getThrowable(){
       return this.mThrowable;
    }
    public String getUploadFileCrc(){
       return this.mUploadFileCrc;
    }
    public int getUploadMode(){
       return this.mUploadMode;
    }
    public IUploadRequest$UploadPostType getUploadPostType(){
       return this.mUploadPostType;
    }
    public int getUploadRemainingTime(){
       return this.mUploadTimeRemained;
    }
    public int getUploadRestrict(){
       return this.mUploadRestrict;
    }
    public UploadResult getUploadResult(){
       return this.mUploadResult;
    }
    public String getUploadSuccessTipText(){
       return this.mUploadSuccessTipText;
    }
    public String getUserId(){
       return this.mUserId;
    }
    public String getValidCoverKey(){
       Object obj = PatchProxy.apply(null, this, UploadInfo.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       long l = System.currentTimeMillis() / 1000;
       UploadInfo tmCoverKeyEx = this.mCoverKeyExpireTime;
       if (l - tmCoverKeyEx > 0 && (l - tmCoverKeyEx) - 7140 < 0) {
          return this.mCoverKey;
       }
       return null;
    }
    public VideoContext getVideoContext(){
       return this.mVideoContext;
    }
    public long getVideoDuration(){
       return this.mVideoDuration;
    }
    public int getVideoHeight(){
       return this.mVideoHeight;
    }
    public String getVideoUrl(){
       return this.mVideoUrl;
    }
    public int getVideoWidth(){
       return this.mVideoWidth;
    }
    public PhotoVisibility getVisibility(){
       return this.mVisibility;
    }
    public n0 getWorkSpace(){
       Object obj = PatchProxy.apply(null, this, UploadInfo.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return o0.b(this.mWorkspace);
    }
    public String getWorkspaceId(){
       return this.mWorkspaceId;
    }
    public String getWorkspacePath(){
       return this.mWorkspacePath;
    }
    public boolean haveMerchantBusinessPlc(){
       return this.mHaveMerchantBusinessPlc;
    }
    public boolean isAnnualAlbum(){
       UploadInfo obj = PatchProxy.apply(null, this, UploadInfo.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mWorkspace;
       boolean b = (obj != null && j.i(obj))? true: false;
       return b;
    }
    public boolean isCaptionPasted(){
       return this.mCaptionPasted;
    }
    public boolean isDisableFd(){
       return this.mDisableFd;
    }
    public boolean isDisallowRecreation(){
       return this.mDisallowRecreation;
    }
    public boolean isEnablePipelineUpload(){
       return this.mIsEnablePipelineUpload;
    }
    public boolean isEnd(){
       boolean b = (this.mStatus != IUploadInfo$Status.COMPLETE && (this.mStatus == IUploadInfo$Status.FAILED || this.mStatus == IUploadInfo$Status.CANCELED))? true: false;
       return b;
    }
    public boolean isHidden(){
       return this.mIsHidden;
    }
    public boolean isKtvMultiPicSong(){
       UploadInfo obj = PatchProxy.apply(null, this, UploadInfo.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mWorkspace;
       boolean b = true;
       if (obj == null || (obj.getType() != Workspace$Type.KTV_SONG || this.mWorkspace.getAssetsCount() <= b)) {
          b = false;
       }
       return b;
    }
    public boolean isKtvSinglePicSong(){
       UploadInfo obj = PatchProxy.apply(null, this, UploadInfo.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mWorkspace;
       boolean b = true;
       if (obj == null || (obj.getType() != Workspace$Type.KTV_SONG || this.mWorkspace.getAssetsCount() != b)) {
          b = false;
       }
       return b;
    }
    public boolean isKuaiShan(){
       UploadInfo obj = PatchProxy.apply(null, this, UploadInfo.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mWorkspace;
       boolean b = (obj != null && obj.getType() == Workspace$Type.KUAISHAN)? true: false;
       return b;
    }
    public boolean isLiveCover(){
       return this.mIsLiveCover;
    }
    public boolean isLongVideo(){
       return this.mIsLongVideo;
    }
    public boolean isMagicEmojiTag(){
       return this.mMagicEmojiTag;
    }
    public boolean isNeedFallback(){
       Object obj = PatchProxy.apply(null, this, UploadInfo.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.getThrowable() != null && (!this.getThrowable() instanceof KwaiException && this.isEnablePipelineUpload()))? true: false;
       return b;
    }
    public boolean isNoSysNotification(){
       return this.mNoSysNotification;
    }
    public boolean isPhotoMovie(){
       UploadInfo obj = PatchProxy.apply(null, this, UploadInfo.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mWorkspace;
       boolean b = (obj != null && obj.getType() == Workspace$Type.PHOTO_MOVIE)? true: false;
       return b;
    }
    public boolean isPipelineFailedThenFallback(){
       return this.mIsPipelineFailedThenFallback;
    }
    public boolean isPipelineSegmentUpload(){
       return this.mIsPipelineSegmentUpload;
    }
    public boolean isRequestedEndAction(){
       return this.c;
    }
    public boolean isSegmentedUpload(){
       return this.mSegmentedUpload;
    }
    public boolean isShowFlowFeedback(){
       return this.mShowFlowFeedback;
    }
    public boolean isSinglePicture(){
       UploadInfo obj = PatchProxy.apply(null, this, UploadInfo.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mWorkspace;
       boolean b = (obj != null && obj.getType() == Workspace$Type.SINGLE_PICTURE)? true: false;
       return b;
    }
    public boolean isStory(){
       boolean b = (this.mUploadPostType == IUploadRequest$UploadPostType.STORY)? true: false;
       return b;
    }
    public boolean isTmpDisablePublishedToast(){
       return this.mIsTmpDisablePublishedToast;
    }
    public boolean isTopic(){
       return this.mIsTopic;
    }
    public boolean isTranscodeDegrade(){
       return this.mIsTranscodeDegrade;
    }
    public boolean isUseFakeUploader(){
       return this.mUseFakeUploader;
    }
    public void markRequestedEndAction(){
       this.c = true;
    }
    public boolean photoDownloadDeny(){
       return this.mPhotoDownloadDeny;
    }
    public void setAtlasInfo(AtlasInfo p0){
       this.mAtlasInfo = p0;
    }
    public void setAtlasUploadSource(a p0){
       this.mAtlasUploadSource = p0;
    }
    public void setConfigUrl(String p0){
       this.mConfigUrl = p0;
    }
    public void setCoverFile(File p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UploadInfo.class, "7")) {
          return;
       }
       Object[] objArray = new Object[0];
       f.D().w("UploadInfo", "setCoverFile: "+p0, objArray);
       this.mCoverFile = p0;
       return;
    }
    public void setCoverKey(String p0){
       this.mCoverKey = p0;
    }
    public void setCoverKeyExpireTime(long p0){
       this.mCoverKeyExpireTime = p0;
    }
    public void setCoverUrl(String p0){
       this.mCoverUrl = p0;
    }
    public void setDisableFd(boolean p0){
       this.mDisableFd = p0;
    }
    public void setEnablePipelineUpload(boolean p0){
       this.mIsEnablePipelineUpload = p0;
    }
    public void setFaceUrl(String p0){
       this.mFaceUrl = p0;
    }
    public void setHidden(boolean p0){
       this.mIsHidden = p0;
    }
    public void setIsPipelineFailedThenFallback(boolean p0){
       this.mIsPipelineFailedThenFallback = p0;
    }
    public void setMockFeedUploadTarget(TabIdentifier p0){
       this.mockFeedUploadTarget = p0;
    }
    public void setOriginCoverFile(File p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UploadInfo.class, "8")) {
          return;
       }
       Object[] objArray = new Object[0];
       f.D().w("UploadInfo", "setOriginCoverFile: "+p0, objArray);
       this.mOriginCoverFile = p0;
       return;
    }
    public void setOriginCoverKey(String p0){
       this.mOriginCoverKey = p0;
    }
    public void setOriginCoverKeyExpireTime(long p0){
       this.mOriginCoverKeyExpireTime = p0;
    }
    public void setPartKey(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UploadInfo.class, "11")) {
          return;
       }
       this.mPartKey = p0;
       if (!TextUtils.x(p0)) {
          this.setPipelineKey(null);
       }
       return;
    }
    public void setPipelineKey(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UploadInfo.class, "10")) {
          return;
       }
       this.mPipelineKey = p0;
       if (!TextUtils.x(p0)) {
          this.setPartKey(null);
       }
       return;
    }
    public void setPipelineStatsParams(v0 p0){
       this.mPipelineStatsParams = p0;
    }
    public void setProgress(float p0){
       this.mProgress = p0;
    }
    public void setRetryTimes(int p0){
       this.mRetryTimes = p0;
    }
    public void setStatus(IUploadInfo$Status p0){
       this.mStatus = p0;
    }
    public void setTriggerByEncode(boolean p0){
       this.mTriggerByEncode = p0;
    }
    public void setUploadFileCrc(String p0){
       this.mUploadFileCrc = p0;
    }
    public void setVideoUrl(String p0){
       this.mVideoUrl = p0;
    }
    public boolean shouldMockSuccess(){
       return this.mMockSuccess;
    }
    public boolean triggerByEncode(){
       return this.mTriggerByEncode;
    }
    public void updateUploadInfo(UploadInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UploadInfo.class, "2")) {
          return;
       }
       this.mCaption = p0.mCaption;
       this.mCaptionPasted = p0.mCaptionPasted;
       this.mPrompt = p0.mPrompt;
       this.mForwardTokens = p0.mForwardTokens;
       this.mFilePath = p0.mFilePath;
       this.mLocalSharePlatform = p0.mLocalSharePlatform;
       this.mVisibility = p0.mVisibility;
       this.mUserId = p0.mUserId;
       this.mLocationId = p0.mLocationId;
       this.mMusicSwitch = p0.mMusicSwitch;
       this.mMagicFaceSwitch = p0.mMagicFaceSwitch;
       this.mIsTopic = p0.mIsTopic;
       this.mMusic = p0.mMusic;
       this.mMagicEmoji = p0.mMagicEmoji;
       this.mAuthorName = p0.mAuthorName;
       this.mMagicEmojiTag = p0.mMagicEmojiTag;
       this.mEncodeConfigId = p0.mEncodeConfigId;
       this.mIsLiveCover = p0.mIsLiveCover;
       this.mShareAppPackage = p0.mShareAppPackage;
       this.b = p0.b;
       this.mPublishClickTime = p0.mPublishClickTime;
       Object[] objArray = new Object[0];
       f.D().w("UploadInfo", "updateUploadInfo setCoverFile: "+p0.mCoverFile, objArray);
       this.mCoverFile = p0.mCoverFile;
       this.mOriginCoverFile = p0.mOriginCoverFile;
       this.mEncodedFileCrc = p0.mEncodedFileCrc;
       this.mDisableNearbyShow = p0.mDisableNearbyShow;
       this.mPhotoDownloadDeny = p0.mPhotoDownloadDeny;
       this.mDisallowRecreation = p0.mDisallowRecreation;
       this.mRecoGender = p0.mRecoGender;
       this.mIsLongVideo = p0.mIsLongVideo;
       this.mMessageGroupId = p0.mMessageGroupId;
       this.mIsBenefitTask = p0.mIsBenefitTask;
       this.mIsGoldTask = p0.mIsGoldTask;
       this.mPublishToastMainText = p0.mPublishToastMainText;
       this.mPublishToastIconUrl = p0.mPublishToastIconUrl;
       this.mPublishToastDelay = p0.mPublishToastDelay;
       this.mRandomCoinParams = p0.mRandomCoinParams;
       this.mUsedPostFeatures = p0.mUsedPostFeatures;
       UploadInfo mThrowable = p0.mThrowable;
       if (mThrowable != null) {
          this.mThrowable = mThrowable;
       }
       mThrowable = p0.mUploadResult;
       if (mThrowable != null) {
          this.mUploadResult = mThrowable;
       }
       mThrowable = p0.mAtlasInfo;
       if (mThrowable != null) {
          this.mAtlasInfo = mThrowable;
       }
       mThrowable = p0.mKtvInfo;
       if (mThrowable != null) {
          this.mKtvInfo = mThrowable;
       }
       this.mSegmentedUpload = p0.mSegmentedUpload;
       this.mSegmentUploadEnabled = p0.mSegmentUploadEnabled;
       this.mSegmentUploadFirst = p0.mSegmentUploadFirst;
       mThrowable = p0.mSegmentUploadTryCount;
       if (mThrowable > null) {
          this.mSegmentUploadTryCount = mThrowable;
       }
       mThrowable = p0.mWholeUploadTryCount;
       if (mThrowable > null) {
          this.mWholeUploadTryCount = mThrowable;
       }
       this.mMockSuccess = p0.mMockSuccess;
       this.mMerchantInfo = p0.mMerchantInfo;
       mThrowable = p0.mRetryTimes;
       if (mThrowable > null) {
          this.mRetryTimes = mThrowable;
       }
       mThrowable = p0.mCoverWidth;
       if (mThrowable > null) {
          this.mCoverWidth = mThrowable;
       }
       mThrowable = p0.mCoverHeight;
       if (mThrowable > null) {
          this.mCoverHeight = mThrowable;
       }
       mThrowable = p0.mVideoWidth;
       if (mThrowable > null) {
          this.mVideoWidth = mThrowable;
       }
       mThrowable = p0.mVideoHeight;
       if (mThrowable > null) {
          this.mVideoHeight = mThrowable;
       }
       if (!TextUtils.x(p0.mFaceFilePath)) {
          this.mFaceFilePath = p0.mFaceFilePath;
       }
       if (!TextUtils.x(p0.mConfigFilePath)) {
          this.mConfigFilePath = p0.mConfigFilePath;
       }
       if (!TextUtils.x(p0.getCoverUrl())) {
          this.mCoverUrl = p0.getCoverUrl();
       }
       if (!TextUtils.x(p0.getVideoUrl())) {
          this.mVideoUrl = p0.getVideoUrl();
       }
       if (!TextUtils.x(p0.getConfigUrl())) {
          this.mConfigUrl = p0.getConfigUrl();
       }
       if (!TextUtils.x(p0.getFaceUrl())) {
          this.mFaceUrl = p0.getFaceUrl();
       }
       this.mIsHidden = p0.mIsHidden;
       this.mTriggerByEncode = p0.mTriggerByEncode;
       this.mShareSoundTrack = p0.mShareSoundTrack;
       mThrowable = p0.mVideoContext;
       if (mThrowable != null) {
          this.mVideoContext = mThrowable;
       }
       this.mSource = p0.mSource;
       if (!TextUtils.x(p0.mUploadFileCrc)) {
          this.mUploadFileCrc = p0.mUploadFileCrc;
       }
       this.mSameFrameShareConfig = p0.mSameFrameShareConfig;
       this.mUploadPostType = p0.mUploadPostType;
       this.mIsEnablePipelineUpload = p0.mIsEnablePipelineUpload;
       this.mVideoDuration = p0.mVideoDuration;
       this.mWorkspacePath = p0.mWorkspacePath;
       this.mWorkspaceId = p0.mWorkspaceId;
       this.mInteractStickerInfo = p0.getInteractStickerInfos();
       this.mDisableFd = p0.mDisableFd;
       mThrowable = p0.mAtlasUploadSource;
       if (mThrowable != null) {
          this.mAtlasUploadSource = mThrowable;
       }
       this.mUploadTimeRemained = p0.mUploadTimeRemained;
       this.mUploadMode = p0.getUploadMode();
       this.mMockFeedOption = p0.mMockFeedOption;
       this.mNoSysNotification = p0.mNoSysNotification;
       this.mUploadRestrict = p0.mUploadRestrict;
       if (!TextUtils.x(p0.getPipelineKey())) {
          this.mPipelineKey = p0.getPipelineKey();
       }
       mThrowable = p0.mStoryUploadParam;
       if (mThrowable != null) {
          this.mStoryUploadParam = mThrowable;
       }
       this.mLiveAvatarInfo = p0.mLiveAvatarInfo;
       this.mZipUuid = p0.mZipUuid;
       this.mGoldCoinTaskId = p0.mGoldCoinTaskId;
       this.mPublicPostedToast = p0.mPublicPostedToast;
       this.mUploadSuccessTipText = p0.mUploadSuccessTipText;
       this.mPostAgainText = p0.mPostAgainText;
       this.mMagicFaceRecoId = p0.mMagicFaceRecoId;
       this.mShareOption = p0.mShareOption;
       this.mWorkspace = p0.mWorkspace;
       this.mShareBusinessLinkModel = p0.mShareBusinessLinkModel;
       this.mCroppedCoverSize = p0.mCroppedCoverSize;
       this.mShowFlowFeedback = p0.isShowFlowFeedback();
       this.mCaptionTitle = p0.mCaptionTitle;
       this.mIsTranscodeDegrade = p0.mIsTranscodeDegrade;
       this.mUseFakeUploader = p0.mUseFakeUploader;
       this.mHaveMerchantBusinessPlc = p0.mHaveMerchantBusinessPlc;
       this.mCustomizedMagicFilePath = p0.mCustomizedMagicFilePath;
       this.mTagSourceCollection = p0.mTagSourceCollection;
       return;
    }
    public boolean uploadToThirdPartyServer(){
       boolean b = (this.mUploadPostType == IUploadRequest$UploadPostType.JUXING)? true: false;
       return b;
    }
    public boolean validateFiles(){
       ArrayList obj = PatchProxy.apply(null, this, UploadInfo.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = new ArrayList();
       UploadInfo tmAtlasInfo = this.mAtlasInfo;
       boolean b = false;
       if (tmAtlasInfo != null) {
          obj.addAll(tmAtlasInfo.mDonePictures);
          if (!TextUtils.x(this.mAtlasInfo.mMusicFilePath)) {
             obj.add(this.mAtlasInfo.mMusicFilePath);
          }
       }else {
          tmAtlasInfo = this.mKtvInfo;
          if (tmAtlasInfo != null && tmAtlasInfo.getKaraokeType() == 2) {
             if (TextUtils.x(this.mKtvInfo.mOutputAudioPath) || TextUtils.x(this.mKtvInfo.mOutputCoverPath)) {
                return b;
             }else {
                obj.add(this.mKtvInfo.mOutputAudioPath);
                obj.add(this.mKtvInfo.mOutputCoverPath);
             }
          }else if(TextUtils.x(this.mFilePath)){
             return b;
          }else {
             obj.add(this.mFilePath);
          }
       }
       Iterator iterator = obj.iterator();
       while (true) {
          if (iterator.hasNext()) {
             if (!new File(iterator.next()).exists()) {
                return b;
             }
             continue ;
          }else {
             UploadInfo tmCoverFile = this.mCoverFile;
             if (tmCoverFile == null || tmCoverFile.exists()) {
                b = true;
                break ;
             }
             break ;
          }
       }
       return b;
    }
}
