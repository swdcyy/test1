package com.kwai.video.westeros.models.EffectDescription$Builder;
import com.kwai.video.westeros.models.EffectDescriptionOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.EffectDescription;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.EffectDescription$1;
import java.lang.Iterable;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kwai.video.westeros.models.EmbeddedPickingMedia$Builder;
import com.kwai.video.westeros.models.EmbeddedPickingMedia;
import com.kwai.video.westeros.models.PopupWindowConfig$Builder;
import com.kwai.video.westeros.models.PopupWindowConfig;
import com.kwai.video.westeros.models.TriggerInputTextConfig$Builder;
import com.kwai.video.westeros.models.TriggerInputTextConfig;
import java.util.Map;
import java.lang.Object;
import java.util.Objects;
import com.kwai.video.westeros.models.AdjustIntensityConfig;
import com.kwai.video.westeros.models.ARConfig;
import com.kwai.video.westeros.models.ARSpec;
import java.util.Collections;
import java.lang.IllegalArgumentException;
import com.kwai.video.westeros.models.CameraFacing;
import com.kwai.video.westeros.models.CaptureOriginalConfig;
import com.kwai.video.westeros.models.EditAudioType;
import com.kwai.video.westeros.models.EffectPerformance;
import java.util.List;
import com.kwai.video.westeros.models.GuideConfig;
import com.kwai.video.westeros.models.ImageLocaleTips;
import com.kwai.video.westeros.models.TriggerInputTextGroupConfig;
import com.kwai.video.westeros.models.LookupConfig;
import com.kwai.video.westeros.models.PickMoreMediaInfo;
import com.kwai.video.westeros.models.PickingVideoConfig;
import com.kwai.video.westeros.models.TitleDatas;
import com.kwai.video.westeros.models.EffectErrorCode;
import com.kwai.video.westeros.models.EffectSlot;
import com.kwai.video.westeros.models.ServerProcessingInfo;
import com.kwai.video.westeros.models.VideoLength;
import com.kwai.video.westeros.models.AdjustIntensityConfig$Builder;
import com.kwai.video.westeros.models.ARConfig$Builder;
import com.kwai.video.westeros.models.CaptureOriginalConfig$Builder;
import com.kwai.video.westeros.models.ImageLocaleTips$Builder;
import com.kwai.video.westeros.models.TriggerInputTextGroupConfig$Builder;
import com.kwai.video.westeros.models.LookupConfig$Builder;
import com.kwai.video.westeros.models.PickMoreMediaInfo$Builder;
import com.kwai.video.westeros.models.PickingVideoConfig$Builder;
import com.kwai.video.westeros.models.ServerProcessingInfo$Builder;

public final class EffectDescription$Builder extends GeneratedMessageLite$Builder implements EffectDescriptionOrBuilder	// class@000f0f
{

