package com.horcrux.svg.ElementType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class ElementType extends Enum	// class@0005a1
{
    public static final ElementType[] $VALUES;
    public static final ElementType kCGPathElementAddCurveToPoint;
    public static final ElementType kCGPathElementAddLineToPoint;
    public static final ElementType kCGPathElementAddQuadCurveToPoint;
    public static final ElementType kCGPathElementCloseSubpath;
    public static final ElementType kCGPathElementMoveToPoint;

    static {
       ElementType uElementType = new ElementType("kCGPathElementAddCurveToPoint", 0);
       ElementType.kCGPathElementAddCurveToPoint = uElementType;
       ElementType uElementType1 = new ElementType("kCGPathElementAddQuadCurveToPoint", 1);
       ElementType.kCGPathElementAddQuadCurveToPoint = uElementType1;
       ElementType uElementType2 = new ElementType("kCGPathElementMoveToPoint", 2);
       ElementType.kCGPathElementMoveToPoint = uElementType2;
       ElementType uElementType3 = new ElementType("kCGPathElementAddLineToPoint", 3);
       ElementType.kCGPathElementAddLineToPoint = uElementType3;
       ElementType uElementType4 = new ElementType("kCGPathElementCloseSubpath", 4);
       ElementType.kCGPathElementCloseSubpath = uElementType4;
       ElementType[] uElementType5 = new ElementType[]{uElementType,uElementType1,uElementType2,uElementType3,uElementType4};
       ElementType.$VALUES = uElementType5;
    }
    public void ElementType(String p0,int p1){
       super(p0, p1);
    }
    public static ElementType valueOf(String p0){
       return Enum.valueOf(ElementType.class, p0);
    }
    public static ElementType[] values(){
       return ElementType.$VALUES.clone();
    }
}
