package com.kwai.video.westeros.models.EffectSlot;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kwai.video.westeros.models.EffectSlot$1;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kwai.video.westeros.models.EffectSlot$EffectSlotVerifier;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class EffectSlot extends Enum implements Internal$EnumLite	// class@000f45
{
    public final int value;
    public static final EffectSlot[] $VALUES;
    public static final EffectSlot UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;
    public static final EffectSlot kEffectSlotGift;
    public static final EffectSlot kEffectSlotLocalRender;
    public static final EffectSlot kEffectSlotMain;
    public static final EffectSlot kEffectSlotRecognitionGift;

    static {
       EffectSlot uEffectSlot = new EffectSlot("kEffectSlotMain", 0, 0);
       EffectSlot.kEffectSlotMain = uEffectSlot;
       EffectSlot uEffectSlot1 = new EffectSlot("kEffectSlotGift", 1, 1);
       EffectSlot.kEffectSlotGift = uEffectSlot1;
       EffectSlot uEffectSlot2 = new EffectSlot("kEffectSlotRecognitionGift", 2, 2);
       EffectSlot.kEffectSlotRecognitionGift = uEffectSlot2;
       EffectSlot uEffectSlot3 = new EffectSlot("kEffectSlotLocalRender", 3, 3);
       EffectSlot.kEffectSlotLocalRender = uEffectSlot3;
       EffectSlot uEffectSlot4 = new EffectSlot("UNRECOGNIZED", 4, -1);
       EffectSlot.UNRECOGNIZED = uEffectSlot4;
       EffectSlot[] uEffectSlotA = new EffectSlot[]{uEffectSlot,uEffectSlot1,uEffectSlot2,uEffectSlot3,uEffectSlot4};
       EffectSlot.$VALUES = uEffectSlotA;
       EffectSlot.internalValueMap = new EffectSlot$1();
    }
    public void EffectSlot(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static EffectSlot forNumber(int p0){
       if (!p0) {
          return EffectSlot.kEffectSlotMain;
       }
       if (p0 == 1) {
          return EffectSlot.kEffectSlotGift;
       }
       if (p0 == 2) {
          return EffectSlot.kEffectSlotRecognitionGift;
       }
       if (p0 != 3) {
          return null;
       }
       return EffectSlot.kEffectSlotLocalRender;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return EffectSlot.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return EffectSlot$EffectSlotVerifier.INSTANCE;
    }
    public static EffectSlot valueOf(int p0){
       return EffectSlot.forNumber(p0);
    }
    public static EffectSlot valueOf(String p0){
       return Enum.valueOf(EffectSlot.class, p0);
    }
    public static EffectSlot[] values(){
       return EffectSlot.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != EffectSlot.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
