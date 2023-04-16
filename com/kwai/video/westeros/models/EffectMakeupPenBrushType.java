package com.kwai.video.westeros.models.EffectMakeupPenBrushType;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kwai.video.westeros.models.EffectMakeupPenBrushType$1;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kwai.video.westeros.models.EffectMakeupPenBrushType$EffectMakeupPenBrushTypeVerifier;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class EffectMakeupPenBrushType extends Enum implements Internal$EnumLite	// class@000f33
{
    public final int value;
    public static final EffectMakeupPenBrushType[] $VALUES;
    public static final EffectMakeupPenBrushType UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;
    public static final EffectMakeupPenBrushType k_color;
    public static final EffectMakeupPenBrushType k_high_light;
    public static final EffectMakeupPenBrushType k_skin;
    public static final EffectMakeupPenBrushType k_xiu_rong;

    static {
       EffectMakeupPenBrushType uEffectMakeu = new EffectMakeupPenBrushType("k_skin", 0, 0);
       EffectMakeupPenBrushType.k_skin = uEffectMakeu;
       EffectMakeupPenBrushType uEffectMakeu1 = new EffectMakeupPenBrushType("k_xiu_rong", 1, 1);
       EffectMakeupPenBrushType.k_xiu_rong = uEffectMakeu1;
       EffectMakeupPenBrushType uEffectMakeu2 = new EffectMakeupPenBrushType("k_color", 2, 2);
       EffectMakeupPenBrushType.k_color = uEffectMakeu2;
       EffectMakeupPenBrushType uEffectMakeu3 = new EffectMakeupPenBrushType("k_high_light", 3, 3);
       EffectMakeupPenBrushType.k_high_light = uEffectMakeu3;
       EffectMakeupPenBrushType uEffectMakeu4 = new EffectMakeupPenBrushType("UNRECOGNIZED", 4, -1);
       EffectMakeupPenBrushType.UNRECOGNIZED = uEffectMakeu4;
       EffectMakeupPenBrushType[] uEffectMakeu5 = new EffectMakeupPenBrushType[]{uEffectMakeu,uEffectMakeu1,uEffectMakeu2,uEffectMakeu3,uEffectMakeu4};
       EffectMakeupPenBrushType.$VALUES = uEffectMakeu5;
       EffectMakeupPenBrushType.internalValueMap = new EffectMakeupPenBrushType$1();
    }
    public void EffectMakeupPenBrushType(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static EffectMakeupPenBrushType forNumber(int p0){
       if (!p0) {
          return EffectMakeupPenBrushType.k_skin;
       }
       if (p0 == 1) {
          return EffectMakeupPenBrushType.k_xiu_rong;
       }
       if (p0 == 2) {
          return EffectMakeupPenBrushType.k_color;
       }
       if (p0 != 3) {
          return null;
       }
       return EffectMakeupPenBrushType.k_high_light;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return EffectMakeupPenBrushType.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return EffectMakeupPenBrushType$EffectMakeupPenBrushTypeVerifier.INSTANCE;
    }
    public static EffectMakeupPenBrushType valueOf(int p0){
       return EffectMakeupPenBrushType.forNumber(p0);
    }
    public static EffectMakeupPenBrushType valueOf(String p0){
       return Enum.valueOf(EffectMakeupPenBrushType.class, p0);
    }
    public static EffectMakeupPenBrushType[] values(){
       return EffectMakeupPenBrushType.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != EffectMakeupPenBrushType.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
