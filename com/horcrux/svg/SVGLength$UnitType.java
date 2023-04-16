package com.horcrux.svg.SVGLength$UnitType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class SVGLength$UnitType extends Enum	// class@0005f1
{
    public static final SVGLength$UnitType[] $VALUES;
    public static final SVGLength$UnitType CM;
    public static final SVGLength$UnitType EMS;
    public static final SVGLength$UnitType EXS;
    public static final SVGLength$UnitType IN;
    public static final SVGLength$UnitType MM;
    public static final SVGLength$UnitType NUMBER;
    public static final SVGLength$UnitType PC;
    public static final SVGLength$UnitType PERCENTAGE;
    public static final SVGLength$UnitType PT;
    public static final SVGLength$UnitType PX;
    public static final SVGLength$UnitType UNKNOWN;

    static {
       SVGLength$UnitType unitType = new SVGLength$UnitType("UNKNOWN", 0);
       SVGLength$UnitType.UNKNOWN = unitType;
       SVGLength$UnitType unitType1 = new SVGLength$UnitType("NUMBER", 1);
       SVGLength$UnitType.NUMBER = unitType1;
       SVGLength$UnitType unitType2 = new SVGLength$UnitType("PERCENTAGE", 2);
       SVGLength$UnitType.PERCENTAGE = unitType2;
       SVGLength$UnitType unitType3 = new SVGLength$UnitType("EMS", 3);
       SVGLength$UnitType.EMS = unitType3;
       SVGLength$UnitType unitType4 = new SVGLength$UnitType("EXS", 4);
       SVGLength$UnitType.EXS = unitType4;
       SVGLength$UnitType unitType5 = new SVGLength$UnitType("PX", 5);
       SVGLength$UnitType.PX = unitType5;
       SVGLength$UnitType unitType6 = new SVGLength$UnitType("CM", 6);
       SVGLength$UnitType.CM = unitType6;
       SVGLength$UnitType unitType7 = new SVGLength$UnitType("MM", 7);
       SVGLength$UnitType.MM = unitType7;
       SVGLength$UnitType unitType8 = new SVGLength$UnitType("IN", 8);
       SVGLength$UnitType.IN = unitType8;
       SVGLength$UnitType unitType9 = new SVGLength$UnitType("PT", 9);
       SVGLength$UnitType.PT = unitType9;
       SVGLength$UnitType unitType10 = new SVGLength$UnitType("PC", 10);
       SVGLength$UnitType.PC = unitType10;
       SVGLength$UnitType[] unitTypeArra = new SVGLength$UnitType[11];
       unitTypeArra[0] = unitType;
       unitTypeArra[1] = unitType1;
       unitTypeArra[2] = unitType2;
       unitTypeArra[3] = unitType3;
       unitTypeArra[4] = unitType4;
       unitTypeArra[5] = unitType5;
       unitTypeArra[6] = unitType6;
       unitTypeArra[7] = unitType7;
       unitTypeArra[8] = unitType8;
       unitTypeArra[9] = unitType9;
       unitTypeArra[10] = unitType10;
       SVGLength$UnitType.$VALUES = unitTypeArra;
    }
    public void SVGLength$UnitType(String p0,int p1){
       super(p0, p1);
    }
    public static SVGLength$UnitType valueOf(String p0){
       return Enum.valueOf(SVGLength$UnitType.class, p0);
    }
    public static SVGLength$UnitType[] values(){
       return SVGLength$UnitType.$VALUES.clone();
    }
}
