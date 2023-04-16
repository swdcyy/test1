package com.kuaishou.edit.draft.Asset$ShootInfo$Resolution;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kuaishou.edit.draft.Asset$ShootInfo$Resolution$a;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kuaishou.edit.draft.Asset$ShootInfo$Resolution$b;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class Asset$ShootInfo$Resolution extends Enum implements Internal$EnumLite	// class@001705
{
    public final int value;
    public static final Asset$ShootInfo$Resolution[] $VALUES;
    public static final Asset$ShootInfo$Resolution CIRCLE;
    public static final Asset$ShootInfo$Resolution FULL;
    public static final Asset$ShootInfo$Resolution NONE;
    public static final Asset$ShootInfo$Resolution ORIGINAL;
    public static final Asset$ShootInfo$Resolution R_3TO4;
    public static final Asset$ShootInfo$Resolution R_9TO16;
    public static final Asset$ShootInfo$Resolution SQUARE;
    public static final Asset$ShootInfo$Resolution UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;

    static {
       Asset$ShootInfo$Resolution shootInfo$Re = new Asset$ShootInfo$Resolution("NONE", 0, 0);
       Asset$ShootInfo$Resolution.NONE = shootInfo$Re;
       Asset$ShootInfo$Resolution shootInfo$Re1 = new Asset$ShootInfo$Resolution("R_9TO16", 1, 1);
       Asset$ShootInfo$Resolution.R_9TO16 = shootInfo$Re1;
       Asset$ShootInfo$Resolution shootInfo$Re2 = new Asset$ShootInfo$Resolution("R_3TO4", 2, 2);
       Asset$ShootInfo$Resolution.R_3TO4 = shootInfo$Re2;
       Asset$ShootInfo$Resolution shootInfo$Re3 = new Asset$ShootInfo$Resolution("SQUARE", 3, 3);
       Asset$ShootInfo$Resolution.SQUARE = shootInfo$Re3;
       Asset$ShootInfo$Resolution shootInfo$Re4 = new Asset$ShootInfo$Resolution("FULL", 4, 4);
       Asset$ShootInfo$Resolution.FULL = shootInfo$Re4;
       Asset$ShootInfo$Resolution shootInfo$Re5 = new Asset$ShootInfo$Resolution("CIRCLE", 5, 5);
       Asset$ShootInfo$Resolution.CIRCLE = shootInfo$Re5;
       Asset$ShootInfo$Resolution shootInfo$Re6 = new Asset$ShootInfo$Resolution("ORIGINAL", 6, 6);
       Asset$ShootInfo$Resolution.ORIGINAL = shootInfo$Re6;
       Asset$ShootInfo$Resolution shootInfo$Re7 = new Asset$ShootInfo$Resolution("UNRECOGNIZED", 7, -1);
       Asset$ShootInfo$Resolution.UNRECOGNIZED = shootInfo$Re7;
       Asset$ShootInfo$Resolution[] shootInfo$Re8 = new Asset$ShootInfo$Resolution[]{shootInfo$Re,shootInfo$Re1,shootInfo$Re2,shootInfo$Re3,shootInfo$Re4,shootInfo$Re5,shootInfo$Re6,shootInfo$Re7};
       Asset$ShootInfo$Resolution.$VALUES = shootInfo$Re8;
       Asset$ShootInfo$Resolution.internalValueMap = new Asset$ShootInfo$Resolution$a();
    }
    public void Asset$ShootInfo$Resolution(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static Asset$ShootInfo$Resolution forNumber(int p0){
       switch (p0){
           case 0:
             return Asset$ShootInfo$Resolution.NONE;
           case 1:
             return Asset$ShootInfo$Resolution.R_9TO16;
           case 2:
             return Asset$ShootInfo$Resolution.R_3TO4;
           case 3:
             return Asset$ShootInfo$Resolution.SQUARE;
           case 4:
             return Asset$ShootInfo$Resolution.FULL;
           case 5:
             return Asset$ShootInfo$Resolution.CIRCLE;
           case 6:
             return Asset$ShootInfo$Resolution.ORIGINAL;
           default:
             return null;
       }
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return Asset$ShootInfo$Resolution.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return Asset$ShootInfo$Resolution$b.a;
    }
    public static Asset$ShootInfo$Resolution valueOf(int p0){
       return Asset$ShootInfo$Resolution.forNumber(p0);
    }
    public static Asset$ShootInfo$Resolution valueOf(String p0){
       return Enum.valueOf(Asset$ShootInfo$Resolution.class, p0);
    }
    public static Asset$ShootInfo$Resolution[] values(){
       return Asset$ShootInfo$Resolution.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != Asset$ShootInfo$Resolution.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
