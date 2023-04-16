package com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import com.kwai.video.editorsdk2.model.ModelBase;
import com.kwai.video.minecraft.model.nano.Minecraft$KSAVClip;
import com.kwai.video.minecraft.model.nano.Minecraft$AudioVideoReference;
import com.kwai.video.minecraft.model.MutableMediaReference;
import com.kwai.video.minecraft.model.MutableClip;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.video.editorsdk2.logger.EditorSdkLogger;
import com.kwai.video.minecraft.MinecraftUtils;
import com.kwai.video.minecraft.model.MediaReference;
import com.kwai.video.minecraft.model.nano.Minecraft$InputFileOptions;
import com.kwai.video.minecraft.model.nano.Minecraft$AssetTransform;
import com.kwai.video.minecraft.model.nano.Minecraft$AudioFilterParam;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import com.kwai.video.minecraft.model.MutableItem;
import java.util.ArrayList;
import com.kwai.video.minecraft.model.nano.Minecraft$BeautyFilterParam;
import com.kwai.video.minecraft.model.nano.Minecraft$ChromaKeyConfig;
import com.kwai.video.minecraft.model.ErrorStatus;
import java.util.Iterator;
import com.kwai.video.minecraft.model.nano.Minecraft$LegacyAE2Effect;
import java.util.Set;
import com.kwai.video.minecraft.model.MutableEffect;
import java.lang.StringBuilder;
import com.kwai.video.minecraft.model.EditorSdk2V2$TimeRangeV2;
import com.kwai.video.minecraft.model.TimeRange;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ProbedFile;
import com.kwai.video.minecraft.model.nano.Minecraft$TransitionParam;
import com.kwai.video.minecraft.model.nano.Minecraft$ColorFilterParam;
import com.kwai.video.minecraft.model.nano.Minecraft$CropOptions;
import com.kwai.video.minecraft.model.nano.Minecraft$YKitCutoutParam;
import java.lang.Boolean;
import com.kwai.video.minecraft.model.Effect;
import java.lang.Integer;
import com.kwai.video.minecraft.model.nano.Minecraft$WesterosFaceMagicParam;
import com.kwai.video.minecraft.model.nano.Minecraft$PaddingAreaOptions;
import com.kwai.video.minecraft.model.nano.Minecraft$PictureAdjustmentParam;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$EditorSdkError;
import java.lang.Long;
import java.lang.Double;
import com.kwai.video.minecraft.model.nano.Minecraft$TextEffect;
import com.kwai.video.minecraft.model.nano.Minecraft$TimeMapParams;
import com.kwai.video.minecraft.model.nano.Minecraft$VisualEffectParam;
import com.kwai.video.minecraft.model.nano.Minecraft$AudioVolumeRangeParam;
import com.kwai.video.minecraft.model.nano.Minecraft$WesterosBeautyFilterParam;
import com.kwai.video.minecraft.model.nano.Minecraft$WesterosBodySlimmingParam;
import com.kwai.video.minecraft.model.nano.Minecraft$WesterosMakeupParam;

public final class EditorSdk2V2$TrackAsset extends ModelBase	// class@0009f4
{
    public boolean mIsBackgroundVideo;
    public boolean mIsVocal;
    public ArrayList mLegacyAE2Effects;
    public Minecraft$KSAVClip mMainClip;
    public ArrayList mMoreLegacyAE2EffectsArray;
    public EditorSdk2$ProbedFile mProbedAssetFile;
    public Minecraft$TransitionParam mTransitionParam;

