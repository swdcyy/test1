package com.kwai.video.clipkit.mv.ClipMvUtils;
import java.lang.Object;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import java.lang.String;
import com.kwai.video.minecraft.model.EditorSdk2V2$TimeRangeV2;
import com.kwai.video.minecraft.model.EditorSdk2V2$AudioAsset;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.clipkit.KSClipLog;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.video.minecraft.model.MutableTimeline;
import java.util.ArrayList;
import com.kwai.video.minecraft.model.nano.Minecraft$KSAVClip;
import com.kwai.video.minecraft.MinecraftUtils;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$TimeRange;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import java.util.Iterator;
import java.lang.Float;
import java.lang.Boolean;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import java.util.Collection;
import com.kwai.video.minecraft.model.nano.Minecraft$TemplateClip;
import com.kwai.video.minecraft.model.MutableTrack;
import com.kwai.video.minecraft.model.ErrorStatus;
import java.util.List;
import com.kwai.video.minecraft.model.nano.Minecraft$YKitCutoutParam;
import com.kwai.video.minecraft.model.MutableEffect;
import com.kwai.video.minecraft.model.MutableItem;
import com.kwai.video.minecraft.model.nano.Minecraft$AssetTransform;
import java.lang.Double;
import com.kwai.video.minecraft.model.nano.Minecraft$PropertyKeyFrame;
import com.kwai.video.minecraft.model.Track;
import com.kwai.video.minecraft.model.Composable;
import com.kwai.video.minecraft.model.nano.Minecraft$AudioFilterParam;
import java.lang.StringBuilder;
import com.kwai.video.ksspark.NewSparkTemplateManager;
import java.io.File;
import com.kwai.video.clipkit.mv.EditorSdk2MvFileMissException;
import java.lang.Long;
import java.lang.Integer;
import com.kwai.video.clipkit.ClipKitUtils;
import com.kwai.video.clipkit.mv.ConstructSparkParam;
import com.kwai.video.clipkit.mv.ClipSparkConstructListener;
import com.kwai.video.clipkit.mv.ExtraInterface;
import com.kwai.video.ksspark.model.TemplateInfo;
import com.kwai.video.clipkit.mv.ClipTemplateServiceManager;
import com.kwai.video.clipkit.mv.ClipMvUtils$1;
import com.kwai.video.ksspark.NewSparkConstructListener;
import java.lang.System;
import com.kwai.video.ksspark.model.VideoProjectWrapper;
import com.kwai.video.clipkit.mv.EditorSdk2MvCreationResultImpl;
import com.kwai.video.clipkit.mv.EditorSdk2MvCreationResult;
import java.util.Map;
import java.util.HashMap;
import com.kwai.video.clipkit.mv.EditorSdk2MvCreationResult$TemplateType;
import com.kwai.video.clipkit.mv.ClipRepost$Params;
import com.kwai.FaceMagic.AE2.AE2RepostParams;
import com.kwai.FaceMagic.AE2.AE2RepostPhotoVec;
import com.kwai.video.clipkit.mv.ClipRepost$Material;
import com.kwai.FaceMagic.AE2.AE2RepostPhoto;
import com.kwai.FaceMagic.AE2.AE2TwoD;
import com.kwai.video.minecraft.model.nano.Minecraft$CropOptions;
import com.kwai.video.clipkit.mv.ClipRepost$Type;
import com.kwai.FaceMagic.AE2.RepostType;
import com.kwai.FaceMagic.AE2.AE2FourD;
import com.kwai.video.minecraft.model.nano.Minecraft$Repost;
import com.kwai.video.editorsdk2.model.MutableArray;
import com.kwai.video.minecraft.model.nano.Minecraft$RepostMaterial;
import com.kwai.video.editorsdk2.model.ImmutableMap;
import com.kwai.FaceMagic.AE2.AE2MVFilmingDesc;
import com.kwai.FaceMagic.AE2.AE2MVFilmingPhotoVec;
import com.kwai.video.clipkit.mv.ClipAICut$TemplateAssetInfo;
import com.kwai.FaceMagic.AE2.AE2MVFilmingPhoto;
import com.kwai.video.minecraft.model.nano.Minecraft$AICut;
import com.kwai.video.minecraft.model.nano.Minecraft$TemplateAssetInfo;
import com.kwai.video.clipkit.mv.ClipAICut$TemplateSegmentInfo;
import com.kwai.FaceMagic.AE2.AE2Annual2022TrackVec;
import com.kwai.FaceMagic.AE2.AE2Annual2022Track;
import com.kwai.FaceMagic.AE2.AE2Annual2022CustomContentVec;
import com.kwai.video.clipkit.mv.ClipAICut$TemplateAssetTextInfo;
import com.kwai.FaceMagic.AE2.AE2Annual2022CustomContent;
import com.kwai.video.minecraft.model.nano.Minecraft$TemplateSegmentInfo;
import com.kwai.video.minecraft.model.nano.Minecraft$TemplateAssetTextInfo;
import com.kwai.FaceMagic.AE2.AE2MVFilming;
import com.kwai.FaceMagic.AE2.AE2Project;
import com.kwai.video.clipkit.mv.KwaiMvParam;
import com.kwai.video.minecraft.model.nano.Minecraft$Range;
import com.kwai.FaceMagic.AE2.AE2MVFilmingAsset;
import com.kwai.video.clipkit.mv.ClipAICut$Type;
import com.kwai.video.minecraft.model.nano.Minecraft$TemplateReference;
import com.kwai.video.editorsdk2.model.MutableMap;
import com.kwai.video.minecraft.model.RationalTime;
import com.kwai.video.minecraft.model.TimeRange;
import com.kwai.video.minecraft.model.MutableMediaReference;
import com.kwai.video.minecraft.model.MutableClip;
import com.kwai.video.minecraft.model.ErrorCode;
import java.lang.Enum;
import com.kwai.FaceMagic.AE2.AE2Annual2022;
import com.kwai.video.minecraft.model.nano.Minecraft$InputFileOptions;
import com.kwai.video.minecraft.model.nano.Minecraft$RationalV2;
import com.kwai.FaceMagic.AE2.AE2TimeRange;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ProbedFile;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import com.kwai.video.minecraft.model.nano.Minecraft$AudioVideoReference;
import com.kwai.video.clipkit.mv.EditorSdk2MvAssetImpl;
import com.kwai.video.clipkit.mv.MvPhotoInfo;
import com.kwai.video.clipkit.mv.ReplaceableAreaInfo;
import com.kwai.video.clipkit.mv.MvReplaceableAreaDetail;
import com.kwai.video.clipkit.mv.AllMvReplaceableAreaDetail;
import com.kwai.video.ksspark.model.ReplaceableAsset;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$VideoEditorProjectPrivate;
import java.lang.Throwable;
import com.kwai.video.clipkit.mv.ClipMvUtils$4;
import com.kwai.video.ksspark.NewSparkTemplateManager$SparkTemplateDelegate;
import org.json.JSONObject;
import org.json.JSONArray;
import com.kwai.video.clipkit.error.EditorSdk2MvCreationException;
import org.json.JSONException;
import java.lang.Exception;
import com.kwai.FaceMagic.AE2.AE2Parser$Resource;
import com.kwai.FaceMagic.AE2.AE2AlbumKit;
import com.kwai.FaceMagic.AE2.AE2AlbumPhoto;
import com.kwai.video.clipkit.mv.ClipMvUtils$ClipMvAlbumPhoto;
import com.kwai.FaceMagic.AE2.AE2StringVec;
import java.lang.Iterable;
import com.kwai.FaceMagic.AE2.AE2AlbumPhotoVec;
import com.kwai.FaceMagic.AE2.AE2AlbumAssetVec;
import com.kwai.video.clipkit.model.nano.ClipkitSdk$ClipKitBackgroundVideo;
import com.kwai.video.editorsdk2.logger.EditorSdkLogger;
import com.kwai.FaceMagic.AE2.AE2AlbumAsset;
import com.kwai.video.clipkit.mv.MvMusicAsset;
import org.wysaid.nativePort.CGETextEffect$EffectType;
import com.kwai.video.clipkit.TextFilter$TextEffectConfig;
import com.kwai.video.minecraft.model.MediaReference;
import com.kwai.video.clipkit.mv.ClipMvUtils$TemplatePreTranscodeFuncType;
import com.kwai.video.minecraft.model.nano.Minecraft$WesterosFaceMagicParam;
import com.kwai.video.minecraft.model.nano.Minecraft$TimeMapKeyFrame;
import com.kwai.video.minecraft.model.nano.Minecraft$Vec2f;
import com.kwai.video.minecraft.model.nano.Minecraft$TimeMapParams;
import java.lang.Math;
import com.kwai.video.clipkit.mv.MvReplaceAreaRule;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$RectF;
import com.kwai.video.minecraft.model.nano.Minecraft$Opening;
import com.kwai.FaceMagic.AE2.AE2RepostKit;
import com.kwai.FaceMagic.AE2.AE2RepostAssetVec;
import com.kwai.FaceMagic.AE2.AE2RepostAsset;
import com.kwai.FaceMagic.AE2.AE2TimeRangeVec;
import com.kwai.video.clipkit.mv.ClipMvUtils$2;
import android.graphics.Bitmap;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$Rational;
import com.kwai.FaceMagic.AE2.AE2Parser;
import java.io.IOException;
import java.lang.Number;
import com.kwai.video.minecraft.model.EditorSdk2V2$AnimatedSubAsset;
import com.kwai.video.clipkit.mv.ClipMvUtils$KSClipProjectAssetType;
import android.graphics.Matrix;
import com.kwai.video.clipkit.mv.EditorSdk2MvAsset;
import com.kwai.video.clipkit.mv.ClipMvUtils$CropResourceInfo;
import android.graphics.Bitmap$CompressFormat;
import com.kwai.video.editorsdk2.ImageLoaderUtil;
import android.graphics.BitmapFactory$Options;
import android.graphics.BitmapFactory;
import com.kwai.video.clipkit.mv.ClipMvUtils$ClipMaterialType;
import com.kwai.video.ksspark.NewSparkTemplateDefine;
import com.kwai.video.clipkit.mv.ClipMvUtils$RectanglePos;
import com.kwai.video.clipkit.mv.EditorSdk2MvReplaceableDetail;
import com.kwai.video.clipkit.mv.EditorSdk2MvReplaceableDetailImpl;
import com.kwai.video.minecraft.model.nano.Minecraft$Size;
import com.kwai.FaceMagic.AE2.Profiler$ResourceScore;
import com.kwai.FaceMagic.AE2.Profiler;
import com.kwai.video.editorsdk2.ThumbnailGenerator;
import android.content.Context;
import com.kwai.video.editorsdk2.ProjectThumbnailOptions;
import com.kwai.video.editorsdk2.ThumbnailGeneratorRequestBuilder;
import com.kwai.video.editorsdk2.ThumbnailGeneratorRequest;
import com.kwai.video.editorsdk2.ThumbnailGeneratorResult;
import com.kwai.video.clipkit.mv.ClipMvUtils$3;
import com.kwai.video.ksspark.NewSparkLogInterface;
import com.kwai.video.clipkit.mv.ClipMvUtilsForMvMaster;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class ClipMvUtils	// class@001aaa
{
    public static boolean sSparkLogInited;

    public void ClipMvUtils(){
       super();
    }
    public static EditorSdk2V2$AudioAsset AddTemplateAudioAssetToProject(EditorSdk2V2$VideoEditorProject p0,String p1,String p2,EditorSdk2V2$TimeRangeV2 p3){
       EditorSdk2V2$AudioAsset uAudioAsset;
       EditorSdk2V2$AudioAsset obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, ClipMvUtils.class, "78");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       String str = "ClipMVUtils";
       if (p0 == null) {
          KSClipLog.e(str, "SetAudioAssetByTemplateRefId project null");
          return obj;
       }else if(TextUtils.isEmpty(p1)){
          KSClipLog.e(str, "SetAudioAssetByTemplateRefId refId null");
          return obj;
       }else {
          ArrayList arrayForAllM = ClipMvUtils.getArrayForAllMatchedAVClips(p0.getTemplateTimeline(), p1);
          if (arrayForAllM.size() > 0 && p2.equals(MinecraftUtils.GetPathOfAVClip(arrayForAllM.get(0)))) {
             arrayForAllM.get(0).setMute(0);
             uAudioAsset = new EditorSdk2V2$AudioAsset(arrayForAllM.get(0));
          }else {
             uAudioAsset = EditorSdk2UtilsV2.openAudioAsset(p2);
             uAudioAsset.setClippedRange(p3);
          }
          if (arrayForAllM.size() > 0) {
             uAudioAsset.setDisplayRange(ClipMvUtils.getDisplayRangeOfAVClipInTemplate(p0, arrayForAllM.get(0)));
          }
          ClipMvUtils.ReplaceAudioAssetByTemplateRefId(p0, p1, uAudioAsset);
          return uAudioAsset;
       }
    }
    public static EditorSdk2V2$AudioAsset GetAudioAssetByTemplateRefId(EditorSdk2V2$VideoEditorProject p0,String p1){
       EditorSdk2V2$AudioAsset uAudioAsset;
       String obj = PatchProxy.applyTwoRefs(p0, p1, null, ClipMvUtils.class, "81");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "ClipMVUtils";
       if (p0 == null) {
          KSClipLog.e(obj, "GetAudioAssetByTemplateRefId project null");
          return null;
       }else if(p0.audioAssets() == null){
          KSClipLog.e(obj, "GetAudioAssetByTemplateRefId project audioAssets null");
          return null;
       }else if(TextUtils.isEmpty(p1)){
          KSClipLog.e(obj, "GetAudioAssetByTemplateRefId refId null");
          return null;
       }else {
          Iterator iterator = p0.audioAssets().iterator();
          while (true) {
             if (!iterator.hasNext()) {
                return null;
             }
             uAudioAsset = iterator.next();
             if (uAudioAsset != null && p1.equals(uAudioAsset.templateAssetRefId())) {
                break ;
             }
          }
          return uAudioAsset;
       }
    }
    public static boolean OpeningMergeEditorProject(EditorSdk2V2$VideoEditorProject p0,EditorSdk2V2$VideoEditorProject p1,float p2){
       if (PatchProxy.isSupport(ClipMvUtils.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Float.valueOf(p2), null, ClipMvUtils.class, "71");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p0 == null || p1 == null) {
          return false;
       }else {
          EditorSdk2V2$TrackAsset trackAsset = p0.trackAssets(false);
          trackAsset.setPositioningMethod(2);
          double d = (double)p2;
          trackAsset.setAssetSpeed(d);
          Iterator iterator = EditorSdk2UtilsV2.getBgAudioAssetInVideoEditorProject(p0).iterator();
          while (iterator.hasNext()) {
             iterator.next().setAssetSpeed(d);
          }
          ArrayList arrayList = p1.trackAssets().getArrayList();
          arrayList.remove(false);
          arrayList.add(trackAsset);
          p1.setTrackAssets(new ImmutableArray(arrayList, EditorSdk2V2$TrackAsset.class));
          arrayList = new ArrayList();
          arrayList.addAll(p0.audioAssets().getArrayList());
          arrayList.addAll(p1.audioAssets().getArrayList());
          p1.setAudioAssets(new ImmutableArray(arrayList, EditorSdk2V2$AudioAsset.class));
          if (MinecraftUtils.GetTemplateClipFromTimeline(p1.getTemplateTimeline()) != null) {
             return true;
          }else {
             p1.getTemplateTimeline().insertTrack(MinecraftUtils.GetTemplateTrackFromTimeline(p0.getTemplateTimeline()), false, null);
             return true;
          }
       }
    }
    public static void ReplaceAudioAssetByTemplateRefId(EditorSdk2V2$VideoEditorProject p0,String p1,EditorSdk2V2$AudioAsset p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, ClipMvUtils.class, "80")) {
          return;
       }
       if (p0 == null) {
          KSClipLog.e("ClipMVUtils", "SetAudioAssetByTemplateRefId project null");
          return;
       }else if(p0.audioAssets() == null){
          KSClipLog.e("ClipMVUtils", "SetAudioAssetByTemplateRefId project audioAssets null");
          return;
       }else if(TextUtils.isEmpty(p1)){
          KSClipLog.e("ClipMVUtils", "SetAudioAssetByTemplateRefId refId null");
          return;
       }else {
          ArrayList arrayList = p0.audioAssets().getArrayList();
          Iterator iterator = arrayList.iterator();
          while (true) {
             if (iterator.hasNext()) {
                EditorSdk2V2$AudioAsset uAudioAsset = iterator.next();
                if (uAudioAsset != null && p1.equals(uAudioAsset.templateAssetRefId())) {
                   arrayList.remove(uAudioAsset);
                }
             }
             if (p2 != null) {
                p2.setTemplateAssetRefId(p1);
                arrayList.add(p2);
                break ;
             }else {
                KSClipLog.i("ClipMVUtils", "SetAudioAssetByTemplateRefId audioAsset null");
                break ;
             }
          }
          EditorSdk2V2$AudioAsset[] uAudioAssetA = new EditorSdk2V2$AudioAsset[0];
          p0.setAudioAssets(arrayList.toArray(uAudioAssetA));
          return;
       }
    }
    public static boolean addAVClipBodyParam(Minecraft$KSAVClip p0){
       Minecraft$YKitCutoutParam obj = PatchProxy.applyOneRefs(p0, null, ClipMvUtils.class, "73");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = new Minecraft$YKitCutoutParam();
       obj.setType(1);
       String[] stringArray = new String[]{"magic_ycnn_model_matting"};
       obj.setResourceKeys(stringArray);
       obj.setIsPreAnalysis(false);
       obj.setModelLevel(false);
       return MinecraftUtils.InsertOrUpdateOrDeleteEffectIntoItem(obj, null, null, p0, null);
    }
    public static void addAVClipKeyFrame(Minecraft$KSAVClip p0,double p1,Minecraft$AssetTransform p2){
       if (PatchProxy.isSupport(ClipMvUtils.class) && PatchProxy.applyVoidThreeRefs(p0, Double.valueOf(p1), p2, null, ClipMvUtils.class, "72")) {
          return;
       }
       ArrayList arrayList = p0.propertyKeyFrames().getArrayList();
       Minecraft$PropertyKeyFrame propertyKeyF = new Minecraft$PropertyKeyFrame();
       propertyKeyF.setDuration(p1);
       propertyKeyF.setAssetTransform(p2);
       arrayList.add(propertyKeyF);
       p0.setPropertyKeyFrames(new ImmutableArray(arrayList, Minecraft$PropertyKeyFrame.class));
       return;
    }
    public static void addAudioAssetsByTrack(Track p0,List p1,boolean p2){
       if (PatchProxy.isSupport(ClipMvUtils.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), null, ClipMvUtils.class, "24")) {
          return;
       }
       Iterator iterator = p0.children().iterator();
       while (iterator.hasNext()) {
          Composable uComposable = iterator.next();
          if (!uComposable instanceof Minecraft$KSAVClip || !MinecraftUtils.IsAVClipContainAudio(uComposable)) {
             continue ;
          }else {
             EditorSdk2V2$AudioAsset uAudioAsset = new EditorSdk2V2$AudioAsset(uComposable);
             if (uAudioAsset.audioFilterParam() != null) {
                uAudioAsset.audioFilterParam().setEnableDenoise(false);
             }
             if (p2) {
                uAudioAsset.setTemplateAssetRefId(MinecraftUtils.GetRefIdOfAVClip(uComposable));
             }else {
                uAudioAsset.setisKuaiShanBgAudio(true);
             }
             p1.add(uAudioAsset);
          }
       }
       return;
    }
    public static void cancelConstructSpark(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, ClipMvUtils.class, "20")) {
          return;
       }
       KSClipLog.i("ClipSparkRecovery", "cancelConstructSpark id "+p0);
       ClipMvUtils.initSparkLog();
       NewSparkTemplateManager.cancelConstruct(p0);
       return;
    }
    public static void checkFileExist(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, ClipMvUtils.class, "63")) {
          return;
       }
       if (new File(p0).exists()) {
          return;
       }
       throw new EditorSdk2MvFileMissException("File missed: "+p0);
    }
    public static boolean checkFlexibleTemplateGeneralParams(String p0,String p1,long p2,String p3,int p4,int p5,String p6){
       ClipMvUtils uClipMvUtils = ClipMvUtils.class;
       if (PatchProxy.isSupport(uClipMvUtils)) {
          Object[] objArray = new Object[]{p0,p1,Long.valueOf(p2),p3,Integer.valueOf(p4),Integer.valueOf(p5),p6};
          p3 = PatchProxy.apply(objArray, null, uClipMvUtils, "31");
          if (p3 != PatchProxyResult.class) {
             return p3.booleanValue();
          }
       }
       if (!ClipKitUtils.fileExists(p0)) {
          KSClipLog.e(p6, "checkFlexibleTemplateGeneralParams templatePath not exists, templatePath: "+p0);
          return 0;
       }else if(!ClipKitUtils.fileExists(p1)){
          KSClipLog.e(p6, "checkFlexibleTemplateGeneralParams bgPlaceholderPath not exists, bgPlaceholderPath: "+p1);
          return 0;
       }else if(p2 - null < 0){
          KSClipLog.e(p6, "checkFlexibleTemplateGeneralParams randomeSeed less 0, randomSeed: "+p2);
          return 0;
       }else if(p4 <= 0 || p5 <= 0){
          KSClipLog.e(p6, "checkFlexibleTemplateGeneralParams projectWidth/projectHeight LE 0, projectWidth: "+p4+" projectHeight: "+p5);
          return 0;
       }else {
          return 1;
       }
    }
    public static void constructSparkAsync(ConstructSparkParam p0,String p1,ClipSparkConstructListener p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, ClipMvUtils.class, "19")) {
          return;
       }
       String str = "ClipSparkRecovery";
       if (p2 == null) {
          KSClipLog.e(str, "constructSparkAsync listener null");
          return;
       }else {
          String str1 = ", depDir ";
          int i = 101;
          if (p0 != null && (!p0.isValid() || TextUtils.isEmpty(p1))) {
             KSClipLog.e(str, "constructSparkAsync invalid input param"+p0+str1+p1);
             p2.onFail(i, "invalid input param");
             return;
          }else {
             KSClipLog.i(str, "constructSparkAsync templateDir "+p0.directory+str1+p1);
             ClipMvUtils.initSparkLog();
             NewSparkTemplateManager newSparkTemp = ClipMvUtils.createSparkTemplateManager(p0.extraInterface, p0.projectPlaceHolderImagePath);
             if (newSparkTemp == null) {
                p2.onFail(i, "createSparkTemplateManager fail");
                return;
             }else if(newSparkTemp.isNewSpark(p0.directory)){
                TemplateInfo templateInfo = newSparkTemp.parseTemplateData(p0.directory);
                int version = templateInfo.getVersion();
                KSClipLog.i(str, "constructSparkAsync sparkVersion "+version);
                if (version >= 290) {
                   KSClipLog.i(str, "constructSparkAsync real start");
                   ClipTemplateServiceManager.getInstance().setHttpServiceToSpark();
                   newSparkTemp.constructSparkAsync(templateInfo, p1, new ClipMvUtils$1(p2, templateInfo, newSparkTemp, p0));
                }else {
                   KSClipLog.i(str, "constructSparkAsync version < 290, sync construct");
                   p2.onStart("sync_"+System.currentTimeMillis());
                   p2.onProgress(0x3f800000);
                   p2.onSuccess(ClipMvUtils.createNewSparkProjectByInfoSync(templateInfo, null, newSparkTemp, p0.templateGrade));
                }
             }else {
                p2.onStart("error_"+System.currentTimeMillis());
                File uFile = new File(p0.directory+File.separator+"project");
                if (uFile.exists() && uFile.isFile()) {
                   KSClipLog.e(str, "constructSparkAsync old spark not support");
                   p2.onFail(102, "old spark not support");
                }else {
                   KSClipLog.e(str, "constructSparkAsync not spark");
                   p2.onFail(i, "not spark");
                }
             }
             return;
          }
       }
    }
    public static EditorSdk2MvCreationResult constructSparkWithResMap(ConstructSparkParam p0,Map p1){
       HashMap hashMap;
       EditorSdk2MvCreationResultImpl uEditorSdk2M;
       VideoProjectWrapper videoProject = null;
       TemplateInfo obj = PatchProxy.applyTwoRefs(p0, p1, videoProject, ClipMvUtils.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = "ClipSparkRecovery";
       KSClipLog.i(str, "constructSparkWithResMap param "+p0+" resMap "+p1);
       int i = 101;
       if (p0 == null || !p0.isValid()) {
          KSClipLog.e(str, "constructSparkWithResMap invalid input param");
          return new EditorSdk2MvCreationResultImpl(9, i, "invalid input param");
       }else {
          ClipMvUtils.initSparkLog();
          NewSparkTemplateManager newSparkTemp = ClipMvUtils.createSparkTemplateManager(p0.extraInterface, p0.projectPlaceHolderImagePath);
          if (newSparkTemp == null) {
             return new EditorSdk2MvCreationResultImpl(9, i, "createSparkTemplateManager fail");
          }
          if (newSparkTemp.isNewSpark(p0.directory)) {
             obj = newSparkTemp.parseTemplateData(p0.directory);
             int version = obj.getVersion();
             KSClipLog.i(str, "constructSparkWithResMap sparkVersion "+version);
             if (version >= 290) {
                if (p1 == null) {
                   hashMap = new HashMap();
                }
                KSClipLog.i(str, "constructSparkWithResMap start recover res by map");
                videoProject = newSparkTemp.constructSparkWithResMapSync(obj, hashMap);
                if (videoProject.getErrorCode()) {
                   return new EditorSdk2MvCreationResultImpl(9, videoProject.getErrorCode(), videoProject.getErrorMsg());
                }
             }
             uEditorSdk2M = ClipMvUtils.createNewSparkProjectByInfoSync(obj, videoProject, newSparkTemp, p0.templateGrade);
             uEditorSdk2M.setSparkResMap(hashMap);
             return uEditorSdk2M;
          }else {
             File uFile = new File(p0.directory+File.separator+"project");
             if (!uFile.exists() || !uFile.isFile()) {
                return new EditorSdk2MvCreationResultImpl(9, i, "not spark");
             }
             uEditorSdk2M = new EditorSdk2MvCreationResultImpl(9, 102, "old spark not support");
             uEditorSdk2M.setTemplateType(EditorSdk2MvCreationResult$TemplateType.TEMPLATE_TYPE_SPARK);
             return uEditorSdk2M;
          }
       }
    }
    public static AE2RepostParams convertClipRepostParamsToAE2(ClipRepost$Params p0,Map p1){
       AE2RepostParams obj = null;
       String obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, ClipMvUtils.class, "30");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       obj1 = "ClipRepost";
       if (p0 != null && (p0.materials == null || p0.type == null)) {
          KSClipLog.e(obj1, "convertClipRepostParamsToAE2 params invalid");
          return obj;
       }else {
          obj = new AE2RepostParams();
          AE2RepostPhotoVec uAE2RepostPh = new AE2RepostPhotoVec();
          Iterator iterator = p0.materials.iterator();
          while (iterator.hasNext()) {
             ClipRepost$Material material = iterator.next();
             AE2RepostPhoto uAE2RepostPh1 = new AE2RepostPhoto();
             uAE2RepostPh1.setPath(material.path);
             uAE2RepostPh1.setBackgroundPath(material.backgroundPath);
             uAE2RepostPh1.setRemainTime(material.tjRemainTime);
             AE2TwoD uAE2TwoD = new AE2TwoD();
             if (p1.containsKey(material.path)) {
                Minecraft$CropOptions uCropOptions = p1.get(material.path);
                uAE2TwoD.setX((float)uCropOptions.width());
                uAE2TwoD.setY((float)uCropOptions.height());
             }else {
                uAE2TwoD.setX((float)material.width);
                uAE2TwoD.setY((float)material.height);
             }
             uAE2RepostPh1.setPhotoSize(uAE2TwoD);
             uAE2RepostPh.add(uAE2RepostPh1);
          }
          obj.setPhotos(uAE2RepostPh);
          obj.setType(RepostType.swigToEnum(p0.type.getValue()));
          obj.setProjectSize(new AE2TwoD((float)p0.photoFrameWidth, (float)p0.photoFrameHeight));
          ClipRepost$Params ctRollBezier = p0.ctRollBezier;
          int i = 2;
          int i1 = 1;
          int i2 = 0;
          if (ctRollBezier != null && ctRollBezier.length == 4) {
             obj.setRollBezier(new AE2FourD(ctRollBezier[i2], ctRollBezier[i1], ctRollBezier[i], ctRollBezier[3]));
          }else {
             KSClipLog.e(obj1, "convertClipRepostParamsToAE2 ctRollBezier invalid");
          }
          ctRollBezier = p0.animBezier;
          if (ctRollBezier != null && ctRollBezier.length == 4) {
             obj.setAnimBezier(new AE2FourD(ctRollBezier[i2], ctRollBezier[i1], ctRollBezier[i], ctRollBezier[3]));
          }else {
             KSClipLog.e(obj1, "convertClipRepostParamsToAE2 animBezier invalid");
          }
          obj.setAnimTime(p0.animTime);
          obj.setHeadTime(p0.ctHeadTime);
          obj.setTailTime(p0.ctTailTime);
          obj.setRollSpeed(p0.ctRollSpeed);
          obj.setFrameRate(p0.frameRate);
          obj.setMinProjectTime(p0.minProjectTime);
          return obj;
       }
    }
    public static Minecraft$Repost convertClipRepostParamsToMC(ClipRepost$Params p0,Map p1){
       Minecraft$Repost obj = null;
       Object obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, ClipMvUtils.class, "29");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 != null && (p0.materials == null || p0.type == null)) {
          KSClipLog.e("ClipRepost", "convertClipRepostParamsToMC params invalid");
          return obj;
       }else {
          obj = new Minecraft$Repost();
          MutableArray mutableArray = new MutableArray(Minecraft$RepostMaterial.class);
          Iterator iterator = p0.materials.iterator();
          while (iterator.hasNext()) {
             ClipRepost$Material material = iterator.next();
             Minecraft$RepostMaterial repostMateri = new Minecraft$RepostMaterial();
             repostMateri.setPath(material.path);
             repostMateri.setBackgroundPath(material.backgroundPath);
             repostMateri.setTjRemainTime(material.tjRemainTime);
             if (p1.containsKey(material.path)) {
                Minecraft$CropOptions uCropOptions = p1.get(material.path);
                repostMateri.setWidth(uCropOptions.width());
                repostMateri.setHeight(uCropOptions.height());
             }else {
                repostMateri.setWidth(material.width);
                repostMateri.setHeight(material.height);
             }
             mutableArray.add(repostMateri);
          }
          obj.setMaterial(mutableArray.immutableCopy());
          RepostType repostType = RepostType.swigToEnum(p0.type.getValue());
          if (repostType == RepostType.LongPicture) {
             obj.setType(0);
          }else if(repostType == RepostType.Atlas){
             obj.setType(1);
          }
          obj.setPhotoFrameWidth(p0.photoFrameWidth);
          obj.setPhotoFrameHeight(p0.photoFrameHeight);
          ClipRepost$Params ctRollBezier = p0.ctRollBezier;
          int i = 4;
          if (ctRollBezier != null && ctRollBezier.length == i) {
             Float[] uFloatArray = new Float[i];
             uFloatArray[0] = Float.valueOf(ctRollBezier[0]);
             uFloatArray[1] = Float.valueOf(p0.ctRollBezier[1]);
             uFloatArray[2] = Float.valueOf(p0.ctRollBezier[2]);
             uFloatArray[3] = Float.valueOf(p0.ctRollBezier[3]);
             obj.setCtRollBeziers(uFloatArray);
          }else {
             KSClipLog.e("ClipRepost", "convertClipRepostParamsToMC ctRollBezier invalid");
          }
          ctRollBezier = p0.animBezier;
          if (ctRollBezier != null && ctRollBezier.length == i) {
             Float[] uFloatArray1 = new Float[i];
             uFloatArray1[0] = Float.valueOf(ctRollBezier[0]);
             uFloatArray1[1] = Float.valueOf(p0.animBezier[1]);
             uFloatArray1[2] = Float.valueOf(p0.animBezier[2]);
             uFloatArray1[3] = Float.valueOf(p0.animBezier[3]);
             obj.setAnimBeziers(uFloatArray1);
          }else {
             KSClipLog.e("ClipRepost", "convertClipRepostParamsToMC animBezier invalid");
          }
          obj.setAnimTime(p0.animTime);
          obj.setCtHeadTime(p0.ctHeadTime);
          obj.setCtTailTime(p0.ctTailTime);
          obj.setCtRollSpeed(p0.ctRollSpeed);
          obj.setFrameRate(p0.frameRate);
          obj.setMinProjectTime(p0.minProjectTime);
          obj.setCropOptionsMap(new ImmutableMap(p1));
          KSClipLog.i("ClipRepost", "convertClipRepostParamsToAE2 projectSize photoFrameWidth: "+p0.photoFrameWidth+" photoFrameHeight: "+p0.photoFrameHeight+" frameRate: "+p0.frameRate);
          return obj;
       }
    }
    public static AE2MVFilmingDesc covertClipAICutParamsToAE2(String p0,long p1,String p2,int p3,int p4,List p5){
       AE2MVFilmingDesc obj;
       ClipMvUtils uClipMvUtils = ClipMvUtils.class;
       if (PatchProxy.isSupport(uClipMvUtils)) {
          Object[] objArray = new Object[]{p0,Long.valueOf(p1),p2,Integer.valueOf(p3),Integer.valueOf(p4),p5};
          obj = PatchProxy.apply(objArray, null, uClipMvUtils, "38");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (ClipKitUtils.fileExists(p0) && (p1 - false >= 0 && (p3 > 0 && (p4 > 0 && (p5 == null || p5.isEmpty()))))) {
          KSClipLog.e("ClipAICut", "covertClipAICutParamsToAE2 invalid params");
          return null;
       }else {
          obj = new AE2MVFilmingDesc();
          AE2MVFilmingPhotoVec uAE2MVFilmin = new AE2MVFilmingPhotoVec();
          obj.setResourcePath(p0);
          obj.setSeed(p1);
          obj.setThemeId(p2);
          obj.setProjectWidth(p3);
          obj.setProjectHeight(p4);
          obj.setFrameRate(25.00f);
          Iterator iterator = p5.iterator();
          while (iterator.hasNext()) {
             ClipAICut$TemplateAssetInfo templateAsse = iterator.next();
             AE2MVFilmingPhoto uAE2MVFilmin1 = new AE2MVFilmingPhoto();
             uAE2MVFilmin1.setPath(templateAsse.assetPath);
             uAE2MVFilmin1.setRefId(templateAsse.refId);
             uAE2MVFilmin1.setWidth(templateAsse.assetWidth);
             uAE2MVFilmin1.setHeight(templateAsse.assetHeight);
             ClipAICut$TemplateAssetInfo displayRange = templateAsse.displayRange;
             if (displayRange != null) {
                uAE2MVFilmin1.setStartTime((float)displayRange.start());
             }
             templateAsse = templateAsse.clippedRange;
             if (templateAsse != null) {
                uAE2MVFilmin1.setDuration((float)templateAsse.duration());
             }
             uAE2MVFilmin.add(uAE2MVFilmin1);
          }
          obj.setPhotos(uAE2MVFilmin);
          return obj;
       }
    }
    public static Minecraft$AICut covertClipAICutParamsToMC(long p0,String p1,int p2,int p3,List p4){
       Minecraft$AICut obj;
       ClipMvUtils uClipMvUtils = ClipMvUtils.class;
       if (PatchProxy.isSupport(uClipMvUtils)) {
          Object[] objArray = new Object[]{Long.valueOf(p0),p1,Integer.valueOf(p2),Integer.valueOf(p3),p4};
          obj = PatchProxy.apply(objArray, null, uClipMvUtils, "37");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 - false >= 0 && (p2 > 0 && (p3 > 0 && (p4 == null || p4.isEmpty())))) {
          KSClipLog.e("ClipAICut", "covertClipAICutParamsToMC invalid params");
          return null;
       }else {
          obj = new Minecraft$AICut();
          obj.setRandomSeed(p0);
          obj.setThemeId(p1);
          obj.setProjectWidth(p2);
          obj.setProjectHeight(p3);
          MutableArray mutableArray = new MutableArray(Minecraft$TemplateAssetInfo.class);
          Iterator iterator = p4.iterator();
          while (iterator.hasNext()) {
             ClipAICut$TemplateAssetInfo templateAsse = iterator.next();
             Minecraft$TemplateAssetInfo templateAsse1 = new Minecraft$TemplateAssetInfo();
             templateAsse1.setPath(templateAsse.assetPath);
             templateAsse1.setRefId(templateAsse.refId);
             templateAsse1.setAssetWidth(templateAsse.assetWidth);
             templateAsse1.setAssetHeight(templateAsse.assetHeight);
             ClipAICut$TemplateAssetInfo clippedRange = templateAsse.clippedRange;
             if (clippedRange != null) {
                templateAsse1.setDuration(clippedRange.duration());
             }
             templateAsse = templateAsse.displayRange;
             if (templateAsse != null) {
                templateAsse1.setStartTime(templateAsse.start());
             }
             mutableArray.add(templateAsse1);
          }
          obj.setAssetInfos(mutableArray.immutableCopy());
          return obj;
       }
    }
    public static AE2MVFilmingDesc covertClipAnnualAlbumParamsToAE2(String p0,long p1,String p2,int p3,int p4,List p5){
       AE2MVFilmingDesc obj1;
       Iterator iterator2;
       String str;
       AE2Annual2022TrackVec uAE2Annual205;
       object oobject = p0;
       long l = p1;
       object oobject1 = p2;
       int i = p3;
       int i1 = p4;
       object oobject2 = p5;
       ClipMvUtils uClipMvUtils = ClipMvUtils.class;
       AE2MVFilmingPhotoVec obj = null;
       int i2 = 0;
       if (PatchProxy.isSupport(uClipMvUtils)) {
          Object[] objArray = new Object[]{oobject,Long.valueOf(p1),oobject1,Integer.valueOf(p3),Integer.valueOf(p4),oobject2};
          obj1 = PatchProxy.apply(objArray, obj, uClipMvUtils, "49");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       if (ClipKitUtils.fileExists(p0) && (l - false >= 0 && (i > 0 && (i1 > 0 && (oobject2 != null && (!p5.isEmpty() && (oobject2.get(i2).templateAssetInfos == null || oobject2.get(i2).templateAssetInfos.isEmpty()))))))) {
          KSClipLog.e("ClipAnnualAlbum", "covertClipAICutParamsToAE2 invalid params");
       }else {
          obj1 = new AE2MVFilmingDesc();
          AE2Annual2022TrackVec uAE2Annual20 = new AE2Annual2022TrackVec();
          Iterator iterator = p5.iterator();
          while (true) {
             if (iterator.hasNext()) {
                ClipAICut$TemplateSegmentInfo templateSegm = iterator.next();
                if (templateSegm == null) {
                   KSClipLog.e("ClipAnnualAlbum", "covertClipAICutParamsToAE2 templateSegmentInfo is null");
                }else {
                   ClipAICut$TemplateSegmentInfo templateAsse = templateSegm.templateAssetInfos;
                   AE2Annual2022Track uAE2Annual201 = new AE2Annual2022Track();
                   ClipAICut$TemplateSegmentInfo assetTag = templateSegm.assetTag;
                   if (assetTag == null) {
                      assetTag = "";
                   }
                   uAE2Annual201.setAssetTag(assetTag);
                   AE2Annual2022TrackVec uAE2Annual202 = uAE2Annual20;
                   double segmentDurat = ClipMvUtils.getSegmentDuration(templateAsse);
                   if (segmentDurat >= 0 && segmentDurat - Double.MAX_VALUE < 0) {
                      uAE2Annual201.setDuration((float)segmentDurat);
                      if (templateAsse != null && !templateAsse.isEmpty()) {
                         obj = new AE2MVFilmingPhotoVec();
                         Iterator iterator1 = templateAsse.iterator();
                         while (iterator1.hasNext()) {
                            ClipAICut$TemplateAssetInfo templateAsse1 = iterator1.next();
                            if (templateAsse1 == null) {
                               KSClipLog.e("ClipAnnualAlbum", "covertClipAICutParamsToAE2 templateAssetInfo is null");
                            }else {
                               AE2MVFilmingPhoto uAE2MVFilmin = new AE2MVFilmingPhoto();
                               iterator2 = iterator;
                               ClipAICut$TemplateAssetInfo assetPath = templateAsse1.assetPath;
                               if (assetPath == null) {
                                  str = "";
                               }
                               uAE2MVFilmin.setPath(assetPath);
                               assetPath = templateAsse1.refId;
                               if (assetPath == null) {
                                  str = "";
                               }
                               uAE2MVFilmin.setRefId(assetPath);
                               uAE2MVFilmin.setWidth(templateAsse1.assetWidth);
                               uAE2MVFilmin.setHeight(templateAsse1.assetHeight);
                               obj.add(uAE2MVFilmin);
                               iterator = iterator2;
                               continue ;
                            }
                         }
                         iterator2 = iterator;
                         uAE2Annual201.setPhotos(obj);
                         ClipAICut$TemplateSegmentInfo templateAsse2 = templateSegm.templateAssetTextInfos;
                         if (templateAsse2 != null && !templateAsse2.isEmpty()) {
                            AE2Annual2022CustomContentVec uAE2Annual203 = new AE2Annual2022CustomContentVec();
                            iterator = templateAsse2.iterator();
                            while (iterator.hasNext()) {
                               ClipAICut$TemplateAssetTextInfo templateAsse3 = iterator.next();
                               if (templateAsse3 == null) {
                                  KSClipLog.e("ClipAnnualAlbum", "covertClipAICutParamsToAE2 templateAssetTextInfo is null");
                               }else {
                                  AE2Annual2022CustomContent uAE2Annual204 = new AE2Annual2022CustomContent();
                                  ClipAICut$TemplateAssetTextInfo textMarker = templateAsse3.textMarker;
                                  if (textMarker == null) {
                                     textMarker = "";
                                  }
                                  uAE2Annual204.setName(textMarker);
                                  templateAsse3 = templateAsse3.customImagePath;
                                  if (templateAsse3 == null) {
                                     String str1 = "";
                                  }
                                  uAE2Annual204.setPath(templateAsse3);
                                  uAE2Annual203.add(uAE2Annual204);
                                  continue ;
                               }
                            }
                            uAE2Annual201.setContents(uAE2Annual203);
                         }else {
                            KSClipLog.e("ClipAnnualAlbum", "covertClipAICutParamsToAE2 templateAssetTextInfos is null or empty");
                         }
                         uAE2Annual205 = uAE2Annual202;
                         uAE2Annual205.add(uAE2Annual201);
                      }else {
                         iterator2 = iterator;
                         uAE2Annual205 = uAE2Annual202;
                         KSClipLog.e("ClipAnnualAlbum", "covertClipAICutParamsToAE2 templateAssetInfos is null or empty");
                      }
                      uAE2Annual20 = uAE2Annual205;
                      iterator = iterator2;
                      segmentDurat = 0;
                   }else {
                      KSClipLog.e("ClipAnnualAlbum", "covertClipAICutParamsToAE2 invalid durations");
                      break ;
                   }
                }
             }else {
                obj1.setTracks(uAE2Annual20);
                obj1.setResourcePath(oobject);
                obj1.setSeed(l);
                obj1.setThemeId(oobject1);
                obj1.setProjectWidth(i);
                obj1.setProjectHeight(i1);
                obj1.setFrameRate(25.00f);
                return obj1;
             }
          }
       }
       return null;
    }
    public static Minecraft$AICut covertClipAnnualAlbumParamsToMC(long p0,String p1,int p2,int p3,List p4){
       Minecraft$AICut obj1;
       ClipMvUtils uClipMvUtils = ClipMvUtils.class;
       Minecraft$TemplateAssetInfo obj = null;
       int i = 0;
       if (PatchProxy.isSupport(uClipMvUtils)) {
          Object[] objArray = new Object[]{Long.valueOf(p0),p1,Integer.valueOf(p2),Integer.valueOf(p3),p4};
          obj1 = PatchProxy.apply(objArray, obj, uClipMvUtils, "48");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       if (p0 - false >= 0 && (p2 > 0 && (p3 > 0 && (p4 != null && (!p4.isEmpty() && (p4.get(i).templateAssetInfos == null || p4.get(i).templateAssetInfos.isEmpty())))))) {
          KSClipLog.e("ClipAnnualAlbum", "covertClipAICutParamsToMC invalid params");
          return obj;
       }else {
          obj1 = new Minecraft$AICut();
          obj1.setRandomSeed(p0);
          obj1.setThemeId(p1);
          obj1.setProjectWidth(p2);
          obj1.setProjectHeight(p3);
          MutableArray mutableArray = new MutableArray(Minecraft$TemplateSegmentInfo.class);
          Iterator iterator = p4.iterator();
          while (iterator.hasNext()) {
             ClipAICut$TemplateSegmentInfo templateSegm = iterator.next();
             if (templateSegm == null) {
                KSClipLog.e("ClipAnnualAlbum", "covertClipAnnualAlbumParamsToMC templateSegmentInfo is null");
             }else {
                ClipAICut$TemplateSegmentInfo templateAsse = templateSegm.templateAssetInfos;
                if (templateAsse == null || templateAsse.isEmpty()) {
                   KSClipLog.e("ClipAnnualAlbum", "covertClipAnnualAlbumParamsToMC templateAssetInfos is null or empty");
                }else {
                   Minecraft$TemplateSegmentInfo templateSegm1 = new Minecraft$TemplateSegmentInfo();
                   templateSegm1.setAssetTag(templateSegm.assetTag);
                   MutableArray mutableArray1 = new MutableArray(Minecraft$TemplateAssetInfo.class);
                   Iterator iterator1 = templateAsse.iterator();
                   while (iterator1.hasNext()) {
                      ClipAICut$TemplateAssetInfo templateAsse1 = iterator1.next();
                      if (templateAsse1 == null) {
                         KSClipLog.e("ClipAnnualAlbum", "covertClipAnnualAlbumParamsToMC templateAssetInfo is null");
                      }else {
                         obj = new Minecraft$TemplateAssetInfo();
                         obj.setPath(templateAsse1.assetPath);
                         obj.setRefId(templateAsse1.refId);
                         obj.setAssetWidth(templateAsse1.assetWidth);
                         obj.setAssetHeight(templateAsse1.assetHeight);
                         ClipAICut$TemplateAssetInfo clippedRange = templateAsse1.clippedRange;
                         if (clippedRange != null && clippedRange.duration() > 0) {
                            obj.setDuration(templateAsse1.clippedRange.duration());
                         }
                         mutableArray1.add(obj);
                         continue ;
                      }
                   }
                   templateSegm1.setAssetInfos(mutableArray1.immutableCopy());
                   templateAsse = templateSegm.templateAssetTextInfos;
                   if (templateAsse == null || templateAsse.isEmpty()) {
                      KSClipLog.e("ClipAnnualAlbum", "covertClipAnnualAlbumParamsToMC templateAssetTextInfos is null or empty");
                   }
                   mutableArray1 = new MutableArray(Minecraft$TemplateAssetTextInfo.class);
                   iterator1 = templateAsse.iterator();
                   while (iterator1.hasNext()) {
                      ClipAICut$TemplateAssetTextInfo templateAsse2 = iterator1.next();
                      if (templateAsse2 == null) {
                         KSClipLog.e("ClipAnnualAlbum", "covertClipAnnualAlbumParamsToMC templateAssetTextInfo is null");
                      }else {
                         Minecraft$TemplateAssetTextInfo templateAsse3 = new Minecraft$TemplateAssetTextInfo();
                         templateAsse3.setTextMarker(templateAsse2.textMarker);
                         templateAsse3.setCustomImagePath(templateAsse2.customImagePath);
                         mutableArray1.add(templateAsse3);
                         continue ;
                      }
                   }
                   templateSegm1.setTextInfos(mutableArray1.immutableCopy());
                   if ((templateSegm.assetTag).isEmpty()) {
                      templateSegm.assetTag = "";
                   }
                   mutableArray.add(templateSegm1);
                }
             }
          }
          obj1.setSegmentInfos(mutableArray.immutableCopy());
          return obj1;
       }
    }
    public static EditorSdk2MvCreationResult createAICutProject(String p0,String p1,long p2,String p3,int p4,int p5,List p6){
       AE2MVFilmingDesc obj;
       AE2MVFilmingAsset asset;
       AE2MVFilming uAE2MVFilmin1;
       object oobject = p0;
       object oobject1 = p1;
       int i = p4;
       int i1 = p5;
       object oobject2 = p6;
       Minecraft$KSAVClip kSAVClip = Minecraft$KSAVClip.class;
       ClipMvUtils uClipMvUtils = ClipMvUtils.class;
       int i2 = 2;
       int i3 = 1;
       if (PatchProxy.isSupport(uClipMvUtils)) {
          Object[] objArray = new Object[]{oobject,oobject1,Long.valueOf(p2),p3,Integer.valueOf(p4),Integer.valueOf(p5),oobject2};
          obj = PatchProxy.apply(objArray, null, uClipMvUtils, "35");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i4 = -50001;
       int i5 = 9;
       String str = "ClipAICut";
       if (!ClipMvUtils.checkFlexibleTemplateGeneralParams(p0, p1, p2, p3, p4, p5, "ClipAICut")) {
          KSClipLog.e(str, "createAICutProject params is null");
          return new EditorSdk2MvCreationResultImpl(i5, i4, "params is null");
       }else if(oobject2 == null || p6.isEmpty()){
          KSClipLog.e(str, "createAICutProject templateAssetInfos is null");
          return new EditorSdk2MvCreationResultImpl(9, -50001, "templateAssetInfos is null");
       }else {
          KSClipLog.i(str, "checkAICutProjectParams templatePath: "+oobject+" bgPlaceholderPath: "+oobject1+" randomSeed: "+p2+" projectWidth: "+i+" projectHeight "+i1);
          String str1 = str;
          i2 = 9;
          obj = ClipMvUtils.covertClipAICutParamsToAE2(p0, p2, p3, p4, p5, p6);
          if (obj == null) {
             KSClipLog.e(str1, "createAICutProject covertClipAICutParamsToAE2 return null ae2MVFilmingDesc");
             return new EditorSdk2MvCreationResultImpl(i2, i4, "ae2MVFilmingDesc is null");
          }else {
             AE2MVFilming uAE2MVFilmin = AE2MVFilming.newInstance(obj);
             AE2Project uAE2Project = uAE2MVFilmin.proj();
             if (uAE2Project == null) {
                KSClipLog.e(str1, "createAICutProject ae2 return null ae2Project");
                return new EditorSdk2MvCreationResultImpl(i2, i4, "ae2Project is null");
             }else {
                double d = uAE2Project.outFrame() / uAE2Project.frameRate();
                if (d - 0x3e112e0be826d695 < 0) {
                   KSClipLog.e(str1, "createAICutProject ae2Project duration invalid "+d);
                   return new EditorSdk2MvCreationResultImpl(i2, i4, "ae2Project duration invalid");
                }else {
                   int i6 = uAE2MVFilmin.assetCount();
                   if (i6 <= 0) {
                      KSClipLog.e(str1, "createAICutProject ae2 return empty asset array");
                      return new EditorSdk2MvCreationResultImpl(i2, i4, "ae2 return empty asset array");
                   }else {
                      KSClipLog.i(str1, "ae2Project return duration: "+d+" ae2MVFilmingAssets size: "+i6);
                      EditorSdk2V2$TrackAsset trackAsset = ClipMvUtils.createBackgroundTrackAsset(oobject1, d, uAE2Project);
                      if (trackAsset == null) {
                         KSClipLog.e(str1, "createAICutProject createBackgroundTrackAsset return null bgTrackAsset");
                         return new EditorSdk2MvCreationResultImpl(i2, i4, "bgTrackAsset create failed");
                      }else {
                         KwaiMvParam kwaiMvParam = new KwaiMvParam();
                         ClipMvUtils.setKwaiMvParams(kwaiMvParam, oobject, oobject1);
                         ArrayList uArrayList = new ArrayList();
                         ArrayList uArrayList1 = new ArrayList();
                         MutableArray mutableArray = new MutableArray(kSAVClip);
                         MutableArray mutableArray1 = new MutableArray(Minecraft$Range.class);
                         MutableArray mutableArray2 = new MutableArray(kSAVClip);
                         mutableArray2.add(trackAsset.getMainClip());
                         AE2Project uAE2Project1 = uAE2Project;
                         int i7 = 0;
                         while (true) {
                            if (i7 < i6) {
                               try{
                                  asset = uAE2MVFilmin.getAsset(i7);
                                  if (asset == null) {
                                     break ;
                                  }else {
                                     ClipAICut$TemplateAssetInfo templateAsse = ClipMvUtils.getTemplateAssetInfoByRefId(oobject2, asset.getRefId());
                                     if (templateAsse == null) {
                                        uAE2MVFilmin1 = uAE2MVFilmin;
                                        if (asset.getType() != ClipAICut$Type.AE2EffectMedia.getValue()) {
                                           KSClipLog.e(str1, "createAICutProject the asset not in ae2MVFilmingAssets");
                                           return new EditorSdk2MvCreationResultImpl(9, -50001, "asset refId mismatch");
                                        }
                                     }else {
                                        uAE2MVFilmin1 = uAE2MVFilmin;
                                     }
                                     Minecraft$Range range = new Minecraft$Range();
                                     Minecraft$KSAVClip kSAVClip1 = ClipMvUtils.createFlexibleTemplateClipsAndParams("ClipAICut", asset, templateAsse, kwaiMvParam, uArrayList, uArrayList1, range);
                                     if (kSAVClip1 == null) {
                                        KSClipLog.e(str1, "createAICutProject create Flexible template clips and params failed");
                                        return new EditorSdk2MvCreationResultImpl(9, -50001, "create clips and params failed");
                                     }else {
                                        mutableArray.add(kSAVClip1);
                                        mutableArray1.add(range);
                                        i7 = i7 + 1;
                                        uAE2MVFilmin = uAE2MVFilmin1;
                                     }
                                  }
                               }catch(java.lang.Exception e0){
                                  KSClipLog.e(str1, "createAICutProject create avClips exception "+e0);
                                  return new EditorSdk2MvCreationResultImpl(9, -1, " create avClips exception "+e0);
                               }
                            }else {
                               Minecraft$TemplateReference templateRefe = new Minecraft$TemplateReference();
                               templateRefe.setAssetsDirectory(oobject);
                               templateRefe.setVisibleTimes(mutableArray1.immutableCopy());
                               MutableMap mutableMap = new MutableMap();
                               mutableMap.put("backgroudVideoV2", Integer.valueOf(-1));
                               templateRefe.setRenderOrderMap(mutableMap.immutableMapCopy());
                               Minecraft$TemplateClip templateClip = new Minecraft$TemplateClip();
                               templateClip.setTemplateType(2);
                               templateClip.setAicut(ClipMvUtils.covertClipAICutParamsToMC(p2, p3, p4, p5, p6));
                               templateClip.setSourceRange(TimeRange.timeRangeFromStartToEndTime(RationalTime.fromSeconds(0), RationalTime.fromSeconds(d)));
                               templateClip.setReplaceableClips(mutableArray.immutableCopy());
                               templateClip.setIrreplaceableClips(mutableArray2.immutableCopy());
                               templateClip.setMediaReference(templateRefe);
                               MutableTrack mutableTrack = new MutableTrack();
                               ErrorStatus uErrorStatus = new ErrorStatus();
                               mutableTrack.appendClip(templateClip, uErrorStatus);
                               ErrorCode ok = ErrorCode.Ok;
                               if (uErrorStatus.errorCode() != ok.ordinal()) {
                                  KSClipLog.e(str1, "createAICutProject track appendClip error "+uErrorStatus.errorCode());
                                  return new EditorSdk2MvCreationResultImpl(9, -50001, " track appendClip error "+uErrorStatus.errorCode());
                               }else {
                                  MutableTimeline mutableTimel = new MutableTimeline();
                                  mutableTimel.appendTrack(mutableTrack, uErrorStatus);
                                  if (uErrorStatus.errorCode() != ok.ordinal()) {
                                     KSClipLog.e(str1, "createAICutProject timeline appendTrack error "+uErrorStatus.errorCode());
                                     return new EditorSdk2MvCreationResultImpl(9, -50001, " timeline appendTrack error "+uErrorStatus.errorCode());
                                  }else {
                                     EditorSdk2V2$VideoEditorProject videoEditorP = new EditorSdk2V2$VideoEditorProject(mutableTimel);
                                     EditorSdk2V2$TrackAsset[] trackAssetAr = new EditorSdk2V2$TrackAsset[]{trackAsset};
                                     try{
                                        videoEditorP.setTrackAssets(trackAssetAr);
                                        EditorSdk2UtilsV2.loadProject(videoEditorP);
                                        EditorSdk2MvCreationResultImpl uEditorSdk2M = new EditorSdk2MvCreationResultImpl();
                                        uEditorSdk2M.setProject(videoEditorP);
                                        uEditorSdk2M.setAe2Project(uAE2Project1);
                                        uEditorSdk2M.setRenderPosList(uArrayList1);
                                        uEditorSdk2M.setVideoWidth(p4);
                                        uEditorSdk2M.setVideoHeight(p5);
                                        uEditorSdk2M.setMvAssets(uArrayList);
                                        uEditorSdk2M.setTemplateType(EditorSdk2MvCreationResult$TemplateType.TEMPLATE_TYPE_AICUT);
                                        uEditorSdk2M.setMVParam(kwaiMvParam);
                                        KSClipLog.i(str1, "createAICutProject finish");
                                        return uEditorSdk2M;
                                     }catch(java.lang.Exception e0){
                                        Object obj1 = e0;
                                        KSClipLog.e(str1, "createAICutProject loadProject fail "+obj1);
                                        return new EditorSdk2MvCreationResultImpl(9, -50001, "loadProject fail "+obj1);
                                     }
                                  }
                               }
                            }
                         }
                         KSClipLog.e(str1, "createAICutProject ae2 return null ae2MVFilmingAsset");
                         return new EditorSdk2MvCreationResultImpl(9, -50001, "ae2MVFilmingAsset is null");
                      }
                   }
                }
             }
          }
       }
    }
    public static EditorSdk2MvCreationResult createAnnualAlbumProject(String p0,String p1,long p2,String p3,int p4,int p5,List p6){
       AE2MVFilmingDesc obj;
       AE2MVFilmingAsset asset;
       AE2Annual2022 uAE2Annual201;
       object oobject = p0;
       object oobject1 = p1;
       int i = p4;
       int i1 = p5;
       object oobject2 = p6;
       Minecraft$KSAVClip kSAVClip = Minecraft$KSAVClip.class;
       ClipMvUtils uClipMvUtils = ClipMvUtils.class;
       int i2 = 1;
       int i3 = 0;
       if (PatchProxy.isSupport(uClipMvUtils)) {
          Object[] objArray = new Object[]{oobject,oobject1,Long.valueOf(p2),p3,Integer.valueOf(p4),Integer.valueOf(p5),oobject2};
          obj = PatchProxy.apply(objArray, null, uClipMvUtils, "39");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i4 = -50001;
       int i5 = 9;
       String str = "ClipAnnualAlbum";
       if (!ClipMvUtils.checkFlexibleTemplateGeneralParams(p0, p1, p2, p3, p4, p5, "ClipAnnualAlbum")) {
          KSClipLog.i(str, "createAnnualAlbumProject params is null");
          return new EditorSdk2MvCreationResultImpl(i5, i4, "params is null");
       }else if(oobject2 != null && (!p6.isEmpty() && (oobject2.get(i3).templateAssetInfos == null || oobject2.get(i3).templateAssetInfos.isEmpty()))){
          KSClipLog.i(str, "createAnnualAlbumProject templateAssetInfos is null");
          return new EditorSdk2MvCreationResultImpl(9, -50001, "templateAssetInfos is null");
       }else {
          KSClipLog.i(str, "createAnnualAlbumProject templatePath: "+oobject+" bgPlaceholderPath: "+oobject1+" randomSeed: "+p2+" projectWidth: "+i+" projectHeight "+i1);
          String str1 = str;
          i2 = 9;
          obj = ClipMvUtils.covertClipAnnualAlbumParamsToAE2(p0, p2, p3, p4, p5, p6);
          if (obj == null) {
             KSClipLog.i(str1, "createAnnualAlbumProject covertClipAICutParamsToAE2 return null ae2MVFilmingDesc");
             return new EditorSdk2MvCreationResultImpl(i2, i4, "ae2MVFilmingDesc is null");
          }else {
             AE2Annual2022 uAE2Annual20 = AE2Annual2022.newInstance(obj);
             AE2Project uAE2Project = uAE2Annual20.proj();
             if (uAE2Project == null) {
                KSClipLog.i(str1, "createAnnualAlbumProject ae2 return null ae2Project");
                return new EditorSdk2MvCreationResultImpl(i2, i4, "ae2Project is null");
             }else {
                double d = uAE2Project.outFrame() / uAE2Project.frameRate();
                if (d - 0x3e112e0be826d695 < 0) {
                   KSClipLog.i(str1, "createAnnualAlbumProject ae2Project duration invalid "+d);
                   return new EditorSdk2MvCreationResultImpl(i2, i4, "ae2Project duration invalid");
                }else {
                   int i6 = uAE2Annual20.assetCount();
                   if (i6 <= 0) {
                      KSClipLog.i(str1, "createAnnualAlbumProject ae2 return empty asset array");
                      return new EditorSdk2MvCreationResultImpl(i2, i4, "ae2 return empty asset array");
                   }else {
                      KSClipLog.i(str1, "createAnnualAlbumProject ae2Project return duration: "+d+" ae2MVFilmingAssets size: "+i6);
                      EditorSdk2V2$TrackAsset trackAsset = ClipMvUtils.createBackgroundTrackAsset(oobject1, d, uAE2Project);
                      if (trackAsset == null) {
                         KSClipLog.i(str1, "createAnnualAlbumProject createBackgroundTrackAsset return null bgTrackAsset");
                         return new EditorSdk2MvCreationResultImpl(i2, i4, "bgTrackAsset create failed");
                      }else {
                         KwaiMvParam kwaiMvParam = new KwaiMvParam();
                         ClipMvUtils.setKwaiMvParams(kwaiMvParam, oobject, oobject1);
                         ArrayList uArrayList = new ArrayList();
                         ArrayList uArrayList1 = new ArrayList();
                         MutableArray mutableArray = new MutableArray(kSAVClip);
                         mutableArray.add(trackAsset.getMainClip());
                         MutableArray mutableArray1 = new MutableArray(kSAVClip);
                         MutableArray mutableArray2 = new MutableArray(Minecraft$Range.class);
                         AE2Project uAE2Project1 = uAE2Project;
                         i = 0;
                         while (true) {
                            if (i < i6) {
                               try{
                                  asset = uAE2Annual20.getAsset(i);
                                  if (asset == null) {
                                     break ;
                                  }else {
                                     ClipAICut$TemplateAssetInfo templateAsse = ClipMvUtils.getTemplateAssetInfoByRefIdInSegmentInfos(oobject2, asset.getRefId());
                                     if (templateAsse == null) {
                                        uAE2Annual201 = uAE2Annual20;
                                        if (asset.getType() != ClipAICut$Type.ReplaceableMedia.getValue() && asset.getType() != ClipAICut$Type.AE2EffectMedia.getValue()) {
                                           KSClipLog.i(str1, "createAnnualAlbumProject the asset not in ae2MVFilmingAssets");
                                           return new EditorSdk2MvCreationResultImpl(9, -50001, "asset refId mismatch");
                                        }
                                     }else {
                                        uAE2Annual201 = uAE2Annual20;
                                     }
                                     Minecraft$Range range = new Minecraft$Range();
                                     Minecraft$KSAVClip kSAVClip1 = ClipMvUtils.createFlexibleTemplateClipsAndParams("ClipAnnualAlbum", asset, templateAsse, kwaiMvParam, uArrayList, uArrayList1, range);
                                     if (kSAVClip1 == null) {
                                        KSClipLog.i(str1, "createAnnualAlbumProject create flexible template clips and params failed");
                                        return new EditorSdk2MvCreationResultImpl(9, -50001, "create clips and params failed");
                                     }else {
                                        mutableArray1.add(kSAVClip1);
                                        mutableArray2.add(range);
                                        i = i + 1;
                                        uAE2Annual20 = uAE2Annual201;
                                     }
                                  }
                               }catch(java.lang.Exception e0){
                                  KSClipLog.i(str1, "createAnnualAlbumProject create avClips exception "+e0);
                                  return new EditorSdk2MvCreationResultImpl(9, -1, " create avClips exception "+e0);
                               }
                            }else {
                               Minecraft$TemplateReference templateRefe = new Minecraft$TemplateReference();
                               templateRefe.setAssetsDirectory(oobject);
                               templateRefe.setVisibleTimes(mutableArray2.immutableCopy());
                               MutableMap mutableMap = new MutableMap();
                               mutableMap.put("backgroudVideoV2", Integer.valueOf(-1));
                               templateRefe.setRenderOrderMap(mutableMap.immutableMapCopy());
                               Minecraft$TemplateClip templateClip = new Minecraft$TemplateClip();
                               templateClip.setTemplateType(1);
                               templateClip.setAicut(ClipMvUtils.covertClipAnnualAlbumParamsToMC(p2, p3, p4, p5, p6));
                               templateClip.setSourceRange(TimeRange.timeRangeFromStartToEndTime(RationalTime.fromSeconds(0), RationalTime.fromSeconds(d)));
                               templateClip.setReplaceableClips(mutableArray1.immutableCopy());
                               templateClip.setIrreplaceableClips(mutableArray.immutableCopy());
                               templateClip.setMediaReference(templateRefe);
                               MutableTrack mutableTrack = new MutableTrack();
                               ErrorStatus uErrorStatus = new ErrorStatus();
                               mutableTrack.appendClip(templateClip, uErrorStatus);
                               ErrorCode ok = ErrorCode.Ok;
                               if (uErrorStatus.errorCode() != ok.ordinal()) {
                                  KSClipLog.e(str1, "createAnnualAlbumProject track appendClip error "+uErrorStatus.errorCode());
                                  return new EditorSdk2MvCreationResultImpl(9, -50001, " track appendClip error "+uErrorStatus.errorCode());
                               }else {
                                  MutableTimeline mutableTimel = new MutableTimeline();
                                  mutableTimel.appendTrack(mutableTrack, uErrorStatus);
                                  if (uErrorStatus.errorCode() != ok.ordinal()) {
                                     KSClipLog.e(str1, "createAnnualAlbumProject timeline appendTrack error "+uErrorStatus.errorCode());
                                     return new EditorSdk2MvCreationResultImpl(9, -50001, " timeline appendTrack error "+uErrorStatus.errorCode());
                                  }else {
                                     EditorSdk2V2$VideoEditorProject videoEditorP = new EditorSdk2V2$VideoEditorProject(mutableTimel);
                                     EditorSdk2V2$TrackAsset[] trackAssetAr = new EditorSdk2V2$TrackAsset[]{trackAsset};
                                     try{
                                        videoEditorP.setTrackAssets(trackAssetAr);
                                        EditorSdk2UtilsV2.loadProject(videoEditorP);
                                        EditorSdk2MvCreationResultImpl uEditorSdk2M = new EditorSdk2MvCreationResultImpl();
                                        uEditorSdk2M.setProject(videoEditorP);
                                        uEditorSdk2M.setAe2Project(uAE2Project1);
                                        uEditorSdk2M.setRenderPosList(uArrayList1);
                                        uEditorSdk2M.setVideoWidth(p4);
                                        uEditorSdk2M.setVideoHeight(p5);
                                        uEditorSdk2M.setMvAssets(uArrayList);
                                        uEditorSdk2M.setTemplateType(EditorSdk2MvCreationResult$TemplateType.TEMPLATE_TYPE_ANNUAL_ALBUM);
                                        uEditorSdk2M.setMVParam(kwaiMvParam);
                                        KSClipLog.i(str1, "createAnnualAlbumProject finish");
                                        return uEditorSdk2M;
                                     }catch(java.lang.Exception e0){
                                        Object obj1 = e0;
                                        KSClipLog.e(str1, "createAnnualAlbumProject loadProject fail "+obj1);
                                        return new EditorSdk2MvCreationResultImpl(9, -50001, "loadProject fail "+obj1);
                                     }
                                  }
                               }
                            }
                         }
                         KSClipLog.i(str1, "createAnnualAlbumProject ae2 return null ae2MVFilmingAsset");
                         return new EditorSdk2MvCreationResultImpl(9, -50001, "ae2MVFilmingAsset is null");
                      }
                   }
                }
             }
          }
       }
    }
    public static EditorSdk2V2$TrackAsset createBackgroundTrackAsset(String p0,double p1,AE2Project p2){
       if (PatchProxy.isSupport(ClipMvUtils.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Double.valueOf(p1), p2, null, ClipMvUtils.class, "33");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          EditorSdk2V2$TrackAsset trackAsset = EditorSdk2UtilsV2.openTrackAsset(p0);
          trackAsset.setIsBackgroundVideo(true);
          trackAsset.getMainClip().setSourceRange(TimeRange.timeRangeFromStartToEndTime(RationalTime.fromSeconds(0), RationalTime.fromSeconds(p1)));
          trackAsset.getMainClip().setAeRefId("backgroudVideoV2");
          trackAsset.getMainClip().setBlendingMode(0);
          Minecraft$InputFileOptions inputFileOpt = new Minecraft$InputFileOptions();
          Minecraft$RationalV2 rationalV2 = new Minecraft$RationalV2();
          rationalV2.setNum((long)p2.frameRate());
          inputFileOpt.setFrameRate(rationalV2);
          trackAsset.setAssetPathOptions(inputFileOpt);
          return trackAsset;
       }catch(java.lang.Exception e0){
          KSClipLog.e("ClipMVUtils", "create bgTrackAsset failed, return new TrackAsset\(\)");
          return new EditorSdk2V2$TrackAsset();
       }
    }
    public static Minecraft$KSAVClip createFlexibleTemplateClipsAndParams(String p0,AE2MVFilmingAsset p1,ClipAICut$TemplateAssetInfo p2,KwaiMvParam p3,List p4,List p5,Minecraft$Range p6){
       String obj1;
       EditorSdk2$TimeRange timeRange;
       ArrayList uArrayList1;
       object oobject = p0;
       object oobject1 = p2;
       object oobject2 = p3;
       object oobject3 = p4;
       object oobject4 = p5;
       object oobject5 = p6;
       ClipMvUtils uClipMvUtils = ClipMvUtils.class;
       int i = 2;
       int i1 = 0;
       Minecraft$KSAVClip obj = null;
       int i2 = 1;
       if (PatchProxy.isSupport(uClipMvUtils)) {
          Object[] objArray = new Object[]{oobject,p1,oobject1,oobject2,oobject3,oobject4,oobject5};
          obj1 = PatchProxy.apply(objArray, obj, uClipMvUtils, "34");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       obj1 = p1.getPath();
       String refId = p1.getRefId();
       int width = p1.getWidth();
       int height = p1.getHeight();
       int type = p1.getType();
       i1 = p1.getAlphaType();
       ArrayList uArrayList = new ArrayList();
       AE2TimeRange visibleTime = p1.getVisibleTime();
       if (visibleTime == null) {
          KSClipLog.i(oobject, "createFlexibleTemplateClipsAndParams ae2 return null timeRange for refId "+refId);
          return new Minecraft$KSAVClip();
       }else {
          timeRange = new EditorSdk2$TimeRange();
          timeRange.setStart(visibleTime.getStartTime());
          timeRange.setDuration(visibleTime.getDuration());
          uArrayList.add(timeRange);
          double startTime = visibleTime.getStartTime();
          obj = EditorSdk2UtilsV2.createAduioVideoClip(obj1, obj, obj);
          obj.setAeRefId(refId);
          obj.setMute(true);
          obj.setRenderType(2);
          double d = 0;
          if (oobject1 != null) {
             ClipAICut$TemplateAssetInfo clippedRange = oobject1.clippedRange;
             if (clippedRange != null && clippedRange.start() - d >= 0) {
                uArrayList1 = uArrayList;
                obj.setSourceRange(TimeRange.timeRangeFromStartToEndTime(RationalTime.fromSeconds(oobject1.clippedRange.start()), RationalTime.fromSeconds((oobject1.clippedRange.start() + timeRange.duration()))));
             label_00eb :
                if (oobject1 != null) {
                   clippedRange = oobject1.displayRange;
                   if (clippedRange != null && (clippedRange.start() - d >= 0 && oobject1.displayRange.duration() - d > 0)) {
                      d = startTime;
                      oobject5.setStart(oobject1.displayRange.start());
                      oobject5.setDuration(oobject1.displayRange.duration());
                   label_0128 :
                      oobject5.setId(Long.parseLong(obj.clipId()));
                      Minecraft$PropertyKeyFrame propertyKeyF = new Minecraft$PropertyKeyFrame();
                      double d1 = timeRange.duration();
                      try{
                         propertyKeyF.setDuration(d1);
                         propertyKeyF.setAssetTransform(EditorSdk2Utils.createIdentityTransform());
                      }catch(com.kwai.video.editorsdk2.EditorSdk2InternalErrorException e0){
                         KSClipLog.i(e0, "createFlexibleTemplateClipsAndParams createIdentityTransform failed");
                      }
                      Minecraft$PropertyKeyFrame[] propertyKeyF1 = new Minecraft$PropertyKeyFrame[]{propertyKeyF};
                      obj.setPropertyKeyFrames(propertyKeyF1);
                      Minecraft$CropOptions uCropOptions = new Minecraft$CropOptions();
                      uCropOptions.setWidth(width);
                      try{
                         uCropOptions.setHeight(height);
                         uCropOptions.setTransform(EditorSdk2Utils.createIdentityTransform());
                      }catch(com.kwai.video.editorsdk2.EditorSdk2InternalErrorException e0){
                         KSClipLog.i(e0, "createFlexibleTemplateClipsAndParams createIdentityTransform failed");
                      }
                      obj.setCropOptions(uCropOptions);
                      if (oobject1 == null) {
                         if (type == ClipAICut$Type.AE2EffectMedia.getValue()) {
                            obj.mutableMediaReference().setAlphaInfo(i1);
                         }
                         return obj;
                      }else {
                         EditorSdk2MvAssetImpl uEditorSdk2M = new EditorSdk2MvAssetImpl();
                         uEditorSdk2M.setRefId(refId);
                         uEditorSdk2M.setAssetPath(obj1);
                         uEditorSdk2M.setWidth(width);
                         uEditorSdk2M.setHeight(height);
                         double d2 = d;
                         uEditorSdk2M.setTimeStamp(d2);
                         uEditorSdk2M.setVisibleTimeRange(timeRange);
                         uEditorSdk2M.setVisibleTimeRanges(uArrayList1);
                         uEditorSdk2M.setIsReplaceable(true);
                         p4.add(uEditorSdk2M);
                         MvPhotoInfo mvPhotoInfo = new MvPhotoInfo();
                         int i3 = (int)(d2 * 0x408f400000000000);
                         mvPhotoInfo.time = i3;
                         p5.add(Integer.valueOf(i3));
                         ReplaceableAreaInfo replaceableA = new ReplaceableAreaInfo();
                         replaceableA.refId = refId;
                         replaceableA.width = (float)width;
                         replaceableA.height = (float)height;
                         ArrayList uArrayList2 = new ArrayList();
                         mvPhotoInfo.areas = uArrayList2;
                         uArrayList2.add(replaceableA);
                         uArrayList2 = new ArrayList();
                         KwaiMvParam kwaiMvParam = p3;
                         kwaiMvParam.mvPhotoInfos = uArrayList2;
                         uArrayList2.add(mvPhotoInfo);
                         MvReplaceableAreaDetail mvReplaceabl = new MvReplaceableAreaDetail();
                         mvReplaceabl.info = mvPhotoInfo;
                         ArrayList uArrayList3 = new ArrayList();
                         mvReplaceabl.replaceableAreaDetail = uArrayList3;
                         uArrayList3.add(replaceableA);
                         kwaiMvParam.allDetails = new AllMvReplaceableAreaDetail();
                         kwaiMvParam.allDetails.details = new ArrayList();
                         kwaiMvParam.allDetails.details.add(mvReplaceabl);
                         return obj;
                      }
                   }
                }
                d = startTime;
                oobject5.setStart(visibleTime.getStartTime());
                oobject5.setDuration(visibleTime.getDuration());
                goto label_0128 ;
             }
          }
          uArrayList1 = uArrayList;
          obj.setSourceRange(TimeRange.timeRangeFromStartToEndTime(RationalTime.fromSeconds(d), RationalTime.fromSeconds(timeRange.duration())));
          goto label_00eb ;
       }
    }
    public static EditorSdk2MvCreationResultImpl createNewSparkProjectByInfoSync(TemplateInfo p0,VideoProjectWrapper p1,NewSparkTemplateManager p2,int p3){
       VideoProjectWrapper obj;
       TemplateInfo templateInfo;
       MvReplaceableAreaDetail mvReplaceabl;
       EditorSdk2V2$TrackAsset trackAsset;
       String str = "ClipSparkRecovery";
       if (PatchProxy.isSupport(ClipMvUtils.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, p2, Integer.valueOf(p3), null, ClipMvUtils.class, "23");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1 == null) {
          obj = new VideoProjectWrapper();
          templateInfo = p0;
       }else {
          templateInfo = p0;
          obj = p1;
       }
       MutableTimeline mutableTimel = p2.compileTemplateData(templateInfo, obj);
       ImmutableArray immutableArr = mutableTimel.mutableReplaceableClips();
       ArrayList uArrayList = p0.replaceableAssets();
       HashMap hashMap = new HashMap();
       ArrayList uArrayList1 = new ArrayList();
       ArrayList uArrayList2 = new ArrayList();
       for (int i = 0; i < immutableArr.size(); i = i + 1) {
          EditorSdk2MvAssetImpl uEditorSdk2M = new EditorSdk2MvAssetImpl();
          Minecraft$KSAVClip kSAVClip = immutableArr.get(i);
          uEditorSdk2M.setRefId(MinecraftUtils.GetRefIdOfAVClip(kSAVClip));
          uEditorSdk2M.setAssetPath(MinecraftUtils.GetPathOfAVClip(kSAVClip));
          uEditorSdk2M.setIsReplaceable(false);
          ClipMvUtils.setMvAssetInfoForNewSpark(kSAVClip, uArrayList, uEditorSdk2M, hashMap, i);
          uArrayList2.add(uEditorSdk2M);
       }
       AllMvReplaceableAreaDetail uAllMvReplac = new AllMvReplaceableAreaDetail();
       uAllMvReplac.details = new ArrayList(uArrayList.size());
       for (int i1 = 0; i1 < uArrayList.size(); i1 = i1 + 1) {
          mvReplaceabl = ClipMvUtils.obtainReplaceableAreaDetail(uArrayList.get(i1).getAssetID(), hashMap, p0.getProjectWidth(), p0.getProjectHeight());
          uArrayList1.add(Integer.valueOf(mvReplaceabl.info.time));
          uAllMvReplac.details.add(mvReplaceabl);
       }
       EditorSdk2V2$VideoEditorProject videoEditorP = new EditorSdk2V2$VideoEditorProject(mutableTimel);
       EditorSdk2$VideoEditorProjectPrivate videoEditorP1 = new EditorSdk2$VideoEditorProjectPrivate();
       videoEditorP.mProjectPrivate = videoEditorP1;
       boolean b = true;
       videoEditorP1.setIsSparkMv(b);
       try{
          mvReplaceabl = 0;
          trackAsset = EditorSdk2UtilsV2.openTrackAsset(NewSparkTemplateManager.projectPlaceHolderImagePath());
       }catch(java.lang.Exception e0){
          KSClipLog.e(str, "constructSpark openTrackAsset fail "+e0, e0);
       }
       i1 = -1;
       if (trackAsset == null) {
          return new EditorSdk2MvCreationResultImpl(9, i1, "constructSpark openTrackAsset fail");
       }else {
          trackAsset.setClippedRange(EditorSdk2UtilsV2.createTimeRange(0, EditorSdk2UtilsV2.getCalcTimelineDuration(videoEditorP)));
          EditorSdk2V2$TrackAsset[] trackAssetAr = new EditorSdk2V2$TrackAsset[b];
          trackAssetAr[0] = trackAsset;
          videoEditorP.setTrackAssets(trackAssetAr);
          ArrayList uArrayList3 = new ArrayList();
          Iterator iterator = mutableTimel.videoTracks().iterator();
          while (iterator.hasNext()) {
             ClipMvUtils.addAudioAssetsByTrack(iterator.next(), uArrayList3, b);
          }
          Iterator iterator1 = mutableTimel.audioTracks().iterator();
          while (iterator1.hasNext()) {
             ClipMvUtils.addAudioAssetsByTrack(iterator1.next(), uArrayList3, false);
          }
          EditorSdk2V2$AudioAsset[] uAudioAssetA = new EditorSdk2V2$AudioAsset[false];
          videoEditorP.setAudioAssets(uArrayList3.toArray(uAudioAssetA));
          if (!EditorSdk2UtilsV2.FillProjectPrivateDurationAndDimension(videoEditorP)) {
             KSClipLog.e(str, "constructSpark FillProjectPrivateDurationAndDimension fail");
             return new EditorSdk2MvCreationResultImpl(9, i1, "constructSpark FillProjectPrivateDurationAndDimension fail");
          }else {
             EditorSdk2MvCreationResultImpl uEditorSdk2M1 = new EditorSdk2MvCreationResultImpl();
             uEditorSdk2M1.setProject(videoEditorP);
             uEditorSdk2M1.setMvAssets(uArrayList2);
             uEditorSdk2M1.setRenderPosList(uArrayList1);
             uEditorSdk2M1.setTemplateType(EditorSdk2MvCreationResult$TemplateType.TEMPLATE_TYPE_NEW_SPARK);
             uEditorSdk2M1.setVideoWidth(p0.getProjectWidth());
             uEditorSdk2M1.setVideoHeight(p0.getProjectHeight());
             uEditorSdk2M1.setSparkAllDetail(uAllMvReplac);
             uEditorSdk2M1.setGrade(p3);
             return uEditorSdk2M1;
          }
       }
    }
    public static EditorSdk2V2$VideoEditorProject createOriginalProject(int p0,int p1,List p2){
       String obj;
       EditorSdk2V2$TrackAsset trackAsset;
       if (PatchProxy.isSupport(ClipMvUtils.class)) {
          obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, null, ClipMvUtils.class, "51");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = " projectHeight: ";
       String str = "ClipAICut";
       if (p0 <= 0 || p1 <= 0) {
          KSClipLog.e(str, "createOriginalProject projectWidth/projectHeight LE 0, projectWidth: "+p0+obj+p1);
          return new EditorSdk2V2$VideoEditorProject();
       }else if(p2.isEmpty()){
          KSClipLog.e(str, "createOriginalProject templateAssetInfos is null");
          return new EditorSdk2V2$VideoEditorProject();
       }else {
          KSClipLog.i("ClipMVUtils", "checkOriginalProjectParams projectWidth: "+p0+obj+p1+" templateAssetInfos size: "+p2.size());
          EditorSdk2V2$TrackAsset[] trackAssetAr = new EditorSdk2V2$TrackAsset[p2.size()];
          int i = 0;
          try{
             while (true) {
                if (i < p2.size()) {
                   ClipAICut$TemplateAssetInfo templateAsse = p2.get(i);
                   if (templateAsse == null) {
                      break ;
                   }else {
                      ClipAICut$TemplateAssetInfo assetPath = templateAsse.assetPath;
                      ClipAICut$TemplateAssetInfo refId = templateAsse.refId;
                      try{
                         trackAsset = EditorSdk2UtilsV2.openTrackAsset(assetPath);
                         double d = templateAsse.clippedRange.start() + templateAsse.clippedRange.duration();
                         trackAsset.getMainClip().setSourceRange(TimeRange.timeRangeFromStartToEndTime(RationalTime.fromSeconds(templateAsse.clippedRange.start()), RationalTime.fromSeconds(d)));
                         trackAsset.getMainClip().setAeRefId(refId);
                         trackAssetAr[i] = trackAsset;
                         i = i + 1;
                      }catch(java.lang.Exception e0){
                         try{
                            return new EditorSdk2V2$VideoEditorProject();
                         }catch(java.lang.Exception e10){
                            KSClipLog.e("ClipMVUtils", "createOriginalProject create trackAsset exception "+e10);
                            return new EditorSdk2V2$VideoEditorProject();
                         }
                      }
                   }
                }else {
                   EditorSdk2V2$VideoEditorProject videoEditorP = new EditorSdk2V2$VideoEditorProject();
                   try{
                      videoEditorP.setTrackAssets(trackAssetAr);
                      EditorSdk2UtilsV2.loadProject(videoEditorP);
                      return videoEditorP;
                   }catch(java.lang.Exception e10){
                      KSClipLog.e(p1, "createOriginalProject loadProject fail "+e10);
                      return new EditorSdk2V2$VideoEditorProject();
                   }
                }
             }
             KSClipLog.e("ClipMVUtils", "createOriginalProject return null templateAssetInfo");
             return new EditorSdk2V2$VideoEditorProject();
          }catch(java.lang.Exception e10){
          }
       }
    }
    public static EditorSdk2MvCreationResult createOriginalProjectResult(int p0,int p1,List p2){
       if (PatchProxy.isSupport(ClipMvUtils.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, null, ClipMvUtils.class, "50");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 <= 0 || p1 <= 0) {
          KSClipLog.e("ClipMVUtils", "createOriginalProjectResult projectWidth/projectHeight LE 0, projectWidth: "+p0+" projectHeight: "+p1);
          return new EditorSdk2MvCreationResultImpl(9, -50001, "invalid widht/height");
       }else if(p2 == null || p2.isEmpty()){
          KSClipLog.e("ClipMVUtils", "createOriginalProjectResult templateAssetInfos is null");
          return new EditorSdk2MvCreationResultImpl(9, -50001, "templateAssetInfos is null");
       }else {
          EditorSdk2V2$VideoEditorProject videoEditorP = ClipMvUtils.createOriginalProject(p0, p1, p2);
          if (videoEditorP == null) {
             KSClipLog.e("ClipMVUtils", "createOriginalProjectResult project is null");
             return new EditorSdk2MvCreationResultImpl(9, -50001, "project is null");
          }else {
             EditorSdk2MvCreationResultImpl uEditorSdk2M = new EditorSdk2MvCreationResultImpl();
             uEditorSdk2M.setProject(videoEditorP);
             return uEditorSdk2M;
          }
       }
    }
    public static EditorSdk2MvCreationResult createProjectWithTemplate(String p0,int p1){
       ClipMvUtils uClipMvUtils = ClipMvUtils.class;
       if (PatchProxy.isSupport(uClipMvUtils)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uClipMvUtils, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return ClipMvUtils.createProjectWithTemplate(p0, p1, false, null, false);
    }
    public static EditorSdk2MvCreationResult createProjectWithTemplate(String p0,int p1,ExtraInterface p2,String p3){
       if (PatchProxy.isSupport(ClipMvUtils.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), p2, p3, null, ClipMvUtils.class, "18");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return ClipMvUtils.createProjectWithTemplate(p0, p1, p2, p3, false, null);
    }
    public static EditorSdk2MvCreationResult createProjectWithTemplate(String p0,int p1,ExtraInterface p2,String p3,boolean p4,String p5){
       ClipMvUtils uClipMvUtils = ClipMvUtils.class;
       if (PatchProxy.isSupport(uClipMvUtils)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),p2,p3,Boolean.valueOf(p4),p5};
          Object obj = PatchProxy.apply(objArray, null, uClipMvUtils, "26");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!TextUtils.isEmpty(p0) && (p1 < 0 || p2 == null)) {
          return new EditorSdk2MvCreationResultImpl(9, -50001, "invalid param");
       }else if(new NewSparkTemplateManager(new ClipMvUtils$4(p2, p3)).isNewSpark(p0)){
          KSClipLog.e("ClipSparkRecovery", "createProjectWithTemplate spark should not use this api");
          return new EditorSdk2MvCreationResultImpl(9, -1, "createProjectWithTemplate spark should not use this api");
       }else {
          File uFile = new File(p0+File.separator+"project");
          if (uFile.exists() && uFile.isFile()) {
             EditorSdk2MvCreationResultImpl uEditorSdk2M = new EditorSdk2MvCreationResultImpl();
             uEditorSdk2M.setTemplateType(EditorSdk2MvCreationResult$TemplateType.TEMPLATE_TYPE_SPARK);
             return uEditorSdk2M;
          }else {
             return ClipMvUtils.createProjectWithTemplate(p0, p1, p4, p5, 0);
          }
       }
    }
    public static EditorSdk2MvCreationResult createProjectWithTemplate(String p0,int p1,List p2){
       ArrayList obj;
       int i1;
       AE2AlbumPhotoVec uAE2AlbumPho3;
       JSONArray jSONArray2;
       AE2AlbumAssetVec uAE2AlbumAss2;
       EditorSdk2V2$TrackAsset trackAsset1;
       Minecraft$TemplateClip templateClip1;
       Minecraft$TemplateReference templateRefe1;
       AE2AlbumAssetVec uAE2AlbumAss3;
       MutableArray mutableArray4;
       ArrayList uArrayList4;
       ArrayList uArrayList5;
       KwaiMvParam kwaiMvParam1;
       AE2TimeRange visibleTime;
       String str = p0;
       int i = p1;
       List list = p2;
       String str1 = "order";
       if (PatchProxy.isSupport(ClipMvUtils.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, null, ClipMvUtils.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       String str2 = 9;
       if (!TextUtils.isEmpty(p0) && (i < 0 || p2.isEmpty())) {
          return new EditorSdk2MvCreationResultImpl(9, -50001, "invalid param");
       }else {
          obj = new ArrayList();
          MutableTimeline mutableTimel = new MutableTimeline();
          String str3 = "/config.json";
          String str4 = str+str3;
          File uFile = new File(str4);
          JSONObject jSONObject = ClipMvUtils.parseSettingsJson(str+"/settings.json");
          JSONArray jSONArray = ClipMvUtils.parseAssetsArray(str+"/assets.json");
          JSONObject jSONObject1 = new JSONObject();
          try{
             i1 = 0;
             jSONObject1 = ClipMvUtils.parseSettingsJson(str+str3);
          }catch(java.lang.Exception e0){
             jSONObject.optInt("decryptKey", i1);
          }
          int i2 = -50002;
          if (jSONObject1 == null) {
             return new EditorSdk2MvCreationResultImpl(str2, i2, "error parse config json");
          }else if(jSONObject == null){
             try{
                jSONObject = jSONObject1.getJSONObject("settings");
             }catch(org.json.JSONException e0){
                throw new EditorSdk2MvCreationException("Error settings.json is not exist!!!: "+e0.toString(), e0);
             }
          }
          if (jSONArray == null || !uFile.exists()) {
             return new EditorSdk2MvCreationResultImpl(9, -50002, "error parse assets json");
          }else {
             try{
                ArrayList uArrayList = new ArrayList();
                String str5 = jSONObject.getString("backgroundVideo");
                int i3 = jSONObject.optInt("blendMode", i1);
                jSONObject.optInt(str1, i1);
                int i4 = jSONObject.optInt("minVersion", i1);
                int intx = jSONObject.getInt(str1);
                int i5 = jSONObject.getInt("width");
                int i6 = jSONObject.getInt("height");
                MutableTimeline mutableTimel1 = mutableTimel;
                AE2Parser$Resource resource = new AE2Parser$Resource();
                resource.setAssetDir(new File(e0).getAbsolutePath());
                resource.setJsonFile(new File(str4).getAbsolutePath());
                resource.setKeyInt(i);
                AE2AlbumKit uAE2AlbumKit = new AE2AlbumKit(resource);
                ArrayList uArrayList1 = new ArrayList();
                ArrayList uArrayList2 = obj;
                int i7 = uArrayList;
                int i8 = 0;
                while (i8 < p2.size()) {
                   AE2AlbumPhoto uAE2AlbumPho = new AE2AlbumPhoto();
                   uAE2AlbumPho.setAssetTag(list.get(i8).mAssetTag);
                   uAE2AlbumPho.setCustomImagePath(list.get(i8).mCustomImagePath);
                   uAE2AlbumPho.setDuraiton(list.get(i8).mDuration);
                   uAE2AlbumPho.setTextMarker(list.get(i8).mTextMarker);
                   uAE2AlbumPho.setGroupId(list.get(i8).mGroupId);
                   uAE2AlbumPho.setPaths(new AE2StringVec(list.get(i8).mPaths));
                   uArrayList1.add(uAE2AlbumPho);
                   i8 = i8 + 1;
                   jSONObject = jSONObject;
                   jSONArray = jSONArray;
                }
                JSONObject jSONObject2 = jSONObject;
                JSONArray jSONArray1 = jSONArray;
                AE2AlbumPhotoVec uAE2AlbumPho1 = new AE2AlbumPhotoVec(uArrayList1);
                if (uAE2AlbumPho1.isEmpty()) {
                   return new EditorSdk2MvCreationResultImpl(9, -50002, "empty album photo array");
                }else {
                   uAE2AlbumKit.setAlbumPhotos(uAE2AlbumPho1);
                   AE2Project uAE2Project = uAE2AlbumKit.proj();
                   AE2AlbumAssetVec uAE2AlbumAss = uAE2AlbumKit.assets();
                   Minecraft$TemplateClip templateClip = new Minecraft$TemplateClip();
                   templateClip.setTemplateType(6);
                   Minecraft$TemplateReference templateRefe = new Minecraft$TemplateReference();
                   templateRefe.setAssetsDirectory(e0);
                   templateRefe.setEncryptedMethod(i);
                   AE2AlbumKit uAE2AlbumKit1 = uAE2AlbumKit;
                   HashMap hashMap = new HashMap();
                   ArrayList uArrayList3 = new ArrayList();
                   MutableArray mutableArray = templateClip.irreplaceableClips().mutableCopy();
                   AE2AlbumPhotoVec uAE2AlbumPho2 = uAE2AlbumPho1;
                   MutableArray mutableArray1 = templateClip.replaceableClips().mutableCopy();
                   double d = uAE2Project.outFrame() / uAE2Project.frameRate();
                   i8 = uAE2AlbumAss.size();
                   if (i8 <= 0) {
                      return new EditorSdk2MvCreationResultImpl(9, -50002, "empty asset array");
                   }else if(!d){
                      d = ClipMvUtils.getMvDurationIfNeeded(jSONObject1);
                   }
                   MutableArray mutableArray2 = mutableArray1;
                   int i9 = i8;
                   double d1 = d;
                   AE2AlbumAssetVec uAE2AlbumAss1 = uAE2AlbumAss;
                   String str6 = e0+File.separator+str5;
                   ClipMvUtils.checkFileExist(str6);
                   double d2 = d1 / 0x408f400000000000;
                   double d3 = d1;
                   templateClip.setSourceRange(EditorSdk2UtilsV2.createMCTimeRange(EditorSdk2UtilsV2.createRationalTime(0), EditorSdk2UtilsV2.createRationalTime(d2)));
                   Minecraft$InputFileOptions inputFileOpt = null;
                   Minecraft$KSAVClip kSAVClip = EditorSdk2UtilsV2.createAduioVideoClip(str6, inputFileOpt, inputFileOpt);
                   if (!TextUtils.isEmpty(str5) && EditorSdk2UtilsV2.isSingleImagePath(str5)) {
                      kSAVClip.setSourceRange(EditorSdk2UtilsV2.createMCTimeRange(EditorSdk2UtilsV2.createRationalTime(0), EditorSdk2UtilsV2.createRationalTime(d2)));
                   }
                   kSAVClip.setAeRefId("backgroudVideoV2");
                   kSAVClip.setBlendingMode(i3);
                   hashMap.put("backgroudVideoV2", Integer.valueOf(intx));
                   templateRefe.setRenderOrderMap(new ImmutableMap(hashMap));
                   mutableArray.add(kSAVClip);
                   EditorSdk2V2$TrackAsset trackAsset = new EditorSdk2V2$TrackAsset(kSAVClip);
                   KwaiMvParam kwaiMvParam = new KwaiMvParam();
                   kwaiMvParam.templateDirectory = e0;
                   kwaiMvParam.configJsonPath = str4;
                   kwaiMvParam.blendMode = i3;
                   kwaiMvParam.renderOrder = intx;
                   kwaiMvParam.minVersion = i4;
                   double d4 = d3;
                   kwaiMvParam.encyptedMethod = p1;
                   try{
                      JSONObject jSONObject3 = jSONObject2;
                      kwaiMvParam.bgVideo = ClipMvUtils.parseBackgroundVideo(jSONObject3, e0, d4);
                      kwaiMvParam.mvPhotoInfos = new ArrayList();
                      kwaiMvParam.allDetails = new AllMvReplaceableAreaDetail();
                      kwaiMvParam.allDetails.details = new ArrayList();
                      int i10 = 0;
                      while (i10 < i9) {
                         if (uAE2AlbumKit1.assetsSize() != i9) {
                            EditorSdkLogger.e("ClipMVUtils", "AlbumKit 影集资源数目异常，重新加载。预期影集资源数 = "+i9+", 实际影集资源数 = "+uAE2AlbumKit1.assetsSize());
                            AE2AlbumKit uAE2AlbumKit2 = new AE2AlbumKit(resource);
                            uAE2AlbumPho3 = uAE2AlbumPho2;
                            uAE2AlbumKit2.setAlbumPhotos(uAE2AlbumPho3);
                            uAE2AlbumKit1 = uAE2AlbumKit2;
                         }else {
                            uAE2AlbumPho3 = uAE2AlbumPho2;
                         }
                         Minecraft$InputFileOptions inputFileOpt1 = inputFileOpt;
                         int i11 = 0;
                         while (true) {
                            if (i11 < jSONArray1.length()) {
                               jSONArray2 = jSONArray1;
                               inputFileOpt1 = jSONArray2.getJSONObject(i11);
                               uAE2AlbumAss2 = uAE2AlbumAss1;
                               if ((uAE2AlbumAss2.get(i10).getOriginRefId()).equals(inputFileOpt1.getString("id"))) {
                               label_0335 :
                                  str2 = uAE2AlbumAss2.get(i10).getGenerateRefId();
                                  i11 = uAE2AlbumAss2.get(i10).getGroupId();
                                  str5 = uAE2AlbumAss2.get(i10).getPath();
                                  float f = uAE2AlbumAss2.get(i10).getRect().x();
                                  AE2Parser$Resource resource1 = resource;
                                  float f1 = uAE2AlbumAss2.get(i10).getRect().y();
                                  int i12 = i9;
                                  MutableArray mutableArray3 = mutableArray;
                                  double timeStamp = uAE2AlbumAss2.get(i10).getTimeStamp();
                                  AE2AlbumPhotoVec uAE2AlbumPho4 = uAE2AlbumPho3;
                                  String assetTag = uAE2AlbumAss2.get(i10).getAssetTag();
                                  try{
                                     JSONArray jSONArray3 = jSONArray2;
                                     if (!inputFileOpt1.has("visibleTime")) {
                                        i = i10;
                                        trackAsset1 = trackAsset;
                                        templateClip1 = templateClip;
                                        templateRefe1 = templateRefe;
                                        uAE2AlbumAss3 = uAE2AlbumAss2;
                                        mutableArray4 = mutableArray2;
                                        uArrayList4 = i7;
                                        uArrayList5 = uArrayList2;
                                        kwaiMvParam1 = kwaiMvParam;
                                     }else {
                                        ArrayList uArrayList6 = new ArrayList();
                                        visibleTime = uAE2AlbumAss2.get(i10).getVisibleTime();
                                        uAE2AlbumAss3 = uAE2AlbumAss2;
                                        EditorSdk2$TimeRange timeRange = new EditorSdk2$TimeRange();
                                        templateClip1 = templateClip;
                                        templateRefe1 = templateRefe;
                                        timeRange.setStart(visibleTime.getStartTime());
                                        timeRange.setDuration(visibleTime.getDuration());
                                        uArrayList6.add(timeRange);
                                        Minecraft$KSAVClip kSAVClip1 = EditorSdk2UtilsV2.createAduioVideoClip(str5, null, null);
                                        kSAVClip1.setAeRefId(str2);
                                        kSAVClip1.setMute(true);
                                        kSAVClip1.setRenderType(2);
                                        trackAsset1 = trackAsset;
                                        kSAVClip1.setSourceRange(EditorSdk2UtilsV2.createMCTimeRange(EditorSdk2UtilsV2.createRationalTime(0), EditorSdk2UtilsV2.createRationalTime(timeRange.duration())));
                                        Minecraft$Range range = new Minecraft$Range();
                                        int i14 = i10;
                                        kwaiMvParam1 = kwaiMvParam;
                                        range.setStart(visibleTime.getStartTime());
                                        range.setDuration(visibleTime.getDuration());
                                        range.setId((long)Integer.parseInt(kSAVClip1.clipId()));
                                        ArrayList uArrayList7 = uArrayList3;
                                        uArrayList7.add(range);
                                        Minecraft$PropertyKeyFrame propertyKeyF = new Minecraft$PropertyKeyFrame();
                                        Minecraft$InputFileOptions inputFileOpt2 = inputFileOpt1;
                                        ArrayList uArrayList8 = uArrayList6;
                                        propertyKeyF.setDuration(timeRange.duration());
                                        propertyKeyF.setAssetTransform(EditorSdk2Utils.createIdentityTransform());
                                        Minecraft$PropertyKeyFrame[] propertyKeyF1 = new Minecraft$PropertyKeyFrame[]{propertyKeyF};
                                        kSAVClip1.setPropertyKeyFrames(propertyKeyF1);
                                        kSAVClip1.setCropOptions(new Minecraft$CropOptions());
                                        int i15 = (int)f;
                                        kSAVClip1.cropOptions().setWidth(i15);
                                        intx = (int)f1;
                                        kSAVClip1.cropOptions().setHeight(intx);
                                        uArrayList3 = uArrayList7;
                                        kSAVClip1.cropOptions().setTransform(EditorSdk2Utils.createIdentityTransform());
                                        mutableArray4 = mutableArray2;
                                        mutableArray4.add(kSAVClip1);
                                        EditorSdk2MvAssetImpl uEditorSdk2M = new EditorSdk2MvAssetImpl();
                                        uEditorSdk2M.setRefId(str2);
                                        uEditorSdk2M.setGroupId(String.valueOf(i11));
                                        uEditorSdk2M.setAssetPath(str5);
                                        uEditorSdk2M.setAssetTag(assetTag);
                                        uEditorSdk2M.setWidth(i15);
                                        uEditorSdk2M.setHeight(intx);
                                        uEditorSdk2M.setTimeStamp(timeStamp);
                                        uEditorSdk2M.setVisibleTimeRange(timeRange);
                                        uEditorSdk2M.setVisibleTimeRanges(uArrayList8);
                                        uEditorSdk2M.setIsReplaceable(true);
                                        uEditorSdk2M.setPicture(inputFileOpt2.getString("p"));
                                        JSONObject jSONObject4 = inputFileOpt2.optJSONObject("extraRequirement");
                                        if (jSONObject4 != null) {
                                           uEditorSdk2M.setRequireFace(jSONObject4.optBoolean("requireFace", false));
                                           uEditorSdk2M.setRequireClipBody(jSONObject4.optBoolean("requireClipBody", false));
                                           uEditorSdk2M.setRequireClipFace(jSONObject4.optBoolean("requireClipFace", false));
                                           uEditorSdk2M.setRequireClipHead(jSONObject4.optBoolean("requireClipHead", false));
                                           uEditorSdk2M.setRequireFacialReco(jSONObject4.optBoolean("requireFacialReco", false));
                                           uEditorSdk2M.setRequireFaceBlend(jSONObject4.optBoolean("requireFaceBlend", false));
                                           uEditorSdk2M.setFaceBlendPath(jSONObject4.optString("faceBlendPath"));
                                           uEditorSdk2M.setRequireFaceMatting(jSONObject4.optBoolean("requireFaceMatting", false));
                                           uEditorSdk2M.setRequireHeadMatting(jSONObject4.optBoolean("requireHeadMatting", false));
                                           uEditorSdk2M.setRequireBodyMatting(jSONObject4.optBoolean("requireBodyMatting", false));
                                           uEditorSdk2M.setSelectFrameTime(jSONObject4.optLong("selectFrameTime", -1));
                                           uEditorSdk2M.setClipBodyType(jSONObject4.optInt("clipBodyType", 0));
                                           JSONObject jSONObject5 = jSONObject4.optJSONObject("requireServerProcessing");
                                           if (jSONObject5 != null) {
                                              uEditorSdk2M.setServiceType(jSONObject5.optString("serviceType"));
                                              uEditorSdk2M.setReturnMediaType(jSONObject5.optString("returnMediaType"));
                                              uEditorSdk2M.setServiceAction(jSONObject5.optString("serviceAction"));
                                           }
                                           uEditorSdk2M.setRequireOriginAudio(jSONObject4.optBoolean("requireOriginAudio", false));
                                        }
                                        uArrayList5 = uArrayList2;
                                        uArrayList5.add(uEditorSdk2M);
                                        MvPhotoInfo mvPhotoInfo = new MvPhotoInfo();
                                        kwaiMvParam1.mvPhotoInfos.add(mvPhotoInfo);
                                        timeStamp = timeStamp * 0x408f400000000000;
                                        mvPhotoInfo.time = (int)timeStamp;
                                        i = i14;
                                        uArrayList4 = i7;
                                        uArrayList4.add(Integer.valueOf(kwaiMvParam1.mvPhotoInfos.get(i).time));
                                        MvReplaceableAreaDetail mvReplaceabl = new MvReplaceableAreaDetail();
                                        mvReplaceabl.info = mvPhotoInfo;
                                        kwaiMvParam1.allDetails.details.add(mvReplaceabl);
                                        mvReplaceabl.replaceableAreaDetail = new ArrayList();
                                        ReplaceableAreaInfo replaceableA = new ReplaceableAreaInfo();
                                        mvReplaceabl.replaceableAreaDetail.add(replaceableA);
                                        replaceableA.refId = str2;
                                        replaceableA.width = f;
                                        replaceableA.height = f1;
                                        ArrayList uArrayList9 = new ArrayList();
                                        mvPhotoInfo.areas = uArrayList9;
                                        uArrayList9.add(replaceableA);
                                     }
                                     int i13 = i + 1;
                                     mutableArray2 = mutableArray4;
                                     i10 = i13;
                                     uArrayList2 = uArrayList5;
                                     i7 = uArrayList4;
                                     kwaiMvParam = kwaiMvParam1;
                                     resource = resource1;
                                     mutableArray = mutableArray3;
                                     i9 = i12;
                                     uAE2AlbumPho2 = uAE2AlbumPho4;
                                     templateClip = templateClip1;
                                     templateRefe = templateRefe1;
                                     trackAsset = trackAsset1;
                                     f = 0;
                                     jSONArray1 = jSONArray3;
                                     uAE2AlbumAss1 = uAE2AlbumAss3;
                                  }catch(org.json.JSONException e0){
                                     throw new EditorSdk2MvCreationException("Error parsing assets.json: "+e0.toString(), e0);
                                  }
                               }else {
                                  i11 = i11 + 1;
                                  jSONArray1 = jSONArray2;
                                  uAE2AlbumAss1 = uAE2AlbumAss2;
                               }
                            }else {
                               uAE2AlbumAss2 = uAE2AlbumAss1;
                               jSONArray2 = jSONArray1;
                               goto label_0335 ;
                            }
                         }
                      }
                      Minecraft$TemplateReference templateRefe2 = templateRefe;
                      templateRefe2.setVisibleTimes(new ImmutableArray(uArrayList3, Minecraft$Range.class));
                      Minecraft$TemplateClip templateClip2 = templateClip;
                      templateClip2.setMediaReference(templateRefe2);
                      templateClip2.setReplaceableClips(mutableArray2.immutableCopy());
                      templateClip2.setIrreplaceableClips(mutableArray.immutableCopy());
                      MutableTrack mutableTrack = new MutableTrack();
                      mutableTrack.appendClip(templateClip2, null);
                      MutableTimeline mutableTimel2 = mutableTimel1;
                      mutableTimel2.appendTrack(mutableTrack, null);
                      EditorSdk2V2$VideoEditorProject videoEditorP = new EditorSdk2V2$VideoEditorProject(mutableTimel2);
                      EditorSdk2MvCreationResultImpl uEditorSdk2M1 = new EditorSdk2MvCreationResultImpl();
                      EditorSdk2UtilsV2.loadProject(videoEditorP);
                      EditorSdk2V2$TrackAsset[] trackAssetAr = new EditorSdk2V2$TrackAsset[]{trackAsset};
                      videoEditorP.setTrackAssets(trackAssetAr);
                      uEditorSdk2M1.setProject(videoEditorP);
                      uEditorSdk2M1.setRenderPosList(i7);
                      uEditorSdk2M1.setVideoHeight(i6);
                      uEditorSdk2M1.setVideoWidth(i5);
                      uEditorSdk2M1.setMvAssets(uArrayList2);
                      uEditorSdk2M1.setTemplateType(EditorSdk2MvCreationResult$TemplateType.TEMPLATE_TYPE_MV);
                      uEditorSdk2M1.setMVParam(kwaiMvParam);
                      return uEditorSdk2M1;
                   }catch(org.json.JSONException e0){
                      throw new EditorSdk2MvCreationException("Error parsing BackgroundVideo: "+e0.toString(), e0);
                   }
                }
             }catch(org.json.JSONException e0){
                throw new EditorSdk2MvCreationException("Error parsing settings.json: "+e0.toString(), e0);
             }
          }
       }
    }
    public static EditorSdk2MvCreationResult createProjectWithTemplate(String p0,int p1,boolean p2,String p3,int p4){
       String obj1;
       JSONObject jSONObject2;
       JSONException jSONExceptio;
       String str8;
       JSONObject jSONObject3;
       JSONArray jSONArray1;
       JSONObject jSONObject4;
       String str9;
       String str10;
       int i9;
       int i10;
       String str14;
       JSONArray jSONArray5;
       double d1;
       String str15;
       KwaiMvParam kwaiMvParam1;
       String str18;
       TextFilter$TextEffectConfig textEffectCo;
       int i13;
       ArrayList uArrayList5;
       ArrayList uArrayList6;
       String str19;
       Minecraft$TemplateReference templateRefe3;
       MutableArray mutableArray3;
       ArrayList uArrayList7;
       String str22;
       ArrayList uArrayList8;
       Minecraft$TemplateReference templateRefe5;
       EditorSdk2MvCreationResultImpl uEditorSdk2M2;
       JSONArray jSONArray7;
       int i14;
       JSONObject jSONObject5;
       int i15;
       double d7;
       JSONArray jSONArray8;
       double d8;
       String str23;
       String str24;
       JSONArray jSONArray9;
       String str25;
       ArrayList uArrayList9;
       Minecraft$Range range;
       String str26;
       int i16;
       EditorSdk2MvAssetImpl uEditorSdk2M3;
       JSONObject jSONObject6;
       int i17;
       String str27;
       JSONObject jSONObject7;
       Minecraft$WesterosFaceMagicParam westerosFace;
       EditorSdk2$TimeRange timeRange;
       JSONArray jSONArray10;
       Minecraft$TimeMapKeyFrame[] timeMapKeyFr;
       int i18;
       String str28;
       JSONArray jSONArray11;
       JSONObject jSONObject9;
       double d9;
       JSONArray jSONArray12;
       EditorSdk2MvAssetImpl uEditorSdk2M4;
       String str29;
       String str30;
       JSONArray jSONArray13;
       Minecraft$TimeMapParams timeMapParam;
       EditorSdk2MvAssetImpl uEditorSdk2M5;
       MutableArray mutableArray4;
       ArrayList uArrayList10;
       JSONObject jSONObject10;
       int i19;
       JSONObject jSONObject11;
       int i20;
       ReplaceableAreaInfo rect;
       object oobject = p0;
       int i = p1;
       object oobject1 = p3;
       ClipMvUtils uClipMvUtils = ClipMvUtils.class;
       String str = "visibleTime";
       String str1 = "restoreAlpha";
       int i1 = 3;
       int i2 = 2;
       String obj = null;
       int i3 = 1;
       int i4 = 0;
       if (PatchProxy.isSupport(uClipMvUtils)) {
          Object[] objArray = new Object[]{oobject,Integer.valueOf(p1),Boolean.valueOf(p2),oobject1,Integer.valueOf(p4)};
          obj1 = PatchProxy.apply(objArray, obj, uClipMvUtils, "8");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       String str2 = " encryptedMethod: ";
       String str3 = "ClipMVUtils";
       if (TextUtils.isEmpty(p0) || i < 0) {
          KSClipLog.e(str3, "createProjectWithTemplate invalid params, directory: "+p0+str2+i);
          return new EditorSdk2MvCreationResultImpl(9, -50001, "invalid params");
       }else {
          MutableTimeline mutableTimel = new MutableTimeline();
          Minecraft$TemplateClip templateClip = new Minecraft$TemplateClip();
          templateClip.setTemplateType(i4);
          Minecraft$TemplateReference templateRefe = new Minecraft$TemplateReference();
          templateRefe.setAssetsDirectory(oobject);
          HashMap hashMap = new HashMap();
          MutableTrack mutableTrack = new MutableTrack();
          mutableTrack.appendClip(templateClip, obj);
          mutableTimel.appendTrack(mutableTrack, obj);
          EditorSdk2V2$VideoEditorProject videoEditorP = new EditorSdk2V2$VideoEditorProject(mutableTimel);
          ArrayList uArrayList = new ArrayList();
          MutableArray mutableArray = templateClip.replaceableClips().mutableCopy();
          obj = "/config.json";
          obj1 = oobject+obj;
          File uFile = new File(obj1);
          ArrayList uArrayList1 = new ArrayList();
          String str4 = str;
          JSONObject jSONObject = ClipMvUtils.parseSettingsJson(oobject+"/settings.json");
          MutableArray mutableArray1 = templateClip.irreplaceableClips().mutableCopy();
          JSONArray jSONArray = ClipMvUtils.parseAssetsArray(oobject+"/assets.json");
          JSONObject jSONObject1 = new JSONObject();
          try{
             jSONObject2 = jSONObject1;
             jSONObject1 = ClipMvUtils.parseSettingsJson(oobject+obj);
          }catch(java.lang.Exception e0){
             jSONObject.optInt("decryptKey", 0);
             jSONObject1 = jSONObject2;
          }
          if (jSONObject == null) {
             try{
                jSONObject = jSONObject1.getJSONObject("settings");
             }catch(org.json.JSONException e0){
                jSONExceptio = e0;
                throw new EditorSdk2MvCreationException("Error settings.json is not exist!!!: "+jSONExceptio.toString(), jSONExceptio);
             }
          }
          ArrayList uArrayList2 = new ArrayList();
          HashMap hashMap1 = hashMap;
          String str5 = ClipMvUtils.musicConfigPath(p0);
          EditorSdk2V2$VideoEditorProject videoEditorP1 = videoEditorP;
          String str6 = "replaceable";
          Minecraft$TemplateClip templateClip1 = templateClip;
          String str7 = "id";
          if (!ClipMvUtils.isEmpty(str5)) {
             str8 = obj1;
             jSONObject3 = jSONObject1;
             jSONArray1 = ClipMvUtils.parseSettingsJson(str5+"/assets.json").optJSONArray("assets");
             i3 = 0;
             while (i3 < jSONArray1.length()) {
                try{
                   jSONObject4 = jSONArray1.getJSONObject(i3);
                   JSONArray jSONArray2 = jSONArray1;
                   if (jSONObject4.optBoolean(str6, true)) {
                      MvMusicAsset mvMusicAsset = new MvMusicAsset();
                      str9 = str6;
                      mvMusicAsset.width = jSONObject4.getInt("width");
                      mvMusicAsset.height = jSONObject4.getInt("height");
                      mvMusicAsset.assetID = jSONObject4.getString(str7);
                      str10 = str5;
                      mvMusicAsset.path = str5+File.separator+jSONObject4.getString("path");
                      uArrayList2.add(mvMusicAsset);
                   }else {
                      str9 = str6;
                      str10 = str5;
                   }
                   i3 = i3 + 1;
                   jSONArray1 = jSONArray2;
                   str6 = str9;
                   str5 = str10;
                }catch(org.json.JSONException e0){
                   jSONExceptio = e0;
                   throw new EditorSdk2MvCreationException("Error parsing music->assets.json: "+jSONExceptio.toString(), jSONExceptio);
                }
             }
             str9 = str6;
          }else {
             str9 = str6;
             str8 = obj1;
             jSONObject3 = jSONObject1;
          }
          str10 = str5;
          if (jSONObject != null && (jSONArray == null || !uFile.exists())) {
             KSClipLog.e(str3, "createProjectWithTemplate settingObject or assetArray or file is null");
             return new EditorSdk2MvCreationResultImpl(9, -50002, "error parse json");
          }else {
             try{
                ArrayList uArrayList3 = new ArrayList();
                String str11 = jSONObject.getString("backgroundVideo");
                int i5 = jSONObject.optInt("blendMode", 0);
                JSONArray jSONArray3 = jSONObject.getJSONArray("editPhotos");
                int i6 = jSONObject.optInt("order", 0);
                ArrayList uArrayList4 = uArrayList2;
                int i7 = jSONObject.optInt("minVersion", 0);
                int i8 = uArrayList3;
                int b = jSONObject.optBoolean(str1, true);
                i3 = jSONObject.getInt("width");
                String str12 = str1;
                boolean intx = jSONObject.getInt("height");
                String str13 = str7;
                i = jSONObject.optInt("decryptKey", i);
                JSONArray jSONArray4 = jSONArray;
                KSClipLog.i(str3, "createProjectWithTemplate backgroundVideo Info -- bgVideo: "+str11+" bgAudio: "+null+" photoPos: "+jSONArray3+" renderOrder: "+i6+" restoreAlpha: "+b+" width: "+i3+" height: "+intx+str2+i);
                try{
                   templateRefe.setEncryptedMethod(i);
                   str2 = jSONObject.getString("backgroundAudio");
                   str7 = p0;
                   i9 = intx;
                   i10 = i3;
                }catch(org.json.JSONException e0){
                   JSONException jSONExceptio1 = e0;
                   str7 = p0;
                   File[] uFileArray = new File(str7).listFiles();
                   i10 = i3;
                   i3 = uFileArray.length;
                   i9 = intx;
                   intx = 0;
                label_02a4 :
                   if (intx < i3) {
                      object oobject2 = uFileArray[intx];
                      File[] uFileArray1 = uFileArray;
                      int i11 = i3;
                      if ((oobject2.getName()).contains(".mp3")) {
                         str1 = oobject2.getName();
                      }else {
                         intx = intx + 1;
                         uFileArray = uFileArray1;
                         i3 = i11;
                         goto label_02a4 ;
                      }
                   }else {
                      intx = false;
                   }
                   jSONExceptio1.printStackTrace();
                   EditorSdkLogger.w(str3, "Settings.json do not has backgroundAudio. path: "+str7);
                   str2 = str1;
                }
                if (TextUtils.isEmpty(str11) || jSONArray3 == null) {
                   KSClipLog.e(str3, "createProjectWithTemplate invalid bgVideo or photoPos, bgVideo: "+str11+" photoPos: "+jSONArray3);
                   return new EditorSdk2MvCreationResultImpl(9, -50002, "invalid bgVideo/photoPos");
                }else {
                   str1 = jSONObject.optString("lyric");
                   if (!TextUtils.isEmpty(str1)) {
                      str1 = str7+File.separator+str1;
                      if (!new File(str1).exists()) {
                         KSClipLog.e(str3, "lyricPath:"+str1+" not exist,lyric will be ignore");
                      }else {
                         i1 = jSONObject.optInt("lyricEffectType");
                         if (i1 > (CGETextEffect$EffectType.values().length - 1)) {
                            KSClipLog.e(str3, "lyricEffect:"+i1+" not support now");
                         }else {
                            str14 = ClipKitUtils.parseLyricsConfigFromFile(str1, null, CGETextEffect$EffectType.values()[i1]);
                            try{
                            label_0365 :
                               jSONArray5 = jSONArray3;
                               double d = 0;
                               d1 = jSONObject.optDouble("duration", d);
                               if (!d1 - d) {
                                  d1 = ClipMvUtils.getMvDurationIfNeeded(jSONObject3);
                               }
                               str15 = str8;
                            }catch(java.lang.Exception e0){
                               str15 = str8;
                               KSClipLog.e(str3, "getMvDurationIfNeeded failed"+str15);
                            }
                            Minecraft$TemplateReference templateRefe1 = templateRefe;
                            double d2 = d1;
                            jSONObject3 = jSONObject;
                            KSClipLog.i(str3, "createProjectWithTemplate mvDuration: "+d2);
                            str1 = File.separator;
                            str = str7+str1+str11;
                            ClipMvUtils.checkFileExist(str);
                            String str16 = str3;
                            d1 = 0;
                            int i12 = i7;
                            String str17 = str15;
                            double d3 = d2 / 0x408f400000000000;
                            double d4 = d2;
                            templateClip1.setSourceRange(EditorSdk2UtilsV2.createMCTimeRange(EditorSdk2UtilsV2.createRationalTime(d1), EditorSdk2UtilsV2.createRationalTime(d3)));
                            EditorSdk2V2$TrackAsset trackAsset = EditorSdk2UtilsV2.openTrackAsset(str);
                            trackAsset.setIsBackgroundVideo(true);
                            if (!TextUtils.isEmpty(str11)) {
                               trackAsset.setClippedRange(EditorSdk2UtilsV2.createTimeRange(d1, d3));
                            }
                            if (b) {
                               b = 1;
                               trackAsset.setAlphaInfo(b);
                            }else {
                               b = 1;
                            }
                            EditorSdk2V2$TrackAsset[] trackAssetAr = new EditorSdk2V2$TrackAsset[b];
                            trackAssetAr[0] = trackAsset;
                            videoEditorP = videoEditorP1;
                            videoEditorP.setTrackAssets(trackAssetAr);
                            Minecraft$KSAVClip mainClip = trackAsset.getMainClip();
                            mainClip.setAeRefId("backgroudVideoV2");
                            mainClip.setBlendingMode(i5);
                            hashMap = hashMap1;
                            hashMap.put("backgroudVideoV2", Integer.valueOf(i6));
                            MutableArray mutableArray2 = mutableArray1;
                            mutableArray2.add(mainClip);
                            double d5 = 0x3ff0000000000000;
                            if (!TextUtils.isEmpty(str2)) {
                               str11 = str7+str1+str2;
                               ClipMvUtils.checkFileExist(str11);
                               EditorSdk2V2$AudioAsset uAudioAsset = EditorSdk2UtilsV2.openAudioAsset(str11);
                               uAudioAsset.setisKuaiShanBgAudio(true);
                               uAudioAsset.setVolume(d5);
                               EditorSdk2V2$AudioAsset[] uAudioAssetA = new EditorSdk2V2$AudioAsset[true];
                               intx = 0;
                               uAudioAssetA[intx] = uAudioAsset;
                               videoEditorP.setAudioAssets(uAudioAssetA);
                               trackAsset.setVolume(0);
                               if (str14 != null) {
                                  uAudioAsset.setisKuaiShanBgAudio(intx);
                               }
                            }
                            KwaiMvParam kwaiMvParam = new KwaiMvParam();
                            kwaiMvParam.templateDirectory = str7;
                            kwaiMvParam.configJsonPath = str17;
                            kwaiMvParam.blendMode = i5;
                            kwaiMvParam.encyptedMethod = i;
                            kwaiMvParam.renderOrder = i6;
                            kwaiMvParam.minVersion = i12;
                            jSONObject = jSONObject3;
                            try{
                               double d6 = d4;
                               ClipkitSdk$ClipKitBackgroundVideo uClipKitBack = ClipMvUtils.parseBackgroundVideo(jSONObject, str7, d6);
                               if (uClipKitBack == null) {
                                  return new EditorSdk2MvCreationResultImpl(9, -50003, "create background video failed");
                               }else {
                                  kwaiMvParam.bgVideo = uClipKitBack;
                                  try{
                                     jSONObject4 = jSONObject.optJSONObject("subVideo");
                                     if (jSONObject4 != null) {
                                        uClipKitBack = ClipMvUtils.parseBackgroundVideo(jSONObject4, str7, 0xbff0000000000000);
                                        if (uClipKitBack == null) {
                                           return new EditorSdk2MvCreationResultImpl(9, -50003, "create sub background video failed");
                                        }else {
                                           kwaiMvParam.subBgVideo = uClipKitBack;
                                        }
                                     }
                                     if (ClipMvUtils.getAnimatedSubAssetsCount(jSONArray4) <= 0) {
                                        return new EditorSdk2MvCreationResultImpl(9, -50002, "empty asset array");
                                     }else {
                                        KwaiMvParam subBgVideo = kwaiMvParam.subBgVideo;
                                        if (subBgVideo != null) {
                                           Minecraft$KSAVClip kSAVClip = EditorSdk2UtilsV2.createAduioVideoClip(subBgVideo.fullPath, null, null);
                                           kSAVClip.setAeRefId("subBackgroundVideoV2");
                                           kSAVClip.setBlendingMode(kwaiMvParam.subBgVideo.blendMode);
                                           kSAVClip.setRenderType(2);
                                           hashMap.put("subBackgroundVideoV2", Integer.valueOf(kwaiMvParam.subBgVideo.renderOrder));
                                           kSAVClip.setSourceRange(EditorSdk2UtilsV2.createMCTimeRange(EditorSdk2UtilsV2.createRationalTime(0), EditorSdk2UtilsV2.createRationalTime(kwaiMvParam.subBgVideo.duration)));
                                           if (kwaiMvParam.subBgVideo.restoreAlpha != null) {
                                              kSAVClip.mutableMediaReference().setAlphaInfo(1);
                                           }
                                           ClipMvUtils.addAVClipKeyFrame(kSAVClip, kwaiMvParam.subBgVideo.duration, EditorSdk2Utils.createIdentityTransform());
                                           mutableArray2.add(kSAVClip);
                                        }
                                        Minecraft$TemplateReference templateRefe2 = templateRefe1;
                                        templateRefe2.setRenderOrderMap(new ImmutableMap(hashMap));
                                        i3 = 0;
                                        while (true) {
                                           if (i3 < jSONArray4.length()) {
                                              try{
                                                 EditorSdk2MvAssetImpl uEditorSdk2M = new EditorSdk2MvAssetImpl();
                                                 jSONArray1 = jSONArray4;
                                                 jSONObject = jSONArray1.getJSONObject(i3);
                                                 str1 = str4;
                                                 if (!jSONObject.has(str1)) {
                                                    videoEditorP1 = videoEditorP;
                                                    kwaiMvParam1 = kwaiMvParam;
                                                    jSONArray4 = jSONArray1;
                                                    str18 = str1;
                                                    textEffectCo = str14;
                                                    i13 = i3;
                                                    uArrayList5 = uArrayList;
                                                    uArrayList6 = uArrayList1;
                                                    str19 = str9;
                                                    str6 = str12;
                                                    obj1 = str13;
                                                    str7 = str16;
                                                    templateRefe3 = templateRefe2;
                                                    mutableArray3 = mutableArray2;
                                                    mutableArray2 = null;
                                                 }else {
                                                    try{
                                                       uArrayList7 = new ArrayList();
                                                       str5 = "asset.json ";
                                                       str3 = "{}";
                                                       String str20 = "";
                                                       if (!p2 || !ClipMvUtils.isTextAsset(jSONObject)) {
                                                          EditorSdk2MvAssetImpl uEditorSdk2M1 = uEditorSdk2M;
                                                          videoEditorP1 = videoEditorP;
                                                          kwaiMvParam1 = kwaiMvParam;
                                                          jSONArray4 = jSONArray1;
                                                          textEffectCo = str14;
                                                          str6 = str13;
                                                          str19 = str16;
                                                          Minecraft$TemplateReference templateRefe4 = templateRefe2;
                                                          StringBuilder str21 = str7+File.separator+jSONObject.getString("p");
                                                          String[] stringArray = new String[]{"png","PNG","jpg","JPG","jpeg","JPEG"};
                                                          uFile = new File(str21);
                                                          if (uFile.exists() && uFile.isFile()) {
                                                             str22 = str19;
                                                             uArrayList8 = uArrayList7;
                                                             templateRefe5 = templateRefe4;
                                                             mutableArray3 = mutableArray2;
                                                             uEditorSdk2M2 = 1;
                                                             obj = str21;
                                                          }else {
                                                             i15 = str21.lastIndexOf(".");
                                                             if (i15 > 0) {
                                                                i15 = i15 + 1;
                                                                mutableArray3 = mutableArray2;
                                                                obj = str21.substring(i15);
                                                                uArrayList8 = uArrayList7;
                                                                templateRefe5 = templateRefe4;
                                                                object oobject3 = 6;
                                                                i1 = 0;
                                                                while (true) {
                                                                   if (i1 < oobject3) {
                                                                      if (obj.equals(stringArray[i1])) {
                                                                         obj = str21;
                                                                         int b2 = 0;
                                                                         while (true) {
                                                                            if (b2 < 6) {
                                                                               str22 = str19;
                                                                               String[] stringArray1 = stringArray;
                                                                               obj = str21.substring(0, i15)+stringArray[b2];
                                                                               File uFile1 = new File(obj);
                                                                               if (uFile1.exists() && uFile1.isFile()) {
                                                                                  uEditorSdk2M2 = 1;
                                                                               }else {
                                                                                  b2 = b2 + 1;
                                                                                  stringArray = stringArray1;
                                                                                  str19 = str22;
                                                                               }
                                                                            }else {
                                                                               str22 = str19;
                                                                            label_0708 :
                                                                               uEditorSdk2M2 = null;
                                                                            }
                                                                         }
                                                                      }else {
                                                                         i1 = i1 + 1;
                                                                         str19 = str19;
                                                                         oobject3 = 6;
                                                                      }
                                                                   }else {
                                                                      str22 = str19;
                                                                   }
                                                                }
                                                             }else {
                                                                str22 = str19;
                                                                uArrayList8 = uArrayList7;
                                                                templateRefe5 = templateRefe4;
                                                                mutableArray3 = mutableArray2;
                                                             }
                                                             obj = str21;
                                                             goto label_0708 ;
                                                          }
                                                          if (!uEditorSdk2M2) {
                                                             return new EditorSdk2MvCreationResultImpl(9, -50002, "File \""+str21+"\" not exist.");
                                                          }else {
                                                             try{
                                                                JSONArray jSONArray6 = jSONObject.optJSONArray("tm");
                                                                jSONArray7 = jSONObject.getJSONArray(str1);
                                                                str11 = jSONObject.optString("metadata", str3);
                                                                obj1 = jSONObject.getString(str6);
                                                                str2 = str9;
                                                                boolean b1 = jSONObject.optBoolean(str2, true);
                                                                if (!str11.equals(str3)) {
                                                                   try{
                                                                      jSONObject10 = new JSONObject(str11);
                                                                      i20 = Integer.MIN_VALUE;
                                                                      i15 = jSONObject10.optInt("ky_groupId", i20);
                                                                      if (i15 != i20) {
                                                                         obj1 = String.valueOf(i15);
                                                                      }
                                                                      str11 = jSONObject10.optString("assetTag", str20);
                                                                      i14 = obj1;
                                                                      jSONObject5 = jSONObject10;
                                                                      str14 = str11;
                                                                      str11 = jSONObject10.optString("ky_textId", str20);
                                                                      str3 = str22;
                                                                   }catch(org.json.JSONException e0){
                                                                      str11 = null;
                                                                   }
                                                                label_0778 :
                                                                   str3 = str22;
                                                                   EditorSdkLogger.w(str3, str5+i3+" metadata parse error. path: "+str7);
                                                                   i14 = obj1;
                                                                   jSONObject5 = templateRefe4;
                                                                   uArrayList5 = 0;
                                                                   str14 = str11;
                                                                }else {
                                                                   str3 = str22;
                                                                   i14 = obj1;
                                                                   jSONObject11 = 0;
                                                                   jSONObject5 = null;
                                                                   str14 = null;
                                                                }
                                                             }catch(org.json.JSONException e0){
                                                             }catch(java.lang.Exception e0){
                                                             label_0cdb :
                                                                Exception uException = e0;
                                                                throw new EditorSdk2MvCreationException("Error parsing assets.json: "+uException.toString(), uException);
                                                             }catch(org.json.JSONException e0){
                                                                str11 = null;
                                                                templateRefe4 = 0;
                                                                goto label_0778 ;
                                                             }
                                                          }
                                                       }else {
                                                          jSONArray4 = jSONArray1;
                                                          jSONArray1 = jSONObject.getJSONArray(str1);
                                                          textEffectCo = str14;
                                                          str14 = jSONObject.optString("metadata", str3);
                                                          videoEditorP1 = videoEditorP;
                                                          str6 = str13;
                                                          str8 = jSONObject.getString(str6);
                                                          if (!str14.equals(str3)) {
                                                             JSONObject jSONObject8 = new JSONObject(str14);
                                                             str14 = "ky_groupId";
                                                             kwaiMvParam1 = kwaiMvParam;
                                                             try{
                                                                double d10 = Integer.MIN_VALUE;
                                                                i1 = jSONObject8.optInt(str14, d10);
                                                                if (i1 != d10) {
                                                                   str8 = String.valueOf(i1);
                                                                }
                                                                str11 = jSONObject8.optString("assetTag", str20);
                                                                str14 = jSONObject8.optString("ky_textId", str20);
                                                                str5 = str16;
                                                             label_05da :
                                                                i20 = 0;
                                                                str17 = i15;
                                                                i15 = i20 + 1;
                                                                str13 = i1;
                                                                while (i15 < jSONArray1.length()) {
                                                                   d10 = jSONArray1.getDouble(i15) - jSONArray1.getDouble(i20);
                                                                   EditorSdk2$TimeRange timeRange1 = EditorSdk2Utils.createTimeRange(jSONArray1.getDouble(i20), d10);
                                                                   d10 = timeRange1.start();
                                                                   uArrayList7.add(EditorSdk2Utils.createTimeRange(d10, timeRange1.duration()));
                                                                   i20 = i20 + 2;
                                                                   str11 = str17;
                                                                   templateRefe2 = templateRefe2;
                                                                   str14 = str13;
                                                                   uEditorSdk2M = uEditorSdk2M;
                                                                   jSONArray1 = jSONArray1;
                                                                }
                                                                str11 = str17;
                                                                str26 = str6;
                                                                jSONObject9 = jSONObject;
                                                                str18 = str1;
                                                                i13 = i3;
                                                                str28 = str5;
                                                                str30 = str20;
                                                                mutableArray4 = mutableArray;
                                                                uArrayList10 = uArrayList1;
                                                                str6 = str8;
                                                                str22 = str9;
                                                                templateRefe3 = templateRefe2;
                                                                uArrayList1 = uArrayList7;
                                                                d8 = 0;
                                                                uEditorSdk2M5 = uEditorSdk2M;
                                                                str19 = str13;
                                                                mutableArray3 = mutableArray2;
                                                                i7 = p4;
                                                             }catch(org.json.JSONException e0){
                                                                i15 = 0;
                                                                str5 = str16;
                                                                EditorSdkLogger.w(str5, str5+i3+" metadata parse error. path: "+str7);
                                                             }
                                                             i1 = 0;
                                                             goto label_05da ;
                                                          }else {
                                                             kwaiMvParam1 = kwaiMvParam;
                                                             str5 = str16;
                                                             i15 = 0;
                                                             goto label_05d9 ;
                                                          }
                                                       }
                                                       ArrayList uArrayList11 = new ArrayList();
                                                       str7 = str30;
                                                       jSONObject10 = jSONObject9;
                                                       str3 = jSONObject10.optString("source", str7);
                                                       if (!str3.equals(str7)) {
                                                          try{
                                                             jSONArray10 = new JSONArray(str3);
                                                             uArrayList6 = uArrayList10;
                                                             i19 = 0;
                                                             while (i19 < jSONArray10.length()) {
                                                                mutableArray = mutableArray4;
                                                                obj = null;
                                                                uArrayList11.add(jSONArray10.optString(i19, obj));
                                                                i19 = i19 + 1;
                                                                mutableArray4 = mutableArray;
                                                             }
                                                             mutableArray = mutableArray4;
                                                             str7 = str28;
                                                          label_0ba9 :
                                                             uEditorSdk2M5.setMinClipDuration(d8);
                                                             obj1 = str26;
                                                             uEditorSdk2M5.setRefId(jSONObject10.getString(obj1));
                                                             uEditorSdk2M5.setGroupId(str6);
                                                             uEditorSdk2M5.setPicture(jSONObject10.getString("p"));
                                                             uEditorSdk2M5.setAssetPath(str20);
                                                             uEditorSdk2M5.setAssetTag(str11);
                                                             uEditorSdk2M5.setTextStyleId(str19);
                                                             uEditorSdk2M5.setAssetType(jSONObject10.optString("t"));
                                                             uEditorSdk2M5.setWidth(jSONObject10.getInt("w"));
                                                             uEditorSdk2M5.setHeight(jSONObject10.getInt("h"));
                                                             str19 = str22;
                                                             uEditorSdk2M5.setIsReplaceable(jSONObject10.getBoolean(str19));
                                                             uEditorSdk2M5.setVisibleTimeRanges(uArrayList1);
                                                             str6 = str12;
                                                             uEditorSdk2M5.setIsRestoreAlpha(jSONObject10.optBoolean(str6));
                                                             uEditorSdk2M5.setDisableReplace(jSONObject10.optBoolean("disableReplace", false));
                                                             if (uArrayList11.size() > 0) {
                                                                uEditorSdk2M5.setSourceList(uArrayList11);
                                                             }
                                                             jSONObject11 = jSONObject10.optJSONObject("extraRequirement");
                                                             if (jSONObject11 != null) {
                                                                uEditorSdk2M5.setRequireFace(jSONObject11.optBoolean("requireFace", false));
                                                                uEditorSdk2M5.setRequireClipBody(jSONObject11.optBoolean("requireClipBody", false));
                                                                uEditorSdk2M5.setRequireClipFace(jSONObject11.optBoolean("requireClipFace", false));
                                                                uEditorSdk2M5.setRequireClipHead(jSONObject11.optBoolean("requireClipHead", false));
                                                                uEditorSdk2M5.setRequireFacialReco(jSONObject11.optBoolean("requireFacialReco", false));
                                                                uEditorSdk2M5.setRequireFaceBlend(jSONObject11.optBoolean("requireFaceBlend", false));
                                                                uEditorSdk2M5.setFaceBlendPath(jSONObject11.optString("faceBlendPath"));
                                                                uEditorSdk2M5.setRequireFaceMatting(jSONObject11.optBoolean("requireFaceMatting", false));
                                                                uEditorSdk2M5.setRequireHeadMatting(jSONObject11.optBoolean("requireHeadMatting", false));
                                                                uEditorSdk2M5.setRequireBodyMatting(jSONObject11.optBoolean("requireBodyMatting", false));
                                                                uEditorSdk2M5.setSelectFrameTime(jSONObject11.optLong("selectFrameTime", -1));
                                                                uEditorSdk2M5.setClipBodyType(jSONObject11.optInt("clipBodyType", 0));
                                                                jSONObject = jSONObject11.optJSONObject("requireServerProcessing");
                                                                if (jSONObject != null) {
                                                                   uEditorSdk2M5.setServiceType(jSONObject.optString("serviceType"));
                                                                   uEditorSdk2M5.setReturnMediaType(jSONObject.optString("returnMediaType"));
                                                                   uEditorSdk2M5.setServiceAction(jSONObject.optString("serviceAction"));
                                                                }
                                                                uEditorSdk2M5.setRequireOriginAudio(jSONObject11.optBoolean("requireOriginAudio", false));
                                                             }
                                                             uArrayList5 = uArrayList;
                                                             uArrayList5.add(uEditorSdk2M5);
                                                          }catch(org.json.JSONException e0){
                                                             mutableArray = mutableArray4;
                                                             uArrayList6 = i19;
                                                          }
                                                          mutableArray2 = null;
                                                       }else {
                                                          mutableArray = mutableArray4;
                                                          uArrayList6 = uArrayList10;
                                                          str7 = str28;
                                                          mutableArray2 = null;
                                                          goto label_0ba9 ;
                                                       }
                                                    }catch(org.json.JSONException e0){
                                                    }catch(java.lang.Exception e0){
                                                    }catch(org.json.JSONException e0){
                                                       kwaiMvParam1 = kwaiMvParam;
                                                       goto label_05b6 ;
                                                    }
                                                 }
                                                 i = i13 + 1;
                                                 str9 = str19;
                                                 str12 = str6;
                                                 uArrayList = uArrayList5;
                                                 str16 = str7;
                                                 str14 = textEffectCo;
                                                 videoEditorP = videoEditorP1;
                                                 kwaiMvParam = kwaiMvParam1;
                                                 mutableArray2 = mutableArray3;
                                                 uArrayList1 = uArrayList6;
                                                 str4 = str18;
                                                 str7 = p0;
                                                 str13 = obj1;
                                                 i3 = i;
                                                 templateRefe2 = templateRefe3;
                                              }catch(java.lang.Exception e0){
                                              }catch(org.json.JSONException e0){
                                              }catch(org.json.JSONException e0){
                                                 mutableArray = mutableArray4;
                                                 goto label_0b89 ;
                                              }
                                           }else {
                                              videoEditorP1 = videoEditorP;
                                              str4 = str14;
                                              uArrayList5 = uArrayList;
                                              Minecraft$TemplateClip templateClip2 = templateClip1;
                                              templateClip2.setMediaReference(templateRefe2);
                                              templateClip2.setIrreplaceableClips(mutableArray2.immutableCopy());
                                              templateClip2.setReplaceableClips(mutableArray.immutableCopy());
                                              KwaiMvParam kwaiMvParam2 = kwaiMvParam;
                                              kwaiMvParam2.mvPhotoInfos = new ArrayList(jSONArray5.length());
                                              kwaiMvParam2.allDetails = new AllMvReplaceableAreaDetail();
                                              kwaiMvParam2.allDetails.details = new ArrayList(jSONArray5.length());
                                              i3 = 0;
                                              while (i3 < jSONArray5.length()) {
                                                 jSONArray7 = jSONArray5;
                                                 jSONObject5 = jSONArray7.getJSONObject(i3);
                                                 MvPhotoInfo mvPhotoInfo = new MvPhotoInfo();
                                                 kwaiMvParam2.mvPhotoInfos.add(mvPhotoInfo);
                                                 mvPhotoInfo.time = jSONObject5.getInt("time");
                                                 uArrayList7 = i8;
                                                 uArrayList7.add(Integer.valueOf(kwaiMvParam2.mvPhotoInfos.get(i3).time));
                                                 mvPhotoInfo.rules = new ArrayList();
                                                 if (jSONObject5.has("rule")) {
                                                    JSONObject jSONObject12 = jSONObject5.getJSONObject("rule");
                                                    if (jSONObject12 != null) {
                                                       jSONObject12 = jSONObject12.getJSONObject("skip");
                                                       if (jSONObject12 != null) {
                                                          Iterator iterator = jSONObject12.keys();
                                                          while (iterator.hasNext()) {
                                                             MvReplaceAreaRule mvReplaceAre = new MvReplaceAreaRule();
                                                             obj = iterator.next();
                                                             mvReplaceAre.key = obj;
                                                             mvReplaceAre.val = jSONObject12.getInt(obj);
                                                             mvPhotoInfo.rules.add(mvReplaceAre);
                                                          }
                                                       }
                                                    }
                                                 }
                                                 mvPhotoInfo.areas = new ArrayList();
                                                 MvReplaceableAreaDetail mvReplaceabl = new MvReplaceableAreaDetail();
                                                 mvReplaceabl.info = mvPhotoInfo;
                                                 kwaiMvParam2.allDetails.details.add(mvReplaceabl);
                                                 jSONArray1 = jSONObject5.optJSONArray("areas");
                                                 if (jSONArray1 != null && jSONArray1.length() > 0) {
                                                    mvReplaceabl.replaceableAreaDetail = new ArrayList(jSONArray1.length());
                                                    i1 = 0;
                                                    while (i1 < jSONArray1.length()) {
                                                       JSONObject jSONObject13 = jSONArray1.optJSONObject(i1);
                                                       if (jSONObject13 != null) {
                                                          ReplaceableAreaInfo replaceableA = new ReplaceableAreaInfo();
                                                          mvReplaceabl.replaceableAreaDetail.add(replaceableA);
                                                          replaceableA.refId = jSONObject13.optString("assetRefId");
                                                          jSONArray10 = jSONObject13.optJSONArray("rect");
                                                          EditorSdk2$RectF rectF = new EditorSdk2$RectF();
                                                          replaceableA.rect = rectF;
                                                          jSONArray5 = jSONArray7;
                                                          kwaiMvParam1 = kwaiMvParam2;
                                                          rectF.setLeft((float)jSONArray10.optDouble(0));
                                                          replaceableA.rect.setTop((float)jSONArray10.optDouble(1));
                                                          rect = replaceableA.rect;
                                                          d2 = (double)rect.left() + jSONArray10.optDouble(2);
                                                          rect.setRight((float)d2);
                                                          rect = replaceableA.rect;
                                                          d2 = (double)rect.top() + jSONArray10.optDouble(3);
                                                          rect.setBottom((float)d2);
                                                          mvPhotoInfo.areas.add(replaceableA);
                                                       }else {
                                                          jSONArray5 = jSONArray7;
                                                          kwaiMvParam1 = kwaiMvParam2;
                                                          i20 = 2;
                                                       }
                                                       i1 = i1 + 1;
                                                       kwaiMvParam2 = kwaiMvParam1;
                                                       jSONArray7 = jSONArray5;
                                                    }
                                                 }
                                                 jSONArray5 = jSONArray7;
                                                 i3 = i3 + 1;
                                                 i8 = uArrayList7;
                                                 kwaiMvParam2 = kwaiMvParam2;
                                              }
                                              Minecraft$Opening opening = new Minecraft$Opening();
                                              HashMap hashMap2 = new HashMap();
                                              hashMap2.put("default", p3);
                                              opening.setFontMap(new ImmutableMap(hashMap2));
                                              templateClip2.setOpening(opening);
                                              uEditorSdk2M2 = new EditorSdk2MvCreationResultImpl();
                                              EditorSdk2UtilsV2.loadProject(videoEditorP1);
                                              uEditorSdk2M2.setProject(videoEditorP1);
                                              uEditorSdk2M2.setRenderPosList(i8);
                                              uEditorSdk2M2.setVideoHeight(i9);
                                              uEditorSdk2M2.setVideoWidth(i10);
                                              uEditorSdk2M2.setMvAssets(uArrayList5);
                                              uEditorSdk2M2.setTemplateType(EditorSdk2MvCreationResult$TemplateType.TEMPLATE_TYPE_MV);
                                              uEditorSdk2M2.setMVParam(kwaiMvParam2);
                                              uEditorSdk2M2.setLyricsConfig(str4);
                                              if (!ClipMvUtils.isEmpty(str10)) {
                                                 uEditorSdk2M2.setMusicResourcePath(str10);
                                              }
                                              if (uArrayList4.size() > 0) {
                                                 uEditorSdk2M2.setMusicAssets(uArrayList4);
                                              }
                                              return uEditorSdk2M2;
                                           }
                                        }
                                     }
                                  }catch(org.json.JSONException e0){
                                     jSONExceptio = e0;
                                     throw new EditorSdk2MvCreationException("Error parsing BackgroundVideo: "+jSONExceptio.toString(), jSONExceptio);
                                  }
                               }
                            }catch(org.json.JSONException e0){
                               jSONExceptio = e0;
                               throw new EditorSdk2MvCreationException("Error parsing BackgroundVideo: "+jSONExceptio.toString(), jSONExceptio);
                            }
                         }
                      }
                   }
                   str14 = null;
                   goto label_0365 ;
                }
             }catch(org.json.JSONException e0){
                jSONExceptio = e0;
                throw new EditorSdk2MvCreationException("Error parsing settings.json: "+jSONExceptio.toString(), jSONExceptio);
             }
          }
       }
    }
    public static EditorSdk2MvCreationResult createRepostProject(ClipRepost$Params p0,String p1){
       ClipRepost$Material material;
       ClipRepost$Material material1;
       Minecraft$CropOptions uCropOptions1;
       String path;
       AE2Project uAE2Project1;
       Minecraft$Range range;
       MutableMap obj4;
       ArrayList uArrayList7;
       AE2TimeRangeVec obj = p0;
       ClipRepost$Params obj1 = p1;
       ClipRepost$Params obj2 = PatchProxy.applyTwoRefs(obj, obj1, null, ClipMvUtils.class, "28");
       if (obj2 != PatchProxyResult.class) {
          return obj2;
       }
       int i = 9;
       int i1 = -1;
       if (obj == null) {
          KSClipLog.e("ClipRepost", "createRepostProject params null");
          return new EditorSdk2MvCreationResultImpl(i, i1, "params null");
       }else {
          obj2 = obj.materials;
          if (obj2 == null || !obj2.size()) {
             KSClipLog.e("ClipRepost", "createRepostProject no materials");
             return new EditorSdk2MvCreationResultImpl(9, -1, "no materials");
          }else if(!ClipKitUtils.fileExists(p1)){
             KSClipLog.e("ClipRepost", "createRepostProject bgPlaceholderPath not exists, path: "+obj1);
             return new EditorSdk2MvCreationResultImpl(i, i1, "bgPlaceholderPath not exists");
          }else {
             String str = ",";
             if (obj.photoFrameWidth <= null || obj.photoFrameHeight <= null) {
                obj1 = obj;
                KSClipLog.e("ClipRepost", "createRepostProject photoFrame size invalid, wh: "+obj1.photoFrameWidth+str+obj1.photoFrameHeight);
                return new EditorSdk2MvCreationResultImpl(9, -1, "photoFrame size invalid");
             }else {
                KSClipLog.i("ClipRepost", "createRepostProject type: "+obj.type+" photoFrame wh: "+obj.photoFrameWidth+str+obj.photoFrameHeight+" material size "+obj.materials.size()+" frameRate "+obj.frameRate);
                ArrayList uArrayList = new ArrayList();
                HashMap hashMap = new HashMap();
                HashMap hashMap1 = new HashMap();
                Iterator iterator = obj.materials.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      material = iterator.next();
                      if (material == null) {
                         break ;
                      }else if(!ClipKitUtils.fileExists(material.path)){
                         KSClipLog.e("ClipRepost", "createRepostProject material not exists, path: "+material.path);
                         return new EditorSdk2MvCreationResultImpl(i, i1, "material not exists");
                      }else if(hashMap.containsKey(material.path)){
                         KSClipLog.i("ClipRepost", "createRepostProject duplicated material path: "+material.path);
                      }else {
                         String str1 = " path: ";
                         if (material.width <= null || material.height <= null) {
                            KSClipLog.e("ClipRepost", "createRepostProject material size invalid, wh: "+material.width+str+material.height+str1+material.path);
                            return new EditorSdk2MvCreationResultImpl(9, -1, "material size invalid");
                         }else {
                            Minecraft$CropOptions uCropOptions = new Minecraft$CropOptions();
                            uCropOptions.setWidth(material.width);
                            if (obj.type == ClipRepost$Type.Atlas) {
                               ClipRepost$Params photoFrameWi = obj.photoFrameWidth;
                               int i2 = material.height * photoFrameWi;
                               ClipRepost$Params photoFrameHe = obj.photoFrameHeight;
                               ClipRepost$Material width = material.width;
                               i1 = photoFrameHe * width;
                               if (i2 > i1) {
                                  double d = (double)width / (double)photoFrameWi;
                                  d = d * (double)photoFrameHe;
                                  int i3 = (int)Math.ceil(d);
                                  KSClipLog.i("ClipRepost", "createRepostProject material do need crop, wh: "+material.width+str+material.height+"\("+i3+"\) path: "+material.path);
                                  uCropOptions.setHeight(i3);
                                  hashMap1.put(material.path, Boolean.TRUE);
                               label_01b2 :
                                  hashMap.put(material.path, uCropOptions);
                                  i = 9;
                                  i1 = -1;
                               }
                            }
                            KSClipLog.i("ClipRepost", "createRepostProject material not need crop, wh: "+material.width+str+material.height+str1+material.path);
                            uCropOptions.setHeight(material.height);
                            goto label_01b2 ;
                         }
                      }
                   }else {
                      Iterator iterator1 = obj.materials.iterator();
                      while (true) {
                         if (iterator1.hasNext()) {
                            material1 = iterator1.next();
                            if (TextUtils.isEmpty(material1.backgroundPath)) {
                               continue ;
                            }else if(!ClipKitUtils.fileExists(material1.backgroundPath)){
                            }else if(hashMap.containsKey(material1.backgroundPath)){
                               KSClipLog.i("ClipRepost", "createRepostProject duplicated material bg path: "+material1.backgroundPath);
                            }else {
                               uCropOptions1 = new Minecraft$CropOptions();
                               uCropOptions1.setWidth(obj.photoFrameWidth);
                               uCropOptions1.setHeight(obj.photoFrameHeight);
                               hashMap.put(material1.backgroundPath, uCropOptions1);
                               KSClipLog.i("ClipRepost", "createRepostProject add material bg to map: "+material1.path);
                               continue ;
                            }
                         }else {
                            AE2RepostKit uAE2RepostKi = new AE2RepostKit(ClipMvUtils.convertClipRepostParamsToAE2(obj, hashMap));
                            AE2Project uAE2Project = uAE2RepostKi.project();
                            double d1 = uAE2Project.outFrame() / uAE2Project.frameRate();
                            if (d1 - 0x3e112e0be826d695 < 0) {
                               KSClipLog.e("ClipRepost", "createRepostProject ae2Project duration invalid "+d1);
                               return new EditorSdk2MvCreationResultImpl(9, -1, "ae2Project duration invalid");
                            }else {
                               i1 = 9;
                               int i4 = -1;
                               AE2RepostAssetVec uAE2RepostAs = uAE2RepostKi.assets();
                               if (uAE2RepostAs.size() <= 0) {
                                  KSClipLog.e("ClipRepost", "createRepostProject ae2 return empty asset array");
                                  return new EditorSdk2MvCreationResultImpl(i1, i4, "ae2 return empty asset array");
                               }else {
                                  KSClipLog.i("ClipRepost", "createRepostProject ae2Project return duration "+d1+", ae2RepostAssets "+uAE2RepostAs);
                                  KwaiMvParam kwaiMvParam = new KwaiMvParam();
                                  kwaiMvParam.type = 1;
                                  ClipkitSdk$ClipKitBackgroundVideo uClipKitBack = new ClipkitSdk$ClipKitBackgroundVideo();
                                  kwaiMvParam.bgVideo = uClipKitBack;
                                  uClipKitBack.fullPath = obj1;
                                  uClipKitBack.blendMode = 0;
                                  uClipKitBack.renderOrder = 0;
                                  kwaiMvParam.mvPhotoInfos = new ArrayList();
                                  kwaiMvParam.allDetails = new AllMvReplaceableAreaDetail();
                                  kwaiMvParam.allDetails.details = new ArrayList();
                                  MutableArray mutableArray = new MutableArray(Minecraft$KSAVClip.class);
                                  ArrayList uArrayList1 = new ArrayList();
                                  ArrayList uArrayList2 = new ArrayList();
                                  MutableArray mutableArray1 = new MutableArray(Minecraft$Range.class);
                                  int i5 = 0;
                                  try{
                                     while (true) {
                                        double d2 = d1;
                                        if (i5 < uAE2RepostAs.size()) {
                                           AE2RepostAsset uAE2RepostAs1 = uAE2RepostAs.get(i5);
                                           String refId = uAE2RepostAs1.getRefId();
                                           path = uAE2RepostAs1.getPath();
                                           AE2RepostAssetVec uAE2RepostAs2 = uAE2RepostAs;
                                           Minecraft$CropOptions uCropOptions2 = hashMap.get(path);
                                           if (uCropOptions2 == null) {
                                           }else {
                                              try{
                                                 uAE2Project1 = uAE2Project;
                                                 uCropOptions2.setTransform(EditorSdk2Utils.createIdentityTransform());
                                                 ArrayList uArrayList3 = new ArrayList();
                                                 obj = uAE2RepostAs1.getVisibleTime();
                                                 if (obj == null || obj.size() <= 0) {
                                                    KSClipLog.e("ClipRepost", "createRepostProject ae2 return empty time ranges for index "+i5);
                                                    return new EditorSdk2MvCreationResultImpl(9, -1, "ae2 return empty time ranges");
                                                 }else {
                                                    HashMap hashMap2 = hashMap;
                                                    int i6 = 0;
                                                    while (true) {
                                                       if (i6 < obj.size()) {
                                                          AE2TimeRange uAE2TimeRang = obj.get(i6);
                                                          if (uAE2TimeRang == null) {
                                                             KSClipLog.e("ClipRepost", "createRepostProject ae2 return null time range for index "+i5+str+i6);
                                                             return new EditorSdk2MvCreationResultImpl(9, -1, "ae2 return null time range");
                                                          }else {
                                                             AE2TimeRangeVec uAE2TimeRang1 = obj;
                                                             EditorSdk2$TimeRange timeRange = new EditorSdk2$TimeRange();
                                                             String str2 = str;
                                                             ArrayList uArrayList4 = uArrayList;
                                                             timeRange.setStart(uAE2TimeRang.getStartTime());
                                                             timeRange.setDuration(uAE2TimeRang.getDuration());
                                                             uArrayList3.add(timeRange);
                                                             double startTime = uAE2TimeRang.getStartTime();
                                                             ArrayList uArrayList5 = uArrayList3;
                                                             int i7 = i6;
                                                             Minecraft$KSAVClip kSAVClip = EditorSdk2UtilsV2.createAduioVideoClip(path, null, null);
                                                             kSAVClip.setAeRefId(refId);
                                                             String str3 = refId;
                                                             kSAVClip.setSourceRange(TimeRange.timeRangeFromStartToEndTime(RationalTime.fromSeconds(0), RationalTime.fromSeconds(timeRange.duration())));
                                                             kSAVClip.setCropOptions(uCropOptions2);
                                                             range = new Minecraft$Range();
                                                             int i8 = i5;
                                                             Object obj3 = uCropOptions2;
                                                             range.setStart(uAE2TimeRang.getStartTime());
                                                             range.setDuration(uAE2TimeRang.getDuration());
                                                             range.setId(Long.valueOf(kSAVClip.clipId()).longValue());
                                                             mutableArray1.add(range);
                                                             Minecraft$PropertyKeyFrame propertyKeyF = new Minecraft$PropertyKeyFrame();
                                                             propertyKeyF.setDuration(timeRange.duration());
                                                             Minecraft$PropertyKeyFrame[] propertyKeyF1 = new Minecraft$PropertyKeyFrame[]{propertyKeyF};
                                                             kSAVClip.setPropertyKeyFrames(propertyKeyF1);
                                                             mutableArray.add(kSAVClip);
                                                             if (!EditorSdk2UtilsV2.isSingleImagePath(path)) {
                                                                try{
                                                                   EditorSdk2V2$AudioAsset uAudioAsset = EditorSdk2UtilsV2.openAudioAsset(path);
                                                                   uAudioAsset.setVolume(0x3ff0000000000000);
                                                                   double d3 = timeRange.start();
                                                                   try{
                                                                      obj4 = obj3;
                                                                      uAudioAsset.setDisplayRange(EditorSdk2Utils.createTimeRange(d3, timeRange.duration()));
                                                                      uArrayList1.add(uAudioAsset);
                                                                   }catch(java.lang.Exception e0){
                                                                   }
                                                                   KSClipLog.e("ClipRepost", "createRepostProject openAudioAsset "+path+" exception "+e0);
                                                                }catch(java.lang.Exception e0){
                                                                   uCropOptions1 = obj3;
                                                                   goto label_047b ;
                                                                }
                                                             }else {
                                                                uCropOptions1 = obj3;
                                                             }
                                                             MvPhotoInfo mvPhotoInfo = new MvPhotoInfo();
                                                             kwaiMvParam.mvPhotoInfos.add(mvPhotoInfo);
                                                             startTime = startTime * 0x408f400000000000;
                                                             mvPhotoInfo.time = (int)startTime;
                                                             i5 = i8;
                                                             uArrayList2.add(Integer.valueOf(kwaiMvParam.mvPhotoInfos.get(i5).time));
                                                             MvReplaceableAreaDetail mvReplaceabl = new MvReplaceableAreaDetail();
                                                             mvReplaceabl.info = mvPhotoInfo;
                                                             kwaiMvParam.allDetails.details.add(mvReplaceabl);
                                                             mvReplaceabl.replaceableAreaDetail = new ArrayList();
                                                             ReplaceableAreaInfo replaceableA = new ReplaceableAreaInfo();
                                                             mvReplaceabl.replaceableAreaDetail.add(replaceableA);
                                                             String str4 = str3;
                                                             replaceableA.refId = str4;
                                                             replaceableA.width = (float)uCropOptions1.width();
                                                             replaceableA.height = (float)uCropOptions1.height();
                                                             ArrayList uArrayList6 = new ArrayList();
                                                             mvPhotoInfo.areas = uArrayList6;
                                                             uArrayList6.add(replaceableA);
                                                             i6 = i7 + 1;
                                                             refId = str4;
                                                             uCropOptions2 = uCropOptions1;
                                                             obj = uAE2TimeRang1;
                                                             uArrayList = uArrayList4;
                                                             str = str2;
                                                             uArrayList3 = uArrayList5;
                                                          }
                                                       }else {
                                                          obj4 = uCropOptions2;
                                                          EditorSdk2MvAssetImpl uEditorSdk2M = new EditorSdk2MvAssetImpl();
                                                          uEditorSdk2M.setRefId(refId);
                                                          uEditorSdk2M.setAssetPath(path);
                                                          uEditorSdk2M.setWidth(obj4.width());
                                                          uEditorSdk2M.setHeight(obj4.height());
                                                          uEditorSdk2M.setVisibleTimeRanges(uArrayList3);
                                                          uEditorSdk2M.setIsReplaceable(true);
                                                          uEditorSdk2M.setPicture(path);
                                                          uArrayList7 = uArrayList;
                                                          uArrayList7.add(uEditorSdk2M);
                                                          i5 = i5 + 1;
                                                          uArrayList = uArrayList7;
                                                          d1 = d2;
                                                          uAE2Project = uAE2Project1;
                                                          uAE2RepostAs = uAE2RepostAs2;
                                                          hashMap = hashMap2;
                                                          str = str;
                                                          int i9 = p0;
                                                       }
                                                    }
                                                    KSClipLog.e("ClipRepost", "createRepostProject ae2 return error path for index "+i5+" path "+path);
                                                    return new EditorSdk2MvCreationResultImpl(9, -1, "ae2 return error path");
                                                 }
                                              }catch(java.lang.Exception e0){
                                                 KSClipLog.e("ClipRepost", "createRepostProject create animatedSubAsset exception "+e0);
                                                 return new EditorSdk2MvCreationResultImpl(9, -1, " create animatedSubAsset exception "+e0);
                                              }
                                           }
                                        }else {
                                           uAE2Project1 = uAE2Project;
                                           uArrayList7 = uArrayList;
                                           Minecraft$TemplateClip templateClip = new Minecraft$TemplateClip();
                                           templateClip.setTemplateType(3);
                                           obj1 = p0;
                                           templateClip.setRepost(ClipMvUtils.convertClipRepostParamsToMC(obj1, hashMap));
                                           templateClip.setSourceRange(TimeRange.timeRangeFromStartToEndTime(RationalTime.fromSeconds(0), RationalTime.fromSeconds(d2)));
                                           templateClip.setReplaceableClips(mutableArray.immutableCopy());
                                           Minecraft$TemplateReference templateRefe = new Minecraft$TemplateReference();
                                           templateRefe.setVisibleTimes(mutableArray1.immutableCopy());
                                           obj4 = new MutableMap();
                                           str = "backgroudVideoV2";
                                           obj4.put(str, Integer.valueOf(-1));
                                           templateRefe.setRenderOrderMap(obj4.immutableMapCopy());
                                           try{
                                              templateClip.setMediaReference(templateRefe);
                                              EditorSdk2V2$TrackAsset trackAsset = EditorSdk2UtilsV2.openTrackAsset(p1);
                                              trackAsset.setIsBackgroundVideo(true);
                                              trackAsset.setClippedRange(EditorSdk2UtilsV2.createTimeRange(0, d2));
                                              trackAsset.getMainClip().setAeRefId(str);
                                              trackAsset.getMainClip().setBlendingMode(0);
                                              Minecraft$InputFileOptions inputFileOpt = new Minecraft$InputFileOptions();
                                              Minecraft$RationalV2 rationalV2 = new Minecraft$RationalV2();
                                              rationalV2.setNum((long)obj1.frameRate);
                                              rationalV2.setDen(1);
                                              inputFileOpt.setFrameRate(rationalV2);
                                              trackAsset.setAssetPathOptions(inputFileOpt);
                                              Minecraft$KSAVClip[] kSAVClipArra = new Minecraft$KSAVClip[]{trackAsset.getMainClip()};
                                              templateClip.setIrreplaceableClips(kSAVClipArra);
                                              MutableTrack mutableTrack = new MutableTrack();
                                              ErrorStatus uErrorStatus = new ErrorStatus();
                                              mutableTrack.appendClip(templateClip, uErrorStatus);
                                              ErrorCode ok = ErrorCode.Ok;
                                              if (uErrorStatus.errorCode() != ok.ordinal()) {
                                                 KSClipLog.e("ClipRepost", "createRepostProject track appendClip error "+uErrorStatus.errorCode());
                                                 return new EditorSdk2MvCreationResultImpl(9, -1, " track appendClip error "+uErrorStatus.errorCode());
                                              }else {
                                                 MutableTimeline mutableTimel = new MutableTimeline();
                                                 mutableTimel.appendTrack(mutableTrack, uErrorStatus);
                                                 if (uErrorStatus.errorCode() != ok.ordinal()) {
                                                    KSClipLog.e("ClipRepost", "createRepostProject timeline appendTrack error "+uErrorStatus.errorCode());
                                                    return new EditorSdk2MvCreationResultImpl(9, -1, " timeline appendTrack error "+uErrorStatus.errorCode());
                                                 }else {
                                                    EditorSdk2V2$VideoEditorProject videoEditorP = new EditorSdk2V2$VideoEditorProject(mutableTimel);
                                                    EditorSdk2V2$TrackAsset[] trackAssetAr = new EditorSdk2V2$TrackAsset[]{trackAsset};
                                                    videoEditorP.setTrackAssets(trackAssetAr);
                                                    EditorSdk2V2$AudioAsset[] uAudioAssetA = new EditorSdk2V2$AudioAsset[0];
                                                    uAudioAssetA = uArrayList1.toArray(uAudioAssetA);
                                                    try{
                                                       videoEditorP.setAudioAssets(uAudioAssetA);
                                                       EditorSdk2UtilsV2.loadProject(videoEditorP);
                                                       EditorSdk2MvCreationResultImpl uEditorSdk2M1 = new EditorSdk2MvCreationResultImpl();
                                                       uEditorSdk2M1.setProject(videoEditorP);
                                                       uEditorSdk2M1.setAe2Project(uAE2Project1);
                                                       uEditorSdk2M1.setRenderPosList(uArrayList2);
                                                       uEditorSdk2M1.setVideoHeight(obj1.photoFrameWidth);
                                                       uEditorSdk2M1.setVideoWidth(obj1.photoFrameHeight);
                                                       uEditorSdk2M1.setMvAssets(uArrayList7);
                                                       uEditorSdk2M1.setTemplateType(EditorSdk2MvCreationResult$TemplateType.TEMPLATE_TYPE_MV);
                                                       uEditorSdk2M1.setMVParam(kwaiMvParam);
                                                       KSClipLog.i("ClipRepost", "createRepostProject finish");
                                                       return uEditorSdk2M1;
                                                    }catch(java.lang.Exception e0){
                                                       Object obj5 = e0;
                                                       KSClipLog.e(v6, "createRepostProject loadProject fail"+obj5);
                                                       return new EditorSdk2MvCreationResultImpl(9, -1, "loadProject fail "+obj5);
                                                    }
                                                 }
                                              }
                                           }catch(java.lang.Exception e0){
                                              KSClipLog.e("ClipRepost", "createRepostProject VideoEditorProject create fail"+e0);
                                              return new EditorSdk2MvCreationResultImpl(9, -1, "VideoEditorProject create fail "+e0);
                                           }
                                        }
                                     }
                                  }catch(java.lang.Exception e0){
                                  }
                               }
                            }
                         }
                      }
                      KSClipLog.e("ClipRepost", "createRepostProject material bg not exists, path: "+material1.backgroundPath);
                      return new EditorSdk2MvCreationResultImpl(9, -1, "material bg not exists");
                   }
                }
                KSClipLog.e("ClipRepost", "createRepostProject material null");
                return new EditorSdk2MvCreationResultImpl(i, i1, "material null");
             }
          }
       }
    }
    public static NewSparkTemplateManager createSparkTemplateManager(ExtraInterface p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, ClipMvUtils.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null && !TextUtils.isEmpty(p1)) {
          return new NewSparkTemplateManager(new ClipMvUtils$2(p0, p1));
       }
       KSClipLog.e("ClipSparkRecovery", "createSparkTemplateManager input invalid, return null");
       return null;
    }
    public static Bitmap cropImage(Bitmap p0,double p1,double p2,EditorSdk2$Rational p3){
       String obj;
       double d4;
       double d5;
       long l;
       int i1;
       Bitmap uBitmap = p0;
       if (PatchProxy.isSupport(ClipMvUtils.class)) {
          obj = PatchProxy.applyFourRefs(p0, Double.valueOf(p1), Double.valueOf(p2), p3, null, ClipMvUtils.class, "44");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (uBitmap) {
          obj = null;
          if (p1 - obj < 0 || (p2 - obj >= 0 && p3 != null)) {
             int width = p0.getWidth();
             int height = p0.getHeight();
             double d = (double)width;
             double d1 = (double)height;
             double d2 = d / d1;
             double d3 = ClipKitUtils.RationalToDouble(p3);
             if (!p1 - obj && !p2 - obj) {
                d4 = 0x3fe0000000000000;
                d5 = d4;
             }else {
                d4 = p1;
                d5 = p2;
             }
             int i = 0;
             if (d2 - d3 < 0) {
                height = (int)Math.round((d / d3));
                d4 = (double)height;
                d = (d4 / d1) * 0x3fe0000000000000;
                if (d5 - d < 0 || d5 - (0x3ff0000000000000 - d) > 0) {
                   if (d5 - 0x3fe0000000000000 >= 0) {
                      d = 0x3ff0000000000000 - d;
                   }
                   l = Math.round(((d * d1) - (d4 * 0x3fe0000000000000)));
                }else {
                   l = Math.round(((d5 * d1) - (d4 * 0x3fe0000000000000)));
                }
                i1 = (int)l;
             }else if(d2 - d3 > 0){
                width = (int)Math.round((d1 * d3));
                d1 = (double)width;
                d2 = (d1 / d) * 0x3fe0000000000000;
                if (d4 - d2 < 0 || d4 - (0x3ff0000000000000 - d2) > 0) {
                   if (d4 - 0x3fe0000000000000 >= 0) {
                      d2 = 0x3ff0000000000000 - d2;
                   }
                   l = Math.round(((d2 * d) - (d1 * 0x3fe0000000000000)));
                }else {
                   l = Math.round(((d4 * d) - (d1 * 0x3fe0000000000000)));
                }
                i = (int)l;
             }
             i1 = 0;
             return Bitmap.createBitmap(uBitmap, i, i1, width, height);
          }
       }
       KSClipLog.e("ClipMVUtils", "cropImage params error");
       return uBitmap;
    }
    public static AE2Project getAE2ProjectFromMVParam(KwaiMvParam p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ClipMvUtils.class, "68");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          EditorSdkLogger.e("ClipMVUtils", "getAE2ProjectFromMVParam: KwaiMvParam is null!");
          return null;
       }else {
          File uFile = new File(p0.templateDirectory);
          File uFile1 = new File(p0.configJsonPath);
          if (uFile.exists()) {
             EditorSdkLogger.i("ClipMVUtils", "create AE2Project from aeFile");
             AE2Parser$Resource resource = new AE2Parser$Resource();
             resource.setAssetDir(uFile.getAbsolutePath());
             resource.setJsonFile(uFile1.getAbsolutePath());
             resource.setKeyInt(p0.encyptedMethod);
             AE2Project uAE2Project = AE2Parser.parseProjectFromResource(resource);
             if (uAE2Project.isValid()) {
                return uAE2Project;
             }
             EditorSdkLogger.e("ClipMVUtils", "Fail to create AE2Project is invalid. Check your config file");
             return null;
          }else {
             EditorSdkLogger.e("ClipMVUtils", "aeFile not exists!");
             return null;
          }
       }
    }
    public static String getActivityIdWithTemplate(String p0){
       File obj = PatchProxy.applyOneRefs(p0, null, ClipMvUtils.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = "ClipMVUtils";
       if (!TextUtils.isEmpty(p0)) {
          obj = new File(p0, "settings.json");
          if (obj.exists()) {
             JSONObject jSONObject = ClipMvUtils.parseSettingsJson(obj.toString());
             if (jSONObject != null) {
                return jSONObject.getString("activityId");
             }
             throw new IOException("getActivityIdWithTemplate parseSettingsJson failed! path: "+obj.toString());
          }else {
             EditorSdkLogger.e(str, "getActivityIdWithTemplate directory not exists! dir: "+p0);
             throw new IOException("getActivityIdWithTemplate directory not exists!");
          }
       }else {
          EditorSdkLogger.e(str, "getActivityIdWithTemplate directory is empty");
          throw new IOException("getActivityIdWithTemplate directory is empty");
       }
    }
    public static int getAnimatedSubAssetsCount(JSONArray p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ClipMvUtils.class, "56");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       int i1 = 0;
       while (i < p0.length()) {
          try{
             JSONObject jSONObject = p0.getJSONObject(i);
             if (jSONObject.has("visibleTime") && !ClipMvUtils.isTextAsset(jSONObject)) {
                int i2 = jSONObject.getJSONArray("visibleTime").length() / 2;
                i1 = i1 + i2;
             }
             i = i + 1;
          }catch(org.json.JSONException e5){
             throw new EditorSdk2MvCreationException("Error parsing assets.json", e5);
          }
       }
       return i1;
    }
    public static int getAnimatedSubAssetsIndexByRefId(EditorSdk2V2$VideoEditorProject p0,String p1){
       if (p1 != null && (p0 != null && (p0.animatedSubAssets() != null && p0.animatedSubAssetsSize() > 0))) {
          int i = 0;
          while (i < p0.animatedSubAssetsSize()) {
             if ((p0.animatedSubAssets(i).externalAssetId()).equals(p1)) {
                return i;
             }
             i = i + 1;
          }
       }
       return -1;
    }
    public static ArrayList getArrayForAllMatchedAVClips(MutableTimeline p0,String p1){
       ArrayList obj = PatchProxy.applyTwoRefs(p0, p1, null, ClipMvUtils.class, "77");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       if (!TextUtils.isEmpty(p1) && p0 != null) {
          Iterator iterator = p0.mutableReplaceableClips().getArrayList().iterator();
          while (iterator.hasNext()) {
             Minecraft$KSAVClip kSAVClip = iterator.next();
             if ((MinecraftUtils.GetRefIdOfAVClip(kSAVClip)).equals(p1)) {
                obj.add(kSAVClip);
             }
          }
       }
       return obj;
    }
    public static ClipMvUtils$KSClipProjectAssetType getAssetType(EditorSdk2V2$VideoEditorProject p0,String p1){
       return ClipMvUtils$KSClipProjectAssetType.KSClipProjectAssetTypeUnknown;
    }
    public static Bitmap getBitmapWithRotate(String p0,Bitmap p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, ClipMvUtils.class, "43");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!new File(p0).exists() || p1 == null) {
          KSClipLog.e("ClipMVUtils", "getBitmapWithRotate filePath not exist or bitmap is null");
          return p1;
       }else if(EditorSdk2UtilsV2.isSingleImagePath(p0)){
          int assetOriginR = EditorSdk2UtilsV2.getAssetOriginRotation(p0);
          KSClipLog.i("ClipMVUtils", "getBitmapWithRotate filePath: "+p0+" degree:"+assetOriginR);
          if (assetOriginR) {
             Matrix matrix = new Matrix();
             matrix.postRotate((float)assetOriginR);
             Bitmap uBitmap = Bitmap.createBitmap(p1, 0, 0, p1.getWidth(), p1.getHeight(), matrix, true);
             if (uBitmap != p1) {
                p1.recycle();
             }
             p1 = uBitmap;
          }
       }
       return p1;
    }
    public static Minecraft$CropOptions getCropOptionsByAssetRectangle(int p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7){
       Minecraft$CropOptions uCropOptions;
       int i = p6;
       int i1 = p7;
       ClipMvUtils uClipMvUtils = ClipMvUtils.class;
       if (PatchProxy.isSupport(uClipMvUtils)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5),Integer.valueOf(p6),Integer.valueOf(p7)};
          Object obj = PatchProxy.apply(objArray, null, uClipMvUtils, "53");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          uCropOptions = new Minecraft$CropOptions();
          uCropOptions.setTransform(EditorSdk2Utils.createIdentityTransform());
       }catch(java.lang.Exception e0){
          EditorSdkLogger.e("ClipMVUtils", "createIdentityTransform excption: "+e0.toString());
       }
       uCropOptions.setWidth(i);
       uCropOptions.setHeight(i1);
       double d = (double)p4;
       uCropOptions.transform().setScaleX((((double)i * 100.00f) / d));
       double d1 = (double)p5;
       uCropOptions.transform().setScaleY((((double)i1 * 100.00f) / d1));
       uCropOptions.transform().setPositionX((((- ((double)p2 - ((double)p0 / 2.00f))) * 100.00f) / d));
       uCropOptions.transform().setPositionY((((- ((double)p3 - ((double)p1 / 2.00f))) * 100.00f) / d1));
       return uCropOptions;
    }
    public static Minecraft$CropOptions getCropOptionsByAssetSizeAndRefId(int p0,int p1,EditorSdk2MvCreationResult p2,String p3,int p4){
       Iterator obj;
       int width;
       int height;
       boolean b;
       object oobject = p3;
       ClipMvUtils uClipMvUtils = ClipMvUtils.class;
       if (PatchProxy.isSupport(uClipMvUtils)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),p2,oobject,Integer.valueOf(p4)};
          obj = PatchProxy.apply(objArray, null, uClipMvUtils, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p2 != null) {
          obj = p2.getMvAssets().iterator();
          while (true) {
             if (obj.hasNext()) {
                EditorSdk2MvAsset uEditorSdk2M = obj.next();
                if (uEditorSdk2M.isReplaceable() && (uEditorSdk2M.getRefId()).equals(oobject)) {
                   width = uEditorSdk2M.getWidth();
                   height = uEditorSdk2M.getHeight();
                   b = (p2.getTemplateType() != EditorSdk2MvCreationResult$TemplateType.TEMPLATE_TYPE_NEW_SPARK)? true: false;
                   break ;
                }
             }
          }
          return ClipMvUtils.getCropOptionsByReplaceableAssetSize(p0, p1, width, height, p4, b);
       }
       return null;
    }
    public static Minecraft$CropOptions getCropOptionsByReplaceableAssetSize(int p0,int p1,int p2,int p3,int p4,boolean p5){
       Minecraft$CropOptions obj;
       ClipMvUtils uClipMvUtils = ClipMvUtils.class;
       if (PatchProxy.isSupport(uClipMvUtils)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Boolean.valueOf(p5)};
          obj = PatchProxy.apply(objArray, null, uClipMvUtils, "54");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          obj = new Minecraft$CropOptions();
          obj.setTransform(EditorSdk2Utils.createIdentityTransform());
       }catch(java.lang.Exception e2){
          EditorSdkLogger.e("ClipMVUtils", "createIdentityTransform excption: "+e2.toString());
       }
       obj.setWidth(p2);
       obj.setHeight(p3);
       if (p0 > 1 && (p1 > 1 && (p2 > 1 && p3 > 1))) {
          if (p5) {
             double d = (p4 & 0x20)? Math.min(((double)p2 / (double)p0), ((double)p3 / (double)p1)): Math.max(((double)p2 / (double)p0), ((double)p3 / (double)p1));
             d = d * 100.00f;
             obj.transform().setScaleX(d);
             obj.transform().setScaleY(d);
             KSClipLog.i("ClipMVUtils", "getCropOptionsByReplaceableAssetSize scaleX: "+obj.transform().scaleX()+" scaleY: "+obj.transform().scaleY());
          }else {
             double d1 = ((double)p2 * 0x3ff0000000000000) / (double)p3;
             double d2 = (double)p0;
             double d3 = (double)p1;
             if (((0x3ff0000000000000 * d2) / d3) - d1 < 0) {
                obj.setWidth(p0);
                obj.setHeight((int)(d2 / d1));
             }else {
                obj.setHeight(p1);
                obj.setWidth((int)(d3 * d1));
             }
             KSClipLog.i("ClipMVUtils", "getCropOptionsByReplaceableAssetSize not scale, width: "+obj.width()+" height: "+obj.height());
          }
       }
       return obj;
    }
    public static List getCroppedResource(List p0,String p1){
       ClipMvUtils$CropResourceInfo path;
       Bitmap uBitmap;
       Bitmap$CompressFormat pNG;
       EditorSdk2$ProbedFile probedFile;
       ClipMvUtils$CropResourceInfo obj = p0;
       String str = p1;
       Object obj1 = PatchProxy.applyTwoRefs(obj, str, null, ClipMvUtils.class, "42");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (obj == null || p0.isEmpty()) {
          KSClipLog.e("ClipMVUtils", "getCroppedResource resourceInfos is null or empty");
          return obj;
       }else {
          String str1 = "/";
          if (!str.endsWith(str1)) {
             str = str+str1;
          }
          ArrayList uArrayList = new ArrayList(p0.size());
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             obj = iterator.next();
             if (TextUtils.isEmpty(obj.path)) {
                KSClipLog.d("ClipMVUtils", "getCroppedResource resourceInfo\'s path is empty");
                uArrayList.add(obj);
             }else {
                path = obj.path;
                ClipMvUtils$CropResourceInfo width = obj.width;
                ClipMvUtils$CropResourceInfo height = obj.height;
                ClipMvUtils$CropResourceInfo centerX = obj.centerX;
                ClipMvUtils$CropResourceInfo centerY = obj.centerY;
                ClipMvUtils$CropResourceInfo ratio = obj.ratio;
                String name = new File(path).getName();
                int i = name.lastIndexOf(46) + 1;
                String str2 = (name.substring(i)).toLowerCase();
                if (!EditorSdk2UtilsV2.isSingleImagePath(path)) {
                   str2 = "jpg";
                }
                Bitmap$CompressFormat jPEG = Bitmap$CompressFormat.JPEG;
                Object obj2 = str;
                Iterator iterator1 = iterator;
                ClipMvUtils$CropResourceInfo uCropResourc = path;
                str = str+name.substring(0, name.lastIndexOf(46))+"_"+ratio.num()+"_"+ratio.den()+"_crop_image."+str2;
                if (!new File(str).exists()) {
                   if (EditorSdk2UtilsV2.isSingleImagePath(uCropResourc)) {
                      ClipMvUtils$CropResourceInfo uCropResourc1 = uCropResourc;
                      uBitmap = ClipMvUtils.cropImage(ClipMvUtils.getBitmapWithRotate(uCropResourc1, ImageLoaderUtil.loadImageToBitmap(uCropResourc1, width, height, false)), centerX, centerY, ratio);
                      BitmapFactory$Options options = new BitmapFactory$Options();
                      options.inJustDecodeBounds = true;
                      BitmapFactory.decodeFile(uCropResourc1, options);
                      if ((options.outMimeType).equals("image/png")) {
                         pNG = Bitmap$CompressFormat.PNG;
                      }else if((options.outMimeType).equals("image/webp")){
                         pNG = Bitmap$CompressFormat.WEBP;
                      }
                      jPEG = pNG;
                   }else {
                      uBitmap = ClipMvUtils.cropImage(ClipMvUtils.getThumbnailBitmap(uCropResourc, width, height, obj.framePos), centerX, centerY, ratio);
                   }
                   ClipMvUtils.saveBitmapToFile(uBitmap, str, jPEG);
                }
                try{
                   probedFile = new EditorSdk2$ProbedFile();
                   probedFile = EditorSdk2Utils.openFile(str);
                }catch(com.kwai.video.editorsdk2.EditorSdk2InternalErrorException e0){
                   Object obj3 = e0;
                   KSClipLog.e("ClipMVUtils", "openFile EditorSdk2InternalErrorException error "+obj3);
                   obj3.printStackTrace();
                }catch(java.io.IOException e0){
                   obj3 = e0;
                   KSClipLog.e("ClipMVUtils", "openFile IOException error "+obj3);
                   obj3.printStackTrace();
                }
                obj = new ClipMvUtils$CropResourceInfo();
                obj.path = str;
                obj.width = EditorSdk2Utils.getProbedFileWidth(probedFile);
                obj.height = EditorSdk2Utils.getProbedFileHeight(probedFile);
                uArrayList.add(obj);
                iterator = iterator1;
                str = obj2;
             }
          }
          return uArrayList;
       }
    }
    public static EditorSdk2$TimeRange getDisplayRangeOfAVClipInTemplate(EditorSdk2V2$VideoEditorProject p0,Minecraft$KSAVClip p1){
       EditorSdk2$TimeRange obj = PatchProxy.applyTwoRefs(p0, p1, null, ClipMvUtils.class, "79");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new EditorSdk2$TimeRange();
       String str = "ClipMVUtils";
       if (p0.cleanMainTrackMode()) {
          KSClipLog.e(str, "getDisplayRangeOfTemplateAsset spark not implement this method yet");
       }else {
          Minecraft$TemplateClip templateClip = EditorSdk2UtilsV2.getTemplateClipFromTimeline(p0.getTemplateTimeline());
          if (templateClip == null) {
             KSClipLog.e(str, "getDisplayRangeOfTemplateAsset templateClip not found");
             return obj;
          }else {
             Minecraft$TemplateReference templateRefe = templateClip.mediaReference();
             if (templateRefe == null) {
                KSClipLog.e(str, "getDisplayRangeOfTemplateAsset templateReference null");
                return obj;
             }else {
                Iterator iterator = templateRefe.visibleTimes().iterator();
                while (iterator.hasNext()) {
                   Minecraft$Range range = iterator.next();
                   if ((Long.toString(range.id())).equals(p1.clipId())) {
                      obj.setStart(range.start());
                      obj.setDuration(range.duration());
                      break ;
                   }
                }
             }
          }
       }
       return obj;
    }
    public static List getIndexListForAllMatchedAnimatedSubAssets(EditorSdk2V2$VideoEditorProject p0,String p1){
       ArrayList obj = PatchProxy.applyTwoRefs(p0, p1, null, ClipMvUtils.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       if (p1 != null && (p0 != null && (p0.animatedSubAssets() != null && p0.animatedSubAssetsSize() > 0))) {
          int i = 0;
          while (i < p0.animatedSubAssetsSize()) {
             if ((p0.animatedSubAssets(i).externalAssetId()).equals(p1)) {
                obj.add(new Integer(i));
             }
             i = i + 1;
          }
       }
    label_0045 :
       return obj;
    }
    public static List getListForAllMatchedTrackAssets(EditorSdk2V2$VideoEditorProject p0,String p1){
       ArrayList obj = PatchProxy.applyTwoRefs(p0, p1, null, ClipMvUtils.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       if (p1 != null && (p0 != null && (p0.trackAssets() != null && p0.trackAssetsSize() > 0))) {
          int i = 0;
          while (i < p0.trackAssetsSize()) {
             EditorSdk2V2$TrackAsset trackAsset = p0.trackAssets(i);
             if ((Long.toString(trackAsset.assetId())).equals(p1)) {
                obj.add(trackAsset);
             }
             i = i + 1;
          }
       }
    label_0044 :
       return obj;
    }
    public static ClipMvUtils$ClipMaterialType getMaterialType(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ClipMvUtils.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String separator = File.separator;
       if (!new File(p0+separator+"config.json").exists()) {
          return ClipMvUtils$ClipMaterialType.ClipMaterialTypeNoConfig;
       }
       if (!new File(p0+separator+"assets.json").exists()) {
          return ClipMvUtils$ClipMaterialType.ClipMaterialTypeNoAssets;
       }
       if (!new File(p0+separator+"settings.json").exists()) {
          return ClipMvUtils$ClipMaterialType.ClipMaterialTypeNoSetings;
       }
       return ClipMvUtils$ClipMaterialType.ClipMaterialTypeDefault;
    }
    public static double getMvDurationIfNeeded(JSONObject p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ClipMvUtils.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       int i = p0.optInt("fr");
       int i1 = p0.optInt("ip");
       int i2 = p0.optInt("op");
       if (i > 0 && i2 > 0) {
          return (((double)(i2 - i1) * 0x408f400000000000) / (double)i);
       }
       return 0;
    }
    public static int getNewSparkFallbackTemplateVersion(){
       return NewSparkTemplateDefine.fallbackTemplateVersion;
    }
    public static int getNewSparkTemplateVersion(){
       return NewSparkTemplateDefine.templateVersion;
    }
    public static ClipMvUtils$RectanglePos getRectanglePosForCropOptions(int p0,int p1,Minecraft$CropOptions p2){
       if (PatchProxy.isSupport(ClipMvUtils.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, null, ClipMvUtils.class, "55");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Minecraft$AssetTransform uAssetTransf = p2.transform();
       ClipMvUtils$RectanglePos rectanglePos = new ClipMvUtils$RectanglePos();
       rectanglePos.positionX = uAssetTransf.positionX();
       rectanglePos.positionY = uAssetTransf.positionY();
       rectanglePos.relativeW = ((double)p0 * uAssetTransf.scaleX()) / (double)p2.width();
       rectanglePos.relativeH = ((double)p1 * uAssetTransf.scaleY()) / (double)p2.height();
       return rectanglePos;
    }
    public static EditorSdk2MvReplaceableDetail getReplaceableAreaDetail(AllMvReplaceableAreaDetail p0,int p1){
       ClipMvUtils uClipMvUtils = ClipMvUtils.class;
       if (PatchProxy.isSupport(uClipMvUtils)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uClipMvUtils, "61");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 != null && p0.details != null) {
          int i = 0;
          while (i < p0.details.size()) {
             MvReplaceableAreaDetail mvReplaceabl = p0.details.get(i);
             MvReplaceableAreaDetail info = mvReplaceabl.info;
             if (info != null && p1 == info.time) {
                return new EditorSdk2MvReplaceableDetailImpl(mvReplaceabl);
             }
             i = i + 1;
          }
       }
       return null;
    }
    public static List getReplaceableAreaDetails(AllMvReplaceableAreaDetail p0,int p1){
       ArrayList obj1;
       ClipMvUtils uClipMvUtils = ClipMvUtils.class;
       MvReplaceableAreaDetail obj = null;
       if (PatchProxy.isSupport(uClipMvUtils)) {
          obj1 = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), obj, uClipMvUtils, "62");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       if (p0 != null) {
          obj1 = new ArrayList();
          int i = 0;
          while (i < p0.details.size()) {
             obj = p0.details.get(i);
             MvReplaceableAreaDetail info = obj.info;
             if (info != null && p1 == info.time) {
                obj1.add(new EditorSdk2MvReplaceableDetailImpl(obj));
             }
             i = i + 1;
          }
          return obj1;
       }else {
          return obj;
       }
    }
    public static Minecraft$Size getResourceSize(String p0){
       EditorSdk2$ProbedFile obj = PatchProxy.applyOneRefs(p0, null, ClipMvUtils.class, "41");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new EditorSdk2$ProbedFile();
          obj = EditorSdk2Utils.openFile(p0);
       }catch(com.kwai.video.editorsdk2.EditorSdk2InternalErrorException e4){
          KSClipLog.e("ClipMVUtils", "openFile EditorSdk2InternalErrorException error "+e4);
          e4.printStackTrace();
       }catch(java.io.IOException e4){
          KSClipLog.e("ClipMVUtils", "openFile IOException error "+e4);
          e4.printStackTrace();
       }
       Minecraft$Size size = new Minecraft$Size();
       size.setWidth(EditorSdk2Utils.getProbedFileWidth(obj));
       size.setHeight(EditorSdk2Utils.getProbedFileHeight(obj));
       return size;
    }
    public static double getSegmentDuration(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ClipMvUtils.class, "47");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       double d = Double.MAX_VALUE;
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          ClipAICut$TemplateAssetInfo templateAsse = iterator.next();
          if (templateAsse != null) {
             ClipAICut$TemplateAssetInfo clippedRange = templateAsse.clippedRange;
             if (clippedRange != null && clippedRange.duration() > 0) {
                d = Math.min(d, templateAsse.clippedRange.duration());
             }
          }
       }
       return d;
    }
    public static ClipAICut$TemplateAssetInfo getTemplateAssetInfoByRefId(List p0,String p1){
       ClipAICut$TemplateAssetInfo obj = PatchProxy.applyTwoRefs(p0, p1, null, ClipMvUtils.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null || p0.isEmpty()) {
          KSClipLog.e("ClipAICut", "getTemplateAssetInfoByRefId templateAssetInfos is null");
          return null;
       }else {
          Iterator iterator = p0.iterator();
          while (true) {
             if (!iterator.hasNext()) {
                return null;
             }
             obj = iterator.next();
             if ((obj.refId).equals(p1)) {
                break ;
             }
          }
          return obj;
       }
    }
    public static ClipAICut$TemplateAssetInfo getTemplateAssetInfoByRefIdInSegmentInfos(List p0,String p1){
       Iterator obj = PatchProxy.applyTwoRefs(p0, p1, null, ClipMvUtils.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null && !p0.isEmpty()) {
          int i = 0;
          if (p0.get(i).templateAssetInfos != null && !p0.get(i).templateAssetInfos.isEmpty()) {
             Iterator iterator = p0.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   obj = iterator.next().templateAssetInfos.iterator();
                   while (true) {
                      if (obj.hasNext()) {
                         ClipAICut$TemplateAssetInfo templateAsse = obj.next();
                         if ((templateAsse.refId).equals(p1)) {
                            return templateAsse;
                         }
                      }else {
                         continue ;
                      }
                   }
                   return null;
                }else {
                   goto label_005d ;
                }
             }
          }
       }
       KSClipLog.e("ClipAnnualAlbum", "getTemplateAssetInfoByRefIdInSegmentInfos templateSegmentInfos or templateAssetInfos is null");
       return null;
    }
    public static double getTemplateScore(AE2Project p0){
       String obj = PatchProxy.applyOneRefs(p0, null, ClipMvUtils.class, "66");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       obj = "ClipMVUtils";
       double d = 0;
       if (p0 == null) {
          EditorSdkLogger.e(obj, "getTemplateScore: AE2Project is null!");
          return d;
       }else {
          try{
             p0.lock();
             d = (double)Profiler.getResourceScore(p0).total();
          }catch(java.lang.Exception e3){
             EditorSdkLogger.e(Profiler.getResourceScore(p0).total(), "Fail to getResourceScore", e3);
          }
          p0.unlock();
          return d;
       }
    }
    public static double getTemplateScoreVersion(AE2Project p0){
       p0 = PatchProxy.applyOneRefs(p0, null, ClipMvUtils.class, "67");
       if (p0 != PatchProxyResult.class) {
          return p0.doubleValue();
       }
       return (double)Profiler.getResourceScoreVersion();
    }
    public static Bitmap getThumbnailBitmap(String p0,int p1,int p2,double p3){
       EditorSdk2V2$TrackAsset obj;
       int i;
       object oobject;
       if (PatchProxy.isSupport(ClipMvUtils.class)) {
          obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Double.valueOf(p3), null, ClipMvUtils.class, "46");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       EditorSdk2V2$VideoEditorProject videoEditorP = new EditorSdk2V2$VideoEditorProject();
       try{
          i = 0;
          obj = EditorSdk2UtilsV2.openTrackAsset(p0);
       label_0066 :
          EditorSdk2V2$TrackAsset[] trackAssetAr = new EditorSdk2V2$TrackAsset[]{oobject};
          videoEditorP.setTrackAssets(trackAssetAr);
          ThumbnailGenerator thumbnailGen = new ThumbnailGenerator(null, 0, p1, p2, 0, 0);
          oobject.setProject(videoEditorP, i);
          oobject.release();
          return oobject.getThumbnailSync(oobject.newRequestBuilder().setPositionByFilePositionSec(p0, p3).setThumbnailSize(p1, p2).build()).getThumbnailBitmap();
       }catch(com.kwai.video.editorsdk2.EditorSdk2InternalErrorException e0){
          Object obj1 = e0;
          KSClipLog.e("ClipMVUtils", "getThumbnailBitmap EditorSdk2InternalErrorException error "+obj1);
          obj1.printStackTrace();
       }catch(java.io.IOException e0){
          obj1 = e0;
          KSClipLog.e("ClipMVUtils", "getThumbnailBitmap IOException error "+obj1);
          obj1.printStackTrace();
       }
       oobject = i;
       goto label_0066 ;
    }
    public static int getTrackAssetIndexByRefId(EditorSdk2V2$VideoEditorProject p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, ClipMvUtils.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p1 != null && (p0 != null && (p0.trackAssets() != null && p0.trackAssetsSize() > 0))) {
          int i = 0;
          while (i < p0.trackAssetsSize()) {
             if ((Long.toString(p0.trackAssets(i).assetId())).equals(p1)) {
                return i;
             }
             i = i + 1;
          }
       }
       return -1;
    }
    public static void initSparkLog(){
       if (PatchProxy.applyVoid(null, null, ClipMvUtils.class, "25")) {
          return;
       }
       if (ClipMvUtils.sSparkLogInited) {
          return;
       }
       KSClipLog.i("ClipMVUtils", "initSparkLog");
       NewSparkTemplateManager.setNewSparkLogger(new ClipMvUtils$3());
       ClipMvUtils.sSparkLogInited = true;
       return;
    }
    public static void innerSetMvAssetInfo(EditorSdk2MvAssetImpl p0,Map p1,long p2,int p3,int p4,double p5,double p6){
       ClipMvUtils uClipMvUtils = ClipMvUtils.class;
       if (PatchProxy.isSupport(uClipMvUtils)) {
          Object[] objArray = new Object[]{p0,p1,Long.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Double.valueOf(p5),Double.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, null, uClipMvUtils, "17")) {
             return;
          }
       }
       p0.setWidth(p3);
       p0.setHeight(p4);
       p0.setIsReplaceable(1);
       p0.setClipedRange(EditorSdk2Utils.createTimeRange(0, p5));
       EditorSdk2$TimeRange timeRange = EditorSdk2Utils.createTimeRange(p6, p5);
       ArrayList uArrayList = new ArrayList();
       uArrayList.add(timeRange);
       p0.setVisibleTimeRanges(uArrayList);
       p1.put(Long.valueOf(p2), timeRange);
       return;
    }
    public static boolean isEmpty(CharSequence p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ClipMvUtils.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 == null || !p0.length())? true: false;
       return b;
    }
    public static boolean isNeedPreTranscode(int p0,ClipMvUtils$TemplatePreTranscodeFuncType p1){
       return true;
    }
    public static boolean isTextAsset(JSONObject p0){
       String str = "t";
       Object obj = PatchProxy.applyOneRefs(p0, null, ClipMvUtils.class, "65");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       try{
          if (p0.has(str) && p0.get(str).equals("text")) {
             b = true;
          }
       label_002a :
          return b;
       }catch(org.json.JSONException e0){
       }
    }
    public static String musicConfigPath(String p0){
       File obj = PatchProxy.applyOneRefs(p0, null, ClipMvUtils.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new File(p0+File.separator+ClipMvUtilsForMvMaster.MUSIC_Effect_DIR);
       if (obj.isDirectory()) {
          return obj.getAbsolutePath();
       }
       return null;
    }
    public static MvReplaceableAreaDetail obtainReplaceableAreaDetail(long p0,Map p1,int p2,int p3){
       ReplaceableAreaInfo obj;
       if (PatchProxy.isSupport(ClipMvUtils.class)) {
          obj = PatchProxy.applyFourRefs(Long.valueOf(p0), p1, Integer.valueOf(p2), Integer.valueOf(p3), null, ClipMvUtils.class, "27");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ReplaceableAreaInfo();
       obj.refId = Long.toString(p0);
       obj.layerId = 0;
       EditorSdk2$RectF rectF = new EditorSdk2$RectF();
       rectF.setLeft(0);
       rectF.setTop(0);
       rectF.setRight((float)(p2 - 1));
       rectF.setBottom((float)(p3 - 1));
       obj.rect = rectF;
       MvPhotoInfo mvPhotoInfo = new MvPhotoInfo();
       if (p1 != null && p1.containsKey(Long.valueOf(p0))) {
          mvPhotoInfo.time = (int)((p1.get(Long.valueOf(p0)).start() + 0x3f747ae147ae147b) * 0x408f400000000000);
       }
       MvReplaceableAreaDetail mvReplaceabl = new MvReplaceableAreaDetail();
       ArrayList uArrayList = new ArrayList(1);
       mvReplaceabl.replaceableAreaDetail = uArrayList;
       uArrayList.add(obj);
       mvReplaceabl.info = mvPhotoInfo;
       return mvReplaceabl;
    }
    public static JSONArray parseAssetsArray(String p0){
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, ClipMvUtils.class, "57");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       p0 = ClipMvUtils.readJsonFromFile(p0);
       if (TextUtils.isEmpty(p0)) {
          return obj;
       }
       try{
          return new JSONArray(p0);
       }catch(org.json.JSONException e3){
          throw new EditorSdk2MvCreationException("Error parsing assets.json", e3);
       }
    }
    public static ClipkitSdk$ClipKitBackgroundVideo parseBackgroundVideo(JSONObject p0,String p1,double p2){
       ClipkitSdk$ClipKitBackgroundVideo obj;
       String str1;
       if (PatchProxy.isSupport(ClipMvUtils.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Double.valueOf(p2), null, ClipMvUtils.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ClipkitSdk$ClipKitBackgroundVideo();
       String str = "width";
       if (p0.has(str)) {
          obj.width = p0.getInt(str);
       }
       str = "height";
       if (p0.has(str)) {
          obj.height = p0.getInt(str);
       }
       if (p2 > 0) {
          obj.duration = p2;
       }else {
          str1 = "duration";
          if (p0.has(str1)) {
             obj.duration = (double)p0.getInt(str1) / 0x408f400000000000;
          }
       }
       str1 = "backgroundVideo";
       if (p0.has(str1)) {
          str1 = p0.getString(str1);
          if (str1 != null && str1.length() > 0) {
             File uFile = new File(p1, str1);
             if (uFile.exists() && uFile.isFile()) {
                obj.fileName = str1;
                obj.fullPath = uFile.toString();
                obj.type = 0;
             }else if(str1.contains("backgroundVideo/%")){
                obj.fileName = str1;
                obj.fullPath = uFile.toString();
                obj.type = 1;
             }
          }
          if (obj.fullPath != null) {
             obj.blendMode = p0.optInt("blendMode", 0);
             obj.renderOrder = p0.optInt("order", 0);
             obj.restoreAlpha = p0.optBoolean("restoreAlpha", true);
          }
       }
       KSClipLog.i("ClipMVUtils", "createProjectWithTemplate subBackgroundVideo info -- fullPath: "+obj.fullPath+" blendMode: "+obj.blendMode+" renderOrder: "+obj.renderOrder+" restoreAlpha: "+obj.restoreAlpha+" duration: "+obj.duration+" width: "+obj.width+" height: "+obj.height);
       return obj;
    }
    public static JSONObject parseObjectWithJsonString(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ClipMvUtils.class, "58");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p0)) {
          return null;
       }
       try{
          return new JSONObject(p0);
       }catch(org.json.JSONException e0){
          throw new EditorSdk2MvCreationException("Error parsing "+p0, e0);
       }
    }
    public static JSONObject parseSettingsJson(String p0){
       Object obj = null;
       String obj1 = PatchProxy.applyOneRefs(p0, obj, ClipMvUtils.class, "59");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (!new File(p0).exists()) {
          return obj;
       }
       obj1 = ClipMvUtils.readJsonFromFile(p0);
       if (TextUtils.isEmpty(obj1)) {
          return obj;
       }
       try{
          return new JSONObject(obj1);
       }catch(org.json.JSONException e0){
          throw new EditorSdk2MvCreationException("Error parsing "+p0, e0);
       }
    }
    public static AE2Project parseToAE2Project(File p0,File p1,int p2,String p3){
       AE2Parser$Resource obj;
       if (PatchProxy.isSupport(ClipMvUtils.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), p3, null, ClipMvUtils.class, "64");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new AE2Parser$Resource();
       obj.setAssetDir(p0.getAbsolutePath());
       obj.setJsonFile(p1.getAbsolutePath());
       obj.setKeyInt(p2);
       if (p3 != null && new File(p3).exists()) {
          obj.setFontPath(p3);
       }
       EditorSdkLogger.i("ClipMVUtils", "parseToAE2Project aeFile:"+p0+",jsonFile:"+p1+",encyptedMethod:"+p2+",fontPath:"+p3);
       AE2Project uAE2Project = AE2Parser.parseProjectFromResource(obj);
       if (!uAE2Project.isValid()) {
          EditorSdkLogger.e("ClipMVUtils", "Fail to create AE2Project is invalid. Check your config file");
          uAE2Project = null;
       }
       return uAE2Project;
    }
    public static String readJsonFromFile(String p0){
       FileInputStream obj = PatchProxy.applyOneRefs(p0, null, ClipMvUtils.class, "60");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new FileInputStream(p0);
       byte[] uobyteArray = new byte[obj.available()];
       obj.read(uobyteArray);
       obj.close();
       return new String(uobyteArray, "UTF-8");
    }
    public static Minecraft$CropOptions replaceFileForAllMatchedAVClips(MutableTimeline p0,EditorSdk2MvCreationResult p1,String p2,String p3){
       ArrayList obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, ClipMvUtils.class, "82");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = ClipMvUtils.getArrayForAllMatchedAVClips(p0, p2);
       Iterator iterator = obj.iterator();
       while (iterator.hasNext()) {
          EditorSdk2UtilsV2.replaceAVClipFile(iterator.next(), p3);
       }
       Minecraft$CropOptions cropOptionsB = ClipMvUtils.getCropOptionsByAssetSizeAndRefId(EditorSdk2UtilsV2.getReplaceableAVClipWidth(obj.get(0)), EditorSdk2UtilsV2.getReplaceableAVClipHeight(obj.get(0)), p1, p2, 16);
       ClipMvUtils.setCropOptionsForAllMatchedAVClips(p0, p2, cropOptionsB);
       return cropOptionsB;
    }
    public static Minecraft$CropOptions replaceFileForAllMatchedAVClipsInEditorSdk2V2(EditorSdk2V2$VideoEditorProject p0,EditorSdk2MvCreationResult p1,String p2,String p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, ClipMvUtils.class, "75");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ClipMvUtils.replaceFileForAllMatchedAVClips(p0.getTemplateTimeline(), p1, p2, p3);
    }
    public static Minecraft$CropOptions replaceFileForAllMatchedAVClipsWithFlagInEditorSdk2V2(EditorSdk2V2$VideoEditorProject p0,EditorSdk2MvCreationResult p1,String p2,String p3,int p4){
       ArrayList obj;
       ClipMvUtils uClipMvUtils = ClipMvUtils.class;
       if (PatchProxy.isSupport(uClipMvUtils)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4)};
          obj = PatchProxy.apply(objArray, null, uClipMvUtils, "76");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = ClipMvUtils.getArrayForAllMatchedAVClips(p0.getTemplateTimeline(), p2);
       Iterator iterator = obj.iterator();
       while (iterator.hasNext()) {
          EditorSdk2UtilsV2.replaceAVClipFile(iterator.next(), p3);
       }
       Minecraft$CropOptions cropOptionsB = ClipMvUtils.getCropOptionsByAssetSizeAndRefId(EditorSdk2UtilsV2.getReplaceableAVClipWidth(obj.get(0)), EditorSdk2UtilsV2.getReplaceableAVClipHeight(obj.get(0)), p1, p2, p4);
       ClipMvUtils.setCropOptionsForAllMatchedAVClips(p0.getTemplateTimeline(), p2, cropOptionsB);
       return cropOptionsB;
    }
    public static Minecraft$CropOptions replaceFileForAllMatchedAssets(EditorSdk2V2$VideoEditorProject p0,EditorSdk2MvCreationResult p1,String p2,String p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, ClipMvUtils.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ClipMvUtils.replaceFileForAllMatchedAssets(p0, p1, p2, p3, 16);
    }
    public static Minecraft$CropOptions replaceFileForAllMatchedAssets(EditorSdk2V2$VideoEditorProject p0,EditorSdk2MvCreationResult p1,String p2,String p3,int p4){
       ClipMvUtils uClipMvUtils = ClipMvUtils.class;
       if (PatchProxy.isSupport(uClipMvUtils)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, null, uClipMvUtils, "52");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          return ClipMvUtils.replaceFileForAllMatchedAVClipsWithFlagInEditorSdk2V2(p0, p1, p2, p3, p4);
       }catch(com.kwai.video.editorsdk2.EditorSdk2InternalErrorException e6){
          KSClipLog.e(v0, "replaceFileForAllMatchedAVClipsWithFlagInEditorSdk2V2 EditorSdk2InternalErrorException error "+e6);
          e6.printStackTrace();
       }catch(java.io.IOException e6){
          KSClipLog.e(v0, "replaceFileForAllMatchedAVClipsWithFlagInEditorSdk2V2 IOException error "+e6);
          e6.printStackTrace();
       }
       return v3;
    }
    public static boolean replaceFontPathInEditorProject(EditorSdk2V2$VideoEditorProject p0,String p1,String p2){
       Minecraft$Opening obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, ClipMvUtils.class, "70");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (TextUtils.isEmpty(p1) || TextUtils.isEmpty(p2)) {
          EditorSdkLogger.e("[replaceFontPathInEditorProject] refId or fontPath is null");
          return false;
       }else {
          obj = new Minecraft$Opening();
          Map map = obj.fontMap().getMap();
          map.put(p1, p2);
          obj.setFontMap(new ImmutableMap(map));
          MinecraftUtils.GetTemplateClipFromTimeline(p0.getTemplateTimeline()).setOpening(obj);
          return true;
       }
    }
    public static boolean replaceTextForAllMatchedInEditorProject(EditorSdk2V2$VideoEditorProject p0,String p1,String p2){
       Minecraft$Opening obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, ClipMvUtils.class, "69");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (TextUtils.isEmpty(p1) || TextUtils.isEmpty(p2)) {
          EditorSdkLogger.e("[replaceFontPathInEditorProject] refId or fontPath is null");
          return false;
       }else {
          Minecraft$TemplateClip templateClip = MinecraftUtils.GetTemplateClipFromTimeline(p0.getTemplateTimeline());
          if (templateClip.opening() == null) {
             templateClip.setOpening(new Minecraft$Opening());
          }
          obj = templateClip.opening();
          Map map = obj.textMap().getMap();
          map.put(p1, p2);
          obj.setTextMap(new ImmutableMap(map));
          templateClip.setOpening(obj);
          return true;
       }
    }
    public static void saveBitmapToFile(Bitmap p0,String p1,Bitmap$CompressFormat p2){
       File uFile;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, ClipMvUtils.class, "45")) {
          return;
       }
       try{
          uFile = new File(p1);
          if (!p0.compress(p2, 100, new FileOutputStream(uFile))) {
             throw new IOException("bitmap compress failure:"+p0.getByteCount());
          }
       }catch(java.io.IOException e6){
          KSClipLog.w("ClipMVUtils", "saveBitmapToFile file: "+uFile+" IOException error "+e6);
          e6.printStackTrace();
       }
       return;
    }
    public static int setCropOptionsForAllMatchedAVClips(MutableTimeline p0,String p1,Minecraft$CropOptions p2){
       Iterator obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, ClipMvUtils.class, "83");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       ArrayList arrayForAllM = ClipMvUtils.getArrayForAllMatchedAVClips(p0, p1);
       obj = arrayForAllM.iterator();
       while (obj.hasNext()) {
          obj.next().setCropOptions(p2);
       }
       if (p2 != null && p2.transform() != null) {
          KSClipLog.i("ClipMVUtils", "setCropOptionsForAllMatchedAVClips refId: "+p1+" cropOptions width: "+p2.width()+" height: "+p2.height()+" rotate: "+p2.transform().rotate());
       }
       return arrayForAllM.size();
    }
    public static int setCropOptionsForAllMatchedAVClipsInEditorSdk2V2(EditorSdk2V2$VideoEditorProject p0,String p1,Minecraft$CropOptions p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, ClipMvUtils.class, "74");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ClipMvUtils.setCropOptionsForAllMatchedAVClips(p0.getTemplateTimeline(), p1, p2);
    }
    public static void setKwaiMvParams(KwaiMvParam p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, ClipMvUtils.class, "32")) {
          return;
       }
       p0.templateDirectory = p1;
       ClipkitSdk$ClipKitBackgroundVideo uClipKitBack = new ClipkitSdk$ClipKitBackgroundVideo();
       p0.bgVideo = uClipKitBack;
       uClipKitBack.fullPath = p2;
       uClipKitBack.blendMode = 0;
       uClipKitBack.renderOrder = -1;
       return;
    }
    public static int setMvAssetInfoForNewSpark(Minecraft$KSAVClip p0,List p1,EditorSdk2MvAssetImpl p2,Map p3,int p4){
       Object obj;
       ClipMvUtils uClipMvUtils = ClipMvUtils.class;
       int i = 0;
       if (PatchProxy.isSupport(uClipMvUtils)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4)};
          obj = PatchProxy.apply(objArray, null, uClipMvUtils, "10");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = -1;
       while (i < p1.size()) {
          if ((Long.toString(p1.get(i).getAssetID())).equals(p0.clipId())) {
             obj = i;
             break ;
          }
          i = i + 1;
       }
       if (obj >= 0) {
          p0.setIsReplaceable(1);
          ReplaceableAsset replaceableA = p1.get(obj);
          ClipMvUtils.innerSetMvAssetInfo(p2, p3, replaceableA.getAssetID(), replaceableA.getWidth(), replaceableA.getHeight(), replaceableA.getRenderPosDuration(), replaceableA.getFixPlayBackPtsStart());
          p2.setMinClipDuration(p0.sourceRange().duration().toSeconds());
          if (!TextUtils.isEmpty(replaceableA.getCloudEffectServiceType())) {
             p2.setServiceType(replaceableA.getCloudEffectServiceType());
             p2.setReturnMediaType(replaceableA.getCloudEffectReturnMediaType());
             KSClipLog.i("ClipMVUtils", "SparkRecovery mvasset "+p2.getRefId()+" has cloud effect "+replaceableA.getCloudEffectServiceType()+", "+replaceableA.getCloudEffectReturnMediaType());
          }
       }
       return obj;
    }
    public static TextFilter$TextEffectConfig updateAudioAndLyricsConfig(String p0,String p1,EditorSdk2V2$VideoEditorProject p2,TextFilter$TextEffectConfig p3){
       EditorSdk2V2$AudioAsset[] obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, ClipMvUtils.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.isEmpty(p0) && (new File(p0).exists() && (TextUtils.isEmpty(p1) || !new File(p1).exists()))) {
          KSClipLog.e("ClipMVUtils", "audioPath or lyricsPath not exist");
          return null;
       }else {
          TextFilter$TextEffectConfig textEffectCo = ClipKitUtils.parseLyricsConfigFromFile(p1, p3, CGETextEffect$EffectType.Daoyazi);
          p2.trackAssets(0).setVolume(0);
          if (p2.audioAssets() == null || !p2.audioAssetsSize()) {
             obj = new EditorSdk2V2$AudioAsset[1];
             p2.setAudioAssets(obj);
          }
          try{
             p2.audioAssetsSetItem(0, EditorSdk2UtilsV2.openAudioAsset(p0));
             return textEffectCo;
          }catch(java.lang.Exception e0){
             KSClipLog.e(v2, "updateAudioAsset:"+p0+" failed");
             return v1;
          }
       }
    }
}
