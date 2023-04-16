package com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import java.lang.Object;
import com.kwai.video.minecraft.model.MutableTimeline;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$VideoEditorProjectPrivate;
import java.lang.String;
import com.kwai.video.minecraft.model.nano.Minecraft$InputFileOptions;
import com.kwai.video.minecraft.model.nano.Minecraft$KSAVClip;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ProbedFile;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.video.editorsdk2.logger.EditorSdkLogger;
import com.kwai.video.minecraft.model.EditorSdk2V2$AnimatedSubAsset;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ProbedStream;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import com.kwai.video.minecraft.model.EditorSdk2V2$AudioAsset;
import java.lang.Number;
import com.kwai.video.minecraft.model.MutableTrack;
import com.kwai.video.minecraft.model.nano.Minecraft$TemplateClip;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import java.util.Iterator;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import com.kwai.video.minecraft.model.MutableClip;
import com.kwai.video.minecraft.model.ErrorStatus;
import com.kwai.video.minecraft.model.nano.Minecraft$AlbumPhotos;
import java.lang.Integer;
import com.kwai.video.minecraft.model.nano.Minecraft$TemplateReference;
import com.kwai.video.minecraft.model.MutableMediaReference;
import com.kwai.video.minecraft.model.nano.Minecraft$RationalV2;
import com.kwai.video.minecraft.model.TimeRange;
import java.lang.Double;
import com.kwai.video.minecraft.model.RationalTime;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$Rational;
import com.kwai.video.editorsdk2.EditorSdk2InternalErrorException;
import java.lang.Math;
import com.kwai.video.minecraft.model.EditorSdk2V2$TimeRangeImpl;
import com.kwai.video.minecraft.model.EditorSdk2V2$TimeRangeV2;
import com.kwai.video.editorsdk2.EditorSdk2Utils$AssetLayoutInfo;
import com.kwai.video.editorsdk2.EditorSdk2Utils$PreviewSizeLimitation;
import java.util.ArrayList;
import com.kwai.video.minecraft.model.Track;
import com.kwai.video.minecraft.model.MediaReference;
import com.kwai.video.minecraft.model.nano.Minecraft$AudioVideoReference;
import java.lang.StringBuilder;
import java.lang.Exception;
import java.io.IOException;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.util.Pair;
import com.kwai.video.minecraft.model.nano.Minecraft$Size;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2$1;
import java.lang.Enum;
import com.kwai.video.minecraft.model.MinecraftModelDefine$MediaReferenceType;
import com.kwai.video.minecraft.model.nano.Minecraft$StickerReference;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$EditorSdkError;
import com.kwai.video.minecraft.model.MinecraftModelDefine$ClipType;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$TimeRange;
import com.kwai.video.minecraft.model.nano.Minecraft$TransitionParam;
import java.util.List;
import com.kwai.video.editorsdk2.a.b;
import com.kwai.video.minecraft.model.MutableItem;
import com.kwai.video.minecraft.model.Effect;
import com.kwai.video.minecraft.model.MinecraftModelDefine$EffectType;
import java.io.File;
import android.graphics.BitmapFactory$Options;
import com.kwai.video.minecraft.MinecraftUtils;
import com.kwai.video.editorsdk2.RenderPosDetail;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$PrivateRenderPosDetail;
import com.kwai.video.editorsdk2.am;
import java.lang.Throwable;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ExportOptions;

public class EditorSdk2UtilsV2	// class@0009ee
{

