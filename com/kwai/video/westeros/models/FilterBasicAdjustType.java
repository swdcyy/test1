package com.kwai.video.westeros.models.FilterBasicAdjustType;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kwai.video.westeros.models.FilterBasicAdjustType$1;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kwai.video.westeros.models.FilterBasicAdjustType$FilterBasicAdjustTypeVerifier;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class FilterBasicAdjustType extends Enum implements Internal$EnumLite	// class@000f79
{
    public final int value;
    public static final FilterBasicAdjustType[] $VALUES;
    public static final FilterBasicAdjustType UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;
    public static final FilterBasicAdjustType kBrightness;
    public static final FilterBasicAdjustType kClarity;
    public static final FilterBasicAdjustType kContrast;
    public static final FilterBasicAdjustType kDispersion;
    public static final FilterBasicAdjustType kEnhance;
    public static final FilterBasicAdjustType kFade;
    public static final FilterBasicAdjustType kHighLights;
    public static final FilterBasicAdjustType kInvalid;
    public static final FilterBasicAdjustType kLayerMask;
    public static final FilterBasicAdjustType kLutBrightness;
    public static final FilterBasicAdjustType kNoise;
    public static final FilterBasicAdjustType kParticles;
    public static final FilterBasicAdjustType kSaturation;
    public static final FilterBasicAdjustType kShadows;
    public static final FilterBasicAdjustType kSharpeness;
    public static final FilterBasicAdjustType kTone;
    public static final FilterBasicAdjustType kVignetteLuminance;
    public static final FilterBasicAdjustType kVignetteRange;
    public static final FilterBasicAdjustType kVignetteStart;
    public static final FilterBasicAdjustType kWhiteBalance_Temperature;
    public static final FilterBasicAdjustType kWhiteBalance_Tint;

    static {
       FilterBasicAdjustType uFilterBasic = new FilterBasicAdjustType("kInvalid", 0, 0);
       FilterBasicAdjustType.kInvalid = uFilterBasic;
       FilterBasicAdjustType uFilterBasic1 = new FilterBasicAdjustType("kBrightness", 1, 0x10000);
       FilterBasicAdjustType.kBrightness = uFilterBasic1;
       FilterBasicAdjustType uFilterBasic2 = new FilterBasicAdjustType("kContrast", 2, 0x20001);
       FilterBasicAdjustType.kContrast = uFilterBasic2;
       FilterBasicAdjustType uFilterBasic3 = new FilterBasicAdjustType("kSaturation", 3, 0x30002);
       FilterBasicAdjustType.kSaturation = uFilterBasic3;
       FilterBasicAdjustType uFilterBasic4 = new FilterBasicAdjustType("kWhiteBalance_Temperature", 4, 0x40003);
       FilterBasicAdjustType.kWhiteBalance_Temperature = uFilterBasic4;
       FilterBasicAdjustType uFilterBasic5 = new FilterBasicAdjustType("kWhiteBalance_Tint", 5, 0x50003);
       FilterBasicAdjustType.kWhiteBalance_Tint = uFilterBasic5;
       FilterBasicAdjustType uFilterBasic6 = new FilterBasicAdjustType("kVignetteStart", 6, 0x60004);
       FilterBasicAdjustType.kVignetteStart = uFilterBasic6;
       FilterBasicAdjustType uFilterBasic7 = new FilterBasicAdjustType("kVignetteRange", 7, 0x70004);
       FilterBasicAdjustType.kVignetteRange = uFilterBasic7;
       FilterBasicAdjustType uFilterBasic8 = new FilterBasicAdjustType("kVignetteLuminance", 8, 0x80004);
       FilterBasicAdjustType.kVignetteLuminance = uFilterBasic8;
       FilterBasicAdjustType uFilterBasic9 = new FilterBasicAdjustType("kSharpeness", 9, 0x90005);
       FilterBasicAdjustType.kSharpeness = uFilterBasic9;
       FilterBasicAdjustType uFilterBasic10 = new FilterBasicAdjustType("kNoise", 10, 0xa0006);
       FilterBasicAdjustType.kNoise = uFilterBasic10;
       FilterBasicAdjustType uFilterBasic11 = new FilterBasicAdjustType("kLayerMask", 11, 0xb0007);
       FilterBasicAdjustType.kLayerMask = uFilterBasic11;
       FilterBasicAdjustType uFilterBasic12 = new FilterBasicAdjustType("kFade", 12, 0xc0008);
       FilterBasicAdjustType.kFade = uFilterBasic12;
       FilterBasicAdjustType uFilterBasic13 = uFilterBasic12;
       FilterBasicAdjustType uFilterBasic14 = new FilterBasicAdjustType("kTone", 13, 0xd0009);
       FilterBasicAdjustType.kTone = uFilterBasic14;
       FilterBasicAdjustType uFilterBasic15 = uFilterBasic14;
       uFilterBasic12 = new FilterBasicAdjustType("kHighLights", 14, 0xe000a);
       FilterBasicAdjustType.kHighLights = uFilterBasic12;
       FilterBasicAdjustType uFilterBasic16 = uFilterBasic12;
       uFilterBasic14 = new FilterBasicAdjustType("kShadows", 15, 0xf000b);
       FilterBasicAdjustType.kShadows = uFilterBasic14;
       FilterBasicAdjustType uFilterBasic17 = uFilterBasic14;
       uFilterBasic12 = new FilterBasicAdjustType("kDispersion", 16, 0x1100c);
       FilterBasicAdjustType.kDispersion = uFilterBasic12;
       FilterBasicAdjustType uFilterBasic18 = uFilterBasic12;
       uFilterBasic14 = new FilterBasicAdjustType("kClarity", 17, 0x1200d);
       FilterBasicAdjustType.kClarity = uFilterBasic14;
       FilterBasicAdjustType uFilterBasic19 = uFilterBasic14;
       uFilterBasic12 = new FilterBasicAdjustType("kParticles", 18, 0x1300e);
       FilterBasicAdjustType.kParticles = uFilterBasic12;
       FilterBasicAdjustType uFilterBasic20 = uFilterBasic12;
       uFilterBasic14 = new FilterBasicAdjustType("kEnhance", 19, 0x1400f);
       FilterBasicAdjustType.kEnhance = uFilterBasic14;
       FilterBasicAdjustType uFilterBasic21 = uFilterBasic14;
       uFilterBasic12 = new FilterBasicAdjustType("kLutBrightness", 20, 0x15010);
       FilterBasicAdjustType.kLutBrightness = uFilterBasic12;
       FilterBasicAdjustType uFilterBasic22 = uFilterBasic12;
       uFilterBasic14 = new FilterBasicAdjustType("UNRECOGNIZED", 21, -1);
       FilterBasicAdjustType.UNRECOGNIZED = uFilterBasic14;
       FilterBasicAdjustType[] uFilterBasic23 = new FilterBasicAdjustType[22];
       uFilterBasic23[0] = uFilterBasic;
       uFilterBasic23[1] = uFilterBasic1;
       uFilterBasic23[2] = uFilterBasic2;
       uFilterBasic23[3] = uFilterBasic3;
       uFilterBasic23[4] = uFilterBasic4;
       uFilterBasic23[5] = uFilterBasic5;
       uFilterBasic23[6] = uFilterBasic6;
       uFilterBasic23[7] = uFilterBasic7;
       uFilterBasic23[8] = uFilterBasic8;
       uFilterBasic23[9] = uFilterBasic9;
       uFilterBasic23[10] = uFilterBasic10;
       uFilterBasic23[11] = uFilterBasic11;
       uFilterBasic23[12] = uFilterBasic13;
       uFilterBasic23[13] = uFilterBasic15;
       uFilterBasic23[14] = uFilterBasic16;
       uFilterBasic23[15] = uFilterBasic17;
       uFilterBasic23[16] = uFilterBasic18;
       uFilterBasic23[17] = uFilterBasic19;
       uFilterBasic23[18] = uFilterBasic20;
       uFilterBasic23[19] = uFilterBasic21;
       uFilterBasic23[20] = uFilterBasic22;
       uFilterBasic23[21] = uFilterBasic14;
       FilterBasicAdjustType.$VALUES = uFilterBasic23;
       FilterBasicAdjustType.internalValueMap = new FilterBasicAdjustType$1();
    }
    public void FilterBasicAdjustType(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static FilterBasicAdjustType forNumber(int p0){
       switch (p0){
           case 0:
             return FilterBasicAdjustType.kInvalid;
           case 0x10000:
             return FilterBasicAdjustType.kBrightness;
           case 0x1100c:
             return FilterBasicAdjustType.kDispersion;
           case 0x1200d:
             return FilterBasicAdjustType.kClarity;
           case 0x1300e:
             return FilterBasicAdjustType.kParticles;
           case 0x1400f:
             return FilterBasicAdjustType.kEnhance;
           case 0x15010:
             return FilterBasicAdjustType.kLutBrightness;
           case 0x20001:
             return FilterBasicAdjustType.kContrast;
           case 0x30002:
             return FilterBasicAdjustType.kSaturation;
           case 0x40003:
             return FilterBasicAdjustType.kWhiteBalance_Temperature;
           case 0x50003:
             return FilterBasicAdjustType.kWhiteBalance_Tint;
           case 0x60004:
             return FilterBasicAdjustType.kVignetteStart;
           case 0x70004:
             return FilterBasicAdjustType.kVignetteRange;
           case 0x80004:
             return FilterBasicAdjustType.kVignetteLuminance;
           case 0x90005:
             return FilterBasicAdjustType.kSharpeness;
           case 0xa0006:
             return FilterBasicAdjustType.kNoise;
           case 0xb0007:
             return FilterBasicAdjustType.kLayerMask;
           case 0xc0008:
             return FilterBasicAdjustType.kFade;
           case 0xd0009:
             return FilterBasicAdjustType.kTone;
           case 0xe000a:
             return FilterBasicAdjustType.kHighLights;
           case 0xf000b:
             return FilterBasicAdjustType.kShadows;
           default:
             return null;
       }
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return FilterBasicAdjustType.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return FilterBasicAdjustType$FilterBasicAdjustTypeVerifier.INSTANCE;
    }
    public static FilterBasicAdjustType valueOf(int p0){
       return FilterBasicAdjustType.forNumber(p0);
    }
    public static FilterBasicAdjustType valueOf(String p0){
       return Enum.valueOf(FilterBasicAdjustType.class, p0);
    }
    public static FilterBasicAdjustType[] values(){
       return FilterBasicAdjustType.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != FilterBasicAdjustType.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
