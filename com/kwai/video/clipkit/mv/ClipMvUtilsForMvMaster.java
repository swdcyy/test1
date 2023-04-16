package com.kwai.video.clipkit.mv.ClipMvUtilsForMvMaster;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Object;
import com.kwai.video.clipkit.mv.EditorSdk2MvCreationResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.video.clipkit.mv.EditorSdk2MvCreationResultImpl;
import java.util.ArrayList;
import java.io.File;
import org.json.JSONObject;
import org.json.JSONArray;
import com.kwai.video.editorsdk2.logger.EditorSdkLogger;
import com.kwai.video.clipkit.mv.MvMusicAsset;
import com.kwai.video.clipkit.error.EditorSdk2MvCreationException;
import org.json.JSONException;
import java.lang.Exception;
import com.kwai.video.clipkit.KSClipLog;
import org.wysaid.nativePort.CGETextEffect$EffectType;
import com.kwai.video.clipkit.TextFilter$TextEffectConfig;
import com.kwai.video.clipkit.ClipKitUtils;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import com.kwai.video.minecraft.model.EditorSdk2V2$TimeRangeV2;
import com.kwai.video.minecraft.model.EditorSdk2V2$AudioAsset;
import com.kwai.video.clipkit.mv.KwaiMvParam;
import com.kwai.video.clipkit.model.nano.ClipkitSdk$ClipKitBackgroundVideo;
import com.kwai.FaceMagic.AE2.AE2Project;
import com.kwai.FaceMagic.AE2.AE2AssetPtrVec;
import com.kwai.FaceMagic.AE2.AE2Asset;
import com.kwai.FaceMagic.AE2.AE2TimeRangeVec;
import com.kwai.video.minecraft.model.EditorSdk2V2$AnimatedSubAsset;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$TimeRange;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import com.kwai.video.minecraft.model.nano.Minecraft$PropertyKeyFrame;
import com.kwai.video.minecraft.model.nano.Minecraft$AssetTransform;
import com.kwai.FaceMagic.AE2.AE2TimeRange;
import com.kwai.video.minecraft.model.nano.Minecraft$CropOptions;
import com.kwai.video.minecraft.model.nano.Minecraft$WesterosFaceMagicParam;
import com.kwai.video.minecraft.model.nano.Minecraft$Range;
import com.kwai.video.minecraft.model.nano.Minecraft$TimeMapKeyFrame;
import com.kwai.video.minecraft.model.nano.Minecraft$Vec2f;
import com.kwai.video.minecraft.model.nano.Minecraft$TimeMapParams;
import com.kwai.video.clipkit.mv.EditorSdk2MvAssetImpl;
import com.kwai.video.clipkit.mv.AllMvReplaceableAreaDetail;
import com.kwai.video.clipkit.mv.MvPhotoInfo;
import java.util.List;
import java.lang.Integer;
import java.util.Iterator;
import com.kwai.video.clipkit.mv.MvReplaceAreaRule;
import com.kwai.video.clipkit.mv.MvReplaceableAreaDetail;
import com.kwai.video.clipkit.mv.ReplaceableAreaInfo;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$RectF;
import com.kwai.video.clipkit.mv.EditorSdk2MvCreationResult$TemplateType;
import com.kwai.FaceMagic.AE2.AE2Parser$Resource;
import com.kwai.FaceMagic.AE2.AE2Parser;
import java.lang.Number;
import java.lang.Boolean;
import java.lang.Double;
import java.io.FileInputStream;

public class ClipMvUtilsForMvMaster	// class@001aab
{
    public static String ASSETS = "assets";
    public static String ASSETS_FILENAME;
    public static String AUDIO_EXTENSION;
    public static String AUDIO_FILE_NAME_DEFAULT;
    public static String AUDIO_FILE_NAME_TYPE_1;
    public static String CONFIG_FILENAME;
    public static String JSON_EXTENSION;
    public static String MUSIC_Effect_DIR;
    public static String SETTINGS;
    public static String SETTING_FILENAME;
    public static String VIDEO_EXTENSION;
    public static String VIDEO_FILE_NAME_DEFAULT;
    public static String VIDEO_FILE_NAME_Type1;

