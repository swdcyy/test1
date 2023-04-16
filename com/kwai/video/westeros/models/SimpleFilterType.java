package com.kwai.video.westeros.models.SimpleFilterType;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kwai.video.westeros.models.SimpleFilterType$1;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kwai.video.westeros.models.SimpleFilterType$SimpleFilterTypeVerifier;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class SimpleFilterType extends Enum implements Internal$EnumLite	// class@001043
{
    public final int value;
    public static final SimpleFilterType[] $VALUES;
    public static final SimpleFilterType UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;
    public static final SimpleFilterType kSimpleFilterTypeBlur;
    public static final SimpleFilterType kSimpleFilterTypeBrightness;
    public static final SimpleFilterType kSimpleFilterTypeSaturation;
    public static final SimpleFilterType kSimpleFilterTypeSharpen;

    static {
       SimpleFilterType simpleFilter = new SimpleFilterType("kSimpleFilterTypeBlur", 0, 0);
       SimpleFilterType.kSimpleFilterTypeBlur = simpleFilter;
       SimpleFilterType simpleFilter1 = new SimpleFilterType("kSimpleFilterTypeSharpen", 1, 2);
       SimpleFilterType.kSimpleFilterTypeSharpen = simpleFilter1;
       SimpleFilterType simpleFilter2 = new SimpleFilterType("kSimpleFilterTypeSaturation", 2, 3);
       SimpleFilterType.kSimpleFilterTypeSaturation = simpleFilter2;
       SimpleFilterType simpleFilter3 = new SimpleFilterType("kSimpleFilterTypeBrightness", 3, 4);
       SimpleFilterType.kSimpleFilterTypeBrightness = simpleFilter3;
       SimpleFilterType simpleFilter4 = new SimpleFilterType("UNRECOGNIZED", 4, -1);
       SimpleFilterType.UNRECOGNIZED = simpleFilter4;
       SimpleFilterType[] simpleFilter5 = new SimpleFilterType[]{simpleFilter,simpleFilter1,simpleFilter2,simpleFilter3,simpleFilter4};
       SimpleFilterType.$VALUES = simpleFilter5;
       SimpleFilterType.internalValueMap = new SimpleFilterType$1();
    }
    public void SimpleFilterType(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static SimpleFilterType forNumber(int p0){
       if (!p0) {
          return SimpleFilterType.kSimpleFilterTypeBlur;
       }
       if (p0 == 2) {
          return SimpleFilterType.kSimpleFilterTypeSharpen;
       }
       if (p0 == 3) {
          return SimpleFilterType.kSimpleFilterTypeSaturation;
       }
       if (p0 != 4) {
          return null;
       }
       return SimpleFilterType.kSimpleFilterTypeBrightness;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return SimpleFilterType.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return SimpleFilterType$SimpleFilterTypeVerifier.INSTANCE;
    }
    public static SimpleFilterType valueOf(int p0){
       return SimpleFilterType.forNumber(p0);
    }
    public static SimpleFilterType valueOf(String p0){
       return Enum.valueOf(SimpleFilterType.class, p0);
    }
    public static SimpleFilterType[] values(){
       return SimpleFilterType.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != SimpleFilterType.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
