package com.kwai.video.clipkit.ClipMVImportHandler;
import com.kwai.video.clipkit.ClipImportHandler;
import java.lang.String;
import com.kwai.video.clipkit.ClipMVImportHandler$MVImportVideoInfo;
import java.lang.Object;
import com.kwai.video.clipkit.ClipImportHandler$ImportVideoInfo;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import com.kwai.video.clipkit.KSClipLog;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import java.lang.IllegalArgumentException;
import java.lang.Double;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.video.clipkit.config.EditorEncodeConfig$MVImportParams;
import com.kwai.video.clipkit.ClipImportHandler$ClipImportCachePath;
import com.kwai.video.clipkit.ClipKitUtils;
import java.util.Arrays;
import android.content.Context;
import java.util.List;
import com.kwai.video.clipkit.ClipMVImportHandler$MVImportVideoSegment;
import java.util.Iterator;
import com.kwai.video.clipkit.a;
import java.util.Comparator;
import java.util.Collections;
import com.kwai.video.clipkit.config.EditorEncodeConfigManager;
import com.kwai.video.clipkit.config.EditorEncodeConfig$MVTranscodeParams;
import java.io.File;
import com.kwai.video.clipkit.ClipImportHandler$TranscodeParams;
import java.lang.Number;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import java.lang.Math;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ProbedStream;
import com.kwai.video.clipkit.config.EditorEncodeConfigModule$ImportTranscodeCondition;
import com.kwai.video.clipkit.log.ClipEditImportLog;
import com.kwai.video.clipkit.log.ClipEditExtraInfo;
import android.os.SystemClock;
import com.kwai.video.clipkit.ClipImportHandler$NeedRebuildResult;
import java.util.ArrayList;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$TimeRange;
import java.lang.Exception;
import java.io.IOException;
import com.kwai.video.clipkit.ClipImportHandler$ImportType;
import com.kwai.video.clipkit.log.ClipEditLogger;
import com.kwai.video.clipkit.ClipImportHandler$ClipImportResult;
import com.kwai.video.clipkit.ClipImportException;
import java.util.HashSet;
import java.util.Collection;
import com.kwai.video.clipkit.b;
import com.kwai.video.clipkit.ClipMVImportHandler$1;
import com.google.gson.Gson;

public class ClipMVImportHandler extends ClipImportHandler	// class@001a39
{
    public EditorEncodeConfig$MVImportParams mMVImportParams;
    public ClipMVImportHandler$MVImportVideoInfo[] mVideoInfos;
    public List mVideoSegments;

