package com.yxcorp.gifshow.upload.UploadRequest;
import java.io.Serializable;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadRequest;
import java.lang.Object;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo$UploadSource;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadRequest$UploadPostType;
import on5.b;
import com.yxcorp.gifshow.upload.UploadRequest$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.io.File;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import java.util.List;
import n1b.b;
import com.kwai.kcube.TabIdentifier;
import com.kuaishou.android.model.music.Music;
import com.yxcorp.gifshow.upload.SameFrameShareConfig;
import com.yxcorp.gifshow.upload.StoryUploadParam;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.kwai.feature.post.api.feature.story.model.PhotoVisibility;
import com.kuaishou.edit.draft.Workspace;

public class UploadRequest implements Serializable, IUploadRequest	// class@001e5a
{
    public AtlasInfo mAtlasInfo;
    public String mAuthorName;
    public String mCaption;
    public boolean mCaptionPasted;
    public String mCaptionTitle;
    public String mConfigFilePath;
    public File mCoverFile;
    public int mCoverHeight;
    public int mCoverWidth;
    public Size mCroppedCoverSize;
    public String mCustomizedMagicFilePath;
    public boolean mDisableNearbyShow;
    public boolean mDisallowRecreation;
    public long mEncodeConfigId;
    public String mEncodedFileCrc;
    public String mFaceFilePath;
    public String mFilePath;
    public String[] mForwardTokens;
    public String mGoldCoinTaskId;
    public boolean mHaveMerchantBusinessPlc;
    public List mInteractStickerInfo;
    public boolean mIsBenefitTask;
    public boolean mIsEnablePipelineSegmentUpload;
    public boolean mIsEnablePipelineUpload;
    public boolean mIsGoldTask;
    public boolean mIsHidden;
    public boolean mIsLiveCover;
    public boolean mIsLongVideo;
    public boolean mIsPublished;
    public boolean mIsTopic;
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
    public boolean mPhotoDownloadDeny;
    public String mPostAgainText;
    public String mPrompt;
    public String mPublicPostedToast;
    public long mPublishClickTime;
    public long mPublishToastDelay;
    public String mPublishToastIconUrl;
    public String mPublishToastMainText;
    public v1 mRandomCoinParams;
    public int mRecoGender;
    public int mRetryTimes;
    public boolean mReturnToHome;
    public RickonWholeUploadParams mRickonWholeUploadParams;
    public SameFrameShareConfig mSameFrameShareConfig;
    public String mSessionId;
    public String mShareAppPackage;
    public KwaiOp mShareOption;
    public String mSharePubInfo;
    public boolean mShareSoundTrack;
    public boolean mShowFlowFeedback;
    public IUploadInfo$UploadSource mSource;
    public StoryUploadParam mStoryUploadParam;
    public String mTagSourceCollection;
    public String mToken;
    public boolean mTriggerByEncode;
    public int mUploadMode;
    public IUploadRequest$UploadPostType mUploadPostType;
    public int mUploadRestrict;
    public String mUploadSuccessTipText;
    public boolean mUseFakeUploader;
    public JsonArray mUsedPostFeatures;
    public String mUserId;
    public VideoContext mVideoContext;
    public long mVideoDuration;
    public int mVideoHeight;
    public int mVideoWidth;
    public PhotoVisibility mVisibility;
    public Workspace mWorkspace;
    public File mWorkspaceDirectory;
    public String mZipUuid;
    public TabIdentifier mockFeedUploadTarget;
    public static final long serialVersionUID = 0xbd2d292d3c195060;

