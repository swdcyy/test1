package com.kwai.feature.post.api.feature.encode.model.EncodeInfo;
import java.lang.Cloneable;
import java.io.Serializable;
import c26.b;
import com.yxcorp.gifshow.media.model.EncodeConfig$ComplexEncodeProfile;
import java.lang.Object;
import java.lang.String;
import android.content.Intent;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo$Status;
import z30.n0;
import java.io.File;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import um6.a;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo$EncodeParams;
import com.kwai.feature.post.api.feature.encode.model.AtlasInfo;
import d26.a;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import ekd.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import lnc.p3;
import q87.c;
import java.lang.Boolean;
import java.lang.StringBuilder;

public class EncodeInfo implements Cloneable, Serializable	// class@00139b
{
    public final Intent b;
    public VideoContext c;
    public Throwable d;
    public a e;
    public String f;
    public boolean g;
    public AtlasInfo mAtlasInfo;
    public final String mAudioOutputPath;
    public final String mBackgroundAudioPath;
    public final boolean mBackgroundAudioRepeat;
    public final float mBackgroundAudioVolume;
    public String mBeautySdkInfo;
    public final String mComment;
    public final int mCount;
    public final String mCoverPath;
    public String mDeliveryParamsInfo;
    public boolean mDisableTranscodeDegrade;
    public EncodeInfo$EncodeParams mEncodeParams;
    public String mEncodedFileCrc;
    public long mEncodedFileDuration;
    public int mEncodedHeight;
    public int mEncodedWidth;
    public long mExportDuration;
    public byte[] mExtraInfoInSEI;
    public long mForegroundAudioClipEndTime;
    public long mForegroundAudioClipStartTime;
    public final String mForegroundAudioPath;
    public final float mForegroundAudioVolume;
    public final int mFrameIntervalMs;
    public final int mHeight;
    public boolean mHidden;
    public n0 mIWorkspace;
    public int mId;
    public final boolean mIsCrashInEncodingAndGiveUpWorkspace;
    public boolean mIsExportTaskInQueueing;
    public boolean mIsHdExport;
    public boolean mIsImport;
    public boolean mIsPhotoMovie;
    public boolean mIsPipelineSupported;
    public boolean mIsTranscodeDegrade;
    public boolean mIsTranscoded;
    public boolean mIsVisionEngineLoadedSuccess;
    public a mKtvInfo;
    public final String mOutputPath;
    public boolean mOverrideParams;
    public float mProgress;
    public EncodeConfig$ComplexEncodeProfile mProperComplexEncodeProfile;
    public String mSessionId;
    public EncodeInfo$Status mStatus;
    public int mTemplateGrade;
    public int mTranscodeReason;
    public final String mVideoBufferPath;
    public int mVideoType;
    public final int mWidth;
    public File mWorkspaceDirectory;

