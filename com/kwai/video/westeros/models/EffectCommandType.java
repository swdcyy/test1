package com.kwai.video.westeros.models.EffectCommandType;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kwai.video.westeros.models.EffectCommandType$1;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kwai.video.westeros.models.EffectCommandType$EffectCommandTypeVerifier;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class EffectCommandType extends Enum implements Internal$EnumLite	// class@000f08
{
    public final int value;
    public static final EffectCommandType[] $VALUES;
    public static final EffectCommandType KEditFlawClear;
    public static final EffectCommandType KEditFlawRedo;
    public static final EffectCommandType KEditFlawSave;
    public static final EffectCommandType KEditFlawUndo;
    public static final EffectCommandType KMagicRemovelRedo;
    public static final EffectCommandType KMagicRemovelUndo;
    public static final EffectCommandType KManualWrinkleCleanerRedo;
    public static final EffectCommandType KManualWrinkleCleanerUndo;
    public static final EffectCommandType KRefreshOilPainting;
    public static final EffectCommandType KSetAutoFlawStatus;
    public static final EffectCommandType KSetBigeyeOptimization;
    public static final EffectCommandType KSetDoFlaw;
    public static final EffectCommandType KSetEditFlawAuto;
    public static final EffectCommandType KSetEditStatus;
    public static final EffectCommandType KSetMagicRemovelStatus;
    public static final EffectCommandType KSetMakeupChildToZero;
    public static final EffectCommandType KSetManualWrinkleCleanerStatus;
    public static final EffectCommandType KStopUpdate;
    public static final EffectCommandType UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;
    public static final EffectCommandType kAddMagnifierItem;
    public static final EffectCommandType kAdjustConfigBokehDepthEnable;
    public static final EffectCommandType kAdjustConfigBokehDepthFocalLength;
    public static final EffectCommandType kAdjustConfigBokehDepthMask;
    public static final EffectCommandType kAdjustConfigBokehDepthRadius;
    public static final EffectCommandType kAdjustConfigBokehDepthSegmentationData;
    public static final EffectCommandType kAdjustConfigBokehDepthSpotShape;
    public static final EffectCommandType kAdjustConfigBokehDepthTouchPos;
    public static final EffectCommandType kAdjustConfigBokehQuality;
    public static final EffectCommandType kAdjustConfigBokehType;
    public static final EffectCommandType kAdjustConfigLookupIntensity;
    public static final EffectCommandType kAdjustConfigMakeupIntensity;
    public static final EffectCommandType kAdjustEffectIntensity;
    public static final EffectCommandType kAdjustHairSofteningMode;
    public static final EffectCommandType kAdjustHairSofteningStrength;
    public static final EffectCommandType kAppendCustomTrigger;
    public static final EffectCommandType kBeginEffectSlide;
    public static final EffectCommandType kBodySlimmingAdjust;
    public static final EffectCommandType kBodySlimmingGradient;
    public static final EffectCommandType kBodySlimmingStatus;
    public static final EffectCommandType kBokehEffectConfig;
    public static final EffectCommandType kBokehEffectEnalbeTestMode;
    public static final EffectCommandType kClearLookupEffect;
    public static final EffectCommandType kCloseMagicAudio;
    public static final EffectCommandType kContrastOriginal;
    public static final EffectCommandType kDeleteMagnifierItem;
    public static final EffectCommandType kEnableMagicFilter;
    public static final EffectCommandType kEnableMakeupBackLight;
    public static final EffectCommandType kEnableUndoWarpEdit;
    public static final EffectCommandType kEnableUndoWarpPhoto;
    public static final EffectCommandType kEnableUndoWarpPhotoRefreshData;
    public static final EffectCommandType kEndEffectSlide;
    public static final EffectCommandType kEnlargeMaxFaceCount;
    public static final EffectCommandType kExportSticker;
    public static final EffectCommandType kFilterBasicAdjust;
    public static final EffectCommandType kGetMemojiIconBuffer;
    public static final EffectCommandType kIsLivePK360p;
    public static final EffectCommandType kLiquify;
    public static final EffectCommandType kLiquifyClear;
    public static final EffectCommandType kLiquifyRedo;
    public static final EffectCommandType kLiquifyUndo;
    public static final EffectCommandType kLiquifyUpdateMesh;
    public static final EffectCommandType kLoadBokehEffectMask;
    public static final EffectCommandType kM2UAdjustGroupDeformIntensity;
    public static final EffectCommandType kM2UAdjustGroupLookupIntensity;
    public static final EffectCommandType kM2UAdjustGroupMakeupIntensity;
    public static final EffectCommandType kMoveMagnifierBorder;
    public static final EffectCommandType kOilPaintDisable;
    public static final EffectCommandType kOilPaintEnable;
    public static final EffectCommandType kPause;
    public static final EffectCommandType kRecordingFinish;
    public static final EffectCommandType kRecordingPause;
    public static final EffectCommandType kRecordingReset;
    public static final EffectCommandType kRecordingResume;
    public static final EffectCommandType kRecordingStart;
    public static final EffectCommandType kRefreshEffectHint;
    public static final EffectCommandType kRelightingAdjust;
    public static final EffectCommandType kReset;
    public static final EffectCommandType kRestoreMakeupResource;
    public static final EffectCommandType kRestoreMemojiJsonConfig;
    public static final EffectCommandType kResume;
    public static final EffectCommandType kResumeMagicAudio;
    public static final EffectCommandType kScaleMagnifier;
    public static final EffectCommandType kSeekTo;
    public static final EffectCommandType kSetAIDeFlaw;
    public static final EffectCommandType kSetAIEyelid;
    public static final EffectCommandType kSetAnimojiData;
    public static final EffectCommandType kSetAttachedEffectsBack;
    public static final EffectCommandType kSetBeautifyClarity;
    public static final EffectCommandType kSetBeautifyFaceShadow;
    public static final EffectCommandType kSetBeautifyGroupPath;
    public static final EffectCommandType kSetBeautifyLips;
    public static final EffectCommandType kSetBeautifyPanelStatus;
    public static final EffectCommandType kSetBeautifyPreviewPart;
    public static final EffectCommandType kSetBeautifySecondBright;
    public static final EffectCommandType kSetBeautyAnyType;
    public static final EffectCommandType kSetBeautyZeroOptIntensity;
    public static final EffectCommandType kSetBoomGameData;
    public static final EffectCommandType kSetBright;
    public static final EffectCommandType kSetClarityIntensity;
    public static final EffectCommandType kSetClientTimeStamp;
    public static final EffectCommandType kSetClientWorkProcess;
    public static final EffectCommandType kSetCustomSticker;
    public static final EffectCommandType kSetDefinitionIntensity;
    public static final EffectCommandType kSetDeformIntensity;
    public static final EffectCommandType kSetEditFlawParams;
    public static final EffectCommandType kSetEnableSmartBeauty;
    public static final EffectCommandType kSetEvenSkin;
    public static final EffectCommandType kSetEvenSkinIntensity;
    public static final EffectCommandType kSetEyeBagRemove;
    public static final EffectCommandType kSetEyeBrighten;
    public static final EffectCommandType kSetFaceSegForBeauty;
    public static final EffectCommandType kSetFaceTextureIntensity;
    public static final EffectCommandType kSetFastFlaw;
    public static final EffectCommandType kSetFlashLightIntensity;
    public static final EffectCommandType kSetGenderUsingType;
    public static final EffectCommandType kSetGroupEffect;
    public static final EffectCommandType kSetHairClipConfig;
    public static final EffectCommandType kSetHairDyeingConfig;
    public static final EffectCommandType kSetHairDyeingIntensity;
    public static final EffectCommandType kSetInputText;
    public static final EffectCommandType kSetInputTextFont;
    public static final EffectCommandType kSetMVLookupFirst;
    public static final EffectCommandType kSetMagicRemovelMask;
    public static final EffectCommandType kSetMagnifierBorderColor;
    public static final EffectCommandType kSetMagnifierBorderRadius;
    public static final EffectCommandType kSetMagnifierBorderWidth;
    public static final EffectCommandType kSetMagnifierCanvasSize;
    public static final EffectCommandType kSetMagnifierShape;
    public static final EffectCommandType kSetMakeupBlendMode;
    public static final EffectCommandType kSetMakeupColor;
    public static final EffectCommandType kSetMakeupGenderIntensity;
    public static final EffectCommandType kSetMakeupIntensity;
    public static final EffectCommandType kSetMakeupPenBrushColor;
    public static final EffectCommandType kSetMakeupPenBrushHardness;
    public static final EffectCommandType kSetMakeupPenBrushIntensity;
    public static final EffectCommandType kSetMakeupPenBrushType;
    public static final EffectCommandType kSetMakeupPenClear;
    public static final EffectCommandType kSetMakeupPenEraserColor;
    public static final EffectCommandType kSetMakeupPenLiveTime;
    public static final EffectCommandType kSetMakeupPenPoint;
    public static final EffectCommandType kSetMakeupPenPointSize;
    public static final EffectCommandType kSetMakeupPenPointStride;
    public static final EffectCommandType kSetMakeupPenRedo;
    public static final EffectCommandType kSetMakeupPenUndo;
    public static final EffectCommandType kSetMakeupResource;
    public static final EffectCommandType kSetManualWrinkleCleanerMask;
    public static final EffectCommandType kSetMemojiEditMode;
    public static final EffectCommandType kSetMemojiUserConfig;
    public static final EffectCommandType kSetMusicWavePath;
    public static final EffectCommandType kSetNoseShadow;
    public static final EffectCommandType kSetOilFreeIntensity;
    public static final EffectCommandType kSetOilPaintingIntensity;
    public static final EffectCommandType kSetOilPatiningResource;
    public static final EffectCommandType kSetPassThroughParams;
    public static final EffectCommandType kSetPickingMediaResource;
    public static final EffectCommandType kSetPlayrate;
    public static final EffectCommandType kSetSafeUIArea;
    public static final EffectCommandType kSetSameTemplateOrder;
    public static final EffectCommandType kSetServerResult;
    public static final EffectCommandType kSetSmartBeautify;
    public static final EffectCommandType kSetSmartBeautyIntensity;
    public static final EffectCommandType kSetSoften;
    public static final EffectCommandType kSetStickerEnable;
    public static final EffectCommandType kSetStickers;
    public static final EffectCommandType kSetSwapFaceImagePath;
    public static final EffectCommandType kSetTeethBrighten;
    public static final EffectCommandType kSetThermage;
    public static final EffectCommandType kSetUserLocation;
    public static final EffectCommandType kSetWaterskin;
    public static final EffectCommandType kSetWeakenMakeupIntensityProp;
    public static final EffectCommandType kSetWhiteSkinConfig;
    public static final EffectCommandType kSetWhiteSkinIntensity;
    public static final EffectCommandType kSetWocan;
    public static final EffectCommandType kSetWrinkleRemove;
    public static final EffectCommandType kSetlookupIntensity;
    public static final EffectCommandType kShouldUseFaceMaskForBeautyMakeup;
    public static final EffectCommandType kShouldUseFaceMaskForDGMakeup;
    public static final EffectCommandType kShouldUseGenderForBeautyMakeup;
    public static final EffectCommandType kShouldUseLandmarksMaskForBeautyMakeup;
    public static final EffectCommandType kShouldUseLandmarksMaskForDGMakeup;
    public static final EffectCommandType kSubmitMemojiUserConfig;
    public static final EffectCommandType kSwitchBeautifyVersion;
    public static final EffectCommandType kSwitchLookupEffect;
    public static final EffectCommandType kTakePicture;
    public static final EffectCommandType kTriggerInputText;
    public static final EffectCommandType kUpdateCustomInputTexts;
    public static final EffectCommandType kUpdateEffectSlide;
    public static final EffectCommandType kUpdateMoreClientWorkProgress;
    public static final EffectCommandType kUpdateMusicWaveTime;
    public static final EffectCommandType kUpdatePickMoreMedia;
    public static final EffectCommandType kUpdateSticker;
    public static final EffectCommandType kUseLowPowerSensor;
    public static final EffectCommandType kUseMaleMakeup;
    public static final EffectCommandType kUseSkinAndHairSegModel;
    public static final EffectCommandType kVideoLength;

    static {
       EffectCommandType uEffectComma = new EffectCommandType("kSetBright", 0, 0);
       EffectCommandType.kSetBright = uEffectComma;
       EffectCommandType uEffectComma1 = new EffectCommandType("kSetSoften", 1, 1);
       EffectCommandType.kSetSoften = uEffectComma1;
       EffectCommandType uEffectComma2 = new EffectCommandType("kSetDeformIntensity", 2, 2);
       EffectCommandType.kSetDeformIntensity = uEffectComma2;
       EffectCommandType uEffectComma3 = new EffectCommandType("kSwitchLookupEffect", 3, 3);
       EffectCommandType.kSwitchLookupEffect = uEffectComma3;
       EffectCommandType uEffectComma4 = new EffectCommandType("kClearLookupEffect", 4, 4);
       EffectCommandType.kClearLookupEffect = uEffectComma4;
       EffectCommandType uEffectComma5 = new EffectCommandType("kSetlookupIntensity", 5, 5);
       EffectCommandType.kSetlookupIntensity = uEffectComma5;
       EffectCommandType uEffectComma6 = new EffectCommandType("kSetMakeupResource", 6, 6);
       EffectCommandType.kSetMakeupResource = uEffectComma6;
       EffectCommandType uEffectComma7 = new EffectCommandType("kSetMakeupIntensity", 7, 7);
       EffectCommandType.kSetMakeupIntensity = uEffectComma7;
       EffectCommandType uEffectComma8 = new EffectCommandType("kSetSwapFaceImagePath", 8, 8);
       EffectCommandType.kSetSwapFaceImagePath = uEffectComma8;
       EffectCommandType uEffectComma9 = new EffectCommandType("kPause", 9, 9);
       EffectCommandType.kPause = uEffectComma9;
       EffectCommandType uEffectComma10 = new EffectCommandType("kResume", 10, 10);
       EffectCommandType.kResume = uEffectComma10;
       EffectCommandType uEffectComma11 = new EffectCommandType("kReset", 11, 11);
       EffectCommandType.kReset = uEffectComma11;
       EffectCommandType uEffectComma12 = new EffectCommandType("kSetGroupEffect", 12, 15);
       EffectCommandType.kSetGroupEffect = uEffectComma12;
       EffectCommandType uEffectComma13 = uEffectComma12;
       EffectCommandType uEffectComma14 = new EffectCommandType("kAppendCustomTrigger", 13, 16);
       EffectCommandType.kAppendCustomTrigger = uEffectComma14;
       EffectCommandType uEffectComma15 = uEffectComma14;
       EffectCommandType uEffectComma16 = new EffectCommandType("kAdjustEffectIntensity", 14, 17);
       EffectCommandType.kAdjustEffectIntensity = uEffectComma16;
       EffectCommandType uEffectComma17 = uEffectComma16;
       EffectCommandType uEffectComma18 = new EffectCommandType("kFilterBasicAdjust", 15, 18);
       EffectCommandType.kFilterBasicAdjust = uEffectComma18;
       EffectCommandType uEffectComma19 = uEffectComma18;
       uEffectComma16 = new EffectCommandType("kAdjustConfigLookupIntensity", 16, 19);
       EffectCommandType.kAdjustConfigLookupIntensity = uEffectComma16;
       EffectCommandType uEffectComma20 = uEffectComma16;
       uEffectComma18 = new EffectCommandType("kAdjustConfigMakeupIntensity", 17, 20);
       EffectCommandType.kAdjustConfigMakeupIntensity = uEffectComma18;
       EffectCommandType uEffectComma21 = uEffectComma18;
       uEffectComma16 = new EffectCommandType("kSetInputText", 18, 21);
       EffectCommandType.kSetInputText = uEffectComma16;
       EffectCommandType uEffectComma22 = uEffectComma16;
       uEffectComma18 = new EffectCommandType("kRecordingStart", 19, 22);
       EffectCommandType.kRecordingStart = uEffectComma18;
       EffectCommandType uEffectComma23 = uEffectComma18;
       uEffectComma16 = new EffectCommandType("kRecordingReset", 20, 23);
       EffectCommandType.kRecordingReset = uEffectComma16;
       EffectCommandType uEffectComma24 = uEffectComma16;
       uEffectComma18 = new EffectCommandType("kRecordingPause", 21, 24);
       EffectCommandType.kRecordingPause = uEffectComma18;
       EffectCommandType uEffectComma25 = uEffectComma18;
       uEffectComma16 = new EffectCommandType("kRecordingResume", 22, 25);
       EffectCommandType.kRecordingResume = uEffectComma16;
       EffectCommandType uEffectComma26 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kRecordingFinish", 23, 26);
       EffectCommandType.kRecordingFinish = uEffectComma14;
       EffectCommandType uEffectComma27 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kRestoreMemojiJsonConfig", 24, 27);
       EffectCommandType.kRestoreMemojiJsonConfig = uEffectComma16;
       EffectCommandType uEffectComma28 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kSetMemojiUserConfig", 25, 28);
       EffectCommandType.kSetMemojiUserConfig = uEffectComma14;
       EffectCommandType uEffectComma29 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kSetMemojiEditMode", 26, 29);
       EffectCommandType.kSetMemojiEditMode = uEffectComma16;
       EffectCommandType uEffectComma30 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kSubmitMemojiUserConfig", 27, 30);
       EffectCommandType.kSubmitMemojiUserConfig = uEffectComma14;
       EffectCommandType uEffectComma31 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kGetMemojiIconBuffer", 28, 31);
       EffectCommandType.kGetMemojiIconBuffer = uEffectComma16;
       EffectCommandType uEffectComma32 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kRefreshEffectHint", 29, 32);
       EffectCommandType.kRefreshEffectHint = uEffectComma14;
       EffectCommandType uEffectComma33 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kSetUserLocation", 30, 33);
       EffectCommandType.kSetUserLocation = uEffectComma16;
       EffectCommandType uEffectComma34 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kSetMusicWavePath", 31, 34);
       EffectCommandType.kSetMusicWavePath = uEffectComma14;
       EffectCommandType uEffectComma35 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kUpdateMusicWaveTime", 32, 35);
       EffectCommandType.kUpdateMusicWaveTime = uEffectComma16;
       EffectCommandType uEffectComma36 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kSetCustomSticker", 33, 36);
       EffectCommandType.kSetCustomSticker = uEffectComma14;
       EffectCommandType uEffectComma37 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kSetGenderUsingType", 34, 37);
       EffectCommandType.kSetGenderUsingType = uEffectComma16;
       EffectCommandType uEffectComma38 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kSetWrinkleRemove", 35, 38);
       EffectCommandType.kSetWrinkleRemove = uEffectComma14;
       EffectCommandType uEffectComma39 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kSetEyeBagRemove", 36, 39);
       EffectCommandType.kSetEyeBagRemove = uEffectComma16;
       EffectCommandType uEffectComma40 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kSetEyeBrighten", 37, 40);
       EffectCommandType.kSetEyeBrighten = uEffectComma14;
       EffectCommandType uEffectComma41 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kSetTeethBrighten", 38, 41);
       EffectCommandType.kSetTeethBrighten = uEffectComma16;
       EffectCommandType uEffectComma42 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kSetBeautifyLips", 39, 42);
       EffectCommandType.kSetBeautifyLips = uEffectComma14;
       EffectCommandType uEffectComma43 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kSetNoseShadow", 40, 43);
       EffectCommandType.kSetNoseShadow = uEffectComma16;
       EffectCommandType uEffectComma44 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kCloseMagicAudio", 41, 44);
       EffectCommandType.kCloseMagicAudio = uEffectComma14;
       EffectCommandType uEffectComma45 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kResumeMagicAudio", 42, 45);
       EffectCommandType.kResumeMagicAudio = uEffectComma16;
       EffectCommandType uEffectComma46 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kBodySlimmingAdjust", 43, 46);
       EffectCommandType.kBodySlimmingAdjust = uEffectComma14;
       EffectCommandType uEffectComma47 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kBodySlimmingStatus", 44, 47);
       EffectCommandType.kBodySlimmingStatus = uEffectComma16;
       EffectCommandType uEffectComma48 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kSetBeautifySecondBright", 45, 48);
       EffectCommandType.kSetBeautifySecondBright = uEffectComma14;
       EffectCommandType uEffectComma49 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kBeginEffectSlide", 46, 49);
       EffectCommandType.kBeginEffectSlide = uEffectComma16;
       EffectCommandType uEffectComma50 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kEndEffectSlide", 47, 50);
       EffectCommandType.kEndEffectSlide = uEffectComma14;
       EffectCommandType uEffectComma51 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kUpdateEffectSlide", 48, 51);
       EffectCommandType.kUpdateEffectSlide = uEffectComma16;
       EffectCommandType uEffectComma52 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kUseMaleMakeup", 49, 52);
       EffectCommandType.kUseMaleMakeup = uEffectComma14;
       EffectCommandType uEffectComma53 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kSetBeautifyFaceShadow", 50, 53);
       EffectCommandType.kSetBeautifyFaceShadow = uEffectComma16;
       EffectCommandType uEffectComma54 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kSetBeautifyClarity", 51, 54);
       EffectCommandType.kSetBeautifyClarity = uEffectComma14;
       EffectCommandType uEffectComma55 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kSetAttachedEffectsBack", 52, 55);
       EffectCommandType.kSetAttachedEffectsBack = uEffectComma16;
       EffectCommandType uEffectComma56 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kSeekTo", 53, 56);
       EffectCommandType.kSeekTo = uEffectComma14;
       EffectCommandType uEffectComma57 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kSetPlayrate", 54, 57);
       EffectCommandType.kSetPlayrate = uEffectComma16;
       EffectCommandType uEffectComma58 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kIsLivePK360p", 55, 58);
       EffectCommandType.kIsLivePK360p = uEffectComma14;
       EffectCommandType uEffectComma59 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kSetBoomGameData", 56, 59);
       EffectCommandType.kSetBoomGameData = uEffectComma16;
       EffectCommandType uEffectComma60 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kSetPickingMediaResource", 57, 60);
       EffectCommandType.kSetPickingMediaResource = uEffectComma14;
       EffectCommandType uEffectComma61 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kSetSafeUIArea", 58, 61);
       EffectCommandType.kSetSafeUIArea = uEffectComma16;
       EffectCommandType uEffectComma62 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kEnableMagicFilter", 59, 62);
       EffectCommandType.kEnableMagicFilter = uEffectComma14;
       EffectCommandType uEffectComma63 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kSetInputTextFont", 60, 63);
       EffectCommandType.kSetInputTextFont = uEffectComma16;
       EffectCommandType uEffectComma64 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kSetEvenSkin", 61, 64);
       EffectCommandType.kSetEvenSkin = uEffectComma14;
       EffectCommandType uEffectComma65 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kVideoLength", 62, 65);
       EffectCommandType.kVideoLength = uEffectComma16;
       EffectCommandType uEffectComma66 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kM2UAdjustGroupMakeupIntensity", 63, 66);
       EffectCommandType.kM2UAdjustGroupMakeupIntensity = uEffectComma14;
       EffectCommandType uEffectComma67 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kM2UAdjustGroupLookupIntensity", 64, 67);
       EffectCommandType.kM2UAdjustGroupLookupIntensity = uEffectComma16;
       EffectCommandType uEffectComma68 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("KSetDoFlaw", 65, 68);
       EffectCommandType.KSetDoFlaw = uEffectComma14;
       EffectCommandType uEffectComma69 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kSetMakeupGenderIntensity", 66, 69);
       EffectCommandType.kSetMakeupGenderIntensity = uEffectComma16;
       EffectCommandType uEffectComma70 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kAdjustConfigBokehDepthEnable", 67, 70);
       EffectCommandType.kAdjustConfigBokehDepthEnable = uEffectComma14;
       EffectCommandType uEffectComma71 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kAdjustConfigBokehDepthRadius", 68, 71);
       EffectCommandType.kAdjustConfigBokehDepthRadius = uEffectComma16;
       EffectCommandType uEffectComma72 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kAdjustConfigBokehDepthFocalLength", 69, 72);
       EffectCommandType.kAdjustConfigBokehDepthFocalLength = uEffectComma14;
       EffectCommandType uEffectComma73 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kAdjustConfigBokehDepthSpotShape", 70, 73);
       EffectCommandType.kAdjustConfigBokehDepthSpotShape = uEffectComma16;
       EffectCommandType uEffectComma74 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kShouldUseGenderForBeautyMakeup", 71, 74);
       EffectCommandType.kShouldUseGenderForBeautyMakeup = uEffectComma14;
       EffectCommandType uEffectComma75 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kShouldUseFaceMaskForBeautyMakeup", 72, 75);
       EffectCommandType.kShouldUseFaceMaskForBeautyMakeup = uEffectComma16;
       EffectCommandType uEffectComma76 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kAdjustConfigBokehDepthTouchPos", 73, 76);
       EffectCommandType.kAdjustConfigBokehDepthTouchPos = uEffectComma14;
       EffectCommandType uEffectComma77 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kShouldUseFaceMaskForDGMakeup", 74, 77);
       EffectCommandType.kShouldUseFaceMaskForDGMakeup = uEffectComma16;
       EffectCommandType uEffectComma78 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kAdjustConfigBokehType", 75, 78);
       EffectCommandType.kAdjustConfigBokehType = uEffectComma14;
       EffectCommandType uEffectComma79 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kAdjustConfigBokehQuality", 76, 79);
       EffectCommandType.kAdjustConfigBokehQuality = uEffectComma16;
       EffectCommandType uEffectComma80 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kAdjustConfigBokehDepthMask", 77, 80);
       EffectCommandType.kAdjustConfigBokehDepthMask = uEffectComma14;
       EffectCommandType uEffectComma81 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kLoadBokehEffectMask", 78, 81);
       EffectCommandType.kLoadBokehEffectMask = uEffectComma16;
       EffectCommandType uEffectComma82 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kAdjustHairSofteningStrength", 79, 82);
       EffectCommandType.kAdjustHairSofteningStrength = uEffectComma14;
       EffectCommandType uEffectComma83 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kSetHairClipConfig", 80, 83);
       EffectCommandType.kSetHairClipConfig = uEffectComma16;
       EffectCommandType uEffectComma84 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kAdjustHairSofteningMode", 81, 84);
       EffectCommandType.kAdjustHairSofteningMode = uEffectComma14;
       EffectCommandType uEffectComma85 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kRelightingAdjust", 82, 85);
       EffectCommandType.kRelightingAdjust = uEffectComma16;
       EffectCommandType uEffectComma86 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kBokehEffectEnalbeTestMode", 83, 86);
       EffectCommandType.kBokehEffectEnalbeTestMode = uEffectComma14;
       EffectCommandType uEffectComma87 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kBokehEffectConfig", 84, 87);
       EffectCommandType.kBokehEffectConfig = uEffectComma16;
       EffectCommandType uEffectComma88 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kContrastOriginal", 85, 88);
       EffectCommandType.kContrastOriginal = uEffectComma14;
       EffectCommandType uEffectComma89 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kBodySlimmingGradient", 86, 89);
       EffectCommandType.kBodySlimmingGradient = uEffectComma16;
       EffectCommandType uEffectComma90 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kM2UAdjustGroupDeformIntensity", 87, 90);
       EffectCommandType.kM2UAdjustGroupDeformIntensity = uEffectComma14;
       EffectCommandType uEffectComma91 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kTakePicture", 88, 91);
       EffectCommandType.kTakePicture = uEffectComma16;
       EffectCommandType uEffectComma92 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kLiquify", 89, 92);
       EffectCommandType.kLiquify = uEffectComma14;
       EffectCommandType uEffectComma93 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kLiquifyClear", 90, 93);
       EffectCommandType.kLiquifyClear = uEffectComma16;
       EffectCommandType uEffectComma94 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kLiquifyUndo", 91, 94);
       EffectCommandType.kLiquifyUndo = uEffectComma14;
       EffectCommandType uEffectComma95 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kLiquifyRedo", 92, 95);
       EffectCommandType.kLiquifyRedo = uEffectComma16;
       EffectCommandType uEffectComma96 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kLiquifyUpdateMesh", 93, 96);
       EffectCommandType.kLiquifyUpdateMesh = uEffectComma14;
       EffectCommandType uEffectComma97 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kSetFaceSegForBeauty", 94, 97);
       EffectCommandType.kSetFaceSegForBeauty = uEffectComma16;
       EffectCommandType uEffectComma98 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kSetHairDyeingConfig", 95, 98);
       EffectCommandType.kSetHairDyeingConfig = uEffectComma14;
       EffectCommandType uEffectComma99 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kSetHairDyeingIntensity", 96, 99);
       EffectCommandType.kSetHairDyeingIntensity = uEffectComma16;
       EffectCommandType uEffectComma100 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kSetEditFlawParams", 97, 100);
       EffectCommandType.kSetEditFlawParams = uEffectComma14;
       EffectCommandType uEffectComma101 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("KSetEditStatus", 98, 101);
       EffectCommandType.KSetEditStatus = uEffectComma16;
       EffectCommandType uEffectComma102 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("KSetEditFlawAuto", 99, 102);
       EffectCommandType.KSetEditFlawAuto = uEffectComma14;
       EffectCommandType uEffectComma103 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("KEditFlawClear", 100, 103);
       EffectCommandType.KEditFlawClear = uEffectComma16;
       EffectCommandType uEffectComma104 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("KEditFlawUndo", 101, 104);
       EffectCommandType.KEditFlawUndo = uEffectComma14;
       EffectCommandType uEffectComma105 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("KEditFlawRedo", 102, 105);
       EffectCommandType.KEditFlawRedo = uEffectComma16;
       EffectCommandType uEffectComma106 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("KEditFlawSave", 103, 106);
       EffectCommandType.KEditFlawSave = uEffectComma14;
       EffectCommandType uEffectComma107 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("KSetAutoFlawStatus", 104, 107);
       EffectCommandType.KSetAutoFlawStatus = uEffectComma16;
       EffectCommandType uEffectComma108 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kSetOilPaintingIntensity", 105, 108);
       EffectCommandType.kSetOilPaintingIntensity = uEffectComma14;
       EffectCommandType uEffectComma109 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kSetOilPatiningResource", 106, 109);
       EffectCommandType.kSetOilPatiningResource = uEffectComma16;
       EffectCommandType uEffectComma110 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kOilPaintEnable", 107, 110);
       EffectCommandType.kOilPaintEnable = uEffectComma14;
       EffectCommandType uEffectComma111 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kOilPaintDisable", 108, 111);
       EffectCommandType.kOilPaintDisable = uEffectComma16;
       EffectCommandType uEffectComma112 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kSetClarityIntensity", 109, 112);
       EffectCommandType.kSetClarityIntensity = uEffectComma14;
       EffectCommandType uEffectComma113 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kSetEvenSkinIntensity", 110, 113);
       EffectCommandType.kSetEvenSkinIntensity = uEffectComma16;
       EffectCommandType uEffectComma114 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kSetAnimojiData", 111, 114);
       EffectCommandType.kSetAnimojiData = uEffectComma14;
       EffectCommandType uEffectComma115 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kShouldUseLandmarksMaskForBeautyMakeup", 112, 115);
       EffectCommandType.kShouldUseLandmarksMaskForBeautyMakeup = uEffectComma16;
       EffectCommandType uEffectComma116 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kShouldUseLandmarksMaskForDGMakeup", 113, 116);
       EffectCommandType.kShouldUseLandmarksMaskForDGMakeup = uEffectComma14;
       EffectCommandType uEffectComma117 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kSetMakeupColor", 114, 117);
       EffectCommandType.kSetMakeupColor = uEffectComma16;
       EffectCommandType uEffectComma118 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kSetMakeupBlendMode", 115, 118);
       EffectCommandType.kSetMakeupBlendMode = uEffectComma14;
       EffectCommandType uEffectComma119 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kSetClientTimeStamp", 116, 119);
       EffectCommandType.kSetClientTimeStamp = uEffectComma16;
       EffectCommandType uEffectComma120 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kSetSmartBeautify", 117, 120);
       EffectCommandType.kSetSmartBeautify = uEffectComma14;
       EffectCommandType uEffectComma121 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kSetWhiteSkinIntensity", 118, 121);
       EffectCommandType.kSetWhiteSkinIntensity = uEffectComma16;
       EffectCommandType uEffectComma122 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kSetWhiteSkinConfig", 119, 122);
       EffectCommandType.kSetWhiteSkinConfig = uEffectComma14;
       EffectCommandType uEffectComma123 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kSetFastFlaw", 120, 123);
       EffectCommandType.kSetFastFlaw = uEffectComma16;
       EffectCommandType uEffectComma124 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kSetMagicRemovelMask", 121, 124);
       EffectCommandType.kSetMagicRemovelMask = uEffectComma14;
       EffectCommandType uEffectComma125 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("KSetMagicRemovelStatus", 122, 125);
       EffectCommandType.KSetMagicRemovelStatus = uEffectComma16;
       EffectCommandType uEffectComma126 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("KMagicRemovelUndo", 123, 126);
       EffectCommandType.KMagicRemovelUndo = uEffectComma14;
       EffectCommandType uEffectComma127 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("KMagicRemovelRedo", 124, 127);
       EffectCommandType.KMagicRemovelRedo = uEffectComma16;
       EffectCommandType uEffectComma128 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kSetOilFreeIntensity", 125, 128);
       EffectCommandType.kSetOilFreeIntensity = uEffectComma14;
       EffectCommandType uEffectComma129 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kSetFaceTextureIntensity", 126, 129);
       EffectCommandType.kSetFaceTextureIntensity = uEffectComma16;
       EffectCommandType uEffectComma130 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kUseLowPowerSensor", 127, 130);
       EffectCommandType.kUseLowPowerSensor = uEffectComma14;
       EffectCommandType uEffectComma131 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("KSetBigeyeOptimization", 128, 131);
       EffectCommandType.KSetBigeyeOptimization = uEffectComma16;
       EffectCommandType uEffectComma132 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kSetMVLookupFirst", 129, 132);
       EffectCommandType.kSetMVLookupFirst = uEffectComma14;
       EffectCommandType uEffectComma133 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kUseSkinAndHairSegModel", 130, 133);
       EffectCommandType.kUseSkinAndHairSegModel = uEffectComma16;
       EffectCommandType uEffectComma134 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kSetWeakenMakeupIntensityProp", 131, 134);
       EffectCommandType.kSetWeakenMakeupIntensityProp = uEffectComma14;
       EffectCommandType uEffectComma135 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kSetSameTemplateOrder", 132, 135);
       EffectCommandType.kSetSameTemplateOrder = uEffectComma16;
       EffectCommandType uEffectComma136 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kSetBeautifyGroupPath", 133, 136);
       EffectCommandType.kSetBeautifyGroupPath = uEffectComma14;
       EffectCommandType uEffectComma137 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kEnlargeMaxFaceCount", 134, 137);
       EffectCommandType.kEnlargeMaxFaceCount = uEffectComma16;
       EffectCommandType uEffectComma138 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kSetMagnifierShape", 135, 138);
       EffectCommandType.kSetMagnifierShape = uEffectComma14;
       EffectCommandType uEffectComma139 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kSetMagnifierBorderColor", 136, 139);
       EffectCommandType.kSetMagnifierBorderColor = uEffectComma16;
       EffectCommandType uEffectComma140 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kSetMagnifierBorderWidth", 137, 140);
       EffectCommandType.kSetMagnifierBorderWidth = uEffectComma14;
       EffectCommandType uEffectComma141 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kScaleMagnifier", 138, 141);
       EffectCommandType.kScaleMagnifier = uEffectComma16;
       EffectCommandType uEffectComma142 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kSetMagnifierBorderRadius", 139, 142);
       EffectCommandType.kSetMagnifierBorderRadius = uEffectComma14;
       EffectCommandType uEffectComma143 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kMoveMagnifierBorder", 140, 143);
       EffectCommandType.kMoveMagnifierBorder = uEffectComma16;
       EffectCommandType uEffectComma144 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kSetMagnifierCanvasSize", 141, 144);
       EffectCommandType.kSetMagnifierCanvasSize = uEffectComma14;
       EffectCommandType uEffectComma145 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kAddMagnifierItem", 142, 145);
       EffectCommandType.kAddMagnifierItem = uEffectComma16;
       EffectCommandType uEffectComma146 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kDeleteMagnifierItem", 143, 146);
       EffectCommandType.kDeleteMagnifierItem = uEffectComma14;
       EffectCommandType uEffectComma147 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("KSetMakeupChildToZero", 144, 147);
       EffectCommandType.KSetMakeupChildToZero = uEffectComma16;
       EffectCommandType uEffectComma148 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("KStopUpdate", 145, 148);
       EffectCommandType.KStopUpdate = uEffectComma14;
       EffectCommandType uEffectComma149 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kSetFlashLightIntensity", 146, 149);
       EffectCommandType.kSetFlashLightIntensity = uEffectComma16;
       EffectCommandType uEffectComma150 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("KRefreshOilPainting", 147, 150);
       EffectCommandType.KRefreshOilPainting = uEffectComma14;
       EffectCommandType uEffectComma151 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kSetManualWrinkleCleanerMask", 148, 151);
       EffectCommandType.kSetManualWrinkleCleanerMask = uEffectComma16;
       EffectCommandType uEffectComma152 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("KSetManualWrinkleCleanerStatus", 149, 152);
       EffectCommandType.KSetManualWrinkleCleanerStatus = uEffectComma14;
       EffectCommandType uEffectComma153 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("KManualWrinkleCleanerUndo", 150, 153);
       EffectCommandType.KManualWrinkleCleanerUndo = uEffectComma16;
       EffectCommandType uEffectComma154 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("KManualWrinkleCleanerRedo", 151, 154);
       EffectCommandType.KManualWrinkleCleanerRedo = uEffectComma14;
       EffectCommandType uEffectComma155 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kEnableUndoWarpEdit", 152, 155);
       EffectCommandType.kEnableUndoWarpEdit = uEffectComma16;
       EffectCommandType uEffectComma156 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kEnableUndoWarpPhoto", 153, 156);
       EffectCommandType.kEnableUndoWarpPhoto = uEffectComma14;
       EffectCommandType uEffectComma157 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kEnableUndoWarpPhotoRefreshData", 154, 157);
       EffectCommandType.kEnableUndoWarpPhotoRefreshData = uEffectComma16;
       EffectCommandType uEffectComma158 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kEnableMakeupBackLight", 155, 158);
       EffectCommandType.kEnableMakeupBackLight = uEffectComma14;
       EffectCommandType uEffectComma159 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kSetStickerEnable", 156, 159);
       EffectCommandType.kSetStickerEnable = uEffectComma16;
       EffectCommandType uEffectComma160 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kSetStickers", 157, 160);
       EffectCommandType.kSetStickers = uEffectComma14;
       EffectCommandType uEffectComma161 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kUpdateSticker", 158, 161);
       EffectCommandType.kUpdateSticker = uEffectComma16;
       EffectCommandType uEffectComma162 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kAdjustConfigBokehDepthSegmentationData", 159, 162);
       EffectCommandType.kAdjustConfigBokehDepthSegmentationData = uEffectComma14;
       EffectCommandType uEffectComma163 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kSetBeautyZeroOptIntensity", 160, 163);
       EffectCommandType.kSetBeautyZeroOptIntensity = uEffectComma16;
       EffectCommandType uEffectComma164 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kRestoreMakeupResource", 161, 164);
       EffectCommandType.kRestoreMakeupResource = uEffectComma14;
       EffectCommandType uEffectComma165 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kTriggerInputText", 162, 165);
       EffectCommandType.kTriggerInputText = uEffectComma16;
       EffectCommandType uEffectComma166 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kExportSticker", 163, 166);
       EffectCommandType.kExportSticker = uEffectComma14;
       EffectCommandType uEffectComma167 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kSwitchBeautifyVersion", 164, 167);
       EffectCommandType.kSwitchBeautifyVersion = uEffectComma16;
       EffectCommandType uEffectComma168 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kSetMakeupPenBrushColor", 165, 168);
       EffectCommandType.kSetMakeupPenBrushColor = uEffectComma14;
       EffectCommandType uEffectComma169 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kSetMakeupPenBrushType", 166, 169);
       EffectCommandType.kSetMakeupPenBrushType = uEffectComma16;
       EffectCommandType uEffectComma170 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kSetMakeupPenBrushHardness", 167, 170);
       EffectCommandType.kSetMakeupPenBrushHardness = uEffectComma14;
       EffectCommandType uEffectComma171 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kSetMakeupPenBrushIntensity", 168, 171);
       EffectCommandType.kSetMakeupPenBrushIntensity = uEffectComma16;
       EffectCommandType uEffectComma172 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kSetMakeupPenPointSize", 169, 172);
       EffectCommandType.kSetMakeupPenPointSize = uEffectComma14;
       EffectCommandType uEffectComma173 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kSetMakeupPenPointStride", 170, 173);
       EffectCommandType.kSetMakeupPenPointStride = uEffectComma16;
       EffectCommandType uEffectComma174 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kSetMakeupPenPoint", 171, 174);
       EffectCommandType.kSetMakeupPenPoint = uEffectComma14;
       EffectCommandType uEffectComma175 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kSetMakeupPenUndo", 172, 175);
       EffectCommandType.kSetMakeupPenUndo = uEffectComma16;
       EffectCommandType uEffectComma176 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kSetMakeupPenRedo", 173, 176);
       EffectCommandType.kSetMakeupPenRedo = uEffectComma14;
       EffectCommandType uEffectComma177 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kSetMakeupPenClear", 174, 177);
       EffectCommandType.kSetMakeupPenClear = uEffectComma16;
       EffectCommandType uEffectComma178 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kSetMakeupPenLiveTime", 175, 178);
       EffectCommandType.kSetMakeupPenLiveTime = uEffectComma14;
       EffectCommandType uEffectComma179 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kSetMakeupPenEraserColor", 176, 179);
       EffectCommandType.kSetMakeupPenEraserColor = uEffectComma16;
       EffectCommandType uEffectComma180 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kSetAIDeFlaw", 177, 180);
       EffectCommandType.kSetAIDeFlaw = uEffectComma14;
       EffectCommandType uEffectComma181 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kSetBeautyAnyType", 178, 181);
       EffectCommandType.kSetBeautyAnyType = uEffectComma16;
       EffectCommandType uEffectComma182 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kSetWocan", 179, 182);
       EffectCommandType.kSetWocan = uEffectComma14;
       EffectCommandType uEffectComma183 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kSetWaterskin", 180, 183);
       EffectCommandType.kSetWaterskin = uEffectComma16;
       EffectCommandType uEffectComma184 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kSetAIEyelid", 181, 184);
       EffectCommandType.kSetAIEyelid = uEffectComma14;
       EffectCommandType uEffectComma185 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kSetBeautifyPreviewPart", 182, 185);
       EffectCommandType.kSetBeautifyPreviewPart = uEffectComma16;
       EffectCommandType uEffectComma186 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kSetBeautifyPanelStatus", 183, 186);
       EffectCommandType.kSetBeautifyPanelStatus = uEffectComma14;
       EffectCommandType uEffectComma187 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kSetSmartBeautyIntensity", 184, 187);
       EffectCommandType.kSetSmartBeautyIntensity = uEffectComma16;
       EffectCommandType uEffectComma188 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kSetEnableSmartBeauty", 185, 188);
       EffectCommandType.kSetEnableSmartBeauty = uEffectComma14;
       EffectCommandType uEffectComma189 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kSetPassThroughParams", 186, 189);
       EffectCommandType.kSetPassThroughParams = uEffectComma16;
       EffectCommandType uEffectComma190 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kSetThermage", 187, 190);
       EffectCommandType.kSetThermage = uEffectComma14;
       EffectCommandType uEffectComma191 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kSetClientWorkProcess", 188, 191);
       EffectCommandType.kSetClientWorkProcess = uEffectComma16;
       EffectCommandType uEffectComma192 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kSetServerResult", 189, 192);
       EffectCommandType.kSetServerResult = uEffectComma14;
       EffectCommandType uEffectComma193 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kUpdatePickMoreMedia", 190, 193);
       EffectCommandType.kUpdatePickMoreMedia = uEffectComma16;
       EffectCommandType uEffectComma194 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kUpdateMoreClientWorkProgress", 191, 194);
       EffectCommandType.kUpdateMoreClientWorkProgress = uEffectComma14;
       EffectCommandType uEffectComma195 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("kUpdateCustomInputTexts", 192, 195);
       EffectCommandType.kUpdateCustomInputTexts = uEffectComma16;
       EffectCommandType uEffectComma196 = uEffectComma16;
       uEffectComma14 = new EffectCommandType("kSetDefinitionIntensity", 193, 196);
       EffectCommandType.kSetDefinitionIntensity = uEffectComma14;
       EffectCommandType uEffectComma197 = uEffectComma14;
       uEffectComma16 = new EffectCommandType("UNRECOGNIZED", 194, -1);
       EffectCommandType.UNRECOGNIZED = uEffectComma16;
       EffectCommandType[] uEffectComma198 = new EffectCommandType[195];
       uEffectComma198[0] = uEffectComma;
       uEffectComma198[1] = uEffectComma1;
       uEffectComma198[2] = uEffectComma2;
       uEffectComma198[3] = uEffectComma3;
       uEffectComma198[4] = uEffectComma4;
       uEffectComma198[5] = uEffectComma5;
       uEffectComma198[6] = uEffectComma6;
       uEffectComma198[7] = uEffectComma7;
       uEffectComma198[8] = uEffectComma8;
       uEffectComma198[9] = uEffectComma9;
       uEffectComma198[10] = uEffectComma10;
       uEffectComma198[11] = uEffectComma11;
       uEffectComma198[12] = uEffectComma13;
       uEffectComma198[13] = uEffectComma15;
       uEffectComma198[14] = uEffectComma17;
       uEffectComma198[15] = uEffectComma19;
       uEffectComma198[16] = uEffectComma20;
       uEffectComma198[17] = uEffectComma21;
       uEffectComma198[18] = uEffectComma22;
       uEffectComma198[19] = uEffectComma23;
       uEffectComma198[20] = uEffectComma24;
       uEffectComma198[21] = uEffectComma25;
       uEffectComma198[22] = uEffectComma26;
       uEffectComma198[23] = uEffectComma27;
       uEffectComma198[24] = uEffectComma28;
       uEffectComma198[25] = uEffectComma29;
       uEffectComma198[26] = uEffectComma30;
       uEffectComma198[27] = uEffectComma31;
       uEffectComma198[28] = uEffectComma32;
       uEffectComma198[29] = uEffectComma33;
       uEffectComma198[30] = uEffectComma34;
       uEffectComma198[31] = uEffectComma35;
       uEffectComma198[32] = uEffectComma36;
       uEffectComma198[33] = uEffectComma37;
       uEffectComma198[34] = uEffectComma38;
       uEffectComma198[35] = uEffectComma39;
       uEffectComma198[36] = uEffectComma40;
       uEffectComma198[37] = uEffectComma41;
       uEffectComma198[38] = uEffectComma42;
       uEffectComma198[39] = uEffectComma43;
       uEffectComma198[40] = uEffectComma44;
       uEffectComma198[41] = uEffectComma45;
       uEffectComma198[42] = uEffectComma46;
       uEffectComma198[43] = uEffectComma47;
       uEffectComma198[44] = uEffectComma48;
       uEffectComma198[45] = uEffectComma49;
       uEffectComma198[46] = uEffectComma50;
       uEffectComma198[47] = uEffectComma51;
       uEffectComma198[48] = uEffectComma52;
       uEffectComma198[49] = uEffectComma53;
       uEffectComma198[50] = uEffectComma54;
       uEffectComma198[51] = uEffectComma55;
       uEffectComma198[52] = uEffectComma56;
       uEffectComma198[53] = uEffectComma57;
       uEffectComma198[54] = uEffectComma58;
       uEffectComma198[55] = uEffectComma59;
       uEffectComma198[56] = uEffectComma60;
       uEffectComma198[57] = uEffectComma61;
       uEffectComma198[58] = uEffectComma62;
       uEffectComma198[59] = uEffectComma63;
       uEffectComma198[60] = uEffectComma64;
       uEffectComma198[61] = uEffectComma65;
       uEffectComma198[62] = uEffectComma66;
       uEffectComma198[63] = uEffectComma67;
       uEffectComma198[64] = uEffectComma68;
       uEffectComma198[65] = uEffectComma69;
       uEffectComma198[66] = uEffectComma70;
       uEffectComma198[67] = uEffectComma71;
       uEffectComma198[68] = uEffectComma72;
       uEffectComma198[69] = uEffectComma73;
       uEffectComma198[70] = uEffectComma74;
       uEffectComma198[71] = uEffectComma75;
       uEffectComma198[72] = uEffectComma76;
       uEffectComma198[73] = uEffectComma77;
       uEffectComma198[74] = uEffectComma78;
       uEffectComma198[75] = uEffectComma79;
       uEffectComma198[76] = uEffectComma80;
       uEffectComma198[77] = uEffectComma81;
       uEffectComma198[78] = uEffectComma82;
       uEffectComma198[79] = uEffectComma83;
       uEffectComma198[80] = uEffectComma84;
       uEffectComma198[81] = uEffectComma85;
       uEffectComma198[82] = uEffectComma86;
       uEffectComma198[83] = uEffectComma87;
       uEffectComma198[84] = uEffectComma88;
       uEffectComma198[85] = uEffectComma89;
       uEffectComma198[86] = uEffectComma90;
       uEffectComma198[87] = uEffectComma91;
       uEffectComma198[88] = uEffectComma92;
       uEffectComma198[89] = uEffectComma93;
       uEffectComma198[90] = uEffectComma94;
       uEffectComma198[91] = uEffectComma95;
       uEffectComma198[92] = uEffectComma96;
       uEffectComma198[93] = uEffectComma97;
       uEffectComma198[94] = uEffectComma98;
       uEffectComma198[95] = uEffectComma99;
       uEffectComma198[96] = uEffectComma100;
       uEffectComma198[97] = uEffectComma101;
       uEffectComma198[98] = uEffectComma102;
       uEffectComma198[99] = uEffectComma103;
       uEffectComma198[100] = uEffectComma104;
       uEffectComma198[101] = uEffectComma105;
       uEffectComma198[102] = uEffectComma106;
       uEffectComma198[103] = uEffectComma107;
       uEffectComma198[104] = uEffectComma108;
       uEffectComma198[105] = uEffectComma109;
       uEffectComma198[106] = uEffectComma110;
       uEffectComma198[107] = uEffectComma111;
       uEffectComma198[108] = uEffectComma112;
       uEffectComma198[109] = uEffectComma113;
       uEffectComma198[110] = uEffectComma114;
       uEffectComma198[111] = uEffectComma115;
       uEffectComma198[112] = uEffectComma116;
       uEffectComma198[113] = uEffectComma117;
       uEffectComma198[114] = uEffectComma118;
       uEffectComma198[115] = uEffectComma119;
       uEffectComma198[116] = uEffectComma120;
       uEffectComma198[117] = uEffectComma121;
       uEffectComma198[118] = uEffectComma122;
       uEffectComma198[119] = uEffectComma123;
       uEffectComma198[120] = uEffectComma124;
       uEffectComma198[121] = uEffectComma125;
       uEffectComma198[122] = uEffectComma126;
       uEffectComma198[123] = uEffectComma127;
       uEffectComma198[124] = uEffectComma128;
       uEffectComma198[125] = uEffectComma129;
       uEffectComma198[126] = uEffectComma130;
       uEffectComma198[127] = uEffectComma131;
       uEffectComma198[128] = uEffectComma132;
       uEffectComma198[129] = uEffectComma133;
       uEffectComma198[130] = uEffectComma134;
       uEffectComma198[131] = uEffectComma135;
       uEffectComma198[132] = uEffectComma136;
       uEffectComma198[133] = uEffectComma137;
       uEffectComma198[134] = uEffectComma138;
       uEffectComma198[135] = uEffectComma139;
       uEffectComma198[136] = uEffectComma140;
       uEffectComma198[137] = uEffectComma141;
       uEffectComma198[138] = uEffectComma142;
       uEffectComma198[139] = uEffectComma143;
       uEffectComma198[140] = uEffectComma144;
       uEffectComma198[141] = uEffectComma145;
       uEffectComma198[142] = uEffectComma146;
       uEffectComma198[143] = uEffectComma147;
       uEffectComma198[144] = uEffectComma148;
       uEffectComma198[145] = uEffectComma149;
       uEffectComma198[146] = uEffectComma150;
       uEffectComma198[147] = uEffectComma151;
       uEffectComma198[148] = uEffectComma152;
       uEffectComma198[149] = uEffectComma153;
       uEffectComma198[150] = uEffectComma154;
       uEffectComma198[151] = uEffectComma155;
       uEffectComma198[152] = uEffectComma156;
       uEffectComma198[153] = uEffectComma157;
       uEffectComma198[154] = uEffectComma158;
       uEffectComma198[155] = uEffectComma159;
       uEffectComma198[156] = uEffectComma160;
       uEffectComma198[157] = uEffectComma161;
       uEffectComma198[158] = uEffectComma162;
       uEffectComma198[159] = uEffectComma163;
       uEffectComma198[160] = uEffectComma164;
       uEffectComma198[161] = uEffectComma165;
       uEffectComma198[162] = uEffectComma166;
       uEffectComma198[163] = uEffectComma167;
       uEffectComma198[164] = uEffectComma168;
       uEffectComma198[165] = uEffectComma169;
       uEffectComma198[166] = uEffectComma170;
       uEffectComma198[167] = uEffectComma171;
       uEffectComma198[168] = uEffectComma172;
       uEffectComma198[169] = uEffectComma173;
       uEffectComma198[170] = uEffectComma174;
       uEffectComma198[171] = uEffectComma175;
       uEffectComma198[172] = uEffectComma176;
       uEffectComma198[173] = uEffectComma177;
       uEffectComma198[174] = uEffectComma178;
       uEffectComma198[175] = uEffectComma179;
       uEffectComma198[176] = uEffectComma180;
       uEffectComma198[177] = uEffectComma181;
       uEffectComma198[178] = uEffectComma182;
       uEffectComma198[179] = uEffectComma183;
       uEffectComma198[180] = uEffectComma184;
       uEffectComma198[181] = uEffectComma185;
       uEffectComma198[182] = uEffectComma186;
       uEffectComma198[183] = uEffectComma187;
       uEffectComma198[184] = uEffectComma188;
       uEffectComma198[185] = uEffectComma189;
       uEffectComma198[186] = uEffectComma190;
       uEffectComma198[187] = uEffectComma191;
       uEffectComma198[188] = uEffectComma192;
       uEffectComma198[189] = uEffectComma193;
       uEffectComma198[190] = uEffectComma194;
       uEffectComma198[191] = uEffectComma195;
       uEffectComma198[192] = uEffectComma196;
       uEffectComma198[193] = uEffectComma197;
       uEffectComma198[194] = uEffectComma16;
       EffectCommandType.$VALUES = uEffectComma198;
       EffectCommandType.internalValueMap = new EffectCommandType$1();
    }
    public void EffectCommandType(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static EffectCommandType forNumber(int p0){
       switch (p0){
           case 0:
             return EffectCommandType.kSetBright;
           case 1:
             return EffectCommandType.kSetSoften;
           case 2:
             return EffectCommandType.kSetDeformIntensity;
           case 3:
             return EffectCommandType.kSwitchLookupEffect;
           case 4:
             return EffectCommandType.kClearLookupEffect;
           case 5:
             return EffectCommandType.kSetlookupIntensity;
           case 6:
             return EffectCommandType.kSetMakeupResource;
           case 7:
             return EffectCommandType.kSetMakeupIntensity;
           case 8:
             return EffectCommandType.kSetSwapFaceImagePath;
           case 9:
             return EffectCommandType.kPause;
           case 10:
             return EffectCommandType.kResume;
           case 11:
             return EffectCommandType.kReset;
           case 15:
             return EffectCommandType.kSetGroupEffect;
           case 16:
             return EffectCommandType.kAppendCustomTrigger;
           case 17:
             return EffectCommandType.kAdjustEffectIntensity;
           case 18:
             return EffectCommandType.kFilterBasicAdjust;
           case 19:
             return EffectCommandType.kAdjustConfigLookupIntensity;
           case 20:
             return EffectCommandType.kAdjustConfigMakeupIntensity;
           case 21:
             return EffectCommandType.kSetInputText;
           case 22:
             return EffectCommandType.kRecordingStart;
           case 23:
             return EffectCommandType.kRecordingReset;
           case 24:
             return EffectCommandType.kRecordingPause;
           case 25:
             return EffectCommandType.kRecordingResume;
           case 26:
             return EffectCommandType.kRecordingFinish;
           case 27:
             return EffectCommandType.kRestoreMemojiJsonConfig;
           case 28:
             return EffectCommandType.kSetMemojiUserConfig;
           case 29:
             return EffectCommandType.kSetMemojiEditMode;
           case 30:
             return EffectCommandType.kSubmitMemojiUserConfig;
           case 31:
             return EffectCommandType.kGetMemojiIconBuffer;
           case 32:
             return EffectCommandType.kRefreshEffectHint;
           case '!':
             return EffectCommandType.kSetUserLocation;
           case '"':
             return EffectCommandType.kSetMusicWavePath;
           case '#':
             return EffectCommandType.kUpdateMusicWaveTime;
           case '$':
             return EffectCommandType.kSetCustomSticker;
           case '%':
             return EffectCommandType.kSetGenderUsingType;
           case '&':
             return EffectCommandType.kSetWrinkleRemove;
           case 39:
             return EffectCommandType.kSetEyeBagRemove;
           case '(':
             return EffectCommandType.kSetEyeBrighten;
           case ')':
             return EffectCommandType.kSetTeethBrighten;
           case '*':
             return EffectCommandType.kSetBeautifyLips;
           case '+':
             return EffectCommandType.kSetNoseShadow;
           case ',':
             return EffectCommandType.kCloseMagicAudio;
           case '-':
             return EffectCommandType.kResumeMagicAudio;
           case '.':
             return EffectCommandType.kBodySlimmingAdjust;
           case '/':
             return EffectCommandType.kBodySlimmingStatus;
           case '0':
             return EffectCommandType.kSetBeautifySecondBright;
           case '1':
             return EffectCommandType.kBeginEffectSlide;
           case '2':
             return EffectCommandType.kEndEffectSlide;
           case '3':
             return EffectCommandType.kUpdateEffectSlide;
           case '4':
             return EffectCommandType.kUseMaleMakeup;
           case '5':
             return EffectCommandType.kSetBeautifyFaceShadow;
           case '6':
             return EffectCommandType.kSetBeautifyClarity;
           case '7':
             return EffectCommandType.kSetAttachedEffectsBack;
           case '8':
             return EffectCommandType.kSeekTo;
           case '9':
             return EffectCommandType.kSetPlayrate;
           case ':':
             return EffectCommandType.kIsLivePK360p;
           case ';':
             return EffectCommandType.kSetBoomGameData;
           case '<':
             return EffectCommandType.kSetPickingMediaResource;
           case '=':
             return EffectCommandType.kSetSafeUIArea;
           case '>':
             return EffectCommandType.kEnableMagicFilter;
           case '?':
             return EffectCommandType.kSetInputTextFont;
           case '@':
             return EffectCommandType.kSetEvenSkin;
           case 'A':
             return EffectCommandType.kVideoLength;
           case 'B':
             return EffectCommandType.kM2UAdjustGroupMakeupIntensity;
           case 'C':
             return EffectCommandType.kM2UAdjustGroupLookupIntensity;
           case 'D':
             return EffectCommandType.KSetDoFlaw;
           case 'E':
             return EffectCommandType.kSetMakeupGenderIntensity;
           case 'F':
             return EffectCommandType.kAdjustConfigBokehDepthEnable;
           case 'G':
             return EffectCommandType.kAdjustConfigBokehDepthRadius;
           case 'H':
             return EffectCommandType.kAdjustConfigBokehDepthFocalLength;
           case 'I':
             return EffectCommandType.kAdjustConfigBokehDepthSpotShape;
           case 'J':
             return EffectCommandType.kShouldUseGenderForBeautyMakeup;
           case 'K':
             return EffectCommandType.kShouldUseFaceMaskForBeautyMakeup;
           case 'L':
             return EffectCommandType.kAdjustConfigBokehDepthTouchPos;
           case 'M':
             return EffectCommandType.kShouldUseFaceMaskForDGMakeup;
           case 'N':
             return EffectCommandType.kAdjustConfigBokehType;
           case 'O':
             return EffectCommandType.kAdjustConfigBokehQuality;
           case 'P':
             return EffectCommandType.kAdjustConfigBokehDepthMask;
           case 'Q':
             return EffectCommandType.kLoadBokehEffectMask;
           case 'R':
             return EffectCommandType.kAdjustHairSofteningStrength;
           case 'S':
             return EffectCommandType.kSetHairClipConfig;
           case 'T':
             return EffectCommandType.kAdjustHairSofteningMode;
           case 'U':
             return EffectCommandType.kRelightingAdjust;
           case 'V':
             return EffectCommandType.kBokehEffectEnalbeTestMode;
           case 'W':
             return EffectCommandType.kBokehEffectConfig;
           case 'X':
             return EffectCommandType.kContrastOriginal;
           case 'Y':
             return EffectCommandType.kBodySlimmingGradient;
           case 'Z':
             return EffectCommandType.kM2UAdjustGroupDeformIntensity;
           case '[':
             return EffectCommandType.kTakePicture;
           case 92:
             return EffectCommandType.kLiquify;
           case ']':
             return EffectCommandType.kLiquifyClear;
           case '^':
             return EffectCommandType.kLiquifyUndo;
           case '_':
             return EffectCommandType.kLiquifyRedo;
           case '`':
             return EffectCommandType.kLiquifyUpdateMesh;
           case 'a':
             return EffectCommandType.kSetFaceSegForBeauty;
           case 'b':
             return EffectCommandType.kSetHairDyeingConfig;
           case 'c':
             return EffectCommandType.kSetHairDyeingIntensity;
           case 'd':
             return EffectCommandType.kSetEditFlawParams;
           case 'e':
             return EffectCommandType.KSetEditStatus;
           case 'f':
             return EffectCommandType.KSetEditFlawAuto;
           case 'g':
             return EffectCommandType.KEditFlawClear;
           case 'h':
             return EffectCommandType.KEditFlawUndo;
           case 'i':
             return EffectCommandType.KEditFlawRedo;
           case 'j':
             return EffectCommandType.KEditFlawSave;
           case 'k':
             return EffectCommandType.KSetAutoFlawStatus;
           case 'l':
             return EffectCommandType.kSetOilPaintingIntensity;
           case 'm':
             return EffectCommandType.kSetOilPatiningResource;
           case 'n':
             return EffectCommandType.kOilPaintEnable;
           case 'o':
             return EffectCommandType.kOilPaintDisable;
           case 'p':
             return EffectCommandType.kSetClarityIntensity;
           case 'q':
             return EffectCommandType.kSetEvenSkinIntensity;
           case 'r':
             return EffectCommandType.kSetAnimojiData;
           case 's':
             return EffectCommandType.kShouldUseLandmarksMaskForBeautyMakeup;
           case 't':
             return EffectCommandType.kShouldUseLandmarksMaskForDGMakeup;
           case 'u':
             return EffectCommandType.kSetMakeupColor;
           case 'v':
             return EffectCommandType.kSetMakeupBlendMode;
           case 'w':
             return EffectCommandType.kSetClientTimeStamp;
           case 'x':
             return EffectCommandType.kSetSmartBeautify;
           case 'y':
             return EffectCommandType.kSetWhiteSkinIntensity;
           case 'z':
             return EffectCommandType.kSetWhiteSkinConfig;
           case '{':
             return EffectCommandType.kSetFastFlaw;
           case '|':
             return EffectCommandType.kSetMagicRemovelMask;
           case '}':
             return EffectCommandType.KSetMagicRemovelStatus;
           case '~':
             return EffectCommandType.KMagicRemovelUndo;
           case 127:
             return EffectCommandType.KMagicRemovelRedo;
           case 128:
             return EffectCommandType.kSetOilFreeIntensity;
           case 129:
             return EffectCommandType.kSetFaceTextureIntensity;
           case 130:
             return EffectCommandType.kUseLowPowerSensor;
           case 131:
             return EffectCommandType.KSetBigeyeOptimization;
           case 132:
             return EffectCommandType.kSetMVLookupFirst;
           case 133:
             return EffectCommandType.kUseSkinAndHairSegModel;
           case 134:
             return EffectCommandType.kSetWeakenMakeupIntensityProp;
           case 135:
             return EffectCommandType.kSetSameTemplateOrder;
           case 136:
             return EffectCommandType.kSetBeautifyGroupPath;
           case 137:
             return EffectCommandType.kEnlargeMaxFaceCount;
           case 138:
             return EffectCommandType.kSetMagnifierShape;
           case 139:
             return EffectCommandType.kSetMagnifierBorderColor;
           case 140:
             return EffectCommandType.kSetMagnifierBorderWidth;
           case 141:
             return EffectCommandType.kScaleMagnifier;
           case 142:
             return EffectCommandType.kSetMagnifierBorderRadius;
           case 143:
             return EffectCommandType.kMoveMagnifierBorder;
           case 144:
             return EffectCommandType.kSetMagnifierCanvasSize;
           case 145:
             return EffectCommandType.kAddMagnifierItem;
           case 146:
             return EffectCommandType.kDeleteMagnifierItem;
           case 147:
             return EffectCommandType.KSetMakeupChildToZero;
           case 148:
             return EffectCommandType.KStopUpdate;
           case 149:
             return EffectCommandType.kSetFlashLightIntensity;
           case 150:
             return EffectCommandType.KRefreshOilPainting;
           case 151:
             return EffectCommandType.kSetManualWrinkleCleanerMask;
           case 152:
             return EffectCommandType.KSetManualWrinkleCleanerStatus;
           case 153:
             return EffectCommandType.KManualWrinkleCleanerUndo;
           case 154:
             return EffectCommandType.KManualWrinkleCleanerRedo;
           case 155:
             return EffectCommandType.kEnableUndoWarpEdit;
           case 156:
             return EffectCommandType.kEnableUndoWarpPhoto;
           case 157:
             return EffectCommandType.kEnableUndoWarpPhotoRefreshData;
           case 158:
             return EffectCommandType.kEnableMakeupBackLight;
           case 159:
             return EffectCommandType.kSetStickerEnable;
           case 160:
             return EffectCommandType.kSetStickers;
           case 161:
             return EffectCommandType.kUpdateSticker;
           case 162:
             return EffectCommandType.kAdjustConfigBokehDepthSegmentationData;
           case 163:
             return EffectCommandType.kSetBeautyZeroOptIntensity;
           case 164:
             return EffectCommandType.kRestoreMakeupResource;
           case 165:
             return EffectCommandType.kTriggerInputText;
           case 166:
             return EffectCommandType.kExportSticker;
           case 167:
             return EffectCommandType.kSwitchBeautifyVersion;
           case 168:
             return EffectCommandType.kSetMakeupPenBrushColor;
           case 169:
             return EffectCommandType.kSetMakeupPenBrushType;
           case 170:
             return EffectCommandType.kSetMakeupPenBrushHardness;
           case 171:
             return EffectCommandType.kSetMakeupPenBrushIntensity;
           case 172:
             return EffectCommandType.kSetMakeupPenPointSize;
           case 173:
             return EffectCommandType.kSetMakeupPenPointStride;
           case 174:
             return EffectCommandType.kSetMakeupPenPoint;
           case 175:
             return EffectCommandType.kSetMakeupPenUndo;
           case 176:
             return EffectCommandType.kSetMakeupPenRedo;
           case 177:
             return EffectCommandType.kSetMakeupPenClear;
           case 178:
             return EffectCommandType.kSetMakeupPenLiveTime;
           case 179:
             return EffectCommandType.kSetMakeupPenEraserColor;
           case 180:
             return EffectCommandType.kSetAIDeFlaw;
           case 181:
             return EffectCommandType.kSetBeautyAnyType;
           case 182:
             return EffectCommandType.kSetWocan;
           case 183:
             return EffectCommandType.kSetWaterskin;
           case 184:
             return EffectCommandType.kSetAIEyelid;
           case 185:
             return EffectCommandType.kSetBeautifyPreviewPart;
           case 186:
             return EffectCommandType.kSetBeautifyPanelStatus;
           case 187:
             return EffectCommandType.kSetSmartBeautyIntensity;
           case 188:
             return EffectCommandType.kSetEnableSmartBeauty;
           case 189:
             return EffectCommandType.kSetPassThroughParams;
           case 190:
             return EffectCommandType.kSetThermage;
           case 191:
             return EffectCommandType.kSetClientWorkProcess;
           case 192:
             return EffectCommandType.kSetServerResult;
           case 193:
             return EffectCommandType.kUpdatePickMoreMedia;
           case 194:
             return EffectCommandType.kUpdateMoreClientWorkProgress;
           case 195:
             return EffectCommandType.kUpdateCustomInputTexts;
           case 196:
             return EffectCommandType.kSetDefinitionIntensity;
           default:
          label_0003 :
             return null;
       }
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return EffectCommandType.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return EffectCommandType$EffectCommandTypeVerifier.INSTANCE;
    }
    public static EffectCommandType valueOf(int p0){
       return EffectCommandType.forNumber(p0);
    }
    public static EffectCommandType valueOf(String p0){
       return Enum.valueOf(EffectCommandType.class, p0);
    }
    public static EffectCommandType[] values(){
       return EffectCommandType.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != EffectCommandType.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