    public void UploadRequest(){
       super();
       this.mMockSuccess = true;
       this.mSource = IUploadInfo$UploadSource.SOURCE_DEFAULT;
       this.mUploadPostType = IUploadRequest$UploadPostType.NORMAL;
       this.mUploadMode = 1;
       this.mMockFeedOption = 0;
       this.mNoSysNotification = false;
       this.mUploadRestrict = 0;
       this.mIsGoldTask = false;
       this.mockFeedUploadTarget = b.c;
       this.mReturnToHome = true;
       this.mUseFakeUploader = false;
       this.mHaveMerchantBusinessPlc = false;
    }
    public static UploadRequest$a newBuilder(){
       Object obj = PatchProxy.apply(null, null, UploadRequest.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new UploadRequest$a();
    }
    public boolean disableShowNearby(){
       return this.mDisableNearbyShow;
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
    public File getCoverFile(){
       return this.mCoverFile;
    }
    public int getCoverHeight(){
       return this.mCoverHeight;
    }
    public int getCoverWidth(){
       return this.mCoverWidth;
    }
    public Size getCroppedCoverSize(){
       return this.mCroppedCoverSize;
    }
    public long getEncodeConfigId(){
       return this.mEncodeConfigId;
    }
    public String getEncodedFileCrc(){
       return this.mEncodedFileCrc;
    }
    public String getFaceFilePath(){
       return this.mFaceFilePath;
    }
    public String getFilePath(){
       return this.mFilePath;
    }
    public String[] getForwardTokens(){
       return this.mForwardTokens;
    }
    public List getInteractStickerInfo(){
       return this.mInteractStickerInfo;
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
    public String getPrompt(){
       return this.mPrompt;
    }
    public long getPublishClickTime(){
       return this.mPublishClickTime;
    }
    public int getRecoGender(){
       return this.mRecoGender;
    }
    public int getRetryTimes(){
       return this.mRetryTimes;
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
    public String getSharePubInfo(){
       return this.mSharePubInfo;
    }
    public boolean getShareSoundTrack(){
       return this.mShareSoundTrack;
    }
    public IUploadInfo$UploadSource getSource(){
       return this.mSource;
    }
    public StoryUploadParam getStoryUploadParam(){
       return this.mStoryUploadParam;
    }
    public String getTagSourceCollection(){
       return this.mTagSourceCollection;
    }
    public int getUploadMode(){
       return this.mUploadMode;
    }
    public IUploadRequest$UploadPostType getUploadPostType(){
       return this.mUploadPostType;
    }
    public String getUserId(){
       return this.mUserId;
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
    public int getVideoWidth(){
       return this.mVideoWidth;
    }
    public PhotoVisibility getVisibility(){
       return this.mVisibility;
    }
    public Workspace getWorkspace(){
       return this.mWorkspace;
    }
    public File getWorkspaceDirectory(){
       return this.mWorkspaceDirectory;
    }
    public File getWorkspacePath(){
       return this.mWorkspaceDirectory;
    }
    public boolean isCaptionPasted(){
       return this.mCaptionPasted;
    }
    public boolean isDisallowRecreation(){
       return this.mDisallowRecreation;
    }
    public boolean isEnablePipelineSegmentUpload(){
       return this.mIsEnablePipelineSegmentUpload;
    }
    public boolean isEnablePipelineUpload(){
       return this.mIsEnablePipelineUpload;
    }
    public boolean isHidden(){
       return this.mIsHidden;
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
    public boolean isPublished(){
       return this.mIsPublished;
    }
    public boolean isReturnToHome(){
       return this.mReturnToHome;
    }
    public boolean isShowFlowFeedback(){
       return this.mShowFlowFeedback;
    }
    public boolean isTopic(){
       return this.mIsTopic;
    }
    public boolean isUseFakeUploader(){
       return this.mUseFakeUploader;
    }
    public boolean photoDownloadDeny(){
       return this.mPhotoDownloadDeny;
    }
    public void setCroppedCoverSize(Size p0){
       this.mCroppedCoverSize = p0;
    }
    public void setEnablePipelineSegmentUpload(boolean p0){
       this.mIsEnablePipelineSegmentUpload = p0;
    }
    public void setEncodedFileCrc(String p0){
       this.mEncodedFileCrc = p0;
    }
    public void setTagSourceCollection(String p0){
       this.mTagSourceCollection = p0;
    }
    public void setTriggerByEncode(boolean p0){
       this.mTriggerByEncode = p0;
    }
    public void setVideoContext(VideoContext p0){
       this.mVideoContext = p0;
    }
    public void setVideoDuration(long p0){
       this.mVideoDuration = p0;
    }
    public void setWorkspace(Workspace p0){
       this.mWorkspace = p0;
    }
    public void setWorkspaceDirectory(File p0){
       this.mWorkspaceDirectory = p0;
    }
    public boolean triggerByEncode(){
       return this.mTriggerByEncode;
    }
}
