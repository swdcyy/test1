package com.kwai.video.westeros.models.VEFeatureType;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kwai.video.westeros.models.VEFeatureType$1;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kwai.video.westeros.models.VEFeatureType$VEFeatureTypeVerifier;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class VEFeatureType extends Enum implements Internal$EnumLite	// class@001086
{
    public final int value;
    public static final VEFeatureType[] $VALUES;
    public static final VEFeatureType UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;
    public static final VEFeatureType kAutoEnhanceDehaze;
    public static final VEFeatureType kColorPick;
    public static final VEFeatureType kDenoisePreview;
    public static final VEFeatureType kDirtylensDetection;

    static {
       VEFeatureType vEFeatureTyp = new VEFeatureType("kDenoisePreview", 0, 0);
       VEFeatureType.kDenoisePreview = vEFeatureTyp;
       VEFeatureType vEFeatureTyp1 = new VEFeatureType("kDirtylensDetection", 1, 1);
       VEFeatureType.kDirtylensDetection = vEFeatureTyp1;
       VEFeatureType vEFeatureTyp2 = new VEFeatureType("kAutoEnhanceDehaze", 2, 2);
       VEFeatureType.kAutoEnhanceDehaze = vEFeatureTyp2;
       VEFeatureType vEFeatureTyp3 = new VEFeatureType("kColorPick", 3, 3);
       VEFeatureType.kColorPick = vEFeatureTyp3;
       VEFeatureType vEFeatureTyp4 = new VEFeatureType("UNRECOGNIZED", 4, -1);
       VEFeatureType.UNRECOGNIZED = vEFeatureTyp4;
       VEFeatureType[] vEFeatureTyp5 = new VEFeatureType[]{vEFeatureTyp,vEFeatureTyp1,vEFeatureTyp2,vEFeatureTyp3,vEFeatureTyp4};
       VEFeatureType.$VALUES = vEFeatureTyp5;
       VEFeatureType.internalValueMap = new VEFeatureType$1();
    }
    public void VEFeatureType(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static VEFeatureType forNumber(int p0){
       if (!p0) {
          return VEFeatureType.kDenoisePreview;
       }
       if (p0 == 1) {
          return VEFeatureType.kDirtylensDetection;
       }
       if (p0 == 2) {
          return VEFeatureType.kAutoEnhanceDehaze;
       }
       if (p0 != 3) {
          return null;
       }
       return VEFeatureType.kColorPick;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return VEFeatureType.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return VEFeatureType$VEFeatureTypeVerifier.INSTANCE;
    }
    public static VEFeatureType valueOf(int p0){
       return VEFeatureType.forNumber(p0);
    }
    public static VEFeatureType valueOf(String p0){
       return Enum.valueOf(VEFeatureType.class, p0);
    }
    public static VEFeatureType[] values(){
       return VEFeatureType.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != VEFeatureType.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
