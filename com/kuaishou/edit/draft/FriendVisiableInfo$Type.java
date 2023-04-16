package com.kuaishou.edit.draft.FriendVisiableInfo$Type;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kuaishou.edit.draft.FriendVisiableInfo$Type$a;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kuaishou.edit.draft.FriendVisiableInfo$Type$b;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class FriendVisiableInfo$Type extends Enum implements Internal$EnumLite	// class@0017ae
{
    public final int value;
    public static final FriendVisiableInfo$Type[] $VALUES;
    public static final FriendVisiableInfo$Type BLACK_LIST;
    public static final FriendVisiableInfo$Type DEFAULT;
    public static final FriendVisiableInfo$Type INTIMATE;
    public static final FriendVisiableInfo$Type UNRECOGNIZED;
    public static final FriendVisiableInfo$Type WHITE_LIST;
    public static final Internal$EnumLiteMap internalValueMap;

    static {
       FriendVisiableInfo$Type type = new FriendVisiableInfo$Type("DEFAULT", 0, 0);
       FriendVisiableInfo$Type.DEFAULT = type;
       FriendVisiableInfo$Type type1 = new FriendVisiableInfo$Type("WHITE_LIST", 1, 1);
       FriendVisiableInfo$Type.WHITE_LIST = type1;
       FriendVisiableInfo$Type type2 = new FriendVisiableInfo$Type("BLACK_LIST", 2, 2);
       FriendVisiableInfo$Type.BLACK_LIST = type2;
       FriendVisiableInfo$Type type3 = new FriendVisiableInfo$Type("INTIMATE", 3, 3);
       FriendVisiableInfo$Type.INTIMATE = type3;
       FriendVisiableInfo$Type type4 = new FriendVisiableInfo$Type("UNRECOGNIZED", 4, -1);
       FriendVisiableInfo$Type.UNRECOGNIZED = type4;
       FriendVisiableInfo$Type[] typeArray = new FriendVisiableInfo$Type[]{type,type1,type2,type3,type4};
       FriendVisiableInfo$Type.$VALUES = typeArray;
       FriendVisiableInfo$Type.internalValueMap = new FriendVisiableInfo$Type$a();
    }
    public void FriendVisiableInfo$Type(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static FriendVisiableInfo$Type forNumber(int p0){
       if (!p0) {
          return FriendVisiableInfo$Type.DEFAULT;
       }
       if (p0 == 1) {
          return FriendVisiableInfo$Type.WHITE_LIST;
       }
       if (p0 == 2) {
          return FriendVisiableInfo$Type.BLACK_LIST;
       }
       if (p0 != 3) {
          return null;
       }
       return FriendVisiableInfo$Type.INTIMATE;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return FriendVisiableInfo$Type.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return FriendVisiableInfo$Type$b.a;
    }
    public static FriendVisiableInfo$Type valueOf(int p0){
       return FriendVisiableInfo$Type.forNumber(p0);
    }
    public static FriendVisiableInfo$Type valueOf(String p0){
       return Enum.valueOf(FriendVisiableInfo$Type.class, p0);
    }
    public static FriendVisiableInfo$Type[] values(){
       return FriendVisiableInfo$Type.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != FriendVisiableInfo$Type.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