    public void EffectDescription$Builder(){
       super(EffectDescription.DEFAULT_INSTANCE);
    }
    public void EffectDescription$Builder(EffectDescription$1 p0){
       super();
    }
    public EffectDescription$Builder addAllEffects(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllEffects(p0);
       return this;
    }
    public EffectDescription$Builder addAllEmbeddedPickingMedias(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllEmbeddedPickingMedias(p0);
       return this;
    }
    public EffectDescription$Builder addAllPopupConfig(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllPopupConfig(p0);
       return this;
    }
    public EffectDescription$Builder addAllSwapFaceEmbededIcon(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllSwapFaceEmbededIcon(p0);
       return this;
    }
    public EffectDescription$Builder addAllSwapFaceEmbededImages(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllSwapFaceEmbededImages(p0);
       return this;
    }
    public EffectDescription$Builder addAllTriggerInputTextsConfig(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllTriggerInputTextsConfig(p0);
       return this;
    }
    public EffectDescription$Builder addEffects(String p0){
       this.copyOnWrite();
       this.instance.addEffects(p0);
       return this;
    }
    public EffectDescription$Builder addEffectsBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.addEffectsBytes(p0);
       return this;
    }
    public EffectDescription$Builder addEmbeddedPickingMedias(int p0,EmbeddedPickingMedia$Builder p1){
       this.copyOnWrite();
       this.instance.addEmbeddedPickingMedias(p0, p1);
       return this;
    }
    public EffectDescription$Builder addEmbeddedPickingMedias(int p0,EmbeddedPickingMedia p1){
       this.copyOnWrite();
       this.instance.addEmbeddedPickingMedias(p0, p1);
       return this;
    }
    public EffectDescription$Builder addEmbeddedPickingMedias(EmbeddedPickingMedia$Builder p0){
       this.copyOnWrite();
       this.instance.addEmbeddedPickingMedias(p0);
       return this;
    }
    public EffectDescription$Builder addEmbeddedPickingMedias(EmbeddedPickingMedia p0){
       this.copyOnWrite();
       this.instance.addEmbeddedPickingMedias(p0);
       return this;
    }
    public EffectDescription$Builder addPopupConfig(int p0,PopupWindowConfig$Builder p1){
       this.copyOnWrite();
       this.instance.addPopupConfig(p0, p1);
       return this;
    }
    public EffectDescription$Builder addPopupConfig(int p0,PopupWindowConfig p1){
       this.copyOnWrite();
       this.instance.addPopupConfig(p0, p1);
       return this;
    }
    public EffectDescription$Builder addPopupConfig(PopupWindowConfig$Builder p0){
       this.copyOnWrite();
       this.instance.addPopupConfig(p0);
       return this;
    }
    public EffectDescription$Builder addPopupConfig(PopupWindowConfig p0){
       this.copyOnWrite();
       this.instance.addPopupConfig(p0);
       return this;
    }
    public EffectDescription$Builder addSwapFaceEmbededIcon(String p0){
       this.copyOnWrite();
       this.instance.addSwapFaceEmbededIcon(p0);
       return this;
    }
    public EffectDescription$Builder addSwapFaceEmbededIconBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.addSwapFaceEmbededIconBytes(p0);
       return this;
    }
    public EffectDescription$Builder addSwapFaceEmbededImages(String p0){
       this.copyOnWrite();
       this.instance.addSwapFaceEmbededImages(p0);
       return this;
    }
    public EffectDescription$Builder addSwapFaceEmbededImagesBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.addSwapFaceEmbededImagesBytes(p0);
       return this;
    }
    public EffectDescription$Builder addTriggerInputTextsConfig(int p0,TriggerInputTextConfig$Builder p1){
       this.copyOnWrite();
       this.instance.addTriggerInputTextsConfig(p0, p1);
       return this;
    }
    public EffectDescription$Builder addTriggerInputTextsConfig(int p0,TriggerInputTextConfig p1){
       this.copyOnWrite();
       this.instance.addTriggerInputTextsConfig(p0, p1);
       return this;
    }
    public EffectDescription$Builder addTriggerInputTextsConfig(TriggerInputTextConfig$Builder p0){
       this.copyOnWrite();
       this.instance.addTriggerInputTextsConfig(p0);
       return this;
    }
    public EffectDescription$Builder addTriggerInputTextsConfig(TriggerInputTextConfig p0){
       this.copyOnWrite();
       this.instance.addTriggerInputTextsConfig(p0);
       return this;
    }
    public EffectDescription$Builder clearActivityId(){
       this.copyOnWrite();
       this.instance.clearActivityId();
       return this;
    }
    public EffectDescription$Builder clearAdjustIntensityConfig(){
       this.copyOnWrite();
       this.instance.clearAdjustIntensityConfig();
       return this;
    }
    public EffectDescription$Builder clearAndroidFrameworkVersion(){
       this.copyOnWrite();
       this.instance.clearAndroidFrameworkVersion();
       return this;
    }
    public EffectDescription$Builder clearArConfig(){
       this.copyOnWrite();
       this.instance.clearArConfig();
       return this;
    }
    public EffectDescription$Builder clearArSpec(){
       this.copyOnWrite();
       this.instance.clearArSpec();
       return this;
    }
    public EffectDescription$Builder clearAudioPath(){
       this.copyOnWrite();
       this.instance.clearAudioPath();
       return this;
    }
    public EffectDescription$Builder clearAudioPosition(){
       this.copyOnWrite();
       this.instance.clearAudioPosition();
       return this;
    }
    public EffectDescription$Builder clearBackCameraLocaleTips(){
       this.copyOnWrite();
       this.instance.getMutableBackCameraLocaleTipsMap().clear();
       return this;
    }
    public EffectDescription$Builder clearCameraFacing(){
       this.copyOnWrite();
       this.instance.clearCameraFacing();
       return this;
    }
    public EffectDescription$Builder clearCaptureOriginalConfig(){
       this.copyOnWrite();
       this.instance.clearCaptureOriginalConfig();
       return this;
    }
    public EffectDescription$Builder clearCustomStickerJson(){
       this.copyOnWrite();
       this.instance.getMutableCustomStickerJsonMap().clear();
       return this;
    }
    public EffectDescription$Builder clearDefaultCountdown(){
       this.copyOnWrite();
       this.instance.clearDefaultCountdown();
       return this;
    }
    public EffectDescription$Builder clearDelayRecordTime(){
       this.copyOnWrite();
       this.instance.clearDelayRecordTime();
       return this;
    }
    public EffectDescription$Builder clearDisableBackgroundMusic(){
       this.copyOnWrite();
       this.instance.clearDisableBackgroundMusic();
       return this;
    }
    public EffectDescription$Builder clearDisableCustomBeautify(){
       this.copyOnWrite();
       this.instance.clearDisableCustomBeautify();
       return this;
    }
    public EffectDescription$Builder clearDisableCustomColorFilter(){
       this.copyOnWrite();
       this.instance.clearDisableCustomColorFilter();
       return this;
    }
    public EffectDescription$Builder clearDisableCustomDeform(){
       this.copyOnWrite();
       this.instance.clearDisableCustomDeform();
       return this;
    }
    public EffectDescription$Builder clearDisableCustomMakeup(){
       this.copyOnWrite();
       this.instance.clearDisableCustomMakeup();
       return this;
    }
    public EffectDescription$Builder clearDisableCustomSlimming(){
       this.copyOnWrite();
       this.instance.clearDisableCustomSlimming();
       return this;
    }
    public EffectDescription$Builder clearEditAudioType(){
       this.copyOnWrite();
       this.instance.clearEditAudioType();
       return this;
    }
    public EffectDescription$Builder clearEffectHasAudio(){
       this.copyOnWrite();
       this.instance.clearEffectHasAudio();
       return this;
    }
    public EffectDescription$Builder clearEffectLoadFailed(){
       this.copyOnWrite();
       this.instance.clearEffectLoadFailed();
       return this;
    }
    public EffectDescription$Builder clearEffectPerformance(){
       this.copyOnWrite();
       this.instance.clearEffectPerformance();
       return this;
    }
    public EffectDescription$Builder clearEffects(){
       this.copyOnWrite();
       this.instance.clearEffects();
       return this;
    }
    public EffectDescription$Builder clearEmbeddedPickingMedias(){
       this.copyOnWrite();
       this.instance.clearEmbeddedPickingMedias();
       return this;
    }
    public EffectDescription$Builder clearEnableVideoStabilization(){
       this.copyOnWrite();
       this.instance.clearEnableVideoStabilization();
       return this;
    }
    public EffectDescription$Builder clearEraseAudio(){
       this.copyOnWrite();
       this.instance.clearEraseAudio();
       return this;
    }
    public EffectDescription$Builder clearFaceMagicEncodeProfile(){
       this.copyOnWrite();
       this.instance.clearFaceMagicEncodeProfile();
       return this;
    }
    public EffectDescription$Builder clearFrontCameraLocaleTips(){
       this.copyOnWrite();
       this.instance.getMutableFrontCameraLocaleTipsMap().clear();
       return this;
    }
    public EffectDescription$Builder clearGiftDisplayTime(){
       this.copyOnWrite();
       this.instance.clearGiftDisplayTime();
       return this;
    }
    public EffectDescription$Builder clearGuideConfig(){
       this.copyOnWrite();
       this.instance.getMutableGuideConfigMap().clear();
       return this;
    }
    public EffectDescription$Builder clearHasBoomgameEffect(){
       this.copyOnWrite();
       this.instance.clearHasBoomgameEffect();
       return this;
    }
    public EffectDescription$Builder clearHasMmuVoiceChange(){
       this.copyOnWrite();
       this.instance.clearHasMmuVoiceChange();
       return this;
    }
    public EffectDescription$Builder clearImageLocaleTips(){
       this.copyOnWrite();
       this.instance.clearImageLocaleTips();
       return this;
    }
    public EffectDescription$Builder clearInputTextGroupInfo(){
       this.copyOnWrite();
       this.instance.clearInputTextGroupInfo();
       return this;
    }
    public EffectDescription$Builder clearIsMemojiEffect(){
       this.copyOnWrite();
       this.instance.clearIsMemojiEffect();
       return this;
    }
    public EffectDescription$Builder clearKeepAlive(){
       this.copyOnWrite();
       this.instance.clearKeepAlive();
       return this;
    }
    public EffectDescription$Builder clearLocaleTips(){
       this.copyOnWrite();
       this.instance.getMutableLocaleTipsMap().clear();
       return this;
    }
    public EffectDescription$Builder clearLookupConfig(){
       this.copyOnWrite();
       this.instance.clearLookupConfig();
       return this;
    }
    public EffectDescription$Builder clearMediaInfo(){
       this.copyOnWrite();
       this.instance.clearMediaInfo();
       return this;
    }
    public EffectDescription$Builder clearMemojiStyleConfigJson(){
       this.copyOnWrite();
       this.instance.clearMemojiStyleConfigJson();
       return this;
    }
    public EffectDescription$Builder clearNeedClientWorkProcess(){
       this.copyOnWrite();
       this.instance.clearNeedClientWorkProcess();
       return this;
    }
    public EffectDescription$Builder clearNeedLocation(){
       this.copyOnWrite();
       this.instance.clearNeedLocation();
       return this;
    }
    public EffectDescription$Builder clearNeedMusicWave(){
       this.copyOnWrite();
       this.instance.clearNeedMusicWave();
       return this;
    }
    public EffectDescription$Builder clearNeedPickFirstMedia(){
       this.copyOnWrite();
       this.instance.clearNeedPickFirstMedia();
       return this;
    }
    public EffectDescription$Builder clearNeedPickMediaResourceType(){
       this.copyOnWrite();
       this.instance.clearNeedPickMediaResourceType();
       return this;
    }
    public EffectDescription$Builder clearNeedPinch(){
       this.copyOnWrite();
       this.instance.clearNeedPinch();
       return this;
    }
    public EffectDescription$Builder clearNeedReversePlay(){
       this.copyOnWrite();
       this.instance.clearNeedReversePlay();
       return this;
    }
    public EffectDescription$Builder clearNeedSubFrame(){
       this.copyOnWrite();
       this.instance.clearNeedSubFrame();
       return this;
    }
    public EffectDescription$Builder clearNeedSwapFace(){
       this.copyOnWrite();
       this.instance.clearNeedSwapFace();
       return this;
    }
    public EffectDescription$Builder clearNeedSwipe(){
       this.copyOnWrite();
       this.instance.clearNeedSwipe();
       return this;
    }
    public EffectDescription$Builder clearNeedTouch(){
       this.copyOnWrite();
       this.instance.clearNeedTouch();
       return this;
    }
    public EffectDescription$Builder clearOrientationLocked(){
       this.copyOnWrite();
       this.instance.clearOrientationLocked();
       return this;
    }
    public EffectDescription$Builder clearPickingVideoConfig(){
       this.copyOnWrite();
       this.instance.clearPickingVideoConfig();
       return this;
    }
    public EffectDescription$Builder clearPopupConfig(){
       this.copyOnWrite();
       this.instance.clearPopupConfig();
       return this;
    }
    public EffectDescription$Builder clearPopupWindowDisplayTitles(){
       this.copyOnWrite();
       this.instance.getMutablePopupWindowDisplayTitlesMap().clear();
       return this;
    }
    public EffectDescription$Builder clearRenderCode(){
       this.copyOnWrite();
       this.instance.clearRenderCode();
       return this;
    }
    public EffectDescription$Builder clearRenderCodeReason(){
       this.copyOnWrite();
       this.instance.clearRenderCodeReason();
       return this;
    }
    public EffectDescription$Builder clearRenderSlot(){
       this.copyOnWrite();
       this.instance.clearRenderSlot();
       return this;
    }
    public EffectDescription$Builder clearRequireFacialReco(){
       this.copyOnWrite();
       this.instance.clearRequireFacialReco();
       return this;
    }
    public EffectDescription$Builder clearRequirePreviewLayerRender(){
       this.copyOnWrite();
       this.instance.clearRequirePreviewLayerRender();
       return this;
    }
    public EffectDescription$Builder clearResetWhenRecord(){
       this.copyOnWrite();
       this.instance.clearResetWhenRecord();
       return this;
    }
    public EffectDescription$Builder clearServerProcessingInfo(){
       this.copyOnWrite();
       this.instance.clearServerProcessingInfo();
       return this;
    }
    public EffectDescription$Builder clearSubCount(){
       this.copyOnWrite();
       this.instance.clearSubCount();
       return this;
    }
    public EffectDescription$Builder clearSwapFaceEmbededIcon(){
       this.copyOnWrite();
       this.instance.clearSwapFaceEmbededIcon();
       return this;
    }
    public EffectDescription$Builder clearSwapFaceEmbededImages(){
       this.copyOnWrite();
       this.instance.clearSwapFaceEmbededImages();
       return this;
    }
    public EffectDescription$Builder clearTopic(){
       this.copyOnWrite();
       this.instance.getMutableTopicMap().clear();
       return this;
    }
    public EffectDescription$Builder clearTrackId(){
       this.copyOnWrite();
       this.instance.clearTrackId();
       return this;
    }
    public EffectDescription$Builder clearTriggerInputTextConfig(){
       this.copyOnWrite();
       this.instance.clearTriggerInputTextConfig();
       return this;
    }
    public EffectDescription$Builder clearTriggerInputTextsConfig(){
       this.copyOnWrite();
       this.instance.clearTriggerInputTextsConfig();
       return this;
    }
    public EffectDescription$Builder clearUseAudioStream(){
       this.copyOnWrite();
       this.instance.clearUseAudioStream();
       return this;
    }
    public EffectDescription$Builder clearUseClientTimeStamp(){
       this.copyOnWrite();
       this.instance.clearUseClientTimeStamp();
       return this;
    }
    public EffectDescription$Builder clearUseLastFrameForCover(){
       this.copyOnWrite();
       this.instance.clearUseLastFrameForCover();
       return this;
    }
    public EffectDescription$Builder clearVideoLength(){
       this.copyOnWrite();
       this.instance.clearVideoLength();
       return this;
    }
    public EffectDescription$Builder clearVideoLengthMs(){
       this.copyOnWrite();
       this.instance.clearVideoLengthMs();
       return this;
    }
    public boolean containsBackCameraLocaleTips(String p0){
       Objects.requireNonNull(p0);
       return this.instance.getBackCameraLocaleTipsMap().containsKey(p0);
    }
    public boolean containsCustomStickerJson(String p0){
       Objects.requireNonNull(p0);
       return this.instance.getCustomStickerJsonMap().containsKey(p0);
    }
    public boolean containsFrontCameraLocaleTips(String p0){
       Objects.requireNonNull(p0);
       return this.instance.getFrontCameraLocaleTipsMap().containsKey(p0);
    }
    public boolean containsGuideConfig(String p0){
       Objects.requireNonNull(p0);
       return this.instance.getGuideConfigMap().containsKey(p0);
    }
    public boolean containsLocaleTips(String p0){
       Objects.requireNonNull(p0);
       return this.instance.getLocaleTipsMap().containsKey(p0);
    }
    public boolean containsPopupWindowDisplayTitles(String p0){
       Objects.requireNonNull(p0);
       return this.instance.getPopupWindowDisplayTitlesMap().containsKey(p0);
    }
    public boolean containsTopic(String p0){
       Objects.requireNonNull(p0);
       return this.instance.getTopicMap().containsKey(p0);
    }
    public int getActivityId(){
       return this.instance.getActivityId();
    }
    public AdjustIntensityConfig getAdjustIntensityConfig(){
       return this.instance.getAdjustIntensityConfig();
    }
    public int getAndroidFrameworkVersion(){
       return this.instance.getAndroidFrameworkVersion();
    }
    public ARConfig getArConfig(){
       return this.instance.getArConfig();
    }
    public ARSpec getArSpec(){
       return this.instance.getArSpec();
    }
    public int getArSpecValue(){
       return this.instance.getArSpecValue();
    }
    public String getAudioPath(){
       return this.instance.getAudioPath();
    }
    public ByteString getAudioPathBytes(){
       return this.instance.getAudioPathBytes();
    }
    public double getAudioPosition(){
       return this.instance.getAudioPosition();
    }
    public Map getBackCameraLocaleTips(){
       return this.getBackCameraLocaleTipsMap();
    }
    public int getBackCameraLocaleTipsCount(){
       return this.instance.getBackCameraLocaleTipsMap().size();
    }
    public Map getBackCameraLocaleTipsMap(){
       return Collections.unmodifiableMap(this.instance.getBackCameraLocaleTipsMap());
    }
    public String getBackCameraLocaleTipsOrDefault(String p0,String p1){
       Objects.requireNonNull(p0);
       Map backCameraLo = this.instance.getBackCameraLocaleTipsMap();
       if (backCameraLo.containsKey(p0)) {
          p1 = backCameraLo.get(p0);
       }
       return p1;
    }
    public String getBackCameraLocaleTipsOrThrow(String p0){
       Objects.requireNonNull(p0);
       Map backCameraLo = this.instance.getBackCameraLocaleTipsMap();
       if (backCameraLo.containsKey(p0)) {
          return backCameraLo.get(p0);
       }
       throw new IllegalArgumentException();
    }
    public CameraFacing getCameraFacing(){
       return this.instance.getCameraFacing();
    }
    public int getCameraFacingValue(){
       return this.instance.getCameraFacingValue();
    }
    public CaptureOriginalConfig getCaptureOriginalConfig(){
       return this.instance.getCaptureOriginalConfig();
    }
    public Map getCustomStickerJson(){
       return this.getCustomStickerJsonMap();
    }
    public int getCustomStickerJsonCount(){
       return this.instance.getCustomStickerJsonMap().size();
    }
    public Map getCustomStickerJsonMap(){
       return Collections.unmodifiableMap(this.instance.getCustomStickerJsonMap());
    }
    public String getCustomStickerJsonOrDefault(String p0,String p1){
       Objects.requireNonNull(p0);
       Map customSticke = this.instance.getCustomStickerJsonMap();
       if (customSticke.containsKey(p0)) {
          p1 = customSticke.get(p0);
       }
       return p1;
    }
    public String getCustomStickerJsonOrThrow(String p0){
       Objects.requireNonNull(p0);
       Map customSticke = this.instance.getCustomStickerJsonMap();
       if (customSticke.containsKey(p0)) {
          return customSticke.get(p0);
       }
       throw new IllegalArgumentException();
    }
    public boolean getDefaultCountdown(){
       return this.instance.getDefaultCountdown();
    }
    public int getDelayRecordTime(){
       return this.instance.getDelayRecordTime();
    }
    public boolean getDisableBackgroundMusic(){
       return this.instance.getDisableBackgroundMusic();
    }
    public boolean getDisableCustomBeautify(){
       return this.instance.getDisableCustomBeautify();
    }
    public boolean getDisableCustomColorFilter(){
       return this.instance.getDisableCustomColorFilter();
    }
    public boolean getDisableCustomDeform(){
       return this.instance.getDisableCustomDeform();
    }
    public boolean getDisableCustomMakeup(){
       return this.instance.getDisableCustomMakeup();
    }
    public boolean getDisableCustomSlimming(){
       return this.instance.getDisableCustomSlimming();
    }
    public EditAudioType getEditAudioType(){
       return this.instance.getEditAudioType();
    }
    public int getEditAudioTypeValue(){
       return this.instance.getEditAudioTypeValue();
    }
    public boolean getEffectHasAudio(){
       return this.instance.getEffectHasAudio();
    }
    public boolean getEffectLoadFailed(){
       return this.instance.getEffectLoadFailed();
    }
    public EffectPerformance getEffectPerformance(){
       return this.instance.getEffectPerformance();
    }
    public int getEffectPerformanceValue(){
       return this.instance.getEffectPerformanceValue();
    }
    public String getEffects(int p0){
       return this.instance.getEffects(p0);
    }
    public ByteString getEffectsBytes(int p0){
       return this.instance.getEffectsBytes(p0);
    }
    public int getEffectsCount(){
       return this.instance.getEffectsCount();
    }
    public List getEffectsList(){
       return Collections.unmodifiableList(this.instance.getEffectsList());
    }
    public EmbeddedPickingMedia getEmbeddedPickingMedias(int p0){
       return this.instance.getEmbeddedPickingMedias(p0);
    }
    public int getEmbeddedPickingMediasCount(){
       return this.instance.getEmbeddedPickingMediasCount();
    }
    public List getEmbeddedPickingMediasList(){
       return Collections.unmodifiableList(this.instance.getEmbeddedPickingMediasList());
    }
    public boolean getEnableVideoStabilization(){
       return this.instance.getEnableVideoStabilization();
    }
    public boolean getEraseAudio(){
       return this.instance.getEraseAudio();
    }
    public String getFaceMagicEncodeProfile(){
       return this.instance.getFaceMagicEncodeProfile();
    }
    public ByteString getFaceMagicEncodeProfileBytes(){
       return this.instance.getFaceMagicEncodeProfileBytes();
    }
    public Map getFrontCameraLocaleTips(){
       return this.getFrontCameraLocaleTipsMap();
    }
    public int getFrontCameraLocaleTipsCount(){
       return this.instance.getFrontCameraLocaleTipsMap().size();
    }
    public Map getFrontCameraLocaleTipsMap(){
       return Collections.unmodifiableMap(this.instance.getFrontCameraLocaleTipsMap());
    }
    public String getFrontCameraLocaleTipsOrDefault(String p0,String p1){
       Objects.requireNonNull(p0);
       Map frontCameraL = this.instance.getFrontCameraLocaleTipsMap();
       if (frontCameraL.containsKey(p0)) {
          p1 = frontCameraL.get(p0);
       }
       return p1;
    }
    public String getFrontCameraLocaleTipsOrThrow(String p0){
       Objects.requireNonNull(p0);
       Map frontCameraL = this.instance.getFrontCameraLocaleTipsMap();
       if (frontCameraL.containsKey(p0)) {
          return frontCameraL.get(p0);
       }
       throw new IllegalArgumentException();
    }
    public float getGiftDisplayTime(){
       return this.instance.getGiftDisplayTime();
    }
    public Map getGuideConfig(){
       return this.getGuideConfigMap();
    }
    public int getGuideConfigCount(){
       return this.instance.getGuideConfigMap().size();
    }
    public Map getGuideConfigMap(){
       return Collections.unmodifiableMap(this.instance.getGuideConfigMap());
    }
    public GuideConfig getGuideConfigOrDefault(String p0,GuideConfig p1){
       Objects.requireNonNull(p0);
       Map guideConfigM = this.instance.getGuideConfigMap();
       if (guideConfigM.containsKey(p0)) {
          p1 = guideConfigM.get(p0);
       }
       return p1;
    }
    public GuideConfig getGuideConfigOrThrow(String p0){
       Objects.requireNonNull(p0);
       Map guideConfigM = this.instance.getGuideConfigMap();
       if (guideConfigM.containsKey(p0)) {
          return guideConfigM.get(p0);
       }
       throw new IllegalArgumentException();
    }
    public boolean getHasBoomgameEffect(){
       return this.instance.getHasBoomgameEffect();
    }
    public boolean getHasMmuVoiceChange(){
       return this.instance.getHasMmuVoiceChange();
    }
    public ImageLocaleTips getImageLocaleTips(){
       return this.instance.getImageLocaleTips();
    }
    public TriggerInputTextGroupConfig getInputTextGroupInfo(){
       return this.instance.getInputTextGroupInfo();
    }
    public boolean getIsMemojiEffect(){
       return this.instance.getIsMemojiEffect();
    }
    public boolean getKeepAlive(){
       return this.instance.getKeepAlive();
    }
    public Map getLocaleTips(){
       return this.getLocaleTipsMap();
    }
    public int getLocaleTipsCount(){
       return this.instance.getLocaleTipsMap().size();
    }
    public Map getLocaleTipsMap(){
       return Collections.unmodifiableMap(this.instance.getLocaleTipsMap());
    }
    public String getLocaleTipsOrDefault(String p0,String p1){
       Objects.requireNonNull(p0);
       Map localeTipsMa = this.instance.getLocaleTipsMap();
       if (localeTipsMa.containsKey(p0)) {
          p1 = localeTipsMa.get(p0);
       }
       return p1;
    }
    public String getLocaleTipsOrThrow(String p0){
       Objects.requireNonNull(p0);
       Map localeTipsMa = this.instance.getLocaleTipsMap();
       if (localeTipsMa.containsKey(p0)) {
          return localeTipsMa.get(p0);
       }
       throw new IllegalArgumentException();
    }
    public LookupConfig getLookupConfig(){
       return this.instance.getLookupConfig();
    }
    public PickMoreMediaInfo getMediaInfo(){
       return this.instance.getMediaInfo();
    }
    public String getMemojiStyleConfigJson(){
       return this.instance.getMemojiStyleConfigJson();
    }
    public ByteString getMemojiStyleConfigJsonBytes(){
       return this.instance.getMemojiStyleConfigJsonBytes();
    }
    public boolean getNeedClientWorkProcess(){
       return this.instance.getNeedClientWorkProcess();
    }
    public boolean getNeedLocation(){
       return this.instance.getNeedLocation();
    }
    public boolean getNeedMusicWave(){
       return this.instance.getNeedMusicWave();
    }
    public boolean getNeedPickFirstMedia(){
       return this.instance.getNeedPickFirstMedia();
    }
    public int getNeedPickMediaResourceType(){
       return this.instance.getNeedPickMediaResourceType();
    }
    public boolean getNeedPinch(){
       return this.instance.getNeedPinch();
    }
    public boolean getNeedReversePlay(){
       return this.instance.getNeedReversePlay();
    }
    public boolean getNeedSubFrame(){
       return this.instance.getNeedSubFrame();
    }
    public boolean getNeedSwapFace(){
       return this.instance.getNeedSwapFace();
    }
    public boolean getNeedSwipe(){
       return this.instance.getNeedSwipe();
    }
    public boolean getNeedTouch(){
       return this.instance.getNeedTouch();
    }
    public boolean getOrientationLocked(){
       return this.instance.getOrientationLocked();
    }
    public PickingVideoConfig getPickingVideoConfig(){
       return this.instance.getPickingVideoConfig();
    }
    public PopupWindowConfig getPopupConfig(int p0){
       return this.instance.getPopupConfig(p0);
    }
    public int getPopupConfigCount(){
       return this.instance.getPopupConfigCount();
    }
    public List getPopupConfigList(){
       return Collections.unmodifiableList(this.instance.getPopupConfigList());
    }
    public Map getPopupWindowDisplayTitles(){
       return this.getPopupWindowDisplayTitlesMap();
    }
    public int getPopupWindowDisplayTitlesCount(){
       return this.instance.getPopupWindowDisplayTitlesMap().size();
    }
    public Map getPopupWindowDisplayTitlesMap(){
       return Collections.unmodifiableMap(this.instance.getPopupWindowDisplayTitlesMap());
    }
    public TitleDatas getPopupWindowDisplayTitlesOrDefault(String p0,TitleDatas p1){
       Objects.requireNonNull(p0);
       Map popupWindowD = this.instance.getPopupWindowDisplayTitlesMap();
       if (popupWindowD.containsKey(p0)) {
          p1 = popupWindowD.get(p0);
       }
       return p1;
    }
    public TitleDatas getPopupWindowDisplayTitlesOrThrow(String p0){
       Objects.requireNonNull(p0);
       Map popupWindowD = this.instance.getPopupWindowDisplayTitlesMap();
       if (popupWindowD.containsKey(p0)) {
          return popupWindowD.get(p0);
       }
       throw new IllegalArgumentException();
    }
    public EffectErrorCode getRenderCode(){
       return this.instance.getRenderCode();
    }
    public String getRenderCodeReason(){
       return this.instance.getRenderCodeReason();
    }
    public ByteString getRenderCodeReasonBytes(){
       return this.instance.getRenderCodeReasonBytes();
    }
    public int getRenderCodeValue(){
       return this.instance.getRenderCodeValue();
    }
    public EffectSlot getRenderSlot(){
       return this.instance.getRenderSlot();
    }
    public int getRenderSlotValue(){
       return this.instance.getRenderSlotValue();
    }
    public boolean getRequireFacialReco(){
       return this.instance.getRequireFacialReco();
    }
    public boolean getRequirePreviewLayerRender(){
       return this.instance.getRequirePreviewLayerRender();
    }
    public boolean getResetWhenRecord(){
       return this.instance.getResetWhenRecord();
    }
    public ServerProcessingInfo getServerProcessingInfo(){
       return this.instance.getServerProcessingInfo();
    }
    public int getSubCount(){
       return this.instance.getSubCount();
    }
    public String getSwapFaceEmbededIcon(int p0){
       return this.instance.getSwapFaceEmbededIcon(p0);
    }
    public ByteString getSwapFaceEmbededIconBytes(int p0){
       return this.instance.getSwapFaceEmbededIconBytes(p0);
    }
    public int getSwapFaceEmbededIconCount(){
       return this.instance.getSwapFaceEmbededIconCount();
    }
    public List getSwapFaceEmbededIconList(){
       return Collections.unmodifiableList(this.instance.getSwapFaceEmbededIconList());
    }
    public String getSwapFaceEmbededImages(int p0){
       return this.instance.getSwapFaceEmbededImages(p0);
    }
    public ByteString getSwapFaceEmbededImagesBytes(int p0){
       return this.instance.getSwapFaceEmbededImagesBytes(p0);
    }
    public int getSwapFaceEmbededImagesCount(){
       return this.instance.getSwapFaceEmbededImagesCount();
    }
    public List getSwapFaceEmbededImagesList(){
       return Collections.unmodifiableList(this.instance.getSwapFaceEmbededImagesList());
    }
    public Map getTopic(){
       return this.getTopicMap();
    }
    public int getTopicCount(){
       return this.instance.getTopicMap().size();
    }
    public Map getTopicMap(){
       return Collections.unmodifiableMap(this.instance.getTopicMap());
    }
    public String getTopicOrDefault(String p0,String p1){
       Objects.requireNonNull(p0);
       Map topicMap = this.instance.getTopicMap();
       if (topicMap.containsKey(p0)) {
          p1 = topicMap.get(p0);
       }
       return p1;
    }
    public String getTopicOrThrow(String p0){
       Objects.requireNonNull(p0);
       Map topicMap = this.instance.getTopicMap();
       if (topicMap.containsKey(p0)) {
          return topicMap.get(p0);
       }
       throw new IllegalArgumentException();
    }
    public long getTrackId(){
       return this.instance.getTrackId();
    }
    public TriggerInputTextConfig getTriggerInputTextConfig(){
       return this.instance.getTriggerInputTextConfig();
    }
    public TriggerInputTextConfig getTriggerInputTextsConfig(int p0){
       return this.instance.getTriggerInputTextsConfig(p0);
    }
    public int getTriggerInputTextsConfigCount(){
       return this.instance.getTriggerInputTextsConfigCount();
    }
    public List getTriggerInputTextsConfigList(){
       return Collections.unmodifiableList(this.instance.getTriggerInputTextsConfigList());
    }
    public boolean getUseAudioStream(){
       return this.instance.getUseAudioStream();
    }
    public boolean getUseClientTimeStamp(){
       return this.instance.getUseClientTimeStamp();
    }
    public boolean getUseLastFrameForCover(){
       return this.instance.getUseLastFrameForCover();
    }
    public VideoLength getVideoLength(){
       return this.instance.getVideoLength();
    }
    public int getVideoLengthMs(){
       return this.instance.getVideoLengthMs();
    }
    public int getVideoLengthValue(){
       return this.instance.getVideoLengthValue();
    }
    public boolean hasAdjustIntensityConfig(){
       return this.instance.hasAdjustIntensityConfig();
    }
    public boolean hasArConfig(){
       return this.instance.hasArConfig();
    }
    public boolean hasCaptureOriginalConfig(){
       return this.instance.hasCaptureOriginalConfig();
    }
    public boolean hasImageLocaleTips(){
       return this.instance.hasImageLocaleTips();
    }
    public boolean hasInputTextGroupInfo(){
       return this.instance.hasInputTextGroupInfo();
    }
    public boolean hasLookupConfig(){
       return this.instance.hasLookupConfig();
    }
    public boolean hasMediaInfo(){
       return this.instance.hasMediaInfo();
    }
    public boolean hasPickingVideoConfig(){
       return this.instance.hasPickingVideoConfig();
    }
    public boolean hasServerProcessingInfo(){
       return this.instance.hasServerProcessingInfo();
    }
    public boolean hasTriggerInputTextConfig(){
       return this.instance.hasTriggerInputTextConfig();
    }
    public EffectDescription$Builder mergeAdjustIntensityConfig(AdjustIntensityConfig p0){
       this.copyOnWrite();
       this.instance.mergeAdjustIntensityConfig(p0);
       return this;
    }
    public EffectDescription$Builder mergeArConfig(ARConfig p0){
       this.copyOnWrite();
       this.instance.mergeArConfig(p0);
       return this;
    }
    public EffectDescription$Builder mergeCaptureOriginalConfig(CaptureOriginalConfig p0){
       this.copyOnWrite();
       this.instance.mergeCaptureOriginalConfig(p0);
       return this;
    }
    public EffectDescription$Builder mergeImageLocaleTips(ImageLocaleTips p0){
       this.copyOnWrite();
       this.instance.mergeImageLocaleTips(p0);
       return this;
    }
    public EffectDescription$Builder mergeInputTextGroupInfo(TriggerInputTextGroupConfig p0){
       this.copyOnWrite();
       this.instance.mergeInputTextGroupInfo(p0);
       return this;
    }
    public EffectDescription$Builder mergeLookupConfig(LookupConfig p0){
       this.copyOnWrite();
       this.instance.mergeLookupConfig(p0);
       return this;
    }
    public EffectDescription$Builder mergeMediaInfo(PickMoreMediaInfo p0){
       this.copyOnWrite();
       this.instance.mergeMediaInfo(p0);
       return this;
    }
    public EffectDescription$Builder mergePickingVideoConfig(PickingVideoConfig p0){
       this.copyOnWrite();
       this.instance.mergePickingVideoConfig(p0);
       return this;
    }
    public EffectDescription$Builder mergeServerProcessingInfo(ServerProcessingInfo p0){
       this.copyOnWrite();
       this.instance.mergeServerProcessingInfo(p0);
       return this;
    }
    public EffectDescription$Builder mergeTriggerInputTextConfig(TriggerInputTextConfig p0){
       this.copyOnWrite();
       this.instance.mergeTriggerInputTextConfig(p0);
       return this;
    }
    public EffectDescription$Builder putAllBackCameraLocaleTips(Map p0){
       this.copyOnWrite();
       this.instance.getMutableBackCameraLocaleTipsMap().putAll(p0);
       return this;
    }
    public EffectDescription$Builder putAllCustomStickerJson(Map p0){
       this.copyOnWrite();
       this.instance.getMutableCustomStickerJsonMap().putAll(p0);
       return this;
    }
    public EffectDescription$Builder putAllFrontCameraLocaleTips(Map p0){
       this.copyOnWrite();
       this.instance.getMutableFrontCameraLocaleTipsMap().putAll(p0);
       return this;
    }
    public EffectDescription$Builder putAllGuideConfig(Map p0){
       this.copyOnWrite();
       this.instance.getMutableGuideConfigMap().putAll(p0);
       return this;
    }
    public EffectDescription$Builder putAllLocaleTips(Map p0){
       this.copyOnWrite();
       this.instance.getMutableLocaleTipsMap().putAll(p0);
       return this;
    }
    public EffectDescription$Builder putAllPopupWindowDisplayTitles(Map p0){
       this.copyOnWrite();
       this.instance.getMutablePopupWindowDisplayTitlesMap().putAll(p0);
       return this;
    }
    public EffectDescription$Builder putAllTopic(Map p0){
       this.copyOnWrite();
       this.instance.getMutableTopicMap().putAll(p0);
       return this;
    }
    public EffectDescription$Builder putBackCameraLocaleTips(String p0,String p1){
       Objects.requireNonNull(p0);
       Objects.requireNonNull(p1);
       this.copyOnWrite();
       this.instance.getMutableBackCameraLocaleTipsMap().put(p0, p1);
       return this;
    }
    public EffectDescription$Builder putCustomStickerJson(String p0,String p1){
       Objects.requireNonNull(p0);
       Objects.requireNonNull(p1);
       this.copyOnWrite();
       this.instance.getMutableCustomStickerJsonMap().put(p0, p1);
       return this;
    }
    public EffectDescription$Builder putFrontCameraLocaleTips(String p0,String p1){
       Objects.requireNonNull(p0);
       Objects.requireNonNull(p1);
       this.copyOnWrite();
       this.instance.getMutableFrontCameraLocaleTipsMap().put(p0, p1);
       return this;
    }
    public EffectDescription$Builder putGuideConfig(String p0,GuideConfig p1){
       Objects.requireNonNull(p0);
       Objects.requireNonNull(p1);
       this.copyOnWrite();
       this.instance.getMutableGuideConfigMap().put(p0, p1);
       return this;
    }
    public EffectDescription$Builder putLocaleTips(String p0,String p1){
       Objects.requireNonNull(p0);
       Objects.requireNonNull(p1);
       this.copyOnWrite();
       this.instance.getMutableLocaleTipsMap().put(p0, p1);
       return this;
    }
    public EffectDescription$Builder putPopupWindowDisplayTitles(String p0,TitleDatas p1){
       Objects.requireNonNull(p0);
       Objects.requireNonNull(p1);
       this.copyOnWrite();
       this.instance.getMutablePopupWindowDisplayTitlesMap().put(p0, p1);
       return this;
    }
    public EffectDescription$Builder putTopic(String p0,String p1){
       Objects.requireNonNull(p0);
       Objects.requireNonNull(p1);
       this.copyOnWrite();
       this.instance.getMutableTopicMap().put(p0, p1);
       return this;
    }
    public EffectDescription$Builder removeBackCameraLocaleTips(String p0){
       Objects.requireNonNull(p0);
       this.copyOnWrite();
       this.instance.getMutableBackCameraLocaleTipsMap().remove(p0);
       return this;
    }
    public EffectDescription$Builder removeCustomStickerJson(String p0){
       Objects.requireNonNull(p0);
       this.copyOnWrite();
       this.instance.getMutableCustomStickerJsonMap().remove(p0);
       return this;
    }
    public EffectDescription$Builder removeEmbeddedPickingMedias(int p0){
       this.copyOnWrite();
       this.instance.removeEmbeddedPickingMedias(p0);
       return this;
    }
    public EffectDescription$Builder removeFrontCameraLocaleTips(String p0){
       Objects.requireNonNull(p0);
       this.copyOnWrite();
       this.instance.getMutableFrontCameraLocaleTipsMap().remove(p0);
       return this;
    }
    public EffectDescription$Builder removeGuideConfig(String p0){
       Objects.requireNonNull(p0);
       this.copyOnWrite();
       this.instance.getMutableGuideConfigMap().remove(p0);
       return this;
    }
    public EffectDescription$Builder removeLocaleTips(String p0){
       Objects.requireNonNull(p0);
       this.copyOnWrite();
       this.instance.getMutableLocaleTipsMap().remove(p0);
       return this;
    }
    public EffectDescription$Builder removePopupConfig(int p0){
       this.copyOnWrite();
       this.instance.removePopupConfig(p0);
       return this;
    }
    public EffectDescription$Builder removePopupWindowDisplayTitles(String p0){
       Objects.requireNonNull(p0);
       this.copyOnWrite();
       this.instance.getMutablePopupWindowDisplayTitlesMap().remove(p0);
       return this;
    }
    public EffectDescription$Builder removeTopic(String p0){
       Objects.requireNonNull(p0);
       this.copyOnWrite();
       this.instance.getMutableTopicMap().remove(p0);
       return this;
    }
    public EffectDescription$Builder removeTriggerInputTextsConfig(int p0){
       this.copyOnWrite();
       this.instance.removeTriggerInputTextsConfig(p0);
       return this;
    }
    public EffectDescription$Builder setActivityId(int p0){
       this.copyOnWrite();
       this.instance.setActivityId(p0);
       return this;
    }
    public EffectDescription$Builder setAdjustIntensityConfig(AdjustIntensityConfig$Builder p0){
       this.copyOnWrite();
       this.instance.setAdjustIntensityConfig(p0);
       return this;
    }
    public EffectDescription$Builder setAdjustIntensityConfig(AdjustIntensityConfig p0){
       this.copyOnWrite();
       this.instance.setAdjustIntensityConfig(p0);
       return this;
    }
    public EffectDescription$Builder setAndroidFrameworkVersion(int p0){
       this.copyOnWrite();
       this.instance.setAndroidFrameworkVersion(p0);
       return this;
    }
    public EffectDescription$Builder setArConfig(ARConfig$Builder p0){
       this.copyOnWrite();
       this.instance.setArConfig(p0);
       return this;
    }
    public EffectDescription$Builder setArConfig(ARConfig p0){
       this.copyOnWrite();
       this.instance.setArConfig(p0);
       return this;
    }
    public EffectDescription$Builder setArSpec(ARSpec p0){
       this.copyOnWrite();
       this.instance.setArSpec(p0);
       return this;
    }
    public EffectDescription$Builder setArSpecValue(int p0){
       this.copyOnWrite();
       this.instance.setArSpecValue(p0);
       return this;
    }
    public EffectDescription$Builder setAudioPath(String p0){
       this.copyOnWrite();
       this.instance.setAudioPath(p0);
       return this;
    }
    public EffectDescription$Builder setAudioPathBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setAudioPathBytes(p0);
       return this;
    }
    public EffectDescription$Builder setAudioPosition(double p0){
       this.copyOnWrite();
       this.instance.setAudioPosition(p0);
       return this;
    }
    public EffectDescription$Builder setCameraFacing(CameraFacing p0){
       this.copyOnWrite();
       this.instance.setCameraFacing(p0);
       return this;
    }
    public EffectDescription$Builder setCameraFacingValue(int p0){
       this.copyOnWrite();
       this.instance.setCameraFacingValue(p0);
       return this;
    }
    public EffectDescription$Builder setCaptureOriginalConfig(CaptureOriginalConfig$Builder p0){
       this.copyOnWrite();
       this.instance.setCaptureOriginalConfig(p0);
       return this;
    }
    public EffectDescription$Builder setCaptureOriginalConfig(CaptureOriginalConfig p0){
       this.copyOnWrite();
       this.instance.setCaptureOriginalConfig(p0);
       return this;
    }
    public EffectDescription$Builder setDefaultCountdown(boolean p0){
       this.copyOnWrite();
       this.instance.setDefaultCountdown(p0);
       return this;
    }
    public EffectDescription$Builder setDelayRecordTime(int p0){
       this.copyOnWrite();
       this.instance.setDelayRecordTime(p0);
       return this;
    }
    public EffectDescription$Builder setDisableBackgroundMusic(boolean p0){
       this.copyOnWrite();
       this.instance.setDisableBackgroundMusic(p0);
       return this;
    }
    public EffectDescription$Builder setDisableCustomBeautify(boolean p0){
       this.copyOnWrite();
       this.instance.setDisableCustomBeautify(p0);
       return this;
    }
    public EffectDescription$Builder setDisableCustomColorFilter(boolean p0){
       this.copyOnWrite();
       this.instance.setDisableCustomColorFilter(p0);
       return this;
    }
    public EffectDescription$Builder setDisableCustomDeform(boolean p0){
       this.copyOnWrite();
       this.instance.setDisableCustomDeform(p0);
       return this;
    }
    public EffectDescription$Builder setDisableCustomMakeup(boolean p0){
       this.copyOnWrite();
       this.instance.setDisableCustomMakeup(p0);
       return this;
    }
    public EffectDescription$Builder setDisableCustomSlimming(boolean p0){
       this.copyOnWrite();
       this.instance.setDisableCustomSlimming(p0);
       return this;
    }
    public EffectDescription$Builder setEditAudioType(EditAudioType p0){
       this.copyOnWrite();
       this.instance.setEditAudioType(p0);
       return this;
    }
    public EffectDescription$Builder setEditAudioTypeValue(int p0){
       this.copyOnWrite();
       this.instance.setEditAudioTypeValue(p0);
       return this;
    }
    public EffectDescription$Builder setEffectHasAudio(boolean p0){
       this.copyOnWrite();
       this.instance.setEffectHasAudio(p0);
       return this;
    }
    public EffectDescription$Builder setEffectLoadFailed(boolean p0){
       this.copyOnWrite();
       this.instance.setEffectLoadFailed(p0);
       return this;
    }
    public EffectDescription$Builder setEffectPerformance(EffectPerformance p0){
       this.copyOnWrite();
       this.instance.setEffectPerformance(p0);
       return this;
    }
    public EffectDescription$Builder setEffectPerformanceValue(int p0){
       this.copyOnWrite();
       this.instance.setEffectPerformanceValue(p0);
       return this;
    }
    public EffectDescription$Builder setEffects(int p0,String p1){
       this.copyOnWrite();
       this.instance.setEffects(p0, p1);
       return this;
    }
    public EffectDescription$Builder setEmbeddedPickingMedias(int p0,EmbeddedPickingMedia$Builder p1){
       this.copyOnWrite();
       this.instance.setEmbeddedPickingMedias(p0, p1);
       return this;
    }
    public EffectDescription$Builder setEmbeddedPickingMedias(int p0,EmbeddedPickingMedia p1){
       this.copyOnWrite();
       this.instance.setEmbeddedPickingMedias(p0, p1);
       return this;
    }
    public EffectDescription$Builder setEnableVideoStabilization(boolean p0){
       this.copyOnWrite();
       this.instance.setEnableVideoStabilization(p0);
       return this;
    }
    public EffectDescription$Builder setEraseAudio(boolean p0){
       this.copyOnWrite();
       this.instance.setEraseAudio(p0);
       return this;
    }
    public EffectDescription$Builder setFaceMagicEncodeProfile(String p0){
       this.copyOnWrite();
       this.instance.setFaceMagicEncodeProfile(p0);
       return this;
    }
    public EffectDescription$Builder setFaceMagicEncodeProfileBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setFaceMagicEncodeProfileBytes(p0);
       return this;
    }
    public EffectDescription$Builder setGiftDisplayTime(float p0){
       this.copyOnWrite();
       this.instance.setGiftDisplayTime(p0);
       return this;
    }
    public EffectDescription$Builder setHasBoomgameEffect(boolean p0){
       this.copyOnWrite();
       this.instance.setHasBoomgameEffect(p0);
       return this;
    }
    public EffectDescription$Builder setHasMmuVoiceChange(boolean p0){
       this.copyOnWrite();
       this.instance.setHasMmuVoiceChange(p0);
       return this;
    }
    public EffectDescription$Builder setImageLocaleTips(ImageLocaleTips$Builder p0){
       this.copyOnWrite();
       this.instance.setImageLocaleTips(p0);
       return this;
    }
    public EffectDescription$Builder setImageLocaleTips(ImageLocaleTips p0){
       this.copyOnWrite();
       this.instance.setImageLocaleTips(p0);
       return this;
    }
    public EffectDescription$Builder setInputTextGroupInfo(TriggerInputTextGroupConfig$Builder p0){
       this.copyOnWrite();
       this.instance.setInputTextGroupInfo(p0);
       return this;
    }
    public EffectDescription$Builder setInputTextGroupInfo(TriggerInputTextGroupConfig p0){
       this.copyOnWrite();
       this.instance.setInputTextGroupInfo(p0);
       return this;
    }
    public EffectDescription$Builder setIsMemojiEffect(boolean p0){
       this.copyOnWrite();
       this.instance.setIsMemojiEffect(p0);
       return this;
    }
    public EffectDescription$Builder setKeepAlive(boolean p0){
       this.copyOnWrite();
       this.instance.setKeepAlive(p0);
       return this;
    }
    public EffectDescription$Builder setLookupConfig(LookupConfig$Builder p0){
       this.copyOnWrite();
       this.instance.setLookupConfig(p0);
       return this;
    }
    public EffectDescription$Builder setLookupConfig(LookupConfig p0){
       this.copyOnWrite();
       this.instance.setLookupConfig(p0);
       return this;
    }
    public EffectDescription$Builder setMediaInfo(PickMoreMediaInfo$Builder p0){
       this.copyOnWrite();
       this.instance.setMediaInfo(p0);
       return this;
    }
    public EffectDescription$Builder setMediaInfo(PickMoreMediaInfo p0){
       this.copyOnWrite();
       this.instance.setMediaInfo(p0);
       return this;
    }
    public EffectDescription$Builder setMemojiStyleConfigJson(String p0){
       this.copyOnWrite();
       this.instance.setMemojiStyleConfigJson(p0);
       return this;
    }
    public EffectDescription$Builder setMemojiStyleConfigJsonBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setMemojiStyleConfigJsonBytes(p0);
       return this;
    }
    public EffectDescription$Builder setNeedClientWorkProcess(boolean p0){
       this.copyOnWrite();
       this.instance.setNeedClientWorkProcess(p0);
       return this;
    }
    public EffectDescription$Builder setNeedLocation(boolean p0){
       this.copyOnWrite();
       this.instance.setNeedLocation(p0);
       return this;
    }
    public EffectDescription$Builder setNeedMusicWave(boolean p0){
       this.copyOnWrite();
       this.instance.setNeedMusicWave(p0);
       return this;
    }
    public EffectDescription$Builder setNeedPickFirstMedia(boolean p0){
       this.copyOnWrite();
       this.instance.setNeedPickFirstMedia(p0);
       return this;
    }
    public EffectDescription$Builder setNeedPickMediaResourceType(int p0){
       this.copyOnWrite();
       this.instance.setNeedPickMediaResourceType(p0);
       return this;
    }
    public EffectDescription$Builder setNeedPinch(boolean p0){
       this.copyOnWrite();
       this.instance.setNeedPinch(p0);
       return this;
    }
    public EffectDescription$Builder setNeedReversePlay(boolean p0){
       this.copyOnWrite();
       this.instance.setNeedReversePlay(p0);
       return this;
    }
    public EffectDescription$Builder setNeedSubFrame(boolean p0){
       this.copyOnWrite();
       this.instance.setNeedSubFrame(p0);
       return this;
    }
    public EffectDescription$Builder setNeedSwapFace(boolean p0){
       this.copyOnWrite();
       this.instance.setNeedSwapFace(p0);
       return this;
    }
    public EffectDescription$Builder setNeedSwipe(boolean p0){
       this.copyOnWrite();
       this.instance.setNeedSwipe(p0);
       return this;
    }
    public EffectDescription$Builder setNeedTouch(boolean p0){
       this.copyOnWrite();
       this.instance.setNeedTouch(p0);
       return this;
    }
    public EffectDescription$Builder setOrientationLocked(boolean p0){
       this.copyOnWrite();
       this.instance.setOrientationLocked(p0);
       return this;
    }
    public EffectDescription$Builder setPickingVideoConfig(PickingVideoConfig$Builder p0){
       this.copyOnWrite();
       this.instance.setPickingVideoConfig(p0);
       return this;
    }
    public EffectDescription$Builder setPickingVideoConfig(PickingVideoConfig p0){
       this.copyOnWrite();
       this.instance.setPickingVideoConfig(p0);
       return this;
    }
    public EffectDescription$Builder setPopupConfig(int p0,PopupWindowConfig$Builder p1){
       this.copyOnWrite();
       this.instance.setPopupConfig(p0, p1);
       return this;
    }
    public EffectDescription$Builder setPopupConfig(int p0,PopupWindowConfig p1){
       this.copyOnWrite();
       this.instance.setPopupConfig(p0, p1);
       return this;
    }
    public EffectDescription$Builder setRenderCode(EffectErrorCode p0){
       this.copyOnWrite();
       this.instance.setRenderCode(p0);
       return this;
    }
    public EffectDescription$Builder setRenderCodeReason(String p0){
       this.copyOnWrite();
       this.instance.setRenderCodeReason(p0);
       return this;
    }
    public EffectDescription$Builder setRenderCodeReasonBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setRenderCodeReasonBytes(p0);
       return this;
    }
    public EffectDescription$Builder setRenderCodeValue(int p0){
       this.copyOnWrite();
       this.instance.setRenderCodeValue(p0);
       return this;
    }
    public EffectDescription$Builder setRenderSlot(EffectSlot p0){
       this.copyOnWrite();
       this.instance.setRenderSlot(p0);
       return this;
    }
    public EffectDescription$Builder setRenderSlotValue(int p0){
       this.copyOnWrite();
       this.instance.setRenderSlotValue(p0);
       return this;
    }
    public EffectDescription$Builder setRequireFacialReco(boolean p0){
       this.copyOnWrite();
       this.instance.setRequireFacialReco(p0);
       return this;
    }
    public EffectDescription$Builder setRequirePreviewLayerRender(boolean p0){
       this.copyOnWrite();
       this.instance.setRequirePreviewLayerRender(p0);
       return this;
    }
    public EffectDescription$Builder setResetWhenRecord(boolean p0){
       this.copyOnWrite();
       this.instance.setResetWhenRecord(p0);
       return this;
    }
    public EffectDescription$Builder setServerProcessingInfo(ServerProcessingInfo$Builder p0){
       this.copyOnWrite();
       this.instance.setServerProcessingInfo(p0);
       return this;
    }
    public EffectDescription$Builder setServerProcessingInfo(ServerProcessingInfo p0){
       this.copyOnWrite();
       this.instance.setServerProcessingInfo(p0);
       return this;
    }
    public EffectDescription$Builder setSubCount(int p0){
       this.copyOnWrite();
       this.instance.setSubCount(p0);
       return this;
    }
    public EffectDescription$Builder setSwapFaceEmbededIcon(int p0,String p1){
       this.copyOnWrite();
       this.instance.setSwapFaceEmbededIcon(p0, p1);
       return this;
    }
    public EffectDescription$Builder setSwapFaceEmbededImages(int p0,String p1){
       this.copyOnWrite();
       this.instance.setSwapFaceEmbededImages(p0, p1);
       return this;
    }
    public EffectDescription$Builder setTrackId(long p0){
       this.copyOnWrite();
       this.instance.setTrackId(p0);
       return this;
    }
    public EffectDescription$Builder setTriggerInputTextConfig(TriggerInputTextConfig$Builder p0){
       this.copyOnWrite();
       this.instance.setTriggerInputTextConfig(p0);
       return this;
    }
    public EffectDescription$Builder setTriggerInputTextConfig(TriggerInputTextConfig p0){
       this.copyOnWrite();
       this.instance.setTriggerInputTextConfig(p0);
       return this;
    }
    public EffectDescription$Builder setTriggerInputTextsConfig(int p0,TriggerInputTextConfig$Builder p1){
       this.copyOnWrite();
       this.instance.setTriggerInputTextsConfig(p0, p1);
       return this;
    }
    public EffectDescription$Builder setTriggerInputTextsConfig(int p0,TriggerInputTextConfig p1){
       this.copyOnWrite();
       this.instance.setTriggerInputTextsConfig(p0, p1);
       return this;
    }
    public EffectDescription$Builder setUseAudioStream(boolean p0){
       this.copyOnWrite();
       this.instance.setUseAudioStream(p0);
       return this;
    }
    public EffectDescription$Builder setUseClientTimeStamp(boolean p0){
       this.copyOnWrite();
       this.instance.setUseClientTimeStamp(p0);
       return this;
    }
    public EffectDescription$Builder setUseLastFrameForCover(boolean p0){
       this.copyOnWrite();
       this.instance.setUseLastFrameForCover(p0);
       return this;
    }
    public EffectDescription$Builder setVideoLength(VideoLength p0){
       this.copyOnWrite();
       this.instance.setVideoLength(p0);
       return this;
    }
    public EffectDescription$Builder setVideoLengthMs(int p0){
       this.copyOnWrite();
       this.instance.setVideoLengthMs(p0);
       return this;
    }
    public EffectDescription$Builder setVideoLengthValue(int p0){
       this.copyOnWrite();
       this.instance.setVideoLengthValue(p0);
       return this;
    }
}
