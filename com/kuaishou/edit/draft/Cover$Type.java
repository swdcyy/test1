package com.kuaishou.edit.draft.Cover$Type;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kuaishou.edit.draft.Cover$Type$a;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kuaishou.edit.draft.Cover$Type$b;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class Cover$Type extends Enum implements Internal$EnumLite	// class@00175a
{
    public final int value;
    public static final Cover$Type[] $VALUES;
    public static final Cover$Type IMPORT;
    public static final Cover$Type PICTURE;
    public static final Cover$Type UNKNOWN;
    public static final Cover$Type UNRECOGNIZED;
    public static final Cover$Type VIDEO;
    public static final Internal$EnumLiteMap internalValueMap;

    static {
       Cover$Type type = new Cover$Type("UNKNOWN", 0, 0);
       Cover$Type.UNKNOWN = type;
       Cover$Type type1 = new Cover$Type("VIDEO", 1, 1);
       Cover$Type.VIDEO = type1;
       Cover$Type type2 = new Cover$Type("PICTURE", 2, 2);
       Cover$Type.PICTURE = type2;
       Cover$Type type3 = new Cover$Type("IMPORT", 3, 3);
       Cover$Type.IMPORT = type3;
       Cover$Type type4 = new Cover$Type("UNRECOGNIZED", 4, -1);
       Cover$Type.UNRECOGNIZED = type4;
       Cover$Type[] typeArray = new Cover$Type[]{type,type1,type2,type3,type4};
       Cover$Type.$VALUES = typeArray;
       Cover$Type.internalValueMap = new Cover$Type$a();
    }
    public void Cover$Type(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static Cover$Type forNumber(int p0){
       if (!p0) {
          return Cover$Type.UNKNOWN;
       }
       if (p0 == 1) {
          return Cover$Type.VIDEO;
       }
       if (p0 == 2) {
          return Cover$Type.PICTURE;
       }
       if (p0 != 3) {
          return null;
       }
       return Cover$Type.IMPORT;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return Cover$Type.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return Cover$Type$b.a;
    }
    public static Cover$Type valueOf(int p0){
       return Cover$Type.forNumber(p0);
    }
    public static Cover$Type valueOf(String p0){
       return Enum.valueOf(Cover$Type.class, p0);
    }
    public static Cover$Type[] values(){
       return Cover$Type.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != Cover$Type.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
