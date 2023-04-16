package com.kwai.video.westeros.models.EffectCommand;
import com.kwai.video.westeros.models.EffectCommandOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.google.protobuf.Internal$ProtobufList;
import com.google.protobuf.Internal$IntList;
import com.google.protobuf.Internal$FloatList;
import com.kwai.video.westeros.models.EffectCommand$Builder;
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
import com.kwai.video.westeros.models.CustomInputText$Builder;
import java.lang.Object;
import com.kwai.video.westeros.models.CustomInputText;
import java.util.Objects;
import java.lang.String;
import com.kwai.video.westeros.models.MakeupResource$Builder;
import com.kwai.video.westeros.models.MakeupResource;
import com.kwai.video.westeros.models.PickingMediaData$Builder;
import com.kwai.video.westeros.models.PickingMediaData;
import com.kwai.video.westeros.models.StickerInfo$Builder;
import com.kwai.video.westeros.models.StickerInfo;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.kwai.video.westeros.models.EffectCommand$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.kwai.video.westeros.models.AdjustEffectType;
import com.kwai.video.westeros.models.AnimojiData;
import com.kwai.video.westeros.models.BodySlimmingAdjustType;
import com.kwai.video.westeros.models.BokehConfig;
import com.kwai.video.westeros.models.Bitmap;
import com.kwai.video.westeros.models.BokehQuality;
import com.kwai.video.westeros.models.BokehDepthTouch;
import com.kwai.video.westeros.models.BokehType;
import com.kwai.video.westeros.models.ClientWorkProgress;
import com.kwai.video.westeros.models.EffectCommandType;
import com.kwai.video.westeros.models.CustomInputTextOrBuilder;
import com.kwai.video.westeros.models.FMPoint;
import com.kwai.video.westeros.models.FilterBasicAdjustType;
import com.kwai.video.westeros.models.GenderUsingType;
import com.kwai.video.westeros.models.EffectResource;
import com.kwai.video.westeros.models.HairClipConfig;
import com.kwai.video.westeros.models.HairDyeingMode;
import com.kwai.video.westeros.models.HumanMattingType;
import com.kwai.video.westeros.models.FMSize;
import com.kwai.video.westeros.models.LiquifyType;
import com.kwai.video.westeros.models.EffectLookupParam;
import com.kwai.video.westeros.models.EffectLookupSlideParam;
import com.kwai.video.westeros.models.MakeupColor;
import com.kwai.video.westeros.models.EffectColor;
import com.kwai.video.westeros.models.EffectMakeupPenBrushType;
import com.kwai.video.westeros.models.MakeupPenTouch;
import com.kwai.video.westeros.models.MakeupResourceOrBuilder;
import com.kwai.video.westeros.models.PickingMediaDataOrBuilder;
import com.kwai.video.westeros.models.PickingMediaResType;
import com.kwai.video.westeros.models.RelightingConfig;
import com.kwai.video.westeros.models.SafeUIArea;
import com.kwai.video.westeros.models.EditFlawConfig;
import com.kwai.video.westeros.models.StickerInfoOrBuilder;
import com.kwai.video.westeros.models.FMTimeStamp;
import com.kwai.video.westeros.models.AnimojiData$Builder;
import com.kwai.video.westeros.models.BokehConfig$Builder;
import com.kwai.video.westeros.models.Bitmap$Builder;
import com.kwai.video.westeros.models.BokehDepthTouch$Builder;
import com.kwai.video.westeros.models.ClientWorkProgress$Builder;
import com.kwai.video.westeros.models.FMPoint$Builder;
import com.kwai.video.westeros.models.EffectResource$Builder;
import com.kwai.video.westeros.models.HairClipConfig$Builder;
import com.kwai.video.westeros.models.FMSize$Builder;
import com.kwai.video.westeros.models.EffectLookupParam$Builder;
import com.kwai.video.westeros.models.EffectLookupSlideParam$Builder;
import com.kwai.video.westeros.models.MakeupColor$Builder;
import com.kwai.video.westeros.models.EffectColor$Builder;
import com.kwai.video.westeros.models.MakeupPenTouch$Builder;
import com.kwai.video.westeros.models.RelightingConfig$Builder;
import com.kwai.video.westeros.models.SafeUIArea$Builder;
import com.kwai.video.westeros.models.EditFlawConfig$Builder;
import com.kwai.video.westeros.models.FMTimeStamp$Builder;

