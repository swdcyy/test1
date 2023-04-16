package com.kwai.video.ksmemorykit.EditorMemoryProjectCreator;
import java.lang.Object;
import com.kwai.video.ksmemorykit.EditorMemoryParams;
import com.kwai.kve.SmartEditResult;
import java.util.List;
import com.kwai.kve.AlbumType;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.ksmemorykit.EditorMemoryAsset;
import com.kwai.video.editorsdk2.kve.EditorKveAsset;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.kve.MediaAnalyzeResult;
import com.kwai.video.editorsdk2.logger.EditorSdkLogger;
import com.kwai.kve.ErrorInfo;
import com.kwai.kve.ErrorInfo$ErrorCode;
import java.lang.StringBuilder;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.robust.PatchProxyResult;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Set;
import java.util.Collection;
import com.kwai.video.ksmemorykit.a;
import java.util.Comparator;
import java.util.Collections;
import java.util.Map$Entry;
import com.kwai.kve.MediaAsset;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import java.util.HashMap;
import java.util.Iterator;
import com.kwai.video.editorsdk2.kve.EditorKveVoiceDetectResult;
import java.lang.Math;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import com.kwai.video.minecraft.model.EditorSdk2V2$TimeRangeV2;
import com.kwai.video.minecraft.model.nano.Minecraft$Range;
import com.kwai.video.minecraft.model.nano.Minecraft$VisualEffectParam;
import java.lang.Float;
import java.lang.Boolean;
import com.kwai.video.minecraft.model.nano.Minecraft$VisualEffectCameraMovementParams;
import java.lang.Integer;
import java.lang.Double;
import android.graphics.PointF;
import com.kwai.video.minecraft.model.nano.Minecraft$AssetTransform;
import com.kwai.video.minecraft.model.nano.Minecraft$TransitionParam;
import java.util.Arrays;
import java.util.Date;
import com.kwai.kve.ProjectItem;
import java.lang.Long;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ProbedFile;
import com.kwai.kve.SmartEditTask;

public class EditorMemoryProjectCreator	// class@0008ef
{

