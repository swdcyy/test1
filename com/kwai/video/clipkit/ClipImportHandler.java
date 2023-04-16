package com.kwai.video.clipkit.ClipImportHandler;
import java.lang.Object;
import android.os.Handler;
import android.os.Looper;
import com.kwai.video.clipkit.ClipImportHandler$ImportType;
import java.lang.String;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import com.kwai.video.clipkit.error.EditorProjectInvalidException;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import com.kwai.video.clipkit.KSClipLog;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import java.lang.IllegalArgumentException;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.kwai.video.clipkit.ClipImportHandler$RebuildTaskInfo;
import com.kwai.video.editorsdk2.ExportTask;
import com.kwai.video.clipkit.ClipKitUtils;
import java.io.File;
import com.kwai.video.clipkit.ClipImportHandler$NeedRebuildResult;
import android.content.Context;
import java.lang.Boolean;
import com.kwai.video.clipkit.log.ClipEditImportLog;
import com.kwai.video.clipkit.ClipImportHandler$ClipImportResult;
import android.os.SystemClock;
import com.kwai.video.clipkit.log.ClipEditLogger;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ExportOptions;
import com.kwai.video.clipkit.config.EditorEncodeConfigModule$ImportParam;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.clipkit.config.EditorEncodeConfigModule;
import com.kwai.video.clipkit.config.EditorEncodeConfigManager;
import java.lang.Integer;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import com.kwai.video.minecraft.model.EditorSdk2V2$TimeRangeV2;
import com.kwai.video.clipkit.utils.Utils;
import com.kwai.video.clipkit.config.EditorEncodeConfigModule$ImportParam$TargetBitrate;
import java.lang.Double;
import java.util.Iterator;
import java.lang.Math;
import com.kwai.video.clipkit.ClipImportHandler$TranscodeParams;
import com.kwai.video.clipkit.config.EditorEncodeConfigModule$ImportTranscodeCondition;
import java.lang.Number;
import com.kwai.video.clipkit.ClipImportHandler$ClipImportCachePath;
import java.util.Arrays;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$AndroidDecoderConfig;
import com.kwai.video.clipkit.hardware.HardwareUtils;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ProbedStream;
import com.kwai.video.clipkit.log.ClipEditExtraInfo;
import java.lang.Exception;
import java.io.IOException;
import com.kwai.video.clipkit.ClipImportException;
import java.lang.Thread;
import com.kwai.video.clipkit.ClipImportHandler$5;
import java.lang.Runnable;
import com.kwai.video.clipkit.ClipImportHandler$ClipImportHandlerListener;
import com.kwai.video.clipkit.ClipImportHandler$4;
import com.kwai.video.clipkit.ClipImportHandler$3;
import com.kwai.video.clipkit.ClipImportHandler$6;
import com.kwai.video.clipkit.ClipImportHandler$2;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$EditorSdkError;
import com.kwai.video.minecraft.model.nano.Minecraft$WesterosFaceMagicParam;
import com.kwai.video.clipkit.hardware.ClipDPHardwareConfigManager;
import com.kwai.video.editorsdk2.ExportTaskNoQueueing;
import com.kwai.video.clipkit.ClipImportHandler$1;
import com.kwai.video.editorsdk2.ExportEventListener;
import java.lang.Throwable;
import com.google.gson.Gson;
import android.util.Pair;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$Rational;
import com.kwai.video.devicepersona.benchmark.BenchmarkEncodeProfile;
import com.kwai.video.devicepersonabenchmark.DPHardwareConfigManager$EncodeResult;
import com.kwai.video.devicepersonabenchmark.DPHardwareConfigManager;
import java.util.ArrayList;

public class ClipImportHandler	// class@001a2d
{
    public int mBenchmarkVer;
    public ClipImportHandler$ClipImportResult mClipImportResult;
    public double mCurrentTotalPercent;
    public boolean mDisableHwEncode;
    public String[] mExportPaths;
    public ExportTask mExportTask;
    public ClipEditExtraInfo mExtraInfo;
    public boolean mFirstReport;
    public boolean mHighPriority;
    public ClipImportHandler$ClipImportCachePath mImportCatchPath;
    public ClipImportHandler$ClipImportHandlerListener mImportHandlerListener;
    public ClipEditImportLog mImportLog;
    public EditorEncodeConfigModule$ImportParam mImportParam;
    public String[] mImportPaths;
    public ClipImportHandler$ImportType mIsAllImage;
    public boolean mIsImportWithProject;
    public boolean mIsNeedReportStart;
    public boolean mIsRunning;
    public Object mLock;
    public Handler mMainHandler;
    public ClipImportHandler$NeedRebuildResult[] mNeedRebuildResults;
    public boolean mOpenSpeedCheck;
    public int mOutImportParamsPriority;
    public EditorSdk2V2$VideoEditorProject mProject;
    public String mRebuildCachePath;
    public List mRebuildTaskInfo;
    public String mSessionId;
    public double mTrackAssetMaxDuration;
    public int mType;
    public int mVideoExportType;
    public static int DO_NOT_NEED_REBUILD_ERROR = 254;
    public static int DO_NOT_NEED_REBUILD_HAVE_CATCH = 255;
    public static int DO_NOT_NEED_REBUILD_NORMAL = 0;
    public static int NEED_REBUILD = 1;

