package com.kwai.video.minecraft.model.EditorSdk2V2$AnimatedSubAsset;
import com.kwai.video.editorsdk2.model.ModelBase;
import com.kwai.video.minecraft.model.nano.Minecraft$KSAVClip;
import java.lang.String;
import com.kwai.video.minecraft.MinecraftUtils;
import com.kwai.video.minecraft.model.nano.Minecraft$AudioVideoReference;
import com.kwai.video.minecraft.model.MutableMediaReference;
import com.kwai.video.minecraft.model.MutableClip;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.video.editorsdk2.logger.EditorSdkLogger;
import com.kwai.video.minecraft.model.MediaReference;
import com.kwai.video.minecraft.model.nano.Minecraft$StickerReference;
import com.kwai.video.minecraft.model.nano.Minecraft$ChromaKeyConfig;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import com.kwai.video.minecraft.model.MutableItem;
import java.util.ArrayList;
import com.kwai.video.minecraft.model.nano.Minecraft$ClipBodyParam;
import com.kwai.video.minecraft.model.EditorSdk2V2$TimeRangeV2;
import com.kwai.video.minecraft.model.TimeRange;
import com.kwai.video.minecraft.model.ErrorStatus;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ProbedFile;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$TimeRange;
import com.kwai.video.minecraft.model.nano.Minecraft$ColorFilterParam;
import com.kwai.video.minecraft.model.nano.Minecraft$CropOptions;
import com.kwai.video.minecraft.model.nano.Minecraft$YKitCutoutParam;
import java.lang.Boolean;
import com.kwai.video.minecraft.model.nano.Minecraft$InputFileOptions;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.StringBuilder;
import com.kwai.video.minecraft.model.nano.Minecraft$AnimatedImageSlice;
import java.lang.Integer;
import com.kwai.video.minecraft.model.nano.Minecraft$PropertyKeyFrame;
import java.util.Iterator;
import com.kwai.video.minecraft.model.Effect;
import java.util.Set;
import com.kwai.video.minecraft.model.nano.Minecraft$WesterosFaceMagicParam;
import com.kwai.video.minecraft.model.nano.Minecraft$PictureAdjustmentParam;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$EditorSdkError;
import java.lang.Long;
import com.kwai.video.minecraft.model.MutableEffect;
import com.kwai.video.minecraft.model.nano.Minecraft$TimeMapParams;
import com.kwai.video.minecraft.model.nano.Minecraft$WesterosBeautyFilterParam;
import com.kwai.video.minecraft.model.nano.Minecraft$WesterosBodySlimmingParam;
import com.kwai.video.minecraft.model.nano.Minecraft$WesterosMakeupParam;

public final class EditorSdk2V2$AnimatedSubAsset extends ModelBase	// class@0009f0
{
    public EditorSdk2$TimeRange mDisplayRange;
    public String mExternalAssetId;
    public int mFileType;
    public Minecraft$KSAVClip mMainClip;
    public boolean mNotRenderInThumbnail;
    public String mOpaque;
    public EditorSdk2$ProbedFile mProbedAssetFile;

