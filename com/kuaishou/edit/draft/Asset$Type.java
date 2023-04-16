package com.kuaishou.edit.draft.Asset$Type;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kuaishou.edit.draft.Asset$Type$a;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kuaishou.edit.draft.Asset$Type$b;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class Asset$Type extends Enum implements Internal$EnumLite	// class@00170a
{
    public final int value;
    public static final Asset$Type[] $VALUES;
    public static final Asset$Type PICTURE;
    public static final Asset$Type UNKNOWN;
    public static final Asset$Type UNRECOGNIZED;
    public static final Asset$Type VIDEO;
    public static final Internal$EnumLiteMap internalValueMap;

    static {
       Asset$Type type = new Asset$Type("UNKNOWN", 0, 0);
       Asset$Type.UNKNOWN = type;
       Asset$Type type1 = new Asset$Type("VIDEO", 1, 1);
       Asset$Type.VIDEO = type1;
       Asset$Type type2 = new Asset$Type("PICTURE", 2, 2);
       Asset$Type.PICTURE = type2;
       Asset$Type type3 = new Asset$Type("UNRECOGNIZED", 3, -1);
       Asset$Type.UNRECOGNIZED = type3;
       Asset$Type[] typeArray = new Asset$Type[]{type,type1,type2,type3};
       Asset$Type.$VALUES = typeArray;
       Asset$Type.internalValueMap = new Asset$Type$a();
    }
    public void Asset$Type(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static Asset$Type forNumber(int p0){
       if (!p0) {
          return Asset$Type.UNKNOWN;
       }
       if (p0 == 1) {
          return Asset$Type.VIDEO;
       }
       if (p0 != 2) {
          return null;
       }
       return Asset$Type.PICTURE;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return Asset$Type.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return Asset$Type$b.a;
    }
    public static Asset$Type valueOf(int p0){
       return Asset$Type.forNumber(p0);
    }
    public static Asset$Type valueOf(String p0){
       return Enum.valueOf(Asset$Type.class, p0);
    }
    public static Asset$Type[] values(){
       return Asset$Type.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != Asset$Type.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
