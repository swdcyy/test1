package com.kuaishou.edit.draft.AICutTheme$DpiType;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kuaishou.edit.draft.AICutTheme$DpiType$a;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kuaishou.edit.draft.AICutTheme$DpiType$b;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class AICutTheme$DpiType extends Enum implements Internal$EnumLite	// class@0016f9
{
    public final int value;
    public static final AICutTheme$DpiType[] $VALUES;
    public static final AICutTheme$DpiType D_1080;
    public static final AICutTheme$DpiType D_720;
    public static final AICutTheme$DpiType NONE;
    public static final AICutTheme$DpiType UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;

    static {
       AICutTheme$DpiType uDpiType = new AICutTheme$DpiType("NONE", 0, 0);
       AICutTheme$DpiType.NONE = uDpiType;
       AICutTheme$DpiType uDpiType1 = new AICutTheme$DpiType("D_720", 1, 1);
       AICutTheme$DpiType.D_720 = uDpiType1;
       AICutTheme$DpiType uDpiType2 = new AICutTheme$DpiType("D_1080", 2, 2);
       AICutTheme$DpiType.D_1080 = uDpiType2;
       AICutTheme$DpiType uDpiType3 = new AICutTheme$DpiType("UNRECOGNIZED", 3, -1);
       AICutTheme$DpiType.UNRECOGNIZED = uDpiType3;
       AICutTheme$DpiType[] uDpiTypeArra = new AICutTheme$DpiType[]{uDpiType,uDpiType1,uDpiType2,uDpiType3};
       AICutTheme$DpiType.$VALUES = uDpiTypeArra;
       AICutTheme$DpiType.internalValueMap = new AICutTheme$DpiType$a();
    }
    public void AICutTheme$DpiType(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static AICutTheme$DpiType forNumber(int p0){
       if (!p0) {
          return AICutTheme$DpiType.NONE;
       }
       if (p0 == 1) {
          return AICutTheme$DpiType.D_720;
       }
       if (p0 != 2) {
          return null;
       }
       return AICutTheme$DpiType.D_1080;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return AICutTheme$DpiType.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return AICutTheme$DpiType$b.a;
    }
    public static AICutTheme$DpiType valueOf(int p0){
       return AICutTheme$DpiType.forNumber(p0);
    }
    public static AICutTheme$DpiType valueOf(String p0){
       return Enum.valueOf(AICutTheme$DpiType.class, p0);
    }
    public static AICutTheme$DpiType[] values(){
       return AICutTheme$DpiType.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != AICutTheme$DpiType.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
