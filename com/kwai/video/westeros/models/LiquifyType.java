package com.kwai.video.westeros.models.LiquifyType;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kwai.video.westeros.models.LiquifyType$1;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kwai.video.westeros.models.LiquifyType$LiquifyTypeVerifier;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class LiquifyType extends Enum implements Internal$EnumLite	// class@000f98
{
    public final int value;
    public static final LiquifyType[] $VALUES;
    public static final LiquifyType Bloat;
    public static final LiquifyType Forward;
    public static final LiquifyType Restore;
    public static final LiquifyType UNRECOGNIZED;
    public static final LiquifyType Wrinkle;
    public static final Internal$EnumLiteMap internalValueMap;

    static {
       LiquifyType liquifyType = new LiquifyType("Forward", 0, 0);
       LiquifyType.Forward = liquifyType;
       LiquifyType liquifyType1 = new LiquifyType("Restore", 1, 1);
       LiquifyType.Restore = liquifyType1;
       LiquifyType liquifyType2 = new LiquifyType("Bloat", 2, 2);
       LiquifyType.Bloat = liquifyType2;
       LiquifyType liquifyType3 = new LiquifyType("Wrinkle", 3, 3);
       LiquifyType.Wrinkle = liquifyType3;
       LiquifyType liquifyType4 = new LiquifyType("UNRECOGNIZED", 4, -1);
       LiquifyType.UNRECOGNIZED = liquifyType4;
       LiquifyType[] liquifyTypeA = new LiquifyType[]{liquifyType,liquifyType1,liquifyType2,liquifyType3,liquifyType4};
       LiquifyType.$VALUES = liquifyTypeA;
       LiquifyType.internalValueMap = new LiquifyType$1();
    }
    public void LiquifyType(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static LiquifyType forNumber(int p0){
       if (!p0) {
          return LiquifyType.Forward;
       }
       if (p0 == 1) {
          return LiquifyType.Restore;
       }
       if (p0 == 2) {
          return LiquifyType.Bloat;
       }
       if (p0 != 3) {
          return null;
       }
       return LiquifyType.Wrinkle;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return LiquifyType.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return LiquifyType$LiquifyTypeVerifier.INSTANCE;
    }
    public static LiquifyType valueOf(int p0){
       return LiquifyType.forNumber(p0);
    }
    public static LiquifyType valueOf(String p0){
       return Enum.valueOf(LiquifyType.class, p0);
    }
    public static LiquifyType[] values(){
       return LiquifyType.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != LiquifyType.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
