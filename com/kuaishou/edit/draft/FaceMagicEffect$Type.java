package com.kuaishou.edit.draft.FaceMagicEffect$Type;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kuaishou.edit.draft.FaceMagicEffect$Type$a;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kuaishou.edit.draft.FaceMagicEffect$Type$b;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class FaceMagicEffect$Type extends Enum implements Internal$EnumLite	// class@00179b
{
    public final int value;
    public static final FaceMagicEffect$Type[] $VALUES;
    public static final FaceMagicEffect$Type FACE_MAGIC;
    public static final FaceMagicEffect$Type HIGHLIGHT_TIME;
    public static final FaceMagicEffect$Type MAGIC_EMOJI;
    public static final FaceMagicEffect$Type UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;

    static {
       FaceMagicEffect$Type type = new FaceMagicEffect$Type("FACE_MAGIC", 0, 0);
       FaceMagicEffect$Type.FACE_MAGIC = type;
       FaceMagicEffect$Type type1 = new FaceMagicEffect$Type("MAGIC_EMOJI", 1, 1);
       FaceMagicEffect$Type.MAGIC_EMOJI = type1;
       FaceMagicEffect$Type type2 = new FaceMagicEffect$Type("HIGHLIGHT_TIME", 2, 2);
       FaceMagicEffect$Type.HIGHLIGHT_TIME = type2;
       FaceMagicEffect$Type type3 = new FaceMagicEffect$Type("UNRECOGNIZED", 3, -1);
       FaceMagicEffect$Type.UNRECOGNIZED = type3;
       FaceMagicEffect$Type[] typeArray = new FaceMagicEffect$Type[]{type,type1,type2,type3};
       FaceMagicEffect$Type.$VALUES = typeArray;
       FaceMagicEffect$Type.internalValueMap = new FaceMagicEffect$Type$a();
    }
    public void FaceMagicEffect$Type(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static FaceMagicEffect$Type forNumber(int p0){
       if (!p0) {
          return FaceMagicEffect$Type.FACE_MAGIC;
       }
       if (p0 == 1) {
          return FaceMagicEffect$Type.MAGIC_EMOJI;
       }
       if (p0 != 2) {
          return null;
       }
       return FaceMagicEffect$Type.HIGHLIGHT_TIME;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return FaceMagicEffect$Type.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return FaceMagicEffect$Type$b.a;
    }
    public static FaceMagicEffect$Type valueOf(int p0){
       return FaceMagicEffect$Type.forNumber(p0);
    }
    public static FaceMagicEffect$Type valueOf(String p0){
       return Enum.valueOf(FaceMagicEffect$Type.class, p0);
    }
    public static FaceMagicEffect$Type[] values(){
       return FaceMagicEffect$Type.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != FaceMagicEffect$Type.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
