package com.kwai.video.clipkit.ClipKitUtils;
import zk.d;
import com.google.gson.Gson;
import java.lang.Object;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$Rational;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import com.kwai.video.minecraft.model.EditorSdk2V2$TimeRangeV2;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ProbedStream;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import com.kwai.video.minecraft.model.nano.Minecraft$VisualEffectParam;
import com.kwai.video.minecraft.model.nano.Minecraft$TransitionParam;
import com.kwai.video.minecraft.model.nano.Minecraft$WesterosFaceMagicParam;
import com.kwai.video.minecraft.model.nano.Minecraft$TimeEffectParam;
import java.util.Iterator;
import com.kwai.video.minecraft.model.EditorSdk2V2$AnimatedSubAsset;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$TimeRange;
import com.kwai.video.minecraft.model.nano.Minecraft$MagicTouchOverall;
import java.util.ArrayList;
import java.lang.Number;
import com.kwai.video.minecraft.model.nano.Minecraft$RationalV2;
import com.kwai.video.minecraft.model.nano.Minecraft$KSAVClip;
import java.lang.Boolean;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$VideoColorProperties;
import com.kwai.video.clipkit.KSClipLog;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.io.File;
import java.lang.StringBuilder;
import java.io.IOException;
import java.lang.Exception;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;
import java.io.FileOutputStream;
import java.nio.channels.ReadableByteChannel;
import android.content.Context;
import n65.b;
import com.kwai.camerasdk.log.Log;
import android.content.res.AssetManager;
import com.kwai.plugin.dva.split.SplitAssetHelper;
import java.lang.Throwable;
import java.util.UUID;
import com.kwai.video.clipkit.post.LocalExportOption;
import com.kwai.video.clipkit.config.EditorEncodeConfigManager;
import com.kwai.video.clipkit.config.EditorEncodeConfigModule;
import com.kwai.video.clipkit.config.EditorEncodeConfig$LocalVideoEncodeConfig;
import com.kwai.video.clipkit.config.EditorEncodeConfig$AudioEncodeConfig;
import com.kwai.video.clipkit.hardware.ClipDPHardwareConfigManager;
import java.lang.Math;
import com.kwai.video.clipkit.config.EditorEncodeConfigModule$ExportParam;
import java.lang.Long;
import android.util.Pair;
import java.lang.Double;
import com.kwai.video.editorsdk2.model.MutableArray;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import com.kwai.video.minecraft.model.EditorSdk2V2$AudioAsset;
import com.kwai.video.devicepersona.benchmark.BenchmarkEncodeProfile;
import com.kwai.video.clipkit.ClipKitUtils$CLIPKIT_VERSION;
import java.lang.Enum;
import com.kwai.FaceMagic.AE2.AE2Logger$Version;
import java.lang.NumberFormatException;
import android.content.SharedPreferences;
import oe6.o;
import com.kwai.video.clipkit.utils.Utils$Size;
import android.graphics.Point;
import com.kwai.video.clipkit.config.LocalExportCondition;
import java.util.List;
import com.kwai.video.clipkit.config.ClipKitConfigManager;
import com.kwai.video.clipkit.config.ClipKitConfig;
import com.kwai.video.clipkit.config.EditorEncodeConfig;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ExportOptions;
import com.kwai.video.clipkit.utils.NetworkUtils;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ProtoSkipTranscodeConfig;
import com.kwai.video.editorsdk2.EditorSdk2Utils$PreviewSizeLimitation;
import com.kwai.video.clipkit.config.EditorPreviewConfig;
import android.view.WindowManager;
import android.view.Display;
import com.kwai.video.minecraft.model.nano.Minecraft$TemplateClip;
import com.kwai.video.minecraft.model.nano.Minecraft$Range;
import com.kwai.video.minecraft.model.MediaReference;
import com.kwai.video.minecraft.model.MutableClip;
import com.kwai.video.minecraft.model.nano.Minecraft$TemplateReference;
import com.kwai.video.minecraft.model.nano.Minecraft$WesterosBeautyFilterParam;
import com.kwai.video.minecraft.model.nano.Minecraft$WesterosBodySlimmingParam;
import com.kwai.video.minecraft.model.nano.Minecraft$WesterosMakeupParam;
import com.kwai.video.clipkit.KSClipLogger;
import com.kwai.video.clipkit.ClipKitUtils$1;
import com.kwai.video.minecraft.model.nano.Minecraft$ResourcePathConfig;
import com.kwai.ksvideorendersdk.EditorSDKSoLoader$Handler;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$AndroidDecoderConfig;
import android.os.Handler;
import android.os.Looper;
import com.kwai.video.clipkit.ClipKitUtils$2;
import java.lang.Runnable;
import com.kwai.video.minecraft.model.nano.Minecraft$AssetTransform;
import com.kwai.video.clipkit.ClipKitUtils$ProjectTranscodeResult;
import com.kwai.video.minecraft.model.nano.Minecraft$BeautyFilterParam;
import com.kwai.video.minecraft.model.nano.Minecraft$ColorFilterParam;
import com.kwai.video.minecraft.model.nano.Minecraft$EnhanceFilterParam;
import com.kwai.video.minecraft.model.nano.Minecraft$CropOptions;
import com.kwai.video.minecraft.model.nano.Minecraft$AudioFilterParam;
import com.kwai.video.minecraft.model.nano.Minecraft$TimeMapParams;
import com.kwai.video.clipkit.config.EditorEncodeConfig$SupportAICutConditions;
import com.kwai.video.devicepersona.hardware.DPHardwareUtils;
import com.kwai.video.minecraft.model.nano.Minecraft$BasicAdjustParam;
import com.kwai.video.editorsdk2.model.ImmutableMap;
import java.util.Collection;
import com.kwai.video.minecraft.model.nano.Minecraft$DeformParam;
import com.kwai.video.minecraft.model.nano.Minecraft$WesterosBodySlimmingAdjust;
import com.kwai.video.minecraft.model.nano.Minecraft$WesterosMakeupResource;
import com.kwai.video.clipkit.TextFilter$TextEffectConfig;
import org.wysaid.nativePort.CGETextEffect$EffectType;
import com.kwai.video.clipkit.utils.TrcxParser;
import com.kwai.video.clipkit.utils.Utils;
import com.kwai.video.clipkit.utils.Lyrics;
import com.kwai.video.clipkit.utils.Lyrics$Line;
import com.kwai.video.clipkit.TextFilter$TextLine;
import android.graphics.Bitmap;
import com.kwai.video.minecraft.model.nano.Minecraft$AICut;
import com.kwai.video.minecraft.model.nano.Minecraft$TemplateSegmentInfo;
import com.kwai.video.minecraft.model.nano.Minecraft$TemplateAssetInfo;
import java.lang.Float;
import android.content.SharedPreferences$Editor;
import oe6.g;

public class ClipKitUtils	// class@001a35
{
    public static final Gson COMMON_GSON;

