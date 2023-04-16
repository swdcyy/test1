package com.kwai.video.westeros.models.EffectLookupResType;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kwai.video.westeros.models.EffectLookupResType$1;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kwai.video.westeros.models.EffectLookupResType$EffectLookupResTypeVerifier;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class EffectLookupResType extends Enum implements Internal$EnumLite	// class@000f2c
{
    public final int value;
    public static final EffectLookupResType[] $VALUES;
    public static final EffectLookupResType UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;
    public static final EffectLookupResType kEffect;
    public static final EffectLookupResType kImage;

    static {
       EffectLookupResType uEffectLooku = new EffectLookupResType("kImage", 0, 0);
       EffectLookupResType.kImage = uEffectLooku;
       EffectLookupResType uEffectLooku1 = new EffectLookupResType("kEffect", 1, 1);
       EffectLookupResType.kEffect = uEffectLooku1;
       EffectLookupResType uEffectLooku2 = new EffectLookupResType("UNRECOGNIZED", 2, -1);
       EffectLookupResType.UNRECOGNIZED = uEffectLooku2;
       EffectLookupResType[] uEffectLooku3 = new EffectLookupResType[]{uEffectLooku,uEffectLooku1,uEffectLooku2};
       EffectLookupResType.$VALUES = uEffectLooku3;
       EffectLookupResType.internalValueMap = new EffectLookupResType$1();
    }
    public void EffectLookupResType(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static EffectLookupResType forNumber(int p0){
       if (!p0) {
          return EffectLookupResType.kImage;
       }
       if (p0 != 1) {
          return null;
       }
       return EffectLookupResType.kEffect;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return EffectLookupResType.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return EffectLookupResType$EffectLookupResTypeVerifier.INSTANCE;
    }
    public static EffectLookupResType valueOf(int p0){
       return EffectLookupResType.forNumber(p0);
    }
    public static EffectLookupResType valueOf(String p0){
       return Enum.valueOf(EffectLookupResType.class, p0);
    }
    public static EffectLookupResType[] values(){
       return EffectLookupResType.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != EffectLookupResType.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
