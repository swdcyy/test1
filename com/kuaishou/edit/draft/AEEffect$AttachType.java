package com.kuaishou.edit.draft.AEEffect$AttachType;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kuaishou.edit.draft.AEEffect$AttachType$a;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kuaishou.edit.draft.AEEffect$AttachType$b;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class AEEffect$AttachType extends Enum implements Internal$EnumLite	// class@0016f3
{
    public final int value;
    public static final AEEffect$AttachType[] $VALUES;
    public static final AEEffect$AttachType DECORATION;
    public static final AEEffect$AttachType MANUAL_ADD;
    public static final AEEffect$AttachType UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;

    static {
       AEEffect$AttachType uAttachType = new AEEffect$AttachType("DECORATION", 0, 0);
       AEEffect$AttachType.DECORATION = uAttachType;
       AEEffect$AttachType uAttachType1 = new AEEffect$AttachType("MANUAL_ADD", 1, 1);
       AEEffect$AttachType.MANUAL_ADD = uAttachType1;
       AEEffect$AttachType uAttachType2 = new AEEffect$AttachType("UNRECOGNIZED", 2, -1);
       AEEffect$AttachType.UNRECOGNIZED = uAttachType2;
       AEEffect$AttachType[] uAttachTypeA = new AEEffect$AttachType[]{uAttachType,uAttachType1,uAttachType2};
       AEEffect$AttachType.$VALUES = uAttachTypeA;
       AEEffect$AttachType.internalValueMap = new AEEffect$AttachType$a();
    }
    public void AEEffect$AttachType(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static AEEffect$AttachType forNumber(int p0){
       if (!p0) {
          return AEEffect$AttachType.DECORATION;
       }
       if (p0 != 1) {
          return null;
       }
       return AEEffect$AttachType.MANUAL_ADD;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return AEEffect$AttachType.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return AEEffect$AttachType$b.a;
    }
    public static AEEffect$AttachType valueOf(int p0){
       return AEEffect$AttachType.forNumber(p0);
    }
    public static AEEffect$AttachType valueOf(String p0){
       return Enum.valueOf(AEEffect$AttachType.class, p0);
    }
    public static AEEffect$AttachType[] values(){
       return AEEffect$AttachType.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != AEEffect$AttachType.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