    public void EditorSdk2V2$TrackAsset(){
       super();
       this.mIsVocal = false;
       this.mMainClip = new Minecraft$KSAVClip();
       this.mMainClip.setMediaReference(new Minecraft$AudioVideoReference());
    }
    public void EditorSdk2V2$TrackAsset(Minecraft$KSAVClip p0){
       super();
       this.mIsVocal = false;
       this.mMainClip = p0;
    }
    public int alphaInfo(){
       Minecraft$AudioVideoReference obj = PatchProxy.apply(null, this, EditorSdk2V2$TrackAsset.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mMainClip.mutableMediaReference();
       int i = (obj == null)? 0: obj.alphaInfo();
       return i;
    }
    public String assetAudioPath(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2V2$TrackAsset.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       EditorSdkLogger.e("[TrackAsset][assetAudioPath] has no assetAudioPath");
       return "";
    }
    public long assetId(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2V2$TrackAsset.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return MinecraftUtils.ParseMinecraftID(this.mMainClip.clipId());
    }
    public String assetPath(){
       Minecraft$AudioVideoReference obj = PatchProxy.apply(null, this, EditorSdk2V2$TrackAsset.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mMainClip.mediaReference();
       if (obj == null) {
          return "";
       }
       return obj.filePath();
    }
    public Minecraft$InputFileOptions assetPathOptions(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2V2$TrackAsset.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mMainClip.mutableMediaReference().fileOptions();
    }
    public double assetSpeed(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2V2$TrackAsset.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return this.mMainClip.assetSpeed();
    }
    public Minecraft$AssetTransform assetTransform(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2V2$TrackAsset.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mMainClip.assetTransform();
    }
    public int assetTransformFlag(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2V2$TrackAsset.class, "50");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mMainClip.assetTransformFlag();
    }
    public Minecraft$AudioFilterParam audioFilterParam(){
       Object[] objArray = null;
       ArrayList obj = PatchProxy.apply(objArray, this, EditorSdk2V2$TrackAsset.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = MinecraftUtils.FilterEffects(this.mMainClip.effects().getArrayList(), Minecraft$AudioFilterParam.class, objArray);
       if (obj.size() > 1) {
          EditorSdkLogger.e("[TrackAsset][audioFilterParam] count > 1");
          return objArray;
       }else if(!obj.isEmpty()){
          return obj.get(0);
       }else {
          return objArray;
       }
    }
    public Minecraft$BeautyFilterParam beautyFilter(){
       Object[] objArray = null;
       ArrayList obj = PatchProxy.apply(objArray, this, EditorSdk2V2$TrackAsset.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = MinecraftUtils.FilterEffects(this.mMainClip.effects().getArrayList(), Minecraft$BeautyFilterParam.class, objArray);
       if (obj.size() > 1) {
          EditorSdkLogger.e("[TrackAsset][beautyFilter] count > 1");
          return objArray;
       }else if(!obj.isEmpty()){
          return obj.get(0);
       }else {
          return objArray;
       }
    }
    public Minecraft$ChromaKeyConfig chromakeyConfig(){
       Object[] objArray = null;
       ArrayList obj = PatchProxy.apply(objArray, this, EditorSdk2V2$TrackAsset.class, "74");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = MinecraftUtils.FilterEffects(this.mMainClip.effects().getArrayList(), Minecraft$ChromaKeyConfig.class, objArray);
       if (obj.size() > 1) {
          EditorSdkLogger.e("[TrackAsset][chromakeyConfig] count > 1");
          return objArray;
       }else if(!obj.isEmpty()){
          return obj.get(0);
       }else {
          return objArray;
       }
    }
    public void clearMoreOverlappedAE2Effects(){
       if (PatchProxy.applyVoid(null, this, EditorSdk2V2$TrackAsset.class, "48")) {
          return;
       }
       ErrorStatus uErrorStatus = new ErrorStatus();
       Iterator iterator = this.moreOverlappedAE2Effects().iterator();
       while (iterator.hasNext()) {
          Minecraft$LegacyAE2Effect legacyAE2Eff = iterator.next();
          EditorSdk2V2$TrackAsset trackAsset = 1;
          if (legacyAE2Eff == null) {
             continue ;
          }else {
             Set set = legacyAE2Eff.tags();
             if (set == null || !set.contains("overlappedAE2EffectOnVideoEditorProjectV2")) {
                trackAsset = this.mMainClip.deleteEffect(legacyAE2Eff.effectId(), uErrorStatus);
             }
             if (!trackAsset) {
                EditorSdkLogger.e("[KSETrackAssetV2][clearMoreOverlappedAE2Effects] clear fail effectId:"+legacyAE2Eff.effectId()+" desc"+uErrorStatus.description());
             }
          }
       }
       return;
    }
    public void clearOverlappedAE2Effects(){
       if (PatchProxy.applyVoid(null, this, EditorSdk2V2$TrackAsset.class, "44")) {
          return;
       }
       ErrorStatus uErrorStatus = new ErrorStatus();
       Iterator iterator = this.overlappedAE2Effects().iterator();
       while (iterator.hasNext()) {
          Minecraft$LegacyAE2Effect legacyAE2Eff = iterator.next();
          EditorSdk2V2$TrackAsset trackAsset = 1;
          if (legacyAE2Eff == null) {
             continue ;
          }else {
             Set set = legacyAE2Eff.tags();
             if (set != null && set.contains("overlappedAE2EffectOnVideoEditorProjectV2")) {
                trackAsset = this.mMainClip.deleteEffect(legacyAE2Eff.effectId(), uErrorStatus);
             }
             if (!trackAsset) {
                EditorSdkLogger.e("[KSETrackAssetV2][clearOverlappedAE2Effects] clear fail effectId:"+legacyAE2Eff.effectId()+" desc"+uErrorStatus.description());
             }
          }
       }
       return;
    }
    public EditorSdk2V2$TimeRangeV2 clippedRange(){
       TimeRange obj = PatchProxy.apply(null, this, EditorSdk2V2$TrackAsset.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.mMainClip.sourceRange() == null)? this.mMainClip.availableRange(null): this.mMainClip.sourceRange();
       return MinecraftUtils.CreateEditorTimeRangeV2FromMinecraft(obj);
    }
    public EditorSdk2V2$TrackAsset clone(){
       EditorSdk2$ProbedFile probedFile;
       Object[] objArray = null;
       EditorSdk2V2$TrackAsset obj = PatchProxy.apply(objArray, this, EditorSdk2V2$TrackAsset.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new EditorSdk2V2$TrackAsset();
       EditorSdk2V2$TrackAsset tmMainClip = this.mMainClip;
       Object[] objArray1 = (tmMainClip == null)? objArray: tmMainClip.clone();
       obj.mMainClip = objArray1;
       tmMainClip = this.mProbedAssetFile;
       objArray1 = (tmMainClip == null)? objArray: tmMainClip.clone();
       obj.mProbedAssetFile = objArray1;
       tmMainClip = this.mTransitionParam;
       if (tmMainClip != null) {
          objArray = tmMainClip.clone();
       }
       obj.mTransitionParam = objArray;
       obj.mIsVocal = this.mIsVocal;
       return obj;
    }
    public Object clone(){
       return this.clone();
    }
    public Minecraft$ColorFilterParam colorFilter(){
       Object[] objArray = null;
       ArrayList obj = PatchProxy.apply(objArray, this, EditorSdk2V2$TrackAsset.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = MinecraftUtils.FilterEffects(this.mMainClip.effects().getArrayList(), Minecraft$ColorFilterParam.class, objArray);
       if (obj.size() > 1) {
          EditorSdkLogger.e("[TrackAsset][colorFilter] count > 1");
          return objArray;
       }else if(!obj.isEmpty()){
          return obj.get(0);
       }else {
          return objArray;
       }
    }
    public Minecraft$CropOptions cropOptions(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2V2$TrackAsset.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mMainClip.cropOptions();
    }
    public Minecraft$YKitCutoutParam cutoutParam(){
       Object[] objArray = null;
       ArrayList obj = PatchProxy.apply(objArray, this, EditorSdk2V2$TrackAsset.class, "76");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = MinecraftUtils.FilterEffects(this.mMainClip.effects().getArrayList(), Minecraft$YKitCutoutParam.class, objArray);
       if (obj.size() > 1) {
          EditorSdkLogger.e("[TrackAsset][cutoutParam] count > 1");
          return objArray;
       }else if(!obj.isEmpty()){
          return obj.get(0);
       }else {
          return objArray;
       }
    }
    public boolean disableRecyclePlay(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2V2$TrackAsset.class, "80");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.mMainClip.isRepeat() ^ 0x01);
    }
    public Minecraft$KSAVClip getMainClip(){
       return this.mMainClip;
    }
    public boolean improveHighResolutionUpscaleQuality(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2V2$TrackAsset.class, "64");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mMainClip.improveHighResolutionUpscaleQuality();
    }
    public boolean isBackgroundVideo(){
       return this.mIsBackgroundVideo;
    }
    public boolean isReversed(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2V2$TrackAsset.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mMainClip.isReversed();
    }
    public boolean isVocal(){
       return this.mIsVocal;
    }
    public ImmutableArray moreOverlappedAE2Effects(){
       ArrayList obj = PatchProxy.apply(null, this, EditorSdk2V2$TrackAsset.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = this.mMainClip.effects().iterator();
       while (iterator.hasNext()) {
          Effect uEffect = iterator.next();
          Set set = uEffect.tags();
          if (uEffect instanceof Minecraft$LegacyAE2Effect && (set == null || !set.contains("overlappedAE2EffectOnVideoEditorProjectV2"))) {
             obj.add(uEffect);
          }
       }
       return new ImmutableArray(obj, Minecraft$LegacyAE2Effect.class);
    }
    public Minecraft$LegacyAE2Effect moreOverlappedAE2Effects(int p0){
       ImmutableArray obj;
       EditorSdk2V2$TrackAsset trackAsset = EditorSdk2V2$TrackAsset.class;
       if (PatchProxy.isSupport(trackAsset)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, trackAsset, "49");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.moreOverlappedAE2Effects();
       if (obj != null && (p0 >= 0 && p0 < obj.size())) {
          return obj.get(p0);
       }else {
          return null;
       }
    }
    public ImmutableArray moreWesterosFaceMagicParams(){
       ArrayList obj = PatchProxy.apply(null, this, EditorSdk2V2$TrackAsset.class, "59");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = this.mMainClip.effects().iterator();
       while (iterator.hasNext()) {
          Effect uEffect = iterator.next();
          Set set = uEffect.tags();
          if (uEffect instanceof Minecraft$WesterosFaceMagicParam && (set == null || !set.contains("westerosFaceMagicParamEffectOnTrackAssetV2"))) {
             obj.add(uEffect);
          }
       }
       return new ImmutableArray(obj, Minecraft$WesterosFaceMagicParam.class);
    }
    public Minecraft$WesterosFaceMagicParam moreWesterosFaceMagicParams(int p0){
       EditorSdk2V2$TrackAsset trackAsset = EditorSdk2V2$TrackAsset.class;
       if (PatchProxy.isSupport(trackAsset)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, trackAsset, "63");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.moreWesterosFaceMagicParams(p0);
    }
    public int moreWesterosFaceMagicParamsSize(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2V2$TrackAsset.class, "62");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.moreWesterosFaceMagicParams().size();
    }
    public ImmutableArray overlappedAE2Effects(){
       ArrayList obj = PatchProxy.apply(null, this, EditorSdk2V2$TrackAsset.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = this.mMainClip.effects().iterator();
       while (iterator.hasNext()) {
          Effect uEffect = iterator.next();
          Set set = uEffect.tags();
          if (uEffect instanceof Minecraft$LegacyAE2Effect && (set != null && set.contains("overlappedAE2EffectOnTrackAssetV2"))) {
             obj.add(uEffect);
          }
       }
       return new ImmutableArray(obj, Minecraft$LegacyAE2Effect.class);
    }
    public Minecraft$LegacyAE2Effect overlappedAE2Effects(int p0){
       ImmutableArray obj;
       EditorSdk2V2$TrackAsset trackAsset = EditorSdk2V2$TrackAsset.class;
       if (PatchProxy.isSupport(trackAsset)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, trackAsset, "45");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.overlappedAE2Effects();
       if (obj != null && (p0 >= 0 && p0 < obj.size())) {
          return obj.get(p0);
       }else {
          return null;
       }
    }
    public Minecraft$PaddingAreaOptions paddingAreaOptions(){
       Object[] objArray = null;
       ArrayList obj = PatchProxy.apply(objArray, this, EditorSdk2V2$TrackAsset.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = MinecraftUtils.FilterEffects(this.mMainClip.effects().getArrayList(), Minecraft$PaddingAreaOptions.class, objArray);
       if (obj.size() > 1) {
          EditorSdkLogger.e("[TrackAsset][paddingAreaOptions] count > 1");
          return objArray;
       }else if(!obj.isEmpty()){
          return obj.get(0);
       }else {
          return objArray;
       }
    }
    public Minecraft$PictureAdjustmentParam pictureAdjustmentParam(){
       Object[] objArray = null;
       ArrayList obj = PatchProxy.apply(objArray, this, EditorSdk2V2$TrackAsset.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = MinecraftUtils.FilterEffects(this.mMainClip.effects().getArrayList(), Minecraft$PictureAdjustmentParam.class, objArray);
       if (obj.size() > 1) {
          EditorSdkLogger.e("[TrackAsset][pictureAdjustmentParam] count > 1");
          return objArray;
       }else if(!obj.isEmpty()){
          return obj.get(0);
       }else {
          return objArray;
       }
    }
    public int positioningMethod(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2V2$TrackAsset.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mMainClip.positioningMethod();
    }
    public EditorSdk2$ProbedFile probedAssetFile(){
       return this.mProbedAssetFile;
    }
    public boolean reloadProbedFiles(EditorSdk2$EditorSdkError p0){
       EditorSdk2$ProbedFile obj = PatchProxy.applyOneRefs(p0, this, EditorSdk2V2$TrackAsset.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 1;
       if (this.mProbedAssetFile == null) {
          obj = new EditorSdk2$ProbedFile();
          int i1 = MinecraftUtils.OpenAudioVideoClip(this.mMainClip, obj);
          if (i1) {
             Object[] objArray = new Object[i];
             objArray[0] = Integer.valueOf(i1);
             EditorSdkLogger.e(String.format("[KSETrackAssetV2][reloadProbedFile] open mainClip fail:%d", objArray));
             if (p0 != null) {
                p0.setCode(i1);
                p0.setMessage("Error opening trackAsset mainClip");
             }
             return 0;
          }else {
             this.mProbedAssetFile = obj;
          }
       }
       return i;
    }
    public int rotationDeg(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2V2$TrackAsset.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mMainClip.rotationDeg();
    }
    public void setAlphaInfo(int p0){
       EditorSdk2V2$TrackAsset trackAsset = EditorSdk2V2$TrackAsset.class;
       if (PatchProxy.isSupport(trackAsset) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, trackAsset, "33")) {
          return;
       }
       this.mMainClip.mutableMediaReference().setAlphaInfo(p0);
       return;
    }
    public void setAssetAudioPath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$TrackAsset.class, "19")) {
          return;
       }
       EditorSdkLogger.e("[TrackAsset][setAssetAudioPath] has no assetAudioPath");
       return;
    }
    public void setAssetId(long p0){
       EditorSdk2V2$TrackAsset trackAsset = EditorSdk2V2$TrackAsset.class;
       if (PatchProxy.isSupport(trackAsset) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, trackAsset, "4")) {
          return;
       }
       this.mMainClip.setClipId(p0);
       return;
    }
    public void setAssetPath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$TrackAsset.class, "6")) {
          return;
       }
       if (p0 == null || !p0.equals(this.assetPath())) {
          this.mMainClip.mutableMediaReference().setFilePath(p0);
          this.mProbedAssetFile = null;
          if (p0 != null && p0.length() > 0) {
             this.reloadProbedFiles(null);
          }
       }
       return;
    }
    public void setAssetPathOptions(Minecraft$InputFileOptions p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$TrackAsset.class, "21")) {
          return;
       }
       this.mMainClip.mutableMediaReference().setFileOptions(p0);
       return;
    }
    public void setAssetSpeed(double p0){
       EditorSdk2V2$TrackAsset trackAsset = EditorSdk2V2$TrackAsset.class;
       if (PatchProxy.isSupport(trackAsset) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, trackAsset, "10")) {
          return;
       }
       this.mMainClip.setAssetSpeed(p0);
       return;
    }
    public void setAssetTransform(Minecraft$AssetTransform p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$TrackAsset.class, "31")) {
          return;
       }
       this.mMainClip.setAssetTransform(p0);
       return;
    }
    public void setAssetTransformFlag(int p0){
       EditorSdk2V2$TrackAsset trackAsset = EditorSdk2V2$TrackAsset.class;
       if (PatchProxy.isSupport(trackAsset) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, trackAsset, "51")) {
          return;
       }
       this.mMainClip.setAssetTransformFlag(p0);
       return;
    }
    public void setAudioFilterParam(Minecraft$AudioFilterParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$TrackAsset.class, "25")) {
          return;
       }
       ErrorStatus uErrorStatus = new ErrorStatus();
       Minecraft$AudioFilterParam uAudioFilter = this.audioFilterParam();
       String str = null;
       String str1 = (uAudioFilter == null)? str: uAudioFilter.effectId();
       if (!MinecraftUtils.InsertOrUpdateOrDeleteEffectIntoItem(p0, str, str1, this.mMainClip, uErrorStatus)) {
          EditorSdkLogger.e("[TrackAsset][setAudioFilterParam] failed : "+MinecraftUtils.GetEffectId(p0)+"error : "+uErrorStatus.description());
       }
       return;
    }
    public void setBeautyFilter(Minecraft$BeautyFilterParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$TrackAsset.class, "17")) {
          return;
       }
       ErrorStatus uErrorStatus = new ErrorStatus();
       Minecraft$BeautyFilterParam uBeautyFilte = this.beautyFilter();
       String str = null;
       StringBuilder str1 = (uBeautyFilte == null)? str: uBeautyFilte.effectId();
       if (!MinecraftUtils.InsertOrUpdateOrDeleteEffectIntoItem(p0, str, str1, this.mMainClip, uErrorStatus)) {
          str1 = "[TrackAsset][setColorFilter] failed : ";
          String str2 = (p0 == null)? "": p0.effectId();
          EditorSdkLogger.e(str1+str2+"error : "+uErrorStatus.description());
       }
       return;
    }
    public void setChromakeyConfig(Minecraft$ChromaKeyConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$TrackAsset.class, "75")) {
          return;
       }
       ErrorStatus uErrorStatus = new ErrorStatus();
       Minecraft$ChromaKeyConfig uChromaKeyCo = this.chromakeyConfig();
       String str = null;
       String str1 = (uChromaKeyCo == null)? str: uChromaKeyCo.effectId();
       if (!MinecraftUtils.InsertOrUpdateOrDeleteEffectIntoItem(p0, str, str1, this.mMainClip, uErrorStatus)) {
          EditorSdkLogger.e("[TrackAsset][setChromakeyConfig] failed : "+MinecraftUtils.GetEffectId(p0)+"error : "+uErrorStatus.description());
       }
       return;
    }
    public void setClippedRange(EditorSdk2V2$TimeRangeV2 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$TrackAsset.class, "8")) {
          return;
       }
       this.mMainClip.setSourceRange(MinecraftUtils.CreateMinecraftTimeRangeV2FromEditor(p0));
       return;
    }
    public void setColorFilter(Minecraft$ColorFilterParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$TrackAsset.class, "15")) {
          return;
       }
       ErrorStatus uErrorStatus = new ErrorStatus();
       Minecraft$ColorFilterParam uColorFilter = this.colorFilter();
       String str = null;
       StringBuilder str1 = (uColorFilter == null)? str: uColorFilter.effectId();
       if (!MinecraftUtils.InsertOrUpdateOrDeleteEffectIntoItem(p0, str, str1, this.mMainClip, uErrorStatus)) {
          str1 = "[TrackAsset][setColorFilter] failed : ";
          String str2 = (p0 == null)? "": p0.effectId();
          EditorSdkLogger.e(str1+str2+"error : "+uErrorStatus.description());
       }
       return;
    }
    public void setCropOptions(Minecraft$CropOptions p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$TrackAsset.class, "37")) {
          return;
       }
       this.mMainClip.setCropOptions(p0);
       return;
    }
    public void setCutoutParam(Minecraft$YKitCutoutParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$TrackAsset.class, "77")) {
          return;
       }
       ErrorStatus uErrorStatus = new ErrorStatus();
       Minecraft$YKitCutoutParam yKitCutoutPa = this.cutoutParam();
       String str = null;
       String str1 = (yKitCutoutPa == null)? str: yKitCutoutPa.effectId();
       if (!MinecraftUtils.InsertOrUpdateOrDeleteEffectIntoItem(p0, str, str1, this.mMainClip, uErrorStatus)) {
          EditorSdkLogger.e("[TrackAsset][setCutoutParam] failed : "+MinecraftUtils.GetEffectId(p0)+"error : "+uErrorStatus.description());
       }
       return;
    }
    public void setDisableRecyclePlay(boolean p0){
       EditorSdk2V2$TrackAsset trackAsset = EditorSdk2V2$TrackAsset.class;
       if (PatchProxy.isSupport(trackAsset) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, trackAsset, "81")) {
          return;
       }
       this.mMainClip.setIsRepeat((p0 ^ 0x01));
       return;
    }
    public void setImproveHighResolutionUpscaleQuality(boolean p0){
       EditorSdk2V2$TrackAsset trackAsset = EditorSdk2V2$TrackAsset.class;
       if (PatchProxy.isSupport(trackAsset) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, trackAsset, "65")) {
          return;
       }
       this.mMainClip.setImproveHighResolutionUpscaleQuality(p0);
       return;
    }
    public void setIsBackgroundVideo(boolean p0){
       this.mIsBackgroundVideo = p0;
    }
    public void setIsReversed(boolean p0){
       EditorSdk2V2$TrackAsset trackAsset = EditorSdk2V2$TrackAsset.class;
       if (PatchProxy.isSupport(trackAsset) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, trackAsset, "29")) {
          return;
       }
       this.mMainClip.setIsReversed(p0);
       return;
    }
    public void setIsVocal(boolean p0){
       this.mIsVocal = p0;
    }
    public void setMoreOverlappedAE2Effects(Minecraft$LegacyAE2Effect[] p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$TrackAsset.class, "47")) {
          return;
       }
       this.clearMoreOverlappedAE2Effects();
       if (p0 == null) {
          return;
       }
       ErrorStatus uErrorStatus = new ErrorStatus();
       int len = p0.length;
       int i = 0;
       while (i < len) {
          object oobject = p0[i];
          if (oobject != null) {
             MinecraftUtils.FillEffectFields(oobject);
             oobject.setRole(6);
             b = this.mMainClip.appendEffect(oobject, uErrorStatus);
          }else {
             b = true;
          }
          if (!b) {
             StringBuilder str = "[KSETrackAssetV2][setMoreOverlappedAE2Effects] fail effectId:";
             String str1 = (oobject != null)? oobject.effectId(): "\(effect==null\)";
             EditorSdkLogger.e(str+str1+" desc:"+uErrorStatus.description());
          }
          i = i + 1;
       }
       return;
    }
    public void setMoreWesterosFaceMagicParams(ImmutableArray p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$TrackAsset.class, "60")) {
          return;
       }
       this.setMoreWesterosFaceMagicParams(p0.toNormalArray());
       return;
    }
    public void setMoreWesterosFaceMagicParams(Minecraft$WesterosFaceMagicParam[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$TrackAsset.class, "61")) {
          return;
       }
       Iterator iterator = this.moreWesterosFaceMagicParams().iterator();
       while (iterator.hasNext()) {
          Minecraft$WesterosFaceMagicParam westerosFace = iterator.next();
          ErrorStatus uErrorStatus = new ErrorStatus();
          if (!this.mMainClip.deleteEffect(westerosFace.effectId(), uErrorStatus)) {
             EditorSdkLogger.e("[TrackAsset][setMoreWesterosFaceMagicParams] fail delete effectId : "+MinecraftUtils.GetEffectId(westerosFace)+"error : "+uErrorStatus.description());
          }
       }
       int len = p0.length;
       int i = 0;
       while (i < len) {
          object oobject = p0[i];
          oobject.setRole(6);
          MinecraftUtils.FillEffectFields(oobject);
          ErrorStatus uErrorStatus1 = new ErrorStatus();
          if (!this.mMainClip.appendEffect(oobject, uErrorStatus1)) {
             EditorSdkLogger.e("[TrackAsset][setMoreWesterosFaceMagicParams] fail appendEffect : "+MinecraftUtils.GetEffectId(oobject)+"error : "+uErrorStatus1.description());
          }
          i = i + 1;
       }
       return;
    }
    public void setOverlappedAE2Effects(Minecraft$LegacyAE2Effect[] p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$TrackAsset.class, "43")) {
          return;
       }
       this.clearOverlappedAE2Effects();
       if (p0 == null) {
          return;
       }
       ErrorStatus uErrorStatus = new ErrorStatus();
       int len = p0.length;
       int i = 0;
       while (i < len) {
          object oobject = p0[i];
          if (oobject != null) {
             MinecraftUtils.FillEffectFields(oobject);
             oobject.setRole(6);
             b = MinecraftUtils.InsertOrUpdateOrDeleteEffectIntoItem(oobject, "overlappedAE2EffectOnVideoEditorProjectV2", null, this.mMainClip, uErrorStatus);
          }else {
             b = true;
          }
          if (!b) {
             StringBuilder str = "[KSETrackAssetV2][setOverlappedAE2Effects] fail effectId:";
             String str1 = (oobject != null)? oobject.effectId(): "\(effect==null\)";
             EditorSdkLogger.e(str+str1+" desc:"+uErrorStatus.description());
          }
          i = i + 1;
       }
       return;
    }
    public void setPaddingAreaOptions(Minecraft$PaddingAreaOptions p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$TrackAsset.class, "35")) {
          return;
       }
       ErrorStatus uErrorStatus = new ErrorStatus();
       Minecraft$PaddingAreaOptions paddingAreaO = this.paddingAreaOptions();
       String str = null;
       String str1 = (paddingAreaO == null)? str: paddingAreaO.effectId();
       if (!MinecraftUtils.InsertOrUpdateOrDeleteEffectIntoItem(p0, str, str1, this.mMainClip, uErrorStatus)) {
          EditorSdkLogger.e("[TrackAsset][setColorFilter] failed : "+MinecraftUtils.GetEffectId(p0)+"error : "+uErrorStatus.description());
       }
       return;
    }
    public void setPictureAdjustmentParam(Minecraft$PictureAdjustmentParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$TrackAsset.class, "39")) {
          return;
       }
       ErrorStatus uErrorStatus = new ErrorStatus();
       Minecraft$PictureAdjustmentParam pictureAdjus = this.pictureAdjustmentParam();
       String str = null;
       String str1 = (pictureAdjus == null)? str: pictureAdjus.effectId();
       if (!MinecraftUtils.InsertOrUpdateOrDeleteEffectIntoItem(p0, str, str1, this.mMainClip, uErrorStatus)) {
          EditorSdkLogger.e("[TrackAsset][setPictureAdjustmentParam] failed : "+MinecraftUtils.GetEffectId(p0)+"error : "+uErrorStatus.description());
       }
       return;
    }
    public void setPositioningMethod(int p0){
       EditorSdk2V2$TrackAsset trackAsset = EditorSdk2V2$TrackAsset.class;
       if (PatchProxy.isSupport(trackAsset) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, trackAsset, "27")) {
          return;
       }
       this.mMainClip.setPositioningMethod(p0);
       return;
    }
    public void setProbedAssetFile(EditorSdk2$ProbedFile p0){
       this.mProbedAssetFile = p0;
    }
    public void setRotationDeg(int p0){
       EditorSdk2V2$TrackAsset trackAsset = EditorSdk2V2$TrackAsset.class;
       if (PatchProxy.isSupport(trackAsset) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, trackAsset, "23")) {
          return;
       }
       this.mMainClip.setRotationDeg(p0);
       return;
    }
    public void setTextEffect(Minecraft$TextEffect p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$TrackAsset.class, "79")) {
          return;
       }
       ErrorStatus uErrorStatus = new ErrorStatus();
       Minecraft$TextEffect textEffect = this.textEffect();
       String str = null;
       String str1 = (textEffect == null)? str: textEffect.effectId();
       if (!MinecraftUtils.InsertOrUpdateOrDeleteEffectIntoItem(p0, str, str1, this.mMainClip, uErrorStatus)) {
          EditorSdkLogger.e("[TrackAsset][setColorFilter] failed : "+MinecraftUtils.GetEffectId(p0)+"error : "+uErrorStatus.description());
       }
       return;
    }
    public void setTimeMap(Minecraft$TimeMapParams p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$TrackAsset.class, "69")) {
          return;
       }
       this.mMainClip.setTimeMap(p0);
       return;
    }
    public void setTransitionParam(Minecraft$TransitionParam p0){
       this.mTransitionParam = p0;
    }
    public void setVisualEffects(ImmutableArray p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$TrackAsset.class, "55")) {
          return;
       }
       this.setVisualEffects(p0.toNormalArray());
       return;
    }
    public void setVisualEffects(Minecraft$VisualEffectParam[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$TrackAsset.class, "56")) {
          return;
       }
       Iterator iterator = this.visualEffects().iterator();
       while (iterator.hasNext()) {
          Minecraft$VisualEffectParam visualEffect = iterator.next();
          ErrorStatus uErrorStatus = new ErrorStatus();
          if (!this.mMainClip.deleteEffect(visualEffect.effectId(), uErrorStatus)) {
             EditorSdkLogger.e("[TrackAsset][setVisualEffects] fail delete effectId : "+MinecraftUtils.GetEffectId(visualEffect)+"error : "+uErrorStatus.description());
          }
       }
       int len = p0.length;
       int i = 0;
       while (i < len) {
          object oobject = p0[i];
          ErrorStatus uErrorStatus1 = new ErrorStatus();
          if (!this.mMainClip.appendEffect(oobject, uErrorStatus1)) {
             EditorSdkLogger.e("[TrackAsset][setVisualEffects] fail appendEffect : "+MinecraftUtils.GetEffectId(oobject)+"error : "+uErrorStatus1.description());
          }
          i = i + 1;
       }
       return;
    }
    public void setVolume(double p0){
       EditorSdk2V2$TrackAsset trackAsset = EditorSdk2V2$TrackAsset.class;
       if (PatchProxy.isSupport(trackAsset) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, trackAsset, "13")) {
          return;
       }
       Minecraft$AudioVolumeRangeParam uAudioVolume = new Minecraft$AudioVolumeRangeParam();
       uAudioVolume.setVolume(p0);
       ErrorStatus uErrorStatus = new ErrorStatus();
       Minecraft$AudioVolumeRangeParam uAudioVolume1 = this.volumeOfAudioVolumeRangeParam();
       String str = (uAudioVolume1 == null)? null: uAudioVolume1.effectId();
       if (!MinecraftUtils.InsertOrUpdateOrDeleteEffectIntoItem(uAudioVolume, "volumeOfAudioVolumeRangeEffectOnTrackAssetV2OrAudioAssetV2", str, this.mMainClip, uErrorStatus)) {
          EditorSdkLogger.e("[TrackAsset][setVolume] error : "+uErrorStatus.description());
       }
       return;
    }
    public void setWesterosBeautyFilterParam(Minecraft$WesterosBeautyFilterParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$TrackAsset.class, "41")) {
          return;
       }
       ErrorStatus uErrorStatus = new ErrorStatus();
       Minecraft$WesterosBeautyFilterParam westerosBeau = this.westerosBeautyFilterParam();
       String str = null;
       String str1 = (westerosBeau == null)? str: westerosBeau.effectId();
       if (!MinecraftUtils.InsertOrUpdateOrDeleteEffectIntoItem(p0, str, str1, this.mMainClip, uErrorStatus)) {
          EditorSdkLogger.e("[TrackAsset][setWesterosBeautyFilterParam] failed : "+MinecraftUtils.GetEffectId(p0)+"error : "+uErrorStatus.description());
       }
       return;
    }
    public void setWesterosBodySlimmingParam(Minecraft$WesterosBodySlimmingParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$TrackAsset.class, "73")) {
          return;
       }
       ErrorStatus uErrorStatus = new ErrorStatus();
       Minecraft$WesterosBodySlimmingParam westerosBody = this.westerosBodySlimmingParam();
       String str = null;
       String str1 = (westerosBody == null)? str: westerosBody.effectId();
       if (!MinecraftUtils.InsertOrUpdateOrDeleteEffectIntoItem(p0, str, str1, this.mMainClip, uErrorStatus)) {
          EditorSdkLogger.e("[TrackAsset][setWesterosFaceMagicParam] failed : "+MinecraftUtils.GetEffectId(p0)+"error : "+uErrorStatus.description());
       }
       return;
    }
    public void setWesterosFaceDetectMode(int p0){
       EditorSdk2V2$TrackAsset trackAsset = EditorSdk2V2$TrackAsset.class;
       if (PatchProxy.isSupport(trackAsset) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, trackAsset, "67")) {
          return;
       }
       this.mMainClip.setWesterosFaceDetectMode(p0);
       return;
    }
    public void setWesterosFaceMagicParam(Minecraft$WesterosFaceMagicParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$TrackAsset.class, "53")) {
          return;
       }
       ErrorStatus uErrorStatus = new ErrorStatus();
       Minecraft$WesterosFaceMagicParam westerosFace = this.westerosFaceMagicParam();
       String str = null;
       String str1 = (westerosFace == null)? str: westerosFace.effectId();
       p0.setRole(6);
       MinecraftUtils.FillEffectFields(p0);
       if (!MinecraftUtils.InsertOrUpdateOrDeleteEffectIntoItem(p0, str, str1, this.mMainClip, uErrorStatus)) {
          EditorSdkLogger.e("[TrackAsset][setWesterosFaceMagicParam] failed : "+MinecraftUtils.GetEffectId(p0)+"error : "+uErrorStatus.description());
       }
       return;
    }
    public void setWesterosMakeupParam(Minecraft$WesterosMakeupParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$TrackAsset.class, "71")) {
          return;
       }
       ErrorStatus uErrorStatus = new ErrorStatus();
       Minecraft$WesterosMakeupParam westerosMake = this.westerosMakeupParam();
       String str = null;
       String str1 = (westerosMake == null)? str: westerosMake.effectId();
       if (!MinecraftUtils.InsertOrUpdateOrDeleteEffectIntoItem(p0, str, str1, this.mMainClip, uErrorStatus)) {
          EditorSdkLogger.e("[TrackAsset][setWesterosMakeupParam] failed : "+MinecraftUtils.GetEffectId(p0)+"error : "+uErrorStatus.description());
       }
       return;
    }
    public Minecraft$TextEffect textEffect(){
       Object[] objArray = null;
       ArrayList obj = PatchProxy.apply(objArray, this, EditorSdk2V2$TrackAsset.class, "78");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = MinecraftUtils.FilterEffects(this.mMainClip.effects().getArrayList(), Minecraft$TextEffect.class, objArray);
       if (obj.size() > 1) {
          EditorSdkLogger.e("[TrackAsset][paddingAreaOptions] count > 1");
          return objArray;
       }else if(!obj.isEmpty()){
          return obj.get(0);
       }else {
          return objArray;
       }
    }
    public Minecraft$TimeMapParams timeMap(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2V2$TrackAsset.class, "68");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mMainClip.timeMap();
    }
    public Minecraft$TransitionParam transitionParam(){
       return this.mTransitionParam;
    }
    public ImmutableArray visualEffects(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, EditorSdk2V2$TrackAsset.class, "54");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ImmutableArray(MinecraftUtils.FilterEffects(this.mMainClip.effects().getArrayList(), Minecraft$VisualEffectParam.class, objArray), Minecraft$VisualEffectParam.class);
    }
    public Minecraft$VisualEffectParam visualEffects(int p0){
       EditorSdk2V2$TrackAsset trackAsset = EditorSdk2V2$TrackAsset.class;
       if (PatchProxy.isSupport(trackAsset)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, trackAsset, "58");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.visualEffects(p0);
    }
    public int visualEffectsSize(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2V2$TrackAsset.class, "57");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.visualEffects().size();
    }
    public double volume(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2V2$TrackAsset.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       double d = 0x3ff0000000000000;
       Minecraft$AudioVolumeRangeParam uAudioVolume = this.volumeOfAudioVolumeRangeParam();
       if (uAudioVolume != null) {
          d = uAudioVolume.volume();
       }
       return d;
    }
    public final Minecraft$AudioVolumeRangeParam volumeOfAudioVolumeRangeParam(){
       Object[] objArray = null;
       ArrayList obj = PatchProxy.apply(objArray, this, EditorSdk2V2$TrackAsset.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = MinecraftUtils.FilterEffects(this.mMainClip.effects().getArrayList(), Minecraft$AudioVolumeRangeParam.class, "volumeOfAudioVolumeRangeEffectOnTrackAssetV2OrAudioAssetV2");
       if (obj.size() > 1) {
          EditorSdkLogger.e("[TrackAsset][volumeOfAudioVolumeRangeParam] count > 1");
          return objArray;
       }else if(!obj.isEmpty()){
          return obj.get(0);
       }else {
          return objArray;
       }
    }
    public Minecraft$WesterosBeautyFilterParam westerosBeautyFilterParam(){
       Object[] objArray = null;
       ArrayList obj = PatchProxy.apply(objArray, this, EditorSdk2V2$TrackAsset.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = MinecraftUtils.FilterEffects(this.mMainClip.effects().getArrayList(), Minecraft$WesterosBeautyFilterParam.class, objArray);
       if (obj.size() > 1) {
          EditorSdkLogger.e("[TrackAsset][westerosBeautyFilterParam] count > 1");
          return objArray;
       }else if(!obj.isEmpty()){
          return obj.get(0);
       }else {
          return objArray;
       }
    }
    public Minecraft$WesterosBodySlimmingParam westerosBodySlimmingParam(){
       Object[] objArray = null;
       ArrayList obj = PatchProxy.apply(objArray, this, EditorSdk2V2$TrackAsset.class, "72");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = MinecraftUtils.FilterEffects(this.mMainClip.effects().getArrayList(), Minecraft$WesterosBodySlimmingParam.class, objArray);
       if (obj.size() > 1) {
          EditorSdkLogger.e("[TrackAsset][westerosBodySlimmingParam] count > 1");
          return objArray;
       }else if(!obj.isEmpty()){
          return obj.get(0);
       }else {
          return objArray;
       }
    }
    public int westerosFaceDetectMode(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2V2$TrackAsset.class, "66");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mMainClip.westerosFaceDetectMode();
    }
    public Minecraft$WesterosFaceMagicParam westerosFaceMagicParam(){
       Object[] objArray = null;
       ArrayList obj = PatchProxy.apply(objArray, this, EditorSdk2V2$TrackAsset.class, "52");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = MinecraftUtils.FilterEffects(this.mMainClip.effects().getArrayList(), Minecraft$WesterosFaceMagicParam.class, "westerosFaceMagicParamEffectOnTrackAssetV2");
       if (obj.size() > 1) {
          EditorSdkLogger.e("[TrackAsset][westerosFaceMagicParam] count > 1");
          return objArray;
       }else if(!obj.isEmpty()){
          return obj.get(0);
       }else {
          return objArray;
       }
    }
    public Minecraft$WesterosMakeupParam westerosMakeupParam(){
       Object[] objArray = null;
       ArrayList obj = PatchProxy.apply(objArray, this, EditorSdk2V2$TrackAsset.class, "70");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = MinecraftUtils.FilterEffects(this.mMainClip.effects().getArrayList(), Minecraft$WesterosMakeupParam.class, objArray);
       if (obj.size() > 1) {
          EditorSdkLogger.e("[TrackAsset][westerosMakeupParam] count > 1");
          return objArray;
       }else if(!obj.isEmpty()){
          return obj.get(0);
       }else {
          return objArray;
       }
    }
}