    public void EditorSdk2UtilsV2(){
       super();
    }
    public static native double CalcTimelineDurationNative(MutableTimeline p0);
    public static native double CalcTimelineRenderDurationNative(MutableTimeline p0,boolean p1,EditorSdk2$VideoEditorProjectPrivate p2);
    public static native int CreateAudioVideoClipNative(String p0,Minecraft$InputFileOptions p1,Minecraft$KSAVClip p2,EditorSdk2$ProbedFile p3);
    public static boolean FillProjectPrivateDimensionIfNeeded(EditorSdk2V2$VideoEditorProject p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditorSdk2UtilsV2.class, "77");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null) {
          EditorSdkLogger.e("[FillProjectPrivateDimensionIfNeeded] project null");
          return false;
       }else if(p0.mProjectPrivate == null){
          p0.mProjectPrivate = new EditorSdk2$VideoEditorProjectPrivate();
       }
       if (p0.mProjectPrivate.computedWidth() > 0 && p0.mProjectPrivate.computedHeight() > 0) {
          return false;
       }else {
          return EditorSdk2UtilsV2.FillProjectPrivateDurationAndDimension(p0);
       }
    }
    public static boolean FillProjectPrivateDurationAndDimension(EditorSdk2V2$VideoEditorProject p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditorSdk2UtilsV2.class, "76");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       MutableTimeline mutableTimel = p0.constructTimelineBone();
       if (mutableTimel == null) {
          EditorSdkLogger.e("[KSEFillProjectPrivateDurationAndDimension] constructTimelineBone fail");
          return b;
       }else {
          EditorSdk2UtilsV2.FillProjectPrivateDurationAndDimensionNative(EditorSdk2UtilsV2.NormalizeTimelineNative(mutableTimel), p0.isKwaiPhotoMovie(), p0.mProjectPrivate);
          return true;
       }
    }
    public static native void FillProjectPrivateDurationAndDimensionNative(MutableTimeline p0,boolean p1,EditorSdk2$VideoEditorProjectPrivate p2);
    public static native int LoadTimelineAndProjectPrivateNative(MutableTimeline p0,boolean p1,EditorSdk2$VideoEditorProjectPrivate p2,boolean p3,int p4);
    public static native MutableTimeline NormalizeTimelineNative(MutableTimeline p0);
    public static EditorSdk2$ProbedStream animatedSubAssetProbedVideoStream(EditorSdk2V2$AnimatedSubAsset p0){
       EditorSdk2V2$AnimatedSubAsset obj = PatchProxy.applyOneRefs(p0, null, EditorSdk2UtilsV2.class, "71");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          obj = p0.mProbedAssetFile;
          if (obj != null) {
             return p0.mProbedAssetFile.streams(obj.videoStreamIndex());
          }
       }
       return null;
    }
    public static void animatedSubAssetReplaceFile(EditorSdk2V2$AnimatedSubAsset p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, EditorSdk2UtilsV2.class, "43")) {
          return;
       }
       p0.mProbedAssetFile = EditorSdk2UtilsV2.openAnimatedSubAsset(p1).mProbedAssetFile;
       p0.setAssetPath(p1);
       p0.setDataId(EditorSdk2Utils.getRandomID());
       p0.setAssetId(EditorSdk2Utils.getRandomID());
       return;
    }
    public static double audioAssetProbedDuration(EditorSdk2V2$AudioAsset p0){
       EditorSdk2V2$AudioAsset obj = PatchProxy.applyOneRefs(p0, null, EditorSdk2UtilsV2.class, "72");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       if (p0 != null) {
          obj = p0.mProbedAssetFile;
          if (obj != null) {
             obj.videoStreamIndex();
             return p0.mProbedAssetFile.duration();
          }
       }
       return 0;
    }
    public static double avClipProbedFileDuration(Minecraft$KSAVClip p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditorSdk2UtilsV2.class, "67");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       double d = 0;
       if (p0 == null) {
          return d;
       }
       EditorSdk2$ProbedFile probedFileFr = EditorSdk2UtilsV2.getProbedFileFromCache(p0);
       if (probedFileFr == null) {
          return d;
       }
       return probedFileFr.duration();
    }
    public static boolean clearTemplateClipIfNeed(EditorSdk2V2$VideoEditorProject p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditorSdk2UtilsV2.class, "97");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null) {
          EditorSdkLogger.e("[EditorSdk2UtilsV2][clearTemplateClipFromProject] project is null");
          return false;
       }else {
          MutableTrack templateTrac = EditorSdk2UtilsV2.getTemplateTrackFromTimeline(p0.getTemplateTimeline());
          Minecraft$TemplateClip templateClip = EditorSdk2UtilsV2.getTemplateClipFromTimeline(p0.getTemplateTimeline());
          if (templateTrac != null && (templateClip != null && templateClip.irreplaceableClipsSize() > 0)) {
             Minecraft$KSAVClip kSAVClip = templateClip.irreplaceableClips(false);
             if (p0.trackAssets() != null && p0.trackAssets().isNotEmpty()) {
                Iterator iterator = p0.trackAssets().iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      EditorSdk2V2$TrackAsset trackAsset = iterator.next();
                      if (trackAsset != null && ((trackAsset.getMainClip().clipId()).equals(kSAVClip.clipId()) && (trackAsset.getMainClip().aeRefId()).equals(kSAVClip.aeRefId()))) {
                         kSAVClip = 1;
                      label_0089 :
                         if (!kSAVClip) {
                            p0.mIsTemplateMainTrack = false;
                            ErrorStatus uErrorStatus = new ErrorStatus();
                            if (!templateTrac.deleteClip(templateClip.clipId(), uErrorStatus)) {
                               Object[] objArray = new Object[]{uErrorStatus.description()};
                               EditorSdkLogger.e(String.format("[EditorSdk2UtilsV2][clearTemplateClipFromProject] delete templateClip fail: %s", objArray));
                               return false;
                            }
                         }
                      }
                   }
                }
             }
             kSAVClip = 0;
             goto label_0089 ;
          }
       label_00ae :
          return 1;
       }
    }
    public static Minecraft$KSAVClip createAduioVideoClip(String p0,Minecraft$InputFileOptions p1,EditorSdk2$ProbedFile p2){
       Minecraft$KSAVClip obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, EditorSdk2UtilsV2.class, "78");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Minecraft$KSAVClip();
       EditorSdk2UtilsV2.CreateAudioVideoClipNative(p0, p1, obj, p2);
       return obj;
    }
    public static Minecraft$TemplateClip createAlbumTemplateClip(String p0,int p1,Minecraft$AlbumPhotos[] p2){
       Minecraft$TemplateClip obj;
       if (PatchProxy.isSupport(EditorSdk2UtilsV2.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, null, EditorSdk2UtilsV2.class, "80");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new Minecraft$TemplateClip();
       Minecraft$TemplateReference templateRefe = new Minecraft$TemplateReference();
       templateRefe.setAssetsDirectory(p0);
       templateRefe.setEncryptedMethod(p1);
       templateRefe.setAlbumPhtots(p2);
       obj.setTemplateType(6);
       obj.setMediaReference(templateRefe);
       return obj;
    }
    public static Minecraft$InputFileOptions createDefaultBfrOptions(){
       Minecraft$InputFileOptions obj = PatchProxy.apply(null, null, EditorSdk2UtilsV2.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Minecraft$InputFileOptions();
       obj.setFrameRate(new Minecraft$RationalV2());
       obj.frameRate().setNum(20);
       obj.frameRate().setDen(1);
       return obj;
    }
    public static TimeRange createMCTimeRange(double p0,double p1){
       EditorSdk2UtilsV2 uEditorSdk2U = EditorSdk2UtilsV2.class;
       if (PatchProxy.isSupport(uEditorSdk2U)) {
          Object obj = PatchProxy.applyTwoRefs(Double.valueOf(p0), Double.valueOf(p1), null, uEditorSdk2U, "88");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new TimeRange(EditorSdk2UtilsV2.createRationalTime(p0), EditorSdk2UtilsV2.createRationalTime(p1));
    }
    public static TimeRange createMCTimeRange(RationalTime p0,RationalTime p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, EditorSdk2UtilsV2.class, "89");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new TimeRange(p0, p1);
    }
    public static Minecraft$TemplateClip createNormalTemplateClip(int p0,String p1,int p2){
       Minecraft$TemplateClip obj;
       if (PatchProxy.isSupport(EditorSdk2UtilsV2.class)) {
          obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, Integer.valueOf(p2), null, EditorSdk2UtilsV2.class, "79");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new Minecraft$TemplateClip();
       Minecraft$TemplateReference templateRefe = new Minecraft$TemplateReference();
       templateRefe.setAssetsDirectory(p1);
       templateRefe.setEncryptedMethod(p2);
       obj.setTemplateType(p0);
       obj.setMediaReference(templateRefe);
       return obj;
    }
    public static EditorSdk2V2$VideoEditorProject createProjectWithBfrAndAudio(String p0,int p1,String p2){
       if (PatchProxy.isSupport(EditorSdk2UtilsV2.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, null, EditorSdk2UtilsV2.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return EditorSdk2UtilsV2.createProjectWithBfrAndAudio(p0, EditorSdk2Utils.createRational(1000, p1), p2);
    }
    public static EditorSdk2V2$VideoEditorProject createProjectWithBfrAndAudio(String p0,EditorSdk2$Rational p1,String p2){
       return null;
    }
    public static EditorSdk2V2$VideoEditorProject createProjectWithFile(String p0){
       Object obj = null;
       EditorSdk2V2$VideoEditorProject obj1 = PatchProxy.applyOneRefs(p0, obj, EditorSdk2UtilsV2.class, "1");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       obj1 = new EditorSdk2V2$VideoEditorProject();
       int i = 1;
       EditorSdk2V2$TrackAsset[] trackAssetAr = new EditorSdk2V2$TrackAsset[i];
       trackAssetAr[0] = EditorSdk2UtilsV2.openTrackAsset(p0, obj, obj);
       obj1.setTrackAssets(trackAssetAr);
       obj1.setProjectId(EditorSdk2Utils.getRandomID());
       if (EditorSdk2UtilsV2.FillProjectPrivateDurationAndDimension(obj1)) {
          return obj1;
       }
       Object[] objArray = new Object[i];
       objArray[0] = p0;
       EditorSdkLogger.e(String.format("[KSEVideoEditorProjectV2CreateWithFile] path:%s KSEFillProjectPrivateDurationAndDimension fail", objArray));
       Object[] objArray1 = new Object[i];
       objArray1[0] = p0;
       throw new EditorSdk2InternalErrorException(String.format("[KSEVideoEditorProjectV2CreateWithFile] path:%s KSEFillProjectPrivateDurationAndDimension fail", objArray1));
    }
    public static EditorSdk2V2$VideoEditorProject createProjectWithFileArray(String[] p0){
       Object[] obj = null;
       EditorSdk2V2$VideoEditorProject obj1 = PatchProxy.applyOneRefs(p0, obj, EditorSdk2UtilsV2.class, "4");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       obj1 = new EditorSdk2V2$VideoEditorProject();
       EditorSdk2V2$TrackAsset[] trackAssetAr = new EditorSdk2V2$TrackAsset[p0.length];
       for (int i = 0; i < p0.length; i = i + 1) {
          trackAssetAr[i] = EditorSdk2UtilsV2.openTrackAsset(p0[i], obj, obj);
       }
       obj1.setTrackAssets(trackAssetAr);
       obj1.setProjectId(EditorSdk2Utils.getRandomID());
       if (EditorSdk2UtilsV2.FillProjectPrivateDurationAndDimension(obj1)) {
          return obj1;
       }
       Object[] objArray = new Object[0];
       EditorSdkLogger.e(String.format("[createProjectWithFileArray] FillProjectPrivateDurationAndDimension fail", objArray));
       obj = new Object[0];
       throw new EditorSdk2InternalErrorException(String.format("[createProjectWithFileArray] FillProjectPrivateDurationAndDimension fail", obj));
    }
    public static EditorSdk2V2$VideoEditorProject createProjectWithPhotoArray(String[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditorSdk2UtilsV2.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return EditorSdk2UtilsV2.createProjectWithPhotoArray(p0, 2.00f, null, null);
    }
    public static EditorSdk2V2$VideoEditorProject createProjectWithPhotoArray(String[] p0,double p1,Minecraft$InputFileOptions p2,String p3){
       if (PatchProxy.isSupport(EditorSdk2UtilsV2.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Double.valueOf(p1), p2, p3, null, EditorSdk2UtilsV2.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 == null || !p0.length) {
          return null;
       }else if(p1 <= 0){
          p1 = 2.00f;
       }
       EditorSdk2V2$VideoEditorProject videoEditorP = new EditorSdk2V2$VideoEditorProject();
       EditorSdk2V2$TrackAsset[] trackAssetAr = new EditorSdk2V2$TrackAsset[p0.length];
       videoEditorP.setTrackAssets(trackAssetAr);
       if (p2 == null) {
          p2 = new Minecraft$InputFileOptions();
          p2.setFrameRate(EditorSdk2Utils.createRationalV2(1, (int)Math.ceil(p1)));
       }
       int i = 0;
       double d = 0x3ff0000000000000;
       while (i < p0.length) {
          EditorSdk2V2$TrackAsset trackAsset = new EditorSdk2V2$TrackAsset();
          trackAsset.setAssetPath(p0[i]);
          trackAsset.setAssetSpeed(d);
          trackAsset.setVolume(d);
          trackAsset.setClippedRange(new EditorSdk2V2$TimeRangeImpl(0, p1));
          trackAsset.setAssetPathOptions(p2);
          trackAsset.setAssetId(EditorSdk2Utils.getRandomID());
          videoEditorP.trackAssetsSetItem(i, trackAsset);
          i = i + 1;
       }
       videoEditorP.setIsKwaiPhotoMovie(1);
       videoEditorP.setProjectId(EditorSdk2Utils.getRandomID());
       if (p3 != null && !p3.equals("")) {
          EditorSdk2V2$AudioAsset[] uAudioAssetA = new EditorSdk2V2$AudioAsset[1];
          videoEditorP.setAudioAssets(uAudioAssetA);
          videoEditorP.audioAssetsSetItem(0, new EditorSdk2V2$AudioAsset());
          videoEditorP.audioAssets(0).setAssetId(EditorSdk2Utils.getRandomID());
          videoEditorP.audioAssets(0).setAssetPath(p3);
          videoEditorP.audioAssets(0).setVolume(d);
       }
       EditorSdk2UtilsV2.FillProjectPrivateDurationAndDimension(videoEditorP);
       return videoEditorP;
    }
    public static RationalTime createRationalTime(double p0){
       EditorSdk2UtilsV2 uEditorSdk2U = EditorSdk2UtilsV2.class;
       if (PatchProxy.isSupport(uEditorSdk2U)) {
          Object obj = PatchProxy.applyOneRefs(Double.valueOf(p0), null, uEditorSdk2U, "87");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return RationalTime.fromSeconds(p0);
    }
    public static EditorSdk2V2$TimeRangeV2 createTimeRange(double p0,double p1){
       EditorSdk2UtilsV2 uEditorSdk2U = EditorSdk2UtilsV2.class;
       if (PatchProxy.isSupport(uEditorSdk2U)) {
          Object obj = PatchProxy.applyTwoRefs(Double.valueOf(p0), Double.valueOf(p1), null, uEditorSdk2U, "73");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new EditorSdk2V2$TimeRangeImpl(p0, p1);
    }
    public static double getAVClipFps(Minecraft$KSAVClip p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditorSdk2UtilsV2.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       double d = 0;
       if (p0 == null) {
          return d;
       }
       EditorSdk2$ProbedStream aVClipStream = EditorSdk2UtilsV2.getAVClipStream(p0);
       if (aVClipStream == null || (aVClipStream.avgFrameRate() != null && aVClipStream.avgFrameRate().den())) {
          d = (double)aVClipStream.avgFrameRate().num() / (double)aVClipStream.avgFrameRate().den();
       }
    label_0047 :
       return d;
    }
    public static EditorSdk2$ProbedStream getAVClipStream(Minecraft$KSAVClip p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditorSdk2UtilsV2.class, "75");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       EditorSdk2$ProbedFile probedFileFr = EditorSdk2UtilsV2.getProbedFileFromCache(p0);
       if (probedFileFr != null && (probedFileFr.videoStreamIndex() < 0 || probedFileFr.streamsSize() <= probedFileFr.videoStreamIndex())) {
          return null;
       }
       return probedFileFr.streams(probedFileFr.videoStreamIndex());
    }
    public static EditorSdk2Utils$AssetLayoutInfo[] getAllAssetLayoutInfosV2(EditorSdk2V2$VideoEditorProject p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditorSdk2UtilsV2.class, "61");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return EditorSdk2UtilsV2.getAllAssetLayoutInfosV2(p0, EditorSdk2Utils$PreviewSizeLimitation.PREVIEW_SIZE_LIMITATION_DEFAULT);
    }
    public static EditorSdk2Utils$AssetLayoutInfo[] getAllAssetLayoutInfosV2(EditorSdk2V2$VideoEditorProject p0,EditorSdk2Utils$PreviewSizeLimitation p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, EditorSdk2UtilsV2.class, "62");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       EditorSdk2Utils$AssetLayoutInfo[] allAssetLayo = EditorSdk2UtilsV2.getAllAssetLayoutInfosV2Native(p0.constructTimelineBone(), p1.getValue(), p0.mProjectPrivate, p0.isKwaiPhotoMovie(), p0.projectOutputWidth(), p0.projectOutputHeight());
       if (allAssetLayo == null) {
          allAssetLayo = new EditorSdk2Utils$AssetLayoutInfo[0];
       }
       return allAssetLayo;
    }
    public static native EditorSdk2Utils$AssetLayoutInfo[] getAllAssetLayoutInfosV2Native(MutableTimeline p0,int p1,EditorSdk2$VideoEditorProjectPrivate p2,boolean p3,int p4,int p5);
    public static String[] getAllFilePathArrayInProject(EditorSdk2V2$VideoEditorProject p0){
       Object obj = null;
       ArrayList obj1 = PatchProxy.applyOneRefs(p0, obj, EditorSdk2UtilsV2.class, "64");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 == null) {
          return obj;
       }
       obj1 = new ArrayList();
       int i = 0;
       while (i < p0.getTemplateTimeline().tracks().size()) {
          Track track = p0.getTemplateTimeline().tracks().get(i);
          for (int i1 = 0; i1 < track.children().size(); i1 = i1 + 1) {
             obj1.add(track.children().get(i1).mediaReference().filePath());
          }
          i = i + 1;
       }
       String[] stringArray = new String[0];
       return obj1.toArray(stringArray);
    }
    public static int getAnimatedSubAssetHeight(EditorSdk2V2$AnimatedSubAsset p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditorSdk2UtilsV2.class, "49");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       EditorSdk2$ProbedStream animatedSubA = EditorSdk2UtilsV2.getAnimatedSubAssetVideoStream(p0);
       if (animatedSubA == null) {
          return 0;
       }
       int probedStream = (!(animatedSubA.rotation() % 180))? EditorSdk2UtilsV2.getProbedStreamHeight(animatedSubA): EditorSdk2UtilsV2.getProbedStreamWidth(animatedSubA);
       return probedStream;
    }
    public static EditorSdk2$ProbedStream getAnimatedSubAssetVideoStream(EditorSdk2V2$AnimatedSubAsset p0){
       String str = "EditorSdk2UtilsV2";
       EditorSdk2V2$AnimatedSubAsset obj = PatchProxy.applyOneRefs(p0, null, EditorSdk2UtilsV2.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       obj = p0.mProbedAssetFile;
       if (obj == null) {
          try{
             obj = EditorSdk2UtilsV2.openAnimatedSubAsset(p0.assetPath()).mProbedAssetFile;
          }catch(java.io.IOException e4){
             EditorSdkLogger.e(str, "openAnimatedSubAsset IOException error "+e4);
             e4.printStackTrace();
             return null;
          }catch(com.kwai.video.editorsdk2.EditorSdk2InternalErrorException e4){
             EditorSdkLogger.e(str, "openAnimatedSubAsset EditorSdk2InternalErrorException error "+e4);
             e4.printStackTrace();
             return null;
          }
       }
       if (obj != null && (obj.videoStreamIndex() < 0 || obj.streamsSize() <= obj.videoStreamIndex())) {
          return null;
       }else {
          return obj.streams(obj.videoStreamIndex());
       }
    }
    public static int getAnimatedSubAssetWidth(EditorSdk2V2$AnimatedSubAsset p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditorSdk2UtilsV2.class, "48");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       EditorSdk2$ProbedStream animatedSubA = EditorSdk2UtilsV2.getAnimatedSubAssetVideoStream(p0);
       if (animatedSubA == null) {
          return 0;
       }
       int probedStream = (!(animatedSubA.rotation() % 180))? EditorSdk2UtilsV2.getProbedStreamWidth(animatedSubA): EditorSdk2UtilsV2.getProbedStreamHeight(animatedSubA);
       return probedStream;
    }
    public static int getAssetOriginRotation(String p0){
       EditorSdk2V2$TrackAsset obj = PatchProxy.applyOneRefs(p0, null, EditorSdk2UtilsV2.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (TextUtils.isEmpty(p0)) {
          EditorSdkLogger.e("[EditorSdk2UtilsV2][getAssetOriginRotation] filePath is empty");
          return 0;
       }else {
          try{
             obj = new EditorSdk2V2$TrackAsset();
             obj = EditorSdk2UtilsV2.openTrackAsset(p0);
          }catch(com.kwai.video.editorsdk2.EditorSdk2InternalErrorException e4){
             EditorSdkLogger.e("EditorSdk2UtilsV2", "openTrackAsset EditorSdk2InternalErrorException error "+e4);
             e4.printStackTrace();
          }catch(java.io.IOException e4){
             EditorSdkLogger.e("EditorSdk2UtilsV2", "openTrackAsset IOException error "+e4);
             e4.printStackTrace();
          }
          return EditorSdk2UtilsV2.getTrackAssetOriginRotation(obj);
       }
    }
    public static ArrayList getBgAudioAssetInVideoEditorProject(EditorSdk2V2$VideoEditorProject p0){
       Object obj = null;
       ArrayList obj1 = PatchProxy.applyOneRefs(p0, obj, EditorSdk2UtilsV2.class, "86");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0.audioAssets() == null && !p0.audioAssets().isNotEmpty()) {
          return obj;
       }
       obj1 = new ArrayList();
       int i = 0;
       while (i < p0.audioAssetsSize()) {
          if (p0.audioAssets(i) != null && p0.audioAssets(i).mIsKuaiShanBgAudioAsset != null) {
             obj1.add(p0.audioAssets(i));
          }
          i = i + 1;
       }
       return obj1;
    }
    public static double getCalcTimelineDuration(EditorSdk2V2$VideoEditorProject p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditorSdk2UtilsV2.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       double d = 0;
       if (p0 == null) {
          return d;
       }
       MutableTimeline mutableTimel = p0.constructTimelineBone();
       if (mutableTimel == null) {
          return d;
       }
       return EditorSdk2UtilsV2.CalcTimelineDurationNative(mutableTimel);
    }
    public static double getComputedDuration(EditorSdk2V2$VideoEditorProject p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditorSdk2UtilsV2.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       if (p0 != null) {
          p0 = p0.mProjectPrivate;
          if (p0 != null) {
             return p0.computedDuration();
          }
       }
       return 0;
    }
    public static double getComputedFps(EditorSdk2V2$VideoEditorProject p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditorSdk2UtilsV2.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       if (p0 != null) {
          p0 = p0.mProjectPrivate;
          if (p0 != null) {
             return p0.computedFps();
          }
       }
       return 0;
    }
    public static int getComputedHeight(EditorSdk2V2$VideoEditorProject p0){
       int i;
       EditorSdk2V2$VideoEditorProject obj = PatchProxy.applyOneRefs(p0, null, EditorSdk2UtilsV2.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0 != null) {
          obj = p0.mProjectPrivate;
          if (obj != null) {
             i = obj.computedHeight();
          label_0021 :
             if (p0 != null && (p0.projectOutputWidth() > 0 && p0.projectOutputHeight() > 0)) {
                return EditorSdk2UtilsV2.limitWidthAndHeight(p0.projectOutputWidth(), p0.projectOutputHeight(), EditorSdk2UtilsV2.getProjectMaxOutputShortEdge(p0), EditorSdk2UtilsV2.getProjectMaxOutputLongEdge(p0), 2, 2).second.intValue();
             }else {
                return i;
             }
          }
       }
       i = 0;
       goto label_0021 ;
    }
    public static int getComputedWidth(EditorSdk2V2$VideoEditorProject p0){
       int i;
       EditorSdk2V2$VideoEditorProject obj = PatchProxy.applyOneRefs(p0, null, EditorSdk2UtilsV2.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0 != null) {
          obj = p0.mProjectPrivate;
          if (obj != null) {
             i = obj.computedWidth();
          label_0021 :
             if (p0 != null && (p0.projectOutputWidth() > 0 && p0.projectOutputHeight() > 0)) {
                return EditorSdk2UtilsV2.limitWidthAndHeight(p0.projectOutputWidth(), p0.projectOutputHeight(), EditorSdk2UtilsV2.getProjectMaxOutputShortEdge(p0), EditorSdk2UtilsV2.getProjectMaxOutputLongEdge(p0), 2, 2).first.intValue();
             }else {
                return i;
             }
          }
       }
       i = 0;
       goto label_0021 ;
    }
    public static EditorSdk2V2$TrackAsset getCurrentTrackAsset(EditorSdk2V2$VideoEditorProject p0,double p1){
       EditorSdk2UtilsV2 uEditorSdk2U = EditorSdk2UtilsV2.class;
       if (PatchProxy.isSupport(uEditorSdk2U)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Double.valueOf(p1), null, uEditorSdk2U, "25");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 != null && p0.trackAssetsSize()) {
          int trackAssetIn = EditorSdk2UtilsV2.getTrackAssetIndexByPts(p0, p1);
          if (trackAssetIn >= 0 && trackAssetIn < p0.trackAssetsSize()) {
             return p0.trackAssets(trackAssetIn);
          }
       }
       return null;
    }
    public static double getDisplayDuration(EditorSdk2V2$VideoEditorProject p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditorSdk2UtilsV2.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       if (p0 == null) {
          return 0;
       }
       return EditorSdk2UtilsV2.CalcTimelineRenderDurationNative(EditorSdk2UtilsV2.NormalizeTimelineNative(p0.constructTimelineBone()), p0.isKwaiPhotoMovie(), p0.mProjectPrivate);
    }
    public static Pair getExportSize(EditorSdk2V2$VideoEditorProject p0,int p1,int p2){
       Minecraft$Size obj;
       int i1;
       if (PatchProxy.isSupport(EditorSdk2UtilsV2.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, EditorSdk2UtilsV2.class, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int computedWidt = EditorSdk2UtilsV2.getComputedWidth(p0);
       int computedHeig = EditorSdk2UtilsV2.getComputedHeight(p0);
       if (EditorSdk2UtilsV2.isProjectSingleImage(p0)) {
          obj = EditorSdk2UtilsV2.getProjectResolutionUnlimit(p0);
          computedHeig = obj.width();
          int i = computedHeig;
          computedHeig = obj.height();
          computedWidt = i;
       }
       if (p0.projectOutputWidth() > 0 && p0.projectOutputHeight() > 0) {
          computedWidt = p0.projectOutputWidth();
          computedHeig = p0.projectOutputHeight();
       }
       double d = Math.min((((double)Math.max(p1, p2) * 0x3ff0000000000000) / (double)Math.max(computedWidt, computedHeig)), (((double)Math.min(p1, p2) * 0x3ff0000000000000) / (double)Math.min(computedWidt, computedHeig)));
       if (d - 0x3ff0000000000000 < 0) {
          p2 = (int)((double)computedWidt * d);
          i1 = (int)Math.ceil(((double)computedHeig * d));
       }else {
          p2 = computedWidt;
          i1 = computedHeig;
       }
       p1 = p2 % 2;
       if (p1) {
          p2 = p2 - p1;
          i1 = (((computedHeig * p2) + computedWidt) - 1) / computedWidt;
       }
       return new Pair(Integer.valueOf((p2 - (p2 % 2))), Integer.valueOf((i1 - (i1 % 2))));
    }
    public static EditorSdk2V2$AudioAsset getKuaiShanBgAudioAsset(EditorSdk2V2$VideoEditorProject p0){
       EditorSdk2V2$AudioAsset obj = PatchProxy.applyOneRefs(p0, null, EditorSdk2UtilsV2.class, "96");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null && p0.audioAssets() != null) {
          Iterator iterator = p0.audioAssets().iterator();
          while (iterator.hasNext()) {
             obj = iterator.next();
             if (obj.isKuaiShanBgAudio()) {
                return obj;
             }
          }
       }
       return null;
    }
    public static int getLimitedHeight(int p0,int p1,EditorSdk2Utils$PreviewSizeLimitation p2){
       if (PatchProxy.isSupport(EditorSdk2UtilsV2.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, null, EditorSdk2UtilsV2.class, "19");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return EditorSdk2UtilsV2.getLimitedSize(p0, p1, p2).second.intValue();
    }
    public static Pair getLimitedSize(int p0,int p1,EditorSdk2Utils$PreviewSizeLimitation p2){
       int i1;
       int i2;
       if (PatchProxy.isSupport(EditorSdk2UtilsV2.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, null, EditorSdk2UtilsV2.class, "17");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 > 0 && p1 > 0) {
          int i = EditorSdk2UtilsV2$1.$SwitchMap$com$kwai$video$editorsdk2$EditorSdk2Utils$PreviewSizeLimitation[p2.ordinal()];
          if (i != 1) {
             if (i != 2) {
                if (i != 3) {
                   if (i != 4) {
                      if (i != 5) {
                         i1 = 1600;
                      }else {
                         i2 = 4096;
                         i1 = 4096;
                      }
                   }else {
                      i2 = 1440;
                      i1 = 2560;
                   }
                }else {
                   i2 = 1080;
                   i1 = 2400;
                }
             }else {
                i2 = 576;
                i1 = 1024;
             }
          }else {
             i2 = 540;
             i1 = 1200;
          }
          return EditorSdk2UtilsV2.limitWidthAndHeight(p0, p1, 720, i1, 2, 2);
       }else {
          return new Pair(Integer.valueOf(p0), Integer.valueOf(p1));
       }
    }
    public static int getLimitedWidth(int p0,int p1,EditorSdk2Utils$PreviewSizeLimitation p2){
       if (PatchProxy.isSupport(EditorSdk2UtilsV2.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, null, EditorSdk2UtilsV2.class, "18");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return EditorSdk2UtilsV2.getLimitedSize(p0, p1, p2).first.intValue();
    }
    public static native int getMainTrackClipIndexByPtsNative(MutableTimeline p0,double p1);
    public static String getPathOfAVClip(Minecraft$KSAVClip p0){
       MutableMediaReference obj = PatchProxy.applyOneRefs(p0, null, EditorSdk2UtilsV2.class, "91");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          EditorSdkLogger.e("[EditorSdk2UtilsV2][getPathOfAVClip] clip is null");
          return null;
       }else {
          MutableMediaReference mutableMedia = p0.mutableMediaReference();
          if (mutableMedia == null) {
             EditorSdkLogger.e("[EditorSdk2UtilsV2][getPathOfAVClip] clip mutableMediaReference is null");
             return null;
          }else {
             obj = mutableMedia.concreteType;
             if (obj == MinecraftModelDefine$MediaReferenceType.MediaReferenceType_StickerReference) {
                return mutableMedia.assetPath();
             }
             if (obj == MinecraftModelDefine$MediaReferenceType.MediaReferenceType_AudioVideoReference) {
                return mutableMedia.filePath();
             }
             return null;
          }
       }
    }
    public static EditorSdk2$ProbedFile getProbedFileFromCache(Minecraft$KSAVClip p0){
       EditorSdk2V2$TrackAsset obj = PatchProxy.applyOneRefs(p0, null, EditorSdk2UtilsV2.class, "81");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          EditorSdkLogger.e("[getProbedFileFromCache] avClip is null");
          return null;
       }else {
          obj = new EditorSdk2V2$TrackAsset(p0);
          EditorSdk2V2$TrackAsset mProbedAsset = obj.mProbedAssetFile;
          if (mProbedAsset == null) {
             EditorSdk2$EditorSdkError uEditorSdkEr = new EditorSdk2$EditorSdkError();
             obj.reloadProbedFiles(uEditorSdkEr);
             if (uEditorSdkEr.code()) {
                return null;
             }else {
                mProbedAsset = obj.mProbedAssetFile;
             }
          }
          return mProbedAsset;
       }
    }
    public static int getProbedStreamHeight(EditorSdk2$ProbedStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditorSdk2UtilsV2.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0 == null) {
          return 0;
       }
       int i = p0.height();
       if (p0.sampleAspectRatio() != null) {
          EditorSdk2$Rational rational = null;
          if (p0.sampleAspectRatio().den() - rational && (p0.sampleAspectRatio().num() - rational && p0.sampleAspectRatio().den() - p0.sampleAspectRatio().num() < 0)) {
             int i1 = (int)(((long)i * p0.sampleAspectRatio().den()) / p0.sampleAspectRatio().num());
             i = (i1 % 2) + i1;
          }
       }
       return i;
    }
    public static int getProbedStreamWidth(EditorSdk2$ProbedStream p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditorSdk2UtilsV2.class, "45");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0 == null) {
          return 0;
       }
       int i = p0.width();
       if (p0.sampleAspectRatio() != null) {
          EditorSdk2$Rational rational = null;
          if (p0.sampleAspectRatio().den() - rational && (p0.sampleAspectRatio().num() - rational && p0.sampleAspectRatio().den() - p0.sampleAspectRatio().num() > 0)) {
             int i1 = (int)(((long)i * p0.sampleAspectRatio().num()) / p0.sampleAspectRatio().den());
             i = (i1 % 2) + i1;
          }
       }
       return i;
    }
    public static int getProjectMaxOutputLongEdge(EditorSdk2V2$VideoEditorProject p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditorSdk2UtilsV2.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (EditorSdk2UtilsV2.isSingleImageProject(p0))? 2400: 1600;
       return i;
    }
    public static int getProjectMaxOutputShortEdge(EditorSdk2V2$VideoEditorProject p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditorSdk2UtilsV2.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (EditorSdk2UtilsV2.isSingleImageProject(p0))? 1080: 720;
       return i;
    }
    public static Minecraft$Size getProjectResolutionUnlimit(EditorSdk2V2$VideoEditorProject p0){
       MutableTimeline obj = PatchProxy.applyOneRefs(p0, null, EditorSdk2UtilsV2.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return new Minecraft$Size();
       }
       obj = p0.constructTimelineBone();
       if (obj == null) {
          return new Minecraft$Size();
       }
       return EditorSdk2UtilsV2.getTimelineResolutionUnlimitNative(obj, p0.isKwaiPhotoMovie());
    }
    public static int getReplaceableAVClipHeight(Minecraft$KSAVClip p0){
       int probedStream1;
       Object obj = PatchProxy.applyOneRefs(p0, null, EditorSdk2UtilsV2.class, "83");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       if (p0 == null) {
          EditorSdkLogger.e("[getReplaceableAVClipWidth] avClip is null");
          return i;
       }else {
          EditorSdk2$ProbedFile probedFileFr = EditorSdk2UtilsV2.getProbedFileFromCache(p0);
          if (probedFileFr != null && (probedFileFr.videoStreamIndex() == -1 || probedFileFr.videoStreamIndex() >= probedFileFr.streamsSize())) {
             EditorSdkLogger.e("[getReplaceableAVClipWidth] probedFile videoStreamIndex not right");
             return i;
          }else {
             EditorSdk2$ProbedStream probedStream = probedFileFr.streams(probedFileFr.videoStreamIndex());
             if (probedStream == null) {
                EditorSdkLogger.e("[getReplaceableAVClipWidth] probedStream is null");
                return i;
             }else if(!(probedStream.rotation() % 180)){
                probedStream1 = EditorSdk2UtilsV2.getProbedStreamHeight(probedStream);
             }else {
                probedStream1 = EditorSdk2UtilsV2.getProbedStreamWidth(probedStream);
             }
             return probedStream1;
          }
       }
    }
    public static int getReplaceableAVClipWidth(Minecraft$KSAVClip p0){
       int probedStream1;
       Object obj = PatchProxy.applyOneRefs(p0, null, EditorSdk2UtilsV2.class, "82");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       if (p0 == null) {
          EditorSdkLogger.e("[getReplaceableAVClipWidth] avClip is null");
          return i;
       }else {
          EditorSdk2$ProbedFile probedFileFr = EditorSdk2UtilsV2.getProbedFileFromCache(p0);
          if (probedFileFr != null && (probedFileFr.videoStreamIndex() == -1 || probedFileFr.videoStreamIndex() >= probedFileFr.streamsSize())) {
             EditorSdkLogger.e("[getReplaceableAVClipWidth] probedFile videoStreamIndex not right");
             return i;
          }else {
             EditorSdk2$ProbedStream probedStream = probedFileFr.streams(probedFileFr.videoStreamIndex());
             if (probedStream == null) {
                EditorSdkLogger.e("[getReplaceableAVClipWidth] probedStream is null");
                return i;
             }else if(!(probedStream.rotation() % 180)){
                probedStream1 = EditorSdk2UtilsV2.getProbedStreamWidth(probedStream);
             }else {
                probedStream1 = EditorSdk2UtilsV2.getProbedStreamHeight(probedStream);
             }
             return probedStream1;
          }
       }
    }
    public static Minecraft$TemplateClip getTemplateClipFromTimeline(MutableTimeline p0){
       Iterator obj = PatchProxy.applyOneRefs(p0, null, EditorSdk2UtilsV2.class, "94");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       Iterator iterator = p0.mutableTracks().iterator();
       while (true) {
          if (iterator.hasNext()) {
             obj = iterator.next().getMutableClips().iterator();
             while (true) {
                if (obj.hasNext()) {
                   MutableClip mutableClip = obj.next();
                   if (mutableClip.getClipType() == MinecraftModelDefine$ClipType.ClipType_TemplateClip && mutableClip.getClass() == Minecraft$TemplateClip.class) {
                      return mutableClip;
                   }
                }else {
                   continue ;
                }
             }
             return null;
          }else {
             goto label_004e ;
          }
       }
    }
    public static MutableTrack getTemplateTrackFromTimeline(MutableTimeline p0){
       MutableTrack obj = PatchProxy.applyOneRefs(p0, null, EditorSdk2UtilsV2.class, "95");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       Iterator iterator = p0.mutableTracks().iterator();
       while (true) {
          if (iterator.hasNext()) {
             obj = iterator.next();
             Iterator iterator1 = obj.getMutableClips().iterator();
             while (true) {
                if (iterator1.hasNext()) {
                   MutableClip mutableClip = iterator1.next();
                   if (mutableClip.getClipType() == MinecraftModelDefine$ClipType.ClipType_TemplateClip && mutableClip.getClass() == Minecraft$TemplateClip.class) {
                      return obj;
                   }
                }else {
                   continue ;
                }
             }
             return null;
          }else {
             goto label_004c ;
          }
       }
    }
    public static double getTimeMappedDurationForAVClip(Minecraft$KSAVClip p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditorSdk2UtilsV2.class, "90");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return EditorSdk2UtilsV2.getTimeMappedDurationForAVClipNative(p0);
    }
    public static native double getTimeMappedDurationForAVClipNative(Minecraft$KSAVClip p0);
    public static native Minecraft$Size getTimelineResolutionUnlimitNative(MutableTimeline p0,boolean p1);
    public static double getTrackAssetDisplayDuration(EditorSdk2V2$TrackAsset p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditorSdk2UtilsV2.class, "51");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       double d = 0;
       if (p0 == null) {
          return d;
       }
       if (p0.clippedRange() != null) {
          return p0.clippedRange().duration();
       }
       p0 = p0.mProbedAssetFile;
       if (p0 != null) {
          d = p0.duration();
       }
       return d;
    }
    public static double getTrackAssetFps(EditorSdk2V2$TrackAsset p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditorSdk2UtilsV2.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       double d = 0;
       if (p0 == null) {
          return d;
       }
       EditorSdk2$ProbedStream trackAssetVi = EditorSdk2UtilsV2.getTrackAssetVideoStream(p0);
       if (trackAssetVi == null || (trackAssetVi.avgFrameRate() != null && trackAssetVi.avgFrameRate().den())) {
          d = (double)trackAssetVi.avgFrameRate().num() / (double)trackAssetVi.avgFrameRate().den();
       }
    label_0047 :
       return d;
    }
    public static double getTrackAssetFrameRate(EditorSdk2V2$TrackAsset p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditorSdk2UtilsV2.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       EditorSdk2$ProbedStream trackAssetVi = EditorSdk2UtilsV2.getTrackAssetVideoStream(p0);
       double d = 0;
       if (trackAssetVi == null) {
          return d;
       }
       if ((double)trackAssetVi.avgFrameRate().den() - d > 0) {
          d = ((double)trackAssetVi.avgFrameRate().num() * 0x3ff0000000000000) / (double)trackAssetVi.avgFrameRate().den();
       }
       return d;
    }
    public static int getTrackAssetHeight(EditorSdk2V2$TrackAsset p0){
       EditorSdk2$ProbedStream obj = PatchProxy.applyOneRefs(p0, null, EditorSdk2UtilsV2.class, "47");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = EditorSdk2UtilsV2.getTrackAssetVideoStream(p0);
       if (obj == null) {
          return 0;
       }
       int probedStream = (!(((((obj.rotation() + p0.rotationDeg()) % 360) + 360) % 360) % 180))? EditorSdk2UtilsV2.getProbedStreamHeight(obj): EditorSdk2UtilsV2.getProbedStreamWidth(obj);
       return probedStream;
    }
    public static int getTrackAssetIndexByPts(EditorSdk2V2$VideoEditorProject p0,double p1){
       EditorSdk2UtilsV2 uEditorSdk2U = EditorSdk2UtilsV2.class;
       if (PatchProxy.isSupport(uEditorSdk2U)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Double.valueOf(p1), null, uEditorSdk2U, "26");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p0 == null) {
          return -1;
       }else {
          return EditorSdk2UtilsV2.getMainTrackClipIndexByPtsNative(p0.constructTimelineBone(), p1);
       }
    }
    public static int getTrackAssetNbFrames(EditorSdk2V2$TrackAsset p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditorSdk2UtilsV2.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       EditorSdk2$ProbedStream trackAssetVi = EditorSdk2UtilsV2.getTrackAssetVideoStream(p0);
       if (trackAssetVi == null) {
          return -1;
       }
       return trackAssetVi.nbFrames();
    }
    public static int getTrackAssetOriginRotation(EditorSdk2V2$TrackAsset p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditorSdk2UtilsV2.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       EditorSdk2$ProbedStream trackAssetVi = EditorSdk2UtilsV2.getTrackAssetVideoStream(p0);
       if (trackAssetVi == null) {
          return 0;
       }
       return trackAssetVi.rotation();
    }
    public static EditorSdk2$TimeRange getTrackAssetRenderPosRangeByIndex(EditorSdk2V2$VideoEditorProject p0,int p1){
       EditorSdk2UtilsV2 uEditorSdk2U = EditorSdk2UtilsV2.class;
       if (PatchProxy.isSupport(uEditorSdk2U)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uEditorSdk2U, "50");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1 >= 0 && p1 < p0.trackAssetsSize()) {
          double d = 0;
          int i = 0;
          while (i < p1) {
             d = d + EditorSdk2UtilsV2.getTrackAssetDisplayDuration(p0.trackAssets(i));
             if (p0.trackAssets(i).transitionParam() != null && EditorSdk2Utils.transitionTypeHasOverlayDuration(p0.trackAssets(i).transitionParam().type())) {
                d = d - p0.trackAssets(i).transitionParam().duration();
             }
             i = i + 1;
          }
          return EditorSdk2Utils.createTimeRange(d, EditorSdk2UtilsV2.getTrackAssetDisplayDuration(p0.trackAssets(p1)));
       }else {
          throw new EditorSdk2InternalErrorException("Index out of project track asset range.");
       }
    }
    public static int getTrackAssetShowRotation(EditorSdk2V2$TrackAsset p0){
       EditorSdk2$ProbedStream obj = PatchProxy.applyOneRefs(p0, null, EditorSdk2UtilsV2.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = EditorSdk2UtilsV2.getTrackAssetVideoStream(p0);
       if (obj == null) {
          return 0;
       }
       return ((obj.rotation() + p0.rotationDeg()) % 360);
    }
    public static EditorSdk2$ProbedStream getTrackAssetVideoStream(EditorSdk2V2$TrackAsset p0){
       EditorSdk2V2$TrackAsset obj = PatchProxy.applyOneRefs(p0, null, EditorSdk2UtilsV2.class, "74");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       obj = p0.mProbedAssetFile;
       if (obj == null) {
          EditorSdk2$EditorSdkError uEditorSdkEr = new EditorSdk2$EditorSdkError();
          p0.reloadProbedFiles(uEditorSdkEr);
          if (uEditorSdkEr.code()) {
             return null;
          }else {
             obj = p0.mProbedAssetFile;
          }
       }
       if (obj != null && (obj.videoStreamIndex() < 0 || obj.streamsSize() <= obj.videoStreamIndex())) {
          return null;
       }else {
          return obj.streams(obj.videoStreamIndex());
       }
    }
    public static int getTrackAssetWidth(EditorSdk2V2$TrackAsset p0){
       EditorSdk2$ProbedStream obj = PatchProxy.applyOneRefs(p0, null, EditorSdk2UtilsV2.class, "44");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = EditorSdk2UtilsV2.getTrackAssetVideoStream(p0);
       if (obj == null) {
          return 0;
       }
       int probedStream = (!(((((obj.rotation() + p0.rotationDeg()) % 360) + 360) % 360) % 180))? EditorSdk2UtilsV2.getProbedStreamWidth(obj): EditorSdk2UtilsV2.getProbedStreamHeight(obj);
       return probedStream;
    }
    public static List getYKitStats(){
       Object obj = PatchProxy.apply(null, null, EditorSdk2UtilsV2.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       return b.a("com.kwai.video.editorsdk2.ykit.stats.YKitStatsCollector", "getYKitStats", new ArrayList(), objArray);
    }
    public static boolean hasAudioStreamByTrack(EditorSdk2V2$TrackAsset p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditorSdk2UtilsV2.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 != null) {
          p0 = p0.mProbedAssetFile;
          if (p0 != null && p0.audioStreamIndex() >= 0) {
             b = true;
          }
       }
       return b;
    }
    public static boolean isAVClipHasCutoutParam(Minecraft$KSAVClip p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditorSdk2UtilsV2.class, "92");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null) {
          return false;
       }
       Iterator iterator = p0.effects().iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return false;
          }
          if (iterator.next().getEffectType() == MinecraftModelDefine$EffectType.EffectType_YKitCutoutParam) {
             break ;
          }
       }
       return true;
    }
    public static boolean isEnableVideoQualityEvaluateTask(int p0){
       EditorSdk2UtilsV2 uEditorSdk2U = EditorSdk2UtilsV2.class;
       if (PatchProxy.isSupport(uEditorSdk2U)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uEditorSdk2U, "98");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return EditorSdk2UtilsV2.isEnableVideoQualityEvaluateTaskNative(p0);
    }
    public static native boolean isEnableVideoQualityEvaluateTaskNative(int p0);
    public static boolean isProjectSingleImage(EditorSdk2V2$VideoEditorProject p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditorSdk2UtilsV2.class, "52");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (p0 == null || (p0.trackAssetsSize() != b || (p0.isKwaiPhotoMovie() || (p0.trackAssets(0) == null || !EditorSdk2UtilsV2.isSingleImagePath(p0.trackAssets(0).assetPath()))))) {
          b = false;
       }
       return b;
    }
    public static boolean isSingleImagePath(String p0){
       String obj = PatchProxy.applyOneRefs(p0, null, EditorSdk2UtilsV2.class, "54");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = new File(p0).getName();
       int i = 1;
       obj = (obj.substring((obj.lastIndexOf(46) + i))).toLowerCase();
       if (obj.equals("jpg") || (obj.equals("png") || (obj.equals("gif") || (obj.equals("jpeg") || (obj.equals("bmp") || (obj.equals("webp") || (!obj.equals("heic") && (!obj.equals("heif") || p0.contains("%d"))))))))) {
          i = false;
       }
       return i;
    }
    public static boolean isSingleImageProject(EditorSdk2V2$VideoEditorProject p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditorSdk2UtilsV2.class, "53");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (p0 == null || (p0.trackAssetsSize() != b || (p0.isKwaiPhotoMovie() || !EditorSdk2UtilsV2.isSingleImagePath(p0.trackAssets(0).assetPath())))) {
          b = false;
       }
       return b;
    }
    public static void limitBitmapOptionsWidthAndHeight(BitmapFactory$Options p0,int p1,int p2,boolean p3){
       int i;
       if (PatchProxy.isSupport(EditorSdk2UtilsV2.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Boolean.valueOf(p3), null, EditorSdk2UtilsV2.class, "11")) {
          return;
       }
       if (p3) {
          i = 2;
       }else {
          int i1 = 1;
          i = 1;
       }
       Pair pair = EditorSdk2UtilsV2.limitWidthAndHeight(p0.outWidth, p0.outHeight, p1, p2, 2, i);
       p0.outWidth = pair.first.intValue();
       p0.outHeight = pair.second.intValue();
       return;
    }
    public static Pair limitWidthAndHeight(int p0,int p1,int p2,int p3,int p4,int p5){
       double d;
       EditorSdk2UtilsV2 uEditorSdk2U = EditorSdk2UtilsV2.class;
       if (PatchProxy.isSupport(uEditorSdk2U)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5)};
          Object obj = PatchProxy.apply(objArray, null, uEditorSdk2U, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = Math.min(p0, p1);
       int i1 = Math.max(p0, p1);
       if (i > p2 || i1 > p3) {
          d = Math.min(((double)p2 / (double)i), ((double)p3 / (double)i1));
          i = (int)((double)p0 * d);
          d = (int)((double)p1 * d);
       }else {
          i = p0;
          p2 = p1;
       }
       if (!(p4 % 2) && (!(p5 % 2) && (p4 <= 0 || p5 <= 0))) {
          if (p4 != 1 && p5 != 1) {
             EditorSdkLogger.e("EditorSdkUtils", "alignment should be multiple of 2! width align: "+p4+", height align: "+p5);
          }
          return new Pair(Integer.valueOf(i), Integer.valueOf(d));
       }else if(p4 > 2){
          p3 = i % p4;
          if (p3) {
             i = i + (p4 - p3);
             d = (((p1 * i) + p0) - 1) / p0;
          }
       }
       return new Pair(Integer.valueOf((i + (i % 2))), Integer.valueOf((d + (d % 2))));
    }
    public static EditorSdk2V2$VideoEditorProject loadProject(EditorSdk2V2$VideoEditorProject p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditorSdk2UtilsV2.class, "55");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return EditorSdk2UtilsV2.loadProjectWithSizeLimitation(p0, EditorSdk2Utils$PreviewSizeLimitation.PREVIEW_SIZE_LIMITATION_DEFAULT);
    }
    public static EditorSdk2V2$VideoEditorProject loadProjectWithSizeLimitation(EditorSdk2V2$VideoEditorProject p0,EditorSdk2Utils$PreviewSizeLimitation p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, EditorSdk2UtilsV2.class, "56");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = EditorSdk2UtilsV2.LoadTimelineAndProjectPrivateNative(p0.constructTimelineBone(), p0.isKwaiPhotoMovie(), p0.mProjectPrivate, false, p1.getValue());
       if (i) {
          EditorSdkLogger.e("EditorSdk2UtilsV2", "Failed to LoadTimelineAndProjectPrivateNative, error : "+i);
       }
       return p0;
    }
    public static Minecraft$KSAVClip openAVClip(Minecraft$KSAVClip p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, EditorSdk2UtilsV2.class, "84");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return EditorSdk2UtilsV2.createAduioVideoClip(p1, p0.mediaReference().fileOptions(), new EditorSdk2$ProbedFile());
    }
    public static EditorSdk2V2$AnimatedSubAsset openAnimatedSubAsset(String p0){
       Object obj = null;
       EditorSdk2V2$AnimatedSubAsset obj1 = PatchProxy.applyOneRefs(p0, obj, EditorSdk2UtilsV2.class, "42");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       obj1 = new EditorSdk2V2$AnimatedSubAsset();
       Minecraft$KSAVClip kSAVClip = new Minecraft$KSAVClip();
       kSAVClip.setAeRefId(MinecraftUtils.GetMinecraftID());
       EditorSdk2$ProbedFile probedFile = new EditorSdk2$ProbedFile();
       int i = EditorSdk2UtilsV2.CreateAudioVideoClipNative(p0, obj, kSAVClip, probedFile);
       if (i) {
          throw new IOException("Open asset failed with error code "+i);
       }
       obj1.mMainClip = kSAVClip;
       obj1.mProbedAssetFile = probedFile;
       return obj1;
    }
    public static EditorSdk2V2$AudioAsset openAudioAsset(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditorSdk2UtilsV2.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return EditorSdk2UtilsV2.openAudioAsset(p0, null);
    }
    public static EditorSdk2V2$AudioAsset openAudioAsset(String p0,double p1,boolean p2){
       if (PatchProxy.isSupport(EditorSdk2UtilsV2.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Double.valueOf(p1), Boolean.valueOf(p2), null, EditorSdk2UtilsV2.class, "40");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return EditorSdk2UtilsV2.openAudioAsset(p0, null, p1, p2);
    }
    public static EditorSdk2V2$AudioAsset openAudioAsset(String p0,String p1){
       Minecraft$InputFileOptions inputFileOpt = null;
       EditorSdk2V2$AudioAsset obj = PatchProxy.applyTwoRefs(p0, p1, inputFileOpt, EditorSdk2UtilsV2.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new EditorSdk2V2$AudioAsset();
       Minecraft$KSAVClip kSAVClip = new Minecraft$KSAVClip();
       EditorSdk2$ProbedFile probedFile = new EditorSdk2$ProbedFile();
       if (p1 != null && !p1.isEmpty()) {
          inputFileOpt = new Minecraft$InputFileOptions();
          inputFileOpt.setDecryptionKey(p1);
       }
       int i = EditorSdk2UtilsV2.CreateAudioVideoClipNative(p0, inputFileOpt, kSAVClip, probedFile);
       if (!i) {
          obj.mMainClip = kSAVClip;
          obj.mProbedAssetFile = probedFile;
          return obj;
       }else {
          throw new IOException("Open asset failed with error code "+i);
       }
    }
    public static EditorSdk2V2$AudioAsset openAudioAsset(String p0,String p1,double p2,boolean p3){
       if (PatchProxy.isSupport(EditorSdk2UtilsV2.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Double.valueOf(p2), Boolean.valueOf(p3), null, EditorSdk2UtilsV2.class, "41");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       EditorSdk2V2$AudioAsset uAudioAsset = EditorSdk2UtilsV2.openAudioAsset(p0, p1);
       uAudioAsset.setVolume(p2);
       uAudioAsset.setIsRepeat(p3);
       return uAudioAsset;
    }
    public static EditorSdk2V2$TrackAsset openTrackAsset(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditorSdk2UtilsV2.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return EditorSdk2UtilsV2.openTrackAsset(p0, null, null);
    }
    public static EditorSdk2V2$TrackAsset openTrackAsset(String p0,String p1,Minecraft$InputFileOptions p2){
       EditorSdk2V2$TrackAsset obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, EditorSdk2UtilsV2.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new EditorSdk2V2$TrackAsset();
       Minecraft$KSAVClip kSAVClip = new Minecraft$KSAVClip();
       EditorSdk2$ProbedFile probedFile = new EditorSdk2$ProbedFile();
       int i = EditorSdk2UtilsV2.CreateAudioVideoClipNative(p0, p2, kSAVClip, probedFile);
       if (i) {
          throw new IOException("Open asset failed with error code "+i);
       }
       obj.mMainClip = kSAVClip;
       obj.mProbedAssetFile = probedFile;
       if (p1 != null) {
          EditorSdkLogger.e("openTrackAsset not support additional audioPath");
       }
       return obj;
    }
    public static RenderPosDetail renderPosDetailOfRenderPos(EditorSdk2V2$VideoEditorProject p0,double p1){
       EditorSdk2UtilsV2 uEditorSdk2U = EditorSdk2UtilsV2.class;
       if (PatchProxy.isSupport(uEditorSdk2U)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Double.valueOf(p1), null, uEditorSdk2U, "63");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       EditorSdk2$PrivateRenderPosDetail privateRende = EditorSdk2UtilsV2.renderPosDetailOfRenderPosNative(p0.constructTimelineBone(), p0.isKwaiPhotoMovie(), EditorSdk2UtilsV2.getComputedDuration(p0), p1);
       if (privateRende != null) {
          if (p0.isKwaiPhotoMovie()) {
             privateRende.setTrackAssetIndex((privateRende.trackAssetIndex() % p0.trackAssetsSize()));
          }
          return new am(privateRende);
       }else {
          throw new EditorSdk2InternalErrorException("Error renderPosDetailOfRenderPos!");
       }
    }
    public static native EditorSdk2$PrivateRenderPosDetail renderPosDetailOfRenderPosNative(MutableTimeline p0,boolean p1,double p2,double p3);
    public static boolean replaceAVClipFile(Minecraft$KSAVClip p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, EditorSdk2UtilsV2.class, "85");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null || p1.length() <= 0) {
          EditorSdkLogger.e("[replaceAVClipFile] avClip or path is null");
          return false;
       }else {
          p0.setMediaReference(EditorSdk2UtilsV2.openAVClip(p0, p1).mediaReference());
          return true;
       }
    }
    public static boolean setPathOfAVClip(Minecraft$KSAVClip p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, EditorSdk2UtilsV2.class, "93");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null) {
          return false;
       }
       Minecraft$AudioVideoReference uAudioVideoR = p0.mediaReference();
       if (uAudioVideoR == null) {
          return false;
       }
       uAudioVideoR.setFilePath(p1);
       return true;
    }
    public static boolean shouldBeTranscodedToEditor(EditorSdk2V2$VideoEditorProject p0,int p1,int p2){
       if (PatchProxy.isSupport(EditorSdk2UtilsV2.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, EditorSdk2UtilsV2.class, "34");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return EditorSdk2UtilsV2.shouldBeTranscodedToEditor(p0, p1, p2, false);
    }
    public static boolean shouldBeTranscodedToEditor(EditorSdk2V2$VideoEditorProject p0,int p1,int p2,boolean p3){
       if (PatchProxy.isSupport(EditorSdk2UtilsV2.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Boolean.valueOf(p3), null, EditorSdk2UtilsV2.class, "35");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p0 != null && p0.trackAssetsSize()) {
          EditorSdk2V2$TrackAsset trackAsset = p0.trackAssets(false);
          if (trackAsset != null && !TextUtils.isEmpty(trackAsset.assetPath())) {
             if (trackAsset.mProbedAssetFile == null) {
                try{
                   trackAsset = EditorSdk2UtilsV2.openTrackAsset(trackAsset.assetPath());
                }catch(java.io.IOException e8){
                }catch(com.kwai.video.editorsdk2.EditorSdk2InternalErrorException e8){
                }
                EditorSdkLogger.e("EditorSdk2UtilsV2", "error while opening track asset: "+trackAsset.assetPath(), e8);
                return false;
             }
             EditorSdk2$ProbedStream trackAssetVi = EditorSdk2UtilsV2.getTrackAssetVideoStream(trackAsset);
             if (trackAssetVi == null) {
                return false;
             }else {
                int probedStream = EditorSdk2UtilsV2.getProbedStreamWidth(trackAssetVi);
                int probedStream1 = EditorSdk2UtilsV2.getProbedStreamHeight(trackAssetVi);
                int i = Math.min(probedStream, probedStream1);
                probedStream1 = Math.max(probedStream, probedStream1);
                probedStream = Math.min(Math.min(p1, p2), EditorSdk2UtilsV2.getProjectMaxOutputShortEdge(p0));
                int i1 = Math.min(Math.max(p1, p2), EditorSdk2UtilsV2.getProjectMaxOutputLongEdge(p0));
                if (p3) {
                   i1 = 5000;
                   probedStream = 5000;
                }
                if (i > probedStream || probedStream1 > i1) {
                   return true;
                }else {
                   return false;
                }
             }
          }
       }
       return false;
    }
    public static boolean trackAssetHasAudioStream(EditorSdk2V2$TrackAsset p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditorSdk2UtilsV2.class, "65");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 != null) {
          p0 = p0.mProbedAssetFile;
          if (p0 != null && p0.audioStreamIndex() >= 0) {
             b = true;
          }
       }
       return b;
    }
    public static EditorSdk2$ProbedStream trackAssetProbedAudioStream(EditorSdk2V2$TrackAsset p0){
       EditorSdk2V2$TrackAsset obj = PatchProxy.applyOneRefs(p0, null, EditorSdk2UtilsV2.class, "69");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          obj = p0.mProbedAssetFile;
          if (obj != null) {
             int i = obj.audioStreamIndex();
             if (i < 0) {
                return null;
             }else {
                return p0.mProbedAssetFile.streams(i);
             }
          }
       }
       return null;
    }
    public static double trackAssetProbedFileDuration(EditorSdk2V2$TrackAsset p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditorSdk2UtilsV2.class, "66");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       if (p0 != null) {
          p0 = p0.mProbedAssetFile;
          if (p0 != null) {
             return p0.duration();
          }
       }
       return 0;
    }
    public static String trackAssetProbedPath(EditorSdk2V2$TrackAsset p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditorSdk2UtilsV2.class, "70");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          p0 = p0.mProbedAssetFile;
          if (p0 != null) {
             return p0.path();
          }
       }
       return null;
    }
    public static EditorSdk2$ProbedStream trackAssetProbedVideoStream(EditorSdk2V2$TrackAsset p0){
       EditorSdk2V2$TrackAsset obj = PatchProxy.applyOneRefs(p0, null, EditorSdk2UtilsV2.class, "68");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          obj = p0.mProbedAssetFile;
          if (obj != null) {
             int i = obj.videoStreamIndex();
             if (i >= 0 && i < p0.mProbedAssetFile.streamsSize()) {
                return p0.mProbedAssetFile.streams(i);
             }
          }
       }
       return null;
    }
    public static boolean videoProjectPrivateDataLoaded(EditorSdk2V2$VideoEditorProject p0){
       boolean b = (p0 != null && p0.mProjectPrivate != null)? true: false;
       return b;
    }
    public static boolean willTranscodeSkip(EditorSdk2V2$VideoEditorProject p0,EditorSdk2$ExportOptions p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, EditorSdk2UtilsV2.class, "57");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (EditorSdk2UtilsV2.willTranscodeSkipWithCode(p0, p1, b) == 0x2710) {
          b = true;
       }
       return b;
    }
    public static boolean willTranscodeSkip(EditorSdk2V2$VideoEditorProject p0,EditorSdk2$ExportOptions p1,boolean p2){
       if (PatchProxy.isSupport(EditorSdk2UtilsV2.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), null, EditorSdk2UtilsV2.class, "58");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (EditorSdk2UtilsV2.willTranscodeSkipWithCode(p0, p1, p2) == 0x2710)? true: false;
       return b;
    }
    public static int willTranscodeSkipWithCode(EditorSdk2V2$VideoEditorProject p0,EditorSdk2$ExportOptions p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, EditorSdk2UtilsV2.class, "59");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return EditorSdk2UtilsV2.willTranscodeSkipWithCode(p0, p1, false);
    }
    public static int willTranscodeSkipWithCode(EditorSdk2V2$VideoEditorProject p0,EditorSdk2$ExportOptions p1,boolean p2){
       if (PatchProxy.isSupport(EditorSdk2UtilsV2.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), null, EditorSdk2UtilsV2.class, "60");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return EditorSdk2UtilsV2.willTranscodeSkipWithCodeNative(p0.constructTimelineBone(), p1, p2, p0.isKwaiPhotoMovie(), p0.mProjectPrivate.computedWidth(), p0.mProjectPrivate.computedHeight());
    }
    public static native int willTranscodeSkipWithCodeNative(MutableTimeline p0,EditorSdk2$ExportOptions p1,boolean p2,boolean p3,int p4,int p5);
}
