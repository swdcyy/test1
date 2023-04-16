package com.kwai.library.wolverine.entity.ElementType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class ElementType extends Enum	// class@000abb
{
    public final boolean isStaticType;
    public static final ElementType[] $VALUES;
    public static final ElementType BATTERY;
    public static final ElementType BATTERY_TEMPERATURE;
    public static final ElementType DEVICE_LEVEL;
    public static final ElementType TEMPERATURE;

    static {
       ElementType uElementType1;
       ElementType[] uElementType = new ElementType[]{uElementType1,uElementType1,uElementType1,uElementType1};
       uElementType1 = new ElementType("DEVICE_LEVEL", 0, true);
       ElementType.DEVICE_LEVEL = uElementType1;
       uElementType1 = new ElementType("BATTERY", true, 0);
       ElementType.BATTERY = uElementType1;
       uElementType1 = new ElementType("TEMPERATURE", 2, 0);
       ElementType.TEMPERATURE = uElementType1;
       uElementType1 = new ElementType("BATTERY_TEMPERATURE", 3, 0);
       ElementType.BATTERY_TEMPERATURE = uElementType1;
       ElementType.$VALUES = uElementType;
    }
    public void ElementType(String p0,int p1,boolean p2){
       super(p0, p1);
       this.isStaticType = p2;
    }
    public static ElementType valueOf(String p0){
       return Enum.valueOf(ElementType.class, p0);
    }
    public static ElementType[] values(){
       return ElementType.$VALUES.clone();
    }
    public final boolean isStaticType(){
       return this.isStaticType;
    }
}
