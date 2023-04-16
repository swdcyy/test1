package com.kwai.video.clipkit.ClipFMImportHandler;
import com.kwai.video.clipkit.ClipImportHandler;
import java.lang.String;
import com.kwai.video.clipkit.ClipFMImportHandler$FMImportVideoInfo;
import com.kwai.video.clipkit.ClipImportHandler$ImportVideoInfo;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import com.kwai.video.clipkit.KSClipLog;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import java.lang.IllegalArgumentException;
import android.content.Context;
import android.graphics.Bitmap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Double;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.editorsdk2.ThumbnailGenerator;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import java.lang.Integer;
import java.lang.Boolean;
import java.io.File;
import java.io.FileOutputStream;
import android.graphics.Bitmap$CompressFormat;
import java.io.OutputStream;
import java.io.IOException;
import com.kwai.video.clipkit.config.EditorEncodeConfig$MVImportParams;
import com.kwai.video.clipkit.ClipFMImportHandler$ClipFMImportCachePath;
import com.kwai.video.clipkit.ClipKitUtils;
import java.util.Arrays;
import com.kwai.video.clipkit.ClipImportHandler$RebuildTaskInfo;
import com.kwai.video.clipkit.ClipImportHandler$ClipImportResult;
import java.lang.Exception;
import com.kwai.video.clipkit.config.EditorEncodeConfigManager;
import com.kwai.video.clipkit.config.EditorEncodeConfig;
import com.kwai.video.clipkit.config.EditorEncodeConfig$MVTranscodeParams;
import com.kwai.video.minecraft.model.ModelBase;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$TimeRange;
import com.kwai.video.clipkit.ClipImportHandler$TranscodeParams;
import java.lang.Math;
import com.kwai.video.minecraft.model.EditorSdk2V2$TimeRangeV2;
import java.lang.Number;
import com.kwai.video.clipkit.log.ClipEditImportLog;
import com.kwai.video.clipkit.log.ClipEditExtraInfo;
import android.os.SystemClock;
import com.kwai.video.clipkit.ClipImportHandler$NeedRebuildResult;
import com.kwai.video.clipkit.log.ClipEditLogger;
import com.kwai.video.clipkit.ClipImportException;
import java.util.List;
import java.util.ArrayList;

public class ClipFMImportHandler extends ClipImportHandler	// class@001a1b
{
    public ClipFMImportHandler$ClipFMImportCachePath mFMImportCatchPath;
    public EditorEncodeConfig$MVImportParams mMVImportParams;
    public ClipFMImportHandler$FMImportVideoInfo[] mVideoInfos;

