package com.kwai.video.clipkit.ClipAICutImportHandler;
import com.kwai.video.clipkit.ClipImportHandler;
import java.lang.String;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ExportOptions;
import com.kwai.video.clipkit.config.EditorEncodeConfigModule$ImportParam;
import android.content.Context;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.clipkit.config.EditorEncodeConfigManager;
import com.kwai.video.clipkit.config.EditorEncodeConfigModule;
import com.kwai.video.clipkit.KSClipLog;
import java.lang.Integer;
import java.lang.Number;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import com.kwai.video.clipkit.ClipImportHandler$ClipImportCachePath;
import com.kwai.video.clipkit.ClipKitUtils;
import java.lang.StringBuilder;
import java.util.Arrays;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import java.lang.Math;
import java.util.List;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ProbedStream;
import com.kwai.video.clipkit.config.EditorEncodeConfigModule$ImportTranscodeCondition;

public class ClipAICutImportHandler extends ClipImportHandler	// class@0019fb
{

    public void ClipAICutImportHandler(String p0,String[] p1,String[] p2,EditorSdk2$ExportOptions p3){
       super(p0, p1, p2, null);
       this.mType = 3;
       if (p3 != null) {
          this.setImportParam(this.covertExportOptionsToImportParam(p3));
       }
       return;
    }
    public EditorEncodeConfigModule$ImportParam getImportParamFromConfig(Context p0,EditorSdk2V2$VideoEditorProject p1){
       ClipImportHandler tmImportPara;
       EditorEncodeConfigModule$ImportParam obj = PatchProxy.applyTwoRefs(p0, p1, this, ClipAICutImportHandler.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = 0;
       if (this.mOutImportParamsPriority > 100) {
          tmImportPara = this.mImportParam;
       }else if(p0 != null){
          EditorEncodeConfigModule editorEncode = EditorEncodeConfigManager.getInstance().getEditorEncodeConfigModule(p0.getApplicationContext(), p1, 1);
          if (editorEncode != null) {
             obj = editorEncode.getImportAICutTransParams();
          }
       }else {
          KSClipLog.w("ClipAICutImportHandler", "do not set context importParams may be null");
       }
       if (obj == null) {
          tmImportPara = this.mImportParam;
       }else {
          tmImportPara = obj;
       }
       if (tmImportPara == null) {
          tmImportPara = EditorEncodeConfigModule.getImportAICutTransParamsWithType(0);
       }
       return tmImportPara;
    }
    public int isNeedRebuild(Context p0,String p1,int p2){
       EditorSdk2V2$VideoEditorProject obj;
       String importCacheP;
       int i2;
       EditorEncodeConfigModule$ImportTranscodeCondition importTransc1;
       String str3;
       int i5;
       int i6;
       int i7;
       ClipAICutImportHandler uClipAICutIm = this;
       String str = p1;
       if (PatchProxy.isSupport(ClipAICutImportHandler.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, ClipAICutImportHandler.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (EditorSdk2UtilsV2.isSingleImagePath(p1)) {
          return ClipImportHandler.DO_NOT_NEED_REBUILD_NORMAL;
       }else {
          obj = EditorSdk2UtilsV2.createProjectWithFile(p1);
          EditorEncodeConfigModule$ImportParam importParamF = uClipAICutIm.getImportParamFromConfig(p0, obj);
          int i = 6;
          uClipAICutIm.mBenchmarkVer = i;
          if (importParamF == null) {
             KSClipLog.d("ClipAICutImportHandler", "do not have importParams, do not need rebuild as default ");
             return ClipImportHandler.DO_NOT_NEED_REBUILD_NORMAL;
          }else {
             ClipImportHandler mImportCatch = uClipAICutIm.mImportCatchPath;
             String str1 = "do not need rebuild";
             String str2 = " file have cache:";
             if (mImportCatch != null) {
                importCacheP = mImportCatch.getImportCachePath(str, importParamF.version, i);
                if (ClipKitUtils.fileExists(importCacheP)) {
                   KSClipLog.d("ClipAICutImportHandler", str+str2+importCacheP+str1);
                   return ClipImportHandler.DO_NOT_NEED_REBUILD_HAVE_CATCH;
                }
             }else {
                importCacheP = uClipAICutIm.getRebuildCachePath(str, importParamF.version, i);
                mImportCatch = uClipAICutIm.mExportPaths;
                if (mImportCatch != null && (mImportCatch.length <= 0 || mImportCatch.length != uClipAICutIm.mImportPaths.length)) {
                   mImportCatch = uClipAICutIm.mImportPaths;
                   uClipAICutIm.mExportPaths = Arrays.copyOf(mImportCatch, mImportCatch.length);
                }
                if (importCacheP != null) {
                   uClipAICutIm.mExportPaths[p2] = importCacheP;
                }
                if (ClipKitUtils.fileExists(importCacheP)) {
                   KSClipLog.d("ClipAICutImportHandler", str+str2+importCacheP+str1);
                   return ClipImportHandler.DO_NOT_NEED_REBUILD_HAVE_CATCH;
                }
             }
             i = 0;
             int trackAssetWi = EditorSdk2UtilsV2.getTrackAssetWidth(obj.trackAssets(i));
             int trackAssetHe = EditorSdk2UtilsV2.getTrackAssetHeight(obj.trackAssets(i));
             int i1 = Math.min(trackAssetWi, trackAssetHe);
             trackAssetWi = Math.max(trackAssetWi, trackAssetHe);
             EditorEncodeConfigModule$ImportParam importTransc = importParamF.importTranscodeConditions;
             if (importTransc != null && importTransc.size() > 0) {
                double trackAssetFp = EditorSdk2UtilsV2.getTrackAssetFps(obj.trackAssets(i));
                if (EditorSdk2UtilsV2.trackAssetProbedVideoStream(obj.trackAssets(i)) == null) {
                   KSClipLog.w("ClipAICutImportHandler", "file do not need rebuild: there is no video stream in the file.");
                   return ClipImportHandler.DO_NOT_NEED_REBUILD_NORMAL;
                }else {
                   i2 = EditorSdk2UtilsV2.trackAssetProbedVideoStream(obj.trackAssets(i)).privateCodecId();
                   str1 = 1;
                   int i3 = 0;
                   int i4 = 0;
                   while (true) {
                      if (i3 < importParamF.importTranscodeConditions.size()) {
                         importTransc1 = importParamF.importTranscodeConditions.get(i3);
                         if (importTransc1.width > null && (importTransc1.height <= null || importTransc1.fps < null)) {
                            str3 = str1;
                            KSClipLog.w("ClipAICutImportHandler", "condition params error: "+importTransc1.width+","+importTransc1.height);
                            i4 = i4 + 1;
                         }else {
                            str3 = str1;
                         }
                         EditorEncodeConfigModule$ImportTranscodeCondition codecFlag = importTransc1.codecFlag;
                         if (codecFlag > null) {
                            trackAssetHe = codecFlag & i2;
                            if (trackAssetHe <= 0) {
                               str1 = str3;
                               i5 = i2;
                               i6 = i3;
                               i7 = i4;
                            label_01c9 :
                               i3 = i6 + 1;
                               i2 = i5;
                               i4 = i7;
                            }
                         }
                         trackAssetHe = Math.min(importTransc1.width, importTransc1.height);
                         i5 = i2;
                         i2 = Math.max(importTransc1.width, importTransc1.height);
                         if (i1 <= trackAssetHe && trackAssetWi <= i2) {
                            EditorEncodeConfigModule$ImportTranscodeCondition fps = importTransc1.fps;
                            if (fps > null) {
                               i6 = i3;
                               i7 = i4;
                               if (trackAssetFp - (double)fps > 0) {
                               label_01c8 :
                                  str1 = null;
                                  goto label_01c9 ;
                               }
                            }
                            break ;
                         }else {
                            i6 = i3;
                            i7 = i4;
                            goto label_01c8 ;
                         }
                      }else {
                         str3 = str1;
                         if (i4 == importParamF.importTranscodeConditions.size() || str3 != null) {
                            KSClipLog.d("ClipAICutImportHandler", "wrong condition params or do not have this codec condition, do not need rebuild");
                            return ClipImportHandler.DO_NOT_NEED_REBUILD_NORMAL;
                         }else {
                            KSClipLog.d("ClipAICutImportHandler", "no condition pass, need rebuild: "+str);
                            return ClipImportHandler.NEED_REBUILD;
                         }
                      }
                   }
                   KSClipLog.d("ClipAICutImportHandler", str+" file do not need rebuild: video["+i1+","+trackAssetWi+","+trackAssetFp+"] condition["+trackAssetHe+","+i2+","+importTransc1.fps+"]");
                   return ClipImportHandler.DO_NOT_NEED_REBUILD_NORMAL;
                }
             }else {
                EditorEncodeConfigModule$ImportParam maxImportWid = importParamF.maxImportWidth;
                if (maxImportWid <= null) {
                   maxImportWid = importParamF.width;
                }
                EditorEncodeConfigModule$ImportParam maxImportHei = importParamF.maxImportHeight;
                if (maxImportHei <= null) {
                   maxImportHei = importParamF.height;
                }
                int i8 = Math.min(maxImportWid, maxImportHei);
                i2 = Math.max(maxImportWid, maxImportHei);
                if (i1 <= i8 && trackAssetWi <= i2) {
                   KSClipLog.d("ClipAICutImportHandler", str+" file do not need rebuild: video["+i1+","+trackAssetWi+"] condition["+i8+","+i2+",]");
                   return ClipImportHandler.DO_NOT_NEED_REBUILD_NORMAL;
                }else {
                   KSClipLog.d("ClipAICutImportHandler", "no maxImport pass, need rebuild: "+str);
                   return ClipImportHandler.NEED_REBUILD;
                }
             }
          }
       }
    }
}