    public void ClipImportHandler(){
       super();
       this.mVideoExportType = 3;
       this.mOutImportParamsPriority = 0;
       this.mMainHandler = new Handler(Looper.getMainLooper());
       this.mLock = new Object();
       this.mIsAllImage = ClipImportHandler$ImportType.NOT_CHECK;
       this.mRebuildCachePath = null;
       this.mClipImportResult = null;
       this.mBenchmarkVer = 0;
       this.mIsRunning = false;
       this.mHighPriority = true;
       this.mFirstReport = true;
       this.mDisableHwEncode = false;
       this.mOpenSpeedCheck = false;
       this.mIsNeedReportStart = true;
       this.mCurrentTotalPercent = 0;
       this.mTrackAssetMaxDuration = 0xbff0000000000000;
       this.mIsImportWithProject = false;
    }
    public void ClipImportHandler(String p0,EditorSdk2V2$VideoEditorProject p1,String p2){
       super();
       this.mVideoExportType = 3;
       this.mOutImportParamsPriority = 0;
       this.mMainHandler = new Handler(Looper.getMainLooper());
       this.mLock = new Object();
       this.mIsAllImage = ClipImportHandler$ImportType.NOT_CHECK;
       this.mRebuildCachePath = null;
       this.mClipImportResult = null;
       this.mBenchmarkVer = 0;
       this.mIsRunning = false;
       this.mHighPriority = true;
       this.mFirstReport = true;
       this.mDisableHwEncode = false;
       this.mOpenSpeedCheck = false;
       this.mIsNeedReportStart = true;
       this.mCurrentTotalPercent = 0;
       this.mTrackAssetMaxDuration = 0xbff0000000000000;
       this.mIsImportWithProject = false;
       if (p1 == null || (p1.trackAssets() == null || p1.trackAssets(0) == null)) {
          throw new EditorProjectInvalidException("project or trackAssets is null.");
       }
       this.mSessionId = p0;
       this.mProject = p1;
       String[] stringArray = new String[true];
       this.mImportPaths = stringArray;
       stringArray[0] = p1.trackAssets(0).assetPath();
       this.mIsImportWithProject = true;
       stringArray = new String[true];
       stringArray[0] = p2;
       this.mExportPaths = stringArray;
       this.mType = 1;
       return;
    }
    public void ClipImportHandler(String p0,String[] p1,String[] p2,String p3){
       super();
       this.mVideoExportType = 3;
       int i = 0;
       this.mOutImportParamsPriority = i;
       this.mMainHandler = new Handler(Looper.getMainLooper());
       this.mLock = new Object();
       this.mIsAllImage = ClipImportHandler$ImportType.NOT_CHECK;
       this.mRebuildCachePath = null;
       this.mClipImportResult = null;
       this.mBenchmarkVer = i;
       this.mIsRunning = i;
       this.mHighPriority = true;
       this.mFirstReport = true;
       this.mDisableHwEncode = i;
       this.mOpenSpeedCheck = i;
       this.mIsNeedReportStart = true;
       this.mCurrentTotalPercent = 0;
       this.mTrackAssetMaxDuration = 0xbff0000000000000;
       this.mIsImportWithProject = i;
       this.mSessionId = p0;
       this.mExportPaths = p2;
       this.mImportPaths = p1;
       if (p1.length > 0) {
          int i1 = 0;
          while (i1 < p1.length) {
             if (TextUtils.isEmpty(p1[i1])) {
                KSClipLog.e("ClipImportHandler", "ClipImportHandler create wrong path "+i1+"is null");
                i = 1;
                break ;
             }else {
                i1++;
             }
          }
          if (!i) {
             this.mProject = EditorSdk2UtilsV2.createProjectWithFileArray(p1);
             this.setImportParam(p3);
             this.mType = 1;
             return;
          }else {
             KSClipLog.e("ClipImportHandler", "ClipImportHandler has wrong path");
             throw new IllegalArgumentException("input paths is wrong");
          }
       }else {
          KSClipLog.e("ClipImportHandler", "ClipImportHandler create input path length <=0");
          throw new IllegalArgumentException("input paths is wrong");
       }
    }
    public void calculationProgress(){
       if (PatchProxy.applyVoid(null, this, ClipImportHandler.class, "12")) {
          return;
       }
       double d = 0;
       int i = 0;
       for (int i1 = 0; i1 < this.mRebuildTaskInfo.size(); i1 = i1 + 1) {
          d = d + EditorSdk2UtilsV2.getTrackAssetDisplayDuration(this.mProject.trackAssets(this.mRebuildTaskInfo.get(i1).index));
       }
       for (; i < this.mRebuildTaskInfo.size(); i = i + 1) {
          double d1 = EditorSdk2UtilsV2.getTrackAssetDisplayDuration(this.mProject.trackAssets(this.mRebuildTaskInfo.get(i).index)) / d;
          this.mRebuildTaskInfo.get(i).progressPercent = d1;
       }
       return;
    }
    public void cancel(){
       if (PatchProxy.applyVoid(null, this, ClipImportHandler.class, "9")) {
          return;
       }
       ClipImportHandler tmLock = this.mLock;
       _monitor_enter(tmLock);
       ClipImportHandler tmExportTask = this.mExportTask;
       if (tmExportTask != null) {
          tmExportTask.cancel();
          if (this.mRebuildCachePath != null && (this.mExportTask.getFilePath() != null && ClipKitUtils.fileExists(this.mExportTask.getFilePath()))) {
             new File(this.mExportTask.getFilePath()).delete();
             KSClipLog.e("ClipImportHandler", "rebuild failed, delete export file "+this.mExportTask.getFilePath());
          }
       }
       _monitor_exit(tmLock);
       return;
    }
    public int[] castNeedRebuildResultToIntArray(){
       int len = this.mNeedRebuildResults.length;
       int[] ointArray = new int[len];
       for (int i = 0; i < len; i = i + 1) {
          ointArray[i] = this.mNeedRebuildResults[i].needRebuild;
       }
       return ointArray;
    }
    public void continueRunNext(Context p0,ClipImportHandler$RebuildTaskInfo p1,boolean p2,ExportTask p3){
       int i1;
       if (PatchProxy.isSupport(ClipImportHandler.class) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), p3, this, ClipImportHandler.class, "14")) {
          return;
       }
       p1.finished = true;
       ClipImportHandler$RebuildTaskInfo exportPath = (p3 != null && p2)? p1.exportPath: p1.importPath;
       p1.exportPath = exportPath;
       if (p3 != null) {
          this.mImportLog.addExportQos(p3);
       }
       ClipImportHandler tmClipImport = this.mClipImportResult;
       ClipImportHandler$RebuildTaskInfo index = p1.index;
       tmClipImport.exportPaths[index] = p1.exportPath;
       ClipImportHandler$ClipImportResult isRebuild = tmClipImport.isRebuild;
       int nEED_REBUILD = (p2)? ClipImportHandler.NEED_REBUILD: ClipImportHandler.DO_NOT_NEED_REBUILD_ERROR;
       isRebuild[index] = nEED_REBUILD;
       ClipImportHandler tmExportTask = this.mExportTask;
       if (tmExportTask != null) {
          tmExportTask.release();
          this.mExportTask = null;
       }
       nEED_REBUILD = 0;
       int i = 0;
       while (true) {
          if (i < this.mRebuildTaskInfo.size()) {
             if (this.mRebuildTaskInfo.get(i).finished == null) {
                this.mCurrentTotalPercent = this.mCurrentTotalPercent + p1.progressPercent;
                this.run(p0, this.mRebuildTaskInfo.get(i));
                i1 = 0;
             label_007d :
                if (i1) {
                   i1 = 0;
                   ClipImportHandler$ClipImportResult importExcept = this.mClipImportResult.importExceptions;
                   while (nEED_REBUILD < importExcept.length) {
                      if (importExcept[nEED_REBUILD] != null) {
                         i1 = 1;
                      }
                      nEED_REBUILD++;
                   }
                   importExcept.encodeEndTime = SystemClock.elapsedRealtime();
                   ClipImportHandler tmImportLog = this.mImportLog;
                   tmImportLog.importResult = this.mClipImportResult;
                   if (i1) {
                      ClipEditLogger.reportImportLog(8, tmImportLog);
                   }else {
                      ClipEditLogger.reportImportLog(7, tmImportLog);
                   }
                   this.notifyFinishedCallback(this.mClipImportResult);
                }
                break ;
             }else {
                i++;
             }
          }else {
             i1 = 1;
             goto label_007d ;
          }
       }
       return;
    }
    public EditorEncodeConfigModule$ImportParam covertExportOptionsToImportParam(EditorSdk2$ExportOptions p0){
       EditorEncodeConfigModule$ImportParam obj = PatchProxy.applyOneRefs(p0, this, ClipImportHandler.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = EditorEncodeConfigModule.getImportParamWithType(this.mVideoExportType);
       obj.width = p0.width();
       obj.height = p0.height();
       obj.maxImportWidth = p0.width();
       obj.maxImportHeight = p0.height();
       obj.videoBitrate = p0.videoBitrate();
       obj.videoGopSize = p0.videoGopSize();
       if (p0.x264Params() != null && !TextUtils.isEmpty(p0.x264Params())) {
          obj.x264Params = p0.x264Params();
       }
       if (p0.x264Preset() != null && !TextUtils.isEmpty(p0.x264Preset())) {
          obj.x264Preset = p0.x264Preset();
       }
       if (p0.videoEncoderType() == 5) {
          obj.supportHwEncode = true;
       }
       return obj;
    }
    public void enableHighPriority(boolean p0){
       this.mHighPriority = p0;
    }
    public void exportTaskSuccess(Context p0,ClipImportHandler$RebuildTaskInfo p1){
    }
    public EditorEncodeConfigModule$ImportParam getImportParamFromConfig(Context p0,EditorSdk2V2$VideoEditorProject p1){
       ClipImportHandler tmImportPara;
       EditorEncodeConfigModule$ImportParam importParam;
       String obj = PatchProxy.applyTwoRefs(p0, p1, this, ClipImportHandler.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       if (this.mOutImportParamsPriority > 100) {
          tmImportPara = this.mImportParam;
       }else if(p0 != null){
          EditorEncodeConfigModule editorEncode = EditorEncodeConfigManager.getInstance().getEditorEncodeConfigModule(p0.getApplicationContext(), p1, 1);
          if (editorEncode != null) {
             importParam = editorEncode.getImportParams();
          }
       }else {
          KSClipLog.w("ClipImportHandler", "do not set context importParams may be null");
       }
       if (importParam == null) {
          tmImportPara = this.mImportParam;
       }else {
          tmImportPara = importParam;
       }
       if (tmImportPara == null) {
          tmImportPara = EditorEncodeConfigModule.getImportParamWithType(this.mVideoExportType);
       }
       KSClipLog.d("ClipImportHandler", "getImportParamFromConfig width:"+tmImportPara.width+",height:"+tmImportPara.height+",fps:"+tmImportPara.fps+",videoBitrate:"+tmImportPara.videoBitrate);
       return tmImportPara;
    }
    public String getRebuildCachePath(String p0,int p1,int p2){
       String obj;
       if (PatchProxy.isSupport(ClipImportHandler.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, ClipImportHandler.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       String str = null;
       if (this.mRebuildCachePath != null) {
          if (TextUtils.isEmpty(p0)) {
             return str;
          }else {
             int i = p0.lastIndexOf("/");
             String str1 = -1;
             if (i != str1) {
                obj = p0.substring((i + 1));
                int i1 = obj.lastIndexOf(".");
                if (i1 != str1) {
                   int i2 = 0;
                   str1 = obj.substring(i2, i1);
                   obj = (!EditorSdk2UtilsV2.isSingleImagePath(p0))? ".mp4": obj.substring(i1, obj.length());
                   if (this.mTrackAssetMaxDuration - null > 0 && EditorSdk2Utils.getVideoTrackDuration(p0) - this.mTrackAssetMaxDuration > 0) {
                      p0 = this.mRebuildCachePath+File.separator+str1+"_0-"+this.mTrackAssetMaxDuration+"_"+p1+"_"+p2+obj;
                   }else {
                      ClipImportHandler tmProject = this.mProject;
                      if (tmProject != null && tmProject.trackAssets(i2).clippedRange() != null) {
                         EditorSdk2V2$TimeRangeV2 timeRangeV2 = this.mProject.trackAssets(i2).clippedRange();
                         timeRangeV2 = this.mRebuildCachePath+File.separator+str1+"_"+Utils.cutDoubleToNDecimalPlaces(timeRangeV2.start(), 2)+"-"+Utils.cutDoubleToNDecimalPlaces(timeRangeV2.duration(), 2)+"_"+p1+"_"+p2+obj;
                      }else {
                         tmProject = this.mRebuildCachePath+File.separator+str1+"_"+p1+"_"+p2+obj;
                      }
                   }
                   return p0;
                }
             }
          }
       }
       return str;
    }
    public final EditorEncodeConfigModule$ImportParam$TargetBitrate getTargetBitrate(double p0,List p1){
       ClipImportHandler uClipImportH = ClipImportHandler.class;
       if (PatchProxy.isSupport(uClipImportH)) {
          Object obj = PatchProxy.applyTwoRefs(Double.valueOf(p0), p1, this, uClipImportH, "29");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       EditorEncodeConfigModule$ImportParam$TargetBitrate importParam$ = null;
       if (p0 >= 0 && p1 != null) {
          Iterator iterator = p1.iterator();
          int i = 0xbff0000000000000;
          while (iterator.hasNext()) {
             EditorEncodeConfigModule$ImportParam$TargetBitrate importParam$1 = iterator.next();
             if (!TextUtils.isEmpty(importParam$1.x264Params) && (importParam$1.videoBitrate > 0 && importParam$1.videoGopSize > null)) {
                double d = (double)importParam$1.fps - p0;
                d = Math.abs(d);
                if (!i - 0xbff0000000000000 || d - i < 0) {
                   importParam$ = importParam$1;
                   i = d;
                }
             }
          }
          if (importParam$ != null) {
             KSClipLog.d("ClipImportHandler", "match targetBitrate: bitrate:"+importParam$.videoBitrate+",fps:"+importParam$.fps+",width:"+importParam$.width+",height:"+importParam$.height);
          }
       }
       return importParam$;
    }
    public ClipImportHandler$TranscodeParams getTranscodeParams(Context p0,EditorSdk2V2$VideoEditorProject p1,int p2){
       ClipImportHandler$TranscodeParams obj;
       if (PatchProxy.isSupport(ClipImportHandler.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, ClipImportHandler.class, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       EditorEncodeConfigModule$ImportParam importParamF = this.getImportParamFromConfig(p0, p1);
       obj = null;
       if (importParamF != null) {
          obj = new ClipImportHandler$TranscodeParams();
          obj.x264Params = importParamF.x264Params;
          obj.x264Preset = importParamF.x264Preset;
          obj.fps = importParamF.fps;
          obj.width = importParamF.width;
          obj.height = importParamF.height;
          obj.videoGopSize = importParamF.videoGopSize;
          obj.videoBitrate = importParamF.videoBitrate;
          obj.audioProfile = importParamF.audioProfile;
          obj.audioBitrate = importParamF.audioBitrate;
          obj.audioCutOff = importParamF.audioCutOff;
          obj.supportHwEncode = importParamF.supportHwEncode;
          obj.minEncodeSpeed = importParamF.minEncodeSpeed;
          obj.minProfile = importParamF.minProfile;
          obj.alignmentFlag = importParamF.alignmentFlag;
          obj.forceMediaCodecBaseline = importParamF.forceMediaCodecBaseline;
          obj.targetBitrate = importParamF.targetBitrate;
          if (p1 != null && (p1.trackAssets() != null && this.mTrackAssetMaxDuration > 0)) {
             ClipImportHandler tmTrackAsset = this.mTrackAssetMaxDuration;
             if (EditorSdk2Utils.getVideoTrackDuration(p1.trackAssets(0).assetPath()) - tmTrackAsset > 0) {
                obj.timeRange = EditorSdk2UtilsV2.createTimeRange(0, tmTrackAsset);
             }
          }
       }
       return obj;
    }
    public ClipImportHandler$ImportType isAllImage(){
       ClipImportHandler$ImportType nOT_ALL_IMAG;
       ClipImportHandler obj = PatchProxy.apply(null, this, ClipImportHandler.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mIsAllImage;
       if (obj != ClipImportHandler$ImportType.NOT_CHECK) {
          return obj;
       }
       if (this.mImportPaths == null) {
          nOT_ALL_IMAG = ClipImportHandler$ImportType.NOT_ALL_IMAGE;
          this.mIsAllImage = nOT_ALL_IMAG;
          return nOT_ALL_IMAG;
       }else {
          int i = 0;
          while (true) {
             ClipImportHandler tmImportPath = this.mImportPaths;
             if (i < tmImportPath.length) {
                if (!EditorSdk2UtilsV2.isSingleImagePath(tmImportPath[i])) {
                   break ;
                }else {
                   i = i + 1;
                }
             }else {
                nOT_ALL_IMAG = ClipImportHandler$ImportType.ALL_IMAGE;
                this.mIsAllImage = nOT_ALL_IMAG;
                return nOT_ALL_IMAG;
             }
          }
          nOT_ALL_IMAG = ClipImportHandler$ImportType.NOT_ALL_IMAGE;
          this.mIsAllImage = nOT_ALL_IMAG;
          return nOT_ALL_IMAG;
       }
    }
    public final boolean isMatchTranscodeCondition(EditorEncodeConfigModule$ImportTranscodeCondition p0,int p1,boolean p2){
       EditorEncodeConfigModule$ImportTranscodeCondition codecFlag = p0.codecFlag;
       if (codecFlag <= null || (p1 & codecFlag) > 0) {
          p0 = p0.hdrFlag;
          if (p0 > null && (p0 != true || (p2 || (p0 == 2 && !p2)))) {
             return true;
          }
       }
       return false;
    }
    public int isNeedRebuild(Context p0,String p1,int p2){
       EditorSdk2V2$VideoEditorProject obj;
       String this;
       String importCacheP;
       EditorEncodeConfigModule$ImportParam importParam;
       int i5;
       boolean b1;
       String str4;
       EditorEncodeConfigModule$ImportTranscodeCondition fps;
       String str5;
       int i8;
       ClipImportHandler uClipImportH = this;
       String str = p1;
       int i = p2;
       if (PatchProxy.isSupport(ClipImportHandler.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, ClipImportHandler.class, "8");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (EditorSdk2UtilsV2.isSingleImagePath(p1)) {
          return ClipImportHandler.DO_NOT_NEED_REBUILD_NORMAL;
       }else {
          obj = EditorSdk2UtilsV2.createProjectWithFile(p1);
          EditorEncodeConfigModule$ImportParam importParamF = uClipImportH.getImportParamFromConfig(p0, obj);
          boolean i1 = 6;
          uClipImportH.mBenchmarkVer = i1;
          this = "ClipImportHandler";
          if (importParamF == null) {
             KSClipLog.d(this, "do not have importParams, do not need rebuild as default ");
             return ClipImportHandler.DO_NOT_NEED_REBUILD_NORMAL;
          }else {
             ClipImportHandler mImportCatch = uClipImportH.mImportCatchPath;
             String str1 = "do not need rebuild";
             String str2 = " file have cache:";
             if (mImportCatch != null) {
                importCacheP = mImportCatch.getImportCachePath(str, importParamF.version, i1);
                if (ClipKitUtils.checkVideoIsVaild(importCacheP)) {
                   KSClipLog.d(this, str+str2+importCacheP+str1);
                   return ClipImportHandler.DO_NOT_NEED_REBUILD_HAVE_CATCH;
                }
             }else {
                importCacheP = uClipImportH.getRebuildCachePath(str, importParamF.version, i1);
                mImportCatch = uClipImportH.mExportPaths;
                if (mImportCatch != null && (mImportCatch.length <= 0 || mImportCatch.length != uClipImportH.mImportPaths.length)) {
                   mImportCatch = uClipImportH.mImportPaths;
                   uClipImportH.mExportPaths = Arrays.copyOf(mImportCatch, mImportCatch.length);
                }
                if (importCacheP != null) {
                   uClipImportH.mExportPaths[i] = importCacheP;
                }
                if (ClipKitUtils.checkVideoIsVaild(importCacheP)) {
                   KSClipLog.d(this, str+str2+importCacheP+str1);
                   return ClipImportHandler.DO_NOT_NEED_REBUILD_HAVE_CATCH;
                }else if(ClipKitUtils.fileExists(importCacheP)){
                   if (!ClipKitUtils.clearFile(importCacheP)) {
                      KSClipLog.e(this, "clearFile fail to clear cache");
                   }else {
                      KSClipLog.i(this, "clear cache success , cachePath = "+importCacheP);
                   }
                }
             }
             EditorSdk2$AndroidDecoderConfig androidDecod = EditorSdk2Utils.getAndroidDecoderConfig();
             int i2 = 0;
             i1 = (androidDecod != null)? HardwareUtils.isSupportMediaCodec(str, androidDecod): false;
             boolean b = true;
             if (!importParamF.supportImportSw() && !i1) {
                KSClipLog.d(this, str+" file result: "+b+"do not support hw");
                return ClipImportHandler.NEED_REBUILD;
             }else {
                i1 = ClipKitUtils.isHDRVideo(obj.trackAssets(i2));
                EditorEncodeConfigModule$ImportParam importTransc = importParamF.importTranscodeConditions;
                if (importTransc != null && importTransc.size() > 0) {
                   double trackAssetFp = EditorSdk2UtilsV2.getTrackAssetFps(obj.trackAssets(i2));
                   int trackAssetWi = EditorSdk2UtilsV2.getTrackAssetWidth(obj.trackAssets(i2));
                   int trackAssetHe = EditorSdk2UtilsV2.getTrackAssetHeight(obj.trackAssets(i2));
                   int i3 = Math.min(trackAssetWi, trackAssetHe);
                   trackAssetWi = Math.max(trackAssetWi, trackAssetHe);
                   if (EditorSdk2UtilsV2.trackAssetProbedVideoStream(obj.trackAssets(i2)) == null) {
                      KSClipLog.w(this, "file do not need rebuild: there is no video stream in the file.");
                      return ClipImportHandler.DO_NOT_NEED_REBUILD_NORMAL;
                   }else {
                      int i4 = EditorSdk2UtilsV2.trackAssetProbedVideoStream(obj.trackAssets(i2)).privateCodecId();
                      String str3 = "condition params error: ";
                      if (importParamF.version == 2) {
                         trackAssetHe = 0;
                         while (true) {
                            if (trackAssetHe < importParamF.importTranscodeConditions.size()) {
                               EditorEncodeConfigModule$ImportTranscodeCondition importTransc1 = importParamF.importTranscodeConditions.get(trackAssetHe);
                               importParam = importParamF;
                               if (importTransc1.width > null && (importTransc1.height <= null || importTransc1.fps < null)) {
                                  i5 = i4;
                                  b1 = i1;
                                  str4 = this;
                                  importCacheP = str3;
                                  KSClipLog.w(str4, importCacheP+importTransc1.width+","+importTransc1.height);
                               }else if(uClipImportH.isMatchTranscodeCondition(importTransc1, i4, i1)){
                                  b1 = i1;
                                  int i6 = Math.min(importTransc1.width, importTransc1.height);
                                  i5 = i4;
                                  i4 = Math.max(importTransc1.width, importTransc1.height);
                                  if (i3 > i6 && trackAssetWi > i4) {
                                     fps = importTransc1.fps;
                                     str5 = this;
                                     if (fps <= null || trackAssetFp - (double)fps > 0) {
                                        KSClipLog.d(str5, str+" file need rebuild: video["+i3+","+trackAssetWi+","+trackAssetFp+"] condition["+i6+","+i4+","+importTransc1.fps+","+importTransc1.hdrFlag+"]");
                                        ClipImportHandler mNeedRebuild = uClipImportH.mNeedRebuildResults;
                                        if (mNeedRebuild != null && mNeedRebuild.length > i) {
                                           mNeedRebuild[i].transcodeDisableHDR = importTransc1.disableHDR;
                                           break ;
                                        }
                                        break ;
                                     }else {
                                        importCacheP = str3;
                                        str4 = str5;
                                     }
                                  }
                               }else {
                                  i5 = i4;
                                  b1 = i1;
                               }
                               str4 = this;
                               importCacheP = str3;
                               trackAssetHe = trackAssetHe + 1;
                               this = str4;
                               str3 = importCacheP;
                               importParamF = importParam;
                               i1 = b1;
                               i4 = i5;
                            }else {
                               KSClipLog.d(this, "no condition math,do need rebuild: "+str);
                               return ClipImportHandler.DO_NOT_NEED_REBUILD_NORMAL;
                            }
                         }
                         return ClipImportHandler.NEED_REBUILD;
                      }else {
                         i5 = i4;
                         str4 = this;
                         importCacheP = str3;
                         EditorEncodeConfigModule$ImportParam importParam1 = importParamF;
                         int this1 = 0;
                         i = 0;
                         int i7 = 1;
                         while (true) {
                            if (this1 < importParam1.importTranscodeConditions.size()) {
                               EditorEncodeConfigModule$ImportTranscodeCondition importTransc2 = importParam1.importTranscodeConditions.get(this1);
                               if (importTransc2.width > null && (importTransc2.height <= null || importTransc2.fps < null)) {
                                  str3 = importCacheP;
                                  KSClipLog.w(str4, importCacheP+importTransc2.width+","+importTransc2.height);
                                  i = i + 1;
                               }else {
                                  str3 = importCacheP;
                               }
                               fps = importTransc2.codecFlag;
                               if (fps > null) {
                                  i1 = i5 & fps;
                                  if (i1 <= 0) {
                                     importParam = importParam1;
                                  label_032c :
                                     this1++;
                                     importCacheP = str3;
                                     importParam1 = importParam;
                                  }
                               }
                               i1 = Math.min(importTransc2.width, importTransc2.height);
                               i8 = Math.max(importTransc2.width, importTransc2.height);
                               if (i3 <= i1 && trackAssetWi <= i8) {
                                  importParam = importParam1;
                                  str5 = str4;
                                  if (trackAssetFp - (double)importTransc2.fps <= 0) {
                                     break ;
                                  }else {
                                     str4 = str5;
                                  }
                               }else {
                                  importParam = importParam1;
                               }
                               i7 = 0;
                               goto label_032c ;
                            }else if(i == importParam1.importTranscodeConditions.size() || i7){
                               KSClipLog.d(str4, "wrong condition params or do not have this codec condition, do not need rebuild");
                               return ClipImportHandler.DO_NOT_NEED_REBUILD_NORMAL;
                            }else {
                               KSClipLog.d(str4, "no condition pass, need rebuild: "+str);
                               return ClipImportHandler.NEED_REBUILD;
                            }
                         }
                         KSClipLog.d(str5, str+" file do not need rebuild: video["+i3+","+trackAssetWi+","+trackAssetFp+"] condition["+i1+","+i8+","+trackAssetFp+"]");
                         return ClipImportHandler.DO_NOT_NEED_REBUILD_NORMAL;
                      }
                   }
                }else {
                   KSClipLog.d(this, str+"file not need rebuild ");
                   return ClipImportHandler.DO_NOT_NEED_REBUILD_NORMAL;
                }
             }
          }
       }
    }
    public int[] isNeedRebuild(Context p0){
       ClipImportHandler obj = PatchProxy.applyOneRefs(p0, this, ClipImportHandler.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mImportPaths;
       String str = "ClipImportHandler";
       if (obj == null || obj.length <= 0) {
          KSClipLog.i(str, "no input paths");
          return null;
       }else if(this.mNeedRebuildResults == null){
          this.mFirstReport = true;
          ClipEditImportLog uClipEditImp = new ClipEditImportLog(p0, this.mType, this.mSessionId, this.mProject, this.mExtraInfo);
          this.mImportLog = obj;
          obj.encodeStartTime = SystemClock.elapsedRealtime();
       }
       ClipImportHandler$NeedRebuildResult[] needRebuildR = new ClipImportHandler$NeedRebuildResult[this.mImportPaths.length];
       this.mNeedRebuildResults = needRebuildR;
       boolean b = false;
       int i = 0;
       ClipImportHandler tmNeedRebuil = this.mNeedRebuildResults;
       while (i < tmNeedRebuil.length) {
          tmNeedRebuil[i] = new ClipImportHandler$NeedRebuildResult();
          i = i + 1;
       }
       if (this.mProject != null && this.mOpenSpeedCheck != null) {
          i = 0;
          String str1 = null;
          while (i < this.mProject.trackAssetsSize()) {
             if (this.mProject.trackAssets(i).assetSpeed() - 0x400ffdf3b645a1cb >= 0) {
                KSClipLog.d(str, "isNeedRebuild trackAsset speed > 4,return false");
                this.mNeedRebuildResults[i].needRebuild = ClipImportHandler.NEED_REBUILD;
                str1 = 1;
             }else {
                this.mNeedRebuildResults[i].needRebuild = ClipImportHandler.DO_NOT_NEED_REBUILD_NORMAL;
             }
             i = i + 1;
          }
          if (str1 != null) {
             return this.castNeedRebuildResultToIntArray();
          }
       }
       int i1 = 0;
       ClipImportHandler$ImportType importType = null;
       tmNeedRebuil = this.mImportPaths;
       while (i1 < tmNeedRebuil.length) {
          try{
             this.mNeedRebuildResults[i1].needRebuild = this.isNeedRebuild(p0, tmNeedRebuil[i1], i1);
             tmNeedRebuil = this.mNeedRebuildResults;
             if (tmNeedRebuil[i1].needRebuild > null) {
                importType = 1;
             }else if(tmNeedRebuil[i1].needRebuild == ClipImportHandler.DO_NOT_NEED_REBUILD_NORMAL){
                if (this.mExportPaths == null) {
                   String[] stringArray = new String[this.mImportPaths.length];
                   this.mExportPaths = stringArray;
                }
                this.mExportPaths[i1] = this.mImportPaths[i1];
             }
          }catch(java.io.IOException e4){
             e4.printStackTrace();
          }catch(com.kwai.video.editorsdk2.EditorSdk2InternalErrorException e4){
             e4.printStackTrace();
          }
          i1 = i1 + 1;
       }
       if (!importType && this.mFirstReport != null) {
          if (this.mIsNeedReportStart != null) {
             if (this.isAllImage() != ClipImportHandler$ImportType.ALL_IMAGE) {
                ClipEditImportLog uClipEditImp1 = new ClipEditImportLog(p0, this.mType, this.mSessionId, this.mProject, this.mExtraInfo);
                this.mImportLog = i1;
                i1.encodeStartTime = SystemClock.elapsedRealtime();
                ClipEditLogger.reportImportLog(true, this.mImportLog);
             }
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
          if (this.isAllImage() != ClipImportHandler$ImportType.ALL_IMAGE) {
             tmClipImport.encodeEndTime = SystemClock.elapsedRealtime();
             tmClipImport = this.mImportLog;
             tmClipImport.importResult = this.mClipImportResult;
             ClipEditLogger.reportImportLog(7, tmClipImport);
          }
       }
    label_0147 :
       return this.castNeedRebuildResultToIntArray();
    }
    public void notifyCancelCallback(){
       if (PatchProxy.applyVoid(null, this, ClipImportHandler.class, "23")) {
          return;
       }
       KSClipLog.i("ClipImportHandler", "notifyCancelCallback");
       this.mImportLog.encodeEndTime = SystemClock.elapsedRealtime();
       ClipImportHandler tmImportLog = this.mImportLog;
       tmImportLog.importResult = this.mClipImportResult;
       ClipEditLogger.reportImportLog(9, tmImportLog);
       this.release();
       if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
          this.notifyCancelCallbackInner();
       }else {
          this.mMainHandler.post(new ClipImportHandler$5(this));
       }
       return;
    }
    public void notifyCancelCallbackInner(){
       if (PatchProxy.applyVoid(null, this, ClipImportHandler.class, "24")) {
          return;
       }
       ClipImportHandler tmImportHand = this.mImportHandlerListener;
       if (tmImportHand != null) {
          tmImportHand.onClipImportCanceled();
       }
       return;
    }
    public void notifyFailedCallback(int p0,ClipImportException p1){
       ClipImportHandler uClipImportH = ClipImportHandler.class;
       if (PatchProxy.isSupport(uClipImportH) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uClipImportH, "21")) {
          return;
       }
       KSClipLog.e("ClipImportHandler", "notifyFailedCallback,exception:"+p1.getMessage());
       if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
          this.notifyFailedCallbackInner(p0, p1);
       }else {
          this.mMainHandler.post(new ClipImportHandler$4(this, p0, p1));
       }
       return;
    }
    public void notifyFailedCallbackInner(int p0,ClipImportException p1){
       ClipImportHandler uClipImportH = ClipImportHandler.class;
       if (PatchProxy.isSupport(uClipImportH) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uClipImportH, "22")) {
          return;
       }
       uClipImportH = this.mImportHandlerListener;
       if (uClipImportH != null) {
          uClipImportH.onClipImportError(p0, p1);
       }
       return;
    }
    public void notifyFinishedCallback(ClipImportHandler$ClipImportResult p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipImportHandler.class, "18")) {
          return;
       }
       KSClipLog.i("ClipImportHandler", "notifyFinishedCallback");
       this.release();
       if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
          this.notifyFinishedCallbackInner(p0);
       }else {
          this.mMainHandler.post(new ClipImportHandler$3(this, p0));
       }
       return;
    }
    public void notifyFinishedCallbackInner(ClipImportHandler$ClipImportResult p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipImportHandler.class, "20")) {
          return;
       }
       ClipImportHandler tmImportHand = this.mImportHandlerListener;
       if (tmImportHand != null) {
          ClipImportHandler tmRebuildTas = this.mRebuildTaskInfo;
          if (tmRebuildTas != null && tmRebuildTas.size() > 0) {
             tmRebuildTas = this.mRebuildTaskInfo;
             tmImportHand.onClipImportProgress(tmRebuildTas.get((tmRebuildTas.size() - 1)).index, 0x3ff0000000000000, 0x3ff0000000000000);
          }
          tmImportHand.onClipImportFinish(p0);
       }
       return;
    }
    public void notifyProgressCallback(int p0,double p1,double p2){
       if (PatchProxy.isSupport(ClipImportHandler.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Double.valueOf(p1), Double.valueOf(p2), this, ClipImportHandler.class, "25")) {
          return;
       }
       KSClipLog.v("ClipImportHandler", "notifyProgressCallback,progress:"+p2);
       if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
          this.notifyProgressCallbackInner(p0, p1, p2);
       }else {
          ClipImportHandler$6 u6 = new ClipImportHandler$6(this, p0, p1, p2);
          this.mMainHandler.post(v8);
       }
       return;
    }
    public void notifyProgressCallbackInner(int p0,double p1,double p2){
       if (PatchProxy.isSupport(ClipImportHandler.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Double.valueOf(p1), Double.valueOf(p2), this, ClipImportHandler.class, "26")) {
          return;
       }
       ClipImportHandler tmImportHand = this.mImportHandlerListener;
       if (tmImportHand != null) {
          tmImportHand.onClipImportProgress(p0, (this.mCurrentTotalPercent + (p1 * p2)), p2);
       }
       return;
    }
    public void notifySuccessCallback(int p0,String p1){
       ClipImportHandler uClipImportH = ClipImportHandler.class;
       if (PatchProxy.isSupport(uClipImportH) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uClipImportH, "17")) {
          return;
       }
       KSClipLog.i("ClipImportHandler", "notifySuccessCallback");
       if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
          this.notifySuccessCallbackInner(p0, p1);
       }else {
          this.mMainHandler.post(new ClipImportHandler$2(this, p0, p1));
       }
       return;
    }
    public void notifySuccessCallbackInner(int p0,String p1){
       ClipImportHandler uClipImportH = ClipImportHandler.class;
       if (PatchProxy.isSupport(uClipImportH) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uClipImportH, "19")) {
          return;
       }
       uClipImportH = this.mImportHandlerListener;
       if (uClipImportH != null) {
          uClipImportH.onClipImportSuccess(p0, p1);
       }
       return;
    }
    public void openSpeedCheck(boolean p0){
       this.mOpenSpeedCheck = p0;
    }
    public final void release(){
       if (PatchProxy.applyVoid(null, this, ClipImportHandler.class, "27")) {
          return;
       }
       ClipImportHandler tmLock = this.mLock;
       _monitor_enter(tmLock);
       ClipImportHandler tmExportTask = this.mExportTask;
       if (tmExportTask != null) {
          tmExportTask.release();
          this.mExportTask = null;
       }
       this.mIsRunning = false;
       _monitor_exit(tmLock);
       return;
    }
    public ClipImportHandler$ClipImportResult run(Context p0){
       ClipImportHandler obj = PatchProxy.applyOneRefs(p0, this, ClipImportHandler.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mLock;
       _monitor_enter(obj);
       if (this.mIsRunning != null) {
          KSClipLog.i("ClipImportHandler", "isRunning run return false");
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
             if (this.isAllImage() != ClipImportHandler$ImportType.ALL_IMAGE) {
                ClipEditImportLog uClipEditImp = new ClipEditImportLog(p0, this.mType, this.mSessionId, this.mProject, this.mExtraInfo);
                this.mImportLog = tmNeedRebuil;
                tmNeedRebuil.encodeStartTime = SystemClock.elapsedRealtime();
                ClipEditLogger.reportImportLog(b, this.mImportLog);
             }
          }
          this.updateClipImportResult();
          ClipImportHandler tmRebuildTas = this.mRebuildTaskInfo;
          if (tmRebuildTas != null && tmRebuildTas.size() > 0) {
             this.calculationProgress();
             this.run(p0, this.mRebuildTaskInfo.get(false));
          }else if(this.mFirstReport != null){
             this.mFirstReport = false;
             this.notifyFinishedCallback(this.mClipImportResult);
             if (this.isAllImage() != ClipImportHandler$ImportType.ALL_IMAGE) {
                p0.encodeEndTime = SystemClock.elapsedRealtime();
                ClipImportHandler tmImportLog = this.mImportLog;
                tmImportLog.importResult = this.mClipImportResult;
                ClipEditLogger.reportImportLog(7, tmImportLog);
             }
          }
          _monitor_exit(obj);
          return this.mClipImportResult;
       }
    }
    public void run(Context p0,ClipImportHandler$RebuildTaskInfo p1){
       EditorSdk2$ExportOptions uExportOptio;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ClipImportHandler.class, "13")) {
          return;
       }
       EditorSdk2$EditorSdkError uEditorSdkEr = null;
       try{
          ClipImportHandler tmProject = (this.mIsImportWithProject != null)? this.mProject: EditorSdk2UtilsV2.createProjectWithFile(p1.importPath);
          ClipImportHandler$TranscodeParams transcodePar = this.getTranscodeParams(p0, tmProject, p1.index);
          if (transcodePar == null) {
             KSClipLog.d("ClipImportHandler", "do not have importParams, do not need rebuild as default ");
             ClipImportException uClipImportE1 = new ClipImportException(uEditorSdkEr, p1.importPath);
             ClipImportHandler$RebuildTaskInfo index1 = p1.index;
             this.mClipImportResult.importExceptions[index1] = uClipImportE1;
             this.notifyFailedCallback(index1, uClipImportE1);
             this.continueRunNext(p0, p1, false, uEditorSdkEr);
             return;
          }else {
             EditorSdk2V2$TrackAsset trackAsset = tmProject.trackAssets(false);
             ClipImportHandler$TranscodeParams timeRange = transcodePar.timeRange;
             if (timeRange != null) {
                trackAsset.setClippedRange(timeRange);
             }
             timeRange = transcodePar.westerosFaceMagicParam;
             if (timeRange != null) {
                trackAsset.setWesterosFaceMagicParam(timeRange);
             }
             try{
                uExportOptio = this.setUpConfig(p0, tmProject, transcodePar, p1.index);
             }catch(com.kwai.video.editorsdk2.EditorSdk2InternalErrorException e4){
                e4.printStackTrace();
                uExportOptio = uEditorSdkEr;
             }
             if (uExportOptio == null) {
                uExportOptio = EditorSdk2Utils.createDefaultExportOptions();
             }
             ClipDPHardwareConfigManager.getInstance().resetDecoderConfig(tmProject.trackAssets(false));
             this.mExportTask = (this.mHighPriority != null)? new ExportTaskNoQueueing(p0.getApplicationContext(), tmProject, p1.exportPath, uExportOptio): new ExportTask(p0.getApplicationContext(), tmProject, p1.exportPath, uExportOptio);
             this.mExportTask.setExportEventListener(new ClipImportHandler$1(this, p0, p1, tmProject));
             this.mExportTask.run();
             KSClipLog.i("ClipImportHandler", "import rebuild start:"+p1.importPath);
             return;
          }
       }catch(java.lang.Exception e3){
          KSClipLog.e("ClipImportHandler", "rebuild failed, because ExportTask Exception", e3);
          ClipImportException uClipImportE = new ClipImportException(uEditorSdkEr, p1.importPath);
          ClipImportHandler$RebuildTaskInfo index = p1.index;
          this.mClipImportResult.importExceptions[index] = uClipImportE;
          this.notifyFailedCallback(index, uClipImportE);
          this.continueRunNext(p0, p1, false, uEditorSdkEr);
          return;
       }
    }
    public void setExtraInfo(ClipEditExtraInfo p0){
       this.mExtraInfo = p0;
    }
    public void setImportCatchPath(ClipImportHandler$ClipImportCachePath p0){
       this.mImportCatchPath = p0;
    }
    public void setImportHandlerListener(ClipImportHandler$ClipImportHandlerListener p0){
       this.mImportHandlerListener = p0;
    }
    public void setImportParam(EditorEncodeConfigModule$ImportParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipImportHandler.class, "2")) {
          return;
       }
       this.setImportParamWithPriority(p0, 101);
       return;
    }
    public void setImportParam(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipImportHandler.class, "1")) {
          return;
       }
       this.setImportParamWithPriority(p0, 101);
       return;
    }
    public void setImportParamWithPriority(EditorEncodeConfigModule$ImportParam p0,int p1){
       this.mImportParam = p0;
       this.mOutImportParamsPriority = p1;
    }
    public void setImportParamWithPriority(String p0,int p1){
       ClipImportHandler uClipImportH = ClipImportHandler.class;
       if (PatchProxy.isSupport(uClipImportH) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uClipImportH, "3")) {
          return;
       }
       if (TextUtils.isEmpty(p0)) {
          return;
       }
       try{
          EditorEncodeConfigModule$ImportParam importParam = ClipKitUtils.COMMON_GSON.h(p0, EditorEncodeConfigModule$ImportParam.class);
          if (importParam != null) {
             this.setImportParamWithPriority(importParam, p1);
          }
       }catch(java.lang.Exception e5){
          KSClipLog.e("ClipImportHandler", "error:"+e5);
          KSClipLog.e("ClipImportHandler", "json parse error:"+p0);
       }
       return;
    }
    public void setRebuildCachePath(String p0){
       this.mRebuildCachePath = p0;
    }
    public void setSingleAssetMaxDuration(double p0){
       this.mTrackAssetMaxDuration = p0;
    }
    public EditorSdk2$ExportOptions setUpConfig(Context p0,EditorSdk2V2$VideoEditorProject p1,ClipImportHandler$TranscodeParams p2,int p3){
       EditorSdk2$ExportOptions obj;
       ClipImportHandler$TranscodeParams this;
       EditorEncodeConfigModule$ImportParam$TargetBitrate importParam$1;
       ClipImportHandler$TranscodeParams videoBitrate;
       ClipImportHandler uClipImportH = this;
       EditorSdk2V2$VideoEditorProject videoEditorP = p1;
       ClipImportHandler$TranscodeParams transcodePar = p2;
       int i = p3;
       if (PatchProxy.isSupport(ClipImportHandler.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, p2, Integer.valueOf(p3), this, ClipImportHandler.class, "16");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = EditorSdk2Utils.createDefaultExportOptions();
       if (transcodePar) {
          EditorEncodeConfigModule$ImportParam$TargetBitrate importParam$ = null;
          ClipImportHandler$TranscodeParams transcodePar1 = null;
          int i1 = 0;
          double trackAssetFp = (p1.trackAssets() != null && p1.trackAssets().length() > 0)? EditorSdk2UtilsV2.getTrackAssetFps(videoEditorP.trackAssets(i1)): transcodePar1;
          if (trackAssetFp - transcodePar1 <= 0) {
             trackAssetFp = EditorSdk2UtilsV2.getComputedFps(p1);
          }
          ClipImportHandler$TranscodeParams targetBitrat = transcodePar.targetBitrate;
          if (targetBitrat != null) {
             importParam$ = uClipImportH.getTargetBitrate(trackAssetFp, targetBitrat);
          }
          EditorEncodeConfigModule$ImportParam$TargetBitrate x264Params = (importParam$ != null)? importParam$.x264Params: transcodePar.x264Params;
          obj.setX264Params(x264Params);
          obj.setX264Preset(transcodePar.x264Preset);
          targetBitrat = transcodePar.width;
          transcodePar1 = transcodePar.height;
          this = transcodePar.fps;
          if (importParam$ != null) {
             EditorEncodeConfigModule$ImportParam$TargetBitrate width = importParam$.width;
             if (width > null) {
                EditorEncodeConfigModule$ImportParam$TargetBitrate height = importParam$.height;
                if (height > null) {
                   x264Params = width;
                   importParam$1 = height;
                }
             }
          }
          Pair exportSize = ClipKitUtils.getExportSize(videoEditorP, x264Params, importParam$1);
          obj.setWidth(exportSize.first.intValue());
          obj.setHeight(exportSize.second.intValue());
          if (this > null && trackAssetFp - (double)this > 0) {
             EditorSdk2$Rational rational = new EditorSdk2$Rational();
             rational.setDen(1);
             rational.setNum((long)transcodePar.fps);
             obj.setVideoFrameRate(rational);
          }
          ClipImportHandler mNeedRebuild = uClipImportH.mNeedRebuildResults;
          if (mNeedRebuild != null && i < mNeedRebuild.length) {
             obj.setDisableExportHdr(mNeedRebuild[i].transcodeDisableHDR);
          }
          if (transcodePar.supportHwEncode != null) {
             int i2 = (obj.width() > 0)? obj.width(): EditorSdk2UtilsV2.getComputedWidth(p1);
             int i3 = (obj.height() > 0)? obj.height(): EditorSdk2UtilsV2.getComputedHeight(p1);
             i2 = Math.max(i2, i3);
             if (transcodePar.forceMediaCodecBaseline != null) {
                transcodePar.minProfile = i1;
             }
             DPHardwareConfigManager$EncodeResult uEncodeResul = ClipDPHardwareConfigManager.getInstance().isSupportEncodeWithResult(p0.getApplicationContext(), "avc", i2, transcodePar.minEncodeSpeed, transcodePar.supportHwEncode, ClipKitUtils.getBenchmarkEncodeProfile(transcodePar.minProfile), transcodePar.alignmentFlag);
             if (uClipImportH.mDisableHwEncode == null && (i2 > 0 && uEncodeResul.isSupport != null)) {
                KSClipLog.i("ClipImportHandler", "support hw encode:"+videoEditorP.trackAssets(i1).assetPath());
                uClipImportH.mImportLog.useHwEncode = true;
                obj.setVideoEncoderType(5);
                x264Params = (importParam$ != null)? importParam$.videoGopSize: transcodePar.videoGopSize;
                obj.setVideoGopSize(x264Params);
                importParam$ = (importParam$ != null)? importParam$.videoBitrate: transcodePar.videoBitrate;
                obj.setVideoBitrate(importParam$);
                if (uEncodeResul.profile <= null) {
                   i1 = true;
                }
                obj.setForceMediacodecBaseline(i1);
             }else {
                obj.setVideoEncoderType(true);
                uClipImportH.mDisableHwEncode = i1;
             }
             obj.setAudioBitrate(transcodePar.audioBitrate);
             obj.setAudioCutoff(transcodePar.audioCutOff);
             obj.setAudioProfile(transcodePar.audioProfile);
          }
       }
       return obj;
    }
    public void setVideoExportType(int p0){
       this.mVideoExportType = p0;
    }
    public void updateClipImportResult(){
       if (PatchProxy.applyVoid(null, this, ClipImportHandler.class, "11")) {
          return;
       }
       ClipImportHandler$ClipImportResult uClipImportR = new ClipImportHandler$ClipImportResult();
       this.mClipImportResult = uClipImportR;
       ClipImportHandler tmImportPath = this.mImportPaths;
       int[] ointArray = new int[tmImportPath.length];
       uClipImportR.isRebuild = ointArray;
       String[] stringArray = new String[tmImportPath.length];
       uClipImportR.exportPaths = stringArray;
       ClipImportException[] uClipImportE = new ClipImportException[tmImportPath.length];
       uClipImportR.importExceptions = uClipImportE;
       int i = 0;
       tmImportPath = this.mImportPaths;
       while (i < tmImportPath.length) {
          ClipImportHandler tmClipImport = this.mClipImportResult;
          ClipImportHandler tmNeedRebuil = this.mNeedRebuildResults;
          tmClipImport.isRebuild[i] = tmNeedRebuil[i].needRebuild;
          if (tmNeedRebuil[i].needRebuild > null) {
             if (this.mRebuildTaskInfo == null) {
                this.mRebuildTaskInfo = new ArrayList();
             }
             this.mRebuildTaskInfo.add(new ClipImportHandler$RebuildTaskInfo(this.mImportPaths[i], this.mExportPaths[i], i, null));
             this.mClipImportResult.exportPaths[i] = this.mExportPaths[i];
          }else if(this.mRebuildCachePath != null){
             ClipImportHandler tmExportPath = this.mExportPaths;
             if (tmExportPath[i] != null && tmNeedRebuil[i].needRebuild == ClipImportHandler.DO_NOT_NEED_REBUILD_HAVE_CATCH) {
                tmClipImport.exportPaths[i] = tmExportPath[i];
             }
          }
          tmClipImport.exportPaths[i] = tmImportPath[i];
          i = i + 1;
       }
       return;
    }
}