    static {
       d uod = new d();
       uod.c();
       ClipKitUtils.COMMON_GSON = uod.b();
    }
    public void ClipKitUtils(){
       super();
    }
    public static EditorSdk2$Rational CalculateProjectFps(EditorSdk2V2$VideoEditorProject p0,int p1){
       EditorSdk2$Rational obj1;
       int i3;
       EditorSdk2$Rational rational2;
       Object obj2;
       Object obj = p0;
       ClipKitUtils uClipKitUtil = ClipKitUtils.class;
       EditorSdk2$Rational rational = null;
       if (PatchProxy.isSupport(uClipKitUtil)) {
          obj1 = PatchProxy.applyTwoRefs(obj, Integer.valueOf(p1), rational, uClipKitUtil, "38");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       if (p0.trackAssets() == null) {
          return rational;
       }else if((double)p0.compositionFrameRate() - 0x3f50624dd2f1a9fc > 0){
          return rational;
       }else {
          obj1 = new EditorSdk2$Rational();
          obj1.setDen(1);
          obj1.setNum(30);
          EditorSdk2$Rational rational1 = new EditorSdk2$Rational();
          rational1.setDen(1);
          rational1.setNum(20);
          int i = 0;
          int i1 = 0;
          while (true) {
             int i2 = 0xbff0000000000000;
             if (i1 < p0.trackAssetsSize()) {
                EditorSdk2V2$TrackAsset trackAsset = obj.trackAssets(i1);
                if (trackAsset == null) {
                   break ;
                }else if(!p0.isKwaiPhotoMovie() && i1 > 0){
                   EditorSdk2V2$TimeRangeV2 timeRangeV2 = trackAsset.clippedRange();
                }
                EditorSdk2$ProbedStream probedStream = EditorSdk2UtilsV2.trackAssetProbedVideoStream(trackAsset);
                if (probedStream == null && !EditorSdk2UtilsV2.trackAssetHasAudioStream(trackAsset)) {
                   i3 = p1;
                }else if(p1 == 4){
                   rational2 = probedStream.avgFrameRate();
                }else {
                   rational2 = probedStream.guessedFrameRate();
                }
                if (rational2 != null) {
                   double d = ClipKitUtils.RationalToDouble(rational2);
                   if (i2 - d < 0) {
                      rational = rational2;
                      i2 = d;
                   }
                   p0.isKwaiPhotoMovie();
                   obj2 = rational;
                   rational = rational2;
                label_009e :
                   if (p0.projectFpsCalculateMethod() == -191872522478563900000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000.00f) {
                      return rational;
                   }else if(p0.projectFpsCalculateMethod() == 1){
                      return obj2;
                   }else if(i2 - ClipKitUtils.RationalToDouble(obj1) > 0){
                      return obj1;
                   }else if(i2 - ClipKitUtils.RationalToDouble(rational1) > 0){
                      return obj2;
                   }else {
                      int i4 = 0;
                      int i5 = 0;
                      while (i4 < p0.trackAssetsSize()) {
                         EditorSdk2V2$TrackAsset trackAsset1 = obj.trackAssets(i4);
                         if (!i5 && trackAsset1.visualEffects() != null) {
                            i3 = 0;
                            while (i3 < trackAsset1.visualEffectsSize()) {
                               if (trackAsset1.visualEffects(i3) != null && trackAsset1.visualEffects(i3).visualEffectType()) {
                                  i5 = 1;
                               }
                               i3 = i3 + 1;
                            }
                            i3 = (trackAsset1.transitionParam() != null && trackAsset1.transitionParam().type())? 1: 0;
                            i5 = i5 | i3;
                            i3 = (trackAsset1.westerosFaceMagicParam() != null)? 1: 0;
                            i5 = i5 | i3;
                            int i6 = (trackAsset1.moreWesterosFaceMagicParams() != null && trackAsset1.moreWesterosFaceMagicParamsSize() > 0)? 1: 0;
                            i5 = i5 | i6;
                         }
                         i4 = i4 + 1;
                      }
                      if (!i5) {
                         if (p0.visualEffects() != null) {
                            i4 = 0;
                            while (i4 < p0.visualEffectsSize()) {
                               if (obj.visualEffects(i4) != null && obj.visualEffects(i4).visualEffectType()) {
                                  i5 = 1;
                               }
                               i4 = i4 + 1;
                            }
                         }
                         i4 = (p0.timeEffect() != null && p0.timeEffect().timeEffectType() == 1)? 1: 0;
                         i4 = i4 | i5;
                         if (p0.animatedSubAssets() != null && p0.animatedSubAssetsSize() > 0) {
                            Iterator iterator = p0.animatedSubAssets().iterator();
                            while (iterator.hasNext()) {
                               EditorSdk2V2$AnimatedSubAsset uAnimatedSub = iterator.next();
                               if (uAnimatedSub == null) {
                                  continue ;
                               }else if(!ClipKitUtils.isSingleStaticImagePath(uAnimatedSub.assetPath())){
                                  if (uAnimatedSub.displayRange() != null) {
                                     double d1 = uAnimatedSub.displayRange().start();
                                     double d2 = uAnimatedSub.displayRange().start() + uAnimatedSub.displayRange().duration();
                                     double computedDura = EditorSdk2UtilsV2.getComputedDuration(p0);
                                     if (computedDura - 0x3f50624dd2f1a9fc >= 0 && d1 - 0x3f50624dd2f1a9fc <= 0) {
                                        computedDura = computedDura - d2;
                                        if (computedDura - 0x3f50624dd2f1a9fc <= 0) {
                                        }
                                     }
                                  }else {
                                     continue ;
                                  }
                               }
                               i4 = 1;
                            }
                         }
                         if (!i4 && p0.touchData() != null) {
                            i5 = 0;
                            while (i5 < p0.touchDataSize()) {
                               if (obj.touchData(i5) != null && obj.touchData(i5).touchFilter()) {
                                  i4 = 1;
                               }
                               i5 = i5 + 1;
                            }
                         }
                         if (p0.overlappedAE2Effects() != null) {
                            i = 1;
                         }
                         i5 = i4 | i;
                      }
                      if (i5 || i2 - 0x3f50624dd2f1a9fc < 0) {
                         return rational1;
                      }else {
                         return obj2;
                      }
                   }
                }
                i1 = i1 + 1;
             }else {
                obj2 = rational;
                goto label_009e ;
             }
          }
          return rational;
       }
    }
    public static double RationalToDouble(EditorSdk2$Rational p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ClipKitUtils.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       if (p0 == null) {
          return Double.MIN_VALUE;
       }
       double d = (p0.den() > 0)? (double)p0.num() / (double)p0.den(): 0;
       return d;
    }
    public static double RationalV2ToDouble(Minecraft$RationalV2 p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ClipKitUtils.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       if (p0 == null) {
          return Double.MIN_VALUE;
       }
       double d = (p0.den() > 0)? (double)p0.num() / (double)p0.den(): 0;
       return d;
    }
    public static boolean avClipIsHDRVideo(Minecraft$KSAVClip p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ClipKitUtils.class, "58");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       EditorSdk2$ProbedStream aVClipStream = EditorSdk2UtilsV2.getAVClipStream(p0);
       boolean b = false;
       if (aVClipStream == null) {
          return b;
       }
       if (aVClipStream.videoColorProperties() != null) {
          int i = aVClipStream.videoColorProperties().colorTrc();
          if (i == 16 || i == 18) {
             b = true;
          }
       }
       return b;
    }
    public static boolean checkProjectSrcFile(EditorSdk2V2$VideoEditorProject p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ClipKitUtils.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          KSClipLog.e("ClipKitUtils", "checkProjectSrcFile project is null");
          return b;
       }else if(p0.trackAssets() != null && (p0.trackAssetsSize() <= 0 || p0.trackAssets(b) == null)){
          KSClipLog.e("ClipKitUtils", "checkProjectSrcFile project.trackAssets is null");
          return b;
       }else {
          String str = p0.trackAssets(b).assetPath();
          if (TextUtils.isEmpty(str)) {
             KSClipLog.e("ClipKitUtils", "checkProjectSrcFile assetPath is empty");
             return b;
          }else if(!new File(str).exists()){
             KSClipLog.e("ClipKitUtils", "checkProjectSrcFile srcFile "+str+" not exists.");
             return b;
          }else {
             KSClipLog.d("ClipKitUtils", "checkProjectSrcFile srcFile "+str+" exists.");
             return true;
          }
       }
    }
    public static boolean checkStream(EditorSdk2V2$VideoEditorProject p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ClipKitUtils.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       int i1 = -1;
       int i2 = -1;
       while (true) {
          if (i >= p0.trackAssetsSize()) {
             return true;
          }
          if (ClipKitUtils.hasAudioStreamByTrack(p0.trackAssets(i))) {
             if (i1 == -1) {
                i1 = 1;
             }else if(i1 != true){
                return false;
             }
          }else if(i1 == -1){
             i1 = 0;
          }else if(i1){
             return false;
          }
          if (ClipKitUtils.hasVideoStreamByTrack(p0.trackAssets(i))) {
             if (i2 == -1) {
                i2 = 1;
             }else if(i2 != true){
                break ;
             }
          }else if(i2 == -1){
             i2 = 0;
          }else if(i2){
             return false;
          }
          i = i + 1;
       }
       return false;
    }
    public static boolean checkVideoIsVaild(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ClipKitUtils.class, "53");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!ClipKitUtils.fileExists(p0)) {
          return b;
       }
       obj = 1;
       try{
          if (EditorSdk2UtilsV2.createProjectWithFile(p0) != null) {
             b = true;
          }
       }catch(com.kwai.video.editorsdk2.EditorSdk2InternalErrorException e3){
          e3.printStackTrace();
       }catch(java.io.IOException e3){
          e3.printStackTrace();
       }
       return b;
    }
    public static boolean clearFile(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ClipKitUtils.class, "54");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null) {
          return false;
       }
       File uFile = new File(p0);
       if (uFile.exists()) {
          return uFile.delete();
       }
       return false;
    }
    public static void copyFile(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, ClipKitUtils.class, "1")) {
          return;
       }
       FileChannel channel = new FileInputStream(p0).getChannel();
       FileChannel channel1 = new FileOutputStream(p1).getChannel();
       channel1.transferFrom(channel, 0, channel.size());
       channel.close();
       channel1.close();
       return;
    }
    public static boolean copyFileOrDir(String p0,Context p1){
       String str;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.applyTwoRefs(p0, p1, null, ClipKitUtils.class, "40");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.applyOneRefs(p1, null, b.class, "7");
       if (obj != patchProxyRe) {
       }else {
          try{
             File externalFile = p1.getExternalFilesDir(null);
             if (externalFile == null) {
                externalFile = p1.getFilesDir();
             }
             str = externalFile.getAbsolutePath();
          }catch(java.lang.Exception e0){
             Log.e("camera", "getExternalFilesDir exception : "+e0.getMessage());
             str = "";
          }
          obj = str;
       }
       return ClipKitUtils.copyFileOrDir(p0, obj, p1);
    }
    public static boolean copyFileOrDir(String p0,String p1,Context p2){
       int i;
       boolean b;
       AssetManager obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, ClipKitUtils.class, "41");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = p2.getAssets();
       try{
          i = 0;
          String[] stringArray = SplitAssetHelper.list(obj, p0);
          String str = p1+"/"+p0;
          if (!stringArray.length) {
             KSClipLog.d("ClipKitUtils", "copyFileOrDir copy from "+p0+" "+str);
             b.a(obj, p0, str);
             return new File(str).exists();
          }else {
             File uFile = new File(str);
             if (!uFile.exists()) {
                uFile.mkdirs();
             }
             b = true;
             int i1 = 0;
             while (i1 < stringArray.length) {
                if (!ClipKitUtils.copyFileOrDir(p0+"/"+stringArray[i1], p1, p2)) {
                   b = false;
                }
                i1 = i1 + 1;
             }
             return b;
          }
       }catch(java.io.IOException e8){
          KSClipLog.e("ClipKitUtils", "copyFileOrDir IOException", e8);
          return i;
       }
    }
    public static String createSessionId(){
       Object obj = PatchProxy.apply(null, null, ClipKitUtils.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return UUID.randomUUID().toString();
    }
    public static long estimatedFileSize(Context p0,EditorSdk2V2$VideoEditorProject p1,LocalExportOption p2,int p3){
       EditorEncodeConfigModule obj;
       long l1;
       Context uContext = p0;
       EditorSdk2V2$VideoEditorProject videoEditorP = p1;
       LocalExportOption localExportO = p2;
       if (PatchProxy.isSupport(ClipKitUtils.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, p2, Integer.valueOf(p3), null, ClipKitUtils.class, "48");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       obj = EditorEncodeConfigManager.getInstance().getEditorEncodeConfigModule(uContext, videoEditorP, p3);
       long l = 0;
       if (obj != null) {
          obj = obj.exportParam;
          if (obj != null) {
             EditorEncodeConfig$LocalVideoEncodeConfig localVideoEn = EditorEncodeConfigManager.getInstance().filterLocalVideoEncodeConfig(localExportO);
             EditorEncodeConfig$AudioEncodeConfig uAudioEncode = EditorEncodeConfigManager.getInstance().filterAudioEncodeConfig();
             if (localVideoEn != null) {
                boolean b = ClipDPHardwareConfigManager.getInstance().isSupportEncode(uContext, Math.max(localExportO.width, localExportO.height));
                if (obj.supportHwEncode != null && b) {
                   l1 = (long)localVideoEn.videoBitrate;
                }else {
                   String x264ParamVal = ClipKitUtils.getx264ParamValue(localVideoEn.x264params, "vbv_maxrate");
                   if (x264ParamVal != null) {
                      l1 = Long.parseLong(x264ParamVal) * 1024;
                   }else {
                   label_007d :
                      l1 = l;
                   }
                }
             }else {
                goto label_007d ;
             }
             long l2 = (uAudioEncode != null)? (long)uAudioEncode.audioBitrate: l;
             double computedDura = EditorSdk2UtilsV2.getComputedDuration(p1);
             if (l1 - l > 0 && l2 - l > 0) {
                double d = 0;
                if (computedDura - d > 0) {
                   Pair exportSize = ClipKitUtils.getExportSize(videoEditorP, localExportO.width, localExportO.height);
                   float f = (float)(exportSize.first.intValue() * exportSize.second.intValue());
                   Iterator iterator = p1.trackAssets().iterator();
                   while (iterator.hasNext()) {
                      EditorSdk2V2$TrackAsset trackAsset = iterator.next();
                      Pair pair = new Pair(Integer.valueOf(EditorSdk2UtilsV2.getTrackAssetWidth(trackAsset)), Integer.valueOf(EditorSdk2UtilsV2.getTrackAssetHeight(trackAsset)));
                      double trackAssetDi = EditorSdk2UtilsV2.getTrackAssetDisplayDuration(trackAsset);
                      double d1 = 0x3ff0000000000000;
                      if (EditorSdk2UtilsV2.isSingleImagePath(trackAsset.assetPath()) && trackAssetDi - d1 > 0) {
                         trackAssetDi = d1;
                      }
                      Pair sizeAspectRa = ClipKitUtils.getSizeAspectRatioInsideContainerSize(pair, exportSize);
                      int i = sizeAspectRa.first.intValue() * sizeAspectRa.second.intValue();
                      float f1 = (float)i / f;
                      double d2 = (double)l1 * trackAssetDi;
                      trackAssetDi = (double)f1;
                      d1 = d1 - trackAssetDi;
                      d1 = d1 * 0x3fd0000000000000;
                      trackAssetDi = trackAssetDi + d1;
                      d2 = d2 * trackAssetDi;
                      d2 = d2 / 8.00f;
                      d = d + d2;
                   }
                   return Math.round((d + (((double)uAudioEncode.audioBitrate * computedDura) / 8.00f)));
                }
             }
          }
       }
    label_012c :
       return l;
    }
    public static boolean extendVideoTimeRange(EditorSdk2V2$VideoEditorProject p0,double p1){
       MutableArray mutableArray1;
       int i3;
       double d4;
       double d5;
       EditorSdk2V2$AnimatedSubAsset uAnimatedSub;
       double d7;
       Object obj = p0;
       double d = p1;
       ClipKitUtils uClipKitUtil = ClipKitUtils.class;
       if (PatchProxy.isSupport(uClipKitUtil)) {
          Object obj1 = PatchProxy.applyTwoRefs(obj, Double.valueOf(p1), null, uClipKitUtil, "50");
          if (obj1 != PatchProxyResult.class) {
             return obj1.booleanValue();
          }
       }
       double computedDura = EditorSdk2UtilsV2.getComputedDuration(p0);
       String str = "ClipKitUtils";
       int b = false;
       if ((d - computedDura) <= 0) {
          KSClipLog.i(str, "extendVideoTimeRange targetDuration is not longer than project duration, return");
          return b;
       }else {
          double d1 = Math.ceil(((d / computedDura) - 0x3ff0000000000000));
          MutableArray mutableArray = p0.trackAssets().mutableCopy();
          ArrayList uArrayList = new ArrayList();
          double d2 = computedDura;
          int i = 0;
          while (true) {
             if (i < mutableArray.size()) {
                EditorSdk2V2$TrackAsset trackAsset = mutableArray.get(i).clone();
                if (trackAsset == null) {
                   KSClipLog.e(str, "extendVideoTimeRange copy TrackAsset failed. return false ");
                   return b;
                }else {
                   mutableArray1 = mutableArray;
                   trackAsset.setAssetId(EditorSdk2Utils.getRandomID());
                   uArrayList.add(trackAsset);
                   d2 = d2 + trackAsset.clippedRange().duration();
                   if (d2 - d >= 0) {
                   label_008e :
                      b = 1;
                      String str1 = str;
                      uArrayList.get((uArrayList.size() - b)).setClippedRange(EditorSdk2UtilsV2.createTimeRange(uArrayList.get((uArrayList.size() - b)).clippedRange().start(), (uArrayList.get((uArrayList.size() - b)).clippedRange().duration() - (d2 - d))));
                      for (int i1 = 0; i1 < uArrayList.size(); i1 = i1 + 1) {
                         mutableArray1.add(uArrayList.get(i1));
                      }
                      obj.setTrackAssets(mutableArray1.immutableCopy());
                      ImmutableArray immutableArr = p0.audioAssets();
                      int i2 = 0;
                      while (i2 < immutableArr.size()) {
                         if (immutableArr.get(i2).displayRange() == null) {
                            i3 = 0;
                         }else if(immutableArr.get(i2).displayRange().start() > 0 || immutableArr.get(i2).displayRange().duration() - computedDura < 0){
                            immutableArr.get(i2).displayRange().setDuration(d);
                         }
                         i2 = i2 + 1;
                      }
                      MutableArray mutableArray2 = p0.animatedSubAssets().mutableCopy();
                      i2 = mutableArray2.size();
                      ArrayList uArrayList1 = new ArrayList();
                      int i4 = 0;
                      while (true) {
                         if ((double)i4 - d1 < 0) {
                            i4 = i4 + 1;
                            d2 = (double)i4 * computedDura;
                            i = 0;
                            while (true) {
                               if (i < i2) {
                                  double d3 = d2 + mutableArray2.get(i).displayRange().start();
                                  if (d3 - d >= 0) {
                                     d4 = computedDura;
                                     d5 = d1;
                                     i3 = 0;
                                  }else {
                                     uAnimatedSub = mutableArray2.get(i).clone();
                                     if (uAnimatedSub == null) {
                                        KSClipLog.e(str1, "extendVideoTimeRange copy AnimatedSubAsset failed. return false ");
                                        return false;
                                     }else {
                                        d4 = computedDura;
                                        uAnimatedSub.setAssetId(EditorSdk2Utils.getRandomID());
                                        d5 = d1;
                                        double d6 = d2 + mutableArray2.get(i).displayRange().start();
                                        uAnimatedSub.displayRange().setStart(d6);
                                        computedDura = mutableArray2.get(i).displayRange().start() + d2;
                                        computedDura = computedDura + mutableArray2.get(i).displayRange().duration();
                                        EditorSdk2$TimeRange timeRange = uAnimatedSub.displayRange();
                                        if (computedDura - d > 0) {
                                           d7 = mutableArray2.get(i).displayRange().duration() - computedDura;
                                           d7 = d7 + d;
                                        }else {
                                           d7 = uAnimatedSub.displayRange().duration();
                                        }
                                        timeRange.setDuration(d7);
                                        uArrayList1.add(uAnimatedSub);
                                     }
                                  }
                                  i = i + 1;
                                  computedDura = d4;
                                  d1 = d5;
                                  uAnimatedSub = 1;
                               }else {
                                  i3 = 0;
                               }
                            }
                         }else if(uArrayList1.size() > 0){
                            for (b = 0; b < uArrayList1.size(); b = b + 1) {
                               mutableArray2.add(uArrayList1.get(b));
                            }
                            obj.setAnimatedSubAssets(mutableArray2.immutableCopy());
                         }
                         break ;
                      }
                      return true;
                   }else {
                      i = i + 1;
                      i = i % mutableArray1.size();
                      mutableArray = mutableArray1;
                      b = false;
                   }
                }
             }else {
                mutableArray1 = mutableArray;
                goto label_008e ;
             }
          }
       }
    }
    public static boolean fileExists(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ClipKitUtils.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (TextUtils.isEmpty(p0)) {
          return false;
       }
       return new File(p0).exists();
    }
    public static String getAVClipCodecName(Minecraft$KSAVClip p0){
       String str;
       String obj = PatchProxy.applyOneRefs(p0, null, ClipKitUtils.class, "56");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       EditorSdk2$ProbedStream aVClipStream = EditorSdk2UtilsV2.getAVClipStream(p0);
       obj = "unknown";
       if (aVClipStream != null) {
          int i = aVClipStream.privateCodecId();
          if (i == 1) {
             str = "h264";
          }else if(i == 2){
             str = "hevc";
          }
          obj = str;
       }
       return obj;
    }
    public static EditorSdk2$VideoColorProperties getAVClipColorProperties(Minecraft$KSAVClip p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ClipKitUtils.class, "60");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       EditorSdk2$ProbedStream aVClipStream = EditorSdk2UtilsV2.getAVClipStream(p0);
       if (aVClipStream == null) {
          return null;
       }
       if (aVClipStream.videoColorProperties() != null) {
          return aVClipStream.videoColorProperties();
       }
       return null;
    }
    public static BenchmarkEncodeProfile getBenchmarkEncodeProfile(int p0){
       if (p0 == 1) {
          return BenchmarkEncodeProfile.MAIN;
       }
       if (p0 != 2) {
          return BenchmarkEncodeProfile.BASELINE;
       }
       return BenchmarkEncodeProfile.HIGH;
    }
    public static File getCacheDirFile(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ClipKitUtils.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.getApplicationContext().getExternalCacheDir();
    }
    public static String getClipkitAndAEVersion(){
       int i1;
       Object obj = PatchProxy.apply(null, null, ClipKitUtils.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       try{
          i1 = Integer.parseInt(ClipKitUtils$CLIPKIT_VERSION.CLIPKIT_VERSION_MAX.toString());
          try{
             i = Integer.parseInt(AE2Logger$Version.Version_Max.toString());
          label_002d :
             return (i1 - 1)+"."+(i - 1);
          }catch(java.lang.NumberFormatException e2){
          }
          e2.printStackTrace();
          goto label_002d ;
       }catch(java.lang.NumberFormatException e2){
          i1 = 0;
          goto label_002a ;
       }
    }
    public static String getCodecName(EditorSdk2V2$TrackAsset p0){
       String str;
       String obj = PatchProxy.applyOneRefs(p0, null, ClipKitUtils.class, "55");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       EditorSdk2$ProbedStream probedStream = EditorSdk2UtilsV2.trackAssetProbedVideoStream(p0);
       obj = "unknown";
       if (probedStream != null) {
          int i = probedStream.privateCodecId();
          if (i == 1) {
             str = "h264";
          }else if(i == 2){
             str = "hevc";
          }
          obj = str;
       }
       return obj;
    }
    public static double getDecimalValue(double p0,int p1){
       ClipKitUtils uClipKitUtil = ClipKitUtils.class;
       if (PatchProxy.isSupport(uClipKitUtil)) {
          Object obj = PatchProxy.applyTwoRefs(Double.valueOf(p0), Integer.valueOf(p1), null, uClipKitUtil, "26");
          if (obj != PatchProxyResult.class) {
             return obj.doubleValue();
          }
       }
       double d = (double)p1;
       return ((double)Math.round((p0 * d)) / (d * 0x3ff0000000000000));
    }
    public static Pair getExportSize(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(ClipKitUtils.class)) {
          Object obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), null, ClipKitUtils.class, "28");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return EditorSdk2UtilsV2.limitWidthAndHeight(p0, p1, p2, p3, 2, 2);
    }
    public static Pair getExportSize(EditorSdk2V2$VideoEditorProject p0,int p1,int p2){
       if (PatchProxy.isSupport(ClipKitUtils.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, ClipKitUtils.class, "27");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return ClipKitUtils.getExportSize(p0, p1, p2, 1);
    }
    public static Pair getExportSize(EditorSdk2V2$VideoEditorProject p0,int p1,int p2,int p3){
       String obj;
       int trackAssetWi;
       int trackAssetHe;
       double d2;
       int i4;
       int i5;
       EditorSdk2V2$VideoEditorProject videoEditorP = p0;
       int i = p1;
       int i1 = p2;
       int i2 = p3;
       if (PatchProxy.isSupport(ClipKitUtils.class)) {
          obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), null, ClipKitUtils.class, "29");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = ",return\(0,0\)";
       String str = "ClipKitUtils";
       int i3 = 0;
       if (i <= 0 || i1 <= 0) {
          KSClipLog.e(str, "invalid maxWidth:"+i+" or maxHeight:"+i1+obj);
          return new Pair(Integer.valueOf(i3), Integer.valueOf(i3));
       }else if(!p0.isKwaiPhotoMovie() && (i2 != 2 && (i2 == 5 || i2 == 3))){
          return EditorSdk2UtilsV2.getExportSize(p0, p1, p2);
       }else if(p0.projectOutputWidth() <= 0 || (p0.projectOutputHeight() <= 0 && p0.trackAssetsSize() > 0)){
          EditorSdk2V2$TrackAsset trackAsset = videoEditorP.trackAssets(i3);
          trackAssetWi = EditorSdk2UtilsV2.getTrackAssetWidth(trackAsset);
          trackAssetHe = EditorSdk2UtilsV2.getTrackAssetHeight(trackAsset);
       }else if(i2 == 11){
          trackAssetHe = p0.projectOutputWidth();
          trackAssetWi = p0.projectOutputHeight();
       }else {
          trackAssetHe = 0;
          trackAssetWi = 0;
       }
       trackAssetWi = trackAssetHe;
       trackAssetHe = trackAssetWi;
       for (int i6 = 0; i6 < p0.trackAssetsSize(); i6 = i6 + 1) {
          EditorSdk2V2$TrackAsset trackAsset1 = videoEditorP.trackAssets(i6);
          trackAssetWi = Math.max(trackAssetWi, EditorSdk2UtilsV2.getTrackAssetWidth(trackAsset1));
          trackAssetHe = Math.max(trackAssetHe, EditorSdk2UtilsV2.getTrackAssetHeight(trackAsset1));
       }
       if (!trackAssetWi || !trackAssetHe) {
          KSClipLog.e(str, "projectWidth:"+trackAssetWi+",projectHeight:"+trackAssetHe+obj);
          return new Pair(Integer.valueOf(i3), Integer.valueOf(i3));
       }else {
          double d = 0x3ff0000000000000;
          if (p0.projectOutputWidth() > 0 && p0.projectOutputHeight() > 0) {
             double d1 = ((double)p0.projectOutputHeight() * d) / (double)p0.projectOutputWidth();
             d2 = (double)trackAssetHe;
             double d3 = (double)trackAssetWi;
             double d4 = (d2 * d) / d3;
             if (d1 - d4 > 0) {
                trackAssetHe = (int)Math.round((d3 * d1));
             }else if(d1 - d4 < 0){
                trackAssetWi = (int)Math.round((d2 / d1));
             }
          }
          d2 = Math.min((((double)Math.max(p1, p2) * d) / (double)Math.max(trackAssetWi, trackAssetHe)), (((double)Math.min(p1, p2) * d) / (double)Math.min(trackAssetWi, trackAssetHe)));
          if (d2 - d < 0) {
             i4 = (int)Math.round(((double)trackAssetWi * d2));
             i5 = (int)Math.round(((double)trackAssetHe * d2));
          }else {
             i5 = trackAssetHe;
             i4 = trackAssetWi;
          }
          i3 = i4 % 2;
          if (i3) {
             i4 = i4 + (i3 - 2);
             i5 = Math.round(((float)(((trackAssetHe * i4) + trackAssetWi) - 1) / (float)trackAssetWi));
          }
          i3 = i4 % 2;
          trackAssetHe = i5 % 2;
          i4 = i4 + i3;
          i5 = i5 + trackAssetHe;
          if (Math.max(i4, i5) > Math.max(p1, p2) || Math.min(i4, i5) > Math.min(p1, p2)) {
             i4 = i4 - (i3 * 2);
             i5 = i5 - (trackAssetHe * 2);
          }
          return new Pair(Integer.valueOf(i4), Integer.valueOf(i5));
       }
    }
    public static float getExportSpeed(Context p0,int p1,int p2){
       String str;
       if (PatchProxy.isSupport(ClipKitUtils.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, ClipKitUtils.class, "33");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       if (p0 == null) {
          return 0;
       }else if(p1 == 5){
          str = "clip_hw_export_speed";
       }else {
          str = "clip_sw_export_speed";
       }
       if (p2 > 0) {
          float floatx = o.c(p0, ClipKitUtils.getExportSpeedVideoTypeSpKey(p2), 4).getFloat(str, 0);
          KSClipLog.i("ClipKitUtils", "getExportSpeed "+str+" videoType:"+p2+" speed:"+floatx);
          if (floatx > 0) {
             return floatx;
          }
       }
       float floatx1 = o.c(p0, "clip_export_speed", 4).getFloat(str, 0);
       KSClipLog.i("ClipKitUtils", "getExportSpeed "+str+" common speed:"+floatx1);
       return floatx1;
    }
    public static String getExportSpeedVideoTypeSpKey(int p0){
       ClipKitUtils uClipKitUtil = ClipKitUtils.class;
       if (PatchProxy.isSupport(uClipKitUtil)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uClipKitUtil, "31");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return "clip_export_speed_"+p0;
    }
    public static String getExtensionLowerCaseName(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ClipKitUtils.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null && p0.length() > 0) {
          int i = p0.lastIndexOf(46);
          if (i > -1 && i < (p0.length() - 1)) {
             return (p0.substring((i + 1))).toLowerCase();
          }
       }
       return "";
    }
    public static Utils$Size getImageMaxSize(Context p0,int p1){
       String obj;
       ClipKitUtils uClipKitUtil = ClipKitUtils.class;
       if (PatchProxy.isSupport(uClipKitUtil)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uClipKitUtil, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = "EditorImageConfig";
       if (p1 < 0) {
          Point screenWidthH = ClipKitUtils.getScreenWidthHeight(p0);
          KSClipLog.d(obj, "getScreenSize: "+screenWidthH.x+" x "+screenWidthH.y);
          return new Utils$Size(screenWidthH.x, screenWidthH.y);
       }else {
          KSClipLog.d(obj, "getSize: "+p1);
          return new Utils$Size(p1, p1);
       }
    }
    public static LocalExportCondition getLocalExportCondition(int p0,int p1){
       List obj;
       ClipKitUtils uClipKitUtil = ClipKitUtils.class;
       LocalExportCondition localExportC = null;
       if (PatchProxy.isSupport(uClipKitUtil)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), localExportC, uClipKitUtil, "43");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = ClipKitUtils.getLocalExportConditions();
       if (obj != null && obj.size() > 0) {
          int i = 0;
          while (i < obj.size()) {
             LocalExportCondition localExportC1 = obj.get(i);
             LocalExportCondition maxWidth = localExportC1.maxWidth;
             if (p0 >= maxWidth) {
                LocalExportCondition maxHeight = localExportC1.maxHeight;
                if (p1 >= maxHeight) {
                   if (localExportC != null) {
                      LocalExportCondition maxWidth1 = localExportC.maxWidth;
                      if (maxWidth1 >= maxWidth || (localExportC.maxHeight >= maxHeight && (maxWidth1 != maxWidth || (localExportC.maxHeight != maxHeight || localExportC.maxFps >= localExportC1.maxFps)))) {
                      label_0059 :
                         i = i + 1;
                      }
                   }
                   localExportC = localExportC1;
                   goto label_0059 ;
                }
             }
          }
       }
       return localExportC;
    }
    public static LocalExportCondition getLocalExportConditionDefault(){
       Object obj = PatchProxy.apply(null, null, ClipKitUtils.class, "44");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ClipKitUtils.getLocalExportCondition(0x2710, 0x2710);
    }
    public static List getLocalExportConditions(){
       ClipKitConfig obj = PatchProxy.apply(null, null, ClipKitUtils.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = ClipKitConfigManager.getInstance().getConfig();
       if (obj != null) {
          return obj.getEditorEncodeConfig().localExportConditions;
       }
       return null;
    }
    public static int getLocalExportMaxFps(int p0,int p1){
       ClipKitUtils uClipKitUtil = ClipKitUtils.class;
       if (PatchProxy.isSupport(uClipKitUtil)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), null, uClipKitUtil, "45");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p0 > 0 && p1 > 0) {
          LocalExportCondition localExportC = ClipKitUtils.getLocalExportConditionDefault();
          if (p0 <= localExportC.maxWidth && p1 <= localExportC.maxHeight) {
             LocalExportCondition localExportC1 = ClipKitUtils.getLocalExportCondition(p0, p1);
             localExportC1 = (localExportC1 == null)? 60: localExportC1.maxFps;
             return localExportC1;
          }
       }
       return 0;
    }
    public static int getLogSkipTransCode(int p0){
       p0--;
       return p0;
    }
    public static int getMaxBytesToUse(EditorSdk2$ExportOptions p0,Context p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, ClipKitUtils.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int networkState = NetworkUtils.getNetworkState(p1);
       if (networkState == 5 && p0.skipTranscodeConfig().maxBytes4G() > 0) {
          return p0.skipTranscodeConfig().maxBytes4G();
       }
       if (networkState == 2 || (networkState == 6 && p0.skipTranscodeConfig().maxBytesWifi() > 0)) {
          return p0.skipTranscodeConfig().maxBytesWifi();
       }
       return p0.skipTranscodeConfig().maxBytes();
    }
    public static EditorSdk2Utils$PreviewSizeLimitation getPreviewSizeLimitation(int p0){
       ClipKitConfig obj;
       ClipKitUtils uClipKitUtil = ClipKitUtils.class;
       if (PatchProxy.isSupport(uClipKitUtil)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uClipKitUtil, "62");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = ClipKitConfigManager.getInstance().getConfig();
       if (obj == null || obj.getPreviewConfig() == null) {
          KSClipLog.e("ClipKitUtils", "getPreviewSizeLimitation clipKitConfig or previewConfig is null");
          return EditorSdk2Utils$PreviewSizeLimitation.PREVIEW_SIZE_LIMITATION_720P;
       }else {
          p0 = obj.getPreviewConfig().getPreviewSizeShortEdge(p0);
          if (p0 > 1440) {
             return EditorSdk2Utils$PreviewSizeLimitation.PREVIEW_SIZE_LIMITATION_MAX_GL_SIZE;
          }else if(p0 > 1080){
             return EditorSdk2Utils$PreviewSizeLimitation.PREVIEW_SIZE_LIMITATION_1440P;
          }else if(p0 > 720){
             return EditorSdk2Utils$PreviewSizeLimitation.PREVIEW_SIZE_LIMITATION_1080P;
          }else if(p0 > 576){
             return EditorSdk2Utils$PreviewSizeLimitation.PREVIEW_SIZE_LIMITATION_720P;
          }else if(p0 > 540){
             return EditorSdk2Utils$PreviewSizeLimitation.PREVIEW_SIZE_LIMITATION_576P;
          }else if(p0 > 0){
             return EditorSdk2Utils$PreviewSizeLimitation.PREVIEW_SIZE_LIMITATION_540P;
          }else {
             return EditorSdk2Utils$PreviewSizeLimitation.PREVIEW_SIZE_LIMITATION_720P;
          }
       }
    }
    public static EditorSdk2Utils$PreviewSizeLimitation getPreviewSizeLimitation(int p0,int p1){
       EditorSdk2Utils$PreviewSizeLimitation obj;
       ClipKitUtils uClipKitUtil = ClipKitUtils.class;
       if (PatchProxy.isSupport(uClipKitUtil)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), null, uClipKitUtil, "61");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = ClipKitUtils.getPreviewSizeLimitation(p0);
       if (p0 == 5) {
          if (p1 == 1 && ClipKitUtils.previewSizeLimitationBiggerOrEqualThan576(obj)) {
             obj = EditorSdk2Utils$PreviewSizeLimitation.PREVIEW_SIZE_LIMITATION_576P;
          }else if(p1 == 2 && ClipKitUtils.previewSizeLimitationBiggerOrEqualThan720(obj)){
             obj = EditorSdk2Utils$PreviewSizeLimitation.PREVIEW_SIZE_LIMITATION_720P;
          }else if(p1 == 3 && ClipKitUtils.previewSizeLimitationBiggerOrEqualThan1080(obj)){
             obj = EditorSdk2Utils$PreviewSizeLimitation.PREVIEW_SIZE_LIMITATION_1080P;
          }
       }
       if (p0 != 20 && (p0 == 21 || p0 == 24)) {
          obj = EditorSdk2Utils$PreviewSizeLimitation.PREVIEW_SIZE_LIMITATION_1440P;
       }
       return obj;
    }
    public static Point getScreenWidthHeight(Context p0){
       Point obj = PatchProxy.applyOneRefs(p0, null, ClipKitUtils.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Point();
       p0.getApplicationContext().getSystemService("window").getDefaultDisplay().getRealSize(obj);
       return obj;
    }
    public static Pair getSizeAspectRatioInsideContainerSize(Pair p0,Pair p1){
       int i2;
       int i3;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, ClipKitUtils.class, "47");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = p0.first.intValue();
       int i1 = p0.second.intValue();
       double d = ((double)p1.first.intValue() * 0x3ff0000000000000) / (double)p0.first.intValue();
       double d1 = ((double)p1.second.intValue() * 0x3ff0000000000000) / (double)p0.second.intValue();
       if (d - d1 > 0) {
          i2 = (int)((double)i * d1);
          i3 = p1.second.intValue();
       }else {
          i2 = p1.first.intValue();
          i3 = (int)((double)i1 * d);
       }
       return new Pair(Integer.valueOf(i2), Integer.valueOf(i3));
    }
    public static Minecraft$Range getTimeRangeFromAVClip(Minecraft$TemplateClip p0,String p1){
       Minecraft$Range obj = PatchProxy.applyTwoRefs(p0, p1, null, ClipKitUtils.class, "64");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Minecraft$TemplateReference templateRefe = p0.mediaReference();
       if (templateRefe != null) {
          ArrayList arrayList = templateRefe.visibleTimes().getArrayList();
          if (arrayList != null && !arrayList.isEmpty()) {
             Iterator iterator = arrayList.iterator();
             while (iterator.hasNext()) {
                obj = iterator.next();
                if (obj != null && (Long.toString(obj.id())).equals(p1)) {
                   return obj;
                }
             }
          }
       }
       return null;
    }
    public static EditorSdk2$VideoColorProperties getTrackAsssetColorProperties(EditorSdk2V2$TrackAsset p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ClipKitUtils.class, "59");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       EditorSdk2$ProbedStream probedStream = EditorSdk2UtilsV2.trackAssetProbedVideoStream(p0);
       if (probedStream == null) {
          return null;
       }
       if (probedStream.videoColorProperties() != null) {
          return probedStream.videoColorProperties();
       }
       return null;
    }
    public static String getx264ParamValue(String p0,String p1){
       String str = null;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, str, ClipKitUtils.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String[] stringArray = p0.split(":");
       int len = stringArray.length;
       int i = 0;
       while (i < len) {
          object oobject = stringArray[i];
          if (!oobject.contains(p1)) {
             i = i + 1;
          }else {
             stringArray = oobject.split("=");
             len = 1;
             if (stringArray.length > len) {
                str = (stringArray[len]).replace(" ", "");
                break ;
             }else {
                break ;
             }
          }
       }
       return str;
    }
    public static boolean hasAudioStreamByTrack(EditorSdk2V2$TrackAsset p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ClipKitUtils.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null) {
          return false;
       }
       return EditorSdk2UtilsV2.trackAssetHasAudioStream(p0);
    }
    public static boolean hasTimeEffect(EditorSdk2V2$VideoEditorProject p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ClipKitUtils.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0.timeEffect() != null && p0.timeEffect().timeEffectType()) {
          return true;
       }
       int i = 0;
       while (true) {
          if (i >= p0.trackAssetsSize()) {
             return false;
          }
          double d = p0.trackAssets(i).assetSpeed() - 0x3ff0000000000000;
          if (Math.abs(d) - 0x3eb0c6f7a0000000 > 0 || p0.trackAssets(i).isReversed()) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public static boolean hasVideoStreamByTrack(EditorSdk2V2$TrackAsset p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ClipKitUtils.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       if (EditorSdk2UtilsV2.trackAssetProbedVideoStream(p0) != null) {
          b = true;
       }
       return b;
    }
    public static boolean hasWesterosBeautyFilterParam(EditorSdk2V2$TrackAsset p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ClipKitUtils.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null || p0.westerosBeautyFilterParam() == null) {
          return false;
       }
       return ClipKitUtils.isWesterosBeautyFilterParamWork(p0.westerosBeautyFilterParam()).booleanValue();
    }
    public static boolean hasWesterosBodySlimmingParam(EditorSdk2V2$TrackAsset p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ClipKitUtils.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null || p0.westerosBodySlimmingParam() == null) {
          return false;
       }
       return ClipKitUtils.isWesterosBodySlimmingParamWork(p0.westerosBodySlimmingParam()).booleanValue();
    }
    public static boolean hasWesterosFaceMagic(EditorSdk2V2$TrackAsset p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ClipKitUtils.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null) {
          return false;
       }
       if (ClipKitUtils.isWesterosFaceMagicParamWork(p0.westerosFaceMagicParam())) {
          return true;
       }
       if (p0.moreWesterosFaceMagicParams() != null) {
          Iterator iterator = p0.moreWesterosFaceMagicParams().iterator();
          while (iterator.hasNext()) {
             if (ClipKitUtils.isWesterosFaceMagicParamWork(iterator.next())) {
                return true;
             }
          }
       }
       return false;
    }
    public static boolean hasWesterosMakeupParam(EditorSdk2V2$TrackAsset p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ClipKitUtils.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null || p0.westerosMakeupParam() == null) {
          return false;
       }
       return ClipKitUtils.isWesterosMakeupParamWork(p0.westerosMakeupParam());
    }
    public static void initJniKim(Context p0,KSClipLogger p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, ClipKitUtils.class, "30")) {
          return;
       }
       EditorSdk2Utils.initJni(p0.getApplicationContext(), new ClipKitUtils$1(p0), new Minecraft$ResourcePathConfig());
       EditorSdk2Utils.setAndroidDecoderConfig(ClipDPHardwareConfigManager.getInstance().getAndroidDecodeConfig(true));
       KSClipLog.setKSClipLogger(p1, true, false);
       new Handler(Looper.getMainLooper()).postDelayed(new ClipKitUtils$2(), 5000);
       return;
    }
    public static boolean isAssetTransformInvalid(Minecraft$AssetTransform p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ClipKitUtils.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0.scaleX() - 0x3eb0c6f7a0b5ed8d < 0 || p0.scaleY() - 0x3eb0c6f7a0b5ed8d < 0)? true: false;
       return b;
    }
    public static boolean isEnableVideoQualityEvaluateTask(int p0){
       ClipKitUtils uClipKitUtil = ClipKitUtils.class;
       if (PatchProxy.isSupport(uClipKitUtil)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uClipKitUtil, "67");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return EditorSdk2UtilsV2.isEnableVideoQualityEvaluateTask(p0);
    }
    public static boolean isEqualToIdentityTransform(Minecraft$AssetTransform p0,boolean p1){
       Object obj;
       ClipKitUtils uClipKitUtil = ClipKitUtils.class;
       if (PatchProxy.isSupport(uClipKitUtil)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), null, uClipKitUtil, "22");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = true;
       obj = (Math.abs((p0.anchorX() - 50.00f)) - 0x3cb0000000000000 < 0 && Math.abs((p0.anchorY() - 50.00f)) - 0x3cb0000000000000 < 0)? 1: 0;
       if (Math.abs((p0.positionX() - 50.00f)) - 0x3cb0000000000000 < 0 && Math.abs((p0.positionY() - 50.00f)) - 0x3cb0000000000000 < 0) {
          double d = 100.00f;
          if (Math.abs((p0.scaleX() - d)) - 0x3cb0000000000000 < 0 && (Math.abs((p0.scaleY() - d)) - 0x3cb0000000000000 < 0 && (Math.abs((p0.rotate() - 0)) - 0x3cb0000000000000 < 0 && (Math.abs((p0.opacity() - 0)) - 0x3cb0000000000000 < 0 && (!p0.flipX() && (!p0.flipY() && (p1 || obj))))))) {
          label_00a5 :
             return b;
          }
       }
    label_00a4 :
       b = false;
       goto label_00a5 ;
    }
    public static boolean isHDRVideo(EditorSdk2V2$TrackAsset p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ClipKitUtils.class, "57");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       EditorSdk2$ProbedStream probedStream = EditorSdk2UtilsV2.trackAssetProbedVideoStream(p0);
       boolean b = false;
       if (probedStream == null) {
          return b;
       }
       if (probedStream.videoColorProperties() != null) {
          int i = probedStream.videoColorProperties().colorTrc();
          if (i == 16 || i == 18) {
             b = true;
          }
       }
       return b;
    }
    public static boolean isPreviewSizeLimitationConfigAvaiable(){
       ClipKitConfig obj = PatchProxy.apply(null, null, ClipKitUtils.class, "63");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = ClipKitConfigManager.getInstance().getConfig();
       if (obj == null) {
          return false;
       }
       EditorPreviewConfig previewConfi = obj.getPreviewConfig();
       if (previewConfi == null) {
          return false;
       }
       return previewConfi.isPreviewSizeLimitationsAvaliable();
    }
    public static int isProjectMustBeTranscode(Context p0,EditorSdk2V2$VideoEditorProject p1,EditorSdk2$ExportOptions p2){
       return ClipKitUtils.isProjectMustBeTranscodeWithResult(p0, p1, p2, 4, false).result;
    }
    public static ClipKitUtils$ProjectTranscodeResult isProjectMustBeTranscodeWithResult(Context p0,EditorSdk2V2$VideoEditorProject p1,EditorSdk2$ExportOptions p2,int p3,boolean p4){
       ClipKitUtils$ProjectTranscodeResult obj;
       double d;
       EditorSdk2V2$TrackAsset trackAsset;
       long l;
       String str;
       EditorSdk2$ProbedStream probedStream;
       long l2;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       int i = p3;
       ClipKitUtils uClipKitUtil = ClipKitUtils.class;
       int i1 = 3;
       int i2 = 5;
       int i3 = 2;
       int i4 = 0;
       if (PatchProxy.isSupport(uClipKitUtil)) {
          Object[] objArray = new Object[i2];
          objArray[i4] = oobject;
          objArray[1] = oobject1;
          objArray[i3] = oobject2;
          objArray[i1] = Integer.valueOf(p3);
          objArray[4] = Boolean.valueOf(p4);
          obj = PatchProxy.apply(objArray, null, uClipKitUtil, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ClipKitUtils$ProjectTranscodeResult();
       obj.result = 1;
       if (p1.isKwaiPhotoMovie()) {
          obj.reason = 81;
          KSClipLog.v("ClipKitUtils", "PROJECT_MUST_TRANSCODE isKwaiPhotoMovie");
          return obj;
       }else if(p1.deletedRanges() != null && p1.deletedRangesSize() > 0){
          obj.reason = 90;
          KSClipLog.v("ClipKitUtils", "PROJECT_MUST_TRANSCODE has deletedRanges");
          return obj;
       }else {
          int i5 = 0;
          while (true) {
             int i6 = 0x3f50624dd2f1a9fc;
             if (i5 < p1.trackAssetsSize()) {
                if (EditorSdk2UtilsV2.isSingleImagePath(oobject1.trackAssets(i4).assetPath())) {
                   obj.reason = 30;
                   KSClipLog.v("ClipKitUtils", "PROJECT_MUST_TRANSCODE no probedAssetFile,path:"+oobject1.trackAssets(i4).assetPath());
                   return obj;
                }else if(EditorSdk2UtilsV2.trackAssetProbedVideoStream(oobject1.trackAssets(i5)) != null){
                   d = EditorSdk2UtilsV2.trackAssetProbedFileDuration(oobject1.trackAssets(i5));
                   double d1 = (oobject1.trackAssets(i5).clippedRange() != null)? oobject1.trackAssets(i5).clippedRange().duration(): d;
                   d = d - d1;
                   if (Math.abs(d) - i6 > 0) {
                      obj.reason = 110;
                      KSClipLog.v("ClipKitUtils", "PROJECT_MUST_TRANSCODE has clipped_duration");
                      return obj;
                   }
                }
                i5 = i5 + 1;
             }else if(ClipKitUtils.hasTimeEffect(p1)){
                obj.reason = 120;
                KSClipLog.v("ClipKitUtils", "PROJECT_MUST_TRANSCODE hasTimeEffect");
                return obj;
             }else if(p1.projectOutputWidth() > 0 && p1.projectOutputHeight() > 0){
                i5 = EditorSdk2UtilsV2.getTrackAssetWidth(oobject1.trackAssets(i4));
                int trackAssetHe = EditorSdk2UtilsV2.getTrackAssetHeight(oobject1.trackAssets(i4));
                if (i5 > 0 && (trackAssetHe > 0 && Math.abs(((((double)p1.projectOutputWidth() * 0x3ff0000000000000) / (double)p1.projectOutputHeight()) - (((double)i5 * 0x3ff0000000000000) / (double)trackAssetHe))) - 0x3eb0c6f7a0000000 > 0)) {
                   obj.reason = 130;
                   KSClipLog.v("ClipKitUtils", "PROJECT_MUST_TRANSCODE projectOutputWidth:"+p1.projectOutputWidth()+",projectOutputHeight:"+p1.projectOutputHeight());
                   return obj;
                }
             }
          label_015f :
             if (p1.animatedSubAssets() != null && p1.animatedSubAssetsSize() > 0) {
                obj.reason = 150;
                KSClipLog.v("ClipKitUtils", "PROJECT_MUST_TRANSCODE has animatedSubAssets");
                return obj;
             }else if(p1.beautyFilter() != null && (p1.beautyFilter().type() && (p1.beautyFilter().bright() > 0 || p1.beautyFilter().soft() > 0))){
                obj.reason = 160;
                KSClipLog.v("ClipKitUtils", "PROJECT_MUST_TRANSCODE has beautyFilter");
                return obj;
             }else if(p1.visualEffects() != null){
                i5 = p1.visualEffectsSize() - 1;
                while (true) {
                   if (i5 >= 0) {
                      if (oobject1.visualEffects(i5).visualEffectType()) {
                         obj.reason = 170;
                         KSClipLog.v("ClipKitUtils", "PROJECT_MUST_TRANSCODE has visualEffects");
                         return obj;
                      }else {
                         i5 = i5 - 1;
                      }
                   }
                }
             }
             if (p1.touchData() != null && p1.touchDataSize() > 0) {
                obj.reason = 180;
                KSClipLog.v("ClipKitUtils", "PROJECT_MUST_TRANSCODE has touchData");
                return obj;
             }else if(p1.colorFilter() != null && p1.colorFilter().type()){
                obj.reason = 190;
                KSClipLog.v("ClipKitUtils", "PROJECT_MUST_TRANSCODE has colorFilter");
                return obj;
             }else if(p1.enhanceFilter() != null && p1.enhanceFilter().enableEnhanceFilter()){
                obj.reason = 200;
                KSClipLog.v("ClipKitUtils", "PROJECT_MUST_TRANSCODE has enableEnhanceFilter");
                return obj;
             }else if(p1.enhanceColorFilter() != null && (p1.enhanceColorFilter().type() && (p1.enhanceColorFilter().intensity() - null > 0 && (p1.enhanceColorFilter().resourceFiles() != null && (p1.enhanceColorFilter().resourceFilesSize() > 0 && !TextUtils.isEmpty(p1.enhanceColorFilter().resourceFiles(0))))))){
                obj.reason = 202;
                KSClipLog.v("ClipKitUtils", "PROJECT_MUST_TRANSCODE has enhanceColorFilter");
                return obj;
             }else if(p1.overlappedAE2Effects() != null && p1.overlappedAE2Effects().size() > 0){
                obj.reason = 201;
                KSClipLog.v("ClipKitUtils", "PROJECT_MUST_TRANSCODE has ae2Effects");
                return obj;
             }else {
                i5 = 0;
                while (true) {
                   if (i5 < p1.trackAssetsSize()) {
                      trackAsset = oobject1.trackAssets(i5);
                      if (trackAsset.cropOptions() != null && (trackAsset.cropOptions().transform() != null && !ClipKitUtils.isEqualToIdentityTransform(trackAsset.cropOptions().transform(), 1))) {
                         obj.reason = 210;
                         KSClipLog.v("ClipKitUtils", "PROJECT_MUST_TRANSCODE has cropOptions.transform");
                         return obj;
                      }else {
                         Minecraft$AssetTransform uAssetTransf = trackAsset.assetTransform();
                         if (uAssetTransf != null && (!ClipKitUtils.isAssetTransformInvalid(uAssetTransf) && !ClipKitUtils.isEqualToIdentityTransform(uAssetTransf, 1))) {
                            obj.reason = 220;
                            KSClipLog.v("ClipKitUtils", "PROJECT_MUST_TRANSCODE has assetTransform");
                            return obj;
                         }else {
                            Minecraft$TransitionParam transitionPa = trackAsset.transitionParam();
                            if (transitionPa != null && transitionPa.type()) {
                               obj.reason = 221;
                               KSClipLog.v("ClipKitUtils", "PROJECT_MUST_TRANSCODE has transitionParam");
                               return obj;
                            }else if(trackAsset.colorFilter() == null || (trackAsset.colorFilter().type() || trackAsset.alphaInfo())){
                               obj.reason = 230;
                               KSClipLog.v("ClipKitUtils", "PROJECT_MUST_TRANSCODE has colorFilter or alphaInfo");
                               return obj;
                            }else {
                               i3 = trackAsset.rotationDeg() % 360;
                               if (i3) {
                                  obj.reason = 240;
                                  KSClipLog.v("ClipKitUtils", "PROJECT_MUST_TRANSCODE has rotationDeg");
                                  return obj;
                               }else if(trackAsset.audioFilterParam() != null && trackAsset.audioFilterParam().audioChangeType()){
                                  obj.reason = 250;
                                  KSClipLog.v("ClipKitUtils", "PROJECT_MUST_TRANSCODE has audioFilterParam");
                                  return obj;
                               }else if(trackAsset.timeMap() != null && (trackAsset.timeMap().keyFrames() != null && trackAsset.timeMap().keyFramesSize() > 0)){
                                  obj.reason = 251;
                                  KSClipLog.v("ClipKitUtils", "PROJECT_MUST_TRANSCODE has timeMap");
                                  return obj;
                               }else if(ClipKitUtils.hasWesterosBeautyFilterParam(trackAsset)){
                                  obj.reason = 252;
                                  KSClipLog.v("ClipKitUtils", "PROJECT_MUST_TRANSCODE has westerosBeautyFilterParam");
                                  return obj;
                               }else if(ClipKitUtils.hasWesterosFaceMagic(trackAsset)){
                                  obj.reason = 253;
                                  KSClipLog.v("ClipKitUtils", "PROJECT_MUST_TRANSCODE has westerosFaceMagicParam");
                                  return obj;
                               }else if(ClipKitUtils.hasWesterosMakeupParam(trackAsset)){
                                  obj.reason = 254;
                                  KSClipLog.v("ClipKitUtils", "PROJECT_MUST_TRANSCODE has westerosMakeupParam");
                                  return obj;
                               }else if(ClipKitUtils.hasWesterosBodySlimmingParam(trackAsset)){
                                  obj.reason = 255;
                                  KSClipLog.v("ClipKitUtils", "PROJECT_MUST_TRANSCODE has westerosBodySlimmingParam");
                                  return obj;
                               }else {
                                  i5 = i5 + 1;
                               }
                            }
                         }
                      }
                   }else if(oobject2 != null && p2.skipTranscodeConfig() != null){
                      if (!p2.skipTranscodeConfig().enabled() || p2.discardVideoTrackInMediaFile()) {
                         if (!p2.skipTranscodeConfig().enabled()) {
                            obj.reason = 10;
                            break ;
                         }else if(p2.discardVideoTrackInMediaFile()){
                            obj.reason = 20;
                            break ;
                         }
                         break ;
                      }else if(!ClipKitUtils.isValidProject(p1)){
                         obj.reason = 70;
                         KSClipLog.v("ClipKitUtils", "PROJECT_MUST_TRANSCODE not valid project");
                         return obj;
                      }else if(p1.trackAssetsSize() > 1){
                         if (i == 1) {
                            obj.reason = 101;
                            KSClipLog.v("ClipKitUtils", "PROJECT_MUST_TRANSCODE videoType:"+i+",multiTrack false");
                            return obj;
                         }else if(!ClipKitUtils.checkStream(p1)){
                            obj.reason = 100;
                            KSClipLog.v("ClipKitUtils", "PROJECT_MUST_TRANSCODE checkStream false");
                            return obj;
                         }
                      }
                      l = 0;
                      i = 0;
                      while (true) {
                         if (i < p1.trackAssetsSize()) {
                            if (EditorSdk2UtilsV2.trackAssetProbedVideoStream(oobject1.trackAssets(i)) != null) {
                               long l1 = EditorSdk2UtilsV2.trackAssetProbedVideoStream(oobject1.trackAssets(i)).bitRate();
                               if (p2.skipTranscodeConfig().maxAvgVideoBitrate() > 0 && l1 - (long)p2.skipTranscodeConfig().maxAvgVideoBitrate() > 0) {
                                  obj.reason = 40;
                                  Object[] objArray1 = new Object[]{oobject1.trackAssets(i).assetPath(),Long.valueOf(l1),Integer.valueOf(p2.skipTranscodeConfig().maxAvgVideoBitrate())};
                                  KSClipLog.v("ClipKitUtils", String.format("PROJECT_MUST_TRANSCODE trackAssetPath:%s,%d > %d", objArray1));
                                  return obj;
                               }
                            }
                            File uFile = new File(oobject1.trackAssets(i).assetPath());
                            if (uFile.exists()) {
                               l = l + uFile.length();
                               i3 = ClipKitUtils.getMaxBytesToUse(oobject2, oobject);
                               if (p4 && p2.skipTranscodeConfig().enableUploadDecision()) {
                                  i3 = p2.skipTranscodeConfig().uploadDecisionMaxBytes();
                                  str = "\(use uploadDecisionOption\)";
                               }else {
                                  str = "";
                               }
                               if (l - (long)i3 > 0) {
                                  obj.reason = 50;
                                  KSClipLog.v("ClipKitUtils", "PROJECT_MUST_TRANSCODE totalFileSize:"+l+">"+i3+str);
                                  return obj;
                               }
                            }
                            if (!p2.skipTranscodeConfig().supportAdvancedColorspace() && EditorSdk2UtilsV2.trackAssetProbedVideoStream(oobject1.trackAssets(i)) != null) {
                               probedStream = EditorSdk2UtilsV2.trackAssetProbedVideoStream(oobject1.trackAssets(i));
                               if (("video").equals(probedStream.codecType())) {
                                  if (probedStream.colorSpace() != 6) {
                                     if (probedStream.colorSpace() != 5) {
                                        i2 = 2;
                                        if (probedStream.colorSpace() != i2) {
                                        }
                                     }else {
                                        i2 = 2;
                                     }
                                  }else {
                                     i2 = 2;
                                     l2 = 5;
                                  }
                                  if (probedStream.colorRange() == i2) {
                                  }else {
                                  label_0528 :
                                     i = i + 1;
                                  }
                               }
                            }
                            l2 = 5;
                            goto label_0528 ;
                         }
                      }
                      obj.reason = 60;
                      KSClipLog.v("ClipKitUtils", "PROJECT_MUST_TRANSCODE colorspace:"+probedStream.colorSpace()+",colorRange:"+probedStream.colorRange());
                      return obj;
                   }
                   obj.result = 0;
                   if (p1.muteFlags()) {
                      obj.reason = 1010;
                      KSClipLog.v("ClipKitUtils", "PROJECT_SKIP_VIDEO_TRANSCODE has muteFlags:"+p1.muteFlags());
                   label_0594 :
                      l = 0;
                   }else if(p1.trackAssetsSize() > 1){
                      obj.reason = 1020;
                      KSClipLog.v("ClipKitUtils", "PROJECT_SKIP_VIDEO_TRANSCODE trackAssets size:"+p1.trackAssetsSize());
                      goto label_0594 ;
                   }else if(p1.audioAssets() != null && p1.audioAssetsSize() > 0){
                      obj.reason = 1030;
                      KSClipLog.v("ClipKitUtils", "PROJECT_SKIP_VIDEO_TRANSCODE audioAssets size:"+p1.audioAssetsSize());
                      goto label_0594 ;
                   }else if(Math.abs((oobject1.trackAssets(0).volume() - 0x3ff0000000000000)) - 0x3f50624dd2f1a9fc > 0){
                      obj.reason = 1040;
                      KSClipLog.v("ClipKitUtils", "PROJECT_SKIP_VIDEO_TRANSCODE trackAsset volume:"+oobject1.trackAssets(0).volume());
                   }else if(oobject2 != null && !TextUtils.isEmpty(p2.comment())){
                      obj.reason = 1050;
                      KSClipLog.v("ClipKitUtils", "PROJECT_SKIP_VIDEO_TRANSCODE has comment");
                   }else {
                      obj.result = -1;
                   }
                   if (obj.result == null) {
                      i4 = 0;
                      while (true) {
                         if (i4 < p1.trackAssetsSize()) {
                            if (!ClipKitUtils.isSupportTrackAssetRemuxPath(oobject1.trackAssets(i4).assetPath())) {
                               obj.reason = 260;
                               KSClipLog.d("ClipKitUtils", "PROJECT_MUST_TRANSCODE,trackAsset index:"+i4+",path:"+oobject1.trackAssets(i4).assetPath());
                               obj.result = 1;
                               return obj;
                            }else {
                               i4 = i4 + 1;
                            }
                         }
                      }
                   }
                   if (obj.result == -1) {
                      obj.reason = 0x2710;
                      KSClipLog.v("ClipKitUtils", "PROJECT_SKIP_TRANSCODE");
                   }
                   return obj;
                }
                KSClipLog.v("ClipKitUtils", "PROJECT_MUST_TRANSCODE options.skipTranscodeConfig.enable:"+p2.skipTranscodeConfig().enabled()+",options.discardVideoTrackInMediaFile:"+p2.discardVideoTrackInMediaFile());
                return obj;
             }
          }
       }
    }
    public static boolean isSingleStaticImagePath(String p0){
       String obj = PatchProxy.applyOneRefs(p0, null, ClipKitUtils.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = new File(p0).getName();
       int i = 1;
       obj = (obj.substring((obj.lastIndexOf(46) + i))).toLowerCase();
       if (obj.equals("jpg") || (obj.equals("png") || (!obj.equals("jpeg") && (!obj.equals("bmp") || p0.contains("%d"))))) {
          i = false;
       }
       return i;
    }
    public static boolean isSupportAICut(){
       EditorEncodeConfig$SupportAICutConditions obj = PatchProxy.apply(null, null, ClipKitUtils.class, "51");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = EditorEncodeConfigManager.getInstance().getSupportAICutConditions();
       if (obj != null) {
          return obj.isSupportAICut;
       }
       if ((double)DPHardwareUtils.getRamTotalSize() - 0x41eb333333333333 >= 0) {
          return true;
       }
       return false;
    }
    public static boolean isSupportTrackAssetRemuxPath(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ClipKitUtils.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!TextUtils.isEmpty(p0)) {
          p0 = p0.toLowerCase();
          if (!p0.endsWith(".mp4") && (p0.endsWith(".ts") || p0.endsWith(".mov"))) {
             return true;
          }
       }
       return false;
    }
    public static boolean isValidProject(EditorSdk2V2$VideoEditorProject p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ClipKitUtils.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0.trackAssets() == null || !p0.trackAssetsSize()) {
          return false;
       }
       return true;
    }
    public static Boolean isWesterosBeautyFilterParamWork(Minecraft$WesterosBeautyFilterParam p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ClipKitUtils.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if ((double)p0.brightIntensity() - 0x3cb0000000000000 <= 0 && ((double)p0.softenIntensity() - 0x3cb0000000000000 <= 0 && ((double)p0.wrinkleRemoveIntensity() - 0x3cb0000000000000 <= 0 && ((double)p0.eyeBagRemoveIntensity() - 0x3cb0000000000000 <= 0 && ((double)p0.eyeBrightenIntensity() - 0x3cb0000000000000 <= 0 && ((double)p0.teethBrightenIntensity() - 0x3cb0000000000000 <= 0 && ((double)p0.beautifyLipsIntensity() - 0x3cb0000000000000 <= 0 && ((double)p0.noseShadowIntensity() - 0x3cb0000000000000 <= 0 && ((double)p0.clarityIntensity() - 0x3cb0000000000000 <= 0 && ((double)p0.faceShadowIntensity() - 0x3cb0000000000000 > 0 || (p0.basicAdjustParam() != null && ((double)p0.basicAdjustParam().brightnessIntensity() - 0x3cb0000000000000 <= 0 && ((double)p0.basicAdjustParam().contrastIntensity() - 0x3cb0000000000000 <= 0 && ((double)p0.basicAdjustParam().saturationIntensity() - 0x3cb0000000000000 <= 0 && ((double)p0.basicAdjustParam().temperatureIntensity() - 0x3cb0000000000000 > 0 || (double)p0.basicAdjustParam().sharpenIntensity() - 0x3cb0000000000000 > 0))))))))))))))) {
          return Boolean.TRUE;
       }
       Iterator iterator = p0.deformParams().values().iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return Boolean.FALSE;
          }
          if ((double)iterator.next().intensity() - 0x3cb0000000000000 > 0) {
             break ;
          }
       }
       return Boolean.TRUE;
    }
    public static Boolean isWesterosBodySlimmingParamWork(Minecraft$WesterosBodySlimmingParam p0){
       Minecraft$WesterosBodySlimmingAdjust obj = PatchProxy.applyOneRefs(p0, null, ClipKitUtils.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.adjusts() == null) {
          return Boolean.FALSE;
       }
       Iterator iterator = p0.adjusts().iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return Boolean.FALSE;
          }
          obj = iterator.next();
          if (obj.type() && (double)obj.intensity() - 0x3cb0000000000000 > 0) {
             break ;
          }
       }
       return Boolean.TRUE;
    }
    public static boolean isWesterosFaceMagicParamWork(Minecraft$WesterosFaceMagicParam p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ClipKitUtils.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && (!TextUtils.isEmpty(p0.assetDir()) && !TextUtils.isEmpty(p0.indexFile())))? true: false;
       return b;
    }
    public static boolean isWesterosMakeupParamWork(Minecraft$WesterosMakeupParam p0){
       Minecraft$WesterosMakeupResource obj = PatchProxy.applyOneRefs(p0, null, ClipKitUtils.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0.resources() == null) {
          return false;
       }
       Iterator iterator = p0.resources().iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return false;
          }
          obj = iterator.next();
          if (obj != null && (!TextUtils.isEmpty(obj.resourceDir()) && (!TextUtils.isEmpty(obj.type()) && (double)obj.intensity() - 0x3cb0000000000000 > 0))) {
             break ;
          }
       }
       return true;
    }
    public static TextFilter$TextEffectConfig parseLyricsConfigFromFile(String p0,TextFilter$TextEffectConfig p1,CGETextEffect$EffectType p2){
       TextFilter$TextLine textLine1;
       TrcxParser obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, ClipKitUtils.class, "49");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new TrcxParser();
       p0 = Utils.readContent(new File(p0));
       if (TextUtils.isEmpty(p0)) {
          return null;
       }
       Lyrics lyrics = TrcxParser.parse(p0);
       TextFilter$TextEffectConfig textEffectCo = new TextFilter$TextEffectConfig();
       textEffectCo.textLines = new ArrayList(lyrics.mLines.size());
       for (int i = 0; i < lyrics.mLines.size(); i = i + 1) {
          Lyrics$Line line = lyrics.mLines.get(i);
          TextFilter$TextLine textLine = new TextFilter$TextLine(line.mText, (double)line.mStart, (double)line.mDuration);
          if (p1 != null) {
             TextFilter$TextEffectConfig textLines = p1.textLines;
             if (textLines != null && textLines.size() > 0) {
                int i1 = p1.textLines.size() - 1;
                if (i > i1) {
                   textLines = p1.textLines;
                   int i2 = textLines.size() - 1;
                   textLine1 = textLines.get(i2);
                }else {
                   textLine1 = p1.textLines.get(i);
                }
                v9.color = textLine1.color;
                v9.font = textLine1.font;
             }
          }
          textEffectCo.textLines.add(v9);
       }
       textEffectCo.effectType = p2;
       if (p1 != null) {
          textEffectCo.startTime = p1.startTime;
          textEffectCo.assetsDir = p1.assetsDir;
          textEffectCo.effectType = p1.effectType;
          textEffectCo.startTime = p1.startTime;
       }
       double d = (double)lyrics.mDuration;
       textEffectCo.totalDurationTime = d;
       if (!d - null) {
          TextFilter$TextEffectConfig textLines1 = textEffectCo.textLines;
          TextFilter$TextLine textLine2 = textLines1.get((textLines1.size() - 1));
          textEffectCo.totalDurationTime = (textLine2.timestamp + textLine2.duration) + 0x408f400000000000;
       }
       return textEffectCo;
    }
    public static Bitmap preProcessBitmapForFaceBlend(String p0,String p1,String p2,Context p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, ClipKitUtils.class, "52");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p0) || (TextUtils.isEmpty(p1) || (!new File(p0).exists() || (!TextUtils.isEmpty(p2) && p3 != null)))) {
          return Utils.preProcessBitmapForFaceBlend(p0, p1, p2, p3);
       }
       KSClipLog.e("ClipKitUtils", "preProcessBitmapForFaceBlend failed. file not exist in mediaPath or mediaPath is null:"+p0);
       return null;
    }
    public static boolean previewSizeLimitationBiggerOrEqualThan1080(EditorSdk2Utils$PreviewSizeLimitation p0){
       boolean b = (p0 == EditorSdk2Utils$PreviewSizeLimitation.PREVIEW_SIZE_LIMITATION_1080P || p0 == EditorSdk2Utils$PreviewSizeLimitation.PREVIEW_SIZE_LIMITATION_1440P)? true: false;
       return b;
    }
    public static boolean previewSizeLimitationBiggerOrEqualThan576(EditorSdk2Utils$PreviewSizeLimitation p0){
       boolean b = (p0 != EditorSdk2Utils$PreviewSizeLimitation.PREVIEW_SIZE_LIMITATION_576P && (p0 != EditorSdk2Utils$PreviewSizeLimitation.PREVIEW_SIZE_LIMITATION_720P && (p0 != EditorSdk2Utils$PreviewSizeLimitation.PREVIEW_SIZE_LIMITATION_DEFAULT && (p0 == EditorSdk2Utils$PreviewSizeLimitation.PREVIEW_SIZE_LIMITATION_1080P || p0 == EditorSdk2Utils$PreviewSizeLimitation.PREVIEW_SIZE_LIMITATION_1440P))))? true: false;
       return b;
    }
    public static boolean previewSizeLimitationBiggerOrEqualThan720(EditorSdk2Utils$PreviewSizeLimitation p0){
       boolean b = (p0 != EditorSdk2Utils$PreviewSizeLimitation.PREVIEW_SIZE_LIMITATION_720P && (p0 != EditorSdk2Utils$PreviewSizeLimitation.PREVIEW_SIZE_LIMITATION_DEFAULT && (p0 == EditorSdk2Utils$PreviewSizeLimitation.PREVIEW_SIZE_LIMITATION_1080P || p0 == EditorSdk2Utils$PreviewSizeLimitation.PREVIEW_SIZE_LIMITATION_1440P)))? true: false;
       return b;
    }
    public static boolean replaceableClipFromAssetInfoOrSegmentInfo(Minecraft$TemplateClip p0,String p1){
       ArrayList obj = PatchProxy.applyTwoRefs(p0, p1, null, ClipKitUtils.class, "66");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Minecraft$AICut uAICut = p0.aicut();
       if (uAICut != null) {
          obj = uAICut.segmentInfos().getArrayList();
          if (obj != null && !obj.isEmpty()) {
             Iterator iterator = obj.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   Minecraft$TemplateSegmentInfo templateSegm = iterator.next();
                   if (templateSegm != null && (!("ks_opening").equals(templateSegm.assetTag()) && !("ks_ending").equals(templateSegm.assetTag()))) {
                      ArrayList arrayList = templateSegm.assetInfos().getArrayList();
                      if (arrayList != null && !arrayList.isEmpty()) {
                         Iterator iterator1 = arrayList.iterator();
                         while (true) {
                            if (iterator1.hasNext()) {
                               Minecraft$TemplateAssetInfo templateAsse = iterator1.next();
                               if (templateAsse != null && (templateAsse.refId() != null && (templateAsse.refId()).equals(p1))) {
                                  return true;
                               }
                            }else {
                               continue ;
                            }
                         }
                      }
                   }
                }
             }
          }
          ArrayList arrayList1 = uAICut.assetInfos().getArrayList();
          if (arrayList1 != null && !arrayList1.isEmpty()) {
             Iterator iterator2 = arrayList1.iterator();
             while (iterator2.hasNext()) {
                Minecraft$TemplateAssetInfo templateAsse1 = iterator2.next();
                if (templateAsse1 != null && (templateAsse1.refId() != null && (templateAsse1.refId()).equals(p1))) {
                   return true;
                }else {
                   continue ;
                }
             }
          }
       }
       return false;
    }
    public static boolean replaceableClipIsOpeingOrEnding(Minecraft$TemplateClip p0,String p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, null, ClipKitUtils.class, "65");
       if (p1 != PatchProxyResult.class) {
          return p1.booleanValue();
       }
       Minecraft$AICut uAICut = p0.aicut();
       if (uAICut != null) {
          ArrayList arrayList = uAICut.segmentInfos().getArrayList();
          if (arrayList != null && !arrayList.isEmpty()) {
             Iterator iterator = arrayList.iterator();
             while (iterator.hasNext()) {
                Minecraft$TemplateSegmentInfo templateSegm = iterator.next();
                if (templateSegm != null && (("ks_opening").equals(templateSegm.assetTag()) || ("ks_ending").equals(templateSegm.assetTag()))) {
                   return true;
                }
             }
          }
       }
       return false;
    }
    public static void saveExportSpeed(Context p0,int p1,int p2,float p3){
       if (PatchProxy.isSupport(ClipKitUtils.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Float.valueOf(p3), null, ClipKitUtils.class, "32")) {
          return;
       }
       if (p0 != null) {
          float f = 0;
          if (p3 - f > 0) {
             String str = (p1 == 5)? "clip_hw_export_speed": "clip_sw_export_speed";
             String str1 = "clip_export_speed";
             float floatx = o.c(p0, str1, 4).getFloat(str, f);
             float f1 = 0x3f000000;
             float f2 = (floatx - f > 0)? (floatx * f1) + (p3 * f1): p3;
             g.a(o.c(p0, str1, 4).edit().putFloat(str, f2));
             KSClipLog.i("ClipKitUtils", "saveExportSpeed "+str+" common old:"+floatx+" cur:"+p3+" save:"+f2);
             if (p2 <= 0) {
                return;
             }else {
                str1 = ClipKitUtils.getExportSpeedVideoTypeSpKey(p2);
                float floatx1 = o.c(p0, str1, 4).getFloat(str, f);
                f = (floatx1 - f > 0)? (floatx1 * f1) + (f1 * p3): p3;
                g.a(o.c(p0, str1, 4).edit().putFloat(str, f));
                KSClipLog.i("ClipKitUtils", "saveExportSpeed "+str+" videoType:"+p2+" old:"+floatx1+" cur:"+p3+" save:"+f);
             }
          }
       }
       return;
    }
}
