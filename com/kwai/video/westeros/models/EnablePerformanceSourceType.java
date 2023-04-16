package com.kwai.video.westeros.models.EnablePerformanceSourceType;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kwai.video.westeros.models.EnablePerformanceSourceType$1;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kwai.video.westeros.models.EnablePerformanceSourceType$EnablePerformanceSourceTypeVerifier;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class EnablePerformanceSourceType extends Enum implements Internal$EnumLite	// class@000f4f
{
    public final int value;
    public static final EnablePerformanceSourceType[] $VALUES;
    public static final EnablePerformanceSourceType UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;
    public static final EnablePerformanceSourceType kEPSTDebugParamLocalHack;
    public static final EnablePerformanceSourceType kEPSTNone;
    public static final EnablePerformanceSourceType kEPSTOutSideFacelessPlugin;

    static {
       EnablePerformanceSourceType uEnablePerfo = new EnablePerformanceSourceType("kEPSTNone", 0, 0);
       EnablePerformanceSourceType.kEPSTNone = uEnablePerfo;
       EnablePerformanceSourceType uEnablePerfo1 = new EnablePerformanceSourceType("kEPSTOutSideFacelessPlugin", 1, 1);
       EnablePerformanceSourceType.kEPSTOutSideFacelessPlugin = uEnablePerfo1;
       EnablePerformanceSourceType uEnablePerfo2 = new EnablePerformanceSourceType("kEPSTDebugParamLocalHack", 2, 2);
       EnablePerformanceSourceType.kEPSTDebugParamLocalHack = uEnablePerfo2;
       EnablePerformanceSourceType uEnablePerfo3 = new EnablePerformanceSourceType("UNRECOGNIZED", 3, -1);
       EnablePerformanceSourceType.UNRECOGNIZED = uEnablePerfo3;
       EnablePerformanceSourceType[] uEnablePerfo4 = new EnablePerformanceSourceType[]{uEnablePerfo,uEnablePerfo1,uEnablePerfo2,uEnablePerfo3};
       EnablePerformanceSourceType.$VALUES = uEnablePerfo4;
       EnablePerformanceSourceType.internalValueMap = new EnablePerformanceSourceType$1();
    }
    public void EnablePerformanceSourceType(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static EnablePerformanceSourceType forNumber(int p0){
       if (!p0) {
          return EnablePerformanceSourceType.kEPSTNone;
       }
       if (p0 == 1) {
          return EnablePerformanceSourceType.kEPSTOutSideFacelessPlugin;
       }
       if (p0 != 2) {
          return null;
       }
       return EnablePerformanceSourceType.kEPSTDebugParamLocalHack;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return EnablePerformanceSourceType.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return EnablePerformanceSourceType$EnablePerformanceSourceTypeVerifier.INSTANCE;
    }
    public static EnablePerformanceSourceType valueOf(int p0){
       return EnablePerformanceSourceType.forNumber(p0);
    }
    public static EnablePerformanceSourceType valueOf(String p0){
       return Enum.valueOf(EnablePerformanceSourceType.class, p0);
    }
    public static EnablePerformanceSourceType[] values(){
       return EnablePerformanceSourceType.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != EnablePerformanceSourceType.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
