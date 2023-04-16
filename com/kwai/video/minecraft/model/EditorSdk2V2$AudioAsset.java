package com.kwai.video.minecraft.model.EditorSdk2V2$AudioAsset;
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
import com.kwai.video.minecraft.model.nano.Minecraft$AudioVolumeRangeParam;
import com.kwai.video.minecraft.MinecraftUtils;
import com.kwai.video.minecraft.model.MediaReference;
import com.kwai.video.minecraft.model.nano.Minecraft$InputFileOptions;
import com.kwai.video.minecraft.model.nano.Minecraft$AudioFilterParam;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import com.kwai.video.minecraft.model.MutableItem;
import java.util.ArrayList;
import com.kwai.video.editorsdk2.logger.EditorSdkLogger;
import java.util.Iterator;
import com.kwai.video.minecraft.model.Effect;
import java.util.Set;
import com.kwai.video.minecraft.model.nano.Minecraft$AudioVolumeRange;
import java.lang.Integer;
import com.kwai.video.minecraft.model.EditorSdk2V2$TimeRangeV2;
import com.kwai.video.minecraft.model.TimeRange;
import com.kwai.video.minecraft.model.ErrorStatus;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ProbedFile;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$TimeRange;
import java.lang.Boolean;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$EditorSdkError;
import java.lang.Double;
import com.kwai.video.minecraft.model.MutableEffect;
import java.lang.StringBuilder;
import java.lang.Long;
import com.kwai.video.minecraft.model.nano.Minecraft$AudioVolumeKeyFrame;

public final class EditorSdk2V2$AudioAsset extends ModelBase	// class@0009f1
{
    public int mAssetAudioFlag;
    public EditorSdk2$TimeRange mDisplayRange;
    public boolean mIsKuaiShanBgAudioAsset;
    public Minecraft$KSAVClip mMainClip;
    public EditorSdk2$ProbedFile mProbedAssetFile;
    public String mTemplateAssetRefId;

