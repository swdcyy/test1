package com.kuaishou.edit.draft.Asset$PositionType;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kuaishou.edit.draft.Asset$PositionType$a;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kuaishou.edit.draft.Asset$PositionType$b;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class Asset$PositionType extends Enum implements Internal$EnumLite	// class@0016ff
{
    public final int value;
    public static final Asset$PositionType[] $VALUES;
    public static final Asset$PositionType ENDING;
    public static final Asset$PositionType NORMAL;
    public static final Asset$PositionType OPENING;
    public static final Asset$PositionType SPLIT;
    public static final Asset$PositionType UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;

    static {
       Asset$PositionType positionType = new Asset$PositionType("NORMAL", 0, 0);
       Asset$PositionType.NORMAL = positionType;
       Asset$PositionType positionType1 = new Asset$PositionType("OPENING", 1, 1);
       Asset$PositionType.OPENING = positionType1;
       Asset$PositionType positionType2 = new Asset$PositionType("ENDING", 2, 2);
       Asset$PositionType.ENDING = positionType2;
       Asset$PositionType positionType3 = new Asset$PositionType("SPLIT", 3, 3);
       Asset$PositionType.SPLIT = positionType3;
       Asset$PositionType positionType4 = new Asset$PositionType("UNRECOGNIZED", 4, -1);
       Asset$PositionType.UNRECOGNIZED = positionType4;
       Asset$PositionType[] positionType5 = new Asset$PositionType[]{positionType,positionType1,positionType2,positionType3,positionType4};
       Asset$PositionType.$VALUES = positionType5;
       Asset$PositionType.internalValueMap = new Asset$PositionType$a();
    }
    public void Asset$PositionType(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static Asset$PositionType forNumber(int p0){
       if (!p0) {
          return Asset$PositionType.NORMAL;
       }
       if (p0 == 1) {
          return Asset$PositionType.OPENING;
       }
       if (p0 == 2) {
          return Asset$PositionType.ENDING;
       }
       if (p0 != 3) {
          return null;
       }
       return Asset$PositionType.SPLIT;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return Asset$PositionType.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return Asset$PositionType$b.a;
    }
    public static Asset$PositionType valueOf(int p0){
       return Asset$PositionType.forNumber(p0);
    }
    public static Asset$PositionType valueOf(String p0){
       return Enum.valueOf(Asset$PositionType.class, p0);
    }
    public static Asset$PositionType[] values(){
       return Asset$PositionType.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != Asset$PositionType.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
