package com.horcrux.svg.TextProperties$FontWeight;
import java.lang.Enum;
import java.lang.String;
import java.util.HashMap;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;

public final class TextProperties$FontWeight extends Enum	// class@00060d
{
    public final String weight;
    public static final TextProperties$FontWeight[] $VALUES;
    public static final TextProperties$FontWeight Bold;
    public static final TextProperties$FontWeight Bolder;
    public static final TextProperties$FontWeight Lighter;
    public static final TextProperties$FontWeight Normal;
    public static final TextProperties$FontWeight w100;
    public static final TextProperties$FontWeight w200;
    public static final TextProperties$FontWeight w300;
    public static final TextProperties$FontWeight w400;
    public static final TextProperties$FontWeight w500;
    public static final TextProperties$FontWeight w600;
    public static final TextProperties$FontWeight w700;
    public static final TextProperties$FontWeight w800;
    public static final TextProperties$FontWeight w900;
    public static final Map weightToEnum;

    static {
       TextProperties$FontWeight uFontWeight = new TextProperties$FontWeight("Normal", 0, "normal");
       TextProperties$FontWeight.Normal = uFontWeight;
       TextProperties$FontWeight uFontWeight1 = new TextProperties$FontWeight("Bold", 1, "bold");
       TextProperties$FontWeight.Bold = uFontWeight1;
       TextProperties$FontWeight uFontWeight2 = new TextProperties$FontWeight("w100", 2, "100");
       TextProperties$FontWeight.w100 = uFontWeight2;
       TextProperties$FontWeight uFontWeight3 = new TextProperties$FontWeight("w200", 3, "200");
       TextProperties$FontWeight.w200 = uFontWeight3;
       TextProperties$FontWeight uFontWeight4 = new TextProperties$FontWeight("w300", 4, "300");
       TextProperties$FontWeight.w300 = uFontWeight4;
       TextProperties$FontWeight uFontWeight5 = new TextProperties$FontWeight("w400", 5, "400");
       TextProperties$FontWeight.w400 = uFontWeight5;
       TextProperties$FontWeight uFontWeight6 = new TextProperties$FontWeight("w500", 6, "500");
       TextProperties$FontWeight.w500 = uFontWeight6;
       TextProperties$FontWeight uFontWeight7 = new TextProperties$FontWeight("w600", 7, "600");
       TextProperties$FontWeight.w600 = uFontWeight7;
       TextProperties$FontWeight uFontWeight8 = new TextProperties$FontWeight("w700", 8, "700");
       TextProperties$FontWeight.w700 = uFontWeight8;
       TextProperties$FontWeight uFontWeight9 = new TextProperties$FontWeight("w800", 9, "800");
       TextProperties$FontWeight.w800 = uFontWeight9;
       TextProperties$FontWeight uFontWeight10 = new TextProperties$FontWeight("w900", 10, "900");
       TextProperties$FontWeight.w900 = uFontWeight10;
       TextProperties$FontWeight uFontWeight11 = new TextProperties$FontWeight("Bolder", 11, "bolder");
       TextProperties$FontWeight.Bolder = uFontWeight11;
       TextProperties$FontWeight uFontWeight12 = new TextProperties$FontWeight("Lighter", 12, "lighter");
       TextProperties$FontWeight.Lighter = uFontWeight12;
       TextProperties$FontWeight[] uFontWeightA = new TextProperties$FontWeight[13];
       uFontWeightA[0] = uFontWeight;
       uFontWeightA[1] = uFontWeight1;
       uFontWeightA[2] = uFontWeight2;
       uFontWeightA[3] = uFontWeight3;
       uFontWeightA[4] = uFontWeight4;
       uFontWeightA[5] = uFontWeight5;
       uFontWeightA[6] = uFontWeight6;
       uFontWeightA[7] = uFontWeight7;
       uFontWeightA[8] = uFontWeight8;
       uFontWeightA[9] = uFontWeight9;
       uFontWeightA[10] = uFontWeight10;
       uFontWeightA[11] = uFontWeight11;
       uFontWeightA[12] = uFontWeight12;
       TextProperties$FontWeight.$VALUES = uFontWeightA;
       TextProperties$FontWeight.weightToEnum = new HashMap();
       TextProperties$FontWeight[] uFontWeightA1 = TextProperties$FontWeight.values();
       int len = uFontWeightA1.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = uFontWeightA1[i];
          TextProperties$FontWeight.weightToEnum.put(oobject.weight, oobject);
       }
    }
    public void TextProperties$FontWeight(String p0,int p1,String p2){
       super(p0, p1);
       this.weight = p2;
    }
    public static TextProperties$FontWeight get(String p0){
       return TextProperties$FontWeight.weightToEnum.get(p0);
    }
    public static boolean hasEnum(String p0){
       return TextProperties$FontWeight.weightToEnum.containsKey(p0);
    }
    public static TextProperties$FontWeight valueOf(String p0){
       return Enum.valueOf(TextProperties$FontWeight.class, p0);
    }
    public static TextProperties$FontWeight[] values(){
       return TextProperties$FontWeight.$VALUES.clone();
    }
    public String toString(){
       return this.weight;
    }
}
