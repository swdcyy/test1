package com.kwai.video.westeros.models.EffectControl;
import com.kwai.video.westeros.models.EffectControlOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kwai.video.westeros.models.EffectControl$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import java.lang.String;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kwai.video.westeros.models.EffectControl$1;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import com.kwai.video.westeros.models.BeautifyV3Mode;
import com.kwai.video.westeros.models.BeautifyVersion;
import com.kwai.video.westeros.models.PoliticDetectParam;
import java.util.Objects;
import com.kwai.video.westeros.models.PoliticDetectParam$Builder;
import com.google.protobuf.AbstractMessageLite;

public final class EffectControl extends GeneratedMessageLite implements EffectControlOrBuilder	// class@000f0b
{
    public String beautifyGroupPath_;
    public int beautifyV3Mode_;
    public int beautifyVersion_;
    public boolean disableBeautifyV3_;
    public boolean enableBasicAdjustEffect_;
    public boolean enableBeautifyEffect_;
    public boolean enableBeautyzerooptEffect_;
    public boolean enableBodySlimmingEffect_;
    public boolean enableClarityEffect_;
    public boolean enableDefinitionEffect_;
    public boolean enableDeformEffect_;
    public boolean enableEvenSkinEffect_;
    public boolean enableFacetextureEffect_;
    public boolean enableFastflawEffect_;
    public boolean enableFlashlightEffect_;
    public boolean enableFlawEffect_;
    public boolean enableHairDyeingEffect_;
    public boolean enableHairSofteningEffect_;
    public boolean enableLiquifyEffect_;
    public boolean enableLookupEffect_;
    public boolean enableMagicRemovelEffect_;
    public boolean enableMagnifierEffect_;
    public boolean enableMakeupEffect_;
    public boolean enableMakeupPen_;
    public boolean enableManualWrinkleCleanerEffect_;
    public boolean enableOilPaintEffect_;
    public boolean enableOilfreeEffect_;
    public boolean enableRelightingEffect_;
    public boolean enableStickerEffect_;
    public boolean enableStickerMainEffect_;
    public boolean enableWhiteSkinEffect_;
    public PoliticDetectParam politicDetectParam_;
    public static final EffectControl DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       EffectControl uEffectContr = new EffectControl();
       EffectControl.DEFAULT_INSTANCE = uEffectContr;
       GeneratedMessageLite.registerDefaultInstance(EffectControl.class, uEffectContr);
    }
    public void EffectControl(){
       super();
       this.beautifyGroupPath_ = "";
    }
    public static EffectControl getDefaultInstance(){
       return EffectControl.DEFAULT_INSTANCE;
    }
    public static EffectControl$Builder newBuilder(){
       return EffectControl.DEFAULT_INSTANCE.createBuilder();
    }
    public static EffectControl$Builder newBuilder(EffectControl p0){
       return EffectControl.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static EffectControl parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(EffectControl.DEFAULT_INSTANCE, p0);
    }
    public static EffectControl parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(EffectControl.DEFAULT_INSTANCE, p0, p1);
    }
    public static EffectControl parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(EffectControl.DEFAULT_INSTANCE, p0);
    }
    public static EffectControl parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EffectControl.DEFAULT_INSTANCE, p0, p1);
    }
    public static EffectControl parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(EffectControl.DEFAULT_INSTANCE, p0);
    }
    public static EffectControl parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EffectControl.DEFAULT_INSTANCE, p0, p1);
    }
    public static EffectControl parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(EffectControl.DEFAULT_INSTANCE, p0);
    }
    public static EffectControl parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EffectControl.DEFAULT_INSTANCE, p0, p1);
    }
    public static EffectControl parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(EffectControl.DEFAULT_INSTANCE, p0);
    }
    public static EffectControl parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EffectControl.DEFAULT_INSTANCE, p0, p1);
    }
    public static EffectControl parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(EffectControl.DEFAULT_INSTANCE, p0);
    }
    public static EffectControl parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(EffectControl.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return EffectControl.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearBeautifyGroupPath(){
       this.beautifyGroupPath_ = EffectControl.getDefaultInstance().getBeautifyGroupPath();
    }
    public void clearBeautifyV3Mode(){
       this.beautifyV3Mode_ = 0;
    }
    public void clearBeautifyVersion(){
       this.beautifyVersion_ = 0;
    }
    public void clearDisableBeautifyV3(){
       this.disableBeautifyV3_ = false;
    }
    public void clearEnableBasicAdjustEffect(){
       this.enableBasicAdjustEffect_ = false;
    }
    public void clearEnableBeautifyEffect(){
       this.enableBeautifyEffect_ = false;
    }
    public void clearEnableBeautyzerooptEffect(){
       this.enableBeautyzerooptEffect_ = false;
    }
    public void clearEnableBodySlimmingEffect(){
       this.enableBodySlimmingEffect_ = false;
    }
    public void clearEnableClarityEffect(){
       this.enableClarityEffect_ = false;
    }
    public void clearEnableDefinitionEffect(){
       this.enableDefinitionEffect_ = false;
    }
    public void clearEnableDeformEffect(){
       this.enableDeformEffect_ = false;
    }
    public void clearEnableEvenSkinEffect(){
       this.enableEvenSkinEffect_ = false;
    }
    public void clearEnableFacetextureEffect(){
       this.enableFacetextureEffect_ = false;
    }
    public void clearEnableFastflawEffect(){
       this.enableFastflawEffect_ = false;
    }
    public void clearEnableFlashlightEffect(){
       this.enableFlashlightEffect_ = false;
    }
    public void clearEnableFlawEffect(){
       this.enableFlawEffect_ = false;
    }
    public void clearEnableHairDyeingEffect(){
       this.enableHairDyeingEffect_ = false;
    }
    public void clearEnableHairSofteningEffect(){
       this.enableHairSofteningEffect_ = false;
    }
    public void clearEnableLiquifyEffect(){
       this.enableLiquifyEffect_ = false;
    }
    public void clearEnableLookupEffect(){
       this.enableLookupEffect_ = false;
    }
    public void clearEnableMagicRemovelEffect(){
       this.enableMagicRemovelEffect_ = false;
    }
    public void clearEnableMagnifierEffect(){
       this.enableMagnifierEffect_ = false;
    }
    public void clearEnableMakeupEffect(){
       this.enableMakeupEffect_ = false;
    }
    public void clearEnableMakeupPen(){
       this.enableMakeupPen_ = false;
    }
    public void clearEnableManualWrinkleCleanerEffect(){
       this.enableManualWrinkleCleanerEffect_ = false;
    }
    public void clearEnableOilPaintEffect(){
       this.enableOilPaintEffect_ = false;
    }
    public void clearEnableOilfreeEffect(){
       this.enableOilfreeEffect_ = false;
    }
    public void clearEnableRelightingEffect(){
       this.enableRelightingEffect_ = false;
    }
    public void clearEnableStickerEffect(){
       this.enableStickerEffect_ = false;
    }
    public void clearEnableStickerMainEffect(){
       this.enableStickerMainEffect_ = false;
    }
    public void clearEnableWhiteSkinEffect(){
       this.enableWhiteSkinEffect_ = false;
    }
    public void clearPoliticDetectParam(){
       this.politicDetectParam_ = null;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (EffectControl$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[p0.ordinal()]){
           case 1:
             return new EffectControl();
           case 2:
             return new EffectControl$Builder(p2);
           case 3:
             Object[] objArray = new Object[32];
             objArray[0] = "enableLookupEffect_";
             objArray[i] = "enableBeautifyEffect_";
             objArray[2] = "enableMakeupEffect_";
             objArray[3] = "enableDeformEffect_";
             objArray[4] = "enableBasicAdjustEffect_";
             objArray[5] = "disableBeautifyV3_";
             objArray[6] = "beautifyV3Mode_";
             objArray[7] = "beautifyVersion_";
             objArray[8] = "enableBodySlimmingEffect_";
             objArray[9] = "enableHairSofteningEffect_";
             objArray[10] = "enableRelightingEffect_";
             objArray[11] = "enableLiquifyEffect_";
             objArray[12] = "enableHairDyeingEffect_";
             objArray[13] = "enableFlawEffect_";
             objArray[14] = "enableOilPaintEffect_";
             objArray[15] = "enableClarityEffect_";
             objArray[16] = "enableEvenSkinEffect_";
             objArray[17] = "enableWhiteSkinEffect_";
             objArray[18] = "enableFastflawEffect_";
             objArray[19] = "enableMagicRemovelEffect_";
             objArray[20] = "enableOilfreeEffect_";
             objArray[21] = "enableFacetextureEffect_";
             objArray[22] = "enableBeautyzerooptEffect_";
             objArray[23] = "politicDetectParam_";
             objArray[24] = "enableMagnifierEffect_";
             objArray[25] = "enableFlashlightEffect_";
             objArray[26] = "enableManualWrinkleCleanerEffect_";
             objArray[27] = "enableStickerEffect_";
             objArray[28] = "enableStickerMainEffect_";
             objArray[29] = "enableMakeupPen_";
             objArray[30] = "beautifyGroupPath_";
             objArray[31] = "enableDefinitionEffect_";
             return GeneratedMessageLite.newMessageInfo(EffectControl.DEFAULT_INSTANCE, "\xff\x02\xff\x02 \xff\x02\xff\x02\xff\x02\xff\x02\x01  \xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x07\x02\x07\x03\x07\x04\x07\x05\x07\x06\x07\x07\f\b\f\t\x07\n\x07\x0b\x07\f\x07\r\x07\x0e\x07\x0f\x07\x10\x07\x11\x07\x12\x07\x13\x07\x14\x07\x15\x07\x16\x07\x17\x07\x18\t\x19\x07\x1a\x07\x1b\x07\x1c\x07\x1d\x07\x1e\x07\x1f\x02\x02 \x07\x00", objArray);
           case 4:
             return EffectControl.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = EffectControl.PARSER;
             if (pARSER == null) {
                _monitor_enter(EffectControl.class);
                pARSER = EffectControl.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(EffectControl.DEFAULT_INSTANCE);
                   EffectControl.PARSER = pARSER;
                }
                _monitor_exit(EffectControl.class);
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
    public String getBeautifyGroupPath(){
       return this.beautifyGroupPath_;
    }
    public ByteString getBeautifyGroupPathBytes(){
       return ByteString.copyFromUtf8(this.beautifyGroupPath_);
    }
    public BeautifyV3Mode getBeautifyV3Mode(){
       BeautifyV3Mode uBeautifyV3M = BeautifyV3Mode.forNumber(this.beautifyV3Mode_);
       if (uBeautifyV3M == null) {
          uBeautifyV3M = BeautifyV3Mode.UNRECOGNIZED;
       }
       return uBeautifyV3M;
    }
    public int getBeautifyV3ModeValue(){
       return this.beautifyV3Mode_;
    }
    public BeautifyVersion getBeautifyVersion(){
       BeautifyVersion uBeautifyVer = BeautifyVersion.forNumber(this.beautifyVersion_);
       if (uBeautifyVer == null) {
          uBeautifyVer = BeautifyVersion.UNRECOGNIZED;
       }
       return uBeautifyVer;
    }
    public int getBeautifyVersionValue(){
       return this.beautifyVersion_;
    }
    public boolean getDisableBeautifyV3(){
       return this.disableBeautifyV3_;
    }
    public boolean getEnableBasicAdjustEffect(){
       return this.enableBasicAdjustEffect_;
    }
    public boolean getEnableBeautifyEffect(){
       return this.enableBeautifyEffect_;
    }
    public boolean getEnableBeautyzerooptEffect(){
       return this.enableBeautyzerooptEffect_;
    }
    public boolean getEnableBodySlimmingEffect(){
       return this.enableBodySlimmingEffect_;
    }
    public boolean getEnableClarityEffect(){
       return this.enableClarityEffect_;
    }
    public boolean getEnableDefinitionEffect(){
       return this.enableDefinitionEffect_;
    }
    public boolean getEnableDeformEffect(){
       return this.enableDeformEffect_;
    }
    public boolean getEnableEvenSkinEffect(){
       return this.enableEvenSkinEffect_;
    }
    public boolean getEnableFacetextureEffect(){
       return this.enableFacetextureEffect_;
    }
    public boolean getEnableFastflawEffect(){
       return this.enableFastflawEffect_;
    }
    public boolean getEnableFlashlightEffect(){
       return this.enableFlashlightEffect_;
    }
    public boolean getEnableFlawEffect(){
       return this.enableFlawEffect_;
    }
    public boolean getEnableHairDyeingEffect(){
       return this.enableHairDyeingEffect_;
    }
    public boolean getEnableHairSofteningEffect(){
       return this.enableHairSofteningEffect_;
    }
    public boolean getEnableLiquifyEffect(){
       return this.enableLiquifyEffect_;
    }
    public boolean getEnableLookupEffect(){
       return this.enableLookupEffect_;
    }
    public boolean getEnableMagicRemovelEffect(){
       return this.enableMagicRemovelEffect_;
    }
    public boolean getEnableMagnifierEffect(){
       return this.enableMagnifierEffect_;
    }
    public boolean getEnableMakeupEffect(){
       return this.enableMakeupEffect_;
    }
    public boolean getEnableMakeupPen(){
       return this.enableMakeupPen_;
    }
    public boolean getEnableManualWrinkleCleanerEffect(){
       return this.enableManualWrinkleCleanerEffect_;
    }
    public boolean getEnableOilPaintEffect(){
       return this.enableOilPaintEffect_;
    }
    public boolean getEnableOilfreeEffect(){
       return this.enableOilfreeEffect_;
    }
    public boolean getEnableRelightingEffect(){
       return this.enableRelightingEffect_;
    }
    public boolean getEnableStickerEffect(){
       return this.enableStickerEffect_;
    }
    public boolean getEnableStickerMainEffect(){
       return this.enableStickerMainEffect_;
    }
    public boolean getEnableWhiteSkinEffect(){
       return this.enableWhiteSkinEffect_;
    }
    public PoliticDetectParam getPoliticDetectParam(){
       EffectControl tpoliticDete = this.politicDetectParam_;
       if (tpoliticDete == null) {
          tpoliticDete = PoliticDetectParam.getDefaultInstance();
       }
       return tpoliticDete;
    }
    public boolean hasPoliticDetectParam(){
       boolean b = (this.politicDetectParam_ != null)? true: false;
       return b;
    }
    public void mergePoliticDetectParam(PoliticDetectParam p0){
       Objects.requireNonNull(p0);
       EffectControl tpoliticDete = this.politicDetectParam_;
       this.politicDetectParam_ = (tpoliticDete != null && tpoliticDete != PoliticDetectParam.getDefaultInstance())? PoliticDetectParam.newBuilder(this.politicDetectParam_).mergeFrom(p0).buildPartial(): p0;
       return;
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
    public void setBeautifyV3Mode(BeautifyV3Mode p0){
       Objects.requireNonNull(p0);
       this.beautifyV3Mode_ = p0.getNumber();
    }
    public void setBeautifyV3ModeValue(int p0){
       this.beautifyV3Mode_ = p0;
    }
    public void setBeautifyVersion(BeautifyVersion p0){
       Objects.requireNonNull(p0);
       this.beautifyVersion_ = p0.getNumber();
    }
    public void setBeautifyVersionValue(int p0){
       this.beautifyVersion_ = p0;
    }
    public void setDisableBeautifyV3(boolean p0){
       this.disableBeautifyV3_ = p0;
    }
    public void setEnableBasicAdjustEffect(boolean p0){
       this.enableBasicAdjustEffect_ = p0;
    }
    public void setEnableBeautifyEffect(boolean p0){
       this.enableBeautifyEffect_ = p0;
    }
    public void setEnableBeautyzerooptEffect(boolean p0){
       this.enableBeautyzerooptEffect_ = p0;
    }
    public void setEnableBodySlimmingEffect(boolean p0){
       this.enableBodySlimmingEffect_ = p0;
    }
    public void setEnableClarityEffect(boolean p0){
       this.enableClarityEffect_ = p0;
    }
    public void setEnableDefinitionEffect(boolean p0){
       this.enableDefinitionEffect_ = p0;
    }
    public void setEnableDeformEffect(boolean p0){
       this.enableDeformEffect_ = p0;
    }
    public void setEnableEvenSkinEffect(boolean p0){
       this.enableEvenSkinEffect_ = p0;
    }
    public void setEnableFacetextureEffect(boolean p0){
       this.enableFacetextureEffect_ = p0;
    }
    public void setEnableFastflawEffect(boolean p0){
       this.enableFastflawEffect_ = p0;
    }
    public void setEnableFlashlightEffect(boolean p0){
       this.enableFlashlightEffect_ = p0;
    }
    public void setEnableFlawEffect(boolean p0){
       this.enableFlawEffect_ = p0;
    }
    public void setEnableHairDyeingEffect(boolean p0){
       this.enableHairDyeingEffect_ = p0;
    }
    public void setEnableHairSofteningEffect(boolean p0){
       this.enableHairSofteningEffect_ = p0;
    }
    public void setEnableLiquifyEffect(boolean p0){
       this.enableLiquifyEffect_ = p0;
    }
    public void setEnableLookupEffect(boolean p0){
       this.enableLookupEffect_ = p0;
    }
    public void setEnableMagicRemovelEffect(boolean p0){
       this.enableMagicRemovelEffect_ = p0;
    }
    public void setEnableMagnifierEffect(boolean p0){
       this.enableMagnifierEffect_ = p0;
    }
    public void setEnableMakeupEffect(boolean p0){
       this.enableMakeupEffect_ = p0;
    }
    public void setEnableMakeupPen(boolean p0){
       this.enableMakeupPen_ = p0;
    }
    public void setEnableManualWrinkleCleanerEffect(boolean p0){
       this.enableManualWrinkleCleanerEffect_ = p0;
    }
    public void setEnableOilPaintEffect(boolean p0){
       this.enableOilPaintEffect_ = p0;
    }
    public void setEnableOilfreeEffect(boolean p0){
       this.enableOilfreeEffect_ = p0;
    }
    public void setEnableRelightingEffect(boolean p0){
       this.enableRelightingEffect_ = p0;
    }
    public void setEnableStickerEffect(boolean p0){
       this.enableStickerEffect_ = p0;
    }
    public void setEnableStickerMainEffect(boolean p0){
       this.enableStickerMainEffect_ = p0;
    }
    public void setEnableWhiteSkinEffect(boolean p0){
       this.enableWhiteSkinEffect_ = p0;
    }
    public void setPoliticDetectParam(PoliticDetectParam$Builder p0){
       this.politicDetectParam_ = p0.build();
    }
    public void setPoliticDetectParam(PoliticDetectParam p0){
       Objects.requireNonNull(p0);
       this.politicDetectParam_ = p0;
    }
}
