package com.kwai.video.clipkit.post.ClipPostTask;
import com.kwai.video.clipkit.ClipExportHandler$ClipExportListenerV3;
import com.kwai.video.clipkit.post.ClipPostInfo;
import android.content.Context;
import java.lang.Object;
import com.kwai.video.clipkit.post.ClipPostStatus;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.clipkit.post.ClipPostResult;
import com.kwai.video.clipkit.post.ClipPostResult$ClipPostPublishParam;
import com.kwai.video.clipkit.log.ClipPostTaskLogInfo;
import com.kwai.video.clipkit.ClipKitUtils;
import com.kwai.video.clipkit.post.ClipPostInfo$ClipEncodeInfo;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ExportOptions;
import com.kwai.video.clipkit.ClipExportHandler;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.io.File;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ProbedFile;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ProbedStream;
import java.lang.Exception;
import java.io.IOException;
import com.kwai.video.editorsdk2.ExportTaskStatsInfo;
import com.kwai.video.editorsdk2.ExportTaskStatsUnit;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import java.lang.StringBuilder;
import com.kwai.video.clipkit.KSClipLog;
import com.kwai.video.ksuploaderkit.KSUploaderKit;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.StringBuffer;
import java.lang.Integer;
import com.kwai.video.clipkit.hardware.ClipDPHardwareConfigManager;
import com.kwai.video.clipkit.post.ClipPostInfo$ClipWatermarkParam;
import com.kwai.video.clipkit.post.ClipPostListener;
import android.os.SystemClock;
import com.kwai.video.clipkit.ClipExportException;
import com.kwai.video.clipkit.post.ClipPostException;
import java.lang.Double;
import com.kwai.video.editorsdk2.ExportTask;
import com.kwai.video.editorsdk2.EncodedSegmentInfo;
import com.kwai.video.ksuploaderkit.KSUploaderKitSegmentInfo;
import java.util.List;
import com.kwai.video.clipkit.post.ClipEditPostLog;
import com.kwai.video.clipkit.log.ClipEditExtraInfo;
import com.kwai.video.clipkit.post.ClipEditPostBaseLog;
import com.kwai.video.clipkit.log.ClipEditLogger;
import com.kwai.video.clipkit.config.EditorEncodeConfigManager;
import com.kwai.video.clipkit.config.EditorEncodeConfigModule;
import com.kwai.video.clipkit.config.EditorEncodeConfigModule$ExportParam;
import com.kwai.video.clipkit.post.LocalExportOption;
import com.kwai.video.clipkit.config.EditorEncodeConfig$LocalVideoEncodeConfig;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$Rational;
import com.kwai.video.clipkit.config.EditorEncodeConfig$AudioEncodeConfig;
import com.kwai.video.clipkit.cape.CapeExportParams;
import com.kwai.video.clipkit.config.EditorEncodeConfig$CapeConfig;
import com.kwai.video.clipkit.cape.CapeHandlerInterface;
import com.kwai.video.clipkit.cape.CapeManager;
import android.util.Pair;
import java.lang.Math;
import com.kwai.video.devicepersona.benchmark.BenchmarkEncodeProfile;
import com.kwai.video.devicepersonabenchmark.DPHardwareConfigManager$EncodeResult;
import com.kwai.video.devicepersonabenchmark.DPHardwareConfigManager;
import com.kwai.video.devicepersonabenchmark.codec.BenchmarkEncodeProfile;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ProtoSkipTranscodeConfig;
import com.kwai.video.clipkit.config.SkipTranscodeConfig;
import com.kwai.video.clipkit.post.ClipPostInfo$ClipUploadInfo;
import com.kwai.video.clipkit.config.ClipKitConfigManager;
import com.kwai.video.clipkit.config.ClipKitConfig;
import com.kwai.video.clipkit.config.EditorEncodeConfig;
import java.lang.Throwable;
import java.lang.System;
import java.util.Random;
import com.kwai.video.editorsdk2.ExternalFilterRequestListenerV2;
import com.kwai.video.clipkit.ClipExportHandler$ClipExportListener;
import java.util.Map;
import com.kwai.video.ksuploaderkit.KSUploaderKitConfig;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$MediaType;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$ServiceType;
import com.kwai.video.clipkit.post.ClipPostTask$2;
import com.kwai.video.ksuploaderkit.KSUploaderKitEventListener;
import java.util.Iterator;
import com.kwai.video.clipkit.post.ClipPostInfo$ClipExtraUploadInfo;
import com.kwai.video.clipkit.post.ClipUploadException;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$UploadMode;
import com.kwai.video.clipkit.post.ClipPostTask$1;
import com.kwai.video.ksuploaderkit.KSUploaderKitEndPointAgent;
import com.kwai.video.ksuploaderkit.KSUploaderKitNetManager;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$SceneType;
import com.kwai.video.clipkit.watermark.ClipWatermarkHandler;
import com.kwai.video.minecraft.model.EditorSdk2V2$TimeRangeV2;

public class ClipPostTask implements ClipExportHandler$ClipExportListenerV3	// class@001af1
{
    public final double COVER_UPLOAD_PROGRESS_RATIO;
    public Context mApplicationContext;
    public long mCacheUserWaitStartTime;
    public CapeHandlerInterface mCapeHandler;
    public ClipExportHandler mClipExportHandler;
    public ClipPostException mClipPostException;
    public ClipPostListener mClipPostListener;
    public ClipPostResult mClipResult;
    public ClipWatermarkHandler mClipWatermarkHandler;
    public boolean mDisableHwEncode;
    public ClipEditExtraInfo mExtraInfo;
    public boolean mForceDisableResume;
    public boolean mHasNotifiedCancel;
    public boolean mHasReportedEncodeUploadFail;
    public boolean mIsCancel;
    public boolean mIsEnablePipeline;
    public boolean mIsFinishReported;
    public boolean mIsRetryStart;
    public boolean mIsStartWhenUploadFinish;
    public Object mLock;
    public int mOriginEncodeProjectOutputHeight;
    public int mOriginEncodeProjectOutputWidth;
    public ClipPostInfo mPostInfo;
    public ClipPostTaskLogInfo mPostLogInfo;
    public int mRetryCount;
    public List mSegmentInfos;
    public ClipPostStatus mStatus;
    public KSUploaderKit mUploadKit;

