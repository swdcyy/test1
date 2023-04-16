package com.kwai.video.ksmemorykit.EditorSmartClipTask$1;
import java.lang.Runnable;
import com.kwai.video.ksmemorykit.EditorSmartClipTask;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.editorsdk2.logger.EditorSdkLogger;
import com.kwai.video.ksmemorykit.EditorSmartClipTask$SmartClipProgressListener;
import com.kwai.video.ksmemorykit.EditorSmartClipListener;
import com.kwai.video.ksmemorykit.EditorSmartClipTask$SmartClipFlashImageListener;
import com.kwai.video.ksmemorykit.EditorSmartClipTask$SmartClipDecoderListener;
import com.kwai.video.ksmemorykit.EditorSmartClipTask$VoiceDetectListener;
import java.util.ArrayList;
import com.kwai.video.editorsdk2.kve.EditorKveDecoder;
import com.kwai.video.editorsdk2.kve.EditorKveDecoder$Listener;
import com.kwai.kve.SmartEditTaskBuilder;
import com.kwai.kve.VisionEngine;
import com.kwai.kve.Decoder;
import java.util.List;
import com.kwai.kve.ProgressCallback;
import com.kwai.kve.VoiceDetectorCallback;
import com.kwai.kve.FlashImageCallback;
import com.kwai.kve.AlbumType;
import com.kwai.video.ksmemorykit.EditorMemoryAsset;
import com.kwai.video.ksmemorykit.EditorMemoryParams;
import com.kwai.video.editorsdk2.kve.EditorKveAsset;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.io.File;
import java.util.Date;
import android.location.Location;
import com.kwai.kve.MediaAsset;
import java.lang.StringBuilder;
import com.kwai.kve.SmartEditTask;
import com.kwai.video.ksmemorykit.EditorSmartClipResult;
import java.lang.System;
import com.kwai.kve.SmartEditResult;
import com.kwai.kve.ErrorInfo;
import com.kwai.kve.ErrorInfo$ErrorCode;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$EditorSdkError;
import java.util.Map;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.ksmemorykit.EditorMemoryProjectCreator;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import java.lang.Throwable;

public class EditorSmartClipTask$1 implements Runnable	// class@0008f7
{
    public final EditorSmartClipTask this$0;

