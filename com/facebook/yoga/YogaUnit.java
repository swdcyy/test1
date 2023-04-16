package com.facebook.yoga.YogaUnit;
import java.lang.Enum;
import java.lang.String;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.Class;
import java.lang.Object;

public final class YogaUnit extends Enum	// class@001460
{
    public final int mIntValue;
    public static final YogaUnit[] $VALUES;
    public static final YogaUnit AUTO;
    public static final YogaUnit PERCENT;
    public static final YogaUnit POINT;
    public static final YogaUnit UNDEFINED;

    static {
       YogaUnit yogaUnit = new YogaUnit("UNDEFINED", 0, 0);
       YogaUnit.UNDEFINED = yogaUnit;
       YogaUnit yogaUnit1 = new YogaUnit("POINT", 1, 1);
       YogaUnit.POINT = yogaUnit1;
       YogaUnit yogaUnit2 = new YogaUnit("PERCENT", 2, 2);
       YogaUnit.PERCENT = yogaUnit2;
       YogaUnit yogaUnit3 = new YogaUnit("AUTO", 3, 3);
       YogaUnit.AUTO = yogaUnit3;
       YogaUnit[] yogaUnitArra = new YogaUnit[]{yogaUnit,yogaUnit1,yogaUnit2,yogaUnit3};
       YogaUnit.$VALUES = yogaUnitArra;
    }
    public void YogaUnit(String p0,int p1,int p2){
       super(p0, p1);
       this.mIntValue = p2;
    }
    public static YogaUnit fromInt(int p0){
       if (!p0) {
          return YogaUnit.UNDEFINED;
       }
       if (p0 == 1) {
          return YogaUnit.POINT;
       }
       if (p0 == 2) {
          return YogaUnit.PERCENT;
       }
       if (p0 == 3) {
          return YogaUnit.AUTO;
       }
       throw new IllegalArgumentException("Unknown enum value: "+p0);
    }
    public static YogaUnit valueOf(String p0){
       return Enum.valueOf(YogaUnit.class, p0);
    }
    public static YogaUnit[] values(){
       return YogaUnit.$VALUES.clone();
    }
    public int intValue(){
       return this.mIntValue;
    }
}
