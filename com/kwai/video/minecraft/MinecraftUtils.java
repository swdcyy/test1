package com.kwai.video.minecraft.MinecraftUtils;
import java.lang.Object;
import com.kwai.video.minecraft.model.MutableTrack;
import com.kwai.video.minecraft.model.MutableClip;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$TimeRange;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.video.minecraft.model.MutableTimeline;
import java.util.ArrayList;
import java.lang.Number;
import com.kwai.video.minecraft.model.nano.Minecraft$KSAVClip;
import com.kwai.video.minecraft.model.ErrorStatus;
import com.kwai.video.minecraft.model.nano.Minecraft$AudioVolumeRangeParam;
import com.kwai.video.minecraft.model.nano.Minecraft$AudioVolumeRange;
import com.kwai.video.minecraft.model.nano.Minecraft$Range;
import com.kwai.video.minecraft.model.TimeRange;
import com.kwai.video.minecraft.model.RationalTime;
import com.kwai.video.minecraft.model.EditorSdk2V2$TimeRangeV2;
import com.kwai.video.minecraft.model.EditorSdk2V2$TimeRangeImpl;
import com.kwai.video.minecraft.model.nano.Minecraft$SubAssetAnimationKeyFrame;
import com.kwai.video.minecraft.model.nano.Minecraft$PropertyKeyFrame;
import com.kwai.video.minecraft.model.nano.Minecraft$AssetTransform;
import com.kwai.video.minecraft.model.nano.Minecraft$LegacyAE2Effect;
import com.kwai.video.minecraft.model.nano.Minecraft$MagicTouchEffectParam;
import com.kwai.video.minecraft.model.nano.Minecraft$VisualEffectParam;
import com.kwai.video.minecraft.model.nano.Minecraft$WesterosFaceMagicParam;
import java.util.Iterator;
import com.kwai.video.minecraft.model.Effect;
import java.util.Set;
import com.kwai.video.minecraft.model.MutableEffect;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import com.kwai.video.minecraft.model.nano.Minecraft$TemplateClip;
import com.kwai.video.editorsdk2.logger.EditorSdkLogger;
import com.kwai.video.minecraft.model.MinecraftModelDefine$ClipType;
import com.kwai.video.minecraft.model.MutableItem;
import java.util.HashSet;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ProbedFile;
import java.lang.Integer;

public class MinecraftUtils	// class@0009e7
{

