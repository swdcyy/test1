package com.kuaishou.edit.draft.Asset$ShootInfo$CameraType;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kuaishou.edit.draft.Asset$ShootInfo$CameraType$a;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kuaishou.edit.draft.Asset$ShootInfo$CameraType$b;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class Asset$ShootInfo$CameraType extends Enum implements Internal$EnumLite	// class@001702
{
    public final int value;
    public static final Asset$ShootInfo$CameraType[] $VALUES;
    public static final Asset$ShootInfo$CameraType BACK;
    public static final Asset$ShootInfo$CameraType FRONT;
    public static final Asset$ShootInfo$CameraType UNKNOWN;
    public static final Asset$ShootInfo$CameraType UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;

    static {
       Asset$ShootInfo$CameraType shootInfo$Ca = new Asset$ShootInfo$CameraType("UNKNOWN", 0, 0);
       Asset$ShootInfo$CameraType.UNKNOWN = shootInfo$Ca;
       Asset$ShootInfo$CameraType shootInfo$Ca1 = new Asset$ShootInfo$CameraType("FRONT", 1, 1);
       Asset$ShootInfo$CameraType.FRONT = shootInfo$Ca1;
       Asset$ShootInfo$CameraType shootInfo$Ca2 = new Asset$ShootInfo$CameraType("BACK", 2, 2);
       Asset$ShootInfo$CameraType.BACK = shootInfo$Ca2;
       Asset$ShootInfo$CameraType shootInfo$Ca3 = new Asset$ShootInfo$CameraType("UNRECOGNIZED", 3, -1);
       Asset$ShootInfo$CameraType.UNRECOGNIZED = shootInfo$Ca3;
       Asset$ShootInfo$CameraType[] shootInfo$Ca4 = new Asset$ShootInfo$CameraType[]{shootInfo$Ca,shootInfo$Ca1,shootInfo$Ca2,shootInfo$Ca3};
       Asset$ShootInfo$CameraType.$VALUES = shootInfo$Ca4;
       Asset$ShootInfo$CameraType.internalValueMap = new Asset$ShootInfo$CameraType$a();
    }
    public void Asset$ShootInfo$CameraType(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static Asset$ShootInfo$CameraType forNumber(int p0){
       if (!p0) {
          return Asset$ShootInfo$CameraType.UNKNOWN;
       }
       if (p0 == 1) {
          return Asset$ShootInfo$CameraType.FRONT;
       }
       if (p0 != 2) {
          return null;
       }
       return Asset$ShootInfo$CameraType.BACK;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return Asset$ShootInfo$CameraType.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return Asset$ShootInfo$CameraType$b.a;
    }
    public static Asset$ShootInfo$CameraType valueOf(int p0){
       return Asset$ShootInfo$CameraType.forNumber(p0);
    }
    public static Asset$ShootInfo$CameraType valueOf(String p0){
       return Enum.valueOf(Asset$ShootInfo$CameraType.class, p0);
    }
    public static Asset$ShootInfo$CameraType[] values(){
       return Asset$ShootInfo$CameraType.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != Asset$ShootInfo$CameraType.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
