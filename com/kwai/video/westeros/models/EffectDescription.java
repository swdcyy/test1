package com.kwai.video.westeros.models.EffectDescription;
import com.kwai.video.westeros.models.EffectDescriptionOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Internal$ProtobufList;
import com.kwai.video.westeros.models.EffectDescription$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import java.lang.Iterable;
import java.util.List;
import com.google.protobuf.AbstractMessageLite;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import com.kwai.video.westeros.models.EmbeddedPickingMedia$Builder;
import com.kwai.video.westeros.models.EmbeddedPickingMedia;
import com.kwai.video.westeros.models.PopupWindowConfig$Builder;
import com.kwai.video.westeros.models.PopupWindowConfig;
import com.kwai.video.westeros.models.TriggerInputTextConfig$Builder;
import com.kwai.video.westeros.models.TriggerInputTextConfig;
import java.util.LinkedHashMap;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.kwai.video.westeros.models.EffectDescription$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.kwai.video.westeros.models.EffectDescription$LocaleTipsDefaultEntryHolder;
import com.kwai.video.westeros.models.EffectDescription$FrontCameraLocaleTipsDefaultEntryHolder;
import com.kwai.video.westeros.models.EffectDescription$BackCameraLocaleTipsDefaultEntryHolder;
import com.kwai.video.westeros.models.EffectDescription$TopicDefaultEntryHolder;
import com.kwai.video.westeros.models.EffectDescription$GuideConfigDefaultEntryHolder;
import com.kwai.video.westeros.models.EffectDescription$CustomStickerJsonDefaultEntryHolder;
import com.kwai.video.westeros.models.EffectDescription$PopupWindowDisplayTitlesDefaultEntryHolder;
import com.google.protobuf.MessageLite;
import com.kwai.video.westeros.models.AdjustIntensityConfig;
import com.kwai.video.westeros.models.ARConfig;
import com.kwai.video.westeros.models.ARSpec;
import java.util.Map;
import java.util.Collections;
import java.util.HashMap;
import java.lang.IllegalArgumentException;
import com.kwai.video.westeros.models.CameraFacing;
import com.kwai.video.westeros.models.CaptureOriginalConfig;
import com.kwai.video.westeros.models.EditAudioType;
import com.kwai.video.westeros.models.EffectPerformance;
import com.kwai.video.westeros.models.EmbeddedPickingMediaOrBuilder;
import com.kwai.video.westeros.models.GuideConfig;
import com.kwai.video.westeros.models.ImageLocaleTips;
import com.kwai.video.westeros.models.TriggerInputTextGroupConfig;
import com.kwai.video.westeros.models.LookupConfig;
import com.kwai.video.westeros.models.PickMoreMediaInfo;
import com.kwai.video.westeros.models.PickingVideoConfig;
import com.kwai.video.westeros.models.PopupWindowConfigOrBuilder;
import com.kwai.video.westeros.models.TitleDatas;
import com.kwai.video.westeros.models.EffectErrorCode;
import com.kwai.video.westeros.models.EffectSlot;
import com.kwai.video.westeros.models.ServerProcessingInfo;
import com.kwai.video.westeros.models.TriggerInputTextConfigOrBuilder;
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

