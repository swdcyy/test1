package com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.editorsdk2.model.ModelBase;
import com.kwai.video.minecraft.model.MutableTimeline;
import com.kwai.video.minecraft.model.MutableTrack;
import java.util.ArrayList;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$VideoEditorProjectPrivate;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import com.kwai.video.minecraft.model.EditorSdk2V2$AnimatedSubAsset;
import java.lang.Integer;
import java.lang.Number;
import com.kwai.video.minecraft.model.nano.Minecraft$ColorFilterParam;
import java.util.Iterator;
import com.kwai.video.minecraft.model.MutableClip;
import com.kwai.video.minecraft.model.MinecraftModelDefine$ClipType;
import com.kwai.video.minecraft.MinecraftUtils;
import com.kwai.video.minecraft.model.MutableEffect;
import com.kwai.video.minecraft.model.ErrorStatus;
import com.kwai.video.minecraft.model.MutableItem;
import com.kwai.video.editorsdk2.logger.EditorSdkLogger;
import com.kwai.video.minecraft.model.EditorSdk2V2$AudioAsset;
import com.kwai.video.minecraft.model.nano.Minecraft$BeautyFilterParam;
import java.lang.Boolean;
import com.kwai.video.minecraft.model.nano.Minecraft$TimelineConfig;
import com.kwai.video.minecraft.model.nano.Minecraft$KSCompTextClip;
import com.kwai.video.minecraft.model.TimeRange;
import com.kwai.video.minecraft.model.RationalTime;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$TimeRange;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import com.kwai.video.minecraft.model.nano.Minecraft$KSTextClip;
import com.kwai.video.minecraft.model.nano.Minecraft$TemplateClip;
import com.kwai.video.minecraft.model.nano.Minecraft$KSAVClip;
import com.kwai.video.minecraft.model.nano.Minecraft$CropOptions;
import com.kwai.video.minecraft.model.nano.Minecraft$AssetTransform;
import com.kwai.video.minecraft.model.Effect;
import com.kwai.video.minecraft.model.nano.Minecraft$PaddingAreaOptions;
import java.lang.System;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject$PhotoMovieAlignTrackAssetsAndAnimatedSubAssetsResult;
import com.kwai.video.minecraft.model.nano.Minecraft$LegacyAE2Effect;
import com.kwai.video.minecraft.model.nano.Minecraft$Range;
import java.lang.StringBuilder;
import com.kwai.video.minecraft.model.EditorSdk2V2$TimeRangeV2;
import com.kwai.video.minecraft.model.nano.Minecraft$EnhanceFilterParam;
import com.kwai.video.minecraft.model.nano.Minecraft$ExternalFilterEffect;
import com.kwai.video.minecraft.model.nano.Minecraft$MagicTouchEffectParam;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import java.util.HashSet;
import java.util.Set;
import com.kwai.video.minecraft.model.nano.Minecraft$TransitionParam;
import com.kwai.video.minecraft.model.nano.Minecraft$Color;
import com.kwai.video.minecraft.model.nano.Minecraft$TimeEffectParam;
import com.kwai.video.minecraft.model.EditorSdk2V2$1;
import java.lang.Math;
import java.lang.Double;
import com.kwai.video.minecraft.model.MutableMediaReference;
import com.kwai.video.minecraft.model.EditorSdk2V2$TimeRangeImpl;
import com.kwai.video.editorsdk2.model.MutableArray;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import com.kwai.video.minecraft.model.Timeline$FontResolveHandler;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject$1;
import java.util.Comparator;
import java.util.Collections;
import java.lang.Long;
import com.kwai.video.minecraft.model.nano.Minecraft$TextEffect;
import com.kwai.video.minecraft.model.nano.Minecraft$MagicTouchOverall;
import com.kwai.video.minecraft.model.nano.Minecraft$TouchEffectParam;
import com.kwai.video.minecraft.model.nano.Minecraft$VESharpenFilterParam;
import com.kwai.video.minecraft.model.nano.Minecraft$VisualEffectParam;
import com.kwai.video.minecraft.model.ModelBase;
import com.kwai.video.minecraft.model.nano.Minecraft$AudioFilterParam;

public final class EditorSdk2V2$VideoEditorProject extends ModelBase	// class@0009f7
{
    public ArrayList mAnimatedSubAssetsHolder;
    public ArrayList mAudioAssetsHolder;
    public boolean mBlurPaddingArea;
    public Minecraft$ColorFilterParam mColorFilter;
    public ArrayList mCompTextClips;
    public boolean mDisableSubtitleAttributeOverride;
    public boolean mDisableSubtitleAutoWrap;
    public Minecraft$ColorFilterParam mEnhanceColorFilter;
    public boolean mIsKYMVTemplate;
    public boolean mIsKwaiPhotoMovie;
    public boolean mIsOnlyWrapTimeline;
    public boolean mIsTemplateMainTrack;
    public ArrayList mLegacyAE2Effects;
    public MutableTrack mMainTrack;
    public ArrayList mMoreLegacyAE2EffectsArray;
    public int mMuteFlags;
    public EditorSdk2$VideoEditorProjectPrivate mProjectPrivate;
    public double mSubtitleRangeRatio;
    public ArrayList mTextClips;
    public Minecraft$TextEffect mTextEffect;
    public MutableTimeline mTimeline;
    public ArrayList mTrackAssetsHolder;