    public void ClipPostTask(ClipPostInfo p0,Context p1){
       super();
       this.COVER_UPLOAD_PROGRESS_RATIO = 0x3f9eb851eb851eb8;
       this.mLock = new Object();
       this.mStatus = new ClipPostStatus();
       this.mIsCancel = false;
       this.mHasNotifiedCancel = false;
       this.mRetryCount = -1;
       this.mIsFinishReported = false;
       this.mHasReportedEncodeUploadFail = false;
       this.mCacheUserWaitStartTime = 0;
       this.mDisableHwEncode = false;
       this.mIsStartWhenUploadFinish = false;
       this.mIsRetryStart = false;
       this.mSegmentInfos = new ArrayList(10);
       this.mForceDisableResume = false;
       this.mPostInfo = p0;
       this.mApplicationContext = p1;
    }
    public final void buildPostPublishParam(){
       String tempPipeline;
       int i1;
       int[] ointArray;
       double[] uodoubleArra;
       EditorSdk2V2$TrackAsset trackAsset;
       if (PatchProxy.applyVoid(null, this, ClipPostTask.class, "26")) {
          return;
       }
       ClipPostTask tmClipResult = this.mClipResult;
       if (tmClipResult.publishParam == null) {
          tmClipResult.publishParam = new ClipPostResult$ClipPostPublishParam();
          this.mClipResult.publishParam.skipTranscode = ClipKitUtils.getLogSkipTransCode(this.mPostLogInfo.skipTransCode);
          tmClipResult = this.mClipResult;
          ClipPostResult publishParam = tmClipResult.publishParam;
          publishParam.transcodeReason = this.mPostLogInfo.transcodeReason;
          publishParam.isPipeline = this.mIsEnablePipeline;
          ClipPostResult outPutPath = tmClipResult.outPutPath;
          ClipPostTask uClipPostTas = 2;
          if (this.mClipExportHandler != null && this.mPostInfo.encodeInfo.exportOptions.outputFormat() == uClipPostTas) {
             tempPipeline = this.mClipExportHandler.getTempPipelinePath();
             if (!TextUtils.isEmpty(tempPipeline) && new File(tempPipeline).exists()) {
                outPutPath = tempPipeline;
             }
          }
          int i = 0;
          if (!TextUtils.isEmpty(outPutPath) && new File(outPutPath).exists()) {
             String str = "aac";
             if (this.mClipResult.publishParam.skipTranscode != null) {
                try{
                   EditorSdk2$ProbedFile probedFile = EditorSdk2Utils.openFile(outPutPath);
                   if (probedFile != null && (probedFile.streams() != null && probedFile.streams().size() > 0)) {
                      boolean b = true;
                      if (probedFile.videoStreamIndex() >= 0 && probedFile.videoStreamIndex() < probedFile.streams().size()) {
                         this.mClipResult.publishParam.avgBitrate = (double)probedFile.streams(probedFile.videoStreamIndex()).bitRate();
                         i1 = probedFile.streams(probedFile.videoStreamIndex()).privateCodecId();
                         ClipPostResult publishParam1 = this.mClipResult.publishParam;
                         if (i1 == b) {
                            tempPipeline = "h264";
                         }else if(i1 == uClipPostTas){
                            tempPipeline = "hevc";
                         }else {
                            tempPipeline = "unknown";
                         }
                         publishParam1.videoCodec = tempPipeline;
                      }
                      if (probedFile.audioStreamIndex() >= 0 && probedFile.audioStreamIndex() < probedFile.streams().size()) {
                         i1 = probedFile.streams(probedFile.audioStreamIndex()).privateCodecId();
                         ClipPostResult publishParam2 = this.mClipResult.publishParam;
                         if (i1 != 3) {
                            str = (i1 == 4)? "mp3": "unknown";
                         }
                      label_0108 :
                         publishParam2.audioCodec = str;
                      }
                      publishParam = this.mClipResult.publishParam;
                      if (probedFile.fileFormat() != b) {
                         b = false;
                      }
                      publishParam.isMp4 = b;
                   }
                }catch(java.io.IOException e0){
                   e0.printStackTrace();
                }catch(com.kwai.video.editorsdk2.EditorSdk2InternalErrorException e0){
                   e0.printStackTrace();
                }
             }else {
                tmClipResult = this.mClipExportHandler;
                if (tmClipResult != null && tmClipResult.getExportTaskStatsInfo() != null) {
                   ExportTaskStatsUnit exportTaskSt = this.mClipExportHandler.getExportTaskStatsInfo().getExportTaskStatsUnit();
                   if (exportTaskSt != null) {
                      this.mClipResult.publishParam.avgBitrate = exportTaskSt.getExportVideoBitrate();
                      this.mClipResult.publishParam.videoCodec = exportTaskSt.getEncoderCodec();
                      publishParam = this.mClipResult.publishParam;
                      publishParam.audioCodec = str;
                      publishParam.isMp4 = ("mp4").equals(exportTaskSt.getExportFormat());
                   }
                }
             }
          }
       }
       return;
    }
    public void cancel(){
       if (PatchProxy.applyVoid(null, this, ClipPostTask.class, "15")) {
          return;
       }
       KSClipLog.d("ClipPostTask", "cancel:"+this.mPostInfo.getId());
       ClipPostTask tmLock = this.mLock;
       _monitor_enter(tmLock);
       this.mIsCancel = true;
       if (!this.isStatusProcessing()) {
          this.onCancelCallback();
       }
       ClipPostTask tmClipExport = this.mClipExportHandler;
       if (tmClipExport != null) {
          tmClipExport.cancel();
          this.releasePipeline();
          this.mClipExportHandler = null;
       }
       tmClipExport = this.mUploadKit;
       if (tmClipExport != null) {
          tmClipExport.cancel();
       }
       tmClipExport = this.mClipWatermarkHandler;
       if (tmClipExport != null) {
          tmClipExport.cancel();
          this.mClipWatermarkHandler = null;
       }
       _monitor_exit(tmLock);
       return;
    }
    public void changeCoverUploadStatusWithoutPreUpload(int p0){
       this.mStatus.coverUploadStatusWithoutPreUpload = p0;
    }
    public void changeEncodeStatus(int p0){
       this.mStatus.encodeStatus = p0;
    }
    public void changeStatusFailedToIdle(){
       if (PatchProxy.applyVoid(null, this, ClipPostTask.class, "35")) {
          return;
       }
       ClipPostTask tmLock = this.mLock;
       _monitor_enter(tmLock);
       ClipPostTask tmStatus = this.mStatus;
       if (tmStatus.encodeStatus == 4) {
          tmStatus.encodeStatus = 1;
       }
       if (tmStatus.uploadStatus == 4) {
          tmStatus.uploadStatus = 1;
       }
       if (tmStatus.watermarkStatus == 4) {
          tmStatus.watermarkStatus = 1;
       }
       if (tmStatus.coverUploadStatusWithoutPreUpload == 4) {
          tmStatus.coverUploadStatusWithoutPreUpload = 1;
       }
       this.reset();
       _monitor_exit(tmLock);
       return;
    }
    public void changeUploadStatus(int p0){
       this.mStatus.uploadStatus = p0;
    }
    public void changeWatermarkStatus(int p0){
       this.mStatus.watermarkStatus = p0;
    }
    public boolean equals(Object p0){
       ClipPostTask obj = PatchProxy.applyOneRefs(p0, this, ClipPostTask.class, "43");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 instanceof ClipPostTask) {
          obj = this.mPostInfo;
          if (obj != null) {
             return obj.equals(p0.getPostInfo());
          }
       }
       return false;
    }
    public ClipPostResult getClipResult(){
       return this.mClipResult;
    }
    public int getCoverUploadStatusWithoutPreUpload(){
       return this.mStatus.coverUploadStatusWithoutPreUpload;
    }
    public int getEncodeStatus(){
       return this.mStatus.encodeStatus;
    }
    public final String getExportComment(){
       StringBuffer obj = PatchProxy.apply(null, this, ClipPostTask.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "";
       if (!TextUtils.isEmpty(this.mPostInfo.encodeInfo.comment)) {
          obj = obj+this.mPostInfo.encodeInfo.comment;
       }
       if (this.mPostInfo.encodeInfo.videoType != 10) {
          obj = obj+"[sessionId:"+this.mPostInfo.getId()+"]"+"[videoType:"+this.mPostInfo.encodeInfo.videoType+"]"+"[skipTranscode:"+ClipKitUtils.getLogSkipTransCode(this.mPostLogInfo.skipTransCode)+"]";
       }
       return obj;
    }
    public ClipPostInfo getPostInfo(){
       return this.mPostInfo;
    }
    public ClipPostStatus getStatus(){
       return this.mStatus;
    }
    public int getUploadStatus(){
       return this.mStatus.uploadStatus;
    }
    public int getWatermarkStatus(){
       return this.mStatus.watermarkStatus;
    }
    public boolean isEncodeUploadFailed(){
       ClipPostTask tmStatus = this.mStatus;
       boolean b = (tmStatus.encodeStatus != 4 && (tmStatus.uploadStatus == 4 || tmStatus.coverUploadStatusWithoutPreUpload == 4))? true: false;
       return b;
    }
    public boolean isEncodeUploadProcessing(){
       ClipPostTask tmStatus = this.mStatus;
       boolean b = (tmStatus.encodeStatus != 2 && (tmStatus.uploadStatus == 2 || tmStatus.coverUploadStatusWithoutPreUpload == 2))? true: false;
       return b;
    }
    public boolean isEncodeUploadSuccess(){
       Object obj = PatchProxy.apply(null, this, ClipPostTask.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (ClipPostInfo.isNeedEncode(this.mPostInfo.postFlag) && !this.isStatusEncodeSuccess()) {
          return false;
       }
       if (ClipPostInfo.isNeedUpload(this.mPostInfo.postFlag) & (this.isStatusUploadSuccess() ^ 1)) {
          return false;
       }
       if (ClipPostInfo.isNeedUploadCoverAfterPublish(this.mPostInfo.postFlag) & (this.isStatusCoverUploadWithoutPreUploadSuccess() ^ 1)) {
          return false;
       }
       return 1;
    }
    public boolean isError(){
       boolean b = (this.mClipPostException != null)? true: false;
       return b;
    }
    public final boolean isFallbackErrorCode(int p0){
       ClipPostTask uClipPostTas = ClipPostTask.class;
       if (PatchProxy.isSupport(uClipPostTas)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uClipPostTas, "41");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (ClipDPHardwareConfigManager.getInstance().fallBackDecoderConfig(this.mApplicationContext, this.mPostInfo.encodeInfo.project, p0)) {
          KSClipLog.w("ClipPostTask", "hardwareDecode failed,auto fallback to soft decode");
          return true;
       }else if(ClipDPHardwareConfigManager.getInstance().isEncodeFallbackErrorCode(p0)){
          this.mPostInfo.encodeInfo.exportOptions.setVideoEncoderType(true);
          this.mDisableHwEncode = true;
          KSClipLog.w("ClipPostTask", "hardwareEncode failed,auto fallback to soft encode");
          return true;
       }else {
          return false;
       }
    }
    public boolean isStatusContinue(){
       Object obj = PatchProxy.apply(null, this, ClipPostTask.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.isEncodeUploadSuccess()) {
          return false;
       }
       if (ClipPostInfo.isNeedWatermark(this.mPostInfo.postFlag) && !this.isStatusWatermarkContinue()) {
          return false;
       }
       return true;
    }
    public boolean isStatusCoverUploadWithoutPreUploadSuccess(){
       boolean b = (this.mStatus.coverUploadStatusWithoutPreUpload == 3)? true: false;
       return b;
    }
    public boolean isStatusEncodeSuccess(){
       boolean b = (this.mStatus.encodeStatus == 3)? true: false;
       return b;
    }
    public boolean isStatusFailed(){
       Object obj = PatchProxy.apply(null, this, ClipPostTask.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.isEncodeUploadFailed() || this.mStatus.watermarkStatus == 4)? true: false;
       return b;
    }
    public boolean isStatusIdle(){
       Object obj = PatchProxy.apply(null, this, ClipPostTask.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.mIsCancel != null) {
          return false;
       }
       if (this.isStatusProcessing()) {
          return false;
       }
       if (ClipPostInfo.isNeedEncode(this.mPostInfo.postFlag) && this.mStatus.encodeStatus == true) {
          return true;
       }
       if (ClipPostInfo.isNeedEncode(this.mPostInfo.postFlag) && this.mStatus.encodeStatus == 4) {
          return false;
       }
       if (ClipPostInfo.isNeedUpload(this.mPostInfo.postFlag) && this.mStatus.uploadStatus == true) {
          return true;
       }
       if (ClipPostInfo.isNeedWatermark(this.mPostInfo.postFlag) && this.mStatus.watermarkStatus == true) {
          return true;
       }
       return false;
    }
    public boolean isStatusProcessing(){
       Object obj = PatchProxy.apply(null, this, ClipPostTask.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.isEncodeUploadProcessing() || this.mStatus.watermarkStatus == 2)? true: false;
       return b;
    }
    public boolean isStatusSuccess(){
       Object obj = PatchProxy.apply(null, this, ClipPostTask.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.isEncodeUploadSuccess()) {
          return false;
       }
       if (ClipPostInfo.isNeedWatermark(this.mPostInfo.postFlag) && !this.isStatusWatermarkSuccess()) {
          return false;
       }
       return true;
    }
    public boolean isStatusUploadSuccess(){
       boolean b = (this.mStatus.uploadStatus == 3)? true: false;
       return b;
    }
    public boolean isStatusWatermarkContinue(){
       ClipPostInfo obj = PatchProxy.apply(null, this, ClipPostTask.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.isStatusWatermarkSuccess()) {
          return b;
       }
       obj = this.mPostInfo.watermarkParam;
       if (obj == null || obj.ignoreFailStatus == null) {
          return false;
       }
       if (this.mStatus.watermarkStatus != 4) {
          b = false;
       }
       return b;
    }
    public boolean isStatusWatermarkSuccess(){
       boolean b = (this.mStatus.watermarkStatus == 3)? true: false;
       return b;
    }
    public final boolean isWaitUpload(){
       ClipPostTask obj = PatchProxy.apply(null, this, ClipPostTask.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mPostInfo;
       boolean b = (obj.uploadInfo == null && ClipPostInfo.isNeedUpload(obj.postFlag))? true: false;
       return b;
    }
    public final boolean isWaitingForUploadCover(){
       Object obj = PatchProxy.apply(null, this, ClipPostTask.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (!ClipPostInfo.isNeedUploadCoverAfterPublish(this.mPostInfo.postFlag) || b != this.mStatus.coverUploadStatusWithoutPreUpload) {
          b = false;
       }
       return b;
    }
    public void onCancelCallback(){
       if (PatchProxy.applyVoid(null, this, ClipPostTask.class, "21")) {
          return;
       }
       int i = 1;
       Object[] objArray = new Object[i];
       objArray[0] = this.mPostInfo.id;
       KSClipLog.i("ClipPostTask", String.format("onCancelCallback\(%s\)", objArray));
       ClipPostTask tmClipPostLi = this.mClipPostListener;
       if (!this.isStatusProcessing() && tmClipPostLi != null) {
          if (this.mIsFinishReported == null) {
             ClipPostTask tmPostLogInf = this.mPostLogInfo;
             if (tmPostLogInf != null) {
                this.mIsFinishReported = i;
                tmPostLogInf.setUserWaitEndTime(this.mPostInfo.postFlag);
                this.reportPostStatus(9);
             }
          }
          if (this.mHasNotifiedCancel == null) {
             this.mHasNotifiedCancel = i;
             tmClipPostLi.onCancel(this.mPostInfo.id);
          }
       }
    label_004e :
       return;
    }
    public void onCancelled(){
       if (PatchProxy.applyVoid(null, this, ClipPostTask.class, "40")) {
          return;
       }
       int i = 1;
       long l = 2;
       if (this.getEncodeStatus() == l) {
          this.mPostLogInfo.encodeEndTime = SystemClock.elapsedRealtime();
          this.changeEncodeStatus(i);
          ClipPostTask tmLock = this.mLock;
          _monitor_enter(tmLock);
          this.resetProjectOutPutWH();
          if (this.mIsEnablePipeline != null) {
             this.releasePipeline();
             KSClipLog.d("ClipPostTask", "releasePipeline onCancelled");
          }
          _monitor_exit(tmLock);
          this.onStatusChangedCallback();
          this.onCancelCallback();
       }else if(this.getWatermarkStatus() == l){
          this.changeWatermarkStatus(i);
          this.onStatusChangedCallback();
       }
       return;
    }
    public final void onEncodeFinishCallback(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipPostTask.class, "23")) {
          return;
       }
       this.mPostLogInfo.encodeProgress = 0x3ff0000000000000;
       this.onProgressCallback();
       this.changeEncodeStatus(3);
       this.mClipResult.outPutPath = p0;
       this.buildPostPublishParam();
       this.onStatusChangedCallback();
       ClipPostTask tmLock = this.mLock;
       _monitor_enter(tmLock);
       if (this.mIsEnablePipeline != null) {
          if (this.getUploadStatus() != 2 && !this.isWaitUpload()) {
             this.releasePipeline();
             KSClipLog.d("ClipPostTask", "releasePipeline encode complete");
          }
          ClipPostTask tmUploadKit = this.mUploadKit;
          if (tmUploadKit != null) {
             tmUploadKit.finishUploadSegment();
          }
       }else {
          this.startUploadIfNeed();
       }
       this.startWatermarkIfNeed();
       _monitor_exit(tmLock);
       return;
    }
    public void onError(ClipExportException p0){
       ClipPostTask tmLock;
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipPostTask.class, "42")) {
          return;
       }
       long l = 2;
       if (this.getEncodeStatus() == l) {
          this.mPostLogInfo.encodeEndTime = SystemClock.elapsedRealtime();
          tmLock = this.mLock;
          _monitor_enter(tmLock);
          this.resetProjectOutPutWH();
          if (this.mClipPostException == null) {
             this.mClipPostException = new ClipPostException();
          }
          this.mClipPostException.exportException = p0;
          ClipPostTask tmUploadKit = this.mUploadKit;
          if (tmUploadKit != null) {
             tmUploadKit.cancel();
          }
          if (this.mIsEnablePipeline != null) {
             this.releasePipeline();
             KSClipLog.d("ClipPostTask", "releasePipeline onError");
          }
          _monitor_exit(tmLock);
          this.changeEncodeStatus(4);
          if (this.isFallbackErrorCode(p0.errorCode)) {
             this.start(true);
             return;
          }else {
             this.onStatusChangedCallback();
          }
       }else if(this.getWatermarkStatus() == l){
          tmLock = this.mLock;
          _monitor_enter(tmLock);
          if (this.mClipPostException == null) {
             this.mClipPostException = new ClipPostException();
          }
          this.mClipPostException.watermarkException = p0;
          _monitor_exit(tmLock);
          this.changeWatermarkStatus(4);
          this.onStatusChangedCallback();
       }
       return;
    }
    public void onFinish(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipPostTask.class, "39")) {
          return;
       }
       long l = 2;
       if (this.getEncodeStatus() == l) {
          this.mPostLogInfo.encodeEndTime = SystemClock.elapsedRealtime();
          this.resetProjectOutPutWH();
          this.onEncodeFinishCallback(p0);
       }else if(this.getWatermarkStatus() == l){
          this.mPostLogInfo.watermarkProgress = 0x3ff0000000000000;
          this.onProgressCallback();
          this.changeWatermarkStatus(3);
          this.mClipResult.watermarkPath = p0;
          this.onStatusChangedCallback();
       }
       return;
    }
    public void onProgress(double p0){
       ClipPostTask uClipPostTas = ClipPostTask.class;
       if (PatchProxy.isSupport(uClipPostTas) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, uClipPostTas, "36")) {
          return;
       }
       if (this.getEncodeStatus() == 2) {
          this.mPostLogInfo.encodeProgress = p0;
          this.onProgressCallback();
       }else if(this.getWatermarkStatus() == 2){
          this.mPostLogInfo.watermarkProgress = p0;
          this.onProgressCallback();
       }
       return;
    }
    public void onProgressCallback(){
       if (PatchProxy.applyVoid(null, this, ClipPostTask.class, "22")) {
          return;
       }
       Object[] objArray = new Object[]{this.mPostInfo.id,Double.valueOf(this.mPostLogInfo.encodeProgress),Double.valueOf(this.mPostLogInfo.uploadProgress),Double.valueOf(this.mPostLogInfo.watermarkProgress)};
       KSClipLog.v("ClipPostTask", String.format("onProgressCallback\(%s\) encode:%.2f,upload:%.2f,watermark:%.2f", objArray));
       ClipPostTask tmClipPostLi = this.mClipPostListener;
       if (tmClipPostLi != null) {
          ClipPostTask tmPostLogInf = this.mPostLogInfo;
          tmClipPostLi.onProgress(this.mPostInfo.id, tmPostLogInf.encodeProgress, tmPostLogInf.uploadProgress, tmPostLogInf.watermarkProgress);
       }
       return;
    }
    public void onSegmentEncoded(ExportTask p0,EncodedSegmentInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ClipPostTask.class, "44")) {
          return;
       }
       if (this.getEncodeStatus() == 2) {
          int i = (p1.isVideoSegment())? (int)(p1.getSegmentDuration() * 0x408f400000000000): 0;
          KSUploaderKitSegmentInfo kSUploaderKi = new KSUploaderKitSegmentInfo(p0.getFilePath(), 0, i);
          kSUploaderKi.setRange((long)p1.getStartByte(), (long)((p1.getStartByte() + p1.getByteLength()) - 1));
          ClipPostTask tmLock = this.mLock;
          _monitor_enter(tmLock);
          this.mSegmentInfos.add(kSUploaderKi);
          ClipPostTask tmUploadKit = this.mUploadKit;
          if (tmUploadKit != null) {
             tmUploadKit.uploadSegment(kSUploaderKi);
          }
          _monitor_exit(tmLock);
       }
       return;
    }
    public void onStart(int p0,int p1){
       ClipPostTask uClipPostTas = ClipPostTask.class;
       if (PatchProxy.isSupport(uClipPostTas) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uClipPostTas, "37")) {
          return;
       }
       if (ClipPostInfo.isNeedEncode(this.mPostInfo.postFlag) && this.getEncodeStatus() != 3) {
          uClipPostTas = this.mPostLogInfo;
          uClipPostTas.skipTransCode = p0;
          uClipPostTas.transcodeReason = p1;
          this.setupComment();
          if (p0 != 1) {
             this.mIsEnablePipeline = false;
          }
       }
       return;
    }
    public void onStatusChangedCallback(){
       if (PatchProxy.applyVoid(null, this, ClipPostTask.class, "20")) {
          return;
       }
       ClipPostTask tmLock = this.mLock;
       _monitor_enter(tmLock);
       int i = 1;
       if (this.mIsFinishReported == null && !this.isEncodeUploadProcessing()) {
          this.mPostLogInfo.setUserWaitEndTime(this.mPostInfo.postFlag);
          if (this.isEncodeUploadSuccess()) {
             this.mIsFinishReported = this.reportPostStatus(7);
          }else if(this.isEncodeUploadFailed() && this.mHasReportedEncodeUploadFail == null){
             ClipPostTask tmPostLogInf = this.mPostLogInfo;
             if (tmPostLogInf != null && tmPostLogInf.userWaitStartTime - null) {
                this.mHasReportedEncodeUploadFail = i;
                this.reportPostStatus(8);
             }
          }
       }
       _monitor_exit(tmLock);
       Object[] objArray = new Object[]{this.mPostInfo.id,this.mStatus.toString()};
       KSClipLog.i("ClipPostTask", String.format("onStatusChangedCallback\(%s\) status %s", objArray));
       tmLock = this.mClipPostListener;
       if (tmLock != null) {
          tmLock.onStatusChange(this.mPostInfo.id, this.mStatus.clone(), this.mClipResult, this.mClipPostException);
       }
       return;
    }
    public void releasePipeline(){
       if (PatchProxy.applyVoid(null, this, ClipPostTask.class, "27")) {
          return;
       }
       ClipPostTask tmClipExport = this.mClipExportHandler;
       if (tmClipExport != null) {
          tmClipExport.releasePipeline();
       }
       this.mSegmentInfos.clear();
       return;
    }
    public final boolean reportPostStatus(int p0){
       ClipPostTask uClipPostTas = ClipPostTask.class;
       if (PatchProxy.isSupport(uClipPostTas)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uClipPostTas, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.reportPostStatusInternal(p0, false);
    }
    public void reportPostStatusExternal(int p0){
       ClipPostTask uClipPostTas = ClipPostTask.class;
       if (PatchProxy.isSupport(uClipPostTas) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uClipPostTas, "5")) {
          return;
       }
       if (7 == p0) {
          uClipPostTas = this.mLock;
          _monitor_enter(uClipPostTas);
          ClipPostTask tmClipPostEx = this.mClipPostException;
          if (tmClipPostEx != null && (tmClipPostEx.exportException == null && tmClipPostEx.uploadException != null)) {
             this.mClipPostException = null;
          }
       label_002a :
          _monitor_exit(uClipPostTas);
       }
       this.reportPostStatusInternal(p0, true);
       return;
    }
    public final boolean reportPostStatusInternal(int p0,boolean p1){
       ClipEditPostLog obj;
       ClipPostTask uClipPostTas = ClipPostTask.class;
       if (PatchProxy.isSupport(uClipPostTas)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, uClipPostTas, "6");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       ClipPostTask tmPostLogInf = this.mPostLogInfo;
       if (tmPostLogInf != null && tmPostLogInf.userWaitStartTime - null) {
          obj = new ClipEditPostLog(this.mApplicationContext, this.mPostInfo, this.mStatus, tmPostLogInf, this.mClipPostException, this.mIsEnablePipeline, this.mRetryCount, this.mExtraInfo, p1);
          ClipEditLogger.reportPostLog(p0, v10);
          return true;
       }else {
          return false;
       }
    }
    public final void reset(){
       if (PatchProxy.applyVoid(null, this, ClipPostTask.class, "3")) {
          return;
       }
       KSClipLog.d("ClipPostTask", "reset");
       ClipPostTaskLogInfo uClipPostTas = new ClipPostTaskLogInfo();
       this.mPostLogInfo = uClipPostTas;
       this.mOriginEncodeProjectOutputHeight = 0;
       this.mOriginEncodeProjectOutputWidth = 0;
       ClipPostTask tmCacheUserW = this.mCacheUserWaitStartTime;
       long l = 0;
       if (tmCacheUserW - l) {
          uClipPostTas.userWaitStartTime = tmCacheUserW;
          this.mCacheUserWaitStartTime = l;
       }
       if (this.mClipResult != null) {
          if (this.getEncodeStatus() != 3 || !new File(this.mPostInfo.exportPath).exists()) {
             if (this.getEncodeStatus() != 2) {
                this.changeEncodeStatus(1);
             }
             this.mClipResult.outPutPath = null;
          }
          if (this.getUploadStatus() != 3) {
             this.changeUploadStatus(1);
             ClipPostTask tmClipResult = this.mClipResult;
             tmClipResult.uploadToken = null;
             tmClipResult.coverToken = null;
          }
       }else {
          this.mClipResult = new ClipPostResult();
       }
       this.mClipPostException = null;
       this.mIsCancel = false;
       this.mIsFinishReported = false;
       this.mHasReportedEncodeUploadFail = false;
       this.mHasNotifiedCancel = false;
       this.releasePipeline();
       this.mForceDisableResume = false;
       return;
    }
    public final void resetProjectOutPutWH(){
       if (PatchProxy.applyVoid(null, this, ClipPostTask.class, "38")) {
          return;
       }
       ClipPostTask tmOriginEnco = this.mOriginEncodeProjectOutputWidth;
       if (tmOriginEnco > null && this.mOriginEncodeProjectOutputHeight > null) {
          this.mPostInfo.encodeInfo.project.setProjectOutputWidth(tmOriginEnco);
          this.mPostInfo.encodeInfo.project.setProjectOutputHeight(this.mOriginEncodeProjectOutputHeight);
          this.mOriginEncodeProjectOutputHeight = 0;
          this.mOriginEncodeProjectOutputWidth = 0;
       }
       return;
    }
    public void setClipPostListener(ClipPostListener p0){
       this.mClipPostListener = p0;
    }
    public void setExtraInfo(ClipEditExtraInfo p0){
       this.mExtraInfo = p0;
    }
    public final EditorSdk2$ExportOptions setUpConfig(EditorSdk2V2$VideoEditorProject p0,EditorSdk2$ExportOptions p1,int p2,int p3,boolean p4){
       Object[] objArray;
       EditorSdk2$ExportOptions obj;
       boolean b;
       ClipPostInfo editorEncode;
       EditorEncodeConfigModule$ExportParam isSupportPip;
       ClipPostTask uClipPostTas1;
       CapeHandlerInterface uCapeHandler = this;
       object oobject = p0;
       int i = p2;
       ClipPostTask uClipPostTas = ClipPostTask.class;
       int i1 = 4;
       int i2 = 3;
       int i3 = 2;
       int i4 = 5;
       if (PatchProxy.isSupport(uClipPostTas)) {
          objArray = new Object[i4];
          objArray[0] = oobject;
          objArray[1] = p1;
          objArray[i3] = Integer.valueOf(p2);
          objArray[i2] = Integer.valueOf(p3);
          objArray[i1] = Boolean.valueOf(p4);
          obj = PatchProxy.apply(objArray, uCapeHandler, uClipPostTas, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = (p1 == null)? EditorSdk2Utils.createDefaultExportOptions(): p1;
       ClipPostTask mPostInfo = uCapeHandler.mPostInfo;
       ClipPostInfo$ClipEncodeInfo exportShapeT = (!p4)? mPostInfo.encodeInfo.exportShapeType: mPostInfo.watermarkParam.exportShapeType;
       if (p3 == 1) {
          b = (obj.outputFormat() == i3)? true: false;
          i = (obj.videoEncoderType() == i4)? true: false;
          if (!p4) {
             uCapeHandler.mPostLogInfo.useHardwareEncode = i;
             uCapeHandler.mIsEnablePipeline = b;
          }
          objArray = new Object[i4];
          objArray[0] = Integer.valueOf(p3);
          objArray[1] = Integer.valueOf(obj.width());
          objArray[i3] = Integer.valueOf(obj.height());
          objArray[i2] = Boolean.valueOf(b);
          objArray[i1] = Boolean.valueOf(i);
          KSClipLog.d("ClipPostTask", String.format("setUpConfig optionsFlag:%d,exportWidth:%d,exportHeight:%d,supportPipeline:%b,useHardwareEncode:%b", objArray));
          return obj;
       }else if(!p4){
          editorEncode = uCapeHandler.mPostInfo.editorEncodeConfigModule;
       }else {
          editorEncode = null;
       }
       if (editorEncode == null) {
          editorEncode = EditorEncodeConfigManager.getInstance().getEditorEncodeConfigModule(uCapeHandler.mApplicationContext, oobject, i);
       }
       if (editorEncode != null) {
          EditorEncodeConfigModule exportParam = editorEncode.exportParam;
          ClipPostInfo encodeInfo = uCapeHandler.mPostInfo.encodeInfo;
          if (encodeInfo != null && encodeInfo.localExportOption != null) {
             exportParam.isSupportPipleline = false;
             EditorEncodeConfig$LocalVideoEncodeConfig localVideoEn = EditorEncodeConfigManager.getInstance().filterLocalVideoEncodeConfig(uCapeHandler.mPostInfo.encodeInfo.localExportOption);
             if (localVideoEn != null) {
                exportParam.width = localVideoEn.width;
                exportParam.height = localVideoEn.height;
                exportParam.x264Params = localVideoEn.x264params;
                exportParam.videoBitrate = (long)localVideoEn.videoBitrate;
                exportParam.videoGopSize = localVideoEn.videoGopSize;
                obj.setVideoFrameRate(EditorSdk2Utils.createRational(localVideoEn.fps, 1));
             }
             EditorEncodeConfig$AudioEncodeConfig uAudioEncode = EditorEncodeConfigManager.getInstance().filterAudioEncodeConfig();
             if (uAudioEncode != null) {
                exportParam.audioBitrate = (long)uAudioEncode.audioBitrate;
                exportParam.audioCutOff = uAudioEncode.audioCutOff;
                exportParam.audioProfile = uAudioEncode.audioProfile;
             }
          }
       label_010b :
          if (exportParam != null) {
             isSupportPip = exportParam.isSupportPipleline;
             CapeExportParams capeExportPa = exportParam.getCapeExportParams();
             EditorEncodeConfigManager.getInstance().getCapeConfig();
             if (capeExportPa != null) {
                ClipPostInfo encodeInfo1 = uCapeHandler.mPostInfo.encodeInfo;
                if (encodeInfo1 != null && encodeInfo1.forceCloseCape == null) {
                   uClipPostTas1 = 1;
                label_0129 :
                   if (uClipPostTas1) {
                      if (uCapeHandler.mCapeHandler == null) {
                         uCapeHandler.mCapeHandler = CapeManager.createCapeHandler(uCapeHandler.mApplicationContext.getApplicationContext());
                      }
                      uClipPostTas1 = uCapeHandler.mCapeHandler;
                      if (uClipPostTas1 != null) {
                         uClipPostTas1.setCapeExportParams(capeExportPa);
                      }
                   }else {
                      uCapeHandler.mCapeHandler = null;
                   }
                   EditorEncodeConfigModule$ExportParam x264ParamsPi = exportParam.x264ParamsPipeline;
                   i4 = (x264ParamsPi != null)? 1: 0;
                   if (i4 & isSupportPip) {
                      obj.setX264Params(x264ParamsPi);
                   }else {
                      x264ParamsPi = exportParam.x264Params;
                      if (x264ParamsPi != null) {
                         obj.setX264Params(x264ParamsPi);
                      }
                   }
                   x264ParamsPi = exportParam.x264Preset;
                   if (x264ParamsPi != null) {
                      obj.setX264Preset(x264ParamsPi);
                   }
                   x264ParamsPi = exportParam.height;
                   if (x264ParamsPi > null) {
                      EditorEncodeConfigModule$ExportParam width = exportParam.width;
                      if (width > null) {
                         Pair exportSize = ClipKitUtils.getExportSize(oobject, width, x264ParamsPi, i);
                         if (exportShapeT == 2) {
                            i = Math.max(exportSize.first.intValue(), exportSize.second.intValue());
                            obj.setWidth(i);
                            obj.setHeight(i);
                         }else {
                            obj.setWidth(exportSize.first.intValue());
                            obj.setHeight(exportSize.second.intValue());
                         }
                         if (!p4 && (uCapeHandler.mPostInfo.encodeInfo.project.projectOutputWidth() && uCapeHandler.mPostInfo.encodeInfo.project.projectOutputHeight())) {
                            uCapeHandler.mOriginEncodeProjectOutputWidth = uCapeHandler.mPostInfo.encodeInfo.project.projectOutputWidth();
                            uCapeHandler.mOriginEncodeProjectOutputHeight = uCapeHandler.mPostInfo.encodeInfo.project.projectOutputHeight();
                            uCapeHandler.mPostInfo.encodeInfo.project.setProjectOutputWidth(obj.width());
                            uCapeHandler.mPostInfo.encodeInfo.project.setProjectOutputHeight(obj.height());
                         }
                      }
                   }
                label_01ed :
                   obj.setSingleImageQuality(exportParam.singleImageQuality);
                   if (exportParam.supportHwEncode != null || uCapeHandler.mCapeHandler != null) {
                      if (uCapeHandler.mCapeHandler != null) {
                         obj.setVideoBitrate(exportParam.videoBitrate);
                      }
                      i = (obj.width() > 0)? obj.width(): EditorSdk2UtilsV2.getComputedWidth(p0);
                      b = (obj.height() > 0)? obj.height(): EditorSdk2UtilsV2.getComputedHeight(p0);
                      int i5 = Math.max(i, b);
                      if (i5 > 0) {
                         if (uCapeHandler.mDisableHwEncode != null) {
                            if (!p4) {
                               ClipPostTask mPostLogInfo = uCapeHandler.mPostLogInfo;
                               mPostLogInfo.softReason = 8;
                               mPostLogInfo.useHardwareEncode = false;
                            }
                         }else {
                            DPHardwareConfigManager$EncodeResult uEncodeResul = ClipDPHardwareConfigManager.getInstance().isSupportEncodeWithResult(uCapeHandler.mApplicationContext, "avc", i5, exportParam.minEncodeSpeed, true, ClipKitUtils.getBenchmarkEncodeProfile(exportParam.minProfile), exportParam.alignmentFlag);
                            ClipPostTask mCapeHandler = uCapeHandler.mCapeHandler;
                            if (mCapeHandler != null) {
                               mCapeHandler.setEnableHwEncode(uEncodeResul.isSupport);
                            }
                            if (uEncodeResul.isSupport == null) {
                               if (!p4) {
                                  uCapeHandler.mPostLogInfo.softReason = uEncodeResul.notSupportReason;
                               }
                            }else if(uEncodeResul.profile <= BenchmarkEncodeProfile.BASELINE.getValue()){
                               b = true;
                            }else {
                               b = false;
                            }
                            obj.setForceMediacodecBaseline(b);
                            obj.setVideoGopSize(exportParam.videoGopSize);
                            obj.setVideoBitrate(exportParam.videoBitrate);
                            if (exportParam.supportHwEncode != null) {
                               obj.setVideoEncoderType(5);
                               b = true;
                            label_029d :
                               obj.setAudioBitrate(exportParam.audioBitrate);
                               obj.setAudioCutoff(exportParam.audioCutOff);
                               obj.setAudioProfile(exportParam.audioProfile);
                            }else {
                               uCapeHandler.mPostLogInfo.softReason = 1;
                            }
                         }
                      }
                   }else {
                      uCapeHandler.mPostLogInfo.softReason = 1;
                   }
                label_01ff :
                   b = false;
                   goto label_029d ;
                }
             }
             uClipPostTas1 = null;
             goto label_0129 ;
          }else {
             b = false;
             isSupportPip = false;
          }
          obj.setSkipTranscodeConfig(editorEncode.skipTranscodeConfig.convertToProtoSkipTranscodeConfig());
       }else {
          b = false;
          isSupportPip = false;
       }
       if (!p4) {
          uCapeHandler.mPostLogInfo.useHardwareEncode = b;
          uCapeHandler.mIsEnablePipeline = isSupportPip;
       }
       Object[] objArray1 = new Object[]{Integer.valueOf(p3),Integer.valueOf(obj.width()),Integer.valueOf(obj.height()),Boolean.valueOf(isSupportPip),Boolean.valueOf(b)};
       KSClipLog.d("ClipPostTask", String.format("setUpConfig optionsFlag:%d,exportWidth:%d,exportHeight:%d,supportPipeline:%b,useHardwareEncode:%b", objArray1));
       return obj;
    }
    public void setUserWaitingStartTime(boolean p0){
       ClipPostTask uClipPostTas = ClipPostTask.class;
       if (PatchProxy.isSupport(uClipPostTas) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uClipPostTas, "16")) {
          return;
       }
       uClipPostTas = this.mLock;
       _monitor_enter(uClipPostTas);
       if (this.mPostLogInfo != null && (!this.isEncodeUploadProcessing() && (this.isEncodeUploadSuccess() || (!this.isWaitUpload() || (this.isStatusEncodeSuccess() || this.isWaitingForUploadCover()))))) {
          this.mPostLogInfo.userWaitStartTime = SystemClock.elapsedRealtime();
       }else {
          this.mCacheUserWaitStartTime = SystemClock.elapsedRealtime();
       }
       if (p0 && this.isError()) {
          this.start();
          _monitor_exit(uClipPostTas);
          return;
       }else {
          this.reportPostStatus(1);
          if (this.isEncodeUploadSuccess() && this.mIsFinishReported == null) {
             this.mIsFinishReported = this.reportPostStatus(7);
          }
          _monitor_exit(uClipPostTas);
          return;
       }
    }
    public void setUserWaitingStartTime(boolean p0,ClipPostInfo$ClipUploadInfo p1){
       ClipPostTask uClipPostTas = ClipPostTask.class;
       if (PatchProxy.isSupport(uClipPostTas) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uClipPostTas, "17")) {
          return;
       }
       uClipPostTas = this.mLock;
       _monitor_enter(uClipPostTas);
       if (!this.isWaitUpload()) {
          ClipPostTask tmPostInfo = this.mPostInfo;
          tmPostInfo.postFlag = tmPostInfo.postFlag | 0x08;
          tmPostInfo.coverUploadInfoWithoutPreUpload = p1;
       }
       _monitor_exit(uClipPostTas);
       this.setUserWaitingStartTime(p0);
       if (!this.isWaitUpload()) {
          this.startUploadCoverIfNeeded();
       }
       return;
    }
    public final void setupComment(){
       if (PatchProxy.applyVoid(null, this, ClipPostTask.class, "8")) {
          return;
       }
       ClipKitConfig config = ClipKitConfigManager.getInstance().getConfig();
       if (config != null) {
          EditorEncodeConfig editorEncode = config.getEditorEncodeConfig();
          if (editorEncode != null && editorEncode.getEnableComment()) {
             this.mPostInfo.encodeInfo.exportOptions.setComment(this.getExportComment());
          }
       }
       return;
    }
    public void start(){
       if (PatchProxy.applyVoid(null, this, ClipPostTask.class, "1")) {
          return;
       }
       this.start(false);
       return;
    }
    public void start(boolean p0){
       ClipPostTask uClipPostTas = ClipPostTask.class;
       if (PatchProxy.isSupport(uClipPostTas) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uClipPostTas, "2")) {
          return;
       }
       uClipPostTas = this.mLock;
       _monitor_enter(uClipPostTas);
       int i = 2;
       boolean b = true;
       if (this.getUploadStatus() == i) {
          this.mIsRetryStart = p0;
          this.mIsStartWhenUploadFinish = b;
          _monitor_exit(uClipPostTas);
          return;
       }else {
          this.reset();
          this.mRetryCount = this.mRetryCount + b;
          boolean b1 = false;
          this.mIsEnablePipeline = b1;
          if (p0) {
             this.mForceDisableResume = b;
          }
          try{
             boolean b2 = this.startEncodeIfNeed();
             if (this.mIsEnablePipeline != null || !b2) {
                b1 = this.startUploadIfNeed();
             }
             if (!p0) {
                this.mPostLogInfo.postMode = (this.isWaitUpload())? i: b;
                if (b2 || b1) {
                   this.reportPostStatus(b);
                }
             }
             KSClipLog.i("ClipPostTask", this.mPostInfo.getId()+" start success,isInnerRetry:"+p0+",isEncoding:"+b2+",isUploading:"+b1+",isWatermarking:"+this.startWatermarkIfNeed()+",retryCount:"+this.mRetryCount);
             _monitor_exit(uClipPostTas);
             return;
          }catch(java.lang.Exception e8){
             if (this.mClipPostException == null) {
                this.mClipPostException = new ClipPostException();
             }
             this.mClipPostException.exportException = new ClipExportException(100, -100003, "input param error,please check");
             this.changeEncodeStatus(4);
             this.onStatusChangedCallback();
             KSClipLog.e("ClipPostTask", "startEncodeIfNeed failed", e8);
             _monitor_exit(uClipPostTas);
             return;
          }
       }
    }
    public final boolean startEncodeIfNeed(){
       File uFile;
       ClipPostTask tmClipExport;
       Object[] objArray = null;
       ClipPostInfo obj = PatchProxy.apply(objArray, this, ClipPostTask.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.mIsCancel == null && (!this.isError() && ClipPostInfo.isNeedEncode(this.mPostInfo.postFlag))) {
          int i = 2;
          if (this.getEncodeStatus() == 1) {
             obj = this.mPostInfo.encodeInfo;
             obj.exportOptions = this.setUpConfig(obj.project, obj.exportOptions, obj.videoType, obj.exportOptionsFlag, false);
             if (TextUtils.isEmpty(this.mPostInfo.encodeInfo.comment)) {
                obj = this.mPostInfo.encodeInfo;
                obj.comment = obj.exportOptions.comment();
             }
             this.setupComment();
             if (this.mIsEnablePipeline != null) {
                this.mPostInfo.encodeInfo.exportOptions.setOutputFormat(i);
                if (TextUtils.isEmpty(this.mPostInfo.encodeInfo.exportOptions.temporaryFilesDirectory())) {
                   if (!TextUtils.isEmpty(this.mPostInfo.exportPath)) {
                      objArray = new File(this.mPostInfo.exportPath).getParentFile();
                   }
                   if (objArray == null) {
                      objArray = ClipKitUtils.getCacheDirFile(this.mApplicationContext);
                   }
                   uFile = new File(objArray, "mid-"+(System.currentTimeMillis() / 1000)+"-"+new Random().nextInt(1000));
                   if (!uFile.exists()) {
                      uFile.mkdir();
                   }
                   this.mPostInfo.encodeInfo.exportOptions.setTemporaryFilesDirectory(uFile.getAbsolutePath());
                }
                KSClipLog.d("ClipPostTask", "exportOption temporaryFilesDirectory:"+this.mPostInfo.encodeInfo.exportOptions.temporaryFilesDirectory());
             }
             ClipPostTask tmPostInfo = this.mPostInfo;
             ClipPostInfo encodeInfo = tmPostInfo.encodeInfo;
             boolean ClipExportHandler encodeInfo1 = new ClipExportHandler(this.mApplicationContext, encodeInfo.project, tmPostInfo.exportPath, encodeInfo.exportOptions, encodeInfo.remuxFlag);
             this.mClipExportHandler = uFile;
             ClipPostInfo$ClipEncodeInfo externalFilt = this.mPostInfo.encodeInfo.externalFilterRequestListenerV2;
             if (externalFilt != null) {
                uFile.setExternalFilterRequestListenerV2(externalFilt);
             }
             EditorEncodeConfig$CapeConfig capeConfig = EditorEncodeConfigManager.getInstance().getCapeConfig();
             if (capeConfig != null && (this.mCapeHandler != null && capeConfig.enableCape())) {
                tmPostInfo = this.mPostInfo;
                if (tmPostInfo.encodeInfo.forceCloseCape == null) {
                   if ((capeConfig.capeFeature & 1) > 0) {
                      ClipPostInfo uploadInfo = tmPostInfo.uploadInfo;
                      if (uploadInfo == null || uploadInfo.enableUpload == null) {
                         capeConfig = capeConfig.copy();
                         capeConfig.openUploadDecision = b;
                         KSClipLog.i("ClipPostTask", "CLOSE_UPLOAD_DECISION_WHEN_ENCODE_AND_UPLOAD_SEPARATE");
                      }
                   }
                   this.mCapeHandler.setCapeSessionId(this.mPostInfo.encodeInfo.capeSessionId);
                   this.mCapeHandler.setCapeConfig(capeConfig);
                   this.mClipExportHandler.setCapeHandler(this.mCapeHandler);
                   if (this.mPostInfo.encodeInfo.exportOptions.skipTranscodeConfig() != null) {
                      this.mPostInfo.encodeInfo.exportOptions.skipTranscodeConfig().setUploadDecisionMaxBytes((int)capeConfig.uploadDecisionMaxBytes);
                      this.mPostInfo.encodeInfo.exportOptions.skipTranscodeConfig().setEnableUploadDecision(capeConfig.openUploadDecision);
                   }
                }
             }
          label_0199 :
             this.mClipExportHandler.setSessionId(this.mPostInfo.id, this.mExtraInfo);
             this.mClipExportHandler.setVideoType(this.mPostInfo.encodeInfo.videoType);
             this.mClipExportHandler.setSoftReason(this.mPostLogInfo.softReason);
             this.mClipExportHandler.setClipExportListener(this);
             this.mClipExportHandler.setNeedRemuxForPipeline((this.mPostInfo.willAddWatermark ^ 1));
             tmClipExport = this.mClipExportHandler;
             boolean b1 = (this.mPostInfo.postBusiness == 1)? true: false;
             tmClipExport.setForceTransCode(b1);
             this.mClipExportHandler.run();
             this.mPostLogInfo.encodeStartTime = SystemClock.elapsedRealtime();
             tmClipExport = this.mCapeHandler;
             if (tmClipExport != null && tmClipExport.getOutputExportOptions() != null) {
                tmClipExport = this.mPostLogInfo;
                ClipPostTaskLogInfo useHardwareE = tmClipExport.useHardwareEncode;
                encodeInfo1 = (this.mCapeHandler.getOutputExportOptions().videoEncoderType() == 5)? true: false;
                tmClipExport.useHardwareEncode = encodeInfo1;
                tmClipExport = this.mPostLogInfo;
                if (tmClipExport.useHardwareEncode != null) {
                   tmClipExport.softReason = b;
                }else if(useHardwareE != null){
                   tmClipExport.softReason = 10;
                }
                tmClipExport.setCapeStats(this.mCapeHandler.getCAPEStatsUnit());
             }
             this.changeEncodeStatus(i);
             this.onStatusChangedCallback();
          label_0229 :
             b = true;
          }else if(this.getEncodeStatus() == i){
             this.mIsEnablePipeline = b;
             goto label_0229 ;
          }else if(this.getEncodeStatus() == 3){
             this.mPostLogInfo.encodeProgress = 0x3ff0000000000000;
             this.onProgressCallback();
             tmClipExport = this.mPostLogInfo;
             long l = SystemClock.elapsedRealtime();
             tmClipExport.encodeStartTime = l;
             tmClipExport.encodeEndTime = l;
             this.mClipResult.outPutPath = this.mPostInfo.exportPath;
          }
          KSClipLog.d("ClipPostTask", "startEncodeIfNeed transcode:"+this.mPostLogInfo.skipTransCode+",status:"+this.getEncodeStatus());
       }
    label_0271 :
       return b;
    }
    public void startUploadCoverIfNeeded(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ClipPostTask.class, "14")) {
          return;
       }
       String str = "ClipPostTask";
       KSClipLog.i(str, this.mPostInfo.getId()+"start upload cover if needed");
       if (ClipPostInfo.isNeedUploadCoverAfterPublish(this.mPostInfo.postFlag) && (this.isStatusUploadSuccess() && !this.isStatusCoverUploadWithoutPreUploadSuccess())) {
          KSClipLog.i(str, this.mPostInfo.getId()+"start upload cover after pre upload video successfully");
          this.changeCoverUploadStatusWithoutPreUpload(2);
          this.onStatusChangedCallback();
          ClipPostTask tmUploadKit = this.mUploadKit;
          if (tmUploadKit != null) {
             tmUploadKit.release();
             this.mUploadKit = objArray;
          }
          ClipPostInfo coverUploadI = this.mPostInfo.coverUploadInfoWithoutPreUpload;
          KSUploaderKitConfig kSUploaderKi = new KSUploaderKitConfig(coverUploadI.coverAuthentication, coverUploadI.coverPath, this.mPostInfo.getId()+"_Cover", KSUploaderKitCommon$MediaType.Image, KSUploaderKitCommon$ServiceType.General);
          objArray.setSessionID(this.mPostInfo.getId());
          KSUploaderKit kSUploaderKi1 = new KSUploaderKit(this.mApplicationContext, objArray);
          this.mUploadKit = kSUploaderKi1;
          kSUploaderKi1.setEventListener(new ClipPostTask$2(this));
          this.mUploadKit.startUpload();
          this.mPostLogInfo.uploadCoverWithoutPreUploadStartTime = SystemClock.elapsedRealtime();
       }
    label_00b8 :
       return;
    }
    public final boolean startUploadIfNeed(){
       ClipPostTask tmPostInfo;
       KSUploaderKitCommon$MediaType file;
       String[] stringArray;
       KSUploaderKitConfig kSUploaderKi;
       KSUploaderKitConfig kSUploaderKi2;
       Object[] objArray = null;
       ClipPostInfo obj = PatchProxy.apply(objArray, this, ClipPostTask.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       boolean b1 = false;
       if (this.mIsCancel == null && (!this.isError() && ClipPostInfo.isNeedUpload(this.mPostInfo.postFlag))) {
          obj = this.mPostInfo.uploadInfo;
          StringBuilder str = "ClipPostTask";
          if (obj == null) {
             KSClipLog.i(str, "startUploadIfNeed return false,wait set UploadInfo");
             return b1;
          }else if(obj.enableUpload == null){
             KSClipLog.i(str, "startUploadIfNeed return false, disable upload");
             return b1;
          }else {
             KSClipLog.d(str, "startUploadIfNeed status:"+this.getUploadStatus());
             str = 3;
             if (this.getUploadStatus() == b) {
                tmPostInfo = this.mPostInfo;
                String str1 = "_";
                if (tmPostInfo.uploadInfo.uploadType != b && tmPostInfo.encodeInfo.videoType == 2) {
                   file = KSUploaderKitCommon$MediaType.File;
                   ArrayList uArrayList = new ArrayList();
                   ArrayList uArrayList1 = new ArrayList();
                   ArrayList uArrayList2 = new ArrayList();
                   if (!TextUtils.isEmpty(this.mPostInfo.uploadInfo.authentication)) {
                      uArrayList.add(this.mPostInfo.uploadInfo.authentication);
                   }
                   uArrayList1.add(this.mPostInfo.exportPath);
                   if (!TextUtils.isEmpty(this.mPostInfo.uploadInfo.coverAuthentication) && !TextUtils.isEmpty(this.mPostInfo.uploadInfo.coverPath)) {
                      uArrayList.add(this.mPostInfo.uploadInfo.coverAuthentication);
                      uArrayList1.add(this.mPostInfo.uploadInfo.coverPath);
                   }
                   ClipPostInfo$ClipUploadInfo extraUploadI = this.mPostInfo.uploadInfo.extraUploadInfos;
                   if (extraUploadI != null) {
                      Iterator iterator = extraUploadI.iterator();
                      while (iterator.hasNext()) {
                         ClipPostInfo$ClipExtraUploadInfo uClipExtraUp = iterator.next();
                         if (!TextUtils.isEmpty(uClipExtraUp.authentication)) {
                            uArrayList.add(uClipExtraUp.authentication);
                         }
                         uArrayList1.add(uClipExtraUp.sourcePath);
                      }
                   }
                   for (int i = 0; i < uArrayList1.size(); i = i + 1) {
                      uArrayList2.add(ClipKitUtils.createSessionId()+str1+this.mRetryCount+str1+i);
                   }
                   if (uArrayList.size() > 0) {
                      stringArray = new String[b1];
                      stringArray = uArrayList.toArray(stringArray);
                   }
                   String[] stringArray1 = new String[b1];
                   String[] stringArray2 = new String[b1];
                   kSUploaderKi = new KSUploaderKitConfig(stringArray, uArrayList1.toArray(stringArray1), uArrayList2.toArray(stringArray2));
                }else if(EditorSdk2UtilsV2.isSingleImagePath(tmPostInfo.exportPath)){
                   file = KSUploaderKitCommon$MediaType.Image;
                }else if(!TextUtils.isEmpty(this.mPostInfo.uploadInfo.coverPath)){
                   file = KSUploaderKitCommon$MediaType.VideoWithCover;
                }else {
                   file = KSUploaderKitCommon$MediaType.Video;
                }
                String str2 = ClipKitUtils.createSessionId()+str1+this.mRetryCount;
                ClipPostTask tmPostInfo1 = this.mPostInfo;
                ClipPostInfo uploadInfo = tmPostInfo1.uploadInfo;
                ClipPostInfo$ClipUploadInfo uploadType = uploadInfo.uploadType;
                if (uploadType == b) {
                   kSUploaderKi2 = new KSUploaderKitConfig(uploadInfo.authentication, tmPostInfo1.exportPath, file);
                   kSUploaderKi2.setCoverPath(this.mPostInfo.uploadInfo.coverPath);
                   kSUploaderKi = kSUploaderKi2;
                }else if(uploadType == 2 || uploadType == str){
                   kSUploaderKi2 = new KSUploaderKitConfig(uploadInfo.authentication, tmPostInfo1.exportPath, str2, file, KSUploaderKitCommon$ServiceType.General);
                   ClipPostInfo uploadInfo2 = this.mPostInfo.uploadInfo;
                   uploadInfo.setCoverPathAndToken(uploadInfo2.coverPath, uploadInfo2.coverAuthentication);
                }else if(this.mClipPostException == null){
                   this.mClipPostException = new ClipPostException();
                }
                this.mClipPostException.uploadException = new ClipUploadException(-100, "UnSupport UploadType:"+this.mPostInfo.uploadInfo.uploadType);
                this.changeUploadStatus(4);
                this.onStatusChangedCallback();
                return b1;
                kSUploaderKi.setTaskID(str2);
                if (ClipPostInfo.isNeedEncode(this.mPostInfo.postFlag)) {
                   KSUploaderKitCommon$UploadMode fragement = (this.mIsEnablePipeline != null)? KSUploaderKitCommon$UploadMode.Fragement: KSUploaderKitCommon$UploadMode.Whole;
                   kSUploaderKi.setUploadMode(fragement);
                }else {
                   kSUploaderKi.setUploadMode(KSUploaderKitCommon$UploadMode.Whole);
                }
                kSUploaderKi.setDurationMS((long)(EditorSdk2UtilsV2.getComputedDuration(this.mPostInfo.encodeInfo.project) * 0x408f400000000000));
                ClipPostInfo uploadInfo1 = this.mPostInfo.uploadInfo;
                if (uploadInfo1.uploadType == b) {
                   kSUploaderKi.setCoverPath(uploadInfo1.coverPath);
                }else {
                   kSUploaderKi.setCoverPathAndToken(uploadInfo1.coverPath, uploadInfo1.coverAuthentication);
                }
                kSUploaderKi.setSessionID(this.mPostInfo.getId());
                KSUploaderKit kSUploaderKi1 = new KSUploaderKit(this.mApplicationContext, kSUploaderKi);
                this.mUploadKit = kSUploaderKi1;
                kSUploaderKi1.setEventListener(new ClipPostTask$1(this, file));
                obj = this.mPostInfo.uploadInfo;
                if (obj.uploadType == str) {
                   this.mUploadKit.setEndPointAgent(obj.getEndPointAgent());
                }
                obj = this.mPostInfo.uploadInfo;
                ClipPostInfo$ClipUploadInfo endPoints = obj.endPoints;
                if (endPoints != null) {
                   this.mUploadKit.setExternalEndPoints(endPoints, obj.tokenID);
                }
                ClipPostInfo$ClipUploadInfo httpEndPoint = this.mPostInfo.uploadInfo.httpEndPoints;
                if (httpEndPoint != null && httpEndPoint.size() > 0) {
                   KSUploaderKitNetManager.setOnlineServerAddress(this.mPostInfo.uploadInfo.httpEndPoints.get(b1));
                   tmPostInfo = 1;
                }else {
                   tmPostInfo = null;
                }
                if (this.mForceDisableResume == null && tmPostInfo) {
                   b1 = true;
                }
                kSUploaderKi.setEnableResume(b1);
                this.mUploadKit.setSceneType(this.mPostInfo.getSceneTypeByVideoType());
                this.mUploadKit.startUpload();
                this.mPostLogInfo.uploadStartTime = SystemClock.elapsedRealtime();
                this.changeUploadStatus(2);
                this.onStatusChangedCallback();
                if (this.mIsEnablePipeline != null) {
                   tmPostInfo = this.mSegmentInfos;
                   if (tmPostInfo != null && tmPostInfo.size() > 0) {
                      Iterator iterator1 = this.mSegmentInfos.iterator();
                      while (iterator1.hasNext()) {
                         this.mUploadKit.uploadSegment(iterator1.next());
                      }
                      if (this.getEncodeStatus() == str) {
                         this.mUploadKit.finishUploadSegment();
                      }
                   }
                }else {
                   this.releasePipeline();
                }
             }else if(ClipPostInfo.isNeedUploadCoverAfterPublish(this.mPostInfo.postFlag) && b == this.mStatus.coverUploadStatusWithoutPreUpload){
                this.startUploadCoverIfNeeded();
             }else if(this.getUploadStatus() == str){
                tmPostInfo = this.mPostLogInfo;
                long l = SystemClock.elapsedRealtime();
                tmPostInfo.uploadStartTime = l;
                tmPostInfo.uploadEndTime = l;
                this.mPostLogInfo.uploadProgress = 0x3ff0000000000000;
                this.onProgressCallback();
             label_0315 :
                b = false;
             }else {
                goto label_0315 ;
             }
          }
       }else {
          goto label_0315 ;
       }
       return b;
    }
    public final boolean startWatermarkIfNeed(){
       EditorSdk2V2$VideoEditorProject obj = PatchProxy.apply(null, this, ClipPostTask.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.mIsCancel == null && (!this.isError() && ClipPostInfo.isNeedWatermark(this.mPostInfo.postFlag))) {
          if (ClipPostInfo.isNeedEncode(this.mPostInfo.postFlag) && !this.isStatusEncodeSuccess()) {
             KSClipLog.d("ClipPostTask", "startWatermarkIfNeed return false,wait encode finish");
             return b;
          }else if(this.isWaitUpload()){
             KSClipLog.d("ClipPostTask", "startWatermarkIfNeed return false,wait update uploadInfo");
             return b;
          }else if(this.getWatermarkStatus() == 1){
             obj = EditorSdk2UtilsV2.createProjectWithFile(this.mPostInfo.exportPath);
             this.tryToSetClippedRangeWhenAddWatermark(obj);
             ClipPostInfo watermarkPar = this.mPostInfo.watermarkParam;
             ClipWatermarkHandler watermarkPar1 = new ClipWatermarkHandler(this.mApplicationContext, obj, this.setUpConfig(obj, null, 10, 0, true), watermarkPar.watermarkInfos, watermarkPar.exportPath);
             this.mClipWatermarkHandler = v10;
             v10.setSessionId(this.mPostInfo.id, this.mExtraInfo);
             this.mClipWatermarkHandler.setClipExportListener(this);
             this.mClipWatermarkHandler.run();
             this.changeWatermarkStatus(2);
             this.onStatusChangedCallback();
             b = true;
          }
          KSClipLog.d("ClipPostTask", "startWatermarkIfNeed,status:"+this.getWatermarkStatus());
       }
    }
    public final void tryToSetClippedRangeWhenAddWatermark(EditorSdk2V2$VideoEditorProject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipPostTask.class, "10")) {
          return;
       }
       if (this.mPostInfo.watermarkParam.clippedRangeForSingleImage != null && (p0 != null && (p0.trackAssets() != null && p0.trackAssetsSize() > 0))) {
          int i = 0;
          if (EditorSdk2UtilsV2.isSingleImagePath(p0.trackAssets(i).assetPath())) {
             p0.trackAssets(i).setClippedRange(this.mPostInfo.watermarkParam.clippedRangeForSingleImage);
          }
       }
    label_003d :
       return;
    }
    public boolean updateUploadInfo(ClipPostInfo$ClipUploadInfo p0,boolean p1){
       ClipPostTask uClipPostTas = ClipPostTask.class;
       if (PatchProxy.isSupport(uClipPostTas)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uClipPostTas, "18");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       uClipPostTas = this.mLock;
       _monitor_enter(uClipPostTas);
       ClipPostTask tmPostInfo = this.mPostInfo;
       ClipPostInfo uploadInfo = tmPostInfo.uploadInfo;
       if (uploadInfo == null || uploadInfo.enableUpload == null) {
          tmPostInfo.uploadInfo = p0;
          if (p1) {
             if (this.isError()) {
                this.start();
                _monitor_exit(uClipPostTas);
                return true;
             }else if(this.mIsEnablePipeline == null && (this.getEncodeStatus() == 3 || (!ClipPostInfo.isNeedEncode(this.mPostInfo.postFlag) && ClipPostInfo.isNeedUpload(this.mPostInfo.postFlag)))){
                this.startUploadIfNeed();
             }
             this.startWatermarkIfNeed();
          }
          _monitor_exit(uClipPostTas);
          return true;
       }else {
          _monitor_exit(uClipPostTas);
          return false;
       }
    }
    public boolean updateWatermarkParam(ClipPostInfo$ClipWatermarkParam p0,boolean p1){
       ClipPostTask uClipPostTas = ClipPostTask.class;
       if (PatchProxy.isSupport(uClipPostTas)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uClipPostTas, "19");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (this.mPostInfo.watermarkParam == null && p0 != null) {
          if (this.getWatermarkStatus() != 2) {
             uClipPostTas = this.mPostInfo;
             uClipPostTas.postFlag = uClipPostTas.postFlag | 0x04;
             uClipPostTas.watermarkParam = p0;
             if (p1) {
                this.startWatermarkIfNeed();
             }
          }else {
             KSClipLog.w("ClipPostTask", "encoding watermark,updateWatermarkParam failed");
          }
       }
       return true;
    }
}
