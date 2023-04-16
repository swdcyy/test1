package com.kwai.video.westeros.models.EffectMakeupPenTouchType;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kwai.video.westeros.models.EffectMakeupPenTouchType$1;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kwai.video.westeros.models.EffectMakeupPenTouchType$EffectMakeupPenTouchTypeVerifier;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class EffectMakeupPenTouchType extends Enum implements Internal$EnumLite	// class@000f36
{
    public final int value;
    public static final EffectMakeupPenTouchType[] $VALUES;
    public static final EffectMakeupPenTouchType UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;
    public static final EffectMakeupPenTouchType k_began;
    public static final EffectMakeupPenTouchType k_end;
    public static final EffectMakeupPenTouchType k_move;
    public static final EffectMakeupPenTouchType k_tap;

    static {
       EffectMakeupPenTouchType uEffectMakeu = new EffectMakeupPenTouchType("k_tap", 0, 0);
       EffectMakeupPenTouchType.k_tap = uEffectMakeu;
       EffectMakeupPenTouchType uEffectMakeu1 = new EffectMakeupPenTouchType("k_began", 1, 1);
       EffectMakeupPenTouchType.k_began = uEffectMakeu1;
       EffectMakeupPenTouchType uEffectMakeu2 = new EffectMakeupPenTouchType("k_move", 2, 2);
       EffectMakeupPenTouchType.k_move = uEffectMakeu2;
       EffectMakeupPenTouchType uEffectMakeu3 = new EffectMakeupPenTouchType("k_end", 3, 3);
       EffectMakeupPenTouchType.k_end = uEffectMakeu3;
       EffectMakeupPenTouchType uEffectMakeu4 = new EffectMakeupPenTouchType("UNRECOGNIZED", 4, -1);
       EffectMakeupPenTouchType.UNRECOGNIZED = uEffectMakeu4;
       EffectMakeupPenTouchType[] uEffectMakeu5 = new EffectMakeupPenTouchType[]{uEffectMakeu,uEffectMakeu1,uEffectMakeu2,uEffectMakeu3,uEffectMakeu4};
       EffectMakeupPenTouchType.$VALUES = uEffectMakeu5;
       EffectMakeupPenTouchType.internalValueMap = new EffectMakeupPenTouchType$1();
    }
    public void EffectMakeupPenTouchType(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static EffectMakeupPenTouchType forNumber(int p0){
       if (!p0) {
          return EffectMakeupPenTouchType.k_tap;
       }
       if (p0 == 1) {
          return EffectMakeupPenTouchType.k_began;
       }
       if (p0 == 2) {
          return EffectMakeupPenTouchType.k_move;
       }
       if (p0 != 3) {
          return null;
       }
       return EffectMakeupPenTouchType.k_end;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return EffectMakeupPenTouchType.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return EffectMakeupPenTouchType$EffectMakeupPenTouchTypeVerifier.INSTANCE;
    }
    public static EffectMakeupPenTouchType valueOf(int p0){
       return EffectMakeupPenTouchType.forNumber(p0);
    }
    public static EffectMakeupPenTouchType valueOf(String p0){
       return Enum.valueOf(EffectMakeupPenTouchType.class, p0);
    }
    public static EffectMakeupPenTouchType[] values(){
       return EffectMakeupPenTouchType.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != EffectMakeupPenTouchType.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