public final class EffectCommand extends GeneratedMessageLite implements EffectCommandOrBuilder	// class@000f04
{
    public int adjustEffectType_;
    public float aideflawIntensity_;
    public float aieyelidIntensity_;
    public boolean allDeletedWhenResetRecording_;
    public AnimojiData animojiData_;
    public float basicAdjustIntensity_;
    public String beautifyGroupPath_;
    public float beautifyLipsIntensity_;
    public int beautifyPanelStatus_;
    public String beautifyPreviewPart_;
    public float beautifySecondBrightIntensity_;
    public float beautyAnyIntensity_;
    public int beautyAnyType_;
    public float beautyzerooptIntensity_;
    public String blendMode_;
    public float bodySlimmingAdjustIntensity_;
    public int bodySlimmingAdjustType_;
    public boolean bodySlimmingGradient_;
    public BokehConfig bokehDepthConfig_;
    public boolean bokehDepthEnableTestMode_;
    public boolean bokehDepthEnable_;
    public float bokehDepthFocalLength_;
    public Bitmap bokehDepthMask_;
    public int bokehDepthQuality_;
    public float bokehDepthRadius_;
    public String bokehDepthSpotShape_;
    public BokehDepthTouch bokehDepthTouchPosition_;
    public int bokehDepthType_;
    public String boomGameJson_;
    public float bright_;
    public float clarityIntensity_;
    public int clientWorkProcess_;
    public ClientWorkProgress clientWorkProgresses_;
    public String coloringContent_;
    public int commandType_;
    public Internal$ProtobufList customInputTexts_;
    public String customStickerJson_;
    public int customTriggerType_;
    public float definitionIntensity_;
    public float deformIndensity_;
    public int deformMode_;
    public float effectIntensity_;
    public Internal$ProtobufList effectKeys_;
    public boolean enableBigeyeOptimization_;
    public boolean enableEnlargeMaxFaceCount_;
    public boolean enableMagicFilter_;
    public boolean enableMakeupChildToZero_;
    public boolean enableMvLookupFirst_;
    public boolean enableSmartBeautify_;
    public boolean enableSmartBeauty_;
    public boolean enableUndoWarpEdit_;
    public boolean enableUndoWarpPhotoRefreshData_;
    public boolean enableUndoWarpPhoto_;
    public FMPoint endPoint_;
    public float evenSkinIntensity_;
    public float eyeBagRemoveIntensity_;
    public float eyeBrightenIntensity_;
    public int faceDeformSelectionMemoizedSerializedSize;
    public Internal$IntList faceDeformSelection_;
    public float faceShadowIntensity_;
    public float faceTextureIntensity_;
    public int filterBasicAdjustType_;
    public float flashlightIntensity_;
    public int genderUsingType_;
    public EffectResource groupEffect_;
    public String groupName_;
    public HairClipConfig hairClipConfig_;
    public int hairDyeingMode_;
    public boolean hairSofteningImageMode_;
    public float hairSofteningStrength_;
    public int humanMattingType_;
    public int inputTextIndex_;
    public String inputText_;
    public float intensityWeight_;
    public String intputTextFont_;
    public boolean isActive_;
    public boolean isEditAutoStatus_;
    public boolean isEditFlawAuto_;
    public boolean isEditStatus_;
    public boolean isLivePk360P_;
    public boolean isMagicRemovelStatus_;
    public boolean isMainSticker_;
    public boolean isOpenFlaw_;
    public float liquifyIntensity_;
    public float liquifyRadius_;
    public FMSize liquifySize_;
    public float liquifyStride_;
    public int liquifyType_;
    public boolean liquifyistouchbegin_;
    public boolean liquifyistouchend_;
    public int lookupDimension_;
    public float lookupIntensity_;
    public EffectLookupParam lookupParam_;
    public String lookupPath_;
    public EffectLookupSlideParam lookupSlideParam_;
    public int lookupType_;
    public Bitmap magicRemovelMask_;
    public int magnifierBorderColorMemoizedSerializedSize;
    public Internal$FloatList magnifierBorderColor_;
    public float magnifierBorderRadius_;
    public float magnifierBorderWidth_;
    public int magnifierCanvasSizeMemoizedSerializedSize;
    public Internal$FloatList magnifierCanvasSize_;
    public float magnifierContentScale_;
    public int magnifierFaceTrackId_;
    public String magnifierShapePath_;
    public float makeUpPenBrushIntensity_;
    public int makeupBackLightMode_;
    public int makeupBlendMode_;
    public MakeupColor makeupColor_;
    public float makeupIntensity_;
    public String makeupMode_;
    public EffectColor makeupPenBrushColor_;
    public float makeupPenBrushHardness_;
    public String makeupPenBrushTexturePath_;
    public int makeupPenBrushType_;
    public EffectColor makeupPenEraserColor_;
    public float makeupPenEraserLiveTime_;
    public String makeupPenHighLightTexturePath_;
    public boolean makeupPenIsEraser_;
    public float makeupPenPointSize_;
    public float makeupPenPointStride_;
    public MakeupPenTouch makeupPenTouch_;
    public Internal$ProtobufList makeupResource_;
    public boolean memojiEnableEditMode_;
    public String memojiGroup_;
    public int memojiIconHeight_;
    public int memojiIconWidth_;
    public String memojiStyle_;
    public String memojiUserConfigJson_;
    public Internal$ProtobufList moreMediaData_;
    public int moveMagnifierContentDistanceMemoizedSerializedSize;
    public Internal$FloatList moveMagnifierContentDistance_;
    public String musicWavePath_;
    public float musicWaveTime_;
    public int nEditFlawUndoNums_;
    public int nMagicRemovelUndoNums_;
    public boolean needMakeupClearOldResource_;
    public float noseShadowIntensity_;
    public float oilfreeIntensity_;
    public String oilpaintSourcePath_;
    public String passThroughParams_;
    public String pickingMediaPath_;
    public int pickingMediaType_;
    public float playrate_;
    public RelightingConfig relightingConfig_;
    public SafeUIArea safeUiArea_;
    public float seekPoint_;
    public int serverMediaType_;
    public String serverResultPath_;
    public EditFlawConfig setEditFlawParams_;
    public boolean setFaceSegForBeauty_;
    public boolean shouldUseFacemask_;
    public boolean shouldUseGender_;
    public boolean shouldUseLandmarksmask_;
    public boolean slideEndWithNewEffect_;
    public float slideNewEffectDisplayLeft_;
    public float slideNewEffectDisplayRight_;
    public float smartBeautyIntensity_;
    public float soften_;
    public FMPoint startPoint_;
    public boolean stickerEnable_;
    public boolean stickerIntensityWeightActive_;
    public boolean stickerMainEnable_;
    public StickerInfo sticker_;
    public Internal$ProtobufList stickers_;
    public String swapFaceImagePath_;
    public float teethBrightenIntensity_;
    public float thermageIntensity_;
    public FMTimeStamp timestamp_;
    public int triggerInputTextIndex_;
    public String triggerInputText_;
    public boolean useLowPowerSensor_;
    public boolean useMaleMakeup_;
    public boolean useSkinAndHairSegModel_;
    public String userLocation_;
    public int videoLength_;
    public float waterSkinIntensity_;
    public int weakenMakeupIntensityProp_;
    public String whiteSkinConfig_;
    public float whiteSkinIntensity_;
    public float wocanIntensity_;
    public float wrinkleRemoveIntensity_;
    public static final EffectCommand DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       EffectCommand uEffectComma = new EffectCommand();
       EffectCommand.DEFAULT_INSTANCE = uEffectComma;
       GeneratedMessageLite.registerDefaultInstance(EffectCommand.class, uEffectComma);
    }
    public void EffectCommand(){
       super();
       this.faceDeformSelectionMemoizedSerializedSize = -1;
       this.magnifierBorderColorMemoizedSerializedSize = -1;
       this.moveMagnifierContentDistanceMemoizedSerializedSize = -1;
       this.magnifierCanvasSizeMemoizedSerializedSize = -1;
       this.makeupMode_ = "";
       this.makeupResource_ = GeneratedMessageLite.emptyProtobufList();
       this.lookupPath_ = "";
       this.swapFaceImagePath_ = "";
       this.groupName_ = "";
       this.inputText_ = "";
       this.memojiUserConfigJson_ = "";
       this.memojiGroup_ = "";
       this.memojiStyle_ = "";
       this.userLocation_ = "";
       this.musicWavePath_ = "";
       this.customStickerJson_ = "";
       this.boomGameJson_ = "";
       this.pickingMediaPath_ = "";
       this.intputTextFont_ = "";
       this.bokehDepthSpotShape_ = "";
       this.blendMode_ = "";
       this.effectKeys_ = GeneratedMessageLite.emptyProtobufList();
       this.coloringContent_ = "";
       this.oilpaintSourcePath_ = "";
       this.whiteSkinConfig_ = "";
       this.faceDeformSelection_ = GeneratedMessageLite.emptyIntList();
       this.beautifyGroupPath_ = "";
       this.magnifierShapePath_ = "";
       this.magnifierBorderColor_ = GeneratedMessageLite.emptyFloatList();
       this.moveMagnifierContentDistance_ = GeneratedMessageLite.emptyFloatList();
       this.magnifierCanvasSize_ = GeneratedMessageLite.emptyFloatList();
       this.stickers_ = GeneratedMessageLite.emptyProtobufList();
       this.triggerInputText_ = "";
       this.makeupPenHighLightTexturePath_ = "";
       this.makeupPenBrushTexturePath_ = "";
       this.beautifyPreviewPart_ = "";
       this.passThroughParams_ = "";
       this.serverResultPath_ = "";
       this.moreMediaData_ = GeneratedMessageLite.emptyProtobufList();
       this.customInputTexts_ = GeneratedMessageLite.emptyProtobufList();
    }
    public static EffectCommand getDefaultInstance(){
       return EffectCommand.DEFAULT_INSTANCE;
    }
    public static EffectCommand$Builder newBuilder(){
       return EffectCommand.DEFAULT_INSTANCE.createBuilder();
    }
    public static EffectCommand$Builder newBuilder(EffectCommand p0){
       return EffectCommand.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static EffectCommand parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(EffectCommand.DEFAULT_INSTANCE, p0);
    }
    public static EffectCommand parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(EffectCommand.DEFAULT_INSTANCE, p0, p1);
    }
    public static EffectCommand parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(EffectCommand.DEFAULT_INSTANCE, p0);
    }
    public static EffectCommand parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EffectCommand.DEFAULT_INSTANCE, p0, p1);
    }
    public static EffectCommand parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(EffectCommand.DEFAULT_INSTANCE, p0);
    }
    public static EffectCommand parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EffectCommand.DEFAULT_INSTANCE, p0, p1);
    }
    public static EffectCommand parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(EffectCommand.DEFAULT_INSTANCE, p0);
    }
    public static EffectCommand parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EffectCommand.DEFAULT_INSTANCE, p0, p1);
    }
    public static EffectCommand parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(EffectCommand.DEFAULT_INSTANCE, p0);
    }
    public static EffectCommand parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EffectCommand.DEFAULT_INSTANCE, p0, p1);
    }
    public static EffectCommand parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(EffectCommand.DEFAULT_INSTANCE, p0);
    }
    public static EffectCommand parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EffectCommand.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return EffectCommand.DEFAULT_INSTANCE.getParserForType();
    }
    public void addAllCustomInputTexts(Iterable p0){
       this.ensureCustomInputTextsIsMutable();
       AbstractMessageLite.addAll(p0, this.customInputTexts_);
    }
    public void addAllEffectKeys(Iterable p0){
       this.ensureEffectKeysIsMutable();
       AbstractMessageLite.addAll(p0, this.effectKeys_);
    }
    public void addAllFaceDeformSelection(Iterable p0){
       this.ensureFaceDeformSelectionIsMutable();
       AbstractMessageLite.addAll(p0, this.faceDeformSelection_);
    }
    public void addAllMagnifierBorderColor(Iterable p0){
       this.ensureMagnifierBorderColorIsMutable();
       AbstractMessageLite.addAll(p0, this.magnifierBorderColor_);
    }
    public void addAllMagnifierCanvasSize(Iterable p0){
       this.ensureMagnifierCanvasSizeIsMutable();
       AbstractMessageLite.addAll(p0, this.magnifierCanvasSize_);
    }
    public void addAllMakeupResource(Iterable p0){
       this.ensureMakeupResourceIsMutable();
       AbstractMessageLite.addAll(p0, this.makeupResource_);
    }
    public void addAllMoreMediaData(Iterable p0){
       this.ensureMoreMediaDataIsMutable();
       AbstractMessageLite.addAll(p0, this.moreMediaData_);
    }
    public void addAllMoveMagnifierContentDistance(Iterable p0){
       this.ensureMoveMagnifierContentDistanceIsMutable();
       AbstractMessageLite.addAll(p0, this.moveMagnifierContentDistance_);
    }
    public void addAllStickers(Iterable p0){
       this.ensureStickersIsMutable();
       AbstractMessageLite.addAll(p0, this.stickers_);
    }
    public void addCustomInputTexts(int p0,CustomInputText$Builder p1){
       this.ensureCustomInputTextsIsMutable();
       this.customInputTexts_.add(p0, p1.build());
    }
    public void addCustomInputTexts(int p0,CustomInputText p1){
       Objects.requireNonNull(p1);
       this.ensureCustomInputTextsIsMutable();
       this.customInputTexts_.add(p0, p1);
    }
    public void addCustomInputTexts(CustomInputText$Builder p0){
       this.ensureCustomInputTextsIsMutable();
       this.customInputTexts_.add(p0.build());
    }
    public void addCustomInputTexts(CustomInputText p0){
       Objects.requireNonNull(p0);
       this.ensureCustomInputTextsIsMutable();
       this.customInputTexts_.add(p0);
    }
    public void addEffectKeys(String p0){
       Objects.requireNonNull(p0);
       this.ensureEffectKeysIsMutable();
       this.effectKeys_.add(p0);
    }
    public void addEffectKeysBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.ensureEffectKeysIsMutable();
       this.effectKeys_.add(p0.toStringUtf8());
    }
    public void addFaceDeformSelection(int p0){
       this.ensureFaceDeformSelectionIsMutable();
       this.faceDeformSelection_.addInt(p0);
    }
    public void addMagnifierBorderColor(float p0){
       this.ensureMagnifierBorderColorIsMutable();
       this.magnifierBorderColor_.addFloat(p0);
    }
    public void addMagnifierCanvasSize(float p0){
       this.ensureMagnifierCanvasSizeIsMutable();
       this.magnifierCanvasSize_.addFloat(p0);
    }
    public void addMakeupResource(int p0,MakeupResource$Builder p1){
       this.ensureMakeupResourceIsMutable();
       this.makeupResource_.add(p0, p1.build());
    }
    public void addMakeupResource(int p0,MakeupResource p1){
       Objects.requireNonNull(p1);
       this.ensureMakeupResourceIsMutable();
       this.makeupResource_.add(p0, p1);
    }
    public void addMakeupResource(MakeupResource$Builder p0){
       this.ensureMakeupResourceIsMutable();
       this.makeupResource_.add(p0.build());
    }
    public void addMakeupResource(MakeupResource p0){
       Objects.requireNonNull(p0);
       this.ensureMakeupResourceIsMutable();
       this.makeupResource_.add(p0);
    }
    public void addMoreMediaData(int p0,PickingMediaData$Builder p1){
       this.ensureMoreMediaDataIsMutable();
       this.moreMediaData_.add(p0, p1.build());
    }
    public void addMoreMediaData(int p0,PickingMediaData p1){
       Objects.requireNonNull(p1);
       this.ensureMoreMediaDataIsMutable();
       this.moreMediaData_.add(p0, p1);
    }
    public void addMoreMediaData(PickingMediaData$Builder p0){
       this.ensureMoreMediaDataIsMutable();
       this.moreMediaData_.add(p0.build());
    }
    public void addMoreMediaData(PickingMediaData p0){
       Objects.requireNonNull(p0);
       this.ensureMoreMediaDataIsMutable();
       this.moreMediaData_.add(p0);
    }
    public void addMoveMagnifierContentDistance(float p0){
       this.ensureMoveMagnifierContentDistanceIsMutable();
       this.moveMagnifierContentDistance_.addFloat(p0);
    }
    public void addStickers(int p0,StickerInfo$Builder p1){
       this.ensureStickersIsMutable();
       this.stickers_.add(p0, p1.build());
    }
    public void addStickers(int p0,StickerInfo p1){
       Objects.requireNonNull(p1);
       this.ensureStickersIsMutable();
       this.stickers_.add(p0, p1);
    }
    public void addStickers(StickerInfo$Builder p0){
       this.ensureStickersIsMutable();
       this.stickers_.add(p0.build());
    }
    public void addStickers(StickerInfo p0){
       Objects.requireNonNull(p0);
       this.ensureStickersIsMutable();
       this.stickers_.add(p0);
    }
    public void clearAdjustEffectType(){
       this.adjustEffectType_ = 0;
    }
    public void clearAideflawIntensity(){
       this.aideflawIntensity_ = 0;
    }
    public void clearAieyelidIntensity(){
       this.aieyelidIntensity_ = 0;
    }
    public void clearAllDeletedWhenResetRecording(){
       this.allDeletedWhenResetRecording_ = false;
    }
    public void clearAnimojiData(){
       this.animojiData_ = null;
    }
    public void clearBasicAdjustIntensity(){
       this.basicAdjustIntensity_ = 0;
    }
    public void clearBeautifyGroupPath(){
       this.beautifyGroupPath_ = EffectCommand.getDefaultInstance().getBeautifyGroupPath();
    }
    public void clearBeautifyLipsIntensity(){
       this.beautifyLipsIntensity_ = 0;
    }
    public void clearBeautifyPanelStatus(){
       this.beautifyPanelStatus_ = 0;
    }
    public void clearBeautifyPreviewPart(){
       this.beautifyPreviewPart_ = EffectCommand.getDefaultInstance().getBeautifyPreviewPart();
    }
    public void clearBeautifySecondBrightIntensity(){
       this.beautifySecondBrightIntensity_ = 0;
    }
    public void clearBeautyAnyIntensity(){
       this.beautyAnyIntensity_ = 0;
    }
    public void clearBeautyAnyType(){
       this.beautyAnyType_ = 0;
    }
    public void clearBeautyzerooptIntensity(){
       this.beautyzerooptIntensity_ = 0;
    }
    public void clearBlendMode(){
       this.blendMode_ = EffectCommand.getDefaultInstance().getBlendMode();
    }
    public void clearBodySlimmingAdjustIntensity(){
       this.bodySlimmingAdjustIntensity_ = 0;
    }
    public void clearBodySlimmingAdjustType(){
       this.bodySlimmingAdjustType_ = 0;
    }
    public void clearBodySlimmingGradient(){
       this.bodySlimmingGradient_ = false;
    }
    public void clearBokehDepthConfig(){
       this.bokehDepthConfig_ = null;
    }
    public void clearBokehDepthEnable(){
       this.bokehDepthEnable_ = false;
    }
    public void clearBokehDepthEnableTestMode(){
       this.bokehDepthEnableTestMode_ = false;
    }
    public void clearBokehDepthFocalLength(){
       this.bokehDepthFocalLength_ = 0;
    }
    public void clearBokehDepthMask(){
       this.bokehDepthMask_ = null;
    }
    public void clearBokehDepthQuality(){
       this.bokehDepthQuality_ = 0;
    }
    public void clearBokehDepthRadius(){
       this.bokehDepthRadius_ = 0;
    }
    public void clearBokehDepthSpotShape(){
       this.bokehDepthSpotShape_ = EffectCommand.getDefaultInstance().getBokehDepthSpotShape();
    }
    public void clearBokehDepthTouchPosition(){
       this.bokehDepthTouchPosition_ = null;
    }
    public void clearBokehDepthType(){
       this.bokehDepthType_ = 0;
    }
    public void clearBoomGameJson(){
       this.boomGameJson_ = EffectCommand.getDefaultInstance().getBoomGameJson();
    }
    public void clearBright(){
       this.bright_ = 0;
    }
    public void clearClarityIntensity(){
       this.clarityIntensity_ = 0;
    }
    public void clearClientWorkProcess(){
       this.clientWorkProcess_ = 0;
    }
    public void clearClientWorkProgresses(){
       this.clientWorkProgresses_ = null;
    }
    public void clearColoringContent(){
       this.coloringContent_ = EffectCommand.getDefaultInstance().getColoringContent();
    }
    public void clearCommandType(){
       this.commandType_ = 0;
    }
    public void clearCustomInputTexts(){
       this.customInputTexts_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearCustomStickerJson(){
       this.customStickerJson_ = EffectCommand.getDefaultInstance().getCustomStickerJson();
    }
    public void clearCustomTriggerType(){
       this.customTriggerType_ = 0;
    }
    public void clearDefinitionIntensity(){
       this.definitionIntensity_ = 0;
    }
    public void clearDeformIndensity(){
       this.deformIndensity_ = 0;
    }
    public void clearDeformMode(){
       this.deformMode_ = 0;
    }
    public void clearEffectIntensity(){
       this.effectIntensity_ = 0;
    }
    public void clearEffectKeys(){
       this.effectKeys_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearEnableBigeyeOptimization(){
       this.enableBigeyeOptimization_ = false;
    }
    public void clearEnableEnlargeMaxFaceCount(){
       this.enableEnlargeMaxFaceCount_ = false;
    }
    public void clearEnableMagicFilter(){
       this.enableMagicFilter_ = false;
    }
    public void clearEnableMakeupChildToZero(){
       this.enableMakeupChildToZero_ = false;
    }
    public void clearEnableMvLookupFirst(){
       this.enableMvLookupFirst_ = false;
    }
    public void clearEnableSmartBeautify(){
       this.enableSmartBeautify_ = false;
    }
    public void clearEnableSmartBeauty(){
       this.enableSmartBeauty_ = false;
    }
    public void clearEnableUndoWarpEdit(){
       this.enableUndoWarpEdit_ = false;
    }
    public void clearEnableUndoWarpPhoto(){
       this.enableUndoWarpPhoto_ = false;
    }
    public void clearEnableUndoWarpPhotoRefreshData(){
       this.enableUndoWarpPhotoRefreshData_ = false;
    }
    public void clearEndPoint(){
       this.endPoint_ = null;
    }
    public void clearEvenSkinIntensity(){
       this.evenSkinIntensity_ = 0;
    }
    public void clearEyeBagRemoveIntensity(){
       this.eyeBagRemoveIntensity_ = 0;
    }
    public void clearEyeBrightenIntensity(){
       this.eyeBrightenIntensity_ = 0;
    }
    public void clearFaceDeformSelection(){
       this.faceDeformSelection_ = GeneratedMessageLite.emptyIntList();
    }
    public void clearFaceShadowIntensity(){
       this.faceShadowIntensity_ = 0;
    }
    public void clearFaceTextureIntensity(){
       this.faceTextureIntensity_ = 0;
    }
    public void clearFilterBasicAdjustType(){
       this.filterBasicAdjustType_ = 0;
    }
    public void clearFlashlightIntensity(){
       this.flashlightIntensity_ = 0;
    }
    public void clearGenderUsingType(){
       this.genderUsingType_ = 0;
    }
    public void clearGroupEffect(){
       this.groupEffect_ = null;
    }
    public void clearGroupName(){
       this.groupName_ = EffectCommand.getDefaultInstance().getGroupName();
    }
    public void clearHairClipConfig(){
       this.hairClipConfig_ = null;
    }
    public void clearHairDyeingMode(){
       this.hairDyeingMode_ = 0;
    }
    public void clearHairSofteningImageMode(){
       this.hairSofteningImageMode_ = false;
    }
    public void clearHairSofteningStrength(){
       this.hairSofteningStrength_ = 0;
    }
    public void clearHumanMattingType(){
       this.humanMattingType_ = 0;
    }
    public void clearInputText(){
       this.inputText_ = EffectCommand.getDefaultInstance().getInputText();
    }
    public void clearInputTextIndex(){
       this.inputTextIndex_ = 0;
    }
    public void clearIntensityWeight(){
       this.intensityWeight_ = 0;
    }
    public void clearIntputTextFont(){
       this.intputTextFont_ = EffectCommand.getDefaultInstance().getIntputTextFont();
    }
    public void clearIsActive(){
       this.isActive_ = false;
    }
    public void clearIsEditAutoStatus(){
       this.isEditAutoStatus_ = false;
    }
    public void clearIsEditFlawAuto(){
       this.isEditFlawAuto_ = false;
    }
    public void clearIsEditStatus(){
       this.isEditStatus_ = false;
    }
    public void clearIsLivePk360P(){
       this.isLivePk360P_ = false;
    }
    public void clearIsMagicRemovelStatus(){
       this.isMagicRemovelStatus_ = false;
    }
    public void clearIsMainSticker(){
       this.isMainSticker_ = false;
    }
    public void clearIsOpenFlaw(){
       this.isOpenFlaw_ = false;
    }
    public void clearLiquifyIntensity(){
       this.liquifyIntensity_ = 0;
    }
    public void clearLiquifyRadius(){
       this.liquifyRadius_ = 0;
    }
    public void clearLiquifySize(){
       this.liquifySize_ = null;
    }
    public void clearLiquifyStride(){
       this.liquifyStride_ = 0;
    }
    public void clearLiquifyType(){
       this.liquifyType_ = 0;
    }
    public void clearLiquifyistouchbegin(){
       this.liquifyistouchbegin_ = false;
    }
    public void clearLiquifyistouchend(){
       this.liquifyistouchend_ = false;
    }
    public void clearLookupDimension(){
       this.lookupDimension_ = 0;
    }
    public void clearLookupIntensity(){
       this.lookupIntensity_ = 0;
    }
    public void clearLookupParam(){
       this.lookupParam_ = null;
    }
    public void clearLookupPath(){
       this.lookupPath_ = EffectCommand.getDefaultInstance().getLookupPath();
    }
    public void clearLookupSlideParam(){
       this.lookupSlideParam_ = null;
    }
    public void clearLookupType(){
       this.lookupType_ = 0;
    }
    public void clearMagicRemovelMask(){
       this.magicRemovelMask_ = null;
    }
    public void clearMagnifierBorderColor(){
       this.magnifierBorderColor_ = GeneratedMessageLite.emptyFloatList();
    }
    public void clearMagnifierBorderRadius(){
       this.magnifierBorderRadius_ = 0;
    }
    public void clearMagnifierBorderWidth(){
       this.magnifierBorderWidth_ = 0;
    }
    public void clearMagnifierCanvasSize(){
       this.magnifierCanvasSize_ = GeneratedMessageLite.emptyFloatList();
    }
    public void clearMagnifierContentScale(){
       this.magnifierContentScale_ = 0;
    }
    public void clearMagnifierFaceTrackId(){
       this.magnifierFaceTrackId_ = 0;
    }
    public void clearMagnifierShapePath(){
       this.magnifierShapePath_ = EffectCommand.getDefaultInstance().getMagnifierShapePath();
    }
    public void clearMakeUpPenBrushIntensity(){
       this.makeUpPenBrushIntensity_ = 0;
    }
    public void clearMakeupBackLightMode(){
       this.makeupBackLightMode_ = 0;
    }
    public void clearMakeupBlendMode(){
       this.makeupBlendMode_ = 0;
    }
    public void clearMakeupColor(){
       this.makeupColor_ = null;
    }
    public void clearMakeupIntensity(){
       this.makeupIntensity_ = 0;
    }
    public void clearMakeupMode(){
       this.makeupMode_ = EffectCommand.getDefaultInstance().getMakeupMode();
    }
    public void clearMakeupPenBrushColor(){
       this.makeupPenBrushColor_ = null;
    }
    public void clearMakeupPenBrushHardness(){
       this.makeupPenBrushHardness_ = 0;
    }
    public void clearMakeupPenBrushTexturePath(){
       this.makeupPenBrushTexturePath_ = EffectCommand.getDefaultInstance().getMakeupPenBrushTexturePath();
    }
    public void clearMakeupPenBrushType(){
       this.makeupPenBrushType_ = 0;
    }
    public void clearMakeupPenEraserColor(){
       this.makeupPenEraserColor_ = null;
    }
    public void clearMakeupPenEraserLiveTime(){
       this.makeupPenEraserLiveTime_ = 0;
    }
    public void clearMakeupPenHighLightTexturePath(){
       this.makeupPenHighLightTexturePath_ = EffectCommand.getDefaultInstance().getMakeupPenHighLightTexturePath();
    }
    public void clearMakeupPenIsEraser(){
       this.makeupPenIsEraser_ = false;
    }
    public void clearMakeupPenPointSize(){
       this.makeupPenPointSize_ = 0;
    }
    public void clearMakeupPenPointStride(){
       this.makeupPenPointStride_ = 0;
    }
    public void clearMakeupPenTouch(){
       this.makeupPenTouch_ = null;
    }
    public void clearMakeupResource(){
       this.makeupResource_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearMemojiEnableEditMode(){
       this.memojiEnableEditMode_ = false;
    }
    public void clearMemojiGroup(){
       this.memojiGroup_ = EffectCommand.getDefaultInstance().getMemojiGroup();
    }
    public void clearMemojiIconHeight(){
       this.memojiIconHeight_ = 0;
    }
    public void clearMemojiIconWidth(){
       this.memojiIconWidth_ = 0;
    }
    public void clearMemojiStyle(){
       this.memojiStyle_ = EffectCommand.getDefaultInstance().getMemojiStyle();
    }
    public void clearMemojiUserConfigJson(){
       this.memojiUserConfigJson_ = EffectCommand.getDefaultInstance().getMemojiUserConfigJson();
    }
    public void clearMoreMediaData(){
       this.moreMediaData_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearMoveMagnifierContentDistance(){
       this.moveMagnifierContentDistance_ = GeneratedMessageLite.emptyFloatList();
    }
    public void clearMusicWavePath(){
       this.musicWavePath_ = EffectCommand.getDefaultInstance().getMusicWavePath();
    }
    public void clearMusicWaveTime(){
       this.musicWaveTime_ = 0;
    }
    public void clearNEditFlawUndoNums(){
       this.nEditFlawUndoNums_ = 0;
    }
    public void clearNMagicRemovelUndoNums(){
       this.nMagicRemovelUndoNums_ = 0;
    }
    public void clearNeedMakeupClearOldResource(){
       this.needMakeupClearOldResource_ = false;
    }
    public void clearNoseShadowIntensity(){
       this.noseShadowIntensity_ = 0;
    }
    public void clearOilfreeIntensity(){
       this.oilfreeIntensity_ = 0;
    }
    public void clearOilpaintSourcePath(){
       this.oilpaintSourcePath_ = EffectCommand.getDefaultInstance().getOilpaintSourcePath();
    }
    public void clearPassThroughParams(){
       this.passThroughParams_ = EffectCommand.getDefaultInstance().getPassThroughParams();
    }
    public void clearPickingMediaPath(){
       this.pickingMediaPath_ = EffectCommand.getDefaultInstance().getPickingMediaPath();
    }
    public void clearPickingMediaType(){
       this.pickingMediaType_ = 0;
    }
    public void clearPlayrate(){
       this.playrate_ = 0;
    }
    public void clearRelightingConfig(){
       this.relightingConfig_ = null;
    }
    public void clearSafeUiArea(){
       this.safeUiArea_ = null;
    }
    public void clearSeekPoint(){
       this.seekPoint_ = 0;
    }
    public void clearServerMediaType(){
       this.serverMediaType_ = 0;
    }
    public void clearServerResultPath(){
       this.serverResultPath_ = EffectCommand.getDefaultInstance().getServerResultPath();
    }
    public void clearSetEditFlawParams(){
       this.setEditFlawParams_ = null;
    }
    public void clearSetFaceSegForBeauty(){
       this.setFaceSegForBeauty_ = false;
    }
    public void clearShouldUseFacemask(){
       this.shouldUseFacemask_ = false;
    }
    public void clearShouldUseGender(){
       this.shouldUseGender_ = false;
    }
    public void clearShouldUseLandmarksmask(){
       this.shouldUseLandmarksmask_ = false;
    }
    public void clearSlideEndWithNewEffect(){
       this.slideEndWithNewEffect_ = false;
    }
    public void clearSlideNewEffectDisplayLeft(){
       this.slideNewEffectDisplayLeft_ = 0;
    }
    public void clearSlideNewEffectDisplayRight(){
       this.slideNewEffectDisplayRight_ = 0;
    }
    public void clearSmartBeautyIntensity(){
       this.smartBeautyIntensity_ = 0;
    }
    public void clearSoften(){
       this.soften_ = 0;
    }
    public void clearStartPoint(){
       this.startPoint_ = null;
    }
    public void clearSticker(){
       this.sticker_ = null;
    }
    public void clearStickerEnable(){
       this.stickerEnable_ = false;
    }
    public void clearStickerIntensityWeightActive(){
       this.stickerIntensityWeightActive_ = false;
    }
    public void clearStickerMainEnable(){
       this.stickerMainEnable_ = false;
    }
    public void clearStickers(){
       this.stickers_ = GeneratedMessageLite.emptyProtobufList();
    }
    public void clearSwapFaceImagePath(){
       this.swapFaceImagePath_ = EffectCommand.getDefaultInstance().getSwapFaceImagePath();
    }
    public void clearTeethBrightenIntensity(){
       this.teethBrightenIntensity_ = 0;
    }
    public void clearThermageIntensity(){
       this.thermageIntensity_ = 0;
    }
    public void clearTimestamp(){
       this.timestamp_ = null;
    }
    public void clearTriggerInputText(){
       this.triggerInputText_ = EffectCommand.getDefaultInstance().getTriggerInputText();
    }
    public void clearTriggerInputTextIndex(){
       this.triggerInputTextIndex_ = 0;
    }
    public void clearUseLowPowerSensor(){
       this.useLowPowerSensor_ = false;
    }
    public void clearUseMaleMakeup(){
       this.useMaleMakeup_ = false;
    }
    public void clearUseSkinAndHairSegModel(){
       this.useSkinAndHairSegModel_ = false;
    }
    public void clearUserLocation(){
       this.userLocation_ = EffectCommand.getDefaultInstance().getUserLocation();
    }
    public void clearVideoLength(){
       this.videoLength_ = 0;
    }
    public void clearWaterSkinIntensity(){
       this.waterSkinIntensity_ = 0;
    }
    public void clearWeakenMakeupIntensityProp(){
       this.weakenMakeupIntensityProp_ = 0;
    }
    public void clearWhiteSkinConfig(){
       this.whiteSkinConfig_ = EffectCommand.getDefaultInstance().getWhiteSkinConfig();
    }
    public void clearWhiteSkinIntensity(){
       this.whiteSkinIntensity_ = 0;
    }
    public void clearWocanIntensity(){
       this.wocanIntensity_ = 0;
    }
    public void clearWrinkleRemoveIntensity(){
       this.wrinkleRemoveIntensity_ = 0;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (EffectCommand$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new EffectCommand();
           case 2:
             return new EffectCommand$Builder(p2);
           case 3:
             Object[] objArray = new Object[183];
             objArray[0] = "commandType_";
             objArray[i] = "bright_";
             objArray[2] = "soften_";
             objArray[3] = "deformMode_";
             objArray[4] = "deformIndensity_";
             objArray[5] = "makeupMode_";
             objArray[6] = "makeupIntensity_";
             objArray[7] = "makeupResource_";
             objArray[8] = MakeupResource.class;
             objArray[9] = "needMakeupClearOldResource_";
             objArray[10] = "lookupPath_";
             objArray[11] = "lookupType_";
             objArray[12] = "lookupDimension_";
             objArray[13] = "lookupIntensity_";
             objArray[14] = "swapFaceImagePath_";
             objArray[15] = "groupName_";
             objArray[16] = "groupEffect_";
             objArray[17] = "customTriggerType_";
             objArray[18] = "effectIntensity_";
             objArray[19] = "filterBasicAdjustType_";
             objArray[20] = "basicAdjustIntensity_";
             objArray[21] = "inputText_";
             objArray[22] = "inputTextIndex_";
             objArray[23] = "allDeletedWhenResetRecording_";
             objArray[24] = "memojiUserConfigJson_";
             objArray[25] = "memojiGroup_";
             objArray[26] = "memojiStyle_";
             objArray[27] = "memojiEnableEditMode_";
             objArray[28] = "memojiIconWidth_";
             objArray[29] = "memojiIconHeight_";
             objArray[30] = "userLocation_";
             objArray[31] = "musicWavePath_";
             objArray[32] = "musicWaveTime_";
             objArray[33] = "customStickerJson_";
             objArray[34] = "genderUsingType_";
             objArray[35] = "wrinkleRemoveIntensity_";
             objArray[36] = "eyeBagRemoveIntensity_";
             objArray[37] = "eyeBrightenIntensity_";
             objArray[38] = "teethBrightenIntensity_";
             objArray[39] = "beautifyLipsIntensity_";
             objArray[40] = "noseShadowIntensity_";
             objArray[41] = "bodySlimmingAdjustType_";
             objArray[42] = "bodySlimmingAdjustIntensity_";
             objArray[43] = "beautifySecondBrightIntensity_";
             objArray[44] = "slideNewEffectDisplayLeft_";
             objArray[45] = "slideNewEffectDisplayRight_";
             objArray[46] = "slideEndWithNewEffect_";
             objArray[47] = "lookupSlideParam_";
             objArray[48] = "lookupParam_";
             objArray[49] = "useMaleMakeup_";
             objArray[50] = "faceShadowIntensity_";
             objArray[51] = "clarityIntensity_";
             objArray[52] = "seekPoint_";
             objArray[53] = "playrate_";
             objArray[54] = "isLivePk360P_";
             objArray[55] = "boomGameJson_";
             objArray[56] = "pickingMediaType_";
             objArray[57] = "pickingMediaPath_";
             objArray[58] = "safeUiArea_";
             objArray[59] = "enableMagicFilter_";
             objArray[60] = "adjustEffectType_";
             objArray[61] = "intputTextFont_";
             objArray[62] = "evenSkinIntensity_";
             objArray[63] = "videoLength_";
             objArray[64] = "isOpenFlaw_";
             objArray[65] = "intensityWeight_";
             objArray[66] = "bokehDepthEnable_";
             objArray[67] = "bokehDepthRadius_";
             objArray[68] = "bokehDepthFocalLength_";
             objArray[69] = "bokehDepthSpotShape_";
             objArray[70] = "shouldUseGender_";
             objArray[71] = "shouldUseFacemask_";
             objArray[72] = "bokehDepthTouchPosition_";
             objArray[73] = "blendMode_";
             objArray[74] = "bokehDepthType_";
             objArray[75] = "bokehDepthQuality_";
             objArray[76] = "bokehDepthMask_";
             objArray[77] = "hairSofteningStrength_";
             objArray[78] = "humanMattingType_";
             objArray[79] = "hairSofteningImageMode_";
             objArray[80] = "relightingConfig_";
             objArray[81] = "bokehDepthEnableTestMode_";
             objArray[82] = "bokehDepthConfig_";
             objArray[83] = "effectKeys_";
             objArray[84] = "isActive_";
             objArray[85] = "stickerIntensityWeightActive_";
             objArray[86] = "bodySlimmingGradient_";
             objArray[87] = "liquifyType_";
             objArray[88] = "startPoint_";
             objArray[89] = "endPoint_";
             objArray[90] = "liquifyRadius_";
             objArray[91] = "liquifyIntensity_";
             objArray[92] = "liquifySize_";
             objArray[93] = "liquifyStride_";
             objArray[94] = "setFaceSegForBeauty_";
             objArray[95] = "hairDyeingMode_";
             objArray[96] = "coloringContent_";
             objArray[97] = "setEditFlawParams_";
             objArray[98] = "isEditStatus_";
             objArray[99] = "isEditFlawAuto_";
             objArray[100] = "isEditAutoStatus_";
             objArray[101] = "nEditFlawUndoNums_";
             objArray[102] = "hairClipConfig_";
             objArray[103] = "oilpaintSourcePath_";
             objArray[104] = "animojiData_";
             objArray[105] = "shouldUseLandmarksmask_";
             objArray[106] = "makeupColor_";
             objArray[107] = "makeupBlendMode_";
             objArray[108] = "timestamp_";
             objArray[109] = "enableSmartBeautify_";
             objArray[110] = "whiteSkinIntensity_";
             objArray[111] = "whiteSkinConfig_";
             objArray[112] = "liquifyistouchbegin_";
             objArray[113] = "liquifyistouchend_";
             objArray[114] = "magicRemovelMask_";
             objArray[115] = "isMagicRemovelStatus_";
             objArray[116] = "nMagicRemovelUndoNums_";
             objArray[117] = "oilfreeIntensity_";
             objArray[118] = "faceTextureIntensity_";
             objArray[119] = "faceDeformSelection_";
             objArray[120] = "useLowPowerSensor_";
             objArray[121] = "enableBigeyeOptimization_";
             objArray[122] = "enableMvLookupFirst_";
             objArray[123] = "useSkinAndHairSegModel_";
             objArray[124] = "weakenMakeupIntensityProp_";
             objArray[125] = "beautifyGroupPath_";
             objArray[126] = "enableEnlargeMaxFaceCount_";
             objArray[127] = "magnifierShapePath_";
             objArray[128] = "magnifierBorderColor_";
             objArray[129] = "magnifierBorderWidth_";
             objArray[130] = "magnifierBorderRadius_";
             objArray[131] = "magnifierContentScale_";
             objArray[132] = "moveMagnifierContentDistance_";
             objArray[133] = "magnifierCanvasSize_";
             objArray[134] = "magnifierFaceTrackId_";
             objArray[135] = "enableMakeupChildToZero_";
             objArray[136] = "flashlightIntensity_";
             objArray[137] = "enableUndoWarpEdit_";
             objArray[138] = "enableUndoWarpPhoto_";
             objArray[139] = "enableUndoWarpPhotoRefreshData_";
             objArray[140] = "makeupBackLightMode_";
             objArray[141] = "stickerEnable_";
             objArray[142] = "stickerMainEnable_";
             objArray[143] = "sticker_";
             objArray[144] = "stickers_";
             objArray[145] = StickerInfo.class;
             objArray[146] = "isMainSticker_";
             objArray[147] = "beautyzerooptIntensity_";
             objArray[148] = "triggerInputText_";
             objArray[149] = "triggerInputTextIndex_";
             objArray[150] = "makeupPenBrushColor_";
             objArray[151] = "makeupPenBrushType_";
             objArray[152] = "makeupPenIsEraser_";
             objArray[153] = "makeupPenBrushHardness_";
             objArray[154] = "makeupPenPointSize_";
             objArray[155] = "makeupPenPointStride_";
             objArray[156] = "makeupPenHighLightTexturePath_";
             objArray[157] = "makeUpPenBrushIntensity_";
             objArray[158] = "makeupPenTouch_";
             objArray[159] = "makeupPenBrushTexturePath_";
             objArray[160] = "makeupPenEraserLiveTime_";
             objArray[161] = "makeupPenEraserColor_";
             objArray[162] = "aideflawIntensity_";
             objArray[163] = "beautyAnyType_";
             objArray[164] = "beautyAnyIntensity_";
             objArray[165] = "wocanIntensity_";
             objArray[166] = "waterSkinIntensity_";
             objArray[167] = "aieyelidIntensity_";
             objArray[168] = "beautifyPreviewPart_";
             objArray[169] = "beautifyPanelStatus_";
             objArray[170] = "smartBeautyIntensity_";
             objArray[171] = "enableSmartBeauty_";
             objArray[172] = "passThroughParams_";
             objArray[173] = "thermageIntensity_";
             objArray[174] = "clientWorkProcess_";
             objArray[175] = "serverResultPath_";
             objArray[176] = "serverMediaType_";
             objArray[177] = "moreMediaData_";
             objArray[178] = PickingMediaData.class;
             objArray[179] = "clientWorkProgresses_";
             objArray[180] = "customInputTexts_";
             objArray[181] = CustomInputText.class;
             objArray[182] = "definitionIntensity_";
             return GeneratedMessageLite.newMessageInfo(EffectCommand.DEFAULT_INSTANCE, "\xff\x02\xff\x02\xb3\xff\x02\xff\x02\xff\x02\xff\x02\x01\xba\xb3\xff\x02\xff\x02\t\xff\x02\xff\x02\x01\f\x02\x01\x03\x01\x04\x04\x05\x01\x06\x02\x02\x07\x01\b\x1b\t\x07\n\x02\x02\x0b\x04\f\x04\r\x01\x0e\x02\x02\x13\x02\x02\x14\t\x15\x04\x16\x01\x17\f\x18\x01\x19\x02\x02\x1a\x04\x1b\x07\x1c\x02\x02\x1d\x02\x02\x1e\x02\x02\x1f\x07 \x04!\x04\"\x02\x02#\x02\x02$\x01%\x02\x02&\f\'\x01\(\x01\)\x01*\x01+\x01,\x01-\f.\x01/\x010\x011\x012\x073\t4\t5\x076\x017\x018\x019\x01:\x07;\x02\x02<\f=\x02\x02>\t?\x07@\fA\x02\x02B\x01C\x04F\x07G\x01H\x07I\x01J\x01K\x02\x02L\x07M\x07N\tO\x02\x02P\fQ\fR\tS\x01T\fU\x07V\tW\x07X\tY\x02\x02Z\x07[\x07\\\x07]\f^\t_\t`\x01a\x01b\tc\x01d\x07e\ff\x02\x02g\th\x07i\x07j\x07k\x04l\tm\x02\x02o\tp\x07q\tr\x04s\tt\x07u\x01v\x02\x02w\x07x\x07y\tz\x07{\x04|\x01}\x01~\'\x7f\x07\x80\x07\x81\x07\x82\x07\x83\x04\x84\x02\x02\x85\x07\x86\x02\x02\x87$\x88\x01\x89\x01\x8a\x01\x8b$\x8c$\x8d\x04\x8e\x07\x8f\x01\x90\x07\x91\x07\x92\x07\x93\x04\x94\x07\x95\x07\x96\t\x97\x1b\x98\x07\x99\x01\x9a\x02\x02\x9b\x04\x9c\t\x9d\f\x9e\x07\x9f\x01\xa0\x01\xa1\x01\xa2\x02\x02\xa3\x01\xa4\t\xa5\x02\x02\xa6\x01\xa7\t\xa8\x01\xa9\x04\xaa\x01\xab\x01\xac\x01\xad\x01\xae\x02\x02\xaf\x04\xb0\x01\xb1\x07\xb2\x02\x02\xb3\x01\xb4\x04\xb5\x02\x02\xb6\f\xb7\x1b\xb8\t\xb9\x1b\xba\x01\x00", objArray);
           case 4:
             return EffectCommand.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = EffectCommand.PARSER;
             if (pARSER == null) {
                _monitor_enter(EffectCommand.class);
                pARSER = EffectCommand.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(EffectCommand.DEFAULT_INSTANCE);
                   EffectCommand.PARSER = pARSER;
                }
                _monitor_exit(EffectCommand.class);
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
    public final void ensureCustomInputTextsIsMutable(){
       if (!this.customInputTexts_.isModifiable()) {
          this.customInputTexts_ = GeneratedMessageLite.mutableCopy(this.customInputTexts_);
       }
       return;
    }
    public final void ensureEffectKeysIsMutable(){
       if (!this.effectKeys_.isModifiable()) {
          this.effectKeys_ = GeneratedMessageLite.mutableCopy(this.effectKeys_);
       }
       return;
    }
    public final void ensureFaceDeformSelectionIsMutable(){
       if (!this.faceDeformSelection_.isModifiable()) {
          this.faceDeformSelection_ = GeneratedMessageLite.mutableCopy(this.faceDeformSelection_);
       }
       return;
    }
    public final void ensureMagnifierBorderColorIsMutable(){
       if (!this.magnifierBorderColor_.isModifiable()) {
          this.magnifierBorderColor_ = GeneratedMessageLite.mutableCopy(this.magnifierBorderColor_);
       }
       return;
    }
    public final void ensureMagnifierCanvasSizeIsMutable(){
       if (!this.magnifierCanvasSize_.isModifiable()) {
          this.magnifierCanvasSize_ = GeneratedMessageLite.mutableCopy(this.magnifierCanvasSize_);
       }
       return;
    }
    public final void ensureMakeupResourceIsMutable(){
       if (!this.makeupResource_.isModifiable()) {
          this.makeupResource_ = GeneratedMessageLite.mutableCopy(this.makeupResource_);
       }
       return;
    }
    public final void ensureMoreMediaDataIsMutable(){
       if (!this.moreMediaData_.isModifiable()) {
          this.moreMediaData_ = GeneratedMessageLite.mutableCopy(this.moreMediaData_);
       }
       return;
    }
    public final void ensureMoveMagnifierContentDistanceIsMutable(){
       if (!this.moveMagnifierContentDistance_.isModifiable()) {
          this.moveMagnifierContentDistance_ = GeneratedMessageLite.mutableCopy(this.moveMagnifierContentDistance_);
       }
       return;
    }
    public final void ensureStickersIsMutable(){
       if (!this.stickers_.isModifiable()) {
          this.stickers_ = GeneratedMessageLite.mutableCopy(this.stickers_);
       }
       return;
    }
    public AdjustEffectType getAdjustEffectType(){
       AdjustEffectType uAdjustEffec = AdjustEffectType.forNumber(this.adjustEffectType_);
       if (uAdjustEffec == null) {
          uAdjustEffec = AdjustEffectType.UNRECOGNIZED;
       }
       return uAdjustEffec;
    }
    public int getAdjustEffectTypeValue(){
       return this.adjustEffectType_;
    }
    public float getAideflawIntensity(){
       return this.aideflawIntensity_;
    }
    public float getAieyelidIntensity(){
       return this.aieyelidIntensity_;
    }
    public boolean getAllDeletedWhenResetRecording(){
       return this.allDeletedWhenResetRecording_;
    }
    public AnimojiData getAnimojiData(){
       EffectCommand tanimojiData = this.animojiData_;
       if (tanimojiData == null) {
          tanimojiData = AnimojiData.getDefaultInstance();
       }
       return tanimojiData;
    }
    public float getBasicAdjustIntensity(){
       return this.basicAdjustIntensity_;
    }
    public String getBeautifyGroupPath(){
       return this.beautifyGroupPath_;
    }
    public ByteString getBeautifyGroupPathBytes(){
       return ByteString.copyFromUtf8(this.beautifyGroupPath_);
    }
    public float getBeautifyLipsIntensity(){
       return this.beautifyLipsIntensity_;
    }
    public int getBeautifyPanelStatus(){
       return this.beautifyPanelStatus_;
    }
    public String getBeautifyPreviewPart(){
       return this.beautifyPreviewPart_;
    }
    public ByteString getBeautifyPreviewPartBytes(){
       return ByteString.copyFromUtf8(this.beautifyPreviewPart_);
    }
    public float getBeautifySecondBrightIntensity(){
       return this.beautifySecondBrightIntensity_;
    }
    public float getBeautyAnyIntensity(){
       return this.beautyAnyIntensity_;
    }
    public int getBeautyAnyType(){
       return this.beautyAnyType_;
    }
    public float getBeautyzerooptIntensity(){
       return this.beautyzerooptIntensity_;
    }
    public String getBlendMode(){
       return this.blendMode_;
    }
    public ByteString getBlendModeBytes(){
       return ByteString.copyFromUtf8(this.blendMode_);
    }
    public float getBodySlimmingAdjustIntensity(){
       return this.bodySlimmingAdjustIntensity_;
    }
    public BodySlimmingAdjustType getBodySlimmingAdjustType(){
       BodySlimmingAdjustType uBodySlimmin = BodySlimmingAdjustType.forNumber(this.bodySlimmingAdjustType_);
       if (uBodySlimmin == null) {
          uBodySlimmin = BodySlimmingAdjustType.UNRECOGNIZED;
       }
       return uBodySlimmin;
    }
    public int getBodySlimmingAdjustTypeValue(){
       return this.bodySlimmingAdjustType_;
    }
    public boolean getBodySlimmingGradient(){
       return this.bodySlimmingGradient_;
    }
    public BokehConfig getBokehDepthConfig(){
       EffectCommand tbokehDepthC = this.bokehDepthConfig_;
       if (tbokehDepthC == null) {
          tbokehDepthC = BokehConfig.getDefaultInstance();
       }
       return tbokehDepthC;
    }
    public boolean getBokehDepthEnable(){
       return this.bokehDepthEnable_;
    }
    public boolean getBokehDepthEnableTestMode(){
       return this.bokehDepthEnableTestMode_;
    }
    public float getBokehDepthFocalLength(){
       return this.bokehDepthFocalLength_;
    }
    public Bitmap getBokehDepthMask(){
       EffectCommand tbokehDepthM = this.bokehDepthMask_;
       if (tbokehDepthM == null) {
          tbokehDepthM = Bitmap.getDefaultInstance();
       }
       return tbokehDepthM;
    }
    public BokehQuality getBokehDepthQuality(){
       BokehQuality uBokehQualit = BokehQuality.forNumber(this.bokehDepthQuality_);
       if (uBokehQualit == null) {
          uBokehQualit = BokehQuality.UNRECOGNIZED;
       }
       return uBokehQualit;
    }
    public int getBokehDepthQualityValue(){
       return this.bokehDepthQuality_;
    }
    public float getBokehDepthRadius(){
       return this.bokehDepthRadius_;
    }
    public String getBokehDepthSpotShape(){
       return this.bokehDepthSpotShape_;
    }
    public ByteString getBokehDepthSpotShapeBytes(){
       return ByteString.copyFromUtf8(this.bokehDepthSpotShape_);
    }
    public BokehDepthTouch getBokehDepthTouchPosition(){
       EffectCommand tbokehDepthT = this.bokehDepthTouchPosition_;
       if (tbokehDepthT == null) {
          tbokehDepthT = BokehDepthTouch.getDefaultInstance();
       }
       return tbokehDepthT;
    }
    public BokehType getBokehDepthType(){
       BokehType uBokehType = BokehType.forNumber(this.bokehDepthType_);
       if (uBokehType == null) {
          uBokehType = BokehType.UNRECOGNIZED;
       }
       return uBokehType;
    }
    public int getBokehDepthTypeValue(){
       return this.bokehDepthType_;
    }
    public String getBoomGameJson(){
       return this.boomGameJson_;
    }
    public ByteString getBoomGameJsonBytes(){
       return ByteString.copyFromUtf8(this.boomGameJson_);
    }
    public float getBright(){
       return this.bright_;
    }
    public float getClarityIntensity(){
       return this.clarityIntensity_;
    }
    public int getClientWorkProcess(){
       return this.clientWorkProcess_;
    }
    public ClientWorkProgress getClientWorkProgresses(){
       EffectCommand tclientWorkP = this.clientWorkProgresses_;
       if (tclientWorkP == null) {
          tclientWorkP = ClientWorkProgress.getDefaultInstance();
       }
       return tclientWorkP;
    }
    public String getColoringContent(){
       return this.coloringContent_;
    }
    public ByteString getColoringContentBytes(){
       return ByteString.copyFromUtf8(this.coloringContent_);
    }
    public EffectCommandType getCommandType(){
       EffectCommandType uEffectComma = EffectCommandType.forNumber(this.commandType_);
       if (uEffectComma == null) {
          uEffectComma = EffectCommandType.UNRECOGNIZED;
       }
       return uEffectComma;
    }
    public int getCommandTypeValue(){
       return this.commandType_;
    }
    public CustomInputText getCustomInputTexts(int p0){
       return this.customInputTexts_.get(p0);
    }
    public int getCustomInputTextsCount(){
       return this.customInputTexts_.size();
    }
    public List getCustomInputTextsList(){
       return this.customInputTexts_;
    }
    public CustomInputTextOrBuilder getCustomInputTextsOrBuilder(int p0){
       return this.customInputTexts_.get(p0);
    }
    public List getCustomInputTextsOrBuilderList(){
       return this.customInputTexts_;
    }
    public String getCustomStickerJson(){
       return this.customStickerJson_;
    }
    public ByteString getCustomStickerJsonBytes(){
       return ByteString.copyFromUtf8(this.customStickerJson_);
    }
    public int getCustomTriggerType(){
       return this.customTriggerType_;
    }
    public float getDefinitionIntensity(){
       return this.definitionIntensity_;
    }
    public float getDeformIndensity(){
       return this.deformIndensity_;
    }
    public int getDeformMode(){
       return this.deformMode_;
    }
    public float getEffectIntensity(){
       return this.effectIntensity_;
    }
    public String getEffectKeys(int p0){
       return this.effectKeys_.get(p0);
    }
    public ByteString getEffectKeysBytes(int p0){
       return ByteString.copyFromUtf8(this.effectKeys_.get(p0));
    }
    public int getEffectKeysCount(){
       return this.effectKeys_.size();
    }
    public List getEffectKeysList(){
       return this.effectKeys_;
    }
    public boolean getEnableBigeyeOptimization(){
       return this.enableBigeyeOptimization_;
    }
    public boolean getEnableEnlargeMaxFaceCount(){
       return this.enableEnlargeMaxFaceCount_;
    }
    public boolean getEnableMagicFilter(){
       return this.enableMagicFilter_;
    }
    public boolean getEnableMakeupChildToZero(){
       return this.enableMakeupChildToZero_;
    }
    public boolean getEnableMvLookupFirst(){
       return this.enableMvLookupFirst_;
    }
    public boolean getEnableSmartBeautify(){
       return this.enableSmartBeautify_;
    }
    public boolean getEnableSmartBeauty(){
       return this.enableSmartBeauty_;
    }
    public boolean getEnableUndoWarpEdit(){
       return this.enableUndoWarpEdit_;
    }
    public boolean getEnableUndoWarpPhoto(){
       return this.enableUndoWarpPhoto_;
    }
    public boolean getEnableUndoWarpPhotoRefreshData(){
       return this.enableUndoWarpPhotoRefreshData_;
    }
    public FMPoint getEndPoint(){
       EffectCommand tendPoint_ = this.endPoint_;
       if (tendPoint_ == null) {
          tendPoint_ = FMPoint.getDefaultInstance();
       }
       return tendPoint_;
    }
    public float getEvenSkinIntensity(){
       return this.evenSkinIntensity_;
    }
    public float getEyeBagRemoveIntensity(){
       return this.eyeBagRemoveIntensity_;
    }
    public float getEyeBrightenIntensity(){
       return this.eyeBrightenIntensity_;
    }
    public int getFaceDeformSelection(int p0){
       return this.faceDeformSelection_.getInt(p0);
    }
    public int getFaceDeformSelectionCount(){
       return this.faceDeformSelection_.size();
    }
    public List getFaceDeformSelectionList(){
       return this.faceDeformSelection_;
    }
    public float getFaceShadowIntensity(){
       return this.faceShadowIntensity_;
    }
    public float getFaceTextureIntensity(){
       return this.faceTextureIntensity_;
    }
    public FilterBasicAdjustType getFilterBasicAdjustType(){
       FilterBasicAdjustType uFilterBasic = FilterBasicAdjustType.forNumber(this.filterBasicAdjustType_);
       if (uFilterBasic == null) {
          uFilterBasic = FilterBasicAdjustType.UNRECOGNIZED;
       }
       return uFilterBasic;
    }
    public int getFilterBasicAdjustTypeValue(){
       return this.filterBasicAdjustType_;
    }
    public float getFlashlightIntensity(){
       return this.flashlightIntensity_;
    }
    public GenderUsingType getGenderUsingType(){
       GenderUsingType genderUsingT = GenderUsingType.forNumber(this.genderUsingType_);
       if (genderUsingT == null) {
          genderUsingT = GenderUsingType.UNRECOGNIZED;
       }
       return genderUsingT;
    }
    public int getGenderUsingTypeValue(){
       return this.genderUsingType_;
    }
    public EffectResource getGroupEffect(){
       EffectCommand tgroupEffect = this.groupEffect_;
       if (tgroupEffect == null) {
          tgroupEffect = EffectResource.getDefaultInstance();
       }
       return tgroupEffect;
    }
    public String getGroupName(){
       return this.groupName_;
    }
    public ByteString getGroupNameBytes(){
       return ByteString.copyFromUtf8(this.groupName_);
    }
    public HairClipConfig getHairClipConfig(){
       EffectCommand thairClipCon = this.hairClipConfig_;
       if (thairClipCon == null) {
          thairClipCon = HairClipConfig.getDefaultInstance();
       }
       return thairClipCon;
    }
    public HairDyeingMode getHairDyeingMode(){
       HairDyeingMode hairDyeingMo = HairDyeingMode.forNumber(this.hairDyeingMode_);
       if (hairDyeingMo == null) {
          hairDyeingMo = HairDyeingMode.UNRECOGNIZED;
       }
       return hairDyeingMo;
    }
    public int getHairDyeingModeValue(){
       return this.hairDyeingMode_;
    }
    public boolean getHairSofteningImageMode(){
       return this.hairSofteningImageMode_;
    }
    public float getHairSofteningStrength(){
       return this.hairSofteningStrength_;
    }
    public HumanMattingType getHumanMattingType(){
       HumanMattingType humanMatting = HumanMattingType.forNumber(this.humanMattingType_);
       if (humanMatting == null) {
          humanMatting = HumanMattingType.UNRECOGNIZED;
       }
       return humanMatting;
    }
    public int getHumanMattingTypeValue(){
       return this.humanMattingType_;
    }
    public String getInputText(){
       return this.inputText_;
    }
    public ByteString getInputTextBytes(){
       return ByteString.copyFromUtf8(this.inputText_);
    }
    public int getInputTextIndex(){
       return this.inputTextIndex_;
    }
    public float getIntensityWeight(){
       return this.intensityWeight_;
    }
    public String getIntputTextFont(){
       return this.intputTextFont_;
    }
    public ByteString getIntputTextFontBytes(){
       return ByteString.copyFromUtf8(this.intputTextFont_);
    }
    public boolean getIsActive(){
       return this.isActive_;
    }
    public boolean getIsEditAutoStatus(){
       return this.isEditAutoStatus_;
    }
    public boolean getIsEditFlawAuto(){
       return this.isEditFlawAuto_;
    }
    public boolean getIsEditStatus(){
       return this.isEditStatus_;
    }
    public boolean getIsLivePk360P(){
       return this.isLivePk360P_;
    }
    public boolean getIsMagicRemovelStatus(){
       return this.isMagicRemovelStatus_;
    }
    public boolean getIsMainSticker(){
       return this.isMainSticker_;
    }
    public boolean getIsOpenFlaw(){
       return this.isOpenFlaw_;
    }
    public float getLiquifyIntensity(){
       return this.liquifyIntensity_;
    }
    public float getLiquifyRadius(){
       return this.liquifyRadius_;
    }
    public FMSize getLiquifySize(){
       EffectCommand tliquifySize = this.liquifySize_;
       if (tliquifySize == null) {
          tliquifySize = FMSize.getDefaultInstance();
       }
       return tliquifySize;
    }
    public float getLiquifyStride(){
       return this.liquifyStride_;
    }
    public LiquifyType getLiquifyType(){
       LiquifyType liquifyType = LiquifyType.forNumber(this.liquifyType_);
       if (liquifyType == null) {
          liquifyType = LiquifyType.UNRECOGNIZED;
       }
       return liquifyType;
    }
    public int getLiquifyTypeValue(){
       return this.liquifyType_;
    }
    public boolean getLiquifyistouchbegin(){
       return this.liquifyistouchbegin_;
    }
    public boolean getLiquifyistouchend(){
       return this.liquifyistouchend_;
    }
    public int getLookupDimension(){
       return this.lookupDimension_;
    }
    public float getLookupIntensity(){
       return this.lookupIntensity_;
    }
    public EffectLookupParam getLookupParam(){
       EffectCommand tlookupParam = this.lookupParam_;
       if (tlookupParam == null) {
          tlookupParam = EffectLookupParam.getDefaultInstance();
       }
       return tlookupParam;
    }
    public String getLookupPath(){
       return this.lookupPath_;
    }
    public ByteString getLookupPathBytes(){
       return ByteString.copyFromUtf8(this.lookupPath_);
    }
    public EffectLookupSlideParam getLookupSlideParam(){
       EffectCommand tlookupSlide = this.lookupSlideParam_;
       if (tlookupSlide == null) {
          tlookupSlide = EffectLookupSlideParam.getDefaultInstance();
       }
       return tlookupSlide;
    }
    public int getLookupType(){
       return this.lookupType_;
    }
    public Bitmap getMagicRemovelMask(){
       EffectCommand tmagicRemove = this.magicRemovelMask_;
       if (tmagicRemove == null) {
          tmagicRemove = Bitmap.getDefaultInstance();
       }
       return tmagicRemove;
    }
    public float getMagnifierBorderColor(int p0){
       return this.magnifierBorderColor_.getFloat(p0);
    }
    public int getMagnifierBorderColorCount(){
       return this.magnifierBorderColor_.size();
    }
    public List getMagnifierBorderColorList(){
       return this.magnifierBorderColor_;
    }
    public float getMagnifierBorderRadius(){
       return this.magnifierBorderRadius_;
    }
    public float getMagnifierBorderWidth(){
       return this.magnifierBorderWidth_;
    }
    public float getMagnifierCanvasSize(int p0){
       return this.magnifierCanvasSize_.getFloat(p0);
    }
    public int getMagnifierCanvasSizeCount(){
       return this.magnifierCanvasSize_.size();
    }
    public List getMagnifierCanvasSizeList(){
       return this.magnifierCanvasSize_;
    }
    public float getMagnifierContentScale(){
       return this.magnifierContentScale_;
    }
    public int getMagnifierFaceTrackId(){
       return this.magnifierFaceTrackId_;
    }
    public String getMagnifierShapePath(){
       return this.magnifierShapePath_;
    }
    public ByteString getMagnifierShapePathBytes(){
       return ByteString.copyFromUtf8(this.magnifierShapePath_);
    }
    public float getMakeUpPenBrushIntensity(){
       return this.makeUpPenBrushIntensity_;
    }
    public int getMakeupBackLightMode(){
       return this.makeupBackLightMode_;
    }
    public int getMakeupBlendMode(){
       return this.makeupBlendMode_;
    }
    public MakeupColor getMakeupColor(){
       EffectCommand tmakeupColor = this.makeupColor_;
       if (tmakeupColor == null) {
          tmakeupColor = MakeupColor.getDefaultInstance();
       }
       return tmakeupColor;
    }
    public float getMakeupIntensity(){
       return this.makeupIntensity_;
    }
    public String getMakeupMode(){
       return this.makeupMode_;
    }
    public ByteString getMakeupModeBytes(){
       return ByteString.copyFromUtf8(this.makeupMode_);
    }
    public EffectColor getMakeupPenBrushColor(){
       EffectCommand tmakeupPenBr = this.makeupPenBrushColor_;
       if (tmakeupPenBr == null) {
          tmakeupPenBr = EffectColor.getDefaultInstance();
       }
       return tmakeupPenBr;
    }
    public float getMakeupPenBrushHardness(){
       return this.makeupPenBrushHardness_;
    }
    public String getMakeupPenBrushTexturePath(){
       return this.makeupPenBrushTexturePath_;
    }
    public ByteString getMakeupPenBrushTexturePathBytes(){
       return ByteString.copyFromUtf8(this.makeupPenBrushTexturePath_);
    }
    public EffectMakeupPenBrushType getMakeupPenBrushType(){
       EffectMakeupPenBrushType uEffectMakeu = EffectMakeupPenBrushType.forNumber(this.makeupPenBrushType_);
       if (uEffectMakeu == null) {
          uEffectMakeu = EffectMakeupPenBrushType.UNRECOGNIZED;
       }
       return uEffectMakeu;
    }
    public int getMakeupPenBrushTypeValue(){
       return this.makeupPenBrushType_;
    }
    public EffectColor getMakeupPenEraserColor(){
       EffectCommand tmakeupPenEr = this.makeupPenEraserColor_;
       if (tmakeupPenEr == null) {
          tmakeupPenEr = EffectColor.getDefaultInstance();
       }
       return tmakeupPenEr;
    }
    public float getMakeupPenEraserLiveTime(){
       return this.makeupPenEraserLiveTime_;
    }
    public String getMakeupPenHighLightTexturePath(){
       return this.makeupPenHighLightTexturePath_;
    }
    public ByteString getMakeupPenHighLightTexturePathBytes(){
       return ByteString.copyFromUtf8(this.makeupPenHighLightTexturePath_);
    }
    public boolean getMakeupPenIsEraser(){
       return this.makeupPenIsEraser_;
    }
    public float getMakeupPenPointSize(){
       return this.makeupPenPointSize_;
    }
    public float getMakeupPenPointStride(){
       return this.makeupPenPointStride_;
    }
    public MakeupPenTouch getMakeupPenTouch(){
       EffectCommand tmakeupPenTo = this.makeupPenTouch_;
       if (tmakeupPenTo == null) {
          tmakeupPenTo = MakeupPenTouch.getDefaultInstance();
       }
       return tmakeupPenTo;
    }
    public MakeupResource getMakeupResource(int p0){
       return this.makeupResource_.get(p0);
    }
    public int getMakeupResourceCount(){
       return this.makeupResource_.size();
    }
    public List getMakeupResourceList(){
       return this.makeupResource_;
    }
    public MakeupResourceOrBuilder getMakeupResourceOrBuilder(int p0){
       return this.makeupResource_.get(p0);
    }
    public List getMakeupResourceOrBuilderList(){
       return this.makeupResource_;
    }
    public boolean getMemojiEnableEditMode(){
       return this.memojiEnableEditMode_;
    }
    public String getMemojiGroup(){
       return this.memojiGroup_;
    }
    public ByteString getMemojiGroupBytes(){
       return ByteString.copyFromUtf8(this.memojiGroup_);
    }
    public int getMemojiIconHeight(){
       return this.memojiIconHeight_;
    }
    public int getMemojiIconWidth(){
       return this.memojiIconWidth_;
    }
    public String getMemojiStyle(){
       return this.memojiStyle_;
    }
    public ByteString getMemojiStyleBytes(){
       return ByteString.copyFromUtf8(this.memojiStyle_);
    }
    public String getMemojiUserConfigJson(){
       return this.memojiUserConfigJson_;
    }
    public ByteString getMemojiUserConfigJsonBytes(){
       return ByteString.copyFromUtf8(this.memojiUserConfigJson_);
    }
    public PickingMediaData getMoreMediaData(int p0){
       return this.moreMediaData_.get(p0);
    }
    public int getMoreMediaDataCount(){
       return this.moreMediaData_.size();
    }
    public List getMoreMediaDataList(){
       return this.moreMediaData_;
    }
    public PickingMediaDataOrBuilder getMoreMediaDataOrBuilder(int p0){
       return this.moreMediaData_.get(p0);
    }
    public List getMoreMediaDataOrBuilderList(){
       return this.moreMediaData_;
    }
    public float getMoveMagnifierContentDistance(int p0){
       return this.moveMagnifierContentDistance_.getFloat(p0);
    }
    public int getMoveMagnifierContentDistanceCount(){
       return this.moveMagnifierContentDistance_.size();
    }
    public List getMoveMagnifierContentDistanceList(){
       return this.moveMagnifierContentDistance_;
    }
    public String getMusicWavePath(){
       return this.musicWavePath_;
    }
    public ByteString getMusicWavePathBytes(){
       return ByteString.copyFromUtf8(this.musicWavePath_);
    }
    public float getMusicWaveTime(){
       return this.musicWaveTime_;
    }
    public int getNEditFlawUndoNums(){
       return this.nEditFlawUndoNums_;
    }
    public int getNMagicRemovelUndoNums(){
       return this.nMagicRemovelUndoNums_;
    }
    public boolean getNeedMakeupClearOldResource(){
       return this.needMakeupClearOldResource_;
    }
    public float getNoseShadowIntensity(){
       return this.noseShadowIntensity_;
    }
    public float getOilfreeIntensity(){
       return this.oilfreeIntensity_;
    }
    public String getOilpaintSourcePath(){
       return this.oilpaintSourcePath_;
    }
    public ByteString getOilpaintSourcePathBytes(){
       return ByteString.copyFromUtf8(this.oilpaintSourcePath_);
    }
    public String getPassThroughParams(){
       return this.passThroughParams_;
    }
    public ByteString getPassThroughParamsBytes(){
       return ByteString.copyFromUtf8(this.passThroughParams_);
    }
    public String getPickingMediaPath(){
       return this.pickingMediaPath_;
    }
    public ByteString getPickingMediaPathBytes(){
       return ByteString.copyFromUtf8(this.pickingMediaPath_);
    }
    public PickingMediaResType getPickingMediaType(){
       PickingMediaResType pickingMedia = PickingMediaResType.forNumber(this.pickingMediaType_);
       if (pickingMedia == null) {
          pickingMedia = PickingMediaResType.UNRECOGNIZED;
       }
       return pickingMedia;
    }
    public int getPickingMediaTypeValue(){
       return this.pickingMediaType_;
    }
    public float getPlayrate(){
       return this.playrate_;
    }
    public RelightingConfig getRelightingConfig(){
       EffectCommand trelightingC = this.relightingConfig_;
       if (trelightingC == null) {
          trelightingC = RelightingConfig.getDefaultInstance();
       }
       return trelightingC;
    }
    public SafeUIArea getSafeUiArea(){
       EffectCommand tsafeUiArea_ = this.safeUiArea_;
       if (tsafeUiArea_ == null) {
          tsafeUiArea_ = SafeUIArea.getDefaultInstance();
       }
       return tsafeUiArea_;
    }
    public float getSeekPoint(){
       return this.seekPoint_;
    }
    public PickingMediaResType getServerMediaType(){
       PickingMediaResType pickingMedia = PickingMediaResType.forNumber(this.serverMediaType_);
       if (pickingMedia == null) {
          pickingMedia = PickingMediaResType.UNRECOGNIZED;
       }
       return pickingMedia;
    }
    public int getServerMediaTypeValue(){
       return this.serverMediaType_;
    }
    public String getServerResultPath(){
       return this.serverResultPath_;
    }
    public ByteString getServerResultPathBytes(){
       return ByteString.copyFromUtf8(this.serverResultPath_);
    }
    public EditFlawConfig getSetEditFlawParams(){
       EffectCommand tsetEditFlaw = this.setEditFlawParams_;
       if (tsetEditFlaw == null) {
          tsetEditFlaw = EditFlawConfig.getDefaultInstance();
       }
       return tsetEditFlaw;
    }
    public boolean getSetFaceSegForBeauty(){
       return this.setFaceSegForBeauty_;
    }
    public boolean getShouldUseFacemask(){
       return this.shouldUseFacemask_;
    }
    public boolean getShouldUseGender(){
       return this.shouldUseGender_;
    }
    public boolean getShouldUseLandmarksmask(){
       return this.shouldUseLandmarksmask_;
    }
    public boolean getSlideEndWithNewEffect(){
       return this.slideEndWithNewEffect_;
    }
    public float getSlideNewEffectDisplayLeft(){
       return this.slideNewEffectDisplayLeft_;
    }
    public float getSlideNewEffectDisplayRight(){
       return this.slideNewEffectDisplayRight_;
    }
    public float getSmartBeautyIntensity(){
       return this.smartBeautyIntensity_;
    }
    public float getSoften(){
       return this.soften_;
    }
    public FMPoint getStartPoint(){
       EffectCommand tstartPoint_ = this.startPoint_;
       if (tstartPoint_ == null) {
          tstartPoint_ = FMPoint.getDefaultInstance();
       }
       return tstartPoint_;
    }
    public StickerInfo getSticker(){
       EffectCommand tsticker_ = this.sticker_;
       if (tsticker_ == null) {
          tsticker_ = StickerInfo.getDefaultInstance();
       }
       return tsticker_;
    }
    public boolean getStickerEnable(){
       return this.stickerEnable_;
    }
    public boolean getStickerIntensityWeightActive(){
       return this.stickerIntensityWeightActive_;
    }
    public boolean getStickerMainEnable(){
       return this.stickerMainEnable_;
    }
    public StickerInfo getStickers(int p0){
       return this.stickers_.get(p0);
    }
    public int getStickersCount(){
       return this.stickers_.size();
    }
    public List getStickersList(){
       return this.stickers_;
    }
    public StickerInfoOrBuilder getStickersOrBuilder(int p0){
       return this.stickers_.get(p0);
    }
    public List getStickersOrBuilderList(){
       return this.stickers_;
    }
    public String getSwapFaceImagePath(){
       return this.swapFaceImagePath_;
    }
    public ByteString getSwapFaceImagePathBytes(){
       return ByteString.copyFromUtf8(this.swapFaceImagePath_);
    }
    public float getTeethBrightenIntensity(){
       return this.teethBrightenIntensity_;
    }
    public float getThermageIntensity(){
       return this.thermageIntensity_;
    }
    public FMTimeStamp getTimestamp(){
       EffectCommand ttimestamp_ = this.timestamp_;
       if (ttimestamp_ == null) {
          ttimestamp_ = FMTimeStamp.getDefaultInstance();
       }
       return ttimestamp_;
    }
    public String getTriggerInputText(){
       return this.triggerInputText_;
    }
    public ByteString getTriggerInputTextBytes(){
       return ByteString.copyFromUtf8(this.triggerInputText_);
    }
    public int getTriggerInputTextIndex(){
       return this.triggerInputTextIndex_;
    }
    public boolean getUseLowPowerSensor(){
       return this.useLowPowerSensor_;
    }
    public boolean getUseMaleMakeup(){
       return this.useMaleMakeup_;
    }
    public boolean getUseSkinAndHairSegModel(){
       return this.useSkinAndHairSegModel_;
    }
    public String getUserLocation(){
       return this.userLocation_;
    }
    public ByteString getUserLocationBytes(){
       return ByteString.copyFromUtf8(this.userLocation_);
    }
    public int getVideoLength(){
       return this.videoLength_;
    }
    public float getWaterSkinIntensity(){
       return this.waterSkinIntensity_;
    }
    public int getWeakenMakeupIntensityProp(){
       return this.weakenMakeupIntensityProp_;
    }
    public String getWhiteSkinConfig(){
       return this.whiteSkinConfig_;
    }
    public ByteString getWhiteSkinConfigBytes(){
       return ByteString.copyFromUtf8(this.whiteSkinConfig_);
    }
    public float getWhiteSkinIntensity(){
       return this.whiteSkinIntensity_;
    }
    public float getWocanIntensity(){
       return this.wocanIntensity_;
    }
    public float getWrinkleRemoveIntensity(){
       return this.wrinkleRemoveIntensity_;
    }
    public boolean hasAnimojiData(){
       boolean b = (this.animojiData_ != null)? true: false;
       return b;
    }
    public boolean hasBokehDepthConfig(){
       boolean b = (this.bokehDepthConfig_ != null)? true: false;
       return b;
    }
    public boolean hasBokehDepthMask(){
       boolean b = (this.bokehDepthMask_ != null)? true: false;
       return b;
    }
    public boolean hasBokehDepthTouchPosition(){
       boolean b = (this.bokehDepthTouchPosition_ != null)? true: false;
       return b;
    }
    public boolean hasClientWorkProgresses(){
       boolean b = (this.clientWorkProgresses_ != null)? true: false;
       return b;
    }
    public boolean hasEndPoint(){
       boolean b = (this.endPoint_ != null)? true: false;
       return b;
    }
    public boolean hasGroupEffect(){
       boolean b = (this.groupEffect_ != null)? true: false;
       return b;
    }
    public boolean hasHairClipConfig(){
       boolean b = (this.hairClipConfig_ != null)? true: false;
       return b;
    }
    public boolean hasLiquifySize(){
       boolean b = (this.liquifySize_ != null)? true: false;
       return b;
    }
    public boolean hasLookupParam(){
       boolean b = (this.lookupParam_ != null)? true: false;
       return b;
    }
    public boolean hasLookupSlideParam(){
       boolean b = (this.lookupSlideParam_ != null)? true: false;
       return b;
    }
    public boolean hasMagicRemovelMask(){
       boolean b = (this.magicRemovelMask_ != null)? true: false;
       return b;
    }
    public boolean hasMakeupColor(){
       boolean b = (this.makeupColor_ != null)? true: false;
       return b;
    }
    public boolean hasMakeupPenBrushColor(){
       boolean b = (this.makeupPenBrushColor_ != null)? true: false;
       return b;
    }
    public boolean hasMakeupPenEraserColor(){
       boolean b = (this.makeupPenEraserColor_ != null)? true: false;
       return b;
    }
    public boolean hasMakeupPenTouch(){
       boolean b = (this.makeupPenTouch_ != null)? true: false;
       return b;
    }
    public boolean hasRelightingConfig(){
       boolean b = (this.relightingConfig_ != null)? true: false;
       return b;
    }
    public boolean hasSafeUiArea(){
       boolean b = (this.safeUiArea_ != null)? true: false;
       return b;
    }
    public boolean hasSetEditFlawParams(){
       boolean b = (this.setEditFlawParams_ != null)? true: false;
       return b;
    }
    public boolean hasStartPoint(){
       boolean b = (this.startPoint_ != null)? true: false;
       return b;
    }
    public boolean hasSticker(){
       boolean b = (this.sticker_ != null)? true: false;
       return b;
    }
    public boolean hasTimestamp(){
       boolean b = (this.timestamp_ != null)? true: false;
       return b;
    }
    public void mergeAnimojiData(AnimojiData p0){
       Objects.requireNonNull(p0);
       EffectCommand tanimojiData = this.animojiData_;
       this.animojiData_ = (tanimojiData != null && tanimojiData != AnimojiData.getDefaultInstance())? AnimojiData.newBuilder(this.animojiData_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeBokehDepthConfig(BokehConfig p0){
       Objects.requireNonNull(p0);
       EffectCommand tbokehDepthC = this.bokehDepthConfig_;
       this.bokehDepthConfig_ = (tbokehDepthC != null && tbokehDepthC != BokehConfig.getDefaultInstance())? BokehConfig.newBuilder(this.bokehDepthConfig_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeBokehDepthMask(Bitmap p0){
       Objects.requireNonNull(p0);
       EffectCommand tbokehDepthM = this.bokehDepthMask_;
       this.bokehDepthMask_ = (tbokehDepthM != null && tbokehDepthM != Bitmap.getDefaultInstance())? Bitmap.newBuilder(this.bokehDepthMask_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeBokehDepthTouchPosition(BokehDepthTouch p0){
       Objects.requireNonNull(p0);
       EffectCommand tbokehDepthT = this.bokehDepthTouchPosition_;
       this.bokehDepthTouchPosition_ = (tbokehDepthT != null && tbokehDepthT != BokehDepthTouch.getDefaultInstance())? BokehDepthTouch.newBuilder(this.bokehDepthTouchPosition_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeClientWorkProgresses(ClientWorkProgress p0){
       Objects.requireNonNull(p0);
       EffectCommand tclientWorkP = this.clientWorkProgresses_;
       this.clientWorkProgresses_ = (tclientWorkP != null && tclientWorkP != ClientWorkProgress.getDefaultInstance())? ClientWorkProgress.newBuilder(this.clientWorkProgresses_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeEndPoint(FMPoint p0){
       Objects.requireNonNull(p0);
       EffectCommand tendPoint_ = this.endPoint_;
       this.endPoint_ = (tendPoint_ != null && tendPoint_ != FMPoint.getDefaultInstance())? FMPoint.newBuilder(this.endPoint_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeGroupEffect(EffectResource p0){
       Objects.requireNonNull(p0);
       EffectCommand tgroupEffect = this.groupEffect_;
       this.groupEffect_ = (tgroupEffect != null && tgroupEffect != EffectResource.getDefaultInstance())? EffectResource.newBuilder(this.groupEffect_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeHairClipConfig(HairClipConfig p0){
       Objects.requireNonNull(p0);
       EffectCommand thairClipCon = this.hairClipConfig_;
       this.hairClipConfig_ = (thairClipCon != null && thairClipCon != HairClipConfig.getDefaultInstance())? HairClipConfig.newBuilder(this.hairClipConfig_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeLiquifySize(FMSize p0){
       Objects.requireNonNull(p0);
       EffectCommand tliquifySize = this.liquifySize_;
       this.liquifySize_ = (tliquifySize != null && tliquifySize != FMSize.getDefaultInstance())? FMSize.newBuilder(this.liquifySize_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeLookupParam(EffectLookupParam p0){
       Objects.requireNonNull(p0);
       EffectCommand tlookupParam = this.lookupParam_;
       this.lookupParam_ = (tlookupParam != null && tlookupParam != EffectLookupParam.getDefaultInstance())? EffectLookupParam.newBuilder(this.lookupParam_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeLookupSlideParam(EffectLookupSlideParam p0){
       Objects.requireNonNull(p0);
       EffectCommand tlookupSlide = this.lookupSlideParam_;
       this.lookupSlideParam_ = (tlookupSlide != null && tlookupSlide != EffectLookupSlideParam.getDefaultInstance())? EffectLookupSlideParam.newBuilder(this.lookupSlideParam_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeMagicRemovelMask(Bitmap p0){
       Objects.requireNonNull(p0);
       EffectCommand tmagicRemove = this.magicRemovelMask_;
       this.magicRemovelMask_ = (tmagicRemove != null && tmagicRemove != Bitmap.getDefaultInstance())? Bitmap.newBuilder(this.magicRemovelMask_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeMakeupColor(MakeupColor p0){
       Objects.requireNonNull(p0);
       EffectCommand tmakeupColor = this.makeupColor_;
       this.makeupColor_ = (tmakeupColor != null && tmakeupColor != MakeupColor.getDefaultInstance())? MakeupColor.newBuilder(this.makeupColor_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeMakeupPenBrushColor(EffectColor p0){
       Objects.requireNonNull(p0);
       EffectCommand tmakeupPenBr = this.makeupPenBrushColor_;
       this.makeupPenBrushColor_ = (tmakeupPenBr != null && tmakeupPenBr != EffectColor.getDefaultInstance())? EffectColor.newBuilder(this.makeupPenBrushColor_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeMakeupPenEraserColor(EffectColor p0){
       Objects.requireNonNull(p0);
       EffectCommand tmakeupPenEr = this.makeupPenEraserColor_;
       this.makeupPenEraserColor_ = (tmakeupPenEr != null && tmakeupPenEr != EffectColor.getDefaultInstance())? EffectColor.newBuilder(this.makeupPenEraserColor_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeMakeupPenTouch(MakeupPenTouch p0){
       Objects.requireNonNull(p0);
       EffectCommand tmakeupPenTo = this.makeupPenTouch_;
       this.makeupPenTouch_ = (tmakeupPenTo != null && tmakeupPenTo != MakeupPenTouch.getDefaultInstance())? MakeupPenTouch.newBuilder(this.makeupPenTouch_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeRelightingConfig(RelightingConfig p0){
       Objects.requireNonNull(p0);
       EffectCommand trelightingC = this.relightingConfig_;
       this.relightingConfig_ = (trelightingC != null && trelightingC != RelightingConfig.getDefaultInstance())? RelightingConfig.newBuilder(this.relightingConfig_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeSafeUiArea(SafeUIArea p0){
       Objects.requireNonNull(p0);
       EffectCommand tsafeUiArea_ = this.safeUiArea_;
       this.safeUiArea_ = (tsafeUiArea_ != null && tsafeUiArea_ != SafeUIArea.getDefaultInstance())? SafeUIArea.newBuilder(this.safeUiArea_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeSetEditFlawParams(EditFlawConfig p0){
       Objects.requireNonNull(p0);
       EffectCommand tsetEditFlaw = this.setEditFlawParams_;
       this.setEditFlawParams_ = (tsetEditFlaw != null && tsetEditFlaw != EditFlawConfig.getDefaultInstance())? EditFlawConfig.newBuilder(this.setEditFlawParams_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeStartPoint(FMPoint p0){
       Objects.requireNonNull(p0);
       EffectCommand tstartPoint_ = this.startPoint_;
       this.startPoint_ = (tstartPoint_ != null && tstartPoint_ != FMPoint.getDefaultInstance())? FMPoint.newBuilder(this.startPoint_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeSticker(StickerInfo p0){
       Objects.requireNonNull(p0);
       EffectCommand tsticker_ = this.sticker_;
       this.sticker_ = (tsticker_ != null && tsticker_ != StickerInfo.getDefaultInstance())? StickerInfo.newBuilder(this.sticker_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void mergeTimestamp(FMTimeStamp p0){
       Objects.requireNonNull(p0);
       EffectCommand ttimestamp_ = this.timestamp_;
       this.timestamp_ = (ttimestamp_ != null && ttimestamp_ != FMTimeStamp.getDefaultInstance())? FMTimeStamp.newBuilder(this.timestamp_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public void removeCustomInputTexts(int p0){
       this.ensureCustomInputTextsIsMutable();
       this.customInputTexts_.remove(p0);
    }
    public void removeMakeupResource(int p0){
       this.ensureMakeupResourceIsMutable();
       this.makeupResource_.remove(p0);
    }
    public void removeMoreMediaData(int p0){
       this.ensureMoreMediaDataIsMutable();
       this.moreMediaData_.remove(p0);
    }
    public void removeStickers(int p0){
       this.ensureStickersIsMutable();
       this.stickers_.remove(p0);
    }
    public void setAdjustEffectType(AdjustEffectType p0){
       Objects.requireNonNull(p0);
       this.adjustEffectType_ = p0.getNumber();
    }
    public void setAdjustEffectTypeValue(int p0){
       this.adjustEffectType_ = p0;
    }
    public void setAideflawIntensity(float p0){
       this.aideflawIntensity_ = p0;
    }
    public void setAieyelidIntensity(float p0){
       this.aieyelidIntensity_ = p0;
    }
    public void setAllDeletedWhenResetRecording(boolean p0){
       this.allDeletedWhenResetRecording_ = p0;
    }
    public void setAnimojiData(AnimojiData$Builder p0){
       this.animojiData_ = p0.build();
    }
    public void setAnimojiData(AnimojiData p0){
       Objects.requireNonNull(p0);
       this.animojiData_ = p0;
    }
    public void setBasicAdjustIntensity(float p0){
       this.basicAdjustIntensity_ = p0;
    }
    public void setBeautifyGroupPath(String p0){
       Objects.requireNonNull(p0);
       this.beautifyGroupPath_ = p0;
    }
    public void setBeautifyGroupPathBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.beautifyGroupPath_ = p0.toStringUtf8();
    }
    public void setBeautifyLipsIntensity(float p0){
       this.beautifyLipsIntensity_ = p0;
    }
    public void setBeautifyPanelStatus(int p0){
       this.beautifyPanelStatus_ = p0;
    }
    public void setBeautifyPreviewPart(String p0){
       Objects.requireNonNull(p0);
       this.beautifyPreviewPart_ = p0;
    }
    public void setBeautifyPreviewPartBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.beautifyPreviewPart_ = p0.toStringUtf8();
    }
    public void setBeautifySecondBrightIntensity(float p0){
       this.beautifySecondBrightIntensity_ = p0;
    }
    public void setBeautyAnyIntensity(float p0){
       this.beautyAnyIntensity_ = p0;
    }
    public void setBeautyAnyType(int p0){
       this.beautyAnyType_ = p0;
    }
    public void setBeautyzerooptIntensity(float p0){
       this.beautyzerooptIntensity_ = p0;
    }
    public void setBlendMode(String p0){
       Objects.requireNonNull(p0);
       this.blendMode_ = p0;
    }
    public void setBlendModeBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.blendMode_ = p0.toStringUtf8();
    }
    public void setBodySlimmingAdjustIntensity(float p0){
       this.bodySlimmingAdjustIntensity_ = p0;
    }
    public void setBodySlimmingAdjustType(BodySlimmingAdjustType p0){
       Objects.requireNonNull(p0);
       this.bodySlimmingAdjustType_ = p0.getNumber();
    }
    public void setBodySlimmingAdjustTypeValue(int p0){
       this.bodySlimmingAdjustType_ = p0;
    }
    public void setBodySlimmingGradient(boolean p0){
       this.bodySlimmingGradient_ = p0;
    }
    public void setBokehDepthConfig(BokehConfig$Builder p0){
       this.bokehDepthConfig_ = p0.build();
    }
    public void setBokehDepthConfig(BokehConfig p0){
       Objects.requireNonNull(p0);
       this.bokehDepthConfig_ = p0;
    }
    public void setBokehDepthEnable(boolean p0){
       this.bokehDepthEnable_ = p0;
    }
    public void setBokehDepthEnableTestMode(boolean p0){
       this.bokehDepthEnableTestMode_ = p0;
    }
    public void setBokehDepthFocalLength(float p0){
       this.bokehDepthFocalLength_ = p0;
    }
    public void setBokehDepthMask(Bitmap$Builder p0){
       this.bokehDepthMask_ = p0.build();
    }
    public void setBokehDepthMask(Bitmap p0){
       Objects.requireNonNull(p0);
       this.bokehDepthMask_ = p0;
    }
    public void setBokehDepthQuality(BokehQuality p0){
       Objects.requireNonNull(p0);
       this.bokehDepthQuality_ = p0.getNumber();
    }
    public void setBokehDepthQualityValue(int p0){
       this.bokehDepthQuality_ = p0;
    }
    public void setBokehDepthRadius(float p0){
       this.bokehDepthRadius_ = p0;
    }
    public void setBokehDepthSpotShape(String p0){
       Objects.requireNonNull(p0);
       this.bokehDepthSpotShape_ = p0;
    }
    public void setBokehDepthSpotShapeBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.bokehDepthSpotShape_ = p0.toStringUtf8();
    }
    public void setBokehDepthTouchPosition(BokehDepthTouch$Builder p0){
       this.bokehDepthTouchPosition_ = p0.build();
    }
    public void setBokehDepthTouchPosition(BokehDepthTouch p0){
       Objects.requireNonNull(p0);
       this.bokehDepthTouchPosition_ = p0;
    }
    public void setBokehDepthType(BokehType p0){
       Objects.requireNonNull(p0);
       this.bokehDepthType_ = p0.getNumber();
    }
    public void setBokehDepthTypeValue(int p0){
       this.bokehDepthType_ = p0;
    }
    public void setBoomGameJson(String p0){
       Objects.requireNonNull(p0);
       this.boomGameJson_ = p0;
    }
    public void setBoomGameJsonBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.boomGameJson_ = p0.toStringUtf8();
    }
    public void setBright(float p0){
       this.bright_ = p0;
    }
    public void setClarityIntensity(float p0){
       this.clarityIntensity_ = p0;
    }
    public void setClientWorkProcess(int p0){
       this.clientWorkProcess_ = p0;
    }
    public void setClientWorkProgresses(ClientWorkProgress$Builder p0){
       this.clientWorkProgresses_ = p0.build();
    }
    public void setClientWorkProgresses(ClientWorkProgress p0){
       Objects.requireNonNull(p0);
       this.clientWorkProgresses_ = p0;
    }
    public void setColoringContent(String p0){
       Objects.requireNonNull(p0);
       this.coloringContent_ = p0;
    }
    public void setColoringContentBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.coloringContent_ = p0.toStringUtf8();
    }
    public void setCommandType(EffectCommandType p0){
       Objects.requireNonNull(p0);
       this.commandType_ = p0.getNumber();
    }
    public void setCommandTypeValue(int p0){
       this.commandType_ = p0;
    }
    public void setCustomInputTexts(int p0,CustomInputText$Builder p1){
       this.ensureCustomInputTextsIsMutable();
       this.customInputTexts_.set(p0, p1.build());
    }
    public void setCustomInputTexts(int p0,CustomInputText p1){
       Objects.requireNonNull(p1);
       this.ensureCustomInputTextsIsMutable();
       this.customInputTexts_.set(p0, p1);
    }
    public void setCustomStickerJson(String p0){
       Objects.requireNonNull(p0);
       this.customStickerJson_ = p0;
    }
    public void setCustomStickerJsonBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.customStickerJson_ = p0.toStringUtf8();
    }
    public void setCustomTriggerType(int p0){
       this.customTriggerType_ = p0;
    }
    public void setDefinitionIntensity(float p0){
       this.definitionIntensity_ = p0;
    }
    public void setDeformIndensity(float p0){
       this.deformIndensity_ = p0;
    }
    public void setDeformMode(int p0){
       this.deformMode_ = p0;
    }
    public void setEffectIntensity(float p0){
       this.effectIntensity_ = p0;
    }
    public void setEffectKeys(int p0,String p1){
       Objects.requireNonNull(p1);
       this.ensureEffectKeysIsMutable();
       this.effectKeys_.set(p0, p1);
    }
    public void setEnableBigeyeOptimization(boolean p0){
       this.enableBigeyeOptimization_ = p0;
    }
    public void setEnableEnlargeMaxFaceCount(boolean p0){
       this.enableEnlargeMaxFaceCount_ = p0;
    }
    public void setEnableMagicFilter(boolean p0){
       this.enableMagicFilter_ = p0;
    }
    public void setEnableMakeupChildToZero(boolean p0){
       this.enableMakeupChildToZero_ = p0;
    }
    public void setEnableMvLookupFirst(boolean p0){
       this.enableMvLookupFirst_ = p0;
    }
    public void setEnableSmartBeautify(boolean p0){
       this.enableSmartBeautify_ = p0;
    }
    public void setEnableSmartBeauty(boolean p0){
       this.enableSmartBeauty_ = p0;
    }
    public void setEnableUndoWarpEdit(boolean p0){
       this.enableUndoWarpEdit_ = p0;
    }
    public void setEnableUndoWarpPhoto(boolean p0){
       this.enableUndoWarpPhoto_ = p0;
    }
    public void setEnableUndoWarpPhotoRefreshData(boolean p0){
       this.enableUndoWarpPhotoRefreshData_ = p0;
    }
    public void setEndPoint(FMPoint$Builder p0){
       this.endPoint_ = p0.build();
    }
    public void setEndPoint(FMPoint p0){
       Objects.requireNonNull(p0);
       this.endPoint_ = p0;
    }
    public void setEvenSkinIntensity(float p0){
       this.evenSkinIntensity_ = p0;
    }
    public void setEyeBagRemoveIntensity(float p0){
       this.eyeBagRemoveIntensity_ = p0;
    }
    public void setEyeBrightenIntensity(float p0){
       this.eyeBrightenIntensity_ = p0;
    }
    public void setFaceDeformSelection(int p0,int p1){
       this.ensureFaceDeformSelectionIsMutable();
       this.faceDeformSelection_.setInt(p0, p1);
    }
    public void setFaceShadowIntensity(float p0){
       this.faceShadowIntensity_ = p0;
    }
    public void setFaceTextureIntensity(float p0){
       this.faceTextureIntensity_ = p0;
    }
    public void setFilterBasicAdjustType(FilterBasicAdjustType p0){
       Objects.requireNonNull(p0);
       this.filterBasicAdjustType_ = p0.getNumber();
    }
    public void setFilterBasicAdjustTypeValue(int p0){
       this.filterBasicAdjustType_ = p0;
    }
    public void setFlashlightIntensity(float p0){
       this.flashlightIntensity_ = p0;
    }
    public void setGenderUsingType(GenderUsingType p0){
       Objects.requireNonNull(p0);
       this.genderUsingType_ = p0.getNumber();
    }
    public void setGenderUsingTypeValue(int p0){
       this.genderUsingType_ = p0;
    }
    public void setGroupEffect(EffectResource$Builder p0){
       this.groupEffect_ = p0.build();
    }
    public void setGroupEffect(EffectResource p0){
       Objects.requireNonNull(p0);
       this.groupEffect_ = p0;
    }
    public void setGroupName(String p0){
       Objects.requireNonNull(p0);
       this.groupName_ = p0;
    }
    public void setGroupNameBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.groupName_ = p0.toStringUtf8();
    }
    public void setHairClipConfig(HairClipConfig$Builder p0){
       this.hairClipConfig_ = p0.build();
    }
    public void setHairClipConfig(HairClipConfig p0){
       Objects.requireNonNull(p0);
       this.hairClipConfig_ = p0;
    }
    public void setHairDyeingMode(HairDyeingMode p0){
       Objects.requireNonNull(p0);
       this.hairDyeingMode_ = p0.getNumber();
    }
    public void setHairDyeingModeValue(int p0){
       this.hairDyeingMode_ = p0;
    }
    public void setHairSofteningImageMode(boolean p0){
       this.hairSofteningImageMode_ = p0;
    }
    public void setHairSofteningStrength(float p0){
       this.hairSofteningStrength_ = p0;
    }
    public void setHumanMattingType(HumanMattingType p0){
       Objects.requireNonNull(p0);
       this.humanMattingType_ = p0.getNumber();
    }
    public void setHumanMattingTypeValue(int p0){
       this.humanMattingType_ = p0;
    }
    public void setInputText(String p0){
       Objects.requireNonNull(p0);
       this.inputText_ = p0;
    }
    public void setInputTextBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.inputText_ = p0.toStringUtf8();
    }
    public void setInputTextIndex(int p0){
       this.inputTextIndex_ = p0;
    }
    public void setIntensityWeight(float p0){
       this.intensityWeight_ = p0;
    }
    public void setIntputTextFont(String p0){
       Objects.requireNonNull(p0);
       this.intputTextFont_ = p0;
    }
    public void setIntputTextFontBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.intputTextFont_ = p0.toStringUtf8();
    }
    public void setIsActive(boolean p0){
       this.isActive_ = p0;
    }
    public void setIsEditAutoStatus(boolean p0){
       this.isEditAutoStatus_ = p0;
    }
    public void setIsEditFlawAuto(boolean p0){
       this.isEditFlawAuto_ = p0;
    }
    public void setIsEditStatus(boolean p0){
       this.isEditStatus_ = p0;
    }
    public void setIsLivePk360P(boolean p0){
       this.isLivePk360P_ = p0;
    }
    public void setIsMagicRemovelStatus(boolean p0){
       this.isMagicRemovelStatus_ = p0;
    }
    public void setIsMainSticker(boolean p0){
       this.isMainSticker_ = p0;
    }
    public void setIsOpenFlaw(boolean p0){
       this.isOpenFlaw_ = p0;
    }
    public void setLiquifyIntensity(float p0){
       this.liquifyIntensity_ = p0;
    }
    public void setLiquifyRadius(float p0){
       this.liquifyRadius_ = p0;
    }
    public void setLiquifySize(FMSize$Builder p0){
       this.liquifySize_ = p0.build();
    }
    public void setLiquifySize(FMSize p0){
       Objects.requireNonNull(p0);
       this.liquifySize_ = p0;
    }
    public void setLiquifyStride(float p0){
       this.liquifyStride_ = p0;
    }
    public void setLiquifyType(LiquifyType p0){
       Objects.requireNonNull(p0);
       this.liquifyType_ = p0.getNumber();
    }
    public void setLiquifyTypeValue(int p0){
       this.liquifyType_ = p0;
    }
    public void setLiquifyistouchbegin(boolean p0){
       this.liquifyistouchbegin_ = p0;
    }
    public void setLiquifyistouchend(boolean p0){
       this.liquifyistouchend_ = p0;
    }
    public void setLookupDimension(int p0){
       this.lookupDimension_ = p0;
    }
    public void setLookupIntensity(float p0){
       this.lookupIntensity_ = p0;
    }
    public void setLookupParam(EffectLookupParam$Builder p0){
       this.lookupParam_ = p0.build();
    }
    public void setLookupParam(EffectLookupParam p0){
       Objects.requireNonNull(p0);
       this.lookupParam_ = p0;
    }
    public void setLookupPath(String p0){
       Objects.requireNonNull(p0);
       this.lookupPath_ = p0;
    }
    public void setLookupPathBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.lookupPath_ = p0.toStringUtf8();
    }
    public void setLookupSlideParam(EffectLookupSlideParam$Builder p0){
       this.lookupSlideParam_ = p0.build();
    }
    public void setLookupSlideParam(EffectLookupSlideParam p0){
       Objects.requireNonNull(p0);
       this.lookupSlideParam_ = p0;
    }
    public void setLookupType(int p0){
       this.lookupType_ = p0;
    }
    public void setMagicRemovelMask(Bitmap$Builder p0){
       this.magicRemovelMask_ = p0.build();
    }
    public void setMagicRemovelMask(Bitmap p0){
       Objects.requireNonNull(p0);
       this.magicRemovelMask_ = p0;
    }
    public void setMagnifierBorderColor(int p0,float p1){
       this.ensureMagnifierBorderColorIsMutable();
       this.magnifierBorderColor_.setFloat(p0, p1);
    }
    public void setMagnifierBorderRadius(float p0){
       this.magnifierBorderRadius_ = p0;
    }
    public void setMagnifierBorderWidth(float p0){
       this.magnifierBorderWidth_ = p0;
    }
    public void setMagnifierCanvasSize(int p0,float p1){
       this.ensureMagnifierCanvasSizeIsMutable();
       this.magnifierCanvasSize_.setFloat(p0, p1);
    }
    public void setMagnifierContentScale(float p0){
       this.magnifierContentScale_ = p0;
    }
    public void setMagnifierFaceTrackId(int p0){
       this.magnifierFaceTrackId_ = p0;
    }
    public void setMagnifierShapePath(String p0){
       Objects.requireNonNull(p0);
       this.magnifierShapePath_ = p0;
    }
    public void setMagnifierShapePathBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.magnifierShapePath_ = p0.toStringUtf8();
    }
    public void setMakeUpPenBrushIntensity(float p0){
       this.makeUpPenBrushIntensity_ = p0;
    }
    public void setMakeupBackLightMode(int p0){
       this.makeupBackLightMode_ = p0;
    }
    public void setMakeupBlendMode(int p0){
       this.makeupBlendMode_ = p0;
    }
    public void setMakeupColor(MakeupColor$Builder p0){
       this.makeupColor_ = p0.build();
    }
    public void setMakeupColor(MakeupColor p0){
       Objects.requireNonNull(p0);
       this.makeupColor_ = p0;
    }
    public void setMakeupIntensity(float p0){
       this.makeupIntensity_ = p0;
    }
    public void setMakeupMode(String p0){
       Objects.requireNonNull(p0);
       this.makeupMode_ = p0;
    }
    public void setMakeupModeBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.makeupMode_ = p0.toStringUtf8();
    }
    public void setMakeupPenBrushColor(EffectColor$Builder p0){
       this.makeupPenBrushColor_ = p0.build();
    }
    public void setMakeupPenBrushColor(EffectColor p0){
       Objects.requireNonNull(p0);
       this.makeupPenBrushColor_ = p0;
    }
    public void setMakeupPenBrushHardness(float p0){
       this.makeupPenBrushHardness_ = p0;
    }
    public void setMakeupPenBrushTexturePath(String p0){
       Objects.requireNonNull(p0);
       this.makeupPenBrushTexturePath_ = p0;
    }
    public void setMakeupPenBrushTexturePathBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.makeupPenBrushTexturePath_ = p0.toStringUtf8();
    }
    public void setMakeupPenBrushType(EffectMakeupPenBrushType p0){
       Objects.requireNonNull(p0);
       this.makeupPenBrushType_ = p0.getNumber();
    }
    public void setMakeupPenBrushTypeValue(int p0){
       this.makeupPenBrushType_ = p0;
    }
    public void setMakeupPenEraserColor(EffectColor$Builder p0){
       this.makeupPenEraserColor_ = p0.build();
    }
    public void setMakeupPenEraserColor(EffectColor p0){
       Objects.requireNonNull(p0);
       this.makeupPenEraserColor_ = p0;
    }
    public void setMakeupPenEraserLiveTime(float p0){
       this.makeupPenEraserLiveTime_ = p0;
    }
    public void setMakeupPenHighLightTexturePath(String p0){
       Objects.requireNonNull(p0);
       this.makeupPenHighLightTexturePath_ = p0;
    }
    public void setMakeupPenHighLightTexturePathBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.makeupPenHighLightTexturePath_ = p0.toStringUtf8();
    }
    public void setMakeupPenIsEraser(boolean p0){
       this.makeupPenIsEraser_ = p0;
    }
    public void setMakeupPenPointSize(float p0){
       this.makeupPenPointSize_ = p0;
    }
    public void setMakeupPenPointStride(float p0){
       this.makeupPenPointStride_ = p0;
    }
    public void setMakeupPenTouch(MakeupPenTouch$Builder p0){
       this.makeupPenTouch_ = p0.build();
    }
    public void setMakeupPenTouch(MakeupPenTouch p0){
       Objects.requireNonNull(p0);
       this.makeupPenTouch_ = p0;
    }
    public void setMakeupResource(int p0,MakeupResource$Builder p1){
       this.ensureMakeupResourceIsMutable();
       this.makeupResource_.set(p0, p1.build());
    }
    public void setMakeupResource(int p0,MakeupResource p1){
       Objects.requireNonNull(p1);
       this.ensureMakeupResourceIsMutable();
       this.makeupResource_.set(p0, p1);
    }
    public void setMemojiEnableEditMode(boolean p0){
       this.memojiEnableEditMode_ = p0;
    }
    public void setMemojiGroup(String p0){
       Objects.requireNonNull(p0);
       this.memojiGroup_ = p0;
    }
    public void setMemojiGroupBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.memojiGroup_ = p0.toStringUtf8();
    }
    public void setMemojiIconHeight(int p0){
       this.memojiIconHeight_ = p0;
    }
    public void setMemojiIconWidth(int p0){
       this.memojiIconWidth_ = p0;
    }
    public void setMemojiStyle(String p0){
       Objects.requireNonNull(p0);
       this.memojiStyle_ = p0;
    }
    public void setMemojiStyleBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.memojiStyle_ = p0.toStringUtf8();
    }
    public void setMemojiUserConfigJson(String p0){
       Objects.requireNonNull(p0);
       this.memojiUserConfigJson_ = p0;
    }
    public void setMemojiUserConfigJsonBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.memojiUserConfigJson_ = p0.toStringUtf8();
    }
    public void setMoreMediaData(int p0,PickingMediaData$Builder p1){
       this.ensureMoreMediaDataIsMutable();
       this.moreMediaData_.set(p0, p1.build());
    }
    public void setMoreMediaData(int p0,PickingMediaData p1){
       Objects.requireNonNull(p1);
       this.ensureMoreMediaDataIsMutable();
       this.moreMediaData_.set(p0, p1);
    }
    public void setMoveMagnifierContentDistance(int p0,float p1){
       this.ensureMoveMagnifierContentDistanceIsMutable();
       this.moveMagnifierContentDistance_.setFloat(p0, p1);
    }
    public void setMusicWavePath(String p0){
       Objects.requireNonNull(p0);
       this.musicWavePath_ = p0;
    }
    public void setMusicWavePathBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.musicWavePath_ = p0.toStringUtf8();
    }
    public void setMusicWaveTime(float p0){
       this.musicWaveTime_ = p0;
    }
    public void setNEditFlawUndoNums(int p0){
       this.nEditFlawUndoNums_ = p0;
    }
    public void setNMagicRemovelUndoNums(int p0){
       this.nMagicRemovelUndoNums_ = p0;
    }
    public void setNeedMakeupClearOldResource(boolean p0){
       this.needMakeupClearOldResource_ = p0;
    }
    public void setNoseShadowIntensity(float p0){
       this.noseShadowIntensity_ = p0;
    }
    public void setOilfreeIntensity(float p0){
       this.oilfreeIntensity_ = p0;
    }
    public void setOilpaintSourcePath(String p0){
       Objects.requireNonNull(p0);
       this.oilpaintSourcePath_ = p0;
    }
    public void setOilpaintSourcePathBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.oilpaintSourcePath_ = p0.toStringUtf8();
    }
    public void setPassThroughParams(String p0){
       Objects.requireNonNull(p0);
       this.passThroughParams_ = p0;
    }
    public void setPassThroughParamsBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.passThroughParams_ = p0.toStringUtf8();
    }
    public void setPickingMediaPath(String p0){
       Objects.requireNonNull(p0);
       this.pickingMediaPath_ = p0;
    }
    public void setPickingMediaPathBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.pickingMediaPath_ = p0.toStringUtf8();
    }
    public void setPickingMediaType(PickingMediaResType p0){
       Objects.requireNonNull(p0);
       this.pickingMediaType_ = p0.getNumber();
    }
    public void setPickingMediaTypeValue(int p0){
       this.pickingMediaType_ = p0;
    }
    public void setPlayrate(float p0){
       this.playrate_ = p0;
    }
    public void setRelightingConfig(RelightingConfig$Builder p0){
       this.relightingConfig_ = p0.build();
    }
    public void setRelightingConfig(RelightingConfig p0){
       Objects.requireNonNull(p0);
       this.relightingConfig_ = p0;
    }
    public void setSafeUiArea(SafeUIArea$Builder p0){
       this.safeUiArea_ = p0.build();
    }
    public void setSafeUiArea(SafeUIArea p0){
       Objects.requireNonNull(p0);
       this.safeUiArea_ = p0;
    }
    public void setSeekPoint(float p0){
       this.seekPoint_ = p0;
    }
    public void setServerMediaType(PickingMediaResType p0){
       Objects.requireNonNull(p0);
       this.serverMediaType_ = p0.getNumber();
    }
    public void setServerMediaTypeValue(int p0){
       this.serverMediaType_ = p0;
    }
    public void setServerResultPath(String p0){
       Objects.requireNonNull(p0);
       this.serverResultPath_ = p0;
    }
    public void setServerResultPathBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.serverResultPath_ = p0.toStringUtf8();
    }
    public void setSetEditFlawParams(EditFlawConfig$Builder p0){
       this.setEditFlawParams_ = p0.build();
    }
    public void setSetEditFlawParams(EditFlawConfig p0){
       Objects.requireNonNull(p0);
       this.setEditFlawParams_ = p0;
    }
    public void setSetFaceSegForBeauty(boolean p0){
       this.setFaceSegForBeauty_ = p0;
    }
    public void setShouldUseFacemask(boolean p0){
       this.shouldUseFacemask_ = p0;
    }
    public void setShouldUseGender(boolean p0){
       this.shouldUseGender_ = p0;
    }
    public void setShouldUseLandmarksmask(boolean p0){
       this.shouldUseLandmarksmask_ = p0;
    }
    public void setSlideEndWithNewEffect(boolean p0){
       this.slideEndWithNewEffect_ = p0;
    }
    public void setSlideNewEffectDisplayLeft(float p0){
       this.slideNewEffectDisplayLeft_ = p0;
    }
    public void setSlideNewEffectDisplayRight(float p0){
       this.slideNewEffectDisplayRight_ = p0;
    }
    public void setSmartBeautyIntensity(float p0){
       this.smartBeautyIntensity_ = p0;
    }
    public void setSoften(float p0){
       this.soften_ = p0;
    }
    public void setStartPoint(FMPoint$Builder p0){
       this.startPoint_ = p0.build();
    }
    public void setStartPoint(FMPoint p0){
       Objects.requireNonNull(p0);
       this.startPoint_ = p0;
    }
    public void setSticker(StickerInfo$Builder p0){
       this.sticker_ = p0.build();
    }
    public void setSticker(StickerInfo p0){
       Objects.requireNonNull(p0);
       this.sticker_ = p0;
    }
    public void setStickerEnable(boolean p0){
       this.stickerEnable_ = p0;
    }
    public void setStickerIntensityWeightActive(boolean p0){
       this.stickerIntensityWeightActive_ = p0;
    }
    public void setStickerMainEnable(boolean p0){
       this.stickerMainEnable_ = p0;
    }
    public void setStickers(int p0,StickerInfo$Builder p1){
       this.ensureStickersIsMutable();
       this.stickers_.set(p0, p1.build());
    }
    public void setStickers(int p0,StickerInfo p1){
       Objects.requireNonNull(p1);
       this.ensureStickersIsMutable();
       this.stickers_.set(p0, p1);
    }
    public void setSwapFaceImagePath(String p0){
       Objects.requireNonNull(p0);
       this.swapFaceImagePath_ = p0;
    }
    public void setSwapFaceImagePathBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.swapFaceImagePath_ = p0.toStringUtf8();
    }
    public void setTeethBrightenIntensity(float p0){
       this.teethBrightenIntensity_ = p0;
    }
    public void setThermageIntensity(float p0){
       this.thermageIntensity_ = p0;
    }
    public void setTimestamp(FMTimeStamp$Builder p0){
       this.timestamp_ = p0.build();
    }
    public void setTimestamp(FMTimeStamp p0){
       Objects.requireNonNull(p0);
       this.timestamp_ = p0;
    }
    public void setTriggerInputText(String p0){
       Objects.requireNonNull(p0);
       this.triggerInputText_ = p0;
    }
    public void setTriggerInputTextBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.triggerInputText_ = p0.toStringUtf8();
    }
    public void setTriggerInputTextIndex(int p0){
       this.triggerInputTextIndex_ = p0;
    }
    public void setUseLowPowerSensor(boolean p0){
       this.useLowPowerSensor_ = p0;
    }
    public void setUseMaleMakeup(boolean p0){
       this.useMaleMakeup_ = p0;
    }
    public void setUseSkinAndHairSegModel(boolean p0){
       this.useSkinAndHairSegModel_ = p0;
    }
    public void setUserLocation(String p0){
       Objects.requireNonNull(p0);
       this.userLocation_ = p0;
    }
    public void setUserLocationBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.userLocation_ = p0.toStringUtf8();
    }
    public void setVideoLength(int p0){
       this.videoLength_ = p0;
    }
    public void setWaterSkinIntensity(float p0){
       this.waterSkinIntensity_ = p0;
    }
    public void setWeakenMakeupIntensityProp(int p0){
       this.weakenMakeupIntensityProp_ = p0;
    }
    public void setWhiteSkinConfig(String p0){
       Objects.requireNonNull(p0);
       this.whiteSkinConfig_ = p0;
    }
    public void setWhiteSkinConfigBytes(ByteString p0){
       Objects.requireNonNull(p0);
       AbstractMessageLite.checkByteStringIsUtf8(p0);
       this.whiteSkinConfig_ = p0.toStringUtf8();
    }
    public void setWhiteSkinIntensity(float p0){
       this.whiteSkinIntensity_ = p0;
    }
    public void setWocanIntensity(float p0){
       this.wocanIntensity_ = p0;
    }
    public void setWrinkleRemoveIntensity(float p0){
       this.wrinkleRemoveIntensity_ = p0;
    }
}
