package com.kuaishou.edit.draft.ColorFilter$ResourceType;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kuaishou.edit.draft.ColorFilter$ResourceType$a;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kuaishou.edit.draft.ColorFilter$ResourceType$b;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class ColorFilter$ResourceType extends Enum implements Internal$EnumLite	// class@001750
{
    public final int value;
    public static final ColorFilter$ResourceType[] $VALUES;
    public static final ColorFilter$ResourceType LUT;
    public static final ColorFilter$ResourceType UNKNOWN;
    public static final ColorFilter$ResourceType UNRECOGNIZED;
    public static final ColorFilter$ResourceType ZIP;
    public static final Internal$EnumLiteMap internalValueMap;

    static {
       ColorFilter$ResourceType resourceType = new ColorFilter$ResourceType("UNKNOWN", 0, 0);
       ColorFilter$ResourceType.UNKNOWN = resourceType;
       ColorFilter$ResourceType resourceType1 = new ColorFilter$ResourceType("LUT", 1, 1);
       ColorFilter$ResourceType.LUT = resourceType1;
       ColorFilter$ResourceType resourceType2 = new ColorFilter$ResourceType("ZIP", 2, 2);
       ColorFilter$ResourceType.ZIP = resourceType2;
       ColorFilter$ResourceType resourceType3 = new ColorFilter$ResourceType("UNRECOGNIZED", 3, -1);
       ColorFilter$ResourceType.UNRECOGNIZED = resourceType3;
       ColorFilter$ResourceType[] resourceType4 = new ColorFilter$ResourceType[]{resourceType,resourceType1,resourceType2,resourceType3};
       ColorFilter$ResourceType.$VALUES = resourceType4;
       ColorFilter$ResourceType.internalValueMap = new ColorFilter$ResourceType$a();
    }
    public void ColorFilter$ResourceType(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static ColorFilter$ResourceType forNumber(int p0){
       if (!p0) {
          return ColorFilter$ResourceType.UNKNOWN;
       }
       if (p0 == 1) {
          return ColorFilter$ResourceType.LUT;
       }
       if (p0 != 2) {
          return null;
       }
       return ColorFilter$ResourceType.ZIP;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return ColorFilter$ResourceType.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return ColorFilter$ResourceType$b.a;
    }
    public static ColorFilter$ResourceType valueOf(int p0){
       return ColorFilter$ResourceType.forNumber(p0);
    }
    public static ColorFilter$ResourceType valueOf(String p0){
       return Enum.valueOf(ColorFilter$ResourceType.class, p0);
    }
    public static ColorFilter$ResourceType[] values(){
       return ColorFilter$ResourceType.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != ColorFilter$ResourceType.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
