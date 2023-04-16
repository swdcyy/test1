package com.kwai.video.westeros.models.EffectControlOrBuilder;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kwai.video.westeros.models.BeautifyV3Mode;
import com.kwai.video.westeros.models.BeautifyVersion;
import com.kwai.video.westeros.models.PoliticDetectParam;

public interface abstract EffectControlOrBuilder implements MessageLiteOrBuilder	// class@000f0c
{

    String getBeautifyGroupPath();
    ByteString getBeautifyGroupPathBytes();
    BeautifyV3Mode getBeautifyV3Mode();
    int getBeautifyV3ModeValue();
    BeautifyVersion getBeautifyVersion();
    int getBeautifyVersionValue();
    boolean getDisableBeautifyV3();
    boolean getEnableBasicAdjustEffect();
    boolean getEnableBeautifyEffect();
    boolean getEnableBeautyzerooptEffect();
    boolean getEnableBodySlimmingEffect();
    boolean getEnableClarityEffect();
    boolean getEnableDefinitionEffect();
    boolean getEnableDeformEffect();
    boolean getEnableEvenSkinEffect();
    boolean getEnableFacetextureEffect();
    boolean getEnableFastflawEffect();
    boolean getEnableFlashlightEffect();
    boolean getEnableFlawEffect();
    boolean getEnableHairDyeingEffect();
    boolean getEnableHairSofteningEffect();
    boolean getEnableLiquifyEffect();
    boolean getEnableLookupEffect();
    boolean getEnableMagicRemovelEffect();
    boolean getEnableMagnifierEffect();
    boolean getEnableMakeupEffect();
    boolean getEnableMakeupPen();
    boolean getEnableManualWrinkleCleanerEffect();
    boolean getEnableOilPaintEffect();
    boolean getEnableOilfreeEffect();
    boolean getEnableRelightingEffect();
    boolean getEnableStickerEffect();
    boolean getEnableStickerMainEffect();
    boolean getEnableWhiteSkinEffect();
    PoliticDetectParam getPoliticDetectParam();
    boolean hasPoliticDetectParam();
}
