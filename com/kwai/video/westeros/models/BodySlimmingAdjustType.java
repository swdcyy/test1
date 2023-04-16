package com.kwai.video.westeros.models.BodySlimmingAdjustType;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kwai.video.westeros.models.BodySlimmingAdjustType$1;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kwai.video.westeros.models.BodySlimmingAdjustType$BodySlimmingAdjustTypeVerifier;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class BodySlimmingAdjustType extends Enum implements Internal$EnumLite	// class@000ec0
{
    public final int value;
    public static final BodySlimmingAdjustType[] $VALUES;
    public static final BodySlimmingAdjustType UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;
    public static final BodySlimmingAdjustType kAll;
    public static final BodySlimmingAdjustType kBodySlimmingInvalid;
    public static final BodySlimmingAdjustType kBreast;
    public static final BodySlimmingAdjustType kHead;
    public static final BodySlimmingAdjustType kHip;
    public static final BodySlimmingAdjustType kLeg;
    public static final BodySlimmingAdjustType kNeck;
    public static final BodySlimmingAdjustType kShoulder;
    public static final BodySlimmingAdjustType kWaist;

    static {
       BodySlimmingAdjustType uBodySlimmin = new BodySlimmingAdjustType("kBodySlimmingInvalid", 0, 0);
       BodySlimmingAdjustType.kBodySlimmingInvalid = uBodySlimmin;
       BodySlimmingAdjustType uBodySlimmin1 = new BodySlimmingAdjustType("kAll", 1, 0x10000);
       BodySlimmingAdjustType.kAll = uBodySlimmin1;
       BodySlimmingAdjustType uBodySlimmin2 = new BodySlimmingAdjustType("kHead", 2, 0x20001);
       BodySlimmingAdjustType.kHead = uBodySlimmin2;
       BodySlimmingAdjustType uBodySlimmin3 = new BodySlimmingAdjustType("kNeck", 3, 0x30002);
       BodySlimmingAdjustType.kNeck = uBodySlimmin3;
       BodySlimmingAdjustType uBodySlimmin4 = new BodySlimmingAdjustType("kWaist", 4, 0x40003);
       BodySlimmingAdjustType.kWaist = uBodySlimmin4;
       BodySlimmingAdjustType uBodySlimmin5 = new BodySlimmingAdjustType("kHip", 5, 0x50004);
       BodySlimmingAdjustType.kHip = uBodySlimmin5;
       BodySlimmingAdjustType uBodySlimmin6 = new BodySlimmingAdjustType("kLeg", 6, 0x60005);
       BodySlimmingAdjustType.kLeg = uBodySlimmin6;
       BodySlimmingAdjustType uBodySlimmin7 = new BodySlimmingAdjustType("kShoulder", 7, 0x70006);
       BodySlimmingAdjustType.kShoulder = uBodySlimmin7;
       BodySlimmingAdjustType uBodySlimmin8 = new BodySlimmingAdjustType("kBreast", 8, 0x80007);
       BodySlimmingAdjustType.kBreast = uBodySlimmin8;
       BodySlimmingAdjustType uBodySlimmin9 = new BodySlimmingAdjustType("UNRECOGNIZED", 9, -1);
       BodySlimmingAdjustType.UNRECOGNIZED = uBodySlimmin9;
       BodySlimmingAdjustType[] uBodySlimmin10 = new BodySlimmingAdjustType[10];
       uBodySlimmin10[0] = uBodySlimmin;
       uBodySlimmin10[1] = uBodySlimmin1;
       uBodySlimmin10[2] = uBodySlimmin2;
       uBodySlimmin10[3] = uBodySlimmin3;
       uBodySlimmin10[4] = uBodySlimmin4;
       uBodySlimmin10[5] = uBodySlimmin5;
       uBodySlimmin10[6] = uBodySlimmin6;
       uBodySlimmin10[7] = uBodySlimmin7;
       uBodySlimmin10[8] = uBodySlimmin8;
       uBodySlimmin10[9] = uBodySlimmin9;
       BodySlimmingAdjustType.$VALUES = uBodySlimmin10;
       BodySlimmingAdjustType.internalValueMap = new BodySlimmingAdjustType$1();
    }
    public void BodySlimmingAdjustType(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static BodySlimmingAdjustType forNumber(int p0){
       switch (p0){
           case 0:
             return BodySlimmingAdjustType.kBodySlimmingInvalid;
           case 0x10000:
             return BodySlimmingAdjustType.kAll;
           case 0x20001:
             return BodySlimmingAdjustType.kHead;
           case 0x30002:
             return BodySlimmingAdjustType.kNeck;
           case 0x40003:
             return BodySlimmingAdjustType.kWaist;
           case 0x50004:
             return BodySlimmingAdjustType.kHip;
           case 0x60005:
             return BodySlimmingAdjustType.kLeg;
           case 0x70006:
             return BodySlimmingAdjustType.kShoulder;
           case 0x80007:
             return BodySlimmingAdjustType.kBreast;
           default:
             return null;
       }
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return BodySlimmingAdjustType.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return BodySlimmingAdjustType$BodySlimmingAdjustTypeVerifier.INSTANCE;
    }
    public static BodySlimmingAdjustType valueOf(int p0){
       return BodySlimmingAdjustType.forNumber(p0);
    }
    public static BodySlimmingAdjustType valueOf(String p0){
       return Enum.valueOf(BodySlimmingAdjustType.class, p0);
    }
    public static BodySlimmingAdjustType[] values(){
       return BodySlimmingAdjustType.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != BodySlimmingAdjustType.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
