package com.kwai.video.westeros.models.EffectHintType;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kwai.video.westeros.models.EffectHintType$1;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kwai.video.westeros.models.EffectHintType$EffectHintTypeVerifier;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class EffectHintType extends Enum implements Internal$EnumLite	// class@000f25
{
    public final int value;
    public static final EffectHintType[] $VALUES;
    public static final EffectHintType UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;
    public static final EffectHintType kPickFaceImageResult;
    public static final EffectHintType kPickMediaResourceResult;
    public static final EffectHintType kShowEffectCover;
    public static final EffectHintType kShowFaceNotDetected;
    public static final EffectHintType kStopShowEffectCover;
    public static final EffectHintType kStopShowFaceNotDetected;
    public static final EffectHintType kSwapFaceImageResult;

    static {
       EffectHintType uEffectHintT = new EffectHintType("kShowFaceNotDetected", 0, 0);
       EffectHintType.kShowFaceNotDetected = uEffectHintT;
       EffectHintType uEffectHintT1 = new EffectHintType("kStopShowFaceNotDetected", 1, 1);
       EffectHintType.kStopShowFaceNotDetected = uEffectHintT1;
       EffectHintType uEffectHintT2 = new EffectHintType("kShowEffectCover", 2, 2);
       EffectHintType.kShowEffectCover = uEffectHintT2;
       EffectHintType uEffectHintT3 = new EffectHintType("kStopShowEffectCover", 3, 3);
       EffectHintType.kStopShowEffectCover = uEffectHintT3;
       EffectHintType uEffectHintT4 = new EffectHintType("kSwapFaceImageResult", 4, 4);
       EffectHintType.kSwapFaceImageResult = uEffectHintT4;
       EffectHintType uEffectHintT5 = new EffectHintType("kPickFaceImageResult", 5, 5);
       EffectHintType.kPickFaceImageResult = uEffectHintT5;
       EffectHintType uEffectHintT6 = new EffectHintType("kPickMediaResourceResult", 6, 6);
       EffectHintType.kPickMediaResourceResult = uEffectHintT6;
       EffectHintType uEffectHintT7 = new EffectHintType("UNRECOGNIZED", 7, -1);
       EffectHintType.UNRECOGNIZED = uEffectHintT7;
       EffectHintType[] uEffectHintT8 = new EffectHintType[]{uEffectHintT,uEffectHintT1,uEffectHintT2,uEffectHintT3,uEffectHintT4,uEffectHintT5,uEffectHintT6,uEffectHintT7};
       EffectHintType.$VALUES = uEffectHintT8;
       EffectHintType.internalValueMap = new EffectHintType$1();
    }
    public void EffectHintType(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static EffectHintType forNumber(int p0){
       switch (p0){
           case 0:
             return EffectHintType.kShowFaceNotDetected;
           case 1:
             return EffectHintType.kStopShowFaceNotDetected;
           case 2:
             return EffectHintType.kShowEffectCover;
           case 3:
             return EffectHintType.kStopShowEffectCover;
           case 4:
             return EffectHintType.kSwapFaceImageResult;
           case 5:
             return EffectHintType.kPickFaceImageResult;
           case 6:
             return EffectHintType.kPickMediaResourceResult;
           default:
             return null;
       }
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return EffectHintType.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return EffectHintType$EffectHintTypeVerifier.INSTANCE;
    }
    public static EffectHintType valueOf(int p0){
       return EffectHintType.forNumber(p0);
    }
    public static EffectHintType valueOf(String p0){
       return Enum.valueOf(EffectHintType.class, p0);
    }
    public static EffectHintType[] values(){
       return EffectHintType.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != EffectHintType.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
