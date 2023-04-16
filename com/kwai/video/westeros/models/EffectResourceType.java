package com.kwai.video.westeros.models.EffectResourceType;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kwai.video.westeros.models.EffectResourceType$1;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kwai.video.westeros.models.EffectResourceType$EffectResourceTypeVerifier;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class EffectResourceType extends Enum implements Internal$EnumLite	// class@000f42
{
    public final int value;
    public static final EffectResourceType[] $VALUES;
    public static final EffectResourceType UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;
    public static final EffectResourceType kEffectResourceTypeDefault;
    public static final EffectResourceType kEffectResourceTypeMV;

    static {
       EffectResourceType uEffectResou = new EffectResourceType("kEffectResourceTypeDefault", 0, 0);
       EffectResourceType.kEffectResourceTypeDefault = uEffectResou;
       EffectResourceType uEffectResou1 = new EffectResourceType("kEffectResourceTypeMV", 1, 1);
       EffectResourceType.kEffectResourceTypeMV = uEffectResou1;
       EffectResourceType uEffectResou2 = new EffectResourceType("UNRECOGNIZED", 2, -1);
       EffectResourceType.UNRECOGNIZED = uEffectResou2;
       EffectResourceType[] uEffectResou3 = new EffectResourceType[]{uEffectResou,uEffectResou1,uEffectResou2};
       EffectResourceType.$VALUES = uEffectResou3;
       EffectResourceType.internalValueMap = new EffectResourceType$1();
    }
    public void EffectResourceType(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static EffectResourceType forNumber(int p0){
       if (!p0) {
          return EffectResourceType.kEffectResourceTypeDefault;
       }
       if (p0 != 1) {
          return null;
       }
       return EffectResourceType.kEffectResourceTypeMV;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return EffectResourceType.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return EffectResourceType$EffectResourceTypeVerifier.INSTANCE;
    }
    public static EffectResourceType valueOf(int p0){
       return EffectResourceType.forNumber(p0);
    }
    public static EffectResourceType valueOf(String p0){
       return Enum.valueOf(EffectResourceType.class, p0);
    }
    public static EffectResourceType[] values(){
       return EffectResourceType.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != EffectResourceType.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
