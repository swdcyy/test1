package com.kwai.video.westeros.models.FeatureType;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kwai.video.westeros.models.FeatureType$1;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kwai.video.westeros.models.FeatureType$FeatureTypeVerifier;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class FeatureType extends Enum implements Internal$EnumLite	// class@000f72
{
    public final int value;
    public static final FeatureType[] $VALUES;
    public static final FeatureType UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;
    public static final FeatureType kBacklightDetection;
    public static final FeatureType kBilateralSharpGblur;
    public static final FeatureType kGuidedFilter;
    public static final FeatureType kLocalRegionBlur;
    public static final FeatureType kLocalRegionFilter;
    public static final FeatureType kLowLightDetection;
    public static final FeatureType kLowLightEnhance;
    public static final FeatureType kNewDenoiseFilter;
    public static final FeatureType kSaturationAdjust;
    public static final FeatureType kSharpen;

    static {
       FeatureType uFeatureType = new FeatureType("kNewDenoiseFilter", 0, 0);
       FeatureType.kNewDenoiseFilter = uFeatureType;
       FeatureType uFeatureType1 = new FeatureType("kSaturationAdjust", 1, 1);
       FeatureType.kSaturationAdjust = uFeatureType1;
       FeatureType uFeatureType2 = new FeatureType("kLowLightEnhance", 2, 2);
       FeatureType.kLowLightEnhance = uFeatureType2;
       FeatureType uFeatureType3 = new FeatureType("kLowLightDetection", 3, 3);
       FeatureType.kLowLightDetection = uFeatureType3;
       FeatureType uFeatureType4 = new FeatureType("kLocalRegionBlur", 4, 4);
       FeatureType.kLocalRegionBlur = uFeatureType4;
       FeatureType uFeatureType5 = new FeatureType("kGuidedFilter", 5, 5);
       FeatureType.kGuidedFilter = uFeatureType5;
       FeatureType uFeatureType6 = new FeatureType("kSharpen", 6, 6);
       FeatureType.kSharpen = uFeatureType6;
       FeatureType uFeatureType7 = new FeatureType("kBacklightDetection", 7, 7);
       FeatureType.kBacklightDetection = uFeatureType7;
       FeatureType uFeatureType8 = new FeatureType("kLocalRegionFilter", 8, 8);
       FeatureType.kLocalRegionFilter = uFeatureType8;
       FeatureType uFeatureType9 = new FeatureType("kBilateralSharpGblur", 9, 9);
       FeatureType.kBilateralSharpGblur = uFeatureType9;
       FeatureType uFeatureType10 = new FeatureType("UNRECOGNIZED", 10, -1);
       FeatureType.UNRECOGNIZED = uFeatureType10;
       FeatureType[] uFeatureType11 = new FeatureType[11];
       uFeatureType11[0] = uFeatureType;
       uFeatureType11[1] = uFeatureType1;
       uFeatureType11[2] = uFeatureType2;
       uFeatureType11[3] = uFeatureType3;
       uFeatureType11[4] = uFeatureType4;
       uFeatureType11[5] = uFeatureType5;
       uFeatureType11[6] = uFeatureType6;
       uFeatureType11[7] = uFeatureType7;
       uFeatureType11[8] = uFeatureType8;
       uFeatureType11[9] = uFeatureType9;
       uFeatureType11[10] = uFeatureType10;
       FeatureType.$VALUES = uFeatureType11;
       FeatureType.internalValueMap = new FeatureType$1();
    }
    public void FeatureType(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static FeatureType forNumber(int p0){
       switch (p0){
           case 0:
             return FeatureType.kNewDenoiseFilter;
           case 1:
             return FeatureType.kSaturationAdjust;
           case 2:
             return FeatureType.kLowLightEnhance;
           case 3:
             return FeatureType.kLowLightDetection;
           case 4:
             return FeatureType.kLocalRegionBlur;
           case 5:
             return FeatureType.kGuidedFilter;
           case 6:
             return FeatureType.kSharpen;
           case 7:
             return FeatureType.kBacklightDetection;
           case 8:
             return FeatureType.kLocalRegionFilter;
           case 9:
             return FeatureType.kBilateralSharpGblur;
           default:
             return null;
       }
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return FeatureType.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return FeatureType$FeatureTypeVerifier.INSTANCE;
    }
    public static FeatureType valueOf(int p0){
       return FeatureType.forNumber(p0);
    }
    public static FeatureType valueOf(String p0){
       return Enum.valueOf(FeatureType.class, p0);
    }
    public static FeatureType[] values(){
       return FeatureType.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != FeatureType.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