    public void EditorSdk2V2$AnimatedSubAsset(){
       super();
       this.mExternalAssetId = "";
       Minecraft$KSAVClip kSAVClip = new Minecraft$KSAVClip();
       this.mMainClip = kSAVClip;
       kSAVClip.setAeRefId(MinecraftUtils.GetMinecraftID());
       this.mMainClip.setMediaReference(new Minecraft$AudioVideoReference());
    }
    public void EditorSdk2V2$AnimatedSubAsset(int p0){
       super();
       this.mExternalAssetId = "";
       Minecraft$KSAVClip kSAVClip = new Minecraft$KSAVClip();
       this.mMainClip = kSAVClip;
       kSAVClip.setAeRefId(MinecraftUtils.GetMinecraftID());
       this.mFileType = p0;
       this.resetMediaReference();
    }
    public int alphaInfo(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2V2$AnimatedSubAsset.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       if (this.fileType() == 4) {
          EditorSdkLogger.e("[AnimatedSubAsset][alphaInfo] has no alphaInfo fileType");
       }else {
          i = this.mMainClip.mutableMediaReference().alphaInfo();
       }
       return i;
    }
    public long assetId(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2V2$AnimatedSubAsset.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return MinecraftUtils.ParseMinecraftID(this.mMainClip.clipId());
    }
    public String assetPath(){
       Object[] objArray = null;
       MutableMediaReference obj = PatchProxy.apply(objArray, this, EditorSdk2V2$AnimatedSubAsset.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mMainClip.mutableMediaReference();
       if (obj instanceof Minecraft$AudioVideoReference) {
          objArray = this.mMainClip.mediaReference().filePath();
       }else if(obj instanceof Minecraft$StickerReference){
          objArray = this.mMainClip.mutableMediaReference().assetPath();
       }
       return objArray;
    }
    public int assetTransformFlag(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2V2$AnimatedSubAsset.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mMainClip.assetTransformFlag();
    }
    public Minecraft$ChromaKeyConfig chromakeyConfig(){
       Object[] objArray = null;
       ArrayList obj = PatchProxy.apply(objArray, this, EditorSdk2V2$AnimatedSubAsset.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = MinecraftUtils.FilterEffects(this.mMainClip.effects().getArrayList(), Minecraft$ChromaKeyConfig.class, objArray);
       if (obj.size() > 1) {
          EditorSdkLogger.e("[AnimatedSubAsset][chromakeyConfig] count > 1");
          return objArray;
       }else if(!obj.isEmpty()){
          return obj.get(0);
       }else {
          return objArray;
       }
    }
    public final Minecraft$ClipBodyParam clipBodyParam(){
       Object[] objArray = null;
       ArrayList obj = PatchProxy.apply(objArray, this, EditorSdk2V2$AnimatedSubAsset.class, "52");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = MinecraftUtils.FilterEffects(this.mMainClip.effects().getArrayList(), Minecraft$ClipBodyParam.class, objArray);
       if (obj.size() > 1) {
          EditorSdkLogger.e("[AnimatedSubAsset][ClipBodyParam] count > 1");
          return objArray;
       }else if(!obj.isEmpty()){
          return obj.get(0);
       }else {
          return objArray;
       }
    }
    public int clipBodyType(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2V2$AnimatedSubAsset.class, "53");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       Minecraft$ClipBodyParam uClipBodyPar = this.clipBodyParam();
       if (uClipBodyPar != null) {
          i = uClipBodyPar.clipBodyType();
       }
       return i;
    }
    public EditorSdk2V2$TimeRangeV2 clippedRange(){
       TimeRange obj = PatchProxy.apply(null, this, EditorSdk2V2$AnimatedSubAsset.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.mMainClip.sourceRange() == null)? this.mMainClip.availableRange(null): this.mMainClip.sourceRange();
       return MinecraftUtils.CreateEditorTimeRangeV2FromMinecraft(obj);
    }
    public EditorSdk2V2$AnimatedSubAsset clone(){
       Object[] objArray = null;
       EditorSdk2V2$AnimatedSubAsset obj = PatchProxy.apply(objArray, this, EditorSdk2V2$AnimatedSubAsset.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new EditorSdk2V2$AnimatedSubAsset();
       obj.mMainClip = this.mMainClip.clone();
       EditorSdk2V2$AnimatedSubAsset tmProbedAsse = this.mProbedAssetFile;
       Object[] objArray1 = (tmProbedAsse == null)? objArray: tmProbedAsse.clone();
       obj.mProbedAssetFile = objArray1;
       obj.mFileType = this.mFileType;
       tmProbedAsse = this.mDisplayRange;
       if (tmProbedAsse != null) {
          objArray = tmProbedAsse.clone();
       }
       obj.mDisplayRange = objArray;
       obj.mNotRenderInThumbnail = this.mNotRenderInThumbnail;
       obj.mOpaque = this.mOpaque;
       obj.mExternalAssetId = this.mExternalAssetId;
       return obj;
    }
    public Object clone(){
       return this.clone();
    }
    public Minecraft$ColorFilterParam colorFilter(){
       Object[] objArray = null;
       ArrayList obj = PatchProxy.apply(objArray, this, EditorSdk2V2$AnimatedSubAsset.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = MinecraftUtils.FilterEffects(this.mMainClip.effects().getArrayList(), Minecraft$ColorFilterParam.class, objArray);
       if (obj.size() > 1) {
          EditorSdkLogger.e("[AnimatedSubAsset][colorFilter] count > 1");
          return objArray;
       }else if(!obj.isEmpty()){
          return obj.get(0);
       }else {
          return objArray;
       }
    }
    public Minecraft$CropOptions cropOptions(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2V2$AnimatedSubAsset.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mMainClip.cropOptions();
    }
    public Minecraft$YKitCutoutParam cutoutParam(){
       Object[] objArray = null;
       ArrayList obj = PatchProxy.apply(objArray, this, EditorSdk2V2$AnimatedSubAsset.class, "63");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = MinecraftUtils.FilterEffects(this.mMainClip.effects().getArrayList(), Minecraft$YKitCutoutParam.class, objArray);
       if (obj.size() > 1) {
          EditorSdkLogger.e("[AnimatedSubAsset][cutoutParam] count > 1");
          return objArray;
       }else if(!obj.isEmpty()){
          return obj.get(0);
       }else {
          return objArray;
       }
    }
    public long dataId(){
       return 0;
    }
    public boolean disableRecyclePlay(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2V2$AnimatedSubAsset.class, "61");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.mMainClip.isRepeat() ^ 0x01);
    }
    public EditorSdk2$TimeRange displayRange(){
       return this.mDisplayRange;
    }
    public String externalAssetId(){
       return this.mExternalAssetId;
    }
    public Minecraft$InputFileOptions fileDecodeOptions(){
       Minecraft$InputFileOptions obj = PatchProxy.apply(null, this, EditorSdk2V2$AnimatedSubAsset.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Minecraft$InputFileOptions();
       MutableMediaReference mutableMedia = this.mMainClip.mutableMediaReference();
       if (mutableMedia instanceof Minecraft$AudioVideoReference) {
          obj = this.mMainClip.mediaReference().fileOptions();
       }else if(mutableMedia instanceof Minecraft$StickerReference){
          obj = this.mMainClip.mutableMediaReference().fileDecodeOptions();
       }else {
          Object[] objArray = new Object[]{mutableMedia.toString()};
          EditorSdkLogger.e(String.format("[KSEAnimatedSubAssetV2][setAssetPath] unknown reference type:%s", objArray));
       }
       return obj;
    }
    public int fileType(){
       return this.mFileType;
    }
    public Minecraft$KSAVClip getMainClip(){
       return this.mMainClip;
    }
    public ImmutableArray imageSlices(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2V2$AnimatedSubAsset.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.fileType() == 4) {
          return this.mMainClip.mutableMediaReference().imageSlices();
       }
       EditorSdkLogger.e("[AnimatedSubAsset][imageSlices] has no imageSlices fileType : "+this.fileType());
       return null;
    }
    public Minecraft$AnimatedImageSlice imageSlices(int p0){
       EditorSdk2V2$AnimatedSubAsset uAnimatedSub = EditorSdk2V2$AnimatedSubAsset.class;
       if (PatchProxy.isSupport(uAnimatedSub)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uAnimatedSub, "33");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.fileType() == 4) {
          return this.mMainClip.mutableMediaReference().imageSlices().get(p0);
       }else {
          EditorSdkLogger.e("[AnimatedSubAsset][imageSlices] has no imageSlices fileType : "+this.fileType());
          return null;
       }
    }
    public void imageSlicesSetItem(int p0,Minecraft$AnimatedImageSlice p1){
       EditorSdk2V2$AnimatedSubAsset uAnimatedSub = EditorSdk2V2$AnimatedSubAsset.class;
       if (PatchProxy.isSupport(uAnimatedSub) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uAnimatedSub, "34")) {
          return;
       }
       if (this.fileType() == 4) {
          Minecraft$StickerReference stickerRefer = this.mMainClip.mutableMediaReference();
          ArrayList arrayList = stickerRefer.imageSlices().getArrayList();
          arrayList.set(p0, p1);
          stickerRefer.setImageSlices(new ImmutableArray(arrayList, Minecraft$AnimatedImageSlice.class));
       }else {
          EditorSdkLogger.e("[AnimatedSubAsset][imageSlices] has no imageSlices fileType : "+this.fileType());
       }
       return;
    }
    public int imageSlicesSize(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2V2$AnimatedSubAsset.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.fileType() == 4) {
          return this.mMainClip.mutableMediaReference().imageSlices().size();
       }
       EditorSdkLogger.e("[AnimatedSubAsset][imageSlices] has no imageSlices fileType : "+this.fileType());
       return 0;
    }
    public boolean isReversed(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2V2$AnimatedSubAsset.class, "59");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mMainClip.isReversed();
    }
    public ImmutableArray keyFrames(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2V2$AnimatedSubAsset.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mMainClip.propertyKeyFrames();
    }
    public Minecraft$PropertyKeyFrame keyFrames(int p0){
       EditorSdk2V2$AnimatedSubAsset uAnimatedSub = EditorSdk2V2$AnimatedSubAsset.class;
       if (PatchProxy.isSupport(uAnimatedSub)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uAnimatedSub, "13");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.keyFrames().get(p0);
    }
    public int keyFramesSize(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2V2$AnimatedSubAsset.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.keyFrames().size();
    }
    public boolean loadAssetPath(String p0,int p1){
       EditorSdk2V2$AnimatedSubAsset uAnimatedSub = EditorSdk2V2$AnimatedSubAsset.class;
       if (PatchProxy.isSupport(uAnimatedSub)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uAnimatedSub, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p0.equals(this.assetPath()) && p1 == this.mFileType) {
          return true;
       }else if(p1 != this.mFileType){
          this.mFileType = p1;
          this.resetMediaReference();
       }
       this.setAssetPath(p0);
       return true;
    }
    public ImmutableArray moreWesterosFaceMagicParams(){
       ArrayList obj = PatchProxy.apply(null, this, EditorSdk2V2$AnimatedSubAsset.class, "43");
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
       EditorSdk2V2$AnimatedSubAsset uAnimatedSub = EditorSdk2V2$AnimatedSubAsset.class;
       if (PatchProxy.isSupport(uAnimatedSub)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uAnimatedSub, "47");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.moreWesterosFaceMagicParams().get(p0);
    }
    public int moreWesterosFaceMagicParamsSize(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2V2$AnimatedSubAsset.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.moreWesterosFaceMagicParams().size();
    }
    public boolean notRenderInThumbnail(){
       return this.mNotRenderInThumbnail;
    }
    public String opaque(){
       EditorSdk2V2$AnimatedSubAsset tmOpaque = this.mOpaque;
       if (tmOpaque == null) {
          tmOpaque = "";
       }
       return tmOpaque;
    }
    public Minecraft$PictureAdjustmentParam pictureAdjustmentParam(){
       Object[] objArray = null;
       ArrayList obj = PatchProxy.apply(objArray, this, EditorSdk2V2$AnimatedSubAsset.class, "50");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = MinecraftUtils.FilterEffects(this.mMainClip.effects().getArrayList(), Minecraft$PictureAdjustmentParam.class, objArray);
       if (obj.size() > 1) {
          EditorSdkLogger.e("[AnimatedSubAsset][pictureAdjustmentParam] count > 1");
          return objArray;
       }else if(!obj.isEmpty()){
          return obj.get(0);
       }else {
          return objArray;
       }
    }
    public EditorSdk2$ProbedFile probedAssetFile(){
       return this.mProbedAssetFile;
    }
    public boolean reloadProbedFiles(boolean p0,EditorSdk2$EditorSdkError p1){
       Object[] obj;
       EditorSdk2V2$AnimatedSubAsset uAnimatedSub = EditorSdk2V2$AnimatedSubAsset.class;
       if (PatchProxy.isSupport(uAnimatedSub)) {
          obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, this, uAnimatedSub, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p0) {
          this.mProbedAssetFile = null;
       }
       EditorSdk2V2$AnimatedSubAsset tmProbedAsse = this.mProbedAssetFile;
       int i = 1;
       if (tmProbedAsse == null) {
          int i1 = MinecraftUtils.OpenAudioVideoClip(this.mMainClip, tmProbedAsse);
          if (i1) {
             obj = new Object[i];
             obj[0] = Integer.valueOf(i1);
             EditorSdkLogger.e(String.format("[AnimatedSubAssetV2][reloadProbedFile] fail:%d", obj));
             if (p1 != null) {
                p1.setCode(i1);
                p1.setMessage("Error opening AnimatedSubAsset");
             }
             return 0;
          }
       }
       return i;
    }
    public int renderType(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2V2$AnimatedSubAsset.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mMainClip.renderType();
    }
    public boolean requireClipBody(){
       return false;
    }
    public final void resetMediaReference(){
       if (PatchProxy.applyVoid(null, this, EditorSdk2V2$AnimatedSubAsset.class, "2")) {
          return;
       }
       Minecraft$StickerReference stickerRefer = (this.mFileType == 4)? new Minecraft$StickerReference(): new Minecraft$AudioVideoReference();
       this.mMainClip.setMediaReference(stickerRefer);
       return;
    }
    public void setAlphaInfo(int p0){
       EditorSdk2V2$AnimatedSubAsset uAnimatedSub = EditorSdk2V2$AnimatedSubAsset.class;
       if (PatchProxy.isSupport(uAnimatedSub) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAnimatedSub, "15")) {
          return;
       }
       if (this.fileType() == 4) {
          EditorSdkLogger.e("[AnimatedSubAsset][alphaInfo] has no alphaInfo fileType");
       }else {
          this.mMainClip.mutableMediaReference().setAlphaInfo(p0);
       }
       return;
    }
    public void setAssetId(long p0){
       EditorSdk2V2$AnimatedSubAsset uAnimatedSub = EditorSdk2V2$AnimatedSubAsset.class;
       if (PatchProxy.isSupport(uAnimatedSub) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uAnimatedSub, "6")) {
          return;
       }
       this.mMainClip.setClipId(p0);
       return;
    }
    public void setAssetPath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$AnimatedSubAsset.class, "8")) {
          return;
       }
       if (p0 == null || !p0.equals(this.assetPath())) {
          MutableMediaReference mutableMedia = this.mMainClip.mutableMediaReference();
          if (mutableMedia instanceof Minecraft$AudioVideoReference) {
             this.mMainClip.mediaReference().setFilePath(p0);
          }else if(mutableMedia instanceof Minecraft$StickerReference){
             this.mMainClip.mutableMediaReference().setAssetPath(p0);
          }else {
             Object[] objArray = new Object[]{mutableMedia.toString()};
             EditorSdkLogger.e(String.format("[KSEAnimatedSubAssetV2][setAssetPath] unknown reference type:%s", objArray));
          }
          this.mProbedAssetFile = null;
          if (p0 != null && p0.length() > 0) {
             this.reloadProbedFiles(false, null);
          }
       }
    label_005e :
       return;
    }
    public void setAssetTransformFlag(int p0){
       EditorSdk2V2$AnimatedSubAsset uAnimatedSub = EditorSdk2V2$AnimatedSubAsset.class;
       if (PatchProxy.isSupport(uAnimatedSub) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAnimatedSub, "27")) {
          return;
       }
       this.mMainClip.setAssetTransformFlag(p0);
       return;
    }
    public void setChromakeyConfig(Minecraft$ChromaKeyConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$AnimatedSubAsset.class, "21")) {
          return;
       }
       ErrorStatus uErrorStatus = new ErrorStatus();
       Minecraft$ChromaKeyConfig uChromaKeyCo = this.chromakeyConfig();
       String str = null;
       String str1 = (uChromaKeyCo == null)? str: uChromaKeyCo.effectId();
       if (!MinecraftUtils.InsertOrUpdateOrDeleteEffectIntoItem(p0, str, str1, this.mMainClip, uErrorStatus)) {
          EditorSdkLogger.e("[AnimatedSubAsset][setChromakeyConfig] failed : "+MinecraftUtils.GetEffectId(p0)+"error : "+uErrorStatus.description());
       }
       return;
    }
    public void setClipBodyType(int p0){
       EditorSdk2V2$AnimatedSubAsset uAnimatedSub = EditorSdk2V2$AnimatedSubAsset.class;
       if (PatchProxy.isSupport(uAnimatedSub) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAnimatedSub, "54")) {
          return;
       }
       Minecraft$ClipBodyParam uClipBodyPar = this.clipBodyParam();
       if (uClipBodyPar != null) {
          uClipBodyPar.setClipBodyType(p0);
       }
       return;
    }
    public void setClippedRange(EditorSdk2V2$TimeRangeV2 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$AnimatedSubAsset.class, "19")) {
          return;
       }
       this.mMainClip.setSourceRange(MinecraftUtils.CreateMinecraftTimeRangeV2FromEditor(p0));
       return;
    }
    public void setColorFilter(Minecraft$ColorFilterParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$AnimatedSubAsset.class, "38")) {
          return;
       }
       ErrorStatus uErrorStatus = new ErrorStatus();
       Minecraft$ColorFilterParam uColorFilter = this.colorFilter();
       String str = null;
       String str1 = (uColorFilter == null)? str: uColorFilter.effectId();
       if (!MinecraftUtils.InsertOrUpdateOrDeleteEffectIntoItem(p0, str, str1, this.mMainClip, uErrorStatus)) {
          EditorSdkLogger.e("[AnimatedSubAsset][setColorFilter] failed : "+MinecraftUtils.GetEffectId(p0)+"error : "+uErrorStatus.description());
       }
       return;
    }
    public void setCropOptions(Minecraft$CropOptions p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$AnimatedSubAsset.class, "23")) {
          return;
       }
       this.mMainClip.setCropOptions(p0);
       return;
    }
    public void setCutoutParam(Minecraft$YKitCutoutParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$AnimatedSubAsset.class, "64")) {
          return;
       }
       ErrorStatus uErrorStatus = new ErrorStatus();
       Minecraft$YKitCutoutParam yKitCutoutPa = this.cutoutParam();
       String str = null;
       String str1 = (yKitCutoutPa == null)? str: yKitCutoutPa.effectId();
       if (!MinecraftUtils.InsertOrUpdateOrDeleteEffectIntoItem(p0, str, str1, this.mMainClip, uErrorStatus)) {
          EditorSdkLogger.e("[AnimatedSubAsset][setCutoutParam] failed : "+MinecraftUtils.GetEffectId(p0)+"error : "+uErrorStatus.description());
       }
       return;
    }
    public void setDataId(long p0){
    }
    public void setDisableRecyclePlay(boolean p0){
       EditorSdk2V2$AnimatedSubAsset uAnimatedSub = EditorSdk2V2$AnimatedSubAsset.class;
       if (PatchProxy.isSupport(uAnimatedSub) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAnimatedSub, "62")) {
          return;
       }
       this.mMainClip.setIsRepeat((p0 ^ 0x01));
       return;
    }
    public void setDisplayRange(EditorSdk2$TimeRange p0){
       this.mDisplayRange = p0;
    }
    public void setExternalAssetId(String p0){
       this.mExternalAssetId = p0;
    }
    public void setFileDecodeOptions(Minecraft$InputFileOptions p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$AnimatedSubAsset.class, "25")) {
          return;
       }
       MutableMediaReference mutableMedia = this.mMainClip.mutableMediaReference();
       if (mutableMedia instanceof Minecraft$AudioVideoReference) {
          this.mMainClip.mediaReference().setFileOptions(p0);
       }else if(mutableMedia instanceof Minecraft$StickerReference){
          this.mMainClip.mutableMediaReference().setFileDecodeOptions(p0);
       }else {
          Object[] objArray = new Object[]{mutableMedia.toString()};
          EditorSdkLogger.e(String.format("[KSEAnimatedSubAssetV2][setAssetPath] unknown reference type:%s", objArray));
       }
       return;
    }
    public void setFileType(int p0){
       EditorSdk2V2$AnimatedSubAsset uAnimatedSub = EditorSdk2V2$AnimatedSubAsset.class;
       if (PatchProxy.isSupport(uAnimatedSub) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAnimatedSub, "28")) {
          return;
       }
       String str = this.assetPath();
       if (str != null && !str.isEmpty()) {
          this.loadAssetPath(str, p0);
       }else {
          this.mFileType = p0;
          this.resetMediaReference();
       }
       return;
    }
    public void setImageSlices(ImmutableArray p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$AnimatedSubAsset.class, "30")) {
          return;
       }
       this.setImageSlices(p0.toNormalArray());
       return;
    }
    public void setImageSlices(Minecraft$AnimatedImageSlice[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$AnimatedSubAsset.class, "31")) {
          return;
       }
       if (this.fileType() == 4) {
          this.mMainClip.mutableMediaReference().setImageSlices(p0);
       }else {
          EditorSdkLogger.e("[AnimatedSubAsset][imageSlices] has no imageSlices fileType : "+this.fileType());
       }
       return;
    }
    public void setIsReversed(boolean p0){
       EditorSdk2V2$AnimatedSubAsset uAnimatedSub = EditorSdk2V2$AnimatedSubAsset.class;
       if (PatchProxy.isSupport(uAnimatedSub) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAnimatedSub, "60")) {
          return;
       }
       this.mMainClip.setIsReversed(p0);
       return;
    }
    public void setKeyFrames(ImmutableArray p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$AnimatedSubAsset.class, "10")) {
          return;
       }
       this.setKeyFrames(p0.toNormalArray());
       return;
    }
    public void setKeyFrames(Minecraft$PropertyKeyFrame[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$AnimatedSubAsset.class, "11")) {
          return;
       }
       this.mMainClip.setPropertyKeyFrames(p0);
       return;
    }
    public void setMoreWesterosFaceMagicParams(ImmutableArray p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$AnimatedSubAsset.class, "44")) {
          return;
       }
       this.setMoreWesterosFaceMagicParams(p0.toNormalArray());
       return;
    }
    public void setMoreWesterosFaceMagicParams(Minecraft$WesterosFaceMagicParam[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$AnimatedSubAsset.class, "45")) {
          return;
       }
       Iterator iterator = this.moreWesterosFaceMagicParams().iterator();
       while (iterator.hasNext()) {
          Minecraft$WesterosFaceMagicParam westerosFace = iterator.next();
          ErrorStatus uErrorStatus = new ErrorStatus();
          if (!this.mMainClip.deleteEffect(westerosFace.effectId(), uErrorStatus)) {
             EditorSdkLogger.e("[AnimatedSubAsset][setMoreWesterosFaceMagicParams] fail delete effectId : "+MinecraftUtils.GetEffectId(westerosFace)+"error : "+uErrorStatus.description());
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
             EditorSdkLogger.e("[AnimatedSubAsset][setMoreWesterosFaceMagicParams] fail appendEffect : "+MinecraftUtils.GetEffectId(oobject)+"error : "+uErrorStatus1.description());
          }
          i = i + 1;
       }
       return;
    }
    public void setNotRenderInThumbnail(boolean p0){
       this.mNotRenderInThumbnail = p0;
    }
    public void setOpaque(String p0){
       if (p0 == null) {
          this.mOpaque = "";
       }
       this.mOpaque = p0;
       return;
    }
    public void setPictureAdjustmentParam(Minecraft$PictureAdjustmentParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$AnimatedSubAsset.class, "51")) {
          return;
       }
       ErrorStatus uErrorStatus = new ErrorStatus();
       Minecraft$PictureAdjustmentParam pictureAdjus = this.pictureAdjustmentParam();
       String str = null;
       String str1 = (pictureAdjus == null)? str: pictureAdjus.effectId();
       if (!MinecraftUtils.InsertOrUpdateOrDeleteEffectIntoItem(p0, str, str1, this.mMainClip, uErrorStatus)) {
          EditorSdkLogger.e("[AnimatedSubAsset][setPictureAdjustmentParam] failed : "+MinecraftUtils.GetEffectId(p0)+"error : "+uErrorStatus.description());
       }
       return;
    }
    public void setProbedAssetFile(EditorSdk2$ProbedFile p0){
       this.mProbedAssetFile = p0;
    }
    public void setRenderType(int p0){
       EditorSdk2V2$AnimatedSubAsset uAnimatedSub = EditorSdk2V2$AnimatedSubAsset.class;
       if (PatchProxy.isSupport(uAnimatedSub) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAnimatedSub, "17")) {
          return;
       }
       this.mMainClip.setRenderType(p0);
       return;
    }
    public void setRequireClipBody(boolean p0){
    }
    public void setTimeMap(Minecraft$TimeMapParams p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$AnimatedSubAsset.class, "36")) {
          return;
       }
       this.mMainClip.setTimeMap(p0);
       return;
    }
    public void setWesterosBeautyFilterParam(Minecraft$WesterosBeautyFilterParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$AnimatedSubAsset.class, "42")) {
          return;
       }
       ErrorStatus uErrorStatus = new ErrorStatus();
       Minecraft$WesterosBeautyFilterParam westerosBeau = this.westerosBeautyFilterParam();
       String str = null;
       String str1 = (westerosBeau == null)? str: westerosBeau.effectId();
       if (!MinecraftUtils.InsertOrUpdateOrDeleteEffectIntoItem(p0, str, str1, this.mMainClip, uErrorStatus)) {
          EditorSdkLogger.e("[AnimatedSubAsset][setWesterosBeautyFilterParam] failed : "+MinecraftUtils.GetEffectId(p0)+"error : "+uErrorStatus.description());
       }
       return;
    }
    public void setWesterosBodySlimmingParam(Minecraft$WesterosBodySlimmingParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$AnimatedSubAsset.class, "58")) {
          return;
       }
       ErrorStatus uErrorStatus = new ErrorStatus();
       Minecraft$WesterosBodySlimmingParam westerosBody = this.westerosBodySlimmingParam();
       String str = null;
       String str1 = (westerosBody == null)? str: westerosBody.effectId();
       if (!MinecraftUtils.InsertOrUpdateOrDeleteEffectIntoItem(p0, str, str1, this.mMainClip, uErrorStatus)) {
          EditorSdkLogger.e("[AnimatedSubAsset][setWesterosFaceMagicParam] failed : "+MinecraftUtils.GetEffectId(p0)+"error : "+uErrorStatus.description());
       }
       return;
    }
    public void setWesterosFaceDetectMode(int p0){
       EditorSdk2V2$AnimatedSubAsset uAnimatedSub = EditorSdk2V2$AnimatedSubAsset.class;
       if (PatchProxy.isSupport(uAnimatedSub) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAnimatedSub, "49")) {
          return;
       }
       this.mMainClip.setWesterosFaceDetectMode(p0);
       return;
    }
    public void setWesterosFaceMagicParam(Minecraft$WesterosFaceMagicParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$AnimatedSubAsset.class, "40")) {
          return;
       }
       ErrorStatus uErrorStatus = new ErrorStatus();
       Minecraft$WesterosFaceMagicParam westerosFace = this.westerosFaceMagicParam();
       String str = null;
       String str1 = (westerosFace == null)? str: westerosFace.effectId();
       p0.setRole(6);
       MinecraftUtils.FillEffectFields(p0);
       if (!MinecraftUtils.InsertOrUpdateOrDeleteEffectIntoItem(p0, str, str1, this.mMainClip, uErrorStatus)) {
          EditorSdkLogger.e("[AnimatedSubAsset][setWesterosFaceMagicParam] failed : "+MinecraftUtils.GetEffectId(p0)+"error : "+uErrorStatus.description());
       }
       return;
    }
    public void setWesterosMakeupParam(Minecraft$WesterosMakeupParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$AnimatedSubAsset.class, "56")) {
          return;
       }
       ErrorStatus uErrorStatus = new ErrorStatus();
       Minecraft$WesterosMakeupParam westerosMake = this.westerosMakeupParam();
       String str = null;
       String str1 = (westerosMake == null)? str: westerosMake.effectId();
       if (!MinecraftUtils.InsertOrUpdateOrDeleteEffectIntoItem(p0, str, str1, this.mMainClip, uErrorStatus)) {
          EditorSdkLogger.e("[AnimatedSubAsset][setWesterosMakeupParam] failed : "+MinecraftUtils.GetEffectId(p0)+"error : "+uErrorStatus.description());
       }
       return;
    }
    public Minecraft$TimeMapParams timeMap(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2V2$AnimatedSubAsset.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mMainClip.timeMap();
    }
    public Minecraft$WesterosBeautyFilterParam westerosBeautyFilterParam(){
       Object[] objArray = null;
       ArrayList obj = PatchProxy.apply(objArray, this, EditorSdk2V2$AnimatedSubAsset.class, "41");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = MinecraftUtils.FilterEffects(this.mMainClip.effects().getArrayList(), Minecraft$WesterosBeautyFilterParam.class, objArray);
       if (obj.size() > 1) {
          EditorSdkLogger.e("[AnimatedSubAsset][westerosBeautyFilterParam] count > 1");
          return objArray;
       }else if(!obj.isEmpty()){
          return obj.get(0);
       }else {
          return objArray;
       }
    }
    public Minecraft$WesterosBodySlimmingParam westerosBodySlimmingParam(){
       Object[] objArray = null;
       ArrayList obj = PatchProxy.apply(objArray, this, EditorSdk2V2$AnimatedSubAsset.class, "57");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = MinecraftUtils.FilterEffects(this.mMainClip.effects().getArrayList(), Minecraft$WesterosBodySlimmingParam.class, objArray);
       if (obj.size() > 1) {
          EditorSdkLogger.e("[AnimatedSubAsset][westerosBodySlimmingParam] count > 1");
          return objArray;
       }else if(!obj.isEmpty()){
          return obj.get(0);
       }else {
          return objArray;
       }
    }
    public int westerosFaceDetectMode(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2V2$AnimatedSubAsset.class, "48");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mMainClip.westerosFaceDetectMode();
    }
    public Minecraft$WesterosFaceMagicParam westerosFaceMagicParam(){
       Object[] objArray = null;
       ArrayList obj = PatchProxy.apply(objArray, this, EditorSdk2V2$AnimatedSubAsset.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = MinecraftUtils.FilterEffects(this.mMainClip.effects().getArrayList(), Minecraft$WesterosFaceMagicParam.class, "westerosFaceMagicParamEffectOnAnimatedSubAssetV2");
       if (obj.size() > 1) {
          EditorSdkLogger.e("[AnimatedSubAsset][westerosFaceMagicParam] count > 1");
          return objArray;
       }else if(!obj.isEmpty()){
          return obj.get(0);
       }else {
          return objArray;
       }
    }
    public Minecraft$WesterosMakeupParam westerosMakeupParam(){
       Object[] objArray = null;
       ArrayList obj = PatchProxy.apply(objArray, this, EditorSdk2V2$AnimatedSubAsset.class, "55");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = MinecraftUtils.FilterEffects(this.mMainClip.effects().getArrayList(), Minecraft$WesterosMakeupParam.class, objArray);
       if (obj.size() > 1) {
          EditorSdkLogger.e("[AnimatedSubAsset][westerosMakeupParam] count > 1");
          return objArray;
       }else if(!obj.isEmpty()){
          return obj.get(0);
       }else {
          return objArray;
       }
    }
}