    public void EditorSdk2V2$AudioAsset(){
       super();
       this.mMainClip = new Minecraft$KSAVClip();
       this.mMainClip.setMediaReference(new Minecraft$AudioVideoReference());
    }
    public void EditorSdk2V2$AudioAsset(Minecraft$KSAVClip p0){
       super();
       this.mMainClip = p0;
    }
    public int assetAudioFlag(){
       return this.mAssetAudioFlag;
    }
    public double assetFadeinDuration(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2V2$AudioAsset.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       double d = 0x3ff0000000000000;
       Minecraft$AudioVolumeRangeParam uAudioVolume = this.volumeOfAudioVolumeRangeParam();
       if (uAudioVolume != null) {
          d = uAudioVolume.fadeinDuration();
       }
       return d;
    }
    public double assetFadeoutDuration(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2V2$AudioAsset.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       double d = 0x3ff0000000000000;
       Minecraft$AudioVolumeRangeParam uAudioVolume = this.volumeOfAudioVolumeRangeParam();
       if (uAudioVolume != null) {
          d = uAudioVolume.fadeoutDuration();
       }
       return d;
    }
    public long assetId(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2V2$AudioAsset.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return MinecraftUtils.ParseMinecraftID(this.mMainClip.clipId());
    }
    public String assetPath(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2V2$AudioAsset.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mMainClip.mediaReference().filePath();
    }
    public Minecraft$InputFileOptions assetPathOptions(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2V2$AudioAsset.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mMainClip.mutableMediaReference().fileOptions();
    }
    public double assetSpeed(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2V2$AudioAsset.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return this.mMainClip.assetSpeed();
    }
    public Minecraft$AudioFilterParam audioFilterParam(){
       Object[] objArray = null;
       ArrayList obj = PatchProxy.apply(objArray, this, EditorSdk2V2$AudioAsset.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = MinecraftUtils.FilterEffects(this.mMainClip.effects().getArrayList(), Minecraft$AudioFilterParam.class, objArray);
       if (obj.size() > 1) {
          EditorSdkLogger.e("[AudioAsset][audioFilterParam] count > 1");
          return objArray;
       }else if(!obj.isEmpty()){
          return obj.get(0);
       }else {
          return objArray;
       }
    }
    public final ImmutableArray audioVolumeRangeParams(){
       ArrayList obj = PatchProxy.apply(null, this, EditorSdk2V2$AudioAsset.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = this.mMainClip.effects().iterator();
       while (iterator.hasNext()) {
          Effect uEffect = iterator.next();
          Set set = uEffect.tags();
          if (uEffect instanceof Minecraft$AudioVolumeRangeParam && (set == null || !set.contains("volumeOfAudioVolumeRangeEffectOnTrackAssetV2OrAudioAssetV2"))) {
             obj.add(uEffect);
          }
       }
       return new ImmutableArray(obj, Minecraft$AudioVolumeRangeParam.class);
    }
    public ImmutableArray audioVolumeRanges(){
       ArrayList obj = PatchProxy.apply(null, this, EditorSdk2V2$AudioAsset.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = this.audioVolumeRangeParams().iterator();
       while (iterator.hasNext()) {
          obj.add(MinecraftUtils.CreateAudioVolumeRangeFromAudioVolumeRangeParam(iterator.next()));
       }
       return new ImmutableArray(obj, Minecraft$AudioVolumeRange.class);
    }
    public Minecraft$AudioVolumeRange audioVolumeRanges(int p0){
       EditorSdk2V2$AudioAsset uAudioAsset = EditorSdk2V2$AudioAsset.class;
       if (PatchProxy.isSupport(uAudioAsset)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uAudioAsset, "23");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return MinecraftUtils.CreateAudioVolumeRangeFromAudioVolumeRangeParam(this.audioVolumeRangeParams().get(p0));
    }
    public int audioVolumeRangesSize(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2V2$AudioAsset.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.audioVolumeRangeParams().size();
    }
    public EditorSdk2V2$TimeRangeV2 clippedRange(){
       TimeRange obj = PatchProxy.apply(null, this, EditorSdk2V2$AudioAsset.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.mMainClip.sourceRange() == null)? this.mMainClip.availableRange(null): this.mMainClip.sourceRange();
       return MinecraftUtils.CreateEditorTimeRangeV2FromMinecraft(obj);
    }
    public EditorSdk2V2$AudioAsset clone(){
       Object[] objArray = null;
       EditorSdk2V2$AudioAsset obj = PatchProxy.apply(objArray, this, EditorSdk2V2$AudioAsset.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new EditorSdk2V2$AudioAsset();
       obj.mMainClip = this.mMainClip.clone();
       EditorSdk2V2$AudioAsset tmProbedAsse = this.mProbedAssetFile;
       Object[] objArray1 = (tmProbedAsse == null)? objArray: tmProbedAsse.clone();
       obj.mProbedAssetFile = objArray1;
       tmProbedAsse = this.mDisplayRange;
       if (tmProbedAsse != null) {
          objArray = tmProbedAsse.clone();
       }
       obj.mDisplayRange = objArray;
       obj.mAssetAudioFlag = this.mAssetAudioFlag;
       obj.mIsKuaiShanBgAudioAsset = this.mIsKuaiShanBgAudioAsset;
       obj.mTemplateAssetRefId = this.mTemplateAssetRefId;
       return obj;
    }
    public Object clone(){
       return this.clone();
    }
    public EditorSdk2$TimeRange displayRange(){
       return this.mDisplayRange;
    }
    public Minecraft$KSAVClip getMainClip(){
       return this.mMainClip;
    }
    public boolean isKuaiShanBgAudio(){
       return this.mIsKuaiShanBgAudioAsset;
    }
    public boolean isRepeat(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2V2$AudioAsset.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mMainClip.isRepeat();
    }
    public boolean isReversed(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2V2$AudioAsset.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mMainClip.isReversed();
    }
    public EditorSdk2$ProbedFile probedAssetFile(){
       return this.mProbedAssetFile;
    }
    public boolean reloadProbedFiles(EditorSdk2$EditorSdkError p0){
       EditorSdk2V2$AudioAsset obj = PatchProxy.applyOneRefs(p0, this, EditorSdk2V2$AudioAsset.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mProbedAssetFile;
       int i = 1;
       if (obj == null) {
          int i1 = MinecraftUtils.OpenAudioVideoClip(this.mMainClip, obj);
          if (i1) {
             Object[] objArray = new Object[i];
             objArray[0] = Integer.valueOf(i1);
             EditorSdkLogger.e(String.format("[AudioAssetV2][reloadProbedFile] fail:%d", objArray));
             if (p0 != null) {
                p0.setCode(i1);
                p0.setMessage("Error opening AudioAsset");
             }
             return 0;
          }
       }
       return i;
    }
    public void setAssetAudioFlag(int p0){
       this.mAssetAudioFlag = p0;
    }
    public void setAssetFadeinDuration(double p0){
       String str;
       EditorSdk2V2$AudioAsset uAudioAsset = EditorSdk2V2$AudioAsset.class;
       if (PatchProxy.isSupport(uAudioAsset) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, uAudioAsset, "25")) {
          return;
       }
       ErrorStatus uErrorStatus = new ErrorStatus();
       Minecraft$AudioVolumeRangeParam uAudioVolume = this.volumeOfAudioVolumeRangeParam();
       Minecraft$AudioVolumeRangeParam uAudioVolume1 = null;
       if (uAudioVolume != null) {
          uAudioVolume1 = uAudioVolume.clone();
          str = uAudioVolume.effectId();
       }else {
          uAudioVolume1 = new Minecraft$AudioVolumeRangeParam();
          str = uAudioVolume1;
       }
       uAudioVolume1.setFadeinDuration(p0);
       if (!MinecraftUtils.InsertOrUpdateOrDeleteEffectIntoItem(uAudioVolume1, "volumeOfAudioVolumeRangeEffectOnTrackAssetV2OrAudioAssetV2", str, this.mMainClip, uErrorStatus)) {
          EditorSdkLogger.e("[AudioAsset][setAssetFadeinDuration] error : "+uErrorStatus.description());
       }
       return;
    }
    public void setAssetFadeoutDuration(double p0){
       String str;
       EditorSdk2V2$AudioAsset uAudioAsset = EditorSdk2V2$AudioAsset.class;
       if (PatchProxy.isSupport(uAudioAsset) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, uAudioAsset, "27")) {
          return;
       }
       ErrorStatus uErrorStatus = new ErrorStatus();
       Minecraft$AudioVolumeRangeParam uAudioVolume = this.volumeOfAudioVolumeRangeParam();
       Minecraft$AudioVolumeRangeParam uAudioVolume1 = null;
       if (uAudioVolume != null) {
          uAudioVolume1 = uAudioVolume.clone();
          str = uAudioVolume.effectId();
       }else {
          uAudioVolume1 = new Minecraft$AudioVolumeRangeParam();
          str = uAudioVolume1;
       }
       uAudioVolume1.setFadeoutDuration(p0);
       if (!MinecraftUtils.InsertOrUpdateOrDeleteEffectIntoItem(uAudioVolume1, "volumeOfAudioVolumeRangeEffectOnTrackAssetV2OrAudioAssetV2", str, this.mMainClip, uErrorStatus)) {
          EditorSdkLogger.e("[AudioAsset][setAssetFadeoutDuration] error : "+uErrorStatus.description());
       }
       return;
    }
    public void setAssetId(long p0){
       EditorSdk2V2$AudioAsset uAudioAsset = EditorSdk2V2$AudioAsset.class;
       if (PatchProxy.isSupport(uAudioAsset) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uAudioAsset, "4")) {
          return;
       }
       this.mMainClip.setClipId(p0);
       return;
    }
    public void setAssetPath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$AudioAsset.class, "6")) {
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
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$AudioAsset.class, "36")) {
          return;
       }
       this.mMainClip.mutableMediaReference().setFileOptions(p0);
       return;
    }
    public void setAssetSpeed(double p0){
       EditorSdk2V2$AudioAsset uAudioAsset = EditorSdk2V2$AudioAsset.class;
       if (PatchProxy.isSupport(uAudioAsset) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, uAudioAsset, "10")) {
          return;
       }
       if (p0 - 0x3ec5d867c3ece2a5 < 0) {
          p0 = 0x3ff0000000000000;
       }
       this.mMainClip.setAssetSpeed(p0);
       return;
    }
    public void setAudioFilterParam(Minecraft$AudioFilterParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$AudioAsset.class, "17")) {
          return;
       }
       ErrorStatus uErrorStatus = new ErrorStatus();
       Minecraft$AudioFilterParam uAudioFilter = this.audioFilterParam();
       String str = null;
       String str1 = (uAudioFilter == null)? str: uAudioFilter.effectId();
       if (!MinecraftUtils.InsertOrUpdateOrDeleteEffectIntoItem(p0, str, str1, this.mMainClip, uErrorStatus)) {
          EditorSdkLogger.e("[AudioAsset][setAudioFilterParam] failed : "+MinecraftUtils.GetEffectId(p0)+"error : "+uErrorStatus.description());
       }
       return;
    }
    public void setAudioVolumeRanges(ImmutableArray p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$AudioAsset.class, "20")) {
          return;
       }
       this.setAudioVolumeRanges(p0.toNormalArray());
       return;
    }
    public void setAudioVolumeRanges(Minecraft$AudioVolumeRange[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$AudioAsset.class, "21")) {
          return;
       }
       Iterator iterator = this.audioVolumeRangeParams().iterator();
       while (iterator.hasNext()) {
          Minecraft$AudioVolumeRangeParam uAudioVolume = iterator.next();
          ErrorStatus uErrorStatus = new ErrorStatus();
          if (!this.mMainClip.deleteEffect(uAudioVolume.effectId(), uErrorStatus)) {
             EditorSdkLogger.e("[AudioAsset][setAudioVolumeRanges] fail delete effectId : "+MinecraftUtils.GetEffectId(uAudioVolume)+"error : "+uErrorStatus.description());
          }
       }
       int len = p0.length;
       int i = 0;
       while (i < len) {
          Minecraft$AudioVolumeRangeParam uAudioVolume1 = MinecraftUtils.CreateAudioVolumeRangeParamFromAudioVolumeRange(p0[i]);
          ErrorStatus uErrorStatus1 = new ErrorStatus();
          if (!this.mMainClip.appendEffect(uAudioVolume1, uErrorStatus1)) {
             EditorSdkLogger.e("[AudioAsset][setAudioVolumeRanges] fail appendEffect : "+MinecraftUtils.GetEffectId(uAudioVolume1)+"error : "+uErrorStatus1.description());
          }
          i = i + 1;
       }
       return;
    }
    public void setClippedRange(EditorSdk2V2$TimeRangeV2 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$AudioAsset.class, "8")) {
          return;
       }
       this.mMainClip.setSourceRange(MinecraftUtils.CreateMinecraftTimeRangeV2FromEditor(p0));
       return;
    }
    public void setDisplayRange(EditorSdk2$TimeRange p0){
       this.mDisplayRange = p0;
    }
    public void setIsRepeat(boolean p0){
       EditorSdk2V2$AudioAsset uAudioAsset = EditorSdk2V2$AudioAsset.class;
       if (PatchProxy.isSupport(uAudioAsset) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAudioAsset, "15")) {
          return;
       }
       this.mMainClip.setIsRepeat(p0);
       return;
    }
    public void setIsReversed(boolean p0){
       EditorSdk2V2$AudioAsset uAudioAsset = EditorSdk2V2$AudioAsset.class;
       if (PatchProxy.isSupport(uAudioAsset) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAudioAsset, "29")) {
          return;
       }
       this.mMainClip.setIsReversed(p0);
       return;
    }
    public void setProbedAssetFile(EditorSdk2$ProbedFile p0){
       this.mProbedAssetFile = p0;
    }
    public void setTemplateAssetRefId(String p0){
       this.mTemplateAssetRefId = p0;
    }
    public void setVolume(double p0){
       String str;
       EditorSdk2V2$AudioAsset uAudioAsset = EditorSdk2V2$AudioAsset.class;
       if (PatchProxy.isSupport(uAudioAsset) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, uAudioAsset, "13")) {
          return;
       }
       ErrorStatus uErrorStatus = new ErrorStatus();
       Minecraft$AudioVolumeRangeParam uAudioVolume = this.volumeOfAudioVolumeRangeParam();
       Minecraft$AudioVolumeRangeParam uAudioVolume1 = null;
       if (uAudioVolume != null) {
          uAudioVolume1 = uAudioVolume.clone();
          str = uAudioVolume.effectId();
       }else {
          uAudioVolume1 = new Minecraft$AudioVolumeRangeParam();
          str = uAudioVolume1;
       }
       uAudioVolume1.setVolume(p0);
       if (!MinecraftUtils.InsertOrUpdateOrDeleteEffectIntoItem(uAudioVolume1, "volumeOfAudioVolumeRangeEffectOnTrackAssetV2OrAudioAssetV2", str, this.mMainClip, uErrorStatus)) {
          EditorSdkLogger.e("[AudioAsset][setVolume] error : "+uErrorStatus.description());
       }
       return;
    }
    public void setVolumeKeyFrames(ImmutableArray p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$AudioAsset.class, "31")) {
          return;
       }
       this.setVolumeKeyFrames(p0.toNormalArray());
       return;
    }
    public void setVolumeKeyFrames(Minecraft$AudioVolumeKeyFrame[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorSdk2V2$AudioAsset.class, "32")) {
          return;
       }
       Iterator iterator = this.volumeKeyFrames().iterator();
       while (iterator.hasNext()) {
          Minecraft$AudioVolumeKeyFrame uAudioVolume = iterator.next();
          ErrorStatus uErrorStatus = new ErrorStatus();
          if (!this.mMainClip.deleteEffect(uAudioVolume.effectId(), uErrorStatus)) {
             EditorSdkLogger.e("[AudioAsset][setVolumeKeyFrames] fail delete effectId : "+MinecraftUtils.GetEffectId(uAudioVolume)+"error : "+uErrorStatus.description());
          }
       }
       int len = p0.length;
       int i = 0;
       while (i < len) {
          object oobject = p0[i];
          ErrorStatus uErrorStatus1 = new ErrorStatus();
          if (!this.mMainClip.appendEffect(oobject, uErrorStatus1)) {
             EditorSdkLogger.e("[AudioAsset][setVolumeKeyFrames] fail appendEffect : "+MinecraftUtils.GetEffectId(oobject)+"error : "+uErrorStatus1.description());
          }
          i = i + 1;
       }
       return;
    }
    public void setisKuaiShanBgAudio(boolean p0){
       this.mIsKuaiShanBgAudioAsset = p0;
    }
    public String templateAssetRefId(){
       return this.mTemplateAssetRefId;
    }
    public double volume(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2V2$AudioAsset.class, "12");
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
    public ImmutableArray volumeKeyFrames(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, EditorSdk2V2$AudioAsset.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ImmutableArray(MinecraftUtils.FilterEffects(this.mMainClip.effects().getArrayList(), Minecraft$AudioVolumeKeyFrame.class, objArray), Minecraft$AudioVolumeKeyFrame.class);
    }
    public Minecraft$AudioVolumeKeyFrame volumeKeyFrames(int p0){
       EditorSdk2V2$AudioAsset uAudioAsset = EditorSdk2V2$AudioAsset.class;
       if (PatchProxy.isSupport(uAudioAsset)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uAudioAsset, "34");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.volumeKeyFrames().get(p0);
    }
    public int volumeKeyFramesSize(){
       Object obj = PatchProxy.apply(null, this, EditorSdk2V2$AudioAsset.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.volumeKeyFrames().size();
    }
    public final Minecraft$AudioVolumeRangeParam volumeOfAudioVolumeRangeParam(){
       Object[] objArray = null;
       ArrayList obj = PatchProxy.apply(objArray, this, EditorSdk2V2$AudioAsset.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = MinecraftUtils.FilterEffects(this.mMainClip.effects().getArrayList(), Minecraft$AudioVolumeRangeParam.class, "volumeOfAudioVolumeRangeEffectOnTrackAssetV2OrAudioAssetV2");
       if (obj.size() > 1) {
          EditorSdkLogger.e("[AudioAsset][volumeOfAudioVolumeRangeParam] count > 1");
          return objArray;
       }else if(!obj.isEmpty()){
          return obj.get(0);
       }else {
          return objArray;
       }
    }
}