    static {
       ClipMvUtilsForMvMaster.SETTING_FILENAME = ClipMvUtilsForMvMaster.SETTINGS+"."+ClipMvUtilsForMvMaster.JSON_EXTENSION;
       ClipMvUtilsForMvMaster.ASSETS_FILENAME = ClipMvUtilsForMvMaster.ASSETS+"."+ClipMvUtilsForMvMaster.JSON_EXTENSION;
       ClipMvUtilsForMvMaster.CONFIG_FILENAME = "config.json";
       ClipMvUtilsForMvMaster.VIDEO_FILE_NAME_DEFAULT = "backgroundVideo";
       ClipMvUtilsForMvMaster.VIDEO_FILE_NAME_Type1 = "templateVideo";
       ClipMvUtilsForMvMaster.VIDEO_EXTENSION = ".mp4";
       ClipMvUtilsForMvMaster.AUDIO_EXTENSION = ".mp3";
       ClipMvUtilsForMvMaster.AUDIO_FILE_NAME_DEFAULT = "backgroundAudio";
       ClipMvUtilsForMvMaster.AUDIO_FILE_NAME_TYPE_1 = "templateAudio";
    }
    public void ClipMvUtilsForMvMaster(){
       super();
    }
    public static EditorSdk2MvCreationResult createProjectWithTemplate(String p0){
       int i2;
       JSONObject jSONObject2;
       JSONArray jSONArray1;
       JSONArray jSONArray2;
       String str11;
       int i3;
       boolean b;
       int i7;
       String str13;
       int i8;
       double d;
       JSONArray jSONArray4;
       int i9;
       String str14;
       ArrayList uArrayList4;
       int i10;
       double d1;
       ArrayList uArrayList5;
       String str16;
       TextFilter$TextEffectConfig textEffectCo;
       String str17;
       String str18;
       String str19;
       double d2;
       JSONArray jSONArray5;
       int i12;
       JSONObject jSONObject4;
       KwaiMvParam kwaiMvParam1;
       TextFilter$TextEffectConfig textEffectCo1;
       AE2Project uAE2Project;
       String str20;
       ArrayList uArrayList6;
       String str21;
       String str24;
       File uFile;
       JSONObject jSONObject5;
       ArrayList uArrayList7;
       int i14;
       AE2TimeRangeVec uAE2TimeRang;
       String str27;
       EditorSdk2$TimeRange timeRange1;
       double d5;
       JSONArray jSONArray7;
       Minecraft$PropertyKeyFrame propertyKeyF2;
       Minecraft$CropOptions uCropOptions;
       Minecraft$AssetTransform uAssetTransf;
       Minecraft$WesterosFaceMagicParam westerosFace;
       EditorSdk2$TimeRange timeRange2;
       int i16;
       JSONArray jSONArray8;
       JSONObject jSONObject6;
       ArrayList uArrayList8;
       Minecraft$TimeMapKeyFrame[] timeMapKeyFr;
       JSONArray jSONArray9;
       double d6;
       JSONArray jSONArray10;
       JSONObject jSONObject8;
       String str28;
       String str29;
       double d7;
       JSONArray jSONArray11;
       double d8;
       int i18;
       EditorSdk2MvAssetImpl uEditorSdk2M;
       JSONObject jSONObject9;
       ArrayList uArrayList10;
       JSONArray jSONArray14;
       ReplaceableAreaInfo rect;
       String str = p0;
       String str1 = "p";
       String str2 = "{}";
       JSONArray obj = PatchProxy.applyOneRefs(str, null, ClipMvUtilsForMvMaster.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 9;
       if (TextUtils.isEmpty(p0)) {
          return new EditorSdk2MvCreationResultImpl(i, -50001, "invalid param");
       }
       ArrayList uArrayList = new ArrayList();
       String separator = File.separator;
       String str3 = str+separator+ClipMvUtilsForMvMaster.CONFIG_FILENAME;
       if (!new File(str3).exists()) {
          return ClipMvUtilsForMvMaster.resultWithoutConfigFile(p0);
       }
       JSONObject jSONObject = ClipMvUtilsForMvMaster.parseObjectWithJsonString(ClipMvUtilsForMvMaster.readJsonFromFile(str3));
       JSONObject jSONObject1 = jSONObject.optJSONObject(ClipMvUtilsForMvMaster.SETTINGS);
       JSONArray jSONArray = jSONObject.optJSONArray(ClipMvUtilsForMvMaster.ASSETS);
       int i1 = -50002;
       if (jSONArray == null) {
          return new EditorSdk2MvCreationResultImpl(i, i1, "error parse json");
       }
       String str4 = "ClipMvUtilsForMvMaster";
       if (jSONObject1 == null) {
          EditorSdkLogger.i(str4, "settings do not exist");
       }
       ArrayList uArrayList1 = new ArrayList();
       String str5 = ClipMvUtilsForMvMaster.musicConfigPath(p0);
       String str6 = "height";
       String str7 = "width";
       ArrayList uArrayList2 = uArrayList;
       String str8 = "replaceable";
       String str9 = str2;
       str2 = "id";
       String str10 = str1;
       if (!ClipMvUtilsForMvMaster.isEmpty(str5)) {
          obj = ClipMvUtilsForMvMaster.parseSettingsJson(str5+separator+ClipMvUtilsForMvMaster.ASSETS_FILENAME).optJSONArray(ClipMvUtilsForMvMaster.ASSETS);
          i2 = 0;
          while (i2 < obj.length()) {
             try{
                jSONObject2 = obj.getJSONObject(i2);
                jSONArray1 = jSONArray;
                if (jSONObject2.optBoolean(str8, true)) {
                   MvMusicAsset mvMusicAsset = new MvMusicAsset();
                   jSONArray2 = obj;
                   mvMusicAsset.width = jSONObject2.getInt(str7);
                   mvMusicAsset.height = jSONObject2.getInt(str6);
                   mvMusicAsset.assetID = jSONObject2.getString(str2);
                   str11 = str5;
                   mvMusicAsset.path = str5+File.separator+jSONObject2.getString("path");
                   uArrayList1.add(mvMusicAsset);
                }else {
                   jSONArray2 = obj;
                   str11 = str5;
                }
                i2 = i2 + 1;
                jSONArray = jSONArray1;
                obj = jSONArray2;
                str5 = str11;
             }catch(org.json.JSONException e0){
                throw new EditorSdk2MvCreationException("Error parsing music->assets.json: "+e0.toString(), e0);
             }
          }
       }
       jSONArray1 = jSONArray;
       str11 = str5;
       ArrayList uArrayList3 = new ArrayList();
       separator = "";
       if (jSONObject1 != null) {
          String str12 = jSONObject1.optString("backgroundVideo", separator);
          i3 = 0;
          JSONArray jSONArray3 = jSONObject1.optJSONArray("editPhotos");
          int i4 = jSONObject1.optInt("order", i3);
          int i5 = jSONObject1.optInt("minVersion", i3);
          int i6 = jSONObject1.optInt("blendMode", i3);
          b = jSONObject1.optBoolean("restoreAlpha", true);
          i7 = jSONObject1.optInt(str7, i3);
          i = jSONObject1.optInt(str6, i3);
          try{
             str13 = jSONObject1.getString("backgroundAudio");
          }catch(org.json.JSONException e0){
             e0.printStackTrace();
             EditorSdkLogger.w(str4, "Settings.json do not has backgroundAudio. path: "+str);
             str13 = null;
          }
          i8 = i;
          d = 0;
          jSONArray4 = jSONArray3;
          i3 = i6;
          i9 = i7;
          i1 = i4;
          str14 = str12;
          uArrayList4 = uArrayList1;
          i10 = i5;
          d1 = jSONObject1.optDouble("duration", d);
       }else {
          d = 0;
          d1 = d;
          uArrayList4 = uArrayList1;
          str13 = null;
          i3 = 0;
          i1 = 0;
          i10 = 0;
          i9 = 0;
          str14 = null;
          b = true;
          i8 = 0;
          jSONArray4 = null;
       }
       try{
          if (!d1 - d) {
             d1 = ClipMvUtilsForMvMaster.getMvDurationIfNeeded(jSONObject);
          }
          d = d1;
          if (jSONObject1 != null) {
             String str15 = jSONObject1.optString("lyric");
             if (TextUtils.isEmpty(str15)) {
             label_024e :
                uArrayList5 = uArrayList3;
                str16 = str8;
             }else {
                uArrayList5 = uArrayList3;
                str16 = str8;
                str1 = str+File.separator+str15;
                if (!new File(str1).exists()) {
                   KSClipLog.e(str4, "lyricPath:"+str1+" not exist,lyric will be ignore");
                }else {
                   int i19 = jSONObject1.optInt("lyricEffectType");
                   if (i19 > (CGETextEffect$EffectType.values().length - 1)) {
                      KSClipLog.e(str4, "lyricEffect:"+i19+" not support now");
                   }else {
                      textEffectCo = ClipKitUtils.parseLyricsConfigFromFile(str1, null, CGETextEffect$EffectType.values()[i19]);
                   label_0254 :
                      str15 = "templateVideo.mp4";
                      if (ClipMvUtilsForMvMaster.isEmpty(str14)) {
                         str17 = separator;
                         str18 = str4;
                         str4 = File.separator;
                         str19 = str2;
                         str2 = "backgroundVideo.mp4";
                         str2 = (new File(str+str4+str2).exists())? str+str4+str2: str+str4+str15;
                      }else {
                         str19 = str2;
                         str17 = separator;
                         str18 = str4;
                         str8 = File.separator;
                         str2 = str+str8+str14;
                         if (!new File(str2).exists()) {
                            str2 = str+str8+str15;
                         }
                      }
                      if (!new File(str2).exists()) {
                         str2 = ClipMvUtilsForMvMaster.findFilePathIfError(str, ClipMvUtilsForMvMaster.VIDEO_EXTENSION);
                      }
                      if (e0 == null) {
                         str13 = str+File.separator+"backgroundAudio.mp3";
                         if (!new File(str13).exists()) {
                            str13 = null;
                         }
                      }else {
                         str13 = str+File.separator+e0;
                      }
                      if (!new File(str13).exists()) {
                         str13 = ClipMvUtilsForMvMaster.findFilePathIfError(str, ClipMvUtilsForMvMaster.AUDIO_EXTENSION);
                      }
                      EditorSdk2V2$VideoEditorProject videoEditorP = EditorSdk2UtilsV2.createProjectWithFile(str2);
                      if (!TextUtils.isEmpty(str2) && EditorSdk2UtilsV2.isSingleImagePath(str2)) {
                         str4 = str3;
                         d2 = d;
                         videoEditorP.trackAssets(0).setClippedRange(EditorSdk2UtilsV2.createTimeRange(0, (d / 0x408f400000000000)));
                      }else {
                         d2 = d;
                         str4 = str3;
                      }
                      i7 = 0;
                      if (b) {
                         i2 = 1;
                         videoEditorP.trackAssets(i7).setAlphaInfo(i2);
                      }else {
                         i2 = 1;
                      }
                      if (!TextUtils.isEmpty(str2)) {
                         if (textEffectCo != null) {
                            EditorSdk2V2$AudioAsset[] uAudioAssetA = new EditorSdk2V2$AudioAsset[i2];
                            uAudioAssetA[i7] = EditorSdk2UtilsV2.openAudioAsset(str13);
                            videoEditorP.setAudioAssets(uAudioAssetA);
                            videoEditorP.trackAssets(i7).setVolume(0);
                         }else if(str13 != null){
                            videoEditorP.trackAssets(i7).setAssetAudioPath(str13);
                            videoEditorP.trackAssets(i7).setVolume(0x3ff0000000000000);
                         }
                      }
                      KwaiMvParam kwaiMvParam = new KwaiMvParam();
                      kwaiMvParam.templateDirectory = str;
                      kwaiMvParam.configJsonPath = str4;
                      kwaiMvParam.blendMode = i3;
                      kwaiMvParam.encyptedMethod = i7;
                      kwaiMvParam.renderOrder = i1;
                      kwaiMvParam.minVersion = i10;
                      if (jSONObject1 != null) {
                         double d3 = d2;
                         try{
                            ClipkitSdk$ClipKitBackgroundVideo uClipKitBack = ClipMvUtilsForMvMaster.parseBackgroundVideo(jSONObject1, str, d3);
                            i7 = -50003;
                            if (uClipKitBack == null) {
                               return new EditorSdk2MvCreationResultImpl(9, i7, "create background video failed");
                            }else {
                               kwaiMvParam.bgVideo = uClipKitBack;
                               try{
                                  JSONObject jSONObject3 = jSONObject1.optJSONObject("subVideo");
                                  if (jSONObject3 != null) {
                                     uClipKitBack = ClipMvUtilsForMvMaster.parseBackgroundVideo(jSONObject3, str, 0xbff0000000000000);
                                     if (uClipKitBack == null) {
                                        return new EditorSdk2MvCreationResultImpl(9, i7, "create sub background video failed");
                                     }else {
                                        kwaiMvParam.subBgVideo = uClipKitBack;
                                     }
                                  }
                               }catch(org.json.JSONException e0){
                                  throw new EditorSdk2MvCreationException("Error parsing BackgroundVideo: "+e0.toString(), e0);
                               }
                            }
                         }catch(org.json.JSONException e0){
                            throw new EditorSdk2MvCreationException("Error parsing BackgroundVideo: "+e0.toString(), e0);
                         }
                      }
                      AE2Project aE2ProjectWh = ClipMvUtilsForMvMaster.getAE2ProjectWhenIsMvMaster(str, str4);
                      if (aE2ProjectWh != null) {
                         boolean i11 = 0;
                         i7 = 0;
                         separator = "layers";
                         while (i11 < jSONArray1.length()) {
                            jSONArray5 = jSONArray1;
                            if (!jSONArray5.optJSONObject(i11).has(separator)) {
                               i7 = i7 + aE2ProjectWh.assets().get(i11).getVisibleTime().size();
                            }
                            i11 = i11 + 1;
                            jSONArray1 = jSONArray5;
                         }
                         jSONArray5 = jSONArray1;
                         if (i7 <= 0) {
                            return new EditorSdk2MvCreationResultImpl(9, -50002, "empty asset array");
                         }else if(kwaiMvParam.subBgVideo == null){
                            i7 = i7 + 1;
                         }
                         EditorSdk2V2$AnimatedSubAsset[] uAnimatedSub = new EditorSdk2V2$AnimatedSubAsset[i7];
                         videoEditorP.setAnimatedSubAssets(uAnimatedSub);
                         KwaiMvParam subBgVideo = kwaiMvParam.subBgVideo;
                         if (subBgVideo != null) {
                            i7 = 0;
                            videoEditorP.animatedSubAssetsSetItem(i7, EditorSdk2UtilsV2.openAnimatedSubAsset(subBgVideo.fullPath));
                            videoEditorP.animatedSubAssets(i7).setRenderType(1);
                            videoEditorP.animatedSubAssets(i7).setExternalAssetId("sub_background_video");
                            EditorSdk2$TimeRange timeRange = EditorSdk2Utils.createTimeRange(0, kwaiMvParam.subBgVideo.duration);
                            videoEditorP.animatedSubAssets(i7).setDisplayRange(timeRange);
                            if (kwaiMvParam.subBgVideo.restoreAlpha != null) {
                               i12 = 1;
                               videoEditorP.animatedSubAssets(i7).setAlphaInfo(i12);
                            }else {
                               i12 = 1;
                            }
                            Minecraft$PropertyKeyFrame propertyKeyF = new Minecraft$PropertyKeyFrame();
                            propertyKeyF.setDuration(timeRange.duration());
                            propertyKeyF.setAssetTransform(EditorSdk2Utils.createIdentityTransform());
                            Minecraft$PropertyKeyFrame[] propertyKeyF1 = new Minecraft$PropertyKeyFrame[i12];
                            propertyKeyF1[i7] = propertyKeyF;
                            videoEditorP.animatedSubAssets(i7).setKeyFrames(propertyKeyF1);
                            str2 = 1;
                         }else {
                            str2 = null;
                         }
                         i3 = 0;
                         while (true) {
                            if (i3 < jSONArray5.length()) {
                               try{
                                  jSONObject4 = jSONArray5.getJSONObject(i3);
                                  if (!jSONObject4.has(separator)) {
                                     AE2TimeRangeVec visibleTime = aE2ProjectWh.assets().get(i3).getVisibleTime();
                                     if (visibleTime.size()) {
                                        str5 = str10;
                                        String str25 = str+File.separator+jSONObject4.getString(str5);
                                        String[] stringArray = new String[]{"png","PNG","jpg","JPG","jpeg","JPEG"};
                                        uFile = new File(str25);
                                        if (uFile.exists() && uFile.isFile()) {
                                           uAE2Project = aE2ProjectWh;
                                           jSONArray1 = jSONArray5;
                                           str20 = separator;
                                           str4 = str25;
                                        }else {
                                           int i15 = str25.lastIndexOf(".");
                                           if (i15 > 0) {
                                              i15 = i15 + 1;
                                              str4 = str25.substring(i15);
                                              uAE2Project = aE2ProjectWh;
                                              jSONArray1 = jSONArray5;
                                              int i17 = 0;
                                              while (true) {
                                                 if (i17 < 6) {
                                                    if (str4.equals(stringArray[i17])) {
                                                       str4 = str25;
                                                       i17 = 0;
                                                       while (true) {
                                                          if (i17 < 6) {
                                                             str20 = separator;
                                                             String[] stringArray1 = stringArray;
                                                             str4 = str25.substring(0, i15)+stringArray[i17];
                                                             File uFile1 = new File(str4);
                                                             if (!uFile1.exists() || !uFile1.isFile()) {
                                                                i17 = i17 + 1;
                                                                separator = str20;
                                                                stringArray = stringArray1;
                                                             }
                                                          }else {
                                                             str20 = separator;
                                                          label_05c1 :
                                                             i17 = 0;
                                                          label_05c2 :
                                                             if (!str21) {
                                                                return new EditorSdk2MvCreationResultImpl(9, -50002, "File \""+str25+"\" not exist.");
                                                             }else {
                                                                JSONArray jSONArray6 = jSONObject4.optJSONArray("tm");
                                                                str25 = str9;
                                                                str3 = jSONObject4.optString("metadata", str25);
                                                                str24 = str19;
                                                                String str26 = jSONObject4.getString(str24);
                                                                if (!str3.equals(str25)) {
                                                                   try{
                                                                      try{
                                                                         jSONObject5 = new JSONObject(str3);
                                                                         i = jSONObject5.optInt("ky_groupId", Integer.MIN_VALUE);
                                                                         if (i != Integer.MIN_VALUE) {
                                                                            str26 = String.valueOf(i);
                                                                         }
                                                                         str6 = str26;
                                                                         str3 = str18;
                                                                      }catch(org.json.JSONException e0){
                                                                         str3 = str18;
                                                                         EditorSdkLogger.w(str3, "asset.json "+i3+" current index "+str2+" metadata parse error. path: "+str);
                                                                         i = str26;
                                                                      }catch(java.lang.Exception e0){
                                                                      label_0a63 :
                                                                         throw new EditorSdk2MvCreationException("Error parsing assets.json: "+e0.toString(), e0);
                                                                      }
                                                                   }catch(org.json.JSONException e0){
                                                                      jSONObject5 = null;
                                                                      goto label_061f ;
                                                                   }
                                                                }else {
                                                                   str3 = str18;
                                                                   str6 = str26;
                                                                   jSONObject5 = null;
                                                                }
                                                             }
                                                          }
                                                       }
                                                    }else {
                                                       i17 = i17 + 1;
                                                    }
                                                 }
                                              }
                                           }else {
                                              uAE2Project = aE2ProjectWh;
                                              jSONArray1 = jSONArray5;
                                           }
                                           str20 = separator;
                                           str4 = str25;
                                           goto label_05c1 ;
                                        }
                                        str21 = 1;
                                        goto label_05c2 ;
                                     }
                                  }
                                  kwaiMvParam1 = kwaiMvParam;
                                  textEffectCo1 = textEffectCo;
                                  uAE2Project = aE2ProjectWh;
                                  str1 = str2;
                                  jSONArray1 = jSONArray5;
                                  str20 = separator;
                                  int i13 = i3;
                                  uArrayList6 = uArrayList2;
                                  str6 = str9;
                                  str21 = str10;
                                  str2 = str16;
                                  String str22 = str17;
                                  String str23 = str18;
                                  str24 = str19;
                                  uFile = 0x3ff0000000000000;
                               label_0a44 :
                                  i3 = i13 + 1;
                                  uArrayList2 = uArrayList6;
                                  str10 = str21;
                                  str16 = str2;
                                  str9 = str6;
                                  str19 = str24;
                                  kwaiMvParam = kwaiMvParam1;
                                  jSONArray5 = jSONArray1;
                                  aE2ProjectWh = uAE2Project;
                                  separator = str20;
                                  str18 = str23;
                                  str17 = str22;
                                  str = p0;
                                  str2 = str1;
                                  textEffectCo = textEffectCo1;
                               }catch(java.lang.Exception e0){
                               }catch(java.lang.Exception e0){
                                  e0.setIsReplaceable(d7);
                               }catch(java.lang.Exception e0){
                                  d7 = 1;
                               }
                               ArrayList uArrayList9 = (jSONObject9.getInt(str2) == 1)? 1: null;
                               i3 = uArrayList9;
                               goto label_09c7 ;
                            }else {
                               kwaiMvParam1 = kwaiMvParam;
                               textEffectCo1 = textEffectCo;
                               uArrayList6 = uArrayList2;
                               if (jSONArray4 == null) {
                                  jSONArray4 = new JSONArray();
                               }
                               obj = jSONArray4;
                               KwaiMvParam kwaiMvParam2 = kwaiMvParam1;
                               kwaiMvParam2.mvPhotoInfos = new ArrayList(obj.length());
                               kwaiMvParam2.allDetails = new AllMvReplaceableAreaDetail();
                               kwaiMvParam2.allDetails.details = new ArrayList(obj.length());
                               i3 = 0;
                               while (i3 < obj.length()) {
                                  jSONObject2 = obj.getJSONObject(i3);
                                  MvPhotoInfo mvPhotoInfo = new MvPhotoInfo();
                                  kwaiMvParam2.mvPhotoInfos.add(mvPhotoInfo);
                                  mvPhotoInfo.time = jSONObject2.getInt("time");
                                  uArrayList10 = uArrayList5;
                                  uArrayList10.add(Integer.valueOf(kwaiMvParam2.mvPhotoInfos.get(i3).time));
                                  mvPhotoInfo.rules = new ArrayList();
                                  if (jSONObject2.has("rule")) {
                                     jSONObject4 = jSONObject2.getJSONObject("rule");
                                     if (jSONObject4 != null) {
                                        jSONObject4 = jSONObject4.getJSONObject("skip");
                                        if (jSONObject4 != null) {
                                           Iterator iterator = jSONObject4.keys();
                                           while (iterator.hasNext()) {
                                              MvReplaceAreaRule mvReplaceAre = new MvReplaceAreaRule();
                                              str15 = iterator.next();
                                              mvReplaceAre.key = str15;
                                              mvReplaceAre.val = jSONObject4.getInt(str15);
                                              mvPhotoInfo.rules.add(mvReplaceAre);
                                           }
                                        }
                                     }
                                  }
                                  mvPhotoInfo.areas = new ArrayList();
                                  MvReplaceableAreaDetail mvReplaceabl = new MvReplaceableAreaDetail();
                                  mvReplaceabl.info = mvPhotoInfo;
                                  kwaiMvParam2.allDetails.details.add(mvReplaceabl);
                                  JSONArray jSONArray12 = jSONObject2.optJSONArray("areas");
                                  if (jSONArray12 != null && jSONArray12.length() > 0) {
                                     mvReplaceabl.replaceableAreaDetail = new ArrayList(jSONArray12.length());
                                     i2 = 0;
                                     while (i2 < jSONArray12.length()) {
                                        JSONObject jSONObject7 = jSONArray12.optJSONObject(i2);
                                        if (jSONObject7 != null) {
                                           ReplaceableAreaInfo replaceableA = new ReplaceableAreaInfo();
                                           mvReplaceabl.replaceableAreaDetail.add(replaceableA);
                                           replaceableA.refId = jSONObject7.optString("assetRefId");
                                           JSONArray jSONArray13 = jSONObject7.optJSONArray("rect");
                                           EditorSdk2$RectF rectF = new EditorSdk2$RectF();
                                           replaceableA.rect = rectF;
                                           rectF.setLeft((float)jSONArray13.optDouble(0));
                                           jSONArray14 = jSONArray12;
                                           kwaiMvParam1 = kwaiMvParam2;
                                           replaceableA.rect.setTop((float)jSONArray13.optDouble(1));
                                           rect = replaceableA.rect;
                                           double d4 = (double)rect.left() + jSONArray13.optDouble(2);
                                           rect.setRight((float)d4);
                                           rect = replaceableA.rect;
                                           d4 = (double)rect.top() + jSONArray13.optDouble(3);
                                           rect.setBottom((float)d4);
                                           mvPhotoInfo.areas.add(replaceableA);
                                        }else {
                                           jSONArray14 = jSONArray12;
                                           kwaiMvParam1 = kwaiMvParam2;
                                           kwaiMvParam2 = 2;
                                        }
                                        i2 = i2 + 1;
                                        jSONArray12 = jSONArray14;
                                        kwaiMvParam2 = kwaiMvParam1;
                                     }
                                  }
                                  i3 = i3 + 1;
                                  uArrayList5 = uArrayList10;
                                  kwaiMvParam2 = kwaiMvParam2;
                               }
                               kwaiMvParam1 = kwaiMvParam2;
                               uArrayList10 = uArrayList5;
                               i3 = (!i9)? EditorSdk2UtilsV2.getComputedWidth(videoEditorP): i9;
                               if (!i8) {
                                  i8 = EditorSdk2UtilsV2.getComputedHeight(videoEditorP);
                               }
                               EditorSdk2MvCreationResultImpl uEditorSdk2M1 = new EditorSdk2MvCreationResultImpl();
                               uEditorSdk2M1.setProject(videoEditorP);
                               uEditorSdk2M1.setRenderPosList(uArrayList10);
                               uEditorSdk2M1.setVideoHeight(i8);
                               uEditorSdk2M1.setVideoWidth(i3);
                               uEditorSdk2M1.setMvAssets(uArrayList6);
                               uEditorSdk2M1.setTemplateType(EditorSdk2MvCreationResult$TemplateType.TEMPLATE_TYPE_MV);
                               uEditorSdk2M1.setMVParam(kwaiMvParam1);
                               uEditorSdk2M1.setLyricsConfig(textEffectCo1);
                               if (!ClipMvUtilsForMvMaster.isEmpty(str11)) {
                                  uEditorSdk2M1.setMusicResourcePath(str11);
                               }
                               if (uArrayList4.size() > 0) {
                                  uEditorSdk2M1.setMusicAssets(uArrayList4);
                               }
                               return uEditorSdk2M1;
                            }
                         }
                      }else {
                         throw new EditorSdk2MvCreationException("Error create ae2Project in mvmaster: ", new Exception(str17));
                      }
                   }
                }
             }
          }else {
             goto label_024e ;
          }
          textEffectCo = null;
          goto label_0254 ;
       }catch(java.lang.Exception e0){
       }
    }
    public static String findFilePathIfError(String p0,String p1){
       String str = null;
       File[] obj = PatchProxy.applyTwoRefs(p0, p1, str, ClipMvUtilsForMvMaster.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new File(p0).listFiles();
       int len = obj.length;
       int i = 0;
       while (i < len) {
          object oobject = obj[i];
          if (!oobject.isDirectory() && (oobject.getName()).contains(p1)) {
             str = p0+File.separator+oobject.getName();
             break ;
          }else {
             i = i + 1;
          }
       }
       return str;
    }
    public static AE2Project getAE2ProjectWhenIsMvMaster(String p0,String p1){
       AE2Parser$Resource obj = PatchProxy.applyTwoRefs(p0, p1, null, ClipMvUtilsForMvMaster.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new AE2Parser$Resource();
       obj.setAssetDir(p0);
       obj.setJsonFile(p1);
       obj.setKeyInt(0);
       AE2Project uAE2Project = AE2Parser.parseProjectFromResource(obj);
       if (uAE2Project.isValid()) {
          return uAE2Project;
       }
       EditorSdkLogger.e("ClipMvUtilsForMvMaster", "Fail to create AE2Project is invalid. Check your config file");
       return null;
    }
    public static String getAudioPathWithDir(String p0){
       String obj = PatchProxy.applyOneRefs(p0, null, ClipMvUtilsForMvMaster.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String separator = File.separator;
       obj = p0+separator+ClipMvUtilsForMvMaster.AUDIO_FILE_NAME_DEFAULT+ClipMvUtilsForMvMaster.AUDIO_EXTENSION;
       if (!new File(obj).exists()) {
          obj = p0+separator+ClipMvUtilsForMvMaster.AUDIO_FILE_NAME_TYPE_1+ClipMvUtilsForMvMaster.AUDIO_EXTENSION;
       }
       return obj;
    }
    public static double getMvDurationIfNeeded(JSONObject p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ClipMvUtilsForMvMaster.class, "10");
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
    public static String getVideoPathWithDir(String p0){
       String obj = PatchProxy.applyOneRefs(p0, null, ClipMvUtilsForMvMaster.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String separator = File.separator;
       obj = p0+separator+ClipMvUtilsForMvMaster.VIDEO_FILE_NAME_DEFAULT+ClipMvUtilsForMvMaster.VIDEO_EXTENSION;
       if (!new File(obj).exists()) {
          obj = p0+separator+ClipMvUtilsForMvMaster.VIDEO_FILE_NAME_Type1+ClipMvUtilsForMvMaster.VIDEO_EXTENSION;
       }
       return obj;
    }
    public static boolean isEmpty(CharSequence p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ClipMvUtilsForMvMaster.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 == null || !p0.length())? true: false;
       return b;
    }
    public static String musicConfigPath(String p0){
       File obj = PatchProxy.applyOneRefs(p0, null, ClipMvUtilsForMvMaster.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new File(p0+File.separator+ClipMvUtilsForMvMaster.MUSIC_Effect_DIR);
       if (obj.isDirectory()) {
          return obj.getAbsolutePath();
       }
       return null;
    }
    public static ClipkitSdk$ClipKitBackgroundVideo parseBackgroundVideo(JSONObject p0,String p1,double p2){
       ClipkitSdk$ClipKitBackgroundVideo obj;
       String str;
       if (PatchProxy.isSupport(ClipMvUtilsForMvMaster.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Double.valueOf(p2), null, ClipMvUtilsForMvMaster.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ClipkitSdk$ClipKitBackgroundVideo();
       if (p0 == null) {
          return obj;
       }else {
          obj.width = p0.optInt("width", 0);
          obj.height = p0.optInt("height", 0);
          if (p2 - null > 0) {
             obj.duration = p2;
          }else {
             str = "duration";
             if (p0.has(str)) {
                obj.duration = (double)p0.getInt(str) / 0x408f400000000000;
             }
          }
          str = p0.optString("backgroundVideo", "");
          if (ClipMvUtilsForMvMaster.isEmpty(str)) {
             str = "backgroundVideo.mp4";
             if (!new File(p1+File.separator+str).exists()) {
                str = "templateVideo.mp4";
             }
          }
          File uFile = new File(p1, str);
          if (uFile.exists() && uFile.isFile()) {
             obj.fileName = str;
             obj.fullPath = uFile.toString();
             obj.type = 0;
          }
          if (obj.fullPath != null) {
             obj.blendMode = p0.optInt("blendMode", 0);
             obj.renderOrder = p0.optInt("order", 0);
             obj.restoreAlpha = p0.optBoolean("restoreAlpha", true);
          }
          return obj;
       }
    }
    public static JSONObject parseObjectWithJsonString(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ClipMvUtilsForMvMaster.class, "8");
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
       String obj1 = PatchProxy.applyOneRefs(p0, obj, ClipMvUtilsForMvMaster.class, "5");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (!new File(p0).exists()) {
          return obj;
       }
       obj1 = ClipMvUtilsForMvMaster.readJsonFromFile(p0);
       if (TextUtils.isEmpty(obj1)) {
          return obj;
       }
       try{
          return new JSONObject(obj1);
       }catch(org.json.JSONException e0){
          throw new EditorSdk2MvCreationException("Error parsing "+p0, e0);
       }
    }
    public static String readJsonFromFile(String p0){
       FileInputStream obj = PatchProxy.applyOneRefs(p0, null, ClipMvUtilsForMvMaster.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new FileInputStream(p0);
       byte[] uobyteArray = new byte[obj.available()];
       obj.read(uobyteArray);
       obj.close();
       return new String(uobyteArray, "UTF-8");
    }
    public static EditorSdk2MvCreationResult resultWithoutConfigFile(String p0){
       EditorSdk2V2$VideoEditorProject obj = PatchProxy.applyOneRefs(p0, null, ClipMvUtilsForMvMaster.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String audioPathWit = ClipMvUtilsForMvMaster.getAudioPathWithDir(p0);
       obj = EditorSdk2UtilsV2.createProjectWithFile(ClipMvUtilsForMvMaster.getVideoPathWithDir(p0));
       int i = 0;
       int i1 = 1;
       obj.trackAssets(i).setAlphaInfo(i1);
       if (new File(audioPathWit).exists()) {
          obj.trackAssets(i).setAssetAudioPath(audioPathWit);
          obj.trackAssets(i).setVolume(0x3ff0000000000000);
       }
       EditorSdk2V2$AnimatedSubAsset[] uAnimatedSub = new EditorSdk2V2$AnimatedSubAsset[i1];
       uAnimatedSub[i] = EditorSdk2UtilsV2.openAnimatedSubAsset(p0+File.separator+"templateImage.png");
       obj.setAnimatedSubAssets(uAnimatedSub);
       obj.animatedSubAssets(i).setRenderType(i1);
       obj.animatedSubAssets(i).setExternalAssetId("templateImage");
       double computedDura = EditorSdk2UtilsV2.getComputedDuration(obj);
       obj.animatedSubAssets(i).setDisplayRange(EditorSdk2Utils.createTimeRange(0, computedDura));
       Minecraft$PropertyKeyFrame propertyKeyF = new Minecraft$PropertyKeyFrame();
       propertyKeyF.setDuration(computedDura);
       propertyKeyF.setAssetTransform(EditorSdk2Utils.createIdentityTransform());
       Minecraft$PropertyKeyFrame[] propertyKeyF1 = new Minecraft$PropertyKeyFrame[i1];
       propertyKeyF1[i] = propertyKeyF;
       obj.animatedSubAssets(i).setKeyFrames(propertyKeyF1);
       KwaiMvParam kwaiMvParam = new KwaiMvParam();
       kwaiMvParam.templateDirectory = p0;
       kwaiMvParam.configJsonPath = "";
       kwaiMvParam.blendMode = i;
       kwaiMvParam.encyptedMethod = i;
       kwaiMvParam.renderOrder = i;
       kwaiMvParam.minVersion = i;
       kwaiMvParam.bgVideo = new ClipkitSdk$ClipKitBackgroundVideo();
       kwaiMvParam.mvPhotoInfos = new ArrayList();
       kwaiMvParam.allDetails = new AllMvReplaceableAreaDetail();
       p0.details = new ArrayList();
       EditorSdk2MvCreationResultImpl uEditorSdk2M = new EditorSdk2MvCreationResultImpl();
       uEditorSdk2M.setProject(obj);
       uEditorSdk2M.setRenderPosList(new ArrayList());
       uEditorSdk2M.setVideoHeight(EditorSdk2UtilsV2.getComputedHeight(obj));
       uEditorSdk2M.setVideoWidth(EditorSdk2UtilsV2.getComputedWidth(obj));
       uEditorSdk2M.setMvAssets(new ArrayList());
       uEditorSdk2M.setTemplateType(EditorSdk2MvCreationResult$TemplateType.TEMPLATE_TYPE_MV);
       uEditorSdk2M.setMVParam(kwaiMvParam);
       return uEditorSdk2M;
    }
}