    public void EditorSdk2V2$VideoEditorProject(){
       super();
       this.mTimeline = new MutableTimeline();
       this.mMainTrack = new MutableTrack();
       this.mIsTemplateMainTrack = false;
       this.mTrackAssetsHolder = new ArrayList();
       this.mAudioAssetsHolder = new ArrayList();
       this.mAnimatedSubAssetsHolder = new ArrayList();
       this.mProjectPrivate = new EditorSdk2$VideoEditorProjectPrivate();
    }
    public void EditorSdk2V2$VideoEditorProject(MutableTimeline p0){
       super(p0, false);
    }
    public void EditorSdk2V2$VideoEditorProject(MutableTimeline p0,boolean p1){
       super();
       this.mTimeline = p0;
       this.mIsTemplateMainTrack = true;
       MutableTrack templateTrac = EditorSdk2UtilsV2.getTemplateTrackFromTimeline(p0);
       this.mMainTrack = templateTrac;
       if (templateTrac == null) {
          this.mMainTrack = new MutableTrack();
          this.mIsTemplateMainTrack = false;
       }
       this.mTrackAssetsHolder = new ArrayList();
       this.mAudioAssetsHolder = new ArrayList();
       this.mAnimatedSubAssetsHolder = new ArrayList();
       this.mProjectPrivate = new EditorSdk2$VideoEditorProjectPrivate();
       this.mIsOnlyWrapTimeline = p1;
       return;
    }
    public static EditorSdk2V2$VideoEditorProject parseFrom(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditorSdk2V2$VideoEditorProject.class, "90");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new EditorSdk2V2$VideoEditorProject(MutableTimeline.parseFrom(p0));
    }
    public ImmutableArray animatedSubAssets(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2V2$VideoEditorProject.class, "77");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ImmutableArray(this.mAnimatedSubAssetsHolder, EditorSdk2V2$AnimatedSubAsset.class);
    }
    public EditorSdk2V2$AnimatedSubAsset animatedSubAssets(int p0){
       EditorSdk2V2$VideoEditorProject videoEditorP = EditorSdk2V2$VideoEditorProject.class;
       if (PatchProxy.isSupport(videoEditorP)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, videoEditorP, "81");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.mAnimatedSubAssetsHolder.get(p0);
    }
    public void animatedSubAssetsSetItem(int p0,EditorSdk2V2$AnimatedSubAsset p1){
       EditorSdk2V2$VideoEditorProject videoEditorP = EditorSdk2V2$VideoEditorProject.class;
       if (PatchProxy.isSupport(videoEditorP) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, videoEditorP, "82")) {
          return;
       }
       this.mAnimatedSubAssetsHolder.set(p0, p1);
       return;
    }
    public int animatedSubAssetsSize(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2V2$VideoEditorProject.class, "80");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mAnimatedSubAssetsHolder.size();
    }
    public final void applyProjectColorFilterOnMainTrack(MutableTrack p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$VideoEditorProject.class, "7")) {
          return;
       }
       EditorSdk2V2$VideoEditorProject tmColorFilte = this.mColorFilter;
       if (tmColorFilte != null && tmColorFilte.type()) {
          Iterator iterator = p0.getMutableClips().iterator();
          while (iterator.hasNext()) {
             MutableClip mutableClip = iterator.next();
             if (mutableClip.getClipType() == MinecraftModelDefine$ClipType.ClipType_KSAVClip || mutableClip.getClipType() == MinecraftModelDefine$ClipType.ClipType_TemplateClip) {
                Minecraft$ColorFilterParam uColorFilter = this.mColorFilter.clone();
                uColorFilter.setEffectId(MinecraftUtils.GetMinecraftID());
                ErrorStatus uErrorStatus = new ErrorStatus();
                if (!MinecraftUtils.InsertOrUpdateOrDeleteEffectIntoItem(uColorFilter, null, null, mutableClip, uErrorStatus)) {
                   Object[] objArray = new Object[]{uColorFilter.effectId(),uErrorStatus.description()};
                   EditorSdkLogger.e(String.format("[KSEVideoEditorProjectV2][applyProjectColorFilterOnMainTrack] fail effectId:%s desc:%s", objArray));
                }
             }
          }
       }
       return;
    }
    public final void applyProjectEnhanceColorFilterOnMainTrack(MutableTrack p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$VideoEditorProject.class, "6")) {
          return;
       }
       EditorSdk2V2$VideoEditorProject tmEnhanceCol = this.mEnhanceColorFilter;
       if (tmEnhanceCol != null && tmEnhanceCol.type()) {
          Iterator iterator = p0.getMutableClips().iterator();
          while (iterator.hasNext()) {
             MutableClip mutableClip = iterator.next();
             if (mutableClip.getClipType() == MinecraftModelDefine$ClipType.ClipType_KSAVClip || mutableClip.getClipType() == MinecraftModelDefine$ClipType.ClipType_TemplateClip) {
                Minecraft$ColorFilterParam uColorFilter = this.mEnhanceColorFilter.clone();
                uColorFilter.setEffectId(MinecraftUtils.GetMinecraftID());
                ErrorStatus uErrorStatus = new ErrorStatus();
                if (!MinecraftUtils.InsertOrUpdateOrDeleteEffectIntoItem(uColorFilter, null, null, mutableClip, uErrorStatus)) {
                   Object[] objArray = new Object[]{uColorFilter.effectId(),uErrorStatus.description()};
                   EditorSdkLogger.e(String.format("[KSEVideoEditorProjectV2][applyProjectEnhanceColorFilterOnMainTrack] fail effectId:%s desc:%s", objArray));
                }
             }
          }
       }
       return;
    }
    public ImmutableArray audioAssets(){
       Object[] objArray = null;
       EditorSdk2V2$VideoEditorProject obj = PatchProxy.apply(objArray, this, EditorSdk2V2$VideoEditorProject.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mAudioAssetsHolder;
       if (obj == null) {
          return objArray;
       }
       return new ImmutableArray(obj, EditorSdk2V2$AudioAsset.class);
    }
    public EditorSdk2V2$AudioAsset audioAssets(int p0){
       EditorSdk2V2$VideoEditorProject videoEditorP = EditorSdk2V2$VideoEditorProject.class;
       if (PatchProxy.isSupport(videoEditorP)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, videoEditorP, "35");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       videoEditorP = this.mAudioAssetsHolder;
       if (videoEditorP == null) {
          return null;
       }else {
          return videoEditorP.get(p0);
       }
    }
    public void audioAssetsSetItem(int p0,EditorSdk2V2$AudioAsset p1){
       EditorSdk2V2$VideoEditorProject videoEditorP = EditorSdk2V2$VideoEditorProject.class;
       if (PatchProxy.isSupport(videoEditorP) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, videoEditorP, "36")) {
          return;
       }
       videoEditorP = this.mAudioAssetsHolder;
       if (videoEditorP == null) {
          return;
       }
       videoEditorP.set(p0, p1);
       return;
    }
    public int audioAssetsSize(){
       EditorSdk2V2$VideoEditorProject obj = PatchProxy.apply(null, this, EditorSdk2V2$VideoEditorProject.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mAudioAssetsHolder;
       if (obj == null) {
          return 0;
       }
       return obj.size();
    }
    public Minecraft$BeautyFilterParam beautyFilter(){
       Object[] objArray = null;
       ArrayList obj = PatchProxy.apply(objArray, this, EditorSdk2V2$VideoEditorProject.class, "55");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = MinecraftUtils.FilterEffects(this.mTimeline.effects().getArrayList(), Minecraft$BeautyFilterParam.class, objArray);
       if (obj.size() > 1) {
          EditorSdkLogger.e("[VideoEditorProject][beautyFilter] count > 1");
          return objArray;
       }else if(!obj.isEmpty()){
          return obj.get(0);
       }else {
          return objArray;
       }
    }
    public boolean blurPaddingArea(){
       return this.mBlurPaddingArea;
    }
    public boolean cleanMainTrackMode(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2V2$VideoEditorProject.class, "89");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.getTemplateTimeline() == null || (this.getTemplateTimeline().timelineConfig() == null || this.getTemplateTimeline().timelineConfig().renderMode() != b)) {
          b = false;
       }
       return b;
    }
    public final void clearAndUpdateCompTextClipsToTimeline(MutableTimeline p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$VideoEditorProject.class, "10")) {
          return;
       }
       EditorSdk2V2$VideoEditorProject tmCompTextCl = this.mCompTextClips;
       if (tmCompTextCl != null && tmCompTextCl.size() > 0) {
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = this.mCompTextClips.iterator();
          while (iterator.hasNext()) {
             Minecraft$KSCompTextClip kSCompTextCl = iterator.next();
             EditorSdk2$TimeRange timeRange = EditorSdk2Utils.createTimeRange(kSCompTextCl.sourceRange().startTime().value(), kSCompTextCl.sourceRange().duration().value());
             if (timeRange.duration() - 0x3ec5d867c3ece2a5 < 0) {
                EditorSdkLogger.e("[KSEVideoEditorProjectV2][clearAndUpdateCompTextClipsToTimeline] compTextClip invalid display_range");
             }else {
                MutableTrack mutableTrack = this.fetchSuitableTrackforNextDisplayRange(uArrayList, timeRange);
                if (mutableTrack == null) {
                   mutableTrack = new MutableTrack();
                   uArrayList.add(mutableTrack);
                }
                if (!MinecraftUtils.AppendClipToTrack(mutableTrack, kSCompTextCl, timeRange)) {
                   EditorSdkLogger.e("[KSEVideoEditorProjectV2][clearAndUpdateCompTextClipsToTimeline] AppendClipToTrackWithDisplayRange fail");
                }
             }
          }
          Iterator iterator1 = uArrayList.iterator();
          while (iterator1.hasNext()) {
             p0.appendTrack(iterator1.next(), null);
             if (!p0) {
                EditorSdkLogger.e("[KSEVideoEditorProjectV2][clearAndUpdateCompTextClipsToTimeline] append sub track fail");
             }
          }
          EditorSdkLogger.i("[KSEVideoEditorProjectV2][clearAndUpdateCompTextClipsToTimeline] done");
       }
       return;
    }
    public final void clearAndUpdateTextClipsToTimeline(MutableTimeline p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$VideoEditorProject.class, "9")) {
          return;
       }
       EditorSdk2V2$VideoEditorProject tmTextClips = this.mTextClips;
       if (tmTextClips != null && tmTextClips.size() > 0) {
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = this.mTextClips.iterator();
          while (iterator.hasNext()) {
             Minecraft$KSTextClip kSTextClip = iterator.next();
             EditorSdk2$TimeRange timeRange = EditorSdk2Utils.createTimeRange(kSTextClip.sourceRange().startTime().value(), kSTextClip.sourceRange().duration().value());
             if (timeRange.duration() - 0x3ec5d867c3ece2a5 < 0) {
                EditorSdkLogger.e("[KSEVideoEditorProjectV2][clearAndUpdateTextClipsToTimeline] textClip invalid display_range");
             }else {
                MutableTrack mutableTrack = this.fetchSuitableTrackforNextDisplayRange(uArrayList, timeRange);
                if (mutableTrack == null) {
                   mutableTrack = new MutableTrack();
                   uArrayList.add(mutableTrack);
                }
                if (!MinecraftUtils.AppendClipToTrack(mutableTrack, kSTextClip, timeRange)) {
                   EditorSdkLogger.e("[KSEVideoEditorProjectV2][clearAndUpdateTextClipsToTimeline] AppendClipToTrackWithDisplayRange fail");
                }
             }
          }
          Iterator iterator1 = uArrayList.iterator();
          while (iterator1.hasNext()) {
             p0.appendTrack(iterator1.next(), null);
             if (!p0) {
                EditorSdkLogger.e("[KSEVideoEditorProjectV2][clearAndUpdateTextClipsToTimeline] append sub track fail");
             }
          }
          p0.timelineConfig().setDisableSubtitleAutoWrap(this.mDisableSubtitleAutoWrap);
          p0.timelineConfig().setSubtitleRangeRatio(this.mSubtitleRangeRatio);
          p0.timelineConfig().setDisableSubtitleAttributeOverride(this.mDisableSubtitleAttributeOverride);
          EditorSdkLogger.i("[KSEVideoEditorProjectV2][clearAndUpdateTextClips] done");
       }
       return;
    }
    public EditorSdk2V2$VideoEditorProject clone(){
       Minecraft$ColorFilterParam uColorFilter;
       ArrayList uArrayList;
       Object[] objArray = null;
       EditorSdk2V2$VideoEditorProject obj = PatchProxy.apply(objArray, this, EditorSdk2V2$VideoEditorProject.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mIsOnlyWrapTimeline != null) {
          return new EditorSdk2V2$VideoEditorProject(this.mTimeline.clone(), true);
       }
       obj = new EditorSdk2V2$VideoEditorProject();
       obj.mTimeline = this.mTimeline.clone();
       EditorSdk2V2$VideoEditorProject tmTrackAsset = this.mTrackAssetsHolder;
       Object[] objArray1 = (tmTrackAsset == null)? objArray: tmTrackAsset.clone();
       obj.mTrackAssetsHolder = objArray1;
       if (this.mAudioAssetsHolder == null) {
          obj.mAudioAssetsHolder = objArray;
       }else {
          obj.mAudioAssetsHolder = new ArrayList();
          Iterator iterator = this.mAudioAssetsHolder.iterator();
          while (iterator.hasNext()) {
             obj.mAudioAssetsHolder.add(iterator.next().clone());
          }
       }
       tmTrackAsset = this.mAnimatedSubAssetsHolder;
       objArray1 = (tmTrackAsset == null)? objArray: tmTrackAsset.clone();
       obj.mAnimatedSubAssetsHolder = objArray1;
       tmTrackAsset = this.mLegacyAE2Effects;
       objArray1 = (tmTrackAsset == null)? objArray: tmTrackAsset.clone();
       obj.mLegacyAE2Effects = objArray1;
       tmTrackAsset = this.mMoreLegacyAE2EffectsArray;
       objArray1 = (tmTrackAsset == null)? objArray: tmTrackAsset.clone();
       obj.mMoreLegacyAE2EffectsArray = objArray1;
       tmTrackAsset = this.mTextClips;
       objArray1 = (tmTrackAsset == null)? objArray: tmTrackAsset.clone();
       obj.mTextClips = objArray1;
       tmTrackAsset = this.mCompTextClips;
       objArray1 = (tmTrackAsset == null)? objArray: tmTrackAsset.clone();
       obj.mCompTextClips = objArray1;
       tmTrackAsset = this.mColorFilter;
       objArray1 = (tmTrackAsset == null)? objArray: tmTrackAsset.clone();
       obj.mColorFilter = objArray1;
       tmTrackAsset = this.mEnhanceColorFilter;
       objArray1 = (tmTrackAsset == null)? objArray: tmTrackAsset.clone();
       obj.mEnhanceColorFilter = objArray1;
       tmTrackAsset = this.mProjectPrivate;
       if (tmTrackAsset != null) {
          objArray = tmTrackAsset.clone();
       }
       obj.mProjectPrivate = objArray;
       obj.mMuteFlags = this.mMuteFlags;
       obj.mIsKwaiPhotoMovie = this.mIsKwaiPhotoMovie;
       obj.mIsKYMVTemplate = this.mIsKYMVTemplate;
       obj.mBlurPaddingArea = this.mBlurPaddingArea;
       EditorSdk2V2$VideoEditorProject tmIsTemplate = this.mIsTemplateMainTrack;
       obj.mIsTemplateMainTrack = tmIsTemplate;
       obj.mDisableSubtitleAutoWrap = this.mDisableSubtitleAutoWrap;
       obj.mSubtitleRangeRatio = this.mSubtitleRangeRatio;
       obj.mTextEffect = this.mTextEffect;
       obj.mDisableSubtitleAttributeOverride = this.mDisableSubtitleAttributeOverride;
       obj.mMainTrack = (tmIsTemplate != null)? EditorSdk2UtilsV2.getTemplateTrackFromTimeline(obj.getTemplateTimeline()): this.mMainTrack.clone();
       return obj;
    }
    public Object clone(){
       return this.clone();
    }
    public Minecraft$ColorFilterParam colorFilter(){
       return this.mColorFilter;
    }
    public ArrayList compTextClips(){
       return this.mCompTextClips;
    }
    public float compositionFrameRate(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2V2$VideoEditorProject.class, "88");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return MinecraftUtils.GetTimelineFrameRate(this.mTimeline);
    }
    public final void configTemplateIfNeeded(MutableTimeline p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$VideoEditorProject.class, "14")) {
          return;
       }
       if (p0 == null) {
          EditorSdkLogger.d("[EditorSdk2V2][configTemplateIfNeeded] timeline is null!");
          return;
       }else {
          Minecraft$TemplateClip templateClip = EditorSdk2UtilsV2.getTemplateClipFromTimeline(p0);
          if (templateClip == null) {
             EditorSdkLogger.d("[EditorSdk2V2][configTemplateIfNeeded] templateClip is null!");
             return;
          }else if(templateClip.templateType() != 3 && (templateClip.templateType() && (templateClip.templateType() != 5 && (templateClip.templateType() == 2 || (templateClip.templateType() == 1 && templateClip.irreplaceableClipsSize() > 0))))){
             int i = 0;
             Minecraft$KSAVClip kSAVClip = templateClip.irreplaceableClips(i);
             if (this.mIsKYMVTemplate == null) {
                if (kSAVClip.cropOptions() != null) {
                   templateClip.setCropOptions(kSAVClip.cropOptions().clone());
                   kSAVClip.setCropOptions(null);
                }
                if (kSAVClip.assetTransform() != null) {
                   templateClip.setAssetTransform(kSAVClip.assetTransform().clone());
                   kSAVClip.setAssetTransform(null);
                }
             }
             templateClip.setAssetTransformFlag(kSAVClip.assetTransformFlag());
             kSAVClip.setAssetTransformFlag(i);
             templateClip.setPositioningMethod(kSAVClip.positioningMethod());
             kSAVClip.setPositioningMethod(i);
             while (i < kSAVClip.effects().size()) {
                Effect uEffect = kSAVClip.effects().get(i);
                if (uEffect.getClass() == Minecraft$PaddingAreaOptions.class) {
                   MinecraftUtils.InsertOrUpdateOrDeleteEffectIntoItem(uEffect.clone(), null, null, templateClip, null);
                   MinecraftUtils.InsertOrUpdateOrDeleteEffectIntoItem(null, null, uEffect.effectId(), kSAVClip, null);
                }
                i = i + 1;
             }
             Iterator iterator = kSAVClip.mutableEffects().iterator();
             while (iterator.hasNext()) {
                MutableEffect mutableEffec = iterator.next();
                if (mutableEffec != null) {
                   templateClip.appendEffect(mutableEffec, null);
                }
             }
             kSAVClip.clearAllEffects();
          }
          return;
       }
    }
    public MutableTimeline constructTimelineBone(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2V2$VideoEditorProject.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.constructTimelineBone(true);
    }
    public MutableTimeline constructTimelineBone(boolean p0){
       Object[] obj;
       MutableTrack templateTrac;
       Iterator iterator1;
       Minecraft$LegacyAE2Effect legacyAE2Eff;
       EditorSdk2V2$VideoEditorProject videoEditorP = EditorSdk2V2$VideoEditorProject.class;
       if (PatchProxy.isSupport(videoEditorP)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, videoEditorP, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.mIsOnlyWrapTimeline != null) {
          return this.mTimeline;
       }else {
          long l = System.currentTimeMillis();
          EditorSdk2V2$VideoEditorProject tmTrackAsset = this.mTrackAssetsHolder;
          ArrayList uArrayList = this.filterRenderTypeSticker(this.mAnimatedSubAssetsHolder);
          if (this.isKwaiPhotoMovie() && p0) {
             EditorSdk2V2$VideoEditorProject$PhotoMovieAlignTrackAssetsAndAnimatedSubAssetsResult videoEditorP1 = this.photoMovieAlignTrackAssetsAndAnimatedSubAssets(tmTrackAsset, uArrayList);
             tmTrackAsset = videoEditorP1.outTrackAssets;
             uArrayList = videoEditorP1.outAnimatedSubAssets;
             if (videoEditorP1.ret == null) {
                EditorSdkLogger.e("[KSEVideoEditorProjectV2][constructTimelineBone] photoMovieAlignTrackAssets fail");
                return this.mTimeline.clone();
             }
          }
          MutableTimeline mutableTimel = this.mTimeline.clone();
          boolean b = MinecraftUtils.IsClearMainTrack(this.mTimeline);
          Object[] objArray = new Object[]{Boolean.valueOf(b)};
          EditorSdkLogger.i(String.format("[KSEVideoEditorProjectV2][constructTimelineBone] isClearMainTrack %b", objArray));
          if (!b) {
             templateTrac = (this.mIsTemplateMainTrack != null)? EditorSdk2UtilsV2.getTemplateTrackFromTimeline(mutableTimel): this.mMainTrack.clone();
             if (!this.mainTrackForTrackAssets(mutableTimel, templateTrac, tmTrackAsset)) {
                return mutableTimel;
             }else {
                this.applyProjectEnhanceColorFilterOnMainTrack(templateTrac);
                this.applyProjectColorFilterOnMainTrack(templateTrac);
             }
          }else {
             templateTrac = null;
          }
          ArrayList uArrayList1 = this.tracksForAnimatedSubAssets(uArrayList);
          if (uArrayList1 == null) {
             return mutableTimel;
          }else {
             uArrayList = this.tracksForAudioAssets();
             if (uArrayList == null) {
                return mutableTimel;
             }else {
                this.updateTimelineOriginAudioClipByAudioAssets(mutableTimel);
                if (!mutableTimel.projectWidth() && !mutableTimel.projectHeight()) {
                   mutableTimel.setProjectResolutionWidthsetProjectResolutionWidth(EditorSdk2UtilsV2.getComputedWidth(this), EditorSdk2UtilsV2.getComputedHeight(this));
                }
                if (!MinecraftUtils.SortMergeDeletedRangesOnTimeline(mutableTimel)) {
                   EditorSdkLogger.e("[KSEVideoEditorProjectV2][constructTimelineBone] SortMergeDeletedRangesOnTimeline fail");
                   return mutableTimel;
                }else {
                   ErrorStatus uErrorStatus = new ErrorStatus();
                   if (!b && this.mIsTemplateMainTrack == null) {
                      mutableTimel.appendTrack(templateTrac, uErrorStatus);
                      if (mutableTimel == null) {
                         obj = new Object[]{uErrorStatus.description()};
                         EditorSdkLogger.e(String.format("[KSEVideoEditorProjectV2][constructTimelineBone] append main track fail:%s", obj));
                         return mutableTimel;
                      }
                   }
                   Iterator iterator = uArrayList1.iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         mutableTimel.appendTrack(iterator.next(), uErrorStatus);
                         if (mutableTimel == null) {
                            obj = new Object[]{uErrorStatus.description()};
                            EditorSdkLogger.e(String.format("[KSEVideoEditorProjectV2][constructTimelineBone] append sub track fail:%s", obj));
                            return mutableTimel;
                         }
                      }else {
                         iterator = uArrayList.iterator();
                         while (true) {
                            if (iterator.hasNext()) {
                               mutableTimel.appendTrack(iterator.next(), uErrorStatus);
                               if (mutableTimel == null) {
                                  obj = new Object[]{uErrorStatus.description()};
                                  EditorSdkLogger.e(String.format("[KSEVideoEditorProjectV2][constructTimelineBone] append audio track fail:%s", obj));
                                  return mutableTimel;
                               }else {
                                  continue ;
                               }
                            }else {
                               uArrayList1 = new ArrayList();
                               EditorSdk2V2$VideoEditorProject tmLegacyAE2E = this.mLegacyAE2Effects;
                               if (tmLegacyAE2E != null) {
                                  iterator1 = tmLegacyAE2E.iterator();
                                  while (iterator1.hasNext()) {
                                     legacyAE2Eff = iterator1.next();
                                     if (legacyAE2Eff.assetTimeRange() != null && legacyAE2Eff.assetTimeRange().duration() - 0x3ee0624dd2f1a9fc > 0) {
                                        uArrayList1.add(legacyAE2Eff);
                                     }else {
                                        continue ;
                                     }
                                  }
                               }
                               if (!MinecraftUtils.ApplyOverlappedLegacyAE2EffectsOnTimeline(mutableTimel, uArrayList1)) {
                                  EditorSdkLogger.e("[KSEVideoEditorProjectV2][constructTimelineBone] ApplyOverlappedLegacyAE2EffectsOnTimeline fail");
                                  return mutableTimel;
                               }else {
                                  tmTrackAsset = this.mMoreLegacyAE2EffectsArray;
                                  if (tmTrackAsset != null) {
                                     iterator = tmTrackAsset.iterator();
                                     while (true) {
                                        if (iterator.hasNext()) {
                                           uArrayList = iterator.next();
                                           if (uArrayList != null) {
                                              iterator1 = uArrayList.iterator();
                                              while (true) {
                                                 if (iterator1.hasNext()) {
                                                    legacyAE2Eff = iterator1.next();
                                                    if (legacyAE2Eff != null) {
                                                       MinecraftUtils.FillEffectFields(legacyAE2Eff);
                                                       mutableTimel.appendEffect(legacyAE2Eff, uErrorStatus);
                                                       if (mutableTimel == null) {
                                                          obj = new Object[]{uErrorStatus.description()};
                                                          EditorSdkLogger.e(String.format("[KSEVideoEditorProjectV2][constructTimelineBone] apply moreAE2Effect fail:%s", obj));
                                                          return mutableTimel;
                                                       }else {
                                                          continue ;
                                                       }
                                                    }else {
                                                       EditorSdkLogger.e("[KSEVideoEditorProjectV2][constructTimelineBone] moreAE2Effect is null!");
                                                       continue ;
                                                    }
                                                 }else {
                                                    continue ;
                                                 }
                                              }
                                           }else {
                                              continue ;
                                           }
                                        }
                                     }
                                  }
                                  tmTrackAsset = this.mTextEffect;
                                  if (tmTrackAsset != null) {
                                     mutableTimel.appendEffect(tmTrackAsset, uErrorStatus);
                                     if (mutableTimel == null) {
                                        Object[] objArray1 = new Object[]{uErrorStatus.description()};
                                        EditorSdkLogger.e(String.format("[KSEVideoEditorProjectV2][constructTimelineBone] apply textEffect fail:%s", objArray1));
                                        return null;
                                     }
                                  }
                                  break ;
                               }
                            }
                         }
                         this.clearAndUpdateTextClipsToTimeline(mutableTimel);
                         this.clearAndUpdateCompTextClipsToTimeline(mutableTimel);
                         EditorSdkLogger.e("constructTimeline cost : "+(System.currentTimeMillis() - l));
                         return mutableTimel;
                      }
                   }
                }
             }
          }
       }
    }
    public int decoderTickMethod(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2V2$VideoEditorProject.class, "85");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mTimeline.timelineConfig().decoderTickMethod();
    }
    public ImmutableArray deletedRanges(){
       ArrayList obj = PatchProxy.apply(null, this, EditorSdk2V2$VideoEditorProject.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = this.mTimeline.deletedRanges().iterator();
       while (iterator.hasNext()) {
          obj.add(MinecraftUtils.CreateEditorTimeRangeV2FromMinecraft(iterator.next()));
       }
       return new ImmutableArray(obj, EditorSdk2V2$TimeRangeV2.class);
    }
    public EditorSdk2$TimeRange deletedRanges(int p0){
       EditorSdk2V2$VideoEditorProject videoEditorP = EditorSdk2V2$VideoEditorProject.class;
       if (PatchProxy.isSupport(videoEditorP)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, videoEditorP, "41");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return MinecraftUtils.CreateEditorTimeRangeFromMinecraft(this.mTimeline.deletedRanges().get(p0));
    }
    public void deletedRangesSetItem(int p0,EditorSdk2$TimeRange p1){
       EditorSdk2V2$VideoEditorProject videoEditorP = EditorSdk2V2$VideoEditorProject.class;
       if (PatchProxy.isSupport(videoEditorP) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, videoEditorP, "42")) {
          return;
       }
       ArrayList arrayList = this.mTimeline.deletedRanges().getArrayList();
       arrayList.set(p0, MinecraftUtils.CreateMinecraftTimeRangeFromEditor(p1));
       this.mTimeline.setDeletedRanges(new ImmutableArray(arrayList, TimeRange.class));
       return;
    }
    public int deletedRangesSize(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2V2$VideoEditorProject.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mTimeline.deletedRanges().size();
    }
    public Minecraft$ColorFilterParam enhanceColorFilter(){
       return this.mEnhanceColorFilter;
    }
    public Minecraft$EnhanceFilterParam enhanceFilter(){
       Object[] objArray = null;
       ArrayList obj = PatchProxy.apply(objArray, this, EditorSdk2V2$VideoEditorProject.class, "75");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = MinecraftUtils.FilterEffects(this.mTimeline.effects().getArrayList(), Minecraft$EnhanceFilterParam.class, objArray);
       if (obj.size() > 1) {
          EditorSdkLogger.e("[VideoEditorProject][enhanceFilter] count > 1");
          return objArray;
       }else if(!obj.isEmpty()){
          return obj.get(0);
       }else {
          return objArray;
       }
    }
    public final MutableTrack fetchSuitableTrackforNextDisplayRange(ArrayList p0,EditorSdk2$TimeRange p1){
       MutableTrack obj = PatchProxy.applyTwoRefs(p0, p1, this, EditorSdk2V2$VideoEditorProject.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          MutableTrack mutableTrack = iterator.next();
          ErrorStatus uErrorStatus = new ErrorStatus();
          RationalTime rationalTime = mutableTrack.duration(uErrorStatus);
          if (rationalTime == null) {
             EditorSdkLogger.e("[KSEVideoEditorProjectV2][fetchSuitableTrack] get duration fail:"+uErrorStatus.description()+" err:"+uErrorStatus.errorCode());
          }else {
             double d = p1.start() + 0.00f;
             if (rationalTime.toSeconds() - d < 0) {
                obj = mutableTrack;
                break ;
             }
          }
       }
       return obj;
    }
    public final ArrayList filterRenderTypeSticker(ArrayList p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, EditorSdk2V2$VideoEditorProject.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          EditorSdk2V2$AnimatedSubAsset uAnimatedSub = iterator.next();
          if (uAnimatedSub.renderType() != 3) {
             obj.add(uAnimatedSub);
          }else if(uAnimatedSub.displayRange().duration() - 0x3ec5d867c3ece2a5 > 0){
             uAnimatedSub = uAnimatedSub.clone();
             ErrorStatus uErrorStatus = new ErrorStatus();
             EditorSdk2V2$AnimatedSubAsset mMainClip = uAnimatedSub.mMainClip;
             mMainClip.appendEffect(new Minecraft$ExternalFilterEffect(), uErrorStatus);
             if (mMainClip != null) {
                obj.add(uAnimatedSub);
             }else {
                Object[] objArray = new Object[]{Integer.valueOf(uErrorStatus.errorCode()),uErrorStatus.message()};
                EditorSdkLogger.e(String.format("[filterRenderTypeSticker] appendEffect fail:%d msg:%s", objArray));
             }
          }
       }
       return obj;
    }
    public MutableTimeline getTemplateTimeline(){
       return this.mTimeline;
    }
    public boolean isKwaiPhotoMovie(){
       return this.mIsKwaiPhotoMovie;
    }
    public final Minecraft$MagicTouchEffectParam magicTouchEffectParam(){
       Object[] objArray = null;
       ArrayList obj = PatchProxy.apply(objArray, this, EditorSdk2V2$VideoEditorProject.class, "63");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = MinecraftUtils.FilterEffects(this.mMainTrack.effects().getArrayList(), Minecraft$MagicTouchEffectParam.class, objArray);
       if (obj.size() > 1) {
          EditorSdkLogger.e("[VideoEditorProject][MagicTouchEffectParam] count > 1");
          return objArray;
       }else if(!obj.isEmpty()){
          return obj.get(0);
       }else {
          return objArray;
       }
    }
    public final boolean mainTrackForKYMVTemplate(MutableTimeline p0,MutableTrack p1,ArrayList p2){
       Iterator obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, EditorSdk2V2$VideoEditorProject.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = p2.iterator();
       int i = 0;
       while (obj.hasNext()) {
          EditorSdk2V2$TrackAsset trackAsset = obj.next();
          if (trackAsset.isBackgroundVideo()) {
             this.replaceKuaiShanBgTrackAsset(p0, trackAsset);
             this.configTemplateIfNeeded(p0);
          }else {
             i = i + 1;
          }
       }
       int i1 = 0;
       ErrorStatus int i2 = 1;
       while (i1 < p2.size()) {
          if (i1 != i) {
             Minecraft$KSAVClip kSAVClip = p2.get(i1).mMainClip.clone();
             int i3 = this.mMuteFlags & i2;
             if (!i3) {
                i2 = false;
             }
             kSAVClip.setMute(i2);
             i2 = null;
             if (i1 < i) {
                p1.insertClip(kSAVClip, i1, i2);
             }else {
                p1.appendClip(kSAVClip, i2);
             }
          }
          i1++;
       }
       HashSet hashSet = new HashSet();
       hashSet.add("main");
       p1.setTags(hashSet);
       return i2;
    }
    public final boolean mainTrackForTrackAssets(MutableTimeline p0,MutableTrack p1,ArrayList p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, EditorSdk2V2$VideoEditorProject.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.mIsKYMVTemplate != null) {
          return this.mainTrackForKYMVTemplate(p0, p1, p2);
       }
       if (p1 != null && (p2 == null || p2.isEmpty())) {
          EditorSdkLogger.e("[KSEVideoEditorProjectV2][mainTrackForTrackAssets] input params is null!");
          return false;
       }else {
          ArrayList uArrayList = new ArrayList();
          ArrayList uArrayList1 = new ArrayList();
          Iterator iterator = p2.iterator();
          int i = 1;
          while (iterator.hasNext()) {
             EditorSdk2V2$TrackAsset trackAsset = iterator.next();
             if (trackAsset == null) {
                continue ;
             }else if(trackAsset.isBackgroundVideo()){
                this.replaceKuaiShanBgTrackAsset(p0, trackAsset);
                this.configTemplateIfNeeded(p0);
             }else {
                Minecraft$KSAVClip kSAVClip = trackAsset.mMainClip.clone();
                Minecraft$TransitionParam trackAsset1 = (trackAsset.transitionParam() == null)? null: trackAsset.transitionParam().clone();
                if (kSAVClip != null) {
                   int i1 = this.mMuteFlags & i;
                   if (!i1) {
                      i = false;
                   }
                   kSAVClip.setMute(i);
                   uArrayList.add(kSAVClip);
                   uArrayList1.add(trackAsset1);
                }else {
                   EditorSdkLogger.e("[KSEVideoEditorProjectV2][mainTrackForTrackAssets] clip is null!");
                }
             }
          }
          if (!MinecraftUtils.MakeupCloselyAdjacentTrackWhileRecalculateDuration(p1, uArrayList, uArrayList1)) {
             EditorSdkLogger.e("[KSEVideoEditorProjectV2][mainTrack] MakeupCloselyAdjacentTrack failed!");
             return false;
          }else {
             HashSet hashSet = new HashSet();
             hashSet.add("main");
             p1.setTags(hashSet);
             return i;
          }
       }
    }
    public Minecraft$Color marginColor(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2V2$VideoEditorProject.class, "59");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mTimeline.marginColor();
    }
    public ArrayList moreOverlappedAE2Effects(){
       ArrayList uArrayList;
       EditorSdk2V2$VideoEditorProject obj = PatchProxy.apply(null, this, EditorSdk2V2$VideoEditorProject.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mMoreLegacyAE2EffectsArray;
       if (obj == null) {
          uArrayList = new ArrayList();
       }
       return uArrayList;
    }
    public ImmutableArray moreTimeEffects(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, EditorSdk2V2$VideoEditorProject.class, "50");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ImmutableArray(MinecraftUtils.FilterEffects(this.mTimeline.effects().getArrayList(), Minecraft$TimeEffectParam.class, objArray), Minecraft$TimeEffectParam.class);
    }
    public Minecraft$TimeEffectParam moreTimeEffects(int p0){
       EditorSdk2V2$VideoEditorProject videoEditorP = EditorSdk2V2$VideoEditorProject.class;
       if (PatchProxy.isSupport(videoEditorP)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, videoEditorP, "54");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 >= this.moreTimeEffectsSize() || p0 < 0) {
          return null;
       }else {
          return this.moreTimeEffects().get(p0);
       }
    }
    public int moreTimeEffectsSize(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2V2$VideoEditorProject.class, "53");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return MinecraftUtils.FilterEffects(this.mTimeline.effects().getArrayList(), Minecraft$TimeEffectParam.class, null).size();
    }
    public int muteFlags(){
       return this.mMuteFlags;
    }
    public ArrayList overlappedAE2Effects(){
       ArrayList uArrayList;
       EditorSdk2V2$VideoEditorProject obj = PatchProxy.apply(null, this, EditorSdk2V2$VideoEditorProject.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mLegacyAE2Effects;
       if (obj == null) {
          uArrayList = new ArrayList();
       }
       return uArrayList;
    }
    public Minecraft$Color paddingColor(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2V2$VideoEditorProject.class, "61");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mTimeline.paddingColor();
    }
    public final EditorSdk2V2$VideoEditorProject$PhotoMovieAlignTrackAssetsAndAnimatedSubAssetsResult photoMovieAlignTrackAssetsAndAnimatedSubAssets(ArrayList p0,ArrayList p1){
       double d3;
       double d4;
       EditorSdk2V2$AnimatedSubAsset uAnimatedSub;
       double d6;
       EditorSdk2V2$TimeRangeImpl obj = this;
       Object[] obj1 = p0;
       Object obj2 = p1;
       EditorSdk2V2$VideoEditorProject$PhotoMovieAlignTrackAssetsAndAnimatedSubAssetsResult obj3 = PatchProxy.applyTwoRefs(obj1, obj2, obj, EditorSdk2V2$VideoEditorProject.class, "12");
       if (obj3 != PatchProxyResult.class) {
          return obj3;
       }
       EditorSdk2V2$1 u1 = null;
       obj3 = new EditorSdk2V2$VideoEditorProject$PhotoMovieAlignTrackAssetsAndAnimatedSubAssetsResult(u1);
       obj3.outTrackAssets = obj1;
       obj3.outAnimatedSubAssets = obj2;
       boolean b = true;
       obj3.ret = b;
       Iterator iterator = obj.mAudioAssetsHolder.iterator();
       double d = 0;
       while (iterator.hasNext()) {
          d = Math.max(d, MinecraftUtils.CalcClipDurationAccordingToFileDurationAndClippedRange(iterator.next().mMainClip));
       }
       double d1 = 0x3f50624dd2f1a9fc;
       if (d - d1 < 0) {
          obj3.outTrackAssets = obj1;
          obj3.outAnimatedSubAssets = obj2;
          obj3.ret = b;
          return obj3;
       }else {
          ErrorStatus uErrorStatus = new ErrorStatus();
          MutableTrack mutableTrack = new MutableTrack();
          if (!obj.mainTrackForTrackAssets(u1, mutableTrack, obj1)) {
             EditorSdkLogger.e("[KSEVideoEditorProjectV2][photoMovieAlignTrackAssets] mainTrack mainTrack create failed!");
             obj3.outTrackAssets = obj1;
             obj3.outAnimatedSubAssets = obj2;
             obj3.ret = b;
             return obj3;
          }else {
             RationalTime rationalTime = mutableTrack.duration(uErrorStatus);
             int i = 0;
             if (uErrorStatus.errorCode()) {
                obj1 = new Object[b];
                obj1[i] = uErrorStatus.message();
                EditorSdkLogger.e(String.format("[KSEVideoEditorProjectV2][photoMovieAlignTrackAssetsAndAnimatedSubAssets] mainTrackForTrackAssets fail:%s", obj1));
                obj3.ret = i;
                return obj3;
             }else {
                double d2 = rationalTime.toSeconds();
                int i1 = 2;
                Object[] objArray = new Object[i1];
                objArray[i] = Double.valueOf(d2);
                objArray[b] = Double.valueOf(d);
                EditorSdkLogger.i(String.format("[KSEVideoEditorProjectV2][photoMovieAlignTrackAssets] Align video len:%.4f to audio len: %.4f", objArray));
                if (d2 - (d + d1) >= 0) {
                   EditorSdkLogger.d("[KSEVideoEditorProjectV2][photoMovieAlignTrackAssets] video length >= audio length, return directly");
                   obj3.outTrackAssets = obj1;
                   obj3.outAnimatedSubAssets = obj2;
                   obj3.ret = b;
                   return obj3;
                }else {
                   ArrayList uArrayList = p0.clone();
                   int i2 = (int)(d / d2);
                   int i3 = p0.size();
                   Object[] objArray1 = new Object[]{Double.valueOf(d2),Double.valueOf(d),Integer.valueOf((i2 - 1))};
                   EditorSdkLogger.d(String.format("LoadProject, video_len: %.4f, audio_len: %.4f, Will repeat %d times", objArray1));
                   int i4 = 1;
                   while (i4 < i2) {
                      i = 0;
                      while (i < i3) {
                         EditorSdk2V2$TrackAsset trackAsset = obj1.get(i).clone();
                         trackAsset.mMainClip.setClipId(MinecraftUtils.GetMinecraftID());
                         trackAsset.mMainClip.mutableMediaReference().setReferenceId(MinecraftUtils.GetMinecraftID());
                         uArrayList.add(trackAsset);
                         i = i + 1;
                         d1 = 0x3f50624dd2f1a9fc;
                      }
                      i4 = i4 + 1;
                      EditorSdk2V2$TrackAsset trackAsset1 = 0x3f50624dd2f1a9fc;
                   }
                   d = (i2 >= b)? d - ((double)i2 * d2): null;
                   d1 = d;
                   i1 = 0;
                   while (i1 < i3 && d1 - 0x3f50624dd2f1a9fc > 0) {
                      Object[] objArray2 = new Object[2];
                      objArray2[0] = Double.valueOf(d1);
                      objArray2[b] = Integer.valueOf(i1);
                      EditorSdkLogger.d(String.format("Add tail track with duration: %.4f, asset_index: %d", objArray2));
                      d3 = MinecraftUtils.CalcMainClipDuration(obj1.get(i1).mMainClip);
                      EditorSdk2V2$TrackAsset trackAsset2 = obj1.get(i1).clone();
                      int i5 = i3;
                      trackAsset2.mMainClip.setClipId(MinecraftUtils.GetMinecraftID());
                      trackAsset2.mMainClip.mutableMediaReference().setReferenceId(MinecraftUtils.GetMinecraftID());
                      if (d3 - d1 > 0) {
                         obj = new EditorSdk2V2$TimeRangeImpl();
                         d4 = d;
                         obj.start = 0;
                         obj.duration = d1;
                         trackAsset2.setClippedRange(obj);
                      }else {
                         d4 = d;
                         i3 = 0;
                         Minecraft$TransitionParam transitionPa = obj1.get(i1).transitionParam();
                         double d5 = (transitionPa != null && MinecraftUtils.TransitionTypeHasOverlayDuration(transitionPa.type()))? transitionPa.duration(): i3;
                         d3 = d3 - d5;
                      }
                      uArrayList.add(trackAsset2);
                      d1 = d1 - d3;
                      i1 = i1 + 1;
                      i3 = i5;
                      d = d4;
                      b = 1;
                   }
                   d4 = d;
                   ArrayList uArrayList1 = p1.clone();
                   int i6 = p1.size();
                   i1 = 1;
                   while (i1 < i2) {
                      for (i3 = 0; i3 < i6; i3 = i3 + 1) {
                         uAnimatedSub = obj2.get(i3).clone();
                         EditorSdk2V2$AnimatedSubAsset mMainClip = uAnimatedSub.mMainClip;
                         mMainClip.setAeRefId(mMainClip.clipId());
                         uAnimatedSub.mMainClip.setClipId(MinecraftUtils.GetMinecraftID());
                         uAnimatedSub.mMainClip.mutableMediaReference().setReferenceId(MinecraftUtils.GetMinecraftID());
                         EditorSdk2$TimeRange timeRange = new EditorSdk2$TimeRange();
                         d3 = (double)i1 * d2;
                         d1 = uAnimatedSub.displayRange().start() + d3;
                         timeRange.setStart(d1);
                         timeRange.setDuration(uAnimatedSub.displayRange().duration());
                         uAnimatedSub.setDisplayRange(timeRange);
                         uArrayList1.add(uAnimatedSub);
                         Object[] objArray3 = new Object[]{Double.valueOf(uAnimatedSub.displayRange().start()),Double.valueOf(d6)};
                         d6 = uAnimatedSub.displayRange().start() + uAnimatedSub.displayRange().duration();
                         EditorSdkLogger.d(String.format("Copied animated sub asset [%.4f %.4f\)", objArray3));
                      }
                      i1 = i1 + 1;
                   }
                   i1 = 0;
                   while (i1 < i6) {
                      d6 = d4 - 0x3f50624dd2f1a9fc;
                      if (obj2.get(i1).displayRange().start() - d6 < 0) {
                         EditorSdk2V2$AnimatedSubAsset uAnimatedSub1 = obj2.get(i1).clone();
                         uAnimatedSub = uAnimatedSub1.mMainClip;
                         uAnimatedSub.setAeRefId(uAnimatedSub.clipId());
                         uAnimatedSub1.mMainClip.setClipId(MinecraftUtils.GetMinecraftID());
                         uAnimatedSub1.mMainClip.mutableMediaReference().setReferenceId(MinecraftUtils.GetMinecraftID());
                         EditorSdk2$TimeRange timeRange1 = new EditorSdk2$TimeRange();
                         double d7 = (double)i2 * d2;
                         d6 = uAnimatedSub1.displayRange().start() + d7;
                         timeRange1.setStart(d6);
                         d6 = d4 - uAnimatedSub1.displayRange().start();
                         timeRange1.setDuration(Math.min(uAnimatedSub1.displayRange().duration(), d6));
                         uAnimatedSub1.setDisplayRange(timeRange1);
                         uArrayList1.add(uAnimatedSub1);
                         Object[] objArray4 = new Object[]{Double.valueOf(uAnimatedSub1.displayRange().start()),Double.valueOf(d3)};
                         d3 = uAnimatedSub1.displayRange().start() + uAnimatedSub1.displayRange().duration();
                         EditorSdkLogger.d(String.format("Copied animated sub asset [%.4f %.4f\)", objArray4));
                      }else {
                         d6 = 0;
                      }
                      i1 = i1 + 1;
                   }
                   obj3.outTrackAssets = uArrayList;
                   obj3.outAnimatedSubAssets = uArrayList1;
                   obj3.ret = true;
                   return obj3;
                }
             }
          }
       }
    }
    public int projectFpsCalculateMethod(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2V2$VideoEditorProject.class, "83");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mTimeline.timelineConfig().timelineFpsCalculateMethod();
    }
    public long projectId(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2V2$VideoEditorProject.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.mTimeline.projectId();
    }
    public int projectOutputHeight(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2V2$VideoEditorProject.class, "68");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (int)this.mTimeline.projectHeight();
    }
    public int projectOutputWidth(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2V2$VideoEditorProject.class, "66");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (int)this.mTimeline.projectWidth();
    }
    public final void replaceKuaiShanBgTrackAsset(MutableTimeline p0,EditorSdk2V2$TrackAsset p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EditorSdk2V2$VideoEditorProject.class, "13")) {
          return;
       }
       if (p0 == null || p1 == null) {
          EditorSdkLogger.d("[EditorSdk2V2][replaceKuaiShanBgTrackAsset] timeline or trackAsset is null!");
          return;
       }else {
          MutableArray mutableArray = new MutableArray(Minecraft$KSAVClip.class);
          Iterator iterator = p0.mutableIrrReplaceableClips().iterator();
          while (iterator.hasNext()) {
             Minecraft$KSAVClip kSAVClip = iterator.next();
             if (kSAVClip != null && (p1.getMainClip() != null && ((kSAVClip.clipId()).equals(p1.getMainClip().clipId()) && kSAVClip != p1.getMainClip()))) {
                mutableArray.add(p1.getMainClip().clone());
             }else {
                mutableArray.add(kSAVClip);
             }
          }
          Minecraft$TemplateClip templateClip = EditorSdk2UtilsV2.getTemplateClipFromTimeline(p0);
          if (templateClip != null) {
             templateClip.setIrreplaceableClips(mutableArray.immutableCopy());
          }
          return;
       }
    }
    public void setAnimatedSubAssets(ImmutableArray p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$VideoEditorProject.class, "78")) {
          return;
       }
       this.mAnimatedSubAssetsHolder = p0.getArrayList();
       return;
    }
    public void setAnimatedSubAssets(EditorSdk2V2$AnimatedSubAsset[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$VideoEditorProject.class, "79")) {
          return;
       }
       this.mAnimatedSubAssetsHolder = new ArrayList(Arrays.asList(p0));
       return;
    }
    public void setAudioAssets(ImmutableArray p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$VideoEditorProject.class, "32")) {
          return;
       }
       if (p0 == null) {
          this.mAudioAssetsHolder = null;
          return;
       }else {
          this.mAudioAssetsHolder = p0.getArrayList();
          return;
       }
    }
    public void setAudioAssets(EditorSdk2V2$AudioAsset[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$VideoEditorProject.class, "33")) {
          return;
       }
       if (p0 == null) {
          this.mAudioAssetsHolder = null;
          return;
       }else {
          this.mAudioAssetsHolder = new ArrayList(Arrays.asList(p0));
          return;
       }
    }
    public void setBeautyFilter(Minecraft$BeautyFilterParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$VideoEditorProject.class, "56")) {
          return;
       }
       ErrorStatus uErrorStatus = new ErrorStatus();
       Minecraft$BeautyFilterParam uBeautyFilte = this.beautyFilter();
       String str = null;
       String str1 = (uBeautyFilte == null)? str: uBeautyFilte.effectId();
       if (!MinecraftUtils.InsertOrUpdateOrDeleteEffectIntoItem(p0, str, str1, this.mTimeline, uErrorStatus)) {
          EditorSdkLogger.e("[VideoEditorProject][setBeautyFilter] failed : "+MinecraftUtils.GetEffectId(p0)+"error : "+uErrorStatus.description());
       }
       return;
    }
    public void setBlurPaddingArea(boolean p0){
       this.mBlurPaddingArea = p0;
    }
    public void setColorFilter(Minecraft$ColorFilterParam p0){
       this.mColorFilter = p0;
    }
    public void setCompTextClips(ArrayList p0){
       this.mCompTextClips = p0;
    }
    public void setDecoderTickMethod(int p0){
       EditorSdk2V2$VideoEditorProject videoEditorP = EditorSdk2V2$VideoEditorProject.class;
       if (PatchProxy.isSupport(videoEditorP) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, videoEditorP, "86")) {
          return;
       }
       this.mTimeline.timelineConfig().setDecoderTickMethod(p0);
       return;
    }
    public void setDeletedRanges(ImmutableArray p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$VideoEditorProject.class, "38")) {
          return;
       }
       this.setDeletedRanges(p0.toNormalArray());
       return;
    }
    public void setDeletedRanges(EditorSdk2$TimeRange[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$VideoEditorProject.class, "39")) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          uArrayList.add(MinecraftUtils.CreateMinecraftTimeRangeFromEditor(p0[i]));
       }
       this.mTimeline.setDeletedRanges(new ImmutableArray(uArrayList, TimeRange.class));
       return;
    }
    public void setDisableSubtitleAttributeOverride(boolean p0){
       this.mDisableSubtitleAttributeOverride = p0;
    }
    public void setDisableSubtitleAutoWrap(boolean p0){
       this.mDisableSubtitleAutoWrap = p0;
    }
    public void setEnhanceColorFilter(Minecraft$ColorFilterParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$VideoEditorProject.class, "87")) {
          return;
       }
       if (this.cleanMainTrackMode()) {
          EditorSdkLogger.i("[VideoEditorProject][setEnhanceColorFilter] cleanMainTrackMode\(spark\) not support enhanceColorFilter");
          return;
       }else if(p0 != null && !p0.type()){
          p0 = null;
       }
       this.mEnhanceColorFilter = p0;
       return;
    }
    public void setEnhanceFilter(Minecraft$EnhanceFilterParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$VideoEditorProject.class, "76")) {
          return;
       }
       ErrorStatus uErrorStatus = new ErrorStatus();
       Minecraft$EnhanceFilterParam uEnhanceFilt = this.enhanceFilter();
       String str = null;
       StringBuilder str1 = (uEnhanceFilt == null)? str: uEnhanceFilt.effectId();
       if (!MinecraftUtils.InsertOrUpdateOrDeleteEffectIntoItem(p0, str, str1, this.mTimeline, uErrorStatus)) {
          str1 = "[VideoEditorProject][setEnhanceFilter] failed : ";
          String str2 = (p0 == null)? "": p0.effectId();
          EditorSdkLogger.e(str1+str2+"error : "+uErrorStatus.description());
       }
       return;
    }
    public void setFontResolveHandler(Timeline$FontResolveHandler p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$VideoEditorProject.class, "3")) {
          return;
       }
       this.mTimeline.setFontResolveHandler(p0);
       return;
    }
    public void setIsKYMVTemplate(boolean p0){
       this.mIsKYMVTemplate = p0;
    }
    public void setIsKwaiPhotoMovie(boolean p0){
       this.mIsKwaiPhotoMovie = p0;
    }
    public void setMarginColor(Minecraft$Color p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$VideoEditorProject.class, "60")) {
          return;
       }
       this.mTimeline.setMarginColor(p0);
       return;
    }
    public void setMoreOverlappedAE2Effects(ArrayList p0){
       this.mMoreLegacyAE2EffectsArray = p0;
    }
    public void setMoreTimeEffects(ImmutableArray p0){
       Minecraft$TimeEffectParam timeEffectPa1;
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$VideoEditorProject.class, "51")) {
          return;
       }
       if (p0 != null && p0.size()) {
          ArrayList arrayList = p0.getArrayList();
          ErrorStatus uErrorStatus = new ErrorStatus();
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = arrayList.iterator();
          while (true) {
             int i = 3;
             if (iterator.hasNext()) {
                Minecraft$TimeEffectParam timeEffectPa = iterator.next();
                if (timeEffectPa.timeEffectType() == i) {
                   uArrayList.add(timeEffectPa);
                }
             }
             if (!uArrayList.isEmpty()) {
                arrayList.clear();
             }
             Collections.sort(arrayList, new EditorSdk2V2$VideoEditorProject$1(this));
             Iterator iterator1 = arrayList.iterator();
             while (iterator1.hasNext()) {
                timeEffectPa1 = iterator1.next().clone();
                int i1 = timeEffectPa1.timeEffectType();
                int i2 = 1;
                if (i1 != i2) {
                   if (i1 == -0.00f && timeEffectPa1.effectSlowSpeed() - 0x3fb999999999999a <= 0) {
                      timeEffectPa1.setEffectSlowSpeed(0x3fe0000000000000);
                   }
                }else if(timeEffectPa1.effectRepeatTimes() <= 0){
                   timeEffectPa1.setEffectRepeatTimes(i);
                }
                if (!uArrayList.isEmpty()) {
                   i1 = uArrayList.size() - i2;
                   i1 = uArrayList.size() - i2;
                   double d = uArrayList.get(i1).range().start() + uArrayList.get(i1).range().duration();
                   if (timeEffectPa1.range().start() - d < 0) {
                   }
                }
                uArrayList.add(timeEffectPa1);
             }
             iterator1 = this.moreTimeEffects().iterator();
             MutableEffect mutableEffec = null;
             while (iterator1.hasNext()) {
                timeEffectPa1 = iterator1.next();
                if (!MinecraftUtils.InsertOrUpdateOrDeleteEffectIntoItem(mutableEffec, mutableEffec, timeEffectPa1.effectId(), this.mTimeline, uErrorStatus)) {
                   EditorSdkLogger.e("[VideoEditorProject][setMoreTimeEffects] failed : "+timeEffectPa1.effectId()+"error : "+uErrorStatus.description());
                }else {
                   continue ;
                }
             }
             iterator1 = uArrayList.iterator();
             while (iterator1.hasNext()) {
                Minecraft$TimeEffectParam timeEffectPa2 = iterator1.next();
                if (!MinecraftUtils.InsertOrUpdateOrDeleteEffectIntoItem(timeEffectPa2, mutableEffec, mutableEffec, this.mTimeline, uErrorStatus)) {
                   StringBuilder str = "[VideoEditorProject][setMoreTimeEffects] failed : ";
                   String str1 = (timeEffectPa2 == null)? "": timeEffectPa2.effectId();
                   EditorSdkLogger.e(str+str1+"error : "+uErrorStatus.description());
                }else {
                   continue ;
                }
             }
          }
       }
       return;
    }
    public void setMoreTimeEffects(Minecraft$TimeEffectParam[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$VideoEditorProject.class, "52")) {
          return;
       }
       this.setMoreTimeEffects(new ImmutableArray(new ArrayList(Arrays.asList(p0)), Minecraft$TimeEffectParam.class));
       return;
    }
    public void setMuteFlags(int p0){
       this.mMuteFlags = p0;
    }
    public void setOverlappedAE2Effects(Minecraft$LegacyAE2Effect[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$VideoEditorProject.class, "21")) {
          return;
       }
       if (p0 == null) {
          this.mLegacyAE2Effects = null;
          return;
       }else {
          this.mLegacyAE2Effects = new ArrayList(Arrays.asList(p0));
          return;
       }
    }
    public void setPaddingColor(Minecraft$Color p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$VideoEditorProject.class, "62")) {
          return;
       }
       this.mTimeline.setPaddingColor(p0);
       return;
    }
    public void setProjectFpsCalculateMethod(int p0){
       EditorSdk2V2$VideoEditorProject videoEditorP = EditorSdk2V2$VideoEditorProject.class;
       if (PatchProxy.isSupport(videoEditorP) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, videoEditorP, "84")) {
          return;
       }
       this.mTimeline.timelineConfig().setTimelineFpsCalculateMethod(p0);
       return;
    }
    public void setProjectId(long p0){
       EditorSdk2V2$VideoEditorProject videoEditorP = EditorSdk2V2$VideoEditorProject.class;
       if (PatchProxy.isSupport(videoEditorP) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, videoEditorP, "24")) {
          return;
       }
       this.mTimeline.setProjectId(p0);
       return;
    }
    public void setProjectOutputHeight(int p0){
       EditorSdk2V2$VideoEditorProject videoEditorP = EditorSdk2V2$VideoEditorProject.class;
       if (PatchProxy.isSupport(videoEditorP) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, videoEditorP, "69")) {
          return;
       }
       videoEditorP = this.mTimeline;
       videoEditorP.setProjectResolutionWidthsetProjectResolutionWidth((int)videoEditorP.projectWidth(), p0);
       return;
    }
    public void setProjectOutputWidth(int p0){
       EditorSdk2V2$VideoEditorProject videoEditorP = EditorSdk2V2$VideoEditorProject.class;
       if (PatchProxy.isSupport(videoEditorP) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, videoEditorP, "67")) {
          return;
       }
       videoEditorP = this.mTimeline;
       videoEditorP.setProjectResolutionWidthsetProjectResolutionWidth(p0, (int)videoEditorP.projectHeight());
       return;
    }
    public void setSubtitleRangeRatio(double p0){
       this.mSubtitleRangeRatio = p0;
    }
    public void setTextClips(ArrayList p0){
       this.mTextClips = p0;
    }
    public void setTextEffect(Minecraft$TextEffect p0){
       this.mTextEffect = p0;
    }
    public void setTimeEffect(Minecraft$TimeEffectParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$VideoEditorProject.class, "49")) {
          return;
       }
       if (p0 != null) {
          p0 = p0.clone();
          int i = p0.timeEffectType();
          if (i != 1) {
             if (i == 2 && p0.effectSlowSpeed() - 0x3fb999999999999a <= 0) {
                p0.setEffectSlowSpeed(0x3fe0000000000000);
             }
          }else if(p0.effectRepeatTimes() <= 0){
             p0.setEffectRepeatTimes(3);
          }
       }
       ErrorStatus uErrorStatus = new ErrorStatus();
       Minecraft$TimeEffectParam timeEffectPa = this.timeEffect();
       String str = null;
       StringBuilder str1 = (timeEffectPa == null)? str: timeEffectPa.effectId();
       if (!MinecraftUtils.InsertOrUpdateOrDeleteEffectIntoItem(p0, str, str1, this.mTimeline, uErrorStatus)) {
          str1 = "[VideoEditorProject][setTimeEffect] failed : ";
          String str2 = (p0 == null)? "": p0.effectId();
          EditorSdkLogger.e(str1+str2+"error : "+uErrorStatus.description());
       }
       return;
    }
    public void setTouchData(ImmutableArray p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$VideoEditorProject.class, "71")) {
          return;
       }
       this.setTouchData(p0.toNormalArray());
       return;
    }
    public void setTouchData(Minecraft$MagicTouchOverall[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$VideoEditorProject.class, "72")) {
          return;
       }
       Minecraft$MagicTouchEffectParam magicTouchEf = this.magicTouchEffectParam();
       String str = null;
       String str1 = (magicTouchEf == null)? str: magicTouchEf.effectId();
       if (p0 != null && (p0.length > 0 && magicTouchEf == null)) {
          magicTouchEf = new Minecraft$MagicTouchEffectParam();
       }
    label_0024 :
       if (magicTouchEf != null) {
          magicTouchEf.setTouchData(p0);
          MinecraftUtils.FillEffectFields(magicTouchEf);
       }
       ErrorStatus uErrorStatus = new ErrorStatus();
       if (!MinecraftUtils.InsertOrUpdateOrDeleteEffectIntoItem(magicTouchEf, str, str1, this.mMainTrack, uErrorStatus)) {
          Object[] objArray = new Object[]{Integer.valueOf(uErrorStatus.errorCode()),uErrorStatus.description()};
          EditorSdkLogger.e(String.format("[KSEVideoEditorProjectV2][setTouchEffects] fail:%d desc:%s", objArray));
       }
       return;
    }
    public void setTouchEffects(Minecraft$TouchEffectParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$VideoEditorProject.class, "65")) {
          return;
       }
       Minecraft$MagicTouchEffectParam magicTouchEf = this.magicTouchEffectParam();
       String str = null;
       String str1 = (magicTouchEf == null)? str: magicTouchEf.effectId();
       if (p0 != null && magicTouchEf == null) {
          magicTouchEf = new Minecraft$MagicTouchEffectParam();
       }
       if (magicTouchEf != null) {
          magicTouchEf.setTouchEffect(p0);
          MinecraftUtils.FillEffectFields(magicTouchEf);
       }
       ErrorStatus uErrorStatus = new ErrorStatus();
       if (!MinecraftUtils.InsertOrUpdateOrDeleteEffectIntoItem(magicTouchEf, str, str1, this.mMainTrack, uErrorStatus)) {
          Object[] objArray = new Object[]{Integer.valueOf(uErrorStatus.errorCode()),uErrorStatus.description()};
          EditorSdkLogger.e(String.format("[KSEVideoEditorProjectV2][setTouchEffects] fail:%d desc:%s", objArray));
       }
       return;
    }
    public void setTrackAssets(ImmutableArray p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$VideoEditorProject.class, "26")) {
          return;
       }
       if (p0 == null) {
          this.mTrackAssetsHolder = null;
          return;
       }else {
          this.mTrackAssetsHolder = p0.getArrayList();
          return;
       }
    }
    public void setTrackAssets(EditorSdk2V2$TrackAsset[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$VideoEditorProject.class, "27")) {
          return;
       }
       if (p0 == null) {
          this.mTrackAssetsHolder = null;
          return;
       }else {
          this.mTrackAssetsHolder = new ArrayList(Arrays.asList(p0));
          return;
       }
    }
    public void setVeSharpenFilter(Minecraft$VESharpenFilterParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$VideoEditorProject.class, "58")) {
          return;
       }
       ErrorStatus uErrorStatus = new ErrorStatus();
       Minecraft$VESharpenFilterParam vESharpenFil = this.veSharpenFilterParam();
       String str = null;
       String str1 = (vESharpenFil == null)? str: vESharpenFil.effectId();
       if (!MinecraftUtils.InsertOrUpdateOrDeleteEffectIntoItem(p0, str, str1, this.mTimeline, uErrorStatus)) {
          EditorSdkLogger.e("[VideoEditorProject][setBeautyFilter] failed : "+MinecraftUtils.GetEffectId(p0)+"error : "+uErrorStatus.description());
       }
       return;
    }
    public void setVisualEffects(ImmutableArray p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$VideoEditorProject.class, "44")) {
          return;
       }
       this.setVisualEffects(p0.toNormalArray());
       return;
    }
    public void setVisualEffects(Minecraft$VisualEffectParam[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$VideoEditorProject.class, "45")) {
          return;
       }
       Iterator iterator = this.visualEffects().iterator();
       while (iterator.hasNext()) {
          Minecraft$VisualEffectParam visualEffect = iterator.next();
          ErrorStatus uErrorStatus = new ErrorStatus();
          if (!this.mTimeline.deleteEffect(visualEffect.effectId(), uErrorStatus)) {
             EditorSdkLogger.e("[VideoEditorProject][setVisualEffects] fail delete effectId : "+MinecraftUtils.GetEffectId(visualEffect)+"error : "+uErrorStatus.description());
          }
       }
       int len = p0.length;
       int i = 0;
       while (i < len) {
          object oobject = p0[i];
          MinecraftUtils.FillEffectFields(oobject);
          ErrorStatus uErrorStatus1 = new ErrorStatus();
          if (!this.mTimeline.appendEffect(oobject, uErrorStatus1)) {
             EditorSdkLogger.e("[VideoEditorProject][setVisualEffects] fail appendEffect : "+MinecraftUtils.GetEffectId(oobject)+"error : "+uErrorStatus1.description());
          }
          i = i + 1;
       }
       return;
    }
    public Minecraft$TextEffect textEffect(){
       return this.mTextEffect;
    }
    public Minecraft$TimeEffectParam timeEffect(){
       Object[] objArray = null;
       ArrayList obj = PatchProxy.apply(objArray, this, EditorSdk2V2$VideoEditorProject.class, "48");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = MinecraftUtils.FilterEffects(this.mTimeline.effects().getArrayList(), Minecraft$TimeEffectParam.class, objArray);
       if (obj.size() > 1) {
          EditorSdkLogger.e("[VideoEditorProject][timeEffect] count > 1");
          return objArray;
       }else if(!obj.isEmpty()){
          return obj.get(0);
       }else {
          return objArray;
       }
    }
    public byte[] toByteArray(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2V2$VideoEditorProject.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.constructTimelineBone().getData(null);
    }
    public ImmutableArray touchData(){
       Minecraft$MagicTouchEffectParam obj = PatchProxy.apply(null, this, EditorSdk2V2$VideoEditorProject.class, "70");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.magicTouchEffectParam();
       if (obj != null) {
          return obj.touchData();
       }
       return null;
    }
    public Minecraft$MagicTouchOverall touchData(int p0){
       Minecraft$MagicTouchEffectParam obj;
       EditorSdk2V2$VideoEditorProject videoEditorP = EditorSdk2V2$VideoEditorProject.class;
       if (PatchProxy.isSupport(videoEditorP)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, videoEditorP, "74");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.magicTouchEffectParam();
       if (obj != null) {
          return obj.touchData().get(p0);
       }else {
          return null;
       }
    }
    public int touchDataSize(){
       Minecraft$MagicTouchEffectParam obj = PatchProxy.apply(null, this, EditorSdk2V2$VideoEditorProject.class, "73");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.magicTouchEffectParam();
       if (obj != null) {
          return obj.touchData().size();
       }
       return 0;
    }
    public Minecraft$TouchEffectParam touchEffects(){
       Minecraft$MagicTouchEffectParam obj = PatchProxy.apply(null, this, EditorSdk2V2$VideoEditorProject.class, "64");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.magicTouchEffectParam();
       if (obj != null) {
          return obj.touchEffect();
       }
       return null;
    }
    public ImmutableArray trackAssets(){
       Object[] objArray = null;
       EditorSdk2V2$VideoEditorProject obj = PatchProxy.apply(objArray, this, EditorSdk2V2$VideoEditorProject.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mTrackAssetsHolder;
       if (obj == null) {
          return objArray;
       }
       return new ImmutableArray(obj, EditorSdk2V2$TrackAsset.class);
    }
    public EditorSdk2V2$TrackAsset trackAssets(int p0){
       EditorSdk2V2$VideoEditorProject videoEditorP = EditorSdk2V2$VideoEditorProject.class;
       if (PatchProxy.isSupport(videoEditorP)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, videoEditorP, "29");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       videoEditorP = this.mTrackAssetsHolder;
       if (videoEditorP == null) {
          return null;
       }else {
          return videoEditorP.get(p0);
       }
    }
    public void trackAssetsSetItem(int p0,EditorSdk2V2$TrackAsset p1){
       EditorSdk2V2$VideoEditorProject videoEditorP = EditorSdk2V2$VideoEditorProject.class;
       if (PatchProxy.isSupport(videoEditorP) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, videoEditorP, "30")) {
          return;
       }
       videoEditorP = this.mTrackAssetsHolder;
       if (videoEditorP == null) {
          return;
       }
       videoEditorP.set(p0, p1);
       return;
    }
    public int trackAssetsSize(){
       EditorSdk2V2$VideoEditorProject obj = PatchProxy.apply(null, this, EditorSdk2V2$VideoEditorProject.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mTrackAssetsHolder;
       if (obj == null) {
          return 0;
       }
       return obj.size();
    }
    public final ArrayList tracksForAnimatedSubAssets(ArrayList p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, EditorSdk2V2$VideoEditorProject.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = p0.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return obj;
          }
          EditorSdk2V2$AnimatedSubAsset uAnimatedSub = iterator.next();
          EditorSdk2$TimeRange timeRange = uAnimatedSub.displayRange();
          if (timeRange == null || timeRange.duration() - 0.00f < 0) {
             Object[] objArray = new Object[]{Long.valueOf(uAnimatedSub.assetId()),uAnimatedSub.assetPath()};
             EditorSdkLogger.e(String.format("[KSEVideoEditorProjectV2][tracksForAnimatedSubAssets] animatedSubAsset id:%d path:%s invalid display_range", objArray));
          }else {
             MutableTrack mutableTrack = this.fetchSuitableTrackforNextDisplayRange(obj, timeRange);
             if (mutableTrack == null) {
                mutableTrack = new MutableTrack();
                obj.add(mutableTrack);
             }
             Minecraft$KSAVClip kSAVClip = uAnimatedSub.mMainClip.clone();
             kSAVClip.setAbsoluteDuration(new RationalTime(timeRange.duration(), 0x3ff0000000000000));
             if (!MinecraftUtils.AppendClipToTrack(mutableTrack, kSAVClip, timeRange)) {
                break ;
             }
          }
       }
       EditorSdkLogger.e("[KSEVideoEditorProjectV2][tracksForAnimatedSubAssets] AppendClipToTrackWithDisplayRange fail");
       return null;
    }
    public final ArrayList tracksForAudioAssets(){
       int i1;
       MutableTrack mutableTrack;
       ArrayList uArrayList1;
       ArrayList uArrayList2;
       Object obj = this;
       Object[] objArray = null;
       ArrayList obj1 = PatchProxy.apply(objArray, obj, EditorSdk2V2$VideoEditorProject.class, "18");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       obj1 = new ArrayList();
       ArrayList uArrayList = new ArrayList();
       HashSet hashSet = new HashSet();
       hashSet.add("audioTrackWithMain");
       Iterator iterator = obj.mAudioAssetsHolder.iterator();
       while (true) {
          if (iterator.hasNext()) {
             EditorSdk2V2$AudioAsset uAudioAsset = iterator.next();
             if (obj.mTimeline.mutableAVClipById(uAudioAsset.mMainClip.clipId()) == null) {
                if (obj.mTimeline.mutableReplaceableClipsByClipId(uAudioAsset.mMainClip.clipId()) != null) {
                   continue ;
                }else {
                   EditorSdk2$TimeRange timeRange = uAudioAsset.displayRange();
                   Minecraft$KSAVClip kSAVClip = uAudioAsset.mMainClip.clone();
                   double d = 0x3ff0000000000000;
                   if (timeRange != null) {
                      kSAVClip.setAbsoluteDuration(new RationalTime(timeRange.duration(), d));
                   }
                   int i = 2;
                   i1 = 0;
                   if (timeRange != null) {
                      mutableTrack = (uAudioAsset.mAssetAudioFlag == 1)? obj.fetchSuitableTrackforNextDisplayRange(uArrayList, timeRange): obj.fetchSuitableTrackforNextDisplayRange(obj1, timeRange);
                      uArrayList1 = uArrayList;
                   }else {
                      ErrorStatus uErrorStatus = new ErrorStatus();
                      uArrayList1 = uArrayList;
                      double d1 = MinecraftUtils.CalculateAVClipDurationByTrimmedRangeAndTimemapSpeed(kSAVClip, uErrorStatus);
                      if (uErrorStatus.errorCode()) {
                         objArray = new Object[3];
                         objArray[i1] = uAudioAsset.assetPath();
                         objArray[1] = uErrorStatus.description();
                         objArray[i] = Integer.valueOf(uErrorStatus.errorCode());
                         EditorSdkLogger.e(String.format("[KSEVideoEditorProjectV2][tracksForAudioAssets] skip audioAsset:%s calc duration fail:%s err:%d", objArray));
                         uArrayList = uArrayList1;
                      label_00b6 :
                         objArray = null;
                      }else {
                         kSAVClip.setAbsoluteDuration(new RationalTime(d1, d));
                         mutableTrack = null;
                      }
                   }
                   boolean i2 = obj.mMuteFlags & i;
                   i2 = (i2)? true: false;
                   kSAVClip.setMute(i2);
                   if (mutableTrack == null) {
                      mutableTrack = new MutableTrack();
                      mutableTrack.setKind("Audio");
                      if (uAudioAsset.mAssetAudioFlag == 1) {
                         mutableTrack.setTags(hashSet);
                         uArrayList2 = uArrayList1;
                         uArrayList2.add(mutableTrack);
                      }else {
                         uArrayList2 = uArrayList1;
                         obj1.add(mutableTrack);
                      }
                   }else {
                      uArrayList2 = uArrayList1;
                   }
                   if (!MinecraftUtils.AppendClipToTrack(mutableTrack, kSAVClip, timeRange)) {
                      break ;
                   }else {
                      uArrayList = uArrayList2;
                      goto label_00b6 ;
                   }
                }
             }else {
                uArrayList = uArrayList;
                objArray = objArray;
             }
          }else {
             obj1.addAll(uArrayList);
             return obj1;
          }
       }
       Object[] objArray1 = new Object[i1];
       EditorSdkLogger.e(String.format("[KSEVideoEditorProjectV2][tracksForAudioAssets] AppendClipToTrack fail", objArray1));
       return null;
    }
    public final boolean updateTimelineOriginAudioClipByAudioAssets(MutableTimeline p0){
       Iterator obj = PatchProxy.applyOneRefs(p0, this, EditorSdk2V2$VideoEditorProject.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mAudioAssetsHolder.iterator();
       EditorSdk2V2$AudioAsset uAudioAsset = 1;
       while (obj.hasNext()) {
          EditorSdk2V2$AudioAsset uAudioAsset1 = obj.next();
          Minecraft$KSAVClip kSAVClip = p0.mutableAVClipById(uAudioAsset1.mMainClip.clipId());
          if (kSAVClip == null) {
             kSAVClip = p0.mutableReplaceableClipsByClipId(uAudioAsset1.mMainClip.clipId());
          }else {
             int i = this.mMuteFlags & 0x02;
             if (!i) {
                uAudioAsset = false;
             }
             kSAVClip.setMute(uAudioAsset);
          }
          if (kSAVClip == null) {
             continue ;
          }
          uAudioAsset = new EditorSdk2V2$AudioAsset(kSAVClip);
          uAudioAsset.setVolume(uAudioAsset1.volume());
          uAudioAsset.setVolumeKeyFrames(uAudioAsset1.volumeKeyFrames());
          uAudioAsset.setAudioFilterParam(uAudioAsset1.audioFilterParam());
       }
       return uAudioAsset;
    }
    public Minecraft$VESharpenFilterParam veSharpenFilterParam(){
       Object[] objArray = null;
       ArrayList obj = PatchProxy.apply(objArray, this, EditorSdk2V2$VideoEditorProject.class, "57");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = MinecraftUtils.FilterEffects(this.mTimeline.effects().getArrayList(), Minecraft$VESharpenFilterParam.class, objArray);
       if (obj.size() > 1) {
          EditorSdkLogger.e("[VideoEditorProject][veSharpenFilterParam] count > 1");
          return objArray;
       }else if(!obj.isEmpty()){
          return obj.get(0);
       }else {
          return objArray;
       }
    }
    public ImmutableArray visualEffects(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, EditorSdk2V2$VideoEditorProject.class, "43");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ImmutableArray(MinecraftUtils.FilterEffects(this.mTimeline.effects().getArrayList(), Minecraft$VisualEffectParam.class, objArray), Minecraft$VisualEffectParam.class);
    }
    public Minecraft$VisualEffectParam visualEffects(int p0){
       EditorSdk2V2$VideoEditorProject videoEditorP = EditorSdk2V2$VideoEditorProject.class;
       if (PatchProxy.isSupport(videoEditorP)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, videoEditorP, "47");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.visualEffects().get(p0);
    }
    public int visualEffectsSize(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2V2$VideoEditorProject.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.visualEffects().size();
    }
}
