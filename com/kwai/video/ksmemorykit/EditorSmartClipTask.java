package com.kwai.video.ksmemorykit.EditorSmartClipTask;
import com.kwai.video.ksmemorykit.EditorSmartClipTask$Builder;
import java.lang.Object;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import com.kwai.video.ksmemorykit.EditorSmartClipTask$1;
import java.util.List;
import java.lang.String;
import com.kwai.kve.AlbumType;
import com.kwai.video.ksmemorykit.EditorMemoryParams;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import java.io.File;
import java.util.Random;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import com.kwai.video.editorsdk2.EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$TimeRange;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import com.kwai.video.editorsdk2.EditorSdk2AE2Utils$CreateAE2EffectParamRet;
import com.kwai.video.editorsdk2.EditorSdk2AE2Utils;
import com.kwai.video.minecraft.model.nano.Minecraft$TransitionParam;
import java.lang.StringBuilder;
import java.lang.Integer;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import java.util.Iterator;
import java.util.ArrayList;
import java.lang.Math;
import com.kwai.video.ksmemorykit.EditorSmartClipThemeConfig;
import java.util.Map;
import java.lang.reflect.Array;
import com.kwai.video.ksmemorykit.EditorSmartClipThemeConfig$EditorSmartClipTransitionConfig;
import com.kwai.video.ksmemorykit.EditorSmartClipTask$3;
import com.kwai.video.ksmemorykit.EditorSmartClipThemeConfig$RandomType;
import java.lang.Enum;
import com.kwai.video.ksmemorykit.EditorSmartClipThemeConfig$EditorSmartClipPhotoEffectConfig;
import com.kwai.video.ksmemorykit.EditorSmartClipThemeConfig$EditorSmartClipThemeAssetConfig;
import com.kwai.video.editorsdk2.logger.EditorSdkLogger;
import com.kwai.video.ksmemorykit.EditorSmartClipThemeConfig$EditorSmartClipThemeTrackEffectConfig;
import com.kwai.video.ksmemorykit.EditorSmartClipThemeConfig$PresentType;
import com.kwai.video.ksmemorykit.EditorSmartClipThemeConfig$EditorSmartClipThemeProjectEffectConfig;
import java.lang.System;
import java.lang.Long;
import com.kwai.video.editorsdk2.EditorSdk2Utils$AssetLayoutInfo;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ProbedFile;
import java.lang.Exception;
import com.kwai.video.minecraft.model.nano.Minecraft$AssetTransform;
import com.kwai.video.minecraft.model.EditorSdk2V2$AudioAsset;
import com.kwai.video.minecraft.model.EditorSdk2V2$TimeRangeV2;
import wxd.a;
import org.json.JSONObject;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.math.BigInteger;
import java.lang.Number;
import com.kwai.kve.Rotation;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.kwai.video.minecraft.model.nano.Minecraft$AudioVolumeRange;
import com.kwai.video.minecraft.model.nano.Minecraft$Range;
import java.lang.Double;
import com.kwai.video.ksmemorykit.EditorMemoryProjectCreator;
import com.kwai.kve.SmartEditTask;
import com.kwai.video.ksmemorykit.EditorSmartClipListener;
import com.kwai.kve.SmartEditResult;
import com.kwai.video.editorsdk2.kve.EditorKveAsset;
import com.kwai.kve.VoiceDetectorParam;
import com.kwai.kve.VoiceDetectorResult;
import com.kwai.video.editorsdk2.kve.EditorKveVoiceDetectResult;
import com.kwai.kve.VoiceDetectorFeature;
import com.kwai.kve.ErrorInfo;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.io.ObjectInputStream;
import java.io.InputStream;
import com.kwai.video.editorsdk2.kve.EditorKveDecoder$Listener;
import com.kwai.video.editorsdk2.kve.EditorKveDecoder;
import java.lang.Thread;
import java.lang.Runnable;
import com.kwai.video.ksmemorykit.EditorSmartClipTask$EditorVoiceDetectStatus;
import com.kwai.video.ksmemorykit.EditorSmartClipTask$2;
import android.os.Environment;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class EditorSmartClipTask	// class@000900
{
    public AlbumType mAlbumType;
    public float mAnalysisDurationLimit;
    public EditorKveDecoder mDecoder;
    public float mImageClipTime;
    public EditorSmartClipListener mListener;
    public final Object mLock;
    public int mMaxAnalysisVideoNumber;
    public float mMaxTotalDuration;
    public List mMediaAssets;
    public EditorMemoryParams mMemoryParams;
    public float mMotionIntervalValue;
    public boolean mOnlyAnalysisMusic;
    public String mSceneName;
    public String mSelectedMusicId;
    public String mSelectedThemeId;
    public SmartEditTask mSmartTask;
    public String mTempPath;
    public String mThemesMetaJSON;
    public boolean mUseMotionInterval;
    public long mVideoAnalyzeCostTime;
    public float mVideoClipTime;
    public long mVoiceDetectCostTime;
    public CountDownLatch mVoiceDetectCount;
    public String mVoiceDetectModePath;
    public Map mVoiceDetectResults;
    public EditorSmartClipTask$EditorVoiceDetectStatus mVoiceDetectStatus;

    public void EditorSmartClipTask(EditorSmartClipTask$Builder p0){
       super();
       this.mLock = new Object();
       this.mUseMotionInterval = false;
       this.mAnalysisDurationLimit = p0.mAnalysisDurationLimit;
       this.mOnlyAnalysisMusic = p0.mOnlyAnalysisMusic;
       this.mMediaAssets = p0.mMediaAssets;
       this.mVoiceDetectModePath = p0.mVoiceDetectModePath;
       this.mAlbumType = p0.mAlbumType;
       this.mImageClipTime = p0.mImageClipTime;
       this.mVideoClipTime = p0.mVideoClipTime;
       this.mMaxAnalysisVideoNumber = p0.mMaxAnalysisVideoNumber;
       this.mMaxTotalDuration = p0.mMaxTotalDuration;
       this.mTempPath = p0.mTempPath;
       this.mSceneName = p0.mSceneName;
       this.mSelectedMusicId = p0.mSelectedMusicId;
       this.mSelectedThemeId = p0.mSelectedThemeId;
       this.mMemoryParams = p0.mMemoryParams;
       this.mThemesMetaJSON = p0.mThemesMetaJSON;
       this.mVoiceDetectResults = new HashMap();
       this.mVoiceDetectCount = new CountDownLatch(1);
       if (p0.mUseMotionInterval != null) {
          this.mUseMotionInterval = true;
          this.mMotionIntervalValue = p0.mMotionIntervalValue;
       }
       return;
    }
    public void EditorSmartClipTask(EditorSmartClipTask$Builder p0,EditorSmartClipTask$1 p1){
       super(p0);
    }
    public void EditorSmartClipTask(List p0,String p1,String p2,String p3,String p4,String p5,String p6,float p7,float p8,int p9,float p10,float p11,AlbumType p12,EditorMemoryParams p13){
       super();
       this.mLock = new Object();
       this.mUseMotionInterval = false;
       this.mMediaAssets = p0;
       this.mTempPath = p1;
       this.mThemesMetaJSON = p2;
       this.mSceneName = p3;
       this.mSelectedThemeId = p4;
       this.mSelectedMusicId = p5;
       this.mVoiceDetectModePath = p6;
       this.mImageClipTime = p7;
       this.mVideoClipTime = p8;
       this.mMaxAnalysisVideoNumber = p9;
       this.mMaxTotalDuration = p10;
       this.mAnalysisDurationLimit = p11;
       this.mVoiceDetectResults = new HashMap();
       this.mVoiceDetectCount = new CountDownLatch(1);
       this.mAlbumType = p12;
       this.mMemoryParams = p13;
    }
    public void EditorSmartClipTask(List p0,String p1,String p2,String p3,String p4,String p5,String p6,float p7,float p8,int p9,float p10,float p11,AlbumType p12,EditorMemoryParams p13,float p14){
       int i = this;
       super();
       i.mLock = new Object();
       i.mUseMotionInterval = false;
       i.mMediaAssets = p0;
       i.mTempPath = p1;
       i.mThemesMetaJSON = p2;
       i.mSceneName = p3;
       i.mSelectedThemeId = p4;
       i.mSelectedMusicId = p5;
       i.mVoiceDetectModePath = p6;
       i.mImageClipTime = p7;
       i.mVideoClipTime = p8;
       i.mMaxAnalysisVideoNumber = p9;
       i.mMaxTotalDuration = p10;
       i.mAnalysisDurationLimit = p11;
       i.mVoiceDetectResults = new HashMap();
       i.mVoiceDetectCount = new CountDownLatch(1);
       i.mAlbumType = p12;
       i.mMemoryParams = p13;
       i.mUseMotionInterval = true;
       i.mMotionIntervalValue = p14;
    }
    public void EditorSmartClipTask(List p0,String p1,String p2,String p3,String p4,String p5,String p6,float p7,int p8,float p9,float p10,AlbumType p11,EditorMemoryParams p12){
       super();
       this.mLock = new Object();
       this.mUseMotionInterval = false;
       this.mMediaAssets = p0;
       this.mTempPath = p1;
       this.mThemesMetaJSON = p2;
       this.mSceneName = p3;
       this.mSelectedThemeId = p4;
       this.mSelectedMusicId = p5;
       this.mVoiceDetectModePath = p6;
       this.mImageClipTime = p7;
       this.mMaxAnalysisVideoNumber = p8;
       this.mMaxTotalDuration = p9;
       this.mAnalysisDurationLimit = p10;
       this.mVoiceDetectResults = new HashMap();
       this.mVoiceDetectCount = new CountDownLatch(1);
       this.mAlbumType = p11;
       this.mMemoryParams = p12;
    }
    public static EditorSdk2V2$VideoEditorProject applyThemeEightOnProject(EditorSdk2V2$VideoEditorProject p0,File p1,String p2,Random p3){
       double d1;
       EditorSdk2V2$VideoEditorProject videoEditorP = p0;
       File uFile = p1;
       StringBuilder obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, EditorSmartClipTask.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = -1;
       int[] ointArray = new int[4]{'"','%','&',23};
       int i1 = 0;
       double d = 0;
       while (i1 < p0.trackAssetsSize()) {
          EditorSdk2V2$TrackAsset trackAsset = videoEditorP.trackAssets(i1);
          double trackAssetDi = EditorSdk2UtilsV2.getTrackAssetDisplayDuration(trackAsset);
          if (EditorSdk2UtilsV2.isSingleImagePath(trackAsset.assetPath())) {
             EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings uEditorSdk2A = new EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings();
             uEditorSdk2A.ae2AssetDir = new File(p1.getAbsolutePath(), "photo_zoomin").getAbsolutePath();
             uEditorSdk2A.displayRange = EditorSdk2Utils.createTimeRange(d, trackAssetDi);
             uEditorSdk2A.fillingMode = 0;
             EditorSdk2AE2Utils.applyAE2EffectOnTrackAssetBySettingsV2(trackAsset, uEditorSdk2A);
          }
          d1 = 0x3fdf5c28f5c28f5c;
          if (trackAssetDi - 0x4008000000000000 >= 0) {
             trackAssetDi = trackAssetDi - d1;
             trackAssetDi = trackAssetDi - 0x3fe0000000000000;
             trackAssetDi = trackAssetDi - d1;
             double d2 = p3.nextDouble() * trackAssetDi;
             d2 = d2 + d1;
             EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings uEditorSdk2A1 = new EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings();
             uEditorSdk2A1.ae2AssetDir = new File(uFile, "tile").getAbsolutePath();
             uEditorSdk2A1.fillingMode = 0;
             uEditorSdk2A1.displayRange = EditorSdk2Utils.createTimeRange(d2, 0x3fe0000000000000);
             EditorSdk2AE2Utils.applyExtraAE2EffectOnTrackAssetBySettingsV2(trackAsset, uEditorSdk2A1);
          }
          int i2 = p0.trackAssetsSize() - 1;
          if (i1 != i2) {
             trackAsset.setTransitionParam(new Minecraft$TransitionParam());
             trackAsset.transitionParam().setType(ointArray[EditorSmartClipTask.getRandomIndex(4, i, p3)]);
             trackAsset.transitionParam().setDuration(d1);
          }else {
             trackAssetDi = -0.00f;
          }
          i1 = i1 + 1;
          String str = 4;
       }
       double d3 = d;
       while (d3 - EditorSdk2UtilsV2.getDisplayDuration(p0) < 0) {
          d1 = p3.nextDouble() * 2.00f;
          d1 = d1 + 3.00f;
          d1 = d1 + d3;
          EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings uEditorSdk2A2 = new EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings();
          obj = new File(uFile, "negative").getAbsolutePath();
          try{
             uEditorSdk2A2.ae2AssetDir = obj;
             d3 = EditorSdk2AE2Utils.getBgVideoDurationBySettings(uEditorSdk2A2);
          }catch(org.json.JSONException e0){
             obj = "error in apply theme, getBgVideoDurationBySettings error "+e0;
             d3 = d;
          }
          uEditorSdk2A2.displayRange = EditorSdk2Utils.createTimeRange(d1, d3);
          uEditorSdk2A2.fillingMode = 0;
          EditorSdk2AE2Utils.applyExtraAE2EffectOnProjectBySettingsV2(videoEditorP, uEditorSdk2A2, 0);
          d3 = d3 + d1;
       }
       EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings uEditorSdk2A3 = new EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings();
       uEditorSdk2A3.ae2AssetDir = new File(p1.getAbsolutePath(), "framenew").getAbsolutePath();
       uEditorSdk2A3.displayRange = EditorSdk2Utils.createTimeRange(d, EditorSdk2UtilsV2.getDisplayDuration(p0));
       uEditorSdk2A3.fillingMode = 0;
       EditorSdk2AE2Utils.applyAE2EffectOnProjectBySettingsV2(videoEditorP, uEditorSdk2A3);
       return videoEditorP;
    }
    public static EditorSdk2V2$VideoEditorProject applyThemeFiveOnProject(EditorSdk2V2$VideoEditorProject p0,File p1,String p2,Random p3){
       double d;
       EditorSdk2V2$VideoEditorProject videoEditorP = p0;
       Object[] obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, EditorSmartClipTask.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 3;
       int[] ointArray = new int[i]{5,6,13};
       int i1 = -1;
       int i2 = 0;
       int i3 = 0;
       while (i3 < p0.trackAssetsSize()) {
          EditorSdk2V2$TrackAsset trackAsset = videoEditorP.trackAssets(i3);
          int i4 = p0.trackAssetsSize() - 1;
          if (i3 != i4) {
             d = p3.nextDouble() * 100.00f;
             d = d % (double)i;
             i4 = (int)d;
             trackAsset.setTransitionParam(new Minecraft$TransitionParam());
             trackAsset.transitionParam().setType(ointArray[i4]);
             trackAsset.transitionParam().setDuration(0x3fdf5c28f5c28f5c);
          }
          d = EditorSdk2UtilsV2.getTrackAssetDisplayDuration(trackAsset);
          double d1 = 0;
          if (EditorSdk2UtilsV2.isSingleImagePath(trackAsset.assetPath())) {
             EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings uEditorSdk2A = new EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings();
             uEditorSdk2A.ae2AssetDir = new File(p1.getAbsolutePath(), "photo_zoomin").getAbsolutePath();
             uEditorSdk2A.displayRange = EditorSdk2Utils.createTimeRange(d1, d);
             uEditorSdk2A.fillingMode = 1;
             EditorSdk2AE2Utils.applyAE2EffectOnTrackAssetBySettingsV2(trackAsset, uEditorSdk2A);
          }
          EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings uEditorSdk2A1 = new EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings();
          obj = new Object[1];
          int i5 = EditorSmartClipTask.getRandomIndex(i, i1, p3) + 1;
          obj[i2] = Integer.valueOf(i5);
          uEditorSdk2A1.ae2AssetDir = new File(p1.getAbsolutePath(), String.format("frame%d", obj)).getAbsolutePath();
          uEditorSdk2A1.displayRange = EditorSdk2Utils.createTimeRange(d1, d);
          uEditorSdk2A1.fillingMode = 1;
          EditorSdk2AE2Utils.applyExtraAE2EffectOnTrackAssetBySettingsV2(trackAsset, uEditorSdk2A1);
          i3 = i3 + 1;
          i = 3;
          i2 = 0;
       }
       return videoEditorP;
    }
    public static EditorSdk2V2$VideoEditorProject applyThemeFourOnProject(EditorSdk2V2$VideoEditorProject p0,File p1,String p2,Random p3){
       double bgVideoDurat;
       EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, EditorSmartClipTask.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Iterator iterator = p0.trackAssets().iterator();
       int i = -1;
       int i1 = -1;
       while (iterator.hasNext()) {
          EditorSdk2V2$TrackAsset trackAsset = iterator.next();
          double trackAssetDi = EditorSdk2UtilsV2.getTrackAssetDisplayDuration(trackAsset);
          double d = 0;
          int i2 = 1;
          if (EditorSdk2UtilsV2.isSingleImagePath(trackAsset.assetPath())) {
             EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings uEditorSdk2A = new EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings();
             uEditorSdk2A.ae2AssetDir = new File(p1.getAbsolutePath(), "photo_zoomin").getAbsolutePath();
             uEditorSdk2A.displayRange = EditorSdk2Utils.createTimeRange(d, trackAssetDi);
             uEditorSdk2A.fillingMode = i2;
             EditorSdk2AE2Utils.applyAE2EffectOnTrackAssetBySettingsV2(trackAsset, uEditorSdk2A);
          }
          int randomIndex = EditorSmartClipTask.getRandomIndex(3, i, p3);
          obj = new EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings();
          Object[] objArray = new Object[i2];
          int i3 = randomIndex + 1;
          objArray[0] = Integer.valueOf(i3);
          obj.ae2AssetDir = new File(p1.getAbsolutePath(), String.format("frame%d", objArray)).getAbsolutePath();
          obj.displayRange = EditorSdk2Utils.createTimeRange(d, trackAssetDi);
          obj.fillingMode = 0;
          EditorSdk2AE2Utils.applyExtraAE2EffectOnTrackAssetBySettingsV2(trackAsset, obj);
          i = 4;
          double[] uodoubleArra = new double[i]{0x3ff8000000000000,0x4008000000000000,0x4004000000000000,0x3ff8000000000000};
          ArrayList uArrayList = new ArrayList();
          int i4 = 0;
          while (i4 < i) {
             if (i1 != i4 && trackAssetDi - uodoubleArra[i4] > 0) {
                uArrayList.add(Integer.valueOf(i4));
             }
             i4 = i4 + 1;
          }
          if (uArrayList.size()) {
             double d1 = p3.nextDouble() * (double)uArrayList.size();
             i1 = uArrayList.get((int)d1).intValue();
             EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings uEditorSdk2A1 = new EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings();
             Object[] objArray1 = new Object[i2];
             int i5 = i1 + 1;
             objArray1[0] = Integer.valueOf(i5);
             uEditorSdk2A1.ae2AssetDir = new File(p1.getAbsolutePath(), String.format("t%d", objArray1)).getAbsolutePath();
             EditorSdk2$TimeRange timeRange = new EditorSdk2$TimeRange();
             timeRange.setStart(0);
             try{
                timeRange.setDuration(trackAssetDi);
                bgVideoDurat = EditorSdk2AE2Utils.getBgVideoDurationBySettings(uEditorSdk2A1);
                trackAssetDi = 0;
             }catch(org.json.JSONException e0){
                StringBuilder str = "error in apply theme, getBgVideoDurationBySettings error "+e0;
                trackAssetDi = 0;
                bgVideoDurat = null;
             }
             trackAssetDi = (!bgVideoDurat - trackAssetDi)? timeRange.duration(): Math.min(bgVideoDurat, timeRange.duration());
             uEditorSdk2A1.displayRange = EditorSdk2Utils.createTimeRange(timeRange.start(), trackAssetDi);
             uEditorSdk2A1.fillingMode = 0;
             EditorSdk2AE2Utils.applyExtraAE2EffectOnTrackAssetBySettingsV2(trackAsset, uEditorSdk2A1);
          }
          i = randomIndex;
       }
       return p0;
    }
    public static EditorSdk2V2$VideoEditorProject applyThemeNineOnProject(EditorSdk2V2$VideoEditorProject p0,File p1,String p2,Random p3){
       double trackAssetDi;
       double d1;
       EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings uEditorSdk2A2;
       StringBuilder absolutePath;
       int i5;
       double bgVideoDurat;
       EditorSdk2V2$VideoEditorProject videoEditorP = p0;
       File uFile = p1;
       Random random = p3;
       EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, EditorSmartClipTask.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       int i1 = 0;
       int i2 = 3;
       double d = 0;
       while (i1 < p0.trackAssetsSize()) {
          EditorSdk2V2$TrackAsset trackAsset = videoEditorP.trackAssets(i1);
          trackAssetDi = EditorSdk2UtilsV2.getTrackAssetDisplayDuration(trackAsset);
          if (EditorSdk2UtilsV2.isSingleImagePath(trackAsset.assetPath())) {
             EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings uEditorSdk2A = new EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings();
             uEditorSdk2A.ae2AssetDir = new File(p1.getAbsolutePath(), "photo_zoomin").getAbsolutePath();
             uEditorSdk2A.displayRange = EditorSdk2Utils.createTimeRange(d, trackAssetDi);
             uEditorSdk2A.fillingMode = i;
             EditorSdk2AE2Utils.applyAE2EffectOnTrackAssetBySettingsV2(trackAsset, uEditorSdk2A);
          }
          d1 = 3.00f;
          EditorSdk2V2$TrackAsset trackAsset1 = trackAsset;
          double d2 = 0x3fdf5c28f5c28f5c;
          trackAssetDi = trackAssetDi - d2;
          trackAssetDi = trackAssetDi - d1;
          trackAssetDi = trackAssetDi - d2;
          double d3 = p3.nextDouble() * Math.max(trackAssetDi, d);
          d = d3 + d2;
          EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings uEditorSdk2A1 = new EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings();
          uEditorSdk2A1.ae2AssetDir = new File(uFile, "Double exposure").getAbsolutePath();
          uEditorSdk2A1.fillingMode = 1;
          uEditorSdk2A1.displayRange = EditorSdk2Utils.createTimeRange(d, d1);
          EditorSdk2AE2Utils.applyExtraAE2EffectOnTrackAssetBySettingsV2(trackAsset1, uEditorSdk2A1);
          int i3 = p0.trackAssetsSize() - 1;
          if (i1 != i3) {
             trackAsset1.setTransitionParam(new Minecraft$TransitionParam());
             trackAsset1.transitionParam().setType(i2);
             trackAsset1.transitionParam().setDuration(d2);
          }
          i1 = i1 + 1;
          i = 0;
       }
       obj = new EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings();
       obj.ae2AssetDir = new File(uFile, "star").getAbsolutePath();
       obj.displayRange = EditorSdk2Utils.createTimeRange(d, EditorSdk2UtilsV2.getDisplayDuration(p0));
       i = 0;
       obj.fillingMode = i;
       EditorSdk2AE2Utils.applyExtraAE2EffectOnProjectBySettingsV2(videoEditorP, obj, i);
       double d4 = d;
       d1 = 6.00f;
       int i4 = -1;
       while (d4 - EditorSdk2UtilsV2.getDisplayDuration(p0) < 0) {
          trackAssetDi = p3.nextDouble() * 0x3ff0000000000000;
          trackAssetDi = trackAssetDi + d1;
          trackAssetDi = trackAssetDi + d4;
          uEditorSdk2A2 = new EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings();
          Object[] objArray = new Object[]{Integer.valueOf(i1)};
          i1 = EditorSmartClipTask.getRandomIndex(i2, i4, random) + 1;
          absolutePath = new File(uFile, String.format("flare%d", objArray)).getAbsolutePath();
          try{
             uEditorSdk2A2.ae2AssetDir = absolutePath;
             d1 = EditorSdk2AE2Utils.getBgVideoDurationBySettings(uEditorSdk2A2);
          }catch(org.json.JSONException e0){
             absolutePath = "error in apply theme, getBgVideoDurationBySettings error "+e0;
             d1 = d;
          }
          uEditorSdk2A2.displayRange = EditorSdk2Utils.createTimeRange(trackAssetDi, d1);
          uEditorSdk2A2.fillingMode = 0;
          EditorSdk2AE2Utils.applyExtraAE2EffectOnProjectBySettingsV2(videoEditorP, uEditorSdk2A2, 1);
          d4 = trackAssetDi + d1;
       }
       d4 = d;
       while (d4 - EditorSdk2UtilsV2.getDisplayDuration(p0) < 0) {
          trackAssetDi = p3.nextDouble() * 0x3ff0000000000000;
          trackAssetDi = trackAssetDi + d1;
          trackAssetDi = trackAssetDi + d4;
          uEditorSdk2A2 = new EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings();
          Object[] objArray1 = new Object[]{Integer.valueOf(i5)};
          i5 = EditorSmartClipTask.getRandomIndex(i2, i4, random) + 1;
          absolutePath = new File(uFile, String.format("text%d", objArray1)).getAbsolutePath();
          try{
             uEditorSdk2A2.ae2AssetDir = absolutePath;
             bgVideoDurat = EditorSdk2AE2Utils.getBgVideoDurationBySettings(uEditorSdk2A2);
          }catch(org.json.JSONException e0){
             absolutePath = "error in apply theme, getBgVideoDurationBySettings error "+e0;
             bgVideoDurat = 0;
          }
          uEditorSdk2A2.displayRange = EditorSdk2Utils.createTimeRange(trackAssetDi, bgVideoDurat);
          uEditorSdk2A2.fillingMode = 0;
          EditorSdk2AE2Utils.applyExtraAE2EffectOnProjectBySettingsV2(videoEditorP, uEditorSdk2A2, 2);
          d4 = trackAssetDi + bgVideoDurat;
          i2 = 3;
          String str = null;
       }
       return videoEditorP;
    }
    public static EditorSdk2V2$VideoEditorProject applyThemeOnProject(EditorSdk2V2$VideoEditorProject p0,EditorSmartClipThemeConfig p1,String p2,String p3,Random p4,List p5,Map p6){
       int[][] obj1;
       int i7;
       double duration;
       int[][] ointArray4;
       Iterator iterator1;
       int[] ointArray5;
       int i9;
       EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings uEditorSdk2A;
       File uFile;
       int i10;
       Iterator iterator5;
       int[][] ointArray6;
       Object obj2;
       double d;
       int i11;
       double d2;
       double d4;
       double d5;
       int i12;
       EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings uEditorSdk2A2;
       File uFile1;
       double startTime1;
       object oobject = p0;
       object oobject1 = p2;
       object oobject2 = p4;
       object oobject3 = p6;
       int i = int.class;
       EditorSmartClipTask uEditorSmart = EditorSmartClipTask.class;
       EditorSmartClipThemeConfig$RandomType obj = null;
       int i1 = 3;
       int i2 = 2;
       int i3 = 0;
       int i4 = 1;
       if (PatchProxy.isSupport(uEditorSmart)) {
          Object[] objArray = new Object[]{oobject,p1,oobject1,p3,oobject2,p5,oobject3};
          obj1 = PatchProxy.apply(objArray, obj, uEditorSmart, "31");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       int[] ointArray = new int[i2];
       ointArray[i4] = p1.getPhotoEffectList().size();
       ointArray[i3] = p0.trackAssetsSize();
       obj1 = Array.newInstance(i, ointArray);
       int[] ointArray1 = new int[i2];
       ointArray1[i4] = p1.getTrackEffectList().size();
       ointArray1[i3] = p0.trackAssetsSize();
       int[][] ointArray2 = Array.newInstance(i, ointArray1);
       int[] ointArray3 = new int[p0.trackAssetsSize()];
       Iterator iterator = p0.trackAssets().iterator();
       int i5 = 0;
       while (iterator.hasNext()) {
          EditorSdk2V2$TrackAsset trackAsset = iterator.next();
          double trackAssetDi = EditorSdk2UtilsV2.getTrackAssetDisplayDuration(trackAsset);
          EditorSmartClipThemeConfig$EditorSmartClipTransitionConfig transitionCo = p1.getTransitionConfig();
          if (i5 > 0) {
             int i6 = i5 - 1;
             i3 = ointArray3[i6];
          }else {
             i3 = -1;
          }
          i7 = EditorSmartClipTask$3.$SwitchMap$com$kwai$video$ksmemorykit$EditorSmartClipThemeConfig$RandomType[p1.getTransitionConfig().getRandomType().ordinal()];
          if (i7 != i4) {
             if (i7 != 2) {
                if (i7 != 3) {
                   i3 = -1;
                }else {
                   i3 = i3 + 1;
                   i3 = i3 % transitionCo.getTransitionList().size();
                }
             }else {
                i3 = EditorSmartClipTask.getRandomIndex(transitionCo.getTransitionList().size(), i3, oobject2);
             }
          }else {
             i3 = EditorSmartClipTask.getRandomIndex(transitionCo.getTransitionList().size(), -1, oobject2);
          }
          i7 = p0.trackAssetsSize() - 1;
          if (trackAsset != oobject.trackAssets(i7)) {
             trackAsset.setTransitionParam(new Minecraft$TransitionParam());
             trackAsset.transitionParam().setType(transitionCo.getTransitionList().get(i3).intValue());
             Minecraft$TransitionParam transitionPa = trackAsset.transitionParam();
             duration = (transitionCo.getDuration() > 0)? transitionCo.getDuration(): 0x3fdf5c28f5c28f5c;
             ointArray4 = ointArray2;
             transitionPa.setDuration(duration);
             ointArray3[i5] = i3;
          }else {
             ointArray4 = ointArray2;
          }
          if (EditorSdk2UtilsV2.isSingleImagePath(trackAsset.assetPath())) {
             iterator1 = p1.getPhotoEffectList().iterator();
             i = 0;
             while (iterator1.hasNext()) {
                EditorSmartClipThemeConfig$EditorSmartClipPhotoEffectConfig uEditorSmart1 = iterator1.next();
                if (i5 > 0) {
                   i4 = i5 - 1;
                   i4 = obj1[i4][i];
                }else {
                   uEditorSdk2A = -1;
                }
                Iterator iterator2 = iterator1;
                int i8 = EditorSmartClipTask$3.$SwitchMap$com$kwai$video$ksmemorykit$EditorSmartClipThemeConfig$RandomType[uEditorSmart1.getRandomType().ordinal()];
                ointArray5 = ointArray3;
                if (i8 != 1) {
                   if (i8 != 2) {
                      if (i8 != 3) {
                         i9 = -1;
                      }else {
                         i4 = i4 + 1;
                         i9 = i4 % uEditorSmart1.getAssetsList().size();
                      }
                   }else {
                      i9 = EditorSmartClipTask.getRandomIndex(uEditorSmart1.getAssetsList().size(), i4, oobject2);
                   }
                }else {
                   i9 = EditorSmartClipTask.getRandomIndex(uEditorSmart1.getAssetsList().size(), -1, oobject2);
                }
                uEditorSdk2A = new EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings();
                uEditorSdk2A.ae2AssetDir = new File(oobject1, uEditorSmart1.getAssetsList().get(i9).getPath()).getAbsolutePath();
                uEditorSdk2A.displayRange = EditorSdk2Utils.createTimeRange(uEditorSmart1.getAssetsList().get(i9).getStartTime(), trackAssetDi);
                uEditorSdk2A.fillingMode = 0;
                EditorSdk2AE2Utils.applyAE2EffectOnTrackAssetBySettingsV2(trackAsset, uEditorSdk2A);
                obj1[i5][i] = i9;
                i = i + 1;
                ointArray3 = ointArray5;
                iterator = iterator;
                iterator1 = iterator2;
             }
          }
          ointArray5 = ointArray3;
          Iterator iterator3 = iterator;
          String str = "EditorSmartClipTask";
          if (p5 != null && p5.size() > 0) {
             Iterator iterator4 = p5.iterator();
             while (true) {
                if (iterator4.hasNext()) {
                   String str1 = iterator4.next();
                   if ((trackAsset.assetPath()).equals(str1)) {
                      EditorSdkLogger.e(str, "applyAE2OnTrack shouldAvoidSubtitle:  "+str1);
                      uFile = 1;
                   label_0218 :
                      iterator1 = p1.getTrackEffectList().iterator();
                      i = 0;
                      while (iterator1.hasNext()) {
                         EditorSmartClipThemeConfig$EditorSmartClipThemeTrackEffectConfig uEditorSmart2 = iterator1.next();
                         if (!uEditorSmart2.isFirstTrackOnly() || (i5 > 0 || (uFile && uEditorSmart2.isAvoidSubtitle()))) {
                            i10 = uFile;
                            iterator5 = iterator1;
                            ointArray6 = obj1;
                            obj2 = obj;
                            d = trackAssetDi;
                            i11 = p2;
                         }else if(i5 > 0){
                            i3 = i5 - 1;
                            i3 = ointArray4[i3][i];
                         }else {
                            i3 = -1;
                         }
                         i4 = EditorSmartClipTask$3.$SwitchMap$com$kwai$video$ksmemorykit$EditorSmartClipThemeConfig$RandomType[uEditorSmart2.getRandomType().ordinal()];
                         if (i4 != 1) {
                            if (i4 != 2) {
                               if (i4 != 3) {
                                  i3 = -1;
                               }else {
                                  i3 = i3 + 1;
                                  i3 = i3 % uEditorSmart2.getAssetsList().size();
                               }
                            }else {
                               i3 = EditorSmartClipTask.getRandomIndex(uEditorSmart2.getAssetsList().size(), i3, oobject2);
                            }
                         }else {
                            i3 = EditorSmartClipTask.getRandomIndex(uEditorSmart2.getAssetsList().size(), -1, oobject2);
                         }
                         EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings uEditorSdk2A1 = new EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings();
                         EditorSmartClipThemeConfig$EditorSmartClipThemeAssetConfig uEditorSmart3 = uEditorSmart2.getAssetsList().get(i3);
                         i10 = uFile;
                         iterator5 = iterator1;
                         ointArray6 = obj1;
                         uEditorSdk2A1.ae2AssetDir = new File(p2, uEditorSmart3.getPath()).getAbsolutePath();
                         double d1 = trackAssetDi - uEditorSmart3.getDuration();
                         if (uEditorSmart2.isAvoidTransition()) {
                            d2 = (obj != null)? obj.transitionParam().duration(): 0;
                            double d3 = d2 + 0;
                            if (trackAsset.transitionParam() != null) {
                               d1 = d1 - trackAsset.transitionParam().duration();
                               d = trackAsset.transitionParam().duration() + d3;
                               d = trackAssetDi - d;
                               obj2 = obj;
                               d4 = d;
                               d = trackAssetDi;
                            }else {
                               obj2 = obj;
                               d4 = trackAssetDi;
                               d = d4;
                            }
                            d5 = d3;
                         }else {
                            obj2 = obj;
                            d4 = trackAssetDi;
                            d = d4;
                            d5 = 0;
                         }
                         if (uEditorSmart3.getMinTrackTime() - d4 <= 0) {
                            i2 = EditorSmartClipTask$3.$SwitchMap$com$kwai$video$ksmemorykit$EditorSmartClipThemeConfig$PresentType[uEditorSmart2.getPresentType().ordinal()];
                            Object obj3 = obj2;
                            if (i2 != 1) {
                               if (i2 != 2) {
                                  if (i2 == -0.00f) {
                                     uEditorSdk2A1.displayRange = EditorSdk2Utils.createTimeRange(uEditorSmart2.getStartTime(), uEditorSmart3.getDuration());
                                  }
                               }else {
                                  d1 = d1 - d5;
                                  d4 = p4.nextDouble() * d1;
                                  d4 = d4 + d5;
                                  uEditorSdk2A1.displayRange = EditorSdk2Utils.createTimeRange(d4, uEditorSmart3.getDuration());
                               }
                            }else {
                               uEditorSdk2A1.displayRange = EditorSdk2Utils.createTimeRange(d5, d4);
                            }
                            i12 = 0;
                            uEditorSdk2A1.fillingMode = i12;
                            EditorSdk2AE2Utils.applyExtraAE2EffectOnTrackAssetBySettingsV2(trackAsset, uEditorSdk2A1);
                            ointArray4[i5][i] = i3;
                            i = i + 1;
                            oobject2 = p4;
                            i12 = i10;
                            iterator1 = iterator5;
                            obj1 = ointArray6;
                            trackAssetDi = d;
                            obj = obj3;
                            continue ;
                         }
                         oobject2 = p4;
                         obj = obj2;
                         uFile = i10;
                         iterator1 = iterator5;
                         obj1 = ointArray6;
                         trackAssetDi = d;
                      }
                      Map map = p6;
                      ointArray6 = obj1;
                      i11 = p2;
                      if (map && map.containsKey(trackAsset.assetPath())) {
                         EditorSdkLogger.e(str, "applyExtraAE2OnTrack :  "+trackAsset.assetPath());
                         EditorSdk2AE2Utils.applyExtraAE2EffectOnTrackAssetBySettingsV2(trackAsset, map.get(trackAsset.assetPath()));
                      }
                      i5 = i5 + 1;
                      i4 = 1;
                      oobject = p0;
                      oobject2 = p4;
                      oobject1 = i11;
                      obj = trackAsset;
                      ointArray2 = ointArray4;
                      ointArray3 = ointArray5;
                      iterator = iterator3;
                      obj1 = ointArray6;
                   }
                }
             }
          }
          uFile = null;
          goto label_0218 ;
       }
       object oobject4 = oobject1;
       Iterator iterator6 = p1.getProjectEffectList().iterator();
       i12 = 0;
       i7 = -1;
       while (iterator6.hasNext()) {
          EditorSmartClipThemeConfig$EditorSmartClipThemeProjectEffectConfig uEditorSmart4 = iterator6.next();
          i = EditorSmartClipTask$3.$SwitchMap$com$kwai$video$ksmemorykit$EditorSmartClipThemeConfig$PresentType[uEditorSmart4.getPresentType().ordinal()];
          if (i != 1) {
             if (i != -0.00f) {
                if (i != 3) {
                   i9 = p0;
                }else {
                   double startTime = uEditorSmart4.getStartTime();
                   i = EditorSmartClipTask.getRandomIndex(uEditorSmart4.getAssetsList().size(), -1, p4);
                   uEditorSdk2A2 = new EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings();
                   uEditorSdk2A2.ae2AssetDir = new File(oobject4, uEditorSmart4.getAssetsList().get(i).getPath()).getAbsolutePath();
                   if (uEditorSmart4.getEndTime() - 0xbff0000000000000 > 0) {
                      startTime = EditorSdk2UtilsV2.getDisplayDuration(p0) - uEditorSmart4.getAssetsList().get(i).getDuration();
                      startTime = Math.max(0, startTime);
                   }else {
                      uFile1 = null;
                   }
                   uEditorSdk2A2.displayRange = EditorSdk2Utils.createTimeRange(startTime, uEditorSmart4.getAssetsList().get(i).getDuration());
                   uEditorSdk2A2.fillingMode = 0;
                   EditorSdk2AE2Utils.applyExtraAE2EffectOnProjectBySettingsV2(p0, uEditorSdk2A2, i12);
                   i12 = i12 + 1;
                   i7 = i;
                   obj = 1;
                }
             }else {
                EditorSdk2V2$VideoEditorProject videoEditorP = p0;
                Random random = p4;
                startTime1 = uEditorSmart4.getStartTime();
                while (startTime1 - EditorSdk2UtilsV2.getDisplayDuration(p0) < 0) {
                   duration = uEditorSmart4.getMaxTimeGap() - uEditorSmart4.getMinTimeGap();
                   d2 = p4.nextDouble() * duration;
                   d2 = d2 + uEditorSmart4.getMinTimeGap();
                   startTime1 = d2 + startTime1;
                   i = EditorSmartClipTask$3.$SwitchMap$com$kwai$video$ksmemorykit$EditorSmartClipThemeConfig$RandomType[uEditorSmart4.getRandomType().ordinal()];
                   if (i != 1) {
                      if (i != -0.00f) {
                         if (i != 3) {
                            i7 = -1;
                         }else {
                            i7 = i7 + 1;
                            i = i7 % uEditorSmart4.getAssetsList().size();
                         }
                      }else {
                         i = EditorSmartClipTask.getRandomIndex(uEditorSmart4.getAssetsList().size(), i7, random);
                      }
                      i7 = i;
                   }else {
                      i7 = EditorSmartClipTask.getRandomIndex(uEditorSmart4.getAssetsList().size(), -1, random);
                   }
                   EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings uEditorSdk2A3 = new EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings();
                   uEditorSdk2A3.ae2AssetDir = new File(oobject4, uEditorSmart4.getAssetsList().get(i7).getPath()).getAbsolutePath();
                   uEditorSdk2A3.displayRange = EditorSdk2Utils.createTimeRange(startTime1, uEditorSmart4.getAssetsList().get(i7).getDuration());
                   uEditorSdk2A3.fillingMode = 0;
                   EditorSdk2AE2Utils.applyExtraAE2EffectOnProjectBySettingsV2(videoEditorP, uEditorSdk2A3, i12);
                   startTime1 = startTime1 + uEditorSdk2A3.displayRange.duration();
                   uFile1 = null;
                }
                i12 = i12 + 1;
                int[] ointArray7 = -1;
             }
          }else {
             uEditorSdk2A2 = new EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings();
             uEditorSdk2A2.ae2AssetDir = new File(oobject4, uEditorSmart4.getAssetsList().get(EditorSmartClipTask.getRandomIndex(uEditorSmart4.getAssetsList().size(), -1, p4)).getPath()).getAbsolutePath();
             startTime1 = EditorSdk2UtilsV2.getDisplayDuration(p0) - uEditorSmart4.getStartTime();
             uEditorSdk2A2.displayRange = EditorSdk2Utils.createTimeRange(uEditorSmart4.getStartTime(), startTime1);
             uEditorSdk2A2.fillingMode = 0;
             EditorSdk2AE2Utils.applyAE2EffectOnProjectBySettingsV2(p0, uEditorSdk2A2);
          }
       }
       return p0;
    }
    public static EditorSdk2V2$VideoEditorProject applyThemeOnProject(EditorSdk2V2$VideoEditorProject p0,String p1,String p2,String p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, EditorSmartClipTask.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return EditorSmartClipTask.applyThemeOnProject(p0, p1, p2, p3, System.currentTimeMillis());
    }
    public static EditorSdk2V2$VideoEditorProject applyThemeOnProject(EditorSdk2V2$VideoEditorProject p0,String p1,String p2,String p3,long p4){
       EditorSmartClipTask uEditorSmart = EditorSmartClipTask.class;
       if (PatchProxy.isSupport(uEditorSmart)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Long.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, null, uEditorSmart, "17");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return EditorSmartClipTask.applyThemeOnProject(p0, p1, p2, p3, p4, null, null);
    }
    public static EditorSdk2V2$VideoEditorProject applyThemeOnProject(EditorSdk2V2$VideoEditorProject p0,String p1,String p2,String p3,long p4,List p5,Map p6){
       EditorSdk2Utils$AssetLayoutInfo[] obj;
       File uFile;
       File uFile1;
       File[] uFileArray;
       int len;
       object oobject4;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       EditorSmartClipTask uEditorSmart = EditorSmartClipTask.class;
       int i = 1;
       int i1 = 0;
       if (PatchProxy.isSupport(uEditorSmart)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,oobject3,Long.valueOf(p4),p5,p6};
          obj = PatchProxy.apply(objArray, null, uEditorSmart, "18");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Random random = new Random(p4);
       EditorSdk2AE2Utils.clearAllAE2EffectOnProjectAndTrackAssetV2(p0);
       obj = EditorSdk2UtilsV2.getAllAssetLayoutInfosV2(p0);
       Iterator iterator = p0.trackAssets().iterator();
       int i2 = 0;
       while (iterator.hasNext()) {
          EditorSdk2V2$TrackAsset trackAsset = iterator.next();
          if (trackAsset.probedAssetFile() == null) {
             try{
                trackAsset.setProbedAssetFile(EditorSdk2UtilsV2.openTrackAsset(trackAsset.assetPath()).probedAssetFile());
                oobject.trackAssetsSetItem(i2, trackAsset);
             }catch(java.lang.Exception e0){
                EditorSdkLogger.e("EditorSmartClipTask", "error open trackAsset "+e0.getMessage());
                return oobject;
             }
          }
          if (trackAsset.transitionParam() != null) {
             trackAsset.transitionParam().setType(i1);
          }
          double d = (double)EditorSdk2UtilsV2.getTrackAssetHeight(trackAsset) / (double)EditorSdk2UtilsV2.getTrackAssetWidth(trackAsset);
          float f = (float)p0.projectOutputHeight() * 0x3f800000;
          f = f / (float)p0.projectOutputWidth();
          if (d - (double)f > 0) {
             Minecraft$AssetTransform uAssetTransf = new Minecraft$AssetTransform();
             uAssetTransf.setPositionX(50.00f);
             uAssetTransf.setPositionY(50.00f);
             d = 100.00f;
             uAssetTransf.setScaleX(d);
             uAssetTransf.setScaleY(d);
             trackAsset.setAssetTransform(uAssetTransf);
          }
          i2 = i2 + 1;
       }
       EditorSdk2V2$AudioAsset[] uAudioAssetA = new EditorSdk2V2$AudioAsset[i1];
       oobject.setAudioAssets(uAudioAssetA);
       if (oobject3 != null) {
          try{
             EditorSdk2V2$AudioAsset uAudioAsset = EditorSdk2UtilsV2.openAudioAsset(p3);
             uAudioAsset.setVolume(0x3fe0000000000000);
             EditorSmartClipTask.updateAudioVolumeRangesForAudioAssetWithProject(uAudioAsset, oobject);
             uAudioAsset.setAssetId(EditorSdk2Utils.getRandomID());
             uAudioAsset.setAssetPath(oobject3);
             uAudioAsset.setAssetSpeed(0x3ff0000000000000);
             uAudioAsset.setIsRepeat(i);
             iterator = p0.trackAssets().iterator();
             while (iterator.hasNext()) {
                EditorSdk2V2$TrackAsset trackAsset1 = iterator.next();
                if (trackAsset1.clippedRange() != null) {
                   trackAsset1.clippedRange().duration();
                }
             }
             EditorSdk2V2$AudioAsset[] uAudioAssetA1 = new EditorSdk2V2$AudioAsset[i];
             uAudioAssetA1[i1] = uAudioAsset;
             oobject.setAudioAssets(uAudioAssetA1);
          }catch(java.lang.Exception e0){
             EditorSdkLogger.e("EditorSmartClipTask", "applyThemeOnProject: error create backgroundMusic. "+e0.getMessage());
          }
       }
    }
    public static EditorSdk2V2$VideoEditorProject applyThemeOneOnProject(EditorSdk2V2$VideoEditorProject p0,File p1,String p2,Random p3){
       double bgVideoDurat;
       p2 = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, EditorSmartClipTask.class, "19");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       int i = 0;
       int i1 = 1;
       double d = 0;
       while (i < p0.trackAssetsSize()) {
          EditorSdk2V2$TrackAsset trackAsset = p0.trackAssets(i);
          EditorSdk2UtilsV2.getTrackAssetDisplayDuration(trackAsset);
          if (EditorSdk2UtilsV2.isSingleImagePath(trackAsset.assetPath())) {
             EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings uEditorSdk2A = new EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings();
             uEditorSdk2A.ae2AssetDir = new File(p1.getAbsolutePath(), "photo_zoomin").getAbsolutePath();
             uEditorSdk2A.displayRange = EditorSdk2Utils.createTimeRange(d, 12.00f);
             uEditorSdk2A.fillingMode = i1;
             EditorSdk2AE2Utils.applyAE2EffectOnTrackAssetBySettingsV2(trackAsset, uEditorSdk2A);
          }
          int i2 = p0.trackAssetsSize() - i1;
          if (i != i2) {
             trackAsset.setTransitionParam(new Minecraft$TransitionParam());
             trackAsset.transitionParam().setType(3);
             trackAsset.transitionParam().setDuration(0x3fdf5c28f5c28f5c);
          }
          i = i + 1;
       }
       EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings uEditorSdk2A1 = new EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings();
       uEditorSdk2A1.ae2AssetDir = new File(p1.getAbsolutePath(), "frame").getAbsolutePath();
       uEditorSdk2A1.displayRange = EditorSdk2Utils.createTimeRange(d, EditorSdk2UtilsV2.getDisplayDuration(p0));
       uEditorSdk2A1.fillingMode = 0;
       EditorSdk2AE2Utils.applyAE2EffectOnProjectBySettingsV2(p0, uEditorSdk2A1);
       double d1 = d;
       while (d1 - EditorSdk2UtilsV2.getDisplayDuration(p0) < 0) {
          double d2 = p3.nextDouble() * 2.00f;
          d2 = d2 + 3.00f;
          d2 = d2 + d1;
          d1 = p3.nextDouble() * 100.00f;
          d1 = d1 % 5.00f;
          i = (int)d1 + i1;
          EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings uEditorSdk2A2 = new EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings();
          String absolutePath = new File(p1, "burn"+i).getAbsolutePath();
          try{
             uEditorSdk2A2.ae2AssetDir = absolutePath;
             bgVideoDurat = EditorSdk2AE2Utils.getBgVideoDurationBySettings(uEditorSdk2A2);
          }catch(org.json.JSONException e0){
             StringBuilder str = "error in apply theme, getBgVideoDurationBySettings error "+e0;
             bgVideoDurat = d;
          }
          uEditorSdk2A2.displayRange = EditorSdk2Utils.createTimeRange(d2, bgVideoDurat);
          uEditorSdk2A2.fillingMode = 0;
          EditorSdk2AE2Utils.applyExtraAE2EffectOnProjectBySettingsV2(p0, uEditorSdk2A2, 0);
          d1 = d2 + bgVideoDurat;
       }
       return p0;
    }
    public static EditorSdk2V2$VideoEditorProject applyThemeSevenOnProject(EditorSdk2V2$VideoEditorProject p0,File p1,String p2,Random p3){
       double trackAssetDi;
       EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings uEditorSdk2A;
       double bgVideoDurat;
       p2 = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, EditorSmartClipTask.class, "25");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       int i = -1;
       int i1 = 0;
       double d = 0;
       int i2 = 1;
       while (i1 < p0.trackAssetsSize()) {
          EditorSdk2V2$TrackAsset trackAsset = p0.trackAssets(i1);
          trackAssetDi = EditorSdk2UtilsV2.getTrackAssetDisplayDuration(trackAsset);
          if (EditorSdk2UtilsV2.isSingleImagePath(trackAsset.assetPath())) {
             uEditorSdk2A = new EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings();
             uEditorSdk2A.ae2AssetDir = new File(p1.getAbsolutePath(), "photo_zoomin").getAbsolutePath();
             uEditorSdk2A.displayRange = EditorSdk2Utils.createTimeRange(d, trackAssetDi);
             uEditorSdk2A.fillingMode = i2;
             EditorSdk2AE2Utils.applyAE2EffectOnTrackAssetBySettingsV2(trackAsset, uEditorSdk2A);
          }
          int i3 = p0.trackAssetsSize() - i2;
          if (i1 != i3) {
             trackAsset.setTransitionParam(new Minecraft$TransitionParam());
             trackAsset.transitionParam().setType(14);
             trackAsset.transitionParam().setDuration(0x3fdf5c28f5c28f5c);
          }
          uEditorSdk2A = new EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings();
          Object[] objArray = new Object[i2];
          int i4 = EditorSmartClipTask.getRandomIndex(3, i, p3) + 1;
          objArray[0] = Integer.valueOf(i4);
          uEditorSdk2A.ae2AssetDir = new File(p1.getAbsolutePath(), String.format("frame%d", objArray)).getAbsolutePath();
          uEditorSdk2A.displayRange = EditorSdk2Utils.createTimeRange(d, trackAssetDi);
          uEditorSdk2A.fillingMode = 0;
          EditorSdk2AE2Utils.applyExtraAE2EffectOnTrackAssetBySettingsV2(trackAsset, uEditorSdk2A);
          i1 = i1 + 1;
       }
       double d1 = d;
       while (d1 - EditorSdk2UtilsV2.getDisplayDuration(p0) < 0) {
          trackAssetDi = p3.nextDouble() * 2.00f;
          trackAssetDi = trackAssetDi + 5.00f;
          trackAssetDi = trackAssetDi + d1;
          d1 = p3.nextDouble() * 100.00f;
          d1 = d1 % 3.00f;
          i = (int)d1 + i2;
          EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings uEditorSdk2A1 = new EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings();
          i = new File(p1, "explode"+i).getAbsolutePath();
          try{
             uEditorSdk2A1.ae2AssetDir = i;
             bgVideoDurat = EditorSdk2AE2Utils.getBgVideoDurationBySettings(uEditorSdk2A1);
          }catch(org.json.JSONException e14){
             StringBuilder str = "error in apply theme, getBgVideoDurationBySettings error "+e14;
             bgVideoDurat = d;
          }
          uEditorSdk2A1.displayRange = EditorSdk2Utils.createTimeRange(trackAssetDi, bgVideoDurat);
          uEditorSdk2A1.fillingMode = 0;
          EditorSdk2AE2Utils.applyExtraAE2EffectOnProjectBySettingsV2(p0, uEditorSdk2A1, 0);
          d1 = trackAssetDi + bgVideoDurat;
       }
       return p0;
    }
    public static EditorSdk2V2$VideoEditorProject applyThemeSixOnProject(EditorSdk2V2$VideoEditorProject p0,File p1,String p2,Random p3){
       double trackAssetDi;
       int i1;
       StringBuilder absolutePath;
       double bgVideoDurat;
       EditorSdk2V2$VideoEditorProject videoEditorP = p0;
       EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, EditorSmartClipTask.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       while (i < p0.trackAssetsSize()) {
          EditorSdk2V2$TrackAsset trackAsset = videoEditorP.trackAssets(i);
          trackAssetDi = EditorSdk2UtilsV2.getTrackAssetDisplayDuration(trackAsset);
          if (EditorSdk2UtilsV2.isSingleImagePath(trackAsset.assetPath())) {
             obj = new EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings();
             obj.ae2AssetDir = new File(p1.getAbsolutePath(), "photo_zoomin").getAbsolutePath();
             obj.displayRange = EditorSdk2Utils.createTimeRange(0, trackAssetDi);
             obj.fillingMode = 1;
             EditorSdk2AE2Utils.applyAE2EffectOnTrackAssetBySettingsV2(trackAsset, obj);
          }
          EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings uEditorSdk2A = new EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings();
          File uFile = new File(p1.getAbsolutePath(), "focus");
          if (!uFile.exists()) {
             uFile.getAbsolutePath();
             break ;
          }else {
             absolutePath = uFile.getAbsolutePath();
             try{
                uEditorSdk2A.ae2AssetDir = absolutePath;
                bgVideoDurat = EditorSdk2AE2Utils.getBgVideoDurationBySettings(uEditorSdk2A);
             }catch(org.json.JSONException e0){
                absolutePath = "error in apply theme, getBgVideoDurationBySettings error "+e0;
                bgVideoDurat = 0;
             }
             if (bgVideoDurat <= 0) {
                trackAssetDi = trackAssetDi - 0x3fdf5c28f5c28f5c;
             }else {
                trackAssetDi = trackAssetDi - 0x3fdf5c28f5c28f5c;
                trackAssetDi = Math.min(bgVideoDurat, trackAssetDi);
             }
             uEditorSdk2A.displayRange = EditorSdk2Utils.createTimeRange(0x3fdf5c28f5c28f5c, trackAssetDi);
             uEditorSdk2A.fillingMode = 1;
             EditorSdk2AE2Utils.applyExtraAE2EffectOnTrackAssetBySettingsV2(trackAsset, uEditorSdk2A);
             i1 = p0.trackAssetsSize() - 1;
             if (i != i1) {
                trackAsset.setTransitionParam(new Minecraft$TransitionParam());
                trackAsset.transitionParam().setType(3);
                trackAsset.transitionParam().setDuration(0x3fdf5c28f5c28f5c);
             }
             i = i + 1;
          }
       }
       obj = new EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings();
       obj.ae2AssetDir = new File(p1.getAbsolutePath(), "frame").getAbsolutePath();
       obj.displayRange = EditorSdk2Utils.createTimeRange(0, EditorSdk2UtilsV2.getDisplayDuration(p0));
       obj.fillingMode = 1;
       EditorSdk2AE2Utils.applyAE2EffectOnProjectBySettingsV2(videoEditorP, obj);
       trackAssetDi = 0;
       while (trackAssetDi - EditorSdk2UtilsV2.getDisplayDuration(p0) < 0) {
          double d = Math.random() * 2.00f;
          double d1 = 3.00f;
          d = d + d1;
          d = d + trackAssetDi;
          trackAssetDi = Math.random() * 100.00f;
          trackAssetDi = trackAssetDi % d1;
          i1 = (int)trackAssetDi + 1;
          EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings uEditorSdk2A1 = new EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings();
          absolutePath = new File(p1, "flare"+i1).getAbsolutePath();
          try{
             uEditorSdk2A1.ae2AssetDir = absolutePath;
             d1 = EditorSdk2AE2Utils.getBgVideoDurationBySettings(uEditorSdk2A1);
          }catch(org.json.JSONException e0){
             absolutePath = "error in apply theme, getBgVideoDurationBySettings error "+e0;
             d1 = 0;
          }
          uEditorSdk2A1.displayRange = EditorSdk2Utils.createTimeRange(d, d1);
          uEditorSdk2A1.fillingMode = 0;
          EditorSdk2AE2Utils.applyExtraAE2EffectOnProjectBySettingsV2(videoEditorP, uEditorSdk2A1, 0);
          double d2 = d + d1;
          trackAssetDi = d2;
       }
       return videoEditorP;
    }
    public static EditorSdk2V2$VideoEditorProject applyThemeTenOnProject(EditorSdk2V2$VideoEditorProject p0,File p1,String p2,Random p3){
       EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings uEditorSdk2A;
       EditorSdk2V2$VideoEditorProject videoEditorP = p0;
       File uFile = p1;
       Random random = p3;
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, EditorSmartClipTask.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = -1;
       int i1 = 0;
       String str = -1;
       for (int i2 = 0; i2 < p0.trackAssetsSize(); i2 = i2 + 1) {
          EditorSdk2V2$TrackAsset trackAsset = videoEditorP.trackAssets(i2);
          double trackAssetDi = EditorSdk2UtilsV2.getTrackAssetDisplayDuration(trackAsset);
          double d = 0;
          if (EditorSdk2UtilsV2.isSingleImagePath(trackAsset.assetPath())) {
             uEditorSdk2A = new EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings();
             uEditorSdk2A.ae2AssetDir = new File(p1.getAbsolutePath(), "photo_zoomin").getAbsolutePath();
             uEditorSdk2A.displayRange = EditorSdk2Utils.createTimeRange(d, trackAssetDi);
             uEditorSdk2A.fillingMode = i1;
             EditorSdk2AE2Utils.applyAE2EffectOnTrackAssetBySettingsV2(trackAsset, uEditorSdk2A);
          }
          int i3 = p0.trackAssetsSize() - 1;
          double d1 = 0x3fdf5c28f5c28f5c;
          int i4 = 3;
          if (i2 != i3) {
             trackAsset.setTransitionParam(new Minecraft$TransitionParam());
             trackAsset.transitionParam().setType(i4);
             trackAsset.transitionParam().setDuration(d1);
          }
          String[] stringArray = new String[]{"flare1","flare2","flare3"};
          EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings uEditorSdk2A1 = new EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings();
          uEditorSdk2A1.ae2AssetDir = new File(uFile, stringArray[EditorSmartClipTask.getRandomIndex(i4, i, random)]).getAbsolutePath();
          uEditorSdk2A1.fillingMode = i1;
          double d2 = trackAssetDi - d1;
          uEditorSdk2A1.displayRange = EditorSdk2Utils.createTimeRange(d1, d2);
          EditorSdk2AE2Utils.applyExtraAE2EffectOnTrackAssetBySettingsV2(trackAsset, uEditorSdk2A1);
          String[] stringArray1 = new String[]{"Frame1","Frame2","Frame3"};
          uEditorSdk2A = new EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings();
          uEditorSdk2A.ae2AssetDir = new File(uFile, stringArray1[EditorSmartClipTask.getRandomIndex(i4, str, random)]).getAbsolutePath();
          i1 = 0;
          uEditorSdk2A.fillingMode = i1;
          uEditorSdk2A.displayRange = EditorSdk2Utils.createTimeRange(0, trackAssetDi);
          EditorSdk2AE2Utils.applyExtraAE2EffectOnTrackAssetBySettingsV2(trackAsset, uEditorSdk2A);
       }
       return videoEditorP;
    }
    public static EditorSdk2V2$VideoEditorProject applyThemeThreeOnProject(EditorSdk2V2$VideoEditorProject p0,File p1,String p2,Random p3){
       double d2;
       StringBuilder absolutePath;
       EditorSdk2V2$VideoEditorProject videoEditorP = p0;
       EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, EditorSmartClipTask.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       for (int i = 0; i < p0.trackAssetsSize(); i = i + 1) {
          EditorSdk2V2$TrackAsset trackAsset = videoEditorP.trackAssets(i);
          int i1 = 1;
          if (EditorSdk2UtilsV2.isSingleImagePath(trackAsset.assetPath())) {
             obj = new EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings();
             obj.ae2AssetDir = new File(p1.getAbsolutePath(), "photo_zoomin").getAbsolutePath();
             obj.displayRange = EditorSdk2Utils.createTimeRange(0, 12.00f);
             obj.fillingMode = i1;
             EditorSdk2AE2Utils.applyAE2EffectOnTrackAssetBySettingsV2(trackAsset, obj);
          }
          int i2 = p0.trackAssetsSize() - i1;
          if (i != i2) {
             trackAsset.setTransitionParam(new Minecraft$TransitionParam());
             trackAsset.transitionParam().setType(4);
             trackAsset.transitionParam().setDuration(0x3fdf5c28f5c28f5c);
          }
          double trackAssetDi = EditorSdk2UtilsV2.getTrackAssetDisplayDuration(trackAsset);
          double d = 100.00f;
          double d1 = p3.nextDouble() * d;
          d1 = d1 % 4.00f;
          i2 = (int)d1 + i1;
          EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings uEditorSdk2A = new EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings();
          uEditorSdk2A.ae2AssetDir = new File(p1.getAbsolutePath(), "f"+i2).getAbsolutePath();
          uEditorSdk2A.displayRange = EditorSdk2Utils.createTimeRange(0, trackAssetDi);
          uEditorSdk2A.fillingMode = 0;
          EditorSdk2AE2Utils.applyExtraAE2EffectOnTrackAssetBySettingsV2(trackAsset, uEditorSdk2A);
          d2 = p3.nextDouble() * d;
          d2 = d2 % 3.00f;
          i2 = (int)d2;
          i2 = i2 + 1;
          EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings uEditorSdk2A1 = new EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings();
          absolutePath = new File(p1.getAbsolutePath(), "g"+i2).getAbsolutePath();
          try{
             uEditorSdk2A1.ae2AssetDir = absolutePath;
             d1 = EditorSdk2AE2Utils.getBgVideoDurationBySettings(uEditorSdk2A1);
          }catch(org.json.JSONException e0){
             absolutePath = "error in apply theme, getBgVideoDurationBySettings error "+e0;
             d1 = 0;
          }
          trackAssetDi = trackAssetDi - d1;
          double d3 = p3.nextDouble() * trackAssetDi;
          uEditorSdk2A1.displayRange = EditorSdk2Utils.createTimeRange(Math.min(0, d3), d1);
          uEditorSdk2A1.fillingMode = 0;
          EditorSdk2AE2Utils.applyExtraAE2EffectOnTrackAssetBySettingsV2(trackAsset, uEditorSdk2A1);
       }
       d2 = 0;
       while (d2 - EditorSdk2UtilsV2.getDisplayDuration(p0) < 0) {
          double d4 = p3.nextDouble() * 2.00f;
          d4 = d4 + 3.00f;
          d4 = d4 + d2;
          p3.nextDouble();
          EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings uEditorSdk2A2 = new EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings();
          absolutePath = new File(p1.getAbsolutePath(), "blur").getAbsolutePath();
          try{
             uEditorSdk2A2.ae2AssetDir = absolutePath;
             d2 = EditorSdk2AE2Utils.getBgVideoDurationBySettings(uEditorSdk2A2);
          }catch(org.json.JSONException e0){
             absolutePath = "error in apply theme, getBgVideoDurationBySettings error "+e0;
             d2 = 0;
          }
          uEditorSdk2A2.displayRange = EditorSdk2Utils.createTimeRange(d4, d2);
          uEditorSdk2A2.fillingMode = 0;
          EditorSdk2AE2Utils.applyExtraAE2EffectOnProjectBySettingsV2(videoEditorP, uEditorSdk2A2, 0);
          d2 = d2 + d4;
       }
       return videoEditorP;
    }
    public static EditorSdk2V2$VideoEditorProject applyThemeTwoOnProject(EditorSdk2V2$VideoEditorProject p0,File p1,String p2,Random p3){
       int i5;
       double bgVideoDurat;
       StringBuilder str;
       EditorSdk2V2$VideoEditorProject videoEditorP = p0;
       EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, EditorSmartClipTask.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       double d = 0x3fdf5c28f5c28f5c;
       int i1 = 4;
       double d1 = 0;
       while (i < p0.trackAssetsSize()) {
          EditorSdk2V2$TrackAsset trackAsset = videoEditorP.trackAssets(i);
          if (EditorSdk2UtilsV2.isSingleImagePath(trackAsset.assetPath())) {
             EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings uEditorSdk2A = new EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings();
             uEditorSdk2A.ae2AssetDir = new File(p1.getAbsolutePath(), "photo_zoomin").getAbsolutePath();
             uEditorSdk2A.displayRange = EditorSdk2Utils.createTimeRange(d1, 12.00f);
             uEditorSdk2A.fillingMode = 1;
             EditorSdk2AE2Utils.applyAE2EffectOnTrackAssetBySettingsV2(trackAsset, uEditorSdk2A);
          }
          int i2 = p0.trackAssetsSize() - 1;
          if (i != i2) {
             trackAsset.setTransitionParam(new Minecraft$TransitionParam());
             trackAsset.transitionParam().setType(i1);
             trackAsset.transitionParam().setDuration(d);
          }
          i = i + 1;
       }
       obj = new EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings();
       obj.ae2AssetDir = new File(p1.getAbsolutePath(), "player").getAbsolutePath();
       obj.displayRange = EditorSdk2Utils.createTimeRange(d1, EditorSdk2UtilsV2.getDisplayDuration(p0));
       obj.fillingMode = 0;
       EditorSdk2AE2Utils.applyAE2EffectOnProjectBySettingsV2(videoEditorP, obj);
       i = -1;
       int i3 = 0;
       while (i3 < p0.trackAssetsSize()) {
          double trackAssetDi = EditorSdk2UtilsV2.getTrackAssetDisplayDuration(videoEditorP.trackAssets(i3));
          double[] uodoubleArra = new double[i1]{0x4000000000000000,0x4004000000000000,0x4000000000000000,0x4008000000000000};
          ArrayList uArrayList = new ArrayList();
          int i4 = 0;
          while (i4 < i1) {
             if (i != i4 && trackAssetDi - uodoubleArra[i4] > 0) {
                uArrayList.add(Integer.valueOf(i4));
             }
             i4 = i4 + 1;
             i1 = 4;
          }
          if (!uArrayList.size()) {
             trackAssetDi = d1;
          }else {
             double d2 = p3.nextDouble() * (double)uArrayList.size();
             i1 = uArrayList.get((int)d2).intValue();
             EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings uEditorSdk2A1 = new EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings();
             Object[] objArray = new Object[]{Integer.valueOf(i5)};
             i5 = i1 + 1;
             uEditorSdk2A1.ae2AssetDir = new File(p1.getAbsolutePath(), String.format("word%d", objArray)).getAbsolutePath();
             EditorSdk2$TimeRange timeRange = new EditorSdk2$TimeRange();
             timeRange.setStart(d);
             trackAssetDi = trackAssetDi - d;
             try{
                timeRange.setDuration(trackAssetDi);
                bgVideoDurat = EditorSdk2AE2Utils.getBgVideoDurationBySettings(uEditorSdk2A1);
             }catch(org.json.JSONException e0){
                str = "error in apply theme, getBgVideoDurationBySettings error "+e0;
                bgVideoDurat = 0;
             }
             trackAssetDi = 0;
             bgVideoDurat = (!bgVideoDurat - trackAssetDi)? timeRange.duration(): Math.min(bgVideoDurat, timeRange.duration());
             uEditorSdk2A1.displayRange = EditorSdk2Utils.createTimeRange(timeRange.start(), bgVideoDurat);
             uEditorSdk2A1.fillingMode = 0;
             EditorSdk2AE2Utils.applyExtraAE2EffectOnTrackAssetBySettingsV2(videoEditorP.trackAssets(i3), uEditorSdk2A1);
             i = i1;
          }
          i3 = i3 + 1;
          d1 = trackAssetDi;
          i1 = 4;
       }
       double d3 = d1;
       while (d3 - EditorSdk2UtilsV2.getDisplayDuration(p0) < 0) {
          double d4 = p3.nextDouble() * 2.00f;
          d4 = d4 + 2.00f;
          d4 = d4 + d3;
          d3 = p3.nextDouble() * 100.00f;
          d3 = d3 % 4.00f;
          i = (int)d3 + 1;
          EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings uEditorSdk2A2 = new EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings();
          str = new File(p1.getAbsolutePath(), "flare"+i).getAbsolutePath();
          try{
             uEditorSdk2A2.ae2AssetDir = str;
             d1 = EditorSdk2AE2Utils.getBgVideoDurationBySettings(uEditorSdk2A2);
          }catch(org.json.JSONException e0){
             str = "error in apply theme, getBgVideoDurationBySettings error "+e0;
             d1 = d1;
          }
          uEditorSdk2A2.displayRange = EditorSdk2Utils.createTimeRange(d4, d1);
          uEditorSdk2A2.fillingMode = 0;
          EditorSdk2AE2Utils.applyExtraAE2EffectOnProjectBySettingsV2(videoEditorP, uEditorSdk2A2, 0);
          d3 = d4 + d1;
       }
       return videoEditorP;
    }
    public static String getFileMD5(File p0){
       FileInputStream obj = PatchProxy.applyOneRefs(p0, null, EditorSmartClipTask.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new FileInputStream(p0);
       MessageDigest instance = MessageDigest.getInstance("MD5");
       int i = 1024;
       byte[] uobyteArray = new byte[i];
       int i1 = obj.read(uobyteArray, 0, i);
       while (i1 != -1) {
          instance.update(uobyteArray, 0, i1);
       }
       return new BigInteger(1, instance.digest()).toString(16);
    }
    public static int getRandomIndex(int p0,int p1,Random p2){
       if (PatchProxy.isSupport(EditorSmartClipTask.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, null, EditorSmartClipTask.class, "30");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p0 <= 1) {
          return 0;
       }else {
          int i = (int)(p2.nextDouble() * 100.00f);
          if (p1 <= -1) {
             return (i % p0);
          }else {
             i = i % (p0 - 1);
             if (i >= p1 && p1 >= 0) {
                i++;
             }
             return i;
          }
       }
    }
    public static EditorSmartClipTask$Builder newBuilder(){
       Object obj = PatchProxy.apply(null, null, EditorSmartClipTask.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new EditorSmartClipTask$Builder();
    }
    public static Bitmap rotaingImage(Rotation p0,Bitmap p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, EditorSmartClipTask.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Matrix matrix = new Matrix();
       int i = 0;
       int i1 = EditorSmartClipTask$3.$SwitchMap$com$kwai$kve$Rotation[p0.ordinal()];
       if (i1 != 1) {
          if (i1 != 2) {
             if (i1 == 3) {
                i = 270;
             }
          }else {
             i = 180;
          }
       }else {
          i = 90;
       }
       if (!i) {
          return p1;
       }else {
          matrix.postRotate((float)i);
          Bitmap uBitmap = Bitmap.createBitmap(p1, 0, 0, p1.getWidth(), p1.getHeight(), matrix, true);
          if (uBitmap != p1 && !p1.isRecycled()) {
             p1.recycle();
          }
          return uBitmap;
       }
    }
    public static void updateAudioVolumeRangesForAudioAssetWithProject(EditorSdk2V2$AudioAsset p0,EditorSdk2V2$VideoEditorProject p1){
       Minecraft$AudioVolumeRange uAudioVolume;
       Minecraft$Range range;
       double d;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, EditorSmartClipTask.class, "16")) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       int i1 = 0;
       for (int i = 0; i < p1.trackAssetsSize(); i = i + 1) {
          EditorSdk2V2$TrackAsset trackAsset = p1.trackAssets(i);
          try{
             EditorSdk2$TimeRange trackAssetRe = EditorSdk2UtilsV2.getTrackAssetRenderPosRangeByIndex(p1, i);
             if (trackAsset.isVocal()) {
                if (i1) {
                   i1 = uArrayList.size() - 1;
                   uAudioVolume = uArrayList.get(i1);
                   range = uAudioVolume.timeRange();
                   d = uAudioVolume.timeRange().duration() + trackAssetRe.duration();
                   range.setDuration(d);
                }else {
                   uAudioVolume = new Minecraft$AudioVolumeRange();
                   range = new Minecraft$Range();
                   range.setStart(trackAssetRe.start());
                   range.setDuration(trackAssetRe.duration());
                   uAudioVolume.setTimeRange(range);
                   d = p0.volume() * 0x3fd999999999999a;
                   uAudioVolume.setVolume(d);
                   uAudioVolume.setFadeTime(0x3fe0000000000000);
                   uArrayList.add(uAudioVolume);
                }
             }
             i1 = trackAsset.isVocal();
          }catch(com.kwai.video.editorsdk2.EditorSdk2InternalErrorException e0){
             return;
          }
       }
       Minecraft$AudioVolumeRange[] uAudioVolume1 = new Minecraft$AudioVolumeRange[uArrayList.size()];
       p0.setAudioVolumeRanges(uArrayList.toArray(uAudioVolume1));
       return;
    }
    public static EditorSdk2V2$VideoEditorProject updateProjectWithMusicInfo(EditorSdk2V2$VideoEditorProject p0,double p1,String p2,double p3,double p4,double p5){
       EditorSmartClipTask uEditorSmart = EditorSmartClipTask.class;
       if (PatchProxy.isSupport(uEditorSmart)) {
          Object[] objArray = new Object[]{p0,Double.valueOf(p1),p2,Double.valueOf(p3),Double.valueOf(p4),Double.valueOf(p5)};
          Object obj = PatchProxy.apply(objArray, null, uEditorSmart, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       EditorMemoryProjectCreator.updateProjectFromMusicResult(p0, p1, p2, p3, p4, p5);
       return p0;
    }
    public void cancel(){
       if (PatchProxy.applyVoid(null, this, EditorSmartClipTask.class, "12")) {
          return;
       }
       EditorSdkLogger.i("EditorSmartClipTask", "EditorSmartClipTask cancel bef lock");
       EditorSmartClipTask tmLock = this.mLock;
       _monitor_enter(tmLock);
       EditorSdkLogger.i("EditorSmartClipTask", "EditorSmartClipTask cancel aft lock");
       EditorSmartClipTask tmSmartTask = this.mSmartTask;
       if (tmSmartTask != null) {
          tmSmartTask.stop();
       }
       tmSmartTask = this.mListener;
       if (tmSmartTask != null) {
          tmSmartTask.onCancel();
       }
       _monitor_exit(tmLock);
       return;
    }
    public SmartEditResult changedTemplateResult(String p0){
       EditorSmartClipTask obj = PatchProxy.applyOneRefs(p0, this, EditorSmartClipTask.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mSmartTask;
       if (obj == null) {
          return null;
       }
       return obj.changeTemplate(p0);
    }
    public EditorKveAsset getAssetWithPath(String p0){
       EditorKveAsset uEditorKveAs;
       Iterator obj = PatchProxy.applyOneRefs(p0, this, EditorSmartClipTask.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mMediaAssets.iterator();
       while (true) {
          if (!obj.hasNext()) {
             return null;
          }
          uEditorKveAs = obj.next();
          if ((uEditorKveAs.getFileName()).equals(p0)) {
             break ;
          }
       }
       return uEditorKveAs;
    }
    public VoiceDetectorResult getVEVoiceDetectResult(VoiceDetectorParam p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, EditorSmartClipTask.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       EditorKveAsset assetWithPat = this.getAssetWithPath(p0.getUrl());
       if (assetWithPat == null) {
          return null;
       }
       obj = new ArrayList();
       Iterator iterator = this.mVoiceDetectResults.get(assetWithPat).iterator();
       while (iterator.hasNext()) {
          EditorKveVoiceDetectResult uEditorKveVo = iterator.next();
          VoiceDetectorFeature voiceDetecto = new VoiceDetectorFeature(uEditorKveVo.getStart(), uEditorKveVo.getEnd(), uEditorKveVo.getNoiseProb(), uEditorKveVo.getSpeechProb(), uEditorKveVo.getMusicProb());
          obj.add(v13);
       }
       VoiceDetectorFeature[] voiceDetecto1 = new VoiceDetectorFeature[obj.size()];
       return new VoiceDetectorResult(new ErrorInfo(), obj.toArray(voiceDetecto1));
    }
    public boolean hasVoiceDetector(){
       Iterator obj = PatchProxy.apply(null, this, EditorSmartClipTask.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mMediaAssets.iterator();
       boolean b = false;
       int i = 0;
       while (obj.hasNext()) {
          if (!EditorSdk2UtilsV2.isSingleImagePath(obj.next().getFileName())) {
             i = 1;
          }
       }
       EditorSmartClipTask tmVoiceDetec = this.mVoiceDetectModePath;
       if (tmVoiceDetec != null && (!TextUtils.isEmpty(tmVoiceDetec) && i)) {
          b = true;
       }
       return b;
    }
    public List readVoiceDdtectResultListFromCache(File p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, EditorSmartClipTask.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!p0.exists()) {
          return null;
       }
       obj = new ArrayList();
       FileInputStream uFileInputSt = new FileInputStream(p0);
       ObjectInputStream objectInputS = new ObjectInputStream(uFileInputSt);
       uFileInputSt.close();
       objectInputS.close();
       return objectInputS.readObject();
    }
    public void realReleaseDecoder(){
       if (PatchProxy.applyVoid(null, this, EditorSmartClipTask.class, "10")) {
          return;
       }
       EditorSdkLogger.i("EditorSmartClipTask", "EditorSmartClipTask realReleaseDecoder bef lock");
       EditorSmartClipTask tmLock = this.mLock;
       _monitor_enter(tmLock);
       EditorSdkLogger.i("EditorSmartClipTask", "EditorSmartClipTask realReleaseDecoder aft lock");
       EditorSmartClipTask tmDecoder = this.mDecoder;
       if (tmDecoder == null) {
          _monitor_exit(tmLock);
          return;
       }else {
          tmDecoder.setListener(null);
          if (this.mDecoder.isOpened()) {
             this.mDecoder.close();
          }
          this.mDecoder.release();
          _monitor_exit(tmLock);
          return;
       }
    }
    public void releaseDecoder(){
       if (PatchProxy.applyVoid(null, this, EditorSmartClipTask.class, "9")) {
          return;
       }
       EditorSdkLogger.i("EditorSmartClipTask", "EditorSmartClipTask releaseDecoder empty method");
       return;
    }
    public void setListener(EditorSmartClipListener p0){
       this.mListener = p0;
    }
    public void start(){
       if (PatchProxy.applyVoid(null, this, EditorSmartClipTask.class, "8")) {
          return;
       }
       if (this.hasVoiceDetector()) {
          this.startVoiceDetector();
       }
       if (this.mOnlyAnalysisMusic != null) {
          return;
       }else {
          new Thread(new EditorSmartClipTask$1(this)).start();
          return;
       }
    }
    public void startVoiceDetector(){
       if (PatchProxy.applyVoid(null, this, EditorSmartClipTask.class, "13")) {
          return;
       }
       this.mVoiceDetectStatus = EditorSmartClipTask$EditorVoiceDetectStatus.EditorVoiceDetectStatusSuspended;
       this.mVoiceDetectCostTime = System.nanoTime();
       new EditorSmartClipTask$2(this, "voiceDetect").start();
       return;
    }
    public boolean writeVoiceDdtectResultListIntoCache(File p0,List p1){
       FileOutputStream obj = PatchProxy.applyTwoRefs(p0, p1, this, EditorSmartClipTask.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!(Environment.getExternalStorageState()).equals("mounted")) {
          return false;
       }
       obj = new FileOutputStream(p0);
       ObjectOutputStream objectOutput = new ObjectOutputStream(obj);
       objectOutput.writeObject(p1);
       obj.close();
       objectOutput.close();
       return true;
    }
}