    public void MinecraftUtils(){
       super();
    }
    public static boolean AppendClipToTrack(MutableTrack p0,MutableClip p1,EditorSdk2$TimeRange p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, MinecraftUtils.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MinecraftUtils.AppendClipToTrackNative(p0, p1, p2);
    }
    public static native boolean AppendClipToTrackNative(MutableTrack p0,MutableClip p1,EditorSdk2$TimeRange p2);
    public static boolean ApplyOverlappedLegacyAE2EffectsOnTimeline(MutableTimeline p0,ArrayList p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, MinecraftUtils.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MinecraftUtils.ApplyOverlappedLegacyAE2EffectsOnTimelineNative(p0, p1);
    }
    public static native boolean ApplyOverlappedLegacyAE2EffectsOnTimelineNative(MutableTimeline p0,ArrayList p1);
    public static double CalcClipDurationAccordingToFileDurationAndClippedRange(MutableClip p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MinecraftUtils.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return MinecraftUtils.CalcClipDurationAccordingToFileDurationAndClippedRangeNative(p0);
    }
    public static native double CalcClipDurationAccordingToFileDurationAndClippedRangeNative(MutableClip p0);
    public static double CalcMainClipDuration(MutableClip p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MinecraftUtils.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return MinecraftUtils.CalcMainClipDurationNative(p0);
    }
    public static native double CalcMainClipDurationNative(MutableClip p0);
    public static native double CalculateAVClipDurationByTrimmedRangeAndTimemapButWithoutSpeedNative(Minecraft$KSAVClip p0,ErrorStatus p1);
    public static double CalculateAVClipDurationByTrimmedRangeAndTimemapSpeed(Minecraft$KSAVClip p0,ErrorStatus p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, MinecraftUtils.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return MinecraftUtils.CalculateAVClipDurationByTrimmedRangeAndTimemapButWithoutSpeedNative(p0, p1);
    }
    public static Minecraft$AudioVolumeRange CreateAudioVolumeRangeFromAudioVolumeRangeParam(Minecraft$AudioVolumeRangeParam p0){
       Object obj = null;
       Minecraft$AudioVolumeRange obj1 = PatchProxy.applyOneRefs(p0, obj, MinecraftUtils.class, "5");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 == null) {
          return obj;
       }
       obj1 = new Minecraft$AudioVolumeRange();
       obj1.setTimeRange(p0.timeRange().clone());
       obj1.setVolume(p0.volume());
       obj1.setFadeTime(p0.fadeinDuration());
       return obj1;
    }
    public static Minecraft$AudioVolumeRangeParam CreateAudioVolumeRangeParamFromAudioVolumeRange(Minecraft$AudioVolumeRange p0){
       Object obj = null;
       Minecraft$AudioVolumeRangeParam obj1 = PatchProxy.applyOneRefs(p0, obj, MinecraftUtils.class, "6");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 == null) {
          return obj;
       }
       obj1 = new Minecraft$AudioVolumeRangeParam();
       obj1.setTimeRange(p0.timeRange().clone());
       obj1.setVolume(p0.volume());
       obj1.setFadeinDuration(p0.fadeTime());
       obj1.setFadeoutDuration(p0.fadeTime());
       return obj1;
    }
    public static EditorSdk2$TimeRange CreateEditorTimeRangeFromMinecraft(TimeRange p0){
       Object obj = null;
       EditorSdk2$TimeRange obj1 = PatchProxy.applyOneRefs(p0, obj, MinecraftUtils.class, "2");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 == null) {
          return obj;
       }
       obj1 = new EditorSdk2$TimeRange();
       obj1.setDuration(p0.duration().toSeconds());
       obj1.setStart(p0.startTime().toSeconds());
       return obj1;
    }
    public static EditorSdk2V2$TimeRangeV2 CreateEditorTimeRangeV2FromMinecraft(TimeRange p0){
       Object obj = null;
       EditorSdk2V2$TimeRangeImpl obj1 = PatchProxy.applyOneRefs(p0, obj, MinecraftUtils.class, "1");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 == null) {
          return obj;
       }
       obj1 = new EditorSdk2V2$TimeRangeImpl();
       obj1.start = p0.startTime().toSeconds();
       obj1.duration = p0.duration().toSeconds();
       return obj1;
    }
    public static TimeRange CreateMinecraftTimeRangeFromEditor(EditorSdk2$TimeRange p0){
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, MinecraftUtils.class, "3");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 == null) {
          return obj;
       }
       return new TimeRange(RationalTime.fromSeconds(p0.start()), RationalTime.fromSeconds(p0.duration()));
    }
    public static TimeRange CreateMinecraftTimeRangeV2FromEditor(EditorSdk2V2$TimeRangeV2 p0){
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, MinecraftUtils.class, "4");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 == null) {
          return obj;
       }
       return new TimeRange(RationalTime.fromSeconds(p0.start()), RationalTime.fromSeconds(p0.duration()));
    }
    public static Minecraft$PropertyKeyFrame CreatePropertyKeyFrameFromSubAssetAnimationKeyFrame(Minecraft$SubAssetAnimationKeyFrame p0){
       Object obj = null;
       Minecraft$PropertyKeyFrame obj1 = PatchProxy.applyOneRefs(p0, obj, MinecraftUtils.class, "7");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 == null) {
          return obj;
       }
       obj1 = new Minecraft$PropertyKeyFrame();
       obj1.setDuration(p0.duration());
       obj1.setTiming(p0.timing());
       obj1.setAssetTransform(p0.assetTransformation());
       return obj1;
    }
    public static Minecraft$SubAssetAnimationKeyFrame CreateSubAssetAnimationKeyFrameFromPropertyKeyFrame(Minecraft$PropertyKeyFrame p0){
       Object obj = null;
       Minecraft$SubAssetAnimationKeyFrame obj1 = PatchProxy.applyOneRefs(p0, obj, MinecraftUtils.class, "8");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 == null) {
          return obj;
       }
       obj1 = new Minecraft$SubAssetAnimationKeyFrame();
       obj1.setDuration(p0.duration());
       obj1.setTiming(p0.timing());
       obj1.setAssetTransformation(p0.assetTransform());
       return obj1;
    }
    public static void FillEffectFields(Minecraft$LegacyAE2Effect p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, MinecraftUtils.class, "19")) {
          return;
       }
       MinecraftUtils.FillLegacyAE2EffectFieldsNative(p0);
       return;
    }
    public static void FillEffectFields(Minecraft$MagicTouchEffectParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, MinecraftUtils.class, "16")) {
          return;
       }
       MinecraftUtils.FillMagicTouchEffectFieldsNative(p0);
       return;
    }
    public static void FillEffectFields(Minecraft$VisualEffectParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, MinecraftUtils.class, "17")) {
          return;
       }
       MinecraftUtils.FillVisualEffectFieldsNative(p0);
       return;
    }
    public static void FillEffectFields(Minecraft$WesterosFaceMagicParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, MinecraftUtils.class, "18")) {
          return;
       }
       MinecraftUtils.FillWesterosFaceMagicFieldsNative(p0);
       return;
    }
    public static native void FillLegacyAE2EffectFieldsNative(Minecraft$LegacyAE2Effect p0);
    public static native void FillMagicTouchEffectFieldsNative(Minecraft$MagicTouchEffectParam p0);
    public static native void FillVisualEffectFieldsNative(Minecraft$VisualEffectParam p0);
    public static native void FillWesterosFaceMagicFieldsNative(Minecraft$WesterosFaceMagicParam p0);
    public static ArrayList FilterEffects(ArrayList p0,Class p1,String p2){
       ArrayList obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, MinecraftUtils.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Effect uEffect = iterator.next();
          boolean b = p1.isInstance(uEffect);
          if (p2 != null) {
             Set set = uEffect.tags();
             b = (b && (set != null && set.contains(p2)))? true: false;
          }
       label_003f :
          if (b) {
             obj.add(uEffect);
          }
       }
       return obj;
    }
    public static String GetEffectId(MutableEffect p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MinecraftUtils.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return "";
       }
       return p0.effectId();
    }
    public static String GetMinecraftID(){
       Object obj = PatchProxy.apply(null, null, MinecraftUtils.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MinecraftUtils.GetMinecraftIDNative();
    }
    public static native String GetMinecraftIDNative();
    public static String GetPathOfAVClip(Minecraft$KSAVClip p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MinecraftUtils.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MinecraftUtils.GetPathOfAVClipNative(p0);
    }
    public static native String GetPathOfAVClipNative(Minecraft$KSAVClip p0);
    public static String GetRefIdOfAVClip(Minecraft$KSAVClip p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MinecraftUtils.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MinecraftUtils.GetRefIdOfAVClipNative(p0);
    }
    public static native String GetRefIdOfAVClipNative(Minecraft$KSAVClip p0);
    public static ArrayList GetReplaceableAVClipByRefId(MutableTimeline p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, MinecraftUtils.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.mutableReplaceableClipsByRefId(p1).getArrayList();
    }
    public static Minecraft$TemplateClip GetTemplateClipFromTimeline(MutableTimeline p0){
       MutableClip obj = PatchProxy.applyOneRefs(p0, null, MinecraftUtils.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       MutableTrack mutableTrack = MinecraftUtils.GetTemplateTrackFromTimeline(p0);
       if (mutableTrack == null) {
          EditorSdkLogger.e("[getTemplateClipFromTimeline] templateTrack is null");
          return null;
       }else {
          Iterator iterator = mutableTrack.getMutableClips().getArrayList().iterator();
          while (true) {
             if (!iterator.hasNext()) {
                return null;
             }
             obj = iterator.next();
             if (obj.getClipType() == MinecraftModelDefine$ClipType.ClipType_TemplateClip) {
                break ;
             }
          }
          return obj;
       }
    }
    public static MutableTrack GetTemplateTrackFromTimeline(MutableTimeline p0){
       MutableTrack obj = PatchProxy.applyOneRefs(p0, null, MinecraftUtils.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Iterator iterator = p0.mutableTracks().getArrayList().iterator();
       while (true) {
          if (iterator.hasNext()) {
             obj = iterator.next();
             Iterator iterator1 = obj.getMutableClips().getArrayList().iterator();
             while (true) {
                if (iterator1.hasNext()) {
                   if (iterator1.next().getClipType() == MinecraftModelDefine$ClipType.ClipType_TemplateClip) {
                      return obj;
                   }
                }else {
                   continue ;
                }
             }
             return null;
          }else {
             goto label_0049 ;
          }
       }
    }
    public static float GetTimelineFrameRate(MutableTimeline p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MinecraftUtils.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return MinecraftUtils.GetTimelineFrameRateNative(p0);
    }
    public static native float GetTimelineFrameRateNative(MutableTimeline p0);
    public static boolean InsertOrUpdateOrDeleteEffectIntoItem(MutableEffect p0,String p1,String p2,MutableItem p3,ErrorStatus p4){
       Set obj;
       HashSet hashSet;
       MinecraftUtils minecraftUti = MinecraftUtils.class;
       int i = 1;
       if (PatchProxy.isSupport(minecraftUti)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          obj = PatchProxy.apply(objArray, null, minecraftUti, "9");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p3 == null) {
          return 0;
       }else if(p0 == null && (p2 != null && p2.isEmpty())){
          return i;
       }else if(p0 != null){
          if (p1 != null && !p1.isEmpty()) {
             obj = p0.tags();
             if (obj == null) {
                hashSet = new HashSet();
             }
             hashSet.add(p1);
             p0.setTags(hashSet);
          }
          if (p2 != null && !p2.isEmpty()) {
             i = p3.replaceEffect(p0, p2, p4);
          }else {
             p3.appendEffect(p0, p4);
             i = p3;
          }
       }else if(p2 != null){
          i = p3.deleteEffect(p2, p4);
       }
       return i;
    }
    public static boolean IsAVClipContainAudio(Minecraft$KSAVClip p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MinecraftUtils.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MinecraftUtils.IsAVClipContainAudioNative(p0);
    }
    public static native boolean IsAVClipContainAudioNative(Minecraft$KSAVClip p0);
    public static boolean IsClearMainTrack(MutableTimeline p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MinecraftUtils.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MinecraftUtils.IsClearMainTrackNative(p0);
    }
    public static native boolean IsClearMainTrackNative(MutableTimeline p0);
    public static boolean MakeupCloselyAdjacentTrackWhileRecalculateDuration(MutableTrack p0,ArrayList p1,ArrayList p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, MinecraftUtils.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MinecraftUtils.MakeupCloselyAdjacentTrackWhileRecalculateDurationNative(p0, p1, p2);
    }
    public static native boolean MakeupCloselyAdjacentTrackWhileRecalculateDurationNative(MutableTrack p0,ArrayList p1,ArrayList p2);
    public static int OpenAudioVideoClip(Minecraft$KSAVClip p0,EditorSdk2$ProbedFile p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, MinecraftUtils.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return MinecraftUtils.OpenAudioVideoClipNative(p0, p1);
    }
    public static native int OpenAudioVideoClipNative(Minecraft$KSAVClip p0,EditorSdk2$ProbedFile p1);
    public static long ParseMinecraftID(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MinecraftUtils.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return MinecraftUtils.nativeParseMinecraftID(p0);
    }
    public static boolean SetPathOfAVClip(Minecraft$KSAVClip p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, MinecraftUtils.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MinecraftUtils.SetPathOfAVClipNative(p0, p1);
    }
    public static native boolean SetPathOfAVClipNative(Minecraft$KSAVClip p0,String p1);
    public static boolean SortMergeDeletedRangesOnTimeline(MutableTimeline p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MinecraftUtils.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MinecraftUtils.SortMergeDeletedRangesOnTimelineNative(p0);
    }
    public static native boolean SortMergeDeletedRangesOnTimelineNative(MutableTimeline p0);
    public static boolean TransitionTypeHasOverlayDuration(int p0){
       MinecraftUtils minecraftUti = MinecraftUtils.class;
       if (PatchProxy.isSupport(minecraftUti)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, minecraftUti, "22");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return MinecraftUtils.TransitionTypeHasOverlayDurationNative(p0);
    }
    public static native boolean TransitionTypeHasOverlayDurationNative(int p0);
    public static native long nativeParseMinecraftID(String p0);
}