    public void EditorMemoryProjectCreator(){
       super();
    }
    public static void createCoverAsset(EditorMemoryParams p0,SmartEditResult p1,List p2,AlbumType p3){
       EditorSdk2V2$TrackAsset trackAsset;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, EditorMemoryProjectCreator.class, "11")) {
          return;
       }
       int i = 0;
       String str = (p0 != null && (p0.getCoverAsset() != null && !TextUtils.isEmpty(p0.getCoverAsset().getFileName())))? 1: null;
       if (str) {
          String fileName = p0.getCoverAsset().getFileName();
          MediaAnalyzeResult coverAnalyze = p1.getCoverAnalyzeResult();
          String str1 = "ProjectCreator";
          if (coverAnalyze == null) {
             EditorSdkLogger.e(str1, "Has Cover asset, but no cover result");
          }else if(coverAnalyze.getErrorInfo().getErrorCode() != ErrorInfo$ErrorCode.OK){
             EditorSdkLogger.e(str1, "Cover asset error: "+fileName+", error: "+coverAnalyze.getErrorInfo().getErrorCode());
          }else if(coverAnalyze.getWidth() <= 0 || coverAnalyze.getHeight() <= 0){
             EditorSdkLogger.e(str1, "Cover asset result size invalid: "+coverAnalyze.getWidth()+" x "+coverAnalyze.getHeight());
          }else {
          label_00a4 :
             i = str;
          }
       }else {
          goto label_00a4 ;
       }
       if (i != null) {
          float f = ((float)p0.getMemoryHeight() * 0x3f800000) / (float)p0.getMemoryWidth();
          String fileName1 = p0.getCoverAsset().getFileName();
          MediaAnalyzeResult coverAnalyze1 = p1.getCoverAnalyzeResult();
          if (coverAnalyze1.isImage()) {
             float clipDuration = (coverAnalyze1.getClipDuration() > 0)? coverAnalyze1.getClipDuration(): p0.getImageClipTime();
             trackAsset = EditorMemoryProjectCreator.generateImageAsset(coverAnalyze1, fileName1, clipDuration, p0.getMemoryWidth(), p0.getMemoryHeight(), f, true, p3);
          }else {
             trackAsset = EditorMemoryProjectCreator.generateVideoAsset(coverAnalyze1, fileName1);
          }
          if (trackAsset != null) {
             p2.add(trackAsset);
          }
       }
       return;
    }
    public static EditorSdk2V2$VideoEditorProject createProjectFromAnalyzeResult(SmartEditResult p0,EditorMemoryParams p1){
       EditorSdk2V2$TrackAsset trackAsset;
       EditorSdk2V2$VideoEditorProject obj = PatchProxy.applyTwoRefs(p0, p1, null, EditorMemoryProjectCreator.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new EditorSdk2V2$VideoEditorProject();
       ArrayList uArrayList = new ArrayList(new LinkedHashMap(p0.getMediaAnalyzeResults()).entrySet());
       Collections.sort(uArrayList, a.b);
       ArrayList uArrayList1 = new ArrayList();
       EditorMemoryProjectCreator.createCoverAsset(p1, p0, uArrayList1, AlbumType.MEMORY);
       if (uArrayList.isEmpty() && !uArrayList1.size()) {
          EditorSdkLogger.e("ProjectCreator", "SmartResult do not have track assets!");
          return obj;
       }else {
          float f = ((float)p1.getMemoryHeight() * 0x3f800000) / (float)p1.getMemoryWidth();
          int i = 0;
          int i1 = 0;
          while (i1 < uArrayList.size()) {
             MediaAsset key = uArrayList.get(i1).getKey();
             MediaAnalyzeResult value = uArrayList.get(i1).getValue();
             if (value.getErrorInfo().getErrorCode() != ErrorInfo$ErrorCode.OK) {
                EditorSdkLogger.e("ProjectCreator", "SmartResult error asset: "+key.getFileName()+", error: "+value.getErrorInfo().getErrorCode());
             }else if(value.isImage()){
                float clipDuration = (value.getClipDuration() - null > 0)? value.getClipDuration(): p1.getImageClipTime();
                trackAsset = EditorMemoryProjectCreator.generateImageAsset(value, key.getFileName(), clipDuration, p1.getMemoryWidth(), p1.getMemoryHeight(), f, false, AlbumType.MEMORY);
             }else {
                trackAsset = EditorMemoryProjectCreator.generateVideoAsset(value, key.getFileName());
             }
             if (trackAsset != null) {
                uArrayList1.add(trackAsset);
             }
             i1 = i1 + 1;
          }
          if (uArrayList1.size() > 0) {
             EditorSdk2V2$TrackAsset[] trackAssetAr = new EditorSdk2V2$TrackAsset[uArrayList1.size()];
             obj.setTrackAssets(trackAssetAr);
             for (; i < uArrayList1.size(); i = i + 1) {
                obj.trackAssetsSetItem(i, uArrayList1.get(i));
             }
          }
          EditorMemoryProjectCreator.setTransitionParamToProjectAssets(obj);
          obj.setProjectId(EditorSdk2Utils.getRandomID());
          obj.setBlurPaddingArea(true);
          obj.setProjectOutputHeight(p1.getMemoryHeight());
          obj.setProjectOutputWidth(p1.getMemoryWidth());
          return obj;
       }
    }
    public static EditorSdk2V2$VideoEditorProject createProjectFromSmartClipResult(List p0,SmartEditResult p1,Map p2,EditorMemoryParams p3){
       EditorSdk2V2$VideoEditorProject videoEditorP;
       ArrayList uArrayList1;
       HashMap hashMap1;
       Iterator iterator1;
       EditorSdk2V2$TrackAsset obj1;
       double d;
       double d1;
       ArrayList uArrayList2;
       double d3;
       EditorSdk2V2$VideoEditorProject videoEditorP1;
       EditorSdk2V2$VideoEditorProject obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, EditorMemoryProjectCreator.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new EditorSdk2V2$VideoEditorProject();
       Map mediaAnalyze = p1.getMediaAnalyzeResults();
       HashMap hashMap = new HashMap();
       Iterator iterator = mediaAnalyze.keySet().iterator();
       while (iterator.hasNext()) {
          MediaAsset mediaAsset = iterator.next();
          String fileName = mediaAsset.getFileName();
          hashMap.put(fileName, mediaAnalyze.get(mediaAsset));
       }
       ArrayList uArrayList = new ArrayList();
       EditorMemoryProjectCreator.createCoverAsset(p3, p1, uArrayList, AlbumType.AICUT);
       iterator = p0.iterator();
       int i = 0;
       int i1 = 0;
       int i2 = 0;
       while (iterator.hasNext()) {
          MediaAsset mediaAsset1 = iterator.next();
          MediaAnalyzeResult mediaAnalyze1 = hashMap.get(mediaAsset1.getFileName());
          String str = "SmartResult error asset: ";
          if (mediaAnalyze1 == null) {
             EditorSdkLogger.i("ProjectCreator", str+mediaAsset1.getFileName()+", can not find analyze result");
          label_0092 :
             videoEditorP = obj;
             uArrayList1 = uArrayList;
             hashMap1 = hashMap;
             iterator1 = iterator;
          }else if(mediaAnalyze1.getErrorInfo() == null || mediaAnalyze1.getErrorInfo().getErrorCode() != ErrorInfo$ErrorCode.OK){
             videoEditorP = obj;
             uArrayList1 = uArrayList;
             hashMap1 = hashMap;
             iterator1 = iterator;
             EditorSdkLogger.e("ProjectCreator", str+mediaAsset1.getFileName()+", error: "+mediaAnalyze1.getErrorInfo().getErrorCode());
          }else {
             float clipStartTim = mediaAnalyze1.getClipStartTime();
             float clipDuration = mediaAnalyze1.getClipDuration();
             if (clipDuration - null <= 0) {
                EditorSdkLogger.e("ProjectCreator", str+mediaAsset1.getFileName()+", error: clip duration "+clipDuration);
                goto label_0092 ;
             }else {
                EditorSdk2V2$TrackAsset trackAsset = new EditorSdk2V2$TrackAsset();
                obj1 = p2.get(mediaAsset1);
                if (obj1 != null && obj1.size() > 0) {
                   Iterator iterator2 = obj1.iterator();
                   d = 0;
                   d1 = 0;
                   while (iterator2.hasNext()) {
                      EditorKveVoiceDetectResult uEditorKveVo = iterator2.next();
                      hashMap1 = hashMap;
                      iterator1 = iterator;
                      double d2 = Math.max(uEditorKveVo.getStart(), (double)clipStartTim);
                      float f = clipStartTim + clipDuration;
                      videoEditorP = obj;
                      uArrayList2 = uArrayList;
                      d3 = Math.min(uEditorKveVo.getEnd(), (double)f);
                      if (uEditorKveVo.getSpeechProb() - uEditorKveVo.getMusicProb() > 0 && (uEditorKveVo.getSpeechProb() - uEditorKveVo.getNoiseProb() > 0 && d2 - d3 < 0)) {
                         d3 = d3 - d2;
                         d = d + d3;
                      }else if(uEditorKveVo.getMusicProb() - uEditorKveVo.getSpeechProb() > 0 && (uEditorKveVo.getMusicProb() - uEditorKveVo.getNoiseProb() > 0 && d2 - d3 < 0)){
                         d3 = d3 - d2;
                         d1 = d1 + d3;
                      }
                      hashMap = hashMap1;
                      iterator = iterator1;
                      obj = videoEditorP;
                      uArrayList = uArrayList2;
                      String str1 = null;
                   }
                   videoEditorP = obj;
                   uArrayList2 = uArrayList;
                   hashMap1 = hashMap;
                   iterator1 = iterator;
                   EditorSdkLogger.d("ProjectCreator", "EditorSmartClipTask voiceDetectResult: "+obj1);
                }else {
                   videoEditorP = obj;
                   uArrayList2 = uArrayList;
                   hashMap1 = hashMap;
                   iterator1 = iterator;
                   d = 0;
                   d1 = 0;
                }
                if (i2 || d1 - d > 0) {
                   d3 = 0;
                   i2 = 1;
                }else {
                   d3 = 0;
                   i2 = 0;
                }
                if (clipDuration - d3 > 0) {
                   d = d / (double)clipDuration;
                   if (d - 0x3fe0000000000000 >= 0) {
                      trackAsset.setIsVocal(true);
                      i1 = i1 + 1;
                   }
                }
                if (!EditorSdk2UtilsV2.isSingleImagePath(mediaAsset1.getFileName())) {
                   i = i + 1;
                }
                trackAsset.setAssetId(EditorSdk2Utils.getRandomID());
                trackAsset.setAssetPath(mediaAsset1.getFileName());
                trackAsset.setVolume(0x3ff0000000000000);
                trackAsset.setClippedRange(EditorSdk2UtilsV2.createTimeRange((double)clipStartTim, (double)clipDuration));
                trackAsset.setAssetSpeed(0x3ff0000000000000);
                uArrayList1 = uArrayList2;
                uArrayList1.add(trackAsset);
             }
          }
          uArrayList = uArrayList1;
          hashMap = hashMap1;
          iterator = iterator1;
          obj = videoEditorP;
       }
       videoEditorP = obj;
       uArrayList1 = uArrayList;
       if (uArrayList1.size() > 0) {
          EditorSdk2V2$TrackAsset[] trackAssetAr = new EditorSdk2V2$TrackAsset[uArrayList1.size()];
          videoEditorP1 = videoEditorP;
          videoEditorP1.setTrackAssets(trackAssetAr);
          trackAssetAr = (i <= 0 || ((((float)i1 * 0x3f800000) / (float)i) - 0x3f000000 < 0 || i2))? 1: 0;
          for (int i3 = 0; i3 < uArrayList1.size(); i3 = i3 + 1) {
             obj1 = uArrayList1.get(i3);
             if (trackAssetAr) {
                obj1.setIsVocal(false);
                obj1.setVolume(0);
             }else {
                double d4 = 0;
             }
             videoEditorP1.trackAssetsSetItem(i3, obj1);
          }
       }else {
          videoEditorP1 = videoEditorP;
       }
       videoEditorP1.setBlurPaddingArea(true);
       videoEditorP1.setProjectId(EditorSdk2Utils.getRandomID());
       return videoEditorP1;
    }
    public static Minecraft$VisualEffectParam generateCameraMovementEffect(Minecraft$Range p0,float p1,float p2,float p3,float p4,float p5,float p6,float p7,float p8,boolean p9){
       EditorMemoryProjectCreator uEditorMemor = EditorMemoryProjectCreator.class;
       if (PatchProxy.isSupport(uEditorMemor)) {
          Object[] objArray = new Object[10];
          objArray[0] = p0;
          objArray[1] = Float.valueOf(p1);
          objArray[2] = Float.valueOf(p2);
          objArray[3] = Float.valueOf(p3);
          objArray[4] = Float.valueOf(p4);
          objArray[5] = Float.valueOf(p5);
          objArray[6] = Float.valueOf(p6);
          objArray[7] = Float.valueOf(p7);
          objArray[8] = Float.valueOf(p8);
          objArray[9] = Boolean.valueOf(p9);
          Object obj = PatchProxy.apply(objArray, null, uEditorMemor, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Minecraft$VisualEffectParam visualEffect = EditorSdk2Utils.createVisualEffectParam(13, p0);
       visualEffect.setCameraMovementParams(new Minecraft$VisualEffectCameraMovementParams());
       if (!p9) {
          visualEffect.getCameraMovementParams().setStartX(p1);
          visualEffect.getCameraMovementParams().setStartY(p2);
          visualEffect.getCameraMovementParams().setStartBoxW(p3);
          visualEffect.getCameraMovementParams().setStartBoxH(p4);
          visualEffect.getCameraMovementParams().setTargetX(p5);
          visualEffect.getCameraMovementParams().setTargetY(p6);
          visualEffect.getCameraMovementParams().setTargetBoxW(p7);
          visualEffect.getCameraMovementParams().setTargetBoxH(p8);
       }else {
          visualEffect.getCameraMovementParams().setStartX(p5);
          visualEffect.getCameraMovementParams().setStartY(p6);
          visualEffect.getCameraMovementParams().setStartBoxW(p7);
          visualEffect.getCameraMovementParams().setStartBoxH(p8);
          visualEffect.getCameraMovementParams().setTargetX(p1);
          visualEffect.getCameraMovementParams().setTargetY(p2);
          visualEffect.getCameraMovementParams().setTargetBoxW(p3);
          visualEffect.getCameraMovementParams().setTargetBoxH(p4);
       }
       return visualEffect;
    }
    public static EditorSdk2V2$TrackAsset generateImageAsset(MediaAnalyzeResult p0,String p1,float p2,int p3,int p4,float p5,boolean p6,AlbumType p7){
       EditorSdk2V2$TrackAsset obj1;
       double d3;
       double d4;
       double d5;
       float f2;
       Minecraft$Range range;
       float f3;
       float f4;
       boolean b;
       Minecraft$VisualEffectParam[] visualEffect;
       double d6;
       float f5;
       object oobject = p0;
       object oobject1 = p1;
       int i = p3;
       int i1 = p4;
       object oobject2 = p7;
       EditorMemoryProjectCreator uEditorMemor = EditorMemoryProjectCreator.class;
       PointF obj = null;
       int i2 = 0;
       if (PatchProxy.isSupport(uEditorMemor)) {
          Object[] objArray = new Object[]{oobject,oobject1,Float.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Float.valueOf(p5),Boolean.valueOf(p6),oobject2};
          obj1 = PatchProxy.apply(objArray, obj, uEditorMemor, "7");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       obj1 = new EditorSdk2V2$TrackAsset();
       obj1.setAssetId(EditorSdk2Utils.getRandomID());
       obj1.setAssetPath(oobject1);
       double d = 0;
       obj1.setVolume(d);
       double d1 = Double.parseDouble(String.valueOf(p2));
       obj1.setClippedRange(EditorSdk2UtilsV2.createTimeRange(d, d1));
       obj1.setAssetSpeed(0x3ff0000000000000);
       obj1.setImproveHighResolutionUpscaleQuality(1);
       float f = (float)p0.getHeight() / (float)p0.getWidth();
       if (!p6 && (f - 0x400e38e4 > 0 || f - 0x3eb851ec < 0)) {
          return obj;
       }else {
          obj = 0x3f99999a;
          double d2 = 2.00f;
          float f1 = 100.00f;
          if ((v21 = f - obj) < 0 && (f - 0x3f100000 <= 0 || p6)) {
             i = 1;
             if ((p0.getCropRight() - p0.getCropLeft()) > i && (p0.getCropBottom() - p0.getCropTop()) > i) {
                d3 = (((double)(p0.getCropLeft() + p0.getCropRight()) * 50.00f) / (double)p0.getWidth()) - 50.00f;
                d4 = (((double)(p0.getCropBottom() + p0.getCropTop()) * 50.00f) / (double)p0.getHeight()) - 50.00f;
             }else {
                d3 = 0;
                d4 = 0;
             }
             obj1.setAssetTransform(new Minecraft$AssetTransform());
             d = 100.00f;
             if (p6) {
                if (f - p5 >= 0) {
                   obj1.assetTransform().setScaleY(((double)((float)p0.getHeight() / ((float)p0.getWidth() * p5)) * d));
                   obj1.assetTransform().setScaleX(obj1.assetTransform().scaleY());
                }else {
                   obj1.assetTransform().setScaleX(((double)((float)p0.getWidth() / ((float)p0.getHeight() / p5)) * d));
                   obj1.assetTransform().setScaleY(obj1.assetTransform().scaleX());
                }
                d5 = 0;
             }else if(v21 >= 0){
                if (f - p5 >= 0) {
                   obj1.assetTransform().setScaleY(((double)((float)p0.getHeight() / ((float)p0.getWidth() * p5)) * d));
                   obj1.assetTransform().setScaleX(obj1.assetTransform().scaleY());
                   d5 = 0;
                label_031b :
                   obj1.assetTransform().setPositionX((50.00f - ((d5 * obj1.assetTransform().scaleX()) / d)));
                   obj1.assetTransform().setPositionY((50.00f - ((d4 * obj1.assetTransform().scaleY()) / d)));
                   d5 = (double)(float)Math.min((double)((f1 - Math.min(90.00f, 90.00f)) / 2.00f), Math.sqrt((Math.pow((obj1.assetTransform().positionY() - 50.00f), 2.00f) + Math.pow((obj1.assetTransform().positionX() - 50.00f), 2.00f))));
                   d4 = (double)(float)Math.atan2((obj1.assetTransform().positionY() - 50.00f), (obj1.assetTransform().positionX() - 50.00f));
                   f2 = (float)((Math.cos(d4) * d5) + 50.00f);
                   f = (float)((d5 * Math.sin(d4)) + 50.00f);
                   if (oobject2 == AlbumType.MEMORY) {
                      range = EditorSdk2Utils.createTimeRangeV2(0, d1);
                      f3 = f2 - 45.00f;
                      f4 = f - 45.00f;
                      b = (!p6 && p0.getSaliencyPortion() - 0x3e19999a < 0)? true: false;
                      visualEffect = new Minecraft$VisualEffectParam[]{EditorMemoryProjectCreator.generateCameraMovementEffect(range, 0, 0, 100.00f, 100.00f, f3, f4, 90.00f, 90.00f, b)};
                      obj1.setVisualEffects(visualEffect);
                   }
                }else {
                   obj1.assetTransform().setScaleX(((double)((float)p0.getWidth() / ((float)p0.getHeight() / p5)) * d));
                   obj1.assetTransform().setScaleY(obj1.assetTransform().scaleX());
                   d5 = d3;
                }
             }else {
                d6 = (double)((float)p0.getHeight() / p5) / d2;
                d5 = Math.min(Math.max(d3, ((d6 / (double)p0.getHeight()) - 0x3fe0000000000000)), ((0x3ff0000000000000 - (d6 / (double)p0.getHeight())) - 0x3fe0000000000000));
                obj1.assetTransform().setScaleX(((double)((float)p0.getWidth() / ((float)p0.getHeight() * p5)) * d));
                obj1.assetTransform().setScaleY(obj1.assetTransform().scaleX());
             }
             d4 = 0;
             goto label_031b ;
          }else if(f - 0x3f400000 >= 0 && f - obj < 0){
             PointF cameraMoveTa = EditorMemoryProjectCreator.getCameraMoveTargetCoord(oobject, i, i1);
             d6 = (double)(float)Math.min((double)((f1 - Math.min(90.00f, 90.00f)) / 2.00f), Math.sqrt((Math.pow((double)(cameraMoveTa.y - 50.00f), d2) + Math.pow((double)(cameraMoveTa.x - 50.00f), d2))));
             d3 = (double)(float)Math.atan2((double)(cameraMoveTa.y - 50.00f), (double)(cameraMoveTa.x - 50.00f));
             f5 = (float)((Math.cos(d3) * d6) + 50.00f);
             f2 = (float)((d6 * Math.sin(d3)) + 50.00f);
             if (oobject2 == AlbumType.MEMORY) {
                range = EditorSdk2Utils.createTimeRangeV2(0, d1);
                f3 = f5 - 45.00f;
                f4 = f2 - 45.00f;
                b = (p0.getSaliencyPortion() - 0x3e19999a < 0)? true: false;
                visualEffect = new Minecraft$VisualEffectParam[]{EditorMemoryProjectCreator.generateCameraMovementEffect(range, 0, 0, 100.00f, 100.00f, f3, f4, 90.00f, 90.00f, b)};
                obj1.setVisualEffects(visualEffect);
             }
          }else {
             f = (float)i1;
             float f6 = (((float)p0.getHeight() / p5) / (float)p0.getWidth()) * f1;
             float f7 = f1 - (((((f - ((float)p0.getHeight() * Math.min(((float)i / (float)p0.getWidth()), (f / (float)p0.getHeight())))) / 2.00f) * 2.00f) / f) * f1);
             f2 = ((float)p0.getZoomWidth() / (float)p0.getWidth()) * f1;
             f = f6 / 2.00f;
             float f8 = f1 - f;
             f5 = Math.max(f, Math.min(f8, (f2 - 7.00f)));
             f8 = Math.max(f, Math.min(f8, (7.00f + f2)));
             if (oobject2 == AlbumType.MEMORY) {
                Minecraft$Range range1 = EditorSdk2Utils.createTimeRangeV2(0, d1);
                float f9 = f5 - f;
                float f10 = 50.00f - (f7 / 2.00f);
                float f11 = f8 - f;
                boolean b1 = (f2 - 50.00f > 0)? true: false;
                visualEffect = new Minecraft$VisualEffectParam[]{EditorMemoryProjectCreator.generateCameraMovementEffect(range1, f9, f10, f6, f7, f11, f10, f6, f7, b1)};
                obj1.setVisualEffects(visualEffect);
             }
          }
          return obj1;
       }
    }
    public static Minecraft$TransitionParam generateTransitionParam(double p0,boolean p1,List p2){
       Minecraft$TransitionParam obj;
       if (PatchProxy.isSupport(EditorMemoryProjectCreator.class)) {
          obj = PatchProxy.applyThreeRefs(Double.valueOf(p0), Boolean.valueOf(p1), p2, null, EditorMemoryProjectCreator.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new Minecraft$TransitionParam();
       double d = 2.00f;
       double d1 = Double.MIN_VALUE;
       if (!p1) {
          int i = 3;
          obj.setType(i);
          if ((Math.random() * 100.00f) - 80.00f < 0) {
             if ((Math.random() * d) - 0x3ff0000000000000 >= 0) {
                obj.setType(4);
             }
          }else {
             int i1 = 5;
             Integer[] integerArray = new Integer[i1];
             integerArray[0] = Integer.valueOf(11);
             integerArray[d1] = Integer.valueOf(12);
             integerArray[2] = Integer.valueOf(6);
             integerArray[i] = Integer.valueOf(i1);
             integerArray[4] = Integer.valueOf(13);
             ArrayList uArrayList = new ArrayList(Arrays.asList(integerArray));
             Iterator iterator = p2.iterator();
             while (iterator.hasNext()) {
                i = iterator.next().intValue();
                Iterator iterator1 = uArrayList.iterator();
                while (true) {
                   if (iterator1.hasNext()) {
                      int i2 = iterator1.next().intValue();
                      if (i2 == i) {
                         uArrayList.remove(Integer.valueOf(i2));
                      }
                   }else {
                      continue ;
                   }
                }
             }
             if (!uArrayList.isEmpty()) {
                obj.setType(uArrayList.get((int)Math.max(0, Math.min(((double)uArrayList.size() - 0x3ff0000000000000), (Math.random() * (double)uArrayList.size())))).intValue());
             }
          }
       }else {
          obj.setType(d1);
       }
       d = Math.min(0x3fdf5c28f5c28f5c, ((p0 - 0x3fb999999999999a) / d));
       if (d - 0x3fb999999999999a < 0) {
          obj.setType(0);
       }else {
          obj.setDuration(d);
       }
       return obj;
    }
    public static EditorSdk2V2$TrackAsset generateVideoAsset(MediaAnalyzeResult p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, EditorMemoryProjectCreator.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       EditorSdk2V2$TrackAsset trackAsset = new EditorSdk2V2$TrackAsset();
       trackAsset.setAssetId(EditorSdk2Utils.getRandomID());
       trackAsset.setAssetPath(p1);
       trackAsset.setVolume(0);
       trackAsset.setClippedRange(EditorSdk2UtilsV2.createTimeRange((double)p0.getClipStartTime(), (double)p0.getClipDuration()));
       trackAsset.setAssetSpeed(0x3ff0000000000000);
       return trackAsset;
    }
    public static PointF getCameraMoveTargetCoord(MediaAnalyzeResult p0,int p1,int p2){
       if (PatchProxy.isSupport(EditorMemoryProjectCreator.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, EditorMemoryProjectCreator.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       float f = (float)p1;
       float f1 = (float)p2;
       float f2 = Math.min((f / (float)p0.getWidth()), (f1 / (float)p0.getHeight()));
       float f3 = (((float)p0.getZoomWidth() * f2) + ((f - ((float)p0.getWidth() * f2)) / 2.00f)) / f;
       return new PointF((f3 * 100.00f), (((((float)p0.getZoomHeight() * f2) + ((f1 - ((float)p0.getHeight() * f2)) / 2.00f)) / f1) * 100.00f));
    }
    public static boolean isSingleImage(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditorMemoryProjectCreator.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (TextUtils.isEmpty(p0)) {
          return b;
       }
       p0 = (p0.substring((p0.lastIndexOf(".") + 1))).toLowerCase();
       if (!("jpg").equals(p0) && (!("png").equals(p0) && (!("gif").equals(p0) && (!("jpeg").equals(p0) && (!("bmp").equals(p0) && (!("webp").equals(p0) && (("heic").equals(p0) || ("heif").equals(p0)))))))) {
          b = true;
       }
       return b;
    }
    public static int lambda$createProjectFromAnalyzeResult$0(Map$Entry p0,Map$Entry p1){
       if (p1.getKey().getCreationTime() == null) {
          return 1;
       }
       if (p0.getKey().getCreationTime() == null) {
          return -1;
       }
       return p0.getKey().getCreationTime().compareTo(p1.getKey().getCreationTime());
    }
    public static EditorSdk2V2$VideoEditorProject setTransitionParamToProjectAssets(EditorSdk2V2$VideoEditorProject p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditorMemoryProjectCreator.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       for (int i = 0; i < p0.trackAssetsSize(); i = i + 1) {
          double d = p0.trackAssets(i).clippedRange().duration();
          ArrayList uArrayList = new ArrayList();
          int i1 = i - 1;
          int i2 = i - 2;
          while (i1 >= i2 && i1 >= 0) {
             EditorSdk2V2$TrackAsset trackAsset = p0.trackAssets(i1);
             if (trackAsset.transitionParam() != null) {
                uArrayList.add(Integer.valueOf(trackAsset.transitionParam().type()));
             }
             i1 = i1 - 1;
          }
          EditorSdk2V2$TrackAsset trackAsset1 = p0.trackAssets(i);
          int i3 = 1;
          i2 = p0.trackAssetsSize() - i3;
          if (i != i2) {
             i3 = false;
          }
          trackAsset1.setTransitionParam(EditorMemoryProjectCreator.generateTransitionParam(d, i3, uArrayList));
       }
       return p0;
    }
    public static EditorSdk2V2$VideoEditorProject updateProjectFromMusicResult(EditorSdk2V2$VideoEditorProject p0,double p1,String p2,double p3,double p4,double p5){
       ProjectItem[] obj;
       object oobject = p0;
       EditorMemoryProjectCreator uEditorMemor = EditorMemoryProjectCreator.class;
       if (PatchProxy.isSupport(uEditorMemor)) {
          Object[] objArray = new Object[]{oobject,Double.valueOf(p1),p2,Double.valueOf(p3),Double.valueOf(p4),Double.valueOf(p5)};
          obj = PatchProxy.apply(objArray, null, uEditorMemor, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!p0.trackAssetsSize()) {
          EditorSdkLogger.e("ProjectCreator", "Smart music result do not have track assets!");
          return oobject;
       }else {
          ProjectItem[] projectItemA = new ProjectItem[p0.trackAssetsSize()];
          for (int i = 0; i < p0.trackAssetsSize(); i = i + 1) {
             EditorSdk2V2$TrackAsset trackAsset = oobject.trackAssets(i);
             ProjectItem projectItem = new ProjectItem(Long.valueOf(trackAsset.assetId()).toString(), EditorSdk2UtilsV2.isSingleImagePath(trackAsset.assetPath()), trackAsset.probedAssetFile().duration(), trackAsset.clippedRange().start(), trackAsset.clippedRange().duration());
             projectItemA[i] = v15;
          }
          obj = SmartEditTask.changeMusic(projectItemA, p1, p2, p3, p4, p5);
          int i1 = 0;
          while (i1 < p0.trackAssetsSize()) {
             EditorSdk2V2$TrackAsset trackAsset1 = oobject.trackAssets(i1);
             int i2 = 0;
             while (i2 < obj.length) {
                object oobject1 = obj[i2];
                if (TextUtils.equals(oobject1.getItemId(), String.valueOf(trackAsset1.assetId()))) {
                   trackAsset1.setClippedRange(EditorSdk2UtilsV2.createTimeRange(oobject1.getClipStartPoint(), oobject1.getClipDuration()));
                }
                i2 = i2 + 1;
             }
             i1 = i1 + 1;
          }
          return oobject;
       }
    }
}