    public void EditorSmartClipTask$1(EditorSmartClipTask p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       EditorSdk2$EditorSdkError uEditorSdkEr;
       EditorSmartClipTask mListener;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, EditorSmartClipTask$1.class, "1")) {
          return;
       }
       EditorSdkLogger.i("EditorSmartClipTask", "EditorSmartClipTask start run: ");
       EditorSmartClipTask mLock = this.this$0.mLock;
       _monitor_enter(mLock);
       EditorSdkLogger.i("EditorSmartClipTask", "EditorSmartClipTask start mLock run: ");
       EditorSmartClipTask$SmartClipProgressListener smartClipPro = new EditorSmartClipTask$SmartClipProgressListener(this.this$0.mListener);
       EditorSmartClipTask$SmartClipFlashImageListener smartClipFla = new EditorSmartClipTask$SmartClipFlashImageListener(this.this$0.mListener);
       EditorSmartClipTask$SmartClipDecoderListener smartClipDec = new EditorSmartClipTask$SmartClipDecoderListener(this.this$0.mListener);
       if (this.this$0.hasVoiceDetector()) {
          objArray = new EditorSmartClipTask$VoiceDetectListener(this.this$0, objArray);
       }
       ArrayList uArrayList = new ArrayList();
       if ((this.this$0.mThemesMetaJSON).length() > 0) {
          uArrayList.add(this.this$0.mThemesMetaJSON);
       }
       EditorKveDecoder uEditorKveDe = new EditorKveDecoder();
       this.this$0.mDecoder = uEditorKveDe;
       uEditorKveDe.setListener(smartClipDec);
       SmartEditTaskBuilder smartEditTas = VisionEngine.createSmartEditTaskBuilder().setDecoder(uEditorKveDe);
       SmartEditTaskBuilder smartEditTas1 = smartEditTas.setFiles(this.this$0.mMediaAssets).setThemes(uArrayList).setImageClipDuration(this.this$0.mImageClipTime).setVideoClipDuration(this.this$0.mVideoClipTime).setMaxAnalysisVideoNumber(this.this$0.mMaxAnalysisVideoNumber).setMaxTotalDuration(this.this$0.mMaxTotalDuration).setAnalysisDurationLimit(this.this$0.mAnalysisDurationLimit).setCacheFolder(this.this$0.mTempPath).setTotalProgressCallback(smartClipPro).setSceneName(this.this$0.mSceneName).useTheme(this.this$0.mSelectedThemeId).useMusic(this.this$0.mSelectedMusicId).setVoiceDetectorCallback(objArray).setFlashImageCallback(smartClipFla).setAlbumType(this.this$0.mAlbumType);
       EditorSmartClipTask$1 tthis$0 = this.this$0;
       if (tthis$0.mUseMotionInterval != null) {
          smartEditTas1.setMotionInterval(tthis$0.mMotionIntervalValue);
       }
       EditorSmartClipTask mMemoryParam = this.this$0.mMemoryParams;
       tthis$0 = (mMemoryParam != null && (mMemoryParam.getCoverAsset() != null && !TextUtils.isEmpty(this.this$0.mMemoryParams.getCoverAsset().getFileName())))? 1: null;
       if (tthis$0) {
          String fileName = this.this$0.mMemoryParams.getCoverAsset().getFileName();
          File uFile = new File(fileName);
          if (uFile.exists() && uFile.isFile()) {
             EditorKveAsset uEditorKveAs = new EditorKveAsset(fileName);
             uEditorKveAs.setCreationTime(this.this$0.mMemoryParams.getCoverAsset().getCreationTime());
             uEditorKveAs.setCreationLocation(this.this$0.mMemoryParams.getCoverAsset().getCreationLocation());
             smartEditTas1 = smartEditTas1.setCoverAsset(uEditorKveAs);
          }else {
             EditorSdkLogger.e("EditorSmartClipTask", "Input cover file not exist: "+fileName);
          }
       }
       mMemoryParam = this.this$0.mMemoryParams;
       if (mMemoryParam != null && mMemoryParam.getMinAssetNum() > 0) {
          smartEditTas1.setMinAssetNumber(this.this$0.mMemoryParams.getMinAssetNum());
       }
       mMemoryParam = this.this$0.mMemoryParams;
       if (mMemoryParam != null && mMemoryParam.getMinVideoDurationRequired() > 0) {
          smartEditTas1.setMinVideoDurationRequired(this.this$0.mMemoryParams.getMinVideoDurationRequired());
       }
       this.this$0.mSmartTask = smartEditTas1.build();
       _monitor_exit(mLock);
       EditorSmartClipResult uEditorSmart = new EditorSmartClipResult();
       this.this$0.mVideoAnalyzeCostTime = System.nanoTime();
       SmartEditResult smartEditRes = this.this$0.mSmartTask.run();
       EditorSmartClipTask$1 tthis$01 = this.this$0;
       this.this$0.mVideoAnalyzeCostTime = (System.nanoTime() - tthis$01.mVideoAnalyzeCostTime) / 0xf4240;
       tthis$01.realReleaseDecoder();
       if (smartEditRes.getErrorInfo() != null && smartEditRes.getErrorInfo().getErrorCode() != ErrorInfo$ErrorCode.OK) {
          EditorSdkLogger.e("EditorSmartClipTask", "EditorSmartClipTask vision engine analyze error");
          uEditorSdkEr = new EditorSdk2$EditorSdkError();
          uEditorSdkEr.setCode(-1);
          uEditorSdkEr.setType(0x2711);
          uEditorSdkEr.setMessage(smartEditRes.getErrorInfo().getErrorMessage());
          mListener = this.this$0.mListener;
          if (mListener != null) {
             mListener.onError(uEditorSdkEr);
          }
          return;
       }else {
          int i = 0x2712;
          try{
             EditorSmartClipTask$1 tthis$02 = this.this$0;
             EditorSdk2V2$VideoEditorProject videoEditorP = EditorSdk2UtilsV2.loadProject(EditorMemoryProjectCreator.createProjectFromSmartClipResult(tthis$02.mMediaAssets, smartEditRes, tthis$02.mVoiceDetectResults, tthis$02.mMemoryParams));
             if (!videoEditorP.trackAssetsSize()) {
                EditorSdkLogger.e("EditorSmartClipTask", "EditorSmartClipTask project no track asset");
                uEditorSdkEr = new EditorSdk2$EditorSdkError();
                uEditorSdkEr.setCode(-2);
                uEditorSdkEr.setType(i);
                uEditorSdkEr.setMessage("EditorSmartClipTask project no track asset");
                mListener = this.this$0.mListener;
                if (mListener != null) {
                   mListener.onError(uEditorSdkEr);
                }
                return;
             }else {
                uEditorSmart.setProject(videoEditorP);
                uEditorSmart.setMediaAnalyzeResults(smartEditRes.getMediaAnalyzeResults());
                uEditorSmart.setSceneDetectionJsonResults(smartEditRes.getSceneDetectionJsonResults());
                uEditorSmart.setThemeId(smartEditRes.getThemeId());
                uEditorSmart.setSelectedMusicId(smartEditRes.getMusicId());
                uEditorSmart.setVideoAnalyzeCostTime(this.this$0.mVideoAnalyzeCostTime);
                uEditorSmart.setVoiceDetectCostTime(this.this$0.mVoiceDetectCostTime);
                EditorSdkLogger.i("EditorSmartClipTask", "EditorSmartClipTask smart clip success");
                EditorSdkLogger.i("EditorSmartClipTask", "EditorSmartClipTask smart clip themeId: "+smartEditRes.getThemeId());
                EditorSdkLogger.i("EditorSmartClipTask", "EditorSmartClipTask smart clip musicId: "+smartEditRes.getMusicId());
                mListener = this.this$0.mListener;
                if (mListener != null) {
                   mListener.onFinish(uEditorSmart);
                }
             }
          }catch(java.lang.Exception e0){
             EditorSdkLogger.e("EditorSmartClipTask", "EditorSmartClipTask load project error", e0);
             uEditorSdkEr = new EditorSdk2$EditorSdkError();
             uEditorSdkEr.setCode(-1);
             uEditorSdkEr.setType(i);
             uEditorSdkEr.setMessage("EditorSmartClipTask load project error");
             mListener = this.this$0.mListener;
             if (mListener != null) {
                mListener.onError(uEditorSdkEr);
             }
          }
          return;
       }
    }
}