public final class EffectDescription extends GeneratedMessageLite implements EffectDescriptionOrBuilder	// class@000f16
{
    public int activityId_;
    public AdjustIntensityConfig adjustIntensityConfig_;
    public int androidFrameworkVersion_;
    public ARConfig arConfig_;
    public int arSpec_;
    public String audioPath_;
    public double audioPosition_;
    public MapFieldLite backCameraLocaleTips_;
    public int cameraFacing_;
    public CaptureOriginalConfig captureOriginalConfig_;
    public MapFieldLite customStickerJson_;
    public boolean defaultCountdown_;
    public int delayRecordTime_;
    public boolean disableBackgroundMusic_;
    public boolean disableCustomBeautify_;
    public boolean disableCustomColorFilter_;
    public boolean disableCustomDeform_;
    public boolean disableCustomMakeup_;
    public boolean disableCustomSlimming_;
    public int editAudioType_;
    public boolean effectHasAudio_;
    public boolean effectLoadFailed_;
    public int effectPerformance_;
    public Internal$ProtobufList effects_;
    public Internal$ProtobufList embeddedPickingMedias_;
    public boolean enableVideoStabilization_;
    public boolean eraseAudio_;
    public String faceMagicEncodeProfile_;
    public MapFieldLite frontCameraLocaleTips_;
    public float giftDisplayTime_;
    public MapFieldLite guideConfig_;
    public boolean hasBoomgameEffect_;
    public boolean hasMmuVoiceChange_;
    public ImageLocaleTips imageLocaleTips_;
    public TriggerInputTextGroupConfig inputTextGroupInfo_;
    public boolean isMemojiEffect_;
    public boolean keepAlive_;
    public MapFieldLite localeTips_;
    public LookupConfig lookupConfig_;
    public PickMoreMediaInfo mediaInfo_;
    public String memojiStyleConfigJson_;
    public boolean needClientWorkProcess_;
    public boolean needLocation_;
    public boolean needMusicWave_;
    public boolean needPickFirstMedia_;
    public int needPickMediaResourceType_;
    public boolean needPinch_;
    public boolean needReversePlay_;
    public boolean needSubFrame_;
    public boolean needSwapFace_;
    public boolean needSwipe_;
    public boolean needTouch_;
    public boolean orientationLocked_;
    public PickingVideoConfig pickingVideoConfig_;
    public Internal$ProtobufList popupConfig_;
    public MapFieldLite popupWindowDisplayTitles_;
    public String renderCodeReason_;
    public int renderCode_;
    public int renderSlot_;
    public boolean requireFacialReco_;
    public boolean requirePreviewLayerRender_;
    public boolean resetWhenRecord_;
    public ServerProcessingInfo serverProcessingInfo_;
    public int subCount_;
    public Internal$ProtobufList swapFaceEmbededIcon_;
    public Internal$ProtobufList swapFaceEmbededImages_;
    public MapFieldLite topic_;
    public long trackId_;
    public TriggerInputTextConfig triggerInputTextConfig_;
    public Internal$ProtobufList triggerInputTextsConfig_;
    public boolean useAudioStream_;
    public boolean useClientTimeStamp_;
    public boolean useLastFrameForCover_;
    public int videoLengthMs_;
    public int videoLength_;
    public static final EffectDescription DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       EffectDescription uEffectDescr = new EffectDescription();
       EffectDescription.DEFAULT_INSTANCE = uEffectDescr;
       GeneratedMessageLite.registerDefaultInstance(EffectDescription.class, uEffectDescr);
    }
    public void EffectDescription(){
       super();
       this.localeTips_ = MapFieldLite.emptyMapField();
       this.frontCameraLocaleTips_ = MapFieldLite.emptyMapField();
       this.backCameraLocaleTips_ = MapFieldLite.emptyMapField();
       this.topic_ = MapFieldLite.emptyMapField();
       this.guideConfig_ = MapFieldLite.emptyMapField();
       this.customStickerJson_ = MapFieldLite.emptyMapField();
       this.popupWindowDisplayTitles_ = MapFieldLite.emptyMapField();
       this.audioPath_ = "";
       this.swapFaceEmbededImages_ = GeneratedMessageLite.emptyProtobufList();
       this.effects_ = GeneratedMessageLite.emptyProtobufList();
       this.popupConfig_ = GeneratedMessageLite.emptyProtobufList();
       this.memojiStyleConfigJson_ = "";
       this.swapFaceEmbededIcon_ = GeneratedMessageLite.emptyProtobufList();
       this.faceMagicEncodeProfile_ = "";
       this.embeddedPickingMedias_ = GeneratedMessageLite.emptyProtobufList();
       this.renderCodeReason_ = "";
       this.triggerInputTextsConfig_ = GeneratedMessageLite.emptyProtobufList();
    }
    public static EffectDescription getDefaultInstance(){
       return EffectDescription.DEFAULT_INSTANCE;
    }
    public static EffectDescription$Builder newBuilder(){
       return EffectDescription.DEFAULT_INSTANCE.createBuilder();
    }
    public static EffectDescription$Builder newBuilder(EffectDescription p0){
       return EffectDescription.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static EffectDescription parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(EffectDescription.DEFAULT_INSTANCE, p0);
    }
    public static EffectDescription parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(EffectDescription.DEFAULT_INSTANCE, p0, p1);
    }
    public static EffectDescription parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(EffectDescription.DEFAULT_INSTANCE, p0);
    }
    public static EffectDescription parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EffectDescription.DEFAULT_INSTANCE, p0, p1);
    }
    public static EffectDescription parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(EffectDescription.DEFAULT_INSTANCE, p0);
    }
    public static EffectDescription parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EffectDescription.DEFAULT_INSTANCE, p0, p1);
    }
    public static EffectDescription parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(EffectDescription.DEFAULT_INSTANCE, p0);
    }
    public static EffectDescription parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EffectDescription.DEFAULT_INSTANCE, p0, p1);
    }
    public static EffectDescription parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(EffectDescription.DEFAULT_INSTANCE, p0);
    }
    public static EffectDescription parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EffectDescription.DEFAULT_INSTANCE, p0, p1);
    }
    public static EffectDescription parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(EffectDescription.DEFAULT_INSTANCE, p0);
    }
    public static EffectDescription parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EffectDescription.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return EffectDescription.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllEffects(Iterable p0){
       this.ensureEffectsIsMutable();
       AbstractMessageLite.addAll(p0, this.effects_);
    }
    public void addAllEmbeddedPickingMedias(Iterable p0){
       this.ensureEmbeddedPickingMediasIsMutable();
       AbstractMessageLite.addAll(p0, this.embeddedPickingMedias_);
    }
    public void addAllPopupConfig(Iterable p0){
       this.ensurePopupConfigIsMutable();
       AbstractMessageLite.addAll(p0, this.popupConfig_);
    }
    public void addAllSwapFaceEmbededIcon(Iterable p0){
       this.ensureSwapFaceEmbededIconIsMutable();
       AbstractMessageLite.addAll(p0, this.swapFaceEmbededIcon_);
    }
    public void addAllSwapFaceEmbededImages(Iterable p0){
       this.ensureSwapFaceEmbededImagesIsMutable();
       AbstractMessageLite.addAll(p0, this.swapFaceEmbededImages_);
    }
    public void addAllTriggerInputTextsConfig(Iterable p0){
       this.ensureTriggerInputTextsConfigIsMutable();
       AbstractMessageLite.addAll(p0, this.triggerInputTextsConfig_);
    }
    public void addEffects(String p0){
       Objects.requireNonNull(p0);
       this.ensureEffectsIsMutable();
       this.effects_.add(p0);
    }
    public void addEffectsBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.ensureEffectsIsMutable();
       this.effects_.add(p0.toStringUtf8());
    }
    public void addEmbeddedPickingMedias(int p0,EmbeddedPickingMedia$Builder p1){
       this.ensureEmbeddedPickingMediasIsMutable();
       this.embeddedPickingMedias_.add(p0, p1.build());
    }
    public void addEmbeddedPickingMedias(int p0,EmbeddedPickingMedia p1){
       Objects.requireNonNull(p1);
       this.ensureEmbeddedPickingMediasIsMutable();
       this.embeddedPickingMedias_.add(p0, p1);
    }
    public void addEmbeddedPickingMedias(EmbeddedPickingMedia$Builder p0){
       this.ensureEmbeddedPickingMediasIsMutable();
       this.embeddedPickingMedias_.add(p0.build());
    }
    public void addEmbeddedPickingMedias(EmbeddedPickingMedia p0){
       Objects.requireNonNull(p0);
       this.ensureEmbeddedPickingMediasIsMutable();
       this.embeddedPickingMedias_.add(p0);
    }
    public void addPopupConfig(int p0,PopupWindowConfig$Builder p1){
       this.ensurePopupConfigIsMutable();
       this.popupConfig_.add(p0, p1.build());
    }
    public void addPopupConfig(int p0,PopupWindowConfig p1){
       Objects.requireNonNull(p1);
       this.ensurePopupConfigIsMutable();
       this.popupConfig_.add(p0, p1);
    }
    public void addPopupConfig(PopupWindowConfig$Builder p0){
       this.ensurePopupConfigIsMutable();
       this.popupConfig_.add(p0.build());
    }
    public void addPopupConfig(PopupWindowConfig p0){
       Objects.requireNonNull(p0);
       this.ensurePopupConfigIsMutable();
       this.popupConfig_.add(p0);
    }
    public void addSwapFaceEmbededIcon(String p0){
       Objects.requireNonNull(p0);
       this.ensureSwapFaceEmbededIconIsMutable();
       this.swapFaceEmbededIcon_.add(p0);
    }
    public void addSwapFaceEmbededIconBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.ensureSwapFaceEmbededIconIsMutable();
       this.swapFaceEmbededIcon_.add(p0.toStringUtf8());
    }
    public void addSwapFaceEmbededImages(String p0){
       Objects.requireNonNull(p0);
       this.ensureSwapFaceEmbededImagesIsMutable();
       this.swapFaceEmbededImages_.add(p0);
    }
    public void addSwapFaceEmbededImagesBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.ensureSwapFaceEmbededImagesIsMutable();
       this.swapFaceEmbededImages_.add(p0.toStringUtf8());
    }
    public void addTriggerInputTextsConfig(int p0,TriggerInputTextConfig$Builder p1){
       this.ensureTriggerInputTextsConfigIsMutable();
       this.triggerInputTextsConfig_.add(p0, p1.build());
    }
    public void addTriggerInputTextsConfig(int p0,TriggerInputTextConfig p1){
       Objects.requireNonNull(p1);
       this.ensureTriggerInputTextsConfigIsMutable();
       this.triggerInputTextsConfig_.add(p0, p1);
    }
    public void addTriggerInputTextsConfig(TriggerInputTextConfig$Builder p0){
       this.ensureTriggerInputTextsConfigIsMutable();
       this.triggerInputTextsConfig_.add(p0.build());
    }
    public void addTriggerInputTextsConfig(TriggerInputTextConfig p0){
       Objects.requireNonNull(p0);
       this.ensureTriggerInputTextsConfigIsMutable();
       this.triggerInputTextsConfig_.add(p0);
    }
    public void clearActivityId(){
       this.activityId_ = 0;
    }
    public void clearAdjustIntensityConfig(){
       this.adjustIntensityConfig_ = null;
    }
    public void clearAndroidFrameworkVersion(){
       this.androidFrameworkVersion_ = 0;
    }
    public void clearArConfig(){
       this.arConfig_ = null;
    }
    public void clearArSpec(){
       this.arSpec_ = 0;
    }
    public void clearAudioPath(){
       this.audioPath_ = EffectDescription.getDefaultInstance().getAudioPath();
    }
    public void clearAudioPosition(){
       this.audioPosition_ = 0;
    }
    public void clearCameraFacing(){
       this.cameraFacing_ = 0;
    }
    public void clearCaptureOriginalConfig(){
       this.captureOriginalConfig_ = null;
    }
    public void clearDefaultCountdown(){
       this.defaultCountdown_ = false;
    }
    public void clearDelayRecordTime(){
       this.delayRecordTime_ = 0;
    }
    public void clearDisableBackgroundMusic(){
       this.disableBackgroundMusic_ = false;
    }
    public void clearDisableCustomBeautify(){
       this.disableCustomBeautify_ = false;
    }
    public void clearDisableCustomColorFilter(){
       this.disableCustomColorFilter_ = false;
    }
    public void clearDisableCustomDeform(){
       this.disableCustomDeform_ = false;
    }
    public void clearDisableCustomMakeup(){
       this.disableCustomMakeup_ = false;
    }
    public void clearDisableCustomSlimming(){
       this.disableCustomSlimming_ = false;
    }
    public void clearEditAudioType(){
       this.editAudioType_ = 0;
    }
    public void clearEffectHasAudio(){
       this.effectHasAudio_ = false;
    }
    public void clearEffectLoadFailed(){
       this.effectLoadFailed_ = false;
    }
    public void clearEffectPerformance(){
       this.effectPerformance_ = 0;
    }
    public void clearEffects(){
       this.effects_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearEmbeddedPickingMedias(){
       this.embeddedPickingMedias_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearEnableVideoStabilization(){
       this.enableVideoStabilization_ = false;
    }
    public void clearEraseAudio(){
       this.eraseAudio_ = false;
    }
    public void clearFaceMagicEncodeProfile(){
       this.faceMagicEncodeProfile_ = EffectDescription.getDefaultInstance().getFaceMagicEncodeProfile();
    }
    public void clearGiftDisplayTime(){
       this.giftDisplayTime_ = 0;
    }
    public void clearHasBoomgameEffect(){
       this.hasBoomgameEffect_ = false;
    }
    public void clearHasMmuVoiceChange(){
       this.hasMmuVoiceChange_ = false;
    }
    public void clearImageLocaleTips(){
       this.imageLocaleTips_ = null;
    }
    public void clearInputTextGroupInfo(){
       this.inputTextGroupInfo_ = null;
    }
    public void clearIsMemojiEffect(){
       this.isMemojiEffect_ = false;
    }
    public void clearKeepAlive(){
       this.keepAlive_ = false;
    }
    public void clearLookupConfig(){
       this.lookupConfig_ = null;
    }
    public void clearMediaInfo(){
       this.mediaInfo_ = null;
    }
    public void clearMemojiStyleConfigJson(){
       this.memojiStyleConfigJson_ = EffectDescription.getDefaultInstance().getMemojiStyleConfigJson();
    }
    public void clearNeedClientWorkProcess(){
       this.needClientWorkProcess_ = false;
    }
    public void clearNeedLocation(){
       this.needLocation_ = false;
    }
    public void clearNeedMusicWave(){
       this.needMusicWave_ = false;
    }
    public void clearNeedPickFirstMedia(){
       this.needPickFirstMedia_ = false;
    }
    public void clearNeedPickMediaResourceType(){
       this.needPickMediaResourceType_ = 0;
    }
    public void clearNeedPinch(){
       this.needPinch_ = false;
    }
    public void clearNeedReversePlay(){
       this.needReversePlay_ = false;
    }
    public void clearNeedSubFrame(){
       this.needSubFrame_ = false;
    }
    public void clearNeedSwapFace(){
       this.needSwapFace_ = false;
    }
    public void clearNeedSwipe(){
       this.needSwipe_ = false;
    }
    public void clearNeedTouch(){
       this.needTouch_ = false;
    }
    public void clearOrientationLocked(){
       this.orientationLocked_ = false;
    }
    public void clearPickingVideoConfig(){
       this.pickingVideoConfig_ = null;
    }
    public void clearPopupConfig(){
       this.popupConfig_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearRenderCode(){
       this.renderCode_ = 0;
    }
    public void clearRenderCodeReason(){
       this.renderCodeReason_ = EffectDescription.getDefaultInstance().getRenderCodeReason();
    }
    public void clearRenderSlot(){
       this.renderSlot_ = 0;
    }
    public void clearRequireFacialReco(){
       this.requireFacialReco_ = false;
    }
    public void clearRequirePreviewLayerRender(){
       this.requirePreviewLayerRender_ = false;
    }
    public void clearResetWhenRecord(){
       this.resetWhenRecord_ = false;
    }
    public void clearServerProcessingInfo(){
       this.serverProcessingInfo_ = null;
    }
    public void clearSubCount(){
       this.subCount_ = 0;
    }
    public void clearSwapFaceEmbededIcon(){
       this.swapFaceEmbededIcon_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearSwapFaceEmbededImages(){
       this.swapFaceEmbededImages_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearTrackId(){
       this.trackId_ = 0;
    }
    public void clearTriggerInputTextConfig(){
       this.triggerInputTextConfig_ = null;
    }
    public void clearTriggerInputTextsConfig(){
       this.triggerInputTextsConfig_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearUseAudioStream(){
       this.useAudioStream_ = false;
    }
    public void clearUseClientTimeStamp(){
       this.useClientTimeStamp_ = false;
    }
    public void clearUseLastFrameForCover(){
       this.useLastFrameForCover_ = false;
    }
    public void clearVideoLength(){
       this.videoLength_ = 0;
    }
    public void clearVideoLengthMs(){
       this.videoLengthMs_ = 0;
    }
    public boolean containsBackCameraLocaleTips(String p0){
       Objects.requireNonNull(p0);
       return this.internalGetBackCameraLocaleTips().containsKey(p0);
    }
    public boolean containsCustomStickerJson(String p0){
       Objects.requireNonNull(p0);
       return this.internalGetCustomStickerJson().containsKey(p0);
    }
    public boolean containsFrontCameraLocaleTips(String p0){
       Objects.requireNonNull(p0);
       return this.internalGetFrontCameraLocaleTips().containsKey(p0);
    }
    public boolean containsGuideConfig(String p0){
       Objects.requireNonNull(p0);
       return this.internalGetGuideConfig().containsKey(p0);
    }
    public boolean containsLocaleTips(String p0){
       Objects.requireNonNull(p0);
       return this.internalGetLocaleTips().containsKey(p0);
    }
    public boolean containsPopupWindowDisplayTitles(String p0){
       Objects.requireNonNull(p0);
       return this.internalGetPopupWindowDisplayTitles().containsKey(p0);
    }
    public boolean containsTopic(String p0){
       Objects.requireNonNull(p0);
       return this.internalGetTopic().containsKey(p0);
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (EffectDescription$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new EffectDescription();
           case 2:
             return new EffectDescription$Builder(p2);
           case 3:
             Object[] objArray = new Object[85];
             objArray[0] = "cameraFacing_";
             objArray[i] = "videoLength_";
             objArray[2] = "eraseAudio_";
             objArray[3] = "resetWhenRecord_";
             objArray[4] = "androidFrameworkVersion_";
             objArray[5] = "disableCustomBeautify_";
             objArray[6] = "disableCustomMakeup_";
             objArray[7] = "disableCustomColorFilter_";
             objArray[8] = "needTouch_";
             objArray[9] = "needSwipe_";
             objArray[10] = "needPinch_";
             objArray[11] = "orientationLocked_";
             objArray[12] = "useLastFrameForCover_";
             objArray[13] = "localeTips_";
             objArray[14] = EffectDescription$LocaleTipsDefaultEntryHolder.defaultEntry;
             objArray[15] = "audioPosition_";
             objArray[16] = "audioPath_";
             objArray[17] = "needSwapFace_";
             objArray[18] = "swapFaceEmbededImages_";
             objArray[19] = "enableVideoStabilization_";
             objArray[20] = "adjustIntensityConfig_";
             objArray[21] = "captureOriginalConfig_";
             objArray[22] = "lookupConfig_";
             objArray[23] = "frontCameraLocaleTips_";
             objArray[24] = EffectDescription$FrontCameraLocaleTipsDefaultEntryHolder.defaultEntry;
             objArray[25] = "backCameraLocaleTips_";
             objArray[26] = EffectDescription$BackCameraLocaleTipsDefaultEntryHolder.defaultEntry;
             objArray[27] = "effectHasAudio_";
             objArray[28] = "effects_";
             objArray[29] = "arSpec_";
             objArray[30] = "giftDisplayTime_";
             objArray[31] = "popupConfig_";
             objArray[32] = PopupWindowConfig.class;
             objArray[33] = "topic_";
             objArray[34] = EffectDescription$TopicDefaultEntryHolder.defaultEntry;
             objArray[35] = "isMemojiEffect_";
             objArray[36] = "memojiStyleConfigJson_";
             objArray[37] = "needLocation_";
             objArray[38] = "activityId_";
             objArray[39] = "swapFaceEmbededIcon_";
             objArray[40] = "guideConfig_";
             objArray[41] = EffectDescription$GuideConfigDefaultEntryHolder.defaultEntry;
             objArray[42] = "disableBackgroundMusic_";
             objArray[43] = "needMusicWave_";
             objArray[44] = "customStickerJson_";
             objArray[45] = EffectDescription$CustomStickerJsonDefaultEntryHolder.defaultEntry;
             objArray[46] = "effectPerformance_";
             objArray[47] = "faceMagicEncodeProfile_";
             objArray[48] = "effectLoadFailed_";
             objArray[49] = "keepAlive_";
             objArray[50] = "imageLocaleTips_";
             objArray[51] = "disableCustomSlimming_";
             objArray[52] = "needSubFrame_";
             objArray[53] = "hasBoomgameEffect_";
             objArray[54] = "needPickMediaResourceType_";
             objArray[55] = "pickingVideoConfig_";
             objArray[56] = "embeddedPickingMedias_";
             objArray[57] = EmbeddedPickingMedia.class;
             objArray[58] = "delayRecordTime_";
             objArray[59] = "disableCustomDeform_";
             objArray[60] = "needPickFirstMedia_";
             objArray[61] = "popupWindowDisplayTitles_";
             objArray[62] = EffectDescription$PopupWindowDisplayTitlesDefaultEntryHolder.defaultEntry;
             objArray[63] = "defaultCountdown_";
             objArray[64] = "editAudioType_";
             objArray[65] = "needReversePlay_";
             objArray[66] = "hasMmuVoiceChange_";
             objArray[67] = "useClientTimeStamp_";
             objArray[68] = "arConfig_";
             objArray[69] = "subCount_";
             objArray[70] = "videoLengthMs_";
             objArray[71] = "requireFacialReco_";
             objArray[72] = "serverProcessingInfo_";
             objArray[73] = "useAudioStream_";
             objArray[74] = "triggerInputTextConfig_";
             objArray[75] = "renderCode_";
             objArray[76] = "renderCodeReason_";
             objArray[77] = "renderSlot_";
             objArray[78] = "trackId_";
             objArray[79] = "needClientWorkProcess_";
             objArray[80] = "mediaInfo_";
             objArray[81] = "triggerInputTextsConfig_";
             objArray[82] = TriggerInputTextConfig.class;
             objArray[83] = "inputTextGroupInfo_";
             objArray[84] = "requirePreviewLayerRender_";
             return GeneratedMessageLite.newMessageInfo(EffectDescription.DEFAULT_INSTANCE, "\xff\x02\xff\x02K\xff\x02\xff\x02\xff\x02\xff\x02\x01KK\x07\x06\xff\x02\xff\x02\x01\f\x02\f\x03\x07\x04\x07\x05\x04\x06\x07\x07\x07\b\x07\t\x07\n\x07\x0b\x07\f\x07\r\x07\x0e2\x0f\xff\x02\xff\x02\x10\x02\x02\x11\x07\x12\x02\x02\x13\x07\x14\t\x15\t\x16\t\x172\x182\x19\x07\x1a\x02\x02\x1b\f\x1c\x01\x1d\x1b\x1e2\x1f\x07 \x02\x02!\x07\"\x04#\x02\x02$2%\x07&\x07\'2\(\f\)\x02\x02*\x07+\x07,\t-\x07.\x07/\x070\x041\t2\x1b3\x044\x075\x07627\x078\f9\x07:\x07;\x07<\t=\x04>\x04?\x07@\tA\x07B\tC\fD\x02\x02E\fF\x03G\x07H\tI\x1bJ\tK\x07\x00", objArray);
           case 4:
             return EffectDescription.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = EffectDescription.PARSER;
             if (pARSER == null) {
                _monitor_enter(EffectDescription.class);
                pARSER = EffectDescription.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(EffectDescription.DEFAULT_INSTANCE);
                   EffectDescription.PARSER = pARSER;
                }
                _monitor_exit(EffectDescription.class);
             }
             return pARSER;
             break;
           case 6:
             return Byte.valueOf(i);
           case 7:
             return p2;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final void ensureEffectsIsMutable(){
       if (!this.effects_.isModifiable()) {
          this.effects_ = GeneratedMessageLite.mutableCopy(this.effects_);
       }
       return;
    }
    public final void ensureEmbeddedPickingMediasIsMutable(){
       if (!this.embeddedPickingMedias_.isModifiable()) {
          this.embeddedPickingMedias_ = GeneratedMessageLite.mutableCopy(this.embeddedPickingMedias_);
       }
       return;
    }
    public final void ensurePopupConfigIsMutable(){
       if (!this.popupConfig_.isModifiable()) {
          this.popupConfig_ = GeneratedMessageLite.mutableCopy(this.popupConfig_);
       }
       return;
    }
    public final void ensureSwapFaceEmbededIconIsMutable(){
       if (!this.swapFaceEmbededIcon_.isModifiable()) {
          this.swapFaceEmbededIcon_ = GeneratedMessageLite.mutableCopy(this.swapFaceEmbededIcon_);
       }
       return;
    }
    public final void ensureSwapFaceEmbededImagesIsMutable(){
       if (!this.swapFaceEmbededImages_.isModifiable()) {
          this.swapFaceEmbededImages_ = GeneratedMessageLite.mutableCopy(this.swapFaceEmbededImages_);
       }
       return;
    }
    public final void ensureTriggerInputTextsConfigIsMutable(){
       if (!this.triggerInputTextsConfig_.isModifiable()) {
          this.triggerInputTextsConfig_ = GeneratedMessageLite.mutableCopy(this.triggerInputTextsConfig_);
       }
       return;
    }
    public int getActivityId(){
       return this.activityId_;
    }
    public AdjustIntensityConfig getAdjustIntensityConfig(){
       EffectDescription tadjustInten = this.adjustIntensityConfig_;
       if (tadjustInten == null) {
          tadjustInten = AdjustIntensityConfig.getDefaultInstance();
       }
       return tadjustInten;
    }
    public int getAndroidFrameworkVersion(){
       return this.androidFrameworkVersion_;
    }
    public ARConfig getArConfig(){
       EffectDescription tarConfig_ = this.arConfig_;
       if (tarConfig_ == null) {
          tarConfig_ = ARConfig.getDefaultInstance();
       }
       return tarConfig_;
    }
    public ARSpec getArSpec(){
       ARSpec uARSpec = ARSpec.forNumber(this.arSpec_);
       if (uARSpec == null) {
          uARSpec = ARSpec.UNRECOGNIZED;
       }
       return uARSpec;
    }
    public int getArSpecValue(){
       return this.arSpec_;
    }
    public String getAudioPath(){
       return this.audioPath_;
    }
    public ByteString getAudioPathBytes(){
       return ByteString.copyFromUtf8(this.audioPath_);
    }
    public double getAudioPosition(){
       return this.audioPosition_;
    }
    public Map getBackCameraLocaleTips(){
       return this.getBackCameraLocaleTipsMap();
    }
    public int getBackCameraLocaleTipsCount(){
       return this.internalGetBackCameraLocaleTips().size();
    }
    public Map getBackCameraLocaleTipsMap(){
       return Collections.unmodifiableMap(this.internalGetBackCameraLocaleTips());
    }
    public String getBackCameraLocaleTipsOrDefault(String p0,String p1){
       Objects.requireNonNull(p0);
       MapFieldLite mapFieldLite = this.internalGetBackCameraLocaleTips();
       if (mapFieldLite.containsKey(p0)) {
          p1 = mapFieldLite.get(p0);
       }
       return p1;
    }
    public String getBackCameraLocaleTipsOrThrow(String p0){
       Objects.requireNonNull(p0);
       MapFieldLite mapFieldLite = this.internalGetBackCameraLocaleTips();
       if (mapFieldLite.containsKey(p0)) {
          return mapFieldLite.get(p0);
       }
       throw new IllegalArgumentException();
    }
    public CameraFacing getCameraFacing(){
       CameraFacing uCameraFacin = CameraFacing.forNumber(this.cameraFacing_);
       if (uCameraFacin == null) {
          uCameraFacin = CameraFacing.UNRECOGNIZED;
       }
       return uCameraFacin;
    }
    public int getCameraFacingValue(){
       return this.cameraFacing_;
    }
    public CaptureOriginalConfig getCaptureOriginalConfig(){
       EffectDescription tcaptureOrig = this.captureOriginalConfig_;
       if (tcaptureOrig == null) {
          tcaptureOrig = CaptureOriginalConfig.getDefaultInstance();
       }
       return tcaptureOrig;
    }
    public Map getCustomStickerJson(){
       return this.getCustomStickerJsonMap();
    }
    public int getCustomStickerJsonCount(){
       return this.internalGetCustomStickerJson().size();
    }
    public Map getCustomStickerJsonMap(){
       return Collections.unmodifiableMap(this.internalGetCustomStickerJson());
    }
    public String getCustomStickerJsonOrDefault(String p0,String p1){
       Objects.requireNonNull(p0);
       MapFieldLite mapFieldLite = this.internalGetCustomStickerJson();
       if (mapFieldLite.containsKey(p0)) {
          p1 = mapFieldLite.get(p0);
       }
       return p1;
    }
    public String getCustomStickerJsonOrThrow(String p0){
       Objects.requireNonNull(p0);
       MapFieldLite mapFieldLite = this.internalGetCustomStickerJson();
       if (mapFieldLite.containsKey(p0)) {
          return mapFieldLite.get(p0);
       }
       throw new IllegalArgumentException();
    }
    public boolean getDefaultCountdown(){
       return this.defaultCountdown_;
    }
    public int getDelayRecordTime(){
       return this.delayRecordTime_;
    }
    public boolean getDisableBackgroundMusic(){
       return this.disableBackgroundMusic_;
    }
    public boolean getDisableCustomBeautify(){
       return this.disableCustomBeautify_;
    }
    public boolean getDisableCustomColorFilter(){
       return this.disableCustomColorFilter_;
    }
    public boolean getDisableCustomDeform(){
       return this.disableCustomDeform_;
    }
    public boolean getDisableCustomMakeup(){
       return this.disableCustomMakeup_;
    }
    public boolean getDisableCustomSlimming(){
       return this.disableCustomSlimming_;
    }
    public EditAudioType getEditAudioType(){
       EditAudioType uEditAudioTy = EditAudioType.forNumber(this.editAudioType_);
       if (uEditAudioTy == null) {
          uEditAudioTy = EditAudioType.UNRECOGNIZED;
       }
       return uEditAudioTy;
    }
    public int getEditAudioTypeValue(){
       return this.editAudioType_;
    }
    public boolean getEffectHasAudio(){
       return this.effectHasAudio_;
    }
    public boolean getEffectLoadFailed(){
       return this.effectLoadFailed_;
    }
    public EffectPerformance getEffectPerformance(){
       EffectPerformance uEffectPerfo = EffectPerformance.forNumber(this.effectPerformance_);
       if (uEffectPerfo == null) {
          uEffectPerfo = EffectPerformance.UNRECOGNIZED;
       }
       return uEffectPerfo;
    }
    public int getEffectPerformanceValue(){
       return this.effectPerformance_;
    }
    public String getEffects(int p0){
       return this.effects_.get(p0);
    }
    public ByteString getEffectsBytes(int p0){
       return ByteString.copyFromUtf8(this.effects_.get(p0));
    }
    public int getEffectsCount(){
       return this.effects_.size();
    }
    public List getEffectsList(){
       return this.effects_;
    }
    public EmbeddedPickingMedia getEmbeddedPickingMedias(int p0){
       return this.embeddedPickingMedias_.get(p0);
    }
    public int getEmbeddedPickingMediasCount(){
       return this.embeddedPickingMedias_.size();
    }
    public List getEmbeddedPickingMediasList(){
       return this.embeddedPickingMedias_;
    }
    public EmbeddedPickingMediaOrBuilder getEmbeddedPickingMediasOrBuilder(int p0){
       return this.embeddedPickingMedias_.get(p0);
    }
    public List getEmbeddedPickingMediasOrBuilderList(){
       return this.embeddedPickingMedias_;
    }
    public boolean getEnableVideoStabilization(){
       return this.enableVideoStabilization_;
    }
    public boolean getEraseAudio(){
       return this.eraseAudio_;
    }
    public String getFaceMagicEncodeProfile(){
       return this.faceMagicEncodeProfile_;
    }
    public ByteString getFaceMagicEncodeProfileBytes(){
       return ByteString.copyFromUtf8(this.faceMagicEncodeProfile_);
    }
    public Map getFrontCameraLocaleTips(){
       return this.getFrontCameraLocaleTipsMap();
    }
    public int getFrontCameraLocaleTipsCount(){
       return this.internalGetFrontCameraLocaleTips().size();
    }
    public Map getFrontCameraLocaleTipsMap(){
       return Collections.unmodifiableMap(this.internalGetFrontCameraLocaleTips());
    }
    public String getFrontCameraLocaleTipsOrDefault(String p0,String p1){
       Objects.requireNonNull(p0);
       MapFieldLite mapFieldLite = this.internalGetFrontCameraLocaleTips();
       if (mapFieldLite.containsKey(p0)) {
          p1 = mapFieldLite.get(p0);
       }
       return p1;
    }
    public String getFrontCameraLocaleTipsOrThrow(String p0){
       Objects.requireNonNull(p0);
       MapFieldLite mapFieldLite = this.internalGetFrontCameraLocaleTips();
       if (mapFieldLite.containsKey(p0)) {
          return mapFieldLite.get(p0);
       }
       throw new IllegalArgumentException();
    }
    public float getGiftDisplayTime(){
       return this.giftDisplayTime_;
    }
    public Map getGuideConfig(){
       return this.getGuideConfigMap();
    }
    public int getGuideConfigCount(){
       return this.internalGetGuideConfig().size();
    }
    public Map getGuideConfigMap(){
       return Collections.unmodifiableMap(this.internalGetGuideConfig());
    }
    public GuideConfig getGuideConfigOrDefault(String p0,GuideConfig p1){
       Objects.requireNonNull(p0);
       MapFieldLite mapFieldLite = this.internalGetGuideConfig();
       if (mapFieldLite.containsKey(p0)) {
          p1 = mapFieldLite.get(p0);
       }
       return p1;
    }
    public GuideConfig getGuideConfigOrThrow(String p0){
       Objects.requireNonNull(p0);
       MapFieldLite mapFieldLite = this.internalGetGuideConfig();
       if (mapFieldLite.containsKey(p0)) {
          return mapFieldLite.get(p0);
       }
       throw new IllegalArgumentException();
    }
    public boolean getHasBoomgameEffect(){
       return this.hasBoomgameEffect_;
    }
    public boolean getHasMmuVoiceChange(){
       return this.hasMmuVoiceChange_;
    }
    public ImageLocaleTips getImageLocaleTips(){
       EffectDescription timageLocale = this.imageLocaleTips_;
       if (timageLocale == null) {
          timageLocale = ImageLocaleTips.getDefaultInstance();
       }
       return timageLocale;
    }
    public TriggerInputTextGroupConfig getInputTextGroupInfo(){
       EffectDescription tinputTextGr = this.inputTextGroupInfo_;
       if (tinputTextGr == null) {
          tinputTextGr = TriggerInputTextGroupConfig.getDefaultInstance();
       }
       return tinputTextGr;
    }
    public boolean getIsMemojiEffect(){
       return this.isMemojiEffect_;
    }
    public boolean getKeepAlive(){
       return this.keepAlive_;
    }
    public Map getLocaleTips(){
       return this.getLocaleTipsMap();
    }
    public int getLocaleTipsCount(){
       return this.internalGetLocaleTips().size();
    }
    public Map getLocaleTipsMap(){
       return Collections.unmodifiableMap(this.internalGetLocaleTips());
    }
    public String getLocaleTipsOrDefault(String p0,String p1){
       Objects.requireNonNull(p0);
       MapFieldLite mapFieldLite = this.internalGetLocaleTips();
       if (mapFieldLite.containsKey(p0)) {
          p1 = mapFieldLite.get(p0);
       }
       return p1;
    }
    public String getLocaleTipsOrThrow(String p0){
       Objects.requireNonNull(p0);
       MapFieldLite mapFieldLite = this.internalGetLocaleTips();
       if (mapFieldLite.containsKey(p0)) {
          return mapFieldLite.get(p0);
       }
       throw new IllegalArgumentException();
    }
    public LookupConfig getLookupConfig(){
       EffectDescription tlookupConfi = this.lookupConfig_;
       if (tlookupConfi == null) {
          tlookupConfi = LookupConfig.getDefaultInstance();
       }
       return tlookupConfi;
    }
    public PickMoreMediaInfo getMediaInfo(){
       EffectDescription tmediaInfo_ = this.mediaInfo_;
       if (tmediaInfo_ == null) {
          tmediaInfo_ = PickMoreMediaInfo.getDefaultInstance();
       }
       return tmediaInfo_;
    }
    public String getMemojiStyleConfigJson(){
       return this.memojiStyleConfigJson_;
    }
    public ByteString getMemojiStyleConfigJsonBytes(){
       return ByteString.copyFromUtf8(this.memojiStyleConfigJson_);
    }
    public Map getMutableBackCameraLocaleTipsMap(){
       return this.internalGetMutableBackCameraLocaleTips();
    }
    public Map getMutableCustomStickerJsonMap(){
       return this.internalGetMutableCustomStickerJson();
    }
    public Map getMutableFrontCameraLocaleTipsMap(){
       return this.internalGetMutableFrontCameraLocaleTips();
    }
    public Map getMutableGuideConfigMap(){
       return this.internalGetMutableGuideConfig();
    }
    public Map getMutableLocaleTipsMap(){
       return this.internalGetMutableLocaleTips();
    }
    public Map getMutablePopupWindowDisplayTitlesMap(){
       return this.internalGetMutablePopupWindowDisplayTitles();
    }
    public Map getMutableTopicMap(){
       return this.internalGetMutableTopic();
    }
    public boolean getNeedClientWorkProcess(){
       return this.needClientWorkProcess_;
    }
    public boolean getNeedLocation(){
       return this.needLocation_;
    }
    public boolean getNeedMusicWave(){
       return this.needMusicWave_;
    }
    public boolean getNeedPickFirstMedia(){
       return this.needPickFirstMedia_;
    }
    public int getNeedPickMediaResourceType(){
       return this.needPickMediaResourceType_;
    }
    public boolean getNeedPinch(){
       return this.needPinch_;
    }
    public boolean getNeedReversePlay(){
       return this.needReversePlay_;
    }
    public boolean getNeedSubFrame(){
       return this.needSubFrame_;
    }
    public boolean getNeedSwapFace(){
       return this.needSwapFace_;
    }
    public boolean getNeedSwipe(){
       return this.needSwipe_;
    }
    public boolean getNeedTouch(){
       return this.needTouch_;
    }
    public boolean getOrientationLocked(){
       return this.orientationLocked_;
    }
    public PickingVideoConfig getPickingVideoConfig(){
       EffectDescription tpickingVide = this.pickingVideoConfig_;
       if (tpickingVide == null) {
          tpickingVide = PickingVideoConfig.getDefaultInstance();
       }
       return tpickingVide;
    }
    public PopupWindowConfig getPopupConfig(int p0){
       return this.popupConfig_.get(p0);
    }
    public int getPopupConfigCount(){
       return this.popupConfig_.size();
    }
    public List getPopupConfigList(){
       return this.popupConfig_;
    }
    public PopupWindowConfigOrBuilder getPopupConfigOrBuilder(int p0){
       return this.popupConfig_.get(p0);
    }
    public List getPopupConfigOrBuilderList(){
       return this.popupConfig_;
    }
    public Map getPopupWindowDisplayTitles(){
       return this.getPopupWindowDisplayTitlesMap();
    }
    public int getPopupWindowDisplayTitlesCount(){
       return this.internalGetPopupWindowDisplayTitles().size();
    }
    public Map getPopupWindowDisplayTitlesMap(){
       return Collections.unmodifiableMap(this.internalGetPopupWindowDisplayTitles());
    }
    public TitleDatas getPopupWindowDisplayTitlesOrDefault(String p0,TitleDatas p1){
       Objects.requireNonNull(p0);
       MapFieldLite mapFieldLite = this.internalGetPopupWindowDisplayTitles();
       if (mapFieldLite.containsKey(p0)) {
          p1 = mapFieldLite.get(p0);
       }
       return p1;
    }
    public TitleDatas getPopupWindowDisplayTitlesOrThrow(String p0){
       Objects.requireNonNull(p0);
       MapFieldLite mapFieldLite = this.internalGetPopupWindowDisplayTitles();
       if (mapFieldLite.containsKey(p0)) {
          return mapFieldLite.get(p0);
       }
       throw new IllegalArgumentException();
    }
    public EffectErrorCode getRenderCode(){
       EffectErrorCode uEffectError = EffectErrorCode.forNumber(this.renderCode_);
       if (uEffectError == null) {
          uEffectError = EffectErrorCode.UNRECOGNIZED;
       }
       return uEffectError;
    }
    public String getRenderCodeReason(){
       return this.renderCodeReason_;
    }
    public ByteString getRenderCodeReasonBytes(){
       return ByteString.copyFromUtf8(this.renderCodeReason_);
    }
    public int getRenderCodeValue(){
       return this.renderCode_;
    }
    public EffectSlot getRenderSlot(){
       EffectSlot uEffectSlot = EffectSlot.forNumber(this.renderSlot_);
       if (uEffectSlot == null) {
          uEffectSlot = EffectSlot.UNRECOGNIZED;
       }
       return uEffectSlot;
    }
    public int getRenderSlotValue(){
       return this.renderSlot_;
    }
    public boolean getRequireFacialReco(){
       return this.requireFacialReco_;
    }
    public boolean getRequirePreviewLayerRender(){
       return this.requirePreviewLayerRender_;
    }
    public boolean getResetWhenRecord(){
       return this.resetWhenRecord_;
    }
    public ServerProcessingInfo getServerProcessingInfo(){
       EffectDescription tserverProce = this.serverProcessingInfo_;
       if (tserverProce == null) {
          tserverProce = ServerProcessingInfo.getDefaultInstance();
       }
       return tserverProce;
    }
    public int getSubCount(){
       return this.subCount_;
    }
    public String getSwapFaceEmbededIcon(int p0){
       return this.swapFaceEmbededIcon_.get(p0);
    }
    public ByteString getSwapFaceEmbededIconBytes(int p0){
       return ByteString.copyFromUtf8(this.swapFaceEmbededIcon_.get(p0));
    }
    public int getSwapFaceEmbededIconCount(){
       return this.swapFaceEmbededIcon_.size();
    }
    public List getSwapFaceEmbededIconList(){
       return this.swapFaceEmbededIcon_;
    }
    public String getSwapFaceEmbededImages(int p0){
       return this.swapFaceEmbededImages_.get(p0);
    }
    public ByteString getSwapFaceEmbededImagesBytes(int p0){
       return ByteString.copyFromUtf8(this.swapFaceEmbededImages_.get(p0));
    }
    public int getSwapFaceEmbededImagesCount(){
       return this.swapFaceEmbededImages_.size();
    }
    public List getSwapFaceEmbededImagesList(){
       return this.swapFaceEmbededImages_;
    }
    public Map getTopic(){
       return this.getTopicMap();
    }
    public int getTopicCount(){
       return this.internalGetTopic().size();
    }
    public Map getTopicMap(){
       return Collections.unmodifiableMap(this.internalGetTopic());
    }
    public String getTopicOrDefault(String p0,String p1){
       Objects.requireNonNull(p0);
       MapFieldLite mapFieldLite = this.internalGetTopic();
       if (mapFieldLite.containsKey(p0)) {
          p1 = mapFieldLite.get(p0);
       }
       return p1;
    }
    public String getTopicOrThrow(String p0){
       Objects.requireNonNull(p0);
       MapFieldLite mapFieldLite = this.internalGetTopic();
       if (mapFieldLite.containsKey(p0)) {
          return mapFieldLite.get(p0);
       }
       throw new IllegalArgumentException();
    }
    public long getTrackId(){
       return this.trackId_;
    }
    public TriggerInputTextConfig getTriggerInputTextConfig(){
       EffectDescription ttriggerInpu = this.triggerInputTextConfig_;
       if (ttriggerInpu == null) {
          ttriggerInpu = TriggerInputTextConfig.getDefaultInstance();
       }
       return ttriggerInpu;
    }
    public TriggerInputTextConfig getTriggerInputTextsConfig(int p0){
       return this.triggerInputTextsConfig_.get(p0);
    }
    public int getTriggerInputTextsConfigCount(){
       return this.triggerInputTextsConfig_.size();
    }
    public List getTriggerInputTextsConfigList(){
       return this.triggerInputTextsConfig_;
    }
    public TriggerInputTextConfigOrBuilder getTriggerInputTextsConfigOrBuilder(int p0){
       return this.triggerInputTextsConfig_.get(p0);
    }
    public List getTriggerInputTextsConfigOrBuilderList(){
       return this.triggerInputTextsConfig_;
    }
    public boolean getUseAudioStream(){
       return this.useAudioStream_;
    }
    public boolean getUseClientTimeStamp(){
       return this.useClientTimeStamp_;
    }
    public boolean getUseLastFrameForCover(){
       return this.useLastFrameForCover_;
    }
    public VideoLength getVideoLength(){
       VideoLength videoLength = VideoLength.forNumber(this.videoLength_);
       if (videoLength == null) {
          videoLength = VideoLength.UNRECOGNIZED;
       }
       return videoLength;
    }
    public int getVideoLengthMs(){
       return this.videoLengthMs_;
    }
    public int getVideoLengthValue(){
       return this.videoLength_;
    }
    public boolean hasAdjustIntensityConfig(){
       boolean b = (this.adjustIntensityConfig_ != null)? true: false;
       return b;
    }
    public boolean hasArConfig(){
       boolean b = (this.arConfig_ != null)? true: false;
       return b;
    }
    public boolean hasCaptureOriginalConfig(){
       boolean b = (this.captureOriginalConfig_ != null)? true: false;
       return b;
    }
    public boolean hasImageLocaleTips(){
       boolean b = (this.imageLocaleTips_ != null)? true: false;
       return b;
    }
    public boolean hasInputTextGroupInfo(){
       boolean b = (this.inputTextGroupInfo_ != null)? true: false;
       return b;
    }
    public boolean hasLookupConfig(){
       boolean b = (this.lookupConfig_ != null)? true: false;
       return b;
    }
    public boolean hasMediaInfo(){
       boolean b = (this.mediaInfo_ != null)? true: false;
       return b;
    }
    public boolean hasPickingVideoConfig(){
       boolean b = (this.pickingVideoConfig_ != null)? true: false;
       return b;
    }
    public boolean hasServerProcessingInfo(){
       boolean b = (this.serverProcessingInfo_ != null)? true: false;
       return b;
    }
    public boolean hasTriggerInputTextConfig(){
       boolean b = (this.triggerInputTextConfig_ != null)? true: false;
       return b;
    }
    public final MapFieldLite internalGetBackCameraLocaleTips(){
       return this.backCameraLocaleTips_;
    }
    public final MapFieldLite internalGetCustomStickerJson(){
       return this.customStickerJson_;
    }
    public final MapFieldLite internalGetFrontCameraLocaleTips(){
       return this.frontCameraLocaleTips_;
    }
    public final MapFieldLite internalGetGuideConfig(){
       return this.guideConfig_;
    }
    public final MapFieldLite internalGetLocaleTips(){
       return this.localeTips_;
    }
    public final MapFieldLite internalGetMutableBackCameraLocaleTips(){
       if (!this.backCameraLocaleTips_.isMutable()) {
          this.backCameraLocaleTips_ = this.backCameraLocaleTips_.mutableCopy();
       }
       return this.backCameraLocaleTips_;
    }
    public final MapFieldLite internalGetMutableCustomStickerJson(){
       if (!this.customStickerJson_.isMutable()) {
          this.customStickerJson_ = this.customStickerJson_.mutableCopy();
       }
       return this.customStickerJson_;
    }
    public final MapFieldLite internalGetMutableFrontCameraLocaleTips(){
       if (!this.frontCameraLocaleTips_.isMutable()) {
          this.frontCameraLocaleTips_ = this.frontCameraLocaleTips_.mutableCopy();
       }
       return this.frontCameraLocaleTips_;
    }
    public final MapFieldLite internalGetMutableGuideConfig(){
       if (!this.guideConfig_.isMutable()) {
          this.guideConfig_ = this.guideConfig_.mutableCopy();
       }
       return this.guideConfig_;
    }
    public final MapFieldLite internalGetMutableLocaleTips(){
       if (!this.localeTips_.isMutable()) {
          this.localeTips_ = this.localeTips_.mutableCopy();
       }
       return this.localeTips_;
    }
    public final MapFieldLite internalGetMutablePopupWindowDisplayTitles(){
       if (!this.popupWindowDisplayTitles_.isMutable()) {
          this.popupWindowDisplayTitles_ = this.popupWindowDisplayTitles_.mutableCopy();
       }
       return this.popupWindowDisplayTitles_;
    }
    public final MapFieldLite internalGetMutableTopic(){
       if (!this.topic_.isMutable()) {
          this.topic_ = this.topic_.mutableCopy();
       }
       return this.topic_;
    }
    public final MapFieldLite internalGetPopupWindowDisplayTitles(){
       return this.popupWindowDisplayTitles_;
    }
    public final MapFieldLite internalGetTopic(){
       return this.topic_;
    }
    public void mergeAdjustIntensityConfig(AdjustIntensityConfig p0){
       Objects.requireNonNull(p0);
       EffectDescription tadjustInten = this.adjustIntensityConfig_;
       this.adjustIntensityConfig_ = (tadjustInten != null && tadjustInten != AdjustIntensityConfig.getDefaultInstance())? AdjustIntensityConfig.newBuilder(this.adjustIntensityConfig_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeArConfig(ARConfig p0){
       Objects.requireNonNull(p0);
       EffectDescription tarConfig_ = this.arConfig_;
       this.arConfig_ = (tarConfig_ != null && tarConfig_ != ARConfig.getDefaultInstance())? ARConfig.newBuilder(this.arConfig_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeCaptureOriginalConfig(CaptureOriginalConfig p0){
       Objects.requireNonNull(p0);
       EffectDescription tcaptureOrig = this.captureOriginalConfig_;
       this.captureOriginalConfig_ = (tcaptureOrig != null && tcaptureOrig != CaptureOriginalConfig.getDefaultInstance())? CaptureOriginalConfig.newBuilder(this.captureOriginalConfig_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeImageLocaleTips(ImageLocaleTips p0){
       Objects.requireNonNull(p0);
       EffectDescription timageLocale = this.imageLocaleTips_;
       this.imageLocaleTips_ = (timageLocale != null && timageLocale != ImageLocaleTips.getDefaultInstance())? ImageLocaleTips.newBuilder(this.imageLocaleTips_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeInputTextGroupInfo(TriggerInputTextGroupConfig p0){
       Objects.requireNonNull(p0);
       EffectDescription tinputTextGr = this.inputTextGroupInfo_;
       this.inputTextGroupInfo_ = (tinputTextGr != null && tinputTextGr != TriggerInputTextGroupConfig.getDefaultInstance())? TriggerInputTextGroupConfig.newBuilder(this.inputTextGroupInfo_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeLookupConfig(LookupConfig p0){
       Objects.requireNonNull(p0);
       EffectDescription tlookupConfi = this.lookupConfig_;
       this.lookupConfig_ = (tlookupConfi != null && tlookupConfi != LookupConfig.getDefaultInstance())? LookupConfig.newBuilder(this.lookupConfig_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeMediaInfo(PickMoreMediaInfo p0){
       Objects.requireNonNull(p0);
       EffectDescription tmediaInfo_ = this.mediaInfo_;
       this.mediaInfo_ = (tmediaInfo_ != null && tmediaInfo_ != PickMoreMediaInfo.getDefaultInstance())? PickMoreMediaInfo.newBuilder(this.mediaInfo_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergePickingVideoConfig(PickingVideoConfig p0){
       Objects.requireNonNull(p0);
       EffectDescription tpickingVide = this.pickingVideoConfig_;
       this.pickingVideoConfig_ = (tpickingVide != null && tpickingVide != PickingVideoConfig.getDefaultInstance())? PickingVideoConfig.newBuilder(this.pickingVideoConfig_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeServerProcessingInfo(ServerProcessingInfo p0){
       Objects.requireNonNull(p0);
       EffectDescription tserverProce = this.serverProcessingInfo_;
       this.serverProcessingInfo_ = (tserverProce != null && tserverProce != ServerProcessingInfo.getDefaultInstance())? ServerProcessingInfo.newBuilder(this.serverProcessingInfo_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeTriggerInputTextConfig(TriggerInputTextConfig p0){
       Objects.requireNonNull(p0);
       EffectDescription ttriggerInpu = this.triggerInputTextConfig_;
       this.triggerInputTextConfig_ = (ttriggerInpu != null && ttriggerInpu != TriggerInputTextConfig.getDefaultInstance())? TriggerInputTextConfig.newBuilder(this.triggerInputTextConfig_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void removeEmbeddedPickingMedias(int p0){
       this.ensureEmbeddedPickingMediasIsMutable();
       this.embeddedPickingMedias_.remove(p0);
    }
    public void removePopupConfig(int p0){
       this.ensurePopupConfigIsMutable();
       this.popupConfig_.remove(p0);
    }
    public void removeTriggerInputTextsConfig(int p0){
       this.ensureTriggerInputTextsConfigIsMutable();
       this.triggerInputTextsConfig_.remove(p0);
    }
    public void setActivityId(int p0){
       this.activityId_ = p0;
    }
    public void setAdjustIntensityConfig(AdjustIntensityConfig$Builder p0){
       this.adjustIntensityConfig_ = p0.build();
    }
    public void setAdjustIntensityConfig(AdjustIntensityConfig p0){
       Objects.requireNonNull(p0);
       this.adjustIntensityConfig_ = p0;
    }
    public void setAndroidFrameworkVersion(int p0){
       this.androidFrameworkVersion_ = p0;
    }
    public void setArConfig(ARConfig$Builder p0){
       this.arConfig_ = p0.build();
    }
    public void setArConfig(ARConfig p0){
       Objects.requireNonNull(p0);
       this.arConfig_ = p0;
    }
    public void setArSpec(ARSpec p0){
       Objects.requireNonNull(p0);
       this.arSpec_ = p0.getNumber();
    }
    public void setArSpecValue(int p0){
       this.arSpec_ = p0;
    }
    public void setAudioPath(String p0){
       Objects.requireNonNull(p0);
       this.audioPath_ = p0;
    }
    public void setAudioPathBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.audioPath_ = p0.toStringUtf8();
    }
    public void setAudioPosition(double p0){
       this.audioPosition_ = p0;
    }
    public void setCameraFacing(CameraFacing p0){
       Objects.requireNonNull(p0);
       this.cameraFacing_ = p0.getNumber();
    }
    public void setCameraFacingValue(int p0){
       this.cameraFacing_ = p0;
    }
    public void setCaptureOriginalConfig(CaptureOriginalConfig$Builder p0){
       this.captureOriginalConfig_ = p0.build();
    }
    public void setCaptureOriginalConfig(CaptureOriginalConfig p0){
       Objects.requireNonNull(p0);
       this.captureOriginalConfig_ = p0;
    }
    public void setDefaultCountdown(boolean p0){
       this.defaultCountdown_ = p0;
    }
    public void setDelayRecordTime(int p0){
       this.delayRecordTime_ = p0;
    }
    public void setDisableBackgroundMusic(boolean p0){
       this.disableBackgroundMusic_ = p0;
    }
    public void setDisableCustomBeautify(boolean p0){
       this.disableCustomBeautify_ = p0;
    }
    public void setDisableCustomColorFilter(boolean p0){
       this.disableCustomColorFilter_ = p0;
    }
    public void setDisableCustomDeform(boolean p0){
       this.disableCustomDeform_ = p0;
    }
    public void setDisableCustomMakeup(boolean p0){
       this.disableCustomMakeup_ = p0;
    }
    public void setDisableCustomSlimming(boolean p0){
       this.disableCustomSlimming_ = p0;
    }
    public void setEditAudioType(EditAudioType p0){
       Objects.requireNonNull(p0);
       this.editAudioType_ = p0.getNumber();
    }
    public void setEditAudioTypeValue(int p0){
       this.editAudioType_ = p0;
    }
    public void setEffectHasAudio(boolean p0){
       this.effectHasAudio_ = p0;
    }
    public void setEffectLoadFailed(boolean p0){
       this.effectLoadFailed_ = p0;
    }
    public void setEffectPerformance(EffectPerformance p0){
       Objects.requireNonNull(p0);
       this.effectPerformance_ = p0.getNumber();
    }
    public void setEffectPerformanceValue(int p0){
       this.effectPerformance_ = p0;
    }
    public void setEffects(int p0,String p1){
       Objects.requireNonNull(p1);
       this.ensureEffectsIsMutable();
       this.effects_.set(p0, p1);
    }
    public void setEmbeddedPickingMedias(int p0,EmbeddedPickingMedia$Builder p1){
       this.ensureEmbeddedPickingMediasIsMutable();
       this.embeddedPickingMedias_.set(p0, p1.build());
    }
    public void setEmbeddedPickingMedias(int p0,EmbeddedPickingMedia p1){
       Objects.requireNonNull(p1);
       this.ensureEmbeddedPickingMediasIsMutable();
       this.embeddedPickingMedias_.set(p0, p1);
    }
    public void setEnableVideoStabilization(boolean p0){
       this.enableVideoStabilization_ = p0;
    }
    public void setEraseAudio(boolean p0){
       this.eraseAudio_ = p0;
    }
    public void setFaceMagicEncodeProfile(String p0){
       Objects.requireNonNull(p0);
       this.faceMagicEncodeProfile_ = p0;
    }
    public void setFaceMagicEncodeProfileBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.faceMagicEncodeProfile_ = p0.toStringUtf8();
    }
    public void setGiftDisplayTime(float p0){
       this.giftDisplayTime_ = p0;
    }
    public void setHasBoomgameEffect(boolean p0){
       this.hasBoomgameEffect_ = p0;
    }
    public void setHasMmuVoiceChange(boolean p0){
       this.hasMmuVoiceChange_ = p0;
    }
    public void setImageLocaleTips(ImageLocaleTips$Builder p0){
       this.imageLocaleTips_ = p0.build();
    }
    public void setImageLocaleTips(ImageLocaleTips p0){
       Objects.requireNonNull(p0);
       this.imageLocaleTips_ = p0;
    }
    public void setInputTextGroupInfo(TriggerInputTextGroupConfig$Builder p0){
       this.inputTextGroupInfo_ = p0.build();
    }
    public void setInputTextGroupInfo(TriggerInputTextGroupConfig p0){
       Objects.requireNonNull(p0);
       this.inputTextGroupInfo_ = p0;
    }
    public void setIsMemojiEffect(boolean p0){
       this.isMemojiEffect_ = p0;
    }
    public void setKeepAlive(boolean p0){
       this.keepAlive_ = p0;
    }
    public void setLookupConfig(LookupConfig$Builder p0){
       this.lookupConfig_ = p0.build();
    }
    public void setLookupConfig(LookupConfig p0){
       Objects.requireNonNull(p0);
       this.lookupConfig_ = p0;
    }
    public void setMediaInfo(PickMoreMediaInfo$Builder p0){
       this.mediaInfo_ = p0.build();
    }
    public void setMediaInfo(PickMoreMediaInfo p0){
       Objects.requireNonNull(p0);
       this.mediaInfo_ = p0;
    }
    public void setMemojiStyleConfigJson(String p0){
       Objects.requireNonNull(p0);
       this.memojiStyleConfigJson_ = p0;
    }
    public void setMemojiStyleConfigJsonBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.memojiStyleConfigJson_ = p0.toStringUtf8();
    }
    public void setNeedClientWorkProcess(boolean p0){
       this.needClientWorkProcess_ = p0;
    }
    public void setNeedLocation(boolean p0){
       this.needLocation_ = p0;
    }
    public void setNeedMusicWave(boolean p0){
       this.needMusicWave_ = p0;
    }
    public void setNeedPickFirstMedia(boolean p0){
       this.needPickFirstMedia_ = p0;
    }
    public void setNeedPickMediaResourceType(int p0){
       this.needPickMediaResourceType_ = p0;
    }
    public void setNeedPinch(boolean p0){
       this.needPinch_ = p0;
    }
    public void setNeedReversePlay(boolean p0){
       this.needReversePlay_ = p0;
    }
    public void setNeedSubFrame(boolean p0){
       this.needSubFrame_ = p0;
    }
    public void setNeedSwapFace(boolean p0){
       this.needSwapFace_ = p0;
    }
    public void setNeedSwipe(boolean p0){
       this.needSwipe_ = p0;
    }
    public void setNeedTouch(boolean p0){
       this.needTouch_ = p0;
    }
    public void setOrientationLocked(boolean p0){
       this.orientationLocked_ = p0;
    }
    public void setPickingVideoConfig(PickingVideoConfig$Builder p0){
       this.pickingVideoConfig_ = p0.build();
    }
    public void setPickingVideoConfig(PickingVideoConfig p0){
       Objects.requireNonNull(p0);
       this.pickingVideoConfig_ = p0;
    }
    public void setPopupConfig(int p0,PopupWindowConfig$Builder p1){
       this.ensurePopupConfigIsMutable();
       this.popupConfig_.set(p0, p1.build());
    }
    public void setPopupConfig(int p0,PopupWindowConfig p1){
       Objects.requireNonNull(p1);
       this.ensurePopupConfigIsMutable();
       this.popupConfig_.set(p0, p1);
    }
    public void setRenderCode(EffectErrorCode p0){
       Objects.requireNonNull(p0);
       this.renderCode_ = p0.getNumber();
    }
    public void setRenderCodeReason(String p0){
       Objects.requireNonNull(p0);
       this.renderCodeReason_ = p0;
    }
    public void setRenderCodeReasonBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.renderCodeReason_ = p0.toStringUtf8();
    }
    public void setRenderCodeValue(int p0){
       this.renderCode_ = p0;
    }
    public void setRenderSlot(EffectSlot p0){
       Objects.requireNonNull(p0);
       this.renderSlot_ = p0.getNumber();
    }
    public void setRenderSlotValue(int p0){
       this.renderSlot_ = p0;
    }
    public void setRequireFacialReco(boolean p0){
       this.requireFacialReco_ = p0;
    }
    public void setRequirePreviewLayerRender(boolean p0){
       this.requirePreviewLayerRender_ = p0;
    }
    public void setResetWhenRecord(boolean p0){
       this.resetWhenRecord_ = p0;
    }
    public void setServerProcessingInfo(ServerProcessingInfo$Builder p0){
       this.serverProcessingInfo_ = p0.build();
    }
    public void setServerProcessingInfo(ServerProcessingInfo p0){
       Objects.requireNonNull(p0);
       this.serverProcessingInfo_ = p0;
    }
    public void setSubCount(int p0){
       this.subCount_ = p0;
    }
    public void setSwapFaceEmbededIcon(int p0,String p1){
       Objects.requireNonNull(p1);
       this.ensureSwapFaceEmbededIconIsMutable();
       this.swapFaceEmbededIcon_.set(p0, p1);
    }
    public void setSwapFaceEmbededImages(int p0,String p1){
       Objects.requireNonNull(p1);
       this.ensureSwapFaceEmbededImagesIsMutable();
       this.swapFaceEmbededImages_.set(p0, p1);
    }
    public void setTrackId(long p0){
       this.trackId_ = p0;
    }
    public void setTriggerInputTextConfig(TriggerInputTextConfig$Builder p0){
       this.triggerInputTextConfig_ = p0.build();
    }
    public void setTriggerInputTextConfig(TriggerInputTextConfig p0){
       Objects.requireNonNull(p0);
       this.triggerInputTextConfig_ = p0;
    }
    public void setTriggerInputTextsConfig(int p0,TriggerInputTextConfig$Builder p1){
       this.ensureTriggerInputTextsConfigIsMutable();
       this.triggerInputTextsConfig_.set(p0, p1.build());
    }
    public void setTriggerInputTextsConfig(int p0,TriggerInputTextConfig p1){
       Objects.requireNonNull(p1);
       this.ensureTriggerInputTextsConfigIsMutable();
       this.triggerInputTextsConfig_.set(p0, p1);
    }
    public void setUseAudioStream(boolean p0){
       this.useAudioStream_ = p0;
    }
    public void setUseClientTimeStamp(boolean p0){
       this.useClientTimeStamp_ = p0;
    }
    public void setUseLastFrameForCover(boolean p0){
       this.useLastFrameForCover_ = p0;
    }
    public void setVideoLength(VideoLength p0){
       Objects.requireNonNull(p0);
       this.videoLength_ = p0.getNumber();
    }
    public void setVideoLengthMs(int p0){
       this.videoLengthMs_ = p0;
    }
    public void setVideoLengthValue(int p0){
       this.videoLength_ = p0;
    }
}
