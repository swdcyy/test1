package com.kwai.video.westeros.models.AdjustEffectType;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kwai.video.westeros.models.AdjustEffectType$1;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kwai.video.westeros.models.AdjustEffectType$AdjustEffectTypeVerifier;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class AdjustEffectType extends Enum implements Internal$EnumLite	// class@000e96
{
    public final int value;
    public static final AdjustEffectType[] $VALUES;
    public static final AdjustEffectType UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;
    public static final AdjustEffectType kAdjustEffectTypeDefault;
    public static final AdjustEffectType kAdjustEffectTypeLookup;
    public static final AdjustEffectType kAdjustEffectTypeMakeup;
    public static final AdjustEffectType kAdjustEffectTypeSlimming;

    static {
       AdjustEffectType uAdjustEffec = new AdjustEffectType("kAdjustEffectTypeDefault", 0, 0);
       AdjustEffectType.kAdjustEffectTypeDefault = uAdjustEffec;
       AdjustEffectType uAdjustEffec1 = new AdjustEffectType("kAdjustEffectTypeSlimming", 1, 1);
       AdjustEffectType.kAdjustEffectTypeSlimming = uAdjustEffec1;
       AdjustEffectType uAdjustEffec2 = new AdjustEffectType("kAdjustEffectTypeMakeup", 2, 2);
       AdjustEffectType.kAdjustEffectTypeMakeup = uAdjustEffec2;
       AdjustEffectType uAdjustEffec3 = new AdjustEffectType("kAdjustEffectTypeLookup", 3, 3);
       AdjustEffectType.kAdjustEffectTypeLookup = uAdjustEffec3;
       AdjustEffectType uAdjustEffec4 = new AdjustEffectType("UNRECOGNIZED", 4, -1);
       AdjustEffectType.UNRECOGNIZED = uAdjustEffec4;
       AdjustEffectType[] uAdjustEffec5 = new AdjustEffectType[]{uAdjustEffec,uAdjustEffec1,uAdjustEffec2,uAdjustEffec3,uAdjustEffec4};
       AdjustEffectType.$VALUES = uAdjustEffec5;
       AdjustEffectType.internalValueMap = new AdjustEffectType$1();
    }
    public void AdjustEffectType(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static AdjustEffectType forNumber(int p0){
       if (!p0) {
          return AdjustEffectType.kAdjustEffectTypeDefault;
       }
       if (p0 == 1) {
          return AdjustEffectType.kAdjustEffectTypeSlimming;
       }
       if (p0 == 2) {
          return AdjustEffectType.kAdjustEffectTypeMakeup;
       }
       if (p0 != 3) {
          return null;
       }
       return AdjustEffectType.kAdjustEffectTypeLookup;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return AdjustEffectType.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return AdjustEffectType$AdjustEffectTypeVerifier.INSTANCE;
    }
    public static AdjustEffectType valueOf(int p0){
       return AdjustEffectType.forNumber(p0);
    }
    public static AdjustEffectType valueOf(String p0){
       return Enum.valueOf(AdjustEffectType.class, p0);
    }
    public static AdjustEffectType[] values(){
       return AdjustEffectType.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != AdjustEffectType.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