    public void EncodeInfo(int p0,b p1,EncodeConfig$ComplexEncodeProfile p2){
       super();
       this.mForegroundAudioClipStartTime = -1;
       this.mForegroundAudioClipEndTime = -1;
       this.mIsExportTaskInQueueing = true;
       this.mIsVisionEngineLoadedSuccess = true;
       this.mIsHdExport = false;
       this.mVideoType = 0;
       this.mId = p0;
       this.mOutputPath = p1.getOutputPath();
       this.mCoverPath = p1.getCoverPath();
       this.mAudioOutputPath = p1.getAudioOutputPath();
       this.mComment = p1.getComment();
       this.mVideoBufferPath = p1.getVideoBufferPath();
       this.mWidth = p1.getWidth();
       this.mHeight = p1.getHeight();
       this.mCount = p1.getCount();
       this.mFrameIntervalMs = p1.getFrameIntervalMs();
       this.mHidden = p1.isHidden();
       this.mForegroundAudioPath = p1.getForegroundAudioPath();
       this.mForegroundAudioClipStartTime = p1.getForegroundAudioClipStartTime();
       this.mForegroundAudioClipEndTime = p1.getForegroundAudioClipEndTime();
       this.mBackgroundAudioPath = p1.getBackgroundAudioPath();
       this.mForegroundAudioVolume = p1.getForegroundAudioVolume();
       this.mBackgroundAudioVolume = p1.getBackgroundAudioVolume();
       this.mBackgroundAudioRepeat = p1.getBackgroundAudioRepeat();
       this.mIsCrashInEncodingAndGiveUpWorkspace = p1.isCrashInEncodingAndGiveUpWorkspace();
       this.b = p1.getPreviewIntent();
       this.mStatus = EncodeInfo$Status.PENDING;
       this.mIsPhotoMovie = p1.isPhotoMovie();
       this.mSessionId = p1.getSessionId();
       this.mIWorkspace = p1.getIWorkspace();
       this.mWorkspaceDirectory = p1.getWorkspaceDirectory();
       this.c = p1.getVideoContext();
       this.mKtvInfo = p1.getKtvInfo();
       this.mIsImport = p1.isImport();
       this.mIsPipelineSupported = p1.isPipelineSupported();
       this.mIsExportTaskInQueueing = p1.isExportTaskInQueueing();
       this.mProperComplexEncodeProfile = p2;
       EncodeInfo$EncodeParams uEncodeParam = new EncodeInfo$EncodeParams();
       this.mEncodeParams = uEncodeParam;
       uEncodeParam.mVideoGopSize = p1.getVideoGopSiz();
       uEncodeParam.mVideoBitrate = p1.getVideoBitrate();
       uEncodeParam.mX264Params = p1.getX264Params();
       uEncodeParam.mX264Preset = p1.getX264Preset();
       uEncodeParam.mAudioProfile = p1.getAudioProfile();
       this.mOverrideParams = p1.isOverrideParams();
       this.mIsHdExport = p1.isHdExport();
       this.mExtraInfoInSEI = p1.getExtraInfoInSEI();
       this.mAtlasInfo = p1.getAtlasInfo();
       this.f = p1.getActivityKey();
       this.mDisableTranscodeDegrade = p1.isDisableTranscodeDegrade();
       this.mTemplateGrade = p1.getTemplateGrade();
       this.mVideoType = p1.getVideoType();
    }
    public void EncodeInfo(EncodeInfo p0){
       super();
       this.mForegroundAudioClipStartTime = -1;
       this.mForegroundAudioClipEndTime = -1;
       this.mIsExportTaskInQueueing = true;
       this.mIsVisionEngineLoadedSuccess = true;
       this.mIsHdExport = false;
       this.mVideoType = 0;
       this.mId = p0.mId;
       this.mOutputPath = p0.mOutputPath;
       this.mCoverPath = p0.mCoverPath;
       this.mAudioOutputPath = p0.mAudioOutputPath;
       this.mComment = p0.mComment;
       this.mVideoBufferPath = p0.mVideoBufferPath;
       this.mWidth = p0.mWidth;
       this.mHeight = p0.mHeight;
       this.mCount = p0.mCount;
       this.mFrameIntervalMs = p0.mFrameIntervalMs;
       this.mForegroundAudioPath = p0.mForegroundAudioPath;
       this.mForegroundAudioClipStartTime = p0.mForegroundAudioClipStartTime;
       this.mForegroundAudioClipEndTime = p0.mForegroundAudioClipEndTime;
       this.mBackgroundAudioPath = p0.mBackgroundAudioPath;
       this.mForegroundAudioVolume = p0.mForegroundAudioVolume;
       this.mBackgroundAudioVolume = p0.mBackgroundAudioVolume;
       this.mBackgroundAudioRepeat = p0.mBackgroundAudioRepeat;
       this.mIsCrashInEncodingAndGiveUpWorkspace = p0.mIsCrashInEncodingAndGiveUpWorkspace;
       this.b = p0.b;
       this.mHidden = p0.mHidden;
       this.mStatus = p0.mStatus;
       this.mProgress = p0.mProgress;
       this.mIsPhotoMovie = p0.mIsPhotoMovie;
       this.mSessionId = p0.mSessionId;
       this.mIWorkspace = p0.mIWorkspace;
       this.mWorkspaceDirectory = p0.mWorkspaceDirectory;
       this.c = p0.c;
       this.mIsImport = p0.mIsImport;
       this.mEncodedHeight = p0.mEncodedHeight;
       this.mEncodedWidth = p0.mEncodedWidth;
       this.mKtvInfo = p0.mKtvInfo;
       this.mEncodedFileCrc = p0.mEncodedFileCrc;
       this.mEncodedFileDuration = p0.mEncodedFileDuration;
       this.mIsPipelineSupported = p0.mIsPipelineSupported;
       this.mIsTranscoded = p0.mIsTranscoded;
       this.d = p0.d;
       this.mProperComplexEncodeProfile = p0.mProperComplexEncodeProfile;
       EncodeInfo$EncodeParams uEncodeParam = new EncodeInfo$EncodeParams();
       this.mEncodeParams = uEncodeParam;
       EncodeInfo mEncodeParam = p0.mEncodeParams;
       uEncodeParam.mVideoGopSize = mEncodeParam.mVideoGopSize;
       uEncodeParam.mVideoBitrate = mEncodeParam.mVideoBitrate;
       uEncodeParam.mX264Params = mEncodeParam.mX264Params;
       uEncodeParam.mX264Preset = mEncodeParam.mX264Preset;
       uEncodeParam.mAudioProfile = mEncodeParam.mAudioProfile;
       this.mOverrideParams = p0.mOverrideParams;
       this.mIsHdExport = p0.mIsHdExport;
       this.mExtraInfoInSEI = p0.mExtraInfoInSEI;
       this.mAtlasInfo = p0.mAtlasInfo;
       this.mDisableTranscodeDegrade = p0.mDisableTranscodeDegrade;
       this.mIsTranscodeDegrade = p0.mIsTranscodeDegrade;
       this.f = p0.f;
       this.mBeautySdkInfo = p0.mBeautySdkInfo;
       this.g = p0.g;
    }
    public boolean encodeOptionValid(){
       boolean b;
       EncodeInfo tmEncodePara = this.mEncodeParams;
       if (tmEncodePara != null) {
          EncodeInfo$EncodeParams mExportOptio = tmEncodePara.mExportOptionsBytes;
          if (mExportOptio != null && mExportOptio.length > 0) {
             b = true;
          label_000e :
             return b;
          }
       }
       b = false;
       goto label_000e ;
    }
    public String getActivityKey(){
       return this.f;
    }
    public AtlasInfo getAtlasInfo(){
       return this.mAtlasInfo;
    }
    public String getAudioOutputPath(){
       return this.mAudioOutputPath;
    }
    public String getBackgroundAudioPath(){
       return this.mBackgroundAudioPath;
    }
    public float getBackgroundAudioVolume(){
       return this.mBackgroundAudioVolume;
    }
    public String getBeautySdkInfo(){
       return this.mBeautySdkInfo;
    }
    public a getByteStreamEncodeInfo(){
       return this.e;
    }
    public String getComment(){
       return this.mComment;
    }
    public int getCount(){
       return this.mCount;
    }
    public String getCoverPath(){
       return this.mCoverPath;
    }
    public String getDeliveryParamsInfo(){
       return this.mDeliveryParamsInfo;
    }
    public String getEncodedFileCrc(){
       return this.mEncodedFileCrc;
    }
    public int getEncodedHeight(){
       return this.mEncodedHeight;
    }
    public int getEncodedWidth(){
       return this.mEncodedWidth;
    }
    public long getEncondedFileDuration(){
       return this.mEncodedFileDuration;
    }
    public byte[] getExtraInfoInSEI(){
       return this.mExtraInfoInSEI;
    }
    public long getForegroundAudioClipEndTime(){
       return this.mForegroundAudioClipEndTime;
    }
    public long getForegroundAudioClipStartTime(){
       return this.mForegroundAudioClipStartTime;
    }
    public String getForegroundAudioPath(){
       return this.mForegroundAudioPath;
    }
    public float getForegroundAudioVolume(){
       return this.mForegroundAudioVolume;
    }
    public int getFrameIntervalMs(){
       return this.mFrameIntervalMs;
    }
    public int getHeight(){
       return this.mHeight;
    }
    public int getId(){
       return this.mId;
    }
    public List getOutputAtlasFiles(){
       EncodeInfo obj = PatchProxy.apply(null, this, EncodeInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mAtlasInfo;
       if (obj == null || q.f(obj.mDonePictures)) {
          Object[] objArray = new Object[0];
          p3.D().A("EncodeInfo", "this type maybe not picture", objArray);
          return null;
       }else {
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = this.mAtlasInfo.mDonePictures.iterator();
          while (true) {
             if (!iterator.hasNext()) {
                return uArrayList;
             }
             String str = iterator.next();
             if (TextUtils.x(str)) {
                break ;
             }else {
                uArrayList.add(new File(str));
             }
          }
          PostUtils.D("EncodeInfo", "getAtlasInfo", new IllegalStateException("atlas output file path is null"));
          return null;
       }
    }
    public String getOutputPath(){
       return this.mOutputPath;
    }
    public Intent getPreviewIntent(){
       return this.b;
    }
    public float getProgress(){
       return this.mProgress;
    }
    public EncodeConfig$ComplexEncodeProfile getProperComplexEncodeProfile(){
       return this.mProperComplexEncodeProfile;
    }
    public String getSessionId(){
       return this.mSessionId;
    }
    public EncodeInfo$Status getStatus(){
       return this.mStatus;
    }
    public int getTemplateGrade(){
       return this.mTemplateGrade;
    }
    public Throwable getThrowable(){
       return this.d;
    }
    public String getVideoBufferPath(){
       return this.mVideoBufferPath;
    }
    public VideoContext getVideoContext(){
       return this.c;
    }
    public int getVideoType(){
       return this.mVideoType;
    }
    public int getWidth(){
       return this.mWidth;
    }
    public boolean isAtlas(){
       return false;
    }
    public boolean isAtlasEncode(){
       Object obj = PatchProxy.apply(null, this, EncodeInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!this.isAtlas() && (this.isLongPicture() || this.isSinglePicture()))? true: false;
       return b;
    }
    public boolean isBackgroundAudioRepeat(){
       return this.mBackgroundAudioRepeat;
    }
    public boolean isCanSkipVideo(){
       Object obj = PatchProxy.apply(null, this, EncodeInfo.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.mStatus == EncodeInfo$Status.COMPLETE && (this.isKtvMultiPicSong() || this.isPhotoMovie()))? true: false;
       return b;
    }
    public boolean isCrashInEncodingAndGiveUpWorkspace(){
       return this.mIsCrashInEncodingAndGiveUpWorkspace;
    }
    public boolean isDisableTranscodeDegrade(){
       return this.mDisableTranscodeDegrade;
    }
    public boolean isEncode1080p(){
       boolean b = (this.mEncodedWidth >= 1080 && this.mEncodedHeight >= 1080)? true: false;
       return b;
    }
    public boolean isExportTaskInQueueing(){
       return this.mIsExportTaskInQueueing;
    }
    public boolean isHdExport(){
       return this.mIsHdExport;
    }
    public boolean isHidden(){
       return this.mHidden;
    }
    public boolean isIntelligenceAlbum(){
       return false;
    }
    public boolean isKtvMultiPicSong(){
       return false;
    }
    public boolean isKtvMv(){
       return false;
    }
    public boolean isKtvSinglePicSong(){
       return false;
    }
    public boolean isKtvSong(){
       return false;
    }
    public boolean isKuaiShan(){
       return false;
    }
    public boolean isLongPicture(){
       return false;
    }
    public boolean isLongVideo(){
       return false;
    }
    public boolean isMediaScene(){
       return false;
    }
    public boolean isNeedIncreaseFps(){
       return false;
    }
    public boolean isNormalPhotoMovie(){
       return false;
    }
    public boolean isOverrideParams(){
       return this.mOverrideParams;
    }
    public boolean isPhotoMovie(){
       return this.mIsPhotoMovie;
    }
    public boolean isPipelineSupported(){
       return this.mIsPipelineSupported;
    }
    public boolean isSinglePicture(){
       return false;
    }
    public boolean isSkipTranscodeInExportTask(){
       return this.g;
    }
    public boolean isStoryMood(){
       return false;
    }
    public boolean isSupportHdExport(){
       Object obj = PatchProxy.apply(null, this, EncodeInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.isAtlasEncode() ^ 0x01);
    }
    public boolean isTranscodeDegrade(){
       return this.mIsTranscodeDegrade;
    }
    public boolean isTranscoded(){
       return this.mIsTranscoded;
    }
    public boolean isVideo(){
       return false;
    }
    public void setActivityKey(String p0){
       this.f = p0;
    }
    public void setBeautySdkInfo(String p0){
       this.mBeautySdkInfo = p0;
    }
    public void setByteStreamEncodeInfo(a p0){
       this.e = p0;
    }
    public void setDeliveryParamsInfo(String p0){
       this.mDeliveryParamsInfo = p0;
    }
    public void setDisableTranscodeDegrade(boolean p0){
       this.mDisableTranscodeDegrade = p0;
    }
    public void setEncodedFileCrc(String p0){
       this.mEncodedFileCrc = p0;
    }
    public void setEncodedWithHeight(int p0,int p1){
       this.mEncodedWidth = p0;
       this.mEncodedHeight = p1;
    }
    public void setEncondedFileDuration(long p0){
       this.mEncodedFileDuration = p0;
    }
    public void setIsHidden(boolean p0){
       this.mHidden = p0;
    }
    public void setIsTranscoded(boolean p0){
       this.mIsTranscoded = p0;
    }
    public void setSkipTranscodeInExportTask(boolean p0){
       if (PatchProxy.isSupport(EncodeInfo.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, EncodeInfo.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       p3.D().w("EncodeInfo", "setSkipTranscodeInExportTask skip="+p0, objArray);
       this.g = p0;
       this.setIsTranscoded((p0 ^ 0x01));
       return;
    }
    public void setThrowable(Throwable p0){
       this.d = p0;
    }
    public void setTranscodeDegrade(boolean p0){
       this.mIsTranscodeDegrade = p0;
    }
    public void setVideoContext(VideoContext p0){
       this.c = p0;
    }
}
