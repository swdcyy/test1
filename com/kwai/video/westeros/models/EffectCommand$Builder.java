package com.kwai.video.westeros.models.EffectCommand$Builder;
import com.kwai.video.westeros.models.EffectCommandOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.EffectCommand;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.EffectCommand$1;
import java.lang.Iterable;
import com.kwai.video.westeros.models.CustomInputText$Builder;
import com.kwai.video.westeros.models.CustomInputText;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kwai.video.westeros.models.MakeupResource$Builder;
import com.kwai.video.westeros.models.MakeupResource;
import com.kwai.video.westeros.models.PickingMediaData$Builder;
import com.kwai.video.westeros.models.PickingMediaData;
import com.kwai.video.westeros.models.StickerInfo$Builder;
import com.kwai.video.westeros.models.StickerInfo;
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
import java.util.List;
import java.util.Collections;
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
import com.kwai.video.westeros.models.PickingMediaResType;
import com.kwai.video.westeros.models.RelightingConfig;
import com.kwai.video.westeros.models.SafeUIArea;
import com.kwai.video.westeros.models.EditFlawConfig;
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

public final class EffectCommand$Builder extends GeneratedMessageLite$Builder implements EffectCommandOrBuilder	// class@000f03
{

    public void EffectCommand$Builder(){
       super(EffectCommand.DEFAULT_INSTANCE);
    }
    public void EffectCommand$Builder(EffectCommand$1 p0){
       super();
    }
    public EffectCommand$Builder addAllCustomInputTexts(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllCustomInputTexts(p0);
       return this;
    }
    public EffectCommand$Builder addAllEffectKeys(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllEffectKeys(p0);
       return this;
    }
    public EffectCommand$Builder addAllFaceDeformSelection(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllFaceDeformSelection(p0);
       return this;
    }
    public EffectCommand$Builder addAllMagnifierBorderColor(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllMagnifierBorderColor(p0);
       return this;
    }
    public EffectCommand$Builder addAllMagnifierCanvasSize(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllMagnifierCanvasSize(p0);
       return this;
    }
    public EffectCommand$Builder addAllMakeupResource(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllMakeupResource(p0);
       return this;
    }
    public EffectCommand$Builder addAllMoreMediaData(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllMoreMediaData(p0);
       return this;
    }
    public EffectCommand$Builder addAllMoveMagnifierContentDistance(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllMoveMagnifierContentDistance(p0);
       return this;
    }
    public EffectCommand$Builder addAllStickers(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllStickers(p0);
       return this;
    }
    public EffectCommand$Builder addCustomInputTexts(int p0,CustomInputText$Builder p1){
       this.copyOnWrite();
       this.instance.addCustomInputTexts(p0, p1);
       return this;
    }
    public EffectCommand$Builder addCustomInputTexts(int p0,CustomInputText p1){
       this.copyOnWrite();
       this.instance.addCustomInputTexts(p0, p1);
       return this;
    }
    public EffectCommand$Builder addCustomInputTexts(CustomInputText$Builder p0){
       this.copyOnWrite();
       this.instance.addCustomInputTexts(p0);
       return this;
    }
    public EffectCommand$Builder addCustomInputTexts(CustomInputText p0){
       this.copyOnWrite();
       this.instance.addCustomInputTexts(p0);
       return this;
    }
    public EffectCommand$Builder addEffectKeys(String p0){
       this.copyOnWrite();
       this.instance.addEffectKeys(p0);
       return this;
    }
    public EffectCommand$Builder addEffectKeysBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.addEffectKeysBytes(p0);
       return this;
    }
    public EffectCommand$Builder addFaceDeformSelection(int p0){
       this.copyOnWrite();
       this.instance.addFaceDeformSelection(p0);
       return this;
    }
    public EffectCommand$Builder addMagnifierBorderColor(float p0){
       this.copyOnWrite();
       this.instance.addMagnifierBorderColor(p0);
       return this;
    }
    public EffectCommand$Builder addMagnifierCanvasSize(float p0){
       this.copyOnWrite();
       this.instance.addMagnifierCanvasSize(p0);
       return this;
    }
    public EffectCommand$Builder addMakeupResource(int p0,MakeupResource$Builder p1){
       this.copyOnWrite();
       this.instance.addMakeupResource(p0, p1);
       return this;
    }
    public EffectCommand$Builder addMakeupResource(int p0,MakeupResource p1){
       this.copyOnWrite();
       this.instance.addMakeupResource(p0, p1);
       return this;
    }
    public EffectCommand$Builder addMakeupResource(MakeupResource$Builder p0){
       this.copyOnWrite();
       this.instance.addMakeupResource(p0);
       return this;
    }
    public EffectCommand$Builder addMakeupResource(MakeupResource p0){
       this.copyOnWrite();
       this.instance.addMakeupResource(p0);
       return this;
    }
    public EffectCommand$Builder addMoreMediaData(int p0,PickingMediaData$Builder p1){
       this.copyOnWrite();
       this.instance.addMoreMediaData(p0, p1);
       return this;
    }
    public EffectCommand$Builder addMoreMediaData(int p0,PickingMediaData p1){
       this.copyOnWrite();
       this.instance.addMoreMediaData(p0, p1);
       return this;
    }
    public EffectCommand$Builder addMoreMediaData(PickingMediaData$Builder p0){
       this.copyOnWrite();
       this.instance.addMoreMediaData(p0);
       return this;
    }
    public EffectCommand$Builder addMoreMediaData(PickingMediaData p0){
       this.copyOnWrite();
       this.instance.addMoreMediaData(p0);
       return this;
    }
    public EffectCommand$Builder addMoveMagnifierContentDistance(float p0){
       this.copyOnWrite();
       this.instance.addMoveMagnifierContentDistance(p0);
       return this;
    }
    public EffectCommand$Builder addStickers(int p0,StickerInfo$Builder p1){
       this.copyOnWrite();
       this.instance.addStickers(p0, p1);
       return this;
    }
    public EffectCommand$Builder addStickers(int p0,StickerInfo p1){
       this.copyOnWrite();
       this.instance.addStickers(p0, p1);
       return this;
    }
    public EffectCommand$Builder addStickers(StickerInfo$Builder p0){
       this.copyOnWrite();
       this.instance.addStickers(p0);
       return this;
    }
    public EffectCommand$Builder addStickers(StickerInfo p0){
       this.copyOnWrite();
       this.instance.addStickers(p0);
       return this;
    }
    public EffectCommand$Builder clearAdjustEffectType(){
       this.copyOnWrite();
       this.instance.clearAdjustEffectType();
       return this;
    }
    public EffectCommand$Builder clearAideflawIntensity(){
       this.copyOnWrite();
       this.instance.clearAideflawIntensity();
       return this;
    }
    public EffectCommand$Builder clearAieyelidIntensity(){
       this.copyOnWrite();
       this.instance.clearAieyelidIntensity();
       return this;
    }
    public EffectCommand$Builder clearAllDeletedWhenResetRecording(){
       this.copyOnWrite();
       this.instance.clearAllDeletedWhenResetRecording();
       return this;
    }
    public EffectCommand$Builder clearAnimojiData(){
       this.copyOnWrite();
       this.instance.clearAnimojiData();
       return this;
    }
    public EffectCommand$Builder clearBasicAdjustIntensity(){
       this.copyOnWrite();
       this.instance.clearBasicAdjustIntensity();
       return this;
    }
    public EffectCommand$Builder clearBeautifyGroupPath(){
       this.copyOnWrite();
       this.instance.clearBeautifyGroupPath();
       return this;
    }
    public EffectCommand$Builder clearBeautifyLipsIntensity(){
       this.copyOnWrite();
       this.instance.clearBeautifyLipsIntensity();
       return this;
    }
    public EffectCommand$Builder clearBeautifyPanelStatus(){
       this.copyOnWrite();
       this.instance.clearBeautifyPanelStatus();
       return this;
    }
    public EffectCommand$Builder clearBeautifyPreviewPart(){
       this.copyOnWrite();
       this.instance.clearBeautifyPreviewPart();
       return this;
    }
    public EffectCommand$Builder clearBeautifySecondBrightIntensity(){
       this.copyOnWrite();
       this.instance.clearBeautifySecondBrightIntensity();
       return this;
    }
    public EffectCommand$Builder clearBeautyAnyIntensity(){
       this.copyOnWrite();
       this.instance.clearBeautyAnyIntensity();
       return this;
    }
    public EffectCommand$Builder clearBeautyAnyType(){
       this.copyOnWrite();
       this.instance.clearBeautyAnyType();
       return this;
    }
    public EffectCommand$Builder clearBeautyzerooptIntensity(){
       this.copyOnWrite();
       this.instance.clearBeautyzerooptIntensity();
       return this;
    }
    public EffectCommand$Builder clearBlendMode(){
       this.copyOnWrite();
       this.instance.clearBlendMode();
       return this;
    }
    public EffectCommand$Builder clearBodySlimmingAdjustIntensity(){
       this.copyOnWrite();
       this.instance.clearBodySlimmingAdjustIntensity();
       return this;
    }
    public EffectCommand$Builder clearBodySlimmingAdjustType(){
       this.copyOnWrite();
       this.instance.clearBodySlimmingAdjustType();
       return this;
    }
    public EffectCommand$Builder clearBodySlimmingGradient(){
       this.copyOnWrite();
       this.instance.clearBodySlimmingGradient();
       return this;
    }
    public EffectCommand$Builder clearBokehDepthConfig(){
       this.copyOnWrite();
       this.instance.clearBokehDepthConfig();
       return this;
    }
    public EffectCommand$Builder clearBokehDepthEnable(){
       this.copyOnWrite();
       this.instance.clearBokehDepthEnable();
       return this;
    }
    public EffectCommand$Builder clearBokehDepthEnableTestMode(){
       this.copyOnWrite();
       this.instance.clearBokehDepthEnableTestMode();
       return this;
    }
    public EffectCommand$Builder clearBokehDepthFocalLength(){
       this.copyOnWrite();
       this.instance.clearBokehDepthFocalLength();
       return this;
    }
    public EffectCommand$Builder clearBokehDepthMask(){
       this.copyOnWrite();
       this.instance.clearBokehDepthMask();
       return this;
    }
    public EffectCommand$Builder clearBokehDepthQuality(){
       this.copyOnWrite();
       this.instance.clearBokehDepthQuality();
       return this;
    }
    public EffectCommand$Builder clearBokehDepthRadius(){
       this.copyOnWrite();
       this.instance.clearBokehDepthRadius();
       return this;
    }
    public EffectCommand$Builder clearBokehDepthSpotShape(){
       this.copyOnWrite();
       this.instance.clearBokehDepthSpotShape();
       return this;
    }
    public EffectCommand$Builder clearBokehDepthTouchPosition(){
       this.copyOnWrite();
       this.instance.clearBokehDepthTouchPosition();
       return this;
    }
    public EffectCommand$Builder clearBokehDepthType(){
       this.copyOnWrite();
       this.instance.clearBokehDepthType();
       return this;
    }
    public EffectCommand$Builder clearBoomGameJson(){
       this.copyOnWrite();
       this.instance.clearBoomGameJson();
       return this;
    }
    public EffectCommand$Builder clearBright(){
       this.copyOnWrite();
       this.instance.clearBright();
       return this;
    }
    public EffectCommand$Builder clearClarityIntensity(){
       this.copyOnWrite();
       this.instance.clearClarityIntensity();
       return this;
    }
    public EffectCommand$Builder clearClientWorkProcess(){
       this.copyOnWrite();
       this.instance.clearClientWorkProcess();
       return this;
    }
    public EffectCommand$Builder clearClientWorkProgresses(){
       this.copyOnWrite();
       this.instance.clearClientWorkProgresses();
       return this;
    }
    public EffectCommand$Builder clearColoringContent(){
       this.copyOnWrite();
       this.instance.clearColoringContent();
       return this;
    }
    public EffectCommand$Builder clearCommandType(){
       this.copyOnWrite();
       this.instance.clearCommandType();
       return this;
    }
    public EffectCommand$Builder clearCustomInputTexts(){
       this.copyOnWrite();
       this.instance.clearCustomInputTexts();
       return this;
    }
    public EffectCommand$Builder clearCustomStickerJson(){
       this.copyOnWrite();
       this.instance.clearCustomStickerJson();
       return this;
    }
    public EffectCommand$Builder clearCustomTriggerType(){
       this.copyOnWrite();
       this.instance.clearCustomTriggerType();
       return this;
    }
    public EffectCommand$Builder clearDefinitionIntensity(){
       this.copyOnWrite();
       this.instance.clearDefinitionIntensity();
       return this;
    }
    public EffectCommand$Builder clearDeformIndensity(){
       this.copyOnWrite();
       this.instance.clearDeformIndensity();
       return this;
    }
    public EffectCommand$Builder clearDeformMode(){
       this.copyOnWrite();
       this.instance.clearDeformMode();
       return this;
    }
    public EffectCommand$Builder clearEffectIntensity(){
       this.copyOnWrite();
       this.instance.clearEffectIntensity();
       return this;
    }
    public EffectCommand$Builder clearEffectKeys(){
       this.copyOnWrite();
       this.instance.clearEffectKeys();
       return this;
    }
    public EffectCommand$Builder clearEnableBigeyeOptimization(){
       this.copyOnWrite();
       this.instance.clearEnableBigeyeOptimization();
       return this;
    }
    public EffectCommand$Builder clearEnableEnlargeMaxFaceCount(){
       this.copyOnWrite();
       this.instance.clearEnableEnlargeMaxFaceCount();
       return this;
    }
    public EffectCommand$Builder clearEnableMagicFilter(){
       this.copyOnWrite();
       this.instance.clearEnableMagicFilter();
       return this;
    }
    public EffectCommand$Builder clearEnableMakeupChildToZero(){
       this.copyOnWrite();
       this.instance.clearEnableMakeupChildToZero();
       return this;
    }
    public EffectCommand$Builder clearEnableMvLookupFirst(){
       this.copyOnWrite();
       this.instance.clearEnableMvLookupFirst();
       return this;
    }
    public EffectCommand$Builder clearEnableSmartBeautify(){
       this.copyOnWrite();
       this.instance.clearEnableSmartBeautify();
       return this;
    }
    public EffectCommand$Builder clearEnableSmartBeauty(){
       this.copyOnWrite();
       this.instance.clearEnableSmartBeauty();
       return this;
    }
    public EffectCommand$Builder clearEnableUndoWarpEdit(){
       this.copyOnWrite();
       this.instance.clearEnableUndoWarpEdit();
       return this;
    }
    public EffectCommand$Builder clearEnableUndoWarpPhoto(){
       this.copyOnWrite();
       this.instance.clearEnableUndoWarpPhoto();
       return this;
    }
    public EffectCommand$Builder clearEnableUndoWarpPhotoRefreshData(){
       this.copyOnWrite();
       this.instance.clearEnableUndoWarpPhotoRefreshData();
       return this;
    }
    public EffectCommand$Builder clearEndPoint(){
       this.copyOnWrite();
       this.instance.clearEndPoint();
       return this;
    }
    public EffectCommand$Builder clearEvenSkinIntensity(){
       this.copyOnWrite();
       this.instance.clearEvenSkinIntensity();
       return this;
    }
    public EffectCommand$Builder clearEyeBagRemoveIntensity(){
       this.copyOnWrite();
       this.instance.clearEyeBagRemoveIntensity();
       return this;
    }
    public EffectCommand$Builder clearEyeBrightenIntensity(){
       this.copyOnWrite();
       this.instance.clearEyeBrightenIntensity();
       return this;
    }
    public EffectCommand$Builder clearFaceDeformSelection(){
       this.copyOnWrite();
       this.instance.clearFaceDeformSelection();
       return this;
    }
    public EffectCommand$Builder clearFaceShadowIntensity(){
       this.copyOnWrite();
       this.instance.clearFaceShadowIntensity();
       return this;
    }
    public EffectCommand$Builder clearFaceTextureIntensity(){
       this.copyOnWrite();
       this.instance.clearFaceTextureIntensity();
       return this;
    }
    public EffectCommand$Builder clearFilterBasicAdjustType(){
       this.copyOnWrite();
       this.instance.clearFilterBasicAdjustType();
       return this;
    }
    public EffectCommand$Builder clearFlashlightIntensity(){
       this.copyOnWrite();
       this.instance.clearFlashlightIntensity();
       return this;
    }
    public EffectCommand$Builder clearGenderUsingType(){
       this.copyOnWrite();
       this.instance.clearGenderUsingType();
       return this;
    }
    public EffectCommand$Builder clearGroupEffect(){
       this.copyOnWrite();
       this.instance.clearGroupEffect();
       return this;
    }
    public EffectCommand$Builder clearGroupName(){
       this.copyOnWrite();
       this.instance.clearGroupName();
       return this;
    }
    public EffectCommand$Builder clearHairClipConfig(){
       this.copyOnWrite();
       this.instance.clearHairClipConfig();
       return this;
    }
    public EffectCommand$Builder clearHairDyeingMode(){
       this.copyOnWrite();
       this.instance.clearHairDyeingMode();
       return this;
    }
    public EffectCommand$Builder clearHairSofteningImageMode(){
       this.copyOnWrite();
       this.instance.clearHairSofteningImageMode();
       return this;
    }
    public EffectCommand$Builder clearHairSofteningStrength(){
       this.copyOnWrite();
       this.instance.clearHairSofteningStrength();
       return this;
    }
    public EffectCommand$Builder clearHumanMattingType(){
       this.copyOnWrite();
       this.instance.clearHumanMattingType();
       return this;
    }
    public EffectCommand$Builder clearInputText(){
       this.copyOnWrite();
       this.instance.clearInputText();
       return this;
    }
    public EffectCommand$Builder clearInputTextIndex(){
       this.copyOnWrite();
       this.instance.clearInputTextIndex();
       return this;
    }
    public EffectCommand$Builder clearIntensityWeight(){
       this.copyOnWrite();
       this.instance.clearIntensityWeight();
       return this;
    }
    public EffectCommand$Builder clearIntputTextFont(){
       this.copyOnWrite();
       this.instance.clearIntputTextFont();
       return this;
    }
    public EffectCommand$Builder clearIsActive(){
       this.copyOnWrite();
       this.instance.clearIsActive();
       return this;
    }
    public EffectCommand$Builder clearIsEditAutoStatus(){
       this.copyOnWrite();
       this.instance.clearIsEditAutoStatus();
       return this;
    }
    public EffectCommand$Builder clearIsEditFlawAuto(){
       this.copyOnWrite();
       this.instance.clearIsEditFlawAuto();
       return this;
    }
    public EffectCommand$Builder clearIsEditStatus(){
       this.copyOnWrite();
       this.instance.clearIsEditStatus();
       return this;
    }
    public EffectCommand$Builder clearIsLivePk360P(){
       this.copyOnWrite();
       this.instance.clearIsLivePk360P();
       return this;
    }
    public EffectCommand$Builder clearIsMagicRemovelStatus(){
       this.copyOnWrite();
       this.instance.clearIsMagicRemovelStatus();
       return this;
    }
    public EffectCommand$Builder clearIsMainSticker(){
       this.copyOnWrite();
       this.instance.clearIsMainSticker();
       return this;
    }
    public EffectCommand$Builder clearIsOpenFlaw(){
       this.copyOnWrite();
       this.instance.clearIsOpenFlaw();
       return this;
    }
    public EffectCommand$Builder clearLiquifyIntensity(){
       this.copyOnWrite();
       this.instance.clearLiquifyIntensity();
       return this;
    }
    public EffectCommand$Builder clearLiquifyRadius(){
       this.copyOnWrite();
       this.instance.clearLiquifyRadius();
       return this;
    }
    public EffectCommand$Builder clearLiquifySize(){
       this.copyOnWrite();
       this.instance.clearLiquifySize();
       return this;
    }
    public EffectCommand$Builder clearLiquifyStride(){
       this.copyOnWrite();
       this.instance.clearLiquifyStride();
       return this;
    }
    public EffectCommand$Builder clearLiquifyType(){
       this.copyOnWrite();
       this.instance.clearLiquifyType();
       return this;
    }
    public EffectCommand$Builder clearLiquifyistouchbegin(){
       this.copyOnWrite();
       this.instance.clearLiquifyistouchbegin();
       return this;
    }
    public EffectCommand$Builder clearLiquifyistouchend(){
       this.copyOnWrite();
       this.instance.clearLiquifyistouchend();
       return this;
    }
    public EffectCommand$Builder clearLookupDimension(){
       this.copyOnWrite();
       this.instance.clearLookupDimension();
       return this;
    }
    public EffectCommand$Builder clearLookupIntensity(){
       this.copyOnWrite();
       this.instance.clearLookupIntensity();
       return this;
    }
    public EffectCommand$Builder clearLookupParam(){
       this.copyOnWrite();
       this.instance.clearLookupParam();
       return this;
    }
    public EffectCommand$Builder clearLookupPath(){
       this.copyOnWrite();
       this.instance.clearLookupPath();
       return this;
    }
    public EffectCommand$Builder clearLookupSlideParam(){
       this.copyOnWrite();
       this.instance.clearLookupSlideParam();
       return this;
    }
    public EffectCommand$Builder clearLookupType(){
       this.copyOnWrite();
       this.instance.clearLookupType();
       return this;
    }
    public EffectCommand$Builder clearMagicRemovelMask(){
       this.copyOnWrite();
       this.instance.clearMagicRemovelMask();
       return this;
    }
    public EffectCommand$Builder clearMagnifierBorderColor(){
       this.copyOnWrite();
       this.instance.clearMagnifierBorderColor();
       return this;
    }
    public EffectCommand$Builder clearMagnifierBorderRadius(){
       this.copyOnWrite();
       this.instance.clearMagnifierBorderRadius();
       return this;
    }
    public EffectCommand$Builder clearMagnifierBorderWidth(){
       this.copyOnWrite();
       this.instance.clearMagnifierBorderWidth();
       return this;
    }
    public EffectCommand$Builder clearMagnifierCanvasSize(){
       this.copyOnWrite();
       this.instance.clearMagnifierCanvasSize();
       return this;
    }
    public EffectCommand$Builder clearMagnifierContentScale(){
       this.copyOnWrite();
       this.instance.clearMagnifierContentScale();
       return this;
    }
    public EffectCommand$Builder clearMagnifierFaceTrackId(){
       this.copyOnWrite();
       this.instance.clearMagnifierFaceTrackId();
       return this;
    }
    public EffectCommand$Builder clearMagnifierShapePath(){
       this.copyOnWrite();
       this.instance.clearMagnifierShapePath();
       return this;
    }
    public EffectCommand$Builder clearMakeUpPenBrushIntensity(){
       this.copyOnWrite();
       this.instance.clearMakeUpPenBrushIntensity();
       return this;
    }
    public EffectCommand$Builder clearMakeupBackLightMode(){
       this.copyOnWrite();
       this.instance.clearMakeupBackLightMode();
       return this;
    }
    public EffectCommand$Builder clearMakeupBlendMode(){
       this.copyOnWrite();
       this.instance.clearMakeupBlendMode();
       return this;
    }
    public EffectCommand$Builder clearMakeupColor(){
       this.copyOnWrite();
       this.instance.clearMakeupColor();
       return this;
    }
    public EffectCommand$Builder clearMakeupIntensity(){
       this.copyOnWrite();
       this.instance.clearMakeupIntensity();
       return this;
    }
    public EffectCommand$Builder clearMakeupMode(){
       this.copyOnWrite();
       this.instance.clearMakeupMode();
       return this;
    }
    public EffectCommand$Builder clearMakeupPenBrushColor(){
       this.copyOnWrite();
       this.instance.clearMakeupPenBrushColor();
       return this;
    }
    public EffectCommand$Builder clearMakeupPenBrushHardness(){
       this.copyOnWrite();
       this.instance.clearMakeupPenBrushHardness();
       return this;
    }
    public EffectCommand$Builder clearMakeupPenBrushTexturePath(){
       this.copyOnWrite();
       this.instance.clearMakeupPenBrushTexturePath();
       return this;
    }
    public EffectCommand$Builder clearMakeupPenBrushType(){
       this.copyOnWrite();
       this.instance.clearMakeupPenBrushType();
       return this;
    }
    public EffectCommand$Builder clearMakeupPenEraserColor(){
       this.copyOnWrite();
       this.instance.clearMakeupPenEraserColor();
       return this;
    }
    public EffectCommand$Builder clearMakeupPenEraserLiveTime(){
       this.copyOnWrite();
       this.instance.clearMakeupPenEraserLiveTime();
       return this;
    }
    public EffectCommand$Builder clearMakeupPenHighLightTexturePath(){
       this.copyOnWrite();
       this.instance.clearMakeupPenHighLightTexturePath();
       return this;
    }
    public EffectCommand$Builder clearMakeupPenIsEraser(){
       this.copyOnWrite();
       this.instance.clearMakeupPenIsEraser();
       return this;
    }
    public EffectCommand$Builder clearMakeupPenPointSize(){
       this.copyOnWrite();
       this.instance.clearMakeupPenPointSize();
       return this;
    }
    public EffectCommand$Builder clearMakeupPenPointStride(){
       this.copyOnWrite();
       this.instance.clearMakeupPenPointStride();
       return this;
    }
    public EffectCommand$Builder clearMakeupPenTouch(){
       this.copyOnWrite();
       this.instance.clearMakeupPenTouch();
       return this;
    }
    public EffectCommand$Builder clearMakeupResource(){
       this.copyOnWrite();
       this.instance.clearMakeupResource();
       return this;
    }
    public EffectCommand$Builder clearMemojiEnableEditMode(){
       this.copyOnWrite();
       this.instance.clearMemojiEnableEditMode();
       return this;
    }
    public EffectCommand$Builder clearMemojiGroup(){
       this.copyOnWrite();
       this.instance.clearMemojiGroup();
       return this;
    }
    public EffectCommand$Builder clearMemojiIconHeight(){
       this.copyOnWrite();
       this.instance.clearMemojiIconHeight();
       return this;
    }
    public EffectCommand$Builder clearMemojiIconWidth(){
       this.copyOnWrite();
       this.instance.clearMemojiIconWidth();
       return this;
    }
    public EffectCommand$Builder clearMemojiStyle(){
       this.copyOnWrite();
       this.instance.clearMemojiStyle();
       return this;
    }
    public EffectCommand$Builder clearMemojiUserConfigJson(){
       this.copyOnWrite();
       this.instance.clearMemojiUserConfigJson();
       return this;
    }
    public EffectCommand$Builder clearMoreMediaData(){
       this.copyOnWrite();
       this.instance.clearMoreMediaData();
       return this;
    }
    public EffectCommand$Builder clearMoveMagnifierContentDistance(){
       this.copyOnWrite();
       this.instance.clearMoveMagnifierContentDistance();
       return this;
    }
    public EffectCommand$Builder clearMusicWavePath(){
       this.copyOnWrite();
       this.instance.clearMusicWavePath();
       return this;
    }
    public EffectCommand$Builder clearMusicWaveTime(){
       this.copyOnWrite();
       this.instance.clearMusicWaveTime();
       return this;
    }
    public EffectCommand$Builder clearNEditFlawUndoNums(){
       this.copyOnWrite();
       this.instance.clearNEditFlawUndoNums();
       return this;
    }
    public EffectCommand$Builder clearNMagicRemovelUndoNums(){
       this.copyOnWrite();
       this.instance.clearNMagicRemovelUndoNums();
       return this;
    }
    public EffectCommand$Builder clearNeedMakeupClearOldResource(){
       this.copyOnWrite();
       this.instance.clearNeedMakeupClearOldResource();
       return this;
    }
    public EffectCommand$Builder clearNoseShadowIntensity(){
       this.copyOnWrite();
       this.instance.clearNoseShadowIntensity();
       return this;
    }
    public EffectCommand$Builder clearOilfreeIntensity(){
       this.copyOnWrite();
       this.instance.clearOilfreeIntensity();
       return this;
    }
    public EffectCommand$Builder clearOilpaintSourcePath(){
       this.copyOnWrite();
       this.instance.clearOilpaintSourcePath();
       return this;
    }
    public EffectCommand$Builder clearPassThroughParams(){
       this.copyOnWrite();
       this.instance.clearPassThroughParams();
       return this;
    }
    public EffectCommand$Builder clearPickingMediaPath(){
       this.copyOnWrite();
       this.instance.clearPickingMediaPath();
       return this;
    }
    public EffectCommand$Builder clearPickingMediaType(){
       this.copyOnWrite();
       this.instance.clearPickingMediaType();
       return this;
    }
    public EffectCommand$Builder clearPlayrate(){
       this.copyOnWrite();
       this.instance.clearPlayrate();
       return this;
    }
    public EffectCommand$Builder clearRelightingConfig(){
       this.copyOnWrite();
       this.instance.clearRelightingConfig();
       return this;
    }
    public EffectCommand$Builder clearSafeUiArea(){
       this.copyOnWrite();
       this.instance.clearSafeUiArea();
       return this;
    }
    public EffectCommand$Builder clearSeekPoint(){
       this.copyOnWrite();
       this.instance.clearSeekPoint();
       return this;
    }
    public EffectCommand$Builder clearServerMediaType(){
       this.copyOnWrite();
       this.instance.clearServerMediaType();
       return this;
    }
    public EffectCommand$Builder clearServerResultPath(){
       this.copyOnWrite();
       this.instance.clearServerResultPath();
       return this;
    }
    public EffectCommand$Builder clearSetEditFlawParams(){
       this.copyOnWrite();
       this.instance.clearSetEditFlawParams();
       return this;
    }
    public EffectCommand$Builder clearSetFaceSegForBeauty(){
       this.copyOnWrite();
       this.instance.clearSetFaceSegForBeauty();
       return this;
    }
    public EffectCommand$Builder clearShouldUseFacemask(){
       this.copyOnWrite();
       this.instance.clearShouldUseFacemask();
       return this;
    }
    public EffectCommand$Builder clearShouldUseGender(){
       this.copyOnWrite();
       this.instance.clearShouldUseGender();
       return this;
    }
    public EffectCommand$Builder clearShouldUseLandmarksmask(){
       this.copyOnWrite();
       this.instance.clearShouldUseLandmarksmask();
       return this;
    }
    public EffectCommand$Builder clearSlideEndWithNewEffect(){
       this.copyOnWrite();
       this.instance.clearSlideEndWithNewEffect();
       return this;
    }
    public EffectCommand$Builder clearSlideNewEffectDisplayLeft(){
       this.copyOnWrite();
       this.instance.clearSlideNewEffectDisplayLeft();
       return this;
    }
    public EffectCommand$Builder clearSlideNewEffectDisplayRight(){
       this.copyOnWrite();
       this.instance.clearSlideNewEffectDisplayRight();
       return this;
    }
    public EffectCommand$Builder clearSmartBeautyIntensity(){
       this.copyOnWrite();
       this.instance.clearSmartBeautyIntensity();
       return this;
    }
    public EffectCommand$Builder clearSoften(){
       this.copyOnWrite();
       this.instance.clearSoften();
       return this;
    }
    public EffectCommand$Builder clearStartPoint(){
       this.copyOnWrite();
       this.instance.clearStartPoint();
       return this;
    }
    public EffectCommand$Builder clearSticker(){
       this.copyOnWrite();
       this.instance.clearSticker();
       return this;
    }
    public EffectCommand$Builder clearStickerEnable(){
       this.copyOnWrite();
       this.instance.clearStickerEnable();
       return this;
    }
    public EffectCommand$Builder clearStickerIntensityWeightActive(){
       this.copyOnWrite();
       this.instance.clearStickerIntensityWeightActive();
       return this;
    }
    public EffectCommand$Builder clearStickerMainEnable(){
       this.copyOnWrite();
       this.instance.clearStickerMainEnable();
       return this;
    }
    public EffectCommand$Builder clearStickers(){
       this.copyOnWrite();
       this.instance.clearStickers();
       return this;
    }
    public EffectCommand$Builder clearSwapFaceImagePath(){
       this.copyOnWrite();
       this.instance.clearSwapFaceImagePath();
       return this;
    }
    public EffectCommand$Builder clearTeethBrightenIntensity(){
       this.copyOnWrite();
       this.instance.clearTeethBrightenIntensity();
       return this;
    }
    public EffectCommand$Builder clearThermageIntensity(){
       this.copyOnWrite();
       this.instance.clearThermageIntensity();
       return this;
    }
    public EffectCommand$Builder clearTimestamp(){
       this.copyOnWrite();
       this.instance.clearTimestamp();
       return this;
    }
    public EffectCommand$Builder clearTriggerInputText(){
       this.copyOnWrite();
       this.instance.clearTriggerInputText();
       return this;
    }
    public EffectCommand$Builder clearTriggerInputTextIndex(){
       this.copyOnWrite();
       this.instance.clearTriggerInputTextIndex();
       return this;
    }
    public EffectCommand$Builder clearUseLowPowerSensor(){
       this.copyOnWrite();
       this.instance.clearUseLowPowerSensor();
       return this;
    }
    public EffectCommand$Builder clearUseMaleMakeup(){
       this.copyOnWrite();
       this.instance.clearUseMaleMakeup();
       return this;
    }
    public EffectCommand$Builder clearUseSkinAndHairSegModel(){
       this.copyOnWrite();
       this.instance.clearUseSkinAndHairSegModel();
       return this;
    }
    public EffectCommand$Builder clearUserLocation(){
       this.copyOnWrite();
       this.instance.clearUserLocation();
       return this;
    }
    public EffectCommand$Builder clearVideoLength(){
       this.copyOnWrite();
       this.instance.clearVideoLength();
       return this;
    }
    public EffectCommand$Builder clearWaterSkinIntensity(){
       this.copyOnWrite();
       this.instance.clearWaterSkinIntensity();
       return this;
    }
    public EffectCommand$Builder clearWeakenMakeupIntensityProp(){
       this.copyOnWrite();
       this.instance.clearWeakenMakeupIntensityProp();
       return this;
    }
    public EffectCommand$Builder clearWhiteSkinConfig(){
       this.copyOnWrite();
       this.instance.clearWhiteSkinConfig();
       return this;
    }
    public EffectCommand$Builder clearWhiteSkinIntensity(){
       this.copyOnWrite();
       this.instance.clearWhiteSkinIntensity();
       return this;
    }
    public EffectCommand$Builder clearWocanIntensity(){
       this.copyOnWrite();
       this.instance.clearWocanIntensity();
       return this;
    }
    public EffectCommand$Builder clearWrinkleRemoveIntensity(){
       this.copyOnWrite();
       this.instance.clearWrinkleRemoveIntensity();
       return this;
    }
    public AdjustEffectType getAdjustEffectType(){
       return this.instance.getAdjustEffectType();
    }
    public int getAdjustEffectTypeValue(){
       return this.instance.getAdjustEffectTypeValue();
    }
    public float getAideflawIntensity(){
       return this.instance.getAideflawIntensity();
    }
    public float getAieyelidIntensity(){
       return this.instance.getAieyelidIntensity();
    }
    public boolean getAllDeletedWhenResetRecording(){
       return this.instance.getAllDeletedWhenResetRecording();
    }
    public AnimojiData getAnimojiData(){
       return this.instance.getAnimojiData();
    }
    public float getBasicAdjustIntensity(){
       return this.instance.getBasicAdjustIntensity();
    }
    public String getBeautifyGroupPath(){
       return this.instance.getBeautifyGroupPath();
    }
    public ByteString getBeautifyGroupPathBytes(){
       return this.instance.getBeautifyGroupPathBytes();
    }
    public float getBeautifyLipsIntensity(){
       return this.instance.getBeautifyLipsIntensity();
    }
    public int getBeautifyPanelStatus(){
       return this.instance.getBeautifyPanelStatus();
    }
    public String getBeautifyPreviewPart(){
       return this.instance.getBeautifyPreviewPart();
    }
    public ByteString getBeautifyPreviewPartBytes(){
       return this.instance.getBeautifyPreviewPartBytes();
    }
    public float getBeautifySecondBrightIntensity(){
       return this.instance.getBeautifySecondBrightIntensity();
    }
    public float getBeautyAnyIntensity(){
       return this.instance.getBeautyAnyIntensity();
    }
    public int getBeautyAnyType(){
       return this.instance.getBeautyAnyType();
    }
    public float getBeautyzerooptIntensity(){
       return this.instance.getBeautyzerooptIntensity();
    }
    public String getBlendMode(){
       return this.instance.getBlendMode();
    }
    public ByteString getBlendModeBytes(){
       return this.instance.getBlendModeBytes();
    }
    public float getBodySlimmingAdjustIntensity(){
       return this.instance.getBodySlimmingAdjustIntensity();
    }
    public BodySlimmingAdjustType getBodySlimmingAdjustType(){
       return this.instance.getBodySlimmingAdjustType();
    }
    public int getBodySlimmingAdjustTypeValue(){
       return this.instance.getBodySlimmingAdjustTypeValue();
    }
    public boolean getBodySlimmingGradient(){
       return this.instance.getBodySlimmingGradient();
    }
    public BokehConfig getBokehDepthConfig(){
       return this.instance.getBokehDepthConfig();
    }
    public boolean getBokehDepthEnable(){
       return this.instance.getBokehDepthEnable();
    }
    public boolean getBokehDepthEnableTestMode(){
       return this.instance.getBokehDepthEnableTestMode();
    }
    public float getBokehDepthFocalLength(){
       return this.instance.getBokehDepthFocalLength();
    }
    public Bitmap getBokehDepthMask(){
       return this.instance.getBokehDepthMask();
    }
    public BokehQuality getBokehDepthQuality(){
       return this.instance.getBokehDepthQuality();
    }
    public int getBokehDepthQualityValue(){
       return this.instance.getBokehDepthQualityValue();
    }
    public float getBokehDepthRadius(){
       return this.instance.getBokehDepthRadius();
    }
    public String getBokehDepthSpotShape(){
       return this.instance.getBokehDepthSpotShape();
    }
    public ByteString getBokehDepthSpotShapeBytes(){
       return this.instance.getBokehDepthSpotShapeBytes();
    }
    public BokehDepthTouch getBokehDepthTouchPosition(){
       return this.instance.getBokehDepthTouchPosition();
    }
    public BokehType getBokehDepthType(){
       return this.instance.getBokehDepthType();
    }
    public int getBokehDepthTypeValue(){
       return this.instance.getBokehDepthTypeValue();
    }
    public String getBoomGameJson(){
       return this.instance.getBoomGameJson();
    }
    public ByteString getBoomGameJsonBytes(){
       return this.instance.getBoomGameJsonBytes();
    }
    public float getBright(){
       return this.instance.getBright();
    }
    public float getClarityIntensity(){
       return this.instance.getClarityIntensity();
    }
    public int getClientWorkProcess(){
       return this.instance.getClientWorkProcess();
    }
    public ClientWorkProgress getClientWorkProgresses(){
       return this.instance.getClientWorkProgresses();
    }
    public String getColoringContent(){
       return this.instance.getColoringContent();
    }
    public ByteString getColoringContentBytes(){
       return this.instance.getColoringContentBytes();
    }
    public EffectCommandType getCommandType(){
       return this.instance.getCommandType();
    }
    public int getCommandTypeValue(){
       return this.instance.getCommandTypeValue();
    }
    public CustomInputText getCustomInputTexts(int p0){
       return this.instance.getCustomInputTexts(p0);
    }
    public int getCustomInputTextsCount(){
       return this.instance.getCustomInputTextsCount();
    }
    public List getCustomInputTextsList(){
       return Collections.unmodifiableList(this.instance.getCustomInputTextsList());
    }
    public String getCustomStickerJson(){
       return this.instance.getCustomStickerJson();
    }
    public ByteString getCustomStickerJsonBytes(){
       return this.instance.getCustomStickerJsonBytes();
    }
    public int getCustomTriggerType(){
       return this.instance.getCustomTriggerType();
    }
    public float getDefinitionIntensity(){
       return this.instance.getDefinitionIntensity();
    }
    public float getDeformIndensity(){
       return this.instance.getDeformIndensity();
    }
    public int getDeformMode(){
       return this.instance.getDeformMode();
    }
    public float getEffectIntensity(){
       return this.instance.getEffectIntensity();
    }
    public String getEffectKeys(int p0){
       return this.instance.getEffectKeys(p0);
    }
    public ByteString getEffectKeysBytes(int p0){
       return this.instance.getEffectKeysBytes(p0);
    }
    public int getEffectKeysCount(){
       return this.instance.getEffectKeysCount();
    }
    public List getEffectKeysList(){
       return Collections.unmodifiableList(this.instance.getEffectKeysList());
    }
    public boolean getEnableBigeyeOptimization(){
       return this.instance.getEnableBigeyeOptimization();
    }
    public boolean getEnableEnlargeMaxFaceCount(){
       return this.instance.getEnableEnlargeMaxFaceCount();
    }
    public boolean getEnableMagicFilter(){
       return this.instance.getEnableMagicFilter();
    }
    public boolean getEnableMakeupChildToZero(){
       return this.instance.getEnableMakeupChildToZero();
    }
    public boolean getEnableMvLookupFirst(){
       return this.instance.getEnableMvLookupFirst();
    }
    public boolean getEnableSmartBeautify(){
       return this.instance.getEnableSmartBeautify();
    }
    public boolean getEnableSmartBeauty(){
       return this.instance.getEnableSmartBeauty();
    }
    public boolean getEnableUndoWarpEdit(){
       return this.instance.getEnableUndoWarpEdit();
    }
    public boolean getEnableUndoWarpPhoto(){
       return this.instance.getEnableUndoWarpPhoto();
    }
    public boolean getEnableUndoWarpPhotoRefreshData(){
       return this.instance.getEnableUndoWarpPhotoRefreshData();
    }
    public FMPoint getEndPoint(){
       return this.instance.getEndPoint();
    }
    public float getEvenSkinIntensity(){
       return this.instance.getEvenSkinIntensity();
    }
    public float getEyeBagRemoveIntensity(){
       return this.instance.getEyeBagRemoveIntensity();
    }
    public float getEyeBrightenIntensity(){
       return this.instance.getEyeBrightenIntensity();
    }
    public int getFaceDeformSelection(int p0){
       return this.instance.getFaceDeformSelection(p0);
    }
    public int getFaceDeformSelectionCount(){
       return this.instance.getFaceDeformSelectionCount();
    }
    public List getFaceDeformSelectionList(){
       return Collections.unmodifiableList(this.instance.getFaceDeformSelectionList());
    }
    public float getFaceShadowIntensity(){
       return this.instance.getFaceShadowIntensity();
    }
    public float getFaceTextureIntensity(){
       return this.instance.getFaceTextureIntensity();
    }
    public FilterBasicAdjustType getFilterBasicAdjustType(){
       return this.instance.getFilterBasicAdjustType();
    }
    public int getFilterBasicAdjustTypeValue(){
       return this.instance.getFilterBasicAdjustTypeValue();
    }
    public float getFlashlightIntensity(){
       return this.instance.getFlashlightIntensity();
    }
    public GenderUsingType getGenderUsingType(){
       return this.instance.getGenderUsingType();
    }
    public int getGenderUsingTypeValue(){
       return this.instance.getGenderUsingTypeValue();
    }
    public EffectResource getGroupEffect(){
       return this.instance.getGroupEffect();
    }
    public String getGroupName(){
       return this.instance.getGroupName();
    }
    public ByteString getGroupNameBytes(){
       return this.instance.getGroupNameBytes();
    }
    public HairClipConfig getHairClipConfig(){
       return this.instance.getHairClipConfig();
    }
    public HairDyeingMode getHairDyeingMode(){
       return this.instance.getHairDyeingMode();
    }
    public int getHairDyeingModeValue(){
       return this.instance.getHairDyeingModeValue();
    }
    public boolean getHairSofteningImageMode(){
       return this.instance.getHairSofteningImageMode();
    }
    public float getHairSofteningStrength(){
       return this.instance.getHairSofteningStrength();
    }
    public HumanMattingType getHumanMattingType(){
       return this.instance.getHumanMattingType();
    }
    public int getHumanMattingTypeValue(){
       return this.instance.getHumanMattingTypeValue();
    }
    public String getInputText(){
       return this.instance.getInputText();
    }
    public ByteString getInputTextBytes(){
       return this.instance.getInputTextBytes();
    }
    public int getInputTextIndex(){
       return this.instance.getInputTextIndex();
    }
    public float getIntensityWeight(){
       return this.instance.getIntensityWeight();
    }
    public String getIntputTextFont(){
       return this.instance.getIntputTextFont();
    }
    public ByteString getIntputTextFontBytes(){
       return this.instance.getIntputTextFontBytes();
    }
    public boolean getIsActive(){
       return this.instance.getIsActive();
    }
    public boolean getIsEditAutoStatus(){
       return this.instance.getIsEditAutoStatus();
    }
    public boolean getIsEditFlawAuto(){
       return this.instance.getIsEditFlawAuto();
    }
    public boolean getIsEditStatus(){
       return this.instance.getIsEditStatus();
    }
    public boolean getIsLivePk360P(){
       return this.instance.getIsLivePk360P();
    }
    public boolean getIsMagicRemovelStatus(){
       return this.instance.getIsMagicRemovelStatus();
    }
    public boolean getIsMainSticker(){
       return this.instance.getIsMainSticker();
    }
    public boolean getIsOpenFlaw(){
       return this.instance.getIsOpenFlaw();
    }
    public float getLiquifyIntensity(){
       return this.instance.getLiquifyIntensity();
    }
    public float getLiquifyRadius(){
       return this.instance.getLiquifyRadius();
    }
    public FMSize getLiquifySize(){
       return this.instance.getLiquifySize();
    }
    public float getLiquifyStride(){
       return this.instance.getLiquifyStride();
    }
    public LiquifyType getLiquifyType(){
       return this.instance.getLiquifyType();
    }
    public int getLiquifyTypeValue(){
       return this.instance.getLiquifyTypeValue();
    }
    public boolean getLiquifyistouchbegin(){
       return this.instance.getLiquifyistouchbegin();
    }
    public boolean getLiquifyistouchend(){
       return this.instance.getLiquifyistouchend();
    }
    public int getLookupDimension(){
       return this.instance.getLookupDimension();
    }
    public float getLookupIntensity(){
       return this.instance.getLookupIntensity();
    }
    public EffectLookupParam getLookupParam(){
       return this.instance.getLookupParam();
    }
    public String getLookupPath(){
       return this.instance.getLookupPath();
    }
    public ByteString getLookupPathBytes(){
       return this.instance.getLookupPathBytes();
    }
    public EffectLookupSlideParam getLookupSlideParam(){
       return this.instance.getLookupSlideParam();
    }
    public int getLookupType(){
       return this.instance.getLookupType();
    }
    public Bitmap getMagicRemovelMask(){
       return this.instance.getMagicRemovelMask();
    }
    public float getMagnifierBorderColor(int p0){
       return this.instance.getMagnifierBorderColor(p0);
    }
    public int getMagnifierBorderColorCount(){
       return this.instance.getMagnifierBorderColorCount();
    }
    public List getMagnifierBorderColorList(){
       return Collections.unmodifiableList(this.instance.getMagnifierBorderColorList());
    }
    public float getMagnifierBorderRadius(){
       return this.instance.getMagnifierBorderRadius();
    }
    public float getMagnifierBorderWidth(){
       return this.instance.getMagnifierBorderWidth();
    }
    public float getMagnifierCanvasSize(int p0){
       return this.instance.getMagnifierCanvasSize(p0);
    }
    public int getMagnifierCanvasSizeCount(){
       return this.instance.getMagnifierCanvasSizeCount();
    }
    public List getMagnifierCanvasSizeList(){
       return Collections.unmodifiableList(this.instance.getMagnifierCanvasSizeList());
    }
    public float getMagnifierContentScale(){
       return this.instance.getMagnifierContentScale();
    }
    public int getMagnifierFaceTrackId(){
       return this.instance.getMagnifierFaceTrackId();
    }
    public String getMagnifierShapePath(){
       return this.instance.getMagnifierShapePath();
    }
    public ByteString getMagnifierShapePathBytes(){
       return this.instance.getMagnifierShapePathBytes();
    }
    public float getMakeUpPenBrushIntensity(){
       return this.instance.getMakeUpPenBrushIntensity();
    }
    public int getMakeupBackLightMode(){
       return this.instance.getMakeupBackLightMode();
    }
    public int getMakeupBlendMode(){
       return this.instance.getMakeupBlendMode();
    }
    public MakeupColor getMakeupColor(){
       return this.instance.getMakeupColor();
    }
    public float getMakeupIntensity(){
       return this.instance.getMakeupIntensity();
    }
    public String getMakeupMode(){
       return this.instance.getMakeupMode();
    }
    public ByteString getMakeupModeBytes(){
       return this.instance.getMakeupModeBytes();
    }
    public EffectColor getMakeupPenBrushColor(){
       return this.instance.getMakeupPenBrushColor();
    }
    public float getMakeupPenBrushHardness(){
       return this.instance.getMakeupPenBrushHardness();
    }
    public String getMakeupPenBrushTexturePath(){
       return this.instance.getMakeupPenBrushTexturePath();
    }
    public ByteString getMakeupPenBrushTexturePathBytes(){
       return this.instance.getMakeupPenBrushTexturePathBytes();
    }
    public EffectMakeupPenBrushType getMakeupPenBrushType(){
       return this.instance.getMakeupPenBrushType();
    }
    public int getMakeupPenBrushTypeValue(){
       return this.instance.getMakeupPenBrushTypeValue();
    }
    public EffectColor getMakeupPenEraserColor(){
       return this.instance.getMakeupPenEraserColor();
    }
    public float getMakeupPenEraserLiveTime(){
       return this.instance.getMakeupPenEraserLiveTime();
    }
    public String getMakeupPenHighLightTexturePath(){
       return this.instance.getMakeupPenHighLightTexturePath();
    }
    public ByteString getMakeupPenHighLightTexturePathBytes(){
       return this.instance.getMakeupPenHighLightTexturePathBytes();
    }
    public boolean getMakeupPenIsEraser(){
       return this.instance.getMakeupPenIsEraser();
    }
    public float getMakeupPenPointSize(){
       return this.instance.getMakeupPenPointSize();
    }
    public float getMakeupPenPointStride(){
       return this.instance.getMakeupPenPointStride();
    }
    public MakeupPenTouch getMakeupPenTouch(){
       return this.instance.getMakeupPenTouch();
    }
    public MakeupResource getMakeupResource(int p0){
       return this.instance.getMakeupResource(p0);
    }
    public int getMakeupResourceCount(){
       return this.instance.getMakeupResourceCount();
    }
    public List getMakeupResourceList(){
       return Collections.unmodifiableList(this.instance.getMakeupResourceList());
    }
    public boolean getMemojiEnableEditMode(){
       return this.instance.getMemojiEnableEditMode();
    }
    public String getMemojiGroup(){
       return this.instance.getMemojiGroup();
    }
    public ByteString getMemojiGroupBytes(){
       return this.instance.getMemojiGroupBytes();
    }
    public int getMemojiIconHeight(){
       return this.instance.getMemojiIconHeight();
    }
    public int getMemojiIconWidth(){
       return this.instance.getMemojiIconWidth();
    }
    public String getMemojiStyle(){
       return this.instance.getMemojiStyle();
    }
    public ByteString getMemojiStyleBytes(){
       return this.instance.getMemojiStyleBytes();
    }
    public String getMemojiUserConfigJson(){
       return this.instance.getMemojiUserConfigJson();
    }
    public ByteString getMemojiUserConfigJsonBytes(){
       return this.instance.getMemojiUserConfigJsonBytes();
    }
    public PickingMediaData getMoreMediaData(int p0){
       return this.instance.getMoreMediaData(p0);
    }
    public int getMoreMediaDataCount(){
       return this.instance.getMoreMediaDataCount();
    }
    public List getMoreMediaDataList(){
       return Collections.unmodifiableList(this.instance.getMoreMediaDataList());
    }
    public float getMoveMagnifierContentDistance(int p0){
       return this.instance.getMoveMagnifierContentDistance(p0);
    }
    public int getMoveMagnifierContentDistanceCount(){
       return this.instance.getMoveMagnifierContentDistanceCount();
    }
    public List getMoveMagnifierContentDistanceList(){
       return Collections.unmodifiableList(this.instance.getMoveMagnifierContentDistanceList());
    }
    public String getMusicWavePath(){
       return this.instance.getMusicWavePath();
    }
    public ByteString getMusicWavePathBytes(){
       return this.instance.getMusicWavePathBytes();
    }
    public float getMusicWaveTime(){
       return this.instance.getMusicWaveTime();
    }
    public int getNEditFlawUndoNums(){
       return this.instance.getNEditFlawUndoNums();
    }
    public int getNMagicRemovelUndoNums(){
       return this.instance.getNMagicRemovelUndoNums();
    }
    public boolean getNeedMakeupClearOldResource(){
       return this.instance.getNeedMakeupClearOldResource();
    }
    public float getNoseShadowIntensity(){
       return this.instance.getNoseShadowIntensity();
    }
    public float getOilfreeIntensity(){
       return this.instance.getOilfreeIntensity();
    }
    public String getOilpaintSourcePath(){
       return this.instance.getOilpaintSourcePath();
    }
    public ByteString getOilpaintSourcePathBytes(){
       return this.instance.getOilpaintSourcePathBytes();
    }
    public String getPassThroughParams(){
       return this.instance.getPassThroughParams();
    }
    public ByteString getPassThroughParamsBytes(){
       return this.instance.getPassThroughParamsBytes();
    }
    public String getPickingMediaPath(){
       return this.instance.getPickingMediaPath();
    }
    public ByteString getPickingMediaPathBytes(){
       return this.instance.getPickingMediaPathBytes();
    }
    public PickingMediaResType getPickingMediaType(){
       return this.instance.getPickingMediaType();
    }
    public int getPickingMediaTypeValue(){
       return this.instance.getPickingMediaTypeValue();
    }
    public float getPlayrate(){
       return this.instance.getPlayrate();
    }
    public RelightingConfig getRelightingConfig(){
       return this.instance.getRelightingConfig();
    }
    public SafeUIArea getSafeUiArea(){
       return this.instance.getSafeUiArea();
    }
    public float getSeekPoint(){
       return this.instance.getSeekPoint();
    }
    public PickingMediaResType getServerMediaType(){
       return this.instance.getServerMediaType();
    }
    public int getServerMediaTypeValue(){
       return this.instance.getServerMediaTypeValue();
    }
    public String getServerResultPath(){
       return this.instance.getServerResultPath();
    }
    public ByteString getServerResultPathBytes(){
       return this.instance.getServerResultPathBytes();
    }
    public EditFlawConfig getSetEditFlawParams(){
       return this.instance.getSetEditFlawParams();
    }
    public boolean getSetFaceSegForBeauty(){
       return this.instance.getSetFaceSegForBeauty();
    }
    public boolean getShouldUseFacemask(){
       return this.instance.getShouldUseFacemask();
    }
    public boolean getShouldUseGender(){
       return this.instance.getShouldUseGender();
    }
    public boolean getShouldUseLandmarksmask(){
       return this.instance.getShouldUseLandmarksmask();
    }
    public boolean getSlideEndWithNewEffect(){
       return this.instance.getSlideEndWithNewEffect();
    }
    public float getSlideNewEffectDisplayLeft(){
       return this.instance.getSlideNewEffectDisplayLeft();
    }
    public float getSlideNewEffectDisplayRight(){
       return this.instance.getSlideNewEffectDisplayRight();
    }
    public float getSmartBeautyIntensity(){
       return this.instance.getSmartBeautyIntensity();
    }
    public float getSoften(){
       return this.instance.getSoften();
    }
    public FMPoint getStartPoint(){
       return this.instance.getStartPoint();
    }
    public StickerInfo getSticker(){
       return this.instance.getSticker();
    }
    public boolean getStickerEnable(){
       return this.instance.getStickerEnable();
    }
    public boolean getStickerIntensityWeightActive(){
       return this.instance.getStickerIntensityWeightActive();
    }
    public boolean getStickerMainEnable(){
       return this.instance.getStickerMainEnable();
    }
    public StickerInfo getStickers(int p0){
       return this.instance.getStickers(p0);
    }
    public int getStickersCount(){
       return this.instance.getStickersCount();
    }
    public List getStickersList(){
       return Collections.unmodifiableList(this.instance.getStickersList());
    }
    public String getSwapFaceImagePath(){
       return this.instance.getSwapFaceImagePath();
    }
    public ByteString getSwapFaceImagePathBytes(){
       return this.instance.getSwapFaceImagePathBytes();
    }
    public float getTeethBrightenIntensity(){
       return this.instance.getTeethBrightenIntensity();
    }
    public float getThermageIntensity(){
       return this.instance.getThermageIntensity();
    }
    public FMTimeStamp getTimestamp(){
       return this.instance.getTimestamp();
    }
    public String getTriggerInputText(){
       return this.instance.getTriggerInputText();
    }
    public ByteString getTriggerInputTextBytes(){
       return this.instance.getTriggerInputTextBytes();
    }
    public int getTriggerInputTextIndex(){
       return this.instance.getTriggerInputTextIndex();
    }
    public boolean getUseLowPowerSensor(){
       return this.instance.getUseLowPowerSensor();
    }
    public boolean getUseMaleMakeup(){
       return this.instance.getUseMaleMakeup();
    }
    public boolean getUseSkinAndHairSegModel(){
       return this.instance.getUseSkinAndHairSegModel();
    }
    public String getUserLocation(){
       return this.instance.getUserLocation();
    }
    public ByteString getUserLocationBytes(){
       return this.instance.getUserLocationBytes();
    }
    public int getVideoLength(){
       return this.instance.getVideoLength();
    }
    public float getWaterSkinIntensity(){
       return this.instance.getWaterSkinIntensity();
    }
    public int getWeakenMakeupIntensityProp(){
       return this.instance.getWeakenMakeupIntensityProp();
    }
    public String getWhiteSkinConfig(){
       return this.instance.getWhiteSkinConfig();
    }
    public ByteString getWhiteSkinConfigBytes(){
       return this.instance.getWhiteSkinConfigBytes();
    }
    public float getWhiteSkinIntensity(){
       return this.instance.getWhiteSkinIntensity();
    }
    public float getWocanIntensity(){
       return this.instance.getWocanIntensity();
    }
    public float getWrinkleRemoveIntensity(){
       return this.instance.getWrinkleRemoveIntensity();
    }
    public boolean hasAnimojiData(){
       return this.instance.hasAnimojiData();
    }
    public boolean hasBokehDepthConfig(){
       return this.instance.hasBokehDepthConfig();
    }
    public boolean hasBokehDepthMask(){
       return this.instance.hasBokehDepthMask();
    }
    public boolean hasBokehDepthTouchPosition(){
       return this.instance.hasBokehDepthTouchPosition();
    }
    public boolean hasClientWorkProgresses(){
       return this.instance.hasClientWorkProgresses();
    }
    public boolean hasEndPoint(){
       return this.instance.hasEndPoint();
    }
    public boolean hasGroupEffect(){
       return this.instance.hasGroupEffect();
    }
    public boolean hasHairClipConfig(){
       return this.instance.hasHairClipConfig();
    }
    public boolean hasLiquifySize(){
       return this.instance.hasLiquifySize();
    }
    public boolean hasLookupParam(){
       return this.instance.hasLookupParam();
    }
    public boolean hasLookupSlideParam(){
       return this.instance.hasLookupSlideParam();
    }
    public boolean hasMagicRemovelMask(){
       return this.instance.hasMagicRemovelMask();
    }
    public boolean hasMakeupColor(){
       return this.instance.hasMakeupColor();
    }
    public boolean hasMakeupPenBrushColor(){
       return this.instance.hasMakeupPenBrushColor();
    }
    public boolean hasMakeupPenEraserColor(){
       return this.instance.hasMakeupPenEraserColor();
    }
    public boolean hasMakeupPenTouch(){
       return this.instance.hasMakeupPenTouch();
    }
    public boolean hasRelightingConfig(){
       return this.instance.hasRelightingConfig();
    }
    public boolean hasSafeUiArea(){
       return this.instance.hasSafeUiArea();
    }
    public boolean hasSetEditFlawParams(){
       return this.instance.hasSetEditFlawParams();
    }
    public boolean hasStartPoint(){
       return this.instance.hasStartPoint();
    }
    public boolean hasSticker(){
       return this.instance.hasSticker();
    }
    public boolean hasTimestamp(){
       return this.instance.hasTimestamp();
    }
    public EffectCommand$Builder mergeAnimojiData(AnimojiData p0){
       this.copyOnWrite();
       this.instance.mergeAnimojiData(p0);
       return this;
    }
    public EffectCommand$Builder mergeBokehDepthConfig(BokehConfig p0){
       this.copyOnWrite();
       this.instance.mergeBokehDepthConfig(p0);
       return this;
    }
    public EffectCommand$Builder mergeBokehDepthMask(Bitmap p0){
       this.copyOnWrite();
       this.instance.mergeBokehDepthMask(p0);
       return this;
    }
    public EffectCommand$Builder mergeBokehDepthTouchPosition(BokehDepthTouch p0){
       this.copyOnWrite();
       this.instance.mergeBokehDepthTouchPosition(p0);
       return this;
    }
    public EffectCommand$Builder mergeClientWorkProgresses(ClientWorkProgress p0){
       this.copyOnWrite();
       this.instance.mergeClientWorkProgresses(p0);
       return this;
    }
    public EffectCommand$Builder mergeEndPoint(FMPoint p0){
       this.copyOnWrite();
       this.instance.mergeEndPoint(p0);
       return this;
    }
    public EffectCommand$Builder mergeGroupEffect(EffectResource p0){
       this.copyOnWrite();
       this.instance.mergeGroupEffect(p0);
       return this;
    }
    public EffectCommand$Builder mergeHairClipConfig(HairClipConfig p0){
       this.copyOnWrite();
       this.instance.mergeHairClipConfig(p0);
       return this;
    }
    public EffectCommand$Builder mergeLiquifySize(FMSize p0){
       this.copyOnWrite();
       this.instance.mergeLiquifySize(p0);
       return this;
    }
    public EffectCommand$Builder mergeLookupParam(EffectLookupParam p0){
       this.copyOnWrite();
       this.instance.mergeLookupParam(p0);
       return this;
    }
    public EffectCommand$Builder mergeLookupSlideParam(EffectLookupSlideParam p0){
       this.copyOnWrite();
       this.instance.mergeLookupSlideParam(p0);
       return this;
    }
    public EffectCommand$Builder mergeMagicRemovelMask(Bitmap p0){
       this.copyOnWrite();
       this.instance.mergeMagicRemovelMask(p0);
       return this;
    }
    public EffectCommand$Builder mergeMakeupColor(MakeupColor p0){
       this.copyOnWrite();
       this.instance.mergeMakeupColor(p0);
       return this;
    }
    public EffectCommand$Builder mergeMakeupPenBrushColor(EffectColor p0){
       this.copyOnWrite();
       this.instance.mergeMakeupPenBrushColor(p0);
       return this;
    }
    public EffectCommand$Builder mergeMakeupPenEraserColor(EffectColor p0){
       this.copyOnWrite();
       this.instance.mergeMakeupPenEraserColor(p0);
       return this;
    }
    public EffectCommand$Builder mergeMakeupPenTouch(MakeupPenTouch p0){
       this.copyOnWrite();
       this.instance.mergeMakeupPenTouch(p0);
       return this;
    }
    public EffectCommand$Builder mergeRelightingConfig(RelightingConfig p0){
       this.copyOnWrite();
       this.instance.mergeRelightingConfig(p0);
       return this;
    }
    public EffectCommand$Builder mergeSafeUiArea(SafeUIArea p0){
       this.copyOnWrite();
       this.instance.mergeSafeUiArea(p0);
       return this;
    }
    public EffectCommand$Builder mergeSetEditFlawParams(EditFlawConfig p0){
       this.copyOnWrite();
       this.instance.mergeSetEditFlawParams(p0);
       return this;
    }
    public EffectCommand$Builder mergeStartPoint(FMPoint p0){
       this.copyOnWrite();
       this.instance.mergeStartPoint(p0);
       return this;
    }
    public EffectCommand$Builder mergeSticker(StickerInfo p0){
       this.copyOnWrite();
       this.instance.mergeSticker(p0);
       return this;
    }
    public EffectCommand$Builder mergeTimestamp(FMTimeStamp p0){
       this.copyOnWrite();
       this.instance.mergeTimestamp(p0);
       return this;
    }
    public EffectCommand$Builder removeCustomInputTexts(int p0){
       this.copyOnWrite();
       this.instance.removeCustomInputTexts(p0);
       return this;
    }
    public EffectCommand$Builder removeMakeupResource(int p0){
       this.copyOnWrite();
       this.instance.removeMakeupResource(p0);
       return this;
    }
    public EffectCommand$Builder removeMoreMediaData(int p0){
       this.copyOnWrite();
       this.instance.removeMoreMediaData(p0);
       return this;
    }
    public EffectCommand$Builder removeStickers(int p0){
       this.copyOnWrite();
       this.instance.removeStickers(p0);
       return this;
    }
    public EffectCommand$Builder setAdjustEffectType(AdjustEffectType p0){
       this.copyOnWrite();
       this.instance.setAdjustEffectType(p0);
       return this;
    }
    public EffectCommand$Builder setAdjustEffectTypeValue(int p0){
       this.copyOnWrite();
       this.instance.setAdjustEffectTypeValue(p0);
       return this;
    }
    public EffectCommand$Builder setAideflawIntensity(float p0){
       this.copyOnWrite();
       this.instance.setAideflawIntensity(p0);
       return this;
    }
    public EffectCommand$Builder setAieyelidIntensity(float p0){
       this.copyOnWrite();
       this.instance.setAieyelidIntensity(p0);
       return this;
    }
    public EffectCommand$Builder setAllDeletedWhenResetRecording(boolean p0){
       this.copyOnWrite();
       this.instance.setAllDeletedWhenResetRecording(p0);
       return this;
    }
    public EffectCommand$Builder setAnimojiData(AnimojiData$Builder p0){
       this.copyOnWrite();
       this.instance.setAnimojiData(p0);
       return this;
    }
    public EffectCommand$Builder setAnimojiData(AnimojiData p0){
       this.copyOnWrite();
       this.instance.setAnimojiData(p0);
       return this;
    }
    public EffectCommand$Builder setBasicAdjustIntensity(float p0){
       this.copyOnWrite();
       this.instance.setBasicAdjustIntensity(p0);
       return this;
    }
    public EffectCommand$Builder setBeautifyGroupPath(String p0){
       this.copyOnWrite();
       this.instance.setBeautifyGroupPath(p0);
       return this;
    }
    public EffectCommand$Builder setBeautifyGroupPathBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setBeautifyGroupPathBytes(p0);
       return this;
    }
    public EffectCommand$Builder setBeautifyLipsIntensity(float p0){
       this.copyOnWrite();
       this.instance.setBeautifyLipsIntensity(p0);
       return this;
    }
    public EffectCommand$Builder setBeautifyPanelStatus(int p0){
       this.copyOnWrite();
       this.instance.setBeautifyPanelStatus(p0);
       return this;
    }
    public EffectCommand$Builder setBeautifyPreviewPart(String p0){
       this.copyOnWrite();
       this.instance.setBeautifyPreviewPart(p0);
       return this;
    }
    public EffectCommand$Builder setBeautifyPreviewPartBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setBeautifyPreviewPartBytes(p0);
       return this;
    }
    public EffectCommand$Builder setBeautifySecondBrightIntensity(float p0){
       this.copyOnWrite();
       this.instance.setBeautifySecondBrightIntensity(p0);
       return this;
    }
    public EffectCommand$Builder setBeautyAnyIntensity(float p0){
       this.copyOnWrite();
       this.instance.setBeautyAnyIntensity(p0);
       return this;
    }
    public EffectCommand$Builder setBeautyAnyType(int p0){
       this.copyOnWrite();
       this.instance.setBeautyAnyType(p0);
       return this;
    }
    public EffectCommand$Builder setBeautyzerooptIntensity(float p0){
       this.copyOnWrite();
       this.instance.setBeautyzerooptIntensity(p0);
       return this;
    }
    public EffectCommand$Builder setBlendMode(String p0){
       this.copyOnWrite();
       this.instance.setBlendMode(p0);
       return this;
    }
    public EffectCommand$Builder setBlendModeBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setBlendModeBytes(p0);
       return this;
    }
    public EffectCommand$Builder setBodySlimmingAdjustIntensity(float p0){
       this.copyOnWrite();
       this.instance.setBodySlimmingAdjustIntensity(p0);
       return this;
    }
    public EffectCommand$Builder setBodySlimmingAdjustType(BodySlimmingAdjustType p0){
       this.copyOnWrite();
       this.instance.setBodySlimmingAdjustType(p0);
       return this;
    }
    public EffectCommand$Builder setBodySlimmingAdjustTypeValue(int p0){
       this.copyOnWrite();
       this.instance.setBodySlimmingAdjustTypeValue(p0);
       return this;
    }
    public EffectCommand$Builder setBodySlimmingGradient(boolean p0){
       this.copyOnWrite();
       this.instance.setBodySlimmingGradient(p0);
       return this;
    }
    public EffectCommand$Builder setBokehDepthConfig(BokehConfig$Builder p0){
       this.copyOnWrite();
       this.instance.setBokehDepthConfig(p0);
       return this;
    }
    public EffectCommand$Builder setBokehDepthConfig(BokehConfig p0){
       this.copyOnWrite();
       this.instance.setBokehDepthConfig(p0);
       return this;
    }
    public EffectCommand$Builder setBokehDepthEnable(boolean p0){
       this.copyOnWrite();
       this.instance.setBokehDepthEnable(p0);
       return this;
    }
    public EffectCommand$Builder setBokehDepthEnableTestMode(boolean p0){
       this.copyOnWrite();
       this.instance.setBokehDepthEnableTestMode(p0);
       return this;
    }
    public EffectCommand$Builder setBokehDepthFocalLength(float p0){
       this.copyOnWrite();
       this.instance.setBokehDepthFocalLength(p0);
       return this;
    }
    public EffectCommand$Builder setBokehDepthMask(Bitmap$Builder p0){
       this.copyOnWrite();
       this.instance.setBokehDepthMask(p0);
       return this;
    }
    public EffectCommand$Builder setBokehDepthMask(Bitmap p0){
       this.copyOnWrite();
       this.instance.setBokehDepthMask(p0);
       return this;
    }
    public EffectCommand$Builder setBokehDepthQuality(BokehQuality p0){
       this.copyOnWrite();
       this.instance.setBokehDepthQuality(p0);
       return this;
    }
    public EffectCommand$Builder setBokehDepthQualityValue(int p0){
       this.copyOnWrite();
       this.instance.setBokehDepthQualityValue(p0);
       return this;
    }
    public EffectCommand$Builder setBokehDepthRadius(float p0){
       this.copyOnWrite();
       this.instance.setBokehDepthRadius(p0);
       return this;
    }
    public EffectCommand$Builder setBokehDepthSpotShape(String p0){
       this.copyOnWrite();
       this.instance.setBokehDepthSpotShape(p0);
       return this;
    }
    public EffectCommand$Builder setBokehDepthSpotShapeBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setBokehDepthSpotShapeBytes(p0);
       return this;
    }
    public EffectCommand$Builder setBokehDepthTouchPosition(BokehDepthTouch$Builder p0){
       this.copyOnWrite();
       this.instance.setBokehDepthTouchPosition(p0);
       return this;
    }
    public EffectCommand$Builder setBokehDepthTouchPosition(BokehDepthTouch p0){
       this.copyOnWrite();
       this.instance.setBokehDepthTouchPosition(p0);
       return this;
    }
    public EffectCommand$Builder setBokehDepthType(BokehType p0){
       this.copyOnWrite();
       this.instance.setBokehDepthType(p0);
       return this;
    }
    public EffectCommand$Builder setBokehDepthTypeValue(int p0){
       this.copyOnWrite();
       this.instance.setBokehDepthTypeValue(p0);
       return this;
    }
    public EffectCommand$Builder setBoomGameJson(String p0){
       this.copyOnWrite();
       this.instance.setBoomGameJson(p0);
       return this;
    }
    public EffectCommand$Builder setBoomGameJsonBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setBoomGameJsonBytes(p0);
       return this;
    }
    public EffectCommand$Builder setBright(float p0){
       this.copyOnWrite();
       this.instance.setBright(p0);
       return this;
    }
    public EffectCommand$Builder setClarityIntensity(float p0){
       this.copyOnWrite();
       this.instance.setClarityIntensity(p0);
       return this;
    }
    public EffectCommand$Builder setClientWorkProcess(int p0){
       this.copyOnWrite();
       this.instance.setClientWorkProcess(p0);
       return this;
    }
    public EffectCommand$Builder setClientWorkProgresses(ClientWorkProgress$Builder p0){
       this.copyOnWrite();
       this.instance.setClientWorkProgresses(p0);
       return this;
    }
    public EffectCommand$Builder setClientWorkProgresses(ClientWorkProgress p0){
       this.copyOnWrite();
       this.instance.setClientWorkProgresses(p0);
       return this;
    }
    public EffectCommand$Builder setColoringContent(String p0){
       this.copyOnWrite();
       this.instance.setColoringContent(p0);
       return this;
    }
    public EffectCommand$Builder setColoringContentBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setColoringContentBytes(p0);
       return this;
    }
    public EffectCommand$Builder setCommandType(EffectCommandType p0){
       this.copyOnWrite();
       this.instance.setCommandType(p0);
       return this;
    }
    public EffectCommand$Builder setCommandTypeValue(int p0){
       this.copyOnWrite();
       this.instance.setCommandTypeValue(p0);
       return this;
    }
    public EffectCommand$Builder setCustomInputTexts(int p0,CustomInputText$Builder p1){
       this.copyOnWrite();
       this.instance.setCustomInputTexts(p0, p1);
       return this;
    }
    public EffectCommand$Builder setCustomInputTexts(int p0,CustomInputText p1){
       this.copyOnWrite();
       this.instance.setCustomInputTexts(p0, p1);
       return this;
    }
    public EffectCommand$Builder setCustomStickerJson(String p0){
       this.copyOnWrite();
       this.instance.setCustomStickerJson(p0);
       return this;
    }
    public EffectCommand$Builder setCustomStickerJsonBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setCustomStickerJsonBytes(p0);
       return this;
    }
    public EffectCommand$Builder setCustomTriggerType(int p0){
       this.copyOnWrite();
       this.instance.setCustomTriggerType(p0);
       return this;
    }
    public EffectCommand$Builder setDefinitionIntensity(float p0){
       this.copyOnWrite();
       this.instance.setDefinitionIntensity(p0);
       return this;
    }
    public EffectCommand$Builder setDeformIndensity(float p0){
       this.copyOnWrite();
       this.instance.setDeformIndensity(p0);
       return this;
    }
    public EffectCommand$Builder setDeformMode(int p0){
       this.copyOnWrite();
       this.instance.setDeformMode(p0);
       return this;
    }
    public EffectCommand$Builder setEffectIntensity(float p0){
       this.copyOnWrite();
       this.instance.setEffectIntensity(p0);
       return this;
    }
    public EffectCommand$Builder setEffectKeys(int p0,String p1){
       this.copyOnWrite();
       this.instance.setEffectKeys(p0, p1);
       return this;
    }
    public EffectCommand$Builder setEnableBigeyeOptimization(boolean p0){
       this.copyOnWrite();
       this.instance.setEnableBigeyeOptimization(p0);
       return this;
    }
    public EffectCommand$Builder setEnableEnlargeMaxFaceCount(boolean p0){
       this.copyOnWrite();
       this.instance.setEnableEnlargeMaxFaceCount(p0);
       return this;
    }
    public EffectCommand$Builder setEnableMagicFilter(boolean p0){
       this.copyOnWrite();
       this.instance.setEnableMagicFilter(p0);
       return this;
    }
    public EffectCommand$Builder setEnableMakeupChildToZero(boolean p0){
       this.copyOnWrite();
       this.instance.setEnableMakeupChildToZero(p0);
       return this;
    }
    public EffectCommand$Builder setEnableMvLookupFirst(boolean p0){
       this.copyOnWrite();
       this.instance.setEnableMvLookupFirst(p0);
       return this;
    }
    public EffectCommand$Builder setEnableSmartBeautify(boolean p0){
       this.copyOnWrite();
       this.instance.setEnableSmartBeautify(p0);
       return this;
    }
    public EffectCommand$Builder setEnableSmartBeauty(boolean p0){
       this.copyOnWrite();
       this.instance.setEnableSmartBeauty(p0);
       return this;
    }
    public EffectCommand$Builder setEnableUndoWarpEdit(boolean p0){
       this.copyOnWrite();
       this.instance.setEnableUndoWarpEdit(p0);
       return this;
    }
    public EffectCommand$Builder setEnableUndoWarpPhoto(boolean p0){
       this.copyOnWrite();
       this.instance.setEnableUndoWarpPhoto(p0);
       return this;
    }
    public EffectCommand$Builder setEnableUndoWarpPhotoRefreshData(boolean p0){
       this.copyOnWrite();
       this.instance.setEnableUndoWarpPhotoRefreshData(p0);
       return this;
    }
    public EffectCommand$Builder setEndPoint(FMPoint$Builder p0){
       this.copyOnWrite();
       this.instance.setEndPoint(p0);
       return this;
    }
    public EffectCommand$Builder setEndPoint(FMPoint p0){
       this.copyOnWrite();
       this.instance.setEndPoint(p0);
       return this;
    }
    public EffectCommand$Builder setEvenSkinIntensity(float p0){
       this.copyOnWrite();
       this.instance.setEvenSkinIntensity(p0);
       return this;
    }
    public EffectCommand$Builder setEyeBagRemoveIntensity(float p0){
       this.copyOnWrite();
       this.instance.setEyeBagRemoveIntensity(p0);
       return this;
    }
    public EffectCommand$Builder setEyeBrightenIntensity(float p0){
       this.copyOnWrite();
       this.instance.setEyeBrightenIntensity(p0);
       return this;
    }
    public EffectCommand$Builder setFaceDeformSelection(int p0,int p1){
       this.copyOnWrite();
       this.instance.setFaceDeformSelection(p0, p1);
       return this;
    }
    public EffectCommand$Builder setFaceShadowIntensity(float p0){
       this.copyOnWrite();
       this.instance.setFaceShadowIntensity(p0);
       return this;
    }
    public EffectCommand$Builder setFaceTextureIntensity(float p0){
       this.copyOnWrite();
       this.instance.setFaceTextureIntensity(p0);
       return this;
    }
    public EffectCommand$Builder setFilterBasicAdjustType(FilterBasicAdjustType p0){
       this.copyOnWrite();
       this.instance.setFilterBasicAdjustType(p0);
       return this;
    }
    public EffectCommand$Builder setFilterBasicAdjustTypeValue(int p0){
       this.copyOnWrite();
       this.instance.setFilterBasicAdjustTypeValue(p0);
       return this;
    }
    public EffectCommand$Builder setFlashlightIntensity(float p0){
       this.copyOnWrite();
       this.instance.setFlashlightIntensity(p0);
       return this;
    }
    public EffectCommand$Builder setGenderUsingType(GenderUsingType p0){
       this.copyOnWrite();
       this.instance.setGenderUsingType(p0);
       return this;
    }
    public EffectCommand$Builder setGenderUsingTypeValue(int p0){
       this.copyOnWrite();
       this.instance.setGenderUsingTypeValue(p0);
       return this;
    }
    public EffectCommand$Builder setGroupEffect(EffectResource$Builder p0){
       this.copyOnWrite();
       this.instance.setGroupEffect(p0);
       return this;
    }
    public EffectCommand$Builder setGroupEffect(EffectResource p0){
       this.copyOnWrite();
       this.instance.setGroupEffect(p0);
       return this;
    }
    public EffectCommand$Builder setGroupName(String p0){
       this.copyOnWrite();
       this.instance.setGroupName(p0);
       return this;
    }
    public EffectCommand$Builder setGroupNameBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setGroupNameBytes(p0);
       return this;
    }
    public EffectCommand$Builder setHairClipConfig(HairClipConfig$Builder p0){
       this.copyOnWrite();
       this.instance.setHairClipConfig(p0);
       return this;
    }
    public EffectCommand$Builder setHairClipConfig(HairClipConfig p0){
       this.copyOnWrite();
       this.instance.setHairClipConfig(p0);
       return this;
    }
    public EffectCommand$Builder setHairDyeingMode(HairDyeingMode p0){
       this.copyOnWrite();
       this.instance.setHairDyeingMode(p0);
       return this;
    }
    public EffectCommand$Builder setHairDyeingModeValue(int p0){
       this.copyOnWrite();
       this.instance.setHairDyeingModeValue(p0);
       return this;
    }
    public EffectCommand$Builder setHairSofteningImageMode(boolean p0){
       this.copyOnWrite();
       this.instance.setHairSofteningImageMode(p0);
       return this;
    }
    public EffectCommand$Builder setHairSofteningStrength(float p0){
       this.copyOnWrite();
       this.instance.setHairSofteningStrength(p0);
       return this;
    }
    public EffectCommand$Builder setHumanMattingType(HumanMattingType p0){
       this.copyOnWrite();
       this.instance.setHumanMattingType(p0);
       return this;
    }
    public EffectCommand$Builder setHumanMattingTypeValue(int p0){
       this.copyOnWrite();
       this.instance.setHumanMattingTypeValue(p0);
       return this;
    }
    public EffectCommand$Builder setInputText(String p0){
       this.copyOnWrite();
       this.instance.setInputText(p0);
       return this;
    }
    public EffectCommand$Builder setInputTextBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setInputTextBytes(p0);
       return this;
    }
    public EffectCommand$Builder setInputTextIndex(int p0){
       this.copyOnWrite();
       this.instance.setInputTextIndex(p0);
       return this;
    }
    public EffectCommand$Builder setIntensityWeight(float p0){
       this.copyOnWrite();
       this.instance.setIntensityWeight(p0);
       return this;
    }
    public EffectCommand$Builder setIntputTextFont(String p0){
       this.copyOnWrite();
       this.instance.setIntputTextFont(p0);
       return this;
    }
    public EffectCommand$Builder setIntputTextFontBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setIntputTextFontBytes(p0);
       return this;
    }
    public EffectCommand$Builder setIsActive(boolean p0){
       this.copyOnWrite();
       this.instance.setIsActive(p0);
       return this;
    }
    public EffectCommand$Builder setIsEditAutoStatus(boolean p0){
       this.copyOnWrite();
       this.instance.setIsEditAutoStatus(p0);
       return this;
    }
    public EffectCommand$Builder setIsEditFlawAuto(boolean p0){
       this.copyOnWrite();
       this.instance.setIsEditFlawAuto(p0);
       return this;
    }
    public EffectCommand$Builder setIsEditStatus(boolean p0){
       this.copyOnWrite();
       this.instance.setIsEditStatus(p0);
       return this;
    }
    public EffectCommand$Builder setIsLivePk360P(boolean p0){
       this.copyOnWrite();
       this.instance.setIsLivePk360P(p0);
       return this;
    }
    public EffectCommand$Builder setIsMagicRemovelStatus(boolean p0){
       this.copyOnWrite();
       this.instance.setIsMagicRemovelStatus(p0);
       return this;
    }
    public EffectCommand$Builder setIsMainSticker(boolean p0){
       this.copyOnWrite();
       this.instance.setIsMainSticker(p0);
       return this;
    }
    public EffectCommand$Builder setIsOpenFlaw(boolean p0){
       this.copyOnWrite();
       this.instance.setIsOpenFlaw(p0);
       return this;
    }
    public EffectCommand$Builder setLiquifyIntensity(float p0){
       this.copyOnWrite();
       this.instance.setLiquifyIntensity(p0);
       return this;
    }
    public EffectCommand$Builder setLiquifyRadius(float p0){
       this.copyOnWrite();
       this.instance.setLiquifyRadius(p0);
       return this;
    }
    public EffectCommand$Builder setLiquifySize(FMSize$Builder p0){
       this.copyOnWrite();
       this.instance.setLiquifySize(p0);
       return this;
    }
    public EffectCommand$Builder setLiquifySize(FMSize p0){
       this.copyOnWrite();
       this.instance.setLiquifySize(p0);
       return this;
    }
    public EffectCommand$Builder setLiquifyStride(float p0){
       this.copyOnWrite();
       this.instance.setLiquifyStride(p0);
       return this;
    }
    public EffectCommand$Builder setLiquifyType(LiquifyType p0){
       this.copyOnWrite();
       this.instance.setLiquifyType(p0);
       return this;
    }
    public EffectCommand$Builder setLiquifyTypeValue(int p0){
       this.copyOnWrite();
       this.instance.setLiquifyTypeValue(p0);
       return this;
    }
    public EffectCommand$Builder setLiquifyistouchbegin(boolean p0){
       this.copyOnWrite();
       this.instance.setLiquifyistouchbegin(p0);
       return this;
    }
    public EffectCommand$Builder setLiquifyistouchend(boolean p0){
       this.copyOnWrite();
       this.instance.setLiquifyistouchend(p0);
       return this;
    }
    public EffectCommand$Builder setLookupDimension(int p0){
       this.copyOnWrite();
       this.instance.setLookupDimension(p0);
       return this;
    }
    public EffectCommand$Builder setLookupIntensity(float p0){
       this.copyOnWrite();
       this.instance.setLookupIntensity(p0);
       return this;
    }
    public EffectCommand$Builder setLookupParam(EffectLookupParam$Builder p0){
       this.copyOnWrite();
       this.instance.setLookupParam(p0);
       return this;
    }
    public EffectCommand$Builder setLookupParam(EffectLookupParam p0){
       this.copyOnWrite();
       this.instance.setLookupParam(p0);
       return this;
    }
    public EffectCommand$Builder setLookupPath(String p0){
       this.copyOnWrite();
       this.instance.setLookupPath(p0);
       return this;
    }
    public EffectCommand$Builder setLookupPathBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setLookupPathBytes(p0);
       return this;
    }
    public EffectCommand$Builder setLookupSlideParam(EffectLookupSlideParam$Builder p0){
       this.copyOnWrite();
       this.instance.setLookupSlideParam(p0);
       return this;
    }
    public EffectCommand$Builder setLookupSlideParam(EffectLookupSlideParam p0){
       this.copyOnWrite();
       this.instance.setLookupSlideParam(p0);
       return this;
    }
    public EffectCommand$Builder setLookupType(int p0){
       this.copyOnWrite();
       this.instance.setLookupType(p0);
       return this;
    }
    public EffectCommand$Builder setMagicRemovelMask(Bitmap$Builder p0){
       this.copyOnWrite();
       this.instance.setMagicRemovelMask(p0);
       return this;
    }
    public EffectCommand$Builder setMagicRemovelMask(Bitmap p0){
       this.copyOnWrite();
       this.instance.setMagicRemovelMask(p0);
       return this;
    }
    public EffectCommand$Builder setMagnifierBorderColor(int p0,float p1){
       this.copyOnWrite();
       this.instance.setMagnifierBorderColor(p0, p1);
       return this;
    }
    public EffectCommand$Builder setMagnifierBorderRadius(float p0){
       this.copyOnWrite();
       this.instance.setMagnifierBorderRadius(p0);
       return this;
    }
    public EffectCommand$Builder setMagnifierBorderWidth(float p0){
       this.copyOnWrite();
       this.instance.setMagnifierBorderWidth(p0);
       return this;
    }
    public EffectCommand$Builder setMagnifierCanvasSize(int p0,float p1){
       this.copyOnWrite();
       this.instance.setMagnifierCanvasSize(p0, p1);
       return this;
    }
    public EffectCommand$Builder setMagnifierContentScale(float p0){
       this.copyOnWrite();
       this.instance.setMagnifierContentScale(p0);
       return this;
    }
    public EffectCommand$Builder setMagnifierFaceTrackId(int p0){
       this.copyOnWrite();
       this.instance.setMagnifierFaceTrackId(p0);
       return this;
    }
    public EffectCommand$Builder setMagnifierShapePath(String p0){
       this.copyOnWrite();
       this.instance.setMagnifierShapePath(p0);
       return this;
    }
    public EffectCommand$Builder setMagnifierShapePathBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setMagnifierShapePathBytes(p0);
       return this;
    }
    public EffectCommand$Builder setMakeUpPenBrushIntensity(float p0){
       this.copyOnWrite();
       this.instance.setMakeUpPenBrushIntensity(p0);
       return this;
    }
    public EffectCommand$Builder setMakeupBackLightMode(int p0){
       this.copyOnWrite();
       this.instance.setMakeupBackLightMode(p0);
       return this;
    }
    public EffectCommand$Builder setMakeupBlendMode(int p0){
       this.copyOnWrite();
       this.instance.setMakeupBlendMode(p0);
       return this;
    }
    public EffectCommand$Builder setMakeupColor(MakeupColor$Builder p0){
       this.copyOnWrite();
       this.instance.setMakeupColor(p0);
       return this;
    }
    public EffectCommand$Builder setMakeupColor(MakeupColor p0){
       this.copyOnWrite();
       this.instance.setMakeupColor(p0);
       return this;
    }
    public EffectCommand$Builder setMakeupIntensity(float p0){
       this.copyOnWrite();
       this.instance.setMakeupIntensity(p0);
       return this;
    }
    public EffectCommand$Builder setMakeupMode(String p0){
       this.copyOnWrite();
       this.instance.setMakeupMode(p0);
       return this;
    }
    public EffectCommand$Builder setMakeupModeBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setMakeupModeBytes(p0);
       return this;
    }
    public EffectCommand$Builder setMakeupPenBrushColor(EffectColor$Builder p0){
       this.copyOnWrite();
       this.instance.setMakeupPenBrushColor(p0);
       return this;
    }
    public EffectCommand$Builder setMakeupPenBrushColor(EffectColor p0){
       this.copyOnWrite();
       this.instance.setMakeupPenBrushColor(p0);
       return this;
    }
    public EffectCommand$Builder setMakeupPenBrushHardness(float p0){
       this.copyOnWrite();
       this.instance.setMakeupPenBrushHardness(p0);
       return this;
    }
    public EffectCommand$Builder setMakeupPenBrushTexturePath(String p0){
       this.copyOnWrite();
       this.instance.setMakeupPenBrushTexturePath(p0);
       return this;
    }
    public EffectCommand$Builder setMakeupPenBrushTexturePathBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setMakeupPenBrushTexturePathBytes(p0);
       return this;
    }
    public EffectCommand$Builder setMakeupPenBrushType(EffectMakeupPenBrushType p0){
       this.copyOnWrite();
       this.instance.setMakeupPenBrushType(p0);
       return this;
    }
    public EffectCommand$Builder setMakeupPenBrushTypeValue(int p0){
       this.copyOnWrite();
       this.instance.setMakeupPenBrushTypeValue(p0);
       return this;
    }
    public EffectCommand$Builder setMakeupPenEraserColor(EffectColor$Builder p0){
       this.copyOnWrite();
       this.instance.setMakeupPenEraserColor(p0);
       return this;
    }
    public EffectCommand$Builder setMakeupPenEraserColor(EffectColor p0){
       this.copyOnWrite();
       this.instance.setMakeupPenEraserColor(p0);
       return this;
    }
    public EffectCommand$Builder setMakeupPenEraserLiveTime(float p0){
       this.copyOnWrite();
       this.instance.setMakeupPenEraserLiveTime(p0);
       return this;
    }
    public EffectCommand$Builder setMakeupPenHighLightTexturePath(String p0){
       this.copyOnWrite();
       this.instance.setMakeupPenHighLightTexturePath(p0);
       return this;
    }
    public EffectCommand$Builder setMakeupPenHighLightTexturePathBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setMakeupPenHighLightTexturePathBytes(p0);
       return this;
    }
    public EffectCommand$Builder setMakeupPenIsEraser(boolean p0){
       this.copyOnWrite();
       this.instance.setMakeupPenIsEraser(p0);
       return this;
    }
    public EffectCommand$Builder setMakeupPenPointSize(float p0){
       this.copyOnWrite();
       this.instance.setMakeupPenPointSize(p0);
       return this;
    }
    public EffectCommand$Builder setMakeupPenPointStride(float p0){
       this.copyOnWrite();
       this.instance.setMakeupPenPointStride(p0);
       return this;
    }
    public EffectCommand$Builder setMakeupPenTouch(MakeupPenTouch$Builder p0){
       this.copyOnWrite();
       this.instance.setMakeupPenTouch(p0);
       return this;
    }
    public EffectCommand$Builder setMakeupPenTouch(MakeupPenTouch p0){
       this.copyOnWrite();
       this.instance.setMakeupPenTouch(p0);
       return this;
    }
    public EffectCommand$Builder setMakeupResource(int p0,MakeupResource$Builder p1){
       this.copyOnWrite();
       this.instance.setMakeupResource(p0, p1);
       return this;
    }
    public EffectCommand$Builder setMakeupResource(int p0,MakeupResource p1){
       this.copyOnWrite();
       this.instance.setMakeupResource(p0, p1);
       return this;
    }
    public EffectCommand$Builder setMemojiEnableEditMode(boolean p0){
       this.copyOnWrite();
       this.instance.setMemojiEnableEditMode(p0);
       return this;
    }
    public EffectCommand$Builder setMemojiGroup(String p0){
       this.copyOnWrite();
       this.instance.setMemojiGroup(p0);
       return this;
    }
    public EffectCommand$Builder setMemojiGroupBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setMemojiGroupBytes(p0);
       return this;
    }
    public EffectCommand$Builder setMemojiIconHeight(int p0){
       this.copyOnWrite();
       this.instance.setMemojiIconHeight(p0);
       return this;
    }
    public EffectCommand$Builder setMemojiIconWidth(int p0){
       this.copyOnWrite();
       this.instance.setMemojiIconWidth(p0);
       return this;
    }
    public EffectCommand$Builder setMemojiStyle(String p0){
       this.copyOnWrite();
       this.instance.setMemojiStyle(p0);
       return this;
    }
    public EffectCommand$Builder setMemojiStyleBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setMemojiStyleBytes(p0);
       return this;
    }
    public EffectCommand$Builder setMemojiUserConfigJson(String p0){
       this.copyOnWrite();
       this.instance.setMemojiUserConfigJson(p0);
       return this;
    }
    public EffectCommand$Builder setMemojiUserConfigJsonBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setMemojiUserConfigJsonBytes(p0);
       return this;
    }
    public EffectCommand$Builder setMoreMediaData(int p0,PickingMediaData$Builder p1){
       this.copyOnWrite();
       this.instance.setMoreMediaData(p0, p1);
       return this;
    }
    public EffectCommand$Builder setMoreMediaData(int p0,PickingMediaData p1){
       this.copyOnWrite();
       this.instance.setMoreMediaData(p0, p1);
       return this;
    }
    public EffectCommand$Builder setMoveMagnifierContentDistance(int p0,float p1){
       this.copyOnWrite();
       this.instance.setMoveMagnifierContentDistance(p0, p1);
       return this;
    }
    public EffectCommand$Builder setMusicWavePath(String p0){
       this.copyOnWrite();
       this.instance.setMusicWavePath(p0);
       return this;
    }
    public EffectCommand$Builder setMusicWavePathBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setMusicWavePathBytes(p0);
       return this;
    }
    public EffectCommand$Builder setMusicWaveTime(float p0){
       this.copyOnWrite();
       this.instance.setMusicWaveTime(p0);
       return this;
    }
    public EffectCommand$Builder setNEditFlawUndoNums(int p0){
       this.copyOnWrite();
       this.instance.setNEditFlawUndoNums(p0);
       return this;
    }
    public EffectCommand$Builder setNMagicRemovelUndoNums(int p0){
       this.copyOnWrite();
       this.instance.setNMagicRemovelUndoNums(p0);
       return this;
    }
    public EffectCommand$Builder setNeedMakeupClearOldResource(boolean p0){
       this.copyOnWrite();
       this.instance.setNeedMakeupClearOldResource(p0);
       return this;
    }
    public EffectCommand$Builder setNoseShadowIntensity(float p0){
       this.copyOnWrite();
       this.instance.setNoseShadowIntensity(p0);
       return this;
    }
    public EffectCommand$Builder setOilfreeIntensity(float p0){
       this.copyOnWrite();
       this.instance.setOilfreeIntensity(p0);
       return this;
    }
    public EffectCommand$Builder setOilpaintSourcePath(String p0){
       this.copyOnWrite();
       this.instance.setOilpaintSourcePath(p0);
       return this;
    }
    public EffectCommand$Builder setOilpaintSourcePathBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setOilpaintSourcePathBytes(p0);
       return this;
    }
    public EffectCommand$Builder setPassThroughParams(String p0){
       this.copyOnWrite();
       this.instance.setPassThroughParams(p0);
       return this;
    }
    public EffectCommand$Builder setPassThroughParamsBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setPassThroughParamsBytes(p0);
       return this;
    }
    public EffectCommand$Builder setPickingMediaPath(String p0){
       this.copyOnWrite();
       this.instance.setPickingMediaPath(p0);
       return this;
    }
    public EffectCommand$Builder setPickingMediaPathBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setPickingMediaPathBytes(p0);
       return this;
    }
    public EffectCommand$Builder setPickingMediaType(PickingMediaResType p0){
       this.copyOnWrite();
       this.instance.setPickingMediaType(p0);
       return this;
    }
    public EffectCommand$Builder setPickingMediaTypeValue(int p0){
       this.copyOnWrite();
       this.instance.setPickingMediaTypeValue(p0);
       return this;
    }
    public EffectCommand$Builder setPlayrate(float p0){
       this.copyOnWrite();
       this.instance.setPlayrate(p0);
       return this;
    }
    public EffectCommand$Builder setRelightingConfig(RelightingConfig$Builder p0){
       this.copyOnWrite();
       this.instance.setRelightingConfig(p0);
       return this;
    }
    public EffectCommand$Builder setRelightingConfig(RelightingConfig p0){
       this.copyOnWrite();
       this.instance.setRelightingConfig(p0);
       return this;
    }
    public EffectCommand$Builder setSafeUiArea(SafeUIArea$Builder p0){
       this.copyOnWrite();
       this.instance.setSafeUiArea(p0);
       return this;
    }
    public EffectCommand$Builder setSafeUiArea(SafeUIArea p0){
       this.copyOnWrite();
       this.instance.setSafeUiArea(p0);
       return this;
    }
    public EffectCommand$Builder setSeekPoint(float p0){
       this.copyOnWrite();
       this.instance.setSeekPoint(p0);
       return this;
    }
    public EffectCommand$Builder setServerMediaType(PickingMediaResType p0){
       this.copyOnWrite();
       this.instance.setServerMediaType(p0);
       return this;
    }
    public EffectCommand$Builder setServerMediaTypeValue(int p0){
       this.copyOnWrite();
       this.instance.setServerMediaTypeValue(p0);
       return this;
    }
    public EffectCommand$Builder setServerResultPath(String p0){
       this.copyOnWrite();
       this.instance.setServerResultPath(p0);
       return this;
    }
    public EffectCommand$Builder setServerResultPathBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setServerResultPathBytes(p0);
       return this;
    }
    public EffectCommand$Builder setSetEditFlawParams(EditFlawConfig$Builder p0){
       this.copyOnWrite();
       this.instance.setSetEditFlawParams(p0);
       return this;
    }
    public EffectCommand$Builder setSetEditFlawParams(EditFlawConfig p0){
       this.copyOnWrite();
       this.instance.setSetEditFlawParams(p0);
       return this;
    }
    public EffectCommand$Builder setSetFaceSegForBeauty(boolean p0){
       this.copyOnWrite();
       this.instance.setSetFaceSegForBeauty(p0);
       return this;
    }
    public EffectCommand$Builder setShouldUseFacemask(boolean p0){
       this.copyOnWrite();
       this.instance.setShouldUseFacemask(p0);
       return this;
    }
    public EffectCommand$Builder setShouldUseGender(boolean p0){
       this.copyOnWrite();
       this.instance.setShouldUseGender(p0);
       return this;
    }
    public EffectCommand$Builder setShouldUseLandmarksmask(boolean p0){
       this.copyOnWrite();
       this.instance.setShouldUseLandmarksmask(p0);
       return this;
    }
    public EffectCommand$Builder setSlideEndWithNewEffect(boolean p0){
       this.copyOnWrite();
       this.instance.setSlideEndWithNewEffect(p0);
       return this;
    }
    public EffectCommand$Builder setSlideNewEffectDisplayLeft(float p0){
       this.copyOnWrite();
       this.instance.setSlideNewEffectDisplayLeft(p0);
       return this;
    }
    public EffectCommand$Builder setSlideNewEffectDisplayRight(float p0){
       this.copyOnWrite();
       this.instance.setSlideNewEffectDisplayRight(p0);
       return this;
    }
    public EffectCommand$Builder setSmartBeautyIntensity(float p0){
       this.copyOnWrite();
       this.instance.setSmartBeautyIntensity(p0);
       return this;
    }
    public EffectCommand$Builder setSoften(float p0){
       this.copyOnWrite();
       this.instance.setSoften(p0);
       return this;
    }
    public EffectCommand$Builder setStartPoint(FMPoint$Builder p0){
       this.copyOnWrite();
       this.instance.setStartPoint(p0);
       return this;
    }
    public EffectCommand$Builder setStartPoint(FMPoint p0){
       this.copyOnWrite();
       this.instance.setStartPoint(p0);
       return this;
    }
    public EffectCommand$Builder setSticker(StickerInfo$Builder p0){
       this.copyOnWrite();
       this.instance.setSticker(p0);
       return this;
    }
    public EffectCommand$Builder setSticker(StickerInfo p0){
       this.copyOnWrite();
       this.instance.setSticker(p0);
       return this;
    }
    public EffectCommand$Builder setStickerEnable(boolean p0){
       this.copyOnWrite();
       this.instance.setStickerEnable(p0);
       return this;
    }
    public EffectCommand$Builder setStickerIntensityWeightActive(boolean p0){
       this.copyOnWrite();
       this.instance.setStickerIntensityWeightActive(p0);
       return this;
    }
    public EffectCommand$Builder setStickerMainEnable(boolean p0){
       this.copyOnWrite();
       this.instance.setStickerMainEnable(p0);
       return this;
    }
    public EffectCommand$Builder setStickers(int p0,StickerInfo$Builder p1){
       this.copyOnWrite();
       this.instance.setStickers(p0, p1);
       return this;
    }
    public EffectCommand$Builder setStickers(int p0,StickerInfo p1){
       this.copyOnWrite();
       this.instance.setStickers(p0, p1);
       return this;
    }
    public EffectCommand$Builder setSwapFaceImagePath(String p0){
       this.copyOnWrite();
       this.instance.setSwapFaceImagePath(p0);
       return this;
    }
    public EffectCommand$Builder setSwapFaceImagePathBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setSwapFaceImagePathBytes(p0);
       return this;
    }
    public EffectCommand$Builder setTeethBrightenIntensity(float p0){
       this.copyOnWrite();
       this.instance.setTeethBrightenIntensity(p0);
       return this;
    }
    public EffectCommand$Builder setThermageIntensity(float p0){
       this.copyOnWrite();
       this.instance.setThermageIntensity(p0);
       return this;
    }
    public EffectCommand$Builder setTimestamp(FMTimeStamp$Builder p0){
       this.copyOnWrite();
       this.instance.setTimestamp(p0);
       return this;
    }
    public EffectCommand$Builder setTimestamp(FMTimeStamp p0){
       this.copyOnWrite();
       this.instance.setTimestamp(p0);
       return this;
    }
    public EffectCommand$Builder setTriggerInputText(String p0){
       this.copyOnWrite();
       this.instance.setTriggerInputText(p0);
       return this;
    }
    public EffectCommand$Builder setTriggerInputTextBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setTriggerInputTextBytes(p0);
       return this;
    }
    public EffectCommand$Builder setTriggerInputTextIndex(int p0){
       this.copyOnWrite();
       this.instance.setTriggerInputTextIndex(p0);
       return this;
    }
    public EffectCommand$Builder setUseLowPowerSensor(boolean p0){
       this.copyOnWrite();
       this.instance.setUseLowPowerSensor(p0);
       return this;
    }
    public EffectCommand$Builder setUseMaleMakeup(boolean p0){
       this.copyOnWrite();
       this.instance.setUseMaleMakeup(p0);
       return this;
    }
    public EffectCommand$Builder setUseSkinAndHairSegModel(boolean p0){
       this.copyOnWrite();
       this.instance.setUseSkinAndHairSegModel(p0);
       return this;
    }
    public EffectCommand$Builder setUserLocation(String p0){
       this.copyOnWrite();
       this.instance.setUserLocation(p0);
       return this;
    }
    public EffectCommand$Builder setUserLocationBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setUserLocationBytes(p0);
       return this;
    }
    public EffectCommand$Builder setVideoLength(int p0){
       this.copyOnWrite();
       this.instance.setVideoLength(p0);
       return this;
    }
    public EffectCommand$Builder setWaterSkinIntensity(float p0){
       this.copyOnWrite();
       this.instance.setWaterSkinIntensity(p0);
       return this;
    }
    public EffectCommand$Builder setWeakenMakeupIntensityProp(int p0){
       this.copyOnWrite();
       this.instance.setWeakenMakeupIntensityProp(p0);
       return this;
    }
    public EffectCommand$Builder setWhiteSkinConfig(String p0){
       this.copyOnWrite();
       this.instance.setWhiteSkinConfig(p0);
       return this;
    }
    public EffectCommand$Builder setWhiteSkinConfigBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setWhiteSkinConfigBytes(p0);
       return this;
    }
    public EffectCommand$Builder setWhiteSkinIntensity(float p0){
       this.copyOnWrite();
       this.instance.setWhiteSkinIntensity(p0);
       return this;
    }
    public EffectCommand$Builder setWocanIntensity(float p0){
       this.copyOnWrite();
       this.instance.setWocanIntensity(p0);
       return this;
    }
    public EffectCommand$Builder setWrinkleRemoveIntensity(float p0){
       this.copyOnWrite();
       this.instance.setWrinkleRemoveIntensity(p0);
       return this;
    }
}
