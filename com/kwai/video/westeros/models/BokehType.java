package com.kwai.video.westeros.models.BokehType;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kwai.video.westeros.models.BokehType$1;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kwai.video.westeros.models.BokehType$BokehTypeVerifier;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class BokehType extends Enum implements Internal$EnumLite	// class@000ece
{
    public final int value;
    public static final BokehType[] $VALUES;
    public static final BokehType General;
    public static final BokehType Motion;
    public static final BokehType Radial;
    public static final BokehType Rotate;
    public static final BokehType UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;

    static {
       BokehType uBokehType = new BokehType("General", 0, 0);
       BokehType.General = uBokehType;
       BokehType uBokehType1 = new BokehType("Motion", 1, 1);
       BokehType.Motion = uBokehType1;
       BokehType uBokehType2 = new BokehType("Rotate", 2, 2);
       BokehType.Rotate = uBokehType2;
       BokehType uBokehType3 = new BokehType("Radial", 3, 3);
       BokehType.Radial = uBokehType3;
       BokehType uBokehType4 = new BokehType("UNRECOGNIZED", 4, -1);
       BokehType.UNRECOGNIZED = uBokehType4;
       BokehType[] uBokehTypeAr = new BokehType[]{uBokehType,uBokehType1,uBokehType2,uBokehType3,uBokehType4};
       BokehType.$VALUES = uBokehTypeAr;
       BokehType.internalValueMap = new BokehType$1();
    }
    public void BokehType(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static BokehType forNumber(int p0){
       if (!p0) {
          return BokehType.General;
       }
       if (p0 == 1) {
          return BokehType.Motion;
       }
       if (p0 == 2) {
          return BokehType.Rotate;
       }
       if (p0 != 3) {
          return null;
       }
       return BokehType.Radial;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return BokehType.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return BokehType$BokehTypeVerifier.INSTANCE;
    }
    public static BokehType valueOf(int p0){
       return BokehType.forNumber(p0);
    }
    public static BokehType valueOf(String p0){
       return Enum.valueOf(BokehType.class, p0);
    }
    public static BokehType[] values(){
       return BokehType.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != BokehType.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