    public void ClipFMImportHandler(String p0,ClipFMImportHandler$FMImportVideoInfo[] p1){
       super();
       String[] stringArray = new String[p1.length];
       this.mImportPaths = stringArray;
       stringArray = new String[p1.length];
       this.mExportPaths = stringArray;
       ClipFMImportHandler$FMImportVideoInfo[] uFMImportVid = new ClipFMImportHandler$FMImportVideoInfo[p1.length];
       this.mVideoInfos = uFMImportVid;
       StringBuilder str = null;
       for (int i = 0; i < p1.length; i = i + 1) {
          ClipFMImportHandler$FMImportVideoInfo uFMImportVid1 = ClipFMImportHandler$FMImportVideoInfo.createFaceMagicInfo(p1[i]);
          uFMImportVid1.index = i;
          uFMImportVid1.isImage = EditorSdk2UtilsV2.isSingleImagePath(uFMImportVid1.importPath);
          uFMImportVid1.duration = EditorSdk2Utils.getVideoTrackDuration(uFMImportVid1.importPath);
          this.mImportPaths[i] = uFMImportVid1.importPath;
          this.mExportPaths[i] = uFMImportVid1.exportPath;
          this.mVideoInfos[i] = uFMImportVid1;
       }
       this.mSessionId = p0;
       if (this.mImportPaths.length > 0) {
          int i1 = 0;
          ClipImportHandler tmImportPath = this.mImportPaths;
          while (i1 < tmImportPath.length) {
             if (TextUtils.isEmpty(tmImportPath[i1])) {
                KSClipLog.e("ClipFMImportHandler", "ClipImportHandler create wrong path "+i1+"is null");
                str = 1;
                break ;
             }else {
                i1++;
             }
          }
          if (str == null) {
             this.mProject = EditorSdk2UtilsV2.createProjectWithFileArray(this.mImportPaths);
             this.mType = 4;
             return;
          }else {
             KSClipLog.e("ClipFMImportHandler", "ClipImportHandler has wrong path");
             throw new IllegalArgumentException("input paths is wrong");
          }
       }else {
          KSClipLog.e("ClipFMImportHandler", "ClipImportHandler create input path length <=0");
          throw new IllegalArgumentException("input paths is wrong");
       }
    }
    public static Bitmap getFileFrame(Context p0,String p1,double p2){
       if (PatchProxy.isSupport(ClipFMImportHandler.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Double.valueOf(p2), null, ClipFMImportHandler.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       EditorSdk2V2$VideoEditorProject videoEditorP = EditorSdk2UtilsV2.createProjectWithFile(p1);
       ThumbnailGenerator thumbnailGen = new ThumbnailGenerator(p0);
       thumbnailGen.updateProject(videoEditorP);
       double computedDura = EditorSdk2UtilsV2.getComputedDuration(videoEditorP);
       double d = (p2 - computedDura < 0 && p2 > 0)? p2: computedDura;
       thumbnailGen.release();
       return thumbnailGen.getThumbnailAtPts(d, EditorSdk2UtilsV2.getTrackAssetWidth(videoEditorP.trackAssets(0)), EditorSdk2UtilsV2.getTrackAssetHeight(videoEditorP.trackAssets(0)), 2, 0x3fb999999999999a);
    }
    public static boolean saveToFile(Bitmap p0,String p1,int p2){
       File obj;
       if (PatchProxy.isSupport(ClipFMImportHandler.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), null, ClipFMImportHandler.class, "8");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = new File(p1);
       if (obj.exists()) {
          obj.delete();
       }
       try{
          FileOutputStream uFileOutputS = new FileOutputStream(obj);
          if (p0.compress(Bitmap$CompressFormat.JPEG, p2, uFileOutputS)) {
             uFileOutputS.flush();
             uFileOutputS.close();
             return true;
          }
       }catch(java.io.IOException e7){
          e7.printStackTrace();
       }
       return false;
    }
    public final boolean cachePathExist(ClipFMImportHandler$FMImportVideoInfo p0){
       String fMImportCach;
       ClipImportHandler tmExportPath;
       boolean b;
       StringBuilder obj = PatchProxy.applyOneRefs(p0, this, ClipFMImportHandler.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = null;
       ClipFMImportHandler tmMVImportPa = this.mMVImportParams;
       EditorEncodeConfig$MVImportParams version = (tmMVImportPa != null)? tmMVImportPa.version: 1;
       ClipFMImportHandler tmFMImportCa = this.mFMImportCatchPath;
       if (tmFMImportCa != null) {
          fMImportCach = tmFMImportCa.getFMImportCachePath(p0, version, this.mBenchmarkVer);
          if (ClipKitUtils.fileExists(fMImportCach)) {
             KSClipLog.d("ClipFMImportHandler", p0.importPath+" file have catch:"+fMImportCach+"do not need rebuild");
             tmExportPath = this.mExportPaths;
             p0 = p0.index;
             if (tmExportPath[p0] != null) {
                tmExportPath[p0] = fMImportCach;
             }
          }else {
          label_00a9 :
             return b;
          }
       }else {
          fMImportCach = this.getRebuildCachePath(p0, version, this.mBenchmarkVer);
          ClipImportHandler tmExportPath1 = this.mExportPaths;
          if (tmExportPath1 != null && (tmExportPath1.length <= 0 || tmExportPath1.length != this.mImportPaths.length)) {
             tmExportPath1 = this.mImportPaths;
             this.mExportPaths = Arrays.copyOf(tmExportPath1, tmExportPath1.length);
          }
          if (fMImportCach != null) {
             this.mExportPaths[p0.index] = fMImportCach;
          }
          if (ClipKitUtils.fileExists(fMImportCach)) {
             KSClipLog.d("ClipFMImportHandler", p0.importPath+" file have catch:"+fMImportCach+"do not need rebuild");
             tmExportPath = this.mExportPaths;
             p0 = p0.index;
             if (tmExportPath[p0] != null) {
                tmExportPath[p0] = fMImportCach;
             }
          }else {
             goto label_00a9 ;
          }
       }
       b = true;
       goto label_00a9 ;
    }
    public final void deleteFile(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipFMImportHandler.class, "7")) {
          return;
       }
       new File(p0).delete();
       return;
    }
    public void exportTaskSuccess(Context p0,ClipImportHandler$RebuildTaskInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ClipFMImportHandler.class, "6")) {
          return;
       }
       if (p1.isExportImage != null) {
          try{
             object oobject = this.mClipImportResult.exportPaths[p1.index];
             if (ClipFMImportHandler.saveToFile(ClipFMImportHandler.getFileFrame(p0, p1.exportPath, p1.lastFrameAtPts), oobject, 100)) {
                this.deleteFile(p1.exportPath);
                p1.exportPath = oobject;
             }
          }catch(java.lang.Exception e5){
             KSClipLog.e("ClipFMImportHandler", "cover to image failed"+p1.exportPath);
             e5.printStackTrace();
          }
       }
    }
    public final EditorEncodeConfig$MVImportParams getMVImportParams(Context p0){
       ClipFMImportHandler uClipFMImpor;
       EditorEncodeConfig$MVImportParams obj = PatchProxy.applyOneRefs(p0, this, ClipFMImportHandler.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       ClipFMImportHandler tmMVImportPa = this.mMVImportParams;
       if (tmMVImportPa != null) {
          uClipFMImpor = tmMVImportPa;
       }else if(p0 != null){
          EditorEncodeConfig$MVImportParams mVImportPara = EditorEncodeConfigManager.getInstance().getMVImportParamsConfig();
          if (mVImportPara == null) {
             mVImportPara = new EditorEncodeConfig().getMVImportParams();
          }
          uClipFMImpor = mVImportPara;
          this.mMVImportParams = uClipFMImpor;
       }else {
          KSClipLog.w("ClipFMImportHandler", "do not set context mvImportParam may be null");
       }
       return uClipFMImpor;
    }
    public final EditorEncodeConfig$MVTranscodeParams getMVTranscodeParams(EditorEncodeConfig$MVImportParams p0,int p1){
       ClipFMImportHandler uClipFMImpor = ClipFMImportHandler.class;
       if (PatchProxy.isSupport(uClipFMImpor)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uClipFMImpor, "13");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1) {
          if (p1 != 1) {
             p0 = (p1 != 2)? p0.transcode720p: p0.transcode1080p;
          }else {
             p0 = p0.transcode720p;
          }
       }else {
          p0 = p0.transcode576p;
       }
       if (p0 == null) {
          p0 = new EditorEncodeConfig().getMVImportParams().transcode720p;
       }
       return p0;
    }
    public final String getRebuildCachePath(ClipFMImportHandler$FMImportVideoInfo p0,int p1,int p2){
       String obj;
       if (PatchProxy.isSupport(ClipFMImportHandler.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, ClipFMImportHandler.class, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       String str = null;
       if (this.mRebuildCachePath != null) {
          if (TextUtils.isEmpty(p0.importPath)) {
             return str;
          }else {
             int i = (p0.importPath).lastIndexOf("/");
             ClipImportHandler$ImportVideoInfo importVideoI = -1;
             if (i != importVideoI) {
                obj = (p0.importPath).substring((i + 1));
                int i1 = obj.lastIndexOf(".");
                if (i1 != importVideoI) {
                   obj = obj.substring(0, i1);
                   str = (p0.magicDuration - null > 0)? ".mp4": ".jpg";
                   importVideoI = p0.faceMagicParam;
                   String str1 = "0";
                   String str2 = (importVideoI != null)? importVideoI.toString(): str1;
                   String str3 = (p0.timeRange != null)? p0.timeRange.start()+"_"+p0.timeRange.duration(): str1;
                   StringBuilder str4 = this.mRebuildCachePath+File.separator+(obj+str3+p0.magicDuration+p0.lastFrameAtPts+str2).hashCode()+"_";
                   if (p0.isSupportSmartCut != null) {
                      str1 = "1";
                   }
                   String str5 = str4+str1+"_"+p0.exportType+"_"+p1+"_"+p2;
                   p0.exportPath = str5+".mp4";
                   return str5+str;
                }
             }
          }
       }
       return str;
    }
    public ClipImportHandler$TranscodeParams getTranscodeParams(Context p0,EditorSdk2V2$VideoEditorProject p1,int p2){
       if (PatchProxy.isSupport(ClipFMImportHandler.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, ClipFMImportHandler.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.getTranscodeParams(p0, p1, this.mVideoInfos[p2]);
    }
    public final ClipImportHandler$TranscodeParams getTranscodeParams(Context p0,EditorSdk2V2$VideoEditorProject p1,ClipFMImportHandler$FMImportVideoInfo p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ClipFMImportHandler.class, "12");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       EditorEncodeConfig$MVImportParams mVImportPara = this.getMVImportParams(p0);
       ClipImportHandler$TranscodeParams transcodePar = null;
       EditorEncodeConfig$MVTranscodeParams mVTranscodeP = (p2 != null)? this.getMVTranscodeParams(mVImportPara, p2.exportType): transcodePar;
       if (mVTranscodeP != null) {
          transcodePar = new ClipImportHandler$TranscodeParams();
          transcodePar.x264Params = mVTranscodeP.x264Params;
          transcodePar.x264Preset = mVTranscodeP.x264Preset;
          transcodePar.width = mVTranscodeP.width;
          transcodePar.height = mVTranscodeP.height;
          transcodePar.videoGopSize = mVTranscodeP.videoGopSize;
          transcodePar.videoBitrate = mVTranscodeP.videoBitrate;
          transcodePar.audioProfile = mVTranscodeP.audioProfile;
          transcodePar.audioBitrate = mVTranscodeP.audioBitrate;
          transcodePar.audioCutOff = mVTranscodeP.audioCutOff;
          transcodePar.supportHwEncode = mVTranscodeP.supportHwEncode;
          transcodePar.minEncodeSpeed = mVTranscodeP.minEncodeSpeed;
          transcodePar.minProfile = mVTranscodeP.minProfile;
          transcodePar.alignmentFlag = mVTranscodeP.alignmentFlag;
          transcodePar.westerosFaceMagicParam = p2.faceMagicParam;
          ClipFMImportHandler$FMImportVideoInfo magicDuratio = p2.magicDuration;
          double d = (double)((float)magicDuratio / 1000.00f);
          if (p2.isImage == null && magicDuratio > 0) {
             d = Math.min(d, p2.duration);
          }
          double d1 = Math.max(3.00f, d);
          ClipImportHandler$ImportVideoInfo timeRange = p2.timeRange;
          d = 0;
          if (timeRange != null) {
             double d2 = timeRange.start();
             if (p2.timeRange.duration() - d > 0) {
                d1 = Math.min(p2.timeRange.duration(), d1);
             }
             d = d2;
          }
          transcodePar.timeRange = EditorSdk2UtilsV2.createTimeRange(d, d1);
       }
       return transcodePar;
    }
    public int isNeedRebuild(Context p0,ClipFMImportHandler$FMImportVideoInfo p1){
       ClipFMImportHandler obj = PatchProxy.applyTwoRefs(p0, p1, this, ClipFMImportHandler.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p1 == null) {
          return ClipImportHandler.DO_NOT_NEED_REBUILD_ERROR;
       }
       obj = this.mMVImportParams;
       if (obj == null) {
          EditorEncodeConfig$MVImportParams mVImportPara = this.getMVImportParams(p0);
       }
       this.mBenchmarkVer = 6;
       String str = "ClipFMImportHandler";
       if (obj == null) {
          KSClipLog.d(str, "do not have importParams, do not need rebuild as default ");
          return ClipImportHandler.DO_NOT_NEED_REBUILD_ERROR;
       }else if(this.cachePathExist(p1)){
          return ClipImportHandler.DO_NOT_NEED_REBUILD_HAVE_CATCH;
       }else {
          KSClipLog.d(str, p1.importPath+"file need rebuild ");
          return ClipImportHandler.NEED_REBUILD;
       }
    }
    public int[] isNeedRebuild(Context p0){
       ClipImportHandler obj = PatchProxy.applyOneRefs(p0, this, ClipFMImportHandler.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mImportPaths;
       if (obj == null || obj.length <= 0) {
          KSClipLog.i("ClipFMImportHandler", "no input paths");
          return null;
       }else if(this.mNeedRebuildResults == null){
          this.mFirstReport = true;
          ClipEditImportLog uClipEditImp = new ClipEditImportLog(p0, this.mType, this.mSessionId, this.mProject, this.mExtraInfo);
          this.mImportLog = obj;
          obj.encodeStartTime = SystemClock.elapsedRealtime();
       }
       ClipImportHandler$NeedRebuildResult[] needRebuildR = new ClipImportHandler$NeedRebuildResult[this.mVideoInfos.length];
       this.mNeedRebuildResults = needRebuildR;
       boolean b = false;
       int i = 0;
       ClipImportHandler tmNeedRebuil = this.mNeedRebuildResults;
       while (i < tmNeedRebuil.length) {
          tmNeedRebuil[i] = new ClipImportHandler$NeedRebuildResult();
          i = i + 1;
       }
       i = 0;
       tmNeedRebuil = 0;
       ClipFMImportHandler tmVideoInfos = this.mVideoInfos;
       while (i < tmVideoInfos.length) {
          try{
             this.mNeedRebuildResults[i].needRebuild = this.isNeedRebuild(p0, tmVideoInfos[i]);
             if (this.mNeedRebuildResults[i].needRebuild >= ClipImportHandler.NEED_REBUILD) {
                tmNeedRebuil = 1;
             }
          }catch(java.io.IOException e4){
             e4.printStackTrace();
          }catch(com.kwai.video.editorsdk2.EditorSdk2InternalErrorException e4){
             e4.printStackTrace();
          }
          i = i + 1;
       }
       if (!tmNeedRebuil && this.mFirstReport != null) {
          if (this.mIsNeedReportStart != null) {
             ClipEditImportLog uClipEditImp1 = new ClipEditImportLog(p0, this.mType, this.mSessionId, this.mProject, this.mExtraInfo);
             this.mImportLog = i;
             i.encodeStartTime = SystemClock.elapsedRealtime();
             ClipEditLogger.reportImportLog(true, this.mImportLog);
             this.mIsNeedReportStart = b;
          }
          this.mFirstReport = b;
          if (this.mClipImportResult == null) {
             this.mClipImportResult = new ClipImportHandler$ClipImportResult();
          }
          ClipImportHandler tmClipImport = this.mClipImportResult;
          if (tmClipImport.importExceptions == null) {
             ClipImportException[] uClipImportE = new ClipImportException[this.mImportPaths.length];
             tmClipImport.importExceptions = uClipImportE;
          }
          this.updateClipImportResult();
          this.notifyFinishedCallback(this.mClipImportResult);
          tmClipImport.encodeEndTime = SystemClock.elapsedRealtime();
          tmClipImport = this.mImportLog;
          tmClipImport.importResult = this.mClipImportResult;
          ClipEditLogger.reportImportLog(7, tmClipImport);
       }
       return this.castNeedRebuildResultToIntArray();
    }
    public ClipImportHandler$ClipImportResult run(Context p0){
       ClipImportHandler obj = PatchProxy.applyOneRefs(p0, this, ClipFMImportHandler.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mLock;
       _monitor_enter(obj);
       if (this.mIsRunning != null) {
          KSClipLog.i("ClipFMImportHandler", "isRunning run return false");
          _monitor_exit(obj);
          return null;
       }else {
          boolean b = true;
          this.mIsRunning = b;
          ClipImportHandler tmNeedRebuil = this.mNeedRebuildResults;
          if (tmNeedRebuil != null && (tmNeedRebuil.length <= 0 || tmNeedRebuil.length != this.mImportPaths.length)) {
             this.isNeedRebuild(p0);
          }
          tmNeedRebuil = this.mFirstReport;
          if (tmNeedRebuil == null) {
             _monitor_exit(obj);
             return this.mClipImportResult;
          }else if(this.mIsNeedReportStart != null && tmNeedRebuil != null){
             this.mIsNeedReportStart = false;
             ClipEditImportLog uClipEditImp = new ClipEditImportLog(p0, this.mType, this.mSessionId, this.mProject, this.mExtraInfo);
             this.mImportLog = tmNeedRebuil;
             tmNeedRebuil.encodeStartTime = SystemClock.elapsedRealtime();
             ClipEditLogger.reportImportLog(b, this.mImportLog);
          }
          this.updateClipImportResult();
          ClipImportHandler tmRebuildTas = this.mRebuildTaskInfo;
          if (tmRebuildTas != null && tmRebuildTas.size() > 0) {
             this.calculationProgress();
             this.run(p0, this.mRebuildTaskInfo.get(false));
          }else if(this.mFirstReport != null){
             this.mFirstReport = false;
             this.notifyFinishedCallback(this.mClipImportResult);
             p0.encodeEndTime = SystemClock.elapsedRealtime();
             ClipImportHandler tmImportLog = this.mImportLog;
             tmImportLog.importResult = this.mClipImportResult;
             ClipEditLogger.reportImportLog(7, tmImportLog);
          }
          _monitor_exit(obj);
          return this.mClipImportResult;
       }
    }
    public void updateClipImportResult(){
       if (PatchProxy.applyVoid(null, this, ClipFMImportHandler.class, "4")) {
          return;
       }
       ClipImportHandler$ClipImportResult uClipImportR = new ClipImportHandler$ClipImportResult();
       this.mClipImportResult = uClipImportR;
       ClipFMImportHandler tmVideoInfos = this.mVideoInfos;
       int[] ointArray = new int[tmVideoInfos.length];
       uClipImportR.isRebuild = ointArray;
       String[] stringArray = new String[tmVideoInfos.length];
       uClipImportR.exportPaths = stringArray;
       ClipImportException[] uClipImportE = new ClipImportException[tmVideoInfos.length];
       uClipImportR.importExceptions = uClipImportE;
       int i = 0;
       tmVideoInfos = this.mVideoInfos;
       while (i < tmVideoInfos.length) {
          object oobject = tmVideoInfos[i];
          ClipImportHandler tmClipImport = this.mClipImportResult;
          ClipImportHandler tmNeedRebuil = this.mNeedRebuildResults;
          tmClipImport.isRebuild[i] = tmNeedRebuil[i].needRebuild;
          if (tmNeedRebuil[i].needRebuild > null) {
             if (this.mRebuildTaskInfo == null) {
                this.mRebuildTaskInfo = new ArrayList();
             }
             ClipImportHandler$RebuildTaskInfo rebuildTaskI = new ClipImportHandler$RebuildTaskInfo(this.mImportPaths[i], oobject.exportPath, i, null);
             if (!oobject.magicDuration - null) {
                rebuildTaskI.isExportImage = true;
                rebuildTaskI.lastFrameAtPts = oobject.lastFrameAtPts;
             }
             this.mRebuildTaskInfo.add(rebuildTaskI);
             this.mClipImportResult.exportPaths[i] = this.mExportPaths[i];
          }else if(this.mRebuildCachePath != null){
             ClipImportHandler tmExportPath = this.mExportPaths;
             if (tmExportPath[i] != null && tmNeedRebuil[i].needRebuild == ClipImportHandler.DO_NOT_NEED_REBUILD_HAVE_CATCH) {
                tmClipImport.exportPaths[i] = tmExportPath[i];
             }
          }
          tmClipImport.exportPaths[i] = this.mImportPaths[i];
          i = i + 1;
       }
       return;
    }
}
