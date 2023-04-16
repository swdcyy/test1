package com.kwai.video.westeros.models.EffectType;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kwai.video.westeros.models.EffectType$1;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kwai.video.westeros.models.EffectType$EffectTypeVerifier;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class EffectType extends Enum implements Internal$EnumLite	// class@000f48
{
    public final int value;
    public static final EffectType[] $VALUES;
    public static final EffectType UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;
    public static final EffectType kEffectTypeBasicAdjust;
    public static final EffectType kEffectTypeBeauty;
    public static final EffectType kEffectTypeBeautyZeroOpt;
    public static final EffectType kEffectTypeBodySlimming;
    public static final EffectType kEffectTypeClarity;
    public static final EffectType kEffectTypeDefinition;
    public static final EffectType kEffectTypeDeform;
    public static final EffectType kEffectTypeEvenSkin;
    public static final EffectType kEffectTypeFaceMagic;
    public static final EffectType kEffectTypeFaceTexture;
    public static final EffectType kEffectTypeFastFlaw;
    public static final EffectType kEffectTypeFlashLight;
    public static final EffectType kEffectTypeFlaw;
    public static final EffectType kEffectTypeHairDyeing;
    public static final EffectType kEffectTypeHairSoftening;
    public static final EffectType kEffectTypeLiquify;
    public static final EffectType kEffectTypeLookup;
    public static final EffectType kEffectTypeMagicRemovel;
    public static final EffectType kEffectTypeMagnifier;
    public static final EffectType kEffectTypeMakeup;
    public static final EffectType kEffectTypeMakeupPen;
    public static final EffectType kEffectTypeManualWrinkleCleaner;
    public static final EffectType kEffectTypeOilFree;
    public static final EffectType kEffectTypeRelighting;
    public static final EffectType kEffectTypeSticker;
    public static final EffectType kEffectTypeStickerMain;
    public static final EffectType kEffectTypeWhiteSkin;

    static {
       EffectType uEffectType = new EffectType("kEffectTypeBeauty", 0, 0);
       EffectType.kEffectTypeBeauty = uEffectType;
       EffectType uEffectType1 = new EffectType("kEffectTypeDeform", 1, 1);
       EffectType.kEffectTypeDeform = uEffectType1;
       EffectType uEffectType2 = new EffectType("kEffectTypeLookup", 2, 2);
       EffectType.kEffectTypeLookup = uEffectType2;
       EffectType uEffectType3 = new EffectType("kEffectTypeMakeup", 3, 3);
       EffectType.kEffectTypeMakeup = uEffectType3;
       EffectType uEffectType4 = new EffectType("kEffectTypeBasicAdjust", 4, 4);
       EffectType.kEffectTypeBasicAdjust = uEffectType4;
       EffectType uEffectType5 = new EffectType("kEffectTypeFaceMagic", 5, 5);
       EffectType.kEffectTypeFaceMagic = uEffectType5;
       EffectType uEffectType6 = new EffectType("kEffectTypeBodySlimming", 6, 6);
       EffectType.kEffectTypeBodySlimming = uEffectType6;
       EffectType uEffectType7 = new EffectType("kEffectTypeHairSoftening", 7, 7);
       EffectType.kEffectTypeHairSoftening = uEffectType7;
       EffectType uEffectType8 = new EffectType("kEffectTypeRelighting", 8, 8);
       EffectType.kEffectTypeRelighting = uEffectType8;
       EffectType uEffectType9 = new EffectType("kEffectTypeLiquify", 9, 9);
       EffectType.kEffectTypeLiquify = uEffectType9;
       EffectType uEffectType10 = new EffectType("kEffectTypeHairDyeing", 10, 10);
       EffectType.kEffectTypeHairDyeing = uEffectType10;
       EffectType uEffectType11 = new EffectType("kEffectTypeFlaw", 11, 11);
       EffectType.kEffectTypeFlaw = uEffectType11;
       EffectType uEffectType12 = new EffectType("kEffectTypeClarity", 12, 12);
       EffectType.kEffectTypeClarity = uEffectType12;
       EffectType uEffectType13 = new EffectType("kEffectTypeEvenSkin", 13, 13);
       EffectType.kEffectTypeEvenSkin = uEffectType13;
       EffectType uEffectType14 = uEffectType13;
       EffectType uEffectType15 = new EffectType("kEffectTypeWhiteSkin", 14, 14);
       EffectType.kEffectTypeWhiteSkin = uEffectType15;
       EffectType uEffectType16 = uEffectType15;
       EffectType uEffectType17 = new EffectType("kEffectTypeFastFlaw", 15, 15);
       EffectType.kEffectTypeFastFlaw = uEffectType17;
       EffectType uEffectType18 = uEffectType17;
       uEffectType13 = new EffectType("kEffectTypeMagicRemovel", 16, 16);
       EffectType.kEffectTypeMagicRemovel = uEffectType13;
       EffectType uEffectType19 = uEffectType13;
       uEffectType15 = new EffectType("kEffectTypeOilFree", 17, 17);
       EffectType.kEffectTypeOilFree = uEffectType15;
       EffectType uEffectType20 = uEffectType15;
       uEffectType17 = new EffectType("kEffectTypeFaceTexture", 18, 18);
       EffectType.kEffectTypeFaceTexture = uEffectType17;
       EffectType uEffectType21 = uEffectType17;
       uEffectType13 = new EffectType("kEffectTypeBeautyZeroOpt", 19, 19);
       EffectType.kEffectTypeBeautyZeroOpt = uEffectType13;
       EffectType uEffectType22 = uEffectType13;
       uEffectType15 = new EffectType("kEffectTypeMagnifier", 20, 20);
       EffectType.kEffectTypeMagnifier = uEffectType15;
       EffectType uEffectType23 = uEffectType15;
       uEffectType17 = new EffectType("kEffectTypeFlashLight", 21, 21);
       EffectType.kEffectTypeFlashLight = uEffectType17;
       EffectType uEffectType24 = uEffectType17;
       EffectType uEffectType25 = uEffectType12;
       uEffectType13 = new EffectType("kEffectTypeManualWrinkleCleaner", 22, 22);
       EffectType.kEffectTypeManualWrinkleCleaner = uEffectType13;
       EffectType uEffectType26 = uEffectType13;
       uEffectType17 = new EffectType("kEffectTypeSticker", 23, 23);
       EffectType.kEffectTypeSticker = uEffectType17;
       EffectType uEffectType27 = uEffectType17;
       uEffectType15 = new EffectType("kEffectTypeStickerMain", 24, 24);
       EffectType.kEffectTypeStickerMain = uEffectType15;
       EffectType uEffectType28 = uEffectType15;
       uEffectType17 = new EffectType("kEffectTypeMakeupPen", 25, 25);
       EffectType.kEffectTypeMakeupPen = uEffectType17;
       EffectType uEffectType29 = uEffectType17;
       uEffectType15 = new EffectType("kEffectTypeDefinition", 26, 26);
       EffectType.kEffectTypeDefinition = uEffectType15;
       EffectType uEffectType30 = uEffectType15;
       uEffectType17 = new EffectType("UNRECOGNIZED", 27, -1);
       EffectType.UNRECOGNIZED = uEffectType17;
       EffectType[] uEffectTypeA = new EffectType[28];
       uEffectTypeA[0] = uEffectType;
       uEffectTypeA[1] = uEffectType1;
       uEffectTypeA[2] = uEffectType2;
       uEffectTypeA[3] = uEffectType3;
       uEffectTypeA[4] = uEffectType4;
       uEffectTypeA[5] = uEffectType5;
       uEffectTypeA[6] = uEffectType6;
       uEffectTypeA[7] = uEffectType7;
       uEffectTypeA[8] = uEffectType8;
       uEffectTypeA[9] = uEffectType9;
       uEffectTypeA[10] = uEffectType10;
       uEffectTypeA[11] = uEffectType11;
       uEffectTypeA[12] = uEffectType25;
       uEffectTypeA[13] = uEffectType14;
       uEffectTypeA[14] = uEffectType16;
       uEffectTypeA[15] = uEffectType18;
       uEffectTypeA[16] = uEffectType19;
       uEffectTypeA[17] = uEffectType20;
       uEffectTypeA[18] = uEffectType21;
       uEffectTypeA[19] = uEffectType22;
       uEffectTypeA[20] = uEffectType23;
       uEffectTypeA[21] = uEffectType24;
       uEffectTypeA[22] = uEffectType26;
       uEffectTypeA[23] = uEffectType27;
       uEffectTypeA[24] = uEffectType28;
       uEffectTypeA[25] = uEffectType29;
       uEffectTypeA[26] = uEffectType30;
       uEffectTypeA[27] = uEffectType17;
       EffectType.$VALUES = uEffectTypeA;
       EffectType.internalValueMap = new EffectType$1();
    }
    public void EffectType(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static EffectType forNumber(int p0){
       switch (p0){
           case 0:
             return EffectType.kEffectTypeBeauty;
           case 1:
             return EffectType.kEffectTypeDeform;
           case 2:
             return EffectType.kEffectTypeLookup;
           case 3:
             return EffectType.kEffectTypeMakeup;
           case 4:
             return EffectType.kEffectTypeBasicAdjust;
           case 5:
             return EffectType.kEffectTypeFaceMagic;
           case 6:
             return EffectType.kEffectTypeBodySlimming;
           case 7:
             return EffectType.kEffectTypeHairSoftening;
           case 8:
             return EffectType.kEffectTypeRelighting;
           case 9:
             return EffectType.kEffectTypeLiquify;
           case 10:
             return EffectType.kEffectTypeHairDyeing;
           case 11:
             return EffectType.kEffectTypeFlaw;
           case 12:
             return EffectType.kEffectTypeClarity;
           case 13:
             return EffectType.kEffectTypeEvenSkin;
           case 14:
             return EffectType.kEffectTypeWhiteSkin;
           case 15:
             return EffectType.kEffectTypeFastFlaw;
           case 16:
             return EffectType.kEffectTypeMagicRemovel;
           case 17:
             return EffectType.kEffectTypeOilFree;
           case 18:
             return EffectType.kEffectTypeFaceTexture;
           case 19:
             return EffectType.kEffectTypeBeautyZeroOpt;
           case 20:
             return EffectType.kEffectTypeMagnifier;
           case 21:
             return EffectType.kEffectTypeFlashLight;
           case 22:
             return EffectType.kEffectTypeManualWrinkleCleaner;
           case 23:
             return EffectType.kEffectTypeSticker;
           case 24:
             return EffectType.kEffectTypeStickerMain;
           case 25:
             return EffectType.kEffectTypeMakeupPen;
           case 26:
             return EffectType.kEffectTypeDefinition;
           default:
             return null;
       }
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return EffectType.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return EffectType$EffectTypeVerifier.INSTANCE;
    }
    public static EffectType valueOf(int p0){
       return EffectType.forNumber(p0);
    }
    public static EffectType valueOf(String p0){
       return Enum.valueOf(EffectType.class, p0);
    }
    public static EffectType[] values(){
       return EffectType.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != EffectType.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