    public void ClipMVImportHandler(String p0,ClipMVImportHandler$MVImportVideoInfo[] p1,String p2,int p3){
       super();
       int len = p1.length;
       String[] stringArray = new String[len];
       String[] stringArray1 = new String[p1.length];
       this.mVideoInfos = p1.clone();
       int i = 0;
       for (int i1 = 0; i1 < p1.length; i1 = i1 + 1) {
          stringArray[i1] = p1[i1].importPath;
          stringArray1[i1] = p1[i1].exportPath;
          this.mVideoInfos[i1].exportType = p3;
       }
       this.mSessionId = p0;
       this.mExportPaths = stringArray1;
       this.mImportPaths = stringArray;
       p0 = "input paths is wrong";
       String str = "ClipMVImportHandler";
       if (len > 0) {
          p3 = 0;
          while (p3 < len) {
             if (TextUtils.isEmpty(stringArray[p3])) {
                KSClipLog.e(str, "ClipImportHandler create wrong path "+p3+"is null");
                i = 1;
                break ;
             }else {
                p3++;
             }
          }
          if (!i) {
             this.mProject = EditorSdk2UtilsV2.createProjectWithFileArray(stringArray);
             this.setMVImportParam(p2);
             this.mType = 2;
             return;
          }else {
             KSClipLog.e(str, "ClipImportHandler has wrong path");
             throw new IllegalArgumentException(p0);
          }
       }else {
          KSClipLog.e(str, "ClipImportHandler create input path length <=0");
          throw new IllegalArgumentException(p0);
       }
    }
    public void ClipMVImportHandler(String p0,String[] p1,String[] p2,String p3,int p4){
       super();
       ClipMVImportHandler$MVImportVideoInfo[] mVImportVide = new ClipMVImportHandler$MVImportVideoInfo[p1.length];
       this.mVideoInfos = mVImportVide;
       StringBuilder str = null;
       int i = 0;
       ClipMVImportHandler tmVideoInfos = this.mVideoInfos;
       while (i < tmVideoInfos.length) {
          tmVideoInfos[i].importPath = p1[i];
          tmVideoInfos[i].exportPath = p2[i];
          tmVideoInfos[i].exportType = p4;
          i = i + 1;
       }
       this.mSessionId = p0;
       this.mExportPaths = p2;
       this.mImportPaths = p1;
       if (p1.length > 0) {
          int i1 = 0;
          while (i1 < p1.length) {
             if (TextUtils.isEmpty(p1[i1])) {
                KSClipLog.e("ClipMVImportHandler", "ClipImportHandler create wrong path "+i1+"is null");
                str = 1;
                break ;
             }else {
                i1++;
             }
          }
          if (str == null) {
             this.mProject = EditorSdk2UtilsV2.createProjectWithFileArray(p1);
             this.setMVImportParam(p3);
             this.mType = 2;
             return;
          }else {
             KSClipLog.e("ClipMVImportHandler", "ClipImportHandler has wrong path");
             throw new IllegalArgumentException("input paths is wrong");
          }
       }else {
          KSClipLog.e("ClipMVImportHandler", "ClipImportHandler create input path length <=0");
          throw new IllegalArgumentException("input paths is wrong");
       }
    }
    public static int lambda$calculateVideoInfos$1(ClipMVImportHandler$MVImportVideoInfo p0,ClipMVImportHandler$MVImportVideoInfo p1){
       int i = 100;
       int i1 = (p0.isNeedRebuild != null)? 100: 0;
       if (p1.isNeedRebuild == null) {
          i = 0;
       }
       ClipImportHandler$ImportVideoInfo width = p0.width;
       ClipImportHandler$ImportVideoInfo height = p0.height;
       ClipImportHandler$ImportVideoInfo width1 = p1.width;
       ClipImportHandler$ImportVideoInfo height1 = p1.height;
       if (((width * height) + i1) < ((width1 * height1) + i)) {
          return 1;
       }else if(((width * height) + i1) > ((width1 * height1) + i)){
          return -1;
       }else {
          return 0;
       }
    }
    public static int lambda$packetVideoInfos$0(Double p0,Double p1){
       if (p0.doubleValue() - p1.doubleValue() < 0) {
          return -1;
       }
       if (p0.doubleValue() - p1.doubleValue() > 0) {
          return 1;
       }
       return 0;
    }
    public final boolean cachePathExist(ClipMVImportHandler$MVImportVideoInfo p0,int p1){
       StringBuilder obj;
       String importCacheP;
       ClipImportHandler tmExportPath;
       boolean b;
       ClipMVImportHandler uClipMVImpor = ClipMVImportHandler.class;
       if (PatchProxy.isSupport(uClipMVImpor)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uClipMVImpor, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = null;
       ClipMVImportHandler tmMVImportPa = this.mMVImportParams;
       EditorEncodeConfig$MVImportParams version = (tmMVImportPa != null)? tmMVImportPa.version: 1;
       ClipImportHandler tmImportCatc = this.mImportCatchPath;
       if (tmImportCatc != null) {
          importCacheP = tmImportCatc.getImportCachePath(p0.importPath, version, this.mBenchmarkVer);
          if (ClipKitUtils.fileExists(importCacheP)) {
             KSClipLog.d("ClipMVImportHandler", p0.importPath+" file have catch:"+importCacheP+"do not need rebuild");
             tmExportPath = this.mExportPaths;
             if (tmExportPath[p1] != null) {
                tmExportPath[p1] = importCacheP;
             }
          }else {
          label_00af :
             return b;
          }
       }else {
          importCacheP = this.getRebuildCachePath(p0, version, this.mBenchmarkVer);
          tmImportCatc = this.mExportPaths;
          if (tmImportCatc != null && (tmImportCatc.length <= 0 || tmImportCatc.length != this.mImportPaths.length)) {
             tmImportCatc = this.mImportPaths;
             this.mExportPaths = Arrays.copyOf(tmImportCatc, tmImportCatc.length);
          }
          if (importCacheP != null) {
             this.mExportPaths[p1] = importCacheP;
          }
          if (ClipKitUtils.fileExists(importCacheP)) {
             KSClipLog.d("ClipMVImportHandler", p0.importPath+" file have catch:"+importCacheP+"do not need rebuild");
             tmExportPath = this.mExportPaths;
             if (tmExportPath[p1] != null) {
                tmExportPath[p1] = importCacheP;
             }
          }else {
             goto label_00af ;
          }
       }
       b = true;
       goto label_00af ;
    }
    public final void calculateVideoInfos(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipMVImportHandler.class, "11")) {
          return;
       }
       ClipMVImportHandler tmVideoSegme = this.mVideoSegments;
       if (tmVideoSegme != null && tmVideoSegme.size()) {
          int i = 0;
          ClipMVImportHandler$MVImportVideoSegment mVImportVide = this.mVideoSegments.get(i);
          Iterator iterator = this.mVideoSegments.iterator();
          while (iterator.hasNext()) {
             ClipMVImportHandler$MVImportVideoSegment mVImportVide1 = iterator.next();
             mVImportVide1.maxPixel = 0;
             ClipMVImportHandler tmVideoInfos = this.mVideoInfos;
             int len = tmVideoInfos.length;
             for (int i1 = 0; i1 < len; i1 = i1 + 1) {
                object oobject = tmVideoInfos[i1];
                int i2 = oobject.width * oobject.height;
                long l = mVImportVide1.maxPixel + (long)i2;
                mVImportVide1.maxPixel = l;
             }
             if (mVImportVide1.maxPixel - mVImportVide.maxPixel > 0) {
                mVImportVide = mVImportVide1;
             }
          }
          Collections.sort(mVImportVide.videoInfoList, a.b);
          if (mVImportVide.maxPixel - mVImportVide.multiMaxResolution > 0) {
             iterator = mVImportVide.videoInfoList.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   if (this.videoInfoDegrade(p0, iterator.next())) {
                      i = 1;
                   }
                }
                if (i) {
                   KSClipLog.i("ClipMVImportHandler", "calculateVideoInfos videoSegment need degrade start");
                }else {
                   KSClipLog.i("ClipMVImportHandler", "calculateVideoInfos no videoInfo can degrade, delete videoSegment");
                   this.mVideoSegments.remove(mVImportVide);
                }
                this.calculateVideoInfos(p0);
                break ;
             }
          }
       }
       return;
    }
    public final EditorEncodeConfig$MVImportParams getMVImportParams(Context p0){
       ClipMVImportHandler uClipMVImpor;
       EditorEncodeConfig$MVImportParams obj = PatchProxy.applyOneRefs(p0, this, ClipMVImportHandler.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       ClipMVImportHandler tmMVImportPa = this.mMVImportParams;
       if (tmMVImportPa != null) {
          uClipMVImpor = tmMVImportPa;
       }else if(p0 != null){
          EditorEncodeConfig$MVImportParams mVImportPara = EditorEncodeConfigManager.getInstance().getMVImportParamsConfig();
          if (mVImportPara != null) {
             this.mMVImportParams = mVImportPara;
             uClipMVImpor = mVImportPara;
          }
       }else {
          KSClipLog.w("ClipMVImportHandler", "do not set context mvImportParam may be null");
       }
       return uClipMVImpor;
    }
    public final EditorEncodeConfig$MVTranscodeParams getMVTranscodeParams(EditorEncodeConfig$MVImportParams p0,int p1){
       if (p0 == null) {
          return null;
       }
       if (!p1) {
          return p0.transcode576p;
       }
       if (p1 == 1) {
          return p0.transcode720p;
       }
       if (p1 != 2) {
          return null;
       }
       return p0.transcode1080p;
    }
    public final String getRebuildCachePath(ClipMVImportHandler$MVImportVideoInfo p0,int p1,int p2){
       String obj;
       if (PatchProxy.isSupport(ClipMVImportHandler.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, ClipMVImportHandler.class, "1");
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
                   str = obj.substring(0, i1);
                   obj = (!EditorSdk2UtilsV2.isSingleImagePath(p0.importPath))? ".mp4": obj.substring(i1, obj.length());
                   return this.mRebuildCachePath+File.separator+str+"_"+p0.exportType+"_"+p1+"_"+p2+obj;
                }
             }
          }
       }
       return str;
    }
    public ClipImportHandler$TranscodeParams getTranscodeParams(Context p0,EditorSdk2V2$VideoEditorProject p1,int p2){
       if (PatchProxy.isSupport(ClipMVImportHandler.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, ClipMVImportHandler.class, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.getTranscodeParams(p0, p1, this.mVideoInfos[p2]);
    }
    public final ClipImportHandler$TranscodeParams getTranscodeParams(Context p0,EditorSdk2V2$VideoEditorProject p1,ClipImportHandler$ImportVideoInfo p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ClipMVImportHandler.class, "9");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       EditorEncodeConfig$MVImportParams mVImportPara = this.getMVImportParams(p0);
       ClipImportHandler$TranscodeParams transcodePar = null;
       EditorEncodeConfig$MVTranscodeParams mVTranscodeP = (p2 != null && p2 instanceof ClipMVImportHandler$MVImportVideoInfo)? this.getMVTranscodeParams(mVImportPara, p2.exportType): transcodePar;
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
       }
       return transcodePar;
    }
    public int isNeedRebuild(Context p0,ClipMVImportHandler$MVImportVideoInfo p1,int p2){
       EditorSdk2V2$VideoEditorProject obj;
       EditorEncodeConfigModule$ImportTranscodeCondition importTransc1;
       EditorEncodeConfig$MVTranscodeParams mVTranscodeP1;
       String str1;
       String str2;
       ClipMVImportHandler uClipMVImpor = this;
       ClipImportHandler$ImportVideoInfo importVideoI = p1;
       if (PatchProxy.isSupport(ClipMVImportHandler.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, ClipMVImportHandler.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int b = true;
       if (EditorSdk2UtilsV2.isSingleImagePath(importVideoI.importPath)) {
          importVideoI.isImage = b;
          return ClipImportHandler.DO_NOT_NEED_REBUILD_NORMAL;
       }else {
          obj = EditorSdk2UtilsV2.createProjectWithFile(importVideoI.importPath);
          EditorEncodeConfig$MVImportParams mVImportPara = this.getMVImportParams(p0);
          uClipMVImpor.mBenchmarkVer = 6;
          String str = "ClipMVImportHandler";
          if (mVImportPara == null) {
             KSClipLog.d(str, "do not have importParams, do not need rebuild as default ");
             return ClipImportHandler.DO_NOT_NEED_REBUILD_NORMAL;
          }else {
             EditorEncodeConfig$MVTranscodeParams mVTranscodeP = uClipMVImpor.getMVTranscodeParams(mVImportPara, importVideoI.exportType);
             if (mVTranscodeP != null) {
                EditorEncodeConfig$MVTranscodeParams importTransc = mVTranscodeP.importTranscodeConditions;
                if (importTransc != null && importTransc.size() > 0) {
                   int i = 0;
                   double trackAssetFp = EditorSdk2UtilsV2.getTrackAssetFps(obj.trackAssets(i));
                   int trackAssetWi = EditorSdk2UtilsV2.getTrackAssetWidth(obj.trackAssets(i));
                   int trackAssetHe = EditorSdk2UtilsV2.getTrackAssetHeight(obj.trackAssets(i));
                   importVideoI.width = trackAssetWi;
                   importVideoI.height = trackAssetHe;
                   importVideoI.multiMaxResolution = mVTranscodeP.multiMaxResolution;
                   int i1 = Math.min(trackAssetWi, trackAssetHe);
                   trackAssetWi = Math.max(trackAssetWi, trackAssetHe);
                   int i2 = EditorSdk2UtilsV2.trackAssetProbedVideoStream(obj.trackAssets(i)).privateCodecId();
                   trackAssetHe = 0;
                   int i3 = 0;
                   while (true) {
                      if (trackAssetHe < mVTranscodeP.importTranscodeConditions.size()) {
                         importTransc1 = mVTranscodeP.importTranscodeConditions.get(trackAssetHe);
                         if (importTransc1.width > null && (importTransc1.height <= null || importTransc1.fps < null)) {
                            KSClipLog.w(str, "condition params error: "+importTransc1.width+","+importTransc1.height);
                            i3 = i3 + 1;
                         }
                         EditorEncodeConfigModule$ImportTranscodeCondition codecFlag = importTransc1.codecFlag;
                         if (codecFlag > null) {
                            i = codecFlag & i2;
                            if (i <= 0) {
                               mVTranscodeP1 = mVTranscodeP;
                               str2 = str;
                            label_0154 :
                               trackAssetHe = trackAssetHe + 1;
                               str = str2;
                               mVTranscodeP = mVTranscodeP1;
                               String str3 = null;
                            }
                         }
                         b = Math.min(importTransc1.width, importTransc1.height);
                         i = Math.max(importTransc1.width, importTransc1.height);
                         if (i1 <= b && trackAssetWi <= i) {
                            EditorEncodeConfigModule$ImportTranscodeCondition fps = importTransc1.fps;
                            if (fps > null) {
                               mVTranscodeP1 = mVTranscodeP;
                               str1 = str;
                               if (trackAssetFp - (double)fps > 0) {
                                  str2 = str1;
                               }
                            }else {
                               str1 = str;
                               break ;
                            }
                            break ;
                         }else {
                            mVTranscodeP1 = mVTranscodeP;
                            str2 = str;
                         }
                         b = null;
                         goto label_0154 ;
                      }else {
                         str2 = str;
                         if (i3 == mVTranscodeP.importTranscodeConditions.size() || b != null) {
                            KSClipLog.d(str2, "wrong condition params or do not have this codec condition, do not need rebuild");
                            return ClipImportHandler.DO_NOT_NEED_REBUILD_NORMAL;
                         }else {
                            KSClipLog.d(str2, "no condition pass, need rebuild: "+importVideoI.importPath);
                            return ClipImportHandler.NEED_REBUILD;
                         }
                      }
                   }
                   KSClipLog.d(str1, importVideoI.importPath+" file do not need rebuild: video["+i1+","+trackAssetWi+","+trackAssetFp+"] condition["+b+","+i+","+importTransc1.fps+"]");
                   return ClipImportHandler.DO_NOT_NEED_REBUILD_NORMAL;
                }
             }
             KSClipLog.d(str, importVideoI.importPath+"file not need rebuild ");
             return ClipImportHandler.DO_NOT_NEED_REBUILD_NORMAL;
          }
       }
    }
    public int[] isNeedRebuild(Context p0){
       ClipImportHandler$ClipImportResult uClipImportR;
       ClipImportHandler obj = PatchProxy.applyOneRefs(p0, this, ClipMVImportHandler.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mImportPaths;
       if (obj == null || obj.length <= 0) {
          KSClipLog.i("ClipMVImportHandler", "no input paths");
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
       this.mVideoSegments = new ArrayList();
       ArrayList uArrayList = new ArrayList();
       int i1 = 0;
       int i2 = 0;
       ClipMVImportHandler tmVideoInfos = this.mVideoInfos;
       while (i1 < tmVideoInfos.length) {
          try{
             this.mNeedRebuildResults[i1].needRebuild = this.isNeedRebuild(p0, tmVideoInfos[i1], i1);
             uArrayList.add(Double.valueOf(this.mVideoInfos[i1].timeRange.start()));
             double d = this.mVideoInfos[i1].timeRange.start() + this.mVideoInfos[i1].timeRange.duration();
             uArrayList.add(Double.valueOf(d));
             if (this.mNeedRebuildResults[i1].needRebuild > null) {
                tmVideoInfos = this.mVideoInfos;
                tmVideoInfos[i1].isNeedRebuild = true;
                this.updateVideoInfoWidthHeight(p0, tmVideoInfos[i1]);
                i2 = 1;
             }
          }catch(java.io.IOException e5){
             e5.printStackTrace();
          }catch(com.kwai.video.editorsdk2.EditorSdk2InternalErrorException e5){
             e5.printStackTrace();
          }
          i1 = i1 + 1;
       }
       this.packetVideoInfos(p0, uArrayList);
       i = 0;
       ClipMVImportHandler tmVideoInfos1 = this.mVideoInfos;
       while (i < tmVideoInfos1.length) {
          object oobject = tmVideoInfos1[i];
          if (oobject.isNeedRebuild != null) {
             if (!this.cachePathExist(oobject, i)) {
                this.mNeedRebuildResults[i].needRebuild = ClipImportHandler.NEED_REBUILD;
                i2 = 1;
             }else {
                this.mNeedRebuildResults[i].needRebuild = ClipImportHandler.DO_NOT_NEED_REBUILD_HAVE_CATCH;
             }
          }
          i = i + 1;
       }
       if (!i2 && this.mFirstReport != null) {
          if (this.mIsNeedReportStart != null) {
             if (this.isAllImage() != ClipImportHandler$ImportType.ALL_IMAGE) {
                ClipEditImportLog uClipEditImp1 = new ClipEditImportLog(p0, this.mType, this.mSessionId, this.mProject, this.mExtraInfo);
                this.mImportLog = i;
                i.encodeStartTime = SystemClock.elapsedRealtime();
                ClipEditLogger.reportImportLog(true, this.mImportLog);
             }
             this.mIsNeedReportStart = b;
          }
          this.mFirstReport = b;
          this.updateClipImportResult();
          this.notifyFinishedCallback(this.mClipImportResult);
          if (this.isAllImage() != ClipImportHandler$ImportType.ALL_IMAGE) {
             if (this.mClipImportResult == null) {
                uClipImportR = new ClipImportHandler$ClipImportResult();
                this.mClipImportResult = uClipImportR;
                ClipImportException[] uClipImportE = new ClipImportException[this.mImportPaths.length];
                uClipImportR.importExceptions = uClipImportE;
             }
             uClipImportR.isRebuild = this.castNeedRebuildResultToIntArray();
             uClipImportR.encodeEndTime = SystemClock.elapsedRealtime();
             ClipImportHandler tmImportLog = this.mImportLog;
             tmImportLog.importResult = this.mClipImportResult;
             ClipEditLogger.reportImportLog(7, tmImportLog);
          }
       }
    label_0153 :
       return this.castNeedRebuildResultToIntArray();
    }
    public final void packetVideoInfos(Context p0,List p1){
       Object obj = this;
       Object obj1 = p1;
       if (PatchProxy.applyVoidTwoRefs(p0, obj1, obj, ClipMVImportHandler.class, "10")) {
          return;
       }
       HashSet hashSet = new HashSet();
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          hashSet.add(iterator.next());
       }
       p1.clear();
       obj1.addAll(hashSet);
       Collections.sort(obj1, b.b);
       KSClipLog.i("ClipMVImportHandler", "videoSegment timeSteps order:"+obj1);
       int i = 0;
       int i1 = p1.size() - 1;
       while (i < i1) {
          Double uDouble = obj1.get(i);
          int i2 = i + 1;
          Double uDouble1 = obj1.get(i2);
          ClipMVImportHandler$MVImportVideoSegment mVImportVide = new ClipMVImportHandler$MVImportVideoSegment(null);
          mVImportVide.videoInfoList = new ArrayList();
          int i3 = 0;
          ClipMVImportHandler mVideoInfos = obj.mVideoInfos;
          while (i3 < mVideoInfos.length) {
             object oobject = mVideoInfos[i3];
             if (oobject.isImage == null && oobject.timeRange.start() - uDouble1.doubleValue() <= 0) {
                double d = oobject.timeRange.start() + oobject.timeRange.duration();
                if (d - uDouble.doubleValue() > 0) {
                   ClipMVImportHandler$MVImportVideoInfo multiMaxReso = oobject.multiMaxResolution;
                   if (multiMaxReso - mVImportVide.multiMaxResolution > 0) {
                      mVImportVide.multiMaxResolution = multiMaxReso;
                   }
                   mVImportVide.videoInfoList.add(oobject);
                   KSClipLog.i("ClipMVImportHandler", "videoSegment["+i+"] videoInfo["+i3+"]pixel:"+oobject.width+"*"+oobject.height);
                }
             }
             i3 = i3 + 1;
          }
          obj.mVideoSegments.add(mVImportVide);
          i = i2;
       }
       this.calculateVideoInfos(p0);
       return;
    }
    public void setMVImportParam(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipMVImportHandler.class, "3")) {
          return;
       }
       if (TextUtils.isEmpty(p0)) {
          return;
       }
       try{
          EditorEncodeConfig$MVImportParams mVImportPara = ClipKitUtils.COMMON_GSON.h(p0, EditorEncodeConfig$MVImportParams.class);
          if (mVImportPara != null) {
             this.mMVImportParams = mVImportPara;
          }
       }catch(java.lang.Exception e0){
          KSClipLog.e("ClipMVImportHandler", "error:"+e0);
          KSClipLog.e("ClipMVImportHandler", "json parse error:"+p0);
       }
       return;
    }
    public final void updateVideoInfoWidthHeight(Context p0,ClipMVImportHandler$MVImportVideoInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ClipMVImportHandler.class, "6")) {
          return;
       }
       ClipImportHandler$TranscodeParams transcodePar = this.getTranscodeParams(p0, this.mProject, p1);
       if (transcodePar != null) {
          p1.width = transcodePar.width;
          p1.height = transcodePar.height;
       }
       return;
    }
    public final boolean videoInfoDegrade(Context p0,ClipMVImportHandler$MVImportVideoInfo p1){
       ClipMVImportHandler$MVImportVideoInfo obj = PatchProxy.applyTwoRefs(p0, p1, this, ClipMVImportHandler.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = p1.exportType;
       if (obj <= null) {
          return false;
       }
       if (p1.isNeedRebuild != null) {
          p1.exportType = obj - 1;
       }
       p1.isNeedRebuild = true;
       KSClipLog.i("ClipMVImportHandler", "videoSegment videoInfo pixel"+p1.width+"*"+p1.height);
       this.updateVideoInfoWidthHeight(p0, p1);
       KSClipLog.i("ClipMVImportHandler", "videoSegment videoInfo need degrade pixel:"+p1.width+"*"+p1.height);
       return 1;
    }
}
